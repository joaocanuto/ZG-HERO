interface User {
    nome : string;
    email : string;
    password : string;
    type : string;
    state : string;
    cep : string;
    desc : string;
}

class Candidate implements User {

    constructor(public nome : string = '', 
    public email : string = '', 
    public password : string = '',
    public type : string = '',
    public state : string = '',
    public cep : string = '',
    public desc : string = '',
    public cpf : string = '', 
    public age : number = 0, 
    public skills : Array<string> = []){
        }
}

class Companie implements User {

    constructor(public nome : string = '', 
        public email : string = '', 
        public password : string = '',
        public type : string = '',
        public state : string = '',
        public cep : string = '', 
        public desc : string = '',
        public cnpj : string = '', 
        public country : string = '', 
        public skills : Array<string> = []){
        }
}
console.log("aa")
let listCandidates = Array<Candidate>();
let listCompanies = Array<Companie>();
let userEmail = document.querySelector("#uemail") as HTMLInputElement;
let userPswd = document.querySelector("#upswd") as HTMLInputElement;
let bttLogin = document.querySelector("#blogin");
let bttCreat = document.querySelector("#bttcreat");
let loginScoop = document.querySelector("#app") as HTMLDivElement

bttLogin && bttLogin.addEventListener('click', () => userlogin());  
bttCreat && bttCreat.addEventListener('click', () => creteAccount());  

let cadScoop = document.querySelector("#app2") as HTMLDivElement;
let cadName = document.querySelector("#cadnome") as HTMLInputElement;
let cadMail = document.querySelector("#cadmail") as HTMLInputElement;
let cadPswd = document.querySelector("#cadsenha") as HTMLInputElement;
let cadType = document.querySelector("#cadType") as HTMLInputElement;
let bttNext = document.querySelector("#bttNext");

let cadcadState = document.querySelector("#cadcadstate") as HTMLInputElement;
let cadcadCep = document.querySelector("#cadcadcep") as HTMLInputElement;
let cadcadDesc = document.querySelector("#cadcaddesc") as HTMLInputElement;
let cadcadCpf = document.querySelector("#cadcadcpf") as HTMLInputElement;
let cadcadAge = document.querySelector("#cadcadage") as HTMLInputElement;
let cadcadSkills = document.querySelector("#cadcadskills") as HTMLInputElement;

let cadcompstate = document.querySelector("#cadcompstate") as HTMLInputElement;
let cadcompcep = document.querySelector("#cadcompcep") as HTMLInputElement;
let cadcompdesc = document.querySelector("#cadcompdesc") as HTMLInputElement;
let cadcompcnpj = document.querySelector("#cadcompcnpj") as HTMLInputElement;
let cadcompcountry = document.querySelector("#cadcompcountry") as HTMLInputElement;
let cadcompskills = document.querySelector("#cadcompskills") as HTMLInputElement;
let nextcadcad = document.querySelector("#ncadcad") as HTMLDivElement;
let nextcadcomp = document.querySelector("#ncadcomp") as HTMLDivElement;
let perfilPage = document.getElementById("pefil-page");
let list = document.getElementById("listofAny");
let bttCadastra = document.querySelector("#submitCad");

