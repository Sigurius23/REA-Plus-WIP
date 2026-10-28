package sh;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;
import e93.AbstractC12889b;
import f93.C14289a;
import fi.AbstractC14504j;
import fi.AbstractC14505k;
import fi.C14509o;
import gi.C15878i;
import gi.EnumC15873d;
import p461rh.AbstractC31426o;
import p474s.AbstractC32004s;
import p552vh.AbstractC36038f;
import p552vh.C36036d;
import p715kotlin.jvm.internal.C22659b0;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: sh.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C32497w implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f134544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C22659b0 f134545b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC32485k f134546c;

    public /* synthetic */ C32497w(InterfaceC32485k interfaceC32485k, C22659b0 c22659b0, int i13) {
        this.f134544a = i13;
        this.f134546c = interfaceC32485k;
        this.f134545b = c22659b0;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        switch (this.f134544a) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                C14509o c14509o = ((C32498x) this.f134546c).f134549c;
                long jM99537f = AbstractC32004s.m99537f(width, height, c14509o.f53004b, c14509o.f53005c, (C15878i) AbstractC31426o.m96742f(c14509o, AbstractC14504j.f52990b));
                int i13 = (int) (jM99537f >> 32);
                int i14 = (int) (jM99537f & 4294967295L);
                if (width > 0 && height > 0 && (width != i13 || height != i14)) {
                    double dM99538g = AbstractC32004s.m99538g(width, height, i13, i14, c14509o.f53005c);
                    boolean z4 = dM99538g < 1.0d;
                    this.f134545b.f89329w = z4;
                    if (z4 || c14509o.f53006d == EnumC15873d.f59980w) {
                        imageDecoder.setTargetSize(AbstractC12889b.m36257W(((double) width) * dM99538g), AbstractC12889b.m36257W(dM99538g * ((double) height)));
                    }
                }
                imageDecoder.setOnPartialImageListener(new C32494t());
                imageDecoder.setAllocator(AbstractC37926s0.m121481u(AbstractC14505k.m41412a(c14509o)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) AbstractC31426o.m96742f(c14509o, AbstractC14505k.f52999g)).booleanValue() ? 1 : 0);
                C14289a c14289a = AbstractC14505k.f52995c;
                if (((ColorSpace) AbstractC31426o.m96742f(c14509o, c14289a)) != null) {
                    imageDecoder.setTargetColorSpace((ColorSpace) AbstractC31426o.m96742f(c14509o, c14289a));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) AbstractC31426o.m96742f(c14509o, AbstractC14505k.f52996d)).booleanValue());
                return;
            default:
                Size size2 = imageInfo.getSize();
                int width2 = size2.getWidth();
                int height2 = size2.getHeight();
                C14509o c14509o2 = ((C36036d) this.f134546c).f153722b;
                long jM99537f2 = AbstractC32004s.m99537f(width2, height2, c14509o2.f53004b, c14509o2.f53005c, (C15878i) AbstractC31426o.m96742f(c14509o2, AbstractC14504j.f52990b));
                int i15 = (int) (jM99537f2 >> 32);
                int i16 = (int) (jM99537f2 & 4294967295L);
                if (width2 > 0 && height2 > 0 && (width2 != i15 || height2 != i16)) {
                    double dM99538g2 = AbstractC32004s.m99538g(width2, height2, i15, i16, c14509o2.f53005c);
                    boolean z13 = dM99538g2 < 1.0d;
                    this.f134545b.f89329w = z13;
                    if (z13 || c14509o2.f53006d == EnumC15873d.f59980w) {
                        imageDecoder.setTargetSize(AbstractC12889b.m36257W(((double) width2) * dM99538g2), AbstractC12889b.m36257W(dM99538g2 * ((double) height2)));
                    }
                }
                imageDecoder.setAllocator(AbstractC37926s0.m121481u(AbstractC14505k.m41412a(c14509o2)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) AbstractC31426o.m96742f(c14509o2, AbstractC14505k.f52999g)).booleanValue() ? 1 : 0);
                C14289a c14289a2 = AbstractC14505k.f52995c;
                if (((ColorSpace) AbstractC31426o.m96742f(c14509o2, c14289a2)) != null) {
                    imageDecoder.setTargetColorSpace((ColorSpace) AbstractC31426o.m96742f(c14509o2, c14289a2));
                }
                if (AbstractC31426o.m96742f(c14509o2, AbstractC36038f.f153734b) != null) {
                    throw new ClassCastException();
                }
                imageDecoder.setPostProcessor(null);
                return;
        }
    }
}
