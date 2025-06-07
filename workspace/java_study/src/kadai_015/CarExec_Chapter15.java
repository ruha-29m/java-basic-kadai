package kadai_015;
//
	public class CarExec_Chapter15{
		public static void main(String[] args) {
		
			Car_Chapter15 Car = new Car_Chapter15();
			Car .gearChange(3);
			Car .run ();
	
	
	}
	}

    
    


//
/* private	int	gear	1速から5速のギアを表す	1
private	int	speed	ギアチェンジ後の速度を表す	10

public	void	gearChange	ギアの値により速度を変える	int afterGear
public	void	run	ギアチェンジ後の速度を表示する	無し

ギア	速度
1	時速10km
2	時速20km
3	時速30km
4	時速40km
5	時速50km
上記以外のギア	時速10km */