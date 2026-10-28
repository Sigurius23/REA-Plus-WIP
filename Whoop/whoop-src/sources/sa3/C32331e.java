package sa3;

import java.util.Arrays;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sa3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C32331e extends AbstractC32327a {

    /* JADX INFO: renamed from: g */
    public static final C32331e f133827g;

    /* JADX INFO: renamed from: h */
    public static final C32331e f133828h;

    /* JADX INFO: renamed from: f */
    public final boolean f133829f;

    static {
        C32331e c32331e = new C32331e(new int[]{2, 3, 0}, false);
        f133827g = c32331e;
        int i13 = c32331e.f133781c;
        int i14 = c32331e.f133780b;
        f133828h = (i14 == 1 && i13 == 9) ? new C32331e(new int[]{2, 0, 0}, false) : new C32331e(new int[]{i14, i13 + 1, 0}, false);
        new C32331e(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32331e(int[] versionArray, boolean z4) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        AbstractC22676k.m65750j(versionArray, "versionArray");
        this.f133829f = z4;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m100629b(C32331e metadataVersionFromLanguageVersion) {
        AbstractC22676k.m65750j(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        C32331e c32331e = this.f133829f ? f133827g : f133828h;
        int i13 = c32331e.f133780b;
        int i14 = metadataVersionFromLanguageVersion.f133780b;
        if (i13 > i14 || (i13 >= i14 && c32331e.f133781c > metadataVersionFromLanguageVersion.f133781c)) {
            metadataVersionFromLanguageVersion = c32331e;
        }
        int i15 = this.f133781c;
        boolean z4 = false;
        int i16 = this.f133780b;
        if ((i16 == 1 && i15 == 0) || i16 == 0) {
            return false;
        }
        int i17 = metadataVersionFromLanguageVersion.f133780b;
        if (i16 > i17 || (i16 >= i17 && i15 > metadataVersionFromLanguageVersion.f133781c)) {
            z4 = true;
        }
        return !z4;
    }
}
