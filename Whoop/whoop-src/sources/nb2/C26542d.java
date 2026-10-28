package nb2;

import bm.C3383g;
import com.whoop.settings.gifthub.api.GiftHubApi;
import com.whoop.settings.gifthub.domain.models.GiftHubResponse;
import com.whoop.settings.gifthub.domain.models.GiftHubResponseKt;
import com.whoop.settings.gifthub.domain.models.GiftHubStyle;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import lb2.AbstractC23754a;
import lb2.C23755b;
import od1.InterfaceC27844g;
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

/* JADX INFO: renamed from: nb2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lnb2/d;", "Lod1/g;", "Lnb2/a;", "Lnb2/c;", "Lcom/whoop/settings/gifthub/api/GiftHubApi;", "api", "Llb2/b;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/settings/gifthub/api/GiftHubApi;Llb2/b;Ltr2/n;)V", "Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;", "g", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/settings/gifthub/domain/models/GiftHubStyle;)Ljava/lang/String;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/settings/gifthub/api/GiftHubApi;", "b", "Llb2/b;", "c", "Ltr2/n;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26542d implements InterfaceC27844g<AbstractC26539a, C26541c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final GiftHubApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C23755b analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: nb2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f105492a;

        static {
            int[] iArr = new int[GiftHubStyle.values().length];
            try {
                iArr[GiftHubStyle.HOLIDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftHubStyle.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f105492a = iArr;
        }
    }

    /* JADX INFO: renamed from: nb2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.gifthub.domain.GiftHubInteractor", m100430f = "GiftHubInteractor.kt", m100431l = {53}, m100432m = "fetchGiftHub", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f105493w;

        /* JADX INFO: renamed from: y */
        int f105495y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f105493w = obj;
            this.f105495y |= Integer.MIN_VALUE;
            return C26542d.this.m78648g(this);
        }
    }

    /* JADX INFO: renamed from: nb2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.gifthub.domain.GiftHubInteractor$fetchGiftHub$response$1", m100430f = "GiftHubInteractor.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/settings/gifthub/domain/models/GiftHubResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f105496w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C26542d.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105496w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            GiftHubApi giftHubApi = C26542d.this.api;
            this.f105496w = 1;
            Object objFetchGiftHub = giftHubApi.fetchGiftHub(this);
            return objFetchGiftHub == enumC31071a ? enumC31071a : objFetchGiftHub;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super GiftHubResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: nb2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.gifthub.domain.GiftHubInteractor$interact$$inlined$flatMapLatest$1", m100430f = "GiftHubInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105498w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f105499x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105500y;

        public d(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC26539a abstractC26539a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f105499x = interfaceC13062m;
            dVar.f105500y = abstractC26539a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105498w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f105499x;
                AbstractC26539a abstractC26539a = (AbstractC26539a) this.f105500y;
                if (!(abstractC26539a instanceof AbstractC26539a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C3383g c3383g = new C3383g(new AbstractC26543e[]{AbstractC26543e.b.f105506a, new AbstractC26543e.a(((AbstractC26539a.a) abstractC26539a).getSource())}, 3);
                this.f105499x = null;
                this.f105500y = null;
                this.f105498w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC26539a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: nb2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.gifthub.domain.GiftHubInteractor$interact$2", m100430f = "GiftHubInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lnb2/c;", "internalState", "Lnb2/e;", "action", "<anonymous>", "(Lnb2/c;Lnb2/e;)Lnb2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105501w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f105502x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105503y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C26541c c26541c, AbstractC26543e abstractC26543e, InterfaceC30057d<? super C26541c> interfaceC30057d) {
            e eVar = C26542d.this.new e(interfaceC30057d);
            eVar.f105502x = c26541c;
            eVar.f105503y = abstractC26543e;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C26541c c26541c = (C26541c) this.f105502x;
            AbstractC26543e abstractC26543e = (AbstractC26543e) this.f105503y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f105501w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (AbstractC22676k.m65745e(abstractC26543e, AbstractC26543e.b.f105506a)) {
                    return c26541c.m78642a(AbstractC26540b.c.f105487a);
                }
                if (!(abstractC26543e instanceof AbstractC26543e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C26542d c26542d = C26542d.this;
                this.f105502x = c26541c;
                this.f105503y = abstractC26543e;
                this.f105501w = 1;
                obj = c26542d.m78648g(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            GiftHubResponse giftHubResponse = (GiftHubResponse) obj;
            if (giftHubResponse != null) {
                C26542d.this.analyticsHelper.m69804a(new AbstractC23754a.c(null, C26542d.this.m78649h(GiftHubResponseKt.toGiftHubStyle(giftHubResponse.getStyle())), ((AbstractC26543e.a) abstractC26543e).getSource(), null, 9, null));
                return c26541c.m78642a(new AbstractC26540b.b(giftHubResponse));
            }
            C26542d.this.analyticsHelper.m69804a(new AbstractC23754a.b(null, 1, null));
            return c26541c.m78642a(AbstractC26540b.a.f105485a);
        }
    }

    public C26542d(GiftHubApi api, C23755b analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m78648g(InterfaceC30057d<? super GiftHubResponse> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f105495y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f105495y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f105493w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f105495y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(null);
            bVar2.f105495y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar, bVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        return AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final String m78649h(GiftHubStyle giftHubStyle) {
        int i13 = a.f105492a[giftHubStyle.ordinal()];
        if (i13 == 1) {
            return "holiday";
        }
        if (i13 == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new C26541c(null, 1, null), AbstractC13091v.m36590P(upstream, new d(null)), new e(null)), 1);
    }

    public /* synthetic */ C26542d(GiftHubApi giftHubApi, C23755b c23755b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(giftHubApi, c23755b, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("GiftHubInteractor") : interfaceC34116n);
    }
}
