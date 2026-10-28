package no.nordicsemi.android.ble;

import rd3.AbstractC31252a;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.t */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C26918t implements InterfaceC26885b0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f107426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f107427c;

    public /* synthetic */ C26918t(int i13, int i14, int i15) {
        this.f107425a = i15;
        this.f107426b = i13;
        this.f107427c = i14;
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26885b0
    /* JADX INFO: renamed from: b */
    public final String mo80233b() {
        int i13 = this.f107425a;
        int i14 = this.f107427c;
        int i15 = this.f107426b;
        switch (i13) {
            case 0:
                int i16 = BleManagerHandler$4.f107299b;
                return "PHY read (TX: " + AbstractC31252a.m96277d(i15) + ", RX: " + AbstractC31252a.m96277d(i14) + ")";
            default:
                int i17 = BleManagerHandler$4.f107299b;
                return "PHY updated (TX: " + AbstractC31252a.m96277d(i15) + ", RX: " + AbstractC31252a.m96277d(i14) + ")";
        }
    }
}
