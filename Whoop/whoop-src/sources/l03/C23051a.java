package l03;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import c51.C4237n;
import c51.C4243t;
import d51.AbstractC11713a;
import d51.AbstractC11717e;
import e93.AbstractC12889b;
import g93.C15613e;
import i93.C18284j;
import i93.InterfaceC18280f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p208i2.InterfaceC17910s0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: l03.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u001aB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#¨\u0006$"}, m65681d2 = {"Ll03/a;", "", "Lc51/n;", "settings", "<init>", "(Lc51/n;)V", "Ll03/b;", "spec", "", "size", "radiusPx", "", "pxPerDp", "Landroid/graphics/Path;", "g", "(Ll03/b;IIF)Landroid/graphics/Path;", "Landroid/graphics/Shader;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ll03/b;I)Landroid/graphics/Shader;", "gradient", "Landroid/graphics/Paint;", "d", "(Landroid/graphics/Shader;)Landroid/graphics/Paint;", "outline", "b", "(Landroid/graphics/Path;Ll03/b;I)Landroid/graphics/Path;", "a", "(Ll03/b;I)Landroid/graphics/Paint;", "c", "(Landroid/graphics/Shader;I)Landroid/graphics/Paint;", "f", "(Landroid/graphics/Shader;F)Landroid/graphics/Paint;", "Landroid/graphics/Bitmap;", "e", "(Ll03/b;)Landroid/graphics/Bitmap;", "Lc51/n;", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23051a {

    /* JADX INFO: renamed from: b */
    private static final a f90906b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f90907c = C4237n.f17198m;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4237n settings;

    /* JADX INFO: renamed from: l03.a$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, m65681d2 = {"Ll03/a$a;", "", "<init>", "()V", "", "MIN_SIZE_PX", "I", "", "MIN_SHADOW_STOP_GAP", "F", "EDGE_GLOW_STROKE_WIDTH_RATIO", "EDGE_GLOW_BLUR_RATIO", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C23051a(C4237n settings) {
        AbstractC22676k.m65750j(settings, "settings");
        this.settings = settings;
    }

    /* JADX INFO: renamed from: a */
    private final Paint m66988a(C23052b spec, int radiusPx) {
        C4243t centerShadow = this.settings.getCenterShadow();
        float fM31308c = (float) centerShadow.getStartRange().m31308c(spec.getPaceOfAgingScore());
        float fM31308c2 = (float) centerShadow.getStopRange().m31308c(spec.getPaceOfAgingScore());
        float f13 = 0.01f + fM31308c;
        if (fM31308c2 < f13) {
            fM31308c2 = f13;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(AbstractC17918w0.m51506H(centerShadow.getColor()));
        paint.setMaskFilter(new BlurMaskFilter((fM31308c2 - fM31308c) * radiusPx, BlurMaskFilter.Blur.NORMAL));
        return paint;
    }

    /* JADX INFO: renamed from: b */
    private final Path m66989b(Path outline, C23052b spec, int size) {
        float fM31308c = (float) this.settings.getCenterShadow().getStopRange().m31308c(spec.getPaceOfAgingScore());
        Path path = new Path(outline);
        Matrix matrix = new Matrix();
        float f13 = size / 2.0f;
        matrix.setScale(fM31308c, fM31308c, f13, f13);
        path.transform(matrix);
        return path;
    }

    /* JADX INFO: renamed from: c */
    private final Paint m66990c(Shader gradient, int radiusPx) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        float f13 = radiusPx;
        paint.setStrokeWidth(0.6f * f13);
        paint.setShader(gradient);
        paint.setMaskFilter(new BlurMaskFilter(f13 * 0.35f, BlurMaskFilter.Blur.NORMAL));
        return paint;
    }

    /* JADX INFO: renamed from: d */
    private final Paint m66991d(Shader gradient) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(gradient);
        return paint;
    }

    /* JADX INFO: renamed from: f */
    private final Paint m66992f(Shader gradient, float pxPerDp) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.settings.getOutline().getStrokeWidth() * pxPerDp * 2.0f);
        paint.setShader(gradient);
        return paint;
    }

    /* JADX INFO: renamed from: g */
    private final Path m66993g(C23052b spec, int size, int radiusPx, float pxPerDp) {
        long seed = spec.getSeed();
        C15613e c15613e = new C15613e((int) seed, (int) (seed >> 32));
        C18284j segmentCountRange = this.settings.getOutline().getSegmentCountRange();
        int iM36284n = AbstractC12889b.m36284n(AbstractC11717e.m31314c(segmentCountRange, spec.getPaceOfAgingScore()), segmentCountRange.f71133w, segmentCountRange.f71134x);
        InterfaceC18280f interfaceC18280fM13266i = this.settings.getOutline().m13266i(spec.getPaceOfAgingScore());
        ArrayList arrayList = new ArrayList(iM36284n);
        for (int i13 = 0; i13 < iM36284n; i13++) {
            arrayList.add(Float.valueOf((((((Number) interfaceC18280fM13266i.mo52651d()).floatValue() - ((Number) interfaceC18280fM13266i.getStart()).floatValue()) * c15613e.mo43927e()) + ((Number) interfaceC18280fM13266i.getStart()).floatValue()) * pxPerDp));
        }
        InterfaceC17910s0 interfaceC17910s0M31297c = AbstractC11713a.INSTANCE.m31297c(arrayList, size, size, radiusPx);
        if (interfaceC17910s0M31297c instanceof C17891j) {
            return ((C17891j) interfaceC17910s0M31297c).f69587a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* JADX INFO: renamed from: h */
    private final Shader m66994h(C23052b spec, int size) {
        float gradientPadding = this.settings.getGradientPadding();
        float f13 = size;
        float f14 = f13 / 2.0f;
        return new LinearGradient(f14, 0.0f, f14, f13, new int[]{spec.getStartColor(), spec.getStartColor(), spec.getEndColor(), spec.getEndColor()}, new float[]{0.0f, gradientPadding, 1.0f - gradientPadding, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: e */
    public final Bitmap m66995e(C23052b spec) {
        AbstractC22676k.m65750j(spec, "spec");
        int sizePx = spec.getSizePx();
        if (sizePx < 1) {
            sizePx = 1;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizePx, sizePx, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float padding = sizePx / ((this.settings.getPadding() + this.settings.getRadius()) * 2.0f);
        int iM36258X = AbstractC12889b.m36258X(this.settings.getRadius() * padding);
        Path pathM66993g = m66993g(spec, sizePx, iM36258X, padding);
        Shader shaderM66994h = m66994h(spec, sizePx);
        canvas.drawPath(pathM66993g, m66991d(shaderM66994h));
        canvas.save();
        canvas.clipPath(pathM66993g);
        canvas.drawPath(pathM66993g, m66990c(shaderM66994h, iM36258X));
        canvas.drawPath(m66989b(pathM66993g, spec, sizePx), m66988a(spec, iM36258X));
        canvas.restore();
        canvas.drawPath(pathM66993g, m66992f(shaderM66994h, padding));
        return bitmapCreateBitmap;
    }

    public /* synthetic */ C23051a(C4237n c4237n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C4237n(0.0f, 0.0f, null, null, null, null, null, null, 0.0f, null, null, 2047, null) : c4237n);
    }
}
