package tt0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.C13084s1;
import ec3.C13100y;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.List;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: tt0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"T", "", "other", "", "a", "(Ljava/util/List;Ljava/util/List;)Z", "Lec3/l;", "Lkotlin/time/Duration;", "windowDuration", "c", "(Lec3/l;J)Lec3/l;", "", "", "startIndex", "", "b", "([BI)Ljava/lang/String;", "connectivity-core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34157b {

    /* JADX INFO: renamed from: tt0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityCore.util.ConnUtilKt$throttleFirst$1", m100430f = "ConnUtil.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"T", "Lec3/m;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f143159w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22669g0 f143160x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22669g0 c22669g0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f143160x = c22669g0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return new a(this.f143160x, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f143159w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ((InterfaceC3027k1) this.f143160x.f89336w).cancel((CancellationException) null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tt0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityCore.util.ConnUtilKt$throttleFirst$2$1", m100430f = "ConnUtil.kt", m100431l = {25}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"T", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ long f143161E;

        /* JADX INFO: renamed from: w */
        int f143162w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f143163x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f143164y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22669g0 f143165z;

        /* JADX INFO: renamed from: tt0.b$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.connectivityCore.util.ConnUtilKt$throttleFirst$2$1$1", m100430f = "ConnUtil.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC13062m f143166E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ long f143167F;

            /* JADX INFO: renamed from: w */
            int f143168w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f143169x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13058l f143170y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C22669g0 f143171z;

            /* JADX INFO: renamed from: tt0.b$b$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42415a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ C22669g0 f143172w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ InterfaceC13062m f143173x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ InterfaceC2994c0 f143174y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ long f143175z;

                /* JADX INFO: renamed from: tt0.b$b$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.connectivityCore.util.ConnUtilKt$throttleFirst$2$1$1$1$1", m100430f = "ConnUtil.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
                @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
                public static final class C42416a extends AbstractC32275i implements InterfaceC4351m {

                    /* JADX INFO: renamed from: w */
                    int f143176w;

                    /* JADX INFO: renamed from: x */
                    final /* synthetic */ long f143177x;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C42416a(long j7, InterfaceC30057d<? super C42416a> interfaceC30057d) {
                        super(2, interfaceC30057d);
                        this.f143177x = j7;
                    }

                    @Override // s83.AbstractC32267a
                    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                        return new C42416a(this.f143177x, interfaceC30057d);
                    }

                    @Override // c93.InterfaceC4351m
                    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        return ((C42416a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i13 = this.f143176w;
                        if (i13 == 0) {
                            AbstractC34132o.m107864I(obj);
                            long j7 = this.f143177x;
                            this.f143176w = 1;
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

                /* JADX INFO: renamed from: tt0.b$b$a$a$b, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.connectivityCore.util.ConnUtilKt$throttleFirst$2$1$1$1", m100430f = "ConnUtil.kt", m100431l = {28}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42417b extends AbstractC32269c {

                    /* JADX INFO: renamed from: w */
                    Object f143178w;

                    /* JADX INFO: renamed from: x */
                    /* synthetic */ Object f143179x;

                    /* JADX INFO: renamed from: y */
                    final /* synthetic */ C42415a<T> f143180y;

                    /* JADX INFO: renamed from: z */
                    int f143181z;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C42417b(C42415a<? super T> c42415a, InterfaceC30057d<? super C42417b> interfaceC30057d) {
                        super(interfaceC30057d);
                        this.f143180y = c42415a;
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f143179x = obj;
                        this.f143181z |= Integer.MIN_VALUE;
                        return this.f143180y.emit(null, this);
                    }
                }

                public C42415a(C22669g0 c22669g0, InterfaceC13062m interfaceC13062m, InterfaceC2994c0 interfaceC2994c0, long j7) {
                    this.f143172w = c22669g0;
                    this.f143173x = interfaceC13062m;
                    this.f143174y = interfaceC2994c0;
                    this.f143175z = j7;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    C42417b c42417b;
                    if (interfaceC30057d instanceof C42417b) {
                        c42417b = (C42417b) interfaceC30057d;
                        int i13 = c42417b.f143181z;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42417b.f143181z = i13 - Integer.MIN_VALUE;
                        } else {
                            c42417b = new C42417b(this, interfaceC30057d);
                        }
                    } else {
                        c42417b = new C42417b(this, interfaceC30057d);
                    }
                    Object obj = c42417b.f143179x;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42417b.f143181z;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj);
                        if (!((InterfaceC3027k1) this.f143172w.f89336w).isActive()) {
                            InterfaceC13062m interfaceC13062m = this.f143173x;
                            c42417b.f143178w = null;
                            c42417b.f143181z = 1;
                            if (interfaceC13062m.emit(t14, c42417b) == enumC31071a) {
                                return enumC31071a;
                            }
                        }
                        return C23454a0.f92919a;
                    }
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    this.f143172w.f89336w = AbstractC3006f0.m8732z(this.f143174y, null, null, new C42416a(this.f143175z, null), 3);
                    return C23454a0.f92919a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13058l interfaceC13058l, C22669g0 c22669g0, InterfaceC13062m interfaceC13062m, long j7, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f143170y = interfaceC13058l;
                this.f143171z = c22669g0;
                this.f143166E = interfaceC13062m;
                this.f143167F = j7;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f143170y, this.f143171z, this.f143166E, this.f143167F, interfaceC30057d);
                aVar.f143169x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f143169x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f143168w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13058l interfaceC13058l = this.f143170y;
                    C42415a c42415a = new C42415a(this.f143171z, this.f143166E, interfaceC2994c0, this.f143167F);
                    this.f143169x = null;
                    this.f143168w = 1;
                    if (interfaceC13058l.collect(c42415a, this) == enumC31071a) {
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
        public b(InterfaceC13058l interfaceC13058l, C22669g0 c22669g0, long j7, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f143164y = interfaceC13058l;
            this.f143165z = c22669g0;
            this.f143161E = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f143164y, this.f143165z, this.f143161E, interfaceC30057d);
            bVar.f143163x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f143163x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143162w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                a aVar = new a(this.f143164y, this.f143165z, interfaceC13062m, this.f143161E, null);
                this.f143163x = null;
                this.f143162w = 1;
                if (AbstractC3006f0.m8719m(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: a */
    public static final <T> boolean m107934a(List<? extends T> list, List<? extends T> other) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(other, "other");
        return list.size() == other.size() && AbstractC25265s.m74103I1(list).equals(AbstractC25265s.m74103I1(other));
    }

    /* JADX INFO: renamed from: b */
    public static final String m107935b(byte[] bArr, int i13) {
        AbstractC22676k.m65750j(bArr, "<this>");
        int length = bArr.length;
        int length2 = bArr.length;
        for (int i14 = i13; i14 < length2; i14++) {
            if (bArr[i14] == 0) {
                length = i14;
                break;
            }
        }
        return new String(bArr, i13, length - i13, AbstractC39397a.f169546a);
    }

    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC13058l m107936c(InterfaceC13058l throttleFirst, long j7) {
        AbstractC22676k.m65750j(throttleFirst, "$this$throttleFirst");
        C22669g0 c22669g0 = new C22669g0();
        C3031l1 c3031l1M8709c = AbstractC3006f0.m8709c();
        c3031l1M8709c.complete();
        c22669g0.f89336w = c3031l1M8709c;
        return new C13084s1(new b(new C13100y(throttleFirst, new a(c22669g0, null)), c22669g0, j7, null));
    }
}
