package p043c4;

import androidx.profileinstaller.ProfileVerifier;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p390p1.C28596b0;

/* JADX INFO: renamed from: c4.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3966j0 {

    /* JADX INFO: renamed from: a */
    public final int f16162a;

    /* JADX INFO: renamed from: b */
    public final boolean f16163b;

    /* JADX INFO: renamed from: c */
    public final boolean f16164c;

    /* JADX INFO: renamed from: d */
    public final boolean f16165d;

    /* JADX INFO: renamed from: e */
    public final boolean f16166e;

    public /* synthetic */ C3966j0(boolean z4, int i13) {
        this((i13 & 1) != 0 ? false : z4, true, true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3966j0)) {
            return false;
        }
        C3966j0 c3966j0 = (C3966j0) obj;
        return this.f16162a == c3966j0.f16162a && this.f16163b == c3966j0.f16163b && this.f16164c == c3966j0.f16164c && this.f16165d == c3966j0.f16165d && this.f16166e == c3966j0.f16166e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.f16162a * 31, 31, this.f16163b), 31, this.f16164c), 31, this.f16165d), 31, this.f16166e);
    }

    public C3966j0(boolean z4, boolean z13, boolean z14, boolean z15) {
        this(z4, z13, z14, EnumC3968k0.f16173w, z15);
    }

    public C3966j0(boolean z4, boolean z13, boolean z14, EnumC3968k0 enumC3968k0, boolean z15) {
        C28596b0 c28596b0 = AbstractC3975r.f16196a;
        int i13 = !z4 ? 262152 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
        i13 = enumC3968k0 == EnumC3968k0.f16174x ? i13 | DfuBaseService.ERROR_REMOTE_MASK : i13;
        i13 = z15 ? i13 : i13 | 512;
        boolean z16 = enumC3968k0 == EnumC3968k0.f16173w;
        this.f16162a = i13;
        this.f16163b = z16;
        this.f16164c = z13;
        this.f16165d = z14;
        this.f16166e = true;
    }
}
