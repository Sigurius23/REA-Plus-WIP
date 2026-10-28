package fb2;

import c93.InterfaceC4351m;
import com.whoop.whoopaction.domain.models.Action;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fb2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lfb2/b;", "Lod1/g;", "Lfb2/a;", "Lfb2/c;", "Lqw2/c;", "actionInteractor", "Ltr2/n;", "logger", "<init>", "(Lqw2/c;Ltr2/n;)V", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lec3/l;", "e", "(Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;", "Lqw2/b;", "", "f", "(Lqw2/b;)Ljava/util/List;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lqw2/c;", "b", "Ltr2/n;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14338b implements InterfaceC27844g<AbstractC14337a, InterfaceC14339c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fb2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.upsellmodal.UpsellModalInteractor$interact$$inlined$flatMapLatest$1", m100430f = "UpsellModalInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f52362w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f52363x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f52364y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14338b f52365z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C14338b c14338b) {
            super(3, interfaceC30057d);
            this.f52365z = c14338b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC14337a abstractC14337a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f52365z);
            aVar.f52363x = interfaceC13062m;
            aVar.f52364y = abstractC14337a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM40959e;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f52362w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f52363x;
                AbstractC14337a abstractC14337a = (AbstractC14337a) this.f52364y;
                if (abstractC14337a instanceof AbstractC14337a.c) {
                    interfaceC13058lM40959e = new C0456u(new InterfaceC14339c.a(((AbstractC14337a.c) abstractC14337a).getModal()), 1);
                } else if (abstractC14337a instanceof AbstractC14337a.a) {
                    interfaceC13058lM40959e = new C0456u(new InterfaceC14339c.a(null), 1);
                } else {
                    if (!(abstractC14337a instanceof AbstractC14337a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM40959e = this.f52365z.m40959e(((AbstractC14337a.b) abstractC14337a).getAction());
                }
                this.f52363x = null;
                this.f52364y = null;
                this.f52362w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM40959e, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC14337a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: fb2.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.upsellmodal.UpsellModalInteractor$performAction$$inlined$transform$1", m100430f = "UpsellModalInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f52366w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f52367x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f52368y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14338b f52369z;

        /* JADX INFO: renamed from: fb2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f52370w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14338b f52371x;

            /* JADX INFO: renamed from: fb2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.upsellmodal.UpsellModalInteractor$performAction$$inlined$transform$1$1", m100430f = "UpsellModalInteractor.kt", m100431l = {39}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41583a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f52372E;

                /* JADX INFO: renamed from: F */
                Object f52373F;

                /* JADX INFO: renamed from: G */
                Object f52374G;

                /* JADX INFO: renamed from: H */
                Object f52375H;

                /* JADX INFO: renamed from: I */
                Object f52376I;

                /* JADX INFO: renamed from: J */
                Object f52377J;

                /* JADX INFO: renamed from: K */
                Object f52378K;

                /* JADX INFO: renamed from: L */
                int f52379L;

                /* JADX INFO: renamed from: M */
                int f52380M;

                /* JADX INFO: renamed from: N */
                int f52381N;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f52382w;

                /* JADX INFO: renamed from: x */
                int f52383x;

                /* JADX INFO: renamed from: z */
                Object f52385z;

                public C41583a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f52382w = obj;
                    this.f52383x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14338b c14338b) {
                this.f52371x = c14338b;
                this.f52370w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C41583a c41583a;
                Iterator<T> it;
                InterfaceC13062m interfaceC13062m;
                int i13;
                int i14;
                if (interfaceC30057d instanceof C41583a) {
                    c41583a = (C41583a) interfaceC30057d;
                    int i15 = c41583a.f52383x;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c41583a.f52383x = i15 - Integer.MIN_VALUE;
                    } else {
                        c41583a = new C41583a(interfaceC30057d);
                    }
                } else {
                    c41583a = new C41583a(interfaceC30057d);
                }
                Object obj = c41583a.f52382w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i16 = c41583a.f52383x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m2 = this.f52370w;
                    it = this.f52371x.m40960f((AbstractC30694b) t14).iterator();
                    interfaceC13062m = interfaceC13062m2;
                    i13 = 0;
                    i14 = 0;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = c41583a.f52380M;
                    i14 = c41583a.f52379L;
                    it = (Iterator) c41583a.f52376I;
                    interfaceC13062m = (InterfaceC13062m) c41583a.f52374G;
                    AbstractC34132o.m107864I(obj);
                }
                while (it.hasNext()) {
                    InterfaceC14339c interfaceC14339c = (InterfaceC14339c) it.next();
                    c41583a.f52385z = null;
                    c41583a.f52372E = null;
                    c41583a.f52373F = null;
                    c41583a.f52374G = interfaceC13062m;
                    c41583a.f52375H = null;
                    c41583a.f52376I = it;
                    c41583a.f52377J = null;
                    c41583a.f52378K = null;
                    c41583a.f52379L = i14;
                    c41583a.f52380M = i13;
                    c41583a.f52381N = 0;
                    c41583a.f52383x = 1;
                    if (interfaceC13062m.emit(interfaceC14339c, c41583a) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C14338b c14338b) {
            super(2, interfaceC30057d);
            this.f52368y = interfaceC13058l;
            this.f52369z = c14338b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f52368y, interfaceC30057d, this.f52369z);
            bVar.f52367x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f52366w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f52367x;
                InterfaceC13058l interfaceC13058l = this.f52368y;
                a aVar = new a(interfaceC13062m, this.f52369z);
                this.f52367x = null;
                this.f52366w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    public C14338b(C30695c actionInteractor, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(logger, "logger");
        this.actionInteractor = actionInteractor;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m40959e(Action action) {
        return new C13084s1(new b(this.actionInteractor.interact(new C0456u(new C30698f(action), 1)), null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final List<InterfaceC14339c> m40960f(AbstractC30694b abstractC30694b) {
        if ((abstractC30694b instanceof AbstractC30694b.n) || (abstractC30694b instanceof AbstractC30694b.f) || (abstractC30694b instanceof AbstractC30694b.g)) {
            return AbstractC37056f.m118959K(new InterfaceC14339c.a(null), InterfaceC14339c.c.f52390a);
        }
        if (abstractC30694b instanceof AbstractC30694b.d) {
            return AbstractC37056f.m118959K(new InterfaceC14339c.a(null), new InterfaceC14339c.b(((AbstractC30694b.d) abstractC30694b).getDestination()));
        }
        if (abstractC30694b instanceof AbstractC30694b.a) {
            this.logger.mo85222m(AbstractC11266d.m30461o("Upsell modal action failed: ", ((AbstractC30694b.a) abstractC30694b).getMessage()), new AbstractC30556a.a[0]);
            return AbstractC37056f.m118958J(new InterfaceC14339c.a(null));
        }
        if (abstractC30694b instanceof AbstractC30694b.h) {
            this.logger.mo85226q("Upsell modal requested permission " + ((AbstractC30694b.h) abstractC30694b).getPermission() + "; not supported on the settings banner", new AbstractC30556a.a[0]);
            return AbstractC37056f.m118958J(new InterfaceC14339c.a(null));
        }
        if (abstractC30694b instanceof AbstractC30694b.e) {
            this.logger.mo85226q("Upsell modal requested a media pick; not supported on the settings banner", new AbstractC30556a.a[0]);
            return AbstractC37056f.m118958J(new InterfaceC14339c.a(null));
        }
        if ((abstractC30694b instanceof AbstractC30694b.c) || (abstractC30694b instanceof AbstractC30694b.i) || (abstractC30694b instanceof AbstractC30694b.b) || (abstractC30694b instanceof AbstractC30694b.m) || (abstractC30694b instanceof AbstractC30694b.l) || (abstractC30694b instanceof AbstractC30694b.k) || (abstractC30694b instanceof AbstractC30694b.j)) {
            return C25271y.f99162w;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C14338b(C30695c c30695c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c30695c, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UpsellModalInteractor") : interfaceC34116n);
    }
}
