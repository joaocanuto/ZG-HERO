import User from './user'

export default class Candidate implements User {

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