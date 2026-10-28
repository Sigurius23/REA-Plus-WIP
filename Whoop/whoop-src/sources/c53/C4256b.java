package c53;

import android.util.Log;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.C2990b0;
import io.getstream.video.android.core.notifications.internal.service.CallService;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p031b9.AbstractC2875y;
import q83.AbstractC30054a;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: c53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4256b extends AbstractC30054a implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17298w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4256b(InterfaceC30062i interfaceC30062i, int i13) {
        super(interfaceC30062i);
        this.f17298w = i13;
    }

    /* JADX INFO: renamed from: s */
    private final void m13287s(InterfaceC30063j interfaceC30063j, Throwable th3) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(InterfaceC30063j interfaceC30063j, Throwable th3) {
        String str;
        switch (this.f17298w) {
            case 0:
                C2990b0 c2990b0 = (C2990b0) interfaceC30063j.get(C2990b0.f11996x);
                if (c2990b0 == null || (str = c2990b0.f11997w) == null) {
                    str = "unknown";
                }
                C2343i c2343i = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, "ClientScope")) {
                    C2343i.f9271c.log(enumC2341g, "ClientScope", "[ClientScope] Uncaught exception in coroutine " + str + ": " + th3, th3);
                }
                break;
            case 1:
                C2345k c2345k = (C2345k) CallService.f74912I.getValue();
                InterfaceC2339e interfaceC2339e2 = c2345k.f9275c;
                EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                String str2 = c2345k.f9273a;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    c2345k.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8301n("[CallService#Scope] Uncaught exception: ", th3), th3);
                }
                break;
            case 2:
                break;
            default:
                Log.e("ClientEvent", "Error in ClientEventReporter: " + th3);
                break;
        }
    }
}
