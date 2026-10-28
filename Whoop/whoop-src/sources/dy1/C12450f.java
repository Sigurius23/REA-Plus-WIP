package dy1;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c52.AbstractC4251b;
import c52.C4253d;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p031b9.AbstractC2875y;
import p100dw.C12397b;
import p100dw.C12398c;
import p100dw.C12400e;
import p100dw.InterfaceC12401f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import y42.InterfaceC39219a;

/* JADX INFO: renamed from: dy1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\b\u0005*\u0001B\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0014028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, m65681d2 = {"Ldy1/f;", "", "Ldy1/a;", "memfaultInitializer", "Lbc3/c0;", "coroutineScope", "Ldw/b;", "chunkSenderBuilder", "Ltr2/n;", "logger", "Ly42/a;", "puffin", "<init>", "(Ldy1/a;Lbc3/c0;Ldw/b;Ltr2/n;Ly42/a;)V", "Ll83/a0;", "p", "()V", "s", "q", "o", "", "chunk", "t", "([BLq83/d;)Ljava/lang/Object;", "u", "r", "a", "Ldy1/a;", "b", "Lbc3/c0;", "c", "Ldw/b;", "d", "Ltr2/n;", "e", "Ly42/a;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sendChunksInProgress", "Lbc3/k1;", "g", "Lbc3/k1;", "memfaultFlowJob", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "connectionStateJob", "Lmc3/a;", "i", "Lmc3/a;", "mutex", "", "j", "Ljava/util/List;", "chunksList", "Ldw/c;", "k", "Ldw/c;", "chunkSender", "Lec3/o1;", "l", "Lec3/o1;", "chunksFlow", "", "m", "J", "debounce", "dy1/f$a", "n", "Ldy1/f$a;", "chunkSendCallback", "memfault_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12450f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12445a memfaultInitializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C12397b chunkSenderBuilder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39219a puffin;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AtomicBoolean sendChunksInProgress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private InterfaceC3027k1 memfaultFlowJob;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private InterfaceC3027k1 connectionStateJob;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<byte[]> chunksList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private C12398c chunkSender;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC13072o1 chunksFlow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final long debounce;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final a chunkSendCallback;

    /* JADX INFO: renamed from: dy1.f$a */
    @Metadata(m65680d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"dy1/f$a", "Ldw/f;", "", "sent", "Ll83/a0;", "b", "(I)V", "", "delay", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "a", "(JILjava/lang/Exception;)V", "memfault_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC12401f {
        public a() {
        }

        @Override // p100dw.InterfaceC12401f
        /* JADX INFO: renamed from: a */
        public void mo34835a(long delay, int sent, Exception exception) {
            AbstractC22676k.m65750j(exception, "exception");
            C12450f.this.sendChunksInProgress.set(false);
            C12450f.this.logger.mo85213c("Something went wrong sending memfault chunks", exception, new AbstractC30556a.a[0]);
            C12450f.this.m35075p();
        }

        @Override // p100dw.InterfaceC12401f
        /* JADX INFO: renamed from: b */
        public void mo34836b(int sent) {
            C12450f.this.sendChunksInProgress.set(false);
            C12450f.this.logger.mo85228t(AbstractC2875y.m8296i(sent, "Finished sending ", " chunks"), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: dy1.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.PuffinMemfaultManager$collectChunkFlow$1", m100430f = "PuffinMemfaultManager.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42481w;

        /* JADX INFO: renamed from: dy1.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12450f f42483w;

            public a(C12450f c12450f) {
                this.f42483w = c12450f;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C23454a0 c23454a0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f42483w.m35079u();
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12450f.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42481w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36608r = AbstractC13091v.m36608r(C12450f.this.chunksFlow, C12450f.this.debounce);
                a aVar = new a(C12450f.this);
                this.f42481w = 1;
                if (interfaceC13058lM36608r.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dy1.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.PuffinMemfaultManager$collectNewMemfaultEvents$1", m100430f = "PuffinMemfaultManager.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42484w;

        /* JADX INFO: renamed from: dy1.f$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12450f f42486w;

            public a(C12450f c12450f) {
                this.f42486w = c12450f;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(byte[] bArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
                Object objM35078t = this.f42486w.m35078t(bArr, interfaceC30057d);
                return objM35078t == EnumC31071a.f128113w ? objM35078t : C23454a0.f92919a;
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12450f.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42484w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lMo124934M = C12450f.this.puffin.mo124934M();
                a aVar = new a(C12450f.this);
                this.f42484w = 1;
                if (interfaceC13058lMo124934M.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dy1.f$d */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.PuffinMemfaultManager$observePuffinState$1", m100430f = "PuffinMemfaultManager.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42487w;

        /* JADX INFO: renamed from: dy1.f$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12450f f42489w;

            public a(C12450f c12450f) {
                this.f42489w = c12450f;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC4251b abstractC4251b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.f.f17287a)) {
                    if (this.f42489w.chunkSender == null) {
                        this.f42489w.m35074o();
                    }
                    this.f42489w.m35076q();
                } else if (AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.c.f17284a)) {
                    this.f42489w.sendChunksInProgress.set(false);
                    this.f42489w.m35079u();
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12450f.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42487w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(C12450f.this.puffin.mo124937l());
                a aVar = new a(C12450f.this);
                this.f42487w = 1;
                if (interfaceC13058lM36610t.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dy1.f$e */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.PuffinMemfaultManager", m100430f = "PuffinMemfaultManager.kt", m100431l = {135, 98}, m100432m = "onChunkReceived", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f42490E;

        /* JADX INFO: renamed from: G */
        int f42492G;

        /* JADX INFO: renamed from: w */
        Object f42493w;

        /* JADX INFO: renamed from: x */
        Object f42494x;

        /* JADX INFO: renamed from: y */
        int f42495y;

        /* JADX INFO: renamed from: z */
        int f42496z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42490E = obj;
            this.f42492G |= Integer.MIN_VALUE;
            return C12450f.this.m35078t(null, this);
        }
    }

    /* JADX INFO: renamed from: dy1.f$f */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.PuffinMemfaultManager$sendChunks$1", m100430f = "PuffinMemfaultManager.kt", m100431l = {135}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f42498w;

        /* JADX INFO: renamed from: x */
        Object f42499x;

        /* JADX INFO: renamed from: y */
        int f42500y;

        /* JADX INFO: renamed from: z */
        int f42501z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12450f.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC25435a interfaceC25435a;
            C12450f c12450f;
            C12398c c12398c;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42501z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = C12450f.this.mutex;
                C12450f c12450f2 = C12450f.this;
                this.f42498w = interfaceC25435a;
                this.f42499x = c12450f2;
                this.f42500y = 0;
                this.f42501z = 1;
                if (interfaceC25435a.mo68211b(this) == enumC31071a) {
                    return enumC31071a;
                }
                c12450f = c12450f2;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c12450f = (C12450f) this.f42499x;
                interfaceC25435a = (InterfaceC25435a) this.f42498w;
                AbstractC34132o.m107864I(obj);
            }
            try {
                if (!c12450f.sendChunksInProgress.getAndSet(true) && (c12398c = c12450f.chunkSender) != null) {
                    c12398c.m34833a(c12450f.chunksList);
                    c12450f.chunksList.clear();
                    c12398c.m34834b(c12450f.chunkSendCallback);
                }
                return C23454a0.f92919a;
            } finally {
                interfaceC25435a.mo68214i(null);
            }
        }
    }

    public C12450f(C12445a c12445a, InterfaceC2994c0 interfaceC2994c0, C12397b c12397b, InterfaceC34116n interfaceC34116n, InterfaceC39219a interfaceC39219a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12445a, (i13 & 2) != 0 ? AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d())) : interfaceC2994c0, c12397b, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PuffinMemfaultManager") : interfaceC34116n, interfaceC39219a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m35074o() {
        C12400e c12400eM35021a = this.memfaultInitializer.m35021a();
        C4253d c4253dMo124935O = this.puffin.mo124935O();
        String serialNumber = c4253dMo124935O != null ? c4253dMo124935O.getSerialNumber() : null;
        if (c12400eM35021a != null && serialNumber != null) {
            C12397b c12397b = this.chunkSenderBuilder;
            c12397b.getClass();
            c12397b.f41988b = serialNumber;
            c12397b.f41987a = c12400eM35021a;
            this.chunkSender = c12397b.m34832a();
            return;
        }
        this.logger.mo85222m("Failed to initialize memfault cloud, memfaultCloud: " + c12400eM35021a + ", serial: " + serialNumber, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final void m35075p() {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m35076q() {
        InterfaceC3027k1 interfaceC3027k1 = this.memfaultFlowJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.memfaultFlowJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(null), 3);
    }

    /* JADX INFO: renamed from: s */
    private final void m35077s() {
        InterfaceC3027k1 interfaceC3027k1 = this.connectionStateJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.connectionStateJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m35078t(byte[] bArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        e eVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i14 = eVar.f42492G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f42492G = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f42490E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = eVar.f42492G;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.mutex;
                eVar.f42493w = bArr;
                eVar.f42494x = interfaceC25435a;
                eVar.f42495y = 0;
                eVar.f42492G = 1;
                if (interfaceC25435a.mo68211b(eVar) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) eVar.f42494x;
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a2.mo68214i(null);
                    return c23454a0;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            int i16 = eVar.f42495y;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) eVar.f42494x;
            byte[] bArr2 = (byte[]) eVar.f42493w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            i13 = i16;
            bArr = bArr2;
            this.chunksList.add(bArr);
            InterfaceC13072o1 interfaceC13072o1 = this.chunksFlow;
            eVar.f42493w = null;
            eVar.f42494x = interfaceC25435a;
            eVar.f42495y = i13;
            eVar.f42496z = 0;
            eVar.f42492G = 2;
            if (interfaceC13072o1.emit(c23454a0, eVar) != enumC31071a) {
                interfaceC25435a2 = interfaceC25435a;
                interfaceC25435a2.mo68214i(null);
                return c23454a0;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a4;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m35079u() {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new f(null), 3);
    }

    /* JADX INFO: renamed from: r */
    public final void m35080r() {
        m35077s();
        m35075p();
    }

    public C12450f(C12445a memfaultInitializer, InterfaceC2994c0 coroutineScope, C12397b chunkSenderBuilder, InterfaceC34116n logger, InterfaceC39219a puffin) {
        AbstractC22676k.m65750j(memfaultInitializer, "memfaultInitializer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(chunkSenderBuilder, "chunkSenderBuilder");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(puffin, "puffin");
        this.memfaultInitializer = memfaultInitializer;
        this.coroutineScope = coroutineScope;
        this.chunkSenderBuilder = chunkSenderBuilder;
        this.logger = logger;
        this.puffin = puffin;
        this.sendChunksInProgress = new AtomicBoolean(false);
        this.mutex = AbstractC25438d.m74669a();
        this.chunksList = new ArrayList();
        this.chunksFlow = AbstractC13091v.m36592b(0, 0, null, 7);
        this.debounce = 5000L;
        this.chunkSendCallback = new a();
    }
}
