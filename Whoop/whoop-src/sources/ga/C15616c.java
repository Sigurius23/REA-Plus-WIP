package ga;

import ih0.AbstractC18489d0;
import java.util.Arrays;
import p088dc.AbstractC11895b;
import p516u8.C34630z;
import p516u8.InterfaceC34583b0;

/* JADX INFO: renamed from: ga.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C15616c implements InterfaceC34583b0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f58629a;

    /* JADX INFO: renamed from: b */
    public final String f58630b;

    /* JADX INFO: renamed from: c */
    public final String f58631c;

    public C15616c(byte[] bArr, String str, String str2) {
        this.f58629a = bArr;
        this.f58630b = str;
        this.f58631c = str2;
    }

    @Override // p516u8.InterfaceC34583b0
    /* JADX INFO: renamed from: a */
    public final void mo40837a(C34630z c34630z) {
        String str = this.f58630b;
        if (str != null) {
            c34630z.f145878a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15616c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f58629a, ((C15616c) obj).f58629a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f58629a);
    }

    public final String toString() {
        return AbstractC18489d0.m53371l(AbstractC11895b.m32001t("ICY: title=\"", this.f58630b, "\", url=\"", this.f58631c, "\", rawMetadata.length=\""), this.f58629a.length, "\"");
    }
}
