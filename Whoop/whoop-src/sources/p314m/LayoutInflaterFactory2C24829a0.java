package p314m;

import ad3.C0783z;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.databinding.RunnableC1189s;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm.C15990r;
import ih0.AbstractC18489d0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p002a0.C0021f1;
import p029b5.C2728g;
import p036bq.RunnableC3543b;
import p037bu.C3632c;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16865d0;
import p184h5.C16913t0;
import p184h5.InterfaceC16882j;
import p290l.AbstractC22932a;
import p408q.AbstractC29658b;
import p408q.C29660d;
import p408q.C29661e;
import p408q.C29666j;
import p408q.InterfaceC29657a;
import p444r.C30814h;
import p444r.InterfaceC30816j;
import p444r.MenuC30818l;
import p474s.AbstractC32019v2;
import p474s.C31933a0;
import p474s.C31977l0;
import p474s.C31983m2;
import p474s.C31984n;
import p474s.C31992p;
import p474s.C32012u;
import p474s.C32028y;
import p474s.C32029y0;
import p474s.InterfaceC31934a1;
import p530up.AbstractC35148d;
import p550vd.AbstractC35903f;
import qg3.C30352d;

/* JADX INFO: renamed from: m.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C24829a0 extends AbstractC24858q implements InterfaceC30816j, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: H0 */
    public static final C0021f1 f97198H0 = new C0021f1(0);

    /* JADX INFO: renamed from: I0 */
    public static final int[] f97199I0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: J0 */
    public static final boolean f97200J0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: B0 */
    public boolean f97202B0;

    /* JADX INFO: renamed from: C0 */
    public Rect f97203C0;

    /* JADX INFO: renamed from: D0 */
    public Rect f97204D0;

    /* JADX INFO: renamed from: E0 */
    public C24839f0 f97205E0;

    /* JADX INFO: renamed from: F0 */
    public OnBackInvokedDispatcher f97206F0;

    /* JADX INFO: renamed from: G0 */
    public OnBackInvokedCallback f97207G0;

    /* JADX INFO: renamed from: J */
    public final Object f97208J;

    /* JADX INFO: renamed from: K */
    public final Context f97209K;

    /* JADX INFO: renamed from: L */
    public Window f97210L;

    /* JADX INFO: renamed from: M */
    public WindowCallbackC24864w f97211M;

    /* JADX INFO: renamed from: N */
    public final Object f97212N;

    /* JADX INFO: renamed from: O */
    public AbstractC24830b f97213O;

    /* JADX INFO: renamed from: P */
    public C29666j f97214P;

    /* JADX INFO: renamed from: Q */
    public CharSequence f97215Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC31934a1 f97216R;

    /* JADX INFO: renamed from: S */
    public C24860s f97217S;

    /* JADX INFO: renamed from: T */
    public C24860s f97218T;

    /* JADX INFO: renamed from: U */
    public AbstractC29658b f97219U;

    /* JADX INFO: renamed from: V */
    public ActionBarContextView f97220V;

    /* JADX INFO: renamed from: W */
    public PopupWindow f97221W;

    /* JADX INFO: renamed from: X */
    public RunnableC3543b f97222X;

    /* JADX INFO: renamed from: Z */
    public boolean f97224Z;

    /* JADX INFO: renamed from: a0 */
    public ViewGroup f97225a0;

    /* JADX INFO: renamed from: b0 */
    public TextView f97226b0;

    /* JADX INFO: renamed from: c0 */
    public View f97227c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f97228d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f97229e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f97230f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f97231g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f97232h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f97233i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f97234j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f97235k0;

    /* JADX INFO: renamed from: l0 */
    public C24867z[] f97236l0;

    /* JADX INFO: renamed from: m0 */
    public C24867z f97237m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f97238n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f97239o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f97240p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f97241q0;

    /* JADX INFO: renamed from: r0 */
    public Configuration f97242r0;

    /* JADX INFO: renamed from: s0 */
    public final int f97243s0;

    /* JADX INFO: renamed from: t0 */
    public int f97244t0;

    /* JADX INFO: renamed from: u0 */
    public int f97245u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f97246v0;

    /* JADX INFO: renamed from: w0 */
    public C24865x f97247w0;

    /* JADX INFO: renamed from: x0 */
    public C24865x f97248x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f97249y0;

    /* JADX INFO: renamed from: z0 */
    public int f97250z0;

    /* JADX INFO: renamed from: Y */
    public C16913t0 f97223Y = null;

    /* JADX INFO: renamed from: A0 */
    public final RunnableC1189s f97201A0 = new RunnableC1189s(this, 6);

    public LayoutInflaterFactory2C24829a0(Context context, Window window, InterfaceC24854n interfaceC24854n, Object obj) {
        AbstractActivityC24852m abstractActivityC24852m = null;
        this.f97243s0 = -100;
        this.f97209K = context;
        this.f97212N = interfaceC24854n;
        this.f97208J = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC24852m)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC24852m = (AbstractActivityC24852m) context;
                    break;
                }
            }
            if (abstractActivityC24852m != null) {
                this.f97243s0 = ((LayoutInflaterFactory2C24829a0) abstractActivityC24852m.getDelegate()).f97243s0;
            }
        }
        if (this.f97243s0 == -100) {
            String name = this.f97208J.getClass().getName();
            C0021f1 c0021f1 = f97198H0;
            Integer num = (Integer) c0021f1.get(name);
            if (num != null) {
                this.f97243s0 = num.intValue();
                c0021f1.remove(this.f97208J.getClass().getName());
            }
        }
        if (window != null) {
            m72807t(window);
        }
        C31992p.m99507d();
    }

    /* JADX INFO: renamed from: u */
    public static C2728g m72781u(Context context) {
        C2728g c2728g;
        if (Build.VERSION.SDK_INT >= 33 || (c2728g = AbstractC24858q.f97384y) == null) {
            return null;
        }
        C2728g c2728gM72888b = AbstractC24862u.m72888b(context.getApplicationContext().getResources().getConfiguration());
        C2728g c2728gM83598u = C27648a.m83598u(c2728g, c2728gM72888b);
        return c2728gM83598u.m7701c() ? c2728gM72888b : c2728gM83598u;
    }

    /* JADX INFO: renamed from: y */
    public static Configuration m72782y(Context context, int i13, C2728g c2728g, Configuration configuration, boolean z4) {
        int i14;
        if (i13 == 1) {
            i14 = 16;
        } else if (i13 != 2) {
            i14 = z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i14 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i14 | (configuration2.uiMode & (-49));
        if (c2728g != null) {
            AbstractC24862u.m72890d(configuration2, c2728g);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: A */
    public final void m72783A(int i13) {
        C24867z c24867zM72786D = m72786D(i13);
        if (c24867zM72786D.f97407h != null) {
            Bundle bundle = new Bundle();
            c24867zM72786D.f97407h.m94824u(bundle);
            if (bundle.size() > 0) {
                c24867zM72786D.f97415p = bundle;
            }
            c24867zM72786D.f97407h.m94828z();
            c24867zM72786D.f97407h.clear();
        }
        c24867zM72786D.f97414o = true;
        c24867zM72786D.f97413n = true;
        if ((i13 == 108 || i13 == 0) && this.f97216R != null) {
            C24867z c24867zM72786D2 = m72786D(0);
            c24867zM72786D2.f97410k = false;
            m72793K(c24867zM72786D2, null);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m72784B() {
        ViewGroup viewGroup;
        if (this.f97224Z) {
            return;
        }
        Context context = this.f97209K;
        int[] iArr = AbstractC22932a.f90517j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo72800l(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo72800l(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo72800l(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo72800l(10);
        }
        this.f97233i0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m72785C();
        this.f97210L.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f97234j0) {
            viewGroup = this.f97232h0 ? (ViewGroup) layoutInflaterFrom.inflate(com.whoop.android.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.whoop.android.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f97233i0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.whoop.android.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f97231g0 = false;
            this.f97230f0 = false;
        } else if (this.f97230f0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.whoop.android.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C29660d(context, typedValue.resourceId) : context).inflate(com.whoop.android.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC31934a1 interfaceC31934a1 = (InterfaceC31934a1) viewGroup.findViewById(com.whoop.android.R.id.decor_content_parent);
            this.f97216R = interfaceC31934a1;
            interfaceC31934a1.setWindowCallback(this.f97210L.getCallback());
            if (this.f97231g0) {
                ((ActionBarOverlayLayout) this.f97216R).m3278m(109);
            }
            if (this.f97228d0) {
                ((ActionBarOverlayLayout) this.f97216R).m3278m(2);
            }
            if (this.f97229e0) {
                ((ActionBarOverlayLayout) this.f97216R).m3278m(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb4 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb4.append(this.f97230f0);
            sb4.append(", windowActionBarOverlay: ");
            sb4.append(this.f97231g0);
            sb4.append(", android:windowIsFloating: ");
            sb4.append(this.f97233i0);
            sb4.append(", windowActionModeOverlay: ");
            sb4.append(this.f97232h0);
            sb4.append(", windowNoTitle: ");
            throw new IllegalArgumentException(AbstractC18489d0.m53372m(sb4, this.f97234j0, " }"));
        }
        C3632c c3632c = new C3632c(this);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(viewGroup, c3632c);
        if (this.f97216R == null) {
            this.f97226b0 = (TextView) viewGroup.findViewById(com.whoop.android.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e13) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e13);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.whoop.android.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f97210L.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f97210L.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0783z(this, 22));
        this.f97225a0 = viewGroup;
        Object obj = this.f97208J;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f97215Q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC31934a1 interfaceC31934a2 = this.f97216R;
            if (interfaceC31934a2 != null) {
                interfaceC31934a2.setWindowTitle(title);
            } else {
                AbstractC24830b abstractC24830b = this.f97213O;
                if (abstractC24830b != null) {
                    abstractC24830b.mo72835x(title);
                } else {
                    TextView textView = this.f97226b0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f97225a0.findViewById(R.id.content);
        View decorView = this.f97210L.getDecorView();
        contentFrameLayout2.f4342G.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f97224Z = true;
        C24867z c24867zM72786D = m72786D(0);
        if (this.f97241q0 || c24867zM72786D.f97407h != null) {
            return;
        }
        m72788F(108);
    }

    /* JADX INFO: renamed from: C */
    public final void m72785C() {
        if (this.f97210L == null) {
            Object obj = this.f97208J;
            if (obj instanceof Activity) {
                m72807t(((Activity) obj).getWindow());
            }
        }
        if (this.f97210L == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: D */
    public final C24867z m72786D(int i13) {
        C24867z[] c24867zArr = this.f97236l0;
        if (c24867zArr == null || c24867zArr.length <= i13) {
            C24867z[] c24867zArr2 = new C24867z[i13 + 1];
            if (c24867zArr != null) {
                System.arraycopy(c24867zArr, 0, c24867zArr2, 0, c24867zArr.length);
            }
            this.f97236l0 = c24867zArr2;
            c24867zArr = c24867zArr2;
        }
        C24867z c24867z = c24867zArr[i13];
        if (c24867z != null) {
            return c24867z;
        }
        C24867z c24867z2 = new C24867z();
        c24867z2.f97400a = i13;
        c24867z2.f97413n = false;
        c24867zArr[i13] = c24867z2;
        return c24867z2;
    }

    /* JADX INFO: renamed from: E */
    public final void m72787E() {
        m72784B();
        if (this.f97230f0 && this.f97213O == null) {
            Object obj = this.f97208J;
            if (obj instanceof Activity) {
                this.f97213O = new C24855n0((Activity) obj, this.f97231g0);
            } else if (obj instanceof Dialog) {
                this.f97213O = new C24855n0((Dialog) obj);
            }
            AbstractC24830b abstractC24830b = this.f97213O;
            if (abstractC24830b != null) {
                abstractC24830b.mo72825n(this.f97202B0);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m72788F(int i13) {
        this.f97250z0 = (1 << i13) | this.f97250z0;
        if (this.f97249y0) {
            return;
        }
        View decorView = this.f97210L.getDecorView();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        decorView.postOnAnimation(this.f97201A0);
        this.f97249y0 = true;
    }

    /* JADX INFO: renamed from: G */
    public final int m72789G(Context context, int i13) {
        if (i13 != -100) {
            if (i13 != -1) {
                if (i13 != 0) {
                    if (i13 != 1 && i13 != 2) {
                        if (i13 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f97248x0 == null) {
                            this.f97248x0 = new C24865x(this, context);
                        }
                        return this.f97248x0.m72898L();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.f97247w0 == null) {
                        this.f97247w0 = new C24865x(this, C15990r.m45135I(context));
                    }
                    return this.f97247w0.m72898L();
                }
            }
            return i13;
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m72790H() {
        boolean z4 = this.f97238n0;
        this.f97238n0 = false;
        C24867z c24867zM72786D = m72786D(0);
        if (!c24867zM72786D.f97412m) {
            AbstractC29658b abstractC29658b = this.f97219U;
            if (abstractC29658b != null) {
                abstractC29658b.mo72857c();
                return true;
            }
            m72787E();
            AbstractC24830b abstractC24830b = this.f97213O;
            if (abstractC24830b == null || !abstractC24830b.mo72813b()) {
                return false;
            }
        } else if (!z4) {
            m72810x(c24867zM72786D, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: I */
    public final void m72791I(C24867z c24867z, KeyEvent keyEvent) {
        int i13;
        ViewGroup.LayoutParams layoutParams;
        boolean z4 = c24867z.f97412m;
        int i14 = c24867z.f97400a;
        if (z4 || this.f97241q0) {
            return;
        }
        Context context = this.f97209K;
        if (i14 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f97210L.getCallback();
        if (callback != null && !callback.onMenuOpened(i14, c24867z.f97407h)) {
            m72810x(c24867z, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m72793K(c24867z, keyEvent)) {
            C24866y c24866y = c24867z.f97404e;
            if (c24866y != null && !c24867z.f97413n) {
                View view = c24867z.f97406g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i13 = -1;
                }
                c24867z.f97411l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i13, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = c24867z.f97402c;
                layoutParams2.windowAnimations = c24867z.f97403d;
                windowManager.addView(c24867z.f97404e, layoutParams2);
                c24867z.f97412m = true;
                if (i14 == 0) {
                    m72795M();
                }
            }
            if (c24866y == null) {
                m72787E();
                AbstractC24830b abstractC24830b = this.f97213O;
                Context contextMo72816e = abstractC24830b != null ? abstractC24830b.mo72816e() : null;
                if (contextMo72816e != null) {
                    context = contextMo72816e;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(com.whoop.android.R.attr.actionBarPopupTheme, typedValue, true);
                int i15 = typedValue.resourceId;
                if (i15 != 0) {
                    themeNewTheme.applyStyle(i15, true);
                }
                themeNewTheme.resolveAttribute(com.whoop.android.R.attr.panelMenuListTheme, typedValue, true);
                int i16 = typedValue.resourceId;
                if (i16 != 0) {
                    themeNewTheme.applyStyle(i16, true);
                } else {
                    themeNewTheme.applyStyle(com.whoop.android.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C29660d c29660d = new C29660d(context, 0);
                c29660d.getTheme().setTo(themeNewTheme);
                c24867z.f97409j = c29660d;
                TypedArray typedArrayObtainStyledAttributes = c29660d.obtainStyledAttributes(AbstractC22932a.f90517j);
                c24867z.f97401b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                c24867z.f97403d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                c24867z.f97404e = new C24866y(this, c24867z.f97409j);
                c24867z.f97402c = 81;
            } else if (c24867z.f97413n && c24866y.getChildCount() > 0) {
                c24867z.f97404e.removeAllViews();
            }
            View view2 = c24867z.f97406g;
            if (view2 == null) {
                if (c24867z.f97407h != null) {
                    if (this.f97218T == null) {
                        this.f97218T = new C24860s(this, 1);
                    }
                    C24860s c24860s = this.f97218T;
                    if (c24867z.f97408i == null) {
                        C30814h c30814h = new C30814h(c24867z.f97409j);
                        c24867z.f97408i = c30814h;
                        c30814h.mo94787h(c24860s);
                        c24867z.f97407h.m94813b(c24867z.f97408i);
                    }
                    View view3 = (View) c24867z.f97408i.m94809c(c24867z.f97404e);
                    c24867z.f97405f = view3;
                    if (view3 != null) {
                    }
                }
                c24867z.f97413n = true;
                return;
            }
            c24867z.f97405f = view2;
            if (c24867z.f97405f != null && (c24867z.f97406g != null || c24867z.f97408i.m94808a().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams3 = c24867z.f97405f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                c24867z.f97404e.setBackgroundResource(c24867z.f97401b);
                ViewParent parent = c24867z.f97405f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c24867z.f97405f);
                }
                c24867z.f97404e.addView(c24867z.f97405f, layoutParams3);
                if (!c24867z.f97405f.hasFocus()) {
                    c24867z.f97405f.requestFocus();
                }
            }
            c24867z.f97413n = true;
            return;
            i13 = -2;
            c24867z.f97411l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i13, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = c24867z.f97402c;
            layoutParams4.windowAnimations = c24867z.f97403d;
            windowManager.addView(c24867z.f97404e, layoutParams4);
            c24867z.f97412m = true;
            if (i14 == 0) {
                m72795M();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final boolean m72792J(C24867z c24867z, int i13, KeyEvent keyEvent) {
        MenuC30818l menuC30818l;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c24867z.f97410k || m72793K(c24867z, keyEvent)) && (menuC30818l = c24867z.f97407h) != null) {
            return menuC30818l.performShortcut(i13, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0100  */
    /* JADX WARN: Code duplicated, block: B:82:0x0115  */
    /* JADX INFO: renamed from: K */
    public final boolean m72793K(C24867z c24867z, KeyEvent keyEvent) {
        MenuC30818l menuC30818l;
        InterfaceC31934a1 interfaceC31934a1;
        InterfaceC31934a1 interfaceC31934a2;
        Resources.Theme themeNewTheme;
        InterfaceC31934a1 interfaceC31934a3;
        InterfaceC31934a1 interfaceC31934a4;
        if (!this.f97241q0) {
            boolean z4 = c24867z.f97410k;
            int i13 = c24867z.f97400a;
            if (z4) {
                return true;
            }
            C24867z c24867z2 = this.f97237m0;
            if (c24867z2 != null && c24867z2 != c24867z) {
                m72810x(c24867z2, false);
            }
            Window.Callback callback = this.f97210L.getCallback();
            if (callback != null) {
                c24867z.f97406g = callback.onCreatePanelView(i13);
            }
            boolean z13 = i13 == 0 || i13 == 108;
            if (z13 && (interfaceC31934a4 = this.f97216R) != null) {
                ((ActionBarOverlayLayout) interfaceC31934a4).m3283r();
            }
            if (c24867z.f97406g == null && (!z13 || !(this.f97213O instanceof C24845i0))) {
                MenuC30818l menuC30818l2 = c24867z.f97407h;
                if (menuC30818l2 == null || c24867z.f97414o) {
                    if (menuC30818l2 == null) {
                        Context context = this.f97209K;
                        if ((i13 == 0 || i13 == 108) && this.f97216R != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.whoop.android.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.whoop.android.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.whoop.android.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C29660d c29660d = new C29660d(context, 0);
                                c29660d.getTheme().setTo(themeNewTheme);
                                context = c29660d;
                            }
                        }
                        MenuC30818l menuC30818l3 = new MenuC30818l(context);
                        menuC30818l3.mo94804v(this);
                        MenuC30818l menuC30818l4 = c24867z.f97407h;
                        if (menuC30818l3 != menuC30818l4) {
                            if (menuC30818l4 != null) {
                                menuC30818l4.m94822s(c24867z.f97408i);
                            }
                            c24867z.f97407h = menuC30818l3;
                            C30814h c30814h = c24867z.f97408i;
                            if (c30814h != null) {
                                menuC30818l3.m94813b(c30814h);
                            }
                        }
                        if (c24867z.f97407h != null) {
                            if (z13 && (interfaceC31934a2 = this.f97216R) != null) {
                                if (this.f97217S == null) {
                                    this.f97217S = new C24860s(this, 0);
                                }
                                ((ActionBarOverlayLayout) interfaceC31934a2).m3282q(c24867z.f97407h, this.f97217S);
                            }
                            c24867z.f97407h.m94828z();
                            if (callback.onCreatePanelMenu(i13, c24867z.f97407h)) {
                                c24867z.f97414o = false;
                            } else {
                                menuC30818l = c24867z.f97407h;
                                if (menuC30818l != null) {
                                    if (menuC30818l != null) {
                                        menuC30818l.m94822s(c24867z.f97408i);
                                    }
                                    c24867z.f97407h = null;
                                }
                                if (z13 && (interfaceC31934a1 = this.f97216R) != null) {
                                    ((ActionBarOverlayLayout) interfaceC31934a1).m3282q(null, this.f97217S);
                                }
                            }
                        }
                    } else {
                        if (z13) {
                            if (this.f97217S == null) {
                                this.f97217S = new C24860s(this, 0);
                            }
                            ((ActionBarOverlayLayout) interfaceC31934a2).m3282q(c24867z.f97407h, this.f97217S);
                        }
                        c24867z.f97407h.m94828z();
                        if (callback.onCreatePanelMenu(i13, c24867z.f97407h)) {
                            menuC30818l = c24867z.f97407h;
                            if (menuC30818l != null) {
                                if (menuC30818l != null) {
                                    menuC30818l.m94822s(c24867z.f97408i);
                                }
                                c24867z.f97407h = null;
                            }
                            if (z13) {
                                ((ActionBarOverlayLayout) interfaceC31934a1).m3282q(null, this.f97217S);
                            }
                        } else {
                            c24867z.f97414o = false;
                        }
                    }
                }
                c24867z.f97407h.m94828z();
                Bundle bundle = c24867z.f97415p;
                if (bundle != null) {
                    c24867z.f97407h.m94823t(bundle);
                    c24867z.f97415p = null;
                }
                if (!callback.onPreparePanel(0, c24867z.f97406g, c24867z.f97407h)) {
                    if (z13 && (interfaceC31934a3 = this.f97216R) != null) {
                        ((ActionBarOverlayLayout) interfaceC31934a3).m3282q(null, this.f97217S);
                    }
                    c24867z.f97407h.m94827y();
                    return false;
                }
                c24867z.f97407h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c24867z.f97407h.m94827y();
            }
            c24867z.f97410k = true;
            c24867z.f97411l = false;
            this.f97237m0 = c24867z;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final void m72794L() {
        if (this.f97224Z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m72795M() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z4 = false;
            if (this.f97206F0 != null && (m72786D(0).f97412m || this.f97219U != null)) {
                z4 = true;
            }
            if (z4 && this.f97207G0 == null) {
                this.f97207G0 = AbstractC24863v.m72892b(this.f97206F0, this);
            } else {
                if (z4 || (onBackInvokedCallback = this.f97207G0) == null) {
                    return;
                }
                AbstractC24863v.m72893c(this.f97206F0, onBackInvokedCallback);
                this.f97207G0 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p444r.InterfaceC30816j
    /* JADX INFO: renamed from: a */
    public final boolean mo3333a(MenuC30818l menuC30818l, MenuItem menuItem) {
        C24867z c24867z;
        Window.Callback callback = this.f97210L.getCallback();
        if (callback != null && !this.f97241q0) {
            MenuC30818l menuC30818lMo94800l = menuC30818l.mo94800l();
            C24867z[] c24867zArr = this.f97236l0;
            int length = c24867zArr != null ? c24867zArr.length : 0;
            for (int i13 = 0; i13 < length; i13++) {
                c24867z = c24867zArr[i13];
                if (c24867z != null && c24867z.f97407h == menuC30818lMo94800l) {
                    if (c24867z != null) {
                        return callback.onMenuItemSelected(c24867z.f97400a, menuItem);
                    }
                }
            }
            c24867z = null;
            if (c24867z != null) {
                return callback.onMenuItemSelected(c24867z.f97400a, menuItem);
            }
        }
        return false;
    }

    @Override // p444r.InterfaceC30816j
    /* JADX INFO: renamed from: b */
    public final void mo3334b(MenuC30818l menuC30818l) {
        InterfaceC31934a1 interfaceC31934a1 = this.f97216R;
        if (interfaceC31934a1 == null || !((ActionBarOverlayLayout) interfaceC31934a1).m3270e() || (ViewConfiguration.get(this.f97209K).hasPermanentMenuKey() && !((ActionBarOverlayLayout) this.f97216R).m3279n())) {
            C24867z c24867zM72786D = m72786D(0);
            c24867zM72786D.f97413n = true;
            m72810x(c24867zM72786D, false);
            m72791I(c24867zM72786D, null);
            return;
        }
        Window.Callback callback = this.f97210L.getCallback();
        if (((ActionBarOverlayLayout) this.f97216R).m3280o()) {
            ((ActionBarOverlayLayout) this.f97216R).m3276k();
            if (this.f97241q0) {
                return;
            }
            callback.onPanelClosed(108, m72786D(0).f97407h);
            return;
        }
        if (callback == null || this.f97241q0) {
            return;
        }
        if (this.f97249y0 && (1 & this.f97250z0) != 0) {
            View decorView = this.f97210L.getDecorView();
            RunnableC1189s runnableC1189s = this.f97201A0;
            decorView.removeCallbacks(runnableC1189s);
            runnableC1189s.run();
        }
        C24867z c24867zM72786D2 = m72786D(0);
        MenuC30818l menuC30818l2 = c24867zM72786D2.f97407h;
        if (menuC30818l2 == null || c24867zM72786D2.f97414o || !callback.onPreparePanel(0, c24867zM72786D2.f97406g, menuC30818l2)) {
            return;
        }
        callback.onMenuOpened(108, c24867zM72786D2.f97407h);
        ((ActionBarOverlayLayout) this.f97216R).m3284s();
    }

    @Override // p314m.AbstractC24858q
    /* JADX INFO: renamed from: f */
    public final void mo72796f() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f97209K);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C24829a0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p314m.AbstractC24858q
    /* JADX INFO: renamed from: g */
    public final void mo72797g() {
        if (this.f97213O != null) {
            m72787E();
            if (this.f97213O.mo72817f()) {
                return;
            }
            m72788F(0);
        }
    }

    @Override // p314m.AbstractC24858q
    /* JADX INFO: renamed from: i */
    public final void mo72798i() {
        String parentActivityName;
        this.f97239o0 = true;
        m72806s(false, true);
        m72785C();
        Object obj = this.f97208J;
        if (obj instanceof Activity) {
            try {
                parentActivityName = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                parentActivityName = null;
            }
            if (parentActivityName != null) {
                AbstractC24830b abstractC24830b = this.f97213O;
                if (abstractC24830b == null) {
                    this.f97202B0 = true;
                } else {
                    abstractC24830b.mo72825n(true);
                }
            }
            synchronized (AbstractC24858q.f97380H) {
                AbstractC24858q.m72883k(this);
                AbstractC24858q.f97379G.add(new WeakReference(this));
            }
        }
        this.f97242r0 = new Configuration(this.f97209K.getResources().getConfiguration());
        this.f97240p0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p314m.AbstractC24858q
    /* JADX INFO: renamed from: j */
    public final void mo72799j() {
        if (this.f97208J instanceof Activity) {
            synchronized (AbstractC24858q.f97380H) {
                AbstractC24858q.m72883k(this);
            }
        }
        if (this.f97249y0) {
            this.f97210L.getDecorView().removeCallbacks(this.f97201A0);
        }
        this.f97241q0 = true;
        if (this.f97243s0 != -100) {
            Object obj = this.f97208J;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f97198H0.put(this.f97208J.getClass().getName(), Integer.valueOf(this.f97243s0));
            } else {
                f97198H0.remove(this.f97208J.getClass().getName());
            }
        } else {
            f97198H0.remove(this.f97208J.getClass().getName());
        }
        AbstractC24830b abstractC24830b = this.f97213O;
        if (abstractC24830b != null) {
            abstractC24830b.mo72819h();
        }
        C24865x c24865x = this.f97247w0;
        if (c24865x != null) {
            c24865x.m7255h();
        }
        C24865x c24865x2 = this.f97248x0;
        if (c24865x2 != null) {
            c24865x2.m7255h();
        }
    }

    @Override // p314m.AbstractC24858q
    /* JADX INFO: renamed from: l */
    public final boolean mo72800l(int i13) {
        if (i13 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i13 = 108;
        } else if (i13 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i13 = 109;
        }
        if (this.f97234j0 && i13 == 108) {
            return false;
        }
        if (this.f97230f0 && i13 == 1) {
            this.f97230f0 = false;
        }
        if (i13 == 1) {
            m72794L();
            this.f97234j0 = true;
            return true;
        }
        if (i13 == 2) {
            m72794L();
            this.f97228d0 = true;
            return true;
        }
        if (i13 == 5) {
            m72794L();
            this.f97229e0 = true;
            return true;
        }
        if (i13 == 10) {
            m72794L();
            this.f97232h0 = true;
            return true;
        }
        if (i13 == 108) {
            m72794L();
            this.f97230f0 = true;
            return true;
        }
        if (i13 != 109) {
            return this.f97210L.requestFeature(i13);
        }
        m72794L();
        this.f97231g0 = true;
        return true;
    }

    @Override // p314m.AbstractC24858q
    /* JADX INFO: renamed from: m */
    public final void mo72801m(int i13) {
        m72784B();
        ViewGroup viewGroup = (ViewGroup) this.f97225a0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f97209K).inflate(i13, viewGroup);
        this.f97211M.m72894a(this.f97210L.getCallback());
    }

    @Override // p314m.AbstractC24858q
    /* JADX INFO: renamed from: n */
    public final void mo72802n(View view) {
        m72784B();
        ViewGroup viewGroup = (ViewGroup) this.f97225a0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f97211M.m72894a(this.f97210L.getCallback());
    }

    @Override // p314m.AbstractC24858q
    /* JADX INFO: renamed from: o */
    public final void mo72803o(View view, ViewGroup.LayoutParams layoutParams) {
        m72784B();
        ViewGroup viewGroup = (ViewGroup) this.f97225a0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f97211M.m72894a(this.f97210L.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c32028y;
        View view2 = null;
        if (this.f97205E0 == null) {
            int[] iArr = AbstractC22932a.f90517j;
            Context context2 = this.f97209K;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f97205E0 = new C24839f0();
            } else {
                try {
                    this.f97205E0 = (C24839f0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th3) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th3);
                    this.f97205E0 = new C24839f0();
                }
            }
        }
        C24839f0 c24839f0 = this.f97205E0;
        int i13 = AbstractC32019v2.f132876a;
        c24839f0.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC22932a.f90532y, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context c29660d = (resourceId == 0 || ((context instanceof C29660d) && ((C29660d) context).f121217a == resourceId)) ? context : new C29660d(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                c32028y = new C32028y(c29660d, attributeSet);
                break;
            case 1:
                c32028y = new C31984n(c29660d, attributeSet);
                break;
            case 2:
                c32028y = new C32012u(c29660d, attributeSet);
                break;
            case 3:
                c32028y = c24839f0.mo15911e(c29660d, attributeSet);
                break;
            case 4:
                c32028y = new AppCompatImageButton(c29660d, attributeSet);
                break;
            case 5:
                c32028y = new C31933a0(c29660d, attributeSet);
                break;
            case 6:
                c32028y = new C31977l0(c29660d, attributeSet);
                break;
            case 7:
                c32028y = c24839f0.mo15910d(c29660d, attributeSet);
                break;
            case 8:
                c32028y = new C32029y0(c29660d, attributeSet);
                break;
            case 9:
                c32028y = new AppCompatImageView(c29660d, attributeSet);
                break;
            case 10:
                c32028y = c24839f0.mo15907a(c29660d, attributeSet);
                break;
            case 11:
                c32028y = c24839f0.mo15909c(c29660d, attributeSet);
                break;
            case 12:
                c32028y = new AppCompatEditText(c29660d, attributeSet);
                break;
            case 13:
                c32028y = c24839f0.mo15908b(c29660d, attributeSet);
                break;
            default:
                c32028y = null;
                break;
        }
        if (c32028y == null && context != c29660d) {
            Object[] objArr = c24839f0.f97290a;
            if (str.equals(ProfileAnalyticsKt.VIEW)) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c29660d;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i14 = 0;
                    while (true) {
                        String[] strArr = C24839f0.f97288g;
                        if (i14 < 3) {
                            View viewM72841f = c24839f0.m72841f(c29660d, str, strArr[i14]);
                            if (viewM72841f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM72841f;
                            } else {
                                i14++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewM72841f2 = c24839f0.m72841f(c29660d, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM72841f2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th4) {
                objArr[0] = null;
                objArr[1] = null;
                throw th4;
            }
            c32028y = view2;
        }
        if (c32028y != null) {
            Context context3 = c32028y.getContext();
            if ((context3 instanceof ContextWrapper) && c32028y.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C24839f0.f97284c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c32028y.setOnClickListener(new ViewOnClickListenerC24837e0(c32028y, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c29660d.obtainStyledAttributes(attributeSet, C24839f0.f97285d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z4 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    new C16865d0(3).m47493b(c32028y, Boolean.valueOf(z4));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c29660d.obtainStyledAttributes(attributeSet, C24839f0.f97286e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    AbstractC16901p0.m47584o(c32028y, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c29660d.obtainStyledAttributes(attributeSet, C24839f0.f97287f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z13 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                    new C16865d0(0).m47493b(c32028y, Boolean.valueOf(z13));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c32028y;
    }

    @Override // p314m.AbstractC24858q
    /* JADX INFO: renamed from: p */
    public final void mo72804p(CharSequence charSequence) {
        this.f97215Q = charSequence;
        InterfaceC31934a1 interfaceC31934a1 = this.f97216R;
        if (interfaceC31934a1 != null) {
            interfaceC31934a1.setWindowTitle(charSequence);
            return;
        }
        AbstractC24830b abstractC24830b = this.f97213O;
        if (abstractC24830b != null) {
            abstractC24830b.mo72835x(charSequence);
            return;
        }
        TextView textView = this.f97226b0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, m.n] */
    @Override // p314m.AbstractC24858q
    /* JADX INFO: renamed from: q */
    public final AbstractC29658b mo72805q(InterfaceC29657a interfaceC29657a) {
        AbstractC29658b abstractC29658bOnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        if (interfaceC29657a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC29658b abstractC29658b = this.f97219U;
        if (abstractC29658b != null) {
            abstractC29658b.mo72857c();
        }
        C30352d c30352d = new C30352d(this, interfaceC29657a, false, 23);
        m72787E();
        AbstractC24830b abstractC24830b = this.f97213O;
        ?? r10 = this.f97212N;
        if (abstractC24830b != null) {
            AbstractC29658b abstractC29658bMo72836y = abstractC24830b.mo72836y(c30352d);
            this.f97219U = abstractC29658bMo72836y;
            if (abstractC29658bMo72836y != null) {
                r10.onSupportActionModeStarted(abstractC29658bMo72836y);
            }
        }
        if (this.f97219U == null) {
            C16913t0 c16913t0 = this.f97223Y;
            if (c16913t0 != null) {
                c16913t0.m47608b();
            }
            AbstractC29658b abstractC29658b2 = this.f97219U;
            if (abstractC29658b2 != null) {
                abstractC29658b2.mo72857c();
            }
            if (this.f97241q0) {
                abstractC29658bOnWindowStartingSupportActionMode = null;
            } else {
                try {
                    abstractC29658bOnWindowStartingSupportActionMode = r10.onWindowStartingSupportActionMode(c30352d);
                } catch (AbstractMethodError unused) {
                    abstractC29658bOnWindowStartingSupportActionMode = null;
                }
            }
            if (abstractC29658bOnWindowStartingSupportActionMode != null) {
                this.f97219U = abstractC29658bOnWindowStartingSupportActionMode;
            } else {
                int i13 = 1;
                if (this.f97220V == null) {
                    boolean z4 = this.f97233i0;
                    Context context = this.f97209K;
                    if (z4) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(com.whoop.android.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            C29660d c29660d = new C29660d(context, 0);
                            c29660d.getTheme().setTo(themeNewTheme);
                            context = c29660d;
                        }
                        this.f97220V = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.whoop.android.R.attr.actionModePopupWindowStyle);
                        this.f97221W = popupWindow;
                        AbstractC35148d.m111166Q(popupWindow);
                        this.f97221W.setContentView(this.f97220V);
                        this.f97221W.setWidth(-1);
                        context.getTheme().resolveAttribute(com.whoop.android.R.attr.actionBarSize, typedValue, true);
                        this.f97220V.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f97221W.setHeight(-2);
                        this.f97222X = new RunnableC3543b(this, 17);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f97225a0.findViewById(com.whoop.android.R.id.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            m72787E();
                            AbstractC24830b abstractC24830b2 = this.f97213O;
                            Context contextMo72816e = abstractC24830b2 != null ? abstractC24830b2.mo72816e() : null;
                            if (contextMo72816e != null) {
                                context = contextMo72816e;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            this.f97220V = (ActionBarContextView) viewStubCompat.m3332a();
                        }
                    }
                }
                if (this.f97220V != null) {
                    C16913t0 c16913t1 = this.f97223Y;
                    if (c16913t1 != null) {
                        c16913t1.m47608b();
                    }
                    this.f97220V.m3263e();
                    C29661e c29661e = new C29661e(this.f97220V.getContext(), this.f97220V, c30352d);
                    if (c30352d.mo91069t(c29661e, c29661e.mo72859e())) {
                        c29661e.mo72863i();
                        this.f97220V.m3261c(c29661e);
                        this.f97219U = c29661e;
                        if (this.f97224Z && (viewGroup = this.f97225a0) != null && viewGroup.isLaidOut()) {
                            this.f97220V.setAlpha(0.0f);
                            C16913t0 c16913t0M47570a = AbstractC16901p0.m47570a(this.f97220V);
                            c16913t0M47570a.m47607a(1.0f);
                            this.f97223Y = c16913t0M47570a;
                            c16913t0M47570a.m47610d(new C24859r(this, i13));
                        } else {
                            this.f97220V.setAlpha(1.0f);
                            this.f97220V.setVisibility(0);
                            if (this.f97220V.getParent() instanceof View) {
                                View view = (View) this.f97220V.getParent();
                                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                                AbstractC16871f0.m47500c(view);
                            }
                        }
                        if (this.f97221W != null) {
                            this.f97210L.getDecorView().post(this.f97222X);
                        }
                    } else {
                        this.f97219U = null;
                    }
                }
            }
            AbstractC29658b abstractC29658b3 = this.f97219U;
            if (abstractC29658b3 != null) {
                r10.onSupportActionModeStarted(abstractC29658b3);
            }
            m72795M();
            this.f97219U = this.f97219U;
        }
        m72795M();
        return this.f97219U;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final boolean m72806s(boolean z4, boolean z13) {
        int i13;
        boolean z14;
        if (this.f97241q0) {
            return false;
        }
        int i14 = this.f97243s0;
        if (i14 == -100) {
            i14 = AbstractC24858q.f97383x;
        }
        Context context = this.f97209K;
        int iM72789G = m72789G(context, i14);
        int i15 = Build.VERSION.SDK_INT;
        C2728g c2728gM72781u = i15 < 33 ? m72781u(context) : null;
        if (!z13 && c2728gM72781u != null) {
            c2728gM72781u = AbstractC24862u.m72888b(context.getResources().getConfiguration());
        }
        Configuration configurationM72782y = m72782y(context, iM72789G, c2728gM72781u, null, false);
        boolean z15 = this.f97246v0;
        boolean z16 = true;
        Object obj = this.f97208J;
        if (z15 || !(obj instanceof Activity)) {
            this.f97246v0 = true;
            i13 = this.f97245u0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i13 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i15 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f97245u0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e5);
                    this.f97245u0 = 0;
                }
                this.f97246v0 = true;
                i13 = this.f97245u0;
            }
        }
        Configuration configuration = this.f97242r0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i16 = configuration.uiMode & 48;
        int i17 = configurationM72782y.uiMode & 48;
        C2728g c2728gM72888b = AbstractC24862u.m72888b(configuration);
        C2728g c2728gM72888b2 = c2728gM72781u == null ? null : AbstractC24862u.m72888b(configurationM72782y);
        int i18 = i16 != i17 ? 512 : 0;
        if (c2728gM72888b2 != null && !c2728gM72888b.equals(c2728gM72888b2)) {
            i18 |= 8196;
        }
        if (((~i13) & i18) != 0 && z4 && this.f97239o0 && ((f97200J0 || this.f97240p0) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z14 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i18 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM72782y.getLayoutDirection());
                }
                ActivityCompat.recreate(activity);
                z14 = true;
            }
        } else {
            z14 = false;
        }
        if (z14 || i18 == 0) {
            z16 = z14;
        } else {
            boolean z17 = (i13 & i18) == i18;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i17;
            if (c2728gM72888b2 != null) {
                AbstractC24862u.m72890d(configuration2, c2728gM72888b2);
            }
            resources.updateConfiguration(configuration2, null);
            int i19 = this.f97244t0;
            if (i19 != 0) {
                context.setTheme(i19);
                context.getTheme().applyStyle(this.f97244t0, true);
            }
            if (z17 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC1585g0) {
                    if (((InterfaceC1585g0) activity2).getLifecycle().getCurrentState().compareTo(EnumC1635w.f6327y) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f97240p0 && !this.f97241q0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z16 && (obj instanceof AbstractActivityC24852m)) {
            if ((i18 & 512) != 0) {
                ((AbstractActivityC24852m) obj).onNightModeChanged(iM72789G);
            }
            if ((i18 & 4) != 0) {
                ((AbstractActivityC24852m) obj).onLocalesChanged(c2728gM72781u);
            }
        }
        if (c2728gM72888b2 != null) {
            AbstractC24862u.m72889c(AbstractC24862u.m72888b(context.getResources().getConfiguration()));
        }
        if (i14 == 0) {
            if (this.f97247w0 == null) {
                this.f97247w0 = new C24865x(this, C15990r.m45135I(context));
            }
            this.f97247w0.m7249H();
        } else {
            C24865x c24865x = this.f97247w0;
            if (c24865x != null) {
                c24865x.m7255h();
            }
        }
        if (i14 == 3) {
            if (this.f97248x0 == null) {
                this.f97248x0 = new C24865x(this, context);
            }
            this.f97248x0.m7249H();
        } else {
            C24865x c24865x2 = this.f97248x0;
            if (c24865x2 != null) {
                c24865x2.m7255h();
            }
        }
        return z16;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX INFO: renamed from: t */
    public final void m72807t(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f97210L != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC24864w) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC24864w windowCallbackC24864w = new WindowCallbackC24864w(this, callback);
        this.f97211M = windowCallbackC24864w;
        window.setCallback(windowCallbackC24864w);
        C31983m2 c31983m2M99478p = C31983m2.m99478p(this.f97209K, null, f97199I0);
        Drawable drawableM99487k = c31983m2M99478p.m99487k(0);
        if (drawableM99487k != null) {
            window.setBackgroundDrawable(drawableM99487k);
        }
        c31983m2M99478p.m99491r();
        this.f97210L = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f97206F0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f97207G0) != null) {
            AbstractC24863v.m72893c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f97207G0 = null;
        }
        Object obj = this.f97208J;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f97206F0 = AbstractC24863v.m72891a(activity);
            } else {
                this.f97206F0 = null;
            }
        } else {
            this.f97206F0 = null;
        }
        m72795M();
    }

    /* JADX INFO: renamed from: v */
    public final void m72808v(int i13, C24867z c24867z, MenuC30818l menuC30818l) {
        if (menuC30818l == null) {
            if (c24867z == null && i13 >= 0) {
                C24867z[] c24867zArr = this.f97236l0;
                if (i13 < c24867zArr.length) {
                    c24867z = c24867zArr[i13];
                }
            }
            if (c24867z != null) {
                menuC30818l = c24867z.f97407h;
            }
        }
        if ((c24867z == null || c24867z.f97412m) && !this.f97241q0) {
            WindowCallbackC24864w windowCallbackC24864w = this.f97211M;
            Window.Callback callback = this.f97210L.getCallback();
            windowCallbackC24864w.getClass();
            try {
                windowCallbackC24864w.f97390E = true;
                callback.onPanelClosed(i13, menuC30818l);
            } finally {
                windowCallbackC24864w.f97390E = false;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m72809w(MenuC30818l menuC30818l) {
        if (this.f97235k0) {
            return;
        }
        this.f97235k0 = true;
        ((ActionBarOverlayLayout) this.f97216R).m3271f();
        Window.Callback callback = this.f97210L.getCallback();
        if (callback != null && !this.f97241q0) {
            callback.onPanelClosed(108, menuC30818l);
        }
        this.f97235k0 = false;
    }

    /* JADX INFO: renamed from: x */
    public final void m72810x(C24867z c24867z, boolean z4) {
        C24866y c24866y;
        InterfaceC31934a1 interfaceC31934a1;
        if (z4 && c24867z.f97400a == 0 && (interfaceC31934a1 = this.f97216R) != null && ((ActionBarOverlayLayout) interfaceC31934a1).m3280o()) {
            m72809w(c24867z.f97407h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f97209K.getSystemService("window");
        if (windowManager != null && c24867z.f97412m && (c24866y = c24867z.f97404e) != null) {
            windowManager.removeView(c24866y);
            if (z4) {
                m72808v(c24867z.f97400a, c24867z, null);
            }
        }
        c24867z.f97410k = false;
        c24867z.f97411l = false;
        c24867z.f97412m = false;
        c24867z.f97405f = null;
        c24867z.f97413n = true;
        if (this.f97237m0 == c24867z) {
            this.f97237m0 = null;
        }
        if (c24867z.f97400a == 0) {
            m72795M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101 A[RETURN] */
    /* JADX INFO: renamed from: z */
    public final boolean m72811z(KeyEvent keyEvent) {
        int keyCode;
        C24867z c24867zM72786D;
        InterfaceC31934a1 interfaceC31934a1;
        Context context;
        boolean z4;
        boolean zM3276k;
        boolean zM72793K;
        AudioManager audioManager;
        C24867z c24867zM72786D2;
        Object obj = this.f97208J;
        if (((obj instanceof InterfaceC16882j) || (obj instanceof DialogC24833c0)) && this.f97210L.getDecorView() != null) {
            AbstractC35903f.m114018o();
        }
        if (keyEvent.getKeyCode() == 82) {
            WindowCallbackC24864w windowCallbackC24864w = this.f97211M;
            Window.Callback callback = this.f97210L.getCallback();
            windowCallbackC24864w.getClass();
            try {
                windowCallbackC24864w.f97395z = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                windowCallbackC24864w.f97395z = false;
                if (!zDispatchKeyEvent) {
                    keyCode = keyEvent.getKeyCode();
                    if (keyEvent.getAction() == 0) {
                        if (keyCode != 4) {
                            this.f97238n0 = (keyEvent.getFlags() & 128) != 0;
                            return false;
                        }
                        if (keyCode == 82) {
                            if (keyEvent.getRepeatCount() == 0) {
                                c24867zM72786D2 = m72786D(0);
                                if (!c24867zM72786D2.f97412m) {
                                    m72793K(c24867zM72786D2, keyEvent);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (keyCode != 4) {
                        if (keyCode == 82) {
                            if (this.f97219U == null) {
                                c24867zM72786D = m72786D(0);
                                interfaceC31934a1 = this.f97216R;
                                context = this.f97209K;
                                if (interfaceC31934a1 != null || !((ActionBarOverlayLayout) interfaceC31934a1).m3270e() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                    z4 = c24867zM72786D.f97412m;
                                    if (!z4 || c24867zM72786D.f97411l) {
                                        m72810x(c24867zM72786D, true);
                                        zM3276k = z4;
                                    } else if (c24867zM72786D.f97410k) {
                                        if (c24867zM72786D.f97414o) {
                                            c24867zM72786D.f97410k = false;
                                            zM72793K = m72793K(c24867zM72786D, keyEvent);
                                        } else {
                                            zM72793K = true;
                                        }
                                        if (zM72793K) {
                                            m72791I(c24867zM72786D, keyEvent);
                                            zM3276k = true;
                                        } else {
                                            zM3276k = false;
                                        }
                                    } else {
                                        zM3276k = false;
                                    }
                                } else if (((ActionBarOverlayLayout) this.f97216R).m3280o()) {
                                    zM3276k = ((ActionBarOverlayLayout) this.f97216R).m3276k();
                                } else if (this.f97241q0 || !m72793K(c24867zM72786D, keyEvent)) {
                                    zM3276k = false;
                                } else {
                                    zM3276k = ((ActionBarOverlayLayout) this.f97216R).m3284s();
                                }
                                if (zM3276k) {
                                    audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (m72790H()) {
                        return false;
                    }
                }
            } catch (Throwable th3) {
                windowCallbackC24864w.f97395z = false;
                throw th3;
            }
        } else {
            keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode != 4) {
                    this.f97238n0 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        c24867zM72786D2 = m72786D(0);
                        if (!c24867zM72786D2.f97412m) {
                            m72793K(c24867zM72786D2, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f97219U == null) {
                        c24867zM72786D = m72786D(0);
                        interfaceC31934a1 = this.f97216R;
                        context = this.f97209K;
                        if (interfaceC31934a1 != null) {
                            z4 = c24867zM72786D.f97412m;
                            if (z4) {
                                m72810x(c24867zM72786D, true);
                                zM3276k = z4;
                            } else {
                                m72810x(c24867zM72786D, true);
                                zM3276k = z4;
                            }
                        } else {
                            z4 = c24867zM72786D.f97412m;
                            if (z4) {
                                m72810x(c24867zM72786D, true);
                                zM3276k = z4;
                            } else {
                                m72810x(c24867zM72786D, true);
                                zM3276k = z4;
                            }
                        }
                        if (zM3276k) {
                            audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                            if (audioManager != null) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                            return true;
                        }
                    }
                }
                return false;
            }
            if (m72790H()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
