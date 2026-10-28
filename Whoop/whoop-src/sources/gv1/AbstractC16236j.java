package gv1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1930a;
import b91.C2886a;
import c93.InterfaceC4339a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p133f1.C13989w1;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: gv1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "selectedFileName", "", "hasFileSelected", "Lkotlin/Function1;", "Lgv1/l;", "Ll83/a0;", "onSelectFileClick", "onConfirm", "d", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lottie-tester_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16236j {

    /* JADX INFO: renamed from: gv1.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f61691a;

        static {
            int[] iArr = new int[EnumC16238l.values().length];
            try {
                iArr[EnumC16238l.LOTTIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16238l.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61691a = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m45994d(String str, boolean z4, Function1 onSelectFileClick, Function1 onConfirm, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onSelectFileClick, "onSelectFileClick");
        AbstractC22676k.m65750j(onConfirm, "onConfirm");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-460459047);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onSelectFileClick) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onConfirm) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            AbstractC16240n.m46014e("Please, select the file you want to load", z4, onConfirm, AbstractC37817c.m121344e(822693202, c28655q, new C16235i(onSelectFileClick, str)), c28655q, (i14 & 112) | 3078 | ((i14 >> 3) & 896));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(str, z4, onSelectFileClick, onConfirm, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m45995e(Function1 function1, String str, EnumC16238l selectedType, Composer composer, int i13) {
        int i14;
        String str2;
        AbstractC22676k.m65750j(selectedType, "selectedType");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87149e(selectedType.ordinal()) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = a.f61691a[selectedType.ordinal()];
            if (i15 == 1) {
                str2 = "Select file";
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "Select image";
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            float f13 = 4;
            Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3409f, f13, f13, c38072d.m121949b(c28655q, i16).getBlack30());
            boolean zM87153g = ((i14 & 14) == 4) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C13989w1(16, function1, selectedType);
                c28655q.m87172p0(objM87133R);
            }
            float f14 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3362g(modifierM95629e, false, null, null, (InterfaceC4339a) objM87133R, 15), 2 * f14, ((float) 1.75d) * f14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String str3 = str == null ? "No file selected" : str;
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i16).getB1();
            long jM73366B = str != null ? AbstractC25012a.m73366B(c28655q, -1275009224, c38072d, c28655q, i16) : AbstractC31061c.m95627c(c28655q, -1275008139, c38072d, c28655q, i16);
            c28655q.m87173q(false);
            AbstractC30795n.m94707h(str3, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, C2886a.f11498d << 18, 196602);
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(c38072d.m121951d().getVarious().getFile(), c28655q, 0), str2, null, c38072d.m121949b(c28655q, i16).getWhite50(), c28655q, 0, 4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m45996f(Function1 function1, EnumC16238l enumC16238l) {
        function1.invoke(enumC16238l);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m45997g(String str, boolean z4, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m45994d(str, z4, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
