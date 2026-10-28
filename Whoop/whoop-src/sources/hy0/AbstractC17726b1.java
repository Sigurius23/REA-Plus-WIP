package hy0;

import a01.C0086f;
import android.content.res.Configuration;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e41.EnumC12706k;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import hb1.C17089l;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j93.AbstractC21478l0;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p163g1.C14972c3;
import p163g1.C15093n7;
import p163g1.C15184w8;
import p163g1.InterfaceC15022g9;
import p180h0.EnumC16377d2;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p636y3.C39178j;
import p636y3.InterfaceC39171c;
import p698au1.C2059d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: hy0.b1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "deleteBackgroundModifier", "Le41/k;", "swipeState", "Lkotlin/Function0;", "Ll83/a0;", "onDeleteClicked", "content", "j", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Le41/k;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "g", "(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17726b1 {
    /* JADX INFO: renamed from: g */
    private static final void m50789g(Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-144380995);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier3 = i16 != 0 ? c2314t : modifier2;
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C17804y0(interfaceC4339a, 1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierMo3471e = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15).mo3471e(modifier3);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.b.f109138f, C38072d.f163053a.m121951d().getAction().getDelete(), EnumC39333f.BRAND_WHITE, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62322f), null, null, interfaceC4339a, c28655q, (i15 << 9) & 57344, 12);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2059d(modifier2, interfaceC4339a, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m50790h(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m50791i(Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m50789g(modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:106:0x0206  */
    /* JADX WARN: Code duplicated, block: B:110:0x0222 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0224  */
    /* JADX WARN: Code duplicated, block: B:114:0x0253  */
    /* JADX WARN: Code duplicated, block: B:115:0x0257  */
    /* JADX WARN: Code duplicated, block: B:118:0x0264  */
    /* JADX WARN: Code duplicated, block: B:120:0x0272  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02af  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x017a  */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dc  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public static final void m50792j(Modifier modifier, Modifier modifier2, EnumC12706k enumC12706k, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        Modifier modifier3;
        int i15;
        Modifier modifier4;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        InterfaceC4351m interfaceC4351mM50763d;
        int i17;
        boolean z4;
        Modifier modifier5;
        Modifier modifier6;
        EnumC12706k enumC12706k2;
        InterfaceC4339a interfaceC4339a3;
        InterfaceC4351m interfaceC4351m2;
        C28677v1 c28677v1M87180u;
        int i18;
        C2314t c2314t;
        C28676v0 c28676v0;
        Modifier modifierM3358c;
        EnumC12706k enumC12706k3;
        Object objM87133R;
        C15093n7 c15093n7M60417W;
        float fMo743q0;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC4339a interfaceC4339a4;
        boolean zM87153g;
        Object objM87133R3;
        int iHashCode2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(719440390);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier3 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier3 = modifier;
            i15 = (c28655q.m87153g(modifier3) ? 4 : 2) | i13;
        } else {
            modifier3 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                modifier4 = modifier2;
                int i24 = c28655q.m87153g(modifier4) ? 32 : 16;
                i15 |= i24;
            } else {
                modifier4 = modifier2;
            }
            i15 |= i24;
        } else {
            modifier4 = modifier2;
        }
        int i25 = i14 & 4;
        if (i25 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC12706k == null ? -1 : enumC12706k.ordinal()) ? 256 : 128;
        }
        int i26 = i14 & 8;
        if (i26 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4351mM50763d = interfaceC4351m;
                    if (c28655q.m87157i(interfaceC4351mM50763d)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i18 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0 || c28655q.m87118C()) {
                        if (i19 != 0) {
                            modifier3 = c2314t;
                        }
                        if ((i14 & 2) != 0) {
                            modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBrandPrimary(), AbstractC17918w0.f69621a);
                            i15 &= -113;
                        } else {
                            modifierM3358c = modifier4;
                        }
                        if (i25 != 0) {
                            enumC12706k3 = EnumC12706k.NOT_EXPANDED;
                        } else {
                            enumC12706k3 = enumC12706k;
                        }
                        if (i26 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C17089l(24);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                        }
                        if (i16 != 0) {
                            interfaceC4351mM50763d = C17724b.f68906a.m50763d();
                        }
                        modifier3 = modifier3;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                        }
                        enumC12706k3 = enumC12706k;
                        modifierM3358c = modifier4;
                    }
                    c28655q.m87175r();
                    float f13 = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
                    C28674u2 c28674u2 = AbstractC2453v1.f9569h;
                    Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k(Float.valueOf(0.0f), EnumC12706k.NOT_EXPANDED), new C23465k(Float.valueOf(((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f13) * (-0.3f)), EnumC12706k.EXPANDED));
                    int i27 = i15 >> 6;
                    c15093n7M60417W = AbstractC21478l0.m60417W(enumC12706k3, c28655q, i27 & 14);
                    InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                    fMo743q0 = (-((Number) c15093n7M60417W.f56512e.getValue()).floatValue()) - interfaceC39171c.mo743q0(2 * 8);
                    if (fMo743q0 < 0.0f) {
                        fMo743q0 = 0.0f;
                    }
                    float fMo733e0 = interfaceC39171c.mo733e0(AbstractC12889b.m36258X(fMo743q0));
                    EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C15184w8(22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierMo3471e = AbstractC21478l0.m60426c0(c2314t, c15093n7M60417W, mapM73990Y, false, false, (InterfaceC4351m) objM87133R2, null, 440).mo3471e(modifier3);
                    C2307m c2307m = C2299e.f9114w;
                    EnumC12706k enumC12706k4 = enumC12706k3;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    Modifier modifier7 = modifier3;
                    int i28 = i15;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        interfaceC4339a4 = interfaceC4339a2;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        C2307m c2307m2 = C2299e.f9117z;
                        C1100b c1100b = C1100b.f4583a;
                        Modifier modifierMo3400a = c1100b.mo3400a(c2314t, c2307m2);
                        zM87153g = c28655q.m87153g(c15093n7M60417W);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g || objM87133R3 == c28676v0) {
                            objM87133R3 = new C17764l(c15093n7M60417W, 1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3390l(modifierMo3400a, (Function1) objM87133R3));
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        AbstractC11895b.m32007z((i28 >> 12) & 14, interfaceC4351mM50763d, c28655q, true);
                        interfaceC4339a2 = interfaceC4339a4;
                        m50789g(AbstractC1102d.m3424u(fMo733e0, AbstractC1102d.m3406c(1.0f, c1100b.mo3400a(modifierM3358c, C2299e.f9103F))), interfaceC4339a2, c28655q, i27 & 112, 0);
                        c28655q.m87173q(true);
                        modifier6 = modifierM3358c;
                        enumC12706k2 = enumC12706k4;
                        modifier5 = modifier7;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    C2307m c2307m3 = C2299e.f9117z;
                    C1100b c1100b2 = C1100b.f4583a;
                    Modifier modifierMo3400a2 = c1100b2.mo3400a(c2314t, c2307m3);
                    zM87153g = c28655q.m87153g(c15093n7M60417W);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C17764l(c15093n7M60417W, 1);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C17764l(c15093n7M60417W, 1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3390l(modifierMo3400a2, (Function1) objM87133R3));
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    AbstractC11895b.m32007z((i28 >> 12) & 14, interfaceC4351mM50763d, c28655q, true);
                    interfaceC4339a2 = interfaceC4339a4;
                    m50789g(AbstractC1102d.m3424u(fMo733e0, AbstractC1102d.m3406c(1.0f, c1100b2.mo3400a(modifierM3358c, C2299e.f9103F))), interfaceC4339a2, c28655q, i27 & 112, 0);
                    c28655q.m87173q(true);
                    modifier6 = modifierM3358c;
                    enumC12706k2 = enumC12706k4;
                    modifier5 = modifier7;
                } else {
                    c28655q.m87138X();
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    enumC12706k2 = enumC12706k;
                }
                interfaceC4339a3 = interfaceC4339a2;
                interfaceC4351m2 = interfaceC4351mM50763d;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f(modifier5, modifier6, enumC12706k2, interfaceC4339a3, interfaceC4351m2, i13, i14, 26);
                }
            }
            i15 |= 24576;
            interfaceC4351mM50763d = interfaceC4351m;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i18 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i19 != 0) {
                        modifier3 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBrandPrimary(), AbstractC17918w0.f69621a);
                        i15 &= -113;
                    } else {
                        modifierM3358c = modifier4;
                    }
                    if (i25 != 0) {
                        enumC12706k3 = EnumC12706k.NOT_EXPANDED;
                    } else {
                        enumC12706k3 = enumC12706k;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C17089l(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    }
                    if (i16 != 0) {
                        interfaceC4351mM50763d = C17724b.f68906a.m50763d();
                    }
                    modifier3 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBrandPrimary(), AbstractC17918w0.f69621a);
                        i15 &= -113;
                    } else {
                        modifierM3358c = modifier4;
                    }
                    if (i25 != 0) {
                        enumC12706k3 = EnumC12706k.NOT_EXPANDED;
                    } else {
                        enumC12706k3 = enumC12706k;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C17089l(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    }
                    if (i16 != 0) {
                        interfaceC4351mM50763d = C17724b.f68906a.m50763d();
                    }
                    modifier3 = modifier3;
                }
                c28655q.m87175r();
                float f14 = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
                C28674u2 c28674u3 = AbstractC2453v1.f9569h;
                Map mapM73990Y2 = AbstractC25247g0.m73990Y(new C23465k(Float.valueOf(0.0f), EnumC12706k.NOT_EXPANDED), new C23465k(Float.valueOf(((InterfaceC39171c) c28655q.m87161k(c28674u3)).mo743q0(f14) * (-0.3f)), EnumC12706k.EXPANDED));
                int i29 = i15 >> 6;
                c15093n7M60417W = AbstractC21478l0.m60417W(enumC12706k3, c28655q, i29 & 14);
                InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(c28674u3);
                fMo743q0 = (-((Number) c15093n7M60417W.f56512e.getValue()).floatValue()) - interfaceC39171c2.mo743q0(2 * 8);
                if (fMo743q0 < 0.0f) {
                    fMo743q0 = 0.0f;
                }
                float fMo733e1 = interfaceC39171c2.mo733e0(AbstractC12889b.m36258X(fMo743q0));
                EnumC16377d2 enumC16377d3 = EnumC16377d2.f62971w;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C15184w8(22);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierMo3471e2 = AbstractC21478l0.m60426c0(c2314t, c15093n7M60417W, mapM73990Y2, false, false, (InterfaceC4351m) objM87133R2, null, 440).mo3471e(modifier3);
                C2307m c2307m4 = C2299e.f9114w;
                EnumC12706k enumC12706k5 = enumC12706k3;
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m4, false);
                Modifier modifier8 = modifier3;
                int i210 = i15;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d4);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    C2307m c2307m5 = C2299e.f9117z;
                    C1100b c1100b3 = C1100b.f4583a;
                    Modifier modifierMo3400a3 = c1100b3.mo3400a(c2314t, c2307m5);
                    zM87153g = c28655q.m87153g(c15093n7M60417W);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C17764l(c15093n7M60417W, 1);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C17764l(c15093n7M60417W, 1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3390l(modifierMo3400a3, (Function1) objM87133R3));
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m4, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    AbstractC11895b.m32007z((i210 >> 12) & 14, interfaceC4351mM50763d, c28655q, true);
                    interfaceC4339a2 = interfaceC4339a4;
                    m50789g(AbstractC1102d.m3424u(fMo733e1, AbstractC1102d.m3406c(1.0f, c1100b3.mo3400a(modifierM3358c, C2299e.f9103F))), interfaceC4339a2, c28655q, i29 & 112, 0);
                    c28655q.m87173q(true);
                    modifier6 = modifierM3358c;
                    enumC12706k2 = enumC12706k5;
                    modifier5 = modifier8;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                C2307m c2307m6 = C2299e.f9117z;
                C1100b c1100b4 = C1100b.f4583a;
                Modifier modifierMo3400a4 = c1100b4.mo3400a(c2314t, c2307m6);
                zM87153g = c28655q.m87153g(c15093n7M60417W);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C17764l(c15093n7M60417W, 1);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C17764l(c15093n7M60417W, 1);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3390l(modifierMo3400a4, (Function1) objM87133R3));
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m4, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                AbstractC11895b.m32007z((i210 >> 12) & 14, interfaceC4351mM50763d, c28655q, true);
                interfaceC4339a2 = interfaceC4339a4;
                m50789g(AbstractC1102d.m3424u(fMo733e1, AbstractC1102d.m3406c(1.0f, c1100b4.mo3400a(modifierM3358c, C2299e.f9103F))), interfaceC4339a2, c28655q, i29 & 112, 0);
                c28655q.m87173q(true);
                modifier6 = modifierM3358c;
                enumC12706k2 = enumC12706k5;
                modifier5 = modifier8;
            } else {
                c28655q.m87138X();
                modifier5 = modifier3;
                modifier6 = modifier4;
                enumC12706k2 = enumC12706k;
            }
            interfaceC4339a3 = interfaceC4339a2;
            interfaceC4351m2 = interfaceC4351mM50763d;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(modifier5, modifier6, enumC12706k2, interfaceC4339a3, interfaceC4351m2, i13, i14, 26);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4351mM50763d = interfaceC4351m;
                if (c28655q.m87157i(interfaceC4351mM50763d)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i18 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i19 != 0) {
                        modifier3 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBrandPrimary(), AbstractC17918w0.f69621a);
                        i15 &= -113;
                    } else {
                        modifierM3358c = modifier4;
                    }
                    if (i25 != 0) {
                        enumC12706k3 = EnumC12706k.NOT_EXPANDED;
                    } else {
                        enumC12706k3 = enumC12706k;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C17089l(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    }
                    if (i16 != 0) {
                        interfaceC4351mM50763d = C17724b.f68906a.m50763d();
                    }
                    modifier3 = modifier3;
                } else {
                    if (i19 != 0) {
                        modifier3 = c2314t;
                    }
                    if ((i14 & 2) != 0) {
                        modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBrandPrimary(), AbstractC17918w0.f69621a);
                        i15 &= -113;
                    } else {
                        modifierM3358c = modifier4;
                    }
                    if (i25 != 0) {
                        enumC12706k3 = EnumC12706k.NOT_EXPANDED;
                    } else {
                        enumC12706k3 = enumC12706k;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C17089l(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    }
                    if (i16 != 0) {
                        interfaceC4351mM50763d = C17724b.f68906a.m50763d();
                    }
                    modifier3 = modifier3;
                }
                c28655q.m87175r();
                float f15 = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
                C28674u2 c28674u4 = AbstractC2453v1.f9569h;
                Map mapM73990Y3 = AbstractC25247g0.m73990Y(new C23465k(Float.valueOf(0.0f), EnumC12706k.NOT_EXPANDED), new C23465k(Float.valueOf(((InterfaceC39171c) c28655q.m87161k(c28674u4)).mo743q0(f15) * (-0.3f)), EnumC12706k.EXPANDED));
                int i211 = i15 >> 6;
                c15093n7M60417W = AbstractC21478l0.m60417W(enumC12706k3, c28655q, i211 & 14);
                InterfaceC39171c interfaceC39171c3 = (InterfaceC39171c) c28655q.m87161k(c28674u4);
                fMo743q0 = (-((Number) c15093n7M60417W.f56512e.getValue()).floatValue()) - interfaceC39171c3.mo743q0(2 * 8);
                if (fMo743q0 < 0.0f) {
                    fMo743q0 = 0.0f;
                }
                float fMo733e2 = interfaceC39171c3.mo733e0(AbstractC12889b.m36258X(fMo743q0));
                EnumC16377d2 enumC16377d4 = EnumC16377d2.f62971w;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C15184w8(22);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierMo3471e3 = AbstractC21478l0.m60426c0(c2314t, c15093n7M60417W, mapM73990Y3, false, false, (InterfaceC4351m) objM87133R2, null, 440).mo3471e(modifier3);
                C2307m c2307m7 = C2299e.f9114w;
                EnumC12706k enumC12706k6 = enumC12706k3;
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m7, false);
                Modifier modifier9 = modifier3;
                int i212 = i15;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d7);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    C2307m c2307m8 = C2299e.f9117z;
                    C1100b c1100b5 = C1100b.f4583a;
                    Modifier modifierMo3400a5 = c1100b5.mo3400a(c2314t, c2307m8);
                    zM87153g = c28655q.m87153g(c15093n7M60417W);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C17764l(c15093n7M60417W, 1);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C17764l(c15093n7M60417W, 1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3390l(modifierMo3400a5, (Function1) objM87133R3));
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m7, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d5);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                    AbstractC11895b.m32007z((i212 >> 12) & 14, interfaceC4351mM50763d, c28655q, true);
                    interfaceC4339a2 = interfaceC4339a4;
                    m50789g(AbstractC1102d.m3424u(fMo733e2, AbstractC1102d.m3406c(1.0f, c1100b5.mo3400a(modifierM3358c, C2299e.f9103F))), interfaceC4339a2, c28655q, i211 & 112, 0);
                    c28655q.m87173q(true);
                    modifier6 = modifierM3358c;
                    enumC12706k2 = enumC12706k6;
                    modifier5 = modifier9;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                C2307m c2307m9 = C2299e.f9117z;
                C1100b c1100b6 = C1100b.f4583a;
                Modifier modifierMo3400a6 = c1100b6.mo3400a(c2314t, c2307m9);
                zM87153g = c28655q.m87153g(c15093n7M60417W);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C17764l(c15093n7M60417W, 1);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C17764l(c15093n7M60417W, 1);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3390l(modifierMo3400a6, (Function1) objM87133R3));
                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m7, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3407d6);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d9);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                AbstractC11895b.m32007z((i212 >> 12) & 14, interfaceC4351mM50763d, c28655q, true);
                interfaceC4339a2 = interfaceC4339a4;
                m50789g(AbstractC1102d.m3424u(fMo733e2, AbstractC1102d.m3406c(1.0f, c1100b6.mo3400a(modifierM3358c, C2299e.f9103F))), interfaceC4339a2, c28655q, i211 & 112, 0);
                c28655q.m87173q(true);
                modifier6 = modifierM3358c;
                enumC12706k2 = enumC12706k6;
                modifier5 = modifier9;
            } else {
                c28655q.m87138X();
                modifier5 = modifier3;
                modifier6 = modifier4;
                enumC12706k2 = enumC12706k;
            }
            interfaceC4339a3 = interfaceC4339a2;
            interfaceC4351m2 = interfaceC4351mM50763d;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(modifier5, modifier6, enumC12706k2, interfaceC4339a3, interfaceC4351m2, i13, i14, 26);
            }
        }
        i15 |= 24576;
        interfaceC4351mM50763d = interfaceC4351m;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i18 = i13 & 1;
            c2314t = C2314t.f9131w;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if (i19 != 0) {
                    modifier3 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBrandPrimary(), AbstractC17918w0.f69621a);
                    i15 &= -113;
                } else {
                    modifierM3358c = modifier4;
                }
                if (i25 != 0) {
                    enumC12706k3 = EnumC12706k.NOT_EXPANDED;
                } else {
                    enumC12706k3 = enumC12706k;
                }
                if (i26 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C17089l(24);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                }
                if (i16 != 0) {
                    interfaceC4351mM50763d = C17724b.f68906a.m50763d();
                }
                modifier3 = modifier3;
            } else {
                if (i19 != 0) {
                    modifier3 = c2314t;
                }
                if ((i14 & 2) != 0) {
                    modifierM3358c = AbstractC1092a.m3358c(c2314t, C38072d.f163053a.m121949b(c28655q, 6).getBrandPrimary(), AbstractC17918w0.f69621a);
                    i15 &= -113;
                } else {
                    modifierM3358c = modifier4;
                }
                if (i25 != 0) {
                    enumC12706k3 = EnumC12706k.NOT_EXPANDED;
                } else {
                    enumC12706k3 = enumC12706k;
                }
                if (i26 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C17089l(24);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                }
                if (i16 != 0) {
                    interfaceC4351mM50763d = C17724b.f68906a.m50763d();
                }
                modifier3 = modifier3;
            }
            c28655q.m87175r();
            float f16 = ((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenWidthDp;
            C28674u2 c28674u5 = AbstractC2453v1.f9569h;
            Map mapM73990Y4 = AbstractC25247g0.m73990Y(new C23465k(Float.valueOf(0.0f), EnumC12706k.NOT_EXPANDED), new C23465k(Float.valueOf(((InterfaceC39171c) c28655q.m87161k(c28674u5)).mo743q0(f16) * (-0.3f)), EnumC12706k.EXPANDED));
            int i213 = i15 >> 6;
            c15093n7M60417W = AbstractC21478l0.m60417W(enumC12706k3, c28655q, i213 & 14);
            InterfaceC39171c interfaceC39171c4 = (InterfaceC39171c) c28655q.m87161k(c28674u5);
            fMo743q0 = (-((Number) c15093n7M60417W.f56512e.getValue()).floatValue()) - interfaceC39171c4.mo743q0(2 * 8);
            if (fMo743q0 < 0.0f) {
                fMo743q0 = 0.0f;
            }
            float fMo733e3 = interfaceC39171c4.mo733e0(AbstractC12889b.m36258X(fMo743q0));
            EnumC16377d2 enumC16377d5 = EnumC16377d2.f62971w;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C15184w8(22);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierMo3471e4 = AbstractC21478l0.m60426c0(c2314t, c15093n7M60417W, mapM73990Y4, false, false, (InterfaceC4351m) objM87133R2, null, 440).mo3471e(modifier3);
            C2307m c2307m10 = C2299e.f9114w;
            EnumC12706k enumC12706k7 = enumC12706k3;
            InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m10, false);
            Modifier modifier10 = modifier3;
            int i214 = i15;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d10);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                interfaceC4339a4 = interfaceC4339a2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                C2307m c2307m11 = C2299e.f9117z;
                C1100b c1100b7 = C1100b.f4583a;
                Modifier modifierMo3400a7 = c1100b7.mo3400a(c2314t, c2307m11);
                zM87153g = c28655q.m87153g(c15093n7M60417W);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C17764l(c15093n7M60417W, 1);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C17764l(c15093n7M60417W, 1);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3390l(modifierMo3400a7, (Function1) objM87133R3));
                InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m10, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3407d7);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d11);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                AbstractC11895b.m32007z((i214 >> 12) & 14, interfaceC4351mM50763d, c28655q, true);
                interfaceC4339a2 = interfaceC4339a4;
                m50789g(AbstractC1102d.m3424u(fMo733e3, AbstractC1102d.m3406c(1.0f, c1100b7.mo3400a(modifierM3358c, C2299e.f9103F))), interfaceC4339a2, c28655q, i213 & 112, 0);
                c28655q.m87173q(true);
                modifier6 = modifierM3358c;
                enumC12706k2 = enumC12706k7;
                modifier5 = modifier10;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N10);
            C2307m c2307m12 = C2299e.f9117z;
            C1100b c1100b8 = C1100b.f4583a;
            Modifier modifierMo3400a8 = c1100b8.mo3400a(c2314t, c2307m12);
            zM87153g = c28655q.m87153g(c15093n7M60417W);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R3 = new C17764l(c15093n7M60417W, 1);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C17764l(c15093n7M60417W, 1);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3390l(modifierMo3400a8, (Function1) objM87133R3));
            InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m10, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3407d8);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d12);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N12);
            AbstractC11895b.m32007z((i214 >> 12) & 14, interfaceC4351mM50763d, c28655q, true);
            interfaceC4339a2 = interfaceC4339a4;
            m50789g(AbstractC1102d.m3424u(fMo733e3, AbstractC1102d.m3406c(1.0f, c1100b8.mo3400a(modifierM3358c, C2299e.f9103F))), interfaceC4339a2, c28655q, i213 & 112, 0);
            c28655q.m87173q(true);
            modifier6 = modifierM3358c;
            enumC12706k2 = enumC12706k7;
            modifier5 = modifier10;
        } else {
            c28655q.m87138X();
            modifier5 = modifier3;
            modifier6 = modifier4;
            enumC12706k2 = enumC12706k;
        }
        interfaceC4339a3 = interfaceC4339a2;
        interfaceC4351m2 = interfaceC4351mM50763d;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(modifier5, modifier6, enumC12706k2, interfaceC4339a3, interfaceC4351m2, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m50793k() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC15022g9 m50794l(EnumC12706k enumC12706k, EnumC12706k enumC12706k2) {
        AbstractC22676k.m65750j(enumC12706k, "<unused var>");
        AbstractC22676k.m65750j(enumC12706k2, "<unused var>");
        return new C14972c3(0.3f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C39178j m50795m(C15093n7 c15093n7, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        return new C39178j((((long) AbstractC12889b.m36258X(((Number) c15093n7.f56512e.getValue()).floatValue())) << 32) | (((long) 0) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m50796n(Modifier modifier, Modifier modifier2, EnumC12706k enumC12706k, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m50792j(modifier, modifier2, enumC12706k, interfaceC4339a, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
