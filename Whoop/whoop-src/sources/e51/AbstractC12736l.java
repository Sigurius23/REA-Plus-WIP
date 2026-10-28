package e51;

import a01.C0086f;
import am2.C1008b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.preview.C9809a;
import do0.C12229c;
import dp0.C12253i;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fy1.C14873i;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import l83.C23454a0;
import m81.AbstractC25230e;
import m81.C25232g;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import n01.C26088e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p31.AbstractC28805p;
import p315m0.AbstractC24868a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26061n;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p329n0.InterfaceC26064q;
import p389p0.C28539n0;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ry0.C31909d;
import ry0.EnumC31908c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: e51.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aK\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0018²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Le51/n;", "state", "Ll0/k1;", "contentPadding", "Ln0/u;", "listState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "C", "(Ln0/u;)I", "v", "(Landroidx/compose/runtime/Composer;I)V", "", "isUserScrolling", "", "selectedTagId", "selectedIndex", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12736l {

    /* JADX INFO: renamed from: e51.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.anchorselector.AnchorSelectorKt$AnchorSelector$2$1", m100430f = "AnchorSelector.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f43555E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f43556F;

        /* JADX INFO: renamed from: w */
        int f43557w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12738n f43558x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26068u f43559y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f43560z;

        /* JADX INFO: renamed from: e51.l$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41511a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12738n f43561w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f43562x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f43563y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f43564z;

            public C41511a(C12738n c12738n, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
                this.f43561w = c12738n;
                this.f43562x = function1;
                this.f43563y = interfaceC28601c1;
                this.f43564z = interfaceC28601c2;
            }

            /* JADX INFO: renamed from: b */
            public final Object m35642b(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (!AbstractC12736l.m35629p(this.f43563y) && i13 >= 0 && i13 < this.f43561w.m35651c().size()) {
                    C12729e c12729e = (C12729e) AbstractC25265s.m74102I0(i13, this.f43561w.m35651c());
                    String strM35599k = c12729e != null ? c12729e.getType() : null;
                    if (strM35599k != null && !strM35599k.equals(AbstractC12736l.m35631r(this.f43564z))) {
                        AbstractC12736l.m35632s(this.f43564z, strM35599k);
                        this.f43562x.invoke(new AbstractC12732h.b(strM35599k));
                    }
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m35642b(((Number) obj).intValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: e51.l$a$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f43565a;

            static {
                int[] iArr = new int[EnumC12737m.values().length];
                try {
                    iArr[EnumC12737m.FIRST_VISIBLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC12737m.VIEWPORT_THRESHOLD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f43565a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C12738n c12738n, C26068u c26068u, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f43558x = c12738n;
            this.f43559y = c26068u;
            this.f43560z = function1;
            this.f43555E = interfaceC28601c1;
            this.f43556F = interfaceC28601c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final int m35641h(C12738n c12738n, C26068u c26068u) {
            int i13 = b.f43565a[c12738n.getScrollTrackingMode().ordinal()];
            if (i13 == 1) {
                return ((C28621h1) c26068u.f103222e.f91958b).m87024x();
            }
            if (i13 == 2) {
                return AbstractC12736l.m35613C(c26068u);
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f43558x, this.f43559y, this.f43560z, this.f43555E, this.f43556F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43557w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(AbstractC28683x.m87240H(new C12735k(this.f43558x, this.f43559y, 0)));
                C41511a c41511a = new C41511a(this.f43558x, this.f43560z, this.f43555E, this.f43556F);
                this.f43557w = 1;
                if (interfaceC13058lM36610t.collect(c41511a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e51.l$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.anchorselector.AnchorSelectorKt$AnchorSelector$3$2$1$1", m100430f = "AnchorSelector.kt", m100431l = {135}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f43566w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26068u f43567x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f43568y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f43569z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26068u c26068u, int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f43567x = c26068u;
            this.f43568y = i13;
            this.f43569z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f43567x, this.f43568y, this.f43569z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43566w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26068u c26068u = this.f43567x;
                int i14 = this.f43568y;
                this.f43566w = 1;
                C28539n0 c28539n0 = C26068u.f103217x;
                if (c26068u.m77563f(i14, 0, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC12736l.m35630q(this.f43569z, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e51.l$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f43570w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12729e f43571x;

        public c(Function1 function1, C12729e c12729e) {
            this.f43570w = function1;
            this.f43571x = c12729e;
        }

        /* JADX INFO: renamed from: a */
        public final void m35643a(Object event) {
            AbstractC22676k.m65750j(event, "event");
            this.f43570w.invoke(new AbstractC12732h.a(this.f43571x.getType(), event));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m35643a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e51.l$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f43572w = new d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C12729e c12729e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e51.l$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f43573w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f43574x;

        public e(Function1 function1, List list) {
            this.f43573w = function1;
            this.f43574x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m35645a(int i13) {
            return this.f43573w.invoke(this.f43574x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m35645a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: e51.l$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f43575w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f43576x;

        public f(Function1 function1, List list) {
            this.f43575w = function1;
            this.f43576x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m35646a(int i13) {
            return this.f43575w.invoke(this.f43576x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m35646a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: e51.l$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f43577w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f43578x;

        public g(List list, Function1 function1) {
            this.f43577w = list;
            this.f43578x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m35647a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
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
            C12729e c12729e = (C12729e) this.f43577w.get(i13);
            c28655q.m87150e0(-565135798);
            boolean zM87153g = c28655q.m87153g(this.f43578x) | c28655q.m87157i(c12729e);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new c(this.f43578x, c12729e);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12727c.m35585e(null, c12729e, (Function1) objM87133R, c28655q, 0, 1);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m35647a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e51.l$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC4351m {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m35648a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(2145427806);
            List listM118959K = AbstractC37056f.m118959K(new C12740p("Suggested", "suggested", null, 4, null), new C12740p("Physical Symptoms", "physical_symptoms", null, 4, null), new C12740p("Flow", "flow", null, 4, null), new C12740p("Cervical Mucus", "cervical_mucus", null, 4, null));
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Suggested Symptoms");
            boolean z4 = false;
            boolean z13 = false;
            boolean z14 = false;
            C39174f c39174f = null;
            String str = null;
            int i14 = 1;
            int i15 = 0;
            Set set = null;
            String str2 = "multi-select";
            Object[] objArr = 0 == true ? 1 : 0;
            List listM118958J = AbstractC37056f.m118958J(new C26088e(str2, i14, i15, AbstractC37056f.m118958J(new C31909d("preview-multi1", "Multi Option 1", "Can select multiple", EnumC16313m0.BLOOD_OXYGEN, null, z4, EnumC31908c.MCI_FLOW, false, false, null, null, z13, z14, c39174f, str, 32560, null)), set, objArr, z4, 116, null));
            EnumC12728d enumC12728d = EnumC12728d.NORMAL;
            C12729e c12729e = new C12729e(textResourceM21278l, "suggested", listM118958J, enumC12728d, null, null, 0.0f, 0.0f, 240, null);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Physical Symptoms");
            EnumC16313m0 enumC16313m0 = EnumC16313m0.ACTIVITY;
            EnumC31908c enumC31908c = EnumC31908c.CERVICAL_MUCUS;
            boolean z15 = false;
            EnumC2888c enumC2888c = null;
            AbstractC28805p.a aVar = null;
            float f13 = 0.0f;
            float f14 = 0.0f;
            String str3 = "physical_symptoms";
            EnumC2888c enumC2888c2 = null;
            AbstractC28805p.a aVar2 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            String str4 = "flow";
            EnumC12737m enumC12737m = null;
            float f17 = 0.0f;
            String str5 = "suggested";
            AbstractC12736l.m35622i(null, new C12738n(listM118959K, AbstractC37056f.m118959K(c12729e, new C12729e(textResourceM21278l2, str3, AbstractC37056f.m118958J(new C31909d("preview-multi2", "Multi Option 2", "Up to 3 selections", enumC16313m0, null, false, enumC31908c, z13, z14, c39174f, str, false, z15, null, null, 32688, null)), EnumC12728d.COMPACT, enumC2888c, aVar, f13, f14, 240, null), new C12729e(AbstractC8693b.m21278l("Flow Tracking"), str4, AbstractC37056f.m118958J(new C31909d("preview-multi2", "Multi Option 2", "Up to 3 selections", enumC16313m0, null, false, enumC31908c, z14, false, str, null, z15, false, 0 == true ? 1 : 0, null, 32688, null)), enumC12728d, enumC2888c2, aVar2, f15, f16, 240, null)), str5, enumC12737m, f17, 24, null), null, null, null, c28655q, 0, 29);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m35648a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: C */
    public static final int m35613C(C26068u c26068u) {
        Object objPrevious;
        C26061n c26061nM77565h = c26068u.m77565h();
        int i13 = c26061nM77565h.f103179m;
        int i14 = c26061nM77565h.f103178l;
        int i15 = ((i13 - i14) / 3) + i14;
        ?? r10 = c26061nM77565h.f103177k;
        ListIterator listIterator = r10.listIterator(r10.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((C26062o) ((InterfaceC26054g) objPrevious)).f103198o > i15);
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) objPrevious;
        return interfaceC26054g != null ? ((C26062o) interfaceC26054g).f103184a : ((C28621h1) c26068u.f103222e.f91958b).m87024x();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0169  */
    /* JADX WARN: Code duplicated, block: B:107:0x018a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0194  */
    /* JADX WARN: Code duplicated, block: B:113:0x019a A[PHI: r28
      0x019a: PHI (r28v3 p1.c1) = (r28v1 p1.c1), (r28v4 p1.c1) binds: [B:112:0x0198, B:110:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x019c  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:127:0x020b  */
    /* JADX WARN: Code duplicated, block: B:128:0x020f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0222  */
    /* JADX WARN: Code duplicated, block: B:133:0x0230  */
    /* JADX WARN: Code duplicated, block: B:136:0x0243  */
    /* JADX WARN: Code duplicated, block: B:139:0x026b A[LOOP:0: B:137:0x0264->B:139:0x026b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:159:0x0325  */
    /* JADX WARN: Code duplicated, block: B:163:0x034b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0370  */
    /* JADX WARN: Code duplicated, block: B:169:0x0388  */
    /* JADX WARN: Code duplicated, block: B:172:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x0393  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:178:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0137  */
    /* JADX WARN: Code duplicated, block: B:96:0x013d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0149  */
    /* JADX WARN: Code duplicated, block: B:99:0x014e  */
    /* JADX INFO: renamed from: i */
    public static final void m35622i(Modifier modifier, C12738n c12738n, InterfaceC22973k1 interfaceC22973k1, C26068u c26068u, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC22973k1 interfaceC22973k2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        C26068u c26068u2;
        InterfaceC22973k1 interfaceC22973k3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        int i18;
        C28676v0 c28676v0;
        Modifier modifier3;
        InterfaceC22973k1 interfaceC22973k1M3379a;
        C26068u c26068uM77569a;
        Modifier modifier4;
        InterfaceC22973k1 interfaceC22973k4;
        Object objM87133R;
        int i19;
        Function1 function4;
        Object objM87133R2;
        InterfaceC2994c0 interfaceC2994c0;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87153g;
        Object objM87133R4;
        String strM35653f;
        C12740p c12740p;
        InterfaceC28601c1 interfaceC28601c2;
        boolean zM87153g2;
        Object objM87133R5;
        InterfaceC28670t2 interfaceC28670t2;
        int i24;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z13;
        int i25;
        boolean z14;
        boolean z15;
        Object aVar;
        InterfaceC28601c1 interfaceC28601c4;
        C26068u c26068u3;
        int iHashCode;
        C0213j c0213j;
        Function1 function5;
        C0209i c0209i;
        Function1 function6;
        boolean z16;
        C28676v0 c28676v1;
        float f13;
        int i26;
        boolean z17;
        Object objM87133R6;
        C28676v0 c28676v2;
        boolean z18;
        Object objM87133R7;
        ArrayList arrayList;
        Iterator it;
        boolean z19;
        boolean zM87157i;
        Object objM87133R8;
        C12738n state = c12738n;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2000193720);
        int i27 = i14 & 1;
        if (i27 != 0) {
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
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC22973k2 = interfaceC22973k1;
                i15 |= c28655q.m87153g(interfaceC22973k2) ? 256 : 128;
            }
            if ((i13 & 3072) != 0) {
                i15 |= ((i14 & 8) == 0 || !c28655q.m87153g(c26068u)) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED : 2048;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i18 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0 || c28655q.m87118C()) {
                        if (i27 != 0) {
                            modifier3 = C2314t.f9131w;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i28 != 0) {
                            interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                        } else {
                            interfaceC22973k1M3379a = interfaceC22973k2;
                        }
                        if ((i14 & 8) != 0) {
                            c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                            i15 &= -7169;
                        } else {
                            c26068uM77569a = c26068u;
                        }
                        if (i16 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12229c(27);
                                c28655q.m87172p0(objM87133R);
                            }
                            modifier4 = modifier3;
                            interfaceC22973k4 = interfaceC22973k1M3379a;
                            i19 = i15;
                            function4 = (Function1) objM87133R;
                        } else {
                            modifier4 = modifier3;
                            interfaceC22973k4 = interfaceC22973k1M3379a;
                        }
                        c28655q.m87175r();
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                        zM87153g = c28655q.m87153g(state.getSelectedTagId());
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g || objM87133R4 == c28676v0) {
                            strM35653f = state.getSelectedTagId();
                            if (strM35653f == null) {
                                c12740p = (C12740p) AbstractC25265s.m74100H0(state.m35654g());
                                if (c12740p != null) {
                                    strM35653f = c12740p.getId();
                                } else {
                                    strM35653f = null;
                                }
                            }
                            objM87133R4 = AbstractC28683x.m87272z(strM35653f);
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        zM87153g2 = c28655q.m87153g(state.m35654g());
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g2 || objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87264r(new C12735k(state, interfaceC28601c2, 1));
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                        List<C12729e> listM35651c = state.m35651c();
                        EnumC12737m enumC12737mM35652e = state.getScrollTrackingMode();
                        boolean zM87157i2 = c28655q.m87157i(state);
                        i24 = (i19 & 7168) ^ 3072;
                        if (i24 > 2048 || !c28655q.m87153g(c26068uM77569a)) {
                            interfaceC28601c3 = interfaceC28601c1;
                            if ((i19 & 3072) != 2048) {
                                z13 = false;
                            }
                            boolean zM87153g3 = zM87157i2 | z13 | c28655q.m87153g(interfaceC28601c2);
                            i25 = i19 & 57344;
                            if (i25 == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = zM87153g3 | z14;
                            Object objM87133R9 = c28655q.m87133R();
                            if (!z15 || objM87133R9 == c28676v0) {
                                Function1 function7 = function4;
                                C26068u c26068u4 = c26068uM77569a;
                                interfaceC28601c4 = interfaceC28601c3;
                                aVar = new a(state, c26068u4, function7, interfaceC28601c4, interfaceC28601c2, null);
                                c26068u3 = c26068u4;
                                state = state;
                                function4 = function7;
                                c28655q.m87172p0(aVar);
                            } else {
                                aVar = objM87133R9;
                                c26068u3 = c26068uM77569a;
                                interfaceC28601c4 = interfaceC28601c3;
                            }
                            AbstractC28683x.m87255i(c26068u3, listM35651c, enumC12737mM35652e, (InterfaceC4351m) aVar, c28655q);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            function5 = function4;
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
                            if (state.m35654g().size() > 1) {
                                c28655q.m87150e0(-1256747248);
                                c28655q.m87150e0(-179086209);
                                List<C12740p> listM35654g = state.m35654g();
                                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM35654g, 10));
                                for (it = listM35654g.iterator(); it.hasNext(); it = it) {
                                    C12740p c12740p2 = (C12740p) it.next();
                                    arrayList.add(new C25232g(c12740p2.getId(), null, AbstractC8693b.m21278l(c12740p2.getNameDisplay()), C38072d.f163053a.m121952e(c28655q, 6).getB1()));
                                }
                                c28655q.m87173q(false);
                                int iM35634u = m35634u(interfaceC28670t2);
                                long jM125430y = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                                C39174f c39174f = new C39174f(state.getTagsHorizontalInset());
                                boolean zM87153g4 = c28655q.m87153g(interfaceC28601c2);
                                if (i25 == 16384) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                zM87157i = zM87153g4 | z19 | c28655q.m87157i(state) | c28655q.m87157i(interfaceC2994c0) | ((i24 <= 2048 && c28655q.m87153g(c26068u3)) || (i19 & 3072) == 2048);
                                objM87133R8 = c28655q.m87133R();
                                if (!zM87157i || objM87133R8 == c28676v0) {
                                    function6 = function5;
                                    C1008b c1008b = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                                    c28655q.m87172p0(c1008b);
                                    objM87133R8 = c1008b;
                                } else {
                                    function6 = function5;
                                }
                                Function1 function8 = (Function1) objM87133R8;
                                c28676v1 = c28676v0;
                                f13 = 1.0f;
                                z16 = true;
                                i26 = 4;
                                AbstractC25230e.m73956l(arrayList, iM35634u, jM125430y, c39174f, null, null, function8, c28655q, 0, 48);
                                c28655q = c28655q;
                                z17 = false;
                                c28655q.m87173q(false);
                            } else {
                                function6 = function5;
                                z16 = true;
                                c28676v1 = c28676v0;
                                f13 = 1.0f;
                                i26 = 4;
                                z17 = false;
                                c28655q.m87150e0(-1255482572);
                                c28655q.m87173q(false);
                            }
                            float f14 = 8;
                            C22971k c22971kM66746i = AbstractC22977m.m66746i(i26 * f14);
                            if (f13 <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3406c(f13, new LayoutWeightElement(f13, z16)), 0.0f, 3 * f14, 0.0f, 0.0f, 13);
                            objM87133R6 = c28655q.m87133R();
                            c28676v2 = c28676v1;
                            if (objM87133R6 == c28676v2) {
                                objM87133R6 = new C12229c(28);
                                c28655q.m87172p0(objM87133R6);
                            }
                            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3398t, z17, (Function1) objM87133R6);
                            boolean zM87157i3 = c28655q.m87157i(state);
                            if (i25 == 16384) {
                                z17 = z16;
                            }
                            z18 = zM87157i3 | z17;
                            objM87133R7 = c28655q.m87133R();
                            if (z18 || objM87133R7 == c28676v2) {
                                objM87133R7 = new C12733i(state, function6);
                                c28655q.m87172p0(objM87133R7);
                            }
                            InterfaceC22973k1 interfaceC22973k5 = interfaceC22973k4;
                            C28655q c28655q2 = c28655q;
                            AbstractC22674j.m65717c(modifierM51775c, c26068u3, interfaceC22973k5, c22971kM66746i, null, null, false, null, (Function1) objM87133R7, c28655q2, ((i19 >> 6) & 112) | 24576 | (i19 & 896), 488);
                            c28655q = c28655q2;
                            c28655q.m87173q(z16);
                            function3 = function6;
                            c26068u2 = c26068u3;
                            interfaceC22973k3 = interfaceC22973k5;
                            modifier2 = modifier4;
                        } else {
                            interfaceC28601c3 = interfaceC28601c1;
                        }
                        z13 = true;
                        boolean zM87153g5 = zM87157i2 | z13 | c28655q.m87153g(interfaceC28601c2);
                        i25 = i19 & 57344;
                        if (i25 == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = zM87153g5 | z14;
                        Object objM87133R10 = c28655q.m87133R();
                        if (z15) {
                            Function1 function9 = function4;
                            C26068u c26068u5 = c26068uM77569a;
                            interfaceC28601c4 = interfaceC28601c3;
                            aVar = new a(state, c26068u5, function9, interfaceC28601c4, interfaceC28601c2, null);
                            c26068u3 = c26068u5;
                            state = state;
                            function4 = function9;
                            c28655q.m87172p0(aVar);
                        } else {
                            Function1 function10 = function4;
                            C26068u c26068u6 = c26068uM77569a;
                            interfaceC28601c4 = interfaceC28601c3;
                            aVar = new a(state, c26068u6, function10, interfaceC28601c4, interfaceC28601c2, null);
                            c26068u3 = c26068u6;
                            state = state;
                            function4 = function10;
                            c28655q.m87172p0(aVar);
                        }
                        AbstractC28683x.m87255i(c26068u3, listM35651c, enumC12737mM35652e, (InterfaceC4351m) aVar, c28655q);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        function5 = function4;
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
                        if (state.m35654g().size() > 1) {
                            c28655q.m87150e0(-1256747248);
                            c28655q.m87150e0(-179086209);
                            List<C12740p> listM35654g2 = state.m35654g();
                            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM35654g2, 10));
                            while (it.hasNext()) {
                                C12740p c12740p3 = (C12740p) it.next();
                                arrayList.add(new C25232g(c12740p3.getId(), null, AbstractC8693b.m21278l(c12740p3.getNameDisplay()), C38072d.f163053a.m121952e(c28655q, 6).getB1()));
                            }
                            c28655q.m87173q(false);
                            int iM35634u2 = m35634u(interfaceC28670t2);
                            long jM125430y2 = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            C39174f c39174f2 = new C39174f(state.getTagsHorizontalInset());
                            boolean zM87153g6 = c28655q.m87153g(interfaceC28601c2);
                            if (i25 == 16384) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zM87157i = zM87153g6 | z19 | c28655q.m87157i(state) | c28655q.m87157i(interfaceC2994c0) | ((i24 <= 2048 && c28655q.m87153g(c26068u3)) || (i19 & 3072) == 2048);
                            objM87133R8 = c28655q.m87133R();
                            if (zM87157i) {
                                function6 = function5;
                                C1008b c1008b2 = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                                c28655q.m87172p0(c1008b2);
                                objM87133R8 = c1008b2;
                            } else {
                                function6 = function5;
                                C1008b c1008b3 = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                                c28655q.m87172p0(c1008b3);
                                objM87133R8 = c1008b3;
                            }
                            Function1 function11 = (Function1) objM87133R8;
                            c28676v1 = c28676v0;
                            f13 = 1.0f;
                            z16 = true;
                            i26 = 4;
                            AbstractC25230e.m73956l(arrayList, iM35634u2, jM125430y2, c39174f2, null, null, function11, c28655q, 0, 48);
                            c28655q = c28655q;
                            z17 = false;
                            c28655q.m87173q(false);
                        } else {
                            function6 = function5;
                            z16 = true;
                            c28676v1 = c28676v0;
                            f13 = 1.0f;
                            i26 = 4;
                            z17 = false;
                            c28655q.m87150e0(-1255482572);
                            c28655q.m87173q(false);
                        }
                        float f15 = 8;
                        C22971k c22971kM66746i2 = AbstractC22977m.m66746i(i26 * f15);
                        if (f13 <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3406c(f13, new LayoutWeightElement(f13, z16)), 0.0f, 3 * f15, 0.0f, 0.0f, 13);
                        objM87133R6 = c28655q.m87133R();
                        c28676v2 = c28676v1;
                        if (objM87133R6 == c28676v2) {
                            objM87133R6 = new C12229c(28);
                            c28655q.m87172p0(objM87133R6);
                        }
                        Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM3398t2, z17, (Function1) objM87133R6);
                        boolean zM87157i4 = c28655q.m87157i(state);
                        if (i25 == 16384) {
                            z17 = z16;
                        }
                        z18 = zM87157i4 | z17;
                        objM87133R7 = c28655q.m87133R();
                        if (z18) {
                            objM87133R7 = new C12733i(state, function6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C12733i(state, function6);
                            c28655q.m87172p0(objM87133R7);
                        }
                        InterfaceC22973k1 interfaceC22973k6 = interfaceC22973k4;
                        C28655q c28655q3 = c28655q;
                        AbstractC22674j.m65717c(modifierM51775c2, c26068u3, interfaceC22973k6, c22971kM66746i2, null, null, false, null, (Function1) objM87133R7, c28655q3, ((i19 >> 6) & 112) | 24576 | (i19 & 896), 488);
                        c28655q = c28655q3;
                        c28655q.m87173q(z16);
                        function3 = function6;
                        c26068u2 = c26068u3;
                        interfaceC22973k3 = interfaceC22973k6;
                        modifier2 = modifier4;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 8) != 0) {
                            i15 &= -7169;
                        }
                        c26068uM77569a = c26068u;
                        modifier4 = modifier2;
                        interfaceC22973k4 = interfaceC22973k2;
                    }
                    function4 = function2;
                    i19 = i15;
                    c28655q.m87175r();
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                    zM87153g = c28655q.m87153g(state.getSelectedTagId());
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g) {
                        strM35653f = state.getSelectedTagId();
                        if (strM35653f == null) {
                            c12740p = (C12740p) AbstractC25265s.m74100H0(state.m35654g());
                            if (c12740p != null) {
                                strM35653f = c12740p.getId();
                            } else {
                                strM35653f = null;
                            }
                        }
                        objM87133R4 = AbstractC28683x.m87272z(strM35653f);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        strM35653f = state.getSelectedTagId();
                        if (strM35653f == null) {
                            c12740p = (C12740p) AbstractC25265s.m74100H0(state.m35654g());
                            if (c12740p != null) {
                                strM35653f = c12740p.getId();
                            } else {
                                strM35653f = null;
                            }
                        }
                        objM87133R4 = AbstractC28683x.m87272z(strM35653f);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    zM87153g2 = c28655q.m87153g(state.m35654g());
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R5 = AbstractC28683x.m87264r(new C12735k(state, interfaceC28601c2, 1));
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC28683x.m87264r(new C12735k(state, interfaceC28601c2, 1));
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                    List<C12729e> listM35651c2 = state.m35651c();
                    EnumC12737m enumC12737mM35652e2 = state.getScrollTrackingMode();
                    boolean zM87157i5 = c28655q.m87157i(state);
                    i24 = (i19 & 7168) ^ 3072;
                    if (i24 > 2048) {
                        interfaceC28601c3 = interfaceC28601c1;
                        if ((i19 & 3072) != 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        interfaceC28601c3 = interfaceC28601c1;
                        if ((i19 & 3072) != 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    boolean zM87153g7 = zM87157i5 | z13 | c28655q.m87153g(interfaceC28601c2);
                    i25 = i19 & 57344;
                    if (i25 == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87153g7 | z14;
                    Object objM87133R11 = c28655q.m87133R();
                    if (z15) {
                        Function1 function12 = function4;
                        C26068u c26068u7 = c26068uM77569a;
                        interfaceC28601c4 = interfaceC28601c3;
                        aVar = new a(state, c26068u7, function12, interfaceC28601c4, interfaceC28601c2, null);
                        c26068u3 = c26068u7;
                        state = state;
                        function4 = function12;
                        c28655q.m87172p0(aVar);
                    } else {
                        Function1 function13 = function4;
                        C26068u c26068u8 = c26068uM77569a;
                        interfaceC28601c4 = interfaceC28601c3;
                        aVar = new a(state, c26068u8, function13, interfaceC28601c4, interfaceC28601c2, null);
                        c26068u3 = c26068u8;
                        state = state;
                        function4 = function13;
                        c28655q.m87172p0(aVar);
                    }
                    AbstractC28683x.m87255i(c26068u3, listM35651c2, enumC12737mM35652e2, (InterfaceC4351m) aVar, c28655q);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, modifier4);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    function5 = function4;
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
                    if (state.m35654g().size() > 1) {
                        c28655q.m87150e0(-1256747248);
                        c28655q.m87150e0(-179086209);
                        List<C12740p> listM35654g3 = state.m35654g();
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(listM35654g3, 10));
                        while (it.hasNext()) {
                            C12740p c12740p4 = (C12740p) it.next();
                            arrayList.add(new C25232g(c12740p4.getId(), null, AbstractC8693b.m21278l(c12740p4.getNameDisplay()), C38072d.f163053a.m121952e(c28655q, 6).getB1()));
                        }
                        c28655q.m87173q(false);
                        int iM35634u3 = m35634u(interfaceC28670t2);
                        long jM125430y3 = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        C39174f c39174f3 = new C39174f(state.getTagsHorizontalInset());
                        boolean zM87153g8 = c28655q.m87153g(interfaceC28601c2);
                        if (i25 == 16384) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87157i = zM87153g8 | z19 | c28655q.m87157i(state) | c28655q.m87157i(interfaceC2994c0) | ((i24 <= 2048 && c28655q.m87153g(c26068u3)) || (i19 & 3072) == 2048);
                        objM87133R8 = c28655q.m87133R();
                        if (zM87157i) {
                            function6 = function5;
                            C1008b c1008b4 = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                            c28655q.m87172p0(c1008b4);
                            objM87133R8 = c1008b4;
                        } else {
                            function6 = function5;
                            C1008b c1008b5 = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                            c28655q.m87172p0(c1008b5);
                            objM87133R8 = c1008b5;
                        }
                        Function1 function14 = (Function1) objM87133R8;
                        c28676v1 = c28676v0;
                        f13 = 1.0f;
                        z16 = true;
                        i26 = 4;
                        AbstractC25230e.m73956l(arrayList, iM35634u3, jM125430y3, c39174f3, null, null, function14, c28655q, 0, 48);
                        c28655q = c28655q;
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        function6 = function5;
                        z16 = true;
                        c28676v1 = c28676v0;
                        f13 = 1.0f;
                        i26 = 4;
                        z17 = false;
                        c28655q.m87150e0(-1255482572);
                        c28655q.m87173q(false);
                    }
                    float f16 = 8;
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(i26 * f16);
                    if (f13 <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3406c(f13, new LayoutWeightElement(f13, z16)), 0.0f, 3 * f16, 0.0f, 0.0f, 13);
                    objM87133R6 = c28655q.m87133R();
                    c28676v2 = c28676v1;
                    if (objM87133R6 == c28676v2) {
                        objM87133R6 = new C12229c(28);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM51775c3 = AbstractC18032n.m51775c(modifierM3398t3, z17, (Function1) objM87133R6);
                    boolean zM87157i6 = c28655q.m87157i(state);
                    if (i25 == 16384) {
                        z17 = z16;
                    }
                    z18 = zM87157i6 | z17;
                    objM87133R7 = c28655q.m87133R();
                    if (z18) {
                        objM87133R7 = new C12733i(state, function6);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C12733i(state, function6);
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC22973k1 interfaceC22973k7 = interfaceC22973k4;
                    C28655q c28655q4 = c28655q;
                    AbstractC22674j.m65717c(modifierM51775c3, c26068u3, interfaceC22973k7, c22971kM66746i3, null, null, false, null, (Function1) objM87133R7, c28655q4, ((i19 >> 6) & 112) | 24576 | (i19 & 896), 488);
                    c28655q = c28655q4;
                    c28655q.m87173q(z16);
                    function3 = function6;
                    c26068u2 = c26068u3;
                    interfaceC22973k3 = interfaceC22973k7;
                    modifier2 = modifier4;
                } else {
                    c28655q.m87138X();
                    c26068u2 = c26068u;
                    interfaceC22973k3 = interfaceC22973k2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f(modifier2, state, interfaceC22973k3, c26068u2, function3, i13, i14);
                }
            }
            i15 |= 24576;
            function2 = function1;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k2;
                    }
                    if ((i14 & 8) != 0) {
                        c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                        i15 &= -7169;
                    } else {
                        c26068uM77569a = c26068u;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12229c(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        modifier4 = modifier3;
                        interfaceC22973k4 = interfaceC22973k1M3379a;
                        i19 = i15;
                        function4 = (Function1) objM87133R;
                    } else {
                        modifier4 = modifier3;
                        interfaceC22973k4 = interfaceC22973k1M3379a;
                        function4 = function2;
                        i19 = i15;
                    }
                } else {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k2;
                    }
                    if ((i14 & 8) != 0) {
                        c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                        i15 &= -7169;
                    } else {
                        c26068uM77569a = c26068u;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12229c(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        modifier4 = modifier3;
                        interfaceC22973k4 = interfaceC22973k1M3379a;
                        i19 = i15;
                        function4 = (Function1) objM87133R;
                    } else {
                        modifier4 = modifier3;
                        interfaceC22973k4 = interfaceC22973k1M3379a;
                        function4 = function2;
                        i19 = i15;
                    }
                }
                c28655q.m87175r();
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                zM87153g = c28655q.m87153g(state.getSelectedTagId());
                objM87133R4 = c28655q.m87133R();
                if (zM87153g) {
                    strM35653f = state.getSelectedTagId();
                    if (strM35653f == null) {
                        c12740p = (C12740p) AbstractC25265s.m74100H0(state.m35654g());
                        if (c12740p != null) {
                            strM35653f = c12740p.getId();
                        } else {
                            strM35653f = null;
                        }
                    }
                    objM87133R4 = AbstractC28683x.m87272z(strM35653f);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    strM35653f = state.getSelectedTagId();
                    if (strM35653f == null) {
                        c12740p = (C12740p) AbstractC25265s.m74100H0(state.m35654g());
                        if (c12740p != null) {
                            strM35653f = c12740p.getId();
                        } else {
                            strM35653f = null;
                        }
                    }
                    objM87133R4 = AbstractC28683x.m87272z(strM35653f);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                zM87153g2 = c28655q.m87153g(state.m35654g());
                objM87133R5 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R5 = AbstractC28683x.m87264r(new C12735k(state, interfaceC28601c2, 1));
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = AbstractC28683x.m87264r(new C12735k(state, interfaceC28601c2, 1));
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                List<C12729e> listM35651c3 = state.m35651c();
                EnumC12737m enumC12737mM35652e3 = state.getScrollTrackingMode();
                boolean zM87157i7 = c28655q.m87157i(state);
                i24 = (i19 & 7168) ^ 3072;
                if (i24 > 2048) {
                    interfaceC28601c3 = interfaceC28601c1;
                    if ((i19 & 3072) != 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                    if ((i19 & 3072) != 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                boolean zM87153g9 = zM87157i7 | z13 | c28655q.m87153g(interfaceC28601c2);
                i25 = i19 & 57344;
                if (i25 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87153g9 | z14;
                Object objM87133R12 = c28655q.m87133R();
                if (z15) {
                    Function1 function15 = function4;
                    C26068u c26068u9 = c26068uM77569a;
                    interfaceC28601c4 = interfaceC28601c3;
                    aVar = new a(state, c26068u9, function15, interfaceC28601c4, interfaceC28601c2, null);
                    c26068u3 = c26068u9;
                    state = state;
                    function4 = function15;
                    c28655q.m87172p0(aVar);
                } else {
                    Function1 function16 = function4;
                    C26068u c26068u10 = c26068uM77569a;
                    interfaceC28601c4 = interfaceC28601c3;
                    aVar = new a(state, c26068u10, function16, interfaceC28601c4, interfaceC28601c2, null);
                    c26068u3 = c26068u10;
                    state = state;
                    function4 = function16;
                    c28655q.m87172p0(aVar);
                }
                AbstractC28683x.m87255i(c26068u3, listM35651c3, enumC12737mM35652e3, (InterfaceC4351m) aVar, c28655q);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, modifier4);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                function5 = function4;
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
                if (state.m35654g().size() > 1) {
                    c28655q.m87150e0(-1256747248);
                    c28655q.m87150e0(-179086209);
                    List<C12740p> listM35654g4 = state.m35654g();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM35654g4, 10));
                    while (it.hasNext()) {
                        C12740p c12740p5 = (C12740p) it.next();
                        arrayList.add(new C25232g(c12740p5.getId(), null, AbstractC8693b.m21278l(c12740p5.getNameDisplay()), C38072d.f163053a.m121952e(c28655q, 6).getB1()));
                    }
                    c28655q.m87173q(false);
                    int iM35634u4 = m35634u(interfaceC28670t2);
                    long jM125430y4 = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    C39174f c39174f4 = new C39174f(state.getTagsHorizontalInset());
                    boolean zM87153g10 = c28655q.m87153g(interfaceC28601c2);
                    if (i25 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = zM87153g10 | z19 | c28655q.m87157i(state) | c28655q.m87157i(interfaceC2994c0) | ((i24 <= 2048 && c28655q.m87153g(c26068u3)) || (i19 & 3072) == 2048);
                    objM87133R8 = c28655q.m87133R();
                    if (zM87157i) {
                        function6 = function5;
                        C1008b c1008b6 = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                        c28655q.m87172p0(c1008b6);
                        objM87133R8 = c1008b6;
                    } else {
                        function6 = function5;
                        C1008b c1008b7 = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                        c28655q.m87172p0(c1008b7);
                        objM87133R8 = c1008b7;
                    }
                    Function1 function17 = (Function1) objM87133R8;
                    c28676v1 = c28676v0;
                    f13 = 1.0f;
                    z16 = true;
                    i26 = 4;
                    AbstractC25230e.m73956l(arrayList, iM35634u4, jM125430y4, c39174f4, null, null, function17, c28655q, 0, 48);
                    c28655q = c28655q;
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    function6 = function5;
                    z16 = true;
                    c28676v1 = c28676v0;
                    f13 = 1.0f;
                    i26 = 4;
                    z17 = false;
                    c28655q.m87150e0(-1255482572);
                    c28655q.m87173q(false);
                }
                float f17 = 8;
                C22971k c22971kM66746i4 = AbstractC22977m.m66746i(i26 * f17);
                if (f13 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3406c(f13, new LayoutWeightElement(f13, z16)), 0.0f, 3 * f17, 0.0f, 0.0f, 13);
                objM87133R6 = c28655q.m87133R();
                c28676v2 = c28676v1;
                if (objM87133R6 == c28676v2) {
                    objM87133R6 = new C12229c(28);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM51775c4 = AbstractC18032n.m51775c(modifierM3398t4, z17, (Function1) objM87133R6);
                boolean zM87157i8 = c28655q.m87157i(state);
                if (i25 == 16384) {
                    z17 = z16;
                }
                z18 = zM87157i8 | z17;
                objM87133R7 = c28655q.m87133R();
                if (z18) {
                    objM87133R7 = new C12733i(state, function6);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C12733i(state, function6);
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC22973k1 interfaceC22973k8 = interfaceC22973k4;
                C28655q c28655q5 = c28655q;
                AbstractC22674j.m65717c(modifierM51775c4, c26068u3, interfaceC22973k8, c22971kM66746i4, null, null, false, null, (Function1) objM87133R7, c28655q5, ((i19 >> 6) & 112) | 24576 | (i19 & 896), 488);
                c28655q = c28655q5;
                c28655q.m87173q(z16);
                function3 = function6;
                c26068u2 = c26068u3;
                interfaceC22973k3 = interfaceC22973k8;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                c26068u2 = c26068u;
                interfaceC22973k3 = interfaceC22973k2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(modifier2, state, interfaceC22973k3, c26068u2, function3, i13, i14);
            }
        }
        i15 |= 384;
        interfaceC22973k2 = interfaceC22973k1;
        if ((i13 & 3072) != 0) {
            i15 |= ((i14 & 8) == 0 || !c28655q.m87153g(c26068u)) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED : 2048;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i18 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k2;
                    }
                    if ((i14 & 8) != 0) {
                        c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                        i15 &= -7169;
                    } else {
                        c26068uM77569a = c26068u;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12229c(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        modifier4 = modifier3;
                        interfaceC22973k4 = interfaceC22973k1M3379a;
                        i19 = i15;
                        function4 = (Function1) objM87133R;
                    } else {
                        modifier4 = modifier3;
                        interfaceC22973k4 = interfaceC22973k1M3379a;
                        function4 = function2;
                        i19 = i15;
                    }
                } else {
                    if (i27 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i28 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k2;
                    }
                    if ((i14 & 8) != 0) {
                        c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                        i15 &= -7169;
                    } else {
                        c26068uM77569a = c26068u;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12229c(27);
                            c28655q.m87172p0(objM87133R);
                        }
                        modifier4 = modifier3;
                        interfaceC22973k4 = interfaceC22973k1M3379a;
                        i19 = i15;
                        function4 = (Function1) objM87133R;
                    } else {
                        modifier4 = modifier3;
                        interfaceC22973k4 = interfaceC22973k1M3379a;
                        function4 = function2;
                        i19 = i15;
                    }
                }
                c28655q.m87175r();
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                zM87153g = c28655q.m87153g(state.getSelectedTagId());
                objM87133R4 = c28655q.m87133R();
                if (zM87153g) {
                    strM35653f = state.getSelectedTagId();
                    if (strM35653f == null) {
                        c12740p = (C12740p) AbstractC25265s.m74100H0(state.m35654g());
                        if (c12740p != null) {
                            strM35653f = c12740p.getId();
                        } else {
                            strM35653f = null;
                        }
                    }
                    objM87133R4 = AbstractC28683x.m87272z(strM35653f);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    strM35653f = state.getSelectedTagId();
                    if (strM35653f == null) {
                        c12740p = (C12740p) AbstractC25265s.m74100H0(state.m35654g());
                        if (c12740p != null) {
                            strM35653f = c12740p.getId();
                        } else {
                            strM35653f = null;
                        }
                    }
                    objM87133R4 = AbstractC28683x.m87272z(strM35653f);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                zM87153g2 = c28655q.m87153g(state.m35654g());
                objM87133R5 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R5 = AbstractC28683x.m87264r(new C12735k(state, interfaceC28601c2, 1));
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = AbstractC28683x.m87264r(new C12735k(state, interfaceC28601c2, 1));
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
                List<C12729e> listM35651c4 = state.m35651c();
                EnumC12737m enumC12737mM35652e4 = state.getScrollTrackingMode();
                boolean zM87157i9 = c28655q.m87157i(state);
                i24 = (i19 & 7168) ^ 3072;
                if (i24 > 2048) {
                    interfaceC28601c3 = interfaceC28601c1;
                    if ((i19 & 3072) != 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                    if ((i19 & 3072) != 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                boolean zM87153g11 = zM87157i9 | z13 | c28655q.m87153g(interfaceC28601c2);
                i25 = i19 & 57344;
                if (i25 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87153g11 | z14;
                Object objM87133R13 = c28655q.m87133R();
                if (z15) {
                    Function1 function18 = function4;
                    C26068u c26068u11 = c26068uM77569a;
                    interfaceC28601c4 = interfaceC28601c3;
                    aVar = new a(state, c26068u11, function18, interfaceC28601c4, interfaceC28601c2, null);
                    c26068u3 = c26068u11;
                    state = state;
                    function4 = function18;
                    c28655q.m87172p0(aVar);
                } else {
                    Function1 function19 = function4;
                    C26068u c26068u12 = c26068uM77569a;
                    interfaceC28601c4 = interfaceC28601c3;
                    aVar = new a(state, c26068u12, function19, interfaceC28601c4, interfaceC28601c2, null);
                    c26068u3 = c26068u12;
                    state = state;
                    function4 = function19;
                    c28655q.m87172p0(aVar);
                }
                AbstractC28683x.m87255i(c26068u3, listM35651c4, enumC12737mM35652e4, (InterfaceC4351m) aVar, c28655q);
                Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, modifier4);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                function5 = function4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                if (state.m35654g().size() > 1) {
                    c28655q.m87150e0(-1256747248);
                    c28655q.m87150e0(-179086209);
                    List<C12740p> listM35654g5 = state.m35654g();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM35654g5, 10));
                    while (it.hasNext()) {
                        C12740p c12740p6 = (C12740p) it.next();
                        arrayList.add(new C25232g(c12740p6.getId(), null, AbstractC8693b.m21278l(c12740p6.getNameDisplay()), C38072d.f163053a.m121952e(c28655q, 6).getB1()));
                    }
                    c28655q.m87173q(false);
                    int iM35634u5 = m35634u(interfaceC28670t2);
                    long jM125430y5 = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    C39174f c39174f5 = new C39174f(state.getTagsHorizontalInset());
                    boolean zM87153g12 = c28655q.m87153g(interfaceC28601c2);
                    if (i25 == 16384) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = zM87153g12 | z19 | c28655q.m87157i(state) | c28655q.m87157i(interfaceC2994c0) | ((i24 <= 2048 && c28655q.m87153g(c26068u3)) || (i19 & 3072) == 2048);
                    objM87133R8 = c28655q.m87133R();
                    if (zM87157i) {
                        function6 = function5;
                        C1008b c1008b8 = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                        c28655q.m87172p0(c1008b8);
                        objM87133R8 = c1008b8;
                    } else {
                        function6 = function5;
                        C1008b c1008b9 = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                        c28655q.m87172p0(c1008b9);
                        objM87133R8 = c1008b9;
                    }
                    Function1 function110 = (Function1) objM87133R8;
                    c28676v1 = c28676v0;
                    f13 = 1.0f;
                    z16 = true;
                    i26 = 4;
                    AbstractC25230e.m73956l(arrayList, iM35634u5, jM125430y5, c39174f5, null, null, function110, c28655q, 0, 48);
                    c28655q = c28655q;
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    function6 = function5;
                    z16 = true;
                    c28676v1 = c28676v0;
                    f13 = 1.0f;
                    i26 = 4;
                    z17 = false;
                    c28655q.m87150e0(-1255482572);
                    c28655q.m87173q(false);
                }
                float f18 = 8;
                C22971k c22971kM66746i5 = AbstractC22977m.m66746i(i26 * f18);
                if (f13 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3406c(f13, new LayoutWeightElement(f13, z16)), 0.0f, 3 * f18, 0.0f, 0.0f, 13);
                objM87133R6 = c28655q.m87133R();
                c28676v2 = c28676v1;
                if (objM87133R6 == c28676v2) {
                    objM87133R6 = new C12229c(28);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM51775c5 = AbstractC18032n.m51775c(modifierM3398t5, z17, (Function1) objM87133R6);
                boolean zM87157i10 = c28655q.m87157i(state);
                if (i25 == 16384) {
                    z17 = z16;
                }
                z18 = zM87157i10 | z17;
                objM87133R7 = c28655q.m87133R();
                if (z18) {
                    objM87133R7 = new C12733i(state, function6);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C12733i(state, function6);
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC22973k1 interfaceC22973k9 = interfaceC22973k4;
                C28655q c28655q6 = c28655q;
                AbstractC22674j.m65717c(modifierM51775c5, c26068u3, interfaceC22973k9, c22971kM66746i5, null, null, false, null, (Function1) objM87133R7, c28655q6, ((i19 >> 6) & 112) | 24576 | (i19 & 896), 488);
                c28655q = c28655q6;
                c28655q.m87173q(z16);
                function3 = function6;
                c26068u2 = c26068u3;
                interfaceC22973k3 = interfaceC22973k9;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                c26068u2 = c26068u;
                interfaceC22973k3 = interfaceC22973k2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f(modifier2, state, interfaceC22973k3, c26068u2, function3, i13, i14);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i18 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if (i27 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i28 != 0) {
                    interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                } else {
                    interfaceC22973k1M3379a = interfaceC22973k2;
                }
                if ((i14 & 8) != 0) {
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                    i15 &= -7169;
                } else {
                    c26068uM77569a = c26068u;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12229c(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifier4 = modifier3;
                    interfaceC22973k4 = interfaceC22973k1M3379a;
                    i19 = i15;
                    function4 = (Function1) objM87133R;
                } else {
                    modifier4 = modifier3;
                    interfaceC22973k4 = interfaceC22973k1M3379a;
                    function4 = function2;
                    i19 = i15;
                }
            } else {
                if (i27 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i28 != 0) {
                    interfaceC22973k1M3379a = AbstractC1099a.m3379a(0.0f, 0.0f, 3);
                } else {
                    interfaceC22973k1M3379a = interfaceC22973k2;
                }
                if ((i14 & 8) != 0) {
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                    i15 &= -7169;
                } else {
                    c26068uM77569a = c26068u;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12229c(27);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifier4 = modifier3;
                    interfaceC22973k4 = interfaceC22973k1M3379a;
                    i19 = i15;
                    function4 = (Function1) objM87133R;
                } else {
                    modifier4 = modifier3;
                    interfaceC22973k4 = interfaceC22973k1M3379a;
                    function4 = function2;
                    i19 = i15;
                }
            }
            c28655q.m87175r();
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            zM87153g = c28655q.m87153g(state.getSelectedTagId());
            objM87133R4 = c28655q.m87133R();
            if (zM87153g) {
                strM35653f = state.getSelectedTagId();
                if (strM35653f == null) {
                    c12740p = (C12740p) AbstractC25265s.m74100H0(state.m35654g());
                    if (c12740p != null) {
                        strM35653f = c12740p.getId();
                    } else {
                        strM35653f = null;
                    }
                }
                objM87133R4 = AbstractC28683x.m87272z(strM35653f);
                c28655q.m87172p0(objM87133R4);
            } else {
                strM35653f = state.getSelectedTagId();
                if (strM35653f == null) {
                    c12740p = (C12740p) AbstractC25265s.m74100H0(state.m35654g());
                    if (c12740p != null) {
                        strM35653f = c12740p.getId();
                    } else {
                        strM35653f = null;
                    }
                }
                objM87133R4 = AbstractC28683x.m87272z(strM35653f);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
            zM87153g2 = c28655q.m87153g(state.m35654g());
            objM87133R5 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R5 = AbstractC28683x.m87264r(new C12735k(state, interfaceC28601c2, 1));
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = AbstractC28683x.m87264r(new C12735k(state, interfaceC28601c2, 1));
                c28655q.m87172p0(objM87133R5);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R5;
            List<C12729e> listM35651c5 = state.m35651c();
            EnumC12737m enumC12737mM35652e5 = state.getScrollTrackingMode();
            boolean zM87157i11 = c28655q.m87157i(state);
            i24 = (i19 & 7168) ^ 3072;
            if (i24 > 2048) {
                interfaceC28601c3 = interfaceC28601c1;
                if ((i19 & 3072) != 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } else {
                interfaceC28601c3 = interfaceC28601c1;
                if ((i19 & 3072) != 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            boolean zM87153g13 = zM87157i11 | z13 | c28655q.m87153g(interfaceC28601c2);
            i25 = i19 & 57344;
            if (i25 == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87153g13 | z14;
            Object objM87133R14 = c28655q.m87133R();
            if (z15) {
                Function1 function111 = function4;
                C26068u c26068u13 = c26068uM77569a;
                interfaceC28601c4 = interfaceC28601c3;
                aVar = new a(state, c26068u13, function111, interfaceC28601c4, interfaceC28601c2, null);
                c26068u3 = c26068u13;
                state = state;
                function4 = function111;
                c28655q.m87172p0(aVar);
            } else {
                Function1 function112 = function4;
                C26068u c26068u14 = c26068uM77569a;
                interfaceC28601c4 = interfaceC28601c3;
                aVar = new a(state, c26068u14, function112, interfaceC28601c4, interfaceC28601c2, null);
                c26068u3 = c26068u14;
                state = state;
                function4 = function112;
                c28655q.m87172p0(aVar);
            }
            AbstractC28683x.m87255i(c26068u3, listM35651c5, enumC12737mM35652e5, (InterfaceC4351m) aVar, c28655q);
            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, modifier4);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            function5 = function4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
            if (state.m35654g().size() > 1) {
                c28655q.m87150e0(-1256747248);
                c28655q.m87150e0(-179086209);
                List<C12740p> listM35654g6 = state.m35654g();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM35654g6, 10));
                while (it.hasNext()) {
                    C12740p c12740p7 = (C12740p) it.next();
                    arrayList.add(new C25232g(c12740p7.getId(), null, AbstractC8693b.m21278l(c12740p7.getNameDisplay()), C38072d.f163053a.m121952e(c28655q, 6).getB1()));
                }
                c28655q.m87173q(false);
                int iM35634u6 = m35634u(interfaceC28670t2);
                long jM125430y6 = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                C39174f c39174f6 = new C39174f(state.getTagsHorizontalInset());
                boolean zM87153g14 = c28655q.m87153g(interfaceC28601c2);
                if (i25 == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i = zM87153g14 | z19 | c28655q.m87157i(state) | c28655q.m87157i(interfaceC2994c0) | ((i24 <= 2048 && c28655q.m87153g(c26068u3)) || (i19 & 3072) == 2048);
                objM87133R8 = c28655q.m87133R();
                if (zM87157i) {
                    function6 = function5;
                    C1008b c1008b10 = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                    c28655q.m87172p0(c1008b10);
                    objM87133R8 = c1008b10;
                } else {
                    function6 = function5;
                    C1008b c1008b11 = new C1008b((Object) function6, (Object) state, interfaceC2994c0, interfaceC28601c4, interfaceC28601c2, (Object) c26068u3, 5);
                    c28655q.m87172p0(c1008b11);
                    objM87133R8 = c1008b11;
                }
                Function1 function113 = (Function1) objM87133R8;
                c28676v1 = c28676v0;
                f13 = 1.0f;
                z16 = true;
                i26 = 4;
                AbstractC25230e.m73956l(arrayList, iM35634u6, jM125430y6, c39174f6, null, null, function113, c28655q, 0, 48);
                c28655q = c28655q;
                z17 = false;
                c28655q.m87173q(false);
            } else {
                function6 = function5;
                z16 = true;
                c28676v1 = c28676v0;
                f13 = 1.0f;
                i26 = 4;
                z17 = false;
                c28655q.m87150e0(-1255482572);
                c28655q.m87173q(false);
            }
            float f19 = 8;
            C22971k c22971kM66746i6 = AbstractC22977m.m66746i(i26 * f19);
            if (f13 <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3406c(f13, new LayoutWeightElement(f13, z16)), 0.0f, 3 * f19, 0.0f, 0.0f, 13);
            objM87133R6 = c28655q.m87133R();
            c28676v2 = c28676v1;
            if (objM87133R6 == c28676v2) {
                objM87133R6 = new C12229c(28);
                c28655q.m87172p0(objM87133R6);
            }
            Modifier modifierM51775c6 = AbstractC18032n.m51775c(modifierM3398t6, z17, (Function1) objM87133R6);
            boolean zM87157i12 = c28655q.m87157i(state);
            if (i25 == 16384) {
                z17 = z16;
            }
            z18 = zM87157i12 | z17;
            objM87133R7 = c28655q.m87133R();
            if (z18) {
                objM87133R7 = new C12733i(state, function6);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C12733i(state, function6);
                c28655q.m87172p0(objM87133R7);
            }
            InterfaceC22973k1 interfaceC22973k10 = interfaceC22973k4;
            C28655q c28655q7 = c28655q;
            AbstractC22674j.m65717c(modifierM51775c6, c26068u3, interfaceC22973k10, c22971kM66746i6, null, null, false, null, (Function1) objM87133R7, c28655q7, ((i19 >> 6) & 112) | 24576 | (i19 & 896), 488);
            c28655q = c28655q7;
            c28655q.m87173q(z16);
            function3 = function6;
            c26068u2 = c26068u3;
            interfaceC22973k3 = interfaceC22973k10;
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
            c26068u2 = c26068u;
            interfaceC22973k3 = interfaceC22973k2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f(modifier2, state, interfaceC22973k3, c26068u2, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m35623j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m35624k(Function1 function1, C12738n c12738n, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C26068u c26068u, String tagId) {
        AbstractC22676k.m65750j(tagId, "tagId");
        m35630q(interfaceC28601c1, true);
        m35632s(interfaceC28601c2, tagId);
        function1.invoke(new AbstractC12732h.b(tagId));
        Iterator<C12729e> it = c12738n.m35651c().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(it.next().getType(), tagId)) {
                break;
            }
            i13++;
        }
        if (i13 >= 0) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c26068u, i13, interfaceC28601c1, null), 3);
        } else {
            m35630q(interfaceC28601c1, false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m35625l(InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51812k("anchor_selector_lazy_column", semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m35626m(C12738n c12738n, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C12729e> listM35651c = c12738n.m35651c();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM35651c.size(), new e(new C12229c(29), listM35651c), new f(d.f43572w, listM35651c), new C37816b(new g(listM35651c, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Object m35627n(C12729e it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m35628o(Modifier modifier, C12738n c12738n, InterfaceC22973k1 interfaceC22973k1, C26068u c26068u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m35622i(modifier, c12738n, interfaceC22973k1, c26068u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final boolean m35629p(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m35630q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final String m35631r(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m35632s(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[RETURN] */
    /* JADX INFO: renamed from: t */
    public static final int m35633t(C12738n c12738n, InterfaceC28601c1 interfaceC28601c1) {
        Iterator<C12740p> it = c12738n.m35654g().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(it.next().getId(), m35631r(interfaceC28601c1))) {
                if (i13 < 0) {
                    return 0;
                }
                return i13;
            }
            i13++;
        }
        i13 = -1;
        if (i13 < 0) {
            return 0;
        }
        return i13;
    }

    /* JADX INFO: renamed from: u */
    private static final int m35634u(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: renamed from: v */
    public static final void m35635v(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1167770597);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new h()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m35636w(int i13, Composer composer, int i14) {
        m35635v(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
