package p079d2;

import a30.C0332w0;
import al.AbstractC0954a;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.util.SizeF;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import android.widget.RemoteViews;
import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import ov2.C28402f;
import p006a4.AbstractC0355b;
import p009a8.RunnableC0533c;
import p047c9.C4323n;
import p085d9.C11789f;
import p085d9.C11790g;
import p208i2.AbstractC17918w0;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18039u;
import p209i3.C18017a;
import p209i3.C18034p;
import p209i3.C18035q;
import p294l3.C23254g;
import p392p3.C28779q;
import p463rj.AbstractC31479j;
import p607x8.AbstractC38065t;
import p636y3.C39173e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: d2.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11480b {
    /* JADX INFO: renamed from: a */
    public static void m30875a(RemoteViews remoteViews, int i13, RemoteViews remoteViews2, int i14) {
        remoteViews.addStableView(i13, remoteViews2, i14);
    }

    /* JADX INFO: renamed from: b */
    public static EdgeEffect m30876b(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: c */
    public static RenderEffect m30877c(float f13, float f14, int i13) {
        return (f13 == 0.0f && f14 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f13, f14, AbstractC17918w0.m51505G(i13));
    }

    /* JADX INFO: renamed from: d */
    public static RemoteViews m30878d(Map map) {
        return new RemoteViews((Map<SizeF, RemoteViews>) map);
    }

    /* JADX INFO: renamed from: e */
    public static void m30879e(ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C18035q c18035q;
        C18034p c18034p;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            long jKeyAt = longSparseArray.keyAt(i13);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (c18035q = (C18035q) viewOnAttachStateChangeListenerC11482d.m30899d().m121b((int) jKeyAt)) != null && (c18034p = c18035q.f69993a) != null) {
                Object objM129g = c18034p.f69989d.f69980w.m129g(AbstractC18029k.f69964k);
                if (objM129g == null) {
                    objM129g = null;
                }
                C18017a c18017a = (C18017a) objM129g;
                if (c18017a != null && (function1 = (Function1) c18017a.f69929b) != null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m30880f(Canvas canvas, int[] iArr, int i13, float[] fArr, int i14, int i15, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i13, fArr, i14, i15, font, paint);
    }

    /* JADX INFO: renamed from: g */
    public static void m30881g(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    /* JADX INFO: renamed from: h */
    public static void m30882h(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    /* JADX INFO: renamed from: i */
    public static float m30883i(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: j */
    public static Shader.TileMode m30884j() {
        return Shader.TileMode.DECAL;
    }

    /* JADX INFO: renamed from: k */
    public static C11790g m30885k(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z4) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return C11790g.f38233d;
        }
        C11789f c11789f = new C11789f();
        boolean z13 = AbstractC38065t.f163031a > 32 && playbackOffloadSupport == 2;
        c11789f.f38230a = true;
        c11789f.f38231b = z13;
        c11789f.f38232c = z4;
        return c11789f.m31608a();
    }

    /* JADX INFO: renamed from: l */
    public static Typeface m30886l(Configuration configuration, Typeface typeface) {
        int i13;
        if (Build.VERSION.SDK_INT < 31 || (i13 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i13 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC31479j.m96939r(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    /* JADX INFO: renamed from: m */
    public static void m30887m(ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d, long[] jArr, Consumer consumer) {
        C18034p c18034p;
        String strM988b;
        for (long j7 : jArr) {
            C18035q c18035q = (C18035q) viewOnAttachStateChangeListenerC11482d.m30899d().m121b((int) j7);
            if (c18035q != null && (c18034p = c18035q.f69993a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(viewOnAttachStateChangeListenerC11482d.f36910w.getAutofillId(), c18034p.f69992g);
                Object objM129g = c18034p.f69989d.f69980w.m129g(AbstractC18039u.f70019A);
                if (objM129g == null) {
                    objM129g = null;
                }
                List list = (List) objM129g;
                if (list != null && (strM988b = AbstractC0355b.m988b(62, "\n", list, null)) != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new C23254g(strM988b)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static float m30888n(EdgeEffect edgeEffect, float f13, float f14) {
        try {
            return edgeEffect.onPullDistance(f13, f14);
        } catch (Throwable unused) {
            edgeEffect.onPull(f13, f14);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m30889o(ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d, LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC22676k.m65745e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            m30879e(viewOnAttachStateChangeListenerC11482d, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC11482d.f36910w.post(new RunnableC0533c(17, viewOnAttachStateChangeListenerC11482d, longSparseArray));
        }
    }

    /* JADX INFO: renamed from: p */
    public static RemoteViews m30890p(int i13, int i14, String str) {
        return new RemoteViews(str, i13, i14);
    }

    /* JADX INFO: renamed from: q */
    public static void m30891q(AudioTrack audioTrack, C4323n c4323n) {
        LogSessionId logSessionIdM13633a = c4323n.m13633a();
        if (logSessionIdM13633a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdM13633a);
    }

    /* JADX INFO: renamed from: r */
    public static void m30892r(C0332w0 c0332w0, C4323n c4323n) {
        LogSessionId logSessionIdM13633a = c4323n.m13633a();
        if (logSessionIdM13633a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) c0332w0.f1169y).setString("log-session-id", logSessionIdM13633a.getStringId());
    }

    /* JADX INFO: renamed from: s */
    public static void m30893s(RenderNode renderNode, AbstractC0954a abstractC0954a) {
        renderNode.setRenderEffect(abstractC0954a != null ? abstractC0954a.m2423t0() : null);
    }

    /* JADX INFO: renamed from: t */
    public static void m30894t(View view, AbstractC0954a abstractC0954a) {
        view.setRenderEffect(abstractC0954a != null ? abstractC0954a.m2423t0() : null);
    }

    /* JADX INFO: renamed from: u */
    public static final String m30895u(C28779q c28779q, Context context) {
        ArrayList arrayList = c28779q.f116537a;
        C39173e c39173eM113799a = AbstractC35849g.m113799a(context);
        int i13 = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i13 == 0) {
            return AbstractC0355b.m988b(31, null, arrayList, new C28402f(c39173eM113799a));
        }
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        float fM36283m = AbstractC12889b.m36283m(i13 + 400.0f, 1.0f, 1000.0f);
        return (!arrayList.isEmpty() ? "," : "") + "'wght' " + fM36283m;
    }
}
