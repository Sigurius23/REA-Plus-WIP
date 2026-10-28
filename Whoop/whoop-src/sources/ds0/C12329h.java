package ds0;

import ad3.AbstractC0757c;
import bc3.AbstractC3034m0;
import c93.InterfaceC4351m;
import com.whoop.communityreactions.domain.model.ReactionsInputModel;
import com.whoop.communityreactions.domain.model.ReactionsResponse;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.UpdateAction;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import es0.EnumC13588a;
import fs0.C14742b;
import fs0.C14743c;
import fs0.InterfaceC14741a;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import od1.InterfaceC27844g;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ds0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001AB)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e*\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e*\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e*\b\u0012\u0004\u0012\u00020\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e*\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0012*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0012*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\u0003*\u00020\u00032\u0006\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u0003*\u00020\u00032\u0006\u0010!\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\u0003*\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J+\u00100\u001a\u00020\u0003*\u00020\u00032\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u00020\u0003*\u00020\u00032\u0006\u0010(\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010<\u001a\u0004\u0018\u00010;*\u0002092\u0006\u0010:\u001a\u00020+H\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u0004\u0018\u00010;*\u00020>H\u0002¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, m65681d2 = {"Lds0/h;", "Lod1/g;", "Lds0/d;", "Lds0/f;", "Lds0/g;", "fetcher", "Lfs0/b;", "sendInteractor", "Lad3/c;", "json", "Ltr2/n;", "logger", "<init>", "(Lds0/g;Lfs0/b;Lad3/c;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lds0/e;", "s", "Lec3/p1;", "state", "x", "(Lec3/l;Lec3/p1;)Lec3/l;", "Lfs0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "v", "Lds0/d$b;", "t", "(Lds0/d$b;)Lds0/e;", "Lds0/d$i;", "u", "(Lds0/d$i;)Lds0/e;", "result", "A", "(Lds0/f;Lds0/e;)Lds0/f;", "Lds0/e$c;", "r", "(Lds0/f;Lds0/e$c;)Lds0/f;", "Lds0/b$a;", "key", "B", "(Lds0/f;Lds0/b$a;)Lds0/f;", "", "emoji", "", "submissionId", "Lds0/b$c;", "C", "(Lds0/f;Ljava/lang/String;JLds0/b$c;)Lds0/f;", "Lds0/b;", "p", "(Lds0/f;Lds0/b;)Lds0/f;", "Lds0/d$a;", "action", "q", "(Lds0/d$a;)Lec3/l;", "Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;", "text", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "y", "(Lcom/whoop/communityreactions/domain/model/ReactionsInputModel;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/UpdateAction;", "Lcom/whoop/navigation/models/GenericInteraction;", "z", "(Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/whoopaction/domain/models/UpdateAction;", "a", "Lds0/g;", "b", "Lfs0/b;", "c", "Lad3/c;", "d", "Ltr2/n;", "e", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12329h implements InterfaceC27844g<InterfaceC12325d, C12327f> {

    /* JADX INFO: renamed from: e */
    private static final a f41310e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f41311f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12328g fetcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14742b sendInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ds0.h$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lds0/h$a;", "", "<init>", "()V", "", "MAX_FETCH_DELAY_MS", "J", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ds0.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsInteractor$interact$1", m100430f = "ReactionsInteractor.kt", m100431l = {38, 39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lds0/f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC13058l f41316E;

        /* JADX INFO: renamed from: w */
        Object f41317w;

        /* JADX INFO: renamed from: x */
        int f41318x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f41319y;

        /* JADX INFO: renamed from: ds0.h$b$a */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f41321w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13075p1 f41322x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C12329h f41323y;

            /* JADX INFO: renamed from: ds0.h$b$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41481a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f41324w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ InterfaceC13075p1 f41325x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ C12329h f41326y;

                /* JADX INFO: renamed from: ds0.h$b$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsInteractor$interact$1$invokeSuspend$$inlined$map$1$2", m100430f = "ReactionsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41482a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f41327E;

                    /* JADX INFO: renamed from: F */
                    Object f41328F;

                    /* JADX INFO: renamed from: G */
                    Object f41329G;

                    /* JADX INFO: renamed from: H */
                    int f41330H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f41331w;

                    /* JADX INFO: renamed from: x */
                    int f41332x;

                    /* JADX INFO: renamed from: y */
                    Object f41333y;

                    public C41482a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f41331w = obj;
                        this.f41332x |= Integer.MIN_VALUE;
                        return C41481a.this.emit(null, this);
                    }
                }

                public C41481a(InterfaceC13062m interfaceC13062m, InterfaceC13075p1 interfaceC13075p1, C12329h c12329h) {
                    this.f41324w = interfaceC13062m;
                    this.f41325x = interfaceC13075p1;
                    this.f41326y = c12329h;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41482a c41482a;
                    C13045h2 c13045h2;
                    Object value;
                    C12327f c12327fM34389A;
                    if (interfaceC30057d instanceof C41482a) {
                        c41482a = (C41482a) interfaceC30057d;
                        int i13 = c41482a.f41332x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41482a.f41332x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41482a = new C41482a(interfaceC30057d);
                        }
                    } else {
                        c41482a = new C41482a(interfaceC30057d);
                    }
                    Object obj2 = c41482a.f41331w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41482a.f41332x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f41324w;
                        InterfaceC12326e interfaceC12326e = (InterfaceC12326e) obj;
                        InterfaceC13075p1 interfaceC13075p1 = this.f41325x;
                        do {
                            c13045h2 = (C13045h2) interfaceC13075p1;
                            value = c13045h2.getValue();
                            c12327fM34389A = this.f41326y.m34389A((C12327f) value, interfaceC12326e);
                        } while (!c13045h2.m36569i(value, c12327fM34389A));
                        c41482a.f41333y = null;
                        c41482a.f41327E = null;
                        c41482a.f41328F = null;
                        c41482a.f41329G = null;
                        c41482a.f41330H = 0;
                        c41482a.f41332x = 1;
                        if (interfaceC13062m.emit(c12327fM34389A, c41482a) == enumC31071a) {
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

            public a(InterfaceC13058l interfaceC13058l, InterfaceC13075p1 interfaceC13075p1, C12329h c12329h) {
                this.f41321w = interfaceC13058l;
                this.f41322x = interfaceC13075p1;
                this.f41323y = c12329h;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f41321w.collect(new C41481a(interfaceC13062m, this.f41322x, this.f41323y), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13058l interfaceC13058l, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41316E = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C12329h.this.new b(this.f41316E, interfaceC30057d);
            bVar.f41319y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, r7, r17) == r2) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = r0.f41319y
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f41318x
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2a
                if (r3 == r5) goto L22
                if (r3 != r4) goto L1a
                java.lang.Object r1 = r0.f41317w
                ec3.p1 r1 = (ec3.InterfaceC13075p1) r1
                p505ts.AbstractC34132o.m107864I(r18)
                goto L8e
            L1a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L22:
                java.lang.Object r3 = r0.f41317w
                ec3.p1 r3 = (ec3.InterfaceC13075p1) r3
                p505ts.AbstractC34132o.m107864I(r18)
                goto L53
            L2a:
                p505ts.AbstractC34132o.m107864I(r18)
                ds0.f r6 = new ds0.f
                r15 = 255(0xff, float:3.57E-43)
                r16 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                ec3.h2 r3 = ec3.AbstractC13091v.m36593c(r6)
                java.lang.Object r6 = r3.getValue()
                r0.f41319y = r1
                r0.f41317w = r3
                r0.f41318x = r5
                java.lang.Object r6 = r1.emit(r6, r0)
                if (r6 != r2) goto L53
                goto L8d
            L53:
                ds0.h r6 = ds0.C12329h.this
                ec3.l r7 = r0.f41316E
                ec3.l r6 = ds0.C12329h.m34395f(r6, r7)
                ds0.h r7 = ds0.C12329h.this
                ec3.l r8 = r0.f41316E
                ec3.l r7 = ds0.C12329h.m34399j(r7, r8, r3)
                ds0.h r8 = ds0.C12329h.this
                ec3.l r9 = r0.f41316E
                ec3.l r8 = ds0.C12329h.m34398i(r8, r9)
                r9 = 3
                ec3.l[] r9 = new ec3.InterfaceC13058l[r9]
                r10 = 0
                r9[r10] = r6
                r9[r5] = r7
                r9[r4] = r8
                ec3.h r5 = ec3.AbstractC13091v.m36584J(r9)
                ds0.h r6 = ds0.C12329h.this
                ds0.h$b$a r7 = new ds0.h$b$a
                r7.<init>(r5, r3, r6)
                r3 = 0
                r0.f41319y = r3
                r0.f41317w = r3
                r0.f41318x = r4
                java.lang.Object r1 = ec3.AbstractC13091v.m36613w(r1, r7, r0)
                if (r1 != r2) goto L8e
            L8d:
                return r2
            L8e:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ds0.C12329h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ds0.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsInteractor$load$1", m100430f = "ReactionsInteractor.kt", m100431l = {178, 182, 186, 187, 187}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lds0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC12325d.a f41335E;

        /* JADX INFO: renamed from: w */
        Object f41336w;

        /* JADX INFO: renamed from: x */
        int f41337x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f41338y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC12325d.a aVar, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41335E = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C12329h.this.new c(this.f41335E, interfaceC30057d);
            cVar.f41338y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00ae A[PHI: r1 r3
          0x00ae: PHI (r1v3 ec3.m) = (r1v1 ec3.m), (r1v6 ec3.m) binds: [B:29:0x00ab, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]
          0x00ae: PHI (r3v16 java.lang.Object) = (r3v15 java.lang.Object), (r3v17 java.lang.Object) binds: [B:29:0x00ab, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM34386c;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f41338y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41337x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC12326e.d dVar = InterfaceC12326e.d.f41283a;
                this.f41338y = interfaceC13062m;
                this.f41337x = 1;
                if (interfaceC13062m.emit(dVar, this) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 != 1) {
                if (i13 == 2) {
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                if (i13 == 3) {
                    AbstractC34132o.m107864I(obj);
                    C12328g c12328g = C12329h.this.fetcher;
                    this.f41338y = null;
                    this.f41336w = interfaceC13062m;
                    this.f41337x = 4;
                    objM34386c = c12328g.m34386c(this);
                    if (objM34386c != enumC31071a) {
                        this.f41338y = null;
                        this.f41336w = null;
                        this.f41337x = 5;
                        if (interfaceC13062m.emit(objM34386c, this) != enumC31071a) {
                        }
                    }
                    return enumC31071a;
                }
                if (i13 == 4) {
                    interfaceC13062m = (InterfaceC13062m) this.f41336w;
                    AbstractC34132o.m107864I(obj);
                    objM34386c = obj;
                    this.f41338y = null;
                    this.f41336w = null;
                    this.f41337x = 5;
                    if (interfaceC13062m.emit(objM34386c, this) != enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            if (C12329h.this.fetcher.m34387d()) {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(AbstractC12889b.m36286p(this.f41335E.getFetchDelayMs(), 0L, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT), DurationUnit.MILLISECONDS);
                this.f41338y = interfaceC13062m;
                this.f41337x = 3;
                if (AbstractC3034m0.m8783c(duration, this) != enumC31071a) {
                    C12328g c12328g2 = C12329h.this.fetcher;
                    this.f41338y = null;
                    this.f41336w = interfaceC13062m;
                    this.f41337x = 4;
                    objM34386c = c12328g2.m34386c(this);
                    if (objM34386c != enumC31071a) {
                        this.f41338y = null;
                        this.f41336w = null;
                        this.f41337x = 5;
                        if (interfaceC13062m.emit(objM34386c, this) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
            } else {
                C12329h.this.logger.mo85226q("Blank path, skipping the fetch", new AbstractC30556a.a[0]);
                InterfaceC12326e.b bVar = InterfaceC12326e.b.f41280a;
                this.f41338y = null;
                this.f41337x = 2;
                if (interfaceC13062m.emit(bVar, this) != enumC31071a) {
                    return c23454a0;
                }
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: ds0.h$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41340w;

        /* JADX INFO: renamed from: ds0.h$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41341w;

            /* JADX INFO: renamed from: ds0.h$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsInteractor$loads$$inlined$filterIsInstance$1$2", m100430f = "ReactionsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41483a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f41343F;

                /* JADX INFO: renamed from: G */
                Object f41344G;

                /* JADX INFO: renamed from: H */
                int f41345H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41346w;

                /* JADX INFO: renamed from: x */
                int f41347x;

                /* JADX INFO: renamed from: y */
                Object f41348y;

                /* JADX INFO: renamed from: z */
                Object f41349z;

                public C41483a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41346w = obj;
                    this.f41347x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f41341w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41483a c41483a;
                if (interfaceC30057d instanceof C41483a) {
                    c41483a = (C41483a) interfaceC30057d;
                    int i13 = c41483a.f41347x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41483a.f41347x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41483a = new C41483a(interfaceC30057d);
                    }
                } else {
                    c41483a = new C41483a(interfaceC30057d);
                }
                Object obj2 = c41483a.f41346w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41483a.f41347x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41341w;
                    if (obj instanceof InterfaceC12325d.e) {
                        c41483a.f41348y = null;
                        c41483a.f41349z = null;
                        c41483a.f41343F = null;
                        c41483a.f41344G = null;
                        c41483a.f41345H = 0;
                        c41483a.f41347x = 1;
                        if (interfaceC13062m.emit(obj, c41483a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f41340w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41340w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ds0.h$e */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsInteractor$loads$$inlined$flatMapLatest$1", m100430f = "ReactionsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f41350w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f41351x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f41352y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12329h f41353z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C12329h c12329h) {
            super(3, interfaceC30057d);
            this.f41353z = c12329h;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC12325d.e eVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar2 = new e(interfaceC30057d, this.f41353z);
            eVar2.f41351x = interfaceC13062m;
            eVar2.f41352y = eVar;
            return eVar2.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41350w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f41351x;
                InterfaceC12325d.e eVar = (InterfaceC12325d.e) this.f41352y;
                if (!(eVar instanceof InterfaceC12325d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM34406q = this.f41353z.m34406q((InterfaceC12325d.a) eVar);
                this.f41351x = null;
                this.f41352y = null;
                this.f41350w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM34406q, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC12325d.e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ds0.h$f */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41354w;

        /* JADX INFO: renamed from: ds0.h$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41355w;

            /* JADX INFO: renamed from: ds0.h$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsInteractor$presentations$$inlined$filterIsInstance$1$2", m100430f = "ReactionsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41484a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f41357F;

                /* JADX INFO: renamed from: G */
                Object f41358G;

                /* JADX INFO: renamed from: H */
                int f41359H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41360w;

                /* JADX INFO: renamed from: x */
                int f41361x;

                /* JADX INFO: renamed from: y */
                Object f41362y;

                /* JADX INFO: renamed from: z */
                Object f41363z;

                public C41484a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41360w = obj;
                    this.f41361x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f41355w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41484a c41484a;
                if (interfaceC30057d instanceof C41484a) {
                    c41484a = (C41484a) interfaceC30057d;
                    int i13 = c41484a.f41361x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41484a.f41361x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41484a = new C41484a(interfaceC30057d);
                    }
                } else {
                    c41484a = new C41484a(interfaceC30057d);
                }
                Object obj2 = c41484a.f41360w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41484a.f41361x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41355w;
                    if (obj instanceof InterfaceC12325d.h) {
                        c41484a.f41362y = null;
                        c41484a.f41363z = null;
                        c41484a.f41357F = null;
                        c41484a.f41358G = null;
                        c41484a.f41359H = 0;
                        c41484a.f41361x = 1;
                        if (interfaceC13062m.emit(obj, c41484a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f41354w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41354w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ds0.h$g */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41364w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12329h f41365x;

        /* JADX INFO: renamed from: ds0.h$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41366w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12329h f41367x;

            /* JADX INFO: renamed from: ds0.h$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsInteractor$presentations$$inlined$mapNotNull$1$2", m100430f = "ReactionsInteractor.kt", m100431l = {57}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41485a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41368E;

                /* JADX INFO: renamed from: F */
                Object f41369F;

                /* JADX INFO: renamed from: G */
                Object f41370G;

                /* JADX INFO: renamed from: H */
                Object f41371H;

                /* JADX INFO: renamed from: I */
                int f41372I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41373w;

                /* JADX INFO: renamed from: x */
                int f41374x;

                /* JADX INFO: renamed from: y */
                Object f41375y;

                public C41485a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41373w = obj;
                    this.f41374x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12329h c12329h) {
                this.f41366w = interfaceC13062m;
                this.f41367x = c12329h;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41485a c41485a;
                Object aVar;
                if (interfaceC30057d instanceof C41485a) {
                    c41485a = (C41485a) interfaceC30057d;
                    int i13 = c41485a.f41374x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41485a.f41374x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41485a = new C41485a(interfaceC30057d);
                    }
                } else {
                    c41485a = new C41485a(interfaceC30057d);
                }
                Object obj2 = c41485a.f41373w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41485a.f41374x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41366w;
                    InterfaceC12325d.h hVar = (InterfaceC12325d.h) obj;
                    if (hVar instanceof InterfaceC12325d.b) {
                        aVar = this.f41367x.m34409t((InterfaceC12325d.b) hVar);
                    } else if (hVar instanceof InterfaceC12325d.i) {
                        aVar = this.f41367x.m34410u((InterfaceC12325d.i) hVar);
                    } else if (AbstractC22676k.m65745e(hVar, InterfaceC12325d.d.f41270a)) {
                        aVar = InterfaceC12326e.e.f41284a;
                    } else {
                        if (!AbstractC22676k.m65745e(hVar, InterfaceC12325d.c.f41269a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = new InterfaceC12326e.a(null);
                    }
                    if (aVar != null) {
                        c41485a.f41375y = null;
                        c41485a.f41368E = null;
                        c41485a.f41369F = null;
                        c41485a.f41370G = null;
                        c41485a.f41371H = null;
                        c41485a.f41372I = 0;
                        c41485a.f41374x = 1;
                        if (interfaceC13062m.emit(aVar, c41485a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C12329h c12329h) {
            this.f41364w = interfaceC13058l;
            this.f41365x = c12329h;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41364w.collect(new a(interfaceC13062m, this.f41365x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ds0.h$h */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41377w;

        /* JADX INFO: renamed from: ds0.h$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41378w;

            /* JADX INFO: renamed from: ds0.h$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsInteractor$sendActions$$inlined$filterIsInstance$1$2", m100430f = "ReactionsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41486a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f41380F;

                /* JADX INFO: renamed from: G */
                Object f41381G;

                /* JADX INFO: renamed from: H */
                int f41382H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41383w;

                /* JADX INFO: renamed from: x */
                int f41384x;

                /* JADX INFO: renamed from: y */
                Object f41385y;

                /* JADX INFO: renamed from: z */
                Object f41386z;

                public C41486a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41383w = obj;
                    this.f41384x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f41378w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41486a c41486a;
                if (interfaceC30057d instanceof C41486a) {
                    c41486a = (C41486a) interfaceC30057d;
                    int i13 = c41486a.f41384x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41486a.f41384x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41486a = new C41486a(interfaceC30057d);
                    }
                } else {
                    c41486a = new C41486a(interfaceC30057d);
                }
                Object obj2 = c41486a.f41383w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41486a.f41384x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41378w;
                    if (obj instanceof InterfaceC12325d.f) {
                        c41486a.f41385y = null;
                        c41486a.f41386z = null;
                        c41486a.f41380F = null;
                        c41486a.f41381G = null;
                        c41486a.f41382H = 0;
                        c41486a.f41384x = 1;
                        if (interfaceC13062m.emit(obj, c41486a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l) {
            this.f41377w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41377w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ds0.h$i */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41387w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12329h f41388x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13075p1 f41389y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14743c f41390z;

        /* JADX INFO: renamed from: ds0.h$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41391w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12329h f41392x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13075p1 f41393y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C14743c f41394z;

            /* JADX INFO: renamed from: ds0.h$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.ReactionsInteractor$sendActions$$inlined$map$1$2", m100430f = "ReactionsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41487a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41395E;

                /* JADX INFO: renamed from: F */
                Object f41396F;

                /* JADX INFO: renamed from: G */
                Object f41397G;

                /* JADX INFO: renamed from: H */
                int f41398H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41399w;

                /* JADX INFO: renamed from: x */
                int f41400x;

                /* JADX INFO: renamed from: y */
                Object f41401y;

                public C41487a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41399w = obj;
                    this.f41400x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12329h c12329h, InterfaceC13075p1 interfaceC13075p1, C14743c c14743c) {
                this.f41391w = interfaceC13062m;
                this.f41392x = c12329h;
                this.f41393y = interfaceC13075p1;
                this.f41394z = c14743c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41487a c41487a;
                Object aVar;
                C13045h2 c13045h2;
                Object value;
                C13045h2 c13045h3;
                Object value2;
                if (interfaceC30057d instanceof C41487a) {
                    c41487a = (C41487a) interfaceC30057d;
                    int i13 = c41487a.f41400x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41487a.f41400x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41487a = new C41487a(interfaceC30057d);
                    }
                } else {
                    c41487a = new C41487a(interfaceC30057d);
                }
                Object obj2 = c41487a.f41399w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41487a.f41400x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41391w;
                    InterfaceC12325d.f fVar = (InterfaceC12325d.f) obj;
                    if (fVar instanceof InterfaceC12325d.k) {
                        InterfaceC12325d.k kVar = (InterfaceC12325d.k) fVar;
                        InterfaceC12323b.c cVar = new InterfaceC12323b.c(kVar.getEmoji());
                        UpdateAction updateActionM34415z = this.f41392x.m34415z(kVar.getInteraction());
                        if (updateActionM34415z != null && !((C12327f) ((C13045h2) this.f41393y).getValue()).m34381i().contains(kVar.getEmoji())) {
                            InterfaceC13075p1 interfaceC13075p1 = this.f41393y;
                            do {
                                c13045h3 = (C13045h2) interfaceC13075p1;
                                value2 = c13045h3.getValue();
                            } while (!c13045h3.m36569i(value2, this.f41392x.m34391C((C12327f) value2, kVar.getEmoji(), this.f41394z.m42277c(), cVar)));
                        }
                        aVar = new InterfaceC14741a.a(cVar, updateActionM34415z);
                    } else if (fVar instanceof InterfaceC12325d.l) {
                        InterfaceC12325d.l lVar = (InterfaceC12325d.l) fVar;
                        InterfaceC12323b.a aVarM42275a = this.f41394z.m42275a(lVar.getText());
                        ReactionsInputModel latestInput = ((C12327f) ((C13045h2) this.f41393y).getValue()).getLatestInput();
                        UpdateAction updateActionM34414y = latestInput != null ? this.f41392x.m34414y(latestInput, lVar.getText()) : null;
                        if (updateActionM34414y != null) {
                            InterfaceC13075p1 interfaceC13075p2 = this.f41393y;
                            do {
                                c13045h2 = (C13045h2) interfaceC13075p2;
                                value = c13045h2.getValue();
                            } while (!c13045h2.m36569i(value, this.f41392x.m34390B((C12327f) value, aVarM42275a)));
                        }
                        aVar = new InterfaceC14741a.a(aVarM42275a, updateActionM34414y);
                    } else if (fVar instanceof InterfaceC12325d.g) {
                        InterfaceC12323b.b bVarM42276b = this.f41394z.m42276b();
                        Action action = ((InterfaceC12325d.g) fVar).getAction();
                        aVar = new InterfaceC14741a.a(bVarM42276b, action instanceof UpdateAction ? (UpdateAction) action : null);
                    } else {
                        if (!(fVar instanceof InterfaceC12325d.j)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = InterfaceC14741a.b.f54480a;
                    }
                    c41487a.f41401y = null;
                    c41487a.f41395E = null;
                    c41487a.f41396F = null;
                    c41487a.f41397G = null;
                    c41487a.f41398H = 0;
                    c41487a.f41400x = 1;
                    if (interfaceC13062m.emit(aVar, c41487a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l, C12329h c12329h, InterfaceC13075p1 interfaceC13075p1, C14743c c14743c) {
            this.f41387w = interfaceC13058l;
            this.f41388x = c12329h;
            this.f41389y = interfaceC13075p1;
            this.f41390z = c14743c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41387w.collect(new a(interfaceC13062m, this.f41388x, this.f41389y, this.f41390z), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C12329h(C12328g fetcher, C14742b sendInteractor, AbstractC0757c json, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(fetcher, "fetcher");
        AbstractC22676k.m65750j(sendInteractor, "sendInteractor");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(logger, "logger");
        this.fetcher = fetcher;
        this.sendInteractor = sendInteractor;
        this.json = json;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final C12327f m34389A(C12327f c12327f, InterfaceC12326e interfaceC12326e) {
        if (interfaceC12326e instanceof InterfaceC12326e.d) {
            return C12327f.m34373b(c12327f, true, false, null, null, null, null, null, C25271y.f99162w, 24, null);
        }
        if (interfaceC12326e instanceof InterfaceC12326e.c) {
            return m34407r(c12327f, (InterfaceC12326e.c) interfaceC12326e);
        }
        if (interfaceC12326e instanceof InterfaceC12326e.b) {
            return C12327f.m34373b(c12327f, false, true, null, null, null, null, null, null, 156, null);
        }
        if (interfaceC12326e instanceof InterfaceC12326e.h) {
            return C12327f.m34373b(c12327f, false, false, null, null, AbstractC12350b.m34555D(((InterfaceC12326e.h) interfaceC12326e).getKey(), c12327f.m34377e()), null, null, null, 239, null);
        }
        if (interfaceC12326e instanceof InterfaceC12326e.g) {
            return m34405p(c12327f, ((InterfaceC12326e.g) interfaceC12326e).getKey());
        }
        if (interfaceC12326e instanceof InterfaceC12326e.f) {
            return C12327f.m34373b(c12327f, false, false, null, null, null, ((InterfaceC12326e.f) interfaceC12326e).getModal(), null, null, 223, null);
        }
        if (interfaceC12326e instanceof InterfaceC12326e.e) {
            return C12327f.m34373b(c12327f, false, false, null, null, null, null, null, null, 223, null);
        }
        if (interfaceC12326e instanceof InterfaceC12326e.a) {
            return C12327f.m34373b(c12327f, false, false, null, null, null, null, ((InterfaceC12326e.a) interfaceC12326e).getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), null, 191, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final C12327f m34390B(C12327f c12327f, InterfaceC12323b.a aVar) {
        return C12327f.m34373b(c12327f, false, false, null, null, null, null, null, AbstractC25265s.m74128f1(new C12324c(aVar.getSubmissionId(), aVar.getText(), null, 4, null), c12327f.m34380h()), 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final C12327f m34391C(C12327f c12327f, String str, long j7, InterfaceC12323b.c cVar) {
        return C12327f.m34373b(c12327f, false, false, null, null, AbstractC12350b.m34555D(cVar, c12327f.m34377e()), null, null, AbstractC25265s.m74128f1(new C12324c(j7, str, EnumC13588a.EMOJI_LARGE), c12327f.m34380h()), 111, null);
    }

    /* JADX INFO: renamed from: p */
    private final C12327f m34405p(C12327f c12327f, InterfaceC12323b interfaceC12323b) {
        return C12327f.m34373b(c12327f, false, false, null, null, AbstractC12350b.m34604y(interfaceC12323b, c12327f.m34377e()), null, null, null, 239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC13058l m34406q(InterfaceC12325d.a action) {
        return new C13084s1(new c(action, null));
    }

    /* JADX INFO: renamed from: r */
    private final C12327f m34407r(C12327f c12327f, InterfaceC12326e.c cVar) {
        List list;
        ReactionsResponse data = cVar.getData();
        Set<Long> setM34367c = cVar.m34367c();
        if (setM34367c == null) {
            list = C25271y.f99162w;
        } else {
            List<C12324c> listM34380h = c12327f.m34380h();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM34380h) {
                if (!setM34367c.contains(Long.valueOf(((C12324c) obj).getSubmissionId()))) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        return C12327f.m34373b(c12327f, false, false, data, data.getInput(), null, null, null, list, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final InterfaceC13058l m34408s(InterfaceC13058l interfaceC13058l) {
        return AbstractC13091v.m36590P(new d(interfaceC13058l), new e(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final InterfaceC12326e m34409t(InterfaceC12325d.b bVar) {
        AnyModal anyModalM34417b = AbstractC12330i.m34417b(bVar.getInteraction(), this.json);
        if (anyModalM34417b != null) {
            return new InterfaceC12326e.f(anyModalM34417b);
        }
        this.logger.mo85226q("Comment long-press did not decode to a modal this bar can present, ignoring", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final InterfaceC12326e m34410u(InterfaceC12325d.i iVar) {
        if (AbstractC12330i.m34416a(iVar.getModal())) {
            return new InterfaceC12326e.f(iVar.getModal());
        }
        this.logger.mo85226q("A button on the open modal asked for a modal this bar cannot draw, ignoring", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final InterfaceC13058l m34411v(InterfaceC13058l interfaceC13058l) {
        return new g(new f(interfaceC13058l), this);
    }

    /* JADX INFO: renamed from: w */
    private final InterfaceC13058l m34412w(InterfaceC13058l interfaceC13058l, InterfaceC13075p1 interfaceC13075p1) {
        return new i(new h(interfaceC13058l), this, interfaceC13075p1, new C14743c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final InterfaceC13058l m34413x(InterfaceC13058l interfaceC13058l, InterfaceC13075p1 interfaceC13075p1) {
        return this.sendInteractor.m42261m(m34412w(interfaceC13058l, interfaceC13075p1), interfaceC13075p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final UpdateAction m34414y(ReactionsInputModel reactionsInputModel, String str) {
        return m34415z(reactionsInputModel.bind(AbstractC25247g0.m73989X(new C23465k(reactionsInputModel.getStateUpdateValueKey(), str))).getSubmitAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final UpdateAction m34415z(GenericInteraction genericInteraction) {
        DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(genericInteraction, this.json);
        Action action = decodedGenericInteraction != null ? decodedGenericInteraction.getAction() : null;
        if (action instanceof UpdateAction) {
            return (UpdateAction) action;
        }
        return null;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new b(upstream, null));
    }

    public /* synthetic */ C12329h(C12328g c12328g, C14742b c14742b, AbstractC0757c abstractC0757c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12328g, c14742b, abstractC0757c, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ReactionsInteractor") : interfaceC34116n);
    }
}
