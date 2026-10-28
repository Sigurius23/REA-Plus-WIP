package kotlinx.coroutines.android;

import bc3.C2986a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p715kotlin.Metadata;
import q83.AbstractC30054a;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lq83/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "", "_preHandler", "Ljava/lang/Object;", "kotlinx-coroutines-android"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class AndroidExceptionPreHandler extends AbstractC30054a implements CoroutineExceptionHandler {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(C2986a0.f11990w);
        this._preHandler = this;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(InterfaceC30063j interfaceC30063j, Throwable th3) {
    }
}
