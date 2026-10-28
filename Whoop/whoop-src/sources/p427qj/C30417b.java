package p427qj;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import ch.C4597r;
import coil.compose.AsyncImagePainter$State$Error;
import coil.compose.AsyncImagePainter$State$Loading;
import coil.compose.AsyncImagePainter$State$Success;
import com.amplitude.android.engagement.types.ImageBlock;
import com.amplitude.android.engagement.types.ImageMeta;
import com.amplitude.android.engagement.types.ImageStyle;
import l83.C23454a0;
import p026b2.C2299e;
import p026b2.C2314t;
import p098dt.AbstractC12350b;
import p181h2.C16620e;
import p331n2.AbstractC26165a;
import p390p1.C28655q;
import p490t0.AbstractC33253j;
import p525uj.AbstractC35033k;
import p525uj.C35035m;
import p635y2.C39102j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import se.AbstractC32411b;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: qj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C30417b extends AbstractC22680m implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f124834w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ImageBlock f124835x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30417b(ImageBlock imageBlock, int i13) {
        super(4);
        this.f124834w = i13;
        this.f124835x = imageBlock;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x0127  */
    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long f4822h;
        float fFloatValue;
        float fM47213e;
        ImageStyle style;
        String string;
        Float fM125915y;
        Float fM125915y2;
        String scale;
        switch (this.f124834w) {
            case 0:
                C4597r SubcomposeAsyncImage = (C4597r) obj;
                AsyncImagePainter$State$Loading it = (AsyncImagePainter$State$Loading) obj2;
                Composer composer = (Composer) obj3;
                int iIntValue = ((Number) obj4).intValue();
                AbstractC22676k.m65750j(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                AbstractC22676k.m65750j(it, "it");
                if ((iIntValue & 641) == 128) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC32411b.m101109u(this.f124835x.getMeta().getFilename(), null, composer, 0);
                    }
                } else {
                    AbstractC32411b.m101109u(this.f124835x.getMeta().getFilename(), null, composer, 0);
                }
                break;
            case 1:
                C4597r SubcomposeAsyncImage2 = (C4597r) obj;
                AsyncImagePainter$State$Success success = (AsyncImagePainter$State$Success) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                AbstractC22676k.m65750j(SubcomposeAsyncImage2, "$this$SubcomposeAsyncImage");
                AbstractC22676k.m65750j(success, "success");
                if ((iIntValue2 & 112) == 0) {
                    iIntValue2 |= ((C28655q) composer2).m87153g(success) ? 32 : 16;
                }
                if ((iIntValue2 & 721) == 144) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC26165a painter = success.getPainter();
                        f4822h = painter.getF4822H();
                        fFloatValue = 1.0f;
                        if (!C16620e.m47210b(f4822h, 9205357640488583168L) || C16620e.m47211c(f4822h) == 0.0f) {
                            fM47213e = 1.0f;
                        } else {
                            fM47213e = C16620e.m47213e(f4822h) / C16620e.m47211c(f4822h);
                        }
                        ImageBlock imageBlock = this.f124835x;
                        String filename = imageBlock.getMeta().getFilename();
                        Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), false, fM47213e);
                        C28655q c28655q3 = (C28655q) composer2;
                        c28655q3.m87152f0(-412521741);
                        C35035m c35035m = (C35035m) c28655q3.m87161k(AbstractC35033k.f148295a);
                        c28655q3.m87173q(false);
                        Modifier modifierM118994r = AbstractC37056f.m118994r(modifierM3384f, AbstractC33253j.m105485a(c35035m.f148315L));
                        ImageMeta meta = imageBlock.getMeta();
                        AbstractC22676k.m65750j(meta, "<this>");
                        style = meta.getStyle();
                        if (style != null || (scale = style.getScale()) == null) {
                            string = null;
                        } else {
                            string = AbstractC39414r.m125869O0(scale).toString();
                        }
                        if (string != null && string.length() != 0) {
                            if (AbstractC39421y.m125920E(string, "%", false) || (fM125915y2 = AbstractC39420x.m125915y(AbstractC39414r.m125879X(1, string))) == null) {
                                fM125915y = AbstractC39420x.m125915y(string);
                                if (fM125915y != null) {
                                    fFloatValue = fM125915y.floatValue();
                                }
                            } else {
                                fFloatValue = fM125915y2.floatValue() / 100.0f;
                            }
                        }
                        AbstractC29125c.m88522c(painter, filename, AbstractC37056f.m118995s(AbstractC12350b.m34565N(fFloatValue, modifierM118994r)), C2299e.f9102E, C39102j.f168200b, 0.0f, null, composer2, 27656, 96);
                    }
                } else {
                    AbstractC26165a painter2 = success.getPainter();
                    f4822h = painter2.getF4822H();
                    fFloatValue = 1.0f;
                    if (C16620e.m47210b(f4822h, 9205357640488583168L)) {
                        fM47213e = 1.0f;
                    } else {
                        fM47213e = 1.0f;
                    }
                    ImageBlock imageBlock2 = this.f124835x;
                    String filename2 = imageBlock2.getMeta().getFilename();
                    Modifier modifierM3384f2 = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), false, fM47213e);
                    C28655q c28655q4 = (C28655q) composer2;
                    c28655q4.m87152f0(-412521741);
                    C35035m c35035m2 = (C35035m) c28655q4.m87161k(AbstractC35033k.f148295a);
                    c28655q4.m87173q(false);
                    Modifier modifierM118994r2 = AbstractC37056f.m118994r(modifierM3384f2, AbstractC33253j.m105485a(c35035m2.f148315L));
                    ImageMeta meta2 = imageBlock2.getMeta();
                    AbstractC22676k.m65750j(meta2, "<this>");
                    style = meta2.getStyle();
                    if (style != null) {
                        string = null;
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        if (AbstractC39421y.m125920E(string, "%", false)) {
                            fM125915y = AbstractC39420x.m125915y(string);
                            if (fM125915y != null) {
                                fFloatValue = fM125915y.floatValue();
                            }
                        } else {
                            fM125915y = AbstractC39420x.m125915y(string);
                            if (fM125915y != null) {
                                fFloatValue = fM125915y.floatValue();
                            }
                        }
                    }
                    AbstractC29125c.m88522c(painter2, filename2, AbstractC37056f.m118995s(AbstractC12350b.m34565N(fFloatValue, modifierM118994r2)), C2299e.f9102E, C39102j.f168200b, 0.0f, null, composer2, 27656, 96);
                }
                break;
            default:
                C4597r SubcomposeAsyncImage3 = (C4597r) obj;
                AsyncImagePainter$State$Error it3 = (AsyncImagePainter$State$Error) obj2;
                Composer composer3 = (Composer) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                AbstractC22676k.m65750j(SubcomposeAsyncImage3, "$this$SubcomposeAsyncImage");
                AbstractC22676k.m65750j(it3, "it");
                if ((iIntValue3 & 641) == 128) {
                    C28655q c28655q5 = (C28655q) composer3;
                    if (c28655q5.m87121F()) {
                        c28655q5.m87138X();
                    } else {
                        AbstractC32411b.m101109u(this.f124835x.getMeta().getFilename(), null, composer3, 0);
                    }
                } else {
                    AbstractC32411b.m101109u(this.f124835x.getMeta().getFilename(), null, composer3, 0);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
