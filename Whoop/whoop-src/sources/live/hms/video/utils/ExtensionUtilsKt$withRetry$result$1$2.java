package live.hms.video.utils;

import bc3.AbstractC3034m0;
import c93.InterfaceC4352n;
import com.mapbox.common.logger.LogPriority;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import live.hms.video.sdk.models.EVENT_TYPE;
import live.hms.video.sdk.models.IRetryAttemptTracking;
import live.hms.video.transport.RetryScheduler;
import live.hms.video.transport.models.TransportFailureCategory;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb0.AbstractC39383f;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.utils.ExtensionUtilsKt$withRetry$result$1$2", m100430f = "ExtensionUtils.kt", m100431l = {97, LogPriority.NONE}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"R", "Lec3/m;", "", "cause", "", "attempt", "", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;J)Z"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class ExtensionUtilsKt$withRetry$result$1$2 extends AbstractC32275i implements InterfaceC4352n {
    final /* synthetic */ int $maxRetryCount;
    final /* synthetic */ EVENT_TYPE $name;
    final /* synthetic */ IRetryAttemptTracking $retryAttemptTracking;
    int I$0;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionUtilsKt$withRetry$result$1$2(int i13, IRetryAttemptTracking iRetryAttemptTracking, EVENT_TYPE event_type, InterfaceC30057d<? super ExtensionUtilsKt$withRetry$result$1$2> interfaceC30057d) {
        super(4, interfaceC30057d);
        this.$maxRetryCount = i13;
        this.$retryAttemptTracking = iRetryAttemptTracking;
        this.$name = event_type;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, long j7, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        ExtensionUtilsKt$withRetry$result$1$2 extensionUtilsKt$withRetry$result$1$2 = new ExtensionUtilsKt$withRetry$result$1$2(this.$maxRetryCount, this.$retryAttemptTracking, this.$name, interfaceC30057d);
        extensionUtilsKt$withRetry$result$1$2.L$0 = th3;
        extensionUtilsKt$withRetry$result$1$2.J$0 = j7;
        return extensionUtilsKt$withRetry$result$1$2.invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13;
        EVENT_TYPE event_type;
        int i14;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = this.label;
        if (i15 != 0) {
            if (i15 == 1) {
                i13 = this.I$0;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = this.I$0;
                AbstractC34132o.m107864I(obj);
            }
            i13 = i14;
            return Boolean.valueOf(i13 != 0);
        }
        AbstractC34132o.m107864I(obj);
        Throwable th3 = (Throwable) this.L$0;
        long j7 = this.J$0;
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "schedule: retry retry count ", " and error reason ");
        String message = th3 != null ? th3.getMessage() : null;
        if (message == null) {
            message = "";
        }
        sbM125596b.append(message);
        HMSLogger.m71136d("Retry Scheduler", sbM125596b.toString());
        HMSUtils hMSUtils = HMSUtils.INSTANCE;
        AbstractC22676k.m65748h(th3, "null cannot be cast to non-null type java.lang.Exception");
        i13 = (!hMSUtils.shouldRetry((Exception) th3) || j7 >= ((long) this.$maxRetryCount)) ? 0 : 1;
        if (i13 != 0) {
            IRetryAttemptTracking iRetryAttemptTracking = this.$retryAttemptTracking;
            if (iRetryAttemptTracking != null && (event_type = this.$name) != null) {
                this.I$0 = i13;
                this.label = 1;
                if (iRetryAttemptTracking.numberedValue(event_type, j7 + 1, this) != enumC31071a) {
                }
            }
            return enumC31071a;
        }
        return Boolean.valueOf(i13 != 0);
        long delayForCategory = RetryScheduler.INSTANCE.getDelayForCategory(TransportFailureCategory.JoinAPIFailed);
        this.I$0 = i13;
        this.label = 2;
        if (AbstractC3034m0.m8782b(delayForCategory, this) != enumC31071a) {
            i14 = i13;
            i13 = i14;
            return Boolean.valueOf(i13 != 0);
        }
        return enumC31071a;
    }

    @Override // c93.InterfaceC4352n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((InterfaceC13062m) obj, (Throwable) obj2, ((Number) obj3).longValue(), (InterfaceC30057d<? super Boolean>) obj4);
    }
}
