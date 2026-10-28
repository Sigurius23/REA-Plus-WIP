package com.whoop.design.atomic.organism.toolbar;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import j81.C21421e;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import nx1.C27219a;
import ny0.AbstractC27242b1;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: com.whoop.design.atomic.organism.toolbar.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "titleColumnModifier", "Lcom/whoop/design/atomic/organism/toolbar/d$c;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onLeftButtonClick", "onRightButtonClick", "d", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6720c {
    /* JADX WARN: Code duplicated, block: B:100:0x0222  */
    /* JADX WARN: Code duplicated, block: B:101:0x0226  */
    /* JADX WARN: Code duplicated, block: B:104:0x0233  */
    /* JADX WARN: Code duplicated, block: B:108:0x0245  */
    /* JADX WARN: Code duplicated, block: B:111:0x026c  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:116:0x0303  */
    /* JADX WARN: Code duplicated, block: B:119:0x0354  */
    /* JADX WARN: Code duplicated, block: B:121:0x038a  */
    /* JADX WARN: Code duplicated, block: B:122:0x038e  */
    /* JADX WARN: Code duplicated, block: B:125:0x039b  */
    /* JADX WARN: Code duplicated, block: B:127:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:130:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:131:0x0435  */
    /* JADX WARN: Code duplicated, block: B:133:0x0445  */
    /* JADX WARN: Code duplicated, block: B:136:0x045b  */
    /* JADX WARN: Code duplicated, block: B:137:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:142:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0140  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151  */
    /* JADX WARN: Code duplicated, block: B:91:0x0164  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
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
    /* JADX INFO: renamed from: d */
    public static final void m20151d(Modifier modifier, Modifier modifier2, AbstractC6721d.c state, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        Modifier modifier3;
        int i15;
        Modifier modifier4;
        int i16;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a3;
        int i19;
        boolean z4;
        Modifier modifier5;
        Modifier modifier6;
        InterfaceC4339a interfaceC4339a4;
        InterfaceC4339a interfaceC4339a5;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier7;
        Object obj;
        int i24;
        InterfaceC4339a interfaceC4339a6;
        InterfaceC4339a interfaceC4339a7;
        float f13;
        C2306l c2306l;
        InterfaceC4339a interfaceC4339a8;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        float f14;
        C0209i c0209i4;
        InterfaceC4339a interfaceC4339a9;
        C0209i c0209i5;
        C2306l c2306l2;
        C0213j c0213j2;
        ?? r10;
        ?? r14;
        int iHashCode2;
        String strM21274h;
        String strM21274h2;
        String strM21274h3;
        C28655q c28655q2;
        AbstractC22403o dataIcon;
        int i25;
        C28655q c28655q3;
        Modifier modifier8;
        C28655q c28655q4;
        InterfaceC4339a interfaceC4339a10;
        int iHashCode3;
        C38072d c38072d;
        int i26;
        C28655q c28655q5;
        C28655q c28655q6;
        Object objM87133R;
        Object objM87133R2;
        int i27;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(-689315607);
        int i28 = i14 & 1;
        if (i28 != 0) {
            i15 = i13 | 6;
            modifier3 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier3 = modifier;
            i15 = (c28655q7.m87153g(modifier3) ? 4 : 2) | i13;
        } else {
            modifier3 = modifier;
            i15 = i13;
        }
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                modifier4 = modifier2;
                i15 |= c28655q7.m87153g(modifier4) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q7.m87153g(state)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i15 |= i27;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q7.m87157i(interfaceC4339a)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a3 = interfaceC4339a2;
                        if (c28655q7.m87157i(interfaceC4339a3)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q7.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i28 != 0) {
                            modifier3 = c2314t;
                        }
                        if (i29 != 0) {
                            modifier7 = c2314t;
                        } else {
                            modifier7 = modifier4;
                        }
                        obj = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R2 = c28655q7.m87133R();
                            if (objM87133R2 == obj) {
                                objM87133R2 = new C27219a(15);
                                c28655q7.m87172p0(objM87133R2);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            interfaceC4339a6 = interfaceC4339a;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q7.m87133R();
                            if (objM87133R == obj) {
                                objM87133R = new C27219a(16);
                                c28655q7.m87172p0(objM87133R);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        f13 = 4;
                        Modifier modifierMo3471e = AbstractC1099a.m3396r(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x), ((float) 1.5d) * f13, 0.0f, 2).mo3471e(modifier3);
                        C22961h c22961h = AbstractC22977m.f90656g;
                        c2306l = C2299e.f9107J;
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q7, 6);
                        interfaceC4339a8 = interfaceC4339a6;
                        iHashCode = Long.hashCode(c28655q7.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, modifierMo3471e);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q7.m87158i0();
                        if (c28655q7.f115903S) {
                            c28655q7.m87163l(c0213j);
                        } else {
                            c28655q7.m87178s0();
                        }
                        c0209i = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a);
                        c0209i2 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m);
                        c0209i3 = C0217k.f732j;
                        if (c28655q7.f115903S) {
                            f14 = f13;
                        } else {
                            f14 = f13;
                            if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N);
                            if (state.getLeftIcon() != null) {
                                c28655q7.m87150e0(907072741);
                                int i34 = ((i15 << 3) & 57344) | 384;
                                c2306l2 = c2306l;
                                c0213j2 = c0213j;
                                c0209i5 = c0209i2;
                                r10 = 0;
                                r14 = 1;
                                AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i34, 8);
                                interfaceC4339a9 = interfaceC4339a8;
                                c28655q7.m87173q(false);
                            } else {
                                interfaceC4339a9 = interfaceC4339a8;
                                c0209i5 = c0209i2;
                                c2306l2 = c2306l;
                                c0213j2 = c0213j;
                                r10 = 0;
                                r14 = 1;
                                c28655q7.m87150e0(907383268);
                                AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                                c28655q7.m87173q(false);
                            }
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, r14);
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                            iHashCode2 = Long.hashCode(c28655q7.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q7.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement);
                            c28655q7.m87158i0();
                            if (c28655q7.f115903S) {
                                c28655q7.m87163l(c0213j2);
                            } else {
                                c28655q7.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m2);
                            if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N2);
                            strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                            strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                            strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                            if (strM21274h.length() > 0) {
                                c28655q7.m87150e0(-597034273);
                                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                                C38072d c38072d2 = C38072d.f163053a;
                                AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d2.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                                C28655q c28655q8 = c28655q7;
                                c28655q8.m87173q(r10);
                                c28655q2 = c28655q8;
                            } else {
                                c28655q7.m87150e0(-596770959);
                                c28655q7.m87173q(r10);
                                c28655q2 = c28655q7;
                            }
                            dataIcon = state.getDataIcon();
                            if (dataIcon == null) {
                                c28655q2.m87150e0(-596728087);
                                c28655q2.m87173q(r10);
                                i25 = 6;
                                c28655q3 = c28655q2;
                            } else {
                                c28655q2.m87150e0(-596728086);
                                C28655q c28655q9 = c28655q2;
                                C28655q c28655q10 = c28655q9;
                                float f15 = 8;
                                float f16 = ((float) r14) * f15;
                                i25 = 6;
                                AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q9, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f15 * f14, AbstractC1099a.m3398t(c2314t, f16, f16, 0.0f, f16, 4)), C38072d.f163053a.m121949b(c28655q10, 6).getBrandWhite(), c28655q10, 384, 0);
                                c28655q10.m87173q(r10);
                                c28655q3 = c28655q10;
                            }
                            if (strM21274h2.length() > 0) {
                                c28655q3.m87150e0(-596240735);
                                Modifier modifier9 = modifier7;
                                Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier9));
                                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3406c);
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    c28655q3.m87163l(c0213j2);
                                } else {
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
                                AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m3);
                                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                                }
                                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
                                c38072d = C38072d.f163053a;
                                modifier8 = modifier9;
                                C28655q c28655q11 = c28655q3;
                                i26 = i25;
                                AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q11, 0, 0, 196602);
                                c28655q5 = c28655q11;
                                if (strM21274h3.length() > 0) {
                                    AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                                    C28655q c28655q12 = c28655q5;
                                    c28655q12.m87173q(r10);
                                    c28655q6 = c28655q12;
                                } else {
                                    c28655q5.m87150e0(-270166711);
                                    c28655q5.m87173q(r10);
                                    c28655q6 = c28655q5;
                                }
                                c28655q6.m87173q(r14);
                                c28655q6.m87173q(r10);
                                c28655q4 = c28655q6;
                            } else {
                                modifier8 = modifier7;
                                c28655q3.m87150e0(-595442671);
                                c28655q3.m87173q(r10);
                                c28655q4 = c28655q3;
                            }
                            c28655q4.m87173q(r14);
                            if (state.getRightIcon() != null) {
                                c28655q4.m87150e0(909492353);
                                interfaceC4339a10 = interfaceC4339a7;
                                AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                                c28655q4.m87173q(r10);
                            } else {
                                interfaceC4339a10 = interfaceC4339a7;
                                c28655q4.m87150e0(909806724);
                                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                                c28655q4.m87173q(r10);
                            }
                            c28655q4.m87173q(r14);
                            modifier5 = modifier3;
                            modifier6 = modifier8;
                            interfaceC4339a4 = interfaceC4339a10;
                            interfaceC4339a5 = interfaceC4339a9;
                            c28655q = c28655q4;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N);
                        if (state.getLeftIcon() != null) {
                            c28655q7.m87150e0(907072741);
                            int i35 = ((i15 << 3) & 57344) | 384;
                            c2306l2 = c2306l;
                            c0213j2 = c0213j;
                            c0209i5 = c0209i2;
                            r10 = 0;
                            r14 = 1;
                            AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i35, 8);
                            interfaceC4339a9 = interfaceC4339a8;
                            c28655q7.m87173q(false);
                        } else {
                            interfaceC4339a9 = interfaceC4339a8;
                            c0209i5 = c0209i2;
                            c2306l2 = c2306l;
                            c0213j2 = c0213j;
                            r10 = 0;
                            r14 = 1;
                            c28655q7.m87150e0(907383268);
                            AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q7.m87173q(false);
                        }
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, r14);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                        iHashCode2 = Long.hashCode(c28655q7.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q7.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement2);
                        c28655q7.m87158i0();
                        if (c28655q7.f115903S) {
                            c28655q7.m87163l(c0213j2);
                        } else {
                            c28655q7.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m4);
                        if (c28655q7.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N4);
                        strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                        strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                        strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                        if (strM21274h.length() > 0) {
                            c28655q7.m87150e0(-597034273);
                            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                            C38072d c38072d3 = C38072d.f163053a;
                            AbstractC30795n.m94707h(strM21274h, modifierM3398t2, c38072d3.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                            C28655q c28655q13 = c28655q7;
                            c28655q13.m87173q(r10);
                            c28655q2 = c28655q13;
                        } else {
                            c28655q7.m87150e0(-596770959);
                            c28655q7.m87173q(r10);
                            c28655q2 = c28655q7;
                        }
                        dataIcon = state.getDataIcon();
                        if (dataIcon == null) {
                            c28655q2.m87150e0(-596728087);
                            c28655q2.m87173q(r10);
                            i25 = 6;
                            c28655q3 = c28655q2;
                        } else {
                            c28655q2.m87150e0(-596728086);
                            C28655q c28655q14 = c28655q2;
                            C28655q c28655q15 = c28655q14;
                            float f17 = 8;
                            float f18 = ((float) r14) * f17;
                            i25 = 6;
                            AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q14, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f17 * f14, AbstractC1099a.m3398t(c2314t, f18, f18, 0.0f, f18, 4)), C38072d.f163053a.m121949b(c28655q15, 6).getBrandWhite(), c28655q15, 384, 0);
                            c28655q15.m87173q(r10);
                            c28655q3 = c28655q15;
                        }
                        if (strM21274h2.length() > 0) {
                            c28655q3.m87150e0(-596240735);
                            Modifier modifier10 = modifier7;
                            Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier10));
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3406c2);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j2);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m5);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N5);
                            c38072d = C38072d.f163053a;
                            modifier8 = modifier10;
                            C28655q c28655q16 = c28655q3;
                            i26 = i25;
                            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q16, 0, 0, 196602);
                            c28655q5 = c28655q16;
                            if (strM21274h3.length() > 0) {
                                AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                                C28655q c28655q17 = c28655q5;
                                c28655q17.m87173q(r10);
                                c28655q6 = c28655q17;
                            } else {
                                c28655q5.m87150e0(-270166711);
                                c28655q5.m87173q(r10);
                                c28655q6 = c28655q5;
                            }
                            c28655q6.m87173q(r14);
                            c28655q6.m87173q(r10);
                            c28655q4 = c28655q6;
                        } else {
                            modifier8 = modifier7;
                            c28655q3.m87150e0(-595442671);
                            c28655q3.m87173q(r10);
                            c28655q4 = c28655q3;
                        }
                        c28655q4.m87173q(r14);
                        if (state.getRightIcon() != null) {
                            c28655q4.m87150e0(909492353);
                            interfaceC4339a10 = interfaceC4339a7;
                            AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                            c28655q4.m87173q(r10);
                        } else {
                            interfaceC4339a10 = interfaceC4339a7;
                            c28655q4.m87150e0(909806724);
                            AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q4.m87173q(r10);
                        }
                        c28655q4.m87173q(r14);
                        modifier5 = modifier3;
                        modifier6 = modifier8;
                        interfaceC4339a4 = interfaceC4339a10;
                        interfaceC4339a5 = interfaceC4339a9;
                        c28655q = c28655q4;
                    } else {
                        c28655q7.m87138X();
                        modifier5 = modifier3;
                        modifier6 = modifier4;
                        interfaceC4339a4 = interfaceC4339a3;
                        interfaceC4339a5 = interfaceC4339a;
                        c28655q = c28655q7;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, state, interfaceC4339a5, interfaceC4339a4, i13, i14, 14);
                    }
                }
                i15 |= 24576;
                interfaceC4339a3 = interfaceC4339a2;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q7.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i29 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier4;
                    }
                    obj = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q7.m87133R();
                        if (objM87133R2 == obj) {
                            objM87133R2 = new C27219a(15);
                            c28655q7.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q7.m87133R();
                        if (objM87133R == obj) {
                            objM87133R = new C27219a(16);
                            c28655q7.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    f13 = 4;
                    Modifier modifierMo3471e2 = AbstractC1099a.m3396r(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x), ((float) 1.5d) * f13, 0.0f, 2).mo3471e(modifier3);
                    C22961h c22961h2 = AbstractC22977m.f90656g;
                    c2306l = C2299e.f9107J;
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22961h2, c2306l, c28655q7, 6);
                    interfaceC4339a8 = interfaceC4339a6;
                    iHashCode = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q7.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q7, modifierMo3471e2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j);
                    } else {
                        c28655q7.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a4);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m6);
                    c0209i3 = C0217k.f732j;
                    if (c28655q7.f115903S) {
                        f14 = f13;
                        if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N6);
                        if (state.getLeftIcon() != null) {
                            c28655q7.m87150e0(907072741);
                            int i36 = ((i15 << 3) & 57344) | 384;
                            c2306l2 = c2306l;
                            c0213j2 = c0213j;
                            c0209i5 = c0209i2;
                            r10 = 0;
                            r14 = 1;
                            AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i36, 8);
                            interfaceC4339a9 = interfaceC4339a8;
                            c28655q7.m87173q(false);
                        } else {
                            interfaceC4339a9 = interfaceC4339a8;
                            c0209i5 = c0209i2;
                            c2306l2 = c2306l;
                            c0213j2 = c0213j;
                            r10 = 0;
                            r14 = 1;
                            c28655q7.m87150e0(907383268);
                            AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q7.m87173q(false);
                        }
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, r14);
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                        iHashCode2 = Long.hashCode(c28655q7.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q7.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement3);
                        c28655q7.m87158i0();
                        if (c28655q7.f115903S) {
                            c28655q7.m87163l(c0213j2);
                        } else {
                            c28655q7.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m7);
                        if (c28655q7.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N7);
                        strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                        strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                        strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                        if (strM21274h.length() > 0) {
                            c28655q7.m87150e0(-597034273);
                            Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                            C38072d c38072d4 = C38072d.f163053a;
                            AbstractC30795n.m94707h(strM21274h, modifierM3398t3, c38072d4.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                            C28655q c28655q18 = c28655q7;
                            c28655q18.m87173q(r10);
                            c28655q2 = c28655q18;
                        } else {
                            c28655q7.m87150e0(-596770959);
                            c28655q7.m87173q(r10);
                            c28655q2 = c28655q7;
                        }
                        dataIcon = state.getDataIcon();
                        if (dataIcon == null) {
                            c28655q2.m87150e0(-596728087);
                            c28655q2.m87173q(r10);
                            i25 = 6;
                            c28655q3 = c28655q2;
                        } else {
                            c28655q2.m87150e0(-596728086);
                            C28655q c28655q19 = c28655q2;
                            C28655q c28655q110 = c28655q19;
                            float f19 = 8;
                            float f110 = ((float) r14) * f19;
                            i25 = 6;
                            AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q19, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f19 * f14, AbstractC1099a.m3398t(c2314t, f110, f110, 0.0f, f110, 4)), C38072d.f163053a.m121949b(c28655q110, 6).getBrandWhite(), c28655q110, 384, 0);
                            c28655q110.m87173q(r10);
                            c28655q3 = c28655q110;
                        }
                        if (strM21274h2.length() > 0) {
                            c28655q3.m87150e0(-596240735);
                            Modifier modifier11 = modifier7;
                            Modifier modifierM3406c3 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier11));
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3406c3);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j2);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m8);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N8);
                            c38072d = C38072d.f163053a;
                            modifier8 = modifier11;
                            C28655q c28655q111 = c28655q3;
                            i26 = i25;
                            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q111, 0, 0, 196602);
                            c28655q5 = c28655q111;
                            if (strM21274h3.length() > 0) {
                                AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                                C28655q c28655q112 = c28655q5;
                                c28655q112.m87173q(r10);
                                c28655q6 = c28655q112;
                            } else {
                                c28655q5.m87150e0(-270166711);
                                c28655q5.m87173q(r10);
                                c28655q6 = c28655q5;
                            }
                            c28655q6.m87173q(r14);
                            c28655q6.m87173q(r10);
                            c28655q4 = c28655q6;
                        } else {
                            modifier8 = modifier7;
                            c28655q3.m87150e0(-595442671);
                            c28655q3.m87173q(r10);
                            c28655q4 = c28655q3;
                        }
                        c28655q4.m87173q(r14);
                        if (state.getRightIcon() != null) {
                            c28655q4.m87150e0(909492353);
                            interfaceC4339a10 = interfaceC4339a7;
                            AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                            c28655q4.m87173q(r10);
                        } else {
                            interfaceC4339a10 = interfaceC4339a7;
                            c28655q4.m87150e0(909806724);
                            AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q4.m87173q(r10);
                        }
                        c28655q4.m87173q(r14);
                        modifier5 = modifier3;
                        modifier6 = modifier8;
                        interfaceC4339a4 = interfaceC4339a10;
                        interfaceC4339a5 = interfaceC4339a9;
                        c28655q = c28655q4;
                    } else {
                        f14 = f13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N6);
                    if (state.getLeftIcon() != null) {
                        c28655q7.m87150e0(907072741);
                        int i37 = ((i15 << 3) & 57344) | 384;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        c0209i5 = c0209i2;
                        r10 = 0;
                        r14 = 1;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i37, 8);
                        interfaceC4339a9 = interfaceC4339a8;
                        c28655q7.m87173q(false);
                    } else {
                        interfaceC4339a9 = interfaceC4339a8;
                        c0209i5 = c0209i2;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        r10 = 0;
                        r14 = 1;
                        c28655q7.m87150e0(907383268);
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q7.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, r14);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                    iHashCode2 = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q7.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement4);
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j2);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m9);
                    if (c28655q7.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N9);
                    strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                    strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                    strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                    if (strM21274h.length() > 0) {
                        c28655q7.m87150e0(-597034273);
                        Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d5 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t4, c38072d5.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                        C28655q c28655q113 = c28655q7;
                        c28655q113.m87173q(r10);
                        c28655q2 = c28655q113;
                    } else {
                        c28655q7.m87150e0(-596770959);
                        c28655q7.m87173q(r10);
                        c28655q2 = c28655q7;
                    }
                    dataIcon = state.getDataIcon();
                    if (dataIcon == null) {
                        c28655q2.m87150e0(-596728087);
                        c28655q2.m87173q(r10);
                        i25 = 6;
                        c28655q3 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-596728086);
                        C28655q c28655q114 = c28655q2;
                        C28655q c28655q115 = c28655q114;
                        float f111 = 8;
                        float f112 = ((float) r14) * f111;
                        i25 = 6;
                        AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q114, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f111 * f14, AbstractC1099a.m3398t(c2314t, f112, f112, 0.0f, f112, 4)), C38072d.f163053a.m121949b(c28655q115, 6).getBrandWhite(), c28655q115, 384, 0);
                        c28655q115.m87173q(r10);
                        c28655q3 = c28655q115;
                    }
                    if (strM21274h2.length() > 0) {
                        c28655q3.m87150e0(-596240735);
                        Modifier modifier12 = modifier7;
                        Modifier modifierM3406c4 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier12));
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q3.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q3, modifierM3406c4);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m10);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N10);
                        c38072d = C38072d.f163053a;
                        modifier8 = modifier12;
                        C28655q c28655q116 = c28655q3;
                        i26 = i25;
                        AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q116, 0, 0, 196602);
                        c28655q5 = c28655q116;
                        if (strM21274h3.length() > 0) {
                            AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                            C28655q c28655q117 = c28655q5;
                            c28655q117.m87173q(r10);
                            c28655q6 = c28655q117;
                        } else {
                            c28655q5.m87150e0(-270166711);
                            c28655q5.m87173q(r10);
                            c28655q6 = c28655q5;
                        }
                        c28655q6.m87173q(r14);
                        c28655q6.m87173q(r10);
                        c28655q4 = c28655q6;
                    } else {
                        modifier8 = modifier7;
                        c28655q3.m87150e0(-595442671);
                        c28655q3.m87173q(r10);
                        c28655q4 = c28655q3;
                    }
                    c28655q4.m87173q(r14);
                    if (state.getRightIcon() != null) {
                        c28655q4.m87150e0(909492353);
                        interfaceC4339a10 = interfaceC4339a7;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                        c28655q4.m87173q(r10);
                    } else {
                        interfaceC4339a10 = interfaceC4339a7;
                        c28655q4.m87150e0(909806724);
                        AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q4.m87173q(r10);
                    }
                    c28655q4.m87173q(r14);
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    interfaceC4339a4 = interfaceC4339a10;
                    interfaceC4339a5 = interfaceC4339a9;
                    c28655q = c28655q4;
                } else {
                    c28655q7.m87138X();
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    interfaceC4339a4 = interfaceC4339a3;
                    interfaceC4339a5 = interfaceC4339a;
                    c28655q = c28655q7;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, state, interfaceC4339a5, interfaceC4339a4, i13, i14, 14);
                }
            }
            i15 |= 3072;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a3 = interfaceC4339a2;
                    if (c28655q7.m87157i(interfaceC4339a3)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q7.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i29 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier4;
                    }
                    obj = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q7.m87133R();
                        if (objM87133R2 == obj) {
                            objM87133R2 = new C27219a(15);
                            c28655q7.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q7.m87133R();
                        if (objM87133R == obj) {
                            objM87133R = new C27219a(16);
                            c28655q7.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    f13 = 4;
                    Modifier modifierMo3471e3 = AbstractC1099a.m3396r(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x), ((float) 1.5d) * f13, 0.0f, 2).mo3471e(modifier3);
                    C22961h c22961h3 = AbstractC22977m.f90656g;
                    c2306l = C2299e.f9107J;
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22961h3, c2306l, c28655q7, 6);
                    interfaceC4339a8 = interfaceC4339a6;
                    iHashCode = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q7.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q7, modifierMo3471e3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j);
                    } else {
                        c28655q7.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a7);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m11);
                    c0209i3 = C0217k.f732j;
                    if (c28655q7.f115903S) {
                        f14 = f13;
                        if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N11);
                        if (state.getLeftIcon() != null) {
                            c28655q7.m87150e0(907072741);
                            int i38 = ((i15 << 3) & 57344) | 384;
                            c2306l2 = c2306l;
                            c0213j2 = c0213j;
                            c0209i5 = c0209i2;
                            r10 = 0;
                            r14 = 1;
                            AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i38, 8);
                            interfaceC4339a9 = interfaceC4339a8;
                            c28655q7.m87173q(false);
                        } else {
                            interfaceC4339a9 = interfaceC4339a8;
                            c0209i5 = c0209i2;
                            c2306l2 = c2306l;
                            c0213j2 = c0213j;
                            r10 = 0;
                            r14 = 1;
                            c28655q7.m87150e0(907383268);
                            AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q7.m87173q(false);
                        }
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, r14);
                        C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                        iHashCode2 = Long.hashCode(c28655q7.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q7.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement5);
                        c28655q7.m87158i0();
                        if (c28655q7.f115903S) {
                            c28655q7.m87163l(c0213j2);
                        } else {
                            c28655q7.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a8);
                        AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m12);
                        if (c28655q7.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N12);
                        strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                        strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                        strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                        if (strM21274h.length() > 0) {
                            c28655q7.m87150e0(-597034273);
                            Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                            C38072d c38072d6 = C38072d.f163053a;
                            AbstractC30795n.m94707h(strM21274h, modifierM3398t5, c38072d6.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                            C28655q c28655q118 = c28655q7;
                            c28655q118.m87173q(r10);
                            c28655q2 = c28655q118;
                        } else {
                            c28655q7.m87150e0(-596770959);
                            c28655q7.m87173q(r10);
                            c28655q2 = c28655q7;
                        }
                        dataIcon = state.getDataIcon();
                        if (dataIcon == null) {
                            c28655q2.m87150e0(-596728087);
                            c28655q2.m87173q(r10);
                            i25 = 6;
                            c28655q3 = c28655q2;
                        } else {
                            c28655q2.m87150e0(-596728086);
                            C28655q c28655q119 = c28655q2;
                            C28655q c28655q1110 = c28655q119;
                            float f113 = 8;
                            float f114 = ((float) r14) * f113;
                            i25 = 6;
                            AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q119, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f113 * f14, AbstractC1099a.m3398t(c2314t, f114, f114, 0.0f, f114, 4)), C38072d.f163053a.m121949b(c28655q1110, 6).getBrandWhite(), c28655q1110, 384, 0);
                            c28655q1110.m87173q(r10);
                            c28655q3 = c28655q1110;
                        }
                        if (strM21274h2.length() > 0) {
                            c28655q3.m87150e0(-596240735);
                            Modifier modifier13 = modifier7;
                            Modifier modifierM3406c5 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier13));
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifierM3406c5);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j2);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a5);
                            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m13);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N13);
                            c38072d = C38072d.f163053a;
                            modifier8 = modifier13;
                            C28655q c28655q1111 = c28655q3;
                            i26 = i25;
                            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q1111, 0, 0, 196602);
                            c28655q5 = c28655q1111;
                            if (strM21274h3.length() > 0) {
                                AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                                C28655q c28655q1112 = c28655q5;
                                c28655q1112.m87173q(r10);
                                c28655q6 = c28655q1112;
                            } else {
                                c28655q5.m87150e0(-270166711);
                                c28655q5.m87173q(r10);
                                c28655q6 = c28655q5;
                            }
                            c28655q6.m87173q(r14);
                            c28655q6.m87173q(r10);
                            c28655q4 = c28655q6;
                        } else {
                            modifier8 = modifier7;
                            c28655q3.m87150e0(-595442671);
                            c28655q3.m87173q(r10);
                            c28655q4 = c28655q3;
                        }
                        c28655q4.m87173q(r14);
                        if (state.getRightIcon() != null) {
                            c28655q4.m87150e0(909492353);
                            interfaceC4339a10 = interfaceC4339a7;
                            AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                            c28655q4.m87173q(r10);
                        } else {
                            interfaceC4339a10 = interfaceC4339a7;
                            c28655q4.m87150e0(909806724);
                            AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q4.m87173q(r10);
                        }
                        c28655q4.m87173q(r14);
                        modifier5 = modifier3;
                        modifier6 = modifier8;
                        interfaceC4339a4 = interfaceC4339a10;
                        interfaceC4339a5 = interfaceC4339a9;
                        c28655q = c28655q4;
                    } else {
                        f14 = f13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N11);
                    if (state.getLeftIcon() != null) {
                        c28655q7.m87150e0(907072741);
                        int i39 = ((i15 << 3) & 57344) | 384;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        c0209i5 = c0209i2;
                        r10 = 0;
                        r14 = 1;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i39, 8);
                        interfaceC4339a9 = interfaceC4339a8;
                        c28655q7.m87173q(false);
                    } else {
                        interfaceC4339a9 = interfaceC4339a8;
                        c0209i5 = c0209i2;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        r10 = 0;
                        r14 = 1;
                        c28655q7.m87150e0(907383268);
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q7.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, r14);
                    C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                    iHashCode2 = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q7.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement6);
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j2);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a9);
                    AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m14);
                    if (c28655q7.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N14);
                    strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                    strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                    strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                    if (strM21274h.length() > 0) {
                        c28655q7.m87150e0(-597034273);
                        Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d7 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t6, c38072d7.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                        C28655q c28655q1113 = c28655q7;
                        c28655q1113.m87173q(r10);
                        c28655q2 = c28655q1113;
                    } else {
                        c28655q7.m87150e0(-596770959);
                        c28655q7.m87173q(r10);
                        c28655q2 = c28655q7;
                    }
                    dataIcon = state.getDataIcon();
                    if (dataIcon == null) {
                        c28655q2.m87150e0(-596728087);
                        c28655q2.m87173q(r10);
                        i25 = 6;
                        c28655q3 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-596728086);
                        C28655q c28655q1114 = c28655q2;
                        C28655q c28655q1115 = c28655q1114;
                        float f115 = 8;
                        float f116 = ((float) r14) * f115;
                        i25 = 6;
                        AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q1114, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f115 * f14, AbstractC1099a.m3398t(c2314t, f116, f116, 0.0f, f116, 4)), C38072d.f163053a.m121949b(c28655q1115, 6).getBrandWhite(), c28655q1115, 384, 0);
                        c28655q1115.m87173q(r10);
                        c28655q3 = c28655q1115;
                    }
                    if (strM21274h2.length() > 0) {
                        c28655q3.m87150e0(-596240735);
                        Modifier modifier14 = modifier7;
                        Modifier modifierM3406c6 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier14));
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, modifierM3406c6);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m15);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N15);
                        c38072d = C38072d.f163053a;
                        modifier8 = modifier14;
                        C28655q c28655q1116 = c28655q3;
                        i26 = i25;
                        AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q1116, 0, 0, 196602);
                        c28655q5 = c28655q1116;
                        if (strM21274h3.length() > 0) {
                            AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                            C28655q c28655q1117 = c28655q5;
                            c28655q1117.m87173q(r10);
                            c28655q6 = c28655q1117;
                        } else {
                            c28655q5.m87150e0(-270166711);
                            c28655q5.m87173q(r10);
                            c28655q6 = c28655q5;
                        }
                        c28655q6.m87173q(r14);
                        c28655q6.m87173q(r10);
                        c28655q4 = c28655q6;
                    } else {
                        modifier8 = modifier7;
                        c28655q3.m87150e0(-595442671);
                        c28655q3.m87173q(r10);
                        c28655q4 = c28655q3;
                    }
                    c28655q4.m87173q(r14);
                    if (state.getRightIcon() != null) {
                        c28655q4.m87150e0(909492353);
                        interfaceC4339a10 = interfaceC4339a7;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                        c28655q4.m87173q(r10);
                    } else {
                        interfaceC4339a10 = interfaceC4339a7;
                        c28655q4.m87150e0(909806724);
                        AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q4.m87173q(r10);
                    }
                    c28655q4.m87173q(r14);
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    interfaceC4339a4 = interfaceC4339a10;
                    interfaceC4339a5 = interfaceC4339a9;
                    c28655q = c28655q4;
                } else {
                    c28655q7.m87138X();
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    interfaceC4339a4 = interfaceC4339a3;
                    interfaceC4339a5 = interfaceC4339a;
                    c28655q = c28655q7;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, state, interfaceC4339a5, interfaceC4339a4, i13, i14, 14);
                }
            }
            i15 |= 24576;
            interfaceC4339a3 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier3 = c2314t;
                }
                if (i29 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier4;
                }
                obj = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q7.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C27219a(15);
                        c28655q7.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    i24 = i18;
                } else {
                    i24 = i18;
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i24 != 0) {
                    objM87133R = c28655q7.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = new C27219a(16);
                        c28655q7.m87172p0(objM87133R);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                f13 = 4;
                Modifier modifierMo3471e4 = AbstractC1099a.m3396r(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x), ((float) 1.5d) * f13, 0.0f, 2).mo3471e(modifier3);
                C22961h c22961h4 = AbstractC22977m.f90656g;
                c2306l = C2299e.f9107J;
                C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22961h4, c2306l, c28655q7, 6);
                interfaceC4339a8 = interfaceC4339a6;
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q7.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q7, modifierMo3471e4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(c0213j);
                } else {
                    c28655q7.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a10);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m16);
                c0209i3 = C0217k.f732j;
                if (c28655q7.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N16);
                    if (state.getLeftIcon() != null) {
                        c28655q7.m87150e0(907072741);
                        int i310 = ((i15 << 3) & 57344) | 384;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        c0209i5 = c0209i2;
                        r10 = 0;
                        r14 = 1;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i310, 8);
                        interfaceC4339a9 = interfaceC4339a8;
                        c28655q7.m87173q(false);
                    } else {
                        interfaceC4339a9 = interfaceC4339a8;
                        c0209i5 = c0209i2;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        r10 = 0;
                        r14 = 1;
                        c28655q7.m87150e0(907383268);
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q7.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, r14);
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                    iHashCode2 = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q7.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement7);
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j2);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a11);
                    AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m17);
                    if (c28655q7.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N17);
                    strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                    strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                    strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                    if (strM21274h.length() > 0) {
                        c28655q7.m87150e0(-597034273);
                        Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d8 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t7, c38072d8.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                        C28655q c28655q1118 = c28655q7;
                        c28655q1118.m87173q(r10);
                        c28655q2 = c28655q1118;
                    } else {
                        c28655q7.m87150e0(-596770959);
                        c28655q7.m87173q(r10);
                        c28655q2 = c28655q7;
                    }
                    dataIcon = state.getDataIcon();
                    if (dataIcon == null) {
                        c28655q2.m87150e0(-596728087);
                        c28655q2.m87173q(r10);
                        i25 = 6;
                        c28655q3 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-596728086);
                        C28655q c28655q1119 = c28655q2;
                        C28655q c28655q11110 = c28655q1119;
                        float f117 = 8;
                        float f118 = ((float) r14) * f117;
                        i25 = 6;
                        AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q1119, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f117 * f14, AbstractC1099a.m3398t(c2314t, f118, f118, 0.0f, f118, 4)), C38072d.f163053a.m121949b(c28655q11110, 6).getBrandWhite(), c28655q11110, 384, 0);
                        c28655q11110.m87173q(r10);
                        c28655q3 = c28655q11110;
                    }
                    if (strM21274h2.length() > 0) {
                        c28655q3.m87150e0(-596240735);
                        Modifier modifier15 = modifier7;
                        Modifier modifierM3406c7 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier15));
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q3.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q3, modifierM3406c7);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a7);
                        AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m18);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N18);
                        c38072d = C38072d.f163053a;
                        modifier8 = modifier15;
                        C28655q c28655q11111 = c28655q3;
                        i26 = i25;
                        AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q11111, 0, 0, 196602);
                        c28655q5 = c28655q11111;
                        if (strM21274h3.length() > 0) {
                            AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                            C28655q c28655q11112 = c28655q5;
                            c28655q11112.m87173q(r10);
                            c28655q6 = c28655q11112;
                        } else {
                            c28655q5.m87150e0(-270166711);
                            c28655q5.m87173q(r10);
                            c28655q6 = c28655q5;
                        }
                        c28655q6.m87173q(r14);
                        c28655q6.m87173q(r10);
                        c28655q4 = c28655q6;
                    } else {
                        modifier8 = modifier7;
                        c28655q3.m87150e0(-595442671);
                        c28655q3.m87173q(r10);
                        c28655q4 = c28655q3;
                    }
                    c28655q4.m87173q(r14);
                    if (state.getRightIcon() != null) {
                        c28655q4.m87150e0(909492353);
                        interfaceC4339a10 = interfaceC4339a7;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                        c28655q4.m87173q(r10);
                    } else {
                        interfaceC4339a10 = interfaceC4339a7;
                        c28655q4.m87150e0(909806724);
                        AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q4.m87173q(r10);
                    }
                    c28655q4.m87173q(r14);
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    interfaceC4339a4 = interfaceC4339a10;
                    interfaceC4339a5 = interfaceC4339a9;
                    c28655q = c28655q4;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N16);
                if (state.getLeftIcon() != null) {
                    c28655q7.m87150e0(907072741);
                    int i311 = ((i15 << 3) & 57344) | 384;
                    c2306l2 = c2306l;
                    c0213j2 = c0213j;
                    c0209i5 = c0209i2;
                    r10 = 0;
                    r14 = 1;
                    AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i311, 8);
                    interfaceC4339a9 = interfaceC4339a8;
                    c28655q7.m87173q(false);
                } else {
                    interfaceC4339a9 = interfaceC4339a8;
                    c0209i5 = c0209i2;
                    c2306l2 = c2306l;
                    c0213j2 = c0213j;
                    r10 = 0;
                    r14 = 1;
                    c28655q7.m87150e0(907383268);
                    AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q7.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, r14);
                C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                iHashCode2 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q7.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement8);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(c0213j2);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a12);
                AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m19);
                if (c28655q7.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N19);
                strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                if (strM21274h.length() > 0) {
                    c28655q7.m87150e0(-597034273);
                    Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d9 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h, modifierM3398t8, c38072d9.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                    C28655q c28655q11113 = c28655q7;
                    c28655q11113.m87173q(r10);
                    c28655q2 = c28655q11113;
                } else {
                    c28655q7.m87150e0(-596770959);
                    c28655q7.m87173q(r10);
                    c28655q2 = c28655q7;
                }
                dataIcon = state.getDataIcon();
                if (dataIcon == null) {
                    c28655q2.m87150e0(-596728087);
                    c28655q2.m87173q(r10);
                    i25 = 6;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(-596728086);
                    C28655q c28655q11114 = c28655q2;
                    C28655q c28655q11115 = c28655q11114;
                    float f119 = 8;
                    float f1110 = ((float) r14) * f119;
                    i25 = 6;
                    AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q11114, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f119 * f14, AbstractC1099a.m3398t(c2314t, f1110, f1110, 0.0f, f1110, 4)), C38072d.f163053a.m121949b(c28655q11115, 6).getBrandWhite(), c28655q11115, 384, 0);
                    c28655q11115.m87173q(r10);
                    c28655q3 = c28655q11115;
                }
                if (strM21274h2.length() > 0) {
                    c28655q3.m87150e0(-596240735);
                    Modifier modifier16 = modifier7;
                    Modifier modifierM3406c8 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier16));
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q3.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q3, modifierM3406c8);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N110);
                    c38072d = C38072d.f163053a;
                    modifier8 = modifier16;
                    C28655q c28655q11116 = c28655q3;
                    i26 = i25;
                    AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q11116, 0, 0, 196602);
                    c28655q5 = c28655q11116;
                    if (strM21274h3.length() > 0) {
                        AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                        C28655q c28655q11117 = c28655q5;
                        c28655q11117.m87173q(r10);
                        c28655q6 = c28655q11117;
                    } else {
                        c28655q5.m87150e0(-270166711);
                        c28655q5.m87173q(r10);
                        c28655q6 = c28655q5;
                    }
                    c28655q6.m87173q(r14);
                    c28655q6.m87173q(r10);
                    c28655q4 = c28655q6;
                } else {
                    modifier8 = modifier7;
                    c28655q3.m87150e0(-595442671);
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                }
                c28655q4.m87173q(r14);
                if (state.getRightIcon() != null) {
                    c28655q4.m87150e0(909492353);
                    interfaceC4339a10 = interfaceC4339a7;
                    AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                    c28655q4.m87173q(r10);
                } else {
                    interfaceC4339a10 = interfaceC4339a7;
                    c28655q4.m87150e0(909806724);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q4.m87173q(r10);
                }
                c28655q4.m87173q(r14);
                modifier5 = modifier3;
                modifier6 = modifier8;
                interfaceC4339a4 = interfaceC4339a10;
                interfaceC4339a5 = interfaceC4339a9;
                c28655q = c28655q4;
            } else {
                c28655q7.m87138X();
                modifier5 = modifier3;
                modifier6 = modifier4;
                interfaceC4339a4 = interfaceC4339a3;
                interfaceC4339a5 = interfaceC4339a;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, state, interfaceC4339a5, interfaceC4339a4, i13, i14, 14);
            }
        }
        i15 |= 48;
        modifier4 = modifier2;
        if ((i13 & 384) == 0) {
            if (c28655q7.m87153g(state)) {
                i27 = 256;
            } else {
                i27 = 128;
            }
            i15 |= i27;
        }
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q7.m87157i(interfaceC4339a)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a3 = interfaceC4339a2;
                    if (c28655q7.m87157i(interfaceC4339a3)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q7.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i28 != 0) {
                        modifier3 = c2314t;
                    }
                    if (i29 != 0) {
                        modifier7 = c2314t;
                    } else {
                        modifier7 = modifier4;
                    }
                    obj = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q7.m87133R();
                        if (objM87133R2 == obj) {
                            objM87133R2 = new C27219a(15);
                            c28655q7.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q7.m87133R();
                        if (objM87133R == obj) {
                            objM87133R = new C27219a(16);
                            c28655q7.m87172p0(objM87133R);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    f13 = 4;
                    Modifier modifierMo3471e5 = AbstractC1099a.m3396r(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x), ((float) 1.5d) * f13, 0.0f, 2).mo3471e(modifier3);
                    C22961h c22961h5 = AbstractC22977m.f90656g;
                    c2306l = C2299e.f9107J;
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(c22961h5, c2306l, c28655q7, 6);
                    interfaceC4339a8 = interfaceC4339a6;
                    iHashCode = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q7.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q7, modifierMo3471e5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j);
                    } else {
                        c28655q7.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a13);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m111);
                    c0209i3 = C0217k.f732j;
                    if (c28655q7.f115903S) {
                        f14 = f13;
                        if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N111);
                        if (state.getLeftIcon() != null) {
                            c28655q7.m87150e0(907072741);
                            int i312 = ((i15 << 3) & 57344) | 384;
                            c2306l2 = c2306l;
                            c0213j2 = c0213j;
                            c0209i5 = c0209i2;
                            r10 = 0;
                            r14 = 1;
                            AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i312, 8);
                            interfaceC4339a9 = interfaceC4339a8;
                            c28655q7.m87173q(false);
                        } else {
                            interfaceC4339a9 = interfaceC4339a8;
                            c0209i5 = c0209i2;
                            c2306l2 = c2306l;
                            c0213j2 = c0213j;
                            r10 = 0;
                            r14 = 1;
                            c28655q7.m87150e0(907383268);
                            AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q7.m87173q(false);
                        }
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(1.0f, r14);
                        C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                        iHashCode2 = Long.hashCode(c28655q7.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q7.m87165m();
                        Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement9);
                        c28655q7.m87158i0();
                        if (c28655q7.f115903S) {
                            c28655q7.m87163l(c0213j2);
                        } else {
                            c28655q7.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a14);
                        AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m112);
                        if (c28655q7.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N112);
                        strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                        strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                        strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                        if (strM21274h.length() > 0) {
                            c28655q7.m87150e0(-597034273);
                            Modifier modifierM3398t9 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                            C38072d c38072d10 = C38072d.f163053a;
                            AbstractC30795n.m94707h(strM21274h, modifierM3398t9, c38072d10.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d10.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                            C28655q c28655q11118 = c28655q7;
                            c28655q11118.m87173q(r10);
                            c28655q2 = c28655q11118;
                        } else {
                            c28655q7.m87150e0(-596770959);
                            c28655q7.m87173q(r10);
                            c28655q2 = c28655q7;
                        }
                        dataIcon = state.getDataIcon();
                        if (dataIcon == null) {
                            c28655q2.m87150e0(-596728087);
                            c28655q2.m87173q(r10);
                            i25 = 6;
                            c28655q3 = c28655q2;
                        } else {
                            c28655q2.m87150e0(-596728086);
                            C28655q c28655q11119 = c28655q2;
                            C28655q c28655q111110 = c28655q11119;
                            float f1111 = 8;
                            float f1112 = ((float) r14) * f1111;
                            i25 = 6;
                            AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q11119, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f1111 * f14, AbstractC1099a.m3398t(c2314t, f1112, f1112, 0.0f, f1112, 4)), C38072d.f163053a.m121949b(c28655q111110, 6).getBrandWhite(), c28655q111110, 384, 0);
                            c28655q111110.m87173q(r10);
                            c28655q3 = c28655q111110;
                        }
                        if (strM21274h2.length() > 0) {
                            c28655q3.m87150e0(-596240735);
                            Modifier modifier17 = modifier7;
                            Modifier modifierM3406c9 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier17));
                            C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q3.m87165m();
                            Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q3, modifierM3406c9);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j2);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a9);
                            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m113);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N113);
                            c38072d = C38072d.f163053a;
                            modifier8 = modifier17;
                            C28655q c28655q111111 = c28655q3;
                            i26 = i25;
                            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q111111, 0, 0, 196602);
                            c28655q5 = c28655q111111;
                            if (strM21274h3.length() > 0) {
                                AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                                C28655q c28655q111112 = c28655q5;
                                c28655q111112.m87173q(r10);
                                c28655q6 = c28655q111112;
                            } else {
                                c28655q5.m87150e0(-270166711);
                                c28655q5.m87173q(r10);
                                c28655q6 = c28655q5;
                            }
                            c28655q6.m87173q(r14);
                            c28655q6.m87173q(r10);
                            c28655q4 = c28655q6;
                        } else {
                            modifier8 = modifier7;
                            c28655q3.m87150e0(-595442671);
                            c28655q3.m87173q(r10);
                            c28655q4 = c28655q3;
                        }
                        c28655q4.m87173q(r14);
                        if (state.getRightIcon() != null) {
                            c28655q4.m87150e0(909492353);
                            interfaceC4339a10 = interfaceC4339a7;
                            AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                            c28655q4.m87173q(r10);
                        } else {
                            interfaceC4339a10 = interfaceC4339a7;
                            c28655q4.m87150e0(909806724);
                            AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                            c28655q4.m87173q(r10);
                        }
                        c28655q4.m87173q(r14);
                        modifier5 = modifier3;
                        modifier6 = modifier8;
                        interfaceC4339a4 = interfaceC4339a10;
                        interfaceC4339a5 = interfaceC4339a9;
                        c28655q = c28655q4;
                    } else {
                        f14 = f13;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N111);
                    if (state.getLeftIcon() != null) {
                        c28655q7.m87150e0(907072741);
                        int i313 = ((i15 << 3) & 57344) | 384;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        c0209i5 = c0209i2;
                        r10 = 0;
                        r14 = 1;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i313, 8);
                        interfaceC4339a9 = interfaceC4339a8;
                        c28655q7.m87173q(false);
                    } else {
                        interfaceC4339a9 = interfaceC4339a8;
                        c0209i5 = c0209i2;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        r10 = 0;
                        r14 = 1;
                        c28655q7.m87150e0(907383268);
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q7.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement10 = new LayoutWeightElement(1.0f, r14);
                    C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                    iHashCode2 = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q7.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement10);
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j2);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a15);
                    AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m114);
                    if (c28655q7.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N114);
                    strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                    strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                    strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                    if (strM21274h.length() > 0) {
                        c28655q7.m87150e0(-597034273);
                        Modifier modifierM3398t10 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d11 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t10, c38072d11.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                        C28655q c28655q111113 = c28655q7;
                        c28655q111113.m87173q(r10);
                        c28655q2 = c28655q111113;
                    } else {
                        c28655q7.m87150e0(-596770959);
                        c28655q7.m87173q(r10);
                        c28655q2 = c28655q7;
                    }
                    dataIcon = state.getDataIcon();
                    if (dataIcon == null) {
                        c28655q2.m87150e0(-596728087);
                        c28655q2.m87173q(r10);
                        i25 = 6;
                        c28655q3 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-596728086);
                        C28655q c28655q111114 = c28655q2;
                        C28655q c28655q111115 = c28655q111114;
                        float f1113 = 8;
                        float f1114 = ((float) r14) * f1113;
                        i25 = 6;
                        AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q111114, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f1113 * f14, AbstractC1099a.m3398t(c2314t, f1114, f1114, 0.0f, f1114, 4)), C38072d.f163053a.m121949b(c28655q111115, 6).getBrandWhite(), c28655q111115, 384, 0);
                        c28655q111115.m87173q(r10);
                        c28655q3 = c28655q111115;
                    }
                    if (strM21274h2.length() > 0) {
                        c28655q3.m87150e0(-596240735);
                        Modifier modifier18 = modifier7;
                        Modifier modifierM3406c10 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier18));
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q3.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q3, modifierM3406c10);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m115);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N115);
                        c38072d = C38072d.f163053a;
                        modifier8 = modifier18;
                        C28655q c28655q111116 = c28655q3;
                        i26 = i25;
                        AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q111116, 0, 0, 196602);
                        c28655q5 = c28655q111116;
                        if (strM21274h3.length() > 0) {
                            AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                            C28655q c28655q111117 = c28655q5;
                            c28655q111117.m87173q(r10);
                            c28655q6 = c28655q111117;
                        } else {
                            c28655q5.m87150e0(-270166711);
                            c28655q5.m87173q(r10);
                            c28655q6 = c28655q5;
                        }
                        c28655q6.m87173q(r14);
                        c28655q6.m87173q(r10);
                        c28655q4 = c28655q6;
                    } else {
                        modifier8 = modifier7;
                        c28655q3.m87150e0(-595442671);
                        c28655q3.m87173q(r10);
                        c28655q4 = c28655q3;
                    }
                    c28655q4.m87173q(r14);
                    if (state.getRightIcon() != null) {
                        c28655q4.m87150e0(909492353);
                        interfaceC4339a10 = interfaceC4339a7;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                        c28655q4.m87173q(r10);
                    } else {
                        interfaceC4339a10 = interfaceC4339a7;
                        c28655q4.m87150e0(909806724);
                        AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q4.m87173q(r10);
                    }
                    c28655q4.m87173q(r14);
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    interfaceC4339a4 = interfaceC4339a10;
                    interfaceC4339a5 = interfaceC4339a9;
                    c28655q = c28655q4;
                } else {
                    c28655q7.m87138X();
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                    interfaceC4339a4 = interfaceC4339a3;
                    interfaceC4339a5 = interfaceC4339a;
                    c28655q = c28655q7;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, state, interfaceC4339a5, interfaceC4339a4, i13, i14, 14);
                }
            }
            i15 |= 24576;
            interfaceC4339a3 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier3 = c2314t;
                }
                if (i29 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier4;
                }
                obj = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q7.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C27219a(15);
                        c28655q7.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    i24 = i18;
                } else {
                    i24 = i18;
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i24 != 0) {
                    objM87133R = c28655q7.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = new C27219a(16);
                        c28655q7.m87172p0(objM87133R);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                f13 = 4;
                Modifier modifierMo3471e6 = AbstractC1099a.m3396r(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x), ((float) 1.5d) * f13, 0.0f, 2).mo3471e(modifier3);
                C22961h c22961h6 = AbstractC22977m.f90656g;
                c2306l = C2299e.f9107J;
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(c22961h6, c2306l, c28655q7, 6);
                interfaceC4339a8 = interfaceC4339a6;
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q7.m87165m();
                Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q7, modifierMo3471e6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(c0213j);
                } else {
                    c28655q7.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a16);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m116);
                c0209i3 = C0217k.f732j;
                if (c28655q7.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N116);
                    if (state.getLeftIcon() != null) {
                        c28655q7.m87150e0(907072741);
                        int i314 = ((i15 << 3) & 57344) | 384;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        c0209i5 = c0209i2;
                        r10 = 0;
                        r14 = 1;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i314, 8);
                        interfaceC4339a9 = interfaceC4339a8;
                        c28655q7.m87173q(false);
                    } else {
                        interfaceC4339a9 = interfaceC4339a8;
                        c0209i5 = c0209i2;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        r10 = 0;
                        r14 = 1;
                        c28655q7.m87150e0(907383268);
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q7.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement11 = new LayoutWeightElement(1.0f, r14);
                    C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                    iHashCode2 = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q7.m87165m();
                    Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement11);
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j2);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a17);
                    AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m117);
                    if (c28655q7.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N117);
                    strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                    strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                    strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                    if (strM21274h.length() > 0) {
                        c28655q7.m87150e0(-597034273);
                        Modifier modifierM3398t11 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d12 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t11, c38072d12.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d12.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                        C28655q c28655q111118 = c28655q7;
                        c28655q111118.m87173q(r10);
                        c28655q2 = c28655q111118;
                    } else {
                        c28655q7.m87150e0(-596770959);
                        c28655q7.m87173q(r10);
                        c28655q2 = c28655q7;
                    }
                    dataIcon = state.getDataIcon();
                    if (dataIcon == null) {
                        c28655q2.m87150e0(-596728087);
                        c28655q2.m87173q(r10);
                        i25 = 6;
                        c28655q3 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-596728086);
                        C28655q c28655q111119 = c28655q2;
                        C28655q c28655q1111110 = c28655q111119;
                        float f1115 = 8;
                        float f1116 = ((float) r14) * f1115;
                        i25 = 6;
                        AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q111119, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f1115 * f14, AbstractC1099a.m3398t(c2314t, f1116, f1116, 0.0f, f1116, 4)), C38072d.f163053a.m121949b(c28655q1111110, 6).getBrandWhite(), c28655q1111110, 384, 0);
                        c28655q1111110.m87173q(r10);
                        c28655q3 = c28655q1111110;
                    }
                    if (strM21274h2.length() > 0) {
                        c28655q3.m87150e0(-596240735);
                        Modifier modifier19 = modifier7;
                        Modifier modifierM3406c11 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier19));
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q3.m87165m();
                        Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q3, modifierM3406c11);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a11);
                        AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m118);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N118);
                        c38072d = C38072d.f163053a;
                        modifier8 = modifier19;
                        C28655q c28655q1111111 = c28655q3;
                        i26 = i25;
                        AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q1111111, 0, 0, 196602);
                        c28655q5 = c28655q1111111;
                        if (strM21274h3.length() > 0) {
                            AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                            C28655q c28655q1111112 = c28655q5;
                            c28655q1111112.m87173q(r10);
                            c28655q6 = c28655q1111112;
                        } else {
                            c28655q5.m87150e0(-270166711);
                            c28655q5.m87173q(r10);
                            c28655q6 = c28655q5;
                        }
                        c28655q6.m87173q(r14);
                        c28655q6.m87173q(r10);
                        c28655q4 = c28655q6;
                    } else {
                        modifier8 = modifier7;
                        c28655q3.m87150e0(-595442671);
                        c28655q3.m87173q(r10);
                        c28655q4 = c28655q3;
                    }
                    c28655q4.m87173q(r14);
                    if (state.getRightIcon() != null) {
                        c28655q4.m87150e0(909492353);
                        interfaceC4339a10 = interfaceC4339a7;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                        c28655q4.m87173q(r10);
                    } else {
                        interfaceC4339a10 = interfaceC4339a7;
                        c28655q4.m87150e0(909806724);
                        AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q4.m87173q(r10);
                    }
                    c28655q4.m87173q(r14);
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    interfaceC4339a4 = interfaceC4339a10;
                    interfaceC4339a5 = interfaceC4339a9;
                    c28655q = c28655q4;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N116);
                if (state.getLeftIcon() != null) {
                    c28655q7.m87150e0(907072741);
                    int i315 = ((i15 << 3) & 57344) | 384;
                    c2306l2 = c2306l;
                    c0213j2 = c0213j;
                    c0209i5 = c0209i2;
                    r10 = 0;
                    r14 = 1;
                    AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i315, 8);
                    interfaceC4339a9 = interfaceC4339a8;
                    c28655q7.m87173q(false);
                } else {
                    interfaceC4339a9 = interfaceC4339a8;
                    c0209i5 = c0209i2;
                    c2306l2 = c2306l;
                    c0213j2 = c0213j;
                    r10 = 0;
                    r14 = 1;
                    c28655q7.m87150e0(907383268);
                    AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q7.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement12 = new LayoutWeightElement(1.0f, r14);
                C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                iHashCode2 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q7.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement12);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(c0213j2);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a18);
                AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m119);
                if (c28655q7.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N119);
                strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                if (strM21274h.length() > 0) {
                    c28655q7.m87150e0(-597034273);
                    Modifier modifierM3398t12 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d13 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h, modifierM3398t12, c38072d13.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d13.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                    C28655q c28655q1111113 = c28655q7;
                    c28655q1111113.m87173q(r10);
                    c28655q2 = c28655q1111113;
                } else {
                    c28655q7.m87150e0(-596770959);
                    c28655q7.m87173q(r10);
                    c28655q2 = c28655q7;
                }
                dataIcon = state.getDataIcon();
                if (dataIcon == null) {
                    c28655q2.m87150e0(-596728087);
                    c28655q2.m87173q(r10);
                    i25 = 6;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(-596728086);
                    C28655q c28655q1111114 = c28655q2;
                    C28655q c28655q1111115 = c28655q1111114;
                    float f1117 = 8;
                    float f1118 = ((float) r14) * f1117;
                    i25 = 6;
                    AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q1111114, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f1117 * f14, AbstractC1099a.m3398t(c2314t, f1118, f1118, 0.0f, f1118, 4)), C38072d.f163053a.m121949b(c28655q1111115, 6).getBrandWhite(), c28655q1111115, 384, 0);
                    c28655q1111115.m87173q(r10);
                    c28655q3 = c28655q1111115;
                }
                if (strM21274h2.length() > 0) {
                    c28655q3.m87150e0(-596240735);
                    Modifier modifier110 = modifier7;
                    Modifier modifierM3406c12 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier110));
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q3.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q3, modifierM3406c12);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m1110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N1110);
                    c38072d = C38072d.f163053a;
                    modifier8 = modifier110;
                    C28655q c28655q1111116 = c28655q3;
                    i26 = i25;
                    AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q1111116, 0, 0, 196602);
                    c28655q5 = c28655q1111116;
                    if (strM21274h3.length() > 0) {
                        AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                        C28655q c28655q1111117 = c28655q5;
                        c28655q1111117.m87173q(r10);
                        c28655q6 = c28655q1111117;
                    } else {
                        c28655q5.m87150e0(-270166711);
                        c28655q5.m87173q(r10);
                        c28655q6 = c28655q5;
                    }
                    c28655q6.m87173q(r14);
                    c28655q6.m87173q(r10);
                    c28655q4 = c28655q6;
                } else {
                    modifier8 = modifier7;
                    c28655q3.m87150e0(-595442671);
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                }
                c28655q4.m87173q(r14);
                if (state.getRightIcon() != null) {
                    c28655q4.m87150e0(909492353);
                    interfaceC4339a10 = interfaceC4339a7;
                    AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                    c28655q4.m87173q(r10);
                } else {
                    interfaceC4339a10 = interfaceC4339a7;
                    c28655q4.m87150e0(909806724);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q4.m87173q(r10);
                }
                c28655q4.m87173q(r14);
                modifier5 = modifier3;
                modifier6 = modifier8;
                interfaceC4339a4 = interfaceC4339a10;
                interfaceC4339a5 = interfaceC4339a9;
                c28655q = c28655q4;
            } else {
                c28655q7.m87138X();
                modifier5 = modifier3;
                modifier6 = modifier4;
                interfaceC4339a4 = interfaceC4339a3;
                interfaceC4339a5 = interfaceC4339a;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, state, interfaceC4339a5, interfaceC4339a4, i13, i14, 14);
            }
        }
        i15 |= 3072;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a3 = interfaceC4339a2;
                if (c28655q7.m87157i(interfaceC4339a3)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i28 != 0) {
                    modifier3 = c2314t;
                }
                if (i29 != 0) {
                    modifier7 = c2314t;
                } else {
                    modifier7 = modifier4;
                }
                obj = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q7.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C27219a(15);
                        c28655q7.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    i24 = i18;
                } else {
                    i24 = i18;
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i24 != 0) {
                    objM87133R = c28655q7.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = new C27219a(16);
                        c28655q7.m87172p0(objM87133R);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                f13 = 4;
                Modifier modifierMo3471e7 = AbstractC1099a.m3396r(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x), ((float) 1.5d) * f13, 0.0f, 2).mo3471e(modifier3);
                C22961h c22961h7 = AbstractC22977m.f90656g;
                c2306l = C2299e.f9107J;
                C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(c22961h7, c2306l, c28655q7, 6);
                interfaceC4339a8 = interfaceC4339a6;
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q7.m87165m();
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q7, modifierMo3471e7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(c0213j);
                } else {
                    c28655q7.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a19);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m1111);
                c0209i3 = C0217k.f732j;
                if (c28655q7.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N1111);
                    if (state.getLeftIcon() != null) {
                        c28655q7.m87150e0(907072741);
                        int i316 = ((i15 << 3) & 57344) | 384;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        c0209i5 = c0209i2;
                        r10 = 0;
                        r14 = 1;
                        AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i316, 8);
                        interfaceC4339a9 = interfaceC4339a8;
                        c28655q7.m87173q(false);
                    } else {
                        interfaceC4339a9 = interfaceC4339a8;
                        c0209i5 = c0209i2;
                        c2306l2 = c2306l;
                        c0213j2 = c0213j;
                        r10 = 0;
                        r14 = 1;
                        c28655q7.m87150e0(907383268);
                        AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q7.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement13 = new LayoutWeightElement(1.0f, r14);
                    C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                    iHashCode2 = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q7.m87165m();
                    Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement13);
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j2);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a110);
                    AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m1112);
                    if (c28655q7.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N1112);
                    strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                    strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                    strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                    if (strM21274h.length() > 0) {
                        c28655q7.m87150e0(-597034273);
                        Modifier modifierM3398t13 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                        C38072d c38072d14 = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21274h, modifierM3398t13, c38072d14.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d14.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                        C28655q c28655q1111118 = c28655q7;
                        c28655q1111118.m87173q(r10);
                        c28655q2 = c28655q1111118;
                    } else {
                        c28655q7.m87150e0(-596770959);
                        c28655q7.m87173q(r10);
                        c28655q2 = c28655q7;
                    }
                    dataIcon = state.getDataIcon();
                    if (dataIcon == null) {
                        c28655q2.m87150e0(-596728087);
                        c28655q2.m87173q(r10);
                        i25 = 6;
                        c28655q3 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-596728086);
                        C28655q c28655q1111119 = c28655q2;
                        C28655q c28655q11111110 = c28655q1111119;
                        float f1119 = 8;
                        float f11110 = ((float) r14) * f1119;
                        i25 = 6;
                        AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q1111119, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f1119 * f14, AbstractC1099a.m3398t(c2314t, f11110, f11110, 0.0f, f11110, 4)), C38072d.f163053a.m121949b(c28655q11111110, 6).getBrandWhite(), c28655q11111110, 384, 0);
                        c28655q11111110.m87173q(r10);
                        c28655q3 = c28655q11111110;
                    }
                    if (strM21274h2.length() > 0) {
                        c28655q3.m87150e0(-596240735);
                        Modifier modifier111 = modifier7;
                        Modifier modifierM3406c13 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier111));
                        C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q3.m87165m();
                        Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q3, modifierM3406c13);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a13);
                        AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m1113);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N1113);
                        c38072d = C38072d.f163053a;
                        modifier8 = modifier111;
                        C28655q c28655q11111111 = c28655q3;
                        i26 = i25;
                        AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q11111111, 0, 0, 196602);
                        c28655q5 = c28655q11111111;
                        if (strM21274h3.length() > 0) {
                            AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                            C28655q c28655q11111112 = c28655q5;
                            c28655q11111112.m87173q(r10);
                            c28655q6 = c28655q11111112;
                        } else {
                            c28655q5.m87150e0(-270166711);
                            c28655q5.m87173q(r10);
                            c28655q6 = c28655q5;
                        }
                        c28655q6.m87173q(r14);
                        c28655q6.m87173q(r10);
                        c28655q4 = c28655q6;
                    } else {
                        modifier8 = modifier7;
                        c28655q3.m87150e0(-595442671);
                        c28655q3.m87173q(r10);
                        c28655q4 = c28655q3;
                    }
                    c28655q4.m87173q(r14);
                    if (state.getRightIcon() != null) {
                        c28655q4.m87150e0(909492353);
                        interfaceC4339a10 = interfaceC4339a7;
                        AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                        c28655q4.m87173q(r10);
                    } else {
                        interfaceC4339a10 = interfaceC4339a7;
                        c28655q4.m87150e0(909806724);
                        AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                        c28655q4.m87173q(r10);
                    }
                    c28655q4.m87173q(r14);
                    modifier5 = modifier3;
                    modifier6 = modifier8;
                    interfaceC4339a4 = interfaceC4339a10;
                    interfaceC4339a5 = interfaceC4339a9;
                    c28655q = c28655q4;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N1111);
                if (state.getLeftIcon() != null) {
                    c28655q7.m87150e0(907072741);
                    int i317 = ((i15 << 3) & 57344) | 384;
                    c2306l2 = c2306l;
                    c0213j2 = c0213j;
                    c0209i5 = c0209i2;
                    r10 = 0;
                    r14 = 1;
                    AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i317, 8);
                    interfaceC4339a9 = interfaceC4339a8;
                    c28655q7.m87173q(false);
                } else {
                    interfaceC4339a9 = interfaceC4339a8;
                    c0209i5 = c0209i2;
                    c2306l2 = c2306l;
                    c0213j2 = c0213j;
                    r10 = 0;
                    r14 = 1;
                    c28655q7.m87150e0(907383268);
                    AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q7.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement14 = new LayoutWeightElement(1.0f, r14);
                C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                iHashCode2 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q7.m87165m();
                Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement14);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(c0213j2);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a111);
                AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m1114);
                if (c28655q7.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N1114);
                strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                if (strM21274h.length() > 0) {
                    c28655q7.m87150e0(-597034273);
                    Modifier modifierM3398t14 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d15 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h, modifierM3398t14, c38072d15.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d15.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                    C28655q c28655q11111113 = c28655q7;
                    c28655q11111113.m87173q(r10);
                    c28655q2 = c28655q11111113;
                } else {
                    c28655q7.m87150e0(-596770959);
                    c28655q7.m87173q(r10);
                    c28655q2 = c28655q7;
                }
                dataIcon = state.getDataIcon();
                if (dataIcon == null) {
                    c28655q2.m87150e0(-596728087);
                    c28655q2.m87173q(r10);
                    i25 = 6;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(-596728086);
                    C28655q c28655q11111114 = c28655q2;
                    C28655q c28655q11111115 = c28655q11111114;
                    float f11111 = 8;
                    float f11112 = ((float) r14) * f11111;
                    i25 = 6;
                    AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q11111114, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f11111 * f14, AbstractC1099a.m3398t(c2314t, f11112, f11112, 0.0f, f11112, 4)), C38072d.f163053a.m121949b(c28655q11111115, 6).getBrandWhite(), c28655q11111115, 384, 0);
                    c28655q11111115.m87173q(r10);
                    c28655q3 = c28655q11111115;
                }
                if (strM21274h2.length() > 0) {
                    c28655q3.m87150e0(-596240735);
                    Modifier modifier112 = modifier7;
                    Modifier modifierM3406c14 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier112));
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q3.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q3, modifierM3406c14);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a14);
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m1115);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N1115);
                    c38072d = C38072d.f163053a;
                    modifier8 = modifier112;
                    C28655q c28655q11111116 = c28655q3;
                    i26 = i25;
                    AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q11111116, 0, 0, 196602);
                    c28655q5 = c28655q11111116;
                    if (strM21274h3.length() > 0) {
                        AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                        C28655q c28655q11111117 = c28655q5;
                        c28655q11111117.m87173q(r10);
                        c28655q6 = c28655q11111117;
                    } else {
                        c28655q5.m87150e0(-270166711);
                        c28655q5.m87173q(r10);
                        c28655q6 = c28655q5;
                    }
                    c28655q6.m87173q(r14);
                    c28655q6.m87173q(r10);
                    c28655q4 = c28655q6;
                } else {
                    modifier8 = modifier7;
                    c28655q3.m87150e0(-595442671);
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                }
                c28655q4.m87173q(r14);
                if (state.getRightIcon() != null) {
                    c28655q4.m87150e0(909492353);
                    interfaceC4339a10 = interfaceC4339a7;
                    AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                    c28655q4.m87173q(r10);
                } else {
                    interfaceC4339a10 = interfaceC4339a7;
                    c28655q4.m87150e0(909806724);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q4.m87173q(r10);
                }
                c28655q4.m87173q(r14);
                modifier5 = modifier3;
                modifier6 = modifier8;
                interfaceC4339a4 = interfaceC4339a10;
                interfaceC4339a5 = interfaceC4339a9;
                c28655q = c28655q4;
            } else {
                c28655q7.m87138X();
                modifier5 = modifier3;
                modifier6 = modifier4;
                interfaceC4339a4 = interfaceC4339a3;
                interfaceC4339a5 = interfaceC4339a;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, state, interfaceC4339a5, interfaceC4339a4, i13, i14, 14);
            }
        }
        i15 |= 24576;
        interfaceC4339a3 = interfaceC4339a2;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q7.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i28 != 0) {
                modifier3 = c2314t;
            }
            if (i29 != 0) {
                modifier7 = c2314t;
            } else {
                modifier7 = modifier4;
            }
            obj = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q7.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C27219a(15);
                    c28655q7.m87172p0(objM87133R2);
                }
                interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                i24 = i18;
            } else {
                i24 = i18;
                interfaceC4339a6 = interfaceC4339a;
            }
            if (i24 != 0) {
                objM87133R = c28655q7.m87133R();
                if (objM87133R == obj) {
                    objM87133R = new C27219a(16);
                    c28655q7.m87172p0(objM87133R);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            f13 = 4;
            Modifier modifierMo3471e8 = AbstractC1099a.m3396r(AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x), ((float) 1.5d) * f13, 0.0f, 2).mo3471e(modifier3);
            C22961h c22961h8 = AbstractC22977m.f90656g;
            c2306l = C2299e.f9107J;
            C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(c22961h8, c2306l, c28655q7, 6);
            interfaceC4339a8 = interfaceC4339a6;
            iHashCode = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q7.m87165m();
            Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q7, modifierMo3471e8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(c0213j);
            } else {
                c28655q7.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a112);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q7, c0209i2, interfaceC28653p1M87165m1116);
            c0209i3 = C0217k.f732j;
            if (c28655q7.f115903S) {
                f14 = f13;
                if (!AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N1116);
                if (state.getLeftIcon() != null) {
                    c28655q7.m87150e0(907072741);
                    int i318 = ((i15 << 3) & 57344) | 384;
                    c2306l2 = c2306l;
                    c0213j2 = c0213j;
                    c0209i5 = c0209i2;
                    r10 = 0;
                    r14 = 1;
                    AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i318, 8);
                    interfaceC4339a9 = interfaceC4339a8;
                    c28655q7.m87173q(false);
                } else {
                    interfaceC4339a9 = interfaceC4339a8;
                    c0209i5 = c0209i2;
                    c2306l2 = c2306l;
                    c0213j2 = c0213j;
                    r10 = 0;
                    r14 = 1;
                    c28655q7.m87150e0(907383268);
                    AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q7.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement15 = new LayoutWeightElement(1.0f, r14);
                C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
                iHashCode2 = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q7.m87165m();
                Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement15);
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(c0213j2);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a113);
                AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m1117);
                if (c28655q7.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N1117);
                strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
                strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
                strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
                if (strM21274h.length() > 0) {
                    c28655q7.m87150e0(-597034273);
                    Modifier modifierM3398t15 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                    C38072d c38072d16 = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21274h, modifierM3398t15, c38072d16.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d16.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                    C28655q c28655q11111118 = c28655q7;
                    c28655q11111118.m87173q(r10);
                    c28655q2 = c28655q11111118;
                } else {
                    c28655q7.m87150e0(-596770959);
                    c28655q7.m87173q(r10);
                    c28655q2 = c28655q7;
                }
                dataIcon = state.getDataIcon();
                if (dataIcon == null) {
                    c28655q2.m87150e0(-596728087);
                    c28655q2.m87173q(r10);
                    i25 = 6;
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(-596728086);
                    C28655q c28655q11111119 = c28655q2;
                    C28655q c28655q111111110 = c28655q11111119;
                    float f11113 = 8;
                    float f11114 = ((float) r14) * f11113;
                    i25 = 6;
                    AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q11111119, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f11113 * f14, AbstractC1099a.m3398t(c2314t, f11114, f11114, 0.0f, f11114, 4)), C38072d.f163053a.m121949b(c28655q111111110, 6).getBrandWhite(), c28655q111111110, 384, 0);
                    c28655q111111110.m87173q(r10);
                    c28655q3 = c28655q111111110;
                }
                if (strM21274h2.length() > 0) {
                    c28655q3.m87150e0(-596240735);
                    Modifier modifier113 = modifier7;
                    Modifier modifierM3406c15 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier113));
                    C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q3.m87165m();
                    Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q3, modifierM3406c15);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a15);
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m1118);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N1118);
                    c38072d = C38072d.f163053a;
                    modifier8 = modifier113;
                    C28655q c28655q111111111 = c28655q3;
                    i26 = i25;
                    AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q111111111, 0, 0, 196602);
                    c28655q5 = c28655q111111111;
                    if (strM21274h3.length() > 0) {
                        AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                        C28655q c28655q111111112 = c28655q5;
                        c28655q111111112.m87173q(r10);
                        c28655q6 = c28655q111111112;
                    } else {
                        c28655q5.m87150e0(-270166711);
                        c28655q5.m87173q(r10);
                        c28655q6 = c28655q5;
                    }
                    c28655q6.m87173q(r14);
                    c28655q6.m87173q(r10);
                    c28655q4 = c28655q6;
                } else {
                    modifier8 = modifier7;
                    c28655q3.m87150e0(-595442671);
                    c28655q3.m87173q(r10);
                    c28655q4 = c28655q3;
                }
                c28655q4.m87173q(r14);
                if (state.getRightIcon() != null) {
                    c28655q4.m87150e0(909492353);
                    interfaceC4339a10 = interfaceC4339a7;
                    AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                    c28655q4.m87173q(r10);
                } else {
                    interfaceC4339a10 = interfaceC4339a7;
                    c28655q4.m87150e0(909806724);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                    c28655q4.m87173q(r10);
                }
                c28655q4.m87173q(r14);
                modifier5 = modifier3;
                modifier6 = modifier8;
                interfaceC4339a4 = interfaceC4339a10;
                interfaceC4339a5 = interfaceC4339a9;
                c28655q = c28655q4;
            } else {
                f14 = f13;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N1116);
            if (state.getLeftIcon() != null) {
                c28655q7.m87150e0(907072741);
                int i319 = ((i15 << 3) & 57344) | 384;
                c2306l2 = c2306l;
                c0213j2 = c0213j;
                c0209i5 = c0209i2;
                r10 = 0;
                r14 = 1;
                AbstractC27242b1.m82092d(new C27270o(state.getLeftIconButtonType(), state.getLeftIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionLeftIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a8, c28655q7, i319, 8);
                interfaceC4339a9 = interfaceC4339a8;
                c28655q7.m87173q(false);
            } else {
                interfaceC4339a9 = interfaceC4339a8;
                c0209i5 = c0209i2;
                c2306l2 = c2306l;
                c0213j2 = c0213j;
                r10 = 0;
                r14 = 1;
                c28655q7.m87150e0(907383268);
                AbstractC22953f.m66715b(c28655q7, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                c28655q7.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement16 = new LayoutWeightElement(1.0f, r14);
            C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q7, 54);
            iHashCode2 = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q7.m87165m();
            Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement16);
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(c0213j2);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, c0209i, c22994r1M66759a114);
            AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m1119);
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q7, c0209i4, modifierM118962N1119);
            strM21274h = AbstractC8693b.m21274h(state.getData(), c28655q7, r10);
            strM21274h2 = AbstractC8693b.m21274h(state.getTitle(), c28655q7, r10);
            strM21274h3 = AbstractC8693b.m21274h(state.getSubtitle(), c28655q7, r10);
            if (strM21274h.length() > 0) {
                c28655q7.m87150e0(-597034273);
                Modifier modifierM3398t16 = AbstractC1099a.m3398t(c2314t, ((float) r14) * 8, 0.0f, 0.0f, 0.0f, 14);
                C38072d c38072d17 = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, modifierM3398t16, c38072d17.m121949b(c28655q7, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d17.m121952e(c28655q7, 6).getN4(), null, c28655q7, 48, 0, 196600);
                C28655q c28655q111111113 = c28655q7;
                c28655q111111113.m87173q(r10);
                c28655q2 = c28655q111111113;
            } else {
                c28655q7.m87150e0(-596770959);
                c28655q7.m87173q(r10);
                c28655q2 = c28655q7;
            }
            dataIcon = state.getDataIcon();
            if (dataIcon == null) {
                c28655q2.m87150e0(-596728087);
                c28655q2.m87173q(r10);
                i25 = 6;
                c28655q3 = c28655q2;
            } else {
                c28655q2.m87150e0(-596728086);
                C28655q c28655q111111114 = c28655q2;
                C28655q c28655q111111115 = c28655q111111114;
                float f11115 = 8;
                float f11116 = ((float) r14) * f11115;
                i25 = 6;
                AbstractC15005f3.m43107a(AbstractC22404p.m64500i(dataIcon, null, null, c28655q111111114, 0, 3), state.getContentDescriptionDataIcon(), AbstractC1102d.m3419p(f11115 * f14, AbstractC1099a.m3398t(c2314t, f11116, f11116, 0.0f, f11116, 4)), C38072d.f163053a.m121949b(c28655q111111115, 6).getBrandWhite(), c28655q111111115, 384, 0);
                c28655q111111115.m87173q(r10);
                c28655q3 = c28655q111111115;
            }
            if (strM21274h2.length() > 0) {
                c28655q3.m87150e0(-596240735);
                Modifier modifier114 = modifier7;
                Modifier modifierM3406c16 = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3394p(((float) r14) * 8, modifier114));
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q3.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q3, modifierM3406c16);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a16);
                AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m11110);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N11110);
                c38072d = C38072d.f163053a;
                modifier8 = modifier114;
                C28655q c28655q111111116 = c28655q3;
                i26 = i25;
                AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q3, i25).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getH4(), null, c28655q111111116, 0, 0, 196602);
                c28655q5 = c28655q111111116;
                if (strM21274h3.length() > 0) {
                    AbstractC30795n.m94707h(strM21274h3, null, AbstractC31061c.m95627c(c28655q5, -270409844, c38072d, c28655q5, i26), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i26).getB4(), null, c28655q5, 0, 0, 196602);
                    C28655q c28655q111111117 = c28655q5;
                    c28655q111111117.m87173q(r10);
                    c28655q6 = c28655q111111117;
                } else {
                    c28655q5.m87150e0(-270166711);
                    c28655q5.m87173q(r10);
                    c28655q6 = c28655q5;
                }
                c28655q6.m87173q(r14);
                c28655q6.m87173q(r10);
                c28655q4 = c28655q6;
            } else {
                modifier8 = modifier7;
                c28655q3.m87150e0(-595442671);
                c28655q3.m87173q(r10);
                c28655q4 = c28655q3;
            }
            c28655q4.m87173q(r14);
            if (state.getRightIcon() != null) {
                c28655q4.m87150e0(909492353);
                interfaceC4339a10 = interfaceC4339a7;
                AbstractC27242b1.m82092d(new C27270o(state.getRightIconButtonType(), state.getRightIcon().intValue(), null, null, null, false, false, false, 0.0f, false, 1020, null), state.getContentDescriptionRightIcon(), AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t), null, interfaceC4339a10, c28655q4, (i15 & 57344) | 384, 8);
                c28655q4.m87173q(r10);
            } else {
                interfaceC4339a10 = interfaceC4339a7;
                c28655q4.m87150e0(909806724);
                AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3419p(AbstractC6719b.m20147h(), c2314t));
                c28655q4.m87173q(r10);
            }
            c28655q4.m87173q(r14);
            modifier5 = modifier3;
            modifier6 = modifier8;
            interfaceC4339a4 = interfaceC4339a10;
            interfaceC4339a5 = interfaceC4339a9;
            c28655q = c28655q4;
        } else {
            c28655q7.m87138X();
            modifier5 = modifier3;
            modifier6 = modifier4;
            interfaceC4339a4 = interfaceC4339a3;
            interfaceC4339a5 = interfaceC4339a;
            c28655q = c28655q7;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(modifier5, modifier6, state, interfaceC4339a5, interfaceC4339a4, i13, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m20152e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m20153f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m20154g(Modifier modifier, Modifier modifier2, AbstractC6721d.c cVar, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m20151d(modifier, modifier2, cVar, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
