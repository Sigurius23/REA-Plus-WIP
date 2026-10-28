package o73;

import aa3.C0656u0;
import am.C0991c;
import am.C0992d;
import am.C0993e;
import am.EnumC0989a;
import am.EnumC0994f;
import am.EnumC0995g;
import am.EnumC0996h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.LocaleList;
import android.text.Layout;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.autofill.AutofillManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.media3.common.ParserException;
import androidx.profileinstaller.ProfileVerifier;
import aws.sdk.kotlin.runtime.ConfigurationException;
import b30.C2557k2;
import b30.C2611r1;
import b30.C2618s1;
import bb.C2919f;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cg.C4559n;
import cg.C4560o;
import ch.C4582c;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeCooldownLimit;
import com.amplitude.android.engagement.types.NudgeLifecycleConfig;
import com.amplitude.android.engagement.types.SimulationContext;
import com.google.android.gms.maps.model.LatLng;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.whoop.android.R;
import com.whoop.service.network.model.UserSessionDto;
import ec3.InterfaceC13037f2;
import eu.C13602b;
import eu.C13604c;
import eu.C13611f0;
import eu.C13613g0;
import eu.C13615h0;
import eu.C13619j0;
import eu.C13635v;
import g93.AbstractC15612d;
import g93.C15611c;
import ge3.AbstractC15751g;
import h00.C16506i;
import hb3.AbstractC17104a0;
import hm.C17417d;
import ht2.C17632d;
import i63.AbstractC18171j;
import i63.C18168g;
import i93.C18284j;
import ih0.AbstractC18489d0;
import io.sentry.android.replay.viewhierarchy.AbstractC20252g;
import io.sentry.android.replay.viewhierarchy.C20248c;
import io.sentry.android.replay.viewhierarchy.C20249d;
import io.sentry.android.replay.viewhierarchy.C20250e;
import io.sentry.android.replay.viewhierarchy.C20251f;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21467g;
import j93.InterfaceC21493z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m31.C25002h;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m93.InterfaceC25339g;
import n43.C26285a;
import no.nordicsemi.android.dfu.DfuBaseService;
import nr0.C27072e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p006a4.AbstractC0354a;
import p021av.C2088b;
import p026b2.C2299e;
import p027b3.C2366e;
import p027b3.InterfaceC2395j3;
import p029b5.C2728g;
import p031b9.AbstractC2875y;
import p043c4.DialogC3954d0;
import p048ce.C4470k;
import p161g.C14895a0;
import p161g.C14923z;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15044i9;
import p163g1.C15033h9;
import p181h2.C16617b;
import p181h2.C16618c;
import p208i2.C17875c1;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p294l3.C23248d;
import p294l3.C23249d0;
import p294l3.C23254g;
import p294l3.C23273p0;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p294l3.C23285v0;
import p294l3.C23286w;
import p319m4.AbstractC25012a;
import p326mf.C25500t;
import p335n6.AbstractC26394k;
import p335n6.C26385b;
import p335n6.C26393j;
import p335n6.C26396m;
import p335n6.C26399p;
import p335n6.C26400q;
import p335n6.InterfaceC26392i;
import p335n6.InterfaceC26398o;
import p335n6.InterfaceC26401r;
import p355o2.AbstractC27433f0;
import p355o2.C27428d;
import p355o2.C27430e;
import p370oj.C27965l;
import p370oj.C27966m;
import p370oj.C27968o;
import p386oy.AbstractC28465b;
import p389p0.C28557w0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28662r2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p395p6.C28924v;
import p395p6.C28928w0;
import p499t9.InterfaceC33646o;
import p510u0.AbstractC34339n0;
import p510u0.C34327j0;
import p510u0.C34346p1;
import p510u0.C34354s0;
import p545v6.C35720i;
import p574w6.AbstractC36852c;
import p574w6.C36850a;
import p574w6.C36851b;
import p591wp.C37481b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.ReflectKCallable;
import p715kotlin.reflect.jvm.internal.ReflectKProperty;
import p715kotlin.reflect.jvm.internal.UtilKt;
import p719m22.C24947b;
import q83.AbstractC30060g;
import q83.C30064k;
import q83.InterfaceC30057d;
import r30.EnumC30904i;
import r93.InterfaceC31145n0;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: o73.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C27648a {

    /* JADX INFO: renamed from: c */
    public static C27430e f111255c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111256a;

    /* JADX INFO: renamed from: b */
    public final Object f111257b;

    public /* synthetic */ C27648a(Object obj, int i13) {
        this.f111256a = i13;
        this.f111257b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa A[LOOP:0: B:31:0x009d->B:35:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca A[LOOP:1: B:37:0x00bc->B:41:0x00ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0187  */
    /* JADX WARN: Code duplicated, block: B:95:0x018b  */
    /* JADX INFO: renamed from: A */
    public static AbstractC20252g m83550A(View view, AbstractC20252g abstractC20252g, AbstractC18171j options) {
        boolean z4;
        boolean z13;
        boolean z14;
        Bitmap bitmap;
        int extendedPaddingTop;
        Object tag;
        String str;
        Class<?> superclass;
        CopyOnWriteArraySet copyOnWriteArraySet;
        Class<?> superclass2;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        String lowerCase;
        AbstractC22676k.m65750j(options, "options");
        C23465k c23465kM983w = AbstractC0354a.m983w(view);
        boolean zBooleanValue = ((Boolean) c23465kM983w.f92937w).booleanValue();
        Rect rect = (Rect) c23465kM983w.f92938x;
        if (zBooleanValue) {
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                if (AbstractC39414r.m125876U(lowerCase2, "sentry-unmask", false)) {
                    options.mo52172e();
                    z4 = false;
                } else {
                    if (AbstractC22676k.m65745e(view.getTag(R.id.sentry_privacy), "unmask")) {
                        options.mo52172e();
                    } else {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                            if (AbstractC39414r.m125876U(lowerCase, "sentry-mask", false)) {
                                options.mo52172e();
                            } else if (AbstractC22676k.m65745e(view.getTag(R.id.sentry_privacy), "mask")) {
                                options.mo52172e();
                            } else {
                                if (view.getParent() != null) {
                                    AbstractC22676k.m65749i(view.getParent(), "getParent(...)");
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = (CopyOnWriteArraySet) options.f70499c;
                                AbstractC22676k.m65749i(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = (CopyOnWriteArraySet) options.f70498b;
                                        AbstractC22676k.m65749i(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                }
                            }
                            z4 = true;
                        } else {
                            if (AbstractC22676k.m65745e(view.getTag(R.id.sentry_privacy), "mask")) {
                                options.mo52172e();
                            } else {
                                if (view.getParent() != null) {
                                    AbstractC22676k.m65749i(view.getParent(), "getParent(...)");
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = (CopyOnWriteArraySet) options.f70499c;
                                AbstractC22676k.m65749i(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = (CopyOnWriteArraySet) options.f70498b;
                                        AbstractC22676k.m65749i(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                }
                            }
                            z4 = true;
                        }
                    }
                    z4 = false;
                }
            } else {
                if (AbstractC22676k.m65745e(view.getTag(R.id.sentry_privacy), "unmask")) {
                    options.mo52172e();
                } else {
                    tag = view.getTag();
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        lowerCase = str.toLowerCase(Locale.ROOT);
                        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                        if (AbstractC39414r.m125876U(lowerCase, "sentry-mask", false)) {
                            options.mo52172e();
                        } else if (AbstractC22676k.m65745e(view.getTag(R.id.sentry_privacy), "mask")) {
                            options.mo52172e();
                        } else {
                            if (view.getParent() != null) {
                                AbstractC22676k.m65749i(view.getParent(), "getParent(...)");
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = (CopyOnWriteArraySet) options.f70499c;
                            AbstractC22676k.m65749i(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = (CopyOnWriteArraySet) options.f70498b;
                                    AbstractC22676k.m65749i(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                        }
                        z4 = true;
                    } else {
                        if (AbstractC22676k.m65745e(view.getTag(R.id.sentry_privacy), "mask")) {
                            options.mo52172e();
                        } else {
                            if (view.getParent() != null) {
                                AbstractC22676k.m65749i(view.getParent(), "getParent(...)");
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = (CopyOnWriteArraySet) options.f70499c;
                            AbstractC22676k.m65749i(copyOnWriteArraySet, "getUnmaskViewClasses(...)");
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = (CopyOnWriteArraySet) options.f70498b;
                                    AbstractC22676k.m65749i(copyOnWriteArraySet2, "getMaskViewClasses(...)");
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                        }
                        z4 = true;
                    }
                }
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            C17417d c17417d = layout != null ? new C17417d(layout, 10) : null;
            int currentTextColor = textView.getCurrentTextColor() | (-16777216);
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            try {
                extendedPaddingTop = textView.getTotalPaddingTop();
            } catch (NullPointerException unused) {
                extendedPaddingTop = textView.getExtendedPaddingTop();
            }
            textView.getX();
            textView.getY();
            return new C20251f(c17417d, Integer.valueOf(currentTextColor), totalPaddingLeft, extendedPaddingTop, textView.getWidth(), textView.getHeight(), textView.getElevation() + (abstractC20252g != null ? abstractC20252g.f76064c : 0.0f), abstractC20252g, z4, zBooleanValue, rect);
        }
        if (!(view instanceof ImageView)) {
            if (!(view instanceof SurfaceView)) {
                view.getX();
                view.getY();
                return new C20248c(view.getWidth(), view.getHeight(), view.getElevation() + (abstractC20252g != null ? abstractC20252g.f76064c : 0.0f), abstractC20252g, z4, zBooleanValue, rect);
            }
            WeakReference weakReference = new WeakReference(view);
            SurfaceView surfaceView = (SurfaceView) view;
            surfaceView.getX();
            surfaceView.getY();
            return new C20250e(weakReference, surfaceView.getWidth(), surfaceView.getHeight(), surfaceView.getElevation() + (abstractC20252g != null ? abstractC20252g.f76064c : 0.0f), abstractC20252g, z4, zBooleanValue, rect);
        }
        ImageView imageView = (ImageView) view;
        imageView.getX();
        imageView.getY();
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        float elevation = imageView.getElevation() + (abstractC20252g != null ? abstractC20252g.f76064c : 0.0f);
        if (z4) {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null) {
                z14 = false;
            } else {
                if (!(drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) && (!(drawable instanceof BitmapDrawable) || ((bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            z13 = z14;
        }
        return new C20249d(width, height, elevation, abstractC20252g, z13, zBooleanValue, rect);
    }

    /* JADX INFO: renamed from: B */
    public static Boolean m83551B(C4470k c4470k, String str) {
        String strM13963a = c4470k.m13963a(str, null);
        if (strM13963a == null) {
            return null;
        }
        String lowerCase = strM13963a.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        Boolean boolM125868N0 = AbstractC39414r.m125868N0(lowerCase);
        if (boolM125868N0 != null) {
            return boolM125868N0;
        }
        throw new ConfigurationException("Failed to parse config property " + m83593p(str, null) + " as a boolean");
    }

    /* JADX INFO: renamed from: C */
    public static final C27430e m83552C() {
        C27430e c27430e = f111255c;
        if (c27430e != null) {
            return c27430e;
        }
        C27428d c27428d = new C27428d("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i13 = AbstractC27433f0.f110561a;
        C17875c1 c17875c1 = new C17875c1(C17919x.f69625b);
        C0656u0 c0656u0 = new C0656u0(5);
        c0656u0.m1651t(19.0f, 6.41f);
        c0656u0.m1649r(17.59f, 5.0f);
        c0656u0.m1649r(12.0f, 10.59f);
        c0656u0.m1649r(6.41f, 5.0f);
        c0656u0.m1649r(5.0f, 6.41f);
        c0656u0.m1649r(10.59f, 12.0f);
        c0656u0.m1649r(5.0f, 17.59f);
        c0656u0.m1649r(6.41f, 19.0f);
        c0656u0.m1649r(12.0f, 13.41f);
        c0656u0.m1649r(17.59f, 19.0f);
        c0656u0.m1649r(19.0f, 17.59f);
        c0656u0.m1649r(13.41f, 12.0f);
        c0656u0.m1640i();
        C27428d.m82858a(c27428d, c0656u0.f2286a, c17875c1);
        C27430e c27430eM82859b = c27428d.m82859b();
        f111255c = c27430eM82859b;
        return c27430eM82859b;
    }

    /* JADX INFO: renamed from: D */
    public static final Drawable m83553D(Context context, int i13) {
        Drawable drawableM92133x = AbstractC30060g.m92133x(context, i13);
        if (drawableM92133x != null) {
            return drawableM92133x;
        }
        throw new IllegalStateException(AbstractC2875y.m8295h(i13, "Invalid resource ID: ").toString());
    }

    /* JADX INFO: renamed from: E */
    public static C2366e m83554E() {
        if (C2366e.f9338f == null) {
            C2366e c2366e = new C2366e();
            new Rect();
            C2366e.f9338f = c2366e;
        }
        C2366e c2366e2 = C2366e.f9338f;
        AbstractC22676k.m65748h(c2366e2, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
        return c2366e2;
    }

    /* JADX INFO: renamed from: F */
    public static C25500t m83555F() {
        return C25500t.f99854h;
    }

    /* JADX INFO: renamed from: G */
    public static final Field m83556G(InterfaceC21493z interfaceC21493z) {
        AbstractC22676k.m65750j(interfaceC21493z, "<this>");
        ReflectKProperty<?> reflectKPropertyAsReflectProperty = UtilKt.asReflectProperty(interfaceC21493z);
        if (reflectKPropertyAsReflectProperty != null) {
            return reflectKPropertyAsReflectProperty.getJavaField();
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static final Method m83557H(InterfaceC21467g interfaceC21467g) {
        InterfaceC25339g caller;
        AbstractC22676k.m65750j(interfaceC21467g, "<this>");
        ReflectKCallable<?> reflectKCallableAsReflectCallable = UtilKt.asReflectCallable(interfaceC21467g);
        Member member = (reflectKCallableAsReflectCallable == null || (caller = reflectKCallableAsReflectCallable.getCaller()) == null) ? null : caller.getMember();
        if (member instanceof Method) {
            return (Method) member;
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static final Type m83558I(InterfaceC21456a0 interfaceC21456a0) {
        AbstractC22676k.m65750j(interfaceC21456a0, "<this>");
        return AbstractC21478l0.m60396B(interfaceC21456a0);
    }

    /* JADX INFO: renamed from: J */
    public static final int m83559J(C23286w c23286w, long j7, InterfaceC2395j3 interfaceC2395j3) {
        float fMo7305h = interfaceC2395j3 != null ? interfaceC2395j3.mo7305h() : 0.0f;
        int i13 = (int) (4294967295L & j7);
        int iM67375e = c23286w.m67375e(Float.intBitsToFloat(i13));
        if (Float.intBitsToFloat(i13) < c23286w.m67376f(iM67375e) - fMo7305h || Float.intBitsToFloat(i13) > c23286w.m67372b(iM67375e) + fMo7305h) {
            return -1;
        }
        int i14 = (int) (j7 >> 32);
        if (Float.intBitsToFloat(i14) < (-fMo7305h) || Float.intBitsToFloat(i14) > c23286w.f92261d + fMo7305h) {
            return -1;
        }
        return iM67375e;
    }

    /* JADX INFO: renamed from: K */
    public static C25500t m83560K() {
        return C25500t.f99852f;
    }

    /* JADX INFO: renamed from: L */
    public static final long m83561L(C34354s0 c34354s0, C16618c c16618c, int i13) {
        C34346p1 c34346p1M108662d = c34354s0.m108662d();
        C23286w c23286w = c34346p1M108662d != null ? c34346p1M108662d.f144282a.f92228b : null;
        InterfaceC39147y interfaceC39147yM108661c = c34354s0.m108661c();
        return (c23286w == null || interfaceC39147yM108661c == null) ? C23283u0.f92251b : c23286w.m67378h(c16618c.m47206l(interfaceC39147yM108661c.mo3555y(0L)), i13, C23273p0.f92215b);
    }

    /* JADX INFO: renamed from: M */
    public static final String m83562M(C4470k c4470k) {
        AbstractC22676k.m65750j(c4470k, "<this>");
        return c4470k.m13963a("region", null);
    }

    /* JADX INFO: renamed from: N */
    public static final C4560o m83563N(C4470k c4470k, String str, String str2) {
        String strM13963a = c4470k.m13963a(str, str2);
        if (strM13963a == null) {
            return null;
        }
        try {
            return C4559n.m14242a(C4560o.f18367i, strM13963a);
        } catch (Exception e5) {
            throw new ConfigurationException("Failed to parse config property " + m83593p(str, str2) + " as a URL", e5);
        }
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m83564O(C26393j c26393j) {
        String str = null;
        C36851b c36851b = (C36851b) c26393j.f104844a.mo78097a(null, C26400q.f104852w);
        C36850a c36850a = c36851b != null ? c36851b.f157626a : null;
        if (c36850a != null) {
            Object obj = c36850a.f157625a.get(AbstractC36852c.f157627a);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m83565P(InterfaceC31145n0 interfaceC31145n0) {
        AbstractC22676k.m65750j(interfaceC31145n0, "<this>");
        return interfaceC31145n0.getGetter() == null;
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m83566Q(int i13) {
        int type = Character.getType(i13);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m83567R(int i13) {
        return Character.isWhitespace(i13) || i13 == 160;
    }

    /* JADX INFO: renamed from: S */
    public static final boolean m83568S(int i13) {
        int type;
        return (!m83567R(i13) || (type = Character.getType(i13)) == 14 || type == 13 || i13 == 10) ? false : true;
    }

    /* JADX INFO: renamed from: T */
    public static float m83569T(float f13, float f14, float f15) {
        return (f15 * f14) + ((1.0f - f15) * f13);
    }

    /* JADX INFO: renamed from: U */
    public static final int m83570U(C18284j c18284j) {
        C15611c c15611c = AbstractC15612d.f58612w;
        int i13 = c18284j.f71133w;
        if (c18284j.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + c18284j);
        }
        int i14 = c18284j.f71134x;
        if (i14 < Integer.MAX_VALUE) {
            return AbstractC15612d.f58613x.mo43933h(i13, i14 + 1);
        }
        if (i13 <= Integer.MIN_VALUE) {
            return AbstractC15612d.f58613x.mo43928f();
        }
        return AbstractC15612d.f58613x.mo43933h(i13 - 1, i14) + 1;
    }

    /* JADX INFO: renamed from: V */
    public static void m83571V(View view, AutofillManager autofillManager, int i13, boolean z4) {
        autofillManager.notifyViewVisibilityChanged(view, i13, z4);
    }

    /* JADX INFO: renamed from: W */
    public static Object[] m83572W(int i13, Object[] objArr) {
        if (objArr.length < i13) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i13);
        }
        if (objArr.length > i13) {
            objArr[i13] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: X */
    public static void m83573X(Window window, boolean z4) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z4 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    /* JADX INFO: renamed from: Y */
    public static final boolean m83574Y(InterfaceC26392i interfaceC26392i) {
        if (interfaceC26392i instanceof C28924v) {
            return true;
        }
        if (!(interfaceC26392i instanceof AbstractC26394k)) {
            return false;
        }
        ArrayList arrayList = ((AbstractC26394k) interfaceC26392i).f104849b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m83574Y((InterfaceC26392i) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public static C2919f m83575Z(int i13, InterfaceC33646o interfaceC33646o, C38059n c38059n) throws ParserException {
        C2919f c2919fM8506a = C2919f.m8506a(interfaceC33646o, c38059n);
        while (true) {
            int i14 = c2919fM8506a.f11740a;
            if (i14 == i13) {
                return c2919fM8506a;
            }
            AbstractC38963t7.m124388r(i14, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j7 = c2919fM8506a.f11741b;
            long j13 = 8 + j7;
            if (j7 % 2 != 0) {
                j13 = 9 + j7;
            }
            if (j13 > 2147483647L) {
                throw ParserException.m5051c("Chunk is too large (~2GB+) to skip; id: " + i14);
            }
            interfaceC33646o.mo3100n((int) j13);
            c2919fM8506a = C2919f.m8506a(interfaceC33646o, c38059n);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m83576a(Modifier modifier, EnumC0996h enumC0996h, EnumC0995g enumC0995g, float f13, EnumC0989a enumC0989a, float f14, EnumC0995g enumC0995g2, C37816b c37816b, Composer composer, int i13) {
        int i14;
        EnumC0989a enumC0989a2;
        float f15;
        EnumC0994f enumC0994f = EnumC0994f.f3743w;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1567419051);
        if ((i13 & 14) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= c28655q.m87153g(enumC0994f) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= c28655q.m87153g(enumC0996h) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i14 |= c28655q.m87153g(enumC0995g) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 57344) == 0) {
            i14 |= c28655q.m87147d(f13) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & 458752) == 0) {
            enumC0989a2 = enumC0989a;
            i14 |= c28655q.m87153g(enumC0989a2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            enumC0989a2 = enumC0989a;
        }
        if ((i13 & 3670016) == 0) {
            f15 = f14;
            i14 |= c28655q.m87147d(f15) ? 1048576 : 524288;
        } else {
            f15 = f14;
        }
        if ((i13 & 29360128) == 0) {
            i14 |= c28655q.m87153g(enumC0995g2) ? 8388608 : 4194304;
        }
        if ((i13 & 234881024) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i14 & 191739611) == 38347922 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87152f0(1107217839);
            boolean z4 = ((i14 & 3670016) == 1048576) | ((i14 & 112) == 32) | ((i14 & 57344) == 16384) | ((i14 & 896) == 256) | ((i14 & 7168) == 2048) | ((i14 & 29360128) == 8388608) | ((i14 & 458752) == 131072);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                C0991c c0991c = new C0991c(f13, enumC0996h, f15, enumC0995g, enumC0995g2, enumC0989a2);
                c28655q.m87172p0(c0991c);
                objM87133R = c0991c;
            }
            InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R;
            c28655q.m87173q(false);
            int i15 = ((i14 >> 24) & 14) | ((i14 << 3) & 112);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            int i16 = ((i15 << 6) & 896) | 6;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC18489d0.m53384y((i16 >> 6) & 14, c37816b, c28655q, true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0992d(modifier, enumC0996h, enumC0995g, f13, enumC0989a, f14, enumC0995g2, c37816b, i13);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final int m83577a0(int i13, int i14) {
        return (i13 >>> (32 - i14)) & ((-i14) >> 31);
    }

    /* JADX INFO: renamed from: b */
    public static final void m83578b(Modifier modifier, EnumC0996h enumC0996h, EnumC0995g enumC0995g, float f13, EnumC0989a enumC0989a, float f14, EnumC0995g enumC0995g2, C37816b c37816b, Composer composer, int i13) {
        EnumC0995g enumC0995g3;
        EnumC0989a enumC0989a2;
        EnumC0996h enumC0996h2;
        EnumC0996h enumC0996h3;
        EnumC0989a enumC0989a3;
        EnumC0995g enumC0995g4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-137566119);
        if (((i13 | 548912) & 23967451) == 4793490 && c28655q.m87121F()) {
            c28655q.m87138X();
            enumC0996h3 = enumC0996h;
            enumC0989a3 = enumC0989a;
            enumC0995g4 = enumC0995g2;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                EnumC0996h enumC0996h4 = EnumC0996h.f3748w;
                enumC0995g3 = enumC0995g;
                enumC0989a2 = EnumC0989a.f3709w;
                enumC0996h2 = enumC0996h4;
            } else {
                c28655q.m87138X();
                enumC0996h2 = enumC0996h;
                enumC0989a2 = enumC0989a;
                enumC0995g3 = enumC0995g2;
            }
            c28655q.m87175r();
            EnumC0994f enumC0994f = EnumC0994f.f3743w;
            m83576a(modifier, enumC0996h2, enumC0995g, f13, enumC0989a2, f14, enumC0995g3, c37816b, c28655q, 102460854);
            enumC0996h3 = enumC0996h2;
            enumC0989a3 = enumC0989a2;
            enumC0995g4 = enumC0995g3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0993e(modifier, enumC0996h3, enumC0995g, f13, enumC0989a3, f14, enumC0995g4, c37816b, i13);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static String m83579b0(Context context, String str, long j7, int i13) {
        Resources resources = context.getApplicationContext().getResources();
        InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.raw.keep_third_party_licenses)));
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenRawResource.skip(j7);
            if (i13 <= 0) {
                i13 = Integer.MAX_VALUE;
            }
            while (i13 > 0) {
                int i14 = inputStreamOpenRawResource.read(bArr, 0, Math.min(i13, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED));
                if (i14 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i14);
                i13 -= i14;
            }
            inputStreamOpenRawResource.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e5) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e5);
            }
        } catch (IOException e13) {
            throw new RuntimeException("Failed to read license or metadata text.", e13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m83580c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1257244356);
        if (i13 == 0 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C28928w0.f117044w;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
            c28655q.m87152f0(-1115894518);
            c28655q.m87152f0(1886828752);
            if (!(c28655q.f115906a instanceof C26385b)) {
                AbstractC28683x.m87269w();
                throw null;
            }
            c28655q.m87146c0();
            if (c28655q.f115903S) {
                c28655q.m87163l(new C4582c(interfaceC4339a, 9));
            } else {
                c28655q.m87178s0();
            }
            AbstractC25012a.m73392y(c28655q, true, false, false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28557w0(i13, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m83581d(InterfaceC26401r interfaceC26401r, String str, InterfaceC26398o interfaceC26398o, int i13, Composer composer, int i14, int i15) {
        int i16;
        InterfaceC26401r interfaceC26401r2;
        String str2;
        InterfaceC26398o interfaceC26398o2;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(491792371);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? c28655q.m87153g(interfaceC26401r) : c28655q.m87157i(interfaceC26401r) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87153g(str) ? 32 : 16;
        }
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(interfaceC26398o) ? 256 : 128;
        }
        int i19 = i15 & 8;
        if (i19 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i24 = i16 | 24576;
        if ((i24 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
            i17 = i13;
            interfaceC26398o2 = interfaceC26398o;
            str2 = str;
            interfaceC26401r2 = interfaceC26401r;
        } else {
            if (i18 != 0) {
                interfaceC26398o = C26396m.f104850a;
            }
            InterfaceC26398o interfaceC26398o3 = interfaceC26398o;
            if (i19 != 0) {
                i13 = 1;
            }
            int i25 = i13;
            m83582e(interfaceC26401r, str, interfaceC26398o3, i25, c28655q, (i24 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (57344 & i24));
            interfaceC26401r2 = interfaceC26401r;
            str2 = str;
            interfaceC26398o2 = interfaceC26398o3;
            i17 = i25;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16506i(interfaceC26401r2, str2, interfaceC26398o2, i17, i14, i15);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m83582e(InterfaceC26401r interfaceC26401r, String str, InterfaceC26398o interfaceC26398o, int i13, Composer composer, int i14) {
        int i15;
        InterfaceC26398o interfaceC26398oMo78107d;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2075067909);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? c28655q.m87153g(interfaceC26401r) : c28655q.m87157i(interfaceC26401r) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(interfaceC26398o) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? c28655q.m87153g(null) : c28655q.m87157i(null) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q.m87153g(null) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((74899 & i15) == 74898 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (str != null) {
                c28655q.m87152f0(884096034);
                c28655q.m87152f0(5004770);
                boolean z4 = (i15 & 112) == 32;
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == c28676v0) {
                    objM87133R = new C17632d(str, 24);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                C36850a c36850a = new C36850a();
                ((Function1) objM87133R).invoke(c36850a);
                interfaceC26398oMo78107d = interfaceC26398o.mo78107d(new C36851b(c36850a));
                c28655q.m87173q(false);
            } else {
                c28655q.m87152f0(884190429);
                c28655q.m87173q(false);
                interfaceC26398oMo78107d = interfaceC26398o;
            }
            c28655q.m87152f0(1849434622);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = C26399p.f104851w;
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R2);
            c28655q.m87152f0(-1115894518);
            c28655q.m87152f0(1886828752);
            if (!(c28655q.f115906a instanceof C26385b)) {
                AbstractC28683x.m87269w();
                throw null;
            }
            c28655q.m87146c0();
            if (c28655q.f115903S) {
                c28655q.m87163l(new C4582c(interfaceC4339a, 4));
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, new C24947b(8), interfaceC26401r);
            AbstractC28683x.m87239G(c28655q, new C24947b(9), interfaceC26398oMo78107d);
            AbstractC28683x.m87239G(c28655q, new C24947b(10), new C35720i(i13));
            AbstractC28683x.m87239G(c28655q, new C24947b(11), null);
            AbstractC28683x.m87239G(c28655q, new C24947b(12), null);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(interfaceC26401r, str, interfaceC26398o, i13, i14, 8);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m83583f(Nudge nudge, SimulationContext simulationContext, boolean z4, InterfaceC4339a restartAction, Composer composer, int i13) {
        DebugStatus debugStatus;
        C27968o c27968o;
        String period;
        NudgeLifecycleConfig lifecycleConfig;
        List<NudgeCooldownLimit> cooldownLimits;
        AbstractC22676k.m65750j(restartAction, "restartAction");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(801768382);
        if (simulationContext == null) {
            debugStatus = DebugStatus.ERROR;
        } else {
            debugStatus = ((simulationContext.getPassesCooldown() && simulationContext.getPassesSnoozedConditions()) || z4) ? DebugStatus.SUCCESS : DebugStatus.WARNING;
        }
        DebugStatus debugStatus2 = debugStatus;
        NudgeCooldownLimit nudgeCooldownLimit = (nudge == null || (lifecycleConfig = nudge.getLifecycleConfig()) == null || (cooldownLimits = lifecycleConfig.getCooldownLimits()) == null) ? null : (NudgeCooldownLimit) AbstractC25265s.m74100H0(cooldownLimits);
        Integer max = nudgeCooldownLimit != null ? nudgeCooldownLimit.getMax() : null;
        if (nudgeCooldownLimit == null || max == null) {
            c27968o = new C27968o("No limit", null);
        } else {
            String str = max.intValue() > 1 ? "times" : "time";
            if (nudgeCooldownLimit.getPeriodCount() == null || nudgeCooldownLimit.getPeriodCount().intValue() <= 1) {
                period = nudgeCooldownLimit.getPeriod();
                if (period == null) {
                    period = "unknown period";
                }
            } else {
                period = nudgeCooldownLimit.getPeriodCount() + ' ' + nudgeCooldownLimit.getPeriod() + 's';
            }
            c27968o = new C27968o("Show a max of " + max + ' ' + str + " per " + period, "User has exceeded limit");
        }
        AbstractC37926s0.m121464b("Limits", debugStatus2, AbstractC37817c.m121341b(910052639, c28655q, new C27965l(debugStatus2, c27968o, simulationContext, nudge, restartAction, i13)), c28655q, 390);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C27966m(nudge, simulationContext, z4, restartAction, i13);
    }

    /* JADX INFO: renamed from: g */
    public static final void m83584g(Integer num, String text, long j7, Modifier modifier, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        Integer num2;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        Integer num3;
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(844293618);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            num2 = num;
        } else {
            num2 = num;
            i15 = (c28655q.m87153g(num2) ? 4 : 2) | i13;
        }
        int i18 = i15 | (c28655q.m87153g(text) ? 32 : 16) | (c28655q.m87151f(j7) ? 256 : 128);
        if ((i13 & 3072) == 0) {
            i18 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i18 | (c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK);
        int i24 = i14 & 32;
        if (i24 != 0) {
            i16 = i19 | ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z14 = z13;
        } else {
            z14 = z13;
            i16 = i19 | (c28655q.m87155h(z14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
        }
        if ((i16 & 74899) == 74898 && c28655q.m87121F()) {
            c28655q.m87138X();
            num3 = num2;
            z15 = z14;
        } else {
            if (i17 != 0) {
                num2 = null;
            }
            boolean z16 = i24 != 0 ? true : z14;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C23248d c23248d = new C23248d();
            if (num2 != null) {
                AbstractC34339n0.m108632j(c23248d, "lpm_selector_text_icon", "[icon]");
                AbstractC34339n0.m108632j(c23248d, "lpm_selector_spacing", "[spacer]");
            }
            c23248d.m67300b(text);
            C23254g c23254gM67309k = c23248d.m67309k();
            C23285v0 c23285v0 = ((C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b)).f56285l;
            c28655q.m87150e0(-1309056879);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c28655q.m87150e0(-1309055963);
            if (num2 != null) {
                float f13 = 1;
                linkedHashMap.put("lpm_selector_text_icon", new C34327j0(new C23249d0(AbstractC35745c.m113248j(f13, 8589934592L), AbstractC35745c.m113248j(f13, 8589934592L), 4), new C37816b(new C2557k2(AbstractC37817c.m121344e(676858145, c28655q, new C2618s1(num2.intValue(), j7, z16)), 8), true, -905386904)));
                linkedHashMap.put("lpm_selector_spacing", new C34327j0(new C23249d0(AbstractC35745c.m113244f(0.4d), AbstractC35745c.m113248j(0, 8589934592L), 4), new C37816b(new C2557k2(AbstractC28465b.f114769a, 8), true, -905386904)));
            }
            c28655q.m87173q(false);
            c28655q.m87173q(false);
            AbstractC15011f9.m43115c(c23254gM67309k, null, z4 ? j7 : C17919x.m51541c(0.6f, j7), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, linkedHashMap, null, c23285v0, c28655q, 0, 3120, 88058);
            c28655q.m87173q(true);
            z15 = z16;
            num3 = num2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2611r1(num3, text, j7, modifier, z4, z15, i13, i14);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m83585h(C13619j0 c13619j0, float f13, long j7, C37481b c37481b, long j13, String str, boolean z4, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Composer composer, int i13) {
        Function1 function5;
        float f14;
        long j14;
        long j15;
        Function1 function6;
        Function1 function7;
        Function1 function8;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1068930799);
        int i14 = (c28655q.m87153g(str) ? 4 : 2) | 1797552;
        c28655q.m87140Z();
        if ((i13 & 1) == 0 || c28655q.m87118C()) {
            long jM44450c = AbstractC15751g.m44450c(0.5f, 1.0f);
            long jM44450c2 = AbstractC15751g.m44450c(0.5f, 0.0f);
            function5 = C13604c.f48143K;
            f14 = 1.0f;
            j14 = jM44450c;
            j15 = jM44450c2;
            function6 = C13604c.f48144L;
            function7 = C13604c.f48145M;
            function8 = C13604c.f48146N;
            z13 = true;
        } else {
            c28655q.m87138X();
            f14 = f13;
            j14 = j7;
            j15 = j13;
            z13 = z4;
            function5 = function1;
            function6 = function2;
            function7 = function3;
            function8 = function4;
        }
        c28655q.m87175r();
        m83586i(c13619j0, f14, j14, c37481b, j15, str, z13, function5, function6, function7, function8, c28655q, 1188851128, i14 & 4194302);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C13611f0(c13619j0, f14, j14, c37481b, j15, str, z13, function5, function6, function7, function8, i13);
    }

    /* JADX INFO: renamed from: i */
    public static final void m83586i(C13619j0 c13619j0, float f13, long j7, C37481b c37481b, long j13, String str, boolean z4, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Composer composer, int i13, int i14) {
        boolean z13;
        Float fValueOf = Float.valueOf(0.0f);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(690593545);
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        if ((i13 & 112) == 0) {
            c28655q.m87147d(f13);
        }
        if ((i13 & 896) == 0) {
            c28655q.m87151f(j7);
        }
        if ((i13 & 7168) == 0) {
            z13 = false;
            c28655q.m87155h(false);
        } else {
            z13 = false;
        }
        if ((i13 & 57344) == 0) {
            c28655q.m87155h(z13);
        }
        if ((i13 & 3670016) == 0) {
            c28655q.m87151f(j13);
        }
        if ((i13 & 29360128) == 0) {
            c28655q.m87147d(0.0f);
        }
        if ((234881024 & i13) == 0) {
            c28655q.m87153g(null);
        }
        if ((i14 & 14) == 0) {
            c28655q.m87153g(str);
        }
        if ((i14 & 112) == 0) {
            c28655q.m87155h(z4);
        }
        if ((i14 & 896) == 0) {
            c28655q.m87147d(0.0f);
        }
        if ((i14 & 7168) == 0) {
            c28655q.m87153g(function1);
        }
        if ((i14 & 57344) == 0) {
            c28655q.m87153g(function2);
        }
        if ((458752 & i14) == 0) {
            c28655q.m87153g(function3);
        }
        if ((i14 & 3670016) == 0) {
            c28655q.m87153g(function4);
        }
        c28655q.m87140Z();
        if ((i13 & 1) != 0 && !c28655q.m87118C()) {
            c28655q.m87138X();
        }
        c28655q.m87175r();
        C13613g0 c13613g0 = new C13613g0(abstractC17104a0 instanceof C13635v ? (C13635v) abstractC17104a0 : null, AbstractC28683x.m87237E(c28655q), c13619j0, function1, function2, function3, function4, f13, j7, c37481b, j13, str, z4);
        c28655q.m87152f0(1886828752);
        if (!(abstractC17104a0 instanceof C13635v)) {
            AbstractC28683x.m87269w();
            throw null;
        }
        c28655q.m87146c0();
        if (c28655q.f115903S) {
            c28655q.m87163l(new C2088b(c13613g0, 10));
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87243K(c28655q, C13602b.f48114R, function1);
        AbstractC28683x.m87243K(c28655q, C13602b.f48115S, function2);
        AbstractC28683x.m87243K(c28655q, C13602b.f48116T, function3);
        AbstractC28683x.m87243K(c28655q, C13602b.f48117U, function4);
        AbstractC28683x.m87243K(c28655q, C13602b.f48118V, null);
        AbstractC28683x.m87243K(c28655q, C13602b.f48119W, null);
        AbstractC28683x.m87239G(c28655q, C13602b.f48120X, Float.valueOf(f13));
        AbstractC28683x.m87239G(c28655q, C13602b.f48121Y, new C16617b(j7));
        AbstractC28683x.m87239G(c28655q, C13602b.f48122Z, false);
        AbstractC28683x.m87239G(c28655q, C13602b.f48104H, false);
        AbstractC28683x.m87239G(c28655q, C13602b.f48105I, c37481b);
        AbstractC28683x.m87239G(c28655q, C13602b.f48106J, new C16617b(j13));
        AbstractC28683x.m87239G(c28655q, C13602b.f48107K, (LatLng) c13619j0.f48237a.getValue());
        AbstractC28683x.m87239G(c28655q, C13602b.f48108L, fValueOf);
        AbstractC28683x.m87239G(c28655q, C13602b.f48109M, null);
        AbstractC28683x.m87239G(c28655q, C13602b.f48110N, null);
        AbstractC28683x.m87239G(c28655q, C13602b.f48111O, str);
        AbstractC28683x.m87239G(c28655q, C13602b.f48112P, Boolean.valueOf(z4));
        AbstractC28683x.m87239G(c28655q, C13602b.f48113Q, fValueOf);
        c28655q.m87173q(true);
        c28655q.m87173q(false);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C13615h0(c13619j0, f13, j7, c37481b, j13, str, z4, function1, function2, function3, function4, i13, i14);
    }

    /* JADX INFO: renamed from: j */
    public static final int m83587j(C34354s0 c34354s0, long j7, InterfaceC2395j3 interfaceC2395j3) {
        long jMo3555y;
        int iM83559J;
        C34346p1 c34346p1M108662d = c34354s0.m108662d();
        if (c34346p1M108662d != null) {
            C23286w c23286w = c34346p1M108662d.f144282a.f92228b;
            InterfaceC39147y interfaceC39147yM108661c = c34354s0.m108661c();
            if (interfaceC39147yM108661c != null && (iM83559J = m83559J(c23286w, (jMo3555y = interfaceC39147yM108661c.mo3555y(j7)), interfaceC2395j3)) != -1) {
                return c23286w.m67377g(C16617b.m47185a(0.0f, (c23286w.m67372b(iM83559J) + c23286w.m67376f(iM83559J)) / 2.0f, jMo3555y, 1));
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public static final long m83588k(C34354s0 c34354s0, C16618c c16618c, C16618c c16618c2, int i13) {
        long jM83561L = m83561L(c34354s0, c16618c, i13);
        if (C23283u0.m67357c(jM83561L)) {
            return C23283u0.f92251b;
        }
        long jM83561L2 = m83561L(c34354s0, c16618c2, i13);
        if (C23283u0.m67357c(jM83561L2)) {
            return C23283u0.f92251b;
        }
        int i14 = (int) (jM83561L >> 32);
        int i15 = (int) (jM83561L2 & 4294967295L);
        return AbstractC21478l0.m60431f(Math.min(i14, i14), Math.max(i15, i15));
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m83589l(C23277r0 c23277r0, int i13) {
        C23286w c23286w = c23277r0.f92228b;
        int iM67374d = c23286w.m67374d(i13);
        return i13 == c23277r0.m67339h(iM67374d) || i13 == c23286w.m67373c(iM67374d, false) ? c23277r0.m67340i(i13) != c23277r0.m67332a(i13) : c23277r0.m67332a(i13) != c23277r0.m67332a(i13 - 1);
    }

    /* JADX INFO: renamed from: m */
    public static final long m83590m(PointF pointF) {
        float f13 = pointF.x;
        float f14 = pointF.y;
        return (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
    }

    /* JADX INFO: renamed from: n */
    public static void m83591n(C14923z c14923z, DialogC3954d0 dialogC3954d0, Function1 function1, int i13) {
        if ((i13 & 1) != 0) {
            dialogC3954d0 = null;
        }
        AbstractC22676k.m65750j(c14923z, "<this>");
        C14895a0 c14895a0 = new C14895a0(function1, 0);
        if (dialogC3954d0 != null) {
            c14923z.m43015a(dialogC3954d0, c14895a0);
        } else {
            c14923z.m43016b(c14895a0);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final String m83592o(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    /* JADX INFO: renamed from: p */
    public static final String m83593p(String str, String str2) {
        return AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{str, str2}), ".", null, null, null, 62);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m83594q(InterfaceC33646o interfaceC33646o) {
        C38059n c38059n = new C38059n(8);
        int i13 = C2919f.m8506a(interfaceC33646o, c38059n).f11740a;
        if (i13 != 1380533830 && i13 != 1380333108) {
            return false;
        }
        interfaceC33646o.mo3103p(c38059n.f163017a, 0, 4);
        c38059n.m121846F(0);
        int iM121854g = c38059n.m121854g();
        if (iM121854g == 1463899717) {
            return true;
        }
        AbstractC38046a.m121812g("WavHeaderReader", "Unsupported form type: " + iM121854g);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static final void m83595r(double d3) {
        if (d3 <= 0.0d) {
            throw new IllegalArgumentException(m83592o(Double.valueOf(0.0d), Double.valueOf(d3)).toString());
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m83596s(int i13, int i14) {
        if (i14 <= i13) {
            throw new IllegalArgumentException(m83592o(Integer.valueOf(i13), Integer.valueOf(i14)).toString());
        }
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC28601c1 m83597t(InterfaceC13037f2 interfaceC13037f2, Composer composer, int i13) {
        AbstractC22676k.m65750j(interfaceC13037f2, "<this>");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(101925897);
        c28655q.m87150e0(-2023557603);
        boolean zM87153g = c28655q.m87153g(interfaceC13037f2);
        Object objM87133R = c28655q.m87133R();
        InterfaceC30057d interfaceC30057d = null;
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            c28655q.m87172p0(null);
            objM87133R = null;
        }
        AssertionError assertionError = (AssertionError) objM87133R;
        c28655q.m87173q(false);
        c28655q.m87150e0(-2023540810);
        boolean zM87153g2 = c28655q.m87153g(interfaceC13037f2);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C27072e(interfaceC13037f2, 28);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
        c28655q.m87173q(false);
        c28655q.m87150e0(-2023538643);
        boolean zM87157i = c28655q.m87157i(C30064k.f122676w) | c28655q.m87157i(interfaceC13037f2) | c28655q.m87157i(assertionError);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i || objM87133R3 == c28676v0) {
            objM87133R3 = new C26285a(interfaceC13037f2, assertionError, interfaceC30057d, 13);
            c28655q.m87172p0(objM87133R3);
        }
        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R3;
        c28655q.m87173q(false);
        c28655q.m87150e0(2085798134);
        c28655q.m87150e0(-1742434739);
        boolean zM87153g3 = c28655q.m87153g(interfaceC13037f2);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87153g3 || objM87133R4 == c28676v0) {
            objM87133R4 = AbstractC28683x.m87272z(interfaceC4339a.invoke());
            c28655q.m87172p0(objM87133R4);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
        c28655q.m87173q(false);
        c28655q.m87150e0(-1742432157);
        boolean zM87157i2 = c28655q.m87157i(interfaceC4351m) | c28655q.m87153g(interfaceC28601c1);
        Object objM87133R5 = c28655q.m87133R();
        if (zM87157i2 || objM87133R5 == c28676v0) {
            objM87133R5 = new C28662r2(interfaceC4351m, interfaceC28601c1, interfaceC30057d, 2);
            c28655q.m87172p0(objM87133R5);
        }
        c28655q.m87173q(false);
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, interfaceC13037f2);
        c28655q.m87173q(false);
        c28655q.m87173q(false);
        return interfaceC28601c1;
    }

    /* JADX INFO: renamed from: u */
    public static C2728g m83598u(C2728g c2728g, C2728g c2728g2) {
        if (c2728g == null || c2728g.m7701c()) {
            return C2728g.f10738b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i13 = 0;
        while (i13 < c2728g2.m7702d() + c2728g.m7702d()) {
            Locale localeM7700b = i13 < c2728g.m7702d() ? c2728g.m7700b(i13) : c2728g2.m7700b(i13 - c2728g.m7702d());
            if (localeM7700b != null) {
                linkedHashSet.add(localeM7700b);
            }
            i13++;
        }
        return C2728g.m7699f(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX INFO: renamed from: v */
    public static final String m83599v(String input) {
        AbstractC22676k.m65750j(input, "input");
        String strConcat = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE.concat(input);
        if (AbstractC39414r.m125890i0(input) || input.charAt(0) == '0' || input.charAt(0) == '1') {
            if (input.length() <= 1 || input.charAt(0) != '1') {
                strConcat = null;
            } else {
                char cCharAt = input.charAt(1);
                int iDigit = Character.digit((int) cCharAt, 10);
                if (iDigit < 0) {
                    throw new IllegalArgumentException("Char " + cCharAt + " is not a decimal digit");
                }
                if (iDigit <= 2) {
                    strConcat = null;
                }
            }
        }
        return strConcat == null ? input : strConcat;
    }

    /* JADX INFO: renamed from: w */
    public static ChallengeResponseParseException m83600w(String str) {
        EnumC30904i enumC30904i = EnumC30904i.UnrecognizedCriticalMessageExtensions;
        return new ChallengeResponseParseException(203, "Data element not in the required format or value is invalid as defined in Table A.1", str);
    }

    /* JADX INFO: renamed from: x */
    public static ChallengeResponseParseException m83601x(String str) {
        EnumC30904i enumC30904i = EnumC30904i.UnrecognizedCriticalMessageExtensions;
        return new ChallengeResponseParseException(201, "A message element required as defined in Table A.1 is missing from the message.", str);
    }

    /* JADX INFO: renamed from: y */
    public static final int m83602y(int i13) {
        return 31 - Integer.numberOfLeadingZeros(i13);
    }

    /* JADX INFO: renamed from: z */
    public static void m83603z(C18168g c18168g, InterfaceC4351m interfaceC4351m) {
        AbstractC37056f.m119002z(c18168g, interfaceC4351m);
    }
}
