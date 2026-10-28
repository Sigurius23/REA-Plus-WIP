package au;

import p381ot.InterfaceC28317c;

/* JADX INFO: renamed from: au.c */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC2046c implements InterfaceC28317c {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* JADX INFO: renamed from: w */
    public final int f8135w;

    EnumC2046c(int i13) {
        this.f8135w = i13;
    }

    @Override // p381ot.InterfaceC28317c
    /* JADX INFO: renamed from: a */
    public final int mo6451a() {
        return this.f8135w;
    }
}
