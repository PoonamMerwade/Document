import { Customer } from './customer';

export class Fund {
    public fundId:number;
    public fundName:String;
    public transactionAmount:bigint;
    public accountNumber:String;
    public investmentAmount:bigint;
    public customer:Customer;
}

