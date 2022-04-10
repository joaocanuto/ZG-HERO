"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const candidate_1 = __importDefault(require("./modelo/candidate"));
const companie_1 = __importDefault(require("./modelo/companie"));
let listCandidates = Array();
let listCompanies = Array();
let c = new candidate_1.default();
let cp = new companie_1.default();
listCompanies.push(cp);
console.log(listCompanies[0]);
