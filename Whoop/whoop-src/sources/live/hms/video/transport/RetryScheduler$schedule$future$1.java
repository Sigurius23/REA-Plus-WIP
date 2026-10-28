package live.hms.video.transport;

import bc3.InterfaceC3055s;
import l83.C23454a0;
import live.hms.video.error.HMSException;
import live.hms.video.transport.models.TransportFailureCategory;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.transport.RetryScheduler$schedule$future$1", m100430f = "RetryScheduler.kt", m100431l = {209, 240}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class RetryScheduler$schedule$future$1 extends AbstractC32275i implements Function1 {
    final /* synthetic */ TransportFailureCategory $category;
    final /* synthetic */ InterfaceC3055s $deferred;
    final /* synthetic */ HMSException $error;
    final /* synthetic */ long $failedAtMillis;
    final /* synthetic */ long $maxRetryInMillis;
    final /* synthetic */ C22665e0 $newRetries;
    final /* synthetic */ int $retries;
    final /* synthetic */ boolean $shouldSendStateUpdate;
    final /* synthetic */ Function1 $task;
    Object L$0;
    int label;
    final /* synthetic */ RetryScheduler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryScheduler$schedule$future$1(Function1 function1, TransportFailureCategory transportFailureCategory, RetryScheduler retryScheduler, long j7, boolean z4, C22665e0 c22665e0, HMSException hMSException, long j13, int i13, InterfaceC3055s interfaceC3055s, InterfaceC30057d<? super RetryScheduler$schedule$future$1> interfaceC30057d) {
        super(1, interfaceC30057d);
        this.$task = function1;
        this.$category = transportFailureCategory;
        this.this$0 = retryScheduler;
        this.$failedAtMillis = j7;
        this.$shouldSendStateUpdate = z4;
        this.$newRetries = c22665e0;
        this.$error = hMSException;
        this.$maxRetryInMillis = j13;
        this.$retries = i13;
        this.$deferred = interfaceC3055s;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
        return new RetryScheduler$schedule$future$1(this.$task, this.$category, this.this$0, this.$failedAtMillis, this.$shouldSendStateUpdate, this.$newRetries, this.$error, this.$maxRetryInMillis, this.$retries, this.$deferred, interfaceC30057d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0112, code lost:
    
        if (r0 == r12) goto L44;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.transport.RetryScheduler$schedule$future$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((RetryScheduler$schedule$future$1) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }
}
