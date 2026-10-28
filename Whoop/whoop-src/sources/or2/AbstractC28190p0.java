package or2;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.C3022j0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: or2.p0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aB\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lbc3/c0;", "Lq83/d;", "", "block", "a", "(JLc93/m;Lq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28190p0 {

    /* JADX INFO: renamed from: or2.p0$a */
    @InterfaceC32271e(m100429c = "com.whoop.util.KotlinUtilsKt$withMinimumDelayOf$$inlined$withMinimumDelayOf-KLykuaI$1", m100430f = "KotlinUtils.kt", m100431l = {38, 39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"T", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4351m f113921E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ long f113922F;

        /* JADX INFO: renamed from: w */
        Object f113923w;

        /* JADX INFO: renamed from: x */
        Object f113924x;

        /* JADX INFO: renamed from: y */
        int f113925y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f113926z;

        /* JADX INFO: renamed from: or2.p0$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.util.KotlinUtilsKt$withMinimumDelayOf$3$minimumDelay$1", m100430f = "KotlinUtils.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42144a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f113927w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ long f113928x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42144a(long j7, InterfaceC30057d interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f113928x = j7;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42144a(this.f113928x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42144a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f113927w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    long j7 = this.f113928x;
                    this.f113927w = 1;
                    if (AbstractC3034m0.m8783c(j7, this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4351m interfaceC4351m, long j7, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113921E = interfaceC4351m;
            this.f113922F = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f113921E, this.f113922F, interfaceC30057d);
            aVar.f113926z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super T> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3018i0 interfaceC3018i0;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f113926z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113925y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C3022j0 c3022j0M8711e = AbstractC3006f0.m8711e(interfaceC2994c0, null, new C42144a(this.f113922F, null), 3);
                InterfaceC4351m interfaceC4351m = this.f113921E;
                this.f113926z = null;
                this.f113923w = c3022j0M8711e;
                this.f113925y = 1;
                Object objInvoke = interfaceC4351m.invoke(interfaceC2994c0, this);
                if (objInvoke != enumC31071a) {
                    interfaceC3018i0 = c3022j0M8711e;
                    obj = objInvoke;
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.f113924x;
                AbstractC34132o.m107864I(obj);
                return obj2;
            }
            interfaceC3018i0 = (InterfaceC3018i0) this.f113923w;
            AbstractC34132o.m107864I(obj);
            this.f113926z = null;
            this.f113923w = null;
            this.f113924x = obj;
            this.f113925y = 2;
            return interfaceC3018i0.await(this) == enumC31071a ? enumC31071a : obj;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> Object m85321a(long j7, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super T> interfaceC30057d) {
        Duration.Companion companion = Duration.INSTANCE;
        return AbstractC3006f0.m8719m(new a(interfaceC4351m, DurationKt.toDuration(j7, DurationUnit.MILLISECONDS), null), interfaceC30057d);
    }
}
