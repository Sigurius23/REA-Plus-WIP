package c41;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i91.AbstractC18249c;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22961h;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.n5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "Lcom/whoop/design/util/TextResource;", "listOfText", "Li2/x;", "textColor", "Li2/a1;", "textPartitionShape", "partitionShapeColor", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4081n5 {
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: b */
    public static final void m12528b(Modifier modifier, List<? extends TextResource> listOfText, long j7, InterfaceC17869a1 interfaceC17869a1, long j13, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        long white50;
        InterfaceC17869a1 interfaceC17869a2;
        long white10;
        Modifier modifier3;
        long j14;
        InterfaceC17869a1 interfaceC17869a3;
        long j15;
        C28655q c28655q;
        boolean z4;
        C28655q c28655q2;
        C28655q c28655q3;
        boolean z13;
        C28655q c28655q4;
        int i16;
        int i17;
        AbstractC22676k.m65750j(listOfText, "listOfText");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(839456653);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q5.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q5.m87157i(listOfText) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                white50 = j7;
                int i19 = c28655q5.m87151f(white50) ? 256 : 128;
                i15 |= i19;
            } else {
                white50 = j7;
            }
            i15 |= i19;
        } else {
            white50 = j7;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                if (c28655q5.m87153g(interfaceC17869a2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i17;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i17;
        } else {
            interfaceC17869a2 = interfaceC17869a1;
        }
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                white10 = j13;
                if (c28655q5.m87151f(white10)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i15 |= i16;
            } else {
                white10 = j13;
            }
            i16 = DfuBaseService.ERROR_REMOTE_MASK;
            i15 |= i16;
        } else {
            white10 = j13;
        }
        if (c28655q5.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            c28655q5.m87140Z();
            int i24 = i13 & 1;
            C2314t c2314t = C2314t.f9131w;
            if (i24 == 0 || c28655q5.m87118C()) {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    white50 = C38072d.f163053a.m121949b(c28655q5, 6).getWhite50();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    interfaceC17869a2 = AbstractC33253j.f138651a;
                }
                if ((i14 & 16) != 0) {
                    white10 = C38072d.f163053a.m121949b(c28655q5, 6).getWhite10();
                    i15 &= -57345;
                }
            } else {
                c28655q5.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
                if ((i14 & 16) != 0) {
                    i15 &= -57345;
                }
            }
            long j16 = white50;
            int i25 = i15;
            long j17 = white10;
            InterfaceC17869a1 interfaceC17869a4 = interfaceC17869a2;
            c28655q5.m87175r();
            C2306l c2306l = C2299e.f9108K;
            C22961h c22961h = AbstractC22977m.f90654e;
            float f13 = ((float) 0.5d) * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, modifier2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q5, 54);
            int iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            Modifier modifier4 = modifier2;
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N);
            if (listOfText.isEmpty()) {
                z4 = true;
                c28655q5.m87150e0(-878629127);
                c28655q5.m87173q(false);
                c28655q2 = c28655q5;
            } else {
                c28655q5.m87150e0(-879760534);
                z4 = true;
                if (listOfText.size() == 1) {
                    c28655q5.m87150e0(-879744290);
                    z13 = false;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h((TextResource) AbstractC25265s.m74096F0(listOfText), c28655q5, 0), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getH5(), null, c28655q5, i25 & 896, 0, 196602);
                    c28655q5.m87173q(false);
                    c28655q4 = c28655q5;
                } else {
                    int i26 = 0;
                    c28655q5.m87150e0(-879482278);
                    c28655q5.m87150e0(110177401);
                    int size = listOfText.size() - 1;
                    int i27 = 0;
                    while (i27 < size) {
                        c28655q3 = c28655q5;
                        C2314t c2314t2 = c2314t;
                        float f14 = f13;
                        C28655q c28655q6 = c28655q3;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(listOfText.get(i27), c28655q3, i26), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getH5(), null, c28655q6, i25 & 896, 0, 196602);
                        AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(1 * 4, AbstractC1099a.m3394p(f14, c2314t2)), interfaceC17869a4), AbstractC18249c.m52577o(j17)), c28655q6, 0);
                        i27++;
                        c2314t = c2314t2;
                        i26 = 0;
                        f13 = f14;
                        c28655q3 = c28655q6;
                    }
                    c28655q3 = c28655q5;
                    C28655q c28655q7 = c28655q3;
                    boolean z14 = i26;
                    c28655q7.m87173q(z14);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h((TextResource) AbstractC25265s.m74112P0(listOfText), c28655q7, z14 ? 1 : 0), null, j16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getH5(), null, c28655q7, i25 & 896, 0, 196602);
                    C28655q c28655q8 = c28655q7;
                    z13 = false;
                    c28655q8.m87173q(false);
                    c28655q4 = c28655q8;
                }
                c28655q4.m87173q(z13);
                c28655q2 = c28655q4;
            }
            c28655q2.m87173q(z4);
            j15 = j17;
            interfaceC17869a3 = interfaceC17869a4;
            j14 = j16;
            modifier3 = modifier4;
            c28655q = c28655q2;
        } else {
            c28655q5.m87138X();
            modifier3 = modifier2;
            j14 = white50;
            interfaceC17869a3 = interfaceC17869a2;
            j15 = white10;
            c28655q = c28655q5;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4074m5(modifier3, listOfText, j14, interfaceC17869a3, j15, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m12529c(Modifier modifier, List list, long j7, InterfaceC17869a1 interfaceC17869a1, long j13, int i13, int i14, Composer composer, int i15) {
        m12528b(modifier, list, j7, interfaceC17869a1, j13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
