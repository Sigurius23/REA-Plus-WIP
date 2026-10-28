package wz0;

import i51.EnumC18104a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"", "authoredMinDurationMs", "", "animationFailed", "a", "(Ljava/lang/Long;Z)Ljava/lang/Long;", "", "stepIndex", "lastIndex", "Li51/a;", "repeatMode", "animationFinished", "minimumDurationElapsed", "Lwz0/g;", "b", "(IILi51/a;ZZ)Lwz0/g;", "play", "stepCount", "c", "(IILi51/a;)I", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37774a {

    /* JADX INFO: renamed from: wz0.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f161800a;

        static {
            int[] iArr = new int[EnumC18104a.values().length];
            try {
                iArr[EnumC18104a.LOOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f161800a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Long m121174a(Long l7, boolean z4) {
        if (l7 == null) {
            return z4 ? 2000L : null;
        }
        return l7;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC37780g m121175b(int i13, int i14, EnumC18104a repeatMode, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(repeatMode, "repeatMode");
        if (repeatMode == EnumC18104a.OFF) {
            return EnumC37780g.WAIT;
        }
        if (z4 && z13) {
            return (i13 < i14 || repeatMode == EnumC18104a.LOOP) ? EnumC37780g.NEXT : EnumC37780g.COMPLETE;
        }
        return EnumC37780g.WAIT;
    }

    /* JADX INFO: renamed from: c */
    public static final int m121176c(int i13, int i14, EnumC18104a repeatMode) {
        AbstractC22676k.m65750j(repeatMode, "repeatMode");
        if (a.f161800a[repeatMode.ordinal()] == 1) {
            return i13 % i14;
        }
        int i15 = i14 - 1;
        return i13 > i15 ? i15 : i13;
    }
}
