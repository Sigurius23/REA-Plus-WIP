package b81;

import a01.C0085e;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b72.C2783a;
import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p026b2.C2314t;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.InterfaceC22996s0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b81.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r\"\u001a\u0010\u0017\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, m65681d2 = {"Lb81/f;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lb81/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "Lb81/f;", "getPreviewMultiSelectViewState", "()Lb81/f;", "previewMultiSelectViewState", "b", "getPreviewMultiSelectSelectedViewState", "previewMultiSelectSelectedViewState", "c", "getPreviewMultiSelectDisabledViewState", "previewMultiSelectDisabledViewState", "d", "getPreviewMultiSelectSuccessViewState", "previewMultiSelectSuccessViewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2797d {

    /* JADX INFO: renamed from: a */
    private static final C2799f f10979a;

    /* JADX INFO: renamed from: b */
    private static final C2799f f10980b;

    /* JADX INFO: renamed from: c */
    private static final C2799f f10981c;

    /* JADX INFO: renamed from: d */
    private static final C2799f f10982d;

    static {
        C2799f c2799f = new C2799f("multi-select-1", AbstractC37056f.m118959K(new C2803j(1, "Stretching", false, false, 0.0d, 24, null), new C2803j(2, "Late Meals", false, false, 0.0d, 24, null), new C2803j(3, "Artificial Light", false, false, 0.0d, 24, null), new C2803j(4, "Device in Bed", false, false, 0.0d, 24, null), new C2803j(5, "Shared Bed", false, false, 0.0d, 24, null), new C2803j(6, "Sleep Mask", false, false, 0.0d, 24, null), new C2803j(7, "Sleep in Dark Room", false, false, 0.0d, 24, null)), null, 4, null);
        f10979a = c2799f;
        List<InterfaceC25312u> listM7971c = c2799f.m7971c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM7971c, 10));
        int i13 = 0;
        for (Object obj : listM7971c) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
            AbstractC22676k.m65748h(interfaceC25312u, "null cannot be cast to non-null type com.whoop.design.atomic.organism.multiselect.SelectableChipViewState");
            arrayList.add(C2803j.m7983b((C2803j) interfaceC25312u, 0, null, i13 < 3, false, 0.0d, 27, null));
            i13 = i14;
        }
        C2799f c2799fM7969b = C2799f.m7969b(c2799f, null, arrayList, null, 5, null);
        f10980b = c2799fM7969b;
        f10981c = C2799f.m7969b(c2799fM7969b, null, null, EnumC2798e.DISABLED, 3, null);
        f10982d = C2799f.m7969b(c2799fM7969b, null, null, EnumC2798e.SUCCESS, 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m7964e(C2799f viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        Function1 function3;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(154161492);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C2783a(4);
                            c28655q.m87172p0(objM87133R);
                        }
                        function3 = (Function1) objM87133R;
                    } else {
                        function3 = function2;
                    }
                    float f13 = ((float) 1.5d) * 8;
                    AbstractC22960g2.m66729a(AbstractC1102d.m3409f(1.0f, modifier4), AbstractC22977m.m66746i(f13), AbstractC22977m.m66746i(f13), null, 0, 0, AbstractC37817c.m121344e(-1153953863, c28655q, new C2795b(viewState, viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC2798e.ENABLED, function3, 0)), c28655q, 1573296, 56);
                    modifier3 = modifier4;
                    function2 = function3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0085e(i13, i14, 16, modifier3, function2, viewState);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C2783a(4);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                float f14 = ((float) 1.5d) * 8;
                AbstractC22960g2.m66729a(AbstractC1102d.m3409f(1.0f, modifier4), AbstractC22977m.m66746i(f14), AbstractC22977m.m66746i(f14), null, 0, 0, AbstractC37817c.m121344e(-1153953863, c28655q, new C2795b(viewState, viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC2798e.ENABLED, function3, 0)), c28655q, 1573296, 56);
                modifier3 = modifier4;
                function2 = function3;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e(i13, i14, 16, modifier3, function2, viewState);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C2783a(4);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                float f15 = ((float) 1.5d) * 8;
                AbstractC22960g2.m66729a(AbstractC1102d.m3409f(1.0f, modifier4), AbstractC22977m.m66746i(f15), AbstractC22977m.m66746i(f15), null, 0, 0, AbstractC37817c.m121344e(-1153953863, c28655q, new C2795b(viewState, viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC2798e.ENABLED, function3, 0)), c28655q, 1573296, 56);
                modifier3 = modifier4;
                function2 = function3;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e(i13, i14, 16, modifier3, function2, viewState);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C2783a(4);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function2;
            }
            float f16 = ((float) 1.5d) * 8;
            AbstractC22960g2.m66729a(AbstractC1102d.m3409f(1.0f, modifier4), AbstractC22977m.m66746i(f16), AbstractC22977m.m66746i(f16), null, 0, 0, AbstractC37817c.m121344e(-1153953863, c28655q, new C2795b(viewState, viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() == EnumC2798e.ENABLED, function3, 0)), c28655q, 1573296, 56);
            modifier3 = modifier4;
            function2 = function3;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(i13, i14, 16, modifier3, function2, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m7965f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m7966g(C2799f c2799f, boolean z4, Function1 function1, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (InterfaceC25312u interfaceC25312u : c2799f.m7971c()) {
                if (interfaceC25312u instanceof C2803j) {
                    c28655q.m87150e0(-115135039);
                    C2803j c2803j = (C2803j) interfaceC25312u;
                    C2803j c2803jM7983b = C2803j.m7983b(c2803j, 0, null, false, z4, 0.0d, 23, null);
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u) | c28655q.m87153g(function1);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new C2796c(function1, c2803j, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC2802i.m7980c(c2803jM7983b, (InterfaceC4339a) objM87133R, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-114874763);
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, 0, 6);
                    c28655q.m87173q(false);
                }
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m7967h(Function1 function1, InterfaceC25312u interfaceC25312u) {
        C2803j c2803j = (C2803j) interfaceC25312u;
        function1.invoke(C2803j.m7983b(c2803j, 0, null, !c2803j.getSelected(), false, 0.0d, 27, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m7968i(C2799f c2799f, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m7964e(c2799f, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
