package mk2;

import bc3.AbstractC3034m0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13052j1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: mk2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001ak\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"T", "", "maxAttempts", "", "delayMs", "Lkotlin/Function2;", "Ll83/a0;", "onRetry", "Lkotlin/Function0;", "Lec3/l;", "Lpm0/a;", "fetch", "c", "(IJLc93/m;Lc93/a;)Lec3/l;", "Lpm0/a$c;", "", "b", "(Lpm0/a$c;)Z", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25641h {

    /* JADX INFO: renamed from: mk2.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.SessionTargetsFetcherKt$retryOnTransientError$2", m100430f = "SessionTargetsFetcher.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"T", "Lec3/m;", "Lpm0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100598w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100599x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f100600y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100600y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f100600y, interfaceC30057d);
            aVar.f100599x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100599x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100598w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = (InterfaceC13058l) this.f100600y.invoke();
                this.f100599x = null;
                this.f100598w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058l, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mk2.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.SessionTargetsFetcherKt$retryOnTransientError$3", m100430f = "SessionTargetsFetcher.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"T", "Lpm0/a;", "result", "Ll83/a0;", "<anonymous>", "(Lpm0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100601w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100602x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f100602x = obj;
            return bVar;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws C25658y {
            InterfaceC29354a interfaceC29354a = (InterfaceC29354a) this.f100602x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f100601w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (interfaceC29354a instanceof InterfaceC29354a.c) {
                InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
                if (AbstractC25641h.m75444b(cVar)) {
                    throw new C25658y(cVar);
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC29354a<T> interfaceC29354a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC29354a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: mk2.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.SessionTargetsFetcherKt$retryOnTransientError$4", m100430f = "SessionTargetsFetcher.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, m65681d2 = {"T", "Lec3/m;", "Lpm0/a;", "", "cause", "", "attempt", "", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;J)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f100603E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC4351m f100604F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ long f100605G;

        /* JADX INFO: renamed from: w */
        int f100606w;

        /* JADX INFO: renamed from: x */
        int f100607x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100608y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ long f100609z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i13, InterfaceC4351m interfaceC4351m, long j7, InterfaceC30057d<? super c> interfaceC30057d) {
            super(4, interfaceC30057d);
            this.f100603E = i13;
            this.f100604F = interfaceC4351m;
            this.f100605G = j7;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, long j7, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            c cVar = new c(this.f100603E, this.f100604F, this.f100605G, interfaceC30057d);
            cVar.f100608y = th3;
            cVar.f100609z = j7;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = (Throwable) this.f100608y;
            long j7 = this.f100609z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100607x;
            boolean z4 = true;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                int i14 = ((int) j7) + 1;
                if (!(th3 instanceof C25658y) || i14 >= this.f100603E) {
                    z4 = false;
                } else {
                    this.f100604F.invoke(new Integer(i14), new Integer(((C25658y) th3).m75553a().getHttpStatusCode()));
                    Duration.Companion companion = Duration.INSTANCE;
                    long duration = DurationKt.toDuration(this.f100605G, DurationUnit.MILLISECONDS);
                    this.f100608y = null;
                    this.f100609z = j7;
                    this.f100606w = i14;
                    this.f100607x = 1;
                    if (AbstractC3034m0.m8783c(duration, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return Boolean.valueOf(z4);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((InterfaceC13062m) obj, (Throwable) obj2, ((Number) obj3).longValue(), (InterfaceC30057d<? super Boolean>) obj4);
        }
    }

    /* JADX INFO: renamed from: mk2.h$d */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.SessionTargetsFetcherKt$retryOnTransientError$5", m100430f = "SessionTargetsFetcher.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"T", "Lec3/m;", "Lpm0/a;", "", "cause", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f100610w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100611x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100612y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f100611x = interfaceC13062m;
            dVar.f100612y = th3;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100611x;
            Throwable th3 = (Throwable) this.f100612y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100610w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof C25658y)) {
                    throw th3;
                }
                InterfaceC29354a.c<?> cVarM75553a = ((C25658y) th3).m75553a();
                AbstractC22676k.m65748h(cVarM75553a, "null cannot be cast to non-null type com.whoop.cache.datasource.CacheSourceResult.ErrorNoData<T of com.whoop.trackactivity.domain.SessionTargetsFetcherKt.retryOnTransientError>");
                this.f100611x = null;
                this.f100612y = null;
                this.f100610w = 1;
                if (interfaceC13062m.emit(cVarM75553a, this) == enumC31071a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final boolean m75444b(InterfaceC29354a.c<?> cVar) {
        if (cVar.getHttpStatusCode() == 0) {
            return true;
        }
        int httpStatusCode = cVar.getHttpStatusCode();
        return 500 <= httpStatusCode && httpStatusCode < 600;
    }

    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC13058l m75445c(int i13, long j7, InterfaceC4351m onRetry, InterfaceC4339a fetch) {
        AbstractC22676k.m65750j(onRetry, "onRetry");
        AbstractC22676k.m65750j(fetch, "fetch");
        return new C13015a0(new C13015a0(new C13052j1(new C13084s1(new a(fetch, null)), new b(null), 0), new c(i13, onRetry, j7, null)), new d(null));
    }
}
