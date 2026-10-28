package live.hms.video.signal.jsonrpc;

import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34814f1;
import ud3.C34850x0;
import ud3.InterfaceC34811e1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/HMSWebSocketListener;", "Lud3/f1;", "<init>", "()V", "Lud3/e1;", "webSocket", "", "code", "", "reason", "Ll83/a0;", "onClosed", "(Lud3/e1;ILjava/lang/String;)V", "onClosing", "", "t", "Lud3/x0;", "response", "onFailure", "(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V", "text", "onMessage", "(Lud3/e1;Ljava/lang/String;)V", "onOpen", "(Lud3/e1;Lud3/x0;)V", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class HMSWebSocketListener extends AbstractC34814f1 {
    private static final String TAG = "HMSWebSocketListener";

    @Override // ud3.AbstractC34814f1
    public void onClosed(InterfaceC34811e1 webSocket, int code, String reason) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(reason, "reason");
        HMSLogger.m71136d(TAG, "onClose code=" + code + ", reason=" + reason);
    }

    @Override // ud3.AbstractC34814f1
    public void onClosing(InterfaceC34811e1 webSocket, int code, String reason) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(reason, "reason");
        super.onClosing(webSocket, code, reason);
        HMSLogger.m71136d(TAG, "onClosing code=" + code + ", reason=" + reason);
    }

    @Override // ud3.AbstractC34814f1
    public void onFailure(InterfaceC34811e1 webSocket, Throwable t14, C34850x0 response) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(t14, "t");
        HMSLogger.m71137e(TAG, "onFailure message=" + t14.getMessage());
    }

    @Override // ud3.AbstractC34814f1
    public void onMessage(InterfaceC34811e1 webSocket, String text) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(text, "text");
        HMSLogger.INSTANCE.m71140v(TAG, "onMessage [size=" + text.length() + "] text=" + text);
    }

    @Override // ud3.AbstractC34814f1
    public void onOpen(InterfaceC34811e1 webSocket, C34850x0 response) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(response, "response");
        super.onOpen(webSocket, response);
        HMSLogger.m71136d(TAG, "onOpen response=" + response);
    }
}
