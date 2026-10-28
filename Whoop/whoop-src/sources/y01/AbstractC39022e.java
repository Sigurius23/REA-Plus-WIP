package y01;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.crypto.tink.internal.C5101l0;
import com.whoop.design.util.AbstractC8693b;
import java.util.List;
import l83.C23454a0;
import lz0.AbstractC24821f;
import m83.C25272z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p108e4.AbstractC12686t;
import p108e4.C12671e;
import p108e4.C12672f;
import p108e4.C12677k;
import p108e4.C12679m;
import p108e4.C12680n;
import p108e4.C12684r;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p581we.C37199o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wq1.C37508b;
import x81.C38072d;

/* JADX INFO: renamed from: y01.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly01/f;", "progressBreakdownState", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Ly01/f;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39022e {

    /* JADX INFO: renamed from: y01.e$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Ly2/t0;", "", "Ly2/q0;", "measurables", "Ly3/a;", "constraints", "Ly2/s0;", "a", "(Ly2/t0;Ljava/util/List;J)Ly2/s0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a implements InterfaceC39127r0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC28601c1 f167945a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12684r f167946b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C12679m f167947c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f167948d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC28601c1 f167949e;

        /* JADX INFO: renamed from: y01.e$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ly2/i1;", "Ll83/a0;", "a", "(Ly2/i1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42674a extends AbstractC22680m implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12684r f167950w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ List f167951x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42674a(C12684r c12684r, List list) {
                super(1);
                this.f167950w = c12684r;
                this.f167951x = list;
            }

            /* JADX INFO: renamed from: a */
            public final void m124437a(AbstractC39101i1 abstractC39101i1) {
                this.f167950w.m35489e(abstractC39101i1, this.f167951x);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m124437a((AbstractC39101i1) obj);
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC28601c1 interfaceC28601c1, C12684r c12684r, C12679m c12679m, int i13, InterfaceC28601c1 interfaceC28601c2) {
            this.f167945a = interfaceC28601c1;
            this.f167946b = c12684r;
            this.f167947c = c12679m;
            this.f167948d = i13;
            this.f167949e = interfaceC28601c2;
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: a */
        public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List<? extends InterfaceC39124q0> list, long j7) {
            this.f167945a.getValue();
            long jM35490f = this.f167946b.m35490f(j7, interfaceC39133t0.getLayoutDirection(), this.f167947c, list, this.f167948d);
            this.f167949e.getValue();
            return interfaceC39133t0.mo86822W((int) (jM35490f >> 32), (int) (jM35490f & 4294967295L), C25272z.f99163w, new C42674a(this.f167946b, list));
        }
    }

    /* JADX INFO: renamed from: y01.e$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f167952w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12679m f167953x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28601c1 interfaceC28601c1, C12679m c12679m) {
            super(0);
            this.f167952w = interfaceC28601c1;
            this.f167953x = c12679m;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134582invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134582invoke() {
            InterfaceC28601c1 interfaceC28601c1 = this.f167952w;
            interfaceC28601c1.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c1.getValue()).booleanValue()));
            this.f167953x.f43362z = true;
        }
    }

    /* JADX INFO: renamed from: y01.e$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Li3/z;", "Ll83/a0;", "a", "(Li3/z;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12684r f167954w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C12684r c12684r) {
            super(1);
            this.f167954w = c12684r;
        }

        /* JADX INFO: renamed from: a */
        public final void m124438a(InterfaceC18044z interfaceC18044z) {
            AbstractC12686t.m35496a(interfaceC18044z, this.f167954w);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m124438a((InterfaceC18044z) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y01.e$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "a", "(Landroidx/compose/runtime/Composer;I)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f167955w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12677k f167956x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f167957y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C39023f f167958z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC28601c1 interfaceC28601c1, C12677k c12677k, InterfaceC4339a interfaceC4339a, C39023f c39023f) {
            super(2);
            this.f167955w = interfaceC28601c1;
            this.f167956x = c12677k;
            this.f167957y = interfaceC4339a;
            this.f167958z = c39023f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v9 */
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
        /* JADX INFO: renamed from: a */
        public final void m124439a(Composer composer, int i13) {
            C39023f c39023f;
            C12672f c12672f;
            ?? r10;
            C28655q c28655q;
            Object obj;
            C2314t c2314t;
            C28655q c28655q2;
            C28655q c28655q3;
            Object obj2;
            if ((i13 & 3) == 2) {
                C28655q c28655q4 = (C28655q) composer;
                if (c28655q4.m87121F()) {
                    c28655q4.m87138X();
                    return;
                }
            }
            this.f167955w.setValue(C23454a0.f92919a);
            C12677k c12677k = this.f167956x;
            int i14 = c12677k.f43349b;
            c12677k.m35480e();
            C12677k c12677k2 = this.f167956x;
            C28655q c28655q5 = (C28655q) composer;
            c28655q5.m87150e0(-83339903);
            c28655q5.m87150e0(-2080898366);
            C39023f c39023f2 = this.f167958z;
            C12677k c12677k3 = (C12677k) c12677k2.m35479d().f2818x;
            C12672f c12672fM35478c = c12677k3.m35478c();
            C12672f c12672fM35478c2 = c12677k3.m35478c();
            C12672f c12672fM35478c3 = c12677k3.m35478c();
            C12672f c12672fM35478c4 = c12677k3.m35478c();
            boolean zM87157i = c28655q5.m87157i(c39023f2);
            Object objM87133R = c28655q5.m87133R();
            Object obj3 = C28635l.f115821a;
            if (zM87157i || objM87133R == obj3) {
                objM87133R = new e(c39023f2);
                c28655q5.m87172p0(objM87133R);
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM35476b = C12677k.m35476b(c2314t2, c12672fM35478c, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM35476b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(c0213j);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N);
            AbstractC24821f.m72736b(null, c39023f2.getCurrentProgressSteps(), c39023f2.getTotalProgressSteps(), C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(c39023f2.getProgressBarFillColor().mo134584toComposableColorWaAFU9c(c28655q5, 0)), new C17919x(c39023f2.getProgressBarFillColor().mo134584toComposableColorWaAFU9c(c28655q5, 0))), 0L, 0L, 14), c39023f2.getProgressBarBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q5, 0), false, 0.0f, c28655q5, 0, 97);
            c28655q5.m87173q(true);
            if (c39023f2.getUpperLeftState() != null) {
                c28655q5.m87150e0(1340591373);
                boolean zM87153g = c28655q5.m87153g(c12672fM35478c) | c28655q5.m87157i(c39023f2) | c28655q5.m87153g(c12672fM35478c3);
                Object objM87133R2 = c28655q5.m87133R();
                if (zM87153g || objM87133R2 == obj3) {
                    objM87133R2 = new f(c12672fM35478c, c39023f2, c12672fM35478c3);
                    c28655q5.m87172p0(objM87133R2);
                }
                c39023f = c39023f2;
                r10 = 0;
                c12672f = c12672fM35478c;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c39023f2.getUpperLeftState().getTitle(), c28655q5, 0), AbstractC1099a.m3398t(C12677k.m35476b(c2314t2, c12672fM35478c2, (Function1) objM87133R2), 0.0f, 0.0f, 0.0f, 1 * 8, 7), c39023f2.getUpperLeftState().getDisplayColor().mo134584toComposableColorWaAFU9c(c28655q5, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q5, 6).getN6(), null, c28655q5, 0, 0, 196600);
                C28655q c28655q6 = c28655q5;
                c28655q6.m87173q(false);
                c28655q = c28655q6;
            } else {
                c39023f = c39023f2;
                c12672f = c12672fM35478c;
                r10 = 0;
                c28655q5.m87150e0(1341338504);
                c28655q5.m87173q(false);
                c28655q = c28655q5;
            }
            if (c39023f.getUpperRightState() != null) {
                c28655q.m87150e0(1341420034);
                boolean zM87153g2 = c28655q.m87153g(c12672f) | c28655q.m87153g(c12672fM35478c2);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2) {
                    obj2 = r1;
                } else {
                    obj2 = obj3;
                    if (objM87133R3 == obj2) {
                    }
                    C28655q c28655q7 = c28655q;
                    c2314t = c2314t2;
                    obj = obj2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c39023f.getUpperRightState().getTitle(), c28655q, r10), AbstractC1099a.m3398t(C12677k.m35476b(c2314t2, c12672fM35478c3, (Function1) objM87133R3), 0.0f, 0.0f, 0.0f, 1 * 8, 7), c39023f.getUpperRightState().getDisplayColor().mo134584toComposableColorWaAFU9c(c28655q, r10), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN6(), null, c28655q7, 0, 0, 196088);
                    C28655q c28655q8 = c28655q7;
                    c28655q8.m87173q(r10);
                    c28655q2 = c28655q8;
                }
                objM87133R3 = new g(c12672f, c12672fM35478c2);
                c28655q.m87172p0(objM87133R3);
                C28655q c28655q9 = c28655q;
                c2314t = c2314t2;
                obj = obj2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c39023f.getUpperRightState().getTitle(), c28655q, r10), AbstractC1099a.m3398t(C12677k.m35476b(c2314t2, c12672fM35478c3, (Function1) objM87133R3), 0.0f, 0.0f, 0.0f, 1 * 8, 7), c39023f.getUpperRightState().getDisplayColor().mo134584toComposableColorWaAFU9c(c28655q, r10), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN6(), null, c28655q9, 0, 0, 196088);
                C28655q c28655q10 = c28655q9;
                c28655q10.m87173q(r10);
                c28655q2 = c28655q10;
            } else {
                obj = r1;
                c2314t = r30;
                c28655q.m87150e0(1342085480);
                c28655q.m87173q(r10);
                c28655q2 = c28655q;
            }
            if (c39023f.getLowerLeftState() != null) {
                c28655q2.m87150e0(1342166266);
                boolean zM87153g3 = c28655q2.m87153g(c12672f);
                Object objM87133R4 = c28655q2.m87133R();
                if (zM87153g3 || objM87133R4 == obj) {
                    objM87133R4 = new h(c12672f);
                    c28655q2.m87172p0(objM87133R4);
                }
                C28655q c28655q11 = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c39023f.getLowerLeftState().getTitle(), c28655q2, r10), AbstractC1099a.m3398t(C12677k.m35476b(c2314t, c12672fM35478c4, (Function1) objM87133R4), 0.0f, 1 * 8, 0.0f, 0.0f, 13), c39023f.getLowerLeftState().getDisplayColor().mo134584toComposableColorWaAFU9c(c28655q2, r10), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getH5(), null, c28655q11, 0, 0, 196600);
                C28655q c28655q12 = c28655q11;
                c28655q12.m87173q(r10);
                c28655q3 = c28655q12;
            } else {
                c28655q2.m87150e0(1342839400);
                c28655q2.m87173q(r10);
                c28655q3 = c28655q2;
            }
            c28655q3.m87173q(r10);
            c28655q3.m87173q(r10);
            if (this.f167956x.f43349b != i14) {
                AbstractC28683x.m87257k(this.f167957y, c28655q3);
            }
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124439a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y01.e$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C39023f f167959w;

        public e(C39023f c39023f) {
            this.f167959w = c39023f;
        }

        /* JADX INFO: renamed from: a */
        public final void m124440a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C12672f c12672f = constrainAs.f43326c;
            if (this.f167959w.getUpperLeftState() == null && this.f167959w.getUpperRightState() == null) {
                C5101l0.m16026X(constrainAs.f43328e, c12672f.f43334e, 0.0f, 6);
            }
            if (this.f167959w.getLowerLeftState() == null) {
                C5101l0.m16026X(constrainAs.f43330g, c12672f.f43336g, 0.0f, 6);
            }
            C37199o.m119194J(constrainAs.f43327d, c12672f.f43333d, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, c12672f.f43335f, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m124440a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y01.e$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f167960w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39023f f167961x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12672f f167962y;

        public f(C12672f c12672f, C39023f c39023f, C12672f c12672f2) {
            this.f167960w = c12672f;
            this.f167961x = c39023f;
            this.f167962y = c12672f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m124441a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43330g, this.f167960w.f43334e, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f167960w.f43333d, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, this.f167961x.getUpperRightState() != null ? this.f167962y.f43333d : this.f167960w.f43335f, 0.0f, 6);
            constrainAs.m35473a(new C12680n("spread"));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m124441a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y01.e$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f167963w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12672f f167964x;

        public g(C12672f c12672f, C12672f c12672f2) {
            this.f167963w = c12672f;
            this.f167964x = c12672f2;
        }

        /* JADX INFO: renamed from: a */
        public final void m124442a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43330g, this.f167963w.f43334e, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, this.f167963w.f43335f, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f167964x.f43335f, 0.0f, 6);
            constrainAs.m35473a(new C12680n("spread"));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m124442a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y01.e$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f167965w;

        public h(C12672f c12672f) {
            this.f167965w = c12672f;
        }

        /* JADX INFO: renamed from: a */
        public final void m124443a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43328e, this.f167965w.f43336g, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f167965w.f43333d, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43329f, this.f167965w.f43335f, 0.0f, 6);
            C5101l0.m16026X(constrainAs.f43330g, constrainAs.f43326c.f43336g, 0.0f, 6);
            constrainAs.m35473a(new C12680n("spread"));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m124443a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m124435b(Modifier modifier, C39023f progressBreakdownState, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(progressBreakdownState, "progressBreakdownState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(787217776);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(modifier) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(progressBreakdownState) : c28655q.m87157i(progressBreakdownState) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier = c2314t;
            }
            Modifier modifierMo3471e = AbstractC1099a.m3396r(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, c2314t), null, 3), 2 * 8, 0.0f, 2).mo3471e(modifier);
            c28655q.m87150e0(-1003410150);
            c28655q.m87150e0(212064437);
            c28655q.m87173q(false);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C12684r(interfaceC39171c);
                c28655q.m87172p0(objM87133R);
            }
            C12684r c12684r = (C12684r) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C12677k();
                c28655q.m87172p0(objM87133R2);
            }
            C12677k c12677k = (C12677k) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C12679m(c12677k);
                c28655q.m87172p0(objM87133R4);
            }
            C12679m c12679m = (C12679m) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                C28633k1 c28633k1 = new C28633k1(C23454a0.f92919a, C28676v0.f115976y);
                c28655q.m87172p0(c28633k1);
                objM87133R5 = c28633k1;
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R5;
            boolean zM87157i = c28655q.m87157i(c12684r) | c28655q.m87149e(257);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i || objM87133R6 == c28676v0) {
                a aVar = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                c28655q.m87172p0(aVar);
                objM87133R6 = aVar;
            }
            InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R6;
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new b(interfaceC28601c1, c12679m);
                c28655q.m87172p0(objM87133R7);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R7;
            boolean zM87157i2 = c28655q.m87157i(c12684r);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i2 || objM87133R8 == c28676v0) {
                objM87133R8 = new c(c12684r);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC39125q1.m124655a(AbstractC18032n.m51775c(modifierMo3471e, false, (Function1) objM87133R8), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a, progressBreakdownState)), interfaceC39127r0, c28655q, 48);
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(modifier2, i13, progressBreakdownState, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m124436c(Modifier modifier, C39023f c39023f, int i13, int i14, Composer composer, int i15) {
        m124435b(modifier, c39023f, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
