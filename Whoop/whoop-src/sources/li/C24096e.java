package li;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.media.MediaDataSource;
import bi.AbstractC3269g;
import cc.C4409p;
import fi.AbstractC14505k;
import fi.C14509o;
import gi.EnumC15873d;
import java.nio.ByteBuffer;
import ki.AbstractC22500l;
import ne3.AbstractC26604b;
import ne3.C26616h;
import p461rh.AbstractC31426o;
import p477s2.AbstractC32072d;
import p523uh.C34956b;
import p523uh.C34961g;
import p523uh.C34962h;
import p523uh.InterfaceC34960f;
import q83.InterfaceC30057d;
import sh.C32480f;
import sh.C32493s;
import sh.EnumC32482h;

/* JADX INFO: renamed from: li.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C24096e implements InterfaceC34960f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95177a;

    /* JADX INFO: renamed from: b */
    public final C14509o f95178b;

    /* JADX INFO: renamed from: c */
    public final Object f95179c;

    public /* synthetic */ C24096e(Object obj, C14509o c14509o, int i13) {
        this.f95177a = i13;
        this.f95179c = obj;
        this.f95178b = c14509o;
    }

    @Override // p523uh.InterfaceC34960f
    /* JADX INFO: renamed from: a */
    public final Object mo9540a(InterfaceC30057d interfaceC30057d) {
        int i13 = this.f95177a;
        Object obj = this.f95179c;
        C14509o c14509o = this.f95178b;
        switch (i13) {
            case 0:
                MediaDataSource mediaDataSource = (MediaDataSource) obj;
                return new C34962h(new C32493s(AbstractC26604b.m79158c(new C24094c(mediaDataSource)), c14509o.f53008f, new C24095d(mediaDataSource)), null, EnumC32482h.f134509y);
            case 1:
                return new C34961g(AbstractC31426o.m96739c(new BitmapDrawable(c14509o.f53003a.getResources(), (Bitmap) obj)), false, EnumC32482h.f134508x);
            case 2:
                C26616h c26616h = new C26616h();
                c26616h.m134462write((byte[]) obj);
                return new C34962h(AbstractC32072d.m99699h(c26616h, c14509o.f53008f), null, EnumC32482h.f134508x);
            case 3:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new C34962h(new C32493s(AbstractC26604b.m79158c(new C34956b(byteBuffer)), c14509o.f53008f, new C32480f(byteBuffer)), null, EnumC32482h.f134508x);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = AbstractC22500l.f88199a;
                boolean z4 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof C4409p);
                if (z4) {
                    bitmapDrawable = new BitmapDrawable(c14509o.f53003a.getResources(), AbstractC3269g.m9515v(bitmapDrawable, AbstractC14505k.m41412a(c14509o), c14509o.f53004b, c14509o.f53005c, c14509o.f53006d == EnumC15873d.f59981x));
                }
                return new C34961g(AbstractC31426o.m96739c(bitmapDrawable), z4, EnumC32482h.f134508x);
        }
    }
}
