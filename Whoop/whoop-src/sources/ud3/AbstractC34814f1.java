package ud3;

import ne3.C26624l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud3.f1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC34814f1 {
    public abstract void onClosed(InterfaceC34811e1 interfaceC34811e1, int i13, String str);

    public void onClosing(InterfaceC34811e1 webSocket, int i13, String reason) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(reason, "reason");
    }

    public abstract void onFailure(InterfaceC34811e1 interfaceC34811e1, Throwable th3, C34850x0 c34850x0);

    public abstract void onMessage(InterfaceC34811e1 interfaceC34811e1, String str);

    public void onMessage(InterfaceC34811e1 webSocket, C26624l bytes) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(bytes, "bytes");
    }

    public void onOpen(InterfaceC34811e1 webSocket, C34850x0 response) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(response, "response");
    }
}
