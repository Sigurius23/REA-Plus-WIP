package c01;

import a01.C0089i;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.google.crypto.tink.internal.C5101l0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25267u;
import m83.C25272z;
import p000.AbstractC11266d;
import p003a1.C0103b;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p108e4.AbstractC12686t;
import p108e4.C12671e;
import p108e4.C12672f;
import p108e4.C12677k;
import p108e4.C12679m;
import p108e4.C12684r;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p353o0.C27317b;
import p353o0.C27323g;
import p353o0.InterfaceC27326j;
import p353o0.InterfaceC27335s;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p581we.C37199o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import se.AbstractC32417h;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c01.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000e\u0010\b\u001a!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\b\u001a!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc01/h;", "viewState", "Ll83/a0;", "i", "(Landroidx/compose/ui/Modifier;Lc01/h;Landroidx/compose/runtime/Composer;II)V", "k", "(Lc01/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "unit", "v", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V", "t", "Lc01/a;", "bar", "m", "(Lc01/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "q", "Lc01/i;", "o", "(Lc01/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3805e {

    /* JADX INFO: renamed from: c01.e$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Ly2/t0;", "", "Ly2/q0;", "measurables", "Ly3/a;", "constraints", "Ly2/s0;", "a", "(Ly2/t0;Ljava/util/List;J)Ly2/s0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a implements InterfaceC39127r0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC28601c1 f15567a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12684r f15568b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C12679m f15569c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f15570d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC28601c1 f15571e;

        /* JADX INFO: renamed from: c01.e$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ly2/i1;", "Ll83/a0;", "a", "(Ly2/i1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41333a extends AbstractC22680m implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12684r f15572w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ List f15573x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41333a(C12684r c12684r, List list) {
                super(1);
                this.f15572w = c12684r;
                this.f15573x = list;
            }

            /* JADX INFO: renamed from: a */
            public final void m11633a(AbstractC39101i1 abstractC39101i1) {
                this.f15572w.m35489e(abstractC39101i1, this.f15573x);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m11633a((AbstractC39101i1) obj);
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC28601c1 interfaceC28601c1, C12684r c12684r, C12679m c12679m, int i13, InterfaceC28601c1 interfaceC28601c2) {
            this.f15567a = interfaceC28601c1;
            this.f15568b = c12684r;
            this.f15569c = c12679m;
            this.f15570d = i13;
            this.f15571e = interfaceC28601c2;
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: a */
        public final InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List<? extends InterfaceC39124q0> list, long j7) {
            this.f15567a.getValue();
            long jM35490f = this.f15568b.m35490f(j7, interfaceC39133t0.getLayoutDirection(), this.f15569c, list, this.f15570d);
            this.f15571e.getValue();
            return interfaceC39133t0.mo86822W((int) (jM35490f >> 32), (int) (jM35490f & 4294967295L), C25272z.f99163w, new C41333a(this.f15568b, list));
        }
    }

    /* JADX INFO: renamed from: c01.e$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "invoke", "()V", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f15574w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12679m f15575x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28601c1 interfaceC28601c1, C12679m c12679m) {
            super(0);
            this.f15574w = interfaceC28601c1;
            this.f15575x = c12679m;
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134048invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134048invoke() {
            InterfaceC28601c1 interfaceC28601c1 = this.f15574w;
            interfaceC28601c1.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c1.getValue()).booleanValue()));
            this.f15575x.f43362z = true;
        }
    }

    /* JADX INFO: renamed from: c01.e$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Li3/z;", "Ll83/a0;", "a", "(Li3/z;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12684r f15576w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C12684r c12684r) {
            super(1);
            this.f15576w = c12684r;
        }

        /* JADX INFO: renamed from: a */
        public final void m11634a(InterfaceC18044z interfaceC18044z) {
            AbstractC12686t.m35496a(interfaceC18044z, this.f15576w);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m11634a((InterfaceC18044z) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c01.e$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "a", "(Landroidx/compose/runtime/Composer;I)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C3809i f15577E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f15578w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12677k f15579x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f15580y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Modifier f15581z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC28601c1 interfaceC28601c1, C12677k c12677k, InterfaceC4339a interfaceC4339a, Modifier modifier, C3809i c3809i) {
            super(2);
            this.f15578w = interfaceC28601c1;
            this.f15579x = c12677k;
            this.f15580y = interfaceC4339a;
            this.f15581z = modifier;
            this.f15577E = c3809i;
        }

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
        public final void m11635a(Composer composer, int i13) {
            if ((i13 & 3) == 2) {
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87121F()) {
                    c28655q.m87138X();
                    return;
                }
            }
            this.f15578w.setValue(C23454a0.f92919a);
            C12677k c12677k = this.f15579x;
            int i14 = c12677k.f43349b;
            c12677k.m35480e();
            C12677k c12677k2 = this.f15579x;
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1743448097);
            C12677k c12677k3 = (C12677k) c12677k2.m35479d().f2818x;
            C12672f c12672fM35478c = c12677k3.m35478c();
            C12672f c12672fM35478c2 = c12677k3.m35478c();
            C12672f c12672fM35478c3 = c12677k3.m35478c();
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3419p(2 * 4, this.f15581z), this.f15577E.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), AbstractC17918w0.f69621a);
            boolean zM87153g = c28655q2.m87153g(c12672fM35478c2);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new e(c12672fM35478c2);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC22989q.m66760a(C12677k.m35476b(modifierM3358c, c12672fM35478c, (Function1) objM87133R), c28655q2, 0);
            boolean zM87153g2 = c28655q2.m87153g(c12672fM35478c);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new f(c12672fM35478c);
                c28655q2.m87172p0(objM87133R2);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM35476b = C12677k.m35476b(c2314t, c12672fM35478c2, (Function1) objM87133R2);
            String strM21274h = AbstractC8693b.m21274h(this.f15577E.getBottomDisplay(), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, modifierM35476b, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN7(), null, c28655q2, 0, 0, 196600);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 3 * 8, 0.0f, 0.0f, 0.0f, 14);
            boolean zM87153g3 = c28655q2.m87153g(c12672fM35478c2);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87153g3 || objM87133R3 == c28676v0) {
                objM87133R3 = new g(c12672fM35478c2);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(this.f15577E.getLabel(), c28655q2, 0), C12677k.m35476b(modifierM3398t, c12672fM35478c3, (Function1) objM87133R3), c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q2, 0, 0, 196600);
            c28655q2.m87173q(false);
            if (this.f15579x.f43349b != i14) {
                AbstractC28683x.m87257k(this.f15580y, c28655q2);
            }
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m11635a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c01.e$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f15582w;

        public e(C12672f c12672f) {
            this.f15582w = c12672f;
        }

        /* JADX INFO: renamed from: a */
        public final void m11636a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43330g, this.f15582w.f43336g, 1 * 4, 4);
            C37199o.m119194J(constrainAs.f43327d, constrainAs.f43326c.f43333d, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m11636a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c01.e$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f15583w;

        public f(C12672f c12672f) {
            this.f15583w = c12672f;
        }

        /* JADX INFO: renamed from: a */
        public final void m11637a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43330g, constrainAs.f43326c.f43336g, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f15583w.f43335f, 2 * 4, 4);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m11637a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c01.e$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12672f f15584w;

        public g(C12672f c12672f) {
            this.f15584w = c12672f;
        }

        /* JADX INFO: renamed from: a */
        public final void m11638a(C12671e constrainAs) {
            AbstractC22676k.m65750j(constrainAs, "$this$constrainAs");
            C5101l0.m16026X(constrainAs.f43330g, this.f15584w.f43336g, 0.0f, 6);
            C37199o.m119194J(constrainAs.f43327d, this.f15584w.f43335f, 0.0f, 6);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m11638a((C12671e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c01.e$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f15585w = new h();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C3809i c3809i) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c01.e$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f15586w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f15587x;

        public i(Function1 function1, List list) {
            this.f15586w = function1;
            this.f15587x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m11640a(int i13) {
            return this.f15586w.invoke(this.f15587x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m11640a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: c01.e$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f15588w;

        public j(List list) {
            this.f15588w = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m11641a(InterfaceC27326j interfaceC27326j, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC27326j) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C3809i c3809i = (C3809i) this.f15588w.get(i13);
            c28655q.m87150e0(1837615442);
            AbstractC3805e.m11623o(c3809i, null, c28655q, 0, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m11641a((InterfaceC27326j) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c01.e$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC39127r0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC39171c f15589a;

        public k(InterfaceC39171c interfaceC39171c) {
            this.f15589a = interfaceC39171c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final C23454a0 m11643g(boolean z4, AbstractC39104j1 abstractC39104j1, AbstractC39104j1 abstractC39104j2, int i13, int i14, AbstractC39101i1 layout) {
            AbstractC22676k.m65750j(layout, "$this$layout");
            if (z4) {
                AbstractC39101i1.m124624n(abstractC39104j1, 0, 0, layout);
                AbstractC39101i1.m124624n(abstractC39104j2, abstractC39104j1.f168211w + i13, 0, layout);
            } else {
                AbstractC39101i1.m124624n(abstractC39104j1, 0, 0, layout);
                AbstractC39101i1.m124624n(abstractC39104j2, 0, abstractC39104j1.f168212x + i14, layout);
            }
            return C23454a0.f92919a;
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: a */
        public final InterfaceC39130s0 mo521a(InterfaceC39133t0 Layout, List<? extends InterfaceC39124q0> measurables, long j7) {
            AbstractC22676k.m65750j(Layout, "$this$Layout");
            AbstractC22676k.m65750j(measurables, "measurables");
            long jM124758b = C39169a.m124758b(j7, 0, 0, 0, 0, 10);
            final AbstractC39104j1 abstractC39104j1Mo448T = measurables.get(0).mo448T(jM124758b);
            final AbstractC39104j1 abstractC39104j1Mo448T2 = measurables.get(1).mo448T(jM124758b);
            float f13 = 4;
            final int iMo724F = this.f15589a.mo724F(1 * f13);
            final int iMo724F2 = this.f15589a.mo724F(((float) 2.5d) * f13);
            final boolean z4 = (abstractC39104j1Mo448T.f168211w + iMo724F) + abstractC39104j1Mo448T2.f168211w <= C39169a.m124765i(j7);
            C23465k c23465k = z4 ? new C23465k(Integer.valueOf(AbstractC12889b.m36284n(abstractC39104j1Mo448T.f168211w + iMo724F + abstractC39104j1Mo448T2.f168211w, C39169a.m124767k(j7), C39169a.m124765i(j7))), Integer.valueOf(AbstractC12889b.m36284n(Math.max(abstractC39104j1Mo448T.f168212x, abstractC39104j1Mo448T2.f168212x), C39169a.m124766j(j7), C39169a.m124764h(j7)))) : new C23465k(Integer.valueOf(C39169a.m124765i(j7)), Integer.valueOf(AbstractC12889b.m36284n(abstractC39104j1Mo448T.f168212x + iMo724F2 + abstractC39104j1Mo448T2.f168212x, C39169a.m124766j(j7), C39169a.m124764h(j7))));
            return Layout.mo86822W(((Number) c23465k.f92937w).intValue(), ((Number) c23465k.f92938x).intValue(), C25272z.f99163w, new Function1() { // from class: c01.f
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC3805e.k.m11643g(z4, abstractC39104j1Mo448T, abstractC39104j1Mo448T2, iMo724F, iMo724F2, (AbstractC39101i1) obj);
                }
            });
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: b */
        public /* bridge */ int mo537b(InterfaceC39126r interfaceC39126r, List<? extends InterfaceC39124q0> list, int i13) {
            return super.mo537b(interfaceC39126r, list, i13);
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: c */
        public /* bridge */ int mo538c(InterfaceC39126r interfaceC39126r, List<? extends InterfaceC39124q0> list, int i13) {
            return super.mo538c(interfaceC39126r, list, i13);
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: d */
        public /* bridge */ int mo539d(InterfaceC39126r interfaceC39126r, List<? extends InterfaceC39124q0> list, int i13) {
            return super.mo539d(interfaceC39126r, list, i13);
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: e */
        public /* bridge */ int mo540e(InterfaceC39126r interfaceC39126r, List<? extends InterfaceC39124q0> list, int i13) {
            return super.mo540e(interfaceC39126r, list, i13);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m11617i(Modifier modifier, C3808h viewState, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1281129144);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier = c2314t;
            }
            if (!viewState.m11658a().isEmpty()) {
                c28655q.m87150e0(1039076026);
                int i17 = ((i15 >> 3) & 14) | ((i15 << 3) & 112);
                m11619k(viewState, modifier, c28655q, i17, 0);
                AbstractC11266d.m30469w(3, 4, c2314t, c28655q);
                m11628t(viewState, modifier, c28655q, i17, 0);
                c28655q.m87173q(false);
            } else if (viewState.m11659b().isEmpty()) {
                c28655q.m87150e0(1039613194);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1039337201);
                int i18 = ((i15 >> 3) & 14) | ((i15 << 3) & 112);
                m11619k(viewState, modifier, c28655q, i18, 0);
                float f13 = 3 * 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                m11625q(viewState, modifier, c28655q, i18, 0);
                AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3803c(modifier, viewState, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m11618j(Modifier modifier, C3808h c3808h, int i13, int i14, Composer composer, int i15) {
        m11617i(modifier, c3808h, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02de  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:106:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x0321  */
    /* JADX WARN: Code duplicated, block: B:110:0x0325  */
    /* JADX WARN: Code duplicated, block: B:113:0x033a  */
    /* JADX WARN: Code duplicated, block: B:116:0x034b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0388  */
    /* JADX WARN: Code duplicated, block: B:121:0x038c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0399  */
    /* JADX WARN: Code duplicated, block: B:126:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:128:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:131:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:136:0x0253 A[EDGE_INSN: B:136:0x0253->B:86:0x0253 BREAK  A[LOOP:0: B:50:0x012e->B:85:0x024a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0116  */
    /* JADX WARN: Code duplicated, block: B:52:0x013c  */
    /* JADX WARN: Code duplicated, block: B:54:0x015e  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0207  */
    /* JADX WARN: Code duplicated, block: B:77:0x020b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0218  */
    /* JADX WARN: Code duplicated, block: B:82:0x0226  */
    /* JADX WARN: Code duplicated, block: B:84:0x023b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0282  */
    /* JADX WARN: Code duplicated, block: B:89:0x0286  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [y81.e] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r3v22, types: [y81.e] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX INFO: renamed from: k */
    private static final void m11619k(C3808h c3808h, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        ?? r14;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        int iHashCode2;
        Iterator it;
        boolean zHasNext;
        C17916v0 c17916v0;
        int i16;
        C2305k c2305k;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        Iterator it3;
        C3809i c3809i;
        long jMo134584toComposableColorWaAFU9c;
        C2305k c2305k2;
        float fM11666d;
        C2305k c2305k3;
        int iHashCode4;
        C0213j c0213j3;
        C0209i c0209i3;
        int iHashCode5;
        C3801a c3801a;
        long jM51541c;
        C2305k c2305k4;
        ?? r10;
        float fM11602a;
        float f14;
        int iHashCode6;
        C0213j c0213j4;
        C0209i c0209i4;
        int iHashCode7;
        C2307m c2307m = C2299e.f9114w;
        C2305k c2305k5 = C2299e.f9111N;
        C2306l c2306l = C2299e.f9107J;
        ?? r15 = (C28655q) composer;
        r15.m87154g0(78120897);
        if ((i13 & 6) == 0) {
            i15 = i13 | (r15.m87157i(c3808h) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= r15.m87153g(modifier2) ? 32 : 16;
            }
            r14 = 0;
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (r15.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
                iHashCode = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = r15.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(r15, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(r15, c0209i5, c23010xM66775a);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(r15, c0209i6, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, r15, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(r15, c0209i7, modifierM118962N);
                f13 = 1.0f;
                m11630v(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 0.0f, 0.0f, ((float) 1.25d) * 8, 7), c3808h.getTitle(), c3808h.getUnit(), r15, 0, 0);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r15, 0);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, modifier4);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i5, c22994r1M66759a);
                AbstractC28683x.m87239G(r15, c0209i6, interfaceC28653p1M87165m2);
                if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(r15, c0209i7, modifierM118962N2);
                r15.m87150e0(-495757758);
                it = c3808h.m11658a().iterator();
                while (true) {
                    zHasNext = it.hasNext();
                    c17916v0 = AbstractC17918w0.f69621a;
                    i16 = 48;
                    if (zHasNext) {
                        break;
                    }
                    c3801a = (C3801a) it.next();
                    jM51541c = C17919x.m51541c(c3801a.getOpacity(), c3801a.getColor().mo134584toComposableColorWaAFU9c(r15, r14));
                    if (c3801a.getAmount() >= f13) {
                        r15.m87150e0(253177916);
                        fM11602a = c3801a.getAmount();
                        if (fM11602a <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (fM11602a > Float.MAX_VALUE) {
                            f14 = Float.MAX_VALUE;
                        } else {
                            f14 = fM11602a;
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f14, true);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k5, r15, 48);
                        iHashCode6 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, layoutWeightElement);
                        InterfaceC0221l.f734a.getClass();
                        c0213j4 = C0217k.f724b;
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j4);
                        } else {
                            r15.m87178s0();
                        }
                        C0209i c0209i8 = C0217k.f729g;
                        AbstractC28683x.m87239G(r15, c0209i8, c23010xM66775a2);
                        C0209i c0209i9 = C0217k.f728f;
                        AbstractC28683x.m87239G(r15, c0209i9, interfaceC28653p1M87165m3);
                        c0209i4 = C0217k.f732j;
                        if (r15.f115903S) {
                            c2305k4 = c2305k5;
                        } else {
                            c2305k4 = c2305k5;
                            if (!AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode6))) {
                            }
                            C0209i c0209i10 = C0217k.f726d;
                            AbstractC28683x.m87239G(r15, c0209i10, modifierM118962N3);
                            float f15 = 4;
                            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3411h(3 * f15, AbstractC1102d.m3409f(f13, c2314t)), jM51541c, c17916v0);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode7 = Long.hashCode(r15.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = r15.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(r15, modifierM3358c);
                            r15.m87158i0();
                            if (r15.f115903S) {
                                r15.m87163l(c0213j4);
                            } else {
                                r15.m87178s0();
                            }
                            AbstractC28683x.m87239G(r15, c0209i8, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(r15, c0209i9, interfaceC28653p1M87165m4);
                            if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode7))) {
                                AbstractC11266d.m30471y(iHashCode7, r15, iHashCode7, c0209i4);
                            }
                            AbstractC28683x.m87239G(r15, c0209i10, modifierM118962N4);
                            r15.m87173q(true);
                            r15.m87173q(true);
                            r10 = 0;
                            AbstractC18489d0.m53381v((float) 0.5d, f15, c2314t, r15, false);
                        }
                        AbstractC11266d.m30471y(iHashCode6, r15, iHashCode6, c0209i4);
                        C0209i c0209i11 = C0217k.f726d;
                        AbstractC28683x.m87239G(r15, c0209i11, modifierM118962N3);
                        float f16 = 4;
                        Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3411h(3 * f16, AbstractC1102d.m3409f(f13, c2314t)), jM51541c, c17916v0);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode7 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = r15.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(r15, modifierM3358c2);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j4);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i8, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(r15, c0209i9, interfaceC28653p1M87165m5);
                        if (r15.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, r15, iHashCode7, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, r15, iHashCode7, c0209i4);
                        }
                        AbstractC28683x.m87239G(r15, c0209i11, modifierM118962N5);
                        r15.m87173q(true);
                        r15.m87173q(true);
                        r10 = 0;
                        AbstractC18489d0.m53381v((float) 0.5d, f16, c2314t, r15, false);
                    } else {
                        c2305k4 = c2305k5;
                        r10 = r14;
                        r15.m87150e0(253715115);
                        r15.m87173q(r10);
                    }
                    r14 = r10;
                    it = it;
                    c2305k5 = c2305k4;
                    f13 = 1.0f;
                }
                c2305k = c2305k5;
                ?? r16 = r14;
                r15.m87173q(r16);
                r15.m87173q(true);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r15, r16 == true ? 1 : 0);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = r15.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(r15, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j2);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(r15, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i2 = C0217k.f732j;
                if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(r15, C0217k.f726d, modifierM118962N6);
                r15.m87150e0(1262248084);
                it3 = c3808h.m11659b().iterator();
                while (it3.hasNext()) {
                    c3809i = (C3809i) it3.next();
                    jMo134584toComposableColorWaAFU9c = c3809i.getColor().mo134584toComposableColorWaAFU9c(r15, 0);
                    if (c3809i.getPercentage() >= 1.0f) {
                        r15.m87150e0(-146520284);
                        fM11666d = c3809i.getPercentage();
                        if (fM11666d <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (fM11666d > Float.MAX_VALUE) {
                            fM11666d = Float.MAX_VALUE;
                        }
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(fM11666d, true);
                        c2305k3 = c2305k;
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, r15, i16);
                        iHashCode4 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = r15.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(r15, layoutWeightElement2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j3);
                        } else {
                            r15.m87178s0();
                        }
                        C0209i c0209i12 = C0217k.f729g;
                        AbstractC28683x.m87239G(r15, c0209i12, c23010xM66775a3);
                        C0209i c0209i13 = C0217k.f728f;
                        AbstractC28683x.m87239G(r15, c0209i13, interfaceC28653p1M87165m7);
                        c0209i3 = C0217k.f732j;
                        if (r15.f115903S) {
                            c2305k2 = c2305k3;
                        } else {
                            c2305k2 = c2305k3;
                            if (!AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode4))) {
                            }
                            C0209i c0209i14 = C0217k.f726d;
                            AbstractC28683x.m87239G(r15, c0209i14, modifierM118962N7);
                            float f17 = 4;
                            Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC1102d.m3411h(3 * f17, AbstractC1102d.m3409f(1.0f, c2314t)), jMo134584toComposableColorWaAFU9c, c17916v0);
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode5 = Long.hashCode(r15.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = r15.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(r15, modifierM3358c3);
                            r15.m87158i0();
                            if (r15.f115903S) {
                                r15.m87163l(c0213j3);
                            } else {
                                r15.m87178s0();
                            }
                            AbstractC28683x.m87239G(r15, c0209i12, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(r15, c0209i13, interfaceC28653p1M87165m8);
                            if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode5))) {
                                AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i3);
                            }
                            AbstractC28683x.m87239G(r15, c0209i14, modifierM118962N8);
                            r15.m87173q(true);
                            r15.m87173q(true);
                            AbstractC18489d0.m53381v((float) 0.5d, f17, c2314t, r15, false);
                        }
                        AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i3);
                        C0209i c0209i15 = C0217k.f726d;
                        AbstractC28683x.m87239G(r15, c0209i15, modifierM118962N7);
                        float f18 = 4;
                        Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC1102d.m3411h(3 * f18, AbstractC1102d.m3409f(1.0f, c2314t)), jMo134584toComposableColorWaAFU9c, c17916v0);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode5 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = r15.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(r15, modifierM3358c4);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j3);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i12, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(r15, c0209i13, interfaceC28653p1M87165m9);
                        if (r15.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i3);
                        }
                        AbstractC28683x.m87239G(r15, c0209i15, modifierM118962N9);
                        r15.m87173q(true);
                        r15.m87173q(true);
                        AbstractC18489d0.m53381v((float) 0.5d, f18, c2314t, r15, false);
                    } else {
                        c2305k2 = c2305k;
                        r15.m87150e0(-145988851);
                        r15.m87173q(false);
                    }
                    it3 = it3;
                    c2305k = c2305k2;
                    c2307m = c2307m;
                    i16 = 48;
                }
                AbstractC25012a.m73392y(r15, false, true, true);
                modifier3 = modifier4;
            } else {
                r15.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = r15.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3803c(c3808h, modifier3, i13, i14, 2);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        r14 = 0;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (r15.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r15, 0);
            iHashCode = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = r15.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(r15, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            C0209i c0209i16 = C0217k.f729g;
            AbstractC28683x.m87239G(r15, c0209i16, c23010xM66775a4);
            C0209i c0209i17 = C0217k.f728f;
            AbstractC28683x.m87239G(r15, c0209i17, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode, r15, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, r15, iHashCode, c0209i);
            }
            C0209i c0209i18 = C0217k.f726d;
            AbstractC28683x.m87239G(r15, c0209i18, modifierM118962N10);
            f13 = 1.0f;
            m11630v(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 0.0f, 0.0f, ((float) 1.25d) * 8, 7), c3808h.getTitle(), c3808h.getUnit(), r15, 0, 0);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r15, 0);
            iHashCode2 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = r15.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(r15, modifier4);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i16, c22994r1M66759a3);
            AbstractC28683x.m87239G(r15, c0209i17, interfaceC28653p1M87165m11);
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(r15, c0209i18, modifierM118962N11);
            r15.m87150e0(-495757758);
            it = c3808h.m11658a().iterator();
            while (true) {
                zHasNext = it.hasNext();
                c17916v0 = AbstractC17918w0.f69621a;
                i16 = 48;
                if (zHasNext) {
                    break;
                    break;
                }
                c3801a = (C3801a) it.next();
                jM51541c = C17919x.m51541c(c3801a.getOpacity(), c3801a.getColor().mo134584toComposableColorWaAFU9c(r15, r14));
                if (c3801a.getAmount() >= f13) {
                    r15.m87150e0(253177916);
                    fM11602a = c3801a.getAmount();
                    if (fM11602a <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (fM11602a > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = fM11602a;
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f14, true);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k5, r15, 48);
                    iHashCode6 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = r15.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(r15, layoutWeightElement3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j4 = C0217k.f724b;
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j4);
                    } else {
                        r15.m87178s0();
                    }
                    C0209i c0209i19 = C0217k.f729g;
                    AbstractC28683x.m87239G(r15, c0209i19, c23010xM66775a5);
                    C0209i c0209i20 = C0217k.f728f;
                    AbstractC28683x.m87239G(r15, c0209i20, interfaceC28653p1M87165m12);
                    c0209i4 = C0217k.f732j;
                    if (r15.f115903S) {
                        c2305k4 = c2305k5;
                        if (!AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode6))) {
                        }
                        C0209i c0209i110 = C0217k.f726d;
                        AbstractC28683x.m87239G(r15, c0209i110, modifierM118962N12);
                        float f19 = 4;
                        Modifier modifierM3358c5 = AbstractC1092a.m3358c(AbstractC1102d.m3411h(3 * f19, AbstractC1102d.m3409f(f13, c2314t)), jM51541c, c17916v0);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode7 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = r15.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(r15, modifierM3358c5);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j4);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i19, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(r15, c0209i20, interfaceC28653p1M87165m13);
                        if (r15.f115903S) {
                            AbstractC11266d.m30471y(iHashCode7, r15, iHashCode7, c0209i4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, r15, iHashCode7, c0209i4);
                        }
                        AbstractC28683x.m87239G(r15, c0209i110, modifierM118962N13);
                        r15.m87173q(true);
                        r15.m87173q(true);
                        r10 = 0;
                        AbstractC18489d0.m53381v((float) 0.5d, f19, c2314t, r15, false);
                    } else {
                        c2305k4 = c2305k5;
                    }
                    AbstractC11266d.m30471y(iHashCode6, r15, iHashCode6, c0209i4);
                    C0209i c0209i111 = C0217k.f726d;
                    AbstractC28683x.m87239G(r15, c0209i111, modifierM118962N12);
                    float f110 = 4;
                    Modifier modifierM3358c6 = AbstractC1092a.m3358c(AbstractC1102d.m3411h(3 * f110, AbstractC1102d.m3409f(f13, c2314t)), jM51541c, c17916v0);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode7 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = r15.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(r15, modifierM3358c6);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j4);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i19, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(r15, c0209i20, interfaceC28653p1M87165m14);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode7, r15, iHashCode7, c0209i4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode7, r15, iHashCode7, c0209i4);
                    }
                    AbstractC28683x.m87239G(r15, c0209i111, modifierM118962N14);
                    r15.m87173q(true);
                    r15.m87173q(true);
                    r10 = 0;
                    AbstractC18489d0.m53381v((float) 0.5d, f110, c2314t, r15, false);
                } else {
                    c2305k4 = c2305k5;
                    r10 = r14;
                    r15.m87150e0(253715115);
                    r15.m87173q(r10);
                }
                r14 = r10;
                it = it;
                c2305k5 = c2305k4;
                f13 = 1.0f;
            }
            c2305k = c2305k5;
            ?? r17 = r14;
            r15.m87173q(r17);
            r15.m87173q(true);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r15, r17 == true ? 1 : 0);
            iHashCode3 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m15 = r15.m87165m();
            Modifier modifierM118962N15 = AbstractC37056f.m118962N(r15, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j2);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, C0217k.f729g, c22994r1M66759a4);
            AbstractC28683x.m87239G(r15, C0217k.f728f, interfaceC28653p1M87165m15);
            c0209i2 = C0217k.f732j;
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(r15, C0217k.f726d, modifierM118962N15);
            r15.m87150e0(1262248084);
            it3 = c3808h.m11659b().iterator();
            while (it3.hasNext()) {
                c3809i = (C3809i) it3.next();
                jMo134584toComposableColorWaAFU9c = c3809i.getColor().mo134584toComposableColorWaAFU9c(r15, 0);
                if (c3809i.getPercentage() >= 1.0f) {
                    r15.m87150e0(-146520284);
                    fM11666d = c3809i.getPercentage();
                    if (fM11666d <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (fM11666d > Float.MAX_VALUE) {
                        fM11666d = Float.MAX_VALUE;
                    }
                    LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(fM11666d, true);
                    c2305k3 = c2305k;
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k3, r15, i16);
                    iHashCode4 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = r15.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(r15, layoutWeightElement4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j3);
                    } else {
                        r15.m87178s0();
                    }
                    C0209i c0209i112 = C0217k.f729g;
                    AbstractC28683x.m87239G(r15, c0209i112, c23010xM66775a6);
                    C0209i c0209i113 = C0217k.f728f;
                    AbstractC28683x.m87239G(r15, c0209i113, interfaceC28653p1M87165m16);
                    c0209i3 = C0217k.f732j;
                    if (r15.f115903S) {
                        c2305k2 = c2305k3;
                        if (!AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode4))) {
                        }
                        C0209i c0209i114 = C0217k.f726d;
                        AbstractC28683x.m87239G(r15, c0209i114, modifierM118962N16);
                        float f111 = 4;
                        Modifier modifierM3358c7 = AbstractC1092a.m3358c(AbstractC1102d.m3411h(3 * f111, AbstractC1102d.m3409f(1.0f, c2314t)), jMo134584toComposableColorWaAFU9c, c17916v0);
                        InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode5 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = r15.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(r15, modifierM3358c7);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j3);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i112, interfaceC39127r0M66763d7);
                        AbstractC28683x.m87239G(r15, c0209i113, interfaceC28653p1M87165m17);
                        if (r15.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i3);
                        }
                        AbstractC28683x.m87239G(r15, c0209i114, modifierM118962N17);
                        r15.m87173q(true);
                        r15.m87173q(true);
                        AbstractC18489d0.m53381v((float) 0.5d, f111, c2314t, r15, false);
                    } else {
                        c2305k2 = c2305k3;
                    }
                    AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i3);
                    C0209i c0209i115 = C0217k.f726d;
                    AbstractC28683x.m87239G(r15, c0209i115, modifierM118962N16);
                    float f112 = 4;
                    Modifier modifierM3358c8 = AbstractC1092a.m3358c(AbstractC1102d.m3411h(3 * f112, AbstractC1102d.m3409f(1.0f, c2314t)), jMo134584toComposableColorWaAFU9c, c17916v0);
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode5 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = r15.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(r15, modifierM3358c8);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j3);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i112, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(r15, c0209i113, interfaceC28653p1M87165m18);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(r15, c0209i115, modifierM118962N18);
                    r15.m87173q(true);
                    r15.m87173q(true);
                    AbstractC18489d0.m53381v((float) 0.5d, f112, c2314t, r15, false);
                } else {
                    c2305k2 = c2305k;
                    r15.m87150e0(-145988851);
                    r15.m87173q(false);
                }
                it3 = it3;
                c2305k = c2305k2;
                c2307m = c2307m;
                i16 = 48;
            }
            AbstractC25012a.m73392y(r15, false, true, true);
            modifier3 = modifier4;
        } else {
            r15.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = r15.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3803c(c3808h, modifier3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m11620l(C3808h c3808h, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m11619k(c3808h, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    private static final void m11621m(C3801a c3801a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-483128286);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c3801a) : c28655q2.m87157i(c3801a) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                Modifier modifierM3411h = AbstractC1102d.m3411h(19, c2314t);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9108K, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3411h);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                float f13 = 4;
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(2 * f13, c2314t), C17919x.m51541c(c3801a.getOpacity(), c3801a.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0)), AbstractC17918w0.f69621a), c28655q2, 0);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(1 * f13, c2314t));
                String strM21275i = AbstractC8693b.m21275i(c3801a.getAmount() + "x", c28655q2, 0);
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21275i, null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN7(), null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3405b(c2314t, f13 * f13, 0.0f, 2)));
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(c3801a, i13, modifier3, i14, 15);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(19, c2314t);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9108K, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3411h2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            float f14 = 4;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3419p(2 * f14, c2314t), C17919x.m51541c(c3801a.getOpacity(), c3801a.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0)), AbstractC17918w0.f69621a), c28655q2, 0);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(1 * f14, c2314t));
            String strM21275i2 = AbstractC8693b.m21275i(c3801a.getAmount() + "x", c28655q2, 0);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21275i2, null, c38072d2.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getN7(), null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3405b(c2314t, f14 * f14, 0.0f, 2)));
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(c3801a, i13, modifier3, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m11622n(C3801a c3801a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m11621m(c3801a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m11623o(C3809i c3809i, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1406459761);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c3809i) : c28655q.m87157i(c3809i) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier3 = i16 != 0 ? c2314t : modifier;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(30, c2314t));
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
                objM87133R6 = new a(interfaceC28601c2, c12684r, c12679m, 257, interfaceC28601c1);
                c28655q.m87172p0(objM87133R6);
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
            AbstractC39125q1.m124655a(AbstractC18032n.m51775c(modifierM3409f, false, (Function1) objM87133R8), AbstractC37817c.m121344e(1200550679, c28655q, new d(interfaceC28601c2, c12677k, interfaceC4339a, modifier3, c3809i)), interfaceC39127r0, c28655q, 48);
            c28655q.m87173q(false);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(c3809i, i13, modifier2, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m11624p(C3809i c3809i, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m11623o(c3809i, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m11625q(C3808h c3808h, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-856146592);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(c3808h) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            C27317b c27317b = new C27317b(c3808h.getNumberOfGridColumns());
            Modifier modifierM3413j = AbstractC1102d.m3413j(modifier3, 0.0f, 300, 1);
            boolean zM87157i = c28655q.m87157i(c3808h);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C0103b(c3808h, 23);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC32417h.m101202k(c27317b, modifierM3413j, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 0, 1020);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3803c(c3808h, modifier2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m11626r(C3808h c3808h, InterfaceC27335s LazyVerticalGrid) {
        AbstractC22676k.m65750j(LazyVerticalGrid, "$this$LazyVerticalGrid");
        List<C3809i> listM11659b = c3808h.m11659b();
        C27323g c27323g = (C27323g) LazyVerticalGrid;
        c27323g.m82467q(listM11659b.size(), new i(h.f15585w, listM11659b), new C37816b(new j(listM11659b), true, -1117249557));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m11627s(C3808h c3808h, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m11625q(c3808h, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[LOOP:0: B:32:0x006b->B:34:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135 A[LOOP:1: B:54:0x012e->B:56:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0179  */
    /* JADX WARN: Code duplicated, block: B:60:0x017d  */
    /* JADX WARN: Code duplicated, block: B:65:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x020b  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:83:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:86:0x0148 A[EDGE_INSN: B:86:0x0148->B:57:0x0148 BREAK  A[LOOP:1: B:54:0x012e->B:56:0x0135], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    private static final void m11628t(C3808h c3808h, Modifier modifier, Composer composer, int i13, int i14) {
        C3808h c3808h2;
        int i15;
        Modifier modifier2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        ArrayList arrayList;
        Iterator<T> it;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Iterator<T> it3;
        char c3;
        char c7;
        boolean z13;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        Iterator it4;
        int iHashCode4;
        C0213j c0213j3;
        C0209i c0209i3;
        C2305k c2305k = C2299e.f9110M;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1810449914);
        if ((i13 & 6) == 0) {
            c3808h2 = c3808h;
            i15 = i13 | (c28655q.m87157i(c3808h2) ? 4 : 2);
        } else {
            c3808h2 = c3808h;
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                List<C3801a> listM11658a = c3808h2.m11658a();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM11658a, 10));
                it = listM11658a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3801a) it.next()).getLabel());
                }
                EnumC22935a1 enumC22935a1 = EnumC22935a1.f90538x;
                Modifier modifierM3388j = AbstractC1099a.m3388j(modifier3, enumC22935a1);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i4 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
                C0209i c0209i5 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
                Modifier modifierM3399u = AbstractC1099a.m3399u(c2314t, enumC22935a1);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3399u);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                c28655q.m87150e0(-789979145);
                it3 = c3808h2.m11658a().iterator();
                while (true) {
                    c3 = 3;
                    if (it3.hasNext()) {
                        break;
                    }
                    m11621m((C3801a) it3.next(), null, c28655q, 0, 2);
                    AbstractC11266d.m30469w(3, 4, c2314t, c28655q);
                }
                c7 = 4;
                c28655q.m87173q(false);
                z13 = true;
                c28655q.m87173q(true);
                Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3406c);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                c28655q.m87150e0(53692204);
                for (it4 = arrayList.iterator(); it4.hasNext(); it4 = it4) {
                    TextResource textResource = (TextResource) it4.next();
                    Modifier modifierM3411h = AbstractC1102d.m3411h(19, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    Modifier modifierMo3400a = C1100b.f4583a.mo3400a(c2314t, C2299e.f9104G);
                    String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, 0);
                    C38072d c38072d = C38072d.f163053a;
                    C2314t c2314t2 = c2314t;
                    C28655q c28655q2 = c28655q;
                    boolean z14 = z13;
                    AbstractC30795n.m94707h(strM21274h, modifierMo3400a, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q2, 0, 0, 196600);
                    c28655q = c28655q2;
                    c28655q.m87173q(z14);
                    c7 = 4;
                    AbstractC11266d.m30469w(3, 4, c2314t2, c28655q);
                    z13 = z14;
                    c2314t = c2314t2;
                    c3 = 3;
                    modifier3 = modifier3;
                }
                boolean z15 = z13;
                AbstractC25012a.m73392y(c28655q, false, z15, z15);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3803c(c3808h, modifier2, i13, i14, 3);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            List<C3801a> listM11658a2 = c3808h2.m11658a();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM11658a2, 10));
            it = listM11658a2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3801a) it.next()).getLabel());
            }
            EnumC22935a1 enumC22935a2 = EnumC22935a1.f90538x;
            Modifier modifierM3388j2 = AbstractC1099a.m3388j(modifier3, enumC22935a2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3388j2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i7 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M66759a2);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N5);
            Modifier modifierM3399u2 = AbstractC1099a.m3399u(c2314t, enumC22935a2);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3399u2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
            c28655q.m87150e0(-789979145);
            it3 = c3808h2.m11658a().iterator();
            while (true) {
                c3 = 3;
                if (it3.hasNext()) {
                    break;
                    break;
                } else {
                    m11621m((C3801a) it3.next(), null, c28655q, 0, 2);
                    AbstractC11266d.m30469w(3, 4, c2314t, c28655q);
                }
            }
            c7 = 4;
            c28655q.m87173q(false);
            z13 = true;
            c28655q.m87173q(true);
            Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, c2314t);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3406c2);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
            c28655q.m87150e0(53692204);
            while (it4.hasNext()) {
                TextResource textResource2 = (TextResource) it4.next();
                Modifier modifierM3411h2 = AbstractC1102d.m3411h(19, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3411h2);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                Modifier modifierMo3400a2 = C1100b.f4583a.mo3400a(c2314t, C2299e.f9104G);
                String strM21274h2 = AbstractC8693b.m21274h(textResource2, c28655q, 0);
                C38072d c38072d2 = C38072d.f163053a;
                C2314t c2314t3 = c2314t;
                C28655q c28655q3 = c28655q;
                boolean z16 = z13;
                AbstractC30795n.m94707h(strM21274h2, modifierMo3400a2, c38072d2.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getB1(), null, c28655q3, 0, 0, 196600);
                c28655q = c28655q3;
                c28655q.m87173q(z16);
                c7 = 4;
                AbstractC11266d.m30469w(3, 4, c2314t3, c28655q);
                z13 = z16;
                c2314t = c2314t3;
                c3 = 3;
                modifier3 = modifier3;
            }
            boolean z17 = z13;
            AbstractC25012a.m73392y(c28655q, false, z17, z17);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3803c(c3808h, modifier2, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m11629u(C3808h c3808h, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m11628t(c3808h, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m11630v(Modifier modifier, TextResource textResource, TextResource textResource2, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1115820082);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(textResource2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            boolean zM87153g = c28655q.m87153g(interfaceC39171c);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new k(interfaceC39171c);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R;
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, (i15 >> 3) & 14);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh5(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i15 >> 6) & 14), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getSh5(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3804d(modifier3, textResource, textResource2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m11631w(Modifier modifier, TextResource textResource, TextResource textResource2, int i13, int i14, Composer composer, int i15) {
        m11630v(modifier, textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
