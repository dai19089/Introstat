package API;

public class EventsC {
	
	private int goal[] = new int[2];
	private	int redCard[] = new int[2];
	private	int yellowCard[] = new int[2];
	private	int dangerousAttack[] = new int[2];
	private int attack[] = new int[2];
	private int leftAttack[] = new int[2];
	private int rightAttack[] = new int[2];
	private int possesion[] = new int[2];
	private int offside[] = new int[2];
	private	int corner[] = new int[2];
	private int faul[] = new int[2];
	private	int inTargetShoot[] = new int[2];
	private	int outOfTargetShoot[] = new int[2];
	private	int chances[] = new int[2];
	
	public EventsC(int[] goal, int[] redCard, int[] yellowCard, int[] dangerousAttack, int[] attack,
			int[] leftAttack, int[] rightAttack, int[] possesion, int[] offside, int[] corner, int[] faul,
			int[] inTargetShoot, int[] outOfTargetShoot, int[] chances) {
		for(int i = 0; i <= 1; i++) {
			this.goal[i] = goal[i];
			this.redCard[i] = redCard[i];
			this.yellowCard[i] = yellowCard[i];
			this.dangerousAttack[i] = dangerousAttack[i];
			this.attack[i] = attack[i];
			this.leftAttack[i] = leftAttack[i];
			this.rightAttack[i] = rightAttack[i];
			this.possesion[i] = possesion[i];
			this.offside[i] = offside[i];
			this.corner[i] = corner[i];
			this.faul[i] = faul[i];
			this.inTargetShoot[i] = inTargetShoot[i];
			this.outOfTargetShoot[i] = outOfTargetShoot[i];
			this.chances[i] = chances[i];
		}
	}
	
	public int getGoal(int team) {
		return goal[team];
	}
	
	public int getRedCard(int team) {
		return redCard[team];
	}
	
	public int getYellowCard(int team) {
		return yellowCard[team];
	}
	
	public int getDangerousAttack(int team) {
		return dangerousAttack[team];
	}
	
	public int getAttack(int team) {
		return attack[team];
	}
	
	public int getLeftAttack(int team) {
		return leftAttack[team];
	}
	
	public int getRightAttack(int team) {
		return rightAttack[team];
	}
	
	public int getPossesion(int team) {
		return possesion[team];
	}
	
	public int getOffside(int team) {
		return offside[team];
	}
	
	public int getCorner(int team) {
		return corner[team];
	}
	
	public int getFaul(int team) {
		return faul[team];
	}
	
	public int getInTargetShoot(int team) {
		return inTargetShoot[team];
	}
	
	public int getOutOfTargetShoot(int team) {
		return outOfTargetShoot[team];
	}
	
	public int getChances(int team) {
		return chances[team];
	}
}
