package test;

public class dto {


		private String memberId;

		private String memberPw;

		private String memberName;

		public String getMemberId() {
			return memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getMemberPw() {
			return memberPw;
		}

		public void setMemberPw(String memberPw) {
			this.memberPw = memberPw;
		}

		public String getMemberName() {
			return memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public dto(String memberId, String memberPw, String memberName) {
			this.memberId = memberId;
			this.memberPw = memberPw;
			this.memberName = memberName;
		}

	
	
	
	}
