
public class diep {

	private int Hits;
	private int AB;
	private int BB;
	private int HBP;
	private int SF;
	private int dbl;
	private int triple;
	private int HR;
		
	public diep (int hits, int aB, int bB, int hBP, int sF, int dbl, int triple, int hR) {
		super();
		Hits = hits;
		AB = aB;
		BB = bB;
		HBP = hBP;
		SF = sF;
		this.dbl = dbl;
		this.triple = triple;
		HR = hR;
	}
	public int getHits() {
		return Hits;
	}
	public void setHits(int hits) {
		Hits = hits;
	}
	public int getAB() {
		return AB;
	}
	public void setAB(int aB) {
		AB = aB;
	}
	public int getBB() {
		return BB;
	}
	public void setBB(int bB) {
		BB = bB;
	}
	public int getHBP() {
		return HBP;
	}
	public void setHBP(int hBP) {
		HBP = hBP;
	}
	public int getSF() {
		return SF;
	}
	public void setSF(int sF) {
		SF = sF;
	}
	public int getDbl() {
		return dbl;
	}
	public void setDbl(int dbl) {
		this.dbl = dbl;
	}
	public int getTriple() {
		return triple;
	}
	public void setTriple(int triple) {
		this.triple = triple;
	}
	public int getHR() {
		return HR;
	}
	public void setHR(int hR) {
		HR = hR;
	}
	
	public double SLG()
	{
		int singles = this.Hits - this.dbl - this.triple - this.HR;
		
		double slg = (singles + (2 * this.dbl) + (3 * this.triple) + (4 * this.HR)) / this.AB;
		
		return slg;
	}
	public double BA() 
	{
		double ba = this.Hits / this.AB;
		
		return ba;
	}
	public double OBP() 
	{
		double obp = (this.Hits + this.BB + this.HBP)/(this.AB + this.BB + this.HBP + this.SF);
		
		return obp;
	}
	public double OPS() 
	{
		int singles = this.Hits - this.dbl - this.triple - this.HR;
		
		double obp = (this.Hits + this.BB + this.HBP)/(this.AB + this.BB + this.HBP + this.SF);
		
		double slg = (singles + (2 * this.dbl) + (3 * this.triple) + (4 * this.HR)) / this.AB;
		
		double ops = slg + obp;
		
		return ops;
	}
	public double TB() 
	{
		int singles = this.Hits - this.dbl - this.triple - this.HR;
		
		double tb = (singles + (2 * this.dbl) + (3 * this.triple) + (4 * this.HR));
	}
	
}