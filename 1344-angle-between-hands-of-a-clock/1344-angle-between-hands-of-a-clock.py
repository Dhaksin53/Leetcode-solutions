class Solution:
    def angleClock(self, hour: int, minutes: int) -> float:
        h = (hour % 12) * 30 + minutes * 0.5
        minute = minutes * 6

        ans = abs(h - minute)

        return min(ans, 360 - ans)
        