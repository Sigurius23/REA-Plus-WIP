package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class RemoteCallbackListC1779e0 extends RemoteCallbackList {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MultiInstanceInvalidationService f7008a;

    public RemoteCallbackListC1779e0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f7008a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        InterfaceC1814o callback = (InterfaceC1814o) iInterface;
        AbstractC22676k.m65750j(callback, "callback");
        AbstractC22676k.m65750j(cookie, "cookie");
        this.f7008a.f6946x.remove((Integer) cookie);
    }
}
