package androidx.media3.p019ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.p019ui.LegacyPlayerControlView;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.android.R;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import live.hms.video.error.ErrorCodes;
import p004a2.AbstractC0152a;
import p031b9.C2830f0;
import p087db.AbstractC11854i0;
import p087db.C11847f;
import p087db.InterfaceC11855j;
import p087db.InterfaceC11872r0;
import p087db.RunnableC11851h;
import p087db.ViewOnClickListenerC11853i;
import p516u8.AbstractC34609o0;
import p516u8.AbstractC34628y;
import p516u8.C34580a;
import p516u8.C34582b;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p516u8.InterfaceC34599j0;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: loaded from: classes5.dex */
public class LegacyPlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ int f6403E0 = 0;

    /* JADX INFO: renamed from: A0 */
    public final long[] f6404A0;

    /* JADX INFO: renamed from: B0 */
    public final boolean[] f6405B0;

    /* JADX INFO: renamed from: C0 */
    public long f6406C0;

    /* JADX INFO: renamed from: D0 */
    public long f6407D0;

    /* JADX INFO: renamed from: E */
    public final View f6408E;

    /* JADX INFO: renamed from: F */
    public final View f6409F;

    /* JADX INFO: renamed from: G */
    public final View f6410G;

    /* JADX INFO: renamed from: H */
    public final View f6411H;

    /* JADX INFO: renamed from: I */
    public final ImageView f6412I;

    /* JADX INFO: renamed from: J */
    public final ImageView f6413J;

    /* JADX INFO: renamed from: K */
    public final View f6414K;

    /* JADX INFO: renamed from: L */
    public final TextView f6415L;

    /* JADX INFO: renamed from: M */
    public final TextView f6416M;

    /* JADX INFO: renamed from: N */
    public final InterfaceC11872r0 f6417N;

    /* JADX INFO: renamed from: O */
    public final StringBuilder f6418O;

    /* JADX INFO: renamed from: P */
    public final Formatter f6419P;

    /* JADX INFO: renamed from: Q */
    public final C34605m0 f6420Q;

    /* JADX INFO: renamed from: R */
    public final C34607n0 f6421R;

    /* JADX INFO: renamed from: S */
    public final RunnableC11851h f6422S;

    /* JADX INFO: renamed from: T */
    public final RunnableC11851h f6423T;

    /* JADX INFO: renamed from: U */
    public final Drawable f6424U;

    /* JADX INFO: renamed from: V */
    public final Drawable f6425V;

    /* JADX INFO: renamed from: W */
    public final Drawable f6426W;

    /* JADX INFO: renamed from: a0 */
    public final String f6427a0;

    /* JADX INFO: renamed from: b0 */
    public final String f6428b0;

    /* JADX INFO: renamed from: c0 */
    public final String f6429c0;

    /* JADX INFO: renamed from: d0 */
    public final Drawable f6430d0;

    /* JADX INFO: renamed from: e0 */
    public final Drawable f6431e0;

    /* JADX INFO: renamed from: f0 */
    public final float f6432f0;

    /* JADX INFO: renamed from: g0 */
    public final float f6433g0;

    /* JADX INFO: renamed from: h0 */
    public final String f6434h0;

    /* JADX INFO: renamed from: i0 */
    public final String f6435i0;

    /* JADX INFO: renamed from: j0 */
    public InterfaceC34599j0 f6436j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f6437k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f6438l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f6439m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f6440n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f6441o0;

    /* JADX INFO: renamed from: p0 */
    public int f6442p0;

    /* JADX INFO: renamed from: q0 */
    public int f6443q0;

    /* JADX INFO: renamed from: r0 */
    public int f6444r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f6445s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f6446t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f6447u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f6448v0;

    /* JADX INFO: renamed from: w */
    public final ViewOnClickListenerC11853i f6449w;

    /* JADX INFO: renamed from: w0 */
    public boolean f6450w0;

    /* JADX INFO: renamed from: x */
    public final CopyOnWriteArrayList f6451x;

    /* JADX INFO: renamed from: x0 */
    public long f6452x0;

    /* JADX INFO: renamed from: y */
    public final View f6453y;

    /* JADX INFO: renamed from: y0 */
    public long[] f6454y0;

    /* JADX INFO: renamed from: z */
    public final View f6455z;

    /* JADX INFO: renamed from: z0 */
    public boolean[] f6456z0;

    static {
        AbstractC34628y.m109420a("media3.ui");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [db.h] */
    /* JADX WARN: Type inference failed for: r5v2, types: [db.h] */
    public LegacyPlayerControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6439m0 = true;
        this.f6442p0 = ErrorCodes.WebsocketMethodErrors.cServerErrors;
        this.f6444r0 = 0;
        this.f6443q0 = 200;
        this.f6452x0 = -9223372036854775807L;
        this.f6445s0 = true;
        this.f6446t0 = true;
        this.f6447u0 = true;
        this.f6448v0 = true;
        this.f6450w0 = false;
        int resourceId = R.layout.exo_legacy_player_control_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC11854i0.f38681c, 0, 0);
            try {
                this.f6442p0 = typedArrayObtainStyledAttributes.getInt(19, this.f6442p0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(5, R.layout.exo_legacy_player_control_view);
                this.f6444r0 = typedArrayObtainStyledAttributes.getInt(8, this.f6444r0);
                this.f6445s0 = typedArrayObtainStyledAttributes.getBoolean(17, this.f6445s0);
                this.f6446t0 = typedArrayObtainStyledAttributes.getBoolean(14, this.f6446t0);
                this.f6447u0 = typedArrayObtainStyledAttributes.getBoolean(16, this.f6447u0);
                this.f6448v0 = typedArrayObtainStyledAttributes.getBoolean(15, this.f6448v0);
                this.f6450w0 = typedArrayObtainStyledAttributes.getBoolean(18, this.f6450w0);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(20, this.f6443q0));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        }
        this.f6451x = new CopyOnWriteArrayList();
        this.f6420Q = new C34605m0();
        this.f6421R = new C34607n0();
        StringBuilder sb4 = new StringBuilder();
        this.f6418O = sb4;
        this.f6419P = new Formatter(sb4, Locale.getDefault());
        this.f6454y0 = new long[0];
        this.f6456z0 = new boolean[0];
        this.f6404A0 = new long[0];
        this.f6405B0 = new boolean[0];
        ViewOnClickListenerC11853i viewOnClickListenerC11853i = new ViewOnClickListenerC11853i(this);
        this.f6449w = viewOnClickListenerC11853i;
        final int i13 = 0;
        this.f6422S = new Runnable(this) { // from class: db.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LegacyPlayerControlView f38676x;

            {
                this.f38676x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i14 = i13;
                LegacyPlayerControlView legacyPlayerControlView = this.f38676x;
                switch (i14) {
                    case 0:
                        int i15 = LegacyPlayerControlView.f6403E0;
                        legacyPlayerControlView.m5068i();
                        break;
                    default:
                        legacyPlayerControlView.m5060a();
                        break;
                }
            }
        };
        final int i14 = 1;
        this.f6423T = new Runnable(this) { // from class: db.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ LegacyPlayerControlView f38676x;

            {
                this.f38676x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i15 = i14;
                LegacyPlayerControlView legacyPlayerControlView = this.f38676x;
                switch (i15) {
                    case 0:
                        int i16 = LegacyPlayerControlView.f6403E0;
                        legacyPlayerControlView.m5068i();
                        break;
                    default:
                        legacyPlayerControlView.m5060a();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
        InterfaceC11872r0 interfaceC11872r0 = (InterfaceC11872r0) findViewById(R.id.exo_progress);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC11872r0 != null) {
            this.f6417N = interfaceC11872r0;
        } else if (viewFindViewById != null) {
            C11847f c11847f = new C11847f(context, attributeSet, 0);
            c11847f.setId(R.id.exo_progress);
            c11847f.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(c11847f, iIndexOfChild);
            this.f6417N = c11847f;
        } else {
            this.f6417N = null;
        }
        this.f6415L = (TextView) findViewById(R.id.exo_duration);
        this.f6416M = (TextView) findViewById(R.id.exo_position);
        InterfaceC11872r0 interfaceC11872r1 = this.f6417N;
        if (interfaceC11872r1 != null) {
            ((C11847f) interfaceC11872r1).f38651a0.add(viewOnClickListenerC11853i);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.f6408E = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC11853i);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.f6409F = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC11853i);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.f6453y = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(viewOnClickListenerC11853i);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.f6455z = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC11853i);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.f6411H = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC11853i);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.f6410G = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC11853i);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f6412I = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC11853i);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f6413J = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC11853i);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.f6414K = viewFindViewById8;
        setShowVrButton(false);
        m5065f(viewFindViewById8, false, false);
        Resources resources = context.getResources();
        this.f6432f0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f6433g0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f6424U = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_off, context.getTheme());
        this.f6425V = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_one, context.getTheme());
        this.f6426W = resources.getDrawable(R.drawable.exo_legacy_controls_repeat_all, context.getTheme());
        this.f6430d0 = resources.getDrawable(R.drawable.exo_legacy_controls_shuffle_on, context.getTheme());
        this.f6431e0 = resources.getDrawable(R.drawable.exo_legacy_controls_shuffle_off, context.getTheme());
        this.f6427a0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f6428b0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f6429c0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f6434h0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f6435i0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.f6407D0 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final void m5060a() {
        if (m5062c()) {
            setVisibility(8);
            Iterator it = this.f6451x.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                getVisibility();
                throw null;
            }
            removeCallbacks(this.f6422S);
            removeCallbacks(this.f6423T);
            this.f6452x0 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5061b() {
        RunnableC11851h runnableC11851h = this.f6423T;
        removeCallbacks(runnableC11851h);
        if (this.f6442p0 <= 0) {
            this.f6452x0 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j7 = this.f6442p0;
        this.f6452x0 = jUptimeMillis + j7;
        if (this.f6437k0) {
            postDelayed(runnableC11851h, j7);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5062c() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m5063d() {
        View view;
        View view2;
        boolean zM121905S = AbstractC38065t.m121905S(this.f6436j0, this.f6439m0);
        if (zM121905S && (view2 = this.f6408E) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zM121905S || (view = this.f6409F) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC34599j0 interfaceC34599j0 = this.f6436j0;
        if (interfaceC34599j0 == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (((C2830f0) interfaceC34599j0).m8110i0() == 4) {
                return true;
            }
            ((AbstractC0152a) interfaceC34599j0).m373G();
            return true;
        }
        if (keyCode == 89) {
            ((AbstractC0152a) interfaceC34599j0).m372F();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (AbstractC38065t.m121905S(interfaceC34599j0, this.f6439m0)) {
                AbstractC38065t.m121889C(interfaceC34599j0);
                return true;
            }
            AbstractC38065t.m121888B(interfaceC34599j0);
            return true;
        }
        if (keyCode == 87) {
            ((AbstractC0152a) interfaceC34599j0).m376J();
            return true;
        }
        if (keyCode == 88) {
            ((AbstractC0152a) interfaceC34599j0).m379M();
            return true;
        }
        if (keyCode == 126) {
            AbstractC38065t.m121889C(interfaceC34599j0);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        AbstractC38065t.m121888B(interfaceC34599j0);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f6423T);
        } else if (motionEvent.getAction() == 1) {
            m5061b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final void m5064e() {
        View view;
        View view2;
        if (!m5062c()) {
            setVisibility(0);
            Iterator it = this.f6451x.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                getVisibility();
                throw null;
            }
            m5067h();
            m5066g();
            m5069j();
            m5070k();
            m5071l();
            boolean zM121905S = AbstractC38065t.m121905S(this.f6436j0, this.f6439m0);
            if (zM121905S && (view2 = this.f6408E) != null) {
                view2.requestFocus();
            } else if (!zM121905S && (view = this.f6409F) != null) {
                view.requestFocus();
            }
            m5063d();
        }
        m5061b();
    }

    /* JADX INFO: renamed from: f */
    public final void m5065f(View view, boolean z4, boolean z13) {
        if (view == null) {
            return;
        }
        view.setEnabled(z13);
        view.setAlpha(z13 ? this.f6432f0 : this.f6433g0);
        view.setVisibility(z4 ? 0 : 8);
    }

    /* JADX INFO: renamed from: g */
    public final void m5066g() {
        boolean zM367A;
        boolean zM367A2;
        boolean zM367A3;
        boolean zM367A4;
        boolean zM367A5;
        if (m5062c() && this.f6437k0) {
            InterfaceC34599j0 interfaceC34599j0 = this.f6436j0;
            if (interfaceC34599j0 != null) {
                AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
                zM367A = abstractC0152a.m367A(5);
                zM367A3 = abstractC0152a.m367A(7);
                zM367A4 = abstractC0152a.m367A(11);
                zM367A5 = abstractC0152a.m367A(12);
                zM367A2 = abstractC0152a.m367A(9);
            } else {
                zM367A = false;
                zM367A2 = false;
                zM367A3 = false;
                zM367A4 = false;
                zM367A5 = false;
            }
            m5065f(this.f6453y, this.f6447u0, zM367A3);
            m5065f(this.f6411H, this.f6445s0, zM367A4);
            m5065f(this.f6410G, this.f6446t0, zM367A5);
            m5065f(this.f6455z, this.f6448v0, zM367A2);
            InterfaceC11872r0 interfaceC11872r0 = this.f6417N;
            if (interfaceC11872r0 != null) {
                ((C11847f) interfaceC11872r0).setEnabled(zM367A);
            }
        }
    }

    public InterfaceC34599j0 getPlayer() {
        return this.f6436j0;
    }

    public int getRepeatToggleModes() {
        return this.f6444r0;
    }

    public boolean getShowShuffleButton() {
        return this.f6450w0;
    }

    public int getShowTimeoutMs() {
        return this.f6442p0;
    }

    public boolean getShowVrButton() {
        View view = this.f6414K;
        return view != null && view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m5067h() {
        boolean z4;
        boolean z13;
        if (m5062c() && this.f6437k0) {
            boolean zM121905S = AbstractC38065t.m121905S(this.f6436j0, this.f6439m0);
            View view = this.f6408E;
            if (view != null) {
                z4 = !zM121905S && view.isFocused();
                z13 = !zM121905S && view.isAccessibilityFocused();
                view.setVisibility(zM121905S ? 0 : 8);
            } else {
                z4 = false;
                z13 = false;
            }
            View view2 = this.f6409F;
            if (view2 != null) {
                z4 |= zM121905S && view2.isFocused();
                z13 |= zM121905S && view2.isAccessibilityFocused();
                view2.setVisibility(zM121905S ? 8 : 0);
            }
            if (z4) {
                boolean zM121905S2 = AbstractC38065t.m121905S(this.f6436j0, this.f6439m0);
                if (zM121905S2 && view != null) {
                    view.requestFocus();
                } else if (!zM121905S2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z13) {
                m5063d();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5068i() {
        long jM8098W;
        long jM8097V;
        if (m5062c() && this.f6437k0) {
            InterfaceC34599j0 interfaceC34599j0 = this.f6436j0;
            if (interfaceC34599j0 != null) {
                long j7 = this.f6406C0;
                C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
                c2830f0.m8091L0();
                jM8098W = c2830f0.m8098W(c2830f0.f11111I0) + j7;
                jM8097V = c2830f0.m8097V() + this.f6406C0;
            } else {
                jM8098W = 0;
                jM8097V = 0;
            }
            boolean z4 = jM8098W != this.f6407D0;
            this.f6407D0 = jM8098W;
            TextView textView = this.f6416M;
            if (textView != null && !this.f6441o0 && z4) {
                textView.setText(AbstractC38065t.m121932y(this.f6418O, this.f6419P, jM8098W));
            }
            InterfaceC11872r0 interfaceC11872r0 = this.f6417N;
            if (interfaceC11872r0 != null) {
                C11847f c11847f = (C11847f) interfaceC11872r0;
                c11847f.setPosition(jM8098W);
                c11847f.setBufferedPosition(jM8097V);
            }
            RunnableC11851h runnableC11851h = this.f6422S;
            removeCallbacks(runnableC11851h);
            int iM8110i0 = interfaceC34599j0 == null ? 1 : ((C2830f0) interfaceC34599j0).m8110i0();
            if (interfaceC34599j0 != null) {
                C2830f0 c2830f1 = (C2830f0) ((AbstractC0152a) interfaceC34599j0);
                if (c2830f1.m8110i0() == 3 && c2830f1.m8108g0()) {
                    c2830f1.m8091L0();
                    if (c2830f1.f11111I0.f11058n == 0) {
                        long jMin = Math.min(interfaceC11872r0 != null ? ((C11847f) interfaceC11872r0).getPreferredUpdateDelay() : 1000L, 1000 - (jM8098W % 1000));
                        float f13 = ((C2830f0) interfaceC34599j0).m8109h0().f145648a;
                        postDelayed(runnableC11851h, AbstractC38065t.m121915h(f13 > 0.0f ? (long) (jMin / f13) : 1000L, this.f6443q0, 1000L));
                        return;
                    }
                }
            }
            if (iM8110i0 == 4 || iM8110i0 == 1) {
                return;
            }
            postDelayed(runnableC11851h, 1000L);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5069j() {
        ImageView imageView;
        if (m5062c() && this.f6437k0 && (imageView = this.f6412I) != null) {
            if (this.f6444r0 == 0) {
                m5065f(imageView, false, false);
                return;
            }
            InterfaceC34599j0 interfaceC34599j0 = this.f6436j0;
            String str = this.f6427a0;
            Drawable drawable = this.f6424U;
            if (interfaceC34599j0 == null) {
                m5065f(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m5065f(imageView, true, true);
            C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
            c2830f0.m8091L0();
            int i13 = c2830f0.f11138h0;
            if (i13 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i13 == 1) {
                imageView.setImageDrawable(this.f6425V);
                imageView.setContentDescription(this.f6428b0);
            } else if (i13 == 2) {
                imageView.setImageDrawable(this.f6426W);
                imageView.setContentDescription(this.f6429c0);
            }
            imageView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5070k() {
        ImageView imageView;
        if (m5062c() && this.f6437k0 && (imageView = this.f6413J) != null) {
            InterfaceC34599j0 interfaceC34599j0 = this.f6436j0;
            if (!this.f6450w0) {
                m5065f(imageView, false, false);
                return;
            }
            String str = this.f6435i0;
            Drawable drawable = this.f6431e0;
            if (interfaceC34599j0 == null) {
                m5065f(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m5065f(imageView, true, true);
            C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
            c2830f0.m8091L0();
            if (c2830f0.f11139i0) {
                drawable = this.f6430d0;
            }
            imageView.setImageDrawable(drawable);
            c2830f0.m8091L0();
            if (c2830f0.f11139i0) {
                str = this.f6434h0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[EDGE_INSN: B:17:0x003d->B:18:0x003e BREAK  A[LOOP:0: B:11:0x002b->B:15:0x0038]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v6, types: [u8.o0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [u8.o0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [u8.m0] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12, types: [u8.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public final void m5071l() {
        boolean z4;
        boolean z13;
        int i13;
        ?? r10;
        ?? r24;
        boolean z14;
        ?? r14;
        boolean[] zArr;
        boolean z15;
        int length;
        InterfaceC34599j0 interfaceC34599j0 = this.f6436j0;
        if (interfaceC34599j0 == null) {
            return;
        }
        boolean z16 = this.f6438l0;
        long j7 = -9223372036854775807L;
        long j13 = 0;
        C34607n0 c34607n0 = this.f6421R;
        boolean z17 = false;
        boolean z18 = true;
        if (!z16) {
            z4 = false;
            break;
        }
        AbstractC34609o0 abstractC34609o0M8104c0 = ((C2830f0) interfaceC34599j0).m8104c0();
        if (abstractC34609o0M8104c0.mo8139o() > 100) {
            z4 = false;
            break;
        }
        int iMo8139o = abstractC34609o0M8104c0.mo8139o();
        int i14 = 0;
        while (true) {
            if (i14 >= iMo8139o) {
                z4 = true;
                break;
            } else {
                if (abstractC34609o0M8104c0.mo8129m(i14, c34607n0, 0L).f145713m == -9223372036854775807L) {
                    z4 = false;
                    break;
                }
                i14++;
            }
        }
        this.f6440n0 = z4;
        this.f6406C0 = 0L;
        C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
        AbstractC34609o0 abstractC34609o0M8104c1 = c2830f0.m8104c0();
        if (abstractC34609o0M8104c1.m109408p()) {
            z13 = true;
            i13 = 0;
        } else {
            int iM8101Z = c2830f0.m8101Z();
            boolean z19 = this.f6440n0;
            int i15 = z19 ? 0 : iM8101Z;
            int iMo8139o2 = z19 ? abstractC34609o0M8104c1.mo8139o() - 1 : iM8101Z;
            long j14 = 0;
            i13 = 0;
            ?? r15 = abstractC34609o0M8104c1;
            while (i15 <= iMo8139o2) {
                long j15 = j7;
                if (i15 == iM8101Z) {
                    this.f6406C0 = AbstractC38065t.m121907U(j14);
                }
                r15.m109407n(i15, c34607n0);
                if (c34607n0.f145713m == j15) {
                    AbstractC35849g.m113807i(this.f6440n0 ^ z18);
                    break;
                }
                int i16 = c34607n0.f145714n;
                ?? r16 = r15;
                while (i16 <= c34607n0.f145715o) {
                    ?? r17 = this.f6420Q;
                    r16.mo8128f(i16, r17, z17);
                    long j16 = j13;
                    C34582b c34582b = r17.f145697g;
                    c34582b.getClass();
                    int i17 = c34582b.f145638a;
                    for (?? r18 = z17; r18 < i17; r18++) {
                        r17.m109395d(r18);
                        long j17 = r17.f145695e;
                        if (j17 >= j16) {
                            long[] jArr = this.f6454y0;
                            if (i13 == jArr.length) {
                                if (jArr.length == 0) {
                                    r10 = r16;
                                    length = 1;
                                } else {
                                    r10 = r16;
                                    length = jArr.length * 2;
                                }
                                this.f6454y0 = Arrays.copyOf(jArr, length);
                                this.f6456z0 = Arrays.copyOf(this.f6456z0, length);
                            }
                            r10 = r16;
                            this.f6454y0[i13] = AbstractC38065t.m121907U(j17 + j14);
                            boolean[] zArr2 = this.f6456z0;
                            C34580a c34580aM109363a = r17.f145697g.m109363a(r18);
                            int i18 = c34580aM109363a.f145601a;
                            if (i18 != -1) {
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= i18) {
                                        r14 = r10;
                                        zArr = zArr2;
                                        r24 = r14;
                                        z14 = true;
                                        z15 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i24 = c34580aM109363a.f145605e[i19];
                                    ?? r25 = r14;
                                    z14 = true;
                                    if (i24 == 0) {
                                        r14 = r10;
                                    } else if (i24 != 1) {
                                        i19++;
                                        zArr2 = zArr;
                                        r14 = r25;
                                    }
                                    z15 = true;
                                    r24 = r25;
                                    break;
                                }
                            }
                            zArr = zArr2;
                            r24 = r10;
                            z14 = true;
                            z15 = true;
                            zArr[i13] = !z15;
                            i13++;
                        } else {
                            r10 = r16;
                            r24 = r10;
                            z14 = true;
                        }
                        z18 = z14;
                        iM8101Z = iM8101Z;
                        r10 = r24;
                    }
                    r10 = r16;
                    i16++;
                    j13 = j16;
                    r16 = r10;
                    z17 = false;
                }
                j14 += c34607n0.f145713m;
                i15++;
                r15 = r16;
                j7 = -9223372036854775807L;
                z17 = false;
            }
            z13 = z18;
            j13 = j14;
        }
        long jM121907U = AbstractC38065t.m121907U(j13);
        TextView textView = this.f6415L;
        if (textView != null) {
            textView.setText(AbstractC38065t.m121932y(this.f6418O, this.f6419P, jM121907U));
        }
        InterfaceC11872r0 interfaceC11872r0 = this.f6417N;
        if (interfaceC11872r0 != null) {
            C11847f c11847f = (C11847f) interfaceC11872r0;
            c11847f.setDuration(jM121907U);
            long[] jArr2 = this.f6404A0;
            int length2 = jArr2.length;
            int i25 = i13 + length2;
            long[] jArr3 = this.f6454y0;
            if (i25 > jArr3.length) {
                this.f6454y0 = Arrays.copyOf(jArr3, i25);
                this.f6456z0 = Arrays.copyOf(this.f6456z0, i25);
            }
            System.arraycopy(jArr2, 0, this.f6454y0, i13, length2);
            System.arraycopy(this.f6405B0, 0, this.f6456z0, i13, length2);
            long[] jArr4 = this.f6454y0;
            boolean[] zArr3 = this.f6456z0;
            AbstractC35849g.m113802d((i25 == 0 || !(jArr4 == null || zArr3 == null)) ? z13 : false);
            c11847f.f38666p0 = i25;
            c11847f.f38667q0 = jArr4;
            c11847f.f38668r0 = zArr3;
            c11847f.m31802e();
        }
        m5068i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6437k0 = true;
        long j7 = this.f6452x0;
        if (j7 != -9223372036854775807L) {
            long jUptimeMillis = j7 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                m5060a();
            } else {
                postDelayed(this.f6423T, jUptimeMillis);
            }
        } else if (m5062c()) {
            m5061b();
        }
        m5067h();
        m5066g();
        m5069j();
        m5070k();
        m5071l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6437k0 = false;
        removeCallbacks(this.f6422S);
        removeCallbacks(this.f6423T);
    }

    public void setPlayer(InterfaceC34599j0 interfaceC34599j0) {
        AbstractC35849g.m113807i(Looper.myLooper() == Looper.getMainLooper());
        AbstractC35849g.m113802d(interfaceC34599j0 == null || ((C2830f0) interfaceC34599j0).f11125U == Looper.getMainLooper());
        InterfaceC34599j0 interfaceC34599j1 = this.f6436j0;
        if (interfaceC34599j1 == interfaceC34599j0) {
            return;
        }
        ViewOnClickListenerC11853i viewOnClickListenerC11853i = this.f6449w;
        if (interfaceC34599j1 != null) {
            ((C2830f0) interfaceC34599j1).m8118s0(viewOnClickListenerC11853i);
        }
        this.f6436j0 = interfaceC34599j0;
        if (interfaceC34599j0 != null) {
            ((C2830f0) interfaceC34599j0).m8092Q(viewOnClickListenerC11853i);
        }
        m5067h();
        m5066g();
        m5069j();
        m5070k();
        m5071l();
    }

    public void setProgressUpdateListener(InterfaceC11855j interfaceC11855j) {
    }

    public void setRepeatToggleModes(int i13) {
        this.f6444r0 = i13;
        InterfaceC34599j0 interfaceC34599j0 = this.f6436j0;
        if (interfaceC34599j0 != null) {
            C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
            c2830f0.m8091L0();
            int i14 = c2830f0.f11138h0;
            if (i13 == 0 && i14 != 0) {
                ((C2830f0) this.f6436j0).m8081B0(0);
            } else if (i13 == 1 && i14 == 2) {
                ((C2830f0) this.f6436j0).m8081B0(1);
            } else if (i13 == 2 && i14 == 1) {
                ((C2830f0) this.f6436j0).m8081B0(2);
            }
        }
        m5069j();
    }

    public void setShowFastForwardButton(boolean z4) {
        this.f6446t0 = z4;
        m5066g();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z4) {
        this.f6438l0 = z4;
        m5071l();
    }

    public void setShowNextButton(boolean z4) {
        this.f6448v0 = z4;
        m5066g();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z4) {
        this.f6439m0 = z4;
        m5067h();
    }

    public void setShowPreviousButton(boolean z4) {
        this.f6447u0 = z4;
        m5066g();
    }

    public void setShowRewindButton(boolean z4) {
        this.f6445s0 = z4;
        m5066g();
    }

    public void setShowShuffleButton(boolean z4) {
        this.f6450w0 = z4;
        m5070k();
    }

    public void setShowTimeoutMs(int i13) {
        this.f6442p0 = i13;
        if (m5062c()) {
            m5061b();
        }
    }

    public void setShowVrButton(boolean z4) {
        View view = this.f6414K;
        if (view != null) {
            view.setVisibility(z4 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i13) {
        this.f6443q0 = AbstractC38065t.m121914g(i13, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f6414K;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m5065f(view, getShowVrButton(), onClickListener != null);
        }
    }
}
