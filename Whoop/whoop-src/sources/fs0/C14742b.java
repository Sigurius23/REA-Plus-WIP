package fs0;

import ad3.AbstractC0757c;
import c93.InterfaceC4351m;
import ch.C4594o;
import com.mapbox.common.HttpHeaders;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.UpdateAction;
import d13.AbstractC11478a;
import ds0.C12328g;
import ds0.InterfaceC12322a;
import ds0.InterfaceC12323b;
import ds0.InterfaceC12326e;
import ec3.AbstractC13091v;
import ec3.AbstractC13095w0;
import ec3.C13015a0;
import ec3.C13042h;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13084s1;
import ec3.C13100y;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import m83.C25235a0;
import p003a1.C0109h;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: fs0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001'B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u0013*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00182\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u00020\u0010*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0018\u00105\u001a\u00020\u0010*\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m65681d2 = {"Lfs0/b;", "", "Lqw2/c;", "actionInteractor", "Lds0/g;", "fetcher", "Lad3/c;", "json", "Ltr2/n;", "logger", "<init>", "(Lqw2/c;Lds0/g;Lad3/c;Ltr2/n;)V", "Lec3/p1;", "", "Lds0/b;", "key", "", "j", "(Lec3/p1;Lds0/b;)Z", "Ll83/a0;", "o", "(Lec3/p1;Lds0/b;)V", "Lcom/whoop/whoopaction/domain/models/UpdateAction;", "performable", "Lec3/l;", "Lds0/e;", "n", "(Lds0/b;Lcom/whoop/whoopaction/domain/models/UpdateAction;)Lec3/l;", "Lcom/whoop/whoopaction/domain/models/Action;", "Lqw2/b;", "p", "(Lcom/whoop/whoopaction/domain/models/Action;)Lec3/l;", "Lfs0/a;", "upstream", "Lec3/f2;", "Lds0/f;", "reactionsState", "m", "(Lec3/l;Lec3/f2;)Lec3/l;", "a", "Lqw2/c;", "b", "Lds0/g;", "c", "Lad3/c;", "d", "Ltr2/n;", "k", "(Lqw2/b;)Z", "saved", "Lds0/e$g;", "l", "(Lds0/e$g;)Z", "shouldRefetch", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14742b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12328g fetcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fs0.b$a */
    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016¨\u0006#"}, m65681d2 = {"Lfs0/b$a;", "", "Lec3/f2;", "Lds0/f;", "reactionsState", "<init>", "(Lfs0/b;Lec3/f2;)V", "Lfs0/a$a;", "request", "Lec3/l;", "Lds0/e;", "a", "(Lfs0/a$a;Lq83/d;)Ljava/lang/Object;", "Lfs0/a;", "upstream", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/l;)Lec3/l;", "g", "()Lec3/l;", "Lec3/f2;", "Lec3/o1;", "b", "Lec3/o1;", "f", "()Lec3/o1;", "announcements", "Lec3/p1;", "", "Lds0/b;", "c", "Lec3/p1;", "inFlight", "Ll83/a0;", "d", "refreshes", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC13037f2 reactionsState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC13072o1 announcements;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC13075p1 inFlight;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC13072o1 refreshes;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C14742b f54489e;

        /* JADX INFO: renamed from: fs0.b$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$SendQueue", m100430f = "ReactionsSendInteractor.kt", m100431l = {93}, m100432m = HttpHeaders.ACCEPT, m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41602a extends AbstractC32269c {

            /* JADX INFO: renamed from: F */
            int f54491F;

            /* JADX INFO: renamed from: w */
            Object f54492w;

            /* JADX INFO: renamed from: x */
            Object f54493x;

            /* JADX INFO: renamed from: y */
            Object f54494y;

            /* JADX INFO: renamed from: z */
            /* synthetic */ Object f54495z;

            public C41602a(InterfaceC30057d<? super C41602a> interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f54495z = obj;
                this.f54491F |= Integer.MIN_VALUE;
                return a.this.m42262a(null, this);
            }
        }

        /* JADX INFO: renamed from: fs0.b$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$SendQueue$accept$2", m100430f = "ReactionsSendInteractor.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lds0/e;", "result", "Ll83/a0;", "<anonymous>", "(Lds0/e;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f54496w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f54497x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C14742b f54498y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ a f54499z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C14742b c14742b, a aVar, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f54498y = c14742b;
                this.f54499z = aVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                b bVar = new b(this.f54498y, this.f54499z, interfaceC30057d);
                bVar.f54497x = obj;
                return bVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC12326e interfaceC12326e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC12326e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC12326e interfaceC12326e = (InterfaceC12326e) this.f54497x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f54496w;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if ((interfaceC12326e instanceof InterfaceC12326e.g) && this.f54498y.m42257l((InterfaceC12326e.g) interfaceC12326e)) {
                        InterfaceC13072o1 interfaceC13072o1 = this.f54499z.refreshes;
                        this.f54497x = null;
                        this.f54496w = 1;
                        if (interfaceC13072o1.emit(c23454a0, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            }
        }

        /* JADX INFO: renamed from: fs0.b$a$c */
        @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$SendQueue$accept$3", m100430f = "ReactionsSendInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lds0/e;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class c extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f54500w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14742b f54501x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ a f54502y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC12323b f54503z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C14742b c14742b, a aVar, InterfaceC12323b interfaceC12323b, InterfaceC30057d<? super c> interfaceC30057d) {
                super(3, interfaceC30057d);
                this.f54501x = c14742b;
                this.f54502y = aVar;
                this.f54503z = interfaceC12323b;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return new c(this.f54501x, this.f54502y, this.f54503z, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f54500w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f54501x.m42259o(this.f54502y.inFlight, this.f54503z);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: fs0.b$a$d */
        @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$SendQueue$refetches$$inlined$flatMapLatest$1", m100430f = "ReactionsSendInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class d extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C14742b f54504E;

            /* JADX INFO: renamed from: w */
            int f54505w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f54506x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f54507y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ a f54508z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(InterfaceC30057d interfaceC30057d, a aVar, C14742b c14742b) {
                super(3, interfaceC30057d);
                this.f54508z = aVar;
                this.f54504E = c14742b;
            }

            public final Object invoke(InterfaceC13062m interfaceC13062m, C23454a0 c23454a0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                d dVar = new d(interfaceC30057d, this.f54508z, this.f54504E);
                dVar.f54506x = interfaceC13062m;
                dVar.f54507y = c23454a0;
                return dVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f54505w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f54506x;
                    C13084s1 c13084s1 = new C13084s1(this.f54508z.new e(this.f54504E, null));
                    this.f54506x = null;
                    this.f54507y = null;
                    this.f54505w = 1;
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
                return invoke((InterfaceC13062m) obj, (C23454a0) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
            }
        }

        /* JADX INFO: renamed from: fs0.b$a$e */
        @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$SendQueue$refetches$1$1", m100430f = "ReactionsSendInteractor.kt", m100431l = {77, 79, 79}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lds0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class e extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            private /* synthetic */ Object f54509E;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ C14742b f54511G;

            /* JADX INFO: renamed from: w */
            Object f54512w;

            /* JADX INFO: renamed from: x */
            Object f54513x;

            /* JADX INFO: renamed from: y */
            int f54514y;

            /* JADX INFO: renamed from: z */
            int f54515z;

            /* JADX INFO: renamed from: fs0.b$a$e$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$SendQueue$refetches$1$1$1", m100430f = "ReactionsSendInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Lds0/b;", "it", "", "<anonymous>", "(Ljava/util/Set;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41603a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f54516w;

                /* JADX INFO: renamed from: x */
                /* synthetic */ Object f54517x;

                public C41603a(InterfaceC30057d<? super C41603a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    C41603a c41603a = new C41603a(interfaceC30057d);
                    c41603a.f54517x = obj;
                    return c41603a;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    Set set = (Set) this.f54517x;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    if (this.f54516w != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return Boolean.valueOf(set.isEmpty());
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(Set<? extends InterfaceC12323b> set, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                    return ((C41603a) create(set, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C14742b c14742b, InterfaceC30057d<? super e> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f54511G = c14742b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                e eVar = a.this.new e(this.f54511G, interfaceC30057d);
                eVar.f54509E = obj;
                return eVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
            
                if (r0.emit(r11, r10) == r1) goto L26;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = r10.f54509E
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r10.f54515z
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L35
                    if (r2 == r5) goto L31
                    if (r2 == r4) goto L29
                    if (r2 != r3) goto L21
                    java.lang.Object r0 = r10.f54513x
                    ds0.e$c r0 = (ds0.InterfaceC12326e.c) r0
                    java.lang.Object r0 = r10.f54512w
                    java.util.Set r0 = (java.util.Set) r0
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto Lb9
                L21:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L29:
                    java.lang.Object r2 = r10.f54512w
                    java.util.Set r2 = (java.util.Set) r2
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L9f
                L31:
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L4e
                L35:
                    p505ts.AbstractC34132o.m107864I(r11)
                    fs0.b$a r11 = fs0.C14742b.a.this
                    ec3.p1 r11 = fs0.C14742b.a.m42264c(r11)
                    fs0.b$a$e$a r2 = new fs0.b$a$e$a
                    r2.<init>(r6)
                    r10.f54509E = r0
                    r10.f54515z = r5
                    java.lang.Object r11 = ec3.AbstractC13091v.m36616z(r11, r2, r10)
                    if (r11 != r1) goto L4e
                    goto Lb8
                L4e:
                    fs0.b$a r11 = fs0.C14742b.a.this
                    ec3.f2 r11 = fs0.C14742b.a.m42265d(r11)
                    java.lang.Object r11 = r11.getValue()
                    ds0.f r11 = (ds0.C12327f) r11
                    java.util.List r11 = r11.m34380h()
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r7 = 10
                    int r7 = m83.AbstractC25267u.m74163i0(r11, r7)
                    r2.<init>(r7)
                    java.util.Iterator r11 = r11.iterator()
                L6f:
                    boolean r7 = r11.hasNext()
                    if (r7 == 0) goto L88
                    java.lang.Object r7 = r11.next()
                    ds0.c r7 = (ds0.C12324c) r7
                    long r7 = r7.getSubmissionId()
                    java.lang.Long r9 = new java.lang.Long
                    r9.<init>(r7)
                    r2.add(r9)
                    goto L6f
                L88:
                    java.util.Set r2 = m83.AbstractC25265s.m74103I1(r2)
                    fs0.b r11 = r10.f54511G
                    ds0.g r11 = fs0.C14742b.m42247b(r11)
                    r10.f54509E = r0
                    r10.f54512w = r2
                    r10.f54515z = r4
                    java.lang.Object r11 = r11.m34388e(r10)
                    if (r11 != r1) goto L9f
                    goto Lb8
                L9f:
                    ds0.e$c r11 = (ds0.InterfaceC12326e.c) r11
                    if (r11 == 0) goto Lb9
                    ds0.e$c r11 = ds0.InterfaceC12326e.c.m34365b(r11, r6, r2, r5, r6)
                    r10.f54509E = r6
                    r10.f54512w = r6
                    r10.f54513x = r6
                    r2 = 0
                    r10.f54514y = r2
                    r10.f54515z = r3
                    java.lang.Object r11 = r0.emit(r11, r10)
                    if (r11 != r1) goto Lb9
                Lb8:
                    return r1
                Lb9:
                    l83.a0 r11 = l83.C23454a0.f92919a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: fs0.C14742b.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: fs0.b$a$f */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class f implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f54518w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ a f54519x;

            /* JADX INFO: renamed from: fs0.b$a$f$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41604a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f54520w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ a f54521x;

                /* JADX INFO: renamed from: fs0.b$a$f$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$SendQueue$sends$$inlined$mapNotNull$1$2", m100430f = "ReactionsSendInteractor.kt", m100431l = {52, 54, 59}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41605a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f54522E;

                    /* JADX INFO: renamed from: F */
                    Object f54523F;

                    /* JADX INFO: renamed from: G */
                    Object f54524G;

                    /* JADX INFO: renamed from: H */
                    Object f54525H;

                    /* JADX INFO: renamed from: I */
                    Object f54526I;

                    /* JADX INFO: renamed from: J */
                    int f54527J;

                    /* JADX INFO: renamed from: K */
                    int f54528K;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f54529w;

                    /* JADX INFO: renamed from: x */
                    int f54530x;

                    /* JADX INFO: renamed from: y */
                    Object f54531y;

                    public C41605a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f54529w = obj;
                        this.f54530x |= Integer.MIN_VALUE;
                        return C41604a.this.emit(null, this);
                    }
                }

                public C41604a(InterfaceC13062m interfaceC13062m, a aVar) {
                    this.f54520w = interfaceC13062m;
                    this.f54521x = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
                /* JADX WARN: Code duplicated, block: B:34:0x00d9 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41605a c41605a;
                    InterfaceC13062m interfaceC13062m;
                    int i13;
                    if (interfaceC30057d instanceof C41605a) {
                        c41605a = (C41605a) interfaceC30057d;
                        int i14 = c41605a.f54530x;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c41605a.f54530x = i14 - Integer.MIN_VALUE;
                        } else {
                            c41605a = new C41605a(interfaceC30057d);
                        }
                    } else {
                        c41605a = new C41605a(interfaceC30057d);
                    }
                    Object objM42262a = c41605a.f54529w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i15 = c41605a.f54530x;
                    C23454a0 c23454a0 = C23454a0.f92919a;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            i13 = c41605a.f54527J;
                            interfaceC13062m = (InterfaceC13062m) c41605a.f54524G;
                            AbstractC34132o.m107864I(objM42262a);
                            if (objM42262a != null) {
                                c41605a.f54531y = null;
                                c41605a.f54522E = null;
                                c41605a.f54523F = null;
                                c41605a.f54524G = null;
                                c41605a.f54525H = null;
                                c41605a.f54526I = null;
                                c41605a.f54527J = i13;
                                c41605a.f54530x = 3;
                                if (interfaceC13062m.emit(objM42262a, c41605a) == enumC31071a) {
                                    return enumC31071a;
                                }
                            }
                        } else if (i15 == 2) {
                            i13 = c41605a.f54527J;
                            interfaceC13062m = (InterfaceC13062m) c41605a.f54524G;
                            AbstractC34132o.m107864I(objM42262a);
                            objM42262a = null;
                            if (objM42262a != null) {
                                c41605a.f54531y = null;
                                c41605a.f54522E = null;
                                c41605a.f54523F = null;
                                c41605a.f54524G = null;
                                c41605a.f54525H = null;
                                c41605a.f54526I = null;
                                c41605a.f54527J = i13;
                                c41605a.f54530x = 3;
                                if (interfaceC13062m.emit(objM42262a, c41605a) == enumC31071a) {
                                    return enumC31071a;
                                }
                            }
                        } else {
                            if (i15 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(objM42262a);
                        }
                        return c23454a0;
                    }
                    AbstractC34132o.m107864I(objM42262a);
                    interfaceC13062m = this.f54520w;
                    InterfaceC14741a interfaceC14741a = (InterfaceC14741a) obj;
                    if (interfaceC14741a instanceof InterfaceC14741a.a) {
                        c41605a.f54531y = null;
                        c41605a.f54522E = null;
                        c41605a.f54523F = null;
                        c41605a.f54524G = interfaceC13062m;
                        c41605a.f54525H = null;
                        c41605a.f54526I = null;
                        c41605a.f54527J = 0;
                        c41605a.f54528K = 0;
                        c41605a.f54530x = 1;
                        objM42262a = this.f54521x.m42262a((InterfaceC14741a.a) interfaceC14741a, c41605a);
                        if (objM42262a != enumC31071a) {
                            i13 = 0;
                            if (objM42262a != null) {
                                c41605a.f54531y = null;
                                c41605a.f54522E = null;
                                c41605a.f54523F = null;
                                c41605a.f54524G = null;
                                c41605a.f54525H = null;
                                c41605a.f54526I = null;
                                c41605a.f54527J = i13;
                                c41605a.f54530x = 3;
                                if (interfaceC13062m.emit(objM42262a, c41605a) == enumC31071a) {
                                }
                            }
                            return c23454a0;
                        }
                    } else {
                        if (!AbstractC22676k.m65745e(interfaceC14741a, InterfaceC14741a.b.f54480a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC13072o1 interfaceC13072o1 = this.f54521x.refreshes;
                        c41605a.f54531y = null;
                        c41605a.f54522E = null;
                        c41605a.f54523F = null;
                        c41605a.f54524G = interfaceC13062m;
                        c41605a.f54525H = null;
                        c41605a.f54526I = null;
                        c41605a.f54527J = 0;
                        c41605a.f54528K = 0;
                        c41605a.f54530x = 2;
                        if (interfaceC13072o1.emit(c23454a0, c41605a) != enumC31071a) {
                            i13 = 0;
                            objM42262a = null;
                            if (objM42262a != null) {
                                c41605a.f54531y = null;
                                c41605a.f54522E = null;
                                c41605a.f54523F = null;
                                c41605a.f54524G = null;
                                c41605a.f54525H = null;
                                c41605a.f54526I = null;
                                c41605a.f54527J = i13;
                                c41605a.f54530x = 3;
                                if (interfaceC13062m.emit(objM42262a, c41605a) == enumC31071a) {
                                }
                            }
                            return c23454a0;
                        }
                    }
                    return enumC31071a;
                }
            }

            public f(InterfaceC13058l interfaceC13058l, a aVar) {
                this.f54518w = interfaceC13058l;
                this.f54519x = aVar;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f54518w.collect(new C41604a(interfaceC13062m, this.f54519x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public a(C14742b c14742b, InterfaceC13037f2 reactionsState) {
            AbstractC22676k.m65750j(reactionsState, "reactionsState");
            this.f54489e = c14742b;
            this.reactionsState = reactionsState;
            this.announcements = AbstractC13091v.m36592b(0, 1, null, 5);
            this.inFlight = AbstractC13091v.m36593c(C25235a0.f99113w);
            this.refreshes = AbstractC13091v.m36592b(1, 0, null, 6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        public final Object m42262a(InterfaceC14741a.a aVar, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            C41602a c41602a;
            UpdateAction action;
            InterfaceC12323b interfaceC12323b;
            if (interfaceC30057d instanceof C41602a) {
                c41602a = (C41602a) interfaceC30057d;
                int i13 = c41602a.f54491F;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c41602a.f54491F = i13 - Integer.MIN_VALUE;
                } else {
                    c41602a = new C41602a(interfaceC30057d);
                }
            } else {
                c41602a = new C41602a(interfaceC30057d);
            }
            Object obj = c41602a.f54495z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = c41602a.f54491F;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC12323b key = aVar.getKey();
                action = aVar.getAction();
                if (action == null) {
                    this.f54489e.logger.mo85226q(key + " has no action this bar can perform, ignoring", new AbstractC30556a.a[0]);
                    return null;
                }
                if (!this.f54489e.m42255j(this.inFlight, key)) {
                    this.f54489e.logger.mo85226q(key + " ignored, an identical one is already sending", new AbstractC30556a.a[0]);
                    return null;
                }
                InterfaceC13072o1 interfaceC13072o1 = this.announcements;
                InterfaceC12326e.h hVar = new InterfaceC12326e.h(key);
                c41602a.f54492w = null;
                c41602a.f54493x = key;
                c41602a.f54494y = action;
                c41602a.f54491F = 1;
                if (interfaceC13072o1.emit(hVar, c41602a) == enumC31071a) {
                    return enumC31071a;
                }
                interfaceC12323b = key;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                action = (UpdateAction) c41602a.f54494y;
                interfaceC12323b = (InterfaceC12323b) c41602a.f54493x;
                AbstractC34132o.m107864I(obj);
            }
            return new C13100y(new C13052j1(this.f54489e.m42258n(interfaceC12323b, action), new b(this.f54489e, this, null), 0), new c(this.f54489e, this, interfaceC12323b, null));
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC13072o1 getAnnouncements() {
            return this.announcements;
        }

        /* JADX INFO: renamed from: g */
        public final InterfaceC13058l m42268g() {
            return AbstractC13091v.m36590P(this.refreshes, new d(null, this, this.f54489e));
        }

        /* JADX INFO: renamed from: h */
        public final InterfaceC13058l m42269h(InterfaceC13058l upstream) {
            AbstractC22676k.m65750j(upstream, "upstream");
            InterfaceC13058l interfaceC13058lM36599i = AbstractC13091v.m36599i(new f(upstream, this), 0, 3);
            int i13 = AbstractC13095w0.f45249a;
            return new C4594o(interfaceC13058lM36599i, 1);
        }
    }

    /* JADX INFO: renamed from: fs0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$interact$1", m100430f = "ReactionsSendInteractor.kt", m100431l = {51}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lds0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC13037f2 f54533E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC13058l f54534F;

        /* JADX INFO: renamed from: w */
        Object f54535w;

        /* JADX INFO: renamed from: x */
        int f54536x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f54537y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13037f2 interfaceC13037f2, InterfaceC13058l interfaceC13058l, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f54533E = interfaceC13037f2;
            this.f54534F = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C14742b.this.new b(this.f54533E, this.f54534F, interfaceC30057d);
            bVar.f54537y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f54537y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54536x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                a aVar = new a(C14742b.this, this.f54533E);
                C13042h c13042hM36584J = AbstractC13091v.m36584J(aVar.getAnnouncements(), aVar.m42269h(this.f54534F), aVar.m42268g());
                this.f54537y = null;
                this.f54535w = null;
                this.f54536x = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13042hM36584J, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: fs0.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$performSend$1", m100430f = "ReactionsSendInteractor.kt", m100431l = {117, 128, 133, 137, 139, 144, 147, 151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lds0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f54539E;

        /* JADX INFO: renamed from: F */
        int f54540F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f54541G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC12323b f54542H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C14742b f54543I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ UpdateAction f54544J;

        /* JADX INFO: renamed from: w */
        Object f54545w;

        /* JADX INFO: renamed from: x */
        Object f54546x;

        /* JADX INFO: renamed from: y */
        Object f54547y;

        /* JADX INFO: renamed from: z */
        Object f54548z;

        /* JADX INFO: renamed from: fs0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC4351m f54549w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22669g0 f54550x;

            public a(InterfaceC4351m interfaceC4351m, C22669g0 c22669g0) {
                this.f54549w = interfaceC4351m;
                this.f54550x = c22669g0;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC30694b abstractC30694b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                boolean z4 = abstractC30694b instanceof AbstractC30694b.c;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (z4 || (abstractC30694b instanceof AbstractC30694b.i)) {
                    Object objInvoke = this.f54549w.invoke(InterfaceC12322a.b.f41257a, interfaceC30057d);
                    return objInvoke == EnumC31071a.f128113w ? objInvoke : c23454a0;
                }
                this.f54550x.f89336w = abstractC30694b;
                return c23454a0;
            }
        }

        /* JADX INFO: renamed from: fs0.b$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$performSend$1$reportProgress$1", m100430f = "ReactionsSendInteractor.kt", m100431l = {111}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lds0/a;", "it", "Ll83/a0;", "<anonymous>", "(Lds0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f54551w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f54552x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f54553y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f54553y = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                b bVar = new b(this.f54553y, interfaceC30057d);
                bVar.f54552x = obj;
                return bVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC12322a interfaceC12322a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC12322a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC12322a interfaceC12322a = (InterfaceC12322a) this.f54552x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f54551w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f54553y;
                    InterfaceC12326e.a aVar = new InterfaceC12326e.a(interfaceC12322a);
                    this.f54552x = null;
                    this.f54551w = 1;
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

        /* JADX INFO: renamed from: fs0.b$c$c, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$performSend$1$reportProgress$2", m100430f = "ReactionsSendInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lds0/a;", "it", "Ll83/a0;", "<anonymous>", "(Lds0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41606c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f54554w;

            public C41606c(InterfaceC30057d<? super C41606c> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41606c(interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC12322a interfaceC12322a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41606c) create(interfaceC12322a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f54554w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC12323b interfaceC12323b, C14742b c14742b, UpdateAction updateAction, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f54542H = interfaceC12323b;
            this.f54543I = c14742b;
            this.f54544J = updateAction;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f54542H, this.f54543I, this.f54544J, interfaceC30057d);
            cVar.f54541G = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:22:0x0095  */
        /* JADX WARN: Code duplicated, block: B:25:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:27:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:30:0x0112  */
        /* JADX WARN: Code duplicated, block: B:32:0x0116  */
        /* JADX WARN: Code duplicated, block: B:35:0x0129  */
        /* JADX WARN: Code duplicated, block: B:38:0x013d  */
        /* JADX WARN: Code duplicated, block: B:41:0x0159  */
        /* JADX WARN: Code duplicated, block: B:43:0x0179  */
        /* JADX WARN: Code duplicated, block: B:45:0x0181  */
        /* JADX WARN: Code duplicated, block: B:48:0x0195  */
        /* JADX WARN: Code duplicated, block: B:51:0x01db A[PHI: r2
          0x01db: PHI (r2v13 kotlin.jvm.internal.g0) = 
          (r2v5 kotlin.jvm.internal.g0)
          (r2v5 kotlin.jvm.internal.g0)
          (r2v5 kotlin.jvm.internal.g0)
          (r2v5 kotlin.jvm.internal.g0)
          (r2v12 kotlin.jvm.internal.g0)
          (r2v25 kotlin.jvm.internal.g0)
         binds: [B:49:0x01d8, B:46:0x0192, B:28:0x010e, B:23:0x00c9, B:9:0x0039, B:42:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:53:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:56:0x01ee  */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0155, code lost:
        
            if (r0.emit(r2, r10) == r1) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0204, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L59;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:22:0x0095, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:27:0x00d1, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:41:0x0159, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:48:0x0195, please report this as an issue */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 544
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fs0.C14742b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: fs0.b$d */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$states$1", m100430f = "ReactionsSendInteractor.kt", m100431l = {156}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "state", "", "<anonymous>", "(Lec3/m;Lqw2/b;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f54555w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f54556x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f54557y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC30694b abstractC30694b, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f54556x = interfaceC13062m;
            dVar.f54557y = abstractC30694b;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f54556x;
            AbstractC30694b abstractC30694b = (AbstractC30694b) this.f54557y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54555w;
            boolean z4 = true;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f54556x = null;
                this.f54557y = abstractC30694b;
                this.f54555w = 1;
                if (interfaceC13062m.emit(abstractC30694b, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (!(abstractC30694b instanceof AbstractC30694b.c) && !(abstractC30694b instanceof AbstractC30694b.i)) {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: renamed from: fs0.b$e */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.domain.send.ReactionsSendInteractor$states$2", m100430f = "ReactionsSendInteractor.kt", m100431l = {162}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Action f54558E;

        /* JADX INFO: renamed from: w */
        int f54559w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f54560x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f54561y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Action action, InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f54558E = action;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = C14742b.this.new e(this.f54558E, interfaceC30057d);
            eVar.f54560x = interfaceC13062m;
            eVar.f54561y = th3;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f54560x;
            Throwable th3 = (Throwable) this.f54561y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54559w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (th3 instanceof CancellationException) {
                    throw th3;
                }
                C14742b.this.logger.mo85230v(AbstractC11478a.m30856h("Action ", this.f54558E, " threw"), th3, new AbstractC30556a.a[0]);
                String message = th3.getMessage();
                if (message == null) {
                    message = "";
                }
                AbstractC30694b.a aVar = new AbstractC30694b.a(message, this.f54558E, null, 4, null);
                this.f54560x = null;
                this.f54561y = null;
                this.f54559w = 1;
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

    public C14742b(C30695c actionInteractor, C12328g fetcher, AbstractC0757c json, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(fetcher, "fetcher");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(logger, "logger");
        this.actionInteractor = actionInteractor;
        this.fetcher = fetcher;
        this.json = json;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final boolean m42255j(InterfaceC13075p1 interfaceC13075p1, InterfaceC12323b interfaceC12323b) {
        C13045h2 c13045h2;
        Object value;
        Set set;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            set = (Set) value;
        } while (!c13045h2.m36569i(value, AbstractC12350b.m34555D(interfaceC12323b, set)));
        return !set.contains(interfaceC12323b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final boolean m42256k(AbstractC30694b abstractC30694b) {
        return (abstractC30694b instanceof AbstractC30694b.n) || (abstractC30694b instanceof AbstractC30694b.f) || (abstractC30694b instanceof AbstractC30694b.g) || (abstractC30694b instanceof AbstractC30694b.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final boolean m42257l(InterfaceC12326e.g gVar) {
        return gVar.getSaved() || (gVar.getKey() instanceof InterfaceC12323b.a) || (gVar.getKey() instanceof InterfaceC12323b.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m42258n(InterfaceC12323b key, UpdateAction performable) {
        return new C13084s1(new c(key, this, performable, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m42259o(InterfaceC13075p1 interfaceC13075p1, InterfaceC12323b interfaceC12323b) {
        C13045h2 c13045h2;
        Object value;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, AbstractC12350b.m34604y(interfaceC12323b, (Set) value)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC13058l m42260p(Action action) {
        return new C13015a0(new C13084s1(new C0109h(this.actionInteractor.interact(new C0456u(new C30698f(action), 1)), new d(null), (InterfaceC30057d) null)), new e(action, null));
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m42261m(InterfaceC13058l upstream, InterfaceC13037f2 reactionsState) {
        AbstractC22676k.m65750j(upstream, "upstream");
        AbstractC22676k.m65750j(reactionsState, "reactionsState");
        return new C13084s1(new b(reactionsState, upstream, null));
    }

    public /* synthetic */ C14742b(C30695c c30695c, C12328g c12328g, AbstractC0757c abstractC0757c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c30695c, c12328g, abstractC0757c, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ReactionsSendInteractor") : interfaceC34116n);
    }
}
