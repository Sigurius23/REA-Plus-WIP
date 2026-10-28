package p652yl;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: yl.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39616b implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f170400a;

    public C39616b(String str) {
        this.f170400a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f170400a);
    }
}
