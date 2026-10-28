package kotlinx.coroutines;

import p715kotlin.Metadata;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lq83/h;", "bc3/a0", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public interface CoroutineExceptionHandler extends InterfaceC30061h {
    void handleException(InterfaceC30063j interfaceC30063j, Throwable th3);
}
