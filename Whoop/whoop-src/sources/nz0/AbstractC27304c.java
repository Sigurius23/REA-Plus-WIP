package nz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b21.C2329b;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dn0.C12203c;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import nx1.C27219a;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.InterfaceC13832v0;
import p163g1.AbstractC15005f3;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: nz0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aK\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lnz0/b;", "information", "Lcom/whoop/design/util/TextResource;", "labelText", "Li2/x;", "color", "Lkotlin/Function0;", "Ll83/a0;", "action", "", "allowClick", "e", "(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27304c {
    /* JADX WARN: Code duplicated, block: B:101:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:102:0x0218  */
    /* JADX WARN: Code duplicated, block: B:104:0x022a  */
    /* JADX WARN: Code duplicated, block: B:107:0x027f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0283  */
    /* JADX WARN: Code duplicated, block: B:111:0x0287  */
    /* JADX WARN: Code duplicated, block: B:114:0x028f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0299  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02df  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code duplicated, block: B:84:0x011f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    /* JADX WARN: Code duplicated, block: B:88:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x012b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x0174  */
    /* JADX WARN: Code duplicated, block: B:96:0x0187  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v4, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v19 */
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
    /* JADX INFO: renamed from: e */
    public static final void m82400e(Modifier modifier, C27303b information, TextResource labelText, long j7, InterfaceC4339a interfaceC4339a, boolean z4, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        int i17;
        boolean z13;
        boolean z14;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        ?? r14;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z15;
        Object objM87133R;
        Object objM30453g;
        int i18;
        int i19;
        int i24;
        boolean z16;
        int i25;
        boolean z17;
        boolean z18;
        Object obj;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        AbstractC27302a abstractC27302aM82395a;
        boolean z19;
        int i26;
        ?? r10;
        boolean z24;
        int i27;
        C28655q c28655q;
        ?? r15;
        ?? r16;
        int i28;
        boolean z25;
        Object obj2;
        Object objM87133R2;
        Object obj3;
        AbstractC22676k.m65750j(information, "information");
        AbstractC22676k.m65750j(labelText, "labelText");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-345685838);
        int i29 = i14 & 1;
        if (i29 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(information) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(labelText) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i34 = i14 & 16;
        if (i34 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q2.m87155h(z4)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                if ((i15 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z13)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i34 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            obj3 = objM87133R2;
                            C27219a c27219a = new C27219a(1);
                            c28655q2.m87172p0(c27219a);
                            obj3 = c27219a;
                        }
                        obj3 = objM87133R2;
                        interfaceC4339a4 = (InterfaceC4339a) obj3;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i16 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    objM87133R = c28655q2.m87133R();
                    objM30453g = objM87133R;
                    if (objM87133R == c28676v0) {
                        objM30453g = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM30453g;
                    i18 = i15 >> 6;
                    i19 = i18 & 14;
                    Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "Sleep_Information_" + AbstractC8693b.m21274h(labelText, c28655q2, i19));
                    InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                    i24 = 458752 & i15;
                    if (i24 == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    i25 = i15 & 57344;
                    if (i25 == 16384) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | z16;
                    Object objM87133R3 = c28655q2.m87133R();
                    obj = objM87133R3;
                    if (z18 || objM87133R3 == c28676v0) {
                        C12203c c12203c = new C12203c(2, interfaceC4339a4, z15);
                        c28655q2.m87172p0(c12203c);
                        obj = c12203c;
                    }
                    Modifier modifierMo3471e = AbstractC1092a.m3360e(modifierM3599a, interfaceC21083i, interfaceC13832v0, false, null, (InterfaceC4339a) obj, 28).mo3471e(modifier2);
                    Modifier modifier4 = modifier2;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    abstractC27302aM82395a = information.getContentType();
                    if (abstractC27302aM82395a instanceof AbstractC27302a.b) {
                        c28655q2.m87150e0(1976872498);
                        z24 = false;
                        z19 = z15;
                        i27 = i18;
                        i26 = i19;
                        r10 = 1;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(((AbstractC27302a.b) information.getContentType()).getText(), c28655q2, 0), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN3(), null, c28655q2, (i15 >> 3) & 896, 0, 196602);
                        C28655q c28655q3 = c28655q2;
                        c28655q3.m87173q(false);
                        c28655q = c28655q3;
                    } else {
                        z19 = z15;
                        i26 = i19;
                        r10 = 1;
                        z24 = false;
                        if (abstractC27302aM82395a instanceof AbstractC27302a.a) {
                            throw AbstractC11895b.m32003v(-490421776, c28655q2, false);
                        }
                        c28655q2.m87150e0(1977118638);
                        i27 = i18;
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(((AbstractC27302a.a) information.getContentType()).getIcon().getIcon(), c28655q2, 6), AbstractC8693b.m21274h(((AbstractC27302a.a) information.getContentType()).getIcon().getContentDescription(), c28655q2, 0), AbstractC1102d.m3419p(10 * 4, c2314t), j7, c28655q2, (i15 & 7168) | 384, 0);
                        c28655q2.m87173q(false);
                        c28655q = c28655q2;
                    }
                    AbstractC18489d0.m53380u((float) r10, 4, c2314t, c28655q);
                    EnumC27284v enumC27284v = EnumC27284v.TextSmall;
                    String strM21274h = AbstractC8693b.m21274h(labelText, c28655q, i26);
                    if (i24 == 131072) {
                        r15 = r10;
                    } else {
                        r15 = z24 ? 1 : 0;
                    }
                    r16 = z24;
                    if (i25 == 16384) {
                        r16 = r10;
                    }
                    i28 = r15 | r16;
                    Object objM87133R4 = c28655q.m87133R();
                    if (i28 == 0 || objM87133R4 == c28676v0) {
                        z25 = z19;
                        interfaceC4339a3 = interfaceC4339a4;
                        C12203c c12203c2 = new C12203c(3, interfaceC4339a3, z25);
                        c28655q.m87172p0(c12203c2);
                        obj2 = c12203c2;
                    } else {
                        z25 = z19;
                        interfaceC4339a3 = interfaceC4339a4;
                        obj2 = objM87133R4;
                    }
                    C28655q c28655q4 = c28655q;
                    AbstractC27282u.m82292h(null, enumC27284v, strM21274h, z25, j7, null, false, (InterfaceC4339a) obj2, c28655q4, (i27 & 7168) | 48 | ((i15 << 3) & 57344), 97);
                    ?? r17 = c28655q4;
                    r17.m87173q(r10);
                    modifier3 = modifier4;
                    z14 = z25;
                    r14 = r17;
                } else {
                    c28655q2.m87138X();
                    z14 = z4;
                    modifier3 = modifier2;
                    interfaceC4339a3 = interfaceC4339a2;
                    r14 = c28655q2;
                }
                c28677v1M87180u = r14.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2329b(modifier3, information, labelText, j7, interfaceC4339a3, z14, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if ((i15 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        obj3 = objM87133R2;
                        C27219a c27219a2 = new C27219a(1);
                        c28655q2.m87172p0(c27219a2);
                        obj3 = c27219a2;
                    }
                    obj3 = objM87133R2;
                    interfaceC4339a4 = (InterfaceC4339a) obj3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                objM87133R = c28655q2.m87133R();
                objM30453g = objM87133R;
                if (objM87133R == c28676v0) {
                    objM30453g = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM30453g;
                i18 = i15 >> 6;
                i19 = i18 & 14;
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "Sleep_Information_" + AbstractC8693b.m21274h(labelText, c28655q2, i19));
                InterfaceC13832v0 interfaceC13832v1 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                i24 = 458752 & i15;
                if (i24 == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                i25 = i15 & 57344;
                if (i25 == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | z16;
                Object objM87133R5 = c28655q2.m87133R();
                obj = objM87133R5;
                if (z18) {
                    C12203c c12203c3 = new C12203c(2, interfaceC4339a4, z15);
                    c28655q2.m87172p0(c12203c3);
                    obj = c12203c3;
                } else {
                    C12203c c12203c4 = new C12203c(2, interfaceC4339a4, z15);
                    c28655q2.m87172p0(c12203c4);
                    obj = c12203c4;
                }
                Modifier modifierMo3471e2 = AbstractC1092a.m3360e(modifierM3599a2, interfaceC21083i2, interfaceC13832v1, false, null, (InterfaceC4339a) obj, 28).mo3471e(modifier2);
                Modifier modifier5 = modifier2;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                abstractC27302aM82395a = information.getContentType();
                if (abstractC27302aM82395a instanceof AbstractC27302a.b) {
                    c28655q2.m87150e0(1976872498);
                    z24 = false;
                    z19 = z15;
                    i27 = i18;
                    i26 = i19;
                    r10 = 1;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(((AbstractC27302a.b) information.getContentType()).getText(), c28655q2, 0), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN3(), null, c28655q2, (i15 >> 3) & 896, 0, 196602);
                    C28655q c28655q5 = c28655q2;
                    c28655q5.m87173q(false);
                    c28655q = c28655q5;
                } else {
                    z19 = z15;
                    i26 = i19;
                    r10 = 1;
                    z24 = false;
                    if (abstractC27302aM82395a instanceof AbstractC27302a.a) {
                        throw AbstractC11895b.m32003v(-490421776, c28655q2, false);
                    }
                    c28655q2.m87150e0(1977118638);
                    i27 = i18;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(((AbstractC27302a.a) information.getContentType()).getIcon().getIcon(), c28655q2, 6), AbstractC8693b.m21274h(((AbstractC27302a.a) information.getContentType()).getIcon().getContentDescription(), c28655q2, 0), AbstractC1102d.m3419p(10 * 4, c2314t), j7, c28655q2, (i15 & 7168) | 384, 0);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                }
                AbstractC18489d0.m53380u((float) r10, 4, c2314t, c28655q);
                EnumC27284v enumC27284v2 = EnumC27284v.TextSmall;
                String strM21274h2 = AbstractC8693b.m21274h(labelText, c28655q, i26);
                if (i24 == 131072) {
                    r15 = r10;
                } else {
                    r15 = z24 ? 1 : 0;
                }
                r16 = z24;
                if (i25 == 16384) {
                    r16 = r10;
                }
                i28 = r15 | r16;
                Object objM87133R6 = c28655q.m87133R();
                if (i28 == 0) {
                    z25 = z19;
                    interfaceC4339a3 = interfaceC4339a4;
                    C12203c c12203c5 = new C12203c(3, interfaceC4339a3, z25);
                    c28655q.m87172p0(c12203c5);
                    obj2 = c12203c5;
                } else {
                    z25 = z19;
                    interfaceC4339a3 = interfaceC4339a4;
                    C12203c c12203c6 = new C12203c(3, interfaceC4339a3, z25);
                    c28655q.m87172p0(c12203c6);
                    obj2 = c12203c6;
                }
                C28655q c28655q6 = c28655q;
                AbstractC27282u.m82292h(null, enumC27284v2, strM21274h2, z25, j7, null, false, (InterfaceC4339a) obj2, c28655q6, (i27 & 7168) | 48 | ((i15 << 3) & 57344), 97);
                ?? r18 = c28655q6;
                r18.m87173q(r10);
                modifier3 = modifier5;
                z14 = z25;
                r14 = r18;
            } else {
                c28655q2.m87138X();
                z14 = z4;
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
                r14 = c28655q2;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2329b(modifier3, information, labelText, j7, interfaceC4339a3, z14, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q2.m87155h(z4)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            if ((i15 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        obj3 = objM87133R2;
                        C27219a c27219a3 = new C27219a(1);
                        c28655q2.m87172p0(c27219a3);
                        obj3 = c27219a3;
                    }
                    obj3 = objM87133R2;
                    interfaceC4339a4 = (InterfaceC4339a) obj3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                objM87133R = c28655q2.m87133R();
                objM30453g = objM87133R;
                if (objM87133R == c28676v0) {
                    objM30453g = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM30453g;
                i18 = i15 >> 6;
                i19 = i18 & 14;
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, "Sleep_Information_" + AbstractC8693b.m21274h(labelText, c28655q2, i19));
                InterfaceC13832v0 interfaceC13832v2 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                i24 = 458752 & i15;
                if (i24 == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                i25 = i15 & 57344;
                if (i25 == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | z16;
                Object objM87133R7 = c28655q2.m87133R();
                obj = objM87133R7;
                if (z18) {
                    C12203c c12203c7 = new C12203c(2, interfaceC4339a4, z15);
                    c28655q2.m87172p0(c12203c7);
                    obj = c12203c7;
                } else {
                    C12203c c12203c8 = new C12203c(2, interfaceC4339a4, z15);
                    c28655q2.m87172p0(c12203c8);
                    obj = c12203c8;
                }
                Modifier modifierMo3471e3 = AbstractC1092a.m3360e(modifierM3599a3, interfaceC21083i3, interfaceC13832v2, false, null, (InterfaceC4339a) obj, 28).mo3471e(modifier2);
                Modifier modifier6 = modifier2;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                abstractC27302aM82395a = information.getContentType();
                if (abstractC27302aM82395a instanceof AbstractC27302a.b) {
                    c28655q2.m87150e0(1976872498);
                    z24 = false;
                    z19 = z15;
                    i27 = i18;
                    i26 = i19;
                    r10 = 1;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(((AbstractC27302a.b) information.getContentType()).getText(), c28655q2, 0), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN3(), null, c28655q2, (i15 >> 3) & 896, 0, 196602);
                    C28655q c28655q7 = c28655q2;
                    c28655q7.m87173q(false);
                    c28655q = c28655q7;
                } else {
                    z19 = z15;
                    i26 = i19;
                    r10 = 1;
                    z24 = false;
                    if (abstractC27302aM82395a instanceof AbstractC27302a.a) {
                        throw AbstractC11895b.m32003v(-490421776, c28655q2, false);
                    }
                    c28655q2.m87150e0(1977118638);
                    i27 = i18;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(((AbstractC27302a.a) information.getContentType()).getIcon().getIcon(), c28655q2, 6), AbstractC8693b.m21274h(((AbstractC27302a.a) information.getContentType()).getIcon().getContentDescription(), c28655q2, 0), AbstractC1102d.m3419p(10 * 4, c2314t), j7, c28655q2, (i15 & 7168) | 384, 0);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                }
                AbstractC18489d0.m53380u((float) r10, 4, c2314t, c28655q);
                EnumC27284v enumC27284v3 = EnumC27284v.TextSmall;
                String strM21274h3 = AbstractC8693b.m21274h(labelText, c28655q, i26);
                if (i24 == 131072) {
                    r15 = r10;
                } else {
                    r15 = z24 ? 1 : 0;
                }
                r16 = z24;
                if (i25 == 16384) {
                    r16 = r10;
                }
                i28 = r15 | r16;
                Object objM87133R8 = c28655q.m87133R();
                if (i28 == 0) {
                    z25 = z19;
                    interfaceC4339a3 = interfaceC4339a4;
                    C12203c c12203c9 = new C12203c(3, interfaceC4339a3, z25);
                    c28655q.m87172p0(c12203c9);
                    obj2 = c12203c9;
                } else {
                    z25 = z19;
                    interfaceC4339a3 = interfaceC4339a4;
                    C12203c c12203c10 = new C12203c(3, interfaceC4339a3, z25);
                    c28655q.m87172p0(c12203c10);
                    obj2 = c12203c10;
                }
                C28655q c28655q8 = c28655q;
                AbstractC27282u.m82292h(null, enumC27284v3, strM21274h3, z25, j7, null, false, (InterfaceC4339a) obj2, c28655q8, (i27 & 7168) | 48 | ((i15 << 3) & 57344), 97);
                ?? r19 = c28655q8;
                r19.m87173q(r10);
                modifier3 = modifier6;
                z14 = z25;
                r14 = r19;
            } else {
                c28655q2.m87138X();
                z14 = z4;
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
                r14 = c28655q2;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2329b(modifier3, information, labelText, j7, interfaceC4339a3, z14, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if ((i15 & 74899) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i34 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    obj3 = objM87133R2;
                    C27219a c27219a4 = new C27219a(1);
                    c28655q2.m87172p0(c27219a4);
                    obj3 = c27219a4;
                }
                obj3 = objM87133R2;
                interfaceC4339a4 = (InterfaceC4339a) obj3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (i16 != 0) {
                z15 = true;
            } else {
                z15 = z4;
            }
            objM87133R = c28655q2.m87133R();
            objM30453g = objM87133R;
            if (objM87133R == c28676v0) {
                objM30453g = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM30453g;
            i18 = i15 >> 6;
            i19 = i18 & 14;
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "Sleep_Information_" + AbstractC8693b.m21274h(labelText, c28655q2, i19));
            InterfaceC13832v0 interfaceC13832v3 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
            i24 = 458752 & i15;
            if (i24 == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            i25 = i15 & 57344;
            if (i25 == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z17 | z16;
            Object objM87133R9 = c28655q2.m87133R();
            obj = objM87133R9;
            if (z18) {
                C12203c c12203c11 = new C12203c(2, interfaceC4339a4, z15);
                c28655q2.m87172p0(c12203c11);
                obj = c12203c11;
            } else {
                C12203c c12203c12 = new C12203c(2, interfaceC4339a4, z15);
                c28655q2.m87172p0(c12203c12);
                obj = c12203c12;
            }
            Modifier modifierMo3471e4 = AbstractC1092a.m3360e(modifierM3599a4, interfaceC21083i4, interfaceC13832v3, false, null, (InterfaceC4339a) obj, 28).mo3471e(modifier2);
            Modifier modifier7 = modifier2;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            abstractC27302aM82395a = information.getContentType();
            if (abstractC27302aM82395a instanceof AbstractC27302a.b) {
                c28655q2.m87150e0(1976872498);
                z24 = false;
                z19 = z15;
                i27 = i18;
                i26 = i19;
                r10 = 1;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(((AbstractC27302a.b) information.getContentType()).getText(), c28655q2, 0), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN3(), null, c28655q2, (i15 >> 3) & 896, 0, 196602);
                C28655q c28655q9 = c28655q2;
                c28655q9.m87173q(false);
                c28655q = c28655q9;
            } else {
                z19 = z15;
                i26 = i19;
                r10 = 1;
                z24 = false;
                if (abstractC27302aM82395a instanceof AbstractC27302a.a) {
                    throw AbstractC11895b.m32003v(-490421776, c28655q2, false);
                }
                c28655q2.m87150e0(1977118638);
                i27 = i18;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(((AbstractC27302a.a) information.getContentType()).getIcon().getIcon(), c28655q2, 6), AbstractC8693b.m21274h(((AbstractC27302a.a) information.getContentType()).getIcon().getContentDescription(), c28655q2, 0), AbstractC1102d.m3419p(10 * 4, c2314t), j7, c28655q2, (i15 & 7168) | 384, 0);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            }
            AbstractC18489d0.m53380u((float) r10, 4, c2314t, c28655q);
            EnumC27284v enumC27284v4 = EnumC27284v.TextSmall;
            String strM21274h4 = AbstractC8693b.m21274h(labelText, c28655q, i26);
            if (i24 == 131072) {
                r15 = r10;
            } else {
                r15 = z24 ? 1 : 0;
            }
            r16 = z24;
            if (i25 == 16384) {
                r16 = r10;
            }
            i28 = r15 | r16;
            Object objM87133R10 = c28655q.m87133R();
            if (i28 == 0) {
                z25 = z19;
                interfaceC4339a3 = interfaceC4339a4;
                C12203c c12203c13 = new C12203c(3, interfaceC4339a3, z25);
                c28655q.m87172p0(c12203c13);
                obj2 = c12203c13;
            } else {
                z25 = z19;
                interfaceC4339a3 = interfaceC4339a4;
                C12203c c12203c14 = new C12203c(3, interfaceC4339a3, z25);
                c28655q.m87172p0(c12203c14);
                obj2 = c12203c14;
            }
            C28655q c28655q10 = c28655q;
            AbstractC27282u.m82292h(null, enumC27284v4, strM21274h4, z25, j7, null, false, (InterfaceC4339a) obj2, c28655q10, (i27 & 7168) | 48 | ((i15 << 3) & 57344), 97);
            ?? r110 = c28655q10;
            r110.m87173q(r10);
            modifier3 = modifier7;
            z14 = z25;
            r14 = r110;
        } else {
            c28655q2.m87138X();
            z14 = z4;
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
            r14 = c28655q2;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2329b(modifier3, information, labelText, j7, interfaceC4339a3, z14, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m82401f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m82402g(boolean z4, InterfaceC4339a interfaceC4339a) {
        if (z4) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m82403h(boolean z4, InterfaceC4339a interfaceC4339a) {
        if (z4) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m82404i(Modifier modifier, C27303b c27303b, TextResource textResource, long j7, InterfaceC4339a interfaceC4339a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m82400e(modifier, c27303b, textResource, j7, interfaceC4339a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
