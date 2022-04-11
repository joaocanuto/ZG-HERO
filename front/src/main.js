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
window.onload = function () {
    const userEmail = document.querySelector("#u-email");
    const userPswd = document.getElementById("#u-pswd");
    const bttLogin = document.getElementById("#b-login");
    bttLogin.addEventListener('click', () => console.log('A'));
};
document.addEventListener('DOMContentLoaded', function () {
    const userEmail = document.querySelector("#u-email");
    const userPswd = document.getElementById("#u-pswd");
    const bttLogin = document.getElementById("#b-login");
    bttLogin.addEventListener('click', () => console.log('A'));
});
function userlogin() {
    console.log('AAA');
    // let mail: any = userEmail?.nodeValue
    // let psw  = userPswd;
    // console.log(mail + " " + psw)
    // if(verificaLogin(mail,psw) == true){
    //     // go to page profile
    // } else {
    //     //cria um alerta na pagina!
    // }
}
function verificaLogin(mail, psd) {
    //verifica se o login existe no arquivo txt!
    return true;
}
