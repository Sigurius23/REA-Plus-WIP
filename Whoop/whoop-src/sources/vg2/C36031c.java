package vg2;

import a12.AbstractC0142b;
import a12.C0141a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.startactivity.targetscard.domain.TargetsCardFetchRequest;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import wm0.C37378a;

/* JADX INFO: renamed from: vg2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lvg2/c;", "Lod1/g;", "Lvg2/a;", "Lvg2/b;", "Lnm0/e;", "cachedApiSource", "Lwm0/a;", "scopeCoordinator", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lwm0/a;Ltr2/n;)V", "", "path", "Lec3/l;", "g", "(Ljava/lang/String;)Lec3/l;", "Lpm0/a;", "Lcom/whoop/design/models/DesignSystemModel;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lpm0/a;)Lvg2/b;", "Lpm0/a$b;", "Lvg2/b$a;", "i", "(Lpm0/a$b;)Lvg2/b$a;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lwm0/a;", "c", "Ltr2/n;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36031c implements InterfaceC27844g<C36029a, AbstractC36030b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vg2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f153665w;

        /* JADX INFO: renamed from: vg2.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42537a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f153666w;

            /* JADX INFO: renamed from: vg2.c$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.startactivity.targetscard.domain.TargetsCardInteractor$fetch$$inlined$filter$1$2", m100430f = "TargetsCardInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42538a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f153668F;

                /* JADX INFO: renamed from: G */
                Object f153669G;

                /* JADX INFO: renamed from: H */
                int f153670H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f153671w;

                /* JADX INFO: renamed from: x */
                int f153672x;

                /* JADX INFO: renamed from: y */
                Object f153673y;

                /* JADX INFO: renamed from: z */
                Object f153674z;

                public C42538a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f153671w = obj;
                    this.f153672x |= Integer.MIN_VALUE;
                    return C42537a.this.emit(null, this);
                }
            }

            public C42537a(InterfaceC13062m interfaceC13062m) {
                this.f153666w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42538a c42538a;
                if (interfaceC30057d instanceof C42538a) {
                    c42538a = (C42538a) interfaceC30057d;
                    int i13 = c42538a.f153672x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42538a.f153672x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42538a = new C42538a(interfaceC30057d);
                    }
                } else {
                    c42538a = new C42538a(interfaceC30057d);
                }
                Object obj2 = c42538a.f153671w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42538a.f153672x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f153666w;
                    if (AbstractC22676k.m65745e((String) obj, SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE)) {
                        c42538a.f153673y = null;
                        c42538a.f153674z = null;
                        c42538a.f153668F = null;
                        c42538a.f153669G = null;
                        c42538a.f153670H = 0;
                        c42538a.f153672x = 1;
                        if (interfaceC13062m.emit(obj, c42538a) == enumC31071a) {
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
            this.f153665w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f153665w.collect(new C42537a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vg2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.targetscard.domain.TargetsCardInteractor$fetch$$inlined$flatMapLatest$1", m100430f = "TargetsCardInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f153675E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C36031c f153676F;

        /* JADX INFO: renamed from: w */
        int f153677w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153678x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153679y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C0141a f153680z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C0141a c0141a, String str, C36031c c36031c) {
            super(3, interfaceC30057d);
            this.f153680z = c0141a;
            this.f153675E = str;
            this.f153676F = c36031c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f153680z, this.f153675E, this.f153676F);
            bVar.f153678x = interfaceC13062m;
            bVar.f153679y = str;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153677w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153678x;
                C13015a0 c13015a0 = new C13015a0(new f(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new TargetsCardFetchRequest(this.f153680z.getBasePath(), this.f153680z.m354b()), 1), null, this.f153675E, 1, null), new e(null, this.f153676F.cachedApiSource)), this.f153676F), this.f153676F.new d(this.f153675E, null));
                this.f153678x = null;
                this.f153679y = null;
                this.f153677w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13015a0, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (String) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vg2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.targetscard.domain.TargetsCardInteractor$fetch$2", m100430f = "TargetsCardInteractor.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f153681w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153682x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f153682x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153682x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153681w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f153682x = null;
                this.f153681w = 1;
                if (interfaceC13062m.emit("", this) == enumC31071a) {
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

    /* JADX INFO: renamed from: vg2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.targetscard.domain.TargetsCardInteractor$fetch$3$2", m100430f = "TargetsCardInteractor.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lvg2/b;", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f153683E;

        /* JADX INFO: renamed from: w */
        int f153684w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153685x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153686y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f153683E = str;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = C36031c.this.new d(this.f153683E, interfaceC30057d);
            dVar.f153685x = interfaceC13062m;
            dVar.f153686y = th3;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153685x;
            Throwable th3 = (Throwable) this.f153686y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153684w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof SerializationException)) {
                    throw th3;
                }
                InterfaceC34116n interfaceC34116n = C36031c.this.logger;
                String simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th3.getClass()).getSimpleName();
                String str = this.f153683E;
                String message = th3.getMessage();
                StringBuilder sbM32001t = AbstractC11895b.m32001t("TargetsCard schema validation failure [", simpleName, "] [", str, "]: ");
                sbM32001t.append(message);
                interfaceC34116n.mo85222m(sbM32001t.toString(), new AbstractC30556a.a[0]);
                AbstractC36030b.a aVar = new AbstractC36030b.a(false);
                this.f153685x = null;
                this.f153686y = null;
                this.f153684w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: vg2.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.targetscard.domain.TargetsCardInteractor$fetch$lambda$1$$inlined$cacheAPI$1", m100430f = "TargetsCardInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153688w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153689x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153690y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f153691z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f153691z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f153691z);
            eVar.f153689x = interfaceC13062m;
            eVar.f153690y = c26832c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153688w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153689x;
                C26832c c26832c = (C26832c) this.f153690y;
                InterfaceC26834e interfaceC26834e = this.f153691z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(DesignSystemModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f153689x = null;
                this.f153690y = null;
                this.f153688w = 1;
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

    /* JADX INFO: renamed from: vg2.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f153692w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36031c f153693x;

        /* JADX INFO: renamed from: vg2.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f153694w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36031c f153695x;

            /* JADX INFO: renamed from: vg2.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.startactivity.targetscard.domain.TargetsCardInteractor$fetch$lambda$1$$inlined$map$1$2", m100430f = "TargetsCardInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42539a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f153696E;

                /* JADX INFO: renamed from: F */
                Object f153697F;

                /* JADX INFO: renamed from: G */
                Object f153698G;

                /* JADX INFO: renamed from: H */
                int f153699H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f153700w;

                /* JADX INFO: renamed from: x */
                int f153701x;

                /* JADX INFO: renamed from: y */
                Object f153702y;

                public C42539a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f153700w = obj;
                    this.f153701x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36031c c36031c) {
                this.f153694w = interfaceC13062m;
                this.f153695x = c36031c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42539a c42539a;
                if (interfaceC30057d instanceof C42539a) {
                    c42539a = (C42539a) interfaceC30057d;
                    int i13 = c42539a.f153701x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42539a.f153701x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42539a = new C42539a(interfaceC30057d);
                    }
                } else {
                    c42539a = new C42539a(interfaceC30057d);
                }
                Object obj2 = c42539a.f153700w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42539a.f153701x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f153694w;
                    AbstractC36030b abstractC36030bM114399h = this.f153695x.m114399h((InterfaceC29354a) obj);
                    c42539a.f153702y = null;
                    c42539a.f153696E = null;
                    c42539a.f153697F = null;
                    c42539a.f153698G = null;
                    c42539a.f153699H = 0;
                    c42539a.f153701x = 1;
                    if (interfaceC13062m.emit(abstractC36030bM114399h, c42539a) == enumC31071a) {
                        return enumC31071a;
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

        public f(InterfaceC13058l interfaceC13058l, C36031c c36031c) {
            this.f153692w = interfaceC13058l;
            this.f153693x = c36031c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f153692w.collect(new a(interfaceC13062m, this.f153693x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vg2.c$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.targetscard.domain.TargetsCardInteractor$interact$$inlined$flatMapLatest$1", m100430f = "TargetsCardInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153704w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153705x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153706y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36031c f153707z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, C36031c c36031c) {
            super(3, interfaceC30057d);
            this.f153707z = c36031c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C36029a c36029a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f153707z);
            gVar.f153705x = interfaceC13062m;
            gVar.f153706y = c36029a;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153704w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153705x;
                InterfaceC13058l interfaceC13058lM114398g = this.f153707z.m114398g(((C36029a) this.f153706y).getPath());
                this.f153705x = null;
                this.f153706y = null;
                this.f153704w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM114398g, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C36029a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C36031c(InterfaceC26834e cachedApiSource, C37378a scopeCoordinator, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.scopeCoordinator = scopeCoordinator;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m114398g(String path) {
        C0141a c0141aM360e = AbstractC0142b.m360e(path);
        return AbstractC13091v.m36590P(new C13015a0(new c(null), new a(this.scopeCoordinator.getScopeUpdateEvents())), new b(null, c0141aM360e, path, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final AbstractC36030b m114399h(InterfaceC29354a<DesignSystemModel> interfaceC29354a) {
        if (interfaceC29354a instanceof InterfaceC29354a.e) {
            return AbstractC36030b.b.f153660a;
        }
        if (interfaceC29354a instanceof InterfaceC29354a.a) {
            return new AbstractC36030b.c((DesignSystemModel) ((InterfaceC29354a.a) interfaceC29354a).getData());
        }
        if (interfaceC29354a instanceof InterfaceC29354a.b) {
            return m114400i((InterfaceC29354a.b) interfaceC29354a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC36030b.a m114400i(InterfaceC29354a.b<DesignSystemModel> bVar) {
        this.logger.mo85222m(AbstractC11266d.m30456j(bVar.getHttpStatusCode(), "TargetsCard fetch failed [", "]: ", bVar.getErrorMessage()), new AbstractC30556a.a[0]);
        return new AbstractC36030b.a(!AbstractC29355b.m89462a(bVar));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new g(null, this));
    }

    public /* synthetic */ C36031c(InterfaceC26834e interfaceC26834e, C37378a c37378a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, c37378a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TargetsCardInteractor") : interfaceC34116n);
    }
}
