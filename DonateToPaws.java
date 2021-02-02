public class DonateToPaws {
    public static double donationFee(double donationAmount){
            double fee=0;
        double feeTotal=0;
        double feeFinal=0;

        if(donationAmount<=150){
            feeFinal=3;
        }
        else if(donationAmount>150&&donationAmount<1500){
            fee=donationAmount*.04;
            if(fee>8){
                feeFinal=fee;
            }
            else{
                feeFinal= 8.0;
            }
        }
        else if(donationAmount>=1500&&donationAmount<15000){
            fee=donationAmount*.01;
            if(fee>20){
                feeFinal=fee;
            }
            else{
                feeFinal=20;
            }
        }
        else if(donationAmount>=15000){
            feeTotal+=150.0;
            if((donationAmount-15000)>=4000){
                feeTotal+=80.0;
                if(donationAmount>19000){
                    fee=((donationAmount-19000)*.03);
                    feeTotal+=fee;
                    //return feeTotal;
                    feeFinal=feeTotal;
                }
                feeFinal=feeTotal;
                //return feeTotal;
            }
                //return feeTotal;
                feeFinal=feeTotal;

        }

        return feeFinal;


    }
}
