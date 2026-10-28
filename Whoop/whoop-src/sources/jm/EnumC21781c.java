package jm;

import p381ot.InterfaceC28317c;

/* JADX INFO: renamed from: jm.c */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC21781c implements InterfaceC28317c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: w */
    public final int f83915w;

    EnumC21781c(int i13) {
        this.f83915w = i13;
    }

    @Override // p381ot.InterfaceC28317c
    /* JADX INFO: renamed from: a */
    public final int mo6451a() {
        return this.f83915w;
    }
}
