import User from './user'

export default class Companie implements User {

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