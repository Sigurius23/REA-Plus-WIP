package p168g6;

import android.view.View;
import fr.C14700k;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: g6.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C15522c extends AbstractC34870c0 {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f58196x;

    public /* synthetic */ C15522c(int i13) {
        this.f58196x = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p522uf.AbstractC34870c0
    /* JADX INFO: renamed from: X */
    public final float mo42140X(C14700k c14700k) {
        switch (this.f58196x) {
            case 0:
                return ((View) c14700k).getAlpha();
            case 1:
                return ((View) c14700k).getScaleX();
            case 2:
                return ((View) c14700k).getScaleY();
            case 3:
                return ((View) c14700k).getRotation();
            case 4:
                return ((View) c14700k).getRotationX();
            default:
                return ((View) c14700k).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p522uf.AbstractC34870c0
    /* JADX INFO: renamed from: k0 */
    public final void mo42141k0(C14700k c14700k, float f13) {
        switch (this.f58196x) {
            case 0:
                ((View) c14700k).setAlpha(f13);
                break;
            case 1:
                ((View) c14700k).setScaleX(f13);
                break;
            case 2:
                ((View) c14700k).setScaleY(f13);
                break;
            case 3:
                ((View) c14700k).setRotation(f13);
                break;
            case 4:
                ((View) c14700k).setRotationX(f13);
                break;
            default:
                ((View) c14700k).setRotationY(f13);
                break;
        }
    }
}
