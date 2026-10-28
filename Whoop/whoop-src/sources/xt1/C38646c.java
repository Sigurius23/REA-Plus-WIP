package xt1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.labrador.feature.results.domain.LabradorResultsRequest;
import com.whoop.labrador.feature.results.domain.model.LabradorPaginatedGroupModel;
import com.whoop.labrador.feature.results.domain.model.LabradorPaginatedResultModel;
import com.whoop.labrador.feature.results.domain.model.PaginatedLabradorResultsModel;
import com.whoop.navigation.C9598e;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.time.Clock;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
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
import qk1.C30443a;
import qk1.InterfaceC30444b;
import r83.EnumC31071a;
import rk1.EnumC31496c;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import ss1.C32948a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: xt1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J#\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00102\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00104\u001a\n /*\u0004\u0018\u00010.0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, m65681d2 = {"Lxt1/c;", "Lod1/g;", "Lxt1/a;", "Lxt1/b;", "Lnm0/e;", "cachedApiSource", "Lqk1/b;", "localFetcher", "Ljava/time/Clock;", "clock", "Lss1/a;", "analytics", "<init>", "(Lnm0/e;Lqk1/b;Ljava/time/Clock;Lss1/a;)V", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "prev", "next", "j", "(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "", "Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;", "records", "k", "(Ljava/util/List;)Ljava/util/List;", "", "nextToken", "Lec3/l;", "o", "(Ljava/lang/String;)Lec3/l;", "n", "()Lec3/l;", "l", "(Lq83/d;)Ljava/lang/Object;", "Lqk1/a;", "reading", "m", "(Lqk1/a;)Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lqk1/b;", "c", "Lss1/a;", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "d", "Ljava/time/format/DateTimeFormatter;", "timestampPrinter", "e", "yearMonthPrinter", "Lec3/p1;", "f", "Lec3/p1;", "existingState", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38646c implements InterfaceC27844g<InterfaceC38644a, InterfaceC38645b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC30444b localFetcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C32948a analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final DateTimeFormatter timestampPrinter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final DateTimeFormatter yearMonthPrinter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13075p1 existingState;

    /* JADX INFO: renamed from: xt1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.domain.LabradorResultsInteractor", m100430f = "LabradorResultsInteractor.kt", m100431l = {163}, m100432m = "getLocal", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f166220w;

        /* JADX INFO: renamed from: y */
        int f166222y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f166220w = obj;
            this.f166222y |= Integer.MIN_VALUE;
            return C38646c.this.m123866l(this);
        }
    }

    /* JADX INFO: renamed from: xt1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.domain.LabradorResultsInteractor$initialLoad$$inlined$cacheAPI$1", m100430f = "LabradorResultsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f166223w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f166224x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f166225y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f166226z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f166226z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f166226z);
            bVar.f166224x = interfaceC13062m;
            bVar.f166225y = c26832c;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f166223w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f166224x;
                C26832c c26832c = (C26832c) this.f166225y;
                InterfaceC26834e interfaceC26834e = this.f166226z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(PaginatedLabradorResultsModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(PaginatedLabradorResultsModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f166224x = null;
                this.f166225y = null;
                this.f166223w = 1;
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

    /* JADX INFO: renamed from: xt1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f166227w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38646c f166228x;

        /* JADX INFO: renamed from: xt1.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f166229w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38646c f166230x;

            /* JADX INFO: renamed from: xt1.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.domain.LabradorResultsInteractor$initialLoad$$inlined$map$1$2", m100430f = "LabradorResultsInteractor.kt", m100431l = {59, 78, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42664a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f166231E;

                /* JADX INFO: renamed from: F */
                Object f166232F;

                /* JADX INFO: renamed from: G */
                Object f166233G;

                /* JADX INFO: renamed from: H */
                Object f166234H;

                /* JADX INFO: renamed from: I */
                Object f166235I;

                /* JADX INFO: renamed from: J */
                Object f166236J;

                /* JADX INFO: renamed from: K */
                Object f166237K;

                /* JADX INFO: renamed from: L */
                int f166238L;

                /* JADX INFO: renamed from: M */
                int f166239M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f166240w;

                /* JADX INFO: renamed from: x */
                int f166241x;

                /* JADX INFO: renamed from: y */
                Object f166242y;

                public C42664a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f166240w = obj;
                    this.f166241x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C38646c c38646c) {
                this.f166229w = interfaceC13062m;
                this.f166230x = c38646c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x01f7, code lost:
            
                if (r6.emit(r1, r2) == r3) goto L76;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r17, q83.InterfaceC30057d r18) {
                /*
                    Method dump skipped, instruction units count: 515
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: xt1.C38646c.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C38646c c38646c) {
            this.f166227w = interfaceC13058l;
            this.f166228x = c38646c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f166227w.collect(new a(interfaceC13062m, this.f166228x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xt1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.domain.LabradorResultsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "LabradorResultsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f166244w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f166245x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f166246y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C38646c f166247z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C38646c c38646c) {
            super(3, interfaceC30057d);
            this.f166247z = c38646c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC38644a interfaceC38644a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f166247z);
            dVar.f166245x = interfaceC13062m;
            dVar.f166246y = interfaceC38644a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM123869o;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f166244w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f166245x;
                InterfaceC38644a interfaceC38644a = (InterfaceC38644a) this.f166246y;
                if (AbstractC22676k.m65745e(interfaceC38644a, InterfaceC38644a.a.f166205a)) {
                    interfaceC13058lM123869o = this.f166247z.m123868n();
                } else {
                    if (!(interfaceC38644a instanceof InterfaceC38644a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM123869o = this.f166247z.m123869o(((InterfaceC38644a.b) interfaceC38644a).getNextToken());
                }
                this.f166245x = null;
                this.f166246y = null;
                this.f166244w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM123869o, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC38644a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: xt1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f166248w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38646c f166249x;

        /* JADX INFO: renamed from: xt1.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f166250w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38646c f166251x;

            /* JADX INFO: renamed from: xt1.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.domain.LabradorResultsInteractor$interact$$inlined$map$1$2", m100430f = "LabradorResultsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42665a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f166252E;

                /* JADX INFO: renamed from: F */
                Object f166253F;

                /* JADX INFO: renamed from: G */
                Object f166254G;

                /* JADX INFO: renamed from: H */
                int f166255H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f166256w;

                /* JADX INFO: renamed from: x */
                int f166257x;

                /* JADX INFO: renamed from: y */
                Object f166258y;

                public C42665a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f166256w = obj;
                    this.f166257x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C38646c c38646c) {
                this.f166250w = interfaceC13062m;
                this.f166251x = c38646c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42665a c42665a;
                if (interfaceC30057d instanceof C42665a) {
                    c42665a = (C42665a) interfaceC30057d;
                    int i13 = c42665a.f166257x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42665a.f166257x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42665a = new C42665a(interfaceC30057d);
                    }
                } else {
                    c42665a = new C42665a(interfaceC30057d);
                }
                Object obj2 = c42665a.f166256w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42665a.f166257x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f166250w;
                    Object objM123856b = (InterfaceC38645b) obj;
                    if (objM123856b instanceof InterfaceC38645b.a) {
                        objM123856b = ((InterfaceC38645b.a) objM123856b).m123855b((PaginatedLabradorResultsModel) ((C13045h2) this.f166251x.existingState).getValue());
                    } else if (objM123856b instanceof InterfaceC38645b.b) {
                        objM123856b = ((InterfaceC38645b.b) objM123856b).m123856b((PaginatedLabradorResultsModel) ((C13045h2) this.f166251x.existingState).getValue());
                    } else if (!AbstractC22676k.m65745e(objM123856b, InterfaceC38645b.c.f166209a) && !AbstractC22676k.m65745e(objM123856b, InterfaceC38645b.e.f166210a) && !(objM123856b instanceof InterfaceC38645b.f) && !(objM123856b instanceof InterfaceC38645b.g) && !(objM123856b instanceof InterfaceC38645b.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c42665a.f166258y = null;
                    c42665a.f166252E = null;
                    c42665a.f166253F = null;
                    c42665a.f166254G = null;
                    c42665a.f166255H = 0;
                    c42665a.f166257x = 1;
                    if (interfaceC13062m.emit(objM123856b, c42665a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C38646c c38646c) {
            this.f166248w = interfaceC13058l;
            this.f166249x = c38646c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f166248w.collect(new a(interfaceC13062m, this.f166249x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xt1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.domain.LabradorResultsInteractor$loadNext$$inlined$cacheAPI$1", m100430f = "LabradorResultsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f166260w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f166261x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f166262y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f166263z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f166263z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f166263z);
            fVar.f166261x = interfaceC13062m;
            fVar.f166262y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f166260w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f166261x;
                C26832c c26832c = (C26832c) this.f166262y;
                InterfaceC26834e interfaceC26834e = this.f166263z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(PaginatedLabradorResultsModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(PaginatedLabradorResultsModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f166261x = null;
                this.f166262y = null;
                this.f166260w = 1;
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

    /* JADX INFO: renamed from: xt1.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f166264w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38646c f166265x;

        /* JADX INFO: renamed from: xt1.c$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f166266w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38646c f166267x;

            /* JADX INFO: renamed from: xt1.c$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.results.domain.LabradorResultsInteractor$loadNext$$inlined$map$1$2", m100430f = "LabradorResultsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42666a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f166268E;

                /* JADX INFO: renamed from: F */
                Object f166269F;

                /* JADX INFO: renamed from: G */
                Object f166270G;

                /* JADX INFO: renamed from: H */
                int f166271H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f166272w;

                /* JADX INFO: renamed from: x */
                int f166273x;

                /* JADX INFO: renamed from: y */
                Object f166274y;

                public C42666a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f166272w = obj;
                    this.f166273x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C38646c c38646c) {
                this.f166266w = interfaceC13062m;
                this.f166267x = c38646c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42666a c42666a;
                Object bVar;
                C13045h2 c13045h2;
                Object value;
                PaginatedLabradorResultsModel paginatedLabradorResultsModelM123864j;
                if (interfaceC30057d instanceof C42666a) {
                    c42666a = (C42666a) interfaceC30057d;
                    int i13 = c42666a.f166273x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42666a.f166273x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42666a = new C42666a(interfaceC30057d);
                    }
                } else {
                    c42666a = new C42666a(interfaceC30057d);
                }
                Object obj2 = c42666a.f166272w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42666a.f166273x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f166266w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC13075p1 interfaceC13075p1 = this.f166267x.existingState;
                        do {
                            c13045h2 = (C13045h2) interfaceC13075p1;
                            value = c13045h2.getValue();
                            paginatedLabradorResultsModelM123864j = this.f166267x.m123864j((PaginatedLabradorResultsModel) value, (PaginatedLabradorResultsModel) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } while (!c13045h2.m36569i(value, paginatedLabradorResultsModelM123864j));
                        bVar = new InterfaceC38645b.f(paginatedLabradorResultsModelM123864j);
                    } else if ((interfaceC29354a instanceof InterfaceC29354a.e) || (interfaceC29354a instanceof InterfaceC29354a.a.b)) {
                        bVar = new InterfaceC38645b.b((PaginatedLabradorResultsModel) ((C13045h2) this.f166267x.existingState).getValue());
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c) && !(interfaceC29354a instanceof InterfaceC29354a.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = new InterfaceC38645b.a((PaginatedLabradorResultsModel) ((C13045h2) this.f166267x.existingState).getValue());
                    }
                    c42666a.f166274y = null;
                    c42666a.f166268E = null;
                    c42666a.f166269F = null;
                    c42666a.f166270G = null;
                    c42666a.f166271H = 0;
                    c42666a.f166273x = 1;
                    if (interfaceC13062m.emit(bVar, c42666a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C38646c c38646c) {
            this.f166264w = interfaceC13058l;
            this.f166265x = c38646c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f166264w.collect(new a(interfaceC13062m, this.f166265x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C38646c(InterfaceC26834e cachedApiSource, InterfaceC30444b localFetcher, Clock clock, C32948a analytics) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(localFetcher, "localFetcher");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.cachedApiSource = cachedApiSource;
        this.localFetcher = localFetcher;
        this.analytics = analytics;
        this.timestampPrinter = DateTimeFormatter.ofPattern("MMM d, yyyy - hh:mma", Locale.US).withZone(clock.getZone());
        this.yearMonthPrinter = DateTimeFormatter.ofPattern("MMMM yyyy").withZone(clock.getZone());
        this.existingState = AbstractC13091v.m36593c(new PaginatedLabradorResultsModel(null, null, null, 7, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final PaginatedLabradorResultsModel m123864j(PaginatedLabradorResultsModel prev, PaginatedLabradorResultsModel next) {
        if (next.getRecords().isEmpty()) {
            return PaginatedLabradorResultsModel.copy$default(prev, null, null, next.getNextToken(), 3, null);
        }
        List<LabradorPaginatedGroupModel> listM123865k = m123865k(AbstractC25265s.m74129g1(prev.getRecords(), next.getRecords()));
        C9598e learnMoreDestination = next.getLearnMoreDestination();
        if (learnMoreDestination == null) {
            learnMoreDestination = prev.getLearnMoreDestination();
        }
        return new PaginatedLabradorResultsModel(learnMoreDestination, listM123865k, next.getNextToken());
    }

    /* JADX INFO: renamed from: k */
    private final List<LabradorPaginatedGroupModel> m123865k(List<LabradorPaginatedGroupModel> records) {
        LabradorPaginatedGroupModel labradorPaginatedGroupModel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : records) {
            String id4 = ((LabradorPaginatedGroupModel) obj).getId();
            Object arrayList = linkedHashMap.get(id4);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(id4, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            int size = list.size();
            if (size == 0) {
                labradorPaginatedGroupModel = null;
            } else if (size != 1) {
                Iterator it3 = list.iterator();
                if (!it3.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it3.next();
                while (it3.hasNext()) {
                    LabradorPaginatedGroupModel labradorPaginatedGroupModel2 = (LabradorPaginatedGroupModel) next;
                    ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(labradorPaginatedGroupModel2.getItems(), ((LabradorPaginatedGroupModel) it3.next()).getItems());
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayListM74129g1) {
                        if (hashSet.add(((LabradorPaginatedResultModel) obj2).getId())) {
                            arrayList3.add(obj2);
                        }
                    }
                    next = LabradorPaginatedGroupModel.copy$default(labradorPaginatedGroupModel2, null, null, arrayList3, 3, null);
                }
                labradorPaginatedGroupModel = (LabradorPaginatedGroupModel) next;
            } else {
                labradorPaginatedGroupModel = (LabradorPaginatedGroupModel) AbstractC25265s.m74096F0(list);
            }
            if (labradorPaginatedGroupModel != null) {
                arrayList2.add(labradorPaginatedGroupModel);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m123866l(InterfaceC30057d<? super InterfaceC38645b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f166222y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f166222y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo93126b = aVar.f166220w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f166222y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo93126b);
            InterfaceC30444b interfaceC30444b = this.localFetcher;
            aVar.f166222y = 1;
            objMo93126b = interfaceC30444b.mo93126b(aVar);
            if (objMo93126b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo93126b);
        }
        C30443a c30443a = (C30443a) objMo93126b;
        return c30443a == null ? InterfaceC38645b.c.f166209a : new InterfaceC38645b.f(new PaginatedLabradorResultsModel(null, AbstractC37056f.m118958J(m123867m(c30443a)), "", 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final LabradorPaginatedGroupModel m123867m(C30443a reading) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(reading.getTimestamp());
        EnumC31496c enumC31496cM97036a = EnumC31496c.INSTANCE.m97036a(reading.getClassification());
        LabradorPaginatedResultModel labradorPaginatedResultModel = new LabradorPaginatedResultModel(null, reading.getTimestamp(), AbstractC8693b.m21277k(enumC31496cM97036a.getDisplayTitle()), AbstractC8693b.m21278l(this.timestampPrinter.format(instantOfEpochMilli)), enumC31496cM97036a == EnumC31496c.Shepherd, null, 33, null);
        String str = this.yearMonthPrinter.format(instantOfEpochMilli);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(str);
        AbstractC22676k.m65747g(str);
        return new LabradorPaginatedGroupModel(textResourceM21278l, str, AbstractC37056f.m118958J(labradorPaginatedResultModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m123868n() {
        return new c(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new LabradorResultsRequest(null, 1, null), 1), AbstractC12350b.m34570S("labradorrefreshscope"), null, 2, null), new b(null, this.cachedApiSource)), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m123869o(String nextToken) {
        return new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new LabradorResultsRequest(nextToken), 1), null, null, 3, null), new f(null, this.cachedApiSource)), this);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new e(AbstractC13091v.m36590P(upstream, new d(null, this)), this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C38646c(InterfaceC26834e interfaceC26834e, InterfaceC30444b interfaceC30444b, Clock clock, C32948a c32948a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(interfaceC26834e, interfaceC30444b, clock, c32948a);
    }
}
