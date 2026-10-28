package id2;

import ad2.AbstractC0752a;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b03.C2206c;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: id2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lid2/d;", "Ll83/a0;", "onEvent", "i", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "icon", "", "label", "", "isPrimary", "Lkotlin/Function0;", "onClick", "g", "(ILjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "share_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18422g {
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0171  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:75:0x0190  */
    /* JADX WARN: Code duplicated, block: B:77:0x020a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0214  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
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
    /* JADX INFO: renamed from: g */
    private static final void m53012g(int i13, String str, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i14, int i15) {
        int i16;
        Modifier modifier2;
        boolean z13;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        long jM95628d;
        long jM95624D;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1730430738);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i15 & 16;
        if (i17 == 0) {
            if ((i14 & 24576) == 0) {
                modifier2 = modifier;
                i16 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i16 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i16 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                if (z4) {
                    c28655q.m87150e0(-791588744);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(-791587659);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                if (z4) {
                    c28655q.m87150e0(-791585736);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(-791584648);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                long j7 = jM95624D;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * 8, modifier2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                int i18 = i16;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                float f13 = 4;
                Modifier modifier4 = modifier2;
                float f14 = 3 * f13;
                Modifier modifierM3362g = AbstractC1092a.m3362g(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(14 * f13, c2314t), AbstractC33253j.m105489e(f14)), jM95628d, AbstractC17918w0.f69621a), false, null, null, interfaceC4339a, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i18 << 3) & 112) | 6), str, AbstractC1102d.m3419p(6 * f13, c2314t), j7, c28655q, (i18 & 112) | 384, 0);
                AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c38072d.m121952e(c28655q, i19).getB2(), Float.valueOf(1.0f), c28655q, (i18 >> 3) & 14, (C2886a.f11498d << 18) | 12586416, 51194);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18421f(i13, i14, i15, modifier3, interfaceC4339a, str, z4);
            }
        }
        i16 |= 24576;
        modifier2 = modifier;
        if ((i16 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i16 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            if (z4) {
                c28655q.m87150e0(-791588744);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-791587659);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            if (z4) {
                c28655q.m87150e0(-791585736);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-791584648);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            long j13 = jM95624D;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 0.5d) * 8, modifier2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            int i110 = i16;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            float f15 = 4;
            Modifier modifier5 = modifier2;
            float f16 = 3 * f15;
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(14 * f15, c2314t), AbstractC33253j.m105489e(f16)), jM95628d, AbstractC17918w0.f69621a), false, null, null, interfaceC4339a, 15);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3362g2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i110 << 3) & 112) | 6), str, AbstractC1102d.m3419p(6 * f15, c2314t), j13, c28655q, (i110 & 112) | 384, 0);
            AbstractC18489d0.m53356B(c28655q, true, c2314t, f16, c28655q);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            AbstractC30795n.m94707h(str, null, c38072d2.m121949b(c28655q, i111).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c38072d2.m121952e(c28655q, i111).getB2(), Float.valueOf(1.0f), c28655q, (i110 >> 3) & 14, (C2886a.f11498d << 18) | 12586416, 51194);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18421f(i13, i14, i15, modifier3, interfaceC4339a, str, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m53013h(int i13, String str, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m53012g(i13, str, z4, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m53014i(Modifier modifier, final Function1 onEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2068178990);
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
            i15 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            C38072d c38072d = C38072d.f163053a;
            int copy = c38072d.m121951d().getAction().getCopy();
            String strM21273g = AbstractC8693b.m21273g(AbstractC0752a.f2738a, c28655q, 0);
            int i17 = i15 & 112;
            boolean z4 = i17 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                final int i18 = 0;
                objM87133R = new InterfaceC4339a() { // from class: id2.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return AbstractC18422g.m53015j(onEvent);
                            case 1:
                                return AbstractC18422g.m53016k(onEvent);
                            case 2:
                                return AbstractC18422g.m53017l(onEvent);
                            default:
                                return AbstractC18422g.m53018m(onEvent);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            C23000t1 c23000t1 = C23000t1.f90727a;
            m53012g(copy, strM21273g, true, interfaceC4339a, c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 384, 0);
            int iM46351o = c38072d.m121951d().getVarious().getDownload();
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC0752a.f2739b, c28655q, 0);
            boolean z13 = i17 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                final int i19 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: id2.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return AbstractC18422g.m53015j(onEvent);
                            case 1:
                                return AbstractC18422g.m53016k(onEvent);
                            case 2:
                                return AbstractC18422g.m53017l(onEvent);
                            default:
                                return AbstractC18422g.m53018m(onEvent);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            m53012g(iM46351o, strM21273g2, true, (InterfaceC4339a) objM87133R2, c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 384, 0);
            int iM46410z = c38072d.m121951d().getGrowth().getSend();
            String strM21273g3 = AbstractC8693b.m21273g(AbstractC0752a.f2740c, c28655q, 0);
            boolean z14 = i17 == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z14 || objM87133R3 == c28676v0) {
                final int i24 = 2;
                objM87133R3 = new InterfaceC4339a() { // from class: id2.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                return AbstractC18422g.m53015j(onEvent);
                            case 1:
                                return AbstractC18422g.m53016k(onEvent);
                            case 2:
                                return AbstractC18422g.m53017l(onEvent);
                            default:
                                return AbstractC18422g.m53018m(onEvent);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            m53012g(iM46410z, strM21273g3, true, (InterfaceC4339a) objM87133R3, c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 384, 0);
            int iM46332e0 = c38072d.m121951d().getVarious().getShare();
            String strM21273g4 = AbstractC8693b.m21273g(AbstractC0752a.f2741d, c28655q, 0);
            boolean z15 = i17 == 32;
            Object objM87133R4 = c28655q.m87133R();
            if (z15 || objM87133R4 == c28676v0) {
                final int i25 = 3;
                objM87133R4 = new InterfaceC4339a() { // from class: id2.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i25) {
                            case 0:
                                return AbstractC18422g.m53015j(onEvent);
                            case 1:
                                return AbstractC18422g.m53016k(onEvent);
                            case 2:
                                return AbstractC18422g.m53017l(onEvent);
                            default:
                                return AbstractC18422g.m53018m(onEvent);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            m53012g(iM46332e0, strM21273g4, false, (InterfaceC4339a) objM87133R4, c23000t1.mo66772c(c2314t, true, 1.0f), c28655q, 384, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2206c(modifier2, onEvent, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m53015j(Function1 function1) {
        function1.invoke(AbstractC18419d.a.f71660a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m53016k(Function1 function1) {
        function1.invoke(AbstractC18419d.b.f71661a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m53017l(Function1 function1) {
        function1.invoke(AbstractC18419d.c.f71662a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m53018m(Function1 function1) {
        function1.invoke(AbstractC18419d.d.f71663a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m53019n(Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m53014i(modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
