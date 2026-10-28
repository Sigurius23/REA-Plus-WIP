package gz2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f02.C13917c;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import hz2.C17818c;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: gz2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lhz2/c;", "section", "Lkotlin/Function1;", "Lcom/whoop/whooplabs/feature/navigation/c;", "Ll83/a0;", "onNavEvent", "Landroidx/compose/ui/Modifier;", "modifier", "b", "(Lhz2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16339f {
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0195  */
    /* JADX WARN: Code duplicated, block: B:55:0x019e  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v12 */
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
    public static final void m46546b(C17818c section, Function1 onNavEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        TextResource title;
        ?? r10;
        C2314t c2314t2;
        C28655q c28655q2;
        AbstractC22676k.m65750j(section, "section");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-713732953);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(section) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(onNavEvent) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q3.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifier3);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                title = section.getTitle();
                if (title == null) {
                    c28655q3.m87150e0(509278814);
                    c28655q3.m87173q(false);
                    c2314t2 = c2314t;
                    r10 = 1;
                    c28655q2 = c28655q3;
                } else {
                    c28655q3.m87150e0(509278815);
                    String strM21274h = AbstractC8693b.m21274h(title, c28655q3, TextResource.$stable);
                    C38072d c38072d = C38072d.f163053a;
                    int i17 = C38072d.f163054b;
                    r10 = 1;
                    c2314t2 = c2314t;
                    AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q3, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i17).getH2(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                    C28655q c28655q4 = c28655q3;
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                }
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(3 * 4, c2314t2));
                AbstractC16336c.m46534c(section.m51251a(), onNavEvent, null, c28655q2, i15 & 112, 4);
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t2, 0.0f, ((float) 2.5d) * 8, r10), EnumC17744g.SOLID, null, null, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite50(), 0L, null, c28655q2, 54, 220);
                c28655q2.m87173q(r10);
                modifier2 = modifier3;
                c28655q = c28655q2;
            } else {
                c28655q3.m87138X();
                c28655q = c28655q3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13917c(i13, i14, 16, section, modifier2, onNavEvent);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifier3);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
            title = section.getTitle();
            if (title == null) {
                c28655q3.m87150e0(509278814);
                c28655q3.m87173q(false);
                c2314t2 = c2314t;
                r10 = 1;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(509278815);
                String strM21274h2 = AbstractC8693b.m21274h(title, c28655q3, TextResource.$stable);
                C38072d c38072d2 = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                r10 = 1;
                c2314t2 = c2314t;
                AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q3, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i18).getH2(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                C28655q c28655q5 = c28655q3;
                c28655q5.m87173q(false);
                c28655q2 = c28655q5;
            }
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(3 * 4, c2314t2));
            AbstractC16336c.m46534c(section.m51251a(), onNavEvent, null, c28655q2, i15 & 112, 4);
            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t2, 0.0f, ((float) 2.5d) * 8, r10), EnumC17744g.SOLID, null, null, null, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite50(), 0L, null, c28655q2, 54, 220);
            c28655q2.m87173q(r10);
            modifier2 = modifier3;
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 16, section, modifier2, onNavEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m46547c(C17818c c17818c, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m46546b(c17818c, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
