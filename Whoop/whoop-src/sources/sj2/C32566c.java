package sj2;

import bc3.AbstractC3006f0;
import bc3.C3058t;
import bc3.C3060t1;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c93.InterfaceC4351m;
import com.whoop.taskexecutor.TaskInterruptedException;
import dc3.InterfaceC11927l;
import java.util.concurrent.ConcurrentLinkedDeque;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: sj2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013Ja\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u001b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00182\u001c\u0010\u001c\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010'R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R \u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.¨\u00064"}, m65681d2 = {"Lsj2/c;", "R", "Lsj2/b;", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "<init>", "(Lbc3/c0;Ltr2/n;)V", "Lsj2/f;", "j", "()Lsj2/f;", "task", "Ll83/a0;", "k", "(Lsj2/f;)V", "taskToBeCancelled", "higherPriorityNewTask", "i", "(Lsj2/f;Lsj2/f;)V", "", "tag", "Lsj2/a;", "priority", "Lkotlin/Function1;", "Lq83/d;", "", "action", "onCancel", "Lbc3/i0;", "c", "(Ljava/lang/String;Lsj2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lbc3/i0;", "", "a", "(Lsj2/a;)I", "Lbc3/c0;", "b", "Ltr2/n;", "Ldc3/l;", "Ldc3/l;", "looperChannel", "d", "Lsj2/f;", "currentTask", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "e", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "lowQueue", "f", "normalQueue", "g", "highQueue", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32566c<R> implements InterfaceC32565b<R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC11927l looperChannel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C32569f<R> currentTask;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ConcurrentLinkedDeque<C32569f<R>> lowQueue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ConcurrentLinkedDeque<C32569f<R>> normalQueue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ConcurrentLinkedDeque<C32569f<R>> highQueue;

    /* JADX INFO: renamed from: sj2.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.taskexecutor.PriorityInterruptibleExecutionServiceImpl$1", m100430f = "PriorityInterruptibleExecutionService.kt", m100431l = {194, 80, 96, 96, 96}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f134918E;

        /* JADX INFO: renamed from: F */
        Object f134919F;

        /* JADX INFO: renamed from: G */
        Object f134920G;

        /* JADX INFO: renamed from: H */
        Object f134921H;

        /* JADX INFO: renamed from: I */
        Object f134922I;

        /* JADX INFO: renamed from: J */
        Object f134923J;

        /* JADX INFO: renamed from: K */
        int f134924K;

        /* JADX INFO: renamed from: L */
        int f134925L;

        /* JADX INFO: renamed from: M */
        int f134926M;

        /* JADX INFO: renamed from: N */
        int f134927N;

        /* JADX INFO: renamed from: O */
        int f134928O;

        /* JADX INFO: renamed from: P */
        int f134929P;

        /* JADX INFO: renamed from: Q */
        int f134930Q;

        /* JADX INFO: renamed from: R */
        int f134931R;

        /* JADX INFO: renamed from: S */
        int f134932S;

        /* JADX INFO: renamed from: T */
        final /* synthetic */ C32566c<R> f134933T;

        /* JADX INFO: renamed from: w */
        Object f134934w;

        /* JADX INFO: renamed from: x */
        Object f134935x;

        /* JADX INFO: renamed from: y */
        Object f134936y;

        /* JADX INFO: renamed from: z */
        Object f134937z;

        /* JADX INFO: renamed from: sj2.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes10.dex */
        @InterfaceC32271e(m100429c = "com.whoop.taskexecutor.PriorityInterruptibleExecutionServiceImpl$1$1$1$onCancelTimeout$1", m100430f = "PriorityInterruptibleExecutionService.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42323a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f134938w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32569f<R> f134939x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42323a(C32569f<R> c32569f, InterfaceC30057d<? super C42323a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f134939x = c32569f;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42323a(this.f134939x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42323a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f134938w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    Function1 onCancel = this.f134939x.m101619e().getOnCancel();
                    this.f134938w = 1;
                    if (onCancel.invoke(this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C32566c<R> c32566c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134933T = c32566c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f134933T, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0251  */
        /* JADX WARN: Code duplicated, block: B:46:0x0261 A[Catch: all -> 0x08c6, TryCatch #15 {all -> 0x08c6, blocks: (B:44:0x0257, B:46:0x0261, B:48:0x0276), top: B:241:0x0257 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0276 A[Catch: all -> 0x08c6, TRY_LEAVE, TryCatch #15 {all -> 0x08c6, blocks: (B:44:0x0257, B:46:0x0261, B:48:0x0276), top: B:241:0x0257 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x02dc  */
        /* JADX WARN: Code duplicated, block: B:65:0x0321  */
        /* JADX WARN: Code duplicated, block: B:66:0x0323  */
        /* JADX WARN: Code duplicated, block: B:68:0x0326  */
        /* JADX WARN: Code duplicated, block: B:69:0x0328  */
        /* JADX WARN: Code duplicated, block: B:71:0x032b  */
        /* JADX WARN: Code duplicated, block: B:73:0x032f  */
        /* JADX WARN: Code duplicated, block: B:76:0x0360 A[Catch: all -> 0x005f, TryCatch #29 {all -> 0x005f, blocks: (B:12:0x004d, B:201:0x0848, B:203:0x086c, B:157:0x06a0, B:159:0x06ac, B:162:0x06d7, B:40:0x022a, B:63:0x031b, B:74:0x0331, B:76:0x0360, B:79:0x03a6, B:81:0x03ce, B:86:0x03fb, B:36:0x01fe, B:39:0x021e), top: B:258:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:78:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:81:0x03ce A[Catch: all -> 0x005f, TryCatch #29 {all -> 0x005f, blocks: (B:12:0x004d, B:201:0x0848, B:203:0x086c, B:157:0x06a0, B:159:0x06ac, B:162:0x06d7, B:40:0x022a, B:63:0x031b, B:74:0x0331, B:76:0x0360, B:79:0x03a6, B:81:0x03ce, B:86:0x03fb, B:36:0x01fe, B:39:0x021e), top: B:258:0x001b }] */
        /* JADX WARN: Code duplicated, block: B:82:0x03ea  */
        /* JADX WARN: Code duplicated, block: B:85:0x03f0  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v41 */
        /* JADX WARN: Type inference failed for: r10v42 */
        /* JADX WARN: Type inference failed for: r10v44 */
        /* JADX WARN: Type inference failed for: r10v47 */
        /* JADX WARN: Type inference failed for: r10v51 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r12v61, types: [boolean] */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v65, types: [boolean] */
        /* JADX WARN: Type inference failed for: r16v11 */
        /* JADX WARN: Type inference failed for: r16v12 */
        /* JADX WARN: Type inference failed for: r16v16 */
        /* JADX WARN: Type inference failed for: r16v17 */
        /* JADX WARN: Type inference failed for: r16v18 */
        /* JADX WARN: Type inference failed for: r18v10 */
        /* JADX WARN: Type inference failed for: r18v18 */
        /* JADX WARN: Type inference failed for: r18v19 */
        /* JADX WARN: Type inference failed for: r18v7 */
        /* JADX WARN: Type inference failed for: r19v0 */
        /* JADX WARN: Type inference failed for: r28v23 */
        /* JADX WARN: Type inference failed for: r29v18 */
        /* JADX WARN: Type inference failed for: r4v38 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v24 */
        /* JADX WARN: Type inference failed for: r6v49 */
        /* JADX WARN: Type inference failed for: r6v55 */
        /* JADX WARN: Type inference failed for: r6v56 */
        /* JADX WARN: Type inference failed for: r7v21 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [dc3.w] */
        /* JADX WARN: Type inference failed for: r8v25 */
        /* JADX WARN: Type inference failed for: r8v33 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v46 */
        /* JADX WARN: Type inference failed for: r8v48 */
        /* JADX WARN: Type inference failed for: r8v64 */
        /* JADX WARN: Type inference failed for: r8v67 */
        /* JADX WARN: Type inference failed for: r8v74 */
        /* JADX WARN: Type inference failed for: r8v75 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x062b -> B:235:0x0631). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x068f -> B:152:0x0685). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:216:0x08ca -> B:217:0x08e4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x03fe -> B:164:0x06de). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                Method dump skipped, instruction units count: 2303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sj2.C32566c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: sj2.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.taskexecutor.PriorityInterruptibleExecutionServiceImpl$submit$internalTaskDeferred$1", m100430f = "PriorityInterruptibleExecutionService.kt", m100431l = {138}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"R", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134940w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32568e<R> f134941x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32566c<R> f134942y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f134943z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C32568e<R> c32568e, C32566c<R> c32566c, String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134941x = c32568e;
            this.f134942y = c32566c;
            this.f134943z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f134941x, this.f134942y, this.f134943z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super R> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134940w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Function1 block = this.f134941x.getBlock();
                this.f134940w = 1;
                obj = block.invoke(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            ((C32566c) this.f134942y).logger.mo85216g(this.f134943z + " - Received response " + obj, new AbstractC30556a.a[0]);
            return obj;
        }
    }

    public C32566c(InterfaceC2994c0 coroutineScope, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.looperChannel = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);
        this.lowQueue = new ConcurrentLinkedDeque<>();
        this.normalQueue = new ConcurrentLinkedDeque<>();
        this.highQueue = new ConcurrentLinkedDeque<>();
        AbstractC3006f0.m8732z(coroutineScope, null, null, new a(this, null), 3);
    }

    /* JADX INFO: renamed from: i */
    private final void m101609i(C32569f<R> taskToBeCancelled, C32569f<R> higherPriorityNewTask) {
        TaskInterruptedException taskInterruptedException = new TaskInterruptedException(taskToBeCancelled.getTag() + "(" + taskToBeCancelled.getExecutionPriority() + ") interrupted by " + higherPriorityNewTask.getTag() + "(" + higherPriorityNewTask.getExecutionPriority() + ")");
        ((C3060t1) taskToBeCancelled.getInternalTaskJob()).mo8819p(taskInterruptedException);
        ((C3058t) taskToBeCancelled.getExternalTaskJob()).completeExceptionally(taskInterruptedException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C32569f<R> m101610j() {
        if (!this.highQueue.isEmpty()) {
            return this.highQueue.pollFirst();
        }
        if (!this.normalQueue.isEmpty()) {
            return this.normalQueue.pollFirst();
        }
        if (this.lowQueue.isEmpty()) {
            return null;
        }
        return this.lowQueue.pollFirst();
    }

    /* JADX INFO: renamed from: k */
    private final void m101611k(C32569f<R> task) {
        C32569f<R> c32569f = this.currentTask;
        if (c32569f == null || c32569f.getExecutionPriority().getPriority() >= task.getExecutionPriority().getPriority()) {
            return;
        }
        this.logger.mo85216g(AbstractC11895b.m31996o("Cancelling task ", c32569f.getTag(), " due to higher priority task"), new AbstractC30556a.a[0]);
        m101609i(c32569f, task);
    }

    @Override // sj2.InterfaceC32565b
    /* JADX INFO: renamed from: a */
    public int mo101602a(InterfaceC32564a priority) {
        AbstractC22676k.m65750j(priority, "priority");
        if (priority.equals(InterfaceC32564a.a.f134904a)) {
            return this.highQueue.size();
        }
        if (priority.equals(InterfaceC32564a.c.f134908a)) {
            return this.normalQueue.size();
        }
        if (priority.equals(InterfaceC32564a.b.f134906a)) {
            return this.lowQueue.size();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // sj2.InterfaceC32565b
    /* JADX INFO: renamed from: c */
    public InterfaceC3018i0 mo101603c(String tag, InterfaceC32564a priority, Function1 action, Function1 onCancel) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(priority, "priority");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(onCancel, "onCancel");
        C32568e c32568e = new C32568e(action, onCancel);
        InterfaceC2994c0 interfaceC2994c0 = this.coroutineScope;
        EnumC2998d0 enumC2998d0 = EnumC2998d0.f12004w;
        C32569f<R> c32569f = new C32569f<>(tag, priority, c32568e, AbstractC3006f0.m8711e(interfaceC2994c0, null, new b(c32568e, this, tag, null), 1), AbstractC3006f0.m8707a());
        this.logger.mo85216g("Enqueueing task " + tag + " with priority: " + priority + " to execution queue", new AbstractC30556a.a[0]);
        if (priority.equals(InterfaceC32564a.a.f134904a)) {
            this.highQueue.add(c32569f);
            m101611k(c32569f);
        } else if (priority.equals(InterfaceC32564a.b.f134906a)) {
            this.lowQueue.add(c32569f);
        } else {
            if (!priority.equals(InterfaceC32564a.c.f134908a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.normalQueue.add(c32569f);
            m101611k(c32569f);
        }
        this.looperChannel.mo32218s(C23454a0.f92919a);
        return c32569f.getExternalTaskJob();
    }
}
