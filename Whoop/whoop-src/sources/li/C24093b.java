package li;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaDataSource;
import fi.C14509o;
import java.nio.ByteBuffer;
import ki.AbstractC22500l;
import m83.AbstractC25265s;
import p461rh.AbstractC31426o;
import p461rh.C31431t;
import p461rh.C31436y;
import p523uh.C34955a;
import p523uh.C34957c;
import p523uh.InterfaceC34959e;
import p523uh.InterfaceC34960f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: li.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C24093b implements InterfaceC34959e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95172a;

    public /* synthetic */ C24093b(int i13) {
        this.f95172a = i13;
    }

    @Override // p523uh.InterfaceC34959e
    /* JADX INFO: renamed from: a */
    public final InterfaceC34960f mo9536a(Object obj, C14509o c14509o, C31431t c31431t) {
        int i13 = 0;
        int i14 = 1;
        int i15 = 2;
        int i16 = 3;
        int i17 = 4;
        switch (this.f95172a) {
            case 0:
                return new C24096e((MediaDataSource) obj, c14509o, i13);
            case 1:
                C31436y c31436y = (C31436y) obj;
                Bitmap.Config[] configArr = AbstractC22500l.f88199a;
                if (AbstractC22676k.m65745e(c31436y.f129329c, "file") && AbstractC22676k.m65745e(AbstractC25265s.m74100H0(AbstractC31426o.m96744h(c31436y)), "android_asset")) {
                    return new C34955a(c31436y, c14509o, i13);
                }
                return null;
            case 2:
                return new C24096e((Bitmap) obj, c14509o, i14);
            case 3:
                return new C24096e((byte[]) obj, c14509o, i15);
            case 4:
                return new C24096e((ByteBuffer) obj, c14509o, i16);
            case 5:
                C31436y c31436y2 = (C31436y) obj;
                if (AbstractC22676k.m65745e(c31436y2.f129329c, "content")) {
                    return new C34957c(c31436y2, c14509o);
                }
                return null;
            case 6:
                C31436y c31436y3 = (C31436y) obj;
                if (AbstractC22676k.m65745e(c31436y3.f129329c, "data")) {
                    return new C34955a(c31436y3, c14509o, i14);
                }
                return null;
            case 7:
                return new C24096e((Drawable) obj, c14509o, i17);
            case 8:
                C31436y c31436y4 = (C31436y) obj;
                String str = c31436y4.f129329c;
                if ((str != null && !str.equals("file")) || c31436y4.f129331e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = AbstractC22500l.f88199a;
                if (AbstractC22676k.m65745e(c31436y4.f129329c, "file") && AbstractC22676k.m65745e(AbstractC25265s.m74100H0(AbstractC31426o.m96744h(c31436y4)), "android_asset")) {
                    return null;
                }
                return new C34955a(c31436y4, c14509o, i15);
            case 9:
                C31436y c31436y5 = (C31436y) obj;
                if (AbstractC22676k.m65745e(c31436y5.f129329c, "jar:file")) {
                    return new C34955a(c31436y5, c14509o, i16);
                }
                return null;
            default:
                C31436y c31436y6 = (C31436y) obj;
                if (AbstractC22676k.m65745e(c31436y6.f129329c, "android.resource")) {
                    return new C34955a(c31436y6, c14509o, i17);
                }
                return null;
        }
    }
}
