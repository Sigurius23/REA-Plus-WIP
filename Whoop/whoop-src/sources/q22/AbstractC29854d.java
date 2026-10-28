package q22;

import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.payments.domain.models.Card;
import cp0.C10941a;
import l83.C23454a0;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: q22.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ao\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\t2\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0017²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lq22/e;", "formValidator", "Lcom/whoop/payments/domain/models/Card;", "initialValues", "Lkotlin/Function2;", "Lq22/h;", "", "Ll83/a0;", "onFocusChanged", "Lkotlin/Function1;", "onTextChanged", "updateSubmitStatus", "r", "(Lq22/e;Lcom/whoop/payments/domain/models/Card;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "", "text", "Q", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lq22/f;", "cardNumber", "cardExpiration", "cardCvv", "cardZip", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29854d {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m91432A(C29855e c29855e, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, String it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.length() < 17) {
            m91445N(interfaceC28601c1, AbstractC29857g.m91492b(m91444M(interfaceC28601c1), c29855e, it, false, false, 12, null));
            interfaceC4351m.invoke(Boolean.valueOf(c29855e.m91481a(AbstractC37056f.m118959K(m91470u(interfaceC28601c2), m91446O(interfaceC28601c3), m91444M(interfaceC28601c1), m91472w(interfaceC28601c4)))), new Card(m91444M(interfaceC28601c1).getValue(), m91446O(interfaceC28601c3).getValue(), m91470u(interfaceC28601c2).getValue(), m91472w(interfaceC28601c4).getValue()));
            function1.invoke(EnumC29858h.CARD_NUMBER);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m91433B(C29855e c29855e, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        EnumC15251w enumC15251w = (EnumC15251w) it;
        if (!enumC15251w.m43353a()) {
            m91445N(interfaceC28601c1, AbstractC29857g.m91492b(m91444M(interfaceC28601c1), c29855e, null, true, false, 10, null));
            interfaceC4351m.invoke(Boolean.valueOf(c29855e.m91481a(AbstractC37056f.m118959K(m91470u(interfaceC28601c2), m91446O(interfaceC28601c3), m91444M(interfaceC28601c1), m91472w(interfaceC28601c4)))), new Card(m91444M(interfaceC28601c1).getValue(), m91446O(interfaceC28601c3).getValue(), m91470u(interfaceC28601c2).getValue(), m91472w(interfaceC28601c4).getValue()));
        }
        interfaceC4351m2.invoke(EnumC29858h.CARD_EXPIRATION, Boolean.valueOf(enumC15251w.m43353a()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m91434C() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m91435D(C29855e c29855e, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, String it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.length() < 5) {
            m91447P(interfaceC28601c1, AbstractC29857g.m91492b(m91446O(interfaceC28601c1), c29855e, it, false, false, 12, null));
            interfaceC4351m.invoke(Boolean.valueOf(c29855e.m91481a(AbstractC37056f.m118959K(m91470u(interfaceC28601c2), m91446O(interfaceC28601c1), m91444M(interfaceC28601c3), m91472w(interfaceC28601c4)))), new Card(m91444M(interfaceC28601c3).getValue(), m91446O(interfaceC28601c1).getValue(), m91470u(interfaceC28601c2).getValue(), m91472w(interfaceC28601c4).getValue()));
            function1.invoke(EnumC29858h.CARD_EXPIRATION);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m91436E(C29855e c29855e, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        EnumC15251w enumC15251w = (EnumC15251w) it;
        if (!enumC15251w.m43353a()) {
            m91471v(interfaceC28601c1, AbstractC29857g.m91492b(m91470u(interfaceC28601c1), c29855e, null, true, false, 10, null));
            interfaceC4351m.invoke(Boolean.valueOf(c29855e.m91481a(AbstractC37056f.m118959K(m91470u(interfaceC28601c1), m91446O(interfaceC28601c2), m91444M(interfaceC28601c3), m91472w(interfaceC28601c4)))), new Card(m91444M(interfaceC28601c3).getValue(), m91446O(interfaceC28601c2).getValue(), m91470u(interfaceC28601c1).getValue(), m91472w(interfaceC28601c4).getValue()));
        }
        interfaceC4351m2.invoke(EnumC29858h.CARD_CVV, Boolean.valueOf(enumC15251w.m43353a()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m91437F() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m91438G(C29855e c29855e, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, String it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.length() < 5) {
            m91471v(interfaceC28601c1, AbstractC29857g.m91492b(m91470u(interfaceC28601c1), c29855e, it, false, false, 12, null));
            interfaceC4351m.invoke(Boolean.valueOf(c29855e.m91481a(AbstractC37056f.m118959K(m91470u(interfaceC28601c1), m91446O(interfaceC28601c2), m91444M(interfaceC28601c3), m91472w(interfaceC28601c4)))), new Card(m91444M(interfaceC28601c3).getValue(), m91446O(interfaceC28601c2).getValue(), m91470u(interfaceC28601c1).getValue(), m91472w(interfaceC28601c4).getValue()));
            function1.invoke(EnumC29858h.CARD_CVV);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m91439H(C29855e c29855e, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        EnumC15251w enumC15251w = (EnumC15251w) it;
        if (!enumC15251w.m43353a()) {
            m91473x(interfaceC28601c1, AbstractC29857g.m91492b(m91472w(interfaceC28601c1), c29855e, null, true, false, 10, null));
            interfaceC4351m.invoke(Boolean.valueOf(c29855e.m91481a(AbstractC37056f.m118959K(m91470u(interfaceC28601c2), m91446O(interfaceC28601c3), m91444M(interfaceC28601c4), m91472w(interfaceC28601c1)))), new Card(m91444M(interfaceC28601c4).getValue(), m91446O(interfaceC28601c3).getValue(), m91470u(interfaceC28601c2).getValue(), m91472w(interfaceC28601c1).getValue()));
        }
        interfaceC4351m2.invoke(EnumC29858h.CARD_ZIP, Boolean.valueOf(enumC15251w.m43353a()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m91440I(boolean z4, Card card) {
        AbstractC22676k.m65750j(card, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m91441J() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m91442K(C29855e c29855e, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, String it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.length() < 11) {
            m91473x(interfaceC28601c1, AbstractC29857g.m91492b(m91472w(interfaceC28601c1), c29855e, it, false, false, 12, null));
            interfaceC4351m.invoke(Boolean.valueOf(c29855e.m91481a(AbstractC37056f.m118959K(m91470u(interfaceC28601c2), m91446O(interfaceC28601c3), m91444M(interfaceC28601c4), m91472w(interfaceC28601c1)))), new Card(m91444M(interfaceC28601c4).getValue(), m91446O(interfaceC28601c3).getValue(), m91470u(interfaceC28601c2).getValue(), m91472w(interfaceC28601c1).getValue()));
            function1.invoke(EnumC29858h.CARD_ZIP);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m91443L(C29855e c29855e, Card card, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC4351m interfaceC4351m2, int i13, int i14, Composer composer, int i15) {
        m91467r(c29855e, card, interfaceC4351m, function1, interfaceC4351m2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final C29856f m91444M(InterfaceC28601c1 interfaceC28601c1) {
        return (C29856f) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: N */
    private static final void m91445N(InterfaceC28601c1 interfaceC28601c1, C29856f c29856f) {
        interfaceC28601c1.setValue(c29856f);
    }

    /* JADX INFO: renamed from: O */
    private static final C29856f m91446O(InterfaceC28601c1 interfaceC28601c1) {
        return (C29856f) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: P */
    private static final void m91447P(InterfaceC28601c1 interfaceC28601c1, C29856f c29856f) {
        interfaceC28601c1.setValue(c29856f);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m91448Q(String text, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1926186237);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(text) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(text, null, c38072d.m121949b(c28655q2, i15).getWhite30(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getN7(), null, c28655q, i14 & 14, C2886a.f11498d << 18, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(text, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m91449R(String str, int i13, Composer composer, int i14) {
        m91448Q(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Failed to calculate best type for var: r3v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v38 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v38 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r43v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r43v0 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r43v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r43v0 ??, new type: p1.q
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
    /* JADX WARN: Failed to calculate best type for var: r43v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r43v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r43v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r43v1 ??, new type: p1.q
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
    /* JADX WARN: Failed to calculate best type for var: r43v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r43v5 ??, new type: p1.q
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
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: p1.q
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v1 ??, new type: p1.q
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v38 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: r */
    public static final void m91467r(q22.C29855e r75, com.whoop.payments.domain.models.Card r76, c93.InterfaceC4351m r77, p715kotlin.jvm.functions.Function1 r78, c93.InterfaceC4351m r79, androidx.compose.runtime.Composer r80, int r81, int r82) {
        /*
            Method dump skipped, instruction units count: 2651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q22.AbstractC29854d.m91467r(q22.e, com.whoop.payments.domain.models.Card, c93.m, kotlin.jvm.functions.Function1, c93.m, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m91468s(EnumC29858h enumC29858h, boolean z4) {
        AbstractC22676k.m65750j(enumC29858h, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m91469t(EnumC29858h enumC29858h) {
        AbstractC22676k.m65750j(enumC29858h, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final C29856f m91470u(InterfaceC28601c1 interfaceC28601c1) {
        return (C29856f) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: v */
    private static final void m91471v(InterfaceC28601c1 interfaceC28601c1, C29856f c29856f) {
        interfaceC28601c1.setValue(c29856f);
    }

    /* JADX INFO: renamed from: w */
    private static final C29856f m91472w(InterfaceC28601c1 interfaceC28601c1) {
        return (C29856f) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: x */
    private static final void m91473x(InterfaceC28601c1 interfaceC28601c1, C29856f c29856f) {
        interfaceC28601c1.setValue(c29856f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m91474y(C29855e c29855e, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        EnumC15251w enumC15251w = (EnumC15251w) it;
        if (!enumC15251w.m43353a()) {
            m91445N(interfaceC28601c1, AbstractC29857g.m91492b(m91444M(interfaceC28601c1), c29855e, null, true, false, 10, null));
            interfaceC4351m.invoke(Boolean.valueOf(c29855e.m91481a(AbstractC37056f.m118959K(m91470u(interfaceC28601c2), m91446O(interfaceC28601c3), m91444M(interfaceC28601c1), m91472w(interfaceC28601c4)))), new Card(m91444M(interfaceC28601c1).getValue(), m91446O(interfaceC28601c3).getValue(), m91470u(interfaceC28601c2).getValue(), m91472w(interfaceC28601c4).getValue()));
        }
        interfaceC4351m2.invoke(EnumC29858h.CARD_NUMBER, Boolean.valueOf(enumC15251w.m43353a()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m91475z() {
        return C23454a0.f92919a;
    }
}
