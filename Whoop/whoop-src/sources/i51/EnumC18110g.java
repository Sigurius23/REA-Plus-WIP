package i51;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import t83.InterfaceC33616a;
import vf3.AbstractC35952b;

/* JADX INFO: renamed from: i51.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, m65681d2 = {"Li51/g;", "", "<init>", "(Ljava/lang/String;I)V", "", "scale", "Ly3/f;", "unitSize", "Ly3/h;", "streakLottieSquareSize-ISypg3U", "(IF)J", "streakLottieSquareSize", "height", "streakLottieRectangleSize-0ZcVfYs", "(F)J", "streakLottieRectangleSize", "getMediaSize-0ZcVfYs", "getMediaSize", "getStreakLottieSize-MYxV2XQ", "()J", "getStreakLottieSize", "SMALL", "MEDIUM", "LARGE", "STREAK_LOTTIE_MEDIUM", "STREAK_LOTTIE_LARGE", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC18110g {
    SMALL,
    MEDIUM,
    LARGE,
    STREAK_LOTTIE_MEDIUM,
    STREAK_LOTTIE_LARGE;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: i51.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70325a;

        static {
            int[] iArr = new int[EnumC18110g.values().length];
            try {
                iArr[EnumC18110g.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18110g.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18110g.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC18110g.STREAK_LOTTIE_MEDIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC18110g.STREAK_LOTTIE_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f70325a = iArr;
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: streakLottieRectangleSize-0ZcVfYs, reason: not valid java name */
    private final long m134213streakLottieRectangleSize0ZcVfYs(float height) {
        return AbstractC35952b.m114193a((80.0f * height) / 145.0f, height);
    }

    /* JADX INFO: renamed from: streakLottieSquareSize-ISypg3U, reason: not valid java name */
    private final long m134214streakLottieSquareSizeISypg3U(int scale, float unitSize) {
        float f13 = scale * unitSize;
        return AbstractC35952b.m114193a(f13, f13);
    }

    /* JADX INFO: renamed from: getMediaSize-0ZcVfYs, reason: not valid java name */
    public final long m134215getMediaSize0ZcVfYs(float unitSize) {
        int i13 = a.f70325a[ordinal()];
        if (i13 == 1) {
            float f13 = 2 * unitSize;
            return AbstractC35952b.m114193a(f13, f13);
        }
        if (i13 == 2) {
            float f14 = 3 * unitSize;
            return AbstractC35952b.m114193a(f14, f14);
        }
        if (i13 == 3) {
            float f15 = 5 * unitSize;
            return AbstractC35952b.m114193a(f15, f15);
        }
        if (i13 == 4 || i13 == 5) {
            return m134216getStreakLottieSizeMYxV2XQ();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: getStreakLottieSize-MYxV2XQ, reason: not valid java name */
    public final long m134216getStreakLottieSizeMYxV2XQ() {
        int i13 = a.f70325a[ordinal()];
        if (i13 != 4 && i13 == 5) {
            return m134213streakLottieRectangleSize0ZcVfYs(80 * 4);
        }
        return m134213streakLottieRectangleSize0ZcVfYs(60 * 4);
    }
}
