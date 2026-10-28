package com.whoop.core.details.activitytargets.domain;

import com.whoop.design.models.DesignSystemModel;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
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
import xv0.AbstractC38668a;

/* JADX INFO: renamed from: com.whoop.core.details.activitytargets.domain.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/core/details/activitytargets/domain/c;", "Lod1/g;", "Lcom/whoop/core/details/activitytargets/domain/a;", "Lcom/whoop/core/details/activitytargets/domain/b;", "Lnm0/e;", "cachedApiSource", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Ltr2/n;)V", "", "path", "Lec3/l;", "f", "(Ljava/lang/String;)Lec3/l;", "Lpm0/a;", "Lcom/whoop/design/models/DesignSystemModel;", "g", "(Lpm0/a;)Lcom/whoop/core/details/activitytargets/domain/b;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Ltr2/n;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6450c implements InterfaceC27844g<InterfaceC6448a, AbstractC6449b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.core.details.activitytargets.domain.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.activitytargets.domain.ActivityDetailsTargetsMiniArchInteractor$fetch$$inlined$cacheAPI$1", m100430f = "ActivityDetailsTargetsMiniArchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f25257w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f25258x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f25259y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f25260z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f25260z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f25260z);
            aVar.f25258x = interfaceC13062m;
            aVar.f25259y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25257w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f25258x;
                C26832c c26832c = (C26832c) this.f25259y;
                InterfaceC26834e interfaceC26834e = this.f25260z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(DesignSystemModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f25258x = null;
                this.f25259y = null;
                this.f25257w = 1;
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

    /* JADX INFO: renamed from: com.whoop.core.details.activitytargets.domain.c$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f25261w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6450c f25262x;

        /* JADX INFO: renamed from: com.whoop.core.details.activitytargets.domain.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f25263w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C6450c f25264x;

            /* JADX INFO: renamed from: com.whoop.core.details.activitytargets.domain.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.activitytargets.domain.ActivityDetailsTargetsMiniArchInteractor$fetch$$inlined$map$1$2", m100430f = "ActivityDetailsTargetsMiniArchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41382a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f25265E;

                /* JADX INFO: renamed from: F */
                Object f25266F;

                /* JADX INFO: renamed from: G */
                Object f25267G;

                /* JADX INFO: renamed from: H */
                int f25268H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f25269w;

                /* JADX INFO: renamed from: x */
                int f25270x;

                /* JADX INFO: renamed from: y */
                Object f25271y;

                public C41382a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f25269w = obj;
                    this.f25270x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C6450c c6450c) {
                this.f25263w = interfaceC13062m;
                this.f25264x = c6450c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41382a c41382a;
                if (interfaceC30057d instanceof C41382a) {
                    c41382a = (C41382a) interfaceC30057d;
                    int i13 = c41382a.f25270x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41382a.f25270x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41382a = new C41382a(interfaceC30057d);
                    }
                } else {
                    c41382a = new C41382a(interfaceC30057d);
                }
                Object obj2 = c41382a.f25269w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41382a.f25270x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f25263w;
                    AbstractC6449b abstractC6449bM19674g = this.f25264x.m19674g((InterfaceC29354a) obj);
                    c41382a.f25271y = null;
                    c41382a.f25265E = null;
                    c41382a.f25266F = null;
                    c41382a.f25267G = null;
                    c41382a.f25268H = 0;
                    c41382a.f25270x = 1;
                    if (interfaceC13062m.emit(abstractC6449bM19674g, c41382a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C6450c c6450c) {
            this.f25261w = interfaceC13058l;
            this.f25262x = c6450c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f25261w.collect(new a(interfaceC13062m, this.f25262x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.activitytargets.domain.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.activitytargets.domain.ActivityDetailsTargetsMiniArchInteractor$fetch$2", m100430f = "ActivityDetailsTargetsMiniArchInteractor.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/core/details/activitytargets/domain/b;", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f25273E;

        /* JADX INFO: renamed from: w */
        int f25274w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f25275x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f25276y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f25273E = str;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = C6450c.this.new c(this.f25273E, interfaceC30057d);
            cVar.f25275x = interfaceC13062m;
            cVar.f25276y = th3;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f25275x;
            Throwable th3 = (Throwable) this.f25276y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25274w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof SerializationException)) {
                    throw th3;
                }
                InterfaceC34116n interfaceC34116n = C6450c.this.logger;
                String simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th3.getClass()).getSimpleName();
                String str = this.f25273E;
                String message = th3.getMessage();
                StringBuilder sbM32001t = AbstractC11895b.m32001t("Activity details targets schema validation failure [", simpleName, "] [", str, "]: ");
                sbM32001t.append(message);
                interfaceC34116n.mo85222m(sbM32001t.toString(), new AbstractC30556a.a[0]);
                AbstractC6449b.a aVar = AbstractC6449b.a.f25252a;
                this.f25275x = null;
                this.f25276y = null;
                this.f25274w = 1;
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

    /* JADX INFO: renamed from: com.whoop.core.details.activitytargets.domain.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.activitytargets.domain.ActivityDetailsTargetsMiniArchInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ActivityDetailsTargetsMiniArchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f25278w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f25279x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f25280y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C6450c f25281z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C6450c c6450c) {
            super(3, interfaceC30057d);
            this.f25281z = c6450c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC6448a interfaceC6448a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f25281z);
            dVar.f25279x = interfaceC13062m;
            dVar.f25280y = interfaceC6448a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25278w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f25279x;
                InterfaceC6448a interfaceC6448a = (InterfaceC6448a) this.f25280y;
                if (!(interfaceC6448a instanceof InterfaceC6448a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM19673f = this.f25281z.m19673f(((InterfaceC6448a.a) interfaceC6448a).getPath());
                this.f25279x = null;
                this.f25280y = null;
                this.f25278w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM19673f, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC6448a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C6450c(InterfaceC26834e cachedApiSource, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m19673f(String path) {
        return new C13015a0(new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(ActivityDetailsTargetsMiniArchFetchRequest.INSTANCE.m19667a(path), 1), null, AbstractC38668a.m124002a(path), 1, null), new a(null, this.cachedApiSource)), this), new c(path, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final AbstractC6449b m19674g(InterfaceC29354a<DesignSystemModel> interfaceC29354a) {
        if (interfaceC29354a instanceof InterfaceC29354a.e) {
            return AbstractC6449b.c.f25254a;
        }
        if (interfaceC29354a instanceof InterfaceC29354a.a) {
            return new AbstractC6449b.b((DesignSystemModel) ((InterfaceC29354a.a) interfaceC29354a).getData());
        }
        if (interfaceC29354a instanceof InterfaceC29354a.d) {
            return new AbstractC6449b.b((DesignSystemModel) ((InterfaceC29354a.d) interfaceC29354a).getData());
        }
        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
        this.logger.mo85222m(AbstractC11266d.m30456j(cVar.getHttpStatusCode(), "Activity details targets fetch failed [", "]: ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
        return AbstractC6449b.a.f25252a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new d(null, this));
    }

    public /* synthetic */ C6450c(InterfaceC26834e interfaceC26834e, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActivityDetailsTargetsMiniArchInteractor") : interfaceC34116n);
    }
}
