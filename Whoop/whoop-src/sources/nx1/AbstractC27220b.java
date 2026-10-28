package nx1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2108h;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.management.navigation.AbstractC9127b;
import dn0.C12211k;
import io.sentry.config.AbstractC20301a;
import jx1.AbstractC22012e;
import l83.C23454a0;
import lx1.C24795f;
import lx1.InterfaceC24790a;
import mi2.C25592o;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27198e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pv1.AbstractC29579b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: nx1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ljx1/e;", "viewState", "", "isIndependentCheckout", "Lkotlin/Function1;", "Llx1/e;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/membership/management/navigation/b;", "onNavEvent", "f", "(Ljx1/e;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27220b {
    /* JADX WARN: Code duplicated, block: B:101:0x0237  */
    /* JADX WARN: Code duplicated, block: B:102:0x0239  */
    /* JADX WARN: Code duplicated, block: B:105:0x0245  */
    /* JADX WARN: Code duplicated, block: B:106:0x0247  */
    /* JADX WARN: Code duplicated, block: B:110:0x0253  */
    /* JADX WARN: Code duplicated, block: B:113:0x029d  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0156  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:75:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x0171  */
    /* JADX WARN: Code duplicated, block: B:83:0x0186  */
    /* JADX WARN: Code duplicated, block: B:84:0x0188  */
    /* JADX WARN: Code duplicated, block: B:88:0x0196  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01de  */
    /* JADX WARN: Code duplicated, block: B:93:0x0212  */
    /* JADX WARN: Code duplicated, block: B:95:0x021b  */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
    /* JADX WARN: Code duplicated, block: B:98:0x022f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public static final void m81956f(AbstractC22012e viewState, boolean z4, Function1 function1, Function1 onNavEvent, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        C28677v1 c28677v1M87180u;
        Object objM87133R;
        C28676v0 c28676v0;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC9127b abstractC9127b;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R2;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        int i16;
        boolean z29;
        boolean zM87153g;
        Object objM87133R3;
        boolean z34;
        boolean zM87153g2;
        Object objM87133R4;
        int i17;
        int i18;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1062974645);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i15 |= i18;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onNavEvent)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i19 != 0) {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C27219a(0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 48, 1);
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (z13) {
                    abstractC9127b = AbstractC9127b.b.f27303a;
                } else {
                    abstractC9127b = AbstractC9127b.c.f27304a;
                }
                if (viewState instanceof AbstractC22012e.a) {
                    c28655q.m87150e0(1332964388);
                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC29579b.f120727e), false, null, 6, null);
                    TextResource textResourceM21267a = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120734l);
                    TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120723a);
                    if (((AbstractC22012e.a) viewState).getPath().length() > 0) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if ((i15 & 14) == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    boolean z35 = z27 | z28;
                    i16 = i15 & 7168;
                    if (i16 == 2048) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    zM87153g = z29 | z35 | c28655q.m87153g(abstractC9127b);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g || objM87133R3 == c28676v0) {
                        AbstractC9127b abstractC9127b2 = abstractC9127b;
                        C27198e c27198e = new C27198e((Object) viewState, onNavEvent, (Object) abstractC9127b2, function1, 2);
                        abstractC9127b = abstractC9127b2;
                        onViewEvent = function1;
                        c28655q.m87172p0(c27198e);
                        objM87133R3 = c27198e;
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                    if (i16 == 2048) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    zM87153g2 = z34 | c28655q.m87153g(abstractC9127b);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C25592o(12, onNavEvent, abstractC9127b);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i24 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                    int i25 = TextResource.C8688b.f25889c;
                    int i26 = i24 | (i25 << 9) | (i25 << 21);
                    z25 = z13;
                    z15 = true;
                    AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688bM21277k, interfaceC4339a, z26, false, c8688bM21277k2, (InterfaceC4339a) objM87133R4, null, false, true, c28655q, i26, 48, 1604);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    z15 = true;
                    if (viewState.equals(AbstractC22012e.b.f85352a)) {
                        c28655q.m87150e0(1334090711);
                        z25 = z13;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 48, 2044);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        z16 = z13;
                        if (viewState.equals(AbstractC22012e.c.f85353a)) {
                            throw AbstractC11895b.m32003v(-1203928674, c28655q, false);
                        }
                        c28655q.m87150e0(1334371416);
                        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC29579b.f120737o);
                        if ((i15 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i15 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zM87153g3 = z18 | z17 | c28655q.m87153g(abstractC9127b);
                        if ((i15 & 896) == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z24 = zM87153g3 | z19;
                        objM87133R2 = c28655q.m87133R();
                        if (z24 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C12211k(z16, onNavEvent, abstractC9127b, onViewEvent);
                            c28655q.m87172p0(objM87133R2);
                        }
                        z25 = z16;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k3, 0L, (InterfaceC4339a) objM87133R2, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 48, 2044);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z15);
                z13 = z25;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(viewState, z13, onViewEvent, onNavEvent, i13, i14, 22);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onNavEvent)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i15 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i19 != 0) {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C27219a(0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 48, 1);
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (z13) {
                abstractC9127b = AbstractC9127b.b.f27303a;
            } else {
                abstractC9127b = AbstractC9127b.c.f27304a;
            }
            if (viewState instanceof AbstractC22012e.a) {
                c28655q.m87150e0(1332964388);
                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC29579b.f120727e), false, null, 6, null);
                TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC29579b.f120734l);
                TextResource.C8688b c8688bM21277k5 = AbstractC8693b.m21277k(AbstractC29579b.f120723a);
                if (((AbstractC22012e.a) viewState).getPath().length() > 0) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if ((i15 & 14) == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if ((i15 & 896) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                boolean z36 = z27 | z28;
                i16 = i15 & 7168;
                if (i16 == 2048) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                zM87153g = z29 | z36 | c28655q.m87153g(abstractC9127b);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    AbstractC9127b abstractC9127b3 = abstractC9127b;
                    C27198e c27198e2 = new C27198e((Object) viewState, onNavEvent, (Object) abstractC9127b3, function1, 2);
                    abstractC9127b = abstractC9127b3;
                    onViewEvent = function1;
                    c28655q.m87172p0(c27198e2);
                    objM87133R3 = c27198e2;
                } else {
                    AbstractC9127b abstractC9127b4 = abstractC9127b;
                    C27198e c27198e3 = new C27198e((Object) viewState, onNavEvent, (Object) abstractC9127b4, function1, 2);
                    abstractC9127b = abstractC9127b4;
                    onViewEvent = function1;
                    c28655q.m87172p0(c27198e3);
                    objM87133R3 = c27198e3;
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                if (i16 == 2048) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                zM87153g2 = z34 | c28655q.m87153g(abstractC9127b);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R4 = new C25592o(12, onNavEvent, abstractC9127b);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C25592o(12, onNavEvent, abstractC9127b);
                    c28655q.m87172p0(objM87133R4);
                }
                int i27 = AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
                int i28 = TextResource.C8688b.f25889c;
                int i29 = i27 | (i28 << 9) | (i28 << 21);
                z25 = z13;
                z15 = true;
                AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688bM21277k4, interfaceC4339a2, z26, false, c8688bM21277k5, (InterfaceC4339a) objM87133R4, null, false, true, c28655q, i29, 48, 1604);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                z15 = true;
                if (viewState.equals(AbstractC22012e.b.f85352a)) {
                    c28655q.m87150e0(1334090711);
                    z25 = z13;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 48, 2044);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    z16 = z13;
                    if (viewState.equals(AbstractC22012e.c.f85353a)) {
                        throw AbstractC11895b.m32003v(-1203928674, c28655q, false);
                    }
                    c28655q.m87150e0(1334371416);
                    TextResource.C8688b c8688bM21277k6 = AbstractC8693b.m21277k(AbstractC29579b.f120737o);
                    if ((i15 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i15 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zM87153g4 = z18 | z17 | c28655q.m87153g(abstractC9127b);
                    if ((i15 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = zM87153g4 | z19;
                    objM87133R2 = c28655q.m87133R();
                    if (z24) {
                        objM87133R2 = new C12211k(z16, onNavEvent, abstractC9127b, onViewEvent);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12211k(z16, onNavEvent, abstractC9127b, onViewEvent);
                        c28655q.m87172p0(objM87133R2);
                    }
                    z25 = z16;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(c8688bM21277k6, 0L, (InterfaceC4339a) objM87133R2, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, true, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 48, 2044);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(z15);
            z13 = z25;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(viewState, z13, onViewEvent, onNavEvent, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m81957g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m81958h(AbstractC22012e abstractC22012e, Function1 function1, AbstractC9127b abstractC9127b, Function1 function2) {
        AbstractC22012e.a aVar = (AbstractC22012e.a) abstractC22012e;
        if (aVar.m62912c() != null) {
            function2.invoke(new InterfaceC24790a.a(aVar.getPath(), aVar.m62912c(), aVar.getCard()));
        } else {
            function1.invoke(abstractC9127b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m81959i(Function1 function1, AbstractC9127b abstractC9127b) {
        function1.invoke(abstractC9127b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m81960j(boolean z4, Function1 function1, AbstractC9127b abstractC9127b, Function1 function2) {
        if (z4) {
            function1.invoke(abstractC9127b);
        } else {
            function1.invoke(AbstractC9127b.e.f27307a);
            function2.invoke(C24795f.f97043a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m81961k(AbstractC22012e abstractC22012e, boolean z4, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m81956f(abstractC22012e, z4, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
