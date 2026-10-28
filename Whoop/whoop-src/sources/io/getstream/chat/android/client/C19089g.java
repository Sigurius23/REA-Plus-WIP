package io.getstream.chat.android.client;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;
import io.getstream.chat.android.models.Device;

/* JADX INFO: renamed from: io.getstream.chat.android.client.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19089g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73798w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Device f73799x;

    public /* synthetic */ C19089g(Device device, int i13) {
        this.f73798w = i13;
        this.f73799x = device;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iAddDeviceIdentifier;
        int i13 = this.f73798w;
        Device device = this.f73799x;
        switch (i13) {
            case 0:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                iAddDeviceIdentifier = IdentifiersKt.AddDeviceIdentifier(device);
                break;
            default:
                ChatClient.Companion companion2 = ChatClient.INSTANCE;
                iAddDeviceIdentifier = IdentifiersKt.DeleteDeviceIdentifier(device);
                break;
        }
        return Integer.valueOf(iAddDeviceIdentifier);
    }
}
