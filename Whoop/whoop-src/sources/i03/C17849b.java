package i03;

import android.content.Context;
import c93.InterfaceC4351m;
import com.whoop.widget.p071ui.healthspan.C10920a;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import ge3.AbstractC15751g;
import l83.C23454a0;
import od1.InterfaceC27837a0;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: i03.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Li03/b;", "", "Landroid/content/Context;", "context", "Lod1/a0;", "sessionManager", "Lcom/whoop/widget/ui/healthspan/a;", "healthspanWidgetStateWriter", "<init>", "(Landroid/content/Context;Lod1/a0;Lcom/whoop/widget/ui/healthspan/a;)V", "Ll83/a0;", "c", "(Lq83/d;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lod1/a0;", "Lcom/whoop/widget/ui/healthspan/a;", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17849b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC27837a0 sessionManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C10920a healthspanWidgetStateWriter;

    /* JADX INFO: renamed from: i03.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.widget.triggers.WidgetLogoutUpdater", m100430f = "WidgetLogoutUpdater.kt", m100431l = {33}, m100432m = "registerForLogoutEvent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f69434w;

        /* JADX INFO: renamed from: y */
        int f69436y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f69434w = obj;
            this.f69436y |= Integer.MIN_VALUE;
            return C17849b.this.m51331c(this);
        }
    }

    /* JADX INFO: renamed from: i03.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: i03.b$b$a */
        /* JADX INFO: loaded from: classes11.dex */
        @InterfaceC32271e(m100429c = "com.whoop.widget.triggers.WidgetLogoutUpdater$registerForLogoutEvent$2$1$1", m100430f = "WidgetLogoutUpdater.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f69438w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f69439x;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f69439x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f69439x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f69438w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44471x = AbstractC15751g.m44471x("WIDGET_KEY_RECOVERY_PERCENT");
                Float f13 = new Float(0.0f);
                c14129a.getClass();
                c14129a.m40231h(c14132dM44471x, f13);
                c14129a.m40231h(AbstractC15751g.m44453f("WIDGET_KEY_IS_CALIBRATING"), Boolean.FALSE);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: i03.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes11.dex */
        @InterfaceC32271e(m100429c = "com.whoop.widget.triggers.WidgetLogoutUpdater$registerForLogoutEvent$2$2$1", m100430f = "WidgetLogoutUpdater.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41725b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f69440w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f69441x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f69442y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41725b(String str, InterfaceC30057d<? super C41725b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f69442y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41725b c41725b = new C41725b(this.f69442y, interfaceC30057d);
                c41725b.f69441x = obj;
                return c41725b;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41725b) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f69441x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f69440w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44441U = AbstractC15751g.m44441U("WIDGET_KEY_SLEEP_PERCENT");
                String str = this.f69442y;
                c14129a.getClass();
                c14129a.m40231h(c14132dM44441U, str);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: i03.b$b$c */
        /* JADX INFO: loaded from: classes11.dex */
        @InterfaceC32271e(m100429c = "com.whoop.widget.triggers.WidgetLogoutUpdater$registerForLogoutEvent$2$3$1", m100430f = "WidgetLogoutUpdater.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f69443w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f69444x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f69445y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f69445y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                c cVar = new c(this.f69445y, interfaceC30057d);
                cVar.f69444x = obj;
                return cVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f69444x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f69443w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44441U = AbstractC15751g.m44441U("WIDGET_KEY_STRAIN_PERCENT");
                String str = this.f69445y;
                c14129a.getClass();
                c14129a.m40231h(c14132dM44441U, str);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: i03.b$b$d */
        /* JADX INFO: loaded from: classes11.dex */
        @InterfaceC32271e(m100429c = "com.whoop.widget.triggers.WidgetLogoutUpdater$registerForLogoutEvent$2$4$1", m100430f = "WidgetLogoutUpdater.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class d extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f69446w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f69447x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f69448y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f69448y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                d dVar = new d(this.f69448y, interfaceC30057d);
                dVar.f69447x = obj;
                return dVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((d) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f69447x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f69446w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44441U = AbstractC15751g.m44441U("WIDGET_KEY_STEPS_COUNT");
                String str = this.f69448y;
                c14129a.getClass();
                c14129a.m40231h(c14132dM44441U, str);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: i03.b$b$e */
        /* JADX INFO: loaded from: classes11.dex */
        @InterfaceC32271e(m100429c = "com.whoop.widget.triggers.WidgetLogoutUpdater$registerForLogoutEvent$2$5$1", m100430f = "WidgetLogoutUpdater.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class e extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f69449w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f69450x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f69451y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f69451y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                e eVar = new e(this.f69451y, interfaceC30057d);
                eVar.f69450x = obj;
                return eVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((e) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f69450x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f69449w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44471x = AbstractC15751g.m44471x("WIDGET_KEY_RECOVERY_PERCENT");
                Float f13 = new Float(0.0f);
                c14129a.getClass();
                c14129a.m40231h(c14132dM44471x, f13);
                c14129a.m40231h(AbstractC15751g.m44441U("WIDGET_KEY_SLEEP_PERCENT"), this.f69451y);
                c14129a.m40231h(AbstractC15751g.m44441U("WIDGET_KEY_STRAIN_PERCENT"), this.f69451y);
                c14129a.m40231h(AbstractC15751g.m44453f("WIDGET_KEY_IS_CALIBRATING"), Boolean.FALSE);
                c14129a.m40229f(AbstractC15751g.m44423C("WIDGET_KEY_STRAP_BATTERY_PERCENT"));
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: i03.b$b$f */
        /* JADX INFO: loaded from: classes11.dex */
        @InterfaceC32271e(m100429c = "com.whoop.widget.triggers.WidgetLogoutUpdater$registerForLogoutEvent$2$6$1", m100430f = "WidgetLogoutUpdater.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class f extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f69452w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f69453x;

            public f(InterfaceC30057d<? super f> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                f fVar = new f(interfaceC30057d);
                fVar.f69453x = obj;
                return fVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((f) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C14129a c14129a = (C14129a) this.f69453x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f69452w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                c14129a.m40229f(AbstractC15751g.m44423C("WIDGET_KEY_STRAP_BATTERY_PERCENT"));
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: i03.b$b$g */
        /* JADX INFO: loaded from: classes11.dex */
        @InterfaceC32271e(m100429c = "com.whoop.widget.triggers.WidgetLogoutUpdater$registerForLogoutEvent$2", m100430f = "WidgetLogoutUpdater.kt", m100431l = {36, 37, 43, 44, 49, 50, 55, 56, 61, 62, 71, 72, 77, 79, 80, 81, 82, 83, 84}, m100432m = "emit", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class g extends AbstractC32269c {

            /* JADX INFO: renamed from: E */
            Object f69454E;

            /* JADX INFO: renamed from: F */
            Object f69455F;

            /* JADX INFO: renamed from: G */
            Object f69456G;

            /* JADX INFO: renamed from: H */
            int f69457H;

            /* JADX INFO: renamed from: I */
            int f69458I;

            /* JADX INFO: renamed from: J */
            /* synthetic */ Object f69459J;

            /* JADX INFO: renamed from: K */
            final /* synthetic */ b<T> f69460K;

            /* JADX INFO: renamed from: L */
            int f69461L;

            /* JADX INFO: renamed from: w */
            Object f69462w;

            /* JADX INFO: renamed from: x */
            Object f69463x;

            /* JADX INFO: renamed from: y */
            Object f69464y;

            /* JADX INFO: renamed from: z */
            Object f69465z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public g(b<? super T> bVar, InterfaceC30057d<? super g> interfaceC30057d) {
                super(interfaceC30057d);
                this.f69460K = bVar;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f69459J = obj;
                this.f69461L |= Integer.MIN_VALUE;
                return this.f69460K.emit(null, this);
            }
        }

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:100:0x047f  */
        /* JADX WARN: Code duplicated, block: B:103:0x0499  */
        /* JADX WARN: Code duplicated, block: B:109:0x04b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:111:? A[LOOP:0: B:80:0x03c3->B:111:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:113:0x04b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:115:? A[LOOP:1: B:71:0x035e->B:115:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:116:0x04b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:119:? A[LOOP:2: B:62:0x02f8->B:119:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:121:0x04b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:123:? A[LOOP:3: B:53:0x0295->B:123:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:125:0x04b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:4: B:44:0x0232->B:127:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:129:0x04b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:131:? A[LOOP:5: B:35:0x01cf->B:131:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:37:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:46:0x0238  */
        /* JADX WARN: Code duplicated, block: B:55:0x029b  */
        /* JADX WARN: Code duplicated, block: B:64:0x02fe  */
        /* JADX WARN: Code duplicated, block: B:73:0x0364  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code duplicated, block: B:82:0x03c9  */
        /* JADX WARN: Code duplicated, block: B:88:0x0416  */
        /* JADX WARN: Code duplicated, block: B:91:0x0431  */
        /* JADX WARN: Code duplicated, block: B:94:0x044b  */
        /* JADX WARN: Code duplicated, block: B:97:0x0465  */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x04b0, code lost:
        
            if (pf.AbstractC29125c.m88519a0(r12, r1, r11) == r0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x01c0, code lost:
        
            if (r12 == r0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0223, code lost:
        
            if (r12 == r0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0286, code lost:
        
            if (r12 == r0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x02e9, code lost:
        
            if (r12 == r0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x034e, code lost:
        
            if (r12 == r0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x03b4, code lost:
        
            if (r12 == r0) goto L105;
         */
        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.whoop.domain.model.Logout r11, q83.InterfaceC30057d<? super l83.C23454a0> r12) {
            /*
                Method dump skipped, instruction units count: 1250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i03.C17849b.b.emit(com.whoop.domain.model.Logout, q83.d):java.lang.Object");
        }
    }

    public C17849b(Context context, InterfaceC27837a0 sessionManager, C10920a healthspanWidgetStateWriter) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(sessionManager, "sessionManager");
        AbstractC22676k.m65750j(healthspanWidgetStateWriter, "healthspanWidgetStateWriter");
        this.context = context;
        this.sessionManager = sessionManager;
        this.healthspanWidgetStateWriter = healthspanWidgetStateWriter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m51331c(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f69436y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f69436y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f69434w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f69436y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13087t1 logoutFlow = this.sessionManager.getLogoutFlow();
            b bVar = new b();
            aVar.f69436y = 1;
            if (logoutFlow.collect(bVar, aVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        throw new KotlinNothingValueException();
    }
}
