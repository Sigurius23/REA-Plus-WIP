package po0;

import cp0.EnumC11003u1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: po0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcp0/u1;", "", "a", "(Lcp0/u1;)Ljava/lang/String;", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29398b {

    /* JADX INFO: renamed from: po0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f119245a;

        static {
            int[] iArr = new int[EnumC11003u1.values().length];
            try {
                iArr[EnumC11003u1.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11003u1.Partial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11003u1.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f119245a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m89576a(EnumC11003u1 enumC11003u1) {
        AbstractC22676k.m65750j(enumC11003u1, "<this>");
        int i13 = a.f119245a[enumC11003u1.ordinal()];
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            return "half";
        }
        if (i13 == 3) {
            return "full";
        }
        throw new NoWhenBranchMatchedException();
    }
}
