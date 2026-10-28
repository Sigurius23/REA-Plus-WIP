package mr1;

import c93.InterfaceC4351m;
import com.whoop.internal.checkout.models.CreateCartResponse;
import com.whoop.internal.checkout.models.PostUniversalCheckoutRequest;
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
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u02.AbstractC34390f;
import u02.AbstractC34391g;
import u02.C34387c;
import u02.C34389e;
import u02.C34392h;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: mr1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lmr1/f;", "Lod1/g;", "Lmr1/b;", "Lmr1/c;", "Lu02/c;", "apiClient", "<init>", "(Lu02/c;)V", "previousState", "action", "i", "(Lmr1/c;Lmr1/b;)Lmr1/c;", "Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lec3/l;", "", "dynamicPath", "dynamicPayload", "Lu02/g;", "Lcom/whoop/internal/checkout/models/CreateCartResponse;", "g", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "j", "()Lmr1/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lu02/c;", "internal-tooling_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25916f implements InterfaceC27844g<AbstractC25912b, C25913c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: mr1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchInteractor$fetchCartId$1", m100430f = "UniversalCheckoutDataFetchInteractor.kt", m100431l = {56, 63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmr1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f102304E;

        /* JADX INFO: renamed from: w */
        int f102305w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102306x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f102308z;

        /* JADX INFO: renamed from: mr1.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42023a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102309w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25916f f102310x;

            public C42023a(InterfaceC13062m interfaceC13062m, C25916f c25916f) {
                this.f102309w = interfaceC13062m;
                this.f102310x = c25916f;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC34391g<CreateCartResponse> abstractC34391g, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C25913c c25913cM76650j;
                InterfaceC13062m interfaceC13062m = this.f102309w;
                if (abstractC34391g instanceof C34392h) {
                    String actualCartId = ((CreateCartResponse) ((C34392h) abstractC34391g).m108758a()).getActualCartId();
                    c25913cM76650j = (actualCartId == null || AbstractC39414r.m125890i0(actualCartId)) ? new C25913c(null, false, "Cart creation succeeded but no cartId could be extracted from response", AbstractC25911a.d.f102289a, false, 19, null) : new C25913c(actualCartId, false, null, AbstractC25911a.c.f102288a, false, 20, null);
                } else {
                    if (!(abstractC34391g instanceof C34389e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c25913cM76650j = this.f102310x.m76650j();
                }
                Object objEmit = interfaceC13062m.emit(c25913cM76650j, interfaceC30057d);
                return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102308z = str;
            this.f102304E = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C25916f.this.new a(this.f102308z, this.f102304E, interfaceC30057d);
            aVar.f102306x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            if (r14.collect(r2, r13) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f102306x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r13.f102305w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r14)
                goto L59
            L14:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1c:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L3c
            L20:
                p505ts.AbstractC34132o.m107864I(r14)
                mr1.c r5 = new mr1.c
                mr1.a$a r9 = mr1.AbstractC25911a.a.f102286a
                r11 = 21
                r12 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                r13.f102306x = r0
                r13.f102305w = r4
                java.lang.Object r14 = r0.emit(r5, r13)
                if (r14 != r1) goto L3c
                goto L58
            L3c:
                mr1.f r14 = mr1.C25916f.this
                java.lang.String r2 = r13.f102308z
                java.lang.String r4 = r13.f102304E
                ec3.l r14 = mr1.C25916f.m76643c(r14, r2, r4)
                mr1.f$a$a r2 = new mr1.f$a$a
                mr1.f r4 = mr1.C25916f.this
                r2.<init>(r0, r4)
                r0 = 0
                r13.f102306x = r0
                r13.f102305w = r3
                java.lang.Object r14 = r14.collect(r2, r13)
                if (r14 != r1) goto L59
            L58:
                return r1
            L59:
                l83.a0 r14 = l83.C23454a0.f92919a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: mr1.C25916f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: mr1.f$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchInteractor$interact$$inlined$flatMapLatest$1", m100430f = "UniversalCheckoutDataFetchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f102311w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102312x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f102313y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25916f f102314z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C25916f c25916f) {
            super(3, interfaceC30057d);
            this.f102314z = c25916f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC25912b abstractC25912b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f102314z);
            bVar.f102312x = interfaceC13062m;
            bVar.f102313y = abstractC25912b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102311w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f102312x;
                AbstractC25912b abstractC25912b = (AbstractC25912b) this.f102313y;
                InterfaceC13058l interfaceC13058lM36590P = abstractC25912b instanceof AbstractC25912b.a ? AbstractC13091v.m36590P(this.f102314z.m76648h(), new f(null)) : new C13084s1(new d(abstractC25912b, null));
                this.f102312x = null;
                this.f102313y = null;
                this.f102311w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC25912b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: mr1.f$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchInteractor$interact$1$1$1", m100430f = "UniversalCheckoutDataFetchInteractor.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmr1/g$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102315w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102316x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C25913c f102317y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25913c c25913c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102317y = c25913c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f102317y, interfaceC30057d);
            cVar.f102316x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f102316x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102315w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC25917g.a aVar = new AbstractC25917g.a(this.f102317y);
                this.f102316x = null;
                this.f102315w = 1;
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

    /* JADX INFO: renamed from: mr1.f$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchInteractor$interact$1$2", m100430f = "UniversalCheckoutDataFetchInteractor.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmr1/g$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102318w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102319x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC25912b f102320y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC25912b abstractC25912b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102320y = abstractC25912b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f102320y, interfaceC30057d);
            dVar.f102319x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f102319x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102318w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC25917g.b bVar = new AbstractC25917g.b(this.f102320y);
                this.f102319x = null;
                this.f102318w = 1;
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

    /* JADX INFO: renamed from: mr1.f$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchInteractor$interact$2", m100430f = "UniversalCheckoutDataFetchInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lmr1/c;", "previousState", "Lmr1/g;", "action", "<anonymous>", "(Lmr1/c;Lmr1/g;)Lmr1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f102321w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f102322x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f102323y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C25913c c25913c, AbstractC25917g abstractC25917g, InterfaceC30057d<? super C25913c> interfaceC30057d) {
            e eVar = C25916f.this.new e(interfaceC30057d);
            eVar.f102322x = c25913c;
            eVar.f102323y = abstractC25917g;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C25913c c25913c = (C25913c) this.f102322x;
            AbstractC25917g abstractC25917g = (AbstractC25917g) this.f102323y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f102321w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC25917g instanceof AbstractC25917g.b) {
                return C25916f.this.m76649i(c25913c, ((AbstractC25917g.b) abstractC25917g).getDomainAction());
            }
            if (abstractC25917g instanceof AbstractC25917g.a) {
                return ((AbstractC25917g.a) abstractC25917g).getDomainState();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: mr1.f$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "UniversalCheckoutDataFetchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f102325w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102326x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f102327y;

        public f(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C25913c c25913c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f102326x = interfaceC13062m;
            fVar.f102327y = c25913c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102325w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f102326x;
                C13084s1 c13084s1 = new C13084s1(new c((C25913c) this.f102327y, null));
                this.f102326x = null;
                this.f102327y = null;
                this.f102325w = 1;
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
            return invoke((InterfaceC13062m) obj, (C25913c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C25916f(C34387c apiClient) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        this.apiClient = apiClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m76647g(String dynamicPath, String dynamicPayload) {
        C0456u c0456u = new C0456u(new PostUniversalCheckoutRequest(dynamicPayload, dynamicPath), 1);
        C34387c c34387c = this.apiClient;
        InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(String.class);
        Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65691d);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(String.class), interfaceC21456a0M65691d, typeM60396B);
        InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(CreateCartResponse.class);
        return AbstractC34390f.m108754b(c0456u, c34387c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(CreateCartResponse.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m76648h() {
        return new C13084s1(new a("/commerce-service/v2/mobile/carts", "{\"cart_items\":[{\"sku\":\"810114362662\",\"quantity\":1},{\"sku\":\"ALBL1-OTP-12M-STA\",\"quantity\":1}]}", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C25913c m76649i(C25913c previousState, AbstractC25912b action) {
        if (action instanceof AbstractC25912b.a) {
            return C25913c.m76636b(previousState, null, true, null, null, false, 29, null);
        }
        if (action instanceof AbstractC25912b.b) {
            return C25913c.m76636b(previousState, null, false, null, null, true, 15, null);
        }
        if (action instanceof AbstractC25912b.c) {
            return C25913c.m76636b(previousState, null, false, null, null, false, 15, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C25913c m76650j() {
        return new C25913c(null, false, "Unknown error occurred", AbstractC25911a.d.f102289a, false, 19, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C25913c(null, false, null, null, false, 31, null), AbstractC13091v.m36590P(upstream, new b(null, this)), new e(null));
    }
}
