package e61;

import a11.C0132j;
import androidx.compose.runtime.Composer;
import j61.C21369c;
import j61.EnumC21371e;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e61.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Le61/j;", "", "<init>", "()V", "Lj61/c;", "graphAnnotationState", "Ll83/a0;", "b", "(Lj61/c;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12767j {

    /* JADX INFO: renamed from: e61.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43691a;

        static {
            int[] iArr = new int[EnumC21371e.values().length];
            try {
                iArr[EnumC21371e.REGION_HIGHLIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21371e.AVERAGE_MARKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21371e.VERTICAL_AXIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43691a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m35786c(C12767j c12767j, C21369c c21369c, int i13, Composer composer, int i14) {
        c12767j.m35787b(c21369c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final void m35787b(C21369c graphAnnotationState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(graphAnnotationState, "graphAnnotationState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1965953836);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(graphAnnotationState) : c28655q.m87157i(graphAnnotationState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            int i15 = a.f43691a[graphAnnotationState.getType().ordinal()];
            if (i15 == 1) {
                c28655q.m87150e0(1556841842);
                AbstractC12770m.m35796i(graphAnnotationState, c28655q, i14 & 14);
                c28655q.m87173q(false);
            } else if (i15 == 2) {
                c28655q.m87150e0(1556959859);
                AbstractC12770m.m35793f(graphAnnotationState, c28655q, i14 & 14);
                c28655q.m87173q(false);
            } else {
                if (i15 != 3) {
                    throw AbstractC11895b.m32003v(-503971075, c28655q, false);
                }
                c28655q.m87150e0(1557075954);
                AbstractC12770m.m35798k(graphAnnotationState, c28655q, i14 & 14);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(this, graphAnnotationState, i13, 3);
        }
    }
}