function validaDadosCompanie(a : Companie): boolean {
    const regexNome = /[0-9]|\$|\&|\*|\(|\)|\@|\!|\#|\%|\?/gi  // me retorna true se não simbolos
    const regexTag = /\$|\&|\*|\(|\)|\@|\!|\#|\%|\?/gi// retorna true se nao o simbolo
    const regexCNPJ = /\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}/g //retorn true se estiver ok
    const regexEmail = /[\w.]+@\w+\.\w{2,4}(\.\w{2})?/g
    const regexCep = /\d{5}\-\d{3}/g
    let aux : string = ''
    for(let i = 0; i < a.skills.length; i++) {
        aux += a.skills[i]
    }

    if(regexNome.test(a.nome) ||
    regexTag.test(aux) ||
    !regexCNPJ.test(a.cnpj) || 
    !regexEmail.test(a.email) ||
    !regexCep.test(a.cep)
    ){
        return false;
    }

    return true;
}
function validaDadosCandidate(a : Candidate): boolean {
    const regexNome = /[0-9]|\$|\&|\*|\(|\)|\@|\!|\#|\%|\?/gi 
    const regexTag = /\$|\&|\*|\(|\)|\@|\!|\#|\%|\?/gi
    const regexCPF = /\d{3}\.\d{3}\.\d{3}-\d{2}/g
    const regexEmail = /[\w.]+@\w+\.\w{2,4}(\.\w{2})?/g
    const regexCep = /\d{5}\-\d{3}/g

    let aux : string = ''
    for(let i = 0; i < a.skills.length; i++) {
        aux += a.skills[i]
    }

    if(regexNome.test(a.nome) ||
    regexTag.test(aux) ||
    !regexCPF.test(a.cpf) || 
    !regexEmail.test(a.email) ||
    !regexCep.test(a.cep)
    ){
        return false;
    }

    const regexLinkedin = /https\:\/\/www.linkedin.com\/in\/[a-z]/
    if(regexLinkedin.test(a.desc)){
        alert("Você colocou seu linkedin corretamente na sua descrição!")
    } else {
        alert("Você não colocou ou não colocou seu linkedin corretamente na sua descrição!")
    }
    return true;
}
function verificaCandidate(candidate : Candidate): boolean{
    if(candidate.nome == '' ||
        candidate.email == '' ||
        candidate.age == 0 ||
        candidate.cep == '' ||
        candidate.cpf == '' ||
        candidate.password == '' ||
        candidate.skills.length == 0 ||
        candidate.state == '') return false;
    return validaDadosCandidate(candidate); 
}
function verificaCompany(company : Companie): boolean{
    if(company.nome == '' ||
        company.email == '' ||
        company.country == '' ||
        company.cep == '' ||
        company.cnpj == '' ||
        company.password == '' ||
        company.skills.length == 0 ||
        company.state == '') return false;
    return validaDadosCompanie(company); 
}

function atribueSkills(t : string) {
    let ArrayAux = t.split(',')
    let stringAux : string[] = [];
    for(let i = 0; i < ArrayAux.length; i++) {
        stringAux.push(ArrayAux[i]);
    }
    return stringAux;
}

function creteAccount(){
    let d = loginScoop;
    d!.style.display = "none";
    cadScoop!.style.display = "grid";

    bttNext && bttNext.addEventListener('click', () => {
        if(cadType!.value == 'empresa'){
            nextcadcomp!.style.display = "grid"
            bttCadastra && bttCadastra.addEventListener('click', () => {
                let companieAux = new Companie(
                    cadName.value,
                    cadMail.value,
                    cadPswd.value,
                    cadType.value,
                    cadcompstate.value,
                    cadcompcep.value,
                    cadcompdesc.value,
                    cadcompcnpj.value,
                    cadcompcountry.value,
                    atribueSkills(cadcompskills.value)
            );  
                if(verificaCompany(companieAux) == true){
                    listCompanies.push(companieAux)
                    cadScoop!.style.display = "none"
                    createPerfilPage(cadMail.value,cadPswd.value,true);
                } else {
                    alert("Preencha os dados corretamente!")
                }


            });
        } else if (cadType!.value == 'candidato') {
            nextcadcad!.style.display = "grid"
            bttCadastra && bttCadastra.addEventListener('click', () => {
                let candidateAux = new Candidate(
                        cadName.value,
                        cadMail.value,
                        cadPswd.value,
                        cadType.value,
                        cadcadState.value,
                        cadcadCep.value,
                        cadcadDesc.value,
                        cadcadCpf.value,
                        Number(cadcadAge.value),
                        atribueSkills(cadcadSkills.value)
                );
                if(verificaCandidate(candidateAux) == true){
                    listCandidates.push(candidateAux);
                    cadScoop!.style.display = "none"
                    createPerfilPage(cadMail.value,cadPswd.value,true);
                } else {
                    alert("Preencha os dados corretamente!")
                }
            });
        }
    });
}

