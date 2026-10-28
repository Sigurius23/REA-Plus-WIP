package v41;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Typeface;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import p078d1.C11457j;
import p426qi.C30387i;
import p426qi.C30402w;
import p426qi.InterfaceC30372a0;
import p505ts.AbstractC34132o;
import p584wi.C37305e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: v41.h0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001at\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0002H\u0080@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lqi/i;", "composition", "", "", "", "layerOpacities", "", "Ll83/k;", "Landroid/graphics/Bitmap;", "overlayLayers", "", NotificationCompat.CATEGORY_PROGRESS, "targetWidthPx", "targetHeightPx", "Landroid/graphics/Typeface;", "fontMap", "a", "(Lqi/i;Ljava/util/Map;Ljava/util/List;FIILjava/util/Map;Lq83/d;)Ljava/lang/Object;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35669h0 {

    /* JADX INFO: renamed from: v41.h0$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.StaticLottieFrameKt$renderStaticLottieFrame$2", m100430f = "StaticLottieFrame.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lbc3/c0;)Landroid/graphics/Bitmap;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ List<C23465k> f151601E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ float f151602F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f151603G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ int f151604H;

        /* JADX INFO: renamed from: w */
        int f151605w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30387i f151606x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Map<String, Typeface> f151607y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Map<String, Integer> f151608z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C30387i c30387i, Map<String, ? extends Typeface> map, Map<String, Integer> map2, List<C23465k> list, float f13, int i13, int i14, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f151606x = c30387i;
            this.f151607y = map;
            this.f151608z = map2;
            this.f151601E = list;
            this.f151602F = f13;
            this.f151603G = i13;
            this.f151604H = i14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f151606x, this.f151607y, this.f151608z, this.f151601E, this.f151602F, this.f151603G, this.f151604H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Map<String, Typeface> map;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f151605w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C30402w c30402w = new C30402w();
            c30402w.m92889p(this.f151606x);
            if (!this.f151607y.isEmpty() && (map = this.f151607y) != c30402w.f124736J) {
                c30402w.f124736J = map;
                c30402w.invalidateSelf();
            }
            for (Map.Entry<String, Integer> entry : this.f151608z.entrySet()) {
                String key = entry.getKey();
                int iIntValue = entry.getValue().intValue();
                C37305e c37305e = new C37305e("**", key);
                PointF pointF = InterfaceC30372a0.f124620a;
                c30402w.m92875a(c37305e, 3, new C11457j(new Integer(iIntValue)));
            }
            for (C23465k c23465k : this.f151601E) {
                c30402w.m92875a(new C37305e("**", (String) c23465k.f92937w), InterfaceC30372a0.f124617I, new C11457j((Bitmap) c23465k.f92938x));
            }
            c30402w.m92896w(this.f151602F);
            int i13 = this.f151603G;
            if (i13 < 1) {
                i13 = 1;
            }
            int i14 = this.f151604H;
            int i15 = i14 >= 1 ? i14 : 1;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i13, i15, Bitmap.Config.ARGB_8888);
            AbstractC22676k.m65749i(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            int iWidth = this.f151606x.f124691k.width();
            int iHeight = this.f151606x.f124691k.height();
            float f13 = i13;
            float f14 = iWidth;
            float f15 = i15;
            float f16 = iHeight;
            float fMin = Math.min(f13 / f14, f15 / f16);
            Matrix matrix = new Matrix();
            matrix.preTranslate((f13 - (f14 * fMin)) / 2.0f, (f15 - (f16 * fMin)) / 2.0f);
            matrix.preScale(fMin, fMin);
            c30402w.setBounds(0, 0, iWidth, iHeight);
            c30402w.m92880g(canvas, matrix);
            return bitmapCreateBitmap;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m112976a(C30387i c30387i, Map<String, Integer> map, List<C23465k> list, float f13, int i13, int i14, Map<String, ? extends Typeface> map2, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
        return AbstractC3006f0.m8705K(AbstractC3050q0.f12077a, new a(c30387i, map2, map, list, f13, i13, i14, null), interfaceC30057d);
    }
}
