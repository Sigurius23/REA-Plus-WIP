package gx0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.time.Clock;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u92.C34660d;

/* JADX INFO: renamed from: gx0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lgx0/a;", "", "Lu92/d;", "sharedPrefs", "Ljava/time/Clock;", "clock", "Lbc3/z;", "dispatcher", "<init>", "(Lu92/d;Ljava/time/Clock;Lbc3/z;)V", "", "value", "Ll83/a0;", "c", "(JLq83/d;)Ljava/lang/Object;", "b", "()J", "a", "Lu92/d;", "Ljava/time/Clock;", "Lbc3/z;", "d", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16271a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34660d sharedPrefs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC3076z dispatcher;

    /* JADX INFO: renamed from: gx0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.persistent.DataSyncServicePrefs$saveHighWatermark$2", m100430f = "DataSyncServicePrefs.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f61884w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f61886y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j7, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f61886y = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16271a.this.new b(this.f61886y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f61884w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C16271a.this.sharedPrefs.m109542u("highWaterMarkMillis", this.f61886y);
            return C23454a0.f92919a;
        }
    }

    public C16271a(C34660d sharedPrefs, Clock clock, AbstractC3076z dispatcher) {
        AbstractC22676k.m65750j(sharedPrefs, "sharedPrefs");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        this.sharedPrefs = sharedPrefs;
        this.clock = clock;
        this.dispatcher = dispatcher;
    }

    /* JADX INFO: renamed from: b */
    public final long m46092b() {
        return this.sharedPrefs.m109532i("highWaterMarkMillis", this.clock.millis());
    }

    /* JADX INFO: renamed from: c */
    public final Object m46093c(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcher, new b(j7, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16271a(C34660d c34660d, Clock clock, AbstractC3076z abstractC3076z, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            abstractC3076z = ExecutorC22364d.f87316w;
        }
        this(c34660d, clock, abstractC3076z);
    }
}
