package bp2;

import ad3.AbstractC0757c;
import ad3.C0755b;
import ap2.C1882a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.design.models.items.MilestoneAnalytics;
import com.whoop.design.models.items.MilestoneCardModel;
import com.whoop.universalcheckout.features.receipt.domain.GetReceiptRequest;
import com.whoop.universalcheckout.features.receipt.domain.models.ReceiptOrderResponse;
import com.whoop.universalcheckout.features.receipt.domain.models.ReceiptSectionModel;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ep2.InterfaceC13429a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
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
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u82.AbstractC34647h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: bp2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0010*\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lbp2/d;", "Lod1/g;", "Lbp2/b;", "Lbp2/c;", "Lnm0/e;", "cachedApiSource", "Lap2/a;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lap2/a;Ltr2/n;)V", "previousState", "action", "g", "(Lbp2/c;Lbp2/b;)Lbp2/c;", "", "cartId", "source", "", "manualRefresh", "Lec3/l;", "i", "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;", "cacheResult", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lpm0/a$c;Ljava/lang/String;)Lbp2/c;", "l", "(Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;)Ljava/lang/String;", "", "index", "k", "(I)Ljava/lang/String;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lap2/a;", "c", "Ltr2/n;", "d", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3540d implements InterfaceC27844g<AbstractC3538b, C3539c> {

    /* JADX INFO: renamed from: d */
    private static final a f14196d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f14197e = 8;

    /* JADX INFO: renamed from: f */
    private static final List<String> f14198f = AbstractC37056f.m118959K("first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C1882a analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: bp2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lbp2/d$a;", "", "<init>", "()V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: bp2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.domain.ReceiptInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ReceiptInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f14202w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f14203x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f14204y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C3540d f14205z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C3540d c3540d) {
            super(3, interfaceC30057d);
            this.f14205z = c3540d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC3538b abstractC3538b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f14205z);
            bVar.f14203x = interfaceC13062m;
            bVar.f14204y = abstractC3538b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14202w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f14203x;
                AbstractC3538b abstractC3538b = (AbstractC3538b) this.f14204y;
                if (abstractC3538b instanceof AbstractC3538b.b) {
                    AbstractC3538b.b bVar = (AbstractC3538b.b) abstractC3538b;
                    c13084s1 = AbstractC13091v.m36590P(C3540d.m10568j(this.f14205z, bVar.getCartId(), bVar.getSource(), false, 4, null), new f(null, abstractC3538b));
                } else {
                    c13084s1 = new C13084s1(new d(abstractC3538b, null));
                }
                this.f14203x = null;
                this.f14204y = null;
                this.f14202w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC3538b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: bp2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.domain.ReceiptInteractor$interact$1$1$1", m100430f = "ReceiptInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lbp2/e$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14206w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f14207x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C3539c f14208y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC3538b f14209z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3539c c3539c, AbstractC3538b abstractC3538b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14208y = c3539c;
            this.f14209z = abstractC3538b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f14208y, this.f14209z, interfaceC30057d);
            cVar.f14207x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f14207x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14206w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC3541e.a aVar = new AbstractC3541e.a(this.f14208y, ((AbstractC3538b.b) this.f14209z).getSource());
                this.f14207x = null;
                this.f14206w = 1;
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

    /* JADX INFO: renamed from: bp2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.domain.ReceiptInteractor$interact$1$2", m100430f = "ReceiptInteractor.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lbp2/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f14210w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f14211x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC3538b f14212y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC3538b abstractC3538b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14212y = abstractC3538b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f14212y, interfaceC30057d);
            dVar.f14211x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f14211x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14210w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC3541e.b bVar = new AbstractC3541e.b(this.f14212y);
                this.f14211x = null;
                this.f14210w = 1;
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

    /* JADX INFO: renamed from: bp2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.domain.ReceiptInteractor$interact$2", m100430f = "ReceiptInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbp2/c;", "previousState", "Lbp2/e;", "action", "<anonymous>", "(Lbp2/c;Lbp2/e;)Lbp2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f14213w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f14214x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f14215y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3539c c3539c, AbstractC3541e abstractC3541e, InterfaceC30057d<? super C3539c> interfaceC30057d) {
            e eVar = C3540d.this.new e(interfaceC30057d);
            eVar.f14214x = c3539c;
            eVar.f14215y = abstractC3541e;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C3539c c3539c = (C3539c) this.f14214x;
            AbstractC3541e abstractC3541e = (AbstractC3541e) this.f14215y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f14213w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC3541e instanceof AbstractC3541e.b) {
                return C3540d.this.m10565g(c3539c, ((AbstractC3541e.b) abstractC3541e).getDomainAction());
            }
            if (!(abstractC3541e instanceof AbstractC3541e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC3541e.a aVar = (AbstractC3541e.a) abstractC3541e;
            C3539c domainState = aVar.getDomainState();
            String cartId = aVar.getDomainState().getCartId();
            if (cartId.length() <= 0) {
                cartId = null;
            }
            if (cartId == null) {
                cartId = c3539c.getCartId();
            }
            String str = cartId;
            boolean orderDetailsIsExpanded = c3539c.getOrderDetailsIsExpanded();
            String source = aVar.getSource();
            if (source == null) {
                source = c3539c.getSource();
            }
            return C3539c.m10553b(domainState, null, null, false, false, str, orderDetailsIsExpanded, source, null, 143, null);
        }
    }

    /* JADX INFO: renamed from: bp2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.domain.ReceiptInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "ReceiptInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f14217w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f14218x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f14219y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC3538b f14220z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, AbstractC3538b abstractC3538b) {
            super(3, interfaceC30057d);
            this.f14220z = abstractC3538b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C3539c c3539c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f14220z);
            fVar.f14218x = interfaceC13062m;
            fVar.f14219y = c3539c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14217w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f14218x;
                C13084s1 c13084s1 = new C13084s1(new c((C3539c) this.f14219y, this.f14220z, null));
                this.f14218x = null;
                this.f14219y = null;
                this.f14217w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C3539c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: bp2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.domain.ReceiptInteractor$loadReceiptCache$$inlined$cacheAPI$1", m100430f = "ReceiptInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f14221w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f14222x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f14223y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f14224z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f14224z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f14224z);
            gVar.f14222x = interfaceC13062m;
            gVar.f14223y = c26832c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14221w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f14222x;
                C26832c c26832c = (C26832c) this.f14223y;
                InterfaceC26834e interfaceC26834e = this.f14224z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ReceiptOrderResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ReceiptOrderResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f14222x = null;
                this.f14223y = null;
                this.f14221w = 1;
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

    /* JADX INFO: renamed from: bp2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f14225E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f14226w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f14227x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f14228y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C3540d f14229z;

        /* JADX INFO: renamed from: bp2.d$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f14230E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f14231w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f14232x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f14233y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C3540d f14234z;

            /* JADX INFO: renamed from: bp2.d$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.receipt.domain.ReceiptInteractor$loadReceiptCache$$inlined$map$1$2", m100430f = "ReceiptInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41319a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f14235E;

                /* JADX INFO: renamed from: F */
                Object f14236F;

                /* JADX INFO: renamed from: G */
                Object f14237G;

                /* JADX INFO: renamed from: H */
                int f14238H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f14239w;

                /* JADX INFO: renamed from: x */
                int f14240x;

                /* JADX INFO: renamed from: y */
                Object f14241y;

                public C41319a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f14239w = obj;
                    this.f14240x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, String str, C3540d c3540d, String str2) {
                this.f14231w = interfaceC13062m;
                this.f14232x = z4;
                this.f14233y = str;
                this.f14234z = c3540d;
                this.f14230E = str2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41319a c41319a;
                C3539c c3539cM10566h;
                if (interfaceC30057d instanceof C41319a) {
                    c41319a = (C41319a) interfaceC30057d;
                    int i13 = c41319a.f14240x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41319a.f14240x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41319a = new C41319a(interfaceC30057d);
                    }
                } else {
                    c41319a = new C41319a(interfaceC30057d);
                }
                Object obj2 = c41319a.f14239w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41319a.f14240x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f14231w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c3539cM10566h = new C3539c(InterfaceC3537a.b.f14179a, null, false, false, null, false, null, null, 254, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c3539cM10566h = new C3539c(null, (ReceiptOrderResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f14232x, true, this.f14233y, false, null, null, 225, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        C1882a c1882a = this.f14234z.analyticsHelper;
                        String str = this.f14230E;
                        InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                        Map<String, JsonElement> analyticsPayload = ((ReceiptOrderResponse) c42173a.getData()).getAnalyticsPayload();
                        C1882a.m5659b(c1882a, new InterfaceC13429a.o(str, analyticsPayload != null ? AbstractC34647h.m109487b(analyticsPayload) : null, this.f14234z.m10570l((ReceiptOrderResponse) c42173a.getData())), null, 2, null);
                        c3539cM10566h = new C3539c(null, (ReceiptOrderResponse) c42173a.getData(), false, false, this.f14233y, false, null, null, 237, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c3539cM10566h = new C3539c(null, (ReceiptOrderResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), false, false, this.f14233y, false, null, null, 237, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c3539cM10566h = this.f14234z.m10566h((InterfaceC29354a.c) interfaceC29354a, this.f14233y);
                    }
                    c41319a.f14241y = null;
                    c41319a.f14235E = null;
                    c41319a.f14236F = null;
                    c41319a.f14237G = null;
                    c41319a.f14238H = 0;
                    c41319a.f14240x = 1;
                    if (interfaceC13062m.emit(c3539cM10566h, c41319a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l, boolean z4, String str, C3540d c3540d, String str2) {
            this.f14226w = interfaceC13058l;
            this.f14227x = z4;
            this.f14228y = str;
            this.f14229z = c3540d;
            this.f14225E = str2;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f14226w.collect(new a(interfaceC13062m, this.f14227x, this.f14228y, this.f14229z, this.f14225E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C3540d(InterfaceC26834e cachedApiSource, C1882a analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final C3539c m10565g(C3539c previousState, AbstractC3538b action) {
        if (action instanceof AbstractC3538b.d) {
            return C3539c.m10553b(previousState, null, null, false, false, null, !previousState.getOrderDetailsIsExpanded(), null, null, 223, null);
        }
        if (action instanceof AbstractC3538b.c) {
            return C3539c.m10553b(previousState, null, null, false, false, null, false, null, ((AbstractC3538b.c) action).getModal(), 127, null);
        }
        return action instanceof AbstractC3538b.a ? C3539c.m10553b(previousState, null, null, false, false, null, false, null, null, 127, null) : previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C3539c m10566h(InterfaceC29354a.c<ReceiptOrderResponse> cacheResult, String cartId) {
        return AbstractC29355b.m89462a(cacheResult) ? new C3539c(InterfaceC3537a.d.f14181a, null, false, false, cartId, false, null, null, 238, null) : new C3539c(InterfaceC3537a.c.f14180a, null, false, false, cartId, false, null, null, 238, null);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC13058l m10567i(String cartId, String source, boolean manualRefresh) {
        return new h(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetReceiptRequest(cartId), 1), AbstractC12350b.m34570S(SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE), null, 2, null), new g(null, this.cachedApiSource)), manualRefresh, cartId, this, source);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC13058l m10568j(C3540d c3540d, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c3540d.m10567i(str, str2, z4);
    }

    /* JADX INFO: renamed from: k */
    private final String m10569k(int index) {
        List<String> list = f14198f;
        return (index < 0 || index >= list.size()) ? AbstractC2875y.m8295h(index + 1, "position_") : list.get(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final String m10570l(ReceiptOrderResponse receiptOrderResponse) {
        List<ReceiptSectionModel> sections = receiptOrderResponse.getSections();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((ReceiptSectionModel) it.next()).getItems());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof MilestoneCardModel) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            MilestoneAnalytics analytics = ((MilestoneCardModel) it3.next()).getAnalytics();
            String label = analytics != null ? analytics.getLabel() : null;
            if (label != null) {
                arrayList3.add(label);
            }
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        int i13 = 0;
        for (Object obj2 : arrayList3) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList4.add(new C23465k(m10569k(i13), (String) obj2));
            i13 = i14;
        }
        Map mapM74000i0 = AbstractC25247g0.m74000i0(arrayList4);
        try {
            C0755b c0755b = AbstractC0757c.f2762d;
            c0755b.getClass();
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return c0755b.m1833d(new LinkedHashMapSerializer(stringSerializer, stringSerializer), mapM74000i0);
        } catch (SerializationException e5) {
            this.logger.mo85222m("Failed to parse upsell cards: " + e5.getMessage() + ". Body: " + mapM74000i0, new AbstractC30556a.a[0]);
            return null;
        }
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C3539c(InterfaceC3537a.b.f14179a, null, false, false, null, false, null, null, 254, null), AbstractC13091v.m36590P(upstream, new b(null, this)), new e(null));
    }

    public /* synthetic */ C3540d(InterfaceC26834e interfaceC26834e, C1882a c1882a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, c1882a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ReceiptInteractor") : interfaceC34116n);
    }
}
