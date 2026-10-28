package p371ok;

import i93.C18284j;

/* JADX INFO: renamed from: ok.c */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC27986c {
    SUCCESS(new C18284j(200, 299, 1)),
    BAD_REQUEST(400),
    TIMEOUT(408),
    PAYLOAD_TOO_LARGE(413),
    TOO_MANY_REQUESTS(429),
    FAILED(new C18284j(500, 599, 1));


    /* JADX INFO: renamed from: w */
    public final C18284j f112883w;

    EnumC27986c(C18284j c18284j) {
        this.f112883w = c18284j;
    }

    EnumC27986c(int i13) {
        this(new C18284j(i13, i13, 1));
    }
}
