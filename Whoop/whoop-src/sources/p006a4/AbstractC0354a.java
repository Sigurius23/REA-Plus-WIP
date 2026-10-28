package p006a4;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.LocusId;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.p018ui.node.Owner;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.work.impl.foreground.SystemForegroundService;
import fi.C14509o;
import i63.AbstractC18171j;
import io.sentry.CallableC20367i0;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.replay.ViewTreeObserverOnPreDrawListenerC20184c0;
import io.sentry.android.replay.viewhierarchy.AbstractC20247b;
import io.sentry.android.replay.viewhierarchy.AbstractC20252g;
import io.sentry.android.replay.viewhierarchy.C20250e;
import java.util.ArrayList;
import java.util.List;
import l83.C23465k;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import o73.C27648a;
import p005a3.C0230n0;
import p035bp.AbstractC3511b;
import p085d9.C11781b;
import p085d9.C11789f;
import p085d9.C11790g;
import p108e4.AbstractC12682p;
import p215i9.AbstractC18243s;
import p215i9.C18232h;
import p215i9.C18237m;
import p218ic.C18389w;
import p477s2.AbstractC32069a;
import p516u8.AbstractC34587d0;
import p516u8.C34586d;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p622xq.AbstractC38539a;
import p622xq.AbstractC38540b;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41036k1;
import p690zr.C41006a1;
import p690zr.C41009b1;
import p690zr.C41014d0;
import p690zr.C41060w0;
import p690zr.C41066z0;
import p715kotlin.jvm.internal.AbstractC22676k;
import sh.C32475a;
import sh.C32480f;
import sh.C32481g;
import sh.C32492r;
import sh.InterfaceC32491q;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: a4.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0354a {
    /* JADX INFO: renamed from: A */
    public static void m954A(AudioAttributes.Builder builder) {
        builder.setAllowedCapturePolicy(1);
    }

    /* JADX INFO: renamed from: B */
    public static void m955B(Outline outline, Path path) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            AbstractC38540b.m123496a(outline, path);
            return;
        }
        if (i13 >= 29) {
            try {
                AbstractC38539a.m123495a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC38539a.m123495a(outline, path);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m956C(SystemForegroundService systemForegroundService, int i13, Notification notification, int i14) {
        systemForegroundService.startForeground(i13, notification, i14);
    }

    /* JADX INFO: renamed from: D */
    public static void m957D(SystemForegroundService systemForegroundService, int i13, Notification notification, int i14) {
        try {
            systemForegroundService.startForeground(i13, notification, i14);
        } catch (ForegroundServiceStartNotAllowedException e5) {
            C18389w c18389wM52886d = C18389w.m52886d();
            String str = SystemForegroundService.f7359E;
            if (c18389wM52886d.f71556a <= 5) {
                Log.w(str, "Unable to start foreground service", e5);
            }
        } catch (SecurityException e13) {
            C18389w c18389wM52886d2 = C18389w.m52886d();
            String str2 = SystemForegroundService.f7359E;
            if (c18389wM52886d2.f71556a <= 5) {
                Log.w(str2, "Unable to start foreground service", e13);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static final ImageDecoder.Source m958E(InterfaceC32491q interfaceC32491q, C14509o c14509o, boolean z4) {
        C26611e0 c26611e0Mo101468V0;
        if (interfaceC32491q.getFileSystem() == AbstractC26632p.f105900w && (c26611e0Mo101468V0 = interfaceC32491q.mo101468V0()) != null) {
            return ImageDecoder.createSource(c26611e0Mo101468V0.toFile());
        }
        AbstractC32069a abstractC32069aMo101469c = interfaceC32491q.mo101469c();
        if (abstractC32069aMo101469c instanceof C32475a) {
            return ImageDecoder.createSource(c14509o.f53003a.getAssets(), ((C32475a) abstractC32069aMo101469c).f134489a);
        }
        if ((abstractC32069aMo101469c instanceof C32481g) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((C32481g) abstractC32069aMo101469c).f134505b;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new CallableC20367i0(assetFileDescriptor, 2));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (abstractC32069aMo101469c instanceof C32492r) {
            C32492r c32492r = (C32492r) abstractC32069aMo101469c;
            if (c32492r.f134530a.equals(c14509o.f53003a.getPackageName())) {
                return ImageDecoder.createSource(c14509o.f53003a.getResources(), c32492r.f134531b);
            }
        }
        if (!(abstractC32069aMo101469c instanceof C32480f)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z4 || ((C32480f) abstractC32069aMo101469c).f134503a.isDirect()) {
            return ImageDecoder.createSource(((C32480f) abstractC32069aMo101469c).f134503a);
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static final void m959F(long j7, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final void m960G(View view, AbstractC20252g abstractC20252g, AbstractC18171j options, InterfaceC20602v0 logger, List list) {
        C0230n0 root;
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(logger, "logger");
        if (view instanceof ViewGroup) {
            Object obj = AbstractC20247b.f76054a;
            if (AbstractC39414r.m125876U(view.getClass().getName(), "AndroidComposeView", false)) {
                try {
                    Owner owner = view instanceof Owner ? (Owner) view : null;
                    if (owner != null && (root = owner.getRoot()) != null) {
                        AbstractC20247b.m56177b(root, abstractC20252g, true, options, logger);
                        return;
                    }
                } catch (Throwable th3) {
                    logger.mo16058i(EnumC20436n5.ERROR, th3, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt != null) {
                    viewGroup.indexOfChild(childAt);
                    AbstractC20252g abstractC20252gM83550A = C27648a.m83550A(childAt, abstractC20252g, options);
                    arrayList.add(abstractC20252gM83550A);
                    if (list != null && (abstractC20252gM83550A instanceof C20250e) && abstractC20252gM83550A.f76066e) {
                        list.add(abstractC20252gM83550A);
                    }
                    m960G(childAt, abstractC20252gM83550A, options, logger, list);
                }
            }
            abstractC20252g.f76068g = arrayList;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m961a(View view, ViewTreeObserver.OnDrawListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX INFO: renamed from: b */
    public static int m962b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i13, int i14, double d3) {
        boolean z4;
        int i15;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i13, i14, (int) d3);
            int i16 = 0;
            while (true) {
                z4 = true;
                if (i16 >= supportedPerformancePoints.size()) {
                    i15 = 1;
                    break;
                }
                if (C18232h.m52501c(supportedPerformancePoints.get(i16)).covers(performancePoint)) {
                    i15 = 2;
                    break;
                }
                i16++;
            }
            if (i15 == 1 && AbstractC3511b.f13983E == null) {
                if (AbstractC38065t.f163031a >= 35) {
                    z4 = false;
                } else {
                    int iM975o = m975o(false);
                    int iM975o2 = m975o(true);
                    if (iM975o != 0 && (iM975o2 != 0 ? !(iM975o != 2 || iM975o2 != 2) : iM975o == 2)) {
                        z4 = false;
                    }
                }
                AbstractC3511b.f13983E = Boolean.valueOf(z4);
                if (z4) {
                }
            }
            return i15;
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m963c() {
        Trace.beginAsyncSection("GlanceAppWidget::update", 0);
    }

    /* JADX INFO: renamed from: d */
    public static LocusId m964d(String str) {
        return new LocusId(str);
    }

    /* JADX INFO: renamed from: e */
    public static void m965e(Canvas canvas) {
        canvas.disableZ();
    }

    /* JADX INFO: renamed from: f */
    public static void m966f(Canvas canvas, int i13, BlendMode blendMode) {
        canvas.drawColor(i13, blendMode);
    }

    /* JADX INFO: renamed from: g */
    public static void m967g(Canvas canvas, long j7) {
        canvas.drawColor(j7);
    }

    /* JADX INFO: renamed from: h */
    public static void m968h(Canvas canvas, long j7, BlendMode blendMode) {
        canvas.drawColor(j7, blendMode);
    }

    /* JADX INFO: renamed from: i */
    public static void m969i(Canvas canvas, RectF rectF, float f13, float f14, RectF rectF2, float f15, float f16, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f13, f14, rectF2, f15, f16, paint);
    }

    /* JADX INFO: renamed from: j */
    public static void m970j(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    /* JADX INFO: renamed from: k */
    public static void m971k(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    /* JADX INFO: renamed from: l */
    public static void m972l(Canvas canvas, MeasuredText measuredText, int i13, int i14, int i15, int i16, float f13, float f14, boolean z4, Paint paint) {
        canvas.drawTextRun(measuredText, i13, i14, i15, i16, f13, f14, z4, paint);
    }

    /* JADX INFO: renamed from: m */
    public static void m973m(Canvas canvas) {
        canvas.enableZ();
    }

    /* JADX INFO: renamed from: n */
    public static void m974n() {
        Trace.endAsyncSection("GlanceAppWidget::update", 0);
    }

    /* JADX INFO: renamed from: o */
    public static int m975o(boolean z4) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            C34608o c34608o = new C34608o();
            c34608o.f145741m = AbstractC34587d0.m109382o("video/avc");
            C34610p c34610p = new C34610p(c34608o);
            String str = c34610p.f145783n;
            if (str != null) {
                List listM52551e = AbstractC18243s.m52551e(str, z4, false);
                String strM52548b = AbstractC18243s.m52548b(c34610p);
                Iterable iterableM52551e = strM52548b == null ? C41060w0.f177067E : AbstractC18243s.m52551e(strM52548b, z4, false);
                C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
                c41014d0M133251l.m133224c(listM52551e);
                c41014d0M133251l.m133224c(iterableM52551e);
                C41060w0 c41060w0M133239f = c41014d0M133251l.m133239f();
                for (int i13 = 0; i13 < c41060w0M133239f.f177069z; i13++) {
                    if (((C18237m) c41060w0M133239f.get(i13)).f70951d != null && ((C18237m) c41060w0M133239f.get(i13)).f70951d.getVideoCapabilities() != null && (supportedPerformancePoints = ((C18237m) c41060w0M133239f.get(i13)).f70951d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i14 = 0; i14 < supportedPerformancePoints.size(); i14++) {
                            if (C18232h.m52501c(supportedPerformancePoints.get(i14)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static ColorStateList m976p(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: q */
    public static C41060w0 m977q(C34586d c34586d) {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        C41009b1 c41009b1 = C11781b.f38193e;
        C41066z0 c41066z0 = c41009b1.f176963x;
        if (c41066z0 == null) {
            C41066z0 c41066z1 = new C41066z0(c41009b1, new C41006a1(0, c41009b1.f176961F, c41009b1.f176960E));
            c41009b1.f176963x = c41066z1;
            c41066z0 = c41066z1;
        }
        AbstractC41036k1 it = c41066z0.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (AbstractC38065t.f163031a >= AbstractC38065t.m121922o(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), (AudioAttributes) c34586d.m109367a().f143660x)) {
                c41014d0M133251l.m133222a(num);
            }
        }
        c41014d0M133251l.m133222a(2);
        return c41014d0M133251l.m133239f();
    }

    /* JADX INFO: renamed from: r */
    public static String m978r(LocusId locusId) {
        return locusId.getId();
    }

    /* JADX INFO: renamed from: s */
    public static int m979s(int i13, int i14, C34586d c34586d) {
        for (int i15 = 10; i15 > 0; i15--) {
            int iM121924q = AbstractC38065t.m121924q(i15);
            if (iM121924q != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i13).setSampleRate(i14).setChannelMask(iM121924q).build(), (AudioAttributes) c34586d.m109367a().f143660x)) {
                return i15;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public static C11790g m980t(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z4) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return C11790g.f38233d;
        }
        C11789f c11789f = new C11789f();
        c11789f.f38230a = true;
        c11789f.f38232c = z4;
        return c11789f.m31608a();
    }

    /* JADX INFO: renamed from: u */
    public static int m981u(AccessibilityManager accessibilityManager, int i13, int i14) {
        return accessibilityManager.getRecommendedTimeoutMillis(i13, i14);
    }

    /* JADX INFO: renamed from: v */
    public static final void m982v(Paint paint, CharSequence charSequence, int i13, int i14, Rect rect) {
        paint.getTextBounds(charSequence, i13, i14, rect);
    }

    /* JADX INFO: renamed from: w */
    public static final C23465k m983w(View view) {
        if (view.isAttachedToWindow() && view.getWindowVisibility() == 0) {
            Object parent = view;
            while (parent instanceof View) {
                float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
                View view2 = (View) parent;
                if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                    return new C23465k(Boolean.FALSE, null);
                }
                parent = view2.getParent();
            }
            Rect rect = new Rect();
            return new C23465k(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
        }
        return new C23465k(Boolean.FALSE, null);
    }

    /* JADX INFO: renamed from: x */
    public static Object m984x(int i13) {
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return BlendMode.LIGHTEN;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return BlendMode.COLOR_DODGE;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return BlendMode.DIFFERENCE;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static Insets m985y(int i13, int i14, int i15, int i16) {
        return Insets.of(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: z */
    public static final void m986z(View view, ViewTreeObserverOnPreDrawListenerC20184c0 viewTreeObserverOnPreDrawListenerC20184c0) {
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC20184c0);
        } catch (IllegalStateException unused) {
        }
    }
}
