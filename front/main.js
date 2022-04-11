"use strict";
class Candidate {
    constructor(nome = '', email = '', password = '', type = '', state = '', cep = '', desc = '', cpf = '', age = 0, skills = []) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.type = type;
        this.state = state;
        this.cep = cep;
        this.desc = desc;
        this.cpf = cpf;
        this.age = age;
        this.skills = skills;
    }
}
class Companie {
    constructor(nome = '', email = '', password = '', type = '', state = '', cep = '', desc = '', cnpj = '', country = '', skills = []) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.type = type;
        this.state = state;
        this.cep = cep;
        this.desc = desc;
        this.cnpj = cnpj;
        this.country = country;
        this.skills = skills;
    }
}
let listCandidates = Array();
let listCompanies = Array();
let userEmail = document.querySelector("#uemail");
let userPswd = document.querySelector("#upswd");
let bttLogin = document.querySelector("#blogin");
let bttCreat = document.querySelector("#bttcreat");
let loginScoop = document.querySelector("#app");
bttLogin && bttLogin.addEventListener('click', () => userlogin());
bttCreat && bttCreat.addEventListener('click', () => creteAccount());
let cadScoop = document.querySelector("#app2");
let cadName = document.querySelector("#cadnome");
let cadMail = document.querySelector("#cadmail");
let cadPswd = document.querySelector("#cadsenha");
let cadType = document.querySelector("#cadType");
let bttNext = document.querySelector("#bttNext");
let cadcadState = document.querySelector("#cadcadstate");
let cadcadCep = document.querySelector("#cadcadcep");
let cadcadDesc = document.querySelector("#cadcaddesc");
let cadcadCpf = document.querySelector("#cadcadcpf");
let cadcadAge = document.querySelector("#cadcadage");
let cadcadSkills = document.querySelector("#cadcadskills");
let cadcompstate = document.querySelector("#cadcompstate");
let cadcompcep = document.querySelector("#cadcompcep");
let cadcompdesc = document.querySelector("#cadcompdesc");
let cadcompcnpj = document.querySelector("#cadcompcnpj");
let cadcompcountry = document.querySelector("#cadcompcountry");
let cadcompskills = document.querySelector("#cadcompskills");
let nextcadcad = document.querySelector("#ncadcad");
let nextcadcomp = document.querySelector("#ncadcomp");
let bttCadastra = document.querySelector("#submitCad");
function atribueSkills(t) {
    let ArrayAux = t.split(',');
    let stringAux = [];
    for (let i = 0; i < ArrayAux.length; i++) {
        stringAux.push(ArrayAux[i]);
    }
    return stringAux;
}
function creteAccount() {
    let d = loginScoop;
    d.style.display = "none";
    console.log(cadScoop);
    cadScoop.style.display = "grid";
    bttNext && bttNext.addEventListener('click', () => {
        if (cadType.value == 'empresa') {
            nextcadcomp.style.display = "grid";
            bttCadastra && bttCadastra.addEventListener('click', () => {
                let companieAux = new Companie(cadName.value, cadMail.value, cadPswd.value, cadType.value, cadcompstate.value, cadcompcep.value, cadcompdesc.value, cadcompcnpj.value, cadcompcountry.value, atribueSkills(cadcompskills.value));
                if (verificaComp(companieAux) == true) {
                    listCompanies.push(companieAux);
                    cadScoop.style.display = "none";
                    createPerfilPage(cadMail.value, cadPswd.value, true);
                }
                else {
                    alert("Preencha os dados corretamente!");
                }
            });
        }
        else if (cadType.value == 'candidato') {
            nextcadcad.style.display = "grid";
            bttCadastra && bttCadastra.addEventListener('click', () => {
                let candidateAux = new Candidate(cadName.value, cadMail.value, cadPswd.value, cadType.value, cadcadState.value, cadcadCep.value, cadcadDesc.value, cadcadCpf.value, Number(cadcadAge.value), atribueSkills(cadcadSkills.value));
                console.log(candidateAux);
                if (verificaCad(candidateAux) == true) {
                    listCandidates.push(candidateAux);
                    cadScoop.style.display = "none";
                    createPerfilPage(cadMail.value, cadPswd.value, true);
                }
                else {
                    alert("Preencha os dados corretamente!");
                }
            });
        }
    });
}
function verificaCad(candidate) {
    if (candidate.nome == '' ||
        candidate.email == '' ||
        candidate.age == 0 ||
        candidate.cep == '' ||
        candidate.cpf == '' ||
        candidate.password == '' ||
        candidate.skills.length == 0 ||
        candidate.state == '')
        return false;
    return true;
}
function verificaComp(company) {
    if (company.nome == '' ||
        company.email == '' ||
        company.country == '' ||
        company.cep == '' ||
        company.cnpj == '' ||
        company.password == '' ||
        company.skills.length == 0 ||
        company.state == '')
        return false;
    return true;
}
function userlogin() {
    let mail = userEmail.value;
    let psw = userPswd.value;
    console.log(mail + " " + psw);
    //if(verificaLogin(mail,psw) == true){
    if (true) {
        console.log("Olá, Seja Bem vindo!");
        let d = loginScoop;
        d.style.display = "none";
        createPerfilPage(mail, psw);
    }
    else {
        //     //cria um alerta na pagina!
        alert("Email ou senha incorretos!");
    }
}
let perfilPage = document.getElementById("pefil-page");
let list = document.getElementById("listofAny");
console.log(perfilPage);
function createPerfilPage(mail, psd, looged) {
    console.log(mail, psd, looged);
    let userLogged = searchUser(mail, psd);
    if (userLogged || looged) {
        //if(true){
        perfilPage.style.display = "grid";
        console.log("A");
        console.log(userLogged.type);
        let divUser = document.createElement('div');
        divUser.className = 'item';
        if (userLogged.type == 'candidato') {
            listCompanies.forEach((t) => {
                //let saidaAux = document.createElement('div')
                let saida = document.createElement('p');
                //saidaAux.className = 'companies'
                let s = document.createTextNode(`Nome da Empresa: ${t.nome}
                Descrição: ${t.desc} ${"\n"}
                Competencias Buscadas: ${t.skills}${"\n"}`);
                saida.appendChild(s);
                divUser.appendChild(saida);
            });
        }
        else if (userLogged.type == 'empresa') {
            listCandidates.forEach((t) => {
                //let saidaAux = document.createElement('div')
                let saida = document.createElement('p');
                //saidaAux.className = 'companies'
                let s = document.createTextNode(`Nome do Candidato: ${t.nome}
                Descrição: ${t.desc} ${"\n"}
                Competencias: ${t.skills}${"\n"}`);
                saida.appendChild(s);
                divUser.appendChild(saida);
            });
        }
        list.appendChild(divUser);
        let div1 = document.getElementById("headerLogin");
        let h = document.createElement("H2");
        let txt = document.createTextNode(`Seja bem vindo ${userLogged.nome}!`);
        //let txt = document.createTextNode(`Seja bem vindo ${'Joao'}!`)
        h.appendChild(txt);
        div1.appendChild(h);
    }
}
function searchUser(mail, psd) {
    for (let i = 0; i < listCandidates.length; i++) {
        if (mail === listCandidates[i].email && listCandidates[i].password === psd) {
            return listCandidates[i];
        }
    }
    for (let i = 0; i < listCompanies.length; i++) {
        console.log(listCompanies[i]);
        if (mail === listCompanies[i].email && listCompanies[i].password === psd) {
            return listCompanies[i];
        }
    }
    return null;
}
function verificaLogin(mail, psd) {
    for (let i = 0; i < listCandidates.length; i++) {
        if (mail === listCandidates[i].email && listCandidates[i].password === psd) {
            return true;
        }
    }
    for (let i = 0; i < listCompanies.length; i++) {
        if (mail === listCompanies[i].email && listCompanies[i].password === psd) {
            return true;
        }
    }
    return false;
}
//Lendo o arquivo de backup: 
document.getElementById('fileInput').onchange = function () {
    var file = this.files[0];
    var reader = new FileReader();
    reader.onload = function (progressEvent) {
        // By lines
        let ArrayOfItens;
        let lines = this.result.split('\n');
        for (let line = 0; line < lines.length; line++) {
            ArrayOfItens = lines[line].split(',');
            if (ArrayOfItens[3] === 'empresa') {
                let skills = [];
                for (let i = 9; i < ArrayOfItens.length; i++) {
                    skills.push(ArrayOfItens[i]);
                }
                let empAux = new Companie(ArrayOfItens[0], ArrayOfItens[1], ArrayOfItens[2], ArrayOfItens[3], ArrayOfItens[4], ArrayOfItens[5], ArrayOfItens[6], ArrayOfItens[7], ArrayOfItens[8]);
                console.log(skills);
                empAux.skills = skills;
                console.log(empAux);
                listCompanies.push(empAux);
            }
            else if (ArrayOfItens.length > 1) {
                let skills = [];
                for (let i = 9; i < ArrayOfItens.length; i++) {
                    skills.push(ArrayOfItens[i]);
                }
                let candAux = new Candidate(ArrayOfItens[0], ArrayOfItens[1], ArrayOfItens[2], ArrayOfItens[3], ArrayOfItens[4], ArrayOfItens[5], ArrayOfItens[6], ArrayOfItens[7], ArrayOfItens[8]);
                console.log(skills);
                candAux.skills = skills;
                console.log(candAux);
                listCandidates.push(candAux);
            }
        }
    };
    reader.readAsText(file);
};