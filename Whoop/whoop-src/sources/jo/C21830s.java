package jo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b30.ViewOnClickListenerC2558k3;
import bs2.AbstractC3613f;
import bs2.C3612e;
import com.whoop.android.R;
import io.C18744f;
import io.sentry.RunnableC20277c7;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import live.hms.video.error.ErrorCodes;
import p004a2.AbstractC0152a;
import p087db.C11842c0;
import p087db.C11849g;
import p087db.C11865o;
import p087db.C11871r;
import p087db.ViewOnLayoutChangeListenerC11857k;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31515a0;
import p465rm.AbstractC31558o1;
import p465rm.C31521c0;
import p465rm.C31552m1;
import p465rm.C31555n1;
import p465rm.C31561p1;
import p465rm.C31564q1;
import p465rm.C31571u;
import p465rm.C31574v0;
import p465rm.C31576w0;
import p465rm.InterfaceC31519b1;
import p513u4.AbstractC34523k;
import p690zr.AbstractC41005a0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41060w0;
import sn.C32766w0;
import tn.C33955a;
import tn.C33956b;

/* JADX INFO: renamed from: jo.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C21830s extends FrameLayout {

    /* JADX INFO: renamed from: X0 */
    public static final float[] f84155X0;

    /* JADX INFO: renamed from: A0 */
    public int f84156A0;

    /* JADX INFO: renamed from: B0 */
    public long[] f84157B0;

    /* JADX INFO: renamed from: C0 */
    public boolean[] f84158C0;

    /* JADX INFO: renamed from: D0 */
    public final long[] f84159D0;

    /* JADX INFO: renamed from: E */
    public final View f84160E;

    /* JADX INFO: renamed from: E0 */
    public final boolean[] f84161E0;

    /* JADX INFO: renamed from: F */
    public final View f84162F;

    /* JADX INFO: renamed from: F0 */
    public long f84163F0;

    /* JADX INFO: renamed from: G */
    public final View f84164G;

    /* JADX INFO: renamed from: G0 */
    public final C11842c0 f84165G0;

    /* JADX INFO: renamed from: H */
    public final TextView f84166H;

    /* JADX INFO: renamed from: H0 */
    public final Resources f84167H0;

    /* JADX INFO: renamed from: I */
    public final TextView f84168I;

    /* JADX INFO: renamed from: I0 */
    public final RecyclerView f84169I0;

    /* JADX INFO: renamed from: J */
    public final ImageView f84170J;

    /* JADX INFO: renamed from: J0 */
    public final C11871r f84171J0;

    /* JADX INFO: renamed from: K */
    public final ImageView f84172K;

    /* JADX INFO: renamed from: K0 */
    public final C11865o f84173K0;

    /* JADX INFO: renamed from: L */
    public final View f84174L;

    /* JADX INFO: renamed from: L0 */
    public final PopupWindow f84175L0;

    /* JADX INFO: renamed from: M */
    public final TextView f84176M;

    /* JADX INFO: renamed from: M0 */
    public boolean f84177M0;

    /* JADX INFO: renamed from: N */
    public final TextView f84178N;

    /* JADX INFO: renamed from: N0 */
    public final int f84179N0;

    /* JADX INFO: renamed from: O */
    public final InterfaceC21810a0 f84180O;

    /* JADX INFO: renamed from: O0 */
    public final C21822k f84181O0;

    /* JADX INFO: renamed from: P */
    public final StringBuilder f84182P;

    /* JADX INFO: renamed from: P0 */
    public final C21822k f84183P0;

    /* JADX INFO: renamed from: Q */
    public final Formatter f84184Q;

    /* JADX INFO: renamed from: Q0 */
    public final C11849g f84185Q0;

    /* JADX INFO: renamed from: R */
    public final C31552m1 f84186R;

    /* JADX INFO: renamed from: R0 */
    public final ImageView f84187R0;

    /* JADX INFO: renamed from: S */
    public final C31555n1 f84188S;

    /* JADX INFO: renamed from: S0 */
    public final ImageView f84189S0;

    /* JADX INFO: renamed from: T */
    public final RunnableC20277c7 f84190T;

    /* JADX INFO: renamed from: T0 */
    public final ImageView f84191T0;

    /* JADX INFO: renamed from: U */
    public final Drawable f84192U;

    /* JADX INFO: renamed from: U0 */
    public final View f84193U0;

    /* JADX INFO: renamed from: V */
    public final Drawable f84194V;

    /* JADX INFO: renamed from: V0 */
    public final View f84195V0;

    /* JADX INFO: renamed from: W */
    public final Drawable f84196W;

    /* JADX INFO: renamed from: W0 */
    public final View f84197W0;

    /* JADX INFO: renamed from: a0 */
    public final String f84198a0;

    /* JADX INFO: renamed from: b0 */
    public final String f84199b0;

    /* JADX INFO: renamed from: c0 */
    public final String f84200c0;

    /* JADX INFO: renamed from: d0 */
    public final Drawable f84201d0;

    /* JADX INFO: renamed from: e0 */
    public final Drawable f84202e0;

    /* JADX INFO: renamed from: f0 */
    public final float f84203f0;

    /* JADX INFO: renamed from: g0 */
    public final float f84204g0;

    /* JADX INFO: renamed from: h0 */
    public final String f84205h0;

    /* JADX INFO: renamed from: i0 */
    public final String f84206i0;

    /* JADX INFO: renamed from: j0 */
    public final Drawable f84207j0;

    /* JADX INFO: renamed from: k0 */
    public final Drawable f84208k0;

    /* JADX INFO: renamed from: l0 */
    public final String f84209l0;

    /* JADX INFO: renamed from: m0 */
    public final String f84210m0;

    /* JADX INFO: renamed from: n0 */
    public final Drawable f84211n0;

    /* JADX INFO: renamed from: o0 */
    public final Drawable f84212o0;

    /* JADX INFO: renamed from: p0 */
    public final String f84213p0;

    /* JADX INFO: renamed from: q0 */
    public final String f84214q0;

    /* JADX INFO: renamed from: r0 */
    public InterfaceC31519b1 f84215r0;

    /* JADX INFO: renamed from: s0 */
    public InterfaceC21824m f84216s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f84217t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f84218u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f84219v0;

    /* JADX INFO: renamed from: w */
    public final ViewOnClickListenerC21823l f84220w;

    /* JADX INFO: renamed from: w0 */
    public boolean f84221w0;

    /* JADX INFO: renamed from: x */
    public final CopyOnWriteArrayList f84222x;

    /* JADX INFO: renamed from: x0 */
    public boolean f84223x0;

    /* JADX INFO: renamed from: y */
    public final View f84224y;

    /* JADX INFO: renamed from: y0 */
    public int f84225y0;

    /* JADX INFO: renamed from: z */
    public final View f84226z;

    /* JADX INFO: renamed from: z0 */
    public int f84227z0;

    static {
        AbstractC31515a0.m97109a("goog.exo.ui");
        f84155X0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public C21830s(Context context) {
        super(context, null, 0);
        this.f84225y0 = ErrorCodes.WebsocketMethodErrors.cServerErrors;
        this.f84156A0 = 0;
        this.f84227z0 = 200;
        LayoutInflater.from(context).inflate(R.layout.exo_styled_player_control_view, this);
        setDescendantFocusability(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
        ViewOnClickListenerC21823l viewOnClickListenerC21823l = new ViewOnClickListenerC21823l(this);
        this.f84220w = viewOnClickListenerC21823l;
        this.f84222x = new CopyOnWriteArrayList();
        this.f84186R = new C31552m1();
        this.f84188S = new C31555n1();
        StringBuilder sb4 = new StringBuilder();
        this.f84182P = sb4;
        this.f84184Q = new Formatter(sb4, Locale.getDefault());
        this.f84157B0 = new long[0];
        this.f84158C0 = new boolean[0];
        this.f84159D0 = new long[0];
        this.f84161E0 = new boolean[0];
        this.f84190T = new RunnableC20277c7(this, 18);
        this.f84176M = (TextView) findViewById(R.id.exo_duration);
        this.f84178N = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f84187R0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC21823l);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f84189S0 = imageView2;
        ViewOnClickListenerC2558k3 viewOnClickListenerC2558k3 = new ViewOnClickListenerC2558k3(this, 29);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC2558k3);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f84191T0 = imageView3;
        ViewOnClickListenerC2558k3 viewOnClickListenerC2558k4 = new ViewOnClickListenerC2558k3(this, 29);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC2558k4);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f84193U0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC21823l);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f84195V0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC21823l);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f84197W0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC21823l);
        }
        InterfaceC21810a0 interfaceC21810a0 = (InterfaceC21810a0) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC21810a0 != null) {
            this.f84180O = interfaceC21810a0;
        } else if (viewFindViewById4 != null) {
            C21816e c21816e = new C21816e(context);
            c21816e.setId(R.id.exo_progress);
            c21816e.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c21816e, iIndexOfChild);
            this.f84180O = c21816e;
        } else {
            this.f84180O = null;
        }
        InterfaceC21810a0 interfaceC21810a1 = this.f84180O;
        if (interfaceC21810a1 != null) {
            ((C21816e) interfaceC21810a1).f84109a0.add(viewOnClickListenerC21823l);
        }
        View viewFindViewById5 = findViewById(R.id.exo_play_pause);
        this.f84160E = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(viewOnClickListenerC21823l);
        }
        View viewFindViewById6 = findViewById(R.id.exo_prev);
        this.f84224y = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(viewOnClickListenerC21823l);
        }
        View viewFindViewById7 = findViewById(R.id.exo_next);
        this.f84226z = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(viewOnClickListenerC21823l);
        }
        Typeface typefaceM109098b = AbstractC34523k.m109098b(context, R.font.roboto_medium_numbers);
        View viewFindViewById8 = findViewById(R.id.exo_rew);
        TextView textView = viewFindViewById8 == null ? (TextView) findViewById(R.id.exo_rew_with_amount) : null;
        this.f84168I = textView;
        if (textView != null) {
            textView.setTypeface(typefaceM109098b);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView : viewFindViewById8;
        this.f84164G = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(viewOnClickListenerC21823l);
        }
        View viewFindViewById9 = findViewById(R.id.exo_ffwd);
        TextView textView2 = viewFindViewById9 == null ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : null;
        this.f84166H = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceM109098b);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView2 : viewFindViewById9;
        this.f84162F = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(viewOnClickListenerC21823l);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f84170J = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(viewOnClickListenerC21823l);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f84172K = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(viewOnClickListenerC21823l);
        }
        Resources resources = context.getResources();
        this.f84167H0 = resources;
        this.f84203f0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f84204g0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById10 = findViewById(R.id.exo_vr);
        this.f84174L = viewFindViewById10;
        if (viewFindViewById10 != null) {
            m61765j(viewFindViewById10, false);
        }
        C11842c0 c11842c0 = new C11842c0(this);
        this.f84165G0 = c11842c0;
        c11842c0.f38615w = true;
        C11871r c11871r = new C11871r(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.f84171J0 = c11871r;
        this.f84179N0 = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f84169I0 = recyclerView;
        recyclerView.setAdapter(c11871r);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f84175L0 = popupWindow;
        if (AbstractC24567y.f95875a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC21823l);
        this.f84177M0 = true;
        this.f84185Q0 = new C11849g(getResources(), 1);
        this.f84207j0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.f84208k0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.f84209l0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f84210m0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f84181O0 = new C21822k(this, 1);
        this.f84183P0 = new C21822k(this, 0);
        this.f84173K0 = new C11865o(this, resources.getStringArray(R.array.exo_controls_playback_speeds), f84155X0, 1);
        this.f84211n0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.f84212o0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.f84192U = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.f84194V = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.f84196W = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.f84201d0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.f84202e0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.f84213p0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f84214q0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f84198a0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f84199b0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f84200c0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f84205h0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f84206i0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        c11842c0.m31795j((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        c11842c0.m31795j(viewFindViewById9, true);
        c11842c0.m31795j(viewFindViewById8, true);
        c11842c0.m31795j(viewFindViewById6, true);
        c11842c0.m31795j(viewFindViewById7, true);
        c11842c0.m31795j(imageView5, false);
        c11842c0.m31795j(imageView, false);
        c11842c0.m31795j(viewFindViewById10, false);
        c11842c0.m31795j(imageView4, this.f84156A0 != 0);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC11857k(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public static void m61756a(C21830s c21830s) {
        String str = c21830s.f84214q0;
        Drawable drawable = c21830s.f84212o0;
        String str2 = c21830s.f84213p0;
        Drawable drawable2 = c21830s.f84211n0;
        if (c21830s.f84216s0 == null) {
            return;
        }
        boolean z4 = c21830s.f84217t0;
        c21830s.f84217t0 = !z4;
        ImageView imageView = c21830s.f84189S0;
        if (imageView != null) {
            if (z4) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            }
        }
        ImageView imageView2 = c21830s.f84191T0;
        boolean z13 = c21830s.f84217t0;
        if (imageView2 != null) {
            if (z13) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        InterfaceC21824m interfaceC21824m = c21830s.f84216s0;
        if (interfaceC21824m != null) {
            C3612e c3612e = (C3612e) interfaceC21824m;
            AbstractC3613f.m10969h(c3612e.f14698w, c3612e.f14699x, c21830s.f84217t0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f13) {
        InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
        if (interfaceC31519b1 == null) {
            return;
        }
        C31571u c31571u = (C31571u) interfaceC31519b1;
        c31571u.m97198B0();
        C31576w0 c31576w0 = new C31576w0(f13, c31571u.f130392K0.f130454n.f130466x);
        c31571u.m97198B0();
        if (c31571u.f130392K0.f130454n.equals(c31576w0)) {
            return;
        }
        C31574v0 c31574v0M97238f = c31571u.f130392K0.m97238f(c31576w0);
        c31571u.f130418i0++;
        c31571u.f130393L.f130483H.m71649a(4, c31576w0).m71647b();
        c31571u.m97231z0(c31574v0M97238f, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m61758c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
        if (interfaceC31519b1 == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (((C31571u) interfaceC31519b1).m97212e0() != 4) {
                    AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC31519b1;
                    C31571u c31571u = (C31571u) abstractC0152a;
                    c31571u.m97198B0();
                    abstractC0152a.m378L(c31571u.f130406W);
                }
            } else if (keyCode == 89) {
                AbstractC0152a abstractC0152a2 = (AbstractC0152a) interfaceC31519b1;
                C31571u c31571u2 = (C31571u) abstractC0152a2;
                c31571u2.m97198B0();
                abstractC0152a2.m378L(-c31571u2.f130405V);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    C31571u c31571u3 = (C31571u) interfaceC31519b1;
                    int iM97212e0 = c31571u3.m97212e0();
                    if (iM97212e0 == 1 || iM97212e0 == 4 || !c31571u3.m97211d0()) {
                        int iM97212e1 = c31571u3.m97212e0();
                        if (iM97212e1 == 1) {
                            c31571u3.m97218m0();
                        } else if (iM97212e1 == 4) {
                            c31571u3.m97222q0(c31571u3.m97206Y(), -9223372036854775807L);
                        }
                        c31571u3.m97225t0(true);
                    } else {
                        c31571u3.m97225t0(false);
                    }
                } else if (keyCode == 87) {
                    ((AbstractC0152a) interfaceC31519b1).m376J();
                } else if (keyCode == 88) {
                    ((AbstractC0152a) interfaceC31519b1).m379M();
                } else if (keyCode == 126) {
                    C31571u c31571u4 = (C31571u) interfaceC31519b1;
                    int iM97212e2 = c31571u4.m97212e0();
                    if (iM97212e2 == 1) {
                        c31571u4.m97218m0();
                    } else if (iM97212e2 == 4) {
                        c31571u4.m97222q0(c31571u4.m97206Y(), -9223372036854775807L);
                    }
                    c31571u4.m97225t0(true);
                } else if (keyCode == 127) {
                    ((C31571u) ((AbstractC0152a) interfaceC31519b1)).m97225t0(false);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m61759d(AbstractC1692i1 abstractC1692i1) {
        this.f84169I0.setAdapter(abstractC1692i1);
        m61771p();
        this.f84177M0 = false;
        PopupWindow popupWindow = this.f84175L0;
        popupWindow.dismiss();
        this.f84177M0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i13 = this.f84179N0;
        popupWindow.showAsDropDown(this, width - i13, (-popupWindow.getHeight()) - i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m61758c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX INFO: renamed from: e */
    public final C41060w0 m61760e(C31564q1 c31564q1, int i13) {
        String strM31804a;
        String string;
        String strM71609c;
        String str;
        int i14 = 4;
        AbstractC41047q.m133273c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        AbstractC41023g0 abstractC41023g0 = c31564q1.f130358w;
        int i15 = 0;
        int i16 = 0;
        while (i15 < abstractC41023g0.size()) {
            C31561p1 c31561p1 = (C31561p1) abstractC41023g0.get(i15);
            if (c31561p1.f130353y == i13) {
                C32766w0 c32766w0 = c31561p1.f130351w;
                int i17 = 0;
                while (i17 < c32766w0.f136260w) {
                    if (c31561p1.f130352x[i17] == i14) {
                        C31521c0 c31521c0 = c32766w0.f136262y[i17];
                        C11849g c11849g = this.f84185Q0;
                        Resources resources = c11849g.f38674b;
                        Resources resources2 = c11849g.f38674b;
                        String str2 = c31521c0.f130077L;
                        int i18 = c31521c0.f130073H;
                        int i19 = c31521c0.f130090Y;
                        int i24 = c31521c0.f130083R;
                        int i25 = i16;
                        int i26 = c31521c0.f130082Q;
                        String str3 = c31521c0.f130074I;
                        int iM71613g = AbstractC24555m.m71613g(str2);
                        if (iM71613g == -1) {
                            if (str3 != null) {
                                String[] strArrM71668F = AbstractC24567y.m71668F(str3);
                                int length = strArrM71668F.length;
                                int i27 = 0;
                                while (true) {
                                    if (i27 < length) {
                                        strM71609c = AbstractC24555m.m71609c(strArrM71668F[i27]);
                                        if (strM71609c != null && AbstractC24555m.m71616j(strM71609c)) {
                                            break;
                                        }
                                        i27++;
                                    } else {
                                        strM71609c = null;
                                        break;
                                    }
                                }
                            } else {
                                strM71609c = null;
                                break;
                            }
                            if (strM71609c == null) {
                                if (str3 != null) {
                                    String[] strArrM71668F2 = AbstractC24567y.m71668F(str3);
                                    int length2 = strArrM71668F2.length;
                                    int i28 = 0;
                                    while (true) {
                                        if (i28 < length2) {
                                            String strM71609c2 = AbstractC24555m.m71609c(strArrM71668F2[i28]);
                                            if (strM71609c2 != null && AbstractC24555m.m71614h(strM71609c2)) {
                                                str = strM71609c2;
                                                break;
                                            }
                                            i28++;
                                        } else {
                                            str = null;
                                            break;
                                        }
                                    }
                                } else {
                                    str = null;
                                    break;
                                }
                                if (str != null) {
                                    iM71613g = 1;
                                } else if (i26 != -1 || i24 != -1) {
                                    iM71613g = 2;
                                } else if (i19 == -1 && c31521c0.f130091Z == -1) {
                                    iM71613g = -1;
                                } else {
                                    iM71613g = 1;
                                }
                            } else {
                                iM71613g = 2;
                            }
                        }
                        if (iM71613g == 2) {
                            strM31804a = c11849g.m31809f(c11849g.m31806c(c31521c0), (i26 == -1 || i24 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i26), Integer.valueOf(i24)), i18 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i18 / 1000000.0f)) : "");
                        } else if (iM71613g == 1) {
                            String strM31804a2 = c11849g.m31804a(c31521c0);
                            if (i19 == -1 || i19 < 1) {
                                string = "";
                            } else if (i19 == 1) {
                                string = resources.getString(R.string.exo_track_mono);
                            } else if (i19 == 2) {
                                string = resources.getString(R.string.exo_track_stereo);
                            } else if (i19 == 6 || i19 == 7) {
                                string = resources.getString(R.string.exo_track_surround_5_point_1);
                            } else {
                                string = i19 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
                            }
                            strM31804a = c11849g.m31809f(strM31804a2, string, i18 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i18 / 1000000.0f)) : "");
                        } else {
                            strM31804a = c11849g.m31804a(c31521c0);
                        }
                        if (strM31804a.length() == 0) {
                            strM31804a = resources.getString(R.string.exo_track_unknown);
                        }
                        C21828q c21828q = new C21828q(c31564q1, i15, i17, strM31804a);
                        i16 = i25 + 1;
                        int iM133221e = AbstractC41005a0.m133221e(objArrCopyOf.length, i16);
                        if (iM133221e > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM133221e);
                        }
                        objArrCopyOf[i25] = c21828q;
                    }
                    i17++;
                    c32766w0 = c32766w0;
                    abstractC41023g0 = abstractC41023g0;
                    c31561p1 = c31561p1;
                    i14 = 4;
                }
            }
            i15++;
            abstractC41023g0 = abstractC41023g0;
            i14 = 4;
        }
        return AbstractC41023g0.m133250j(i16, objArrCopyOf);
    }

    /* JADX INFO: renamed from: f */
    public final void m61761f() {
        C11842c0 c11842c0 = this.f84165G0;
        int i13 = c11842c0.f38612t;
        if (i13 == 3 || i13 == 2) {
            return;
        }
        c11842c0.m31793h();
        if (!c11842c0.f38615w) {
            c11842c0.m31796k(2);
        } else if (c11842c0.f38612t == 1) {
            c11842c0.f38605m.start();
        } else {
            c11842c0.f38606n.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m61762g() {
        C11842c0 c11842c0 = this.f84165G0;
        return c11842c0.f38612t == 0 && ((C21830s) c11842c0.f38616x).m61763h();
    }

    public InterfaceC31519b1 getPlayer() {
        return this.f84215r0;
    }

    public int getRepeatToggleModes() {
        return this.f84156A0;
    }

    public boolean getShowShuffleButton() {
        return this.f84165G0.m31791b(this.f84172K);
    }

    public boolean getShowSubtitleButton() {
        return this.f84165G0.m31791b(this.f84187R0);
    }

    public int getShowTimeoutMs() {
        return this.f84225y0;
    }

    public boolean getShowVrButton() {
        return this.f84165G0.m31791b(this.f84174L);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m61763h() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m61764i() {
        m61767l();
        m61766k();
        m61770o();
        m61772q();
        m61774s();
        m61768m();
        m61773r();
    }

    /* JADX INFO: renamed from: j */
    public final void m61765j(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.setEnabled(z4);
        view.setAlpha(z4 ? this.f84203f0 : this.f84204g0);
    }

    /* JADX INFO: renamed from: k */
    public final void m61766k() {
        boolean zM367A;
        boolean zM367A2;
        boolean zM367A3;
        boolean zM367A4;
        boolean zM367A5;
        long j7;
        long j13;
        if (m61763h() && this.f84218u0) {
            InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
            if (interfaceC31519b1 != null) {
                AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC31519b1;
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
            Resources resources = this.f84167H0;
            View view = this.f84164G;
            if (zM367A4) {
                InterfaceC31519b1 interfaceC31519b2 = this.f84215r0;
                if (interfaceC31519b2 != null) {
                    C31571u c31571u = (C31571u) interfaceC31519b2;
                    c31571u.m97198B0();
                    j13 = c31571u.f130405V;
                } else {
                    j13 = 5000;
                }
                int i13 = (int) (j13 / 1000);
                TextView textView = this.f84168I;
                if (textView != null) {
                    textView.setText(String.valueOf(i13));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i13, Integer.valueOf(i13)));
                }
            }
            View view2 = this.f84162F;
            if (zM367A5) {
                InterfaceC31519b1 interfaceC31519b3 = this.f84215r0;
                if (interfaceC31519b3 != null) {
                    C31571u c31571u2 = (C31571u) interfaceC31519b3;
                    c31571u2.m97198B0();
                    j7 = c31571u2.f130406W;
                } else {
                    j7 = 15000;
                }
                int i14 = (int) (j7 / 1000);
                TextView textView2 = this.f84166H;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i14));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i14, Integer.valueOf(i14)));
                }
            }
            m61765j(this.f84224y, zM367A3);
            m61765j(view, zM367A4);
            m61765j(view2, zM367A5);
            m61765j(this.f84226z, zM367A2);
            InterfaceC21810a0 interfaceC21810a0 = this.f84180O;
            if (interfaceC21810a0 != null) {
                ((C21816e) interfaceC21810a0).setEnabled(zM367A);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m61767l() {
        View view;
        if (m61763h() && this.f84218u0 && (view = this.f84160E) != null) {
            InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
            Resources resources = this.f84167H0;
            if (interfaceC31519b1 == null || ((C31571u) interfaceC31519b1).m97212e0() == 4 || ((C31571u) this.f84215r0).m97212e0() == 1 || !((C31571u) this.f84215r0).m97211d0()) {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_play));
                view.setContentDescription(resources.getString(R.string.exo_controls_play_description));
            } else {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_pause));
                view.setContentDescription(resources.getString(R.string.exo_controls_pause_description));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m61768m() {
        InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
        if (interfaceC31519b1 == null) {
            return;
        }
        C31571u c31571u = (C31571u) interfaceC31519b1;
        c31571u.m97198B0();
        float f13 = c31571u.f130392K0.f130454n.f130465w;
        float f14 = Float.MAX_VALUE;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            C11865o c11865o = this.f84173K0;
            float[] fArr = c11865o.f38703c;
            if (i13 >= fArr.length) {
                c11865o.f38704d = i14;
                this.f84171J0.f38748c[0] = c11865o.f38702b[i14];
                return;
            } else {
                float fAbs = Math.abs(f13 - fArr[i13]);
                if (fAbs < f14) {
                    i14 = i13;
                    f14 = fAbs;
                }
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m61769n() {
        long j7;
        long jM71669G;
        if (m61763h() && this.f84218u0) {
            InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
            long j13 = 0;
            if (interfaceC31519b1 != null) {
                C31571u c31571u = (C31571u) interfaceC31519b1;
                long jM97203V = c31571u.m97203V() + this.f84163F0;
                long j14 = this.f84163F0;
                c31571u.m97198B0();
                if (c31571u.f130392K0.f130441a.m97175p()) {
                    jM71669G = c31571u.f130396M0;
                } else {
                    C31574v0 c31574v0 = c31571u.f130392K0;
                    if (c31574v0.f130451k.f136241d != c31574v0.f130442b.f136241d) {
                        jM71669G = AbstractC24567y.m71669G(c31574v0.f130441a.mo97136m(c31571u.m97206Y(), (C31555n1) c31571u.f475x, 0L).f130318N);
                    } else {
                        long j15 = c31574v0.f130457q;
                        if (c31571u.f130392K0.f130451k.m102753a()) {
                            C31574v0 c31574v1 = c31571u.f130392K0;
                            C31552m1 c31552m1Mo97132g = c31574v1.f130441a.mo97132g(c31574v1.f130451k.f136238a, c31571u.f130398O);
                            long jM97153d = c31552m1Mo97132g.m97153d(c31571u.f130392K0.f130451k.f136239b);
                            j15 = jM97153d == Long.MIN_VALUE ? c31552m1Mo97132g.f130287z : jM97153d;
                        }
                        C31574v0 c31574v2 = c31571u.f130392K0;
                        AbstractC31558o1 abstractC31558o1 = c31574v2.f130441a;
                        Object obj = c31574v2.f130451k.f136238a;
                        C31552m1 c31552m1 = c31571u.f130398O;
                        abstractC31558o1.mo97132g(obj, c31552m1);
                        jM71669G = AbstractC24567y.m71669G(j15 + c31552m1.f130281E);
                    }
                }
                j7 = jM71669G + j14;
                j13 = jM97203V;
            } else {
                j7 = 0;
            }
            TextView textView = this.f84178N;
            if (textView != null && !this.f84223x0) {
                textView.setText(AbstractC24567y.m71690u(this.f84182P, this.f84184Q, j13));
            }
            InterfaceC21810a0 interfaceC21810a0 = this.f84180O;
            if (interfaceC21810a0 != null) {
                ((C21816e) interfaceC21810a0).setPosition(j13);
                ((C21816e) this.f84180O).setBufferedPosition(j7);
            }
            removeCallbacks(this.f84190T);
            int iM97212e0 = interfaceC31519b1 == null ? 1 : ((C31571u) interfaceC31519b1).m97212e0();
            if (interfaceC31519b1 != null) {
                C31571u c31571u2 = (C31571u) ((AbstractC0152a) interfaceC31519b1);
                if (c31571u2.m97212e0() == 3 && c31571u2.m97211d0()) {
                    c31571u2.m97198B0();
                    if (c31571u2.f130392K0.f130453m == 0) {
                        InterfaceC21810a0 interfaceC21810a1 = this.f84180O;
                        long jMin = Math.min(interfaceC21810a1 != null ? ((C21816e) interfaceC21810a1).getPreferredUpdateDelay() : 1000L, 1000 - (j13 % 1000));
                        C31571u c31571u3 = (C31571u) interfaceC31519b1;
                        c31571u3.m97198B0();
                        float f13 = c31571u3.f130392K0.f130454n.f130465w;
                        postDelayed(this.f84190T, AbstractC24567y.m71678i(f13 > 0.0f ? (long) (jMin / f13) : 1000L, this.f84227z0, 1000L));
                        return;
                    }
                }
            }
            if (iM97212e0 == 4 || iM97212e0 == 1) {
                return;
            }
            postDelayed(this.f84190T, 1000L);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m61770o() {
        ImageView imageView;
        if (m61763h() && this.f84218u0 && (imageView = this.f84170J) != null) {
            if (this.f84156A0 == 0) {
                m61765j(imageView, false);
                return;
            }
            InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
            String str = this.f84198a0;
            Drawable drawable = this.f84192U;
            if (interfaceC31519b1 == null) {
                m61765j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m61765j(imageView, true);
            C31571u c31571u = (C31571u) interfaceC31519b1;
            c31571u.m97198B0();
            int i13 = c31571u.f130416g0;
            if (i13 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i13 == 1) {
                imageView.setImageDrawable(this.f84194V);
                imageView.setContentDescription(this.f84199b0);
            } else {
                if (i13 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f84196W);
                imageView.setContentDescription(this.f84200c0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11842c0 c11842c0 = this.f84165G0;
        ((C21830s) c11842c0.f38616x).addOnLayoutChangeListener((ViewOnLayoutChangeListenerC11857k) c11842c0.f38592D);
        this.f84218u0 = true;
        if (m61762g()) {
            c11842c0.m31794i();
        }
        m61764i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11842c0 c11842c0 = this.f84165G0;
        ((C21830s) c11842c0.f38616x).removeOnLayoutChangeListener((ViewOnLayoutChangeListenerC11857k) c11842c0.f38592D);
        this.f84218u0 = false;
        removeCallbacks(this.f84190T);
        c11842c0.m31793h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        View view = this.f84165G0.f38594b;
        if (view != null) {
            view.layout(0, 0, i15 - i13, i16 - i14);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m61771p() {
        RecyclerView recyclerView = this.f84169I0;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i13 = this.f84179N0;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i13 * 2));
        PopupWindow popupWindow = this.f84175L0;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i13 * 2), recyclerView.getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: q */
    public final void m61772q() {
        ImageView imageView;
        if (m61763h() && this.f84218u0 && (imageView = this.f84172K) != null) {
            InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
            if (!this.f84165G0.m31791b(imageView)) {
                m61765j(imageView, false);
                return;
            }
            String str = this.f84206i0;
            Drawable drawable = this.f84202e0;
            if (interfaceC31519b1 == null) {
                m61765j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m61765j(imageView, true);
            C31571u c31571u = (C31571u) interfaceC31519b1;
            c31571u.m97198B0();
            if (c31571u.f130417h0) {
                drawable = this.f84201d0;
            }
            imageView.setImageDrawable(drawable);
            c31571u.m97198B0();
            if (c31571u.f130417h0) {
                str = this.f84205h0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[EDGE_INSN: B:17:0x003d->B:18:0x003e BREAK  A[LOOP:0: B:11:0x002b->B:15:0x0038]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4  */
    /* JADX INFO: renamed from: r */
    public final void m61773r() {
        boolean z4;
        boolean z13;
        int i13;
        long j7;
        long[] jArr;
        C33955a c33955aM107404a;
        int i14;
        int i15;
        AbstractC31558o1 abstractC31558o1;
        boolean z14;
        boolean z15;
        int i16;
        int i17;
        int length;
        InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
        if (interfaceC31519b1 == null) {
            return;
        }
        boolean z16 = this.f84219v0;
        long j13 = -9223372036854775807L;
        long j14 = 0;
        C31555n1 c31555n1 = this.f84188S;
        boolean z17 = false;
        boolean z18 = true;
        if (!z16) {
            z4 = false;
            break;
        }
        AbstractC31558o1 abstractC31558o1M97209b0 = ((C31571u) interfaceC31519b1).m97209b0();
        if (abstractC31558o1M97209b0.mo97137o() <= 100) {
            int iMo97137o = abstractC31558o1M97209b0.mo97137o();
            int i18 = 0;
            while (true) {
                if (i18 >= iMo97137o) {
                    z4 = true;
                    break;
                } else {
                    if (abstractC31558o1M97209b0.mo97136m(i18, c31555n1, 0L).f130318N == -9223372036854775807L) {
                        z4 = false;
                        break;
                    }
                    i18++;
                }
            }
        } else {
            z4 = false;
            break;
        }
        this.f84221w0 = z4;
        this.f84163F0 = 0L;
        C31571u c31571u = (C31571u) interfaceC31519b1;
        AbstractC31558o1 abstractC31558o1M97209b1 = c31571u.m97209b0();
        if (abstractC31558o1M97209b1.m97175p()) {
            z13 = true;
            i13 = 0;
        } else {
            int iM97206Y = c31571u.m97206Y();
            boolean z19 = this.f84221w0;
            int i19 = z19 ? 0 : iM97206Y;
            int iMo97137o2 = z19 ? abstractC31558o1M97209b1.mo97137o() - 1 : iM97206Y;
            long j15 = 0;
            i13 = 0;
            while (i19 <= iMo97137o2) {
                long j16 = j13;
                if (i19 == iM97206Y) {
                    this.f84163F0 = AbstractC24567y.m71669G(j15);
                }
                abstractC31558o1M97209b1.m97174n(i19, c31555n1);
                if (c31555n1.f130318N == j16) {
                    AbstractC24543a.m71573i(this.f84221w0 ^ z18);
                    break;
                }
                int i24 = c31555n1.f130319O;
                while (i24 <= c31555n1.f130320P) {
                    C31552m1 c31552m1 = this.f84186R;
                    abstractC31558o1M97209b1.mo97131f(i24, c31552m1, z17);
                    long j17 = j14;
                    C33956b c33956b = c31552m1.f130283G;
                    int i25 = c33956b.f142385z;
                    int i26 = c33956b.f142382w;
                    while (i25 < i26) {
                        long jM97153d = c31552m1.m97153d(i25);
                        if (jM97153d == Long.MIN_VALUE) {
                            long j18 = c31552m1.f130287z;
                            if (j18 == j16) {
                                abstractC31558o1 = abstractC31558o1M97209b1;
                                z14 = true;
                            } else {
                                jM97153d = j18;
                                j7 = jM97153d + c31552m1.f130281E;
                                if (j7 >= j17) {
                                    jArr = this.f84157B0;
                                    if (i13 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.f84157B0 = Arrays.copyOf(jArr, length);
                                        this.f84158C0 = Arrays.copyOf(this.f84158C0, length);
                                    }
                                    this.f84157B0[i13] = AbstractC24567y.m71669G(j15 + j7);
                                    boolean[] zArr = this.f84158C0;
                                    c33955aM107404a = c31552m1.f130283G.m107404a(i25);
                                    i14 = c33955aM107404a.f142375x;
                                    if (i14 != -1) {
                                        i15 = 0;
                                        while (true) {
                                            if (i15 < i14) {
                                                abstractC31558o1 = abstractC31558o1M97209b1;
                                                z14 = true;
                                                z15 = false;
                                                break;
                                            }
                                            i16 = i15;
                                            i17 = c33955aM107404a.f142377z[i16];
                                            abstractC31558o1 = abstractC31558o1M97209b1;
                                            z14 = true;
                                            if (i17 != 0 || i17 == 1) {
                                                z15 = true;
                                                break;
                                            } else {
                                                i15 = i16 + 1;
                                                abstractC31558o1M97209b1 = abstractC31558o1;
                                            }
                                        }
                                    } else {
                                        abstractC31558o1 = abstractC31558o1M97209b1;
                                        z14 = true;
                                        z15 = true;
                                    }
                                    zArr[i13] = !z15;
                                    i13++;
                                } else {
                                    abstractC31558o1 = abstractC31558o1M97209b1;
                                    z14 = true;
                                }
                            }
                        } else {
                            j7 = jM97153d + c31552m1.f130281E;
                            if (j7 >= j17) {
                                jArr = this.f84157B0;
                                if (i13 == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.f84157B0 = Arrays.copyOf(jArr, length);
                                    this.f84158C0 = Arrays.copyOf(this.f84158C0, length);
                                }
                                this.f84157B0[i13] = AbstractC24567y.m71669G(j15 + j7);
                                boolean[] zArr2 = this.f84158C0;
                                c33955aM107404a = c31552m1.f130283G.m107404a(i25);
                                i14 = c33955aM107404a.f142375x;
                                if (i14 != -1) {
                                    abstractC31558o1 = abstractC31558o1M97209b1;
                                    z14 = true;
                                    z15 = true;
                                } else {
                                    i15 = 0;
                                    while (true) {
                                        if (i15 < i14) {
                                            abstractC31558o1 = abstractC31558o1M97209b1;
                                            z14 = true;
                                            z15 = false;
                                            break;
                                        } else {
                                            i16 = i15;
                                            i17 = c33955aM107404a.f142377z[i16];
                                            abstractC31558o1 = abstractC31558o1M97209b1;
                                            z14 = true;
                                            if (i17 != 0) {
                                            }
                                            z15 = true;
                                            break;
                                        }
                                        i15 = i16 + 1;
                                        abstractC31558o1M97209b1 = abstractC31558o1;
                                    }
                                }
                                zArr2[i13] = !z15;
                                i13++;
                            } else {
                                abstractC31558o1 = abstractC31558o1M97209b1;
                                z14 = true;
                            }
                        }
                        i25++;
                        z18 = z14;
                        iM97206Y = iM97206Y;
                        abstractC31558o1M97209b1 = abstractC31558o1;
                        j16 = -9223372036854775807L;
                    }
                    i24++;
                    j14 = j17;
                    abstractC31558o1M97209b1 = abstractC31558o1M97209b1;
                    z17 = false;
                    j16 = -9223372036854775807L;
                }
                j15 += c31555n1.f130318N;
                i19++;
                abstractC31558o1M97209b1 = abstractC31558o1M97209b1;
                j13 = -9223372036854775807L;
                z17 = false;
            }
            z13 = z18;
            j14 = j15;
        }
        long jM71669G = AbstractC24567y.m71669G(j14);
        TextView textView = this.f84176M;
        if (textView != null) {
            textView.setText(AbstractC24567y.m71690u(this.f84182P, this.f84184Q, jM71669G));
        }
        InterfaceC21810a0 interfaceC21810a0 = this.f84180O;
        if (interfaceC21810a0 != null) {
            C21816e c21816e = (C21816e) interfaceC21810a0;
            c21816e.setDuration(jM71669G);
            long[] jArr2 = this.f84159D0;
            int length2 = jArr2.length;
            int i27 = i13 + length2;
            long[] jArr3 = this.f84157B0;
            if (i27 > jArr3.length) {
                this.f84157B0 = Arrays.copyOf(jArr3, i27);
                this.f84158C0 = Arrays.copyOf(this.f84158C0, i27);
            }
            System.arraycopy(jArr2, 0, this.f84157B0, i13, length2);
            System.arraycopy(this.f84161E0, 0, this.f84158C0, i13, length2);
            long[] jArr4 = this.f84157B0;
            boolean[] zArr3 = this.f84158C0;
            AbstractC24543a.m71569e((i27 == 0 || !(jArr4 == null || zArr3 == null)) ? z13 : false);
            c21816e.f84124p0 = i27;
            c21816e.f84125q0 = jArr4;
            c21816e.f84126r0 = zArr3;
            c21816e.m61749e();
        }
        m61769n();
    }

    /* JADX INFO: renamed from: s */
    public final void m61774s() {
        C21822k c21822k = this.f84181O0;
        c21822k.getClass();
        List list = Collections.EMPTY_LIST;
        c21822k.f38765b = list;
        C21822k c21822k2 = this.f84183P0;
        c21822k2.getClass();
        c21822k2.f38765b = list;
        InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
        ImageView imageView = this.f84187R0;
        if (interfaceC31519b1 != null && ((AbstractC0152a) interfaceC31519b1).m367A(30) && ((AbstractC0152a) this.f84215r0).m367A(29)) {
            C31571u c31571u = (C31571u) this.f84215r0;
            c31571u.m97198B0();
            C31564q1 c31564q1 = c31571u.f130392K0.f130449i.f77584d;
            C41060w0 c41060w0M61760e = m61760e(c31564q1, 1);
            c21822k2.f38765b = c41060w0M61760e;
            C21830s c21830s = c21822k2.f84144e;
            InterfaceC31519b1 interfaceC31519b2 = c21830s.f84215r0;
            C11871r c11871r = c21830s.f84171J0;
            interfaceC31519b2.getClass();
            C18744f c18744fM97213g0 = ((C31571u) interfaceC31519b2).m97213g0();
            if (c41060w0M61760e.isEmpty()) {
                c11871r.f38748c[1] = c21830s.getResources().getString(R.string.exo_track_selection_none);
            } else if (c21822k2.m61753f(c18744fM97213g0.f77575X)) {
                for (int i13 = 0; i13 < c41060w0M61760e.f177069z; i13++) {
                    C21828q c21828q = (C21828q) c41060w0M61760e.get(i13);
                    if (c21828q.f84152a.f130354z[c21828q.f84153b]) {
                        c11871r.f38748c[1] = c21828q.f84154c;
                        break;
                    }
                }
            } else {
                c11871r.f38748c[1] = c21830s.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.f84165G0.m31791b(imageView)) {
                c21822k.m61754g(m61760e(c31564q1, 3));
            } else {
                c21822k.m61754g(C41060w0.f177067E);
            }
        }
        m61765j(imageView, c21822k.getPageCount() > 0);
    }

    public void setAnimationEnabled(boolean z4) {
        this.f84165G0.f38615w = z4;
    }

    public void setOnFullScreenModeChangedListener(InterfaceC21824m interfaceC21824m) {
        this.f84216s0 = interfaceC21824m;
        boolean z4 = interfaceC21824m != null;
        ImageView imageView = this.f84189S0;
        if (imageView != null) {
            if (z4) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z13 = interfaceC21824m != null;
        ImageView imageView2 = this.f84191T0;
        if (imageView2 == null) {
            return;
        }
        if (z13) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(InterfaceC31519b1 interfaceC31519b1) {
        AbstractC24543a.m71573i(Looper.myLooper() == Looper.getMainLooper());
        AbstractC24543a.m71569e(interfaceC31519b1 == null || ((C31571u) interfaceC31519b1).f130403T == Looper.getMainLooper());
        InterfaceC31519b1 interfaceC31519b2 = this.f84215r0;
        if (interfaceC31519b2 == interfaceC31519b1) {
            return;
        }
        ViewOnClickListenerC21823l viewOnClickListenerC21823l = this.f84220w;
        if (interfaceC31519b2 != null) {
            ((C31571u) interfaceC31519b2).m97220o0(viewOnClickListenerC21823l);
        }
        this.f84215r0 = interfaceC31519b1;
        if (interfaceC31519b1 != null) {
            ((C31571u) interfaceC31519b1).m97199Q(viewOnClickListenerC21823l);
        }
        m61764i();
    }

    public void setProgressUpdateListener(InterfaceC21825n interfaceC21825n) {
    }

    public void setRepeatToggleModes(int i13) {
        this.f84156A0 = i13;
        InterfaceC31519b1 interfaceC31519b1 = this.f84215r0;
        if (interfaceC31519b1 != null) {
            C31571u c31571u = (C31571u) interfaceC31519b1;
            c31571u.m97198B0();
            int i14 = c31571u.f130416g0;
            if (i13 == 0 && i14 != 0) {
                ((C31571u) this.f84215r0).m97226u0(0);
            } else if (i13 == 1 && i14 == 2) {
                ((C31571u) this.f84215r0).m97226u0(1);
            } else if (i13 == 2 && i14 == 1) {
                ((C31571u) this.f84215r0).m97226u0(2);
            }
        }
        this.f84165G0.m31795j(this.f84170J, i13 != 0);
        m61770o();
    }

    public void setShowFastForwardButton(boolean z4) {
        this.f84165G0.m31795j(this.f84162F, z4);
        m61766k();
    }

    public void setShowMultiWindowTimeBar(boolean z4) {
        this.f84219v0 = z4;
        m61773r();
    }

    public void setShowNextButton(boolean z4) {
        this.f84165G0.m31795j(this.f84226z, z4);
        m61766k();
    }

    public void setShowPreviousButton(boolean z4) {
        this.f84165G0.m31795j(this.f84224y, z4);
        m61766k();
    }

    public void setShowRewindButton(boolean z4) {
        this.f84165G0.m31795j(this.f84164G, z4);
        m61766k();
    }

    public void setShowShuffleButton(boolean z4) {
        this.f84165G0.m31795j(this.f84172K, z4);
        m61772q();
    }

    public void setShowSubtitleButton(boolean z4) {
        this.f84165G0.m31795j(this.f84187R0, z4);
    }

    public void setShowTimeoutMs(int i13) {
        this.f84225y0 = i13;
        if (m61762g()) {
            this.f84165G0.m31794i();
        }
    }

    public void setShowVrButton(boolean z4) {
        this.f84165G0.m31795j(this.f84174L, z4);
    }

    public void setTimeBarMinUpdateInterval(int i13) {
        this.f84227z0 = AbstractC24567y.m71677h(i13, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f84174L;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m61765j(view, onClickListener != null);
        }
    }
}
