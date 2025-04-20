package code1;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class roma{
    String out="";
    roma(int n){
        if (n>3999999||n<0)return;
        if (n==0) {out="_";return;}
        int kk=n%10000000/1000000,hk=n%1000000/100000,dk=n%100000/10000,
                k=n%10000/1000,h=n%1000/100,d=n%100/10,a=n%10;
        for (int i=0;i<kk;i++) out+="M";
        switch (hk){
            case 9->{
                if (dk==9&&k==9&&h==9&&d==9&&a==9){
                    out+="iM";
                    return;
                }
                if (dk==9&&h==9&&d==9&&k==9){
                    out+="xM";
                    dk=k=h=d=0;
                }else if (dk==9&&k==9&&h==9){
                    out+="cM";
                    dk=k=h=0;
                }else if (dk==9&&k==9){
                    out+="mM";
                    dk=k=0;
                }else if (dk==9){
                    out+="XM";
                    dk=0;
                }else out+="CM";
            }
            case 8->out+="DCCC";
            case 7->out+="DCC";
            case 6->out+="DC";
            case 5->out+="D";
            case 4->{
                if (dk==9&&k==9&&h==9&&d==9&&a==9){
                    out+="iD";
                    return;
                }
                if (dk==9&&h==9&&d==9&&k==9){
                    out+="xD";
                    dk=k=h=d=0;
                }else if (dk==9&&k==9&&h==9){
                    out+="cD";
                    dk=k=h=0;
                }else if (dk==9&&k==9){
                    out+="mD";
                    dk=k=0;
                }else if (dk==9){
                    out+="XD";
                    dk=0;
                }else out+="CD";
            }
            case 3->out+="CCC";
            case 2->out+="CC";
            case 1->out+="C";
        }
        switch (dk){
            case 9->{
                if (k==9&&h==9&&d==9&&a==9){
                    out+="iC";
                    return;
                }
                if (h==9&&d==9&&k==9){
                    out+="xC";
                    k=h=d=0;
                }else if (k==9&&h==9){
                    out+="cC";
                    d=h=0;
                }else if (k==9){
                    out+="mC";
                    h=0;
                }else {
                    out+="XC";
                }
            }
            case 8->out+="LXXX";
            case 7->out+="LXX";
            case 6->out+="LX";
            case 5->out+="L";
            case 4->{
                if (k==9&&h==9&&d==9&&a==9){
                    out+="iL";
                    return;
                }
                if (h==9&&d==9&&k==9){
                    out+="xL";
                    k=h=d=0;
                }else if (k==9&&h==9){
                    out+="cL";
                    d=h=0;
                }else if (k==9){
                    out+="mL";
                    h=0;
                }else {
                    out+="XL";
                }
            }
            case 3->out+="XXX";
            case 2->out+="XX";
            case 1->out+="X";
        }
        switch (k){
            case 9->{
                if (h==9&&d==9&&a==9){
                    out+="iX";
                    return;
                }else if (d==9&&h==9){
                    out+="xX";
                    d=h=0;
                }else if (h==9){
                    out+="cX";
                    h=0;
                }else {
                    out+="mX";
                }
            }
            case 8->out+="Vmmm";
            case 7->out+="Vmm";
            case 6->out+="Vm";
            case 5->out+="V";
            case 4->{
                if (h==9&&d==9&&a==9){
                    out+="iV";
                    return;
                }else if (d==9&&h==9){
                    out+="xV";
                    d=h=0;
                }else if (h==9){
                    out+="cV";
                    h=0;
                }else {
                    out+="mV";
                }
            }
            case 3->out+="mmm";
            case 2->out+="mm";
            case 1->out+="m";
        }
        switch (h){
            case 9->{
                if (d==9&&a==9){
                    out+="im";
                    return;
                }else if (d==9){
                    out+="xm";
                    d=0;
                }else {
                    out+="cm";
                }
            }
            case 8->out+="dccc";
            case 7->out+="dcc";
            case 6->out+="dc";
            case 5->out+="d";
            case 4->{
                if (d==9&&a==9){
                    out+="id";
                    return;
                }else if (d==9){
                    out+="xd";
                    d=0;
                }else {
                    out+="cd";
                }
            }
            case 3->out+="ccc";
            case 2->out+="cc";
            case 1->out+="c";
        }
        switch (d){
            case 9->{
                if (a==9){
                    out+="ic";
                    return;
                } else {
                    out+="xc";
                }
            }
            case 8->out+="lxxx";
            case 7->out+="lxx";
            case 6->out+="lx";
            case 5->out+="l";
            case 4->{
                if (a==9){
                    out+="il";
                    return;
                } else {
                    out+="xl";
                }
            }
            case 3->out+="xxx";
            case 2->out+="xx";
            case 1->out+="x";
        }
        switch (a){
            case 9->out+="ix";
            case 8->out+="viii";
            case 7->out+="vii";
            case 6->out+="vi";
            case 5->out+="v";
            case 4->out+="iv";
            case 3->out+="iii";
            case 2->out+="ii";
            case 1->out+="i";
        }
    }

    @Contract(pure = true)
    roma(@NotNull String s){
        int n=0,i=0;
        s+="0";
        while (s.charAt(i)!='0'){
            switch (s.charAt(i)){
                case 'i'->{
                    if (s.charAt(i+1)=='M'){n+=999999;i++;}
                    else if (s.charAt(i+1)=='D'){n+=499999;i++;}
                    else if (s.charAt(i+1)=='C'){n+=99999;i++;}
                    else if (s.charAt(i+1)=='L'){n+=49999;i++;}
                    else if (s.charAt(i+1)=='X'){n+=9999;i++;}
                    else if (s.charAt(i+1)=='V'){n+=4999;i++;}
                    else if (s.charAt(i+1)=='m'){n+=999;i++;}
                    else if (s.charAt(i+1)=='d'){n+=499;i++;}
                    else if (s.charAt(i+1)=='c'){n+=99;i++;}
                    else if (s.charAt(i+1)=='l'){n+=49;i++;}
                    else if (s.charAt(i+1)=='x'){n+=9;i++;}
                    else if (s.charAt(i+1)=='v'){n+=4;i++;}
                    else n++;
                }
                case 'x'->{
                    if (s.charAt(i+1)=='M'){n+=999990;i++;}
                    else if (s.charAt(i+1)=='D'){n+=499990;i++;}
                    else if (s.charAt(i+1)=='C'){n+=99990;i++;}
                    else if (s.charAt(i+1)=='L'){n+=49990;i++;}
                    else if (s.charAt(i+1)=='X'){n+=9990;i++;}
                    else if (s.charAt(i+1)=='V'){n+=4990;i++;}
                    else if (s.charAt(i+1)=='m'){n+=990;i++;}
                    else if (s.charAt(i+1)=='d'){n+=490;i++;}
                    else if (s.charAt(i+1)=='c'){n+=90;i++;}
                    else if (s.charAt(i+1)=='l'){n+=40;i++;}
                    else n+=10;
                }
                case 'c'->{
                    if (s.charAt(i+1)=='M'){n+=999900;i++;}
                    else if (s.charAt(i+1)=='D'){n+=499900;i++;}
                    else if (s.charAt(i+1)=='C'){n+=99900;i++;}
                    else if (s.charAt(i+1)=='L'){n+=49900;i++;}
                    else if (s.charAt(i+1)=='X'){n+=9900;i++;}
                    else if (s.charAt(i+1)=='V'){n+=4900;i++;}
                    else if (s.charAt(i+1)=='m'){n+=900;i++;}
                    else if (s.charAt(i+1)=='d'){n+=400;i++;}
                    else n+=100;
                }
                case 'm'->{
                    if (s.charAt(i+1)=='M'){n+=999000;i++;}
                    else if (s.charAt(i+1)=='D'){n+=499000;i++;}
                    else if (s.charAt(i+1)=='C'){n+=99000;i++;}
                    else if (s.charAt(i+1)=='L'){n+=49000;i++;}
                    else if (s.charAt(i+1)=='X'){n+=9000;i++;}
                    else if (s.charAt(i+1)=='V'){n+=4000;i++;}
                    else n+=1000;
                }
                case 'X'->{
                    if (s.charAt(i+1)=='M'){n+=990000;i++;}
                    else if (s.charAt(i+1)=='D'){n+=490000;i++;}
                    else if (s.charAt(i+1)=='C'){n+=90000;i++;}
                    else if (s.charAt(i+1)=='L'){n+=40000;i++;}
                    else n+=10000;
                }
                case 'C'->{
                    if (s.charAt(i+1)=='M'){n+=900000;i++;}
                    else if (s.charAt(i+1)=='D'){n+=400000;i++;}
                    else n+=100000;
                }
                case 'M'->n+=1000000;
                case 'v'->n+=5;
                case 'l'->n+=50;
                case 'd'->n+=500;
                case 'V'->n+=5000;
                case 'L'->n+=50000;
                case 'D'->n+=500000;
            }
            i++;
        }
        out= String.valueOf(n);
    }
    String getOut(){return out;}
}

