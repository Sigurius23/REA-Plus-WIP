package x83;

import java.io.File;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x83.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C38086c extends AbstractC38085b {

    /* JADX INFO: renamed from: b */
    public boolean f163126b;

    /* JADX INFO: renamed from: c */
    public File[] f163127c;

    /* JADX INFO: renamed from: d */
    public int f163128d;

    /* JADX INFO: renamed from: e */
    public boolean f163129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38086c(C38089f c38089f, File rootDir) {
        super(rootDir);
        AbstractC22676k.m65750j(rootDir, "rootDir");
    }

    @Override // x83.AbstractC38090g
    /* JADX INFO: renamed from: a */
    public final File mo122036a() {
        boolean z4 = this.f163129e;
        File file = this.f163136a;
        if (!z4 && this.f163127c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f163127c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f163129e = true;
            }
        }
        File[] fileArr = this.f163127c;
        if (fileArr == null || this.f163128d >= fileArr.length) {
            if (this.f163126b) {
                return null;
            }
            this.f163126b = true;
            return file;
        }
        AbstractC22676k.m65747g(fileArr);
        int i13 = this.f163128d;
        this.f163128d = i13 + 1;
        return fileArr[i13];
    }
}
