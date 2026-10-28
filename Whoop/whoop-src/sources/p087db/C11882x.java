package p087db;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.RunnableC1319m;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b30.ViewOnClickListenerC2558k3;
import com.whoop.android.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import live.hms.video.error.ErrorCodes;
import p004a2.AbstractC0152a;
import p031b9.C2830f0;
import p361o9.C27670j;
import p513u4.AbstractC34523k;
import p516u8.AbstractC34609o0;
import p516u8.AbstractC34628y;
import p516u8.C34580a;
import p516u8.C34582b;
import p516u8.C34589e0;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p516u8.C34610p;
import p516u8.C34621u0;
import p516u8.C34623v0;
import p516u8.InterfaceC34599j0;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41005a0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: db.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C11882x extends FrameLayout {

    /* JADX INFO: renamed from: Z0 */
    public static final float[] f38773Z0;

    /* JADX INFO: renamed from: A0 */
    public final String f38774A0;

    /* JADX INFO: renamed from: B0 */
    public final Drawable f38775B0;

    /* JADX INFO: renamed from: C0 */
    public final Drawable f38776C0;

    /* JADX INFO: renamed from: D0 */
    public final String f38777D0;

    /* JADX INFO: renamed from: E */
    public final RecyclerView f38778E;

    /* JADX INFO: renamed from: E0 */
    public final String f38779E0;

    /* JADX INFO: renamed from: F */
    public final C11871r f38780F;

    /* JADX INFO: renamed from: F0 */
    public final Drawable f38781F0;

    /* JADX INFO: renamed from: G */
    public final C11865o f38782G;

    /* JADX INFO: renamed from: G0 */
    public final Drawable f38783G0;

    /* JADX INFO: renamed from: H */
    public final C11859l f38784H;

    /* JADX INFO: renamed from: H0 */
    public final String f38785H0;

    /* JADX INFO: renamed from: I */
    public final C11859l f38786I;

    /* JADX INFO: renamed from: I0 */
    public final String f38787I0;

    /* JADX INFO: renamed from: J */
    public final C11849g f38788J;

    /* JADX INFO: renamed from: J0 */
    public InterfaceC34599j0 f38789J0;

    /* JADX INFO: renamed from: K */
    public final PopupWindow f38790K;

    /* JADX INFO: renamed from: K0 */
    public boolean f38791K0;

    /* JADX INFO: renamed from: L */
    public final int f38792L;

    /* JADX INFO: renamed from: L0 */
    public boolean f38793L0;

    /* JADX INFO: renamed from: M */
    public final ImageView f38794M;

    /* JADX INFO: renamed from: M0 */
    public boolean f38795M0;

    /* JADX INFO: renamed from: N */
    public final ImageView f38796N;

    /* JADX INFO: renamed from: N0 */
    public boolean f38797N0;

    /* JADX INFO: renamed from: O */
    public final ImageView f38798O;

    /* JADX INFO: renamed from: O0 */
    public boolean f38799O0;

    /* JADX INFO: renamed from: P */
    public final View f38800P;

    /* JADX INFO: renamed from: P0 */
    public boolean f38801P0;

    /* JADX INFO: renamed from: Q */
    public final View f38802Q;

    /* JADX INFO: renamed from: Q0 */
    public int f38803Q0;

    /* JADX INFO: renamed from: R */
    public final TextView f38804R;

    /* JADX INFO: renamed from: R0 */
    public int f38805R0;

    /* JADX INFO: renamed from: S */
    public final TextView f38806S;

    /* JADX INFO: renamed from: S0 */
    public int f38807S0;

    /* JADX INFO: renamed from: T */
    public final ImageView f38808T;

    /* JADX INFO: renamed from: T0 */
    public long[] f38809T0;

    /* JADX INFO: renamed from: U */
    public final ImageView f38810U;

    /* JADX INFO: renamed from: U0 */
    public boolean[] f38811U0;

    /* JADX INFO: renamed from: V */
    public final ImageView f38812V;

    /* JADX INFO: renamed from: V0 */
    public final long[] f38813V0;

    /* JADX INFO: renamed from: W */
    public final ImageView f38814W;

    /* JADX INFO: renamed from: W0 */
    public final boolean[] f38815W0;

    /* JADX INFO: renamed from: X0 */
    public long f38816X0;

    /* JADX INFO: renamed from: Y0 */
    public boolean f38817Y0;

    /* JADX INFO: renamed from: a0 */
    public final ImageView f38818a0;

    /* JADX INFO: renamed from: b0 */
    public final ImageView f38819b0;

    /* JADX INFO: renamed from: c0 */
    public final View f38820c0;

    /* JADX INFO: renamed from: d0 */
    public final View f38821d0;

    /* JADX INFO: renamed from: e0 */
    public final View f38822e0;

    /* JADX INFO: renamed from: f0 */
    public final TextView f38823f0;

    /* JADX INFO: renamed from: g0 */
    public final TextView f38824g0;

    /* JADX INFO: renamed from: h0 */
    public final InterfaceC11872r0 f38825h0;

    /* JADX INFO: renamed from: i0 */
    public final StringBuilder f38826i0;

    /* JADX INFO: renamed from: j0 */
    public final Formatter f38827j0;

    /* JADX INFO: renamed from: k0 */
    public final C34605m0 f38828k0;

    /* JADX INFO: renamed from: l0 */
    public final C34607n0 f38829l0;

    /* JADX INFO: renamed from: m0 */
    public final RunnableC1319m f38830m0;

    /* JADX INFO: renamed from: n0 */
    public final Drawable f38831n0;

    /* JADX INFO: renamed from: o0 */
    public final Drawable f38832o0;

    /* JADX INFO: renamed from: p0 */
    public final Drawable f38833p0;

    /* JADX INFO: renamed from: q0 */
    public final Drawable f38834q0;

    /* JADX INFO: renamed from: r0 */
    public final Drawable f38835r0;

    /* JADX INFO: renamed from: s0 */
    public final String f38836s0;

    /* JADX INFO: renamed from: t0 */
    public final String f38837t0;

    /* JADX INFO: renamed from: u0 */
    public final String f38838u0;

    /* JADX INFO: renamed from: v0 */
    public final Drawable f38839v0;

    /* JADX INFO: renamed from: w */
    public final C11842c0 f38840w;

    /* JADX INFO: renamed from: w0 */
    public final Drawable f38841w0;

    /* JADX INFO: renamed from: x */
    public final Resources f38842x;

    /* JADX INFO: renamed from: x0 */
    public final float f38843x0;

    /* JADX INFO: renamed from: y */
    public final ViewOnClickListenerC11861m f38844y;

    /* JADX INFO: renamed from: y0 */
    public final float f38845y0;

    /* JADX INFO: renamed from: z */
    public final CopyOnWriteArrayList f38846z;

    /* JADX INFO: renamed from: z0 */
    public final String f38847z0;

    static {
        AbstractC34628y.m109420a("media3.ui");
        f38773Z0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public C11882x(Context context, AttributeSet attributeSet) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        boolean z18;
        boolean z19;
        boolean z24;
        super(context, null, 0);
        this.f38797N0 = true;
        this.f38803Q0 = ErrorCodes.WebsocketMethodErrors.cServerErrors;
        this.f38807S0 = 0;
        this.f38805R0 = 200;
        int resourceId = R.drawable.exo_styled_controls_play;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC11854i0.f38682d, 0, 0);
            try {
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(41, R.drawable.exo_styled_controls_vr);
                this.f38803Q0 = typedArrayObtainStyledAttributes.getInt(32, this.f38803Q0);
                this.f38807S0 = typedArrayObtainStyledAttributes.getInt(19, this.f38807S0);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z28 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z29 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                i15 = resourceId10;
                boolean z34 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z35 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.f38805R0));
                boolean z36 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i28 = resourceId5;
                i29 = resourceId6;
                i35 = resourceId15;
                z18 = z27;
                i24 = resourceId12;
                z14 = z34;
                i18 = resourceId9;
                z4 = z36;
                i14 = resourceId2;
                i13 = resourceId17;
                z17 = z26;
                i25 = resourceId13;
                z15 = z29;
                i16 = resourceId3;
                i17 = resourceId8;
                i27 = resourceId4;
                i34 = resourceId7;
                i36 = resourceId16;
                z19 = z25;
                i26 = resourceId14;
                z16 = z28;
                i19 = resourceId11;
                z13 = z35;
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        } else {
            i13 = R.drawable.exo_styled_controls_vr;
            i14 = R.layout.exo_player_control_view;
            i15 = R.drawable.exo_styled_controls_repeat_off;
            i16 = R.drawable.exo_styled_controls_pause;
            i17 = R.drawable.exo_styled_controls_fullscreen_exit;
            i18 = R.drawable.exo_styled_controls_fullscreen_enter;
            i19 = R.drawable.exo_styled_controls_repeat_one;
            i24 = R.drawable.exo_styled_controls_repeat_all;
            i25 = R.drawable.exo_styled_controls_shuffle_on;
            i26 = R.drawable.exo_styled_controls_shuffle_off;
            z4 = true;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = true;
            z17 = true;
            i27 = R.drawable.exo_styled_controls_next;
            i28 = R.drawable.exo_styled_controls_simple_fastforward;
            i29 = R.drawable.exo_styled_controls_previous;
            i34 = R.drawable.exo_styled_controls_simple_rewind;
            i35 = R.drawable.exo_styled_controls_subtitle_on;
            i36 = R.drawable.exo_styled_controls_subtitle_off;
            z18 = true;
            z19 = true;
        }
        int i37 = resourceId;
        LayoutInflater.from(context).inflate(i14, this);
        setDescendantFocusability(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
        ViewOnClickListenerC11861m viewOnClickListenerC11861m = new ViewOnClickListenerC11861m(this);
        this.f38844y = viewOnClickListenerC11861m;
        this.f38846z = new CopyOnWriteArrayList();
        this.f38828k0 = new C34605m0();
        this.f38829l0 = new C34607n0();
        StringBuilder sb4 = new StringBuilder();
        this.f38826i0 = sb4;
        int i38 = i17;
        int i39 = i16;
        this.f38827j0 = new Formatter(sb4, Locale.getDefault());
        this.f38809T0 = new long[0];
        this.f38811U0 = new boolean[0];
        this.f38813V0 = new long[0];
        this.f38815W0 = new boolean[0];
        this.f38830m0 = new RunnableC1319m(this, 21);
        this.f38823f0 = (TextView) findViewById(R.id.exo_duration);
        this.f38824g0 = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f38814W = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC11861m);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f38818a0 = imageView2;
        ViewOnClickListenerC2558k3 viewOnClickListenerC2558k3 = new ViewOnClickListenerC2558k3(this, 3);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC2558k3);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f38819b0 = imageView3;
        ViewOnClickListenerC2558k3 viewOnClickListenerC2558k4 = new ViewOnClickListenerC2558k3(this, 3);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC2558k4);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f38820c0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC11861m);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f38821d0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC11861m);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f38822e0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC11861m);
        }
        InterfaceC11872r0 interfaceC11872r0 = (InterfaceC11872r0) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC11872r0 != null) {
            this.f38825h0 = interfaceC11872r0;
        } else if (viewFindViewById4 != null) {
            C11847f c11847f = new C11847f(context, attributeSet, R.style.ExoStyledControls_TimeBar);
            c11847f.setId(R.id.exo_progress);
            c11847f.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c11847f, iIndexOfChild);
            this.f38825h0 = c11847f;
        } else {
            this.f38825h0 = null;
        }
        InterfaceC11872r0 interfaceC11872r1 = this.f38825h0;
        if (interfaceC11872r1 != null) {
            ((C11847f) interfaceC11872r1).f38651a0.add(viewOnClickListenerC11861m);
        }
        Resources resources = context.getResources();
        this.f38842x = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f38798O = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(viewOnClickListenerC11861m);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.f38794M = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i29, context.getTheme()));
            imageView5.setOnClickListener(viewOnClickListenerC11861m);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.f38796N = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i27, context.getTheme()));
            imageView6.setOnClickListener(viewOnClickListenerC11861m);
        }
        Typeface typefaceM109098b = AbstractC34523k.m109098b(context, R.font.roboto_medium_numbers);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i34, context.getTheme()));
            this.f38802Q = imageView7;
            this.f38806S = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceM109098b);
            this.f38806S = textView;
            this.f38802Q = textView;
        } else {
            this.f38806S = null;
            this.f38802Q = null;
        }
        View view = this.f38802Q;
        if (view != null) {
            view.setOnClickListener(viewOnClickListenerC11861m);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i28, context.getTheme()));
            this.f38800P = imageView8;
            this.f38804R = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM109098b);
            this.f38804R = textView2;
            this.f38800P = textView2;
        } else {
            this.f38804R = null;
            this.f38800P = null;
        }
        View view2 = this.f38800P;
        if (view2 != null) {
            view2.setOnClickListener(viewOnClickListenerC11861m);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f38808T = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(viewOnClickListenerC11861m);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f38810U = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(viewOnClickListenerC11861m);
        }
        this.f38843x0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f38845y0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.f38812V = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
            m31855j(imageView11, false);
        }
        C11842c0 c11842c0 = new C11842c0(this);
        this.f38840w = c11842c0;
        c11842c0.f38615w = z4;
        C11871r c11871r = new C11871r(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f38780F = c11871r;
        this.f38792L = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f38778E = recyclerView;
        recyclerView.setAdapter(c11871r);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f38790K = popupWindow;
        if (AbstractC38065t.f163031a < 23) {
            z24 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z24 = false;
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC11861m);
        this.f38817Y0 = true;
        this.f38788J = new C11849g(getResources(), 0);
        this.f38775B0 = resources.getDrawable(i35, context.getTheme());
        this.f38776C0 = resources.getDrawable(i36, context.getTheme());
        this.f38777D0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f38779E0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f38784H = new C11859l(this, 1);
        this.f38786I = new C11859l(this, 0);
        this.f38782G = new C11865o(this, resources.getStringArray(R.array.exo_controls_playback_speeds), f38773Z0, 0);
        this.f38831n0 = resources.getDrawable(i37, context.getTheme());
        this.f38832o0 = resources.getDrawable(i39, context.getTheme());
        this.f38781F0 = resources.getDrawable(i38, context.getTheme());
        this.f38783G0 = resources.getDrawable(i18, context.getTheme());
        this.f38833p0 = resources.getDrawable(i15, context.getTheme());
        this.f38834q0 = resources.getDrawable(i19, context.getTheme());
        this.f38835r0 = resources.getDrawable(i24, context.getTheme());
        this.f38839v0 = resources.getDrawable(i25, context.getTheme());
        this.f38841w0 = resources.getDrawable(i26, context.getTheme());
        this.f38785H0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f38787I0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f38836s0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f38837t0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f38838u0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f38847z0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f38774A0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        c11842c0.m31795j((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        c11842c0.m31795j(this.f38800P, z17);
        c11842c0.m31795j(this.f38802Q, z19);
        c11842c0.m31795j(imageView5, z18);
        c11842c0.m31795j(imageView6, z16);
        c11842c0.m31795j(imageView10, z15);
        c11842c0.m31795j(imageView, z14);
        c11842c0.m31795j(imageView11, z13);
        c11842c0.m31795j(imageView9, this.f38807S0 != 0 ? true : z24);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC11857k(this, 0));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m31847b(InterfaceC34599j0 interfaceC34599j0, C34607n0 c34607n0) {
        AbstractC34609o0 abstractC34609o0M8104c0;
        int iMo8139o;
        AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
        if (!abstractC0152a.m367A(17) || (iMo8139o = (abstractC34609o0M8104c0 = ((C2830f0) abstractC0152a).m8104c0()).mo8139o()) <= 1 || iMo8139o > 100) {
            return false;
        }
        for (int i13 = 0; i13 < iMo8139o; i13++) {
            if (abstractC34609o0M8104c0.mo8129m(i13, c34607n0, 0L).f145713m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f13) {
        InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
        if (interfaceC34599j0 == null || !((AbstractC0152a) interfaceC34599j0).m367A(13)) {
            return;
        }
        C2830f0 c2830f0 = (C2830f0) this.f38789J0;
        c2830f0.m8080A0(new C34589e0(f13, c2830f0.m8109h0().f145649b));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31848c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
        if (interfaceC34599j0 == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (((C2830f0) interfaceC34599j0).m8110i0() == 4) {
                return true;
            }
            AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
            if (!abstractC0152a.m367A(12)) {
                return true;
            }
            abstractC0152a.m373G();
            return true;
        }
        if (keyCode == 89) {
            AbstractC0152a abstractC0152a2 = (AbstractC0152a) interfaceC34599j0;
            if (abstractC0152a2.m367A(11)) {
                abstractC0152a2.m372F();
                return true;
            }
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            if (AbstractC38065t.m121905S(interfaceC34599j0, this.f38797N0)) {
                AbstractC38065t.m121889C(interfaceC34599j0);
                return true;
            }
            AbstractC38065t.m121888B(interfaceC34599j0);
            return true;
        }
        if (keyCode == 87) {
            AbstractC0152a abstractC0152a3 = (AbstractC0152a) interfaceC34599j0;
            if (!abstractC0152a3.m367A(9)) {
                return true;
            }
            abstractC0152a3.m376J();
            return true;
        }
        if (keyCode == 88) {
            AbstractC0152a abstractC0152a4 = (AbstractC0152a) interfaceC34599j0;
            if (!abstractC0152a4.m367A(7)) {
                return true;
            }
            abstractC0152a4.m379M();
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

    /* JADX INFO: renamed from: d */
    public final void m31849d(AbstractC1692i1 abstractC1692i1, View view) {
        this.f38778E.setAdapter(abstractC1692i1);
        m31862q();
        this.f38817Y0 = false;
        PopupWindow popupWindow = this.f38790K;
        popupWindow.dismiss();
        this.f38817Y0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i13 = this.f38792L;
        popupWindow.showAsDropDown(view, width - i13, (-popupWindow.getHeight()) - i13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m31848c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public final C41060w0 m31850e(C34623v0 c34623v0, int i13) {
        AbstractC41047q.m133273c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        AbstractC41023g0 abstractC41023g0 = c34623v0.f145864a;
        int i14 = 0;
        for (int i15 = 0; i15 < abstractC41023g0.size(); i15++) {
            C34621u0 c34621u0 = (C34621u0) abstractC41023g0.get(i15);
            if (c34621u0.f145858b.f145798c == i13) {
                for (int i16 = 0; i16 < c34621u0.f145857a; i16++) {
                    if (c34621u0.m109416a(i16)) {
                        C34610p c34610p = c34621u0.f145858b.f145799d[i16];
                        if ((c34610p.f145774e & 2) == 0) {
                            C11875t c11875t = new C11875t(c34623v0, i15, i16, this.f38788J.m31808e(c34610p));
                            int i17 = i14 + 1;
                            int iM133221e = AbstractC41005a0.m133221e(objArrCopyOf.length, i17);
                            if (iM133221e > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM133221e);
                            }
                            objArrCopyOf[i14] = c11875t;
                            i14 = i17;
                        }
                    }
                }
            }
        }
        return AbstractC41023g0.m133250j(i14, objArrCopyOf);
    }

    /* JADX INFO: renamed from: f */
    public final void m31851f() {
        C11842c0 c11842c0 = this.f38840w;
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
    public final boolean m31852g() {
        C11842c0 c11842c0 = this.f38840w;
        return c11842c0.f38612t == 0 && ((C11882x) c11842c0.f38616x).m31853h();
    }

    public InterfaceC34599j0 getPlayer() {
        return this.f38789J0;
    }

    public int getRepeatToggleModes() {
        return this.f38807S0;
    }

    public boolean getShowShuffleButton() {
        return this.f38840w.m31791b(this.f38810U);
    }

    public boolean getShowSubtitleButton() {
        return this.f38840w.m31791b(this.f38814W);
    }

    public int getShowTimeoutMs() {
        return this.f38803Q0;
    }

    public boolean getShowVrButton() {
        return this.f38840w.m31791b(this.f38812V);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m31853h() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m31854i() {
        m31858m();
        m31857l();
        m31861p();
        m31863r();
        m31865t();
        m31859n();
        m31864s();
    }

    /* JADX INFO: renamed from: j */
    public final void m31855j(View view, boolean z4) {
        if (view == null) {
            return;
        }
        view.setEnabled(z4);
        view.setAlpha(z4 ? this.f38843x0 : this.f38845y0);
    }

    /* JADX INFO: renamed from: k */
    public final void m31856k(boolean z4) {
        if (this.f38791K0 == z4) {
            return;
        }
        this.f38791K0 = z4;
        String str = this.f38787I0;
        Drawable drawable = this.f38783G0;
        String str2 = this.f38785H0;
        Drawable drawable2 = this.f38781F0;
        ImageView imageView = this.f38818a0;
        if (imageView != null) {
            if (z4) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.f38819b0;
        if (imageView2 == null) {
            return;
        }
        if (z4) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m31857l() {
        boolean zM367A;
        boolean zM367A2;
        boolean zM367A3;
        boolean zM367A4;
        boolean zM367A5;
        long j7;
        long j13;
        if (m31853h() && this.f38793L0) {
            InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
            if (interfaceC34599j0 != null) {
                zM367A = (this.f38795M0 && m31847b(interfaceC34599j0, this.f38829l0)) ? ((AbstractC0152a) interfaceC34599j0).m367A(10) : ((AbstractC0152a) interfaceC34599j0).m367A(5);
                AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
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
            Resources resources = this.f38842x;
            View view = this.f38802Q;
            if (zM367A4) {
                InterfaceC34599j0 interfaceC34599j1 = this.f38789J0;
                if (interfaceC34599j1 != null) {
                    C2830f0 c2830f0 = (C2830f0) interfaceC34599j1;
                    c2830f0.m8091L0();
                    j13 = c2830f0.f11127W;
                } else {
                    j13 = 5000;
                }
                int i13 = (int) (j13 / 1000);
                TextView textView = this.f38806S;
                if (textView != null) {
                    textView.setText(String.valueOf(i13));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i13, Integer.valueOf(i13)));
                }
            }
            View view2 = this.f38800P;
            if (zM367A5) {
                InterfaceC34599j0 interfaceC34599j2 = this.f38789J0;
                if (interfaceC34599j2 != null) {
                    C2830f0 c2830f1 = (C2830f0) interfaceC34599j2;
                    c2830f1.m8091L0();
                    j7 = c2830f1.f11128X;
                } else {
                    j7 = 15000;
                }
                int i14 = (int) (j7 / 1000);
                TextView textView2 = this.f38804R;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i14));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i14, Integer.valueOf(i14)));
                }
            }
            m31855j(this.f38794M, zM367A3);
            m31855j(view, zM367A4);
            m31855j(view2, zM367A5);
            m31855j(this.f38796N, zM367A2);
            InterfaceC11872r0 interfaceC11872r0 = this.f38825h0;
            if (interfaceC11872r0 != null) {
                ((C11847f) interfaceC11872r0).setEnabled(zM367A);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX INFO: renamed from: m */
    public final void m31858m() {
        ImageView imageView;
        boolean z4;
        if (m31853h() && this.f38793L0 && (imageView = this.f38798O) != null) {
            boolean zM121905S = AbstractC38065t.m121905S(this.f38789J0, this.f38797N0);
            Drawable drawable = zM121905S ? this.f38831n0 : this.f38832o0;
            int i13 = zM121905S ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f38842x.getString(i13));
            InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
            if (interfaceC34599j0 != null) {
                AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
                z4 = true;
                if (!abstractC0152a.m367A(1) || (abstractC0152a.m367A(17) && ((C2830f0) interfaceC34599j0).m8104c0().m109408p())) {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            m31855j(imageView, z4);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m31859n() {
        C11865o c11865o;
        InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
        if (interfaceC34599j0 == null) {
            return;
        }
        float f13 = ((C2830f0) interfaceC34599j0).m8109h0().f145648a;
        float f14 = Float.MAX_VALUE;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            c11865o = this.f38782G;
            float[] fArr = c11865o.f38703c;
            if (i13 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f13 - fArr[i13]);
            if (fAbs < f14) {
                i14 = i13;
                f14 = fAbs;
            }
            i13++;
        }
        c11865o.f38704d = i14;
        String str = c11865o.f38702b[i14];
        C11871r c11871r = this.f38780F;
        c11871r.f38748c[0] = str;
        m31855j(this.f38820c0, c11871r.m31841a(1) || c11871r.m31841a(0));
    }

    /* JADX INFO: renamed from: o */
    public final void m31860o() {
        long jM8098W;
        long jM8097V;
        if (m31853h() && this.f38793L0) {
            InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
            if (interfaceC34599j0 == null || !((AbstractC0152a) interfaceC34599j0).m367A(16)) {
                jM8098W = 0;
                jM8097V = 0;
            } else {
                long j7 = this.f38816X0;
                C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
                c2830f0.m8091L0();
                jM8098W = c2830f0.m8098W(c2830f0.f11111I0) + j7;
                jM8097V = c2830f0.m8097V() + this.f38816X0;
            }
            TextView textView = this.f38824g0;
            if (textView != null && !this.f38801P0) {
                textView.setText(AbstractC38065t.m121932y(this.f38826i0, this.f38827j0, jM8098W));
            }
            InterfaceC11872r0 interfaceC11872r0 = this.f38825h0;
            if (interfaceC11872r0 != null) {
                C11847f c11847f = (C11847f) interfaceC11872r0;
                c11847f.setPosition(jM8098W);
                c11847f.setBufferedPosition(jM8097V);
            }
            RunnableC1319m runnableC1319m = this.f38830m0;
            removeCallbacks(runnableC1319m);
            int iM8110i0 = interfaceC34599j0 == null ? 1 : ((C2830f0) interfaceC34599j0).m8110i0();
            if (interfaceC34599j0 != null) {
                C2830f0 c2830f1 = (C2830f0) ((AbstractC0152a) interfaceC34599j0);
                if (c2830f1.m8110i0() == 3 && c2830f1.m8108g0()) {
                    c2830f1.m8091L0();
                    if (c2830f1.f11111I0.f11058n == 0) {
                        long jMin = Math.min(interfaceC11872r0 != null ? ((C11847f) interfaceC11872r0).getPreferredUpdateDelay() : 1000L, 1000 - (jM8098W % 1000));
                        float f13 = ((C2830f0) interfaceC34599j0).m8109h0().f145648a;
                        postDelayed(runnableC1319m, AbstractC38065t.m121915h(f13 > 0.0f ? (long) (jMin / f13) : 1000L, this.f38805R0, 1000L));
                        return;
                    }
                }
            }
            if (iM8110i0 == 4 || iM8110i0 == 1) {
                return;
            }
            postDelayed(runnableC1319m, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11842c0 c11842c0 = this.f38840w;
        ((C11882x) c11842c0.f38616x).addOnLayoutChangeListener((ViewOnLayoutChangeListenerC11857k) c11842c0.f38592D);
        this.f38793L0 = true;
        if (m31852g()) {
            c11842c0.m31794i();
        }
        m31854i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11842c0 c11842c0 = this.f38840w;
        ((C11882x) c11842c0.f38616x).removeOnLayoutChangeListener((ViewOnLayoutChangeListenerC11857k) c11842c0.f38592D);
        this.f38793L0 = false;
        removeCallbacks(this.f38830m0);
        c11842c0.m31793h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        View view = this.f38840w.f38594b;
        if (view != null) {
            view.layout(0, 0, i15 - i13, i16 - i14);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m31861p() {
        ImageView imageView;
        if (m31853h() && this.f38793L0 && (imageView = this.f38808T) != null) {
            if (this.f38807S0 == 0) {
                m31855j(imageView, false);
                return;
            }
            InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
            String str = this.f38836s0;
            Drawable drawable = this.f38833p0;
            if (interfaceC34599j0 == null || !((AbstractC0152a) interfaceC34599j0).m367A(15)) {
                m31855j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m31855j(imageView, true);
            C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
            c2830f0.m8091L0();
            int i13 = c2830f0.f11138h0;
            if (i13 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i13 == 1) {
                imageView.setImageDrawable(this.f38834q0);
                imageView.setContentDescription(this.f38837t0);
            } else {
                if (i13 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f38835r0);
                imageView.setContentDescription(this.f38838u0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m31862q() {
        RecyclerView recyclerView = this.f38778E;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i13 = this.f38792L;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i13 * 2));
        PopupWindow popupWindow = this.f38790K;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i13 * 2), recyclerView.getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: r */
    public final void m31863r() {
        ImageView imageView;
        if (m31853h() && this.f38793L0 && (imageView = this.f38810U) != null) {
            InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
            if (!this.f38840w.m31791b(imageView)) {
                m31855j(imageView, false);
                return;
            }
            String str = this.f38774A0;
            Drawable drawable = this.f38841w0;
            if (interfaceC34599j0 == null || !((AbstractC0152a) interfaceC34599j0).m367A(14)) {
                m31855j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m31855j(imageView, true);
            C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
            c2830f0.m8091L0();
            if (c2830f0.f11139i0) {
                drawable = this.f38839v0;
            }
            imageView.setImageDrawable(drawable);
            c2830f0.m8091L0();
            if (c2830f0.f11139i0) {
                str = this.f38847z0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r4v18, types: [u8.b] */
    /* JADX WARN: Type inference failed for: r7v3, types: [u8.m0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [u8.o0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
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
    /* JADX INFO: renamed from: s */
    public final void m31864s() {
        boolean z4;
        long jM121896J;
        int i13;
        boolean z13;
        boolean[] zArr;
        boolean z14;
        InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
        if (interfaceC34599j0 == null) {
            return;
        }
        boolean z15 = this.f38795M0;
        C34607n0 c34607n0 = this.f38829l0;
        boolean z16 = false;
        boolean z17 = true;
        this.f38799O0 = z15 && m31847b(interfaceC34599j0, c34607n0);
        long j7 = 0;
        this.f38816X0 = 0L;
        AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
        ?? M8104c0 = abstractC0152a.m367A(17) ? ((C2830f0) interfaceC34599j0).m8104c0() : AbstractC34609o0.f145755a;
        long j13 = -9223372036854775807L;
        if (M8104c0.m109408p()) {
            z4 = true;
            if (abstractC0152a.m367A(16)) {
                long jM399x = abstractC0152a.m399x();
                if (jM399x != -9223372036854775807L) {
                    jM121896J = AbstractC38065t.m121896J(jM399x);
                } else {
                    jM121896J = 0;
                }
            } else {
                jM121896J = 0;
            }
            i13 = 0;
        } else {
            int iM8101Z = ((C2830f0) interfaceC34599j0).m8101Z();
            boolean z18 = this.f38799O0;
            int i14 = z18 ? 0 : iM8101Z;
            int iMo8139o = z18 ? M8104c0.mo8139o() - 1 : iM8101Z;
            i13 = 0;
            long j14 = 0;
            while (i14 <= iMo8139o) {
                long j15 = j7;
                if (i14 == iM8101Z) {
                    this.f38816X0 = AbstractC38065t.m121907U(j14);
                }
                M8104c0.m109407n(i14, c34607n0);
                if (c34607n0.f145713m == j13) {
                    AbstractC35849g.m113807i(this.f38799O0 ^ z17);
                    break;
                }
                int i15 = c34607n0.f145714n;
                while (i15 <= c34607n0.f145715o) {
                    ?? r10 = this.f38828k0;
                    M8104c0.mo8128f(i15, r10, z16);
                    long j16 = j13;
                    C34582b c34582b = r10.f145697g;
                    c34582b.getClass();
                    int i16 = c34582b.f145638a;
                    for (?? r14 = z16; r14 < i16; r14++) {
                        r10.m109395d(r14);
                        long j17 = r10.f145695e;
                        if (j17 >= j15) {
                            long[] jArr = this.f38809T0;
                            if (i13 == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f38809T0 = Arrays.copyOf(jArr, length);
                                this.f38811U0 = Arrays.copyOf(this.f38811U0, length);
                            }
                            this.f38809T0[i13] = AbstractC38065t.m121907U(j17 + j14);
                            boolean[] zArr2 = this.f38811U0;
                            C34580a c34580aM109363a = r10.f145697g.m109363a(r14);
                            int i17 = c34580aM109363a.f145601a;
                            if (i17 != -1) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= i17) {
                                        zArr = zArr2;
                                        z13 = true;
                                        z14 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i19 = c34580aM109363a.f145605e[i18];
                                    if (i19 != 0) {
                                        C34580a c34580a = c34580aM109363a;
                                        z13 = true;
                                        if (i19 != 1) {
                                            i18++;
                                            zArr2 = zArr;
                                            c34580aM109363a = c34580a;
                                        }
                                    } else {
                                        z13 = true;
                                    }
                                    z14 = z13;
                                    break;
                                }
                            }
                            zArr = zArr2;
                            z13 = true;
                            z14 = true;
                            zArr[i13] = !z14;
                            i13++;
                        } else {
                            z13 = true;
                        }
                        z17 = z13;
                        iM8101Z = iM8101Z;
                        j15 = 0;
                    }
                    i15++;
                    j13 = j16;
                    z16 = false;
                    j15 = 0;
                }
                j14 += c34607n0.f145713m;
                i14++;
                z17 = z17;
                z16 = false;
                j7 = 0;
            }
            z4 = z17;
            jM121896J = j14;
        }
        long jM121907U = AbstractC38065t.m121907U(jM121896J);
        TextView textView = this.f38823f0;
        if (textView != null) {
            textView.setText(AbstractC38065t.m121932y(this.f38826i0, this.f38827j0, jM121907U));
        }
        InterfaceC11872r0 interfaceC11872r0 = this.f38825h0;
        if (interfaceC11872r0 != null) {
            C11847f c11847f = (C11847f) interfaceC11872r0;
            c11847f.setDuration(jM121907U);
            long[] jArr2 = this.f38813V0;
            int length2 = jArr2.length;
            int i24 = i13 + length2;
            long[] jArr3 = this.f38809T0;
            if (i24 > jArr3.length) {
                this.f38809T0 = Arrays.copyOf(jArr3, i24);
                this.f38811U0 = Arrays.copyOf(this.f38811U0, i24);
            }
            System.arraycopy(jArr2, 0, this.f38809T0, i13, length2);
            System.arraycopy(this.f38815W0, 0, this.f38811U0, i13, length2);
            long[] jArr4 = this.f38809T0;
            boolean[] zArr3 = this.f38811U0;
            if (i24 != 0 && (jArr4 == null || zArr3 == null)) {
                z4 = false;
            }
            AbstractC35849g.m113802d(z4);
            c11847f.f38666p0 = i24;
            c11847f.f38667q0 = jArr4;
            c11847f.f38668r0 = zArr3;
            c11847f.m31802e();
        }
        m31860o();
    }

    public void setAnimationEnabled(boolean z4) {
        this.f38840w.f38615w = z4;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC11863n interfaceC11863n) {
        boolean z4 = interfaceC11863n != null;
        ImageView imageView = this.f38818a0;
        if (imageView != null) {
            if (z4) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z13 = interfaceC11863n != null;
        ImageView imageView2 = this.f38819b0;
        if (imageView2 == null) {
            return;
        }
        if (z13) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(InterfaceC34599j0 interfaceC34599j0) {
        AbstractC35849g.m113807i(Looper.myLooper() == Looper.getMainLooper());
        AbstractC35849g.m113802d(interfaceC34599j0 == null || ((C2830f0) interfaceC34599j0).f11125U == Looper.getMainLooper());
        InterfaceC34599j0 interfaceC34599j1 = this.f38789J0;
        if (interfaceC34599j1 == interfaceC34599j0) {
            return;
        }
        ViewOnClickListenerC11861m viewOnClickListenerC11861m = this.f38844y;
        if (interfaceC34599j1 != null) {
            ((C2830f0) interfaceC34599j1).m8118s0(viewOnClickListenerC11861m);
        }
        this.f38789J0 = interfaceC34599j0;
        if (interfaceC34599j0 != null) {
            ((C2830f0) interfaceC34599j0).m8092Q(viewOnClickListenerC11861m);
        }
        m31854i();
    }

    public void setProgressUpdateListener(InterfaceC11867p interfaceC11867p) {
    }

    public void setRepeatToggleModes(int i13) {
        this.f38807S0 = i13;
        InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
        if (interfaceC34599j0 != null && ((AbstractC0152a) interfaceC34599j0).m367A(15)) {
            C2830f0 c2830f0 = (C2830f0) this.f38789J0;
            c2830f0.m8091L0();
            int i14 = c2830f0.f11138h0;
            if (i13 == 0 && i14 != 0) {
                ((C2830f0) this.f38789J0).m8081B0(0);
            } else if (i13 == 1 && i14 == 2) {
                ((C2830f0) this.f38789J0).m8081B0(1);
            } else if (i13 == 2 && i14 == 1) {
                ((C2830f0) this.f38789J0).m8081B0(2);
            }
        }
        this.f38840w.m31795j(this.f38808T, i13 != 0);
        m31861p();
    }

    public void setShowFastForwardButton(boolean z4) {
        this.f38840w.m31795j(this.f38800P, z4);
        m31857l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z4) {
        this.f38795M0 = z4;
        m31864s();
    }

    public void setShowNextButton(boolean z4) {
        this.f38840w.m31795j(this.f38796N, z4);
        m31857l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z4) {
        this.f38797N0 = z4;
        m31858m();
    }

    public void setShowPreviousButton(boolean z4) {
        this.f38840w.m31795j(this.f38794M, z4);
        m31857l();
    }

    public void setShowRewindButton(boolean z4) {
        this.f38840w.m31795j(this.f38802Q, z4);
        m31857l();
    }

    public void setShowShuffleButton(boolean z4) {
        this.f38840w.m31795j(this.f38810U, z4);
        m31863r();
    }

    public void setShowSubtitleButton(boolean z4) {
        this.f38840w.m31795j(this.f38814W, z4);
    }

    public void setShowTimeoutMs(int i13) {
        this.f38803Q0 = i13;
        if (m31852g()) {
            this.f38840w.m31794i();
        }
    }

    public void setShowVrButton(boolean z4) {
        this.f38840w.m31795j(this.f38812V, z4);
    }

    public void setTimeBarMinUpdateInterval(int i13) {
        this.f38805R0 = AbstractC38065t.m121914g(i13, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f38812V;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            m31855j(imageView, onClickListener != null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m31865t() {
        C11859l c11859l = this.f38784H;
        c11859l.getClass();
        List list = Collections.EMPTY_LIST;
        c11859l.f38765b = list;
        C11859l c11859l2 = this.f38786I;
        c11859l2.getClass();
        c11859l2.f38765b = list;
        InterfaceC34599j0 interfaceC34599j0 = this.f38789J0;
        ImageView imageView = this.f38814W;
        if (interfaceC34599j0 != null && ((AbstractC0152a) interfaceC34599j0).m367A(30) && ((AbstractC0152a) this.f38789J0).m367A(29)) {
            C34623v0 c34623v0M8105d0 = ((C2830f0) this.f38789J0).m8105d0();
            C41060w0 c41060w0M31850e = m31850e(c34623v0M8105d0, 1);
            c11859l2.f38765b = c41060w0M31850e;
            C11882x c11882x = c11859l2.f38690e;
            InterfaceC34599j0 interfaceC34599j1 = c11882x.f38789J0;
            C11871r c11871r = c11882x.f38780F;
            interfaceC34599j1.getClass();
            C27670j c27670jM8111k0 = ((C2830f0) interfaceC34599j1).m8111k0();
            if (c41060w0M31850e.isEmpty()) {
                c11871r.f38748c[1] = c11882x.getResources().getString(R.string.exo_track_selection_none);
            } else if (c11859l2.m31837f(c27670jM8111k0)) {
                for (int i13 = 0; i13 < c41060w0M31850e.f177069z; i13++) {
                    C11875t c11875t = (C11875t) c41060w0M31850e.get(i13);
                    if (c11875t.f38753a.f145861e[c11875t.f38754b]) {
                        c11871r.f38748c[1] = c11875t.f38755c;
                        break;
                    }
                }
            } else {
                c11871r.f38748c[1] = c11882x.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.f38840w.m31791b(imageView)) {
                c11859l.m31838g(m31850e(c34623v0M8105d0, 3));
            } else {
                c11859l.m31838g(C41060w0.f177067E);
            }
        }
        m31855j(imageView, c11859l.getPageCount() > 0);
        C11871r c11871r2 = this.f38780F;
        m31855j(this.f38820c0, c11871r2.m31841a(1) || c11871r2.m31841a(0));
    }
}
