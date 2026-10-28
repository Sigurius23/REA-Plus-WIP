package p220ih;

import java.io.File;
import mh.C25545m;

/* JADX INFO: renamed from: ih.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18479a implements InterfaceC18480b {

    /* JADX INFO: renamed from: a */
    public final boolean f71927a;

    public C18479a(boolean z4) {
        this.f71927a = z4;
    }

    @Override // p220ih.InterfaceC18480b
    /* JADX INFO: renamed from: a */
    public final String mo53321a(Object obj, C25545m c25545m) {
        File file = (File) obj;
        if (!this.f71927a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
