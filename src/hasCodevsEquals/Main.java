package hasCodevsEquals;

import java.util.HashSet;
import java.util.Set;

public class Main {
	class Player{
       public String isim;
	   public int id;
	   
	  public Player(String isim,int id){
		   this.isim=isim;
		   this.id=id;
	   }
	@Override
	public String toString() {
		return "isim=" + isim + ", id=" + id ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getEnclosingInstance().hashCode();
		result = prime * result + id;
		result = prime * result + ((isim == null) ? 0 : isim.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
			return false;
		if (id != other.id)
			return false;
		if (isim == null) {
			if (other.isim != null)
				return false;
		} else if (!isim.equals(other.isim))
			return false;
		return true;
	}
	private Main getEnclosingInstance() {
		return Main.this;
	}
	
		
	}
	

	public static void main(String[] args) {
		/*
		Set<Player> hashset = new HashSet<Player>();
		
		Player p1 = new Player("Buse",10);
		Player p2 = new Player("Berat",20);
		Player p3 = new Player("Buse",1);
		Player p4 = new Player("Bet�l",40);
		
		hashset.add(p1);
		hashset.add(p2);
		hashset.add(p3);
		hashset.add(p4);
		
		for(Player player : hashset) {
			System.out.println(player);
		}
		

	}*/
	}

}
