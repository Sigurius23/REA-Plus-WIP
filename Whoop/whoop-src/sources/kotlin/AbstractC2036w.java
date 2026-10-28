package kotlin;

import a00.C0073h;
import a01.C0089i;
import a20.C0167g;
import am2.C1042s;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import aq0.C1905p;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import f41.C14067e;
import f41.C14080r;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import java.util.List;
import km0.C22581e;
import l83.C23454a0;
import ny0.AbstractC27265l0;
import ny0.AbstractC27274q;
import ny0.AbstractC27292z;
import o81.C27656a;
import p000.AbstractC11266d;
import p000.C22079k;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p031b9.AbstractC2875y;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p730qt2.AbstractC30598d0;
import p730qt2.C30596c0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import uw0.AbstractC35302l;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import ws2.AbstractC37617i;
import x81.C38072d;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import yb0.AbstractC39383f;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.w */
/* JADX INFO: loaded from: classes11.dex */
@p715kotlin.Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lys2/e$i;", "viewState", "Lkotlin/Function1;", "Lws2/i;", "Ll83/a0;", "onViewEvent", "z", "(Lys2/e$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "v", "(Lys2/e$i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lv41/g;", "bottomSheetTopBar", "Lb3/x2;", "keyboard", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2036w {

    /* JADX INFO: renamed from: at2.w$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.SetUpActivityScreenKt$SetUpActivityScreen$2$1", m100430f = "SetUpActivityScreen.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8061w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f8062x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f8063y;

        /* JADX INFO: renamed from: at2.w$a$a, reason: collision with other inner class name */
        @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41289a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28670t2 f8064w;

            public C41289a(InterfaceC28670t2 interfaceC28670t2) {
                this.f8064w = interfaceC28670t2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC2464x2 interfaceC2464x2M6363C;
                if (enumC15209z3 == EnumC15209z3.f57106w && (interfaceC2464x2M6363C = AbstractC2036w.m6363C(this.f8064w)) != null) {
                    ((C2463x1) interfaceC2464x2M6363C).m7442a();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8062x = c15199y3;
            this.f8063y = interfaceC28670t2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m6409h(C15199y3 c15199y3) {
            return c15199y3.m43222c();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f8062x, this.f8063y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8061w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C2034v(this.f8062x, 0));
                C41289a c41289a = new C41289a(this.f8063y);
                this.f8061w = 1;
                if (c13084s1M87240H.collect(c41289a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: at2.w$b */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.SetUpActivityScreenKt$SetUpActivityScreen$3$1$1", m100430f = "SetUpActivityScreen.kt", m100431l = {91}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8065w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f8066x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC35664f.a aVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8066x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f8066x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8065w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f8066x.getModalBottomSheetState();
                this.f8065w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: at2.w$c */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f8067w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC39758e.i f8068x;

        public c(Function1 function1, AbstractC39758e.i iVar) {
            this.f8067w = function1;
            this.f8068x = iVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m6411a(Object viewEvent) {
            AbstractC22676k.m65750j(viewEvent, "viewEvent");
            if (viewEvent instanceof C14080r) {
                C14080r c14080r = (C14080r) viewEvent;
                this.f8067w.invoke(new AbstractC37617i.l(this.f8068x.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), c14080r.getId(), c14080r.getIsToggled(), false, c14080r.getSelectedNumber()));
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m6411a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: at2.w$d */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f8069w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC39758e.i f8070x;

        public d(Function1 function1, AbstractC39758e.i iVar) {
            this.f8069w = function1;
            this.f8070x = iVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m6412a(Object viewEvent) {
            AbstractC22676k.m65750j(viewEvent, "viewEvent");
            if (viewEvent instanceof C14080r) {
                C14080r c14080r = (C14080r) viewEvent;
                this.f8069w.invoke(new AbstractC37617i.l(this.f8070x.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), c14080r.getId(), c14080r.getIsToggled(), false, c14080r.getSelectedNumber()));
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m6412a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: at2.w$e */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.SetUpActivityScreenKt$SetUpActivityScreen$5$1$2$1$7$1$1$1", m100430f = "SetUpActivityScreen.kt", m100431l = {234}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8071w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f8072x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC35664f.a f8073y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, AbstractC35664f.a aVar, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8072x = function1;
            this.f8073y = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f8072x, this.f8073y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8071w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f8072x.invoke(AbstractC37617i.e.f160952a);
                C15199y3 c15199y3M112950a = this.f8073y.getModalBottomSheetState();
                this.f8071w = 1;
                if (c15199y3M112950a.m43225f(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: at2.w$f */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.SetUpActivityScreenKt$SetUpActivityScreen$6$1$1", m100430f = "SetUpActivityScreen.kt", m100431l = {254}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8074w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f8075x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC35664f.a aVar, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8075x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f8075x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8074w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f8075x.getModalBottomSheetState();
                this.f8074w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: at2.w$g */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f8076w = new g();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: at2.w$h */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f8077w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f8078x;

        public h(Function1 function1, List list) {
            this.f8077w = function1;
            this.f8078x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m6414a(int i13) {
            return this.f8077w.invoke(this.f8078x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6414a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: at2.w$i */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f8079w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f8080x;

        public i(Function1 function1, List list) {
            this.f8079w = function1;
            this.f8080x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m6415a(int i13) {
            return this.f8079w.invoke(this.f8080x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6415a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: at2.w$j */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f8081w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f8082x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC39758e.i f8083y;

        public j(List list, Function1 function1, AbstractC39758e.i iVar) {
            this.f8081w = list;
            this.f8082x = function1;
            this.f8083y = iVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m6416a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f8081w.get(i13);
            c28655q.m87150e0(944265970);
            boolean zM87153g = c28655q.m87153g(this.f8082x) | c28655q.m87157i(this.f8083y);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new c(this.f8082x, this.f8083y);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
            AbstractC31061c.m95650z((float) 1.5d, 8, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m6416a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: at2.w$k */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f8084w = new k();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: at2.w$l */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f8085w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f8086x;

        public l(Function1 function1, List list) {
            this.f8085w = function1;
            this.f8086x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m6418a(int i13) {
            return this.f8085w.invoke(this.f8086x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6418a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: at2.w$m */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f8087w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f8088x;

        public m(Function1 function1, List list) {
            this.f8087w = function1;
            this.f8088x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m6419a(int i13) {
            return this.f8087w.invoke(this.f8088x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6419a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: at2.w$n */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f8089w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f8090x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC39758e.i f8091y;

        public n(List list, Function1 function1, AbstractC39758e.i iVar) {
            this.f8089w = list;
            this.f8090x = function1;
            this.f8091y = iVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m6420a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f8089w.get(i13);
            c28655q.m87150e0(30290899);
            boolean zM87153g = c28655q.m87153g(this.f8090x) | c28655q.m87157i(this.f8091y);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new d(this.f8090x, this.f8091y);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
            AbstractC31061c.m95650z((float) 1.5d, 8, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m6420a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m6361A(AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final C35666g m6362B(InterfaceC28601c1 interfaceC28601c1) {
        return (C35666g) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final InterfaceC2464x2 m6363C(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC2464x2) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m6364D(InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m6365E(AbstractC39758e.i iVar, int i13, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, Function1 function1, InterfaceC23013y BottomSheet, Composer composer, int i14) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            C22581e c22581eM127191c = iVar.getBottomSheet();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C2010j(function1, 13);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C2020o(function1, 0);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean zM87153g3 = c28655q.m87153g(function1);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C2010j(function1, 11);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function3 = (Function1) objM87133R3;
            boolean zM87153g4 = c28655q.m87153g(function1);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C2010j(function1, 12);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC35302l.m112030o(c22581eM127191c, i13, interfaceC2994c0, aVar, false, false, function2, interfaceC4339a, function3, (Function1) objM87133R4, null, c28655q, C22581e.f88865n | (AbstractC35664f.a.f151587c << 9), 0, 1072);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m6366F(Function1 function1, String id4) {
        AbstractC22676k.m65750j(id4, "id");
        function1.invoke(new AbstractC37617i.k(id4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m6367G(Function1 function1) {
        function1.invoke(AbstractC37617i.g.f160957a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m6368H(Function1 function1, int i13) {
        function1.invoke(new AbstractC37617i.b(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m6369I(Function1 function1, String query) {
        AbstractC22676k.m65750j(query, "query");
        function1.invoke(new AbstractC37617i.n(query));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m6370J(AbstractC39758e.i iVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, Composer composer, int i13) {
        boolean z4 = false;
        int i14 = 2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(iVar.getHeader().getNavigationTitle(), AbstractC8693b.m21270d(iVar.getHeader().getNavigationSubTitle()) ? new C27656a(iVar.getHeader().getNavigationSubTitle(), z4, i14, null) : null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E))), null, null, null, false, null, null, null, null, null, null, null, null, 32760, null);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(iVar);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C2022p(function1, iVar, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(c2314t, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * 8, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3599a = AbstractC1136a.m3599a(modifierM3396r.mo3471e(new LayoutWeightElement(1.0f, true)), "SetupActivityLazyColumnTag");
            boolean zM87157i = c28655q.m87157i(iVar) | c28655q.m87153g(function1) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C1042s(iVar, function1, interfaceC2994c0, aVar);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22674j.m65717c(modifierM3599a, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q, 0, 510);
            m6403v(iVar, function1, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m6371K(Function1 function1, AbstractC39758e.i iVar) {
        function1.invoke(new AbstractC37617i.a(iVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex() == 0, 0, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m6372L(final AbstractC39758e.i iVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        final int i13 = 0;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: at2.q
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return AbstractC2036w.m6373M(iVar, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC2036w.m6375O(iVar, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, -608369541), 3);
        if (!iVar.m127201m().isEmpty()) {
            List<InterfaceC25312u> listM127201m = iVar.m127201m();
            C1905p c1905p = new C1905p(6);
            g gVar = g.f8076w;
            ((C26053f) LazyColumn).m77529r(listM127201m.size(), new h(c1905p, listM127201m), new i(gVar, listM127201m), new C37816b(new j(listM127201m, function1, iVar), true, 802480018));
        }
        final int i14 = 1;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: at2.q
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC2036w.m6373M(iVar, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC2036w.m6375O(iVar, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, 1272774372), 3);
        List<InterfaceC25312u> listM127194f = iVar.m127194f();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM127194f.size(), new l(new C1905p(7), listM127194f), new m(k.f8084w, listM127194f), new C37816b(new n(listM127194f, function1, iVar), true, 802480018));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C2026r(iVar, interfaceC2994c0, function1, aVar, 0), true, -729536957), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m6373M(AbstractC39758e.i iVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f13, c2314t));
            TextResource textResourceM127273d = iVar.getHeader().getTitle();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM127273d, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8418P = c38072d.m121952e(c28655q, i15).getT3();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i16, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(iVar.getHeader().getSubTitle(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196602);
            if (iVar.m127201m().isEmpty() || !AbstractC8693b.m21270d(iVar.getTopHeadingDisplay())) {
                c28655q.m87150e0(826198471);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(825762177);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(4 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(iVar.getTopHeadingDisplay(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getSh4(), null, c28655q, 0, i16, 196602);
                AbstractC31061c.m95650z((float) 1.5d, f13, c2314t, c28655q, false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final Object m6374N(InterfaceC25312u topItem) {
        AbstractC22676k.m65750j(topItem, "topItem");
        C14067e c14067e = topItem instanceof C14067e ? (C14067e) topItem : null;
        String strM8299l = c14067e != null ? AbstractC2875y.m8299l(c14067e.getId(), "_topItem") : null;
        return strM8299l == null ? "" : strM8299l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m6375O(AbstractC39758e.i iVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zIsEmpty = iVar.m127201m().isEmpty();
            C2314t c2314t = C2314t.f9131w;
            if (zIsEmpty) {
                c28655q.m87150e0(1250205881);
                AbstractC31061c.m95650z(4, 8, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(1250097815);
                AbstractC31061c.m95650z((float) 2.5d, 8, c2314t, c28655q, false);
            }
            String strM21274h = AbstractC8693b.m21274h(iVar.getHeadingDisplay(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            AbstractC18489d0.m53380u((float) 1.5d, 8, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final Object m6376P(InterfaceC25312u it) {
        AbstractC22676k.m65750j(it, "it");
        C14067e c14067e = it instanceof C14067e ? (C14067e) it : null;
        String id4 = c14067e != null ? c14067e.getId() : null;
        return id4 == null ? "" : id4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m6377Q(AbstractC39758e.i iVar, InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC35664f.a aVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zIsEmpty = iVar.m127201m().isEmpty();
            C2314t c2314t = C2314t.f9131w;
            if (zIsEmpty) {
                c28655q.m87150e0(-1100798593);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1100897576);
                AbstractC31061c.m95650z((float) 2.5d, 8, c2314t, c28655q, false);
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            C39282o c39282o = new C39282o(null, iVar.getAddButtonInfo().getTitleDisplay(), null, false, false, new AbstractC39279l.b(objArr, null, new C39274g(iVar.getAddButtonInfo().getIcon(), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, 4091, defaultConstructorMarker), false, objArr2, objArr3, objArr4, false, objArr5, objArr6, objArr7, null, 32733, defaultConstructorMarker);
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(function1) | c28655q.m87157i(aVar);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C2018n(interfaceC2994c0, function1, aVar, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39281n.m125207c(null, c39282o, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 1);
            C30596c0 c30596c0M127199k = iVar.getTooltip();
            if (c30596c0M127199k == null) {
                c28655q.m87150e0(-1099966399);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1099966398);
                AbstractC11266d.m30469w(5, 8, c2314t, c28655q);
                AbstractC30598d0.m93869c(c2314t, c30596c0M127199k, c28655q, (TextResource.$stable << 3) | 6);
                c28655q.m87173q(false);
            }
            AbstractC18489d0.m53380u(5, 8, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m6378R(InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(function1, aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m6379S(C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC39758e.i iVar, AbstractC35664f.a aVar) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c15199y3.m43224e()) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(aVar, null), 3);
        } else {
            int iM120803a = iVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex();
            function1.invoke(new AbstractC37617i.a(iM120803a == 0, 0, 2, defaultConstructorMarker));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m6380T(AbstractC39758e.i iVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m6407z(iVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m6403v(AbstractC39758e.i iVar, Function1 function1, Composer composer, int i13) {
        int i14;
        AbstractC39758e.i iVar2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1786988939);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(iVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, ((float) 2.5d) * f13, 2 * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t), "Save_Activities_Button");
            TextResource textResourceM127171a = iVar.getBottom().getContinueButtonDisplay();
            boolean zM127172b = iVar.getBottom().getEnableContinueButton();
            int i15 = i14 & 112;
            boolean zM87157i = (i15 == 32) | c28655q.m87157i(iVar);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C2022p(function1, iVar, 0);
                c28655q.m87172p0(objM87133R);
            }
            int i16 = TextResource.$stable;
            AbstractC27292z.m82343j(modifierM44101d, zM127172b, false, null, null, null, textResourceM127171a, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, i16 << 18, 0, 8124);
            c28655q = c28655q;
            AbstractC18489d0.m53380u((float) 1.5d, f13, c2314t, c28655q);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM127173c = iVar.getBottom().getSkipButtonDisplay();
            if (textResourceM127173c == null) {
                c28655q.m87150e0(1708954597);
                c28655q.m87173q(false);
                iVar2 = iVar;
            } else {
                c28655q.m87150e0(1708954598);
                iVar2 = iVar;
                boolean zM87157i2 = c28655q.m87157i(iVar2) | (i15 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C0167g(14, function1, iVar2);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27265l0.m82217i(null, null, textResourceM127173c, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, i16 << 6, 0, 4091);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            iVar2 = iVar;
            function1 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(iVar2, function1, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m6404w(Function1 function1, AbstractC39758e.i iVar) {
        function1.invoke(new AbstractC37617i.f(iVar.getPlanId(), iVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), iVar.m127197i(), null, 8, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m6405x(Function1 function1, AbstractC39758e.i iVar, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC37617i.c(iVar.getPlanId(), iVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), null, 4, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m6406y(AbstractC39758e.i iVar, Function1 function1, int i13, Composer composer, int i14) {
        m6403v(iVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static final void m6407z(AbstractC39758e.i viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        TextResource textResource;
        C15199y3 c15199y3M3460c;
        AbstractC35664f.a aVar;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        boolean zM87157i;
        Object objM87133R3;
        boolean zM87157i2;
        Object objM87133R4;
        Function1 function4;
        boolean z13;
        boolean zM87157i3;
        Object c0073h;
        Function1 function5;
        Object objM87133R5;
        Object[] objArr;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(190151220);
        int i17 = 2;
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            i16 = i15;
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1905p(8);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function3 = (Function1) objM87133R5;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                textResource = null;
                objArr = 0;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(new C35666g(viewState.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i17, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                int iIndexOf = viewState.getBottomSheet().m65420e().indexOf(viewState.getBottomSheet().getCurrentCategory());
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
                zM87157i = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R3 = c28655q2.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                C35666g c35666gM6362B = m6362B(interfaceC28601c1);
                AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                zM87157i2 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C2028s(interfaceC2994c0, aVar, 0);
                    c28655q2.m87172p0(objM87133R4);
                }
                function4 = function3;
                AbstractC35660d.m112871m(modifierM3407d, c35666gM6362B, aVar, null, (InterfaceC4339a) objM87133R4, null, null, AbstractC37817c.m121344e(476081634, c28655q2, new C2030t(iIndexOf, 0, viewState, interfaceC2994c0, aVar, function4)), false, bVar, null, null, false, null, AbstractC37817c.m121344e(-584923482, c28655q2, new C2032u(viewState, function4, interfaceC2994c0, aVar, 0)), c28655q2, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                c28655q = c28655q2;
                boolean zM87157i4 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i3 = zM87157i4 | z13 | c28655q.m87157i(viewState);
                Object objM87133R6 = c28655q.m87133R();
                if (!zM87157i3 || objM87133R6 == c28676v0) {
                    c0073h = new C0073h(c15199y3M3460c, interfaceC2994c0, function4, viewState, aVar, 3);
                    function5 = function4;
                    c28655q.m87172p0(c0073h);
                } else {
                    c0073h = objM87133R6;
                    function5 = function4;
                }
                AbstractC20301a.m56332c((InterfaceC4339a) c0073h, false, c28655q, 0, 1);
                function2 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(viewState, i13, function2, i14, 2);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i15;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C1905p(8);
                    c28655q2.m87172p0(objM87133R5);
                }
                function3 = (Function1) objM87133R5;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            textResource = null;
            objArr = 0;
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
            aVar = new AbstractC35664f.a(c15199y3M3460c);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(new C35666g(viewState.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i17, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            int iIndexOf2 = viewState.getBottomSheet().m65420e().indexOf(viewState.getBottomSheet().getCurrentCategory());
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
            zM87157i = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87153g(interfaceC28601c1M87238F);
            objM87133R3 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R3 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            C35666g c35666gM6362B2 = m6362B(interfaceC28601c2);
            AbstractC27274q.b bVar2 = AbstractC27274q.b.f109138f;
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            zM87157i2 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R4 = new C2028s(interfaceC2994c0, aVar, 0);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C2028s(interfaceC2994c0, aVar, 0);
                c28655q2.m87172p0(objM87133R4);
            }
            function4 = function3;
            AbstractC35660d.m112871m(modifierM3407d2, c35666gM6362B2, aVar, null, (InterfaceC4339a) objM87133R4, null, null, AbstractC37817c.m121344e(476081634, c28655q2, new C2030t(iIndexOf2, 0, viewState, interfaceC2994c0, aVar, function4)), false, bVar2, null, null, false, null, AbstractC37817c.m121344e(-584923482, c28655q2, new C2032u(viewState, function4, interfaceC2994c0, aVar, 0)), c28655q2, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
            c28655q = c28655q2;
            boolean zM87157i5 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i3 = zM87157i5 | z13 | c28655q.m87157i(viewState);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i3) {
                c0073h = new C0073h(c15199y3M3460c, interfaceC2994c0, function4, viewState, aVar, 3);
                function5 = function4;
                c28655q.m87172p0(c0073h);
            } else {
                c0073h = new C0073h(c15199y3M3460c, interfaceC2994c0, function4, viewState, aVar, 3);
                function5 = function4;
                c28655q.m87172p0(c0073h);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) c0073h, false, c28655q, 0, 1);
            function2 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(viewState, i13, function2, i14, 2);
        }
    }
}
