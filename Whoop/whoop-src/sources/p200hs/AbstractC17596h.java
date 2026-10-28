package p200hs;

import android.os.Build;
import at.C1956b;
import com.google.crypto.tink.internal.AbstractC5113r0;
import java.nio.charset.Charset;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: renamed from: hs.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17596h {

    /* JADX INFO: renamed from: a */
    public static final C1956b f68170a = new C1956b(8);

    /* JADX INFO: renamed from: a */
    public static AlgorithmParameterSpec m50112a(byte[] bArr) {
        int length = bArr.length;
        Charset charset = AbstractC5113r0.f21461a;
        Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        return (numValueOf == null || numValueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, length) : new IvParameterSpec(bArr, 0, length);
    }
}
