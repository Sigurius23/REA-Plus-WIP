package or2;

import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.InterfaceC1633v0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.C3075y1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: or2.d0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"T", "Landroidx/lifecycle/p0;", "Lq83/j;", "immediateContext", "Lec3/l;", "a", "(Landroidx/lifecycle/p0;Lq83/j;)Lec3/l;", "feature_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28154d0 {

    /* JADX INFO: renamed from: or2.d0$a */
    @InterfaceC32271e(m100429c = "com.whoop.util.FlowLiveDataKt$asFlow$1", m100430f = "FlowLiveData.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER, 27, 28, 30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"T", "Ldc3/u;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC30063j f113838E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ AbstractC1615p0 f113839F;

        /* JADX INFO: renamed from: w */
        Object f113840w;

        /* JADX INFO: renamed from: x */
        Object f113841x;

        /* JADX INFO: renamed from: y */
        int f113842y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f113843z;

        /* JADX INFO: renamed from: or2.d0$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.util.FlowLiveDataKt$asFlow$1$1", m100430f = "FlowLiveData.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42142a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f113844w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC1615p0 f113845x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC1633v0 f113846y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42142a(AbstractC1615p0 abstractC1615p0, InterfaceC1633v0 interfaceC1633v0, InterfaceC30057d<? super C42142a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f113845x = abstractC1615p0;
                this.f113846y = interfaceC1633v0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42142a(this.f113845x, this.f113846y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42142a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f113844w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f113845x.observeForever(this.f113846y);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: or2.d0$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.util.FlowLiveDataKt$asFlow$1$2", m100430f = "FlowLiveData.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f113847w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC1615p0 f113848x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC1633v0 f113849y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC1615p0 abstractC1615p0, InterfaceC1633v0 interfaceC1633v0, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f113848x = abstractC1615p0;
                this.f113849y = interfaceC1633v0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f113848x, this.f113849y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f113847w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f113848x.observeForever(this.f113849y);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: or2.d0$a$c */
        @InterfaceC32271e(m100429c = "com.whoop.util.FlowLiveDataKt$asFlow$1$3", m100430f = "FlowLiveData.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f113850w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC1615p0 f113851x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC1633v0 f113852y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC1615p0 abstractC1615p0, InterfaceC1633v0 interfaceC1633v0, InterfaceC30057d<? super c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f113851x = abstractC1615p0;
                this.f113852y = interfaceC1633v0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new c(this.f113851x, this.f113852y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f113850w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f113851x.removeObserver(this.f113852y);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30063j interfaceC30063j, AbstractC1615p0 abstractC1615p0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113838E = interfaceC30063j;
            this.f113839F = abstractC1615p0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final void m85195h(InterfaceC11936u interfaceC11936u, Object obj) {
            ((C11935t) interfaceC11936u).mo32218s(obj);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f113838E, this.f113839F, interfaceC30057d);
            aVar.f113843z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.v0, dc3.u, java.lang.Object] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC1633v0 interfaceC1633v0;
            ?? r10 = (InterfaceC11936u) this.f113843z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113842y;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C28151c0 c28151c0 = new C28151c0(r10, 0);
                    InterfaceC30063j interfaceC30063j = this.f113838E;
                    C42142a c42142a = new C42142a(this.f113839F, c28151c0, null);
                    this.f113843z = null;
                    this.f113840w = c28151c0;
                    this.f113842y = 1;
                    if (AbstractC3006f0.m8705K(interfaceC30063j, c42142a, this) != enumC31071a) {
                        interfaceC1633v0 = c28151c0;
                    }
                    return enumC31071a;
                }
                if (i13 == 1) {
                    interfaceC1633v0 = (InterfaceC1633v0) this.f113840w;
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            AbstractC34132o.m107864I(obj);
                            throw new KotlinNothingValueException();
                        }
                        if (i13 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th3 = (Throwable) this.f113841x;
                        AbstractC34132o.m107864I(obj);
                        throw th3;
                    }
                    interfaceC1633v0 = (InterfaceC1633v0) this.f113840w;
                    AbstractC34132o.m107864I(obj);
                }
                this.f113843z = null;
                this.f113840w = interfaceC1633v0;
                this.f113842y = 3;
                AbstractC3034m0.m8781a(this);
                return enumC31071a;
                InterfaceC30063j interfaceC30063j2 = this.f113838E;
                b bVar = new b(this.f113839F, interfaceC1633v0, null);
                this.f113843z = null;
                this.f113840w = interfaceC1633v0;
                this.f113842y = 2;
                if (AbstractC3006f0.m8705K(interfaceC30063j2, bVar, this) == enumC31071a) {
                    return enumC31071a;
                }
                this.f113843z = null;
                this.f113840w = interfaceC1633v0;
                this.f113842y = 3;
                AbstractC3034m0.m8781a(this);
                return enumC31071a;
            } catch (Throwable th4) {
                InterfaceC30063j interfaceC30063jPlus = this.f113838E.plus(C3075y1.f12109w);
                c cVar = new c(this.f113839F, r10, null);
                this.f113843z = null;
                this.f113840w = null;
                this.f113841x = th4;
                this.f113842y = 4;
                if (AbstractC3006f0.m8705K(interfaceC30063jPlus, cVar, this) != enumC31071a) {
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC13058l m85193a(AbstractC1615p0 abstractC1615p0, InterfaceC30063j immediateContext) {
        AbstractC22676k.m65750j(abstractC1615p0, "<this>");
        AbstractC22676k.m65750j(immediateContext, "immediateContext");
        return AbstractC13091v.m36599i(AbstractC13091v.m36600j(new a(immediateContext, abstractC1615p0, null)), -1, 2);
    }
}
