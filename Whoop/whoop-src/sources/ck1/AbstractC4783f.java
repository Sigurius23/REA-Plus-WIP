package ck1;

import a01.C0086f;
import ak1.AbstractC0949b;
import ak1.C0951d;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bf0.C3189a;
import c93.InterfaceC4339a;
import cd0.C4435a;
import cj2.C4769a;
import com.whoop.design.util.AbstractC8693b;
import dp0.AbstractC12250f;
import ep0.C13404j;
import fy1.AbstractC14874j;
import fy1.InterfaceC14875k;
import gb1.AbstractC15673b0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import uv0.AbstractC35283c;
import vj1.AbstractC36068a;
import wb3.AbstractC37056f;
import zj1.AbstractC40770a;

/* JADX INFO: renamed from: ck1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ae\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lak1/d;", "viewState", "", "source", "Lkotlin/Function1;", "Lak1/b;", "Ll83/a0;", "onViewEvent", "Lzj1/a;", "onNavigationEvent", "Lvj1/a;", "onAnalyticEvent", "l", "(Lak1/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "i", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "health-monitor_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4783f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    private static final void m15061i(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(37916153);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Object[] objArr = 0 == true ? 1 : 0;
            C33211q0 c33211q0 = new C33211q0(null, new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC35283c.f150170H), false, null, 6, null), null, objArr, AbstractC8693b.m21277k(AbstractC35283c.f150167E), false, false, null, false, false, MessageListItemViewType.LOADING_INDICATOR, null);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3189a(function1, 21);
                c28655q.m87172p0(objM87133R);
            }
            Function0.m105274p(c33211q0, (InterfaceC4339a) objM87133R, null, c28655q, C33211q0.f138501k, 4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m15062j(Function1 function1) {
        function1.invoke(AbstractC40770a.a.f175792a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m15063k(Function1 function1, int i13, Composer composer, int i14) {
        m15061i(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0194 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0196  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:107:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x021a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0227  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0145  */
    /* JADX WARN: Code duplicated, block: B:91:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:96:0x0174  */
    /* JADX WARN: Code duplicated, block: B:98:0x018a  */
    /* JADX WARN: Code duplicated, block: B:99:0x018c  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x00a2, please report this as an issue */
    /* JADX INFO: renamed from: l */
    public static final void m15064l(final C0951d viewState, String str, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        Function1 function5;
        int i19;
        int i24;
        Function1 function6;
        int i25;
        boolean z4;
        String str3;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        final Function1 function10;
        Function1 function11;
        Function1 function12;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        String str4;
        Function1 function13;
        boolean z13;
        int i26;
        boolean z14;
        boolean z15;
        Object objM87133R;
        boolean z16;
        boolean z17;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(907615936);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function1;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function5 = function2;
                        if (c28655q.m87157i(function5)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            function6 = function3;
                            if (c28655q.m87157i(function6)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z4)) {
                            if (i27 != 0) {
                                str2 = null;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R5 = c28655q.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C4769a(5);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                function10 = (Function1) objM87133R5;
                            } else {
                                function10 = function4;
                            }
                            if (i18 != 0) {
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C4769a(6);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                function11 = (Function1) objM87133R4;
                            } else {
                                function11 = function5;
                            }
                            if (i24 != 0) {
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C4769a(7);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                function12 = (Function1) objM87133R3;
                            } else {
                                function12 = function6;
                            }
                            AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                            C0951d.b bVarM2401e = viewState.getContent();
                            Modifier modifierM34129b = AbstractC12250f.m34129b(modifierM66722k, bVarM2401e != null ? bVarM2401e.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM34129b);
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
                            if (viewState.getFullScreenModal() != null) {
                                c28655q.m87150e0(-1892211550);
                                C33211q0 c33211q0M2405c = viewState.getFullScreenModal().getState();
                                boolean zM87157i = c28655q.m87157i(viewState);
                                i26 = i15 & 896;
                                if (i26 == 256) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = zM87157i | z14;
                                objM87133R = c28655q.m87133R();
                                if (z15 || objM87133R == c28676v0) {
                                    final int i28 = 0;
                                    objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i28) {
                                                case 0:
                                                    return AbstractC4783f.m15068p(viewState, function10);
                                                default:
                                                    return AbstractC4783f.m15069q(viewState, function10);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R);
                                }
                                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                                boolean zM87157i2 = c28655q.m87157i(viewState);
                                if (i26 == 256) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                z17 = z16 | zM87157i2;
                                objM87133R2 = c28655q.m87133R();
                                if (z17 || objM87133R2 == c28676v0) {
                                    final int i29 = 1;
                                    objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            switch (i29) {
                                                case 0:
                                                    return AbstractC4783f.m15068p(viewState, function10);
                                                default:
                                                    return AbstractC4783f.m15069q(viewState, function10);
                                            }
                                        }
                                    };
                                    c28655q.m87172p0(objM87133R2);
                                }
                                Function0.m105274p(c33211q0M2405c, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                                c28655q.m87173q(false);
                                str4 = str2;
                                function13 = function11;
                                function6 = function12;
                                z13 = true;
                            } else if (viewState.getContent() != null) {
                                c28655q.m87150e0(-1892200541);
                                str4 = str2;
                                function13 = function11;
                                function6 = function12;
                                z13 = true;
                                AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                str4 = str2;
                                function13 = function11;
                                function6 = function12;
                                z13 = true;
                                c28655q.m87150e0(-1892189486);
                                m15061i(function13, c28655q, (i15 >> 9) & 14);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z13);
                            function7 = function10;
                            str3 = str4;
                            function8 = function13;
                        } else {
                            c28655q.m87138X();
                            str3 = str2;
                            function7 = function4;
                            function8 = function5;
                        }
                        function9 = function6;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                        }
                    }
                    i15 |= 24576;
                    function6 = function3;
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i27 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4769a(5);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                        } else {
                            function10 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4769a(6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(7);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function12 = (Function1) objM87133R3;
                        } else {
                            function12 = function6;
                        }
                        AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                        Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                        C0951d.b bVarM2401e2 = viewState.getContent();
                        Modifier modifierM34129b2 = AbstractC12250f.m34129b(modifierM66722k2, bVarM2401e2 != null ? bVarM2401e2.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM34129b2);
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
                        if (viewState.getFullScreenModal() != null) {
                            c28655q.m87150e0(-1892211550);
                            C33211q0 c33211q0M2405c2 = viewState.getFullScreenModal().getState();
                            boolean zM87157i3 = c28655q.m87157i(viewState);
                            i26 = i15 & 896;
                            if (i26 == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = zM87157i3 | z14;
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                final int i210 = 0;
                                objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i210) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                final int i211 = 0;
                                objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i211) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                            boolean zM87157i4 = c28655q.m87157i(viewState);
                            if (i26 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | zM87157i4;
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                final int i212 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i212) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i213 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i213) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            Function0.m105274p(c33211q0M2405c2, interfaceC4339a2, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                            c28655q.m87173q(false);
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                        } else if (viewState.getContent() != null) {
                            c28655q.m87150e0(-1892200541);
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                            AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                            c28655q.m87150e0(-1892189486);
                            m15061i(function13, c28655q, (i15 >> 9) & 14);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z13);
                        function7 = function10;
                        str3 = str4;
                        function8 = function13;
                    } else {
                        c28655q.m87138X();
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                    }
                    function9 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                    }
                }
                i15 |= 3072;
                function5 = function2;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i27 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4769a(5);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                        } else {
                            function10 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4769a(6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(7);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function12 = (Function1) objM87133R3;
                        } else {
                            function12 = function6;
                        }
                        AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                        Modifier modifierM66722k3 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                        C0951d.b bVarM2401e3 = viewState.getContent();
                        Modifier modifierM34129b3 = AbstractC12250f.m34129b(modifierM66722k3, bVarM2401e3 != null ? bVarM2401e3.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM34129b3);
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
                        if (viewState.getFullScreenModal() != null) {
                            c28655q.m87150e0(-1892211550);
                            C33211q0 c33211q0M2405c3 = viewState.getFullScreenModal().getState();
                            boolean zM87157i5 = c28655q.m87157i(viewState);
                            i26 = i15 & 896;
                            if (i26 == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = zM87157i5 | z14;
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                final int i214 = 0;
                                objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i214) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                final int i215 = 0;
                                objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i215) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            boolean zM87157i6 = c28655q.m87157i(viewState);
                            if (i26 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | zM87157i6;
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                final int i216 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i216) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i217 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i217) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            Function0.m105274p(c33211q0M2405c3, interfaceC4339a3, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                            c28655q.m87173q(false);
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                        } else if (viewState.getContent() != null) {
                            c28655q.m87150e0(-1892200541);
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                            AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                            c28655q.m87150e0(-1892189486);
                            m15061i(function13, c28655q, (i15 >> 9) & 14);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z13);
                        function7 = function10;
                        str3 = str4;
                        function8 = function13;
                    } else {
                        c28655q.m87138X();
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                    }
                    function9 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4769a(5);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4769a(6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                    Modifier modifierM66722k4 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                    C0951d.b bVarM2401e4 = viewState.getContent();
                    Modifier modifierM34129b4 = AbstractC12250f.m34129b(modifierM66722k4, bVarM2401e4 != null ? bVarM2401e4.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM34129b4);
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
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(-1892211550);
                        C33211q0 c33211q0M2405c4 = viewState.getFullScreenModal().getState();
                        boolean zM87157i7 = c28655q.m87157i(viewState);
                        i26 = i15 & 896;
                        if (i26 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87157i7 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            final int i218 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i218) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i219 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i219) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                        boolean zM87157i8 = c28655q.m87157i(viewState);
                        if (i26 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zM87157i8;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            final int i2110 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2110) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i2111 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2111) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function0.m105274p(c33211q0M2405c4, interfaceC4339a4, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                        c28655q.m87173q(false);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                    } else if (viewState.getContent() != null) {
                        c28655q.m87150e0(-1892200541);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        c28655q.m87150e0(-1892189486);
                        m15061i(function13, c28655q, (i15 >> 9) & 14);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                    function7 = function10;
                    str3 = str4;
                    function8 = function13;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                }
            }
            i15 |= 384;
            function4 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i27 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4769a(5);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                        } else {
                            function10 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4769a(6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(7);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function12 = (Function1) objM87133R3;
                        } else {
                            function12 = function6;
                        }
                        AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                        Modifier modifierM66722k5 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                        C0951d.b bVarM2401e5 = viewState.getContent();
                        Modifier modifierM34129b5 = AbstractC12250f.m34129b(modifierM66722k5, bVarM2401e5 != null ? bVarM2401e5.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM34129b5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        if (viewState.getFullScreenModal() != null) {
                            c28655q.m87150e0(-1892211550);
                            C33211q0 c33211q0M2405c5 = viewState.getFullScreenModal().getState();
                            boolean zM87157i9 = c28655q.m87157i(viewState);
                            i26 = i15 & 896;
                            if (i26 == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = zM87157i9 | z14;
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                final int i2112 = 0;
                                objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i2112) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                final int i2113 = 0;
                                objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i2113) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                            boolean zM87157i10 = c28655q.m87157i(viewState);
                            if (i26 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | zM87157i10;
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                final int i2114 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i2114) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i2115 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i2115) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            Function0.m105274p(c33211q0M2405c5, interfaceC4339a5, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                            c28655q.m87173q(false);
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                        } else if (viewState.getContent() != null) {
                            c28655q.m87150e0(-1892200541);
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                            AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                            c28655q.m87150e0(-1892189486);
                            m15061i(function13, c28655q, (i15 >> 9) & 14);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z13);
                        function7 = function10;
                        str3 = str4;
                        function8 = function13;
                    } else {
                        c28655q.m87138X();
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                    }
                    function9 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4769a(5);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4769a(6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                    Modifier modifierM66722k6 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                    C0951d.b bVarM2401e6 = viewState.getContent();
                    Modifier modifierM34129b6 = AbstractC12250f.m34129b(modifierM66722k6, bVarM2401e6 != null ? bVarM2401e6.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM34129b6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(-1892211550);
                        C33211q0 c33211q0M2405c6 = viewState.getFullScreenModal().getState();
                        boolean zM87157i11 = c28655q.m87157i(viewState);
                        i26 = i15 & 896;
                        if (i26 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87157i11 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            final int i2116 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2116) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i2117 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2117) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                        boolean zM87157i12 = c28655q.m87157i(viewState);
                        if (i26 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zM87157i12;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            final int i2118 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2118) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i2119 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2119) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function0.m105274p(c33211q0M2405c6, interfaceC4339a6, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                        c28655q.m87173q(false);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                    } else if (viewState.getContent() != null) {
                        c28655q.m87150e0(-1892200541);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        c28655q.m87150e0(-1892189486);
                        m15061i(function13, c28655q, (i15 >> 9) & 14);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                    function7 = function10;
                    str3 = str4;
                    function8 = function13;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                }
            }
            i15 |= 3072;
            function5 = function2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4769a(5);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4769a(6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                    Modifier modifierM66722k7 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                    C0951d.b bVarM2401e7 = viewState.getContent();
                    Modifier modifierM34129b7 = AbstractC12250f.m34129b(modifierM66722k7, bVarM2401e7 != null ? bVarM2401e7.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM34129b7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(-1892211550);
                        C33211q0 c33211q0M2405c7 = viewState.getFullScreenModal().getState();
                        boolean zM87157i13 = c28655q.m87157i(viewState);
                        i26 = i15 & 896;
                        if (i26 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87157i13 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            final int i21110 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i21110) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i21111 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i21111) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        boolean zM87157i14 = c28655q.m87157i(viewState);
                        if (i26 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zM87157i14;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            final int i21112 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i21112) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i21113 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i21113) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function0.m105274p(c33211q0M2405c7, interfaceC4339a7, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                        c28655q.m87173q(false);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                    } else if (viewState.getContent() != null) {
                        c28655q.m87150e0(-1892200541);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        c28655q.m87150e0(-1892189486);
                        m15061i(function13, c28655q, (i15 >> 9) & 14);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                    function7 = function10;
                    str3 = str4;
                    function8 = function13;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                }
            }
            i15 |= 24576;
            function6 = function3;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4769a(5);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4769a(6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4769a(7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function6;
                }
                AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                Modifier modifierM66722k8 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                C0951d.b bVarM2401e8 = viewState.getContent();
                Modifier modifierM34129b8 = AbstractC12250f.m34129b(modifierM66722k8, bVarM2401e8 != null ? bVarM2401e8.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM34129b8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(-1892211550);
                    C33211q0 c33211q0M2405c8 = viewState.getFullScreenModal().getState();
                    boolean zM87157i15 = c28655q.m87157i(viewState);
                    i26 = i15 & 896;
                    if (i26 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i15 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        final int i21114 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21114) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i21115 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21115) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    boolean zM87157i16 = c28655q.m87157i(viewState);
                    if (i26 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zM87157i16;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        final int i21116 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21116) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i21117 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21117) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function0.m105274p(c33211q0M2405c8, interfaceC4339a8, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                    c28655q.m87173q(false);
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                } else if (viewState.getContent() != null) {
                    c28655q.m87150e0(-1892200541);
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                    AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                    c28655q.m87150e0(-1892189486);
                    m15061i(function13, c28655q, (i15 >> 9) & 14);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                function7 = function10;
                str3 = str4;
                function8 = function13;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function1;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        if (i27 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4769a(5);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                        } else {
                            function10 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4769a(6);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                        } else {
                            function11 = function5;
                        }
                        if (i24 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(7);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function12 = (Function1) objM87133R3;
                        } else {
                            function12 = function6;
                        }
                        AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                        Modifier modifierM66722k9 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                        C0951d.b bVarM2401e9 = viewState.getContent();
                        Modifier modifierM34129b9 = AbstractC12250f.m34129b(modifierM66722k9, bVarM2401e9 != null ? bVarM2401e9.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM34129b9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a9);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                        if (viewState.getFullScreenModal() != null) {
                            c28655q.m87150e0(-1892211550);
                            C33211q0 c33211q0M2405c9 = viewState.getFullScreenModal().getState();
                            boolean zM87157i17 = c28655q.m87157i(viewState);
                            i26 = i15 & 896;
                            if (i26 == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = zM87157i17 | z14;
                            objM87133R = c28655q.m87133R();
                            if (z15) {
                                final int i21118 = 0;
                                objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i21118) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            } else {
                                final int i21119 = 0;
                                objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i21119) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                            boolean zM87157i18 = c28655q.m87157i(viewState);
                            if (i26 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | zM87157i18;
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                final int i211110 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i211110) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                final int i211111 = 1;
                                objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i211111) {
                                            case 0:
                                                return AbstractC4783f.m15068p(viewState, function10);
                                            default:
                                                return AbstractC4783f.m15069q(viewState, function10);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R2);
                            }
                            Function0.m105274p(c33211q0M2405c9, interfaceC4339a9, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                            c28655q.m87173q(false);
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                        } else if (viewState.getContent() != null) {
                            c28655q.m87150e0(-1892200541);
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                            AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            str4 = str2;
                            function13 = function11;
                            function6 = function12;
                            z13 = true;
                            c28655q.m87150e0(-1892189486);
                            m15061i(function13, c28655q, (i15 >> 9) & 14);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z13);
                        function7 = function10;
                        str3 = str4;
                        function8 = function13;
                    } else {
                        c28655q.m87138X();
                        str3 = str2;
                        function7 = function4;
                        function8 = function5;
                    }
                    function9 = function6;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                    }
                }
                i15 |= 24576;
                function6 = function3;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4769a(5);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4769a(6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                    Modifier modifierM66722k10 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                    C0951d.b bVarM2401e10 = viewState.getContent();
                    Modifier modifierM34129b10 = AbstractC12250f.m34129b(modifierM66722k10, bVarM2401e10 != null ? bVarM2401e10.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM34129b10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(-1892211550);
                        C33211q0 c33211q0M2405c10 = viewState.getFullScreenModal().getState();
                        boolean zM87157i19 = c28655q.m87157i(viewState);
                        i26 = i15 & 896;
                        if (i26 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87157i19 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            final int i211112 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211112) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i211113 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211113) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R;
                        boolean zM87157i110 = c28655q.m87157i(viewState);
                        if (i26 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zM87157i110;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            final int i211114 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211114) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i211115 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211115) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function0.m105274p(c33211q0M2405c10, interfaceC4339a10, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                        c28655q.m87173q(false);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                    } else if (viewState.getContent() != null) {
                        c28655q.m87150e0(-1892200541);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        c28655q.m87150e0(-1892189486);
                        m15061i(function13, c28655q, (i15 >> 9) & 14);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                    function7 = function10;
                    str3 = str4;
                    function8 = function13;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                }
            }
            i15 |= 3072;
            function5 = function2;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4769a(5);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4769a(6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                    Modifier modifierM66722k11 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                    C0951d.b bVarM2401e11 = viewState.getContent();
                    Modifier modifierM34129b11 = AbstractC12250f.m34129b(modifierM66722k11, bVarM2401e11 != null ? bVarM2401e11.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM34129b11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(-1892211550);
                        C33211q0 c33211q0M2405c11 = viewState.getFullScreenModal().getState();
                        boolean zM87157i111 = c28655q.m87157i(viewState);
                        i26 = i15 & 896;
                        if (i26 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87157i111 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            final int i211116 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211116) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i211117 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211117) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R;
                        boolean zM87157i112 = c28655q.m87157i(viewState);
                        if (i26 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zM87157i112;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            final int i211118 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211118) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i211119 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i211119) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function0.m105274p(c33211q0M2405c11, interfaceC4339a11, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                        c28655q.m87173q(false);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                    } else if (viewState.getContent() != null) {
                        c28655q.m87150e0(-1892200541);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        c28655q.m87150e0(-1892189486);
                        m15061i(function13, c28655q, (i15 >> 9) & 14);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                    function7 = function10;
                    str3 = str4;
                    function8 = function13;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                }
            }
            i15 |= 24576;
            function6 = function3;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4769a(5);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4769a(6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4769a(7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function6;
                }
                AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                Modifier modifierM66722k12 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                C0951d.b bVarM2401e12 = viewState.getContent();
                Modifier modifierM34129b12 = AbstractC12250f.m34129b(modifierM66722k12, bVarM2401e12 != null ? bVarM2401e12.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM34129b12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(-1892211550);
                    C33211q0 c33211q0M2405c12 = viewState.getFullScreenModal().getState();
                    boolean zM87157i113 = c28655q.m87157i(viewState);
                    i26 = i15 & 896;
                    if (i26 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i113 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        final int i2111110 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111110) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i2111111 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111111) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R;
                    boolean zM87157i114 = c28655q.m87157i(viewState);
                    if (i26 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zM87157i114;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        final int i2111112 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111112) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i2111113 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111113) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function0.m105274p(c33211q0M2405c12, interfaceC4339a12, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                    c28655q.m87173q(false);
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                } else if (viewState.getContent() != null) {
                    c28655q.m87150e0(-1892200541);
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                    AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                    c28655q.m87150e0(-1892189486);
                    m15061i(function13, c28655q, (i15 >> 9) & 14);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                function7 = function10;
                str3 = str4;
                function8 = function13;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
            }
        }
        i15 |= 384;
        function4 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i27 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4769a(5);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                    } else {
                        function10 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4769a(6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                    } else {
                        function11 = function5;
                    }
                    if (i24 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function6;
                    }
                    AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                    Modifier modifierM66722k13 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                    C0951d.b bVarM2401e13 = viewState.getContent();
                    Modifier modifierM34129b13 = AbstractC12250f.m34129b(modifierM66722k13, bVarM2401e13 != null ? bVarM2401e13.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM34129b13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(-1892211550);
                        C33211q0 c33211q0M2405c13 = viewState.getFullScreenModal().getState();
                        boolean zM87157i115 = c28655q.m87157i(viewState);
                        i26 = i15 & 896;
                        if (i26 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87157i115 | z14;
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            final int i2111114 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2111114) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        } else {
                            final int i2111115 = 0;
                            objM87133R = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2111115) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R;
                        boolean zM87157i116 = c28655q.m87157i(viewState);
                        if (i26 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | zM87157i116;
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            final int i2111116 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2111116) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            final int i2111117 = 1;
                            objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    switch (i2111117) {
                                        case 0:
                                            return AbstractC4783f.m15068p(viewState, function10);
                                        default:
                                            return AbstractC4783f.m15069q(viewState, function10);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function0.m105274p(c33211q0M2405c13, interfaceC4339a13, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                        c28655q.m87173q(false);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                    } else if (viewState.getContent() != null) {
                        c28655q.m87150e0(-1892200541);
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        str4 = str2;
                        function13 = function11;
                        function6 = function12;
                        z13 = true;
                        c28655q.m87150e0(-1892189486);
                        m15061i(function13, c28655q, (i15 >> 9) & 14);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                    function7 = function10;
                    str3 = str4;
                    function8 = function13;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    function7 = function4;
                    function8 = function5;
                }
                function9 = function6;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
                }
            }
            i15 |= 24576;
            function6 = function3;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4769a(5);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4769a(6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4769a(7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function6;
                }
                AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                Modifier modifierM66722k14 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                C0951d.b bVarM2401e14 = viewState.getContent();
                Modifier modifierM34129b14 = AbstractC12250f.m34129b(modifierM66722k14, bVarM2401e14 != null ? bVarM2401e14.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM34129b14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(-1892211550);
                    C33211q0 c33211q0M2405c14 = viewState.getFullScreenModal().getState();
                    boolean zM87157i117 = c28655q.m87157i(viewState);
                    i26 = i15 & 896;
                    if (i26 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i117 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        final int i2111118 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111118) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i2111119 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i2111119) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R;
                    boolean zM87157i118 = c28655q.m87157i(viewState);
                    if (i26 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zM87157i118;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        final int i21111110 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21111110) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i21111111 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21111111) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function0.m105274p(c33211q0M2405c14, interfaceC4339a14, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                    c28655q.m87173q(false);
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                } else if (viewState.getContent() != null) {
                    c28655q.m87150e0(-1892200541);
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                    AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                    c28655q.m87150e0(-1892189486);
                    m15061i(function13, c28655q, (i15 >> 9) & 14);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                function7 = function10;
                str3 = str4;
                function8 = function13;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
            }
        }
        i15 |= 3072;
        function5 = function2;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i27 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4769a(5);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                } else {
                    function10 = function4;
                }
                if (i18 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4769a(6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                } else {
                    function11 = function5;
                }
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4769a(7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function6;
                }
                AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
                Modifier modifierM66722k15 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
                C0951d.b bVarM2401e15 = viewState.getContent();
                Modifier modifierM34129b15 = AbstractC12250f.m34129b(modifierM66722k15, bVarM2401e15 != null ? bVarM2401e15.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM34129b15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a15);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(-1892211550);
                    C33211q0 c33211q0M2405c15 = viewState.getFullScreenModal().getState();
                    boolean zM87157i119 = c28655q.m87157i(viewState);
                    i26 = i15 & 896;
                    if (i26 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i119 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        final int i21111112 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21111112) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        final int i21111113 = 0;
                        objM87133R = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21111113) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R;
                    boolean zM87157i1110 = c28655q.m87157i(viewState);
                    if (i26 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zM87157i1110;
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        final int i21111114 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21111114) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        final int i21111115 = 1;
                        objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i21111115) {
                                    case 0:
                                        return AbstractC4783f.m15068p(viewState, function10);
                                    default:
                                        return AbstractC4783f.m15069q(viewState, function10);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function0.m105274p(c33211q0M2405c15, interfaceC4339a15, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                    c28655q.m87173q(false);
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                } else if (viewState.getContent() != null) {
                    c28655q.m87150e0(-1892200541);
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                    AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    str4 = str2;
                    function13 = function11;
                    function6 = function12;
                    z13 = true;
                    c28655q.m87150e0(-1892189486);
                    m15061i(function13, c28655q, (i15 >> 9) & 14);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                function7 = function10;
                str3 = str4;
                function8 = function13;
            } else {
                c28655q.m87138X();
                str3 = str2;
                function7 = function4;
                function8 = function5;
            }
            function9 = function6;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
            }
        }
        i15 |= 24576;
        function6 = function3;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i27 != 0) {
                str2 = null;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C4769a(5);
                    c28655q.m87172p0(objM87133R5);
                }
                function10 = (Function1) objM87133R5;
            } else {
                function10 = function4;
            }
            if (i18 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C4769a(6);
                    c28655q.m87172p0(objM87133R4);
                }
                function11 = (Function1) objM87133R4;
            } else {
                function11 = function5;
            }
            if (i24 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C4769a(7);
                    c28655q.m87172p0(objM87133R3);
                }
                function12 = (Function1) objM87133R3;
            } else {
                function12 = function6;
            }
            AbstractC14874j.m42904c(viewState, "healthcare_health_monitor", c28655q, (i15 & 14) | 48);
            Modifier modifierM66722k16 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
            C0951d.b bVarM2401e16 = viewState.getContent();
            Modifier modifierM34129b16 = AbstractC12250f.m34129b(modifierM66722k16, bVarM2401e16 != null ? bVarM2401e16.getScreenContextMetadata() : null, false, c28655q, C13404j.f46947x << 3, 2);
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM34129b16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(-1892211550);
                C33211q0 c33211q0M2405c16 = viewState.getFullScreenModal().getState();
                boolean zM87157i1111 = c28655q.m87157i(viewState);
                i26 = i15 & 896;
                if (i26 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i1111 | z14;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    final int i21111116 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: ck1.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21111116) {
                                case 0:
                                    return AbstractC4783f.m15068p(viewState, function10);
                                default:
                                    return AbstractC4783f.m15069q(viewState, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i21111117 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: ck1.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21111117) {
                                case 0:
                                    return AbstractC4783f.m15068p(viewState, function10);
                                default:
                                    return AbstractC4783f.m15069q(viewState, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R;
                boolean zM87157i1112 = c28655q.m87157i(viewState);
                if (i26 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zM87157i1112;
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    final int i21111118 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21111118) {
                                case 0:
                                    return AbstractC4783f.m15068p(viewState, function10);
                                default:
                                    return AbstractC4783f.m15069q(viewState, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i21111119 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: ck1.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i21111119) {
                                case 0:
                                    return AbstractC4783f.m15068p(viewState, function10);
                                default:
                                    return AbstractC4783f.m15069q(viewState, function10);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                Function0.m105274p(c33211q0M2405c16, interfaceC4339a16, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
                c28655q.m87173q(false);
                str4 = str2;
                function13 = function11;
                function6 = function12;
                z13 = true;
            } else if (viewState.getContent() != null) {
                c28655q.m87150e0(-1892200541);
                str4 = str2;
                function13 = function11;
                function6 = function12;
                z13 = true;
                AbstractC4786i.m15098r(viewState.getContent(), viewState.getAnalytics(), str4, function10, function13, function6, c28655q, (i15 << 3) & 524160, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                str4 = str2;
                function13 = function11;
                function6 = function12;
                z13 = true;
                c28655q.m87150e0(-1892189486);
                m15061i(function13, c28655q, (i15 >> 9) & 14);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            function7 = function10;
            str3 = str4;
            function8 = function13;
        } else {
            c28655q.m87138X();
            str3 = str2;
            function7 = function4;
            function8 = function5;
        }
        function9 = function6;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f((InterfaceC14875k) viewState, str3, function7, function8, function9, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m15065m(AbstractC0949b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m15066n(AbstractC40770a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m15067o(AbstractC36068a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m15068p(C0951d c0951d, Function1 function1) {
        AbstractC0949b abstractC0949bM2403a = c0951d.getFullScreenModal().getPrimaryClickEvent();
        if (abstractC0949bM2403a != null) {
            function1.invoke(abstractC0949bM2403a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m15069q(C0951d c0951d, Function1 function1) {
        AbstractC0949b abstractC0949bM2404b = c0951d.getFullScreenModal().getSecondaryClickEvent();
        if (abstractC0949bM2404b != null) {
            function1.invoke(abstractC0949bM2404b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m15070r(C0951d c0951d, String str, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m15064l(c0951d, str, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
