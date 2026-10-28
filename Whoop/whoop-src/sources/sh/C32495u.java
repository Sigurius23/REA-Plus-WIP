package sh;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import fi.AbstractC14505k;
import fi.C14509o;
import mc3.C25443i;
import p006a4.AbstractC0354a;
import p523uh.C34962h;

/* JADX INFO: renamed from: sh.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C32495u implements InterfaceC32484j {

    /* JADX INFO: renamed from: a */
    public final C25443i f134538a;

    public C32495u(C25443i c25443i) {
        this.f134538a = c25443i;
    }

    @Override // sh.InterfaceC32484j
    /* JADX INFO: renamed from: a */
    public final InterfaceC32485k mo71005a(C34962h c34962h, C14509o c14509o) {
        ImageDecoder.Source sourceM958E;
        Bitmap.Config configM41412a = AbstractC14505k.m41412a(c14509o);
        if ((configM41412a == Bitmap.Config.ARGB_8888 || configM41412a == Bitmap.Config.HARDWARE) && (sourceM958E = AbstractC0354a.m958E(c34962h.f147929a, c14509o, false)) != null) {
            return new C32498x(sourceM958E, c34962h.f147929a, c14509o, this.f134538a);
        }
        return null;
    }
}
