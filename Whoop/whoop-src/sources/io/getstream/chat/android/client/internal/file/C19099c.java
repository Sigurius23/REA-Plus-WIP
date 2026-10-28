package io.getstream.chat.android.client.internal.file;

import java.io.File;
import java.io.FileFilter;
import mg1.C25529b;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.file.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19099c implements FileFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f73808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f73809b;

    public /* synthetic */ C19099c(String str, int i13) {
        this.f73808a = i13;
        this.f73809b = str;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.f73808a) {
            case 0:
                return StreamFileManager.listFilesInCache$lambda$14(this.f73809b, file);
            default:
                return C25529b.m75084h(this.f73809b, file);
        }
    }
}
