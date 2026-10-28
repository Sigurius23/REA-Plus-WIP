package aw0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kotlin.C1991b1;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yv0.C39804g;
import yv0.InterfaceC39802e;

/* JADX INFO: renamed from: aw0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lyv0/g;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "d", "(Lyv0/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lm91/p;", "a", "Lm91/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lm91/p;", "activityTargetsDesignItemViewFactory", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2112l {

    /* JADX INFO: renamed from: a */
    private static final C25307p f8358a = Function1.m74306g(new C1991b1(14));

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0223  */
    /* JADX WARN: Code duplicated, block: B:70:0x0232  */
    /* JADX WARN: Code duplicated, block: B:71:0x0242  */
    /* JADX WARN: Code duplicated, block: B:73:0x0247  */
    /* JADX WARN: Code duplicated, block: B:80:0x026b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0276  */
    /* JADX WARN: Code duplicated, block: B:84:0x0284 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0257 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
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
    /* JADX INFO: renamed from: d */
    public static final void m6672d(final C39804g viewState, Modifier modifier, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        boolean z4;
        final Modifier modifier3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        final Modifier modifier4;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C28655q c28655q2;
        int iHashCode2;
        int i15;
        int i16;
        InterfaceC39802e interfaceC39802e;
        ?? r10;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1691478660);
        int i17 = (i13 & 6) == 0 ? i13 | (c28655q3.m87157i(viewState) ? 4 : 2) : i13;
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i17 |= c28655q3.m87153g(modifier2) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i17 & 1, z4)) {
                modifier4 = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = modifier2;
                }
                if (viewState.m127597a().isEmpty()) {
                    c28677v1M87180u = c28655q3.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i19 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: aw0.k
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i19) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC2112l.m6673e(viewState, modifier4, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC2112l.m6674f(viewState, modifier4, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    Modifier modifier5 = modifier4;
                    float f13 = 8;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier5), 0.0f, ((float) 1.5d) * f13, 1);
                    float f14 = 2 * f13;
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q3, 6);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(interfaceC4339a);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                    String title = viewState.getTitle();
                    C38072d c38072d = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    AbstractC30795n.m94707h(title, null, c38072d.m121949b(c28655q3, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i24).getT3(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                    c28655q2 = c28655q3;
                    float f15 = 3;
                    Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC31061c.m95629e(AbstractC1102d.m3409f(1.0f, modifier4), f15, 4, c38072d.m121949b(c28655q2, i24).getWhite5()), f14, f15 * f13);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), c2305k, c28655q2, 6);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    c28655q2.m87150e0(1293029336);
                    i15 = 0;
                    for (Object obj : viewState.m127597a()) {
                        i16 = i15 + 1;
                        if (i15 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        interfaceC39802e = (InterfaceC39802e) obj;
                        if (i15 > 0) {
                            c28655q2.m87150e0(-635550344);
                            r10 = 0;
                            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(1, AbstractC1102d.m3409f(1.0f, modifier4)), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), AbstractC17918w0.f69621a), c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            r10 = 0;
                            c28655q2.m87150e0(-635297601);
                            c28655q2.m87173q(false);
                        }
                        if (interfaceC39802e instanceof InterfaceC39802e.a) {
                            c28655q2.m87150e0(-2098700800);
                            AbstractC2106f.m6658b((InterfaceC39802e.a) interfaceC39802e, null, c28655q2, r10, 2);
                            c28655q2.m87173q(r10);
                        } else {
                            if (interfaceC39802e instanceof InterfaceC39802e.b) {
                                throw AbstractC11895b.m32003v(-2098702682, c28655q2, r10);
                            }
                            c28655q2.m87150e0(-2098698236);
                            AbstractC2105e.m6653c((InterfaceC39802e.b) interfaceC39802e, null, c28655q2, r10, 2);
                            c28655q2.m87173q(r10);
                        }
                        i15 = i16;
                    }
                    AbstractC25012a.m73392y(c28655q2, false, true, true);
                    modifier3 = modifier5;
                    c28655q = c28655q2;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            C28655q c28655q4 = c28655q3;
            c28655q4.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i25 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: aw0.k
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i25) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC2112l.m6673e(viewState, modifier3, i13, i14, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC2112l.m6674f(viewState, modifier3, i13, i14, (Composer) obj2, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i17 |= 48;
        modifier2 = modifier;
        if ((i17 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i17 & 1, z4)) {
            modifier4 = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = modifier2;
            }
            if (viewState.m127597a().isEmpty()) {
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i110 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: aw0.k
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i110) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC2112l.m6673e(viewState, modifier4, i13, i14, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC2112l.m6674f(viewState, modifier4, i13, i14, (Composer) obj2, iIntValue2);
                        }
                    }
                };
            } else {
                Modifier modifier6 = modifier4;
                float f16 = 8;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier6), 0.0f, ((float) 1.5d) * f16, 1);
                float f17 = 2 * f16;
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f17);
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k2, c28655q3, 6);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3396r2);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i5, c23010xM66775a3);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N3);
                String title2 = viewState.getTitle();
                C38072d c38072d2 = C38072d.f163053a;
                int i26 = C38072d.f163054b;
                AbstractC30795n.m94707h(title2, null, c38072d2.m121949b(c28655q3, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i26).getT3(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                c28655q2 = c28655q3;
                float f18 = 3;
                Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC31061c.m95629e(AbstractC1102d.m3409f(1.0f, modifier4), f18, 4, c38072d2.m121949b(c28655q2, i26).getWhite5()), f17, f18 * f16);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f17), c2305k2, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3395q2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
                c28655q2.m87150e0(1293029336);
                i15 = 0;
                while (r2.hasNext()) {
                    i16 = i15 + 1;
                    if (i15 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    interfaceC39802e = (InterfaceC39802e) obj;
                    if (i15 > 0) {
                        c28655q2.m87150e0(-635550344);
                        r10 = 0;
                        AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(1, AbstractC1102d.m3409f(1.0f, modifier4)), C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite10(), AbstractC17918w0.f69621a), c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        r10 = 0;
                        c28655q2.m87150e0(-635297601);
                        c28655q2.m87173q(false);
                    }
                    if (interfaceC39802e instanceof InterfaceC39802e.a) {
                        c28655q2.m87150e0(-2098700800);
                        AbstractC2106f.m6658b((InterfaceC39802e.a) interfaceC39802e, null, c28655q2, r10, 2);
                        c28655q2.m87173q(r10);
                    } else {
                        if (interfaceC39802e instanceof InterfaceC39802e.b) {
                            throw AbstractC11895b.m32003v(-2098702682, c28655q2, r10);
                        }
                        c28655q2.m87150e0(-2098698236);
                        AbstractC2105e.m6653c((InterfaceC39802e.b) interfaceC39802e, null, c28655q2, r10, 2);
                        c28655q2.m87173q(r10);
                    }
                    i15 = i16;
                }
                AbstractC25012a.m73392y(c28655q2, false, true, true);
                modifier3 = modifier6;
                c28655q = c28655q2;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        C28655q c28655q5 = c28655q3;
        c28655q5.m87138X();
        modifier3 = modifier2;
        c28655q = c28655q5;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i27 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: aw0.k
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i27) {
                        case 0:
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC2112l.m6673e(viewState, modifier3, i13, i14, (Composer) obj2, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj3).intValue();
                            return AbstractC2112l.m6674f(viewState, modifier3, i13, i14, (Composer) obj2, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m6673e(C39804g c39804g, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m6672d(c39804g, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m6674f(C39804g c39804g, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m6672d(c39804g, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m6675g(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39804g.class), new C2110j());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final C25307p m6676h() {
        return f8358a;
    }
}
