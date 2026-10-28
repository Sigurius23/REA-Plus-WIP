package rx0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ar0.C1926a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pj2.C29308g;
import q12.C29802c;
import q63.AbstractC30007c;
import qb0.C30179a;
import qz0.AbstractC30792k;
import rm2.C31604d;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rx0.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u0007\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "initialJson", "Lkotlin/Function1;", "Ll83/a0;", "onRender", "Lkotlin/Function0;", "onNavigateBack", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "jsonText", "debug-tools_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31902g {
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:58:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    /* JADX WARN: Code duplicated, block: B:64:0x0148  */
    /* JADX WARN: Code duplicated, block: B:67:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0173  */
    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /* JADX WARN: Code duplicated, block: B:78:0x01af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:82:0x024e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0251  */
    /* JADX WARN: Code duplicated, block: B:86:0x025d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0261  */
    /* JADX WARN: Code duplicated, block: B:91:0x0291  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
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
    /* JADX INFO: renamed from: h */
    public static final void m99169h(String str, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        C2314t c2314t;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        Function1 function6;
        boolean z13;
        boolean z14;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        boolean zM87153g;
        Object objM87133R3;
        int i18;
        boolean z15;
        boolean zM87153g2;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2141839724);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
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
                    if (i19 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C31604d(21);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function4 = (Function1) objM87133R6;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C31901f(0);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
                    }
                    c2314t = C2314t.f9131w;
                    f13 = 2 * 8;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC22953f.m66725n(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a)));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
                    function5 = function4;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("JSON Playground")), null, interfaceC4339a2, null, null, c28655q, ((i15 << 3) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                    InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
                    if (str != null) {
                        c28655q.m87150e0(1476890195);
                        Object[] objArr = {str};
                        if ((i15 & 14) == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z14 || objM87133R == c28676v0) {
                            objM87133R = new C1926a(str, 8);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 0);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f, true, 1.0f);
                        TextResource textResourceM21278l = AbstractC8693b.m21278l(m99173l(interfaceC28601c1));
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("");
                        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("");
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C31901f(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                        zM87153g = c28655q.m87153g(interfaceC28601c1);
                        objM87133R3 = c28655q.m87133R();
                        if (zM87153g || objM87133R3 == c28676v0) {
                            objM87133R3 = new C29802c(8, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i24 = TextResource.$stable;
                        z13 = true;
                        i18 = i15;
                        function6 = function5;
                        AbstractC30792k.m94679m(modifierM31988g, textResourceM21278l, null, null, textResourceM21278l2, null, null, 0L, textResourceM21278l3, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a5, (Function1) objM87133R3, c28655q, (i24 << 3) | (i24 << 12) | (i24 << 24), 805309440, ProfileVerifier.CompilationStatus.f6515xf2722a21, 33021676);
                        Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t, f13, c28655q, c2314t, 1.0f);
                        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Render");
                        boolean z16 = !AbstractC39414r.m125890i0(m99173l(interfaceC28601c1));
                        if ((i18 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87153g2 = c28655q.m87153g(interfaceC28601c1) | z15;
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g2 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C29308g(function6, interfaceC28601c1, 4);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC27292z.m82343j(modifierM91835e, z16, false, null, null, null, textResourceM21278l4, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q, (i24 << 18) | 6, 0, 8124);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function6 = function5;
                        z13 = true;
                        c28655q.m87150e0(1477736836);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                    function3 = function6;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C30179a(str, function3, interfaceC4339a3, i13, i14, 23);
                }
            }
            i15 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C31604d(21);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C31901f(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
                }
                c2314t = C2314t.f9131w;
                f13 = 2 * 8;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f13, AbstractC22953f.m66725n(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a)));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
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
                function5 = function4;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("JSON Playground")), null, interfaceC4339a2, null, null, c28655q, ((i15 << 3) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a2;
                if (str != null) {
                    c28655q.m87150e0(1476890195);
                    Object[] objArr2 = {str};
                    if ((i15 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new C1926a(str, 8);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C1926a(str, 8);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R, c28655q, 0);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g2 = AbstractC11895b.m31988g(modifierM3409f2, true, 1.0f);
                    TextResource textResourceM21278l5 = AbstractC8693b.m21278l(m99173l(interfaceC28601c1));
                    TextResource textResourceM21278l6 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l7 = AbstractC8693b.m21278l("");
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C31901f(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    zM87153g = c28655q.m87153g(interfaceC28601c1);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C29802c(8, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C29802c(8, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i25 = TextResource.$stable;
                    z13 = true;
                    i18 = i15;
                    function6 = function5;
                    AbstractC30792k.m94679m(modifierM31988g2, textResourceM21278l5, null, null, textResourceM21278l6, null, null, 0L, textResourceM21278l7, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a7, (Function1) objM87133R3, c28655q, (i25 << 3) | (i25 << 12) | (i25 << 24), 805309440, ProfileVerifier.CompilationStatus.f6515xf2722a21, 33021676);
                    Modifier modifierM91835e2 = AbstractC30007c.m91835e(c2314t, f13, c28655q, c2314t, 1.0f);
                    TextResource textResourceM21278l8 = AbstractC8693b.m21278l("Render");
                    boolean z17 = !AbstractC39414r.m125890i0(m99173l(interfaceC28601c1));
                    if ((i18 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87153g2 = c28655q.m87153g(interfaceC28601c1) | z15;
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R4 = new C29308g(function6, interfaceC28601c1, 4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29308g(function6, interfaceC28601c1, 4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC27292z.m82343j(modifierM91835e2, z17, false, null, null, null, textResourceM21278l8, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q, (i25 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function6 = function5;
                    z13 = true;
                    c28655q.m87150e0(1477736836);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                function3 = function6;
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(str, function3, interfaceC4339a3, i13, i14, 23);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
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
                if (i19 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C31604d(21);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C31901f(0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
                }
                c2314t = C2314t.f9131w;
                f13 = 2 * 8;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f13, AbstractC22953f.m66725n(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a)));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
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
                function5 = function4;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("JSON Playground")), null, interfaceC4339a2, null, null, c28655q, ((i15 << 3) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                InterfaceC4339a interfaceC4339a8 = interfaceC4339a2;
                if (str != null) {
                    c28655q.m87150e0(1476890195);
                    Object[] objArr3 = {str};
                    if ((i15 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new C1926a(str, 8);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C1926a(str, 8);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R, c28655q, 0);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM31988g3 = AbstractC11895b.m31988g(modifierM3409f3, true, 1.0f);
                    TextResource textResourceM21278l9 = AbstractC8693b.m21278l(m99173l(interfaceC28601c1));
                    TextResource textResourceM21278l10 = AbstractC8693b.m21278l("");
                    TextResource textResourceM21278l11 = AbstractC8693b.m21278l("");
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C31901f(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R2;
                    zM87153g = c28655q.m87153g(interfaceC28601c1);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R3 = new C29802c(8, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C29802c(8, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i26 = TextResource.$stable;
                    z13 = true;
                    i18 = i15;
                    function6 = function5;
                    AbstractC30792k.m94679m(modifierM31988g3, textResourceM21278l9, null, null, textResourceM21278l10, null, null, 0L, textResourceM21278l11, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a9, (Function1) objM87133R3, c28655q, (i26 << 3) | (i26 << 12) | (i26 << 24), 805309440, ProfileVerifier.CompilationStatus.f6515xf2722a21, 33021676);
                    Modifier modifierM91835e3 = AbstractC30007c.m91835e(c2314t, f13, c28655q, c2314t, 1.0f);
                    TextResource textResourceM21278l12 = AbstractC8693b.m21278l("Render");
                    boolean z18 = !AbstractC39414r.m125890i0(m99173l(interfaceC28601c1));
                    if ((i18 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87153g2 = c28655q.m87153g(interfaceC28601c1) | z15;
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R4 = new C29308g(function6, interfaceC28601c1, 4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29308g(function6, interfaceC28601c1, 4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC27292z.m82343j(modifierM91835e3, z18, false, null, null, null, textResourceM21278l12, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q, (i26 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function6 = function5;
                    z13 = true;
                    c28655q.m87150e0(1477736836);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                function3 = function6;
                interfaceC4339a3 = interfaceC4339a8;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(str, function3, interfaceC4339a3, i13, i14, 23);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C31604d(21);
                    c28655q.m87172p0(objM87133R6);
                }
                function4 = (Function1) objM87133R6;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C31901f(0);
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
            }
            c2314t = C2314t.f9131w;
            f13 = 2 * 8;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f13, AbstractC22953f.m66725n(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a)));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
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
            function5 = function4;
            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("JSON Playground")), null, interfaceC4339a2, null, null, c28655q, ((i15 << 3) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
            InterfaceC4339a interfaceC4339a10 = interfaceC4339a2;
            if (str != null) {
                c28655q.m87150e0(1476890195);
                Object[] objArr4 = {str};
                if ((i15 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C1926a(str, 8);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C1926a(str, 8);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr4, (InterfaceC4339a) objM87133R, c28655q, 0);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g4 = AbstractC11895b.m31988g(modifierM3409f4, true, 1.0f);
                TextResource textResourceM21278l13 = AbstractC8693b.m21278l(m99173l(interfaceC28601c1));
                TextResource textResourceM21278l14 = AbstractC8693b.m21278l("");
                TextResource textResourceM21278l15 = AbstractC8693b.m21278l("");
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C31901f(1);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R2;
                zM87153g = c28655q.m87153g(interfaceC28601c1);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R3 = new C29802c(8, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C29802c(8, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                int i27 = TextResource.$stable;
                z13 = true;
                i18 = i15;
                function6 = function5;
                AbstractC30792k.m94679m(modifierM31988g4, textResourceM21278l13, null, null, textResourceM21278l14, null, null, 0L, textResourceM21278l15, false, false, null, false, 1, 0, 0, false, null, false, false, null, null, null, null, null, interfaceC4339a11, (Function1) objM87133R3, c28655q, (i27 << 3) | (i27 << 12) | (i27 << 24), 805309440, ProfileVerifier.CompilationStatus.f6515xf2722a21, 33021676);
                Modifier modifierM91835e4 = AbstractC30007c.m91835e(c2314t, f13, c28655q, c2314t, 1.0f);
                TextResource textResourceM21278l16 = AbstractC8693b.m21278l("Render");
                boolean z19 = !AbstractC39414r.m125890i0(m99173l(interfaceC28601c1));
                if ((i18 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87153g2 = c28655q.m87153g(interfaceC28601c1) | z15;
                objM87133R4 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R4 = new C29308g(function6, interfaceC28601c1, 4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C29308g(function6, interfaceC28601c1, 4);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC27292z.m82343j(modifierM91835e4, z19, false, null, null, null, textResourceM21278l16, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q, (i27 << 18) | 6, 0, 8124);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                function6 = function5;
                z13 = true;
                c28655q.m87150e0(1477736836);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            function3 = function6;
            interfaceC4339a3 = interfaceC4339a10;
        } else {
            c28655q.m87138X();
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(str, function3, interfaceC4339a3, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m99170i(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m99171j() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC28601c1 m99172k(String str) {
        return AbstractC28683x.m87272z(str);
    }

    /* JADX INFO: renamed from: l */
    private static final String m99173l(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: m */
    private static final void m99174m(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m99175n() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m99176o(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m99174m(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m99177p(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(m99173l(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m99178q(String str, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m99169h(str, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
