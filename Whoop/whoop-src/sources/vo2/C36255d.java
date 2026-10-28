package vo2;

import c93.InterfaceC4351m;
import com.whoop.universalcheckout.features.externalwebcheckout.domain.PostExternalWebCheckoutRequest;
import com.whoop.universalcheckout.features.externalwebcheckout.domain.models.ExternalWebCheckoutResponse;
import com.whoop.universalcheckout.features.externalwebcheckout.domain.models.PostExternalWebCheckoutRequestBody;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
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
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;

/* JADX INFO: renamed from: vo2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lvo2/d;", "Lod1/g;", "Lvo2/b;", "Lvo2/c;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "previousState", "action", "f", "(Lvo2/c;Lvo2/b;)Lvo2/c;", "", "cartId", "Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/universalcheckout/features/externalwebcheckout/domain/models/ExternalWebCheckoutResponse;", "cacheResult", "g", "(Lpm0/a$c;Ljava/lang/String;)Lvo2/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36255d implements InterfaceC27844g<AbstractC36253b, C36254c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: vo2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.externalwebcheckout.domain.ExternalWebCheckoutInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ExternalWebCheckoutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155284w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f155285x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155286y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36255d f155287z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C36255d c36255d) {
            super(3, interfaceC30057d);
            this.f155287z = c36255d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC36253b abstractC36253b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f155287z);
            aVar.f155285x = interfaceC13062m;
            aVar.f155286y = abstractC36253b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155284w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f155285x;
                AbstractC36253b abstractC36253b = (AbstractC36253b) this.f155286y;
                InterfaceC13058l interfaceC13058lM36590P = abstractC36253b instanceof AbstractC36253b.a ? AbstractC13091v.m36590P(this.f155287z.m115662h(((AbstractC36253b.a) abstractC36253b).getCartId()), new e(null)) : new C13084s1(new c(abstractC36253b, null));
                this.f155285x = null;
                this.f155286y = null;
                this.f155284w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM36590P, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC36253b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vo2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.externalwebcheckout.domain.ExternalWebCheckoutInteractor$interact$1$1$1", m100430f = "ExternalWebCheckoutInteractor.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvo2/e$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155288w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f155289x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36254c f155290y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C36254c c36254c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155290y = c36254c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f155290y, interfaceC30057d);
            bVar.f155289x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f155289x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155288w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC36256e.a aVar = new AbstractC36256e.a(this.f155290y);
                this.f155289x = null;
                this.f155288w = 1;
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

    /* JADX INFO: renamed from: vo2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.externalwebcheckout.domain.ExternalWebCheckoutInteractor$interact$1$2", m100430f = "ExternalWebCheckoutInteractor.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvo2/e$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155291w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f155292x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC36253b f155293y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC36253b abstractC36253b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155293y = abstractC36253b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f155293y, interfaceC30057d);
            cVar.f155292x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f155292x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155291w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC36256e.b bVar = new AbstractC36256e.b(this.f155293y);
                this.f155292x = null;
                this.f155291w = 1;
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

    /* JADX INFO: renamed from: vo2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.externalwebcheckout.domain.ExternalWebCheckoutInteractor$interact$2", m100430f = "ExternalWebCheckoutInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lvo2/c;", "previousState", "Lvo2/e;", "action", "<anonymous>", "(Lvo2/c;Lvo2/e;)Lvo2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155294w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f155295x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155296y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C36254c c36254c, AbstractC36256e abstractC36256e, InterfaceC30057d<? super C36254c> interfaceC30057d) {
            d dVar = C36255d.this.new d(interfaceC30057d);
            dVar.f155295x = c36254c;
            dVar.f155296y = abstractC36256e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C36254c c36254c = (C36254c) this.f155295x;
            AbstractC36256e abstractC36256e = (AbstractC36256e) this.f155296y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155294w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC36256e instanceof AbstractC36256e.b) {
                return C36255d.this.m115660f(c36254c, ((AbstractC36256e.b) abstractC36256e).getDomainAction());
            }
            if (abstractC36256e instanceof AbstractC36256e.a) {
                return ((AbstractC36256e.a) abstractC36256e).getDomainState();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: vo2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.externalwebcheckout.domain.ExternalWebCheckoutInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "ExternalWebCheckoutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155298w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f155299x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155300y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C36254c c36254c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f155299x = interfaceC13062m;
            eVar.f155300y = c36254c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155298w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f155299x;
                C13084s1 c13084s1 = new C13084s1(new b((C36254c) this.f155300y, null));
                this.f155299x = null;
                this.f155300y = null;
                this.f155298w = 1;
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
            return invoke((InterfaceC13062m) obj, (C36254c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vo2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.externalwebcheckout.domain.ExternalWebCheckoutInteractor$loadExternalWebCheckoutCache$$inlined$cacheAPI$1", m100430f = "ExternalWebCheckoutInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f155301w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f155302x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155303y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f155304z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f155304z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<PostExternalWebCheckoutRequestBody> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f155304z);
            fVar.f155302x = interfaceC13062m;
            fVar.f155303y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155301w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f155302x;
                C26832c c26832c = (C26832c) this.f155303y;
                InterfaceC26834e interfaceC26834e = this.f155304z;
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(PostExternalWebCheckoutRequestBody.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65691d);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(PostExternalWebCheckoutRequestBody.class), interfaceC21456a0M65691d, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(ExternalWebCheckoutResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ExternalWebCheckoutResponse.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2)));
                this.f155302x = null;
                this.f155303y = null;
                this.f155301w = 1;
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
            return invoke((InterfaceC13062m) obj, (C26832c<PostExternalWebCheckoutRequestBody>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vo2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f155305w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f155306x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36255d f155307y;

        /* JADX INFO: renamed from: vo2.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f155308w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f155309x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C36255d f155310y;

            /* JADX INFO: renamed from: vo2.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.externalwebcheckout.domain.ExternalWebCheckoutInteractor$loadExternalWebCheckoutCache$$inlined$map$1$2", m100430f = "ExternalWebCheckoutInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42558a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f155311E;

                /* JADX INFO: renamed from: F */
                Object f155312F;

                /* JADX INFO: renamed from: G */
                Object f155313G;

                /* JADX INFO: renamed from: H */
                int f155314H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f155315w;

                /* JADX INFO: renamed from: x */
                int f155316x;

                /* JADX INFO: renamed from: y */
                Object f155317y;

                public C42558a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f155315w = obj;
                    this.f155316x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, C36255d c36255d) {
                this.f155308w = interfaceC13062m;
                this.f155309x = str;
                this.f155310y = c36255d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42558a c42558a;
                C36254c c36254cM115661g;
                if (interfaceC30057d instanceof C42558a) {
                    c42558a = (C42558a) interfaceC30057d;
                    int i13 = c42558a.f155316x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42558a.f155316x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42558a = new C42558a(interfaceC30057d);
                    }
                } else {
                    c42558a = new C42558a(interfaceC30057d);
                }
                Object obj2 = c42558a.f155315w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42558a.f155316x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f155308w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c36254cM115661g = new C36254c(InterfaceC36252a.b.f155274a, null, false, false, null, 30, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c36254cM115661g = new C36254c(InterfaceC36252a.b.f155274a, (ExternalWebCheckoutResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), false, false, this.f155309x, 12, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c36254cM115661g = new C36254c(null, (ExternalWebCheckoutResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), false, false, this.f155309x, 13, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c36254cM115661g = new C36254c(null, (ExternalWebCheckoutResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), false, false, this.f155309x, 13, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c36254cM115661g = this.f155310y.m115661g((InterfaceC29354a.c) interfaceC29354a, this.f155309x);
                    }
                    c42558a.f155317y = null;
                    c42558a.f155311E = null;
                    c42558a.f155312F = null;
                    c42558a.f155313G = null;
                    c42558a.f155314H = 0;
                    c42558a.f155316x = 1;
                    if (interfaceC13062m.emit(c36254cM115661g, c42558a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, String str, C36255d c36255d) {
            this.f155305w = interfaceC13058l;
            this.f155306x = str;
            this.f155307y = c36255d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f155305w.collect(new a(interfaceC13062m, this.f155306x, this.f155307y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C36255d(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C36254c m115660f(C36254c previousState, AbstractC36253b action) {
        return previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final C36254c m115661g(InterfaceC29354a.c<ExternalWebCheckoutResponse> cacheResult, String cartId) {
        return AbstractC29355b.m89462a(cacheResult) ? new C36254c(InterfaceC36252a.d.f155276a, null, false, false, cartId, 14, null) : new C36254c(InterfaceC36252a.c.f155275a, null, false, false, cartId, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m115662h(String cartId) {
        return new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new PostExternalWebCheckoutRequest(new PostExternalWebCheckoutRequestBody(cartId)), 1), AbstractC12350b.m34570S("ExternalWebCheckout_SCOPE"), null, 2, null), new f(null, this.cachedApiSource)), cartId, this);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C36254c(InterfaceC36252a.b.f155274a, null, false, false, null, 30, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }
}
