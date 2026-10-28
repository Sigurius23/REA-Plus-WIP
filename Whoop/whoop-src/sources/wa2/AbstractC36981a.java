package wa2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dc0.C11901c;
import gz0.AbstractC16319p0;
import j02.AbstractC21155m0;
import kc2.AbstractC22352b;
import kc2.C22359i;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import ra2.AbstractC31179a;
import re1.C31324k;
import ta2.AbstractC33673a;
import ua2.C34720a;
import v31.C35608d;
import w01.C36680e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: wa2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lua2/a;", "viewState", "Lkotlin/Function1;", "Lra2/a;", "Ll83/a0;", "onAnalyticsEvent", "Lta2/a;", "onNavigationEvent", "g", "(Lua2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "settings_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36981a {
    /* JADX WARN: Code duplicated, block: B:100:0x0257  */
    /* JADX WARN: Code duplicated, block: B:103:0x026e  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:106:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x02da  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:118:0x0301  */
    /* JADX WARN: Code duplicated, block: B:121:0x030c  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:65:0x0199  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0244  */
    /* JADX WARN: Code duplicated, block: B:92:0x0246  */
    /* JADX WARN: Code duplicated, block: B:95:0x024b  */
    /* JADX WARN: Code duplicated, block: B:96:0x024d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final void m118720g(C34720a viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        boolean zIsFeatureEnabled;
        Function1 function8;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function9;
        C22359i c22359iM109644a;
        boolean z13;
        boolean z14;
        int i18;
        boolean z15;
        boolean z16;
        Object objM87133R;
        C28676v0 c28676v1;
        Function1 function10;
        C39282o.Companion companion;
        int i19;
        boolean z17;
        int i24;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        int i25;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object[] objArr;
        Object[] objArr2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1743811975);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
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
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C36680e(25);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C36680e(26);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    }
                    zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("android-affiliates-book-time-item");
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.25d) * 8), C2299e.f9110M, c28655q, 6);
                    function8 = function4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    String strM21273g = AbstractC8693b.m21273g(AbstractC12922s.f44604g, c28655q, 0);
                    C38072d c38072d = C38072d.f163053a;
                    int i27 = C38072d.f163054b;
                    function9 = function7;
                    AbstractC30795n.m94707h(strM21273g, null, c38072d.m121949b(c28655q, i27).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i27).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    c22359iM109644a = viewState.getReferAFriendCard();
                    if (c22359iM109644a == null) {
                        c28655q.m87150e0(1895408620);
                        c28655q.m87173q(false);
                        function10 = function8;
                        c28676v1 = c28676v0;
                        i18 = 32;
                    } else {
                        c28655q.m87150e0(1895408621);
                        if ((i15 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z27 = z14 | z13;
                        i18 = 32;
                        if ((i15 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z27 | z15;
                        objM87133R = c28655q.m87133R();
                        c28676v1 = c28676v0;
                        if (!z16 || objM87133R == c28676v1) {
                            function10 = function8;
                            objM87133R = new C31324k(function10, viewState, function9, 18);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            function10 = function8;
                        }
                        AbstractC22352b.m64246d(c22359iM109644a, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable, 0);
                        c28655q.m87173q(false);
                    }
                    companion = C39282o.INSTANCE;
                    objArr2 = 0;
                    objArr = 0;
                    C39282o c39282oM125229d = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC12922s.f44598d), null, null, AbstractC8693b.m21277k(AbstractC12922s.f44596c), null, new C39274g(AbstractC16319p0.m46430a().getGrowth().getBarsChart(), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388566, null);
                    i19 = i15 & 896;
                    if (i19 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i24 = i15 & 112;
                    if (i24 == i18) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objM87133R2 = c28655q.m87133R();
                    if (z19 || objM87133R2 == c28676v1) {
                        objM87133R2 = new C11901c(function10, 22, function9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    i25 = C39282o.f168987q << 3;
                    AbstractC39281n.m125207c(null, c39282oM125229d, (InterfaceC4339a) objM87133R2, c28655q, i25, 1);
                    if (zIsFeatureEnabled) {
                        c28655q.m87150e0(1896303436);
                        C39282o c39282oM125229d2 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC12922s.f44594b), null, null, AbstractC8693b.m21277k(AbstractC12922s.f44592a), null, new C39274g(AbstractC16319p0.m46430a().getGrowth().getLive.hms.video.sdk.models.enums.HMSMessageType.CHAT java.lang.String(), objArr == true ? 1 : 0, 2, objArr2 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388566, null);
                        if (i19 == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if (i24 == i18) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z25 | z24;
                        objM87133R3 = c28655q.m87133R();
                        if (z26 || objM87133R3 == c28676v1) {
                            objM87133R3 = new C11901c(function10, 23, function9);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC39281n.m125207c(null, c39282oM125229d2, (InterfaceC4339a) objM87133R3, c28655q, i25, 1);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1896911749);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function5 = function9;
                    function6 = function10;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35608d((Object) viewState, function5, (InterfaceC23459e) function6, i13, i14, 24);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C36680e(25);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36680e(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                }
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("android-affiliates-book-time-item");
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.25d) * 8), C2299e.f9110M, c28655q, 6);
                function8 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                String strM21273g2 = AbstractC8693b.m21273g(AbstractC12922s.f44604g, c28655q, 0);
                C38072d c38072d2 = C38072d.f163053a;
                int i28 = C38072d.f163054b;
                function9 = function7;
                AbstractC30795n.m94707h(strM21273g2, null, c38072d2.m121949b(c28655q, i28).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i28).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c22359iM109644a = viewState.getReferAFriendCard();
                if (c22359iM109644a == null) {
                    c28655q.m87150e0(1895408620);
                    c28655q.m87173q(false);
                    function10 = function8;
                    c28676v1 = c28676v0;
                    i18 = 32;
                } else {
                    c28655q.m87150e0(1895408621);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    boolean z28 = z14 | z13;
                    i18 = 32;
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z28 | z15;
                    objM87133R = c28655q.m87133R();
                    c28676v1 = c28676v0;
                    if (z16) {
                        function10 = function8;
                        objM87133R = new C31324k(function10, viewState, function9, 18);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function10 = function8;
                        objM87133R = new C31324k(function10, viewState, function9, 18);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC22352b.m64246d(c22359iM109644a, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable, 0);
                    c28655q.m87173q(false);
                }
                companion = C39282o.INSTANCE;
                objArr2 = 0;
                objArr = 0;
                C39282o c39282oM125229d3 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC12922s.f44598d), null, null, AbstractC8693b.m21277k(AbstractC12922s.f44596c), null, new C39274g(AbstractC16319p0.m46430a().getGrowth().getBarsChart(), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388566, null);
                i19 = i15 & 896;
                if (i19 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i24 = i15 & 112;
                if (i24 == i18) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    objM87133R2 = new C11901c(function10, 22, function9);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11901c(function10, 22, function9);
                    c28655q.m87172p0(objM87133R2);
                }
                i25 = C39282o.f168987q << 3;
                AbstractC39281n.m125207c(null, c39282oM125229d3, (InterfaceC4339a) objM87133R2, c28655q, i25, 1);
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(1896303436);
                    C39282o c39282oM125229d4 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC12922s.f44594b), null, null, AbstractC8693b.m21277k(AbstractC12922s.f44592a), null, new C39274g(AbstractC16319p0.m46430a().getGrowth().getLive.hms.video.sdk.models.enums.HMSMessageType.CHAT java.lang.String(), objArr == true ? 1 : 0, 2, objArr2 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388566, null);
                    if (i19 == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (i24 == i18) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | z24;
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11901c(function10, 23, function9);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11901c(function10, 23, function9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC39281n.m125207c(null, c39282oM125229d4, (InterfaceC4339a) objM87133R3, c28655q, i25, 1);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1896911749);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function9;
                function6 = function10;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d((Object) viewState, function5, (InterfaceC23459e) function6, i13, i14, 24);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
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
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C36680e(25);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36680e(26);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                }
                zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("android-affiliates-book-time-item");
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.25d) * 8), C2299e.f9110M, c28655q, 6);
                function8 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                String strM21273g3 = AbstractC8693b.m21273g(AbstractC12922s.f44604g, c28655q, 0);
                C38072d c38072d3 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                function9 = function7;
                AbstractC30795n.m94707h(strM21273g3, null, c38072d3.m121949b(c28655q, i29).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i29).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c22359iM109644a = viewState.getReferAFriendCard();
                if (c22359iM109644a == null) {
                    c28655q.m87150e0(1895408620);
                    c28655q.m87173q(false);
                    function10 = function8;
                    c28676v1 = c28676v0;
                    i18 = 32;
                } else {
                    c28655q.m87150e0(1895408621);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    boolean z29 = z14 | z13;
                    i18 = 32;
                    if ((i15 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z29 | z15;
                    objM87133R = c28655q.m87133R();
                    c28676v1 = c28676v0;
                    if (z16) {
                        function10 = function8;
                        objM87133R = new C31324k(function10, viewState, function9, 18);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function10 = function8;
                        objM87133R = new C31324k(function10, viewState, function9, 18);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC22352b.m64246d(c22359iM109644a, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable, 0);
                    c28655q.m87173q(false);
                }
                companion = C39282o.INSTANCE;
                objArr2 = 0;
                objArr = 0;
                C39282o c39282oM125229d5 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC12922s.f44598d), null, null, AbstractC8693b.m21277k(AbstractC12922s.f44596c), null, new C39274g(AbstractC16319p0.m46430a().getGrowth().getBarsChart(), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388566, null);
                i19 = i15 & 896;
                if (i19 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i24 = i15 & 112;
                if (i24 == i18) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z17 | z18;
                objM87133R2 = c28655q.m87133R();
                if (z19) {
                    objM87133R2 = new C11901c(function10, 22, function9);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11901c(function10, 22, function9);
                    c28655q.m87172p0(objM87133R2);
                }
                i25 = C39282o.f168987q << 3;
                AbstractC39281n.m125207c(null, c39282oM125229d5, (InterfaceC4339a) objM87133R2, c28655q, i25, 1);
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(1896303436);
                    C39282o c39282oM125229d6 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC12922s.f44594b), null, null, AbstractC8693b.m21277k(AbstractC12922s.f44592a), null, new C39274g(AbstractC16319p0.m46430a().getGrowth().getLive.hms.video.sdk.models.enums.HMSMessageType.CHAT java.lang.String(), objArr == true ? 1 : 0, 2, objArr2 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388566, null);
                    if (i19 == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (i24 == i18) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | z24;
                    objM87133R3 = c28655q.m87133R();
                    if (z26) {
                        objM87133R3 = new C11901c(function10, 23, function9);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C11901c(function10, 23, function9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC39281n.m125207c(null, c39282oM125229d6, (InterfaceC4339a) objM87133R3, c28655q, i25, 1);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1896911749);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function5 = function9;
                function6 = function10;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d((Object) viewState, function5, (InterfaceC23459e) function6, i13, i14, 24);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C36680e(25);
                    c28655q.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C36680e(26);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            }
            zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("android-affiliates-book-time-item");
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.25d) * 8), C2299e.f9110M, c28655q, 6);
            function8 = function4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            String strM21273g4 = AbstractC8693b.m21273g(AbstractC12922s.f44604g, c28655q, 0);
            C38072d c38072d4 = C38072d.f163053a;
            int i210 = C38072d.f163054b;
            function9 = function7;
            AbstractC30795n.m94707h(strM21273g4, null, c38072d4.m121949b(c28655q, i210).getWhite90(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i210).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c22359iM109644a = viewState.getReferAFriendCard();
            if (c22359iM109644a == null) {
                c28655q.m87150e0(1895408620);
                c28655q.m87173q(false);
                function10 = function8;
                c28676v1 = c28676v0;
                i18 = 32;
            } else {
                c28655q.m87150e0(1895408621);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 14) != 4) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                boolean z210 = z14 | z13;
                i18 = 32;
                if ((i15 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z210 | z15;
                objM87133R = c28655q.m87133R();
                c28676v1 = c28676v0;
                if (z16) {
                    function10 = function8;
                    objM87133R = new C31324k(function10, viewState, function9, 18);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function10 = function8;
                    objM87133R = new C31324k(function10, viewState, function9, 18);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC22352b.m64246d(c22359iM109644a, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable, 0);
                c28655q.m87173q(false);
            }
            companion = C39282o.INSTANCE;
            objArr2 = 0;
            objArr = 0;
            C39282o c39282oM125229d7 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC12922s.f44598d), null, null, AbstractC8693b.m21277k(AbstractC12922s.f44596c), null, new C39274g(AbstractC16319p0.m46430a().getGrowth().getBarsChart(), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388566, null);
            i19 = i15 & 896;
            if (i19 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            i24 = i15 & 112;
            if (i24 == i18) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z17 | z18;
            objM87133R2 = c28655q.m87133R();
            if (z19) {
                objM87133R2 = new C11901c(function10, 22, function9);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C11901c(function10, 22, function9);
                c28655q.m87172p0(objM87133R2);
            }
            i25 = C39282o.f168987q << 3;
            AbstractC39281n.m125207c(null, c39282oM125229d7, (InterfaceC4339a) objM87133R2, c28655q, i25, 1);
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(1896303436);
                C39282o c39282oM125229d8 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC12922s.f44594b), null, null, AbstractC8693b.m21277k(AbstractC12922s.f44592a), null, new C39274g(AbstractC16319p0.m46430a().getGrowth().getLive.hms.video.sdk.models.enums.HMSMessageType.CHAT java.lang.String(), objArr == true ? 1 : 0, 2, objArr2 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388566, null);
                if (i19 == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (i24 == i18) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z25 | z24;
                objM87133R3 = c28655q.m87133R();
                if (z26) {
                    objM87133R3 = new C11901c(function10, 23, function9);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C11901c(function10, 23, function9);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC39281n.m125207c(null, c39282oM125229d8, (InterfaceC4339a) objM87133R3, c28655q, i25, 1);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1896911749);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function5 = function9;
            function6 = function10;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d((Object) viewState, function5, (InterfaceC23459e) function6, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m118721h(AbstractC31179a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m118722i(AbstractC33673a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m118723j(Function1 function1, C34720a c34720a, Function1 function2) {
        function1.invoke(new AbstractC33673a.c(c34720a.getReferAFriendCard().getShareMessage()));
        function2.invoke(new AbstractC31179a.b(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m118724k(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC33673a.a.f140652a);
        function2.invoke(new AbstractC31179a.c(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m118725l(Function1 function1, Function1 function2) {
        function1.invoke(new AbstractC33673a.b(new AbstractC21155m0.g1("https://calendly.com/d/ckkp-5q8-knd/affiliate-1x1-meeting-with-a-whoop-team-member")));
        function2.invoke(new AbstractC31179a.a(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m118726m(C34720a c34720a, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m118720g(c34720a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
