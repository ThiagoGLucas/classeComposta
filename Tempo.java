public class Tempo {
		private String fab;
		private String val;
		
		public Tempo(String f, String v) {
			this.fab = f;
			this.val = v;
		}

		public String getFab() {
			return fab;
		}

		public void setFab(String fab) {
			this.fab = fab;
		}

		public String getVal() {
			return val;
		}

		public void setVal(String val) {
			this.val = val;
		}
		
		public String toString() {
			return this.fab + "\n" + this.val;
		}
	}


