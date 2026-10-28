package vk0;

import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: vk0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lec3/f2;", "Lvk0/k;", "Lec3/l;", "b", "(Lec3/f2;)Lec3/l;", "Lkotlin/time/Duration;", "a", "J", "DEFAULT_TIMEOUT", "", "c", "(Lvk0/k;)Z", "isInterruptedOrFinished", "connectivity-core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36080f {

    /* JADX INFO: renamed from: a */
    private static final long f154108a;

    /* JADX INFO: renamed from: vk0.f$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f154109w;

        /* JADX INFO: renamed from: vk0.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42549a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f154110w;

            /* JADX INFO: renamed from: vk0.f$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.BleTaskResponseKt$filterHasStarted$$inlined$filter$1$2", m100430f = "BleTaskResponse.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42550a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f154112F;

                /* JADX INFO: renamed from: G */
                Object f154113G;

                /* JADX INFO: renamed from: H */
                int f154114H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f154115w;

                /* JADX INFO: renamed from: x */
                int f154116x;

                /* JADX INFO: renamed from: y */
                Object f154117y;

                /* JADX INFO: renamed from: z */
                Object f154118z;

                public C42550a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f154115w = obj;
                    this.f154116x |= Integer.MIN_VALUE;
                    return C42549a.this.emit(null, this);
                }
            }

            public C42549a(InterfaceC13062m interfaceC13062m) {
                this.f154110w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42550a c42550a;
                if (interfaceC30057d instanceof C42550a) {
                    c42550a = (C42550a) interfaceC30057d;
                    int i13 = c42550a.f154116x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42550a.f154116x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42550a = new C42550a(interfaceC30057d);
                    }
                } else {
                    c42550a = new C42550a(interfaceC30057d);
                }
                Object obj2 = c42550a.f154115w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42550a.f154116x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f154110w;
                    InterfaceC36085k interfaceC36085k = (InterfaceC36085k) obj;
                    if (!AbstractC22676k.m65745e(interfaceC36085k, InterfaceC36085k.a.f154178a) && !AbstractC22676k.m65745e(interfaceC36085k, InterfaceC36085k.b.f154179a)) {
                        c42550a.f154117y = null;
                        c42550a.f154118z = null;
                        c42550a.f154112F = null;
                        c42550a.f154113G = null;
                        c42550a.f154114H = 0;
                        c42550a.f154116x = 1;
                        if (interfaceC13062m.emit(obj, c42550a) == enumC31071a) {
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
            this.f154109w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f154109w.collect(new C42549a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f154108a = DurationKt.toDuration(5, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC13058l m114589b(InterfaceC13037f2 interfaceC13037f2) {
        AbstractC22676k.m65750j(interfaceC13037f2, "<this>");
        return AbstractC13091v.m36610t(new a(interfaceC13037f2));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m114590c(InterfaceC36085k interfaceC36085k) {
        AbstractC22676k.m65750j(interfaceC36085k, "<this>");
        return interfaceC36085k.equals(InterfaceC36085k.c.f154180a) || interfaceC36085k.equals(InterfaceC36085k.b.f154179a);
    }
}
