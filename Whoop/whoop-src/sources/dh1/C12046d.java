package dh1;

import c93.InterfaceC4351m;
import com.whoop.gifting.feature.gifted.domain.GetGiftedRequest;
import com.whoop.gifting.feature.gifted.domain.models.GiftedModels;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import gh1.InterfaceC15852b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
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
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: dh1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Ldh1/d;", "Lod1/g;", "Ldh1/b;", "Ldh1/c;", "Lnm0/e;", "cachedApiSource", "Lqw2/c;", "actionInteractor", "<init>", "(Lnm0/e;Lqw2/c;)V", "previousState", "action", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ldh1/c;Ldh1/b;)Ldh1/c;", "Ldh1/b$a;", "", "giftCode", "Lec3/l;", "Ldh1/e;", "l", "(Ldh1/b$a;Ljava/lang/String;)Lec3/l;", "code", "", "manualRefresh", "j", "(Ljava/lang/String;Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;", "cacheResult", "i", "(Lpm0/a$c;Ljava/lang/String;)Ldh1/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lqw2/c;", "c", "Ljava/lang/String;", "currentGiftCode", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12046d implements InterfaceC27844g<AbstractC12044b, C12045c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String currentGiftCode;

    /* JADX INFO: renamed from: dh1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.domain.GiftedInteractor$interact$$inlined$flatMapLatest$1", m100430f = "GiftedInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39833w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39834x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39835y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12046d f39836z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C12046d c12046d) {
            super(3, interfaceC30057d);
            this.f39836z = c12046d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC12044b abstractC12044b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f39836z);
            aVar.f39834x = interfaceC13062m;
            aVar.f39835y = abstractC12044b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39833w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39834x;
                AbstractC12044b abstractC12044b = (AbstractC12044b) this.f39835y;
                if (abstractC12044b instanceof AbstractC12044b.b) {
                    AbstractC12044b.b bVar = (AbstractC12044b.b) abstractC12044b;
                    this.f39836z.currentGiftCode = bVar.getCode();
                    c13084s1 = AbstractC13091v.m36590P(C12046d.m33186k(this.f39836z, bVar.getCode(), false, 2, null), new e(null));
                } else if (abstractC12044b instanceof AbstractC12044b.a) {
                    C12046d c12046d = this.f39836z;
                    c13084s1 = c12046d.m33187l((AbstractC12044b.a) abstractC12044b, c12046d.currentGiftCode);
                } else {
                    c13084s1 = new C13084s1(new c(abstractC12044b, null));
                }
                this.f39834x = null;
                this.f39835y = null;
                this.f39833w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC12044b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dh1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.domain.GiftedInteractor$interact$1$internalActionFlow$1$1", m100430f = "GiftedInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldh1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39837w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39838x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12045c f39839y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C12045c c12045c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39839y = c12045c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f39839y, interfaceC30057d);
            bVar.f39838x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39838x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39837w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC12047e.b bVar = new AbstractC12047e.b(this.f39839y);
                this.f39838x = null;
                this.f39837w = 1;
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

    /* JADX INFO: renamed from: dh1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.domain.GiftedInteractor$interact$1$internalActionFlow$2", m100430f = "GiftedInteractor.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldh1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39840w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39841x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC12044b f39842y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC12044b abstractC12044b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39842y = abstractC12044b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f39842y, interfaceC30057d);
            cVar.f39841x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39841x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39840w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC12047e.a aVar = new AbstractC12047e.a(this.f39842y);
                this.f39841x = null;
                this.f39840w = 1;
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

    /* JADX INFO: renamed from: dh1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.domain.GiftedInteractor$interact$2", m100430f = "GiftedInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldh1/c;", "previousState", "Ldh1/e;", "action", "<anonymous>", "(Ldh1/c;Ldh1/e;)Ldh1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39843w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39844x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39845y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12045c c12045c, AbstractC12047e abstractC12047e, InterfaceC30057d<? super C12045c> interfaceC30057d) {
            d dVar = C12046d.this.new d(interfaceC30057d);
            dVar.f39844x = c12045c;
            dVar.f39845y = abstractC12047e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C12045c c12045c = (C12045c) this.f39844x;
            AbstractC12047e abstractC12047e = (AbstractC12047e) this.f39845y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f39843w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC12047e instanceof AbstractC12047e.a) {
                return C12046d.this.m33183h(c12045c, ((AbstractC12047e.a) abstractC12047e).getDomainAction());
            }
            if (abstractC12047e instanceof AbstractC12047e.b) {
                return ((AbstractC12047e.b) abstractC12047e).getDomainState();
            }
            if (abstractC12047e instanceof AbstractC12047e.c) {
                return C12045c.m33170b(c12045c, ((AbstractC12047e.c) abstractC12047e).getDialogType(), null, false, false, null, null, 62, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: dh1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.domain.GiftedInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "GiftedInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39847w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39848x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39849y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C12045c c12045c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f39848x = interfaceC13062m;
            eVar.f39849y = c12045c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39847w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39848x;
                C13084s1 c13084s1 = new C13084s1(new b((C12045c) this.f39849y, null));
                this.f39848x = null;
                this.f39849y = null;
                this.f39847w = 1;
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
            return invoke((InterfaceC13062m) obj, (C12045c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dh1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.domain.GiftedInteractor$loadGiftedCache$$inlined$cacheAPI$1", m100430f = "GiftedInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39850w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39851x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39852y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f39853z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f39853z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f39853z);
            fVar.f39851x = interfaceC13062m;
            fVar.f39852y = c26832c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39850w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39851x;
                C26832c c26832c = (C26832c) this.f39852y;
                InterfaceC26834e interfaceC26834e = this.f39853z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(GiftedModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(GiftedModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f39851x = null;
                this.f39852y = null;
                this.f39850w = 1;
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

    /* JADX INFO: renamed from: dh1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f39854w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f39855x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f39856y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12046d f39857z;

        /* JADX INFO: renamed from: dh1.d$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f39858w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f39859x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f39860y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C12046d f39861z;

            /* JADX INFO: renamed from: dh1.d$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.domain.GiftedInteractor$loadGiftedCache$$inlined$map$1$2", m100430f = "GiftedInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41473a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f39862E;

                /* JADX INFO: renamed from: F */
                Object f39863F;

                /* JADX INFO: renamed from: G */
                Object f39864G;

                /* JADX INFO: renamed from: H */
                int f39865H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f39866w;

                /* JADX INFO: renamed from: x */
                int f39867x;

                /* JADX INFO: renamed from: y */
                Object f39868y;

                public C41473a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f39866w = obj;
                    this.f39867x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, boolean z4, C12046d c12046d) {
                this.f39858w = interfaceC13062m;
                this.f39859x = str;
                this.f39860y = z4;
                this.f39861z = c12046d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41473a c41473a;
                C12045c c12045cM33184i;
                if (interfaceC30057d instanceof C41473a) {
                    c41473a = (C41473a) interfaceC30057d;
                    int i13 = c41473a.f39867x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41473a.f39867x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41473a = new C41473a(interfaceC30057d);
                    }
                } else {
                    c41473a = new C41473a(interfaceC30057d);
                }
                Object obj2 = c41473a.f39866w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41473a.f39867x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f39858w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c12045cM33184i = new C12045c(InterfaceC12043a.b.f39818a, null, false, false, null, this.f39859x, 30, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c12045cM33184i = new C12045c(null, (GiftedModels) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f39860y, true, null, this.f39859x, 17, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c12045cM33184i = new C12045c(null, (GiftedModels) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), false, false, null, this.f39859x, 29, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c12045cM33184i = new C12045c(null, (GiftedModels) ((InterfaceC29354a.d) interfaceC29354a).getData(), false, false, null, this.f39859x, 29, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c12045cM33184i = this.f39861z.m33184i((InterfaceC29354a.c) interfaceC29354a, this.f39859x);
                    }
                    c41473a.f39868y = null;
                    c41473a.f39862E = null;
                    c41473a.f39863F = null;
                    c41473a.f39864G = null;
                    c41473a.f39865H = 0;
                    c41473a.f39867x = 1;
                    if (interfaceC13062m.emit(c12045cM33184i, c41473a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, String str, boolean z4, C12046d c12046d) {
            this.f39854w = interfaceC13058l;
            this.f39855x = str;
            this.f39856y = z4;
            this.f39857z = c12046d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f39854w.collect(new a(interfaceC13062m, this.f39855x, this.f39856y, this.f39857z), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dh1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.domain.GiftedInteractor$performAction$$inlined$flatMapLatest$1", m100430f = "GiftedInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C12046d f39870E;

        /* JADX INFO: renamed from: w */
        int f39871w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39872x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39873y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f39874z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, String str, C12046d c12046d) {
            super(3, interfaceC30057d);
            this.f39874z = str;
            this.f39870E = c12046d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC30694b abstractC30694b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f39874z, this.f39870E);
            hVar.f39872x = interfaceC13062m;
            hVar.f39873y = abstractC30694b;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            C0456u c0456u2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39871w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39872x;
                AbstractC30694b abstractC30694b = (AbstractC30694b) this.f39873y;
                if (abstractC30694b instanceof AbstractC30694b.f) {
                    String str = this.f39874z;
                    c0456u = str != null ? new i(C12046d.m33186k(this.f39870E, str, false, 2, null)) : new C0456u(new AbstractC12047e.c(InterfaceC12043a.d.f39820a), 1);
                } else if ((abstractC30694b instanceof AbstractC30694b.c) || (abstractC30694b instanceof AbstractC30694b.i)) {
                    c0456u = new C0456u(new AbstractC12047e.c(InterfaceC12043a.b.f39818a), 1);
                } else if (abstractC30694b instanceof AbstractC30694b.n) {
                    c0456u = new C0456u(new AbstractC12047e.c(InterfaceC12043a.e.f39821a), 1);
                } else {
                    if (abstractC30694b instanceof AbstractC30694b.d) {
                        c0456u2 = new C0456u(new AbstractC12047e.b(new C12045c(null, null, false, false, new InterfaceC15852b.b(((AbstractC30694b.d) abstractC30694b).getDestination()), null, 47, null)), 1);
                    } else if (abstractC30694b instanceof AbstractC30694b.a) {
                        c0456u2 = new C0456u(new AbstractC12047e.c(AbstractC39414r.m125876U(((AbstractC30694b.a) abstractC30694b).getMessage(), "network", true) ? InterfaceC12043a.c.f39819a : InterfaceC12043a.d.f39820a), 1);
                    } else {
                        if (!(abstractC30694b instanceof AbstractC30694b.m) && !(abstractC30694b instanceof AbstractC30694b.l) && !(abstractC30694b instanceof AbstractC30694b.k) && !(abstractC30694b instanceof AbstractC30694b.j) && !(abstractC30694b instanceof AbstractC30694b.g) && !(abstractC30694b instanceof AbstractC30694b.e) && !(abstractC30694b instanceof AbstractC30694b.h) && !(abstractC30694b instanceof AbstractC30694b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(new AbstractC12047e.c(null), 1);
                    }
                    c0456u = c0456u2;
                }
                this.f39872x = null;
                this.f39873y = null;
                this.f39871w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC30694b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dh1.d$i */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f39875w;

        /* JADX INFO: renamed from: dh1.d$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f39876w;

            /* JADX INFO: renamed from: dh1.d$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.domain.GiftedInteractor$performAction$lambda$0$$inlined$map$1$2", m100430f = "GiftedInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41474a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f39877E;

                /* JADX INFO: renamed from: F */
                Object f39878F;

                /* JADX INFO: renamed from: G */
                Object f39879G;

                /* JADX INFO: renamed from: H */
                int f39880H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f39881w;

                /* JADX INFO: renamed from: x */
                int f39882x;

                /* JADX INFO: renamed from: y */
                Object f39883y;

                public C41474a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f39881w = obj;
                    this.f39882x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f39876w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41474a c41474a;
                if (interfaceC30057d instanceof C41474a) {
                    c41474a = (C41474a) interfaceC30057d;
                    int i13 = c41474a.f39882x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41474a.f39882x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41474a = new C41474a(interfaceC30057d);
                    }
                } else {
                    c41474a = new C41474a(interfaceC30057d);
                }
                Object obj2 = c41474a.f39881w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41474a.f39882x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f39876w;
                    AbstractC12047e.b bVar = new AbstractC12047e.b((C12045c) obj);
                    c41474a.f39883y = null;
                    c41474a.f39877E = null;
                    c41474a.f39878F = null;
                    c41474a.f39879G = null;
                    c41474a.f39880H = 0;
                    c41474a.f39882x = 1;
                    if (interfaceC13062m.emit(bVar, c41474a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f39875w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f39875w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C12046d(InterfaceC26834e cachedApiSource, C30695c actionInteractor) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        this.cachedApiSource = cachedApiSource;
        this.actionInteractor = actionInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C12045c m33183h(C12045c previousState, AbstractC12044b action) {
        return previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C12045c m33184i(InterfaceC29354a.c<GiftedModels> cacheResult, String code) {
        return AbstractC29355b.m89462a(cacheResult) ? new C12045c(InterfaceC12043a.d.f39820a, null, false, false, null, code, 30, null) : new C12045c(InterfaceC12043a.c.f39819a, null, false, false, null, code, 30, null);
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC13058l m33185j(String code, boolean manualRefresh) {
        return new g(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetGiftedRequest(code), 1), null, null, 3, null), new f(null, this.cachedApiSource)), code, manualRefresh, this);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ InterfaceC13058l m33186k(C12046d c12046d, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return c12046d.m33185j(str, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m33187l(AbstractC12044b.a action, String giftCode) {
        return AbstractC13091v.m36590P(this.actionInteractor.interact(new C0456u(new C30698f(action.getAction()), 1)), new h(null, giftCode, this));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C12045c(InterfaceC12043a.b.f39818a, null, false, false, null, null, 62, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }
}
