class Solution:
    def processStr(self, s: str) -> str:
        ans=[]
        for ch in s:
            if(ch=="*"):
                if ans:
                    ans.pop()
            elif(ch.islower()):
                ans.append(ch)
            elif(ch=='#'):
                ans.extend(ans)
            elif(ch=="%"):
                ans.reverse()
        return ''.join(ans)



        