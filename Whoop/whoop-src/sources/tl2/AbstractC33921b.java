package tl2;

import cm2.EnumC4821i;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tl2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcm2/i;", "", "a", "(Lcm2/i;)Ljava/lang/String;", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33921b {

    /* JADX INFO: renamed from: tl2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f142135a;

        static {
            int[] iArr = new int[EnumC4821i.values().length];
            try {
                iArr[EnumC4821i.VO2_MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4821i.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f142135a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m107326a(EnumC4821i enumC4821i) {
        AbstractC22676k.m65750j(enumC4821i, "<this>");
        int i13 = a.f142135a[enumC4821i.ordinal()];
        if (i13 == 1) {
            return "VO2 Max";
        }
        if (i13 == 2) {
            return "none";
        }
        throw new NoWhenBranchMatchedException();
    }
}
