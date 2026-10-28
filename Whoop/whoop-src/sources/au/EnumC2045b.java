package au;

import p381ot.InterfaceC28317c;

/* JADX INFO: renamed from: au.b */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC2045b implements InterfaceC28317c {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* JADX INFO: renamed from: w */
    public final int f8130w;

    EnumC2045b(int i13) {
        this.f8130w = i13;
    }

    @Override // p381ot.InterfaceC28317c
    /* JADX INFO: renamed from: a */
    public final int mo6451a() {
        return this.f8130w;
    }
}
