package ay1;

import a81.C0555f;
import androidx.compose.runtime.Composer;
import by1.AbstractC3700g;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kotlin.C1991b1;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.C27314o;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pv1.AbstractC29579b;
import yx1.C39845f;
import yx1.InterfaceC39843d;

/* JADX INFO: renamed from: ay1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lyx1/f;", "returnsViewState", "Lkotlin/Function1;", "Lyx1/d;", "Ll83/a0;", "onViewEvent", "Lxx1/b;", "onNavigationEvent", "Lvx1/a;", "onAnalyticsEvent", "d", "(Lyx1/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2154b {
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x015d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x017f  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m6705d(C39845f returnsViewState, Function1 function1, Function1 onNavigationEvent, Function1 onAnalyticsEvent, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        int i16;
        int i17;
        AbstractC22676k.m65750j(returnsViewState, "returnsViewState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(798841948);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(returnsViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(onNavigationEvent)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(onAnalyticsEvent)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i16;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C1991b1(18);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function2 = (Function1) objM87133R2;
                }
                if (returnsViewState.getIsLoading()) {
                    c28655q2.m87150e0(-113038521);
                    function4 = function2;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 48, 2044);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q2;
                    function4 = function2;
                    if (returnsViewState.getIsError()) {
                        c28655q.m87150e0(-112760017);
                        AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC29579b.f120730h, null, 2, null), false, null, 6, null);
                        TextResource textResourceM21267a = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC29579b.f120728f, null, 2, null);
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13 || objM87133R == c28676v0) {
                            objM87133R = new C27314o(function4, 9);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 48, 2020);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (returnsViewState.getReturns() != null) {
                        c28655q.m87150e0(-112276107);
                        int i19 = i15 & 14;
                        int i24 = i15 >> 3;
                        AbstractC3700g.m11515d(returnsViewState, onNavigationEvent, onAnalyticsEvent, c28655q, (i24 & 896) | i19 | (i24 & 112));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-112038554);
                        c28655q.m87173q(false);
                    }
                }
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) returnsViewState, (Object) function3, (Object) onNavigationEvent, (Object) onAnalyticsEvent, i13, i14, 7);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(onNavigationEvent)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87157i(onAnalyticsEvent)) {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i16;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C1991b1(18);
                    c28655q2.m87172p0(objM87133R2);
                }
                function2 = (Function1) objM87133R2;
            }
            if (returnsViewState.getIsLoading()) {
                c28655q2.m87150e0(-113038521);
                function4 = function2;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 48, 2044);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                function4 = function2;
                if (returnsViewState.getIsError()) {
                    c28655q.m87150e0(-112760017);
                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC29579b.f120730h, null, 2, null), false, null, 6, null);
                    TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC29579b.f120728f, null, 2, null);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C27314o(function4, 9);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C27314o(function4, 9);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 48, 2020);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (returnsViewState.getReturns() != null) {
                    c28655q.m87150e0(-112276107);
                    int i110 = i15 & 14;
                    int i25 = i15 >> 3;
                    AbstractC3700g.m11515d(returnsViewState, onNavigationEvent, onAnalyticsEvent, c28655q, (i25 & 896) | i110 | (i25 & 112));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-112038554);
                    c28655q.m87173q(false);
                }
            }
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) returnsViewState, (Object) function3, (Object) onNavigationEvent, (Object) onAnalyticsEvent, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m6706e(InterfaceC39843d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m6707f(Function1 function1) {
        function1.invoke(InterfaceC39843d.a.f172047a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m6708g(C39845f c39845f, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m6705d(c39845f, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
