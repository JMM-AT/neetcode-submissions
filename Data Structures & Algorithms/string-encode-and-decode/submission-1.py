class Solution:

    def encode(self, strs: List[str]) -> str:
        S=""
        for st in strs:
            S=S+st+"ì"
        return S

    def decode(self, s: str) -> List[str]:
        st= s.split("ì")
        st.pop()
        return st
