package com.whoop.recommendationtile.domain;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: com.whoop.recommendationtile.domain.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"T", "R", "Lec3/l;", "Lkotlin/Function1;", "transform", "b", "(Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;", "recommendation-tile-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9916g {

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileHeaderInteractorKt$flatMapFirst$1", m100430f = "RecommendationTileHeaderInteractor.kt", m100431l = {117}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Ldc3/u;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f29302E;

        /* JADX INFO: renamed from: w */
        Object f29303w;

        /* JADX INFO: renamed from: x */
        int f29304x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f29305y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f29306z;

        /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.g$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41405a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f29307w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC11936u f29308x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Function1 f29309y;

            /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.g$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.recommendationtile.domain.RecommendationTileHeaderInteractorKt$flatMapFirst$1$1$1", m100430f = "RecommendationTileHeaderInteractor.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41406a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f29310w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ Function1 f29311x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ T f29312y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ InterfaceC11936u f29313z;

                /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.g$a$a$a$a, reason: collision with other inner class name */
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41407a<T> implements InterfaceC13062m {

                    /* JADX INFO: renamed from: w */
                    final /* synthetic */ InterfaceC11936u f29314w;

                    public C41407a(InterfaceC11936u interfaceC11936u) {
                        this.f29314w = interfaceC11936u;
                    }

                    @Override // ec3.InterfaceC13062m
                    public final Object emit(R r10, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        Object objMo32219t = ((C11935t) this.f29314w).f39041z.mo32219t(r10, interfaceC30057d);
                        return objMo32219t == EnumC31071a.f128113w ? objMo32219t : C23454a0.f92919a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41406a(Function1 function1, T t14, InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C41406a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f29311x = function1;
                    this.f29312y = t14;
                    this.f29313z = interfaceC11936u;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C41406a(this.f29311x, this.f29312y, this.f29313z, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C41406a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f29310w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13058l interfaceC13058l = (InterfaceC13058l) this.f29311x.invoke(this.f29312y);
                        C41407a c41407a = new C41407a(this.f29313z);
                        this.f29310w = 1;
                        if (interfaceC13058l.collect(c41407a, this) == enumC31071a) {
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

            public C41405a(C22669g0 c22669g0, InterfaceC11936u interfaceC11936u, Function1 function1) {
                this.f29307w = c22669g0;
                this.f29308x = interfaceC11936u;
                this.f29309y = function1;
            }

            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.f29307w.f89336w;
                if (interfaceC3027k1 == null || !interfaceC3027k1.isActive()) {
                    C22669g0 c22669g0 = this.f29307w;
                    InterfaceC11936u interfaceC11936u = this.f29308x;
                    c22669g0.f89336w = AbstractC3006f0.m8732z(interfaceC11936u, null, null, new C41406a(this.f29309y, t14, interfaceC11936u, null), 3);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13058l interfaceC13058l, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29306z = interfaceC13058l;
            this.f29302E = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f29306z, this.f29302E, interfaceC30057d);
            aVar.f29305y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f29305y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29304x;
            if (i13 == 0) {
                C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                InterfaceC13058l interfaceC13058l = this.f29306z;
                C41405a c41405a = new C41405a(c22669g0M32004w, interfaceC11936u, this.f29302E);
                this.f29305y = null;
                this.f29303w = null;
                this.f29304x = 1;
                if (interfaceC13058l.collect(c41405a, this) == enumC31071a) {
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
    public static final <T, R> InterfaceC13058l m24336b(InterfaceC13058l interfaceC13058l, Function1 function1) {
        return AbstractC13091v.m36602l(new a(interfaceC13058l, function1, null));
    }
}
