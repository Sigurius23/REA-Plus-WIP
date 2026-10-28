package cf1;

import a12.AbstractC0142b;
import a12.C0141a;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.exerciseprogressminiarch.domain.GetExerciseProgressRequest;
import com.whoop.exerciseprogressminiarch.domain.models.ExerciseProgressModels;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.C25272z;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
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
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: cf1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lcf1/d;", "Lod1/g;", "Lcf1/b;", "Lcf1/c;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "", "path", "endDate", "", "showLoading", "Lec3/l;", "f", "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;", "b", "Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;", "accumulatedResponse", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4544d implements InterfaceC27844g<AbstractC4542b, C4543c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ExerciseProgressModels accumulatedResponse;

    /* JADX INFO: renamed from: cf1.d$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcf1/d$a;", "", "b", "a", "Lcf1/d$a$a;", "Lcf1/d$a$b;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: cf1.d$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcf1/d$a$a;", "Lcf1/d$a;", "Lcf1/c;", "domainState", "<init>", "(Lcf1/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcf1/c;", "()Lcf1/c;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41344a implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C4543c domainState;

            public C41344a(C4543c domainState) {
                AbstractC22676k.m65750j(domainState, "domainState");
                this.domainState = domainState;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C4543c getDomainState() {
                return this.domainState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41344a) && AbstractC22676k.m65745e(this.domainState, ((C41344a) other).domainState);
            }

            public int hashCode() {
                return this.domainState.hashCode();
            }

            public String toString() {
                return "DataLoaded(domainState=" + this.domainState + ")";
            }
        }

        /* JADX INFO: renamed from: cf1.d$a$b */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcf1/d$a$b;", "Lcf1/d$a;", "Lcf1/b;", "action", "<init>", "(Lcf1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcf1/b;", "()Lcf1/b;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC4542b action;

            public b(AbstractC4542b action) {
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC4542b getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.action, ((b) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "HandleDomainAction(action=" + this.action + ")";
            }
        }
    }

    /* JADX INFO: renamed from: cf1.d$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.domain.ExerciseProgressInteractor$fetchData$$inlined$cacheAPI$1", m100430f = "ExerciseProgressInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f18290w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f18291x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f18292y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f18293z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f18293z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f18293z);
            bVar.f18291x = interfaceC13062m;
            bVar.f18292y = c26832c;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18290w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f18291x;
                C26832c c26832c = (C26832c) this.f18292y;
                InterfaceC26834e interfaceC26834e = this.f18293z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ExerciseProgressModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ExerciseProgressModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f18291x = null;
                this.f18292y = null;
                this.f18290w = 1;
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

    /* JADX INFO: renamed from: cf1.d$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f18294w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f18295x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4544d f18296y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C0141a f18297z;

        /* JADX INFO: renamed from: cf1.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f18298w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f18299x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C4544d f18300y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C0141a f18301z;

            /* JADX INFO: renamed from: cf1.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.domain.ExerciseProgressInteractor$fetchData$$inlined$map$1$2", m100430f = "ExerciseProgressInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41345a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f18302E;

                /* JADX INFO: renamed from: F */
                Object f18303F;

                /* JADX INFO: renamed from: G */
                Object f18304G;

                /* JADX INFO: renamed from: H */
                int f18305H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f18306w;

                /* JADX INFO: renamed from: x */
                int f18307x;

                /* JADX INFO: renamed from: y */
                Object f18308y;

                public C41345a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f18306w = obj;
                    this.f18307x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C4544d c4544d, C0141a c0141a) {
                this.f18298w = interfaceC13062m;
                this.f18299x = z4;
                this.f18300y = c4544d;
                this.f18301z = c0141a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41345a c41345a;
                C4543c c4543c;
                C4543c c4543c2;
                if (interfaceC30057d instanceof C41345a) {
                    c41345a = (C41345a) interfaceC30057d;
                    int i13 = c41345a.f18307x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41345a.f18307x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41345a = new C41345a(interfaceC30057d);
                    }
                } else {
                    c41345a = new C41345a(interfaceC30057d);
                }
                Object obj2 = c41345a.f18306w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41345a.f18307x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f18298w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        if (this.f18299x) {
                            c4543c = new C4543c(InterfaceC4541a.a.f18275a, null, null, 6, null);
                        } else if (this.f18300y.accumulatedResponse != null) {
                            c4543c = new C4543c(null, this.f18300y.accumulatedResponse, null, 5, null);
                        } else {
                            c4543c2 = new C4543c(InterfaceC4541a.a.f18275a, null, null, 6, null);
                            c4543c = c4543c2;
                        }
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a) {
                        InterfaceC29354a.a aVar = (InterfaceC29354a.a) interfaceC29354a;
                        this.f18300y.accumulatedResponse = (ExerciseProgressModels) aVar.getData();
                        c4543c2 = new C4543c(null, this.f18300y.accumulatedResponse, new Integer(((ExerciseProgressModels) aVar.getData()).getSegmentController().getInitialIndex()), 1, null);
                        c4543c = c4543c2;
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c4543c = new C4543c(null, (ExerciseProgressModels) ((InterfaceC29354a.d) interfaceC29354a).getData(), null, 5, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c4543c = new C4543c(new InterfaceC4541a.c(this.f18301z.getPath()), null, null, 6, null);
                    }
                    c41345a.f18308y = null;
                    c41345a.f18302E = null;
                    c41345a.f18303F = null;
                    c41345a.f18304G = null;
                    c41345a.f18305H = 0;
                    c41345a.f18307x = 1;
                    if (interfaceC13062m.emit(c4543c, c41345a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, boolean z4, C4544d c4544d, C0141a c0141a) {
            this.f18294w = interfaceC13058l;
            this.f18295x = z4;
            this.f18296y = c4544d;
            this.f18297z = c0141a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f18294w.collect(new a(interfaceC13062m, this.f18295x, this.f18296y, this.f18297z), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cf1.d$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.domain.ExerciseProgressInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ExerciseProgressInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f18310w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f18311x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f18312y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C4544d f18313z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C4544d c4544d) {
            super(3, interfaceC30057d);
            this.f18313z = c4544d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC4542b abstractC4542b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f18313z);
            dVar.f18311x = interfaceC13062m;
            dVar.f18312y = abstractC4542b;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18310w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f18311x;
                AbstractC4542b abstractC4542b = (AbstractC4542b) this.f18312y;
                if (abstractC4542b instanceof AbstractC4542b.c) {
                    c0456u = new f(C4544d.m14217g(this.f18313z, ((AbstractC4542b.c) abstractC4542b).getPath(), null, true, 2, null));
                } else if (abstractC4542b instanceof AbstractC4542b.a) {
                    AbstractC4542b.a aVar = (AbstractC4542b.a) abstractC4542b;
                    c0456u = new g(this.f18313z.m14216f(aVar.getPath(), aVar.getNewDate(), false));
                } else {
                    if (!(abstractC4542b instanceof AbstractC4542b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0456u = new C0456u(new a.b(abstractC4542b), 1);
                }
                this.f18311x = null;
                this.f18312y = null;
                this.f18310w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC4542b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: cf1.d$e */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.domain.ExerciseProgressInteractor$interact$2", m100430f = "ExerciseProgressInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcf1/c;", "previousState", "Lcf1/d$a;", "internalAction", "<anonymous>", "(Lcf1/c;Lcf1/d$a;)Lcf1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f18314w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f18315x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f18316y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C4543c c4543c, a aVar, InterfaceC30057d<? super C4543c> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f18315x = c4543c;
            eVar.f18316y = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C4543c c4543c = (C4543c) this.f18315x;
            a aVar = (a) this.f18316y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18314w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (aVar instanceof a.b) {
                AbstractC4542b action = ((a.b) aVar).getAction();
                return action instanceof AbstractC4542b.b ? C4543c.m14208b(c4543c, null, null, new Integer(((AbstractC4542b.b) action).getIndex()), 3, null) : c4543c;
            }
            if (!(aVar instanceof a.C41344a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.C41344a c41344a = (a.C41344a) aVar;
            C4543c domainState = c41344a.getDomainState();
            Integer selectedIndex = c4543c.getSelectedIndex();
            if (selectedIndex == null) {
                selectedIndex = c41344a.getDomainState().getSelectedIndex();
            }
            return C4543c.m14208b(domainState, null, null, selectedIndex, 3, null);
        }
    }

    /* JADX INFO: renamed from: cf1.d$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f18317w;

        /* JADX INFO: renamed from: cf1.d$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f18318w;

            /* JADX INFO: renamed from: cf1.d$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.domain.ExerciseProgressInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "ExerciseProgressInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41346a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f18319E;

                /* JADX INFO: renamed from: F */
                Object f18320F;

                /* JADX INFO: renamed from: G */
                Object f18321G;

                /* JADX INFO: renamed from: H */
                int f18322H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f18323w;

                /* JADX INFO: renamed from: x */
                int f18324x;

                /* JADX INFO: renamed from: y */
                Object f18325y;

                public C41346a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f18323w = obj;
                    this.f18324x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f18318w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41346a c41346a;
                if (interfaceC30057d instanceof C41346a) {
                    c41346a = (C41346a) interfaceC30057d;
                    int i13 = c41346a.f18324x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41346a.f18324x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41346a = new C41346a(interfaceC30057d);
                    }
                } else {
                    c41346a = new C41346a(interfaceC30057d);
                }
                Object obj2 = c41346a.f18323w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41346a.f18324x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f18318w;
                    a.C41344a c41344a = new a.C41344a((C4543c) obj);
                    c41346a.f18325y = null;
                    c41346a.f18319E = null;
                    c41346a.f18320F = null;
                    c41346a.f18321G = null;
                    c41346a.f18322H = 0;
                    c41346a.f18324x = 1;
                    if (interfaceC13062m.emit(c41344a, c41346a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f18317w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f18317w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cf1.d$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f18327w;

        /* JADX INFO: renamed from: cf1.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f18328w;

            /* JADX INFO: renamed from: cf1.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.exerciseprogressminiarch.domain.ExerciseProgressInteractor$interact$lambda$0$$inlined$map$2$2", m100430f = "ExerciseProgressInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41347a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f18329E;

                /* JADX INFO: renamed from: F */
                Object f18330F;

                /* JADX INFO: renamed from: G */
                Object f18331G;

                /* JADX INFO: renamed from: H */
                int f18332H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f18333w;

                /* JADX INFO: renamed from: x */
                int f18334x;

                /* JADX INFO: renamed from: y */
                Object f18335y;

                public C41347a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f18333w = obj;
                    this.f18334x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f18328w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41347a c41347a;
                if (interfaceC30057d instanceof C41347a) {
                    c41347a = (C41347a) interfaceC30057d;
                    int i13 = c41347a.f18334x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41347a.f18334x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41347a = new C41347a(interfaceC30057d);
                    }
                } else {
                    c41347a = new C41347a(interfaceC30057d);
                }
                Object obj2 = c41347a.f18333w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41347a.f18334x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f18328w;
                    a.C41344a c41344a = new a.C41344a((C4543c) obj);
                    c41347a.f18335y = null;
                    c41347a.f18329E = null;
                    c41347a.f18330F = null;
                    c41347a.f18331G = null;
                    c41347a.f18332H = 0;
                    c41347a.f18334x = 1;
                    if (interfaceC13062m.emit(c41344a, c41347a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f18327w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f18327w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C4544d(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m14216f(String path, String endDate, boolean showLoading) throws UnsupportedEncodingException {
        C23465k c23465k;
        if (path == null) {
            path = "progression-service/v3/exercise";
        }
        C0141a c0141aM360e = AbstractC0142b.m360e(path);
        if (endDate != null) {
            String strDecode = URLDecoder.decode(endDate, "UTF-8");
            AbstractC22676k.m65749i(strDecode, "decode(...)");
            c23465k = new C23465k("endDate", AbstractC39414r.m125863I0(AbstractC39414r.m125863I0(strDecode, "T"), " "));
        } else {
            c23465k = null;
        }
        return new c(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetExerciseProgressRequest(c0141aM360e.getBasePath(), AbstractC25247g0.m73995d0(c0141aM360e.m354b(), c23465k != null ? AbstractC25247g0.m73989X(c23465k) : C25272z.f99163w)), 1), AbstractC25260n.m74059b1(new String[]{"home", SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE}), null, 2, null), new b(null, this.cachedApiSource)), showLoading, this, c0141aM360e);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC13058l m14217g(C4544d c4544d, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            z4 = true;
        }
        return c4544d.m14216f(str, str2, z4);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C4543c(null, null, null, 7, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new e(null));
    }
}
