package vk0;

import com.whoop.taskexecutor.TaskInterruptedException;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: vk0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lec3/l;", "Lvk0/k;", "Lvk0/e;", "a", "(Lec3/l;)Lec3/l;", "connectivity-core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36078d {

    /* JADX INFO: renamed from: vk0.d$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f154086w;

        /* JADX INFO: renamed from: vk0.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42546a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f154087w;

            /* JADX INFO: renamed from: vk0.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.BleTaskExtKt$asBleTaskResponse$$inlined$filter$1$2", m100430f = "BleTaskExt.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42547a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f154089F;

                /* JADX INFO: renamed from: G */
                Object f154090G;

                /* JADX INFO: renamed from: H */
                int f154091H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f154092w;

                /* JADX INFO: renamed from: x */
                int f154093x;

                /* JADX INFO: renamed from: y */
                Object f154094y;

                /* JADX INFO: renamed from: z */
                Object f154095z;

                public C42547a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f154092w = obj;
                    this.f154093x |= Integer.MIN_VALUE;
                    return C42546a.this.emit(null, this);
                }
            }

            public C42546a(InterfaceC13062m interfaceC13062m) {
                this.f154087w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42547a c42547a;
                if (interfaceC30057d instanceof C42547a) {
                    c42547a = (C42547a) interfaceC30057d;
                    int i13 = c42547a.f154093x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42547a.f154093x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42547a = new C42547a(interfaceC30057d);
                    }
                } else {
                    c42547a = new C42547a(interfaceC30057d);
                }
                Object obj2 = c42547a.f154092w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42547a.f154093x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f154087w;
                    InterfaceC36085k interfaceC36085k = (InterfaceC36085k) obj;
                    if ((interfaceC36085k instanceof InterfaceC36085k.b) || (interfaceC36085k instanceof InterfaceC36085k.c)) {
                        c42547a.f154094y = null;
                        c42547a.f154095z = null;
                        c42547a.f154089F = null;
                        c42547a.f154090G = null;
                        c42547a.f154091H = 0;
                        c42547a.f154093x = 1;
                        if (interfaceC13062m.emit(obj, c42547a) == enumC31071a) {
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
            this.f154086w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f154086w.collect(new C42546a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vk0.d$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f154096w;

        /* JADX INFO: renamed from: vk0.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f154097w;

            /* JADX INFO: renamed from: vk0.d$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes7.dex */
            @InterfaceC32271e(m100429c = "com.whoop.bleTaskExecutor.BleTaskExtKt$asBleTaskResponse$$inlined$map$1$2", m100430f = "BleTaskExt.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42548a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f154098E;

                /* JADX INFO: renamed from: F */
                Object f154099F;

                /* JADX INFO: renamed from: G */
                Object f154100G;

                /* JADX INFO: renamed from: H */
                int f154101H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f154102w;

                /* JADX INFO: renamed from: x */
                int f154103x;

                /* JADX INFO: renamed from: y */
                Object f154104y;

                public C42548a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f154102w = obj;
                    this.f154103x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f154097w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42548a c42548a;
                if (interfaceC30057d instanceof C42548a) {
                    c42548a = (C42548a) interfaceC30057d;
                    int i13 = c42548a.f154103x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42548a.f154103x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42548a = new C42548a(interfaceC30057d);
                    }
                } else {
                    c42548a = new C42548a(interfaceC30057d);
                }
                Object obj2 = c42548a.f154102w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42548a.f154103x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f154097w;
                    Object bVar = ((InterfaceC36085k) obj) instanceof InterfaceC36085k.b ? new InterfaceC36079e.b(null) : new InterfaceC36079e.a(new TaskInterruptedException(null, 1, null));
                    c42548a.f154104y = null;
                    c42548a.f154098E = null;
                    c42548a.f154099F = null;
                    c42548a.f154100G = null;
                    c42548a.f154101H = 0;
                    c42548a.f154103x = 1;
                    if (interfaceC13062m.emit(bVar, c42548a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f154096w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f154096w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC13058l m114585a(InterfaceC13058l interfaceC13058l) {
        AbstractC22676k.m65750j(interfaceC13058l, "<this>");
        return new b(new a(interfaceC13058l));
    }
}
