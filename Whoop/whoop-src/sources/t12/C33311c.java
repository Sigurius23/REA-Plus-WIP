package t12;

import a12.AbstractC0142b;
import a12.C0141a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.onboardingpersonalization.dayzero.header.domain.GetDayZeroHeaderWidgetsRequest;
import com.whoop.onboardingpersonalization.dayzero.header.models.DayZeroHeaderWidgetsModel;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.C25271y;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
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
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: t12.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lt12/c;", "Lod1/g;", "Lt12/a;", "Lt12/b;", "Lnm0/e;", "cachedApiSource", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Ltr2/n;)V", "La12/a;", "parsed", "Lec3/l;", "", "Lcom/whoop/design/models/DesignSystemModel;", "f", "(La12/a;)Lec3/l;", "g", "(Lcom/whoop/design/models/DesignSystemModel;)Ljava/util/List;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Ltr2/n;", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33311c implements InterfaceC27844g<AbstractC33309a, C33310b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: t12.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.dayzero.header.domain.DayZeroHeaderWidgetsInteractor$fetch$$inlined$cacheAPI$1", m100430f = "DayZeroHeaderWidgetsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f138922w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f138923x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f138924y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f138925z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f138925z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f138925z);
            bVar.f138923x = interfaceC13062m;
            bVar.f138924y = c26832c;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f138922w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f138923x;
                C26832c c26832c = (C26832c) this.f138924y;
                InterfaceC26834e interfaceC26834e = this.f138925z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(DesignSystemModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f138923x = null;
                this.f138924y = null;
                this.f138922w = 1;
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

    /* JADX INFO: renamed from: t12.c$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f138926w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33311c f138927x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C0141a f138928y;

        /* JADX INFO: renamed from: t12.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f138929w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33311c f138930x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C0141a f138931y;

            /* JADX INFO: renamed from: t12.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.dayzero.header.domain.DayZeroHeaderWidgetsInteractor$fetch$$inlined$map$1$2", m100430f = "DayZeroHeaderWidgetsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42360a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f138932E;

                /* JADX INFO: renamed from: F */
                Object f138933F;

                /* JADX INFO: renamed from: G */
                Object f138934G;

                /* JADX INFO: renamed from: H */
                int f138935H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f138936w;

                /* JADX INFO: renamed from: x */
                int f138937x;

                /* JADX INFO: renamed from: y */
                Object f138938y;

                public C42360a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f138936w = obj;
                    this.f138937x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33311c c33311c, C0141a c0141a) {
                this.f138929w = interfaceC13062m;
                this.f138930x = c33311c;
                this.f138931y = c0141a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42360a c42360a;
                List listM105686g;
                if (interfaceC30057d instanceof C42360a) {
                    c42360a = (C42360a) interfaceC30057d;
                    int i13 = c42360a.f138937x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42360a.f138937x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42360a = new C42360a(interfaceC30057d);
                    }
                } else {
                    c42360a = new C42360a(interfaceC30057d);
                }
                Object obj2 = c42360a.f138936w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42360a.f138937x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f138929w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        listM105686g = null;
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        listM105686g = this.f138930x.m105686g((DesignSystemModel) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        listM105686g = this.f138930x.m105686g((DesignSystemModel) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                        this.f138930x.logger.mo85214e("DayZeroHeaderWidgets", AbstractC31061c.m95640p("Header fetch failed, serving stale. Path: ", this.f138931y.getPath(), ". ", dVar.getErrorMessage()), new AbstractC30556a.a[0]);
                        listM105686g = this.f138930x.m105686g((DesignSystemModel) dVar.getData());
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC34116n interfaceC34116n = this.f138930x.logger;
                        InterfaceC29354a.c cVar = (InterfaceC29354a.c) interfaceC29354a;
                        int httpStatusCode = cVar.getHttpStatusCode();
                        String path = this.f138931y.getPath();
                        String errorMessage = cVar.getErrorMessage();
                        StringBuilder sbM53373n = AbstractC18489d0.m53373n(httpStatusCode, "Header fetch failed with HTTP ", ". Path: ", path, ". ");
                        sbM53373n.append(errorMessage);
                        interfaceC34116n.mo85214e("DayZeroHeaderWidgets", sbM53373n.toString(), new AbstractC30556a.a[0]);
                        listM105686g = null;
                    }
                    c42360a.f138938y = null;
                    c42360a.f138932E = null;
                    c42360a.f138933F = null;
                    c42360a.f138934G = null;
                    c42360a.f138935H = 0;
                    c42360a.f138937x = 1;
                    if (interfaceC13062m.emit(listM105686g, c42360a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C33311c c33311c, C0141a c0141a) {
            this.f138926w = interfaceC13058l;
            this.f138927x = c33311c;
            this.f138928y = c0141a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f138926w.collect(new a(interfaceC13062m, this.f138927x, this.f138928y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: t12.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.dayzero.header.domain.DayZeroHeaderWidgetsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "DayZeroHeaderWidgetsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f138940w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f138941x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f138942y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C33311c f138943z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C33311c c33311c) {
            super(3, interfaceC30057d);
            this.f138943z = c33311c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC33309a abstractC33309a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f138943z);
            dVar.f138941x = interfaceC13062m;
            dVar.f138942y = abstractC33309a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f138940w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f138941x;
                AbstractC33309a abstractC33309a = (AbstractC33309a) this.f138942y;
                if (!(abstractC33309a instanceof AbstractC33309a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                g gVar = new g(this.f138943z.m105685f(AbstractC0142b.m360e(((AbstractC33309a.a) abstractC33309a).getPath())), abstractC33309a);
                this.f138941x = null;
                this.f138942y = null;
                this.f138940w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, gVar, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC33309a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: t12.c$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f138944w;

        /* JADX INFO: renamed from: t12.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f138945w;

            /* JADX INFO: renamed from: t12.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.dayzero.header.domain.DayZeroHeaderWidgetsInteractor$interact$$inlined$map$1$2", m100430f = "DayZeroHeaderWidgetsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42361a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f138946E;

                /* JADX INFO: renamed from: F */
                Object f138947F;

                /* JADX INFO: renamed from: G */
                Object f138948G;

                /* JADX INFO: renamed from: H */
                int f138949H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f138950w;

                /* JADX INFO: renamed from: x */
                int f138951x;

                /* JADX INFO: renamed from: y */
                Object f138952y;

                public C42361a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f138950w = obj;
                    this.f138951x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f138945w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42361a c42361a;
                if (interfaceC30057d instanceof C42361a) {
                    c42361a = (C42361a) interfaceC30057d;
                    int i13 = c42361a.f138951x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42361a.f138951x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42361a = new C42361a(interfaceC30057d);
                    }
                } else {
                    c42361a = new C42361a(interfaceC30057d);
                }
                Object obj2 = c42361a.f138950w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42361a.f138951x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f138945w;
                    C33310b c33310b = new C33310b(((a) obj).m105687a());
                    c42361a.f138952y = null;
                    c42361a.f138946E = null;
                    c42361a.f138947F = null;
                    c42361a.f138948G = null;
                    c42361a.f138949H = 0;
                    c42361a.f138951x = 1;
                    if (interfaceC13062m.emit(c33310b, c42361a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f138944w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f138944w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: t12.c$f */
    @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.dayzero.header.domain.DayZeroHeaderWidgetsInteractor$interact$2", m100430f = "DayZeroHeaderWidgetsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Lt12/c$a;", "previous", "Ll83/k;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "<destruct>", "<anonymous>", "(Lt12/c$a;Ll83/k;)Lt12/c$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f138954w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f138955x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f138956y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, C23465k c23465k, InterfaceC30057d<? super a> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f138955x = aVar;
            fVar.f138956y = c23465k;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar = (a) this.f138955x;
            C23465k c23465k = (C23465k) this.f138956y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f138954w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String str = (String) c23465k.f92937w;
            List list = (List) c23465k.f92938x;
            if (list != null) {
                return new a(str, list);
            }
            if (AbstractC22676k.m65745e(aVar.getPath(), str)) {
                return aVar;
            }
            return new a(str, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: t12.c$g */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f138957w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC33309a f138958x;

        /* JADX INFO: renamed from: t12.c$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f138959w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC33309a f138960x;

            /* JADX INFO: renamed from: t12.c$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.onboardingpersonalization.dayzero.header.domain.DayZeroHeaderWidgetsInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "DayZeroHeaderWidgetsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42362a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f138961E;

                /* JADX INFO: renamed from: F */
                Object f138962F;

                /* JADX INFO: renamed from: G */
                Object f138963G;

                /* JADX INFO: renamed from: H */
                int f138964H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f138965w;

                /* JADX INFO: renamed from: x */
                int f138966x;

                /* JADX INFO: renamed from: y */
                Object f138967y;

                public C42362a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f138965w = obj;
                    this.f138966x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC33309a abstractC33309a) {
                this.f138959w = interfaceC13062m;
                this.f138960x = abstractC33309a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42362a c42362a;
                if (interfaceC30057d instanceof C42362a) {
                    c42362a = (C42362a) interfaceC30057d;
                    int i13 = c42362a.f138966x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42362a.f138966x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42362a = new C42362a(interfaceC30057d);
                    }
                } else {
                    c42362a = new C42362a(interfaceC30057d);
                }
                Object obj2 = c42362a.f138965w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42362a.f138966x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f138959w;
                    C23465k c23465k = new C23465k(((AbstractC33309a.a) this.f138960x).getPath(), (List) obj);
                    c42362a.f138967y = null;
                    c42362a.f138961E = null;
                    c42362a.f138962F = null;
                    c42362a.f138963G = null;
                    c42362a.f138964H = 0;
                    c42362a.f138966x = 1;
                    if (interfaceC13062m.emit(c23465k, c42362a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, AbstractC33309a abstractC33309a) {
            this.f138957w = interfaceC13058l;
            this.f138958x = abstractC33309a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f138957w.collect(new a(interfaceC13062m, this.f138958x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C33311c(InterfaceC26834e cachedApiSource, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m105685f(C0141a parsed) {
        return new c(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetDayZeroHeaderWidgetsRequest(parsed.getBasePath(), parsed.m354b()), 1), null, null, 3, null), new b(null, this.cachedApiSource)), this, parsed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final List<DesignSystemModel> m105686g(DesignSystemModel designSystemModel) {
        DayZeroHeaderWidgetsModel dayZeroHeaderWidgetsModel = designSystemModel instanceof DayZeroHeaderWidgetsModel ? (DayZeroHeaderWidgetsModel) designSystemModel : null;
        if (dayZeroHeaderWidgetsModel == null) {
            this.logger.mo85214e("DayZeroHeaderWidgets", AbstractC11895b.m31996o("Header response was not a DAY_ZERO_HEADER_WIDGETS envelope but ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(designSystemModel.getClass()).getSimpleName(), ", holding previous header"), new AbstractC30556a.a[0]);
        }
        if (dayZeroHeaderWidgetsModel != null) {
            return dayZeroHeaderWidgetsModel.getItems();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36610t(new e(new C13060l1(new a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), AbstractC13091v.m36590P(upstream, new d(null, this)), new f(null))));
    }

    /* JADX INFO: renamed from: t12.c$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lt12/c$a;", "", "", "path", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<DesignSystemModel> items;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, List<? extends DesignSystemModel> items) {
            AbstractC22676k.m65750j(items, "items");
            this.path = str;
            this.items = items;
        }

        /* JADX INFO: renamed from: a */
        public final List<DesignSystemModel> m105687a() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.path, aVar.path) && AbstractC22676k.m65745e(this.items, aVar.items);
        }

        public int hashCode() {
            String str = this.path;
            return this.items.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC36095b.m114679g("LoadedHeader(path=", this.path, ", items=", ")", this.items);
        }

        public /* synthetic */ a(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? C25271y.f99162w : list);
        }
    }
}
