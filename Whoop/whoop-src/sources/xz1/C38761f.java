package xz1;

import ao2.C1876a;
import bm.C3383g;
import com.whoop.design.models.items.TagSelectorModel;
import com.whoop.nativestore.home.domain.model.CartIndicator;
import com.whoop.nativestore.pdp.domain.api.PdpApi;
import com.whoop.nativestore.pdp.domain.model.PdpSection;
import com.whoop.nativestore.pdp.domain.model.ProductDescriptionPageResponse;
import com.whoop.nativestore.pdp.domain.model.ProductMetadata;
import com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: xz1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lxz1/f;", "Lod1/g;", "Lxz1/c;", "Lxz1/e;", "Lcom/whoop/nativestore/pdp/domain/api/PdpApi;", "api", "Lao2/a;", "cartIndicatorRepository", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/nativestore/pdp/domain/api/PdpApi;Lao2/a;Ltr2/n;)V", "state", "", "slug", "sku", "source", "g", "(Lxz1/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lxz1/j;", "tap", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lxz1/e;Lxz1/j;)Lxz1/e;", "tagId", "i", "(Lxz1/e;Ljava/lang/String;)Lxz1/e;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/nativestore/pdp/domain/api/PdpApi;", "b", "Lao2/a;", "c", "Ltr2/n;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38761f implements InterfaceC27844g<AbstractC38758c, C38760e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final PdpApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C1876a cartIndicatorRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: xz1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.domain.PdpInteractor", m100430f = "PdpInteractor.kt", m100431l = {61}, m100432m = "fetchAndReduce", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f166819E;

        /* JADX INFO: renamed from: G */
        int f166821G;

        /* JADX INFO: renamed from: w */
        Object f166822w;

        /* JADX INFO: renamed from: x */
        Object f166823x;

        /* JADX INFO: renamed from: y */
        Object f166824y;

        /* JADX INFO: renamed from: z */
        Object f166825z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f166819E = obj;
            this.f166821G |= Integer.MIN_VALUE;
            return C38761f.this.m124258g(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: xz1.f$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.domain.PdpInteractor$fetchAndReduce$response$1", m100430f = "PdpInteractor.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f166826E;

        /* JADX INFO: renamed from: w */
        int f166827w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f166829y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f166830z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f166829y = str;
            this.f166830z = str2;
            this.f166826E = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C38761f.this.new b(this.f166829y, this.f166830z, this.f166826E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f166827w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            PdpApi pdpApi = C38761f.this.api;
            String str = this.f166829y;
            String str2 = this.f166830z;
            String str3 = this.f166826E;
            this.f166827w = 1;
            Object productDescriptionPage = pdpApi.getProductDescriptionPage(str, str2, str3, this);
            return productDescriptionPage == enumC31071a ? enumC31071a : productDescriptionPage;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ProductDescriptionPageResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: xz1.f$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.domain.PdpInteractor$interact$$inlined$flatMapLatest$1", m100430f = "PdpInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f166831w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f166832x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f166833y;

        public c(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC38758c abstractC38758c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f166832x = interfaceC13062m;
            cVar.f166833y = abstractC38758c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C0456u c0456u;
            InterfaceC13058l c3383g;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f166831w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f166832x;
                AbstractC38758c abstractC38758c = (AbstractC38758c) this.f166833y;
                if (abstractC38758c instanceof AbstractC38758c.a) {
                    AbstractC38758c.a aVar = (AbstractC38758c.a) abstractC38758c;
                    c3383g = new C3383g(new AbstractC38762g[]{AbstractC38762g.b.f166841a, new AbstractC38762g.a(aVar.getSlug(), aVar.getSku(), aVar.getSource())}, 3);
                } else {
                    if (abstractC38758c instanceof AbstractC38758c.b) {
                        AbstractC38758c.b bVar = (AbstractC38758c.b) abstractC38758c;
                        c0456u = new C0456u(new AbstractC38762g.c(new C38765j(bVar.getLevel(), bVar.getOptionKey(), bVar.getVariantIndex(), bVar.getPackItemId(), bVar.getPackItemProductKey())), 1);
                    } else {
                        if (!(abstractC38758c instanceof AbstractC38758c.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(new AbstractC38762g.d(((AbstractC38758c.c) abstractC38758c).getTagId()), 1);
                    }
                    c3383g = c0456u;
                }
                this.f166832x = null;
                this.f166833y = null;
                this.f166831w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c3383g, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC38758c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: xz1.f$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.pdp.domain.PdpInteractor$interact$2", m100430f = "PdpInteractor.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lxz1/e;", "state", "Lxz1/g;", "action", "<anonymous>", "(Lxz1/e;Lxz1/g;)Lxz1/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f166834w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f166835x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f166836y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C38760e c38760e, AbstractC38762g abstractC38762g, InterfaceC30057d<? super C38760e> interfaceC30057d) {
            d dVar = C38761f.this.new d(interfaceC30057d);
            dVar.f166835x = c38760e;
            dVar.f166836y = abstractC38762g;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C38760e c38760e = (C38760e) this.f166835x;
            AbstractC38762g abstractC38762g = (AbstractC38762g) this.f166836y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f166834w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC22676k.m65745e(abstractC38762g, AbstractC38762g.b.f166841a)) {
                    return C38760e.m124242b(c38760e, AbstractC38759d.c.f166805a, null, null, null, null, null, null, null, null, null, 1022, null);
                }
                if (!(abstractC38762g instanceof AbstractC38762g.a)) {
                    if (abstractC38762g instanceof AbstractC38762g.c) {
                        return C38761f.this.m124259h(c38760e, ((AbstractC38762g.c) abstractC38762g).getTap());
                    }
                    if (abstractC38762g instanceof AbstractC38762g.d) {
                        return C38761f.this.m124260i(c38760e, ((AbstractC38762g.d) abstractC38762g).getTagId());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C38761f c38761f = C38761f.this;
                AbstractC38762g.a aVar = (AbstractC38762g.a) abstractC38762g;
                String slug = aVar.getSlug();
                String sku = aVar.getSku();
                String source = aVar.getSource();
                this.f166835x = null;
                this.f166836y = null;
                this.f166834w = 1;
                obj = c38761f.m124258g(c38760e, slug, sku, source, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C38760e) obj;
        }
    }

    public C38761f(PdpApi api, C1876a cartIndicatorRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(cartIndicatorRepository, "cartIndicatorRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.cartIndicatorRepository = cartIndicatorRepository;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: g */
    public final Object m124258g(C38760e c38760e, String str, String str2, String str3, InterfaceC30057d<? super C38760e> interfaceC30057d) {
        a aVar;
        C38760e c38760e2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f166821G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f166821G = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f166819E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f166821G;
        String selectedTag = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, str2, str3, null);
            aVar2.f166822w = c38760e;
            aVar2.f166823x = null;
            aVar2.f166824y = null;
            aVar2.f166825z = null;
            aVar2.f166821G = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            c38760e2 = c38760e;
            obj = objM108729b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C38760e c38760e3 = (C38760e) aVar2.f166822w;
            AbstractC34132o.m107864I(obj);
            c38760e2 = c38760e3;
        }
        ProductDescriptionPageResponse productDescriptionPageResponse = (ProductDescriptionPageResponse) AbstractC34386b.m108737b((InterfaceC34385a) obj);
        if (productDescriptionPageResponse == null) {
            return C38760e.m124242b(c38760e2, AbstractC38759d.a.f166803a, null, null, null, null, null, null, null, null, null, 1022, null);
        }
        CartIndicator cart = productDescriptionPageResponse.getCart();
        if (cart != null) {
            this.cartIndicatorRepository.m5654j(cart.getCartIndicatorQuantity(), cart.getDestination());
        }
        C38760e c38760eM124242b = C38760e.m124242b(c38760e2, new AbstractC38759d.b(productDescriptionPageResponse), null, null, null, null, null, null, null, null, null, 1022, null);
        ProductMetadata productMetadata = productDescriptionPageResponse.getProductMetadata();
        if (productMetadata == null) {
            return c38760eM124242b;
        }
        List<PdpSection> sections = productDescriptionPageResponse.getSections();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((PdpSection) it.next()).getItems());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof ProductVariantSelectorModel) {
                arrayList2.add(obj2);
            }
        }
        if (productMetadata.isWhoopYourWay()) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof TagSelectorModel) {
                    arrayList3.add(obj3);
                }
            }
            TagSelectorModel tagSelectorModel = (TagSelectorModel) AbstractC25265s.m74100H0(arrayList3);
            if (tagSelectorModel != null) {
                String defaultTag = tagSelectorModel.getDefaultTag();
                selectedTag = defaultTag == null ? tagSelectorModel.getSelectedTag() : defaultTag;
            }
        }
        return InterfaceC38764i.INSTANCE.m124269c(productMetadata).mo124231b(C38760e.m124242b(c38760eM124242b, null, null, null, null, null, null, null, null, selectedTag, null, 767, null), productMetadata, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C38760e m124259h(C38760e state, C38765j tap) {
        ProductMetadata productMetadata;
        AbstractC38759d state2 = state.getState();
        AbstractC38759d.b bVar = state2 instanceof AbstractC38759d.b ? (AbstractC38759d.b) state2 : null;
        return (bVar == null || (productMetadata = bVar.getResponse().getProductMetadata()) == null) ? state : InterfaceC38764i.INSTANCE.m124269c(productMetadata).mo124230a(state, productMetadata, tap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C38760e m124260i(C38760e state, String tagId) {
        ProductMetadata productMetadata;
        AbstractC38759d state2 = state.getState();
        AbstractC38759d.b bVar = state2 instanceof AbstractC38759d.b ? (AbstractC38759d.b) state2 : null;
        return (bVar == null || (productMetadata = bVar.getResponse().getProductMetadata()) == null) ? state : C38767l.f166860b.m124302r(state, productMetadata, tagId);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new C38760e(null, null, null, null, null, null, null, null, null, null, 1023, null), AbstractC13091v.m36590P(upstream, new c(null)), new d(null)), 1);
    }

    public /* synthetic */ C38761f(PdpApi pdpApi, C1876a c1876a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(pdpApi, c1876a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PdpInteractor") : interfaceC34116n);
    }
}
