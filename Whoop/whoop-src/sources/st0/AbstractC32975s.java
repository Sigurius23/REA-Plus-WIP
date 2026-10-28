package st0;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: st0.s */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lst0/r;", "", "a", "(Lst0/r;)Ljava/lang/String;", "connectivity-core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32975s {

    /* JADX INFO: renamed from: st0.s$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f137303a;

        static {
            int[] iArr = new int[EnumC32973q.values().length];
            try {
                iArr[EnumC32973q.LOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32973q.UNLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f137303a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m104081a(InterfaceC32974r interfaceC32974r) {
        AbstractC22676k.m65750j(interfaceC32974r, "<this>");
        C32976t c32976tMo104080b = interfaceC32974r.mo104080b();
        EnumC32973q state = c32976tMo104080b != null ? c32976tMo104080b.getState() : null;
        int i13 = state == null ? -1 : a.f137303a[state.ordinal()];
        if (i13 == -1) {
            return "unknown";
        }
        if (i13 == 1) {
            return "locked";
        }
        if (i13 == 2) {
            return "unlocked";
        }
        throw new NoWhenBranchMatchedException();
    }
}
