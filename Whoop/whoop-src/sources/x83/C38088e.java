package x83;

import java.io.File;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x83.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C38088e extends AbstractC38085b {

    /* JADX INFO: renamed from: b */
    public boolean f163131b;

    /* JADX INFO: renamed from: c */
    public File[] f163132c;

    /* JADX INFO: renamed from: d */
    public int f163133d;

    @Override // x83.AbstractC38090g
    /* JADX INFO: renamed from: a */
    public final File mo122036a() {
        boolean z4 = this.f163131b;
        File file = this.f163136a;
        if (!z4) {
            this.f163131b = true;
            return file;
        }
        File[] fileArr = this.f163132c;
        if (fileArr != null && this.f163133d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f163132c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f163132c;
        AbstractC22676k.m65747g(fileArr2);
        int i13 = this.f163133d;
        this.f163133d = i13 + 1;
        return fileArr2[i13];
    }
}
