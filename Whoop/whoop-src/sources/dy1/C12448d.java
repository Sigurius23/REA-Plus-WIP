package dy1;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import iu0.C20935a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jk0.InterfaceC21750d;
import ju0.InterfaceC21959a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25267u;
import m83.C25271y;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p100dw.C12397b;
import p100dw.C12398c;
import p100dw.C12400e;
import p100dw.InterfaceC12401f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.AbstractC32962f;
import st0.C32963g;
import st0.C32970n;
import tr2.InterfaceC34116n;
import ze1.AbstractC40586b;

/* JADX INFO: renamed from: dy1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001/\u0018\u0000 T2\u00020\u0001:\u0001UB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00120@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u0002030D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010<R$\u0010O\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bL\u00108\"\u0004\bM\u0010NR\u0016\u0010S\u001a\u0004\u0018\u00010P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006V"}, m65681d2 = {"Ldy1/d;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lci2/b;", "whoopStrapProvider", "Ldy1/b;", "memfaultInitializer", "Lbc3/c0;", "coroutineScope", "Ldw/b;", "chunkSenderBuilder", "Lju0/a;", "memfaultDao", "Ltr2/n;", "logger", "<init>", "(Lci2/b;Ldy1/b;Lbc3/c0;Ldw/b;Lju0/a;Ltr2/n;)V", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "", "chunk", "y", "([BLq83/d;)Ljava/lang/Object;", "v", "([B)V", "z", "(Lq83/d;)Ljava/lang/Object;", "B", "()V", "", "serialNumber", "Ldw/c;", "t", "(Ljava/lang/String;)Ldw/c;", "C", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lci2/b;", "x", "Ldy1/b;", "Lbc3/c0;", "Ldw/b;", "E", "Lju0/a;", "F", "Ltr2/n;", "dy1/d$b", "G", "Ldy1/d$b;", "chunkSendCallback", "", "H", "J", "debounce", "Lmc3/a;", "I", "Lmc3/a;", "mutex", "Lbc3/k1;", "Lbc3/k1;", "memfaultFlowJob", "K", "connectionStateJob", "Lec3/o1;", "L", "Lec3/o1;", "chunksFlow", "", "M", "Ljava/util/List;", "processedChunks", "N", "lastChunkSent", "", "value", "O", "A", "(I)V", "chunksSentRecently", "Ljk0/d;", "u", "()Ljk0/d;", "whoopStrap", "P", "a", "memfault_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12448d implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC21959a memfaultDao;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final b chunkSendCallback;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final long debounce;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private InterfaceC3027k1 memfaultFlowJob;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private InterfaceC3027k1 connectionStateJob;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC13072o1 chunksFlow;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final List<Long> processedChunks;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private InterfaceC3027k1 lastChunkSent;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private int chunksSentRecently;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C12446b memfaultInitializer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C12397b chunkSenderBuilder;

    /* JADX INFO: renamed from: dy1.d$b */
    @Metadata(m65680d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"dy1/d$b", "Ldw/f;", "", "sent", "Ll83/a0;", "b", "(I)V", "", "delay", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "a", "(JILjava/lang/Exception;)V", "memfault_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC12401f {

        /* JADX INFO: renamed from: dy1.d$b$a */
        /* JADX INFO: loaded from: classes9.dex */
        @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager$chunkSendCallback$1$onQueueEmpty$1", m100430f = "NewMemfaultManager.kt", m100431l = {48, 54, 58, 59}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f42417w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12448d f42418x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ int f42419y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12448d c12448d, int i13, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f42418x = c12448d;
                this.f42419y = i13;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f42418x, this.f42419y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC13072o1 interfaceC13072o1;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f42417w;
                C23454a0 c23454a0 = C23454a0.f92919a;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC21959a interfaceC21959a = this.f42418x.memfaultDao;
                        List<Long> list = this.f42418x.processedChunks;
                        this.f42417w = 1;
                        if (interfaceC21959a.mo62688b(list, this) == enumC31071a) {
                        }
                        return enumC31071a;
                    }
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                AbstractC34132o.m107864I(obj);
                                interfaceC13072o1 = this.f42418x.chunksFlow;
                                this.f42417w = 4;
                                if (interfaceC13072o1.emit(c23454a0, this) != enumC31071a) {
                                    return enumC31071a;
                                }
                            } else if (i13 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        AbstractC34132o.m107864I(obj);
                    } else {
                        AbstractC34132o.m107864I(obj);
                    }
                    return c23454a0;
                    this.f42418x.processedChunks.clear();
                    C12448d c12448d = this.f42418x;
                    c12448d.m35032A(c12448d.chunksSentRecently + this.f42419y);
                    if (this.f42419y == 100 && this.f42418x.chunksSentRecently + 100 < 1000) {
                        this.f42418x.logger.mo85216g("Triggering another upload", new AbstractC30556a.a[0]);
                        InterfaceC13072o1 interfaceC13072o2 = this.f42418x.chunksFlow;
                        this.f42417w = 2;
                        if (interfaceC13072o2.emit(c23454a0, this) == enumC31071a) {
                        }
                        return c23454a0;
                    }
                    this.f42418x.logger.mo85216g("Too many packets to upload, cooldown for 65000 ms", new AbstractC30556a.a[0]);
                    this.f42417w = 3;
                    if (AbstractC3034m0.m8782b(65000L, this) != enumC31071a) {
                        interfaceC13072o1 = this.f42418x.chunksFlow;
                        this.f42417w = 4;
                        if (interfaceC13072o1.emit(c23454a0, this) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                    return enumC31071a;
                } catch (Exception e5) {
                    this.f42418x.logger.mo85230v("Error deleting memfault packets", e5, new AbstractC30556a.a[0]);
                }
            }
        }

        /* JADX INFO: renamed from: dy1.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes9.dex */
        @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager$chunkSendCallback$1$onRetryAfterDelay$1", m100430f = "NewMemfaultManager.kt", m100431l = {70, 71}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41506b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f42420w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ long f42421x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C12448d f42422y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41506b(long j7, C12448d c12448d, InterfaceC30057d<? super C41506b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f42421x = j7;
                this.f42422y = c12448d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41506b(this.f42421x, this.f42422y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41506b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f42420w;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                }
                AbstractC34132o.m107864I(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(this.f42421x, DurationUnit.SECONDS);
                this.f42420w = 1;
                if (AbstractC3034m0.m8783c(duration, this) != enumC31071a) {
                }
                InterfaceC13072o1 interfaceC13072o1 = this.f42422y.chunksFlow;
                this.f42420w = 2;
                return interfaceC13072o1.emit(c23454a0, this) == enumC31071a ? enumC31071a : c23454a0;
            }
        }

        public b() {
        }

        @Override // p100dw.InterfaceC12401f
        /* JADX INFO: renamed from: a */
        public void mo34835a(long delay, int sent, Exception exception) {
            AbstractC22676k.m65750j(exception, "exception");
            C12448d.this.logger.mo85213c(AbstractC31061c.m95636l(delay, "Something went wrong sending memfault chunks, waiting ", "s"), exception, new AbstractC30556a.a[0]);
            AbstractC3006f0.m8732z(C12448d.this.coroutineScope, null, null, new C41506b(delay, C12448d.this, null), 3);
        }

        @Override // p100dw.InterfaceC12401f
        /* JADX INFO: renamed from: b */
        public void mo34836b(int sent) {
            C12448d.this.logger.mo85228t(AbstractC2875y.m8295h(sent, "Finished sending chunks, sent "), new AbstractC30556a.a[0]);
            AbstractC3006f0.m8732z(C12448d.this.coroutineScope, null, null, new a(C12448d.this, sent, null), 3);
        }
    }

    /* JADX INFO: renamed from: dy1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager$chunksSentRecently$1", m100430f = "NewMemfaultManager.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42423w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12448d.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42423w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(60, DurationUnit.SECONDS);
                this.f42423w = 1;
                if (AbstractC3034m0.m8783c(duration, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C12448d.this.m35032A(0);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dy1.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager$observeNewFlowStrapConnectionState$1", m100430f = "NewMemfaultManager.kt", m100431l = {190}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42425w;

        /* JADX INFO: renamed from: dy1.d$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12448d f42427w;

            public a(C12448d c12448d) {
                this.f42427w = c12448d;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC32962f abstractC32962f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objEmit;
                boolean zM65745e = AbstractC22676k.m65745e(abstractC32962f, C32970n.f137298a);
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (zM65745e) {
                    this.f42427w.m35033B();
                } else if (AbstractC22676k.m65745e(abstractC32962f, C32963g.f137291a) && (objEmit = this.f42427w.chunksFlow.emit(c23454a0, interfaceC30057d)) == EnumC31071a.f128113w) {
                    return objEmit;
                }
                return c23454a0;
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12448d.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l connectionStateFlow;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42425w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21750d interfaceC21750dM35050u = C12448d.this.m35050u();
                if (interfaceC21750dM35050u != null && (connectionStateFlow = interfaceC21750dM35050u.getConnectionStateFlow()) != null) {
                    InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(connectionStateFlow);
                    a aVar = new a(C12448d.this);
                    this.f42425w = 1;
                    if (interfaceC13058lM36610t.collect(aVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: dy1.d$e */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager$onCreate$1", m100430f = "NewMemfaultManager.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42428w;

        /* JADX INFO: renamed from: dy1.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12448d f42430w;

            public a(C12448d c12448d) {
                this.f42430w = c12448d;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C23454a0 c23454a0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objM35054z = this.f42430w.m35054z(interfaceC30057d);
                return objM35054z == EnumC31071a.f128113w ? objM35054z : C23454a0.f92919a;
            }
        }

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12448d.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42428w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36608r = AbstractC13091v.m36608r(C12448d.this.chunksFlow, C12448d.this.debounce);
                a aVar = new a(C12448d.this);
                this.f42428w = 1;
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

    /* JADX INFO: renamed from: dy1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager", m100430f = "NewMemfaultManager.kt", m100431l = {218, 111, 119}, m100432m = "onNewChunkReceived", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f42431E;

        /* JADX INFO: renamed from: F */
        int f42432F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f42433G;

        /* JADX INFO: renamed from: I */
        int f42435I;

        /* JADX INFO: renamed from: w */
        Object f42436w;

        /* JADX INFO: renamed from: x */
        Object f42437x;

        /* JADX INFO: renamed from: y */
        Object f42438y;

        /* JADX INFO: renamed from: z */
        int f42439z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42433G = obj;
            this.f42435I |= Integer.MIN_VALUE;
            return C12448d.this.m35053y(null, this);
        }
    }

    /* JADX INFO: renamed from: dy1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager$onNewChunkReceived$2$1$1", m100430f = "NewMemfaultManager.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42440w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f42442y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ byte[] f42443z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, byte[] bArr, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f42442y = str;
            this.f42443z = bArr;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12448d.this.new g(this.f42442y, this.f42443z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42440w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21959a interfaceC21959a = C12448d.this.memfaultDao;
                C20935a c20935a = new C20935a(0L, this.f42442y, this.f42443z, 1, null);
                this.f42440w = 1;
                if (interfaceC21959a.mo62689c(c20935a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dy1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager", m100430f = "NewMemfaultManager.kt", m100431l = {218, 133}, m100432m = "processChunks", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f42444E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f42445F;

        /* JADX INFO: renamed from: H */
        int f42447H;

        /* JADX INFO: renamed from: w */
        Object f42448w;

        /* JADX INFO: renamed from: x */
        Object f42449x;

        /* JADX INFO: renamed from: y */
        int f42450y;

        /* JADX INFO: renamed from: z */
        int f42451z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42445F = obj;
            this.f42447H |= Integer.MIN_VALUE;
            return C12448d.this.m35054z(this);
        }
    }

    /* JADX INFO: renamed from: dy1.d$i */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager$subscribeToNewMemfaultEvents$1", m100430f = "NewMemfaultManager.kt", m100431l = {155}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f42452w;

        /* JADX INFO: renamed from: x */
        int f42453x;

        /* JADX INFO: renamed from: y */
        int f42454y;

        /* JADX INFO: renamed from: dy1.d$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C12448d f42456w;

            public a(C12448d c12448d) {
                this.f42456w = c12448d;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(byte[] bArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
                Object objM35053y = this.f42456w.m35053y(bArr, interfaceC30057d);
                return objM35053y == EnumC31071a.f128113w ? objM35053y : C23454a0.f92919a;
            }
        }

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12448d.this.new i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42454y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21750d interfaceC21750dM35050u = C12448d.this.m35050u();
                if (interfaceC21750dM35050u != null) {
                    C12448d c12448d = C12448d.this;
                    InterfaceC13058l interfaceC13058lMo24697L0 = interfaceC21750dM35050u.mo24697L0();
                    a aVar = new a(c12448d);
                    this.f42452w = null;
                    this.f42453x = 0;
                    this.f42454y = 1;
                    if (interfaceC13058lMo24697L0.collect(aVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: dy1.d$j */
    @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager$subscribeToStrapProvider$1", m100430f = "NewMemfaultManager.kt", m100431l = {177}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42457w;

        /* JADX INFO: renamed from: dy1.d$j$a */
        @InterfaceC32271e(m100429c = "com.whoop.memfault.NewMemfaultManager$subscribeToStrapProvider$1$1", m100430f = "NewMemfaultManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ljk0/d;", "strap", "Ll83/a0;", "<anonymous>", "(Ljk0/d;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f42459w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f42460x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C12448d f42461y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12448d c12448d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f42461y = c12448d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f42461y, interfaceC30057d);
                aVar.f42460x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC21750d, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f42460x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f42459w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                if (interfaceC21750d != null) {
                    this.f42461y.m35052w();
                }
                return C23454a0.f92919a;
            }
        }

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12448d.this.new j(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42457w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 interfaceC13087t1Mo14818b = C12448d.this.whoopStrapProvider.mo14818b();
                a aVar = new a(C12448d.this, null);
                this.f42457w = 1;
                if (AbstractC13091v.m36604n(interfaceC13087t1Mo14818b, aVar, this) == enumC31071a) {
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

    public C12448d(InterfaceC4733b whoopStrapProvider, C12446b memfaultInitializer, InterfaceC2994c0 coroutineScope, C12397b chunkSenderBuilder, InterfaceC21959a memfaultDao, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(memfaultInitializer, "memfaultInitializer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(chunkSenderBuilder, "chunkSenderBuilder");
        AbstractC22676k.m65750j(memfaultDao, "memfaultDao");
        AbstractC22676k.m65750j(logger, "logger");
        this.whoopStrapProvider = whoopStrapProvider;
        this.memfaultInitializer = memfaultInitializer;
        this.coroutineScope = coroutineScope;
        this.chunkSenderBuilder = chunkSenderBuilder;
        this.memfaultDao = memfaultDao;
        this.logger = logger;
        this.chunkSendCallback = new b();
        this.debounce = 5000L;
        this.mutex = AbstractC25438d.m74669a();
        this.chunksFlow = AbstractC13091v.m36592b(0, 0, null, 7);
        this.processedChunks = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final void m35032A(int i13) {
        this.chunksSentRecently = i13;
        InterfaceC3027k1 interfaceC3027k1 = this.lastChunkSent;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        if (i13 > 0) {
            this.lastChunkSent = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final void m35033B() {
        InterfaceC3027k1 interfaceC3027k1 = this.memfaultFlowJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.memfaultFlowJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new i(null), 3);
    }

    /* JADX INFO: renamed from: C */
    private final void m35034C() {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new j(null), 3);
    }

    /* JADX INFO: renamed from: t */
    private final C12398c m35049t(String serialNumber) {
        C12400e c12400eM35022a = this.memfaultInitializer.m35022a();
        if (c12400eM35022a == null) {
            this.logger.mo85228t("Failed to initialize memfault cloud", new AbstractC30556a.a[0]);
            return null;
        }
        C12397b c12397b = this.chunkSenderBuilder;
        c12397b.getClass();
        AbstractC22676k.m65750j(serialNumber, "deviceSerial");
        c12397b.f41988b = serialNumber;
        c12397b.f41987a = c12400eM35022a;
        return c12397b.m34832a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final InterfaceC21750d m35050u() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: renamed from: v */
    private final void m35051v(byte[] chunk) {
        this.logger.mo85219j(AbstractC11266d.m30461o("Memfault chunk received - ", AbstractC40586b.m131618c(chunk)), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final void m35052w() {
        InterfaceC3027k1 interfaceC3027k1 = this.connectionStateJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.connectionStateJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
    
        if (r6.emit(r3, r0) == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [dy1.d] */
    /* JADX WARN: Type inference failed for: r13v0, types: [byte[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v3, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v6, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m35053y(byte[] r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dy1.C12448d.m35053y(byte[], q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:33:0x0081, B:37:0x0093, B:38:0x00a0, B:40:0x00a6, B:42:0x00b7, B:45:0x00c3, B:46:0x00c9, B:47:0x00d1, B:49:0x00d7, B:51:0x0118, B:52:0x012c, B:54:0x0132, B:55:0x0145, B:56:0x0157, B:58:0x015d, B:59:0x016b, B:60:0x0175, B:36:0x0088, B:32:0x007d), top: B:66:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:33:0x0081, B:37:0x0093, B:38:0x00a0, B:40:0x00a6, B:42:0x00b7, B:45:0x00c3, B:46:0x00c9, B:47:0x00d1, B:49:0x00d7, B:51:0x0118, B:52:0x012c, B:54:0x0132, B:55:0x0145, B:56:0x0157, B:58:0x015d, B:59:0x016b, B:60:0x0175, B:36:0x0088, B:32:0x007d), top: B:66:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:33:0x0081, B:37:0x0093, B:38:0x00a0, B:40:0x00a6, B:42:0x00b7, B:45:0x00c3, B:46:0x00c9, B:47:0x00d1, B:49:0x00d7, B:51:0x0118, B:52:0x012c, B:54:0x0132, B:55:0x0145, B:56:0x0157, B:58:0x015d, B:59:0x016b, B:60:0x0175, B:36:0x0088, B:32:0x007d), top: B:66:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:33:0x0081, B:37:0x0093, B:38:0x00a0, B:40:0x00a6, B:42:0x00b7, B:45:0x00c3, B:46:0x00c9, B:47:0x00d1, B:49:0x00d7, B:51:0x0118, B:52:0x012c, B:54:0x0132, B:55:0x0145, B:56:0x0157, B:58:0x015d, B:59:0x016b, B:60:0x0175, B:36:0x0088, B:32:0x007d), top: B:66:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0132 A[Catch: all -> 0x00c0, LOOP:2: B:52:0x012c->B:54:0x0132, LOOP_END, TryCatch #0 {all -> 0x00c0, blocks: (B:33:0x0081, B:37:0x0093, B:38:0x00a0, B:40:0x00a6, B:42:0x00b7, B:45:0x00c3, B:46:0x00c9, B:47:0x00d1, B:49:0x00d7, B:51:0x0118, B:52:0x012c, B:54:0x0132, B:55:0x0145, B:56:0x0157, B:58:0x015d, B:59:0x016b, B:60:0x0175, B:36:0x0088, B:32:0x007d), top: B:66:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x015d A[Catch: all -> 0x00c0, LOOP:3: B:56:0x0157->B:58:0x015d, LOOP_END, TryCatch #0 {all -> 0x00c0, blocks: (B:33:0x0081, B:37:0x0093, B:38:0x00a0, B:40:0x00a6, B:42:0x00b7, B:45:0x00c3, B:46:0x00c9, B:47:0x00d1, B:49:0x00d7, B:51:0x0118, B:52:0x012c, B:54:0x0132, B:55:0x0145, B:56:0x0157, B:58:0x015d, B:59:0x016b, B:60:0x0175, B:36:0x0088, B:32:0x007d), top: B:66:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00d7, please report this as an issue */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: z */
    public final Object m35054z(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        h hVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        Object objM107888l;
        Throwable thM68037a;
        LinkedHashMap linkedHashMap;
        List list;
        C12398c c12398cM35049t;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        Iterator it3;
        String serialNumber;
        Object arrayList3;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i14 = hVar.f42447H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f42447H = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f42445F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = hVar.f42447H;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.mutex;
                hVar.f42448w = interfaceC25435a;
                hVar.f42450y = 0;
                hVar.f42447H = 1;
                if (interfaceC25435a.mo68211b(hVar) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) hVar.f42448w;
                try {
                    AbstractC34132o.m107864I(obj);
                    objM107888l = (List) obj;
                } catch (Throwable th4) {
                    th3 = th4;
                    try {
                        objM107888l = AbstractC34132o.m107888l(th3);
                    } finally {
                        interfaceC25435a2.mo68214i(null);
                    }
                }
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a == null) {
                    this.logger.mo85230v("Error retrieving memfault packets from room", thM68037a, new AbstractC30556a.a[0]);
                    objM107888l = C25271y.f99162w;
                }
                linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (List) objM107888l) {
                    serialNumber = ((C20935a) obj2).getSerialNumber();
                    arrayList3 = linkedHashMap.get(serialNumber);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(serialNumber, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    list = (List) entry.getValue();
                    this.logger.mo85228t("Processing " + str + ", " + list.size() + " chunks", new AbstractC30556a.a[0]);
                    c12398cM35049t = m35049t(str);
                    if (c12398cM35049t != null) {
                        List<Long> list2 = this.processedChunks;
                        List list3 = list;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Long(((C20935a) it.next()).getId()));
                        }
                        list2.addAll(arrayList);
                        List list4 = list;
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                        it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((C20935a) it3.next()).getValue());
                        }
                        c12398cM35049t.m34833a(arrayList2);
                        c12398cM35049t.m34834b(this.chunkSendCallback);
                    } else {
                        this.logger.mo85222m("Failed to build chunk sender", new AbstractC30556a.a[0]);
                    }
                }
                return C23454a0.f92919a;
            }
            i13 = hVar.f42450y;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) hVar.f42448w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            InterfaceC21959a interfaceC21959a = this.memfaultDao;
            hVar.f42448w = interfaceC25435a;
            hVar.f42449x = null;
            hVar.f42450y = i13;
            hVar.f42451z = 0;
            hVar.f42444E = 0;
            hVar.f42447H = 2;
            Object objMo62687a = interfaceC21959a.mo62687a(100, hVar);
            if (objMo62687a != enumC31071a) {
                interfaceC25435a2 = interfaceC25435a;
                obj = objMo62687a;
                objM107888l = (List) obj;
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a == null) {
                    this.logger.mo85230v("Error retrieving memfault packets from room", thM68037a, new AbstractC30556a.a[0]);
                    objM107888l = C25271y.f99162w;
                }
                linkedHashMap = new LinkedHashMap();
                while (r14.hasNext()) {
                    serialNumber = ((C20935a) obj2).getSerialNumber();
                    arrayList3 = linkedHashMap.get(serialNumber);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(serialNumber, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                while (r14.hasNext()) {
                    String str2 = (String) entry.getKey();
                    list = (List) entry.getValue();
                    this.logger.mo85228t("Processing " + str2 + ", " + list.size() + " chunks", new AbstractC30556a.a[0]);
                    c12398cM35049t = m35049t(str2);
                    if (c12398cM35049t != null) {
                        List<Long> list5 = this.processedChunks;
                        List list6 = list;
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(list6, 10));
                        it = list6.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Long(((C20935a) it.next()).getId()));
                        }
                        list5.addAll(arrayList);
                        List list7 = list;
                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list7, 10));
                        it3 = list7.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((C20935a) it3.next()).getValue());
                        }
                        c12398cM35049t.m34833a(arrayList2);
                        c12398cM35049t.m34834b(this.chunkSendCallback);
                    } else {
                        this.logger.mo85222m("Failed to build chunk sender", new AbstractC30556a.a[0]);
                    }
                }
                return C23454a0.f92919a;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th5;
            objM107888l = AbstractC34132o.m107888l(th3);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        super.onCreate(owner);
        m35034C();
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new e(null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C12448d(InterfaceC4733b interfaceC4733b, C12446b c12446b, InterfaceC2994c0 interfaceC2994c0, C12397b c12397b, InterfaceC21959a interfaceC21959a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0 = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d()));
        }
        this(interfaceC4733b, c12446b, interfaceC2994c0, c12397b, interfaceC21959a, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("NewMemfaultManager") : interfaceC34116n);
    }
}
