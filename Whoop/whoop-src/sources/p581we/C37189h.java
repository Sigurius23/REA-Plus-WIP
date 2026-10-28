package p581we;

import java.util.Arrays;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: we.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C37189h {

    /* JADX INFO: renamed from: a */
    public final Object f159018a;

    /* JADX INFO: renamed from: b */
    public final byte[] f159019b;

    public C37189h(Object obj, byte[] bArr) {
        this.f159018a = obj;
        this.f159019b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final Object m119185a() {
        return this.f159018a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m119186b() {
        return this.f159019b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37189h.class != obj.getClass()) {
            return false;
        }
        C37189h c37189h = (C37189h) obj;
        return AbstractC22676k.m65745e(this.f159018a, c37189h.f159018a) && Arrays.equals(this.f159019b, c37189h.f159019b);
    }

    public final int hashCode() {
        Object obj = this.f159018a;
        return Arrays.hashCode(this.f159019b) + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    public final String toString() {
        return "AwsSigningResult(output=" + this.f159018a + ", signature=" + Arrays.toString(this.f159019b) + ')';
    }
}
