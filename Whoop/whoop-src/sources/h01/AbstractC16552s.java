package h01;

import am2.C1012d;
import am2.C1024j;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bg0.C3226h;
import bm2.C3466p;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import d11.AbstractC11471f;
import d11.InterfaceC11466a;
import g11.C15218b;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p133f1.C13921a0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23277r0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h01.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u0012²\u0006\u000e\u0010\n\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0011\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lh01/t;", "viewState", "", "isExpandedView", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lh01/t;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "hasOverflow", "isExpanded", "Ly3/f;", "maxHeight", "", "titleMaxLines", "bodyMaxLinesWhenExpanded", "bodyMaxLines", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16552s {
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x0182  */
    /* JADX WARN: Code duplicated, block: B:69:0x018e  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m46819h(C16553t viewState, boolean z4, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        C28655q c28655q;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C13825t c13825t;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c2;
        int iM46821j;
        InterfaceC11466a borderInformation;
        C13825t c13825tM30800y;
        int i16;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(292762140);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(onViewEvent)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i15 |= i16;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i17 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (viewState.getShowBorder()) {
                    c28655q2.m87150e0(-1401440312);
                    borderInformation = viewState.getStyle().getBorderInformation();
                    if (borderInformation == null) {
                        c28655q2.m87150e0(-1401440313);
                        c28655q2.m87173q(false);
                        c13825tM30800y = null;
                    } else {
                        c28655q2.m87150e0(-2123417734);
                        c13825tM30800y = AbstractC11471f.m30800y(borderInformation, (float) 1.5d, c28655q2, 48);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(false);
                    c13825t = c13825tM30800y;
                } else {
                    c28655q2.m87150e0(-1401405407);
                    c28655q2.m87173q(false);
                    c13825t = null;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC31061c.m95647w(z16, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87264r(new C15218b(16, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87264r(new C15218b(17, interfaceC28601c1));
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC11895b.m32005x(100, c28655q2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
                if (m46830s(interfaceC28601c1)) {
                    iM46821j = m46821j(interfaceC28601c2);
                } else {
                    iM46821j = 5;
                }
                InterfaceC28670t2 interfaceC28670t2M30589c = AbstractC11352g.m30589c(iM46821j, c28655q2);
                String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0);
                float f13 = 4;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3412i(AbstractC1091c.m3355a(viewState.getStyle().getStyleModifier(), null, 3), 35 * f13, m46833v(interfaceC28670t2)));
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                C37816b c37816bM121344e = AbstractC37817c.m121344e(-1764109172, c28655q2, new C3466p(viewState, onViewEvent, strM21274h, interfaceC28670t3, interfaceC28601c3, interfaceC28670t2M30589c, interfaceC28601c2, interfaceC28601c1));
                c28655q = c28655q2;
                z13 = z16;
                AbstractC31926e.m99375j(modifierM3409f, null, C38072d.f163053a.m121949b(c28655q2, 6).getTransparent(), c33252iM105489e, c13825t, null, 0, c37816bM121344e, c28655q, 14155776, 34);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            z15 = z13;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(viewState, z15, onViewEvent, i13, i14, 9);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(onViewEvent)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i15 |= i16;
        }
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i17 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (viewState.getShowBorder()) {
                c28655q2.m87150e0(-1401440312);
                borderInformation = viewState.getStyle().getBorderInformation();
                if (borderInformation == null) {
                    c28655q2.m87150e0(-1401440313);
                    c28655q2.m87173q(false);
                    c13825tM30800y = null;
                } else {
                    c28655q2.m87150e0(-2123417734);
                    c13825tM30800y = AbstractC11471f.m30800y(borderInformation, (float) 1.5d, c28655q2, 48);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(false);
                c13825t = c13825tM30800y;
            } else {
                c28655q2.m87150e0(-1401405407);
                c28655q2.m87173q(false);
                c13825t = null;
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95647w(z16, c28655q2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87264r(new C15218b(16, interfaceC28601c1));
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87264r(new C15218b(17, interfaceC28601c1));
                c28655q2.m87172p0(objM87133R4);
            }
            InterfaceC28670t2 interfaceC28670t5 = (InterfaceC28670t2) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC11895b.m32005x(100, c28655q2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
            if (m46830s(interfaceC28601c1)) {
                iM46821j = m46821j(interfaceC28601c2);
            } else {
                iM46821j = 5;
            }
            InterfaceC28670t2 interfaceC28670t2M30589c2 = AbstractC11352g.m30589c(iM46821j, c28655q2);
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, 0);
            float f14 = 4;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3412i(AbstractC1091c.m3355a(viewState.getStyle().getStyleModifier(), null, 3), 35 * f14, m46833v(interfaceC28670t4)));
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f14);
            C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-1764109172, c28655q2, new C3466p(viewState, onViewEvent, strM21274h2, interfaceC28670t5, interfaceC28601c4, interfaceC28670t2M30589c2, interfaceC28601c2, interfaceC28601c1));
            c28655q = c28655q2;
            z13 = z16;
            AbstractC31926e.m99375j(modifierM3409f2, null, C38072d.f163053a.m121949b(c28655q2, 6).getTransparent(), c33252iM105489e2, c13825t, null, 0, c37816bM121344e2, c28655q, 14155776, 34);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        z15 = z13;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(viewState, z15, onViewEvent, i13, i14, 9);
        }
    }

    /* JADX INFO: renamed from: i */
    private static final boolean m46820i(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: j */
    private static final int m46821j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: k */
    private static final void m46822k(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: l */
    private static final int m46823l(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to calculate best type for var: r2v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v11 ??, new type: x81.d
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v11 ??, new type: x81.d
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v11 x81.d, new type: x81.d
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
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
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m46824m(C16553t c16553t, Function1 function1, String str, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t3, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Composer composer, int i13) {
        C2314t c2314t;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3393o = AbstractC1099a.m3393o(c16553t.getPadding(), AbstractC1102d.m3409f(1.0f, c2314t2));
            float f13 = 8;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * f13), C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3393o);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            AbstractC22403o abstractC22403oM46841g = c16553t.getTitleIconUrl();
            if (abstractC22403oM46841g == null) {
                c28655q.m87150e0(574711572);
                c28655q.m87173q(false);
                c2314t = c2314t2;
            } else {
                c28655q.m87150e0(574711573);
                float f14 = 4;
                c2314t = c2314t2;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM46841g, null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(f14 * f14, c2314t2), null, null, 0.0f, null, c28655q, 432, 120);
                c28655q = c28655q;
                AbstractC18489d0.m53381v(2, f14, c2314t, c28655q, false);
            }
            C38072d c38072d = C38072d.f163053a;
            long brandWhite = c38072d.m121949b(c28655q, r13).getBrandWhite();
            C2886a b6 = c38072d.m121952e(c28655q, r13).getB1();
            int iM46835x = m46835x(interfaceC28670t2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C13921a0(17, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(str, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM46835x, 0, (Function1) objM87133R, b6, null, c28655q2, 0, 196656, 153594);
            c28655q2.m87173q(true);
            String strM21274h = AbstractC8693b.m21274h(c16553t.getSubtitle(), c28655q2, 0);
            long white70 = c38072d.m121949b(c28655q2, r13).getWhite70();
            C2886a b8 = c38072d.m121952e(c28655q2, 6).getB2();
            int iM46823l = m46823l(interfaceC28670t3);
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C1024j(4, interfaceC28601c1, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC30795n.m94707h(strM21274h, null, white70, 0L, null, null, null, 0L, null, null, 0L, 2, false, iM46823l, 0, (Function1) objM87133R2, b8, null, c28655q2, 0, 196656, 153594);
            c28655q2.m87173q(true);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c16553t.getImage(), null, null, c28655q2, 0, 3), null, AbstractC1102d.m3419p(25 * 4, c2314t), null, null, 0.0f, null, c28655q2, 432, 120);
            c28655q2.m87173q(true);
            if ((m46820i(interfaceC28601c1) || m46830s(interfaceC28601c3)) && c16553t.getIsCardExpandable()) {
                c28655q2.m87150e0(1859628551);
                boolean zM46830s = m46830s(interfaceC28601c3);
                boolean zM87153g = c28655q2.m87153g(function1) | c28655q2.m87153g(c16553t) | c28655q2.m87153g(str);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87153g || objM87133R3 == c28676v0) {
                    objM87133R3 = new C1012d(function1, c16553t, str, interfaceC28601c3, 11);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC16557x.m46850e(C1100b.f4583a, null, zM46830s, false, (InterfaceC4339a) objM87133R3, c28655q2, 6, 5);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1860048508);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m46825n(InterfaceC28601c1 interfaceC28601c1, C23277r0 result) {
        AbstractC22676k.m65750j(result, "result");
        m46829r(interfaceC28601c1, result.m67336e());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m46826o(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C23277r0 result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.m67336e()) {
            m46829r(interfaceC28601c1, true);
        } else {
            m46822k(interfaceC28601c2, result.f92228b.f92263f);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m46827p(Function1 function1, C16553t c16553t, String str, InterfaceC28601c1 interfaceC28601c1) {
        m46831t(interfaceC28601c1, !m46830s(interfaceC28601c1));
        String appNotificationType = c16553t.getAppNotificationType();
        if (appNotificationType == null) {
            appNotificationType = "";
        }
        function1.invoke(new C16551r(appNotificationType, str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m46828q(C16553t c16553t, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m46819h(c16553t, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m46829r(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: s */
    private static final boolean m46830s(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: t */
    private static final void m46831t(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C39174f m46832u(InterfaceC28601c1 interfaceC28601c1) {
        return new C39174f(m46830s(interfaceC28601c1) ? Float.NaN : C16536c.f63627a.m46720b());
    }

    /* JADX INFO: renamed from: v */
    private static final float m46833v(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final int m46834w(InterfaceC28601c1 interfaceC28601c1) {
        return m46830s(interfaceC28601c1) ? Integer.MAX_VALUE : 2;
    }

    /* JADX INFO: renamed from: x */
    private static final int m46835x(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }
}
