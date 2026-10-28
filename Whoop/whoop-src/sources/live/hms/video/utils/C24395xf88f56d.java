package live.hms.video.utils;

import bc3.C2986a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p715kotlin.Metadata;
import q83.AbstractC30054a;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: live.hms.video.utils.CoroutineExceptionTrackerKt$exceptionSurfacer$$inlined$CoroutineExceptionHandler$1 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"live/hms/video/utils/CoroutineExceptionTrackerKt$exceptionSurfacer$$inlined$CoroutineExceptionHandler$1", "Lq83/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lq83/j;", "context", "", "exception", "Ll83/a0;", "handleException", "(Lq83/j;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class C24395xf88f56d extends AbstractC30054a implements CoroutineExceptionHandler {
    final /* synthetic */ String $tag$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24395xf88f56d(C2986a0 c2986a0, String str) {
        super(c2986a0);
        this.$tag$inlined = str;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(InterfaceC30063j context, Throwable exception) throws Throwable {
        HMSLogger.m71137e(this.$tag$inlined, "Got coroutine exception " + exception + " in context: " + context);
        throw exception;
    }
}
