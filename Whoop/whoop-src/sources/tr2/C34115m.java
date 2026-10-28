package tr2;

import android.content.Context;
import java.io.File;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tr2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m65681d2 = {"Ltr2/m;", "Ltr2/l;", "", "cacheDirName", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34115m implements InterfaceC34114l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String cacheDirName;

    public C34115m(String cacheDirName) {
        AbstractC22676k.m65750j(cacheDirName, "cacheDirName");
        this.cacheDirName = cacheDirName;
    }

    @Override // tr2.InterfaceC34114l
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getCacheDirName() {
        return this.cacheDirName;
    }

    @Override // tr2.InterfaceC34114l
    /* JADX INFO: renamed from: b */
    public /* bridge */ File mo107845b(Context context) {
        return super.mo107845b(context);
    }
}
