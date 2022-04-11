export default class Candidate {
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
