package gl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import il.C18616b;
import java.io.File;
import p586wk.C37330h;
import p586wk.InterfaceC37332j;
import p684zk.InterfaceC40801z;

/* JADX INFO: renamed from: gl.y */
/* JADX INFO: loaded from: classes.dex */
public final class C15960y implements InterfaceC37332j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60393a;

    public /* synthetic */ C15960y(int i13) {
        this.f60393a = i13;
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: a */
    public final InterfaceC40801z mo44989a(Object obj, int i13, int i14, C37330h c37330h) {
        switch (this.f60393a) {
            case 0:
                return new C15959x((Bitmap) obj);
            case 1:
                return C18616b.m53886b((Drawable) obj);
            default:
                return new C15959x((File) obj);
        }
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo44990b(Object obj, C37330h c37330h) {
        switch (this.f60393a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
