"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
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
exports.default = Companie;
