package q02;

import a12.AbstractC0142b;
import a12.C0141a;
import c93.InterfaceC4351m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.UnknownDesignModel;
import com.whoop.design.models.items.nestedbff.NestedBFFResponse;
import com.whoop.design.models.items.nestedbff.NestedBFFSection;
import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.nestedbff.domain.NestedBFFFetchRequest;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import iy1.InterfaceC21030c;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jy1.C22047a;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
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
import pm0.AbstractC29355b;
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
import wb3.AbstractC37056f;
import wm0.C37378a;

/* JADX INFO: renamed from: q02.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001*B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020 *\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Lq02/d;", "Lod1/g;", "Lq02/a;", "Lq02/b;", "Lnm0/e;", "cachedApiSource", "Lwm0/a;", "scopeCoordinator", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lwm0/a;Liy1/c;Ltr2/n;)V", "", "path", "Lcom/whoop/navigation/models/GenericHttpMethod;", "method", "", "metadata", "Lec3/l;", "i", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;)Lec3/l;", "Lpm0/a;", "Lcom/whoop/design/models/items/nestedbff/NestedBFFResponse;", "k", "(Lpm0/a;Ljava/lang/String;)Lq02/b;", "response", "Lq02/b$c;", "m", "(Lcom/whoop/design/models/items/nestedbff/NestedBFFResponse;Ljava/lang/String;)Lq02/b$c;", "Lpm0/a$c;", "Lq02/b$a;", "l", "(Lpm0/a$c;)Lq02/b$a;", "Lkotlinx/serialization/SerializationException;", "e", "j", "(Lkotlinx/serialization/SerializationException;)Ljava/lang/String;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lwm0/a;", "c", "Liy1/c;", "d", "Ltr2/n;", "nested-bff-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29750d implements InterfaceC27844g<AbstractC29747a, AbstractC29748b> {

    /* JADX INFO: renamed from: f */
    public static final int f121687f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: q02.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f121692w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Set f121693x;

        /* JADX INFO: renamed from: q02.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f121694w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Set f121695x;

            /* JADX INFO: renamed from: q02.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nestedbff.domain.NestedBFFInteractor$fetch$$inlined$filter$1$2", m100430f = "NestedBFFInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42204a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f121697F;

                /* JADX INFO: renamed from: G */
                Object f121698G;

                /* JADX INFO: renamed from: H */
                int f121699H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f121700w;

                /* JADX INFO: renamed from: x */
                int f121701x;

                /* JADX INFO: renamed from: y */
                Object f121702y;

                /* JADX INFO: renamed from: z */
                Object f121703z;

                public C42204a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f121700w = obj;
                    this.f121701x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, Set set) {
                this.f121694w = interfaceC13062m;
                this.f121695x = set;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42204a c42204a;
                if (interfaceC30057d instanceof C42204a) {
                    c42204a = (C42204a) interfaceC30057d;
                    int i13 = c42204a.f121701x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42204a.f121701x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42204a = new C42204a(interfaceC30057d);
                    }
                } else {
                    c42204a = new C42204a(interfaceC30057d);
                }
                Object obj2 = c42204a.f121700w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42204a.f121701x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f121694w;
                    if (this.f121695x.contains((String) obj)) {
                        c42204a.f121702y = null;
                        c42204a.f121703z = null;
                        c42204a.f121697F = null;
                        c42204a.f121698G = null;
                        c42204a.f121699H = 0;
                        c42204a.f121701x = 1;
                        if (interfaceC13062m.emit(obj, c42204a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, Set set) {
            this.f121692w = interfaceC13058l;
            this.f121693x = set;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f121692w.collect(new a(interfaceC13062m, this.f121693x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q02.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nestedbff.domain.NestedBFFInteractor$fetch$$inlined$flatMapLatest$1", m100430f = "NestedBFFInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ GenericHttpMethod f121704E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Map f121705F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f121706G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C29750d f121707H;

        /* JADX INFO: renamed from: w */
        int f121708w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f121709x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f121710y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C0141a f121711z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C0141a c0141a, GenericHttpMethod genericHttpMethod, Map map, String str, C29750d c29750d) {
            super(3, interfaceC30057d);
            this.f121711z = c0141a;
            this.f121704E = genericHttpMethod;
            this.f121705F = map;
            this.f121706G = str;
            this.f121707H = c29750d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f121711z, this.f121704E, this.f121705F, this.f121706G, this.f121707H);
            cVar.f121709x = interfaceC13062m;
            cVar.f121710y = str;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f121708w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f121709x;
                C13015a0 c13015a0 = new C13015a0(new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new NestedBFFFetchRequest(this.f121711z.getBasePath(), this.f121704E, this.f121705F, this.f121711z.m354b()), 1), null, this.f121706G, 1, null), new f(null, this.f121707H.cachedApiSource)), this.f121707H, this.f121706G), this.f121707H.new e(this.f121706G, this.f121704E, null));
                this.f121709x = null;
                this.f121710y = null;
                this.f121708w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13015a0, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (String) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: q02.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nestedbff.domain.NestedBFFInteractor$fetch$2", m100430f = "NestedBFFInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f121712w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f121713x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f121713x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f121713x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f121712w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f121713x = null;
                this.f121712w = 1;
                if (interfaceC13062m.emit("", this) == enumC31071a) {
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

    /* JADX INFO: renamed from: q02.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nestedbff.domain.NestedBFFInteractor$fetch$3$2", m100430f = "NestedBFFInteractor.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lq02/b;", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f121714E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ GenericHttpMethod f121715F;

        /* JADX INFO: renamed from: w */
        int f121716w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f121717x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f121718y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, GenericHttpMethod genericHttpMethod, InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f121714E = str;
            this.f121715F = genericHttpMethod;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = C29750d.this.new e(this.f121714E, this.f121715F, interfaceC30057d);
            eVar.f121717x = interfaceC13062m;
            eVar.f121718y = th3;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f121717x;
            Throwable th3 = (Throwable) this.f121718y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f121716w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof SerializationException)) {
                    throw th3;
                }
                InterfaceC34116n interfaceC34116n = C29750d.this.logger;
                String simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(th3.getClass()).getSimpleName();
                String str = this.f121714E;
                String message = th3.getMessage();
                StringBuilder sbM32001t = AbstractC11895b.m32001t("NestedBFF schema validation failure [", simpleName, "] [", str, "]: ");
                sbM32001t.append(message);
                interfaceC34116n.mo85222m(sbM32001t.toString(), new AbstractC30556a.a[0]);
                InterfaceC21030c interfaceC21030c = C29750d.this.metricWriter;
                String strM30461o = AbstractC11266d.m30461o("path:", this.f121714E);
                String lowerCase = this.f121715F.name().toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                interfaceC21030c.mo58701b(new C22047a(0, "nested_bff.schema_validation_failure", null, AbstractC37056f.m118959K(strM30461o, "method:".concat(lowerCase), AbstractC11266d.m30461o("error:", C29750d.this.m91215j((SerializationException) th3))), null, 21, null));
                AbstractC29748b.a.b bVar = AbstractC29748b.a.b.f121682a;
                this.f121717x = null;
                this.f121718y = null;
                this.f121716w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: q02.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nestedbff.domain.NestedBFFInteractor$fetch$lambda$1$$inlined$cacheAPI$1", m100430f = "NestedBFFInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f121720w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f121721x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f121722y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f121723z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f121723z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f121723z);
            fVar.f121721x = interfaceC13062m;
            fVar.f121722y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f121720w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f121721x;
                C26832c c26832c = (C26832c) this.f121722y;
                InterfaceC26834e interfaceC26834e = this.f121723z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(NestedBFFResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(NestedBFFResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f121721x = null;
                this.f121722y = null;
                this.f121720w = 1;
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

    /* JADX INFO: renamed from: q02.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f121724w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29750d f121725x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f121726y;

        /* JADX INFO: renamed from: q02.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f121727w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29750d f121728x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f121729y;

            /* JADX INFO: renamed from: q02.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nestedbff.domain.NestedBFFInteractor$fetch$lambda$1$$inlined$map$1$2", m100430f = "NestedBFFInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42205a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f121730E;

                /* JADX INFO: renamed from: F */
                Object f121731F;

                /* JADX INFO: renamed from: G */
                Object f121732G;

                /* JADX INFO: renamed from: H */
                int f121733H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f121734w;

                /* JADX INFO: renamed from: x */
                int f121735x;

                /* JADX INFO: renamed from: y */
                Object f121736y;

                public C42205a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f121734w = obj;
                    this.f121735x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29750d c29750d, String str) {
                this.f121727w = interfaceC13062m;
                this.f121728x = c29750d;
                this.f121729y = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42205a c42205a;
                if (interfaceC30057d instanceof C42205a) {
                    c42205a = (C42205a) interfaceC30057d;
                    int i13 = c42205a.f121735x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42205a.f121735x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42205a = new C42205a(interfaceC30057d);
                    }
                } else {
                    c42205a = new C42205a(interfaceC30057d);
                }
                Object obj2 = c42205a.f121734w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42205a.f121735x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f121727w;
                    AbstractC29748b abstractC29748bM91216k = this.f121728x.m91216k((InterfaceC29354a) obj, this.f121729y);
                    c42205a.f121736y = null;
                    c42205a.f121730E = null;
                    c42205a.f121731F = null;
                    c42205a.f121732G = null;
                    c42205a.f121733H = 0;
                    c42205a.f121735x = 1;
                    if (interfaceC13062m.emit(abstractC29748bM91216k, c42205a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C29750d c29750d, String str) {
            this.f121724w = interfaceC13058l;
            this.f121725x = c29750d;
            this.f121726y = str;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f121724w.collect(new a(interfaceC13062m, this.f121725x, this.f121726y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q02.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nestedbff.domain.NestedBFFInteractor$interact$$inlined$flatMapLatest$1", m100430f = "NestedBFFInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f121738w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f121739x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f121740y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C29750d f121741z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, C29750d c29750d) {
            super(3, interfaceC30057d);
            this.f121741z = c29750d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC29747a abstractC29747a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f121741z);
            hVar.f121739x = interfaceC13062m;
            hVar.f121740y = abstractC29747a;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM91214i;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f121738w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f121739x;
                AbstractC29747a abstractC29747a = (AbstractC29747a) this.f121740y;
                if (abstractC29747a instanceof AbstractC29747a.a) {
                    AbstractC29747a.a aVar = (AbstractC29747a.a) abstractC29747a;
                    interfaceC13058lM91214i = this.f121741z.m91214i(aVar.getPath(), aVar.getMethod(), aVar.m91199a());
                } else {
                    if (!(abstractC29747a instanceof AbstractC29747a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC29747a.b bVar = (AbstractC29747a.b) abstractC29747a;
                    interfaceC13058lM91214i = this.f121741z.m91214i(bVar.getPath(), bVar.getMethod(), bVar.m91202a());
                }
                this.f121739x = null;
                this.f121740y = null;
                this.f121738w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM91214i, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC29747a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C29750d(InterfaceC26834e cachedApiSource, C37378a scopeCoordinator, InterfaceC21030c metricWriter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.scopeCoordinator = scopeCoordinator;
        this.metricWriter = metricWriter;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m91214i(String path, GenericHttpMethod method, Map<String, String> metadata) {
        C37378a.Companion companion = C37378a.INSTANCE;
        Set setM74059b1 = AbstractC25260n.m74059b1(new String[]{companion.m119658a(path), companion.m119658a(null)});
        C0141a c0141aM360e = AbstractC0142b.m360e(path);
        return AbstractC13091v.m36590P(new C13015a0(new d(null), new b(this.scopeCoordinator.getScopeUpdateEvents(), setM74059b1)), new c(null, c0141aM360e, method, metadata, path, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final String m91215j(SerializationException e5) {
        if (e5 instanceof MissingFieldException) {
            return AbstractC11895b.m31996o("Missing field '", AbstractC25265s.m74110N0(((MissingFieldException) e5).f89405w, null, null, null, null, 63), "'");
        }
        String simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(e5.getClass()).getSimpleName();
        return simpleName == null ? "SerializationException" : simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final AbstractC29748b m91216k(InterfaceC29354a<NestedBFFResponse> interfaceC29354a, String str) {
        if (interfaceC29354a instanceof InterfaceC29354a.e) {
            return AbstractC29748b.b.f121683a;
        }
        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
            return m91218m((NestedBFFResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), str);
        }
        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
            return new AbstractC29748b.c(((NestedBFFResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData()).getSections());
        }
        if (interfaceC29354a instanceof InterfaceC29354a.d) {
            return new AbstractC29748b.c(((NestedBFFResponse) ((InterfaceC29354a.d) interfaceC29354a).getData()).getSections());
        }
        if (interfaceC29354a instanceof InterfaceC29354a.c) {
            return m91217l((InterfaceC29354a.c) interfaceC29354a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    private final AbstractC29748b.a m91217l(InterfaceC29354a.c<NestedBFFResponse> cVar) {
        this.logger.mo85222m(AbstractC11266d.m30456j(cVar.getHttpStatusCode(), "NestedBFF fetch failed [", "]: ", cVar.getErrorMessage()), new AbstractC30556a.a[0]);
        return AbstractC29355b.m89462a(cVar) ? AbstractC29748b.a.b.f121682a : AbstractC29748b.a.C42203a.f121681a;
    }

    /* JADX INFO: renamed from: m */
    private final AbstractC29748b.c m91218m(NestedBFFResponse response, String path) {
        List<NestedBFFSection> sections = response.getSections();
        if (!(sections instanceof Collection) || !sections.isEmpty()) {
            Iterator<T> it = sections.iterator();
            loop0: while (it.hasNext()) {
                List<DesignSystemModel> items = ((NestedBFFSection) it.next()).getItems();
                if (!(items instanceof Collection) || !items.isEmpty()) {
                    Iterator<T> it3 = items.iterator();
                    while (it3.hasNext()) {
                        if (((DesignSystemModel) it3.next()) instanceof UnknownDesignModel) {
                            this.metricWriter.mo58701b(new C22047a(0, "nested_bff.mapping_failure", null, AbstractC31061c.m95644t("path:", path), null, 21, null));
                            break loop0;
                        }
                    }
                }
            }
        }
        return new AbstractC29748b.c(response.getSections());
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new h(null, this));
    }

    public /* synthetic */ C29750d(InterfaceC26834e interfaceC26834e, C37378a c37378a, InterfaceC21030c interfaceC21030c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, c37378a, interfaceC21030c, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("NestedBFFInteractor") : interfaceC34116n);
    }
}
