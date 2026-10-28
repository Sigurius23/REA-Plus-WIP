package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5189z0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC5122a f21601a;

    /* JADX INFO: renamed from: b */
    public final String f21602b;

    /* JADX INFO: renamed from: c */
    public final Object[] f21603c;

    /* JADX INFO: renamed from: d */
    public final int f21604d;

    public C5189z0(AbstractC5122a abstractC5122a, String str, Object[] objArr) {
        this.f21601a = abstractC5122a;
        this.f21602b = str;
        this.f21603c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f21604d = cCharAt;
            return;
        }
        int i13 = cCharAt & 8191;
        int i14 = 13;
        int i15 = 1;
        while (true) {
            int i16 = i15 + 1;
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 55296) {
                this.f21604d = i13 | (cCharAt2 << i14);
                return;
            } else {
                i13 |= (cCharAt2 & 8191) << i14;
                i14 += 13;
                i15 = i16;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m16376a() {
        return (this.f21604d & 1) != 0 ? 1 : 2;
    }
}