function userlogin(){
    let mail: string = userEmail!.value;
    let psw : string = userPswd!.value;
    console.log(mail + " " + psw)
    if(searchUser(mail,psw)){
        console.log("Olá, Seja Bem vindo!")
        let d = loginScoop;
        d!.style.display = "none";
        createPerfilPage(mail,psw);
     } else {
        alert("Email ou senha incorretos!")
    }
}

function createPerfilPage(mail : string, psd : string, looged?: boolean) {
    console.log(mail, psd, looged);
    let userLogged = searchUser(mail,psd);
    if(userLogged || looged) {
        perfilPage!.style.display = "grid";
        console.log("A")
        console.log(userLogged!.type)
        let divUser = document.createElement('div')
        divUser.className = 'item'
        if(userLogged!.type == 'candidato'){
            listCompanies.forEach((t) => {
                //let saidaAux = document.createElement('div')
                let saida = document.createElement('p')
                //saidaAux.className = 'companies'
                
                let s = document.createTextNode(`Nome da Empresa: ${t.nome}
                Descrição: ${t.desc} ${"\n"}
                Competencias Buscadas: ${t.skills}${"\n"}`);
                
                saida.appendChild(s);
                divUser.appendChild(saida)
            })
        } else if (userLogged!.type == 'empresa') {
            listCandidates.forEach((t) => {
                let saida = document.createElement('p')
                
                let s = document.createTextNode(`Nome do Candidato: ${t.nome}
                Descrição: ${t.desc} ${"\n"}
                Competencias: ${t.skills}${"\n"}`);
                saida.appendChild(s);
                divUser.appendChild(saida)
            })
        }
        list!.appendChild(divUser)
        let div1 = document.getElementById("headerLogin")
        let h = document.createElement("H2");
        let txt = document.createTextNode(`Seja bem vindo ${userLogged!.nome}!`)
        h.appendChild(txt);
        div1!.appendChild(h);
    }
}

function searchUser(mail : string, psd : string){
    for(let i=0;i<listCandidates.length;i++){
        if(mail === listCandidates[i].email && listCandidates[i].password === psd){
                return listCandidates[i];
        }
    }
    for(let i=0;i<listCompanies.length;i++){
        console.log(listCompanies[i])
        if(mail === listCompanies[i].email && listCompanies[i].password === psd){
                return listCompanies[i];
        }
    }
    return null;
}


//Lendo o arquivo com o banco de dados! 
// document.getElementById('fileInput')!.onchange = function(){

//     var file = this.files[0];
  
//     var reader = new FileReader();
//     reader.onload = function(progressEvent){
//       // By lines
//       let ArrayOfItens;
//       let lines = this.result.split('\n');

//       for(let line = 0; line < lines.length; line++){
//         ArrayOfItens = lines[line].split(',')

//         if(ArrayOfItens[3] === 'empresa'){
//             let skills : string[] = [];
//             for(let i = 9; i < ArrayOfItens.length; i++){
//                 skills.push(ArrayOfItens[i]);
//             }
//             let empAux = new Companie(
//                 ArrayOfItens[0], 
//                 ArrayOfItens[1],
//                 ArrayOfItens[2], 
//                 ArrayOfItens[3],
//                 ArrayOfItens[4], 
//                 ArrayOfItens[5],
//                 ArrayOfItens[6], 
//                 ArrayOfItens[7],
//                 ArrayOfItens[8],
//             ); 
//             console.log(skills)
//             empAux.skills = skills;
//             console.log(empAux)
//             listCompanies.push(empAux);
//         } else if (ArrayOfItens.length > 1){
//             let skills : string[] = [];
//             for(let i = 9; i < ArrayOfItens.length; i++){
//                 skills.push(ArrayOfItens[i]);
//             }
//             let candAux = new Candidate(
//                 ArrayOfItens[0], 
//                 ArrayOfItens[1],
//                 ArrayOfItens[2], 
//                 ArrayOfItens[3],
//                 ArrayOfItens[4], 
//                 ArrayOfItens[5],
//                 ArrayOfItens[6], 
//                 ArrayOfItens[7],
//                 ArrayOfItens[8],
//             ); 
//             console.log(skills)
//             candAux.skills = skills;
//             console.log(candAux)
//             listCandidates.push(candAux);
//         }
//       }
//     };
//     reader.readAsText(file);
//   };