package u50;

import com.whoop.access.omronauth.domain.GetOmronAuthRequest;
import com.whoop.access.omronauth.domain.models.OmronAuthModel;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;

/* JADX INFO: renamed from: u50.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lu50/c;", "Lod1/g;", "Lu50/a;", "Lu50/b;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "Lec3/l;", "d", "()Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34539c implements InterfaceC27844g<AbstractC34537a, C34538b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: u50.c$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145178w;

        /* JADX INFO: renamed from: u50.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42440a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145179w;

            /* JADX INFO: renamed from: u50.c$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.access.omronauth.domain.OmronAuthInteractor$interact$$inlined$filter$1$2", m100430f = "OmronAuthInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42441a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f145181F;

                /* JADX INFO: renamed from: G */
                Object f145182G;

                /* JADX INFO: renamed from: H */
                int f145183H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145184w;

                /* JADX INFO: renamed from: x */
                int f145185x;

                /* JADX INFO: renamed from: y */
                Object f145186y;

                /* JADX INFO: renamed from: z */
                Object f145187z;

                public C42441a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145184w = obj;
                    this.f145185x |= Integer.MIN_VALUE;
                    return C42440a.this.emit(null, this);
                }
            }

            public C42440a(InterfaceC13062m interfaceC13062m) {
                this.f145179w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42441a c42441a;
                if (interfaceC30057d instanceof C42441a) {
                    c42441a = (C42441a) interfaceC30057d;
                    int i13 = c42441a.f145185x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42441a.f145185x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42441a = new C42441a(interfaceC30057d);
                    }
                } else {
                    c42441a = new C42441a(interfaceC30057d);
                }
                Object obj2 = c42441a.f145184w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42441a.f145185x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f145179w;
                    if (!(((AbstractC34537a) obj) instanceof AbstractC34537a.f)) {
                        c42441a.f145186y = null;
                        c42441a.f145187z = null;
                        c42441a.f145181F = null;
                        c42441a.f145182G = null;
                        c42441a.f145183H = 0;
                        c42441a.f145185x = 1;
                        if (interfaceC13062m.emit(obj, c42441a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l) {
            this.f145178w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145178w.collect(new C42440a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u50.c$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145188w;

        /* JADX INFO: renamed from: u50.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145189w;

            /* JADX INFO: renamed from: u50.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.access.omronauth.domain.OmronAuthInteractor$interact$$inlined$filter$2$2", m100430f = "OmronAuthInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42442a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f145191F;

                /* JADX INFO: renamed from: G */
                Object f145192G;

                /* JADX INFO: renamed from: H */
                int f145193H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145194w;

                /* JADX INFO: renamed from: x */
                int f145195x;

                /* JADX INFO: renamed from: y */
                Object f145196y;

                /* JADX INFO: renamed from: z */
                Object f145197z;

                public C42442a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145194w = obj;
                    this.f145195x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f145189w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42442a c42442a;
                if (interfaceC30057d instanceof C42442a) {
                    c42442a = (C42442a) interfaceC30057d;
                    int i13 = c42442a.f145195x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42442a.f145195x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42442a = new C42442a(interfaceC30057d);
                    }
                } else {
                    c42442a = new C42442a(interfaceC30057d);
                }
                Object obj2 = c42442a.f145194w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42442a.f145195x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f145189w;
                    if (((AbstractC34537a) obj) instanceof AbstractC34537a.f) {
                        c42442a.f145196y = null;
                        c42442a.f145197z = null;
                        c42442a.f145191F = null;
                        c42442a.f145192G = null;
                        c42442a.f145193H = 0;
                        c42442a.f145195x = 1;
                        if (interfaceC13062m.emit(obj, c42442a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l) {
            this.f145188w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145188w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u50.c$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.omronauth.domain.OmronAuthInteractor$interact$$inlined$flatMapLatest$1", m100430f = "OmronAuthInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f145198w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f145199x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f145200y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34539c f145201z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C34539c c34539c) {
            super(3, interfaceC30057d);
            this.f145201z = c34539c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC34537a abstractC34537a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f145201z);
            cVar.f145199x = interfaceC13062m;
            cVar.f145200y = abstractC34537a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C0456u c0456u;
            InterfaceC13058l interfaceC13058lM109143d;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145198w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f145199x;
                AbstractC34537a abstractC34537a = (AbstractC34537a) this.f145200y;
                if (abstractC34537a instanceof AbstractC34537a.e) {
                    interfaceC13058lM109143d = this.f145201z.m109143d();
                } else {
                    if (!(abstractC34537a instanceof AbstractC34537a.d) && (abstractC34537a instanceof AbstractC34537a.c)) {
                        c0456u = new C0456u(((AbstractC34537a.c) abstractC34537a).getSuccess() ? AbstractC34537a.g.f145170a : AbstractC34537a.h.f145171a, 1);
                    } else {
                        c0456u = new C0456u(abstractC34537a, 1);
                    }
                    interfaceC13058lM109143d = c0456u;
                }
                this.f145199x = null;
                this.f145200y = null;
                this.f145198w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM109143d, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC34537a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: u50.c$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.omronauth.domain.OmronAuthInteractor$interact$1", m100430f = "OmronAuthInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lu50/b;", "previous", "Lu50/a;", "action", "<anonymous>", "(Lu50/b;Lu50/a;)Lu50/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f145202w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f145203x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f145204y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C34538b c34538b, AbstractC34537a abstractC34537a, InterfaceC30057d<? super C34538b> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f145203x = c34538b;
            dVar.f145204y = abstractC34537a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C34538b c34538b = (C34538b) this.f145203x;
            AbstractC34537a abstractC34537a = (AbstractC34537a) this.f145204y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f145202w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC34537a instanceof AbstractC34537a.i) {
                return C34538b.m109137b(c34538b, null, InterfaceC34541e.e.f145237a, false, 5, null);
            }
            if (abstractC34537a instanceof AbstractC34537a.a) {
                return C34538b.m109137b(c34538b, ((AbstractC34537a.a) abstractC34537a).getModel(), InterfaceC34541e.c.f145235a, false, 4, null);
            }
            if (abstractC34537a instanceof AbstractC34537a.h) {
                return C34538b.m109137b(c34538b, null, InterfaceC34541e.d.f145236a, false, 5, null);
            }
            if (abstractC34537a instanceof AbstractC34537a.d) {
                return C34538b.m109137b(c34538b, null, InterfaceC34541e.b.f145234a, false, 5, null);
            }
            if (abstractC34537a instanceof AbstractC34537a.b) {
                return C34538b.m109137b(c34538b, null, InterfaceC34541e.b.f145234a, true, 1, null);
            }
            if (abstractC34537a instanceof AbstractC34537a.g) {
                OmronAuthModel model = c34538b.getModel();
                return C34538b.m109137b(c34538b, null, new InterfaceC34541e.a(model != null ? model.getNavigateOnSuccess() : null), false, 1, null);
            }
            if (abstractC34537a instanceof AbstractC34537a.f) {
                if ((c34538b.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String() instanceof InterfaceC34541e.b) && !c34538b.getExchangeInFlight()) {
                    return C34538b.m109137b(c34538b, null, InterfaceC34541e.c.f145235a, false, 5, null);
                }
            } else if (!(abstractC34537a instanceof AbstractC34537a.e) && !(abstractC34537a instanceof AbstractC34537a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return c34538b;
        }
    }

    /* JADX INFO: renamed from: u50.c$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.omronauth.domain.OmronAuthInteractor$loadContent$$inlined$cacheAPI$1", m100430f = "OmronAuthInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f145205w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f145206x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f145207y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f145208z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f145208z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f145208z);
            eVar.f145206x = interfaceC13062m;
            eVar.f145207y = c26832c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145205w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f145206x;
                C26832c c26832c = (C26832c) this.f145207y;
                InterfaceC26834e interfaceC26834e = this.f145208z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(OmronAuthModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(OmronAuthModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f145206x = null;
                this.f145207y = null;
                this.f145205w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: u50.c$f */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145209w;

        /* JADX INFO: renamed from: u50.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145210w;

            /* JADX INFO: renamed from: u50.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.access.omronauth.domain.OmronAuthInteractor$loadContent$$inlined$map$1$2", m100430f = "OmronAuthInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42443a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f145211E;

                /* JADX INFO: renamed from: F */
                Object f145212F;

                /* JADX INFO: renamed from: G */
                Object f145213G;

                /* JADX INFO: renamed from: H */
                int f145214H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145215w;

                /* JADX INFO: renamed from: x */
                int f145216x;

                /* JADX INFO: renamed from: y */
                Object f145217y;

                public C42443a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145215w = obj;
                    this.f145216x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f145210w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42443a c42443a;
                Object obj2;
                AbstractC34537a.a aVar;
                if (interfaceC30057d instanceof C42443a) {
                    c42443a = (C42443a) interfaceC30057d;
                    int i13 = c42443a.f145216x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42443a.f145216x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42443a = new C42443a(interfaceC30057d);
                    }
                } else {
                    c42443a = new C42443a(interfaceC30057d);
                }
                Object obj3 = c42443a.f145215w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42443a.f145216x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    InterfaceC13062m interfaceC13062m = this.f145210w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        obj2 = AbstractC34537a.i.f145172a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            aVar = new AbstractC34537a.a((OmronAuthModel) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            aVar = new AbstractC34537a.a((OmronAuthModel) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            aVar = new AbstractC34537a.a((OmronAuthModel) ((InterfaceC29354a.d) interfaceC29354a).getData());
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj2 = AbstractC34537a.h.f145171a;
                        }
                        obj2 = aVar;
                    }
                    c42443a.f145217y = null;
                    c42443a.f145211E = null;
                    c42443a.f145212F = null;
                    c42443a.f145213G = null;
                    c42443a.f145214H = 0;
                    c42443a.f145216x = 1;
                    if (interfaceC13062m.emit(obj2, c42443a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj3);
                }
                return C23454a0.f92919a;
            }
        }

        public f(InterfaceC13058l interfaceC13058l) {
            this.f145209w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145209w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C34539c(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m109143d() {
        return new f(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetOmronAuthRequest(), 1), AbstractC12350b.m34570S("AccessOmronAuthScope"), null, 2, null), new e(null, this.cachedApiSource)));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C34538b(null, null, false, 7, null), AbstractC13091v.m36584J(AbstractC13091v.m36590P(new a(upstream), new c(null, this)), new b(upstream)), new d(null));
    }
}
