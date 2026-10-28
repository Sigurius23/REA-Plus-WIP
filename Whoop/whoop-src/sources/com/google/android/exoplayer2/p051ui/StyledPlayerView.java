package com.google.android.exoplayer2.p051ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jo.C21809a;
import jo.C21830s;
import jo.InterfaceC21811b;
import jo.InterfaceC21824m;
import jo.InterfaceC21829r;
import jo.ViewOnLayoutChangeListenerC21835x;
import live.hms.video.error.ErrorCodes;
import mo.C25737r;
import mo.InterfaceC25729j;
import no.C26880m;
import p004a2.AbstractC0152a;
import p087db.C11842c0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.InterfaceC24546d;
import p465rm.C31525d1;
import p465rm.C31561p1;
import p465rm.C31571u;
import p465rm.InterfaceC31519b1;
import p465rm.SurfaceHolderCallbackC31565r;
import p497t7.InterfaceC33561b;
import p690zr.AbstractC41023g0;

/* JADX INFO: loaded from: classes6.dex */
public class StyledPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ int f20400d0 = 0;

    /* JADX INFO: renamed from: E */
    public final boolean f20401E;

    /* JADX INFO: renamed from: F */
    public final ImageView f20402F;

    /* JADX INFO: renamed from: G */
    public final SubtitleView f20403G;

    /* JADX INFO: renamed from: H */
    public final View f20404H;

    /* JADX INFO: renamed from: I */
    public final TextView f20405I;

    /* JADX INFO: renamed from: J */
    public final C21830s f20406J;

    /* JADX INFO: renamed from: K */
    public final FrameLayout f20407K;

    /* JADX INFO: renamed from: L */
    public final FrameLayout f20408L;

    /* JADX INFO: renamed from: M */
    public InterfaceC31519b1 f20409M;

    /* JADX INFO: renamed from: N */
    public boolean f20410N;

    /* JADX INFO: renamed from: O */
    public InterfaceC21829r f20411O;

    /* JADX INFO: renamed from: P */
    public boolean f20412P;

    /* JADX INFO: renamed from: Q */
    public Drawable f20413Q;

    /* JADX INFO: renamed from: R */
    public int f20414R;

    /* JADX INFO: renamed from: S */
    public boolean f20415S;

    /* JADX INFO: renamed from: T */
    public CharSequence f20416T;

    /* JADX INFO: renamed from: U */
    public int f20417U;

    /* JADX INFO: renamed from: V */
    public boolean f20418V;

    /* JADX INFO: renamed from: W */
    public boolean f20419W;

    /* JADX INFO: renamed from: a0 */
    public boolean f20420a0;

    /* JADX INFO: renamed from: b0 */
    public int f20421b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f20422c0;

    /* JADX INFO: renamed from: w */
    public final ViewOnLayoutChangeListenerC21835x f20423w;

    /* JADX INFO: renamed from: x */
    public final AspectRatioFrameLayout f20424x;

    /* JADX INFO: renamed from: y */
    public final View f20425y;

    /* JADX INFO: renamed from: z */
    public final View f20426z;

    public StyledPlayerView(Context context) {
        super(context, null, 0);
        ViewOnLayoutChangeListenerC21835x viewOnLayoutChangeListenerC21835x = new ViewOnLayoutChangeListenerC21835x(this);
        this.f20423w = viewOnLayoutChangeListenerC21835x;
        if (isInEditMode()) {
            this.f20424x = null;
            this.f20425y = null;
            this.f20426z = null;
            this.f20401E = false;
            this.f20402F = null;
            this.f20403G = null;
            this.f20404H = null;
            this.f20405I = null;
            this.f20406J = null;
            this.f20407K = null;
            this.f20408L = null;
            ImageView imageView = new ImageView(context);
            if (AbstractC24567y.f95875a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(2131231748, null));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(2131231748));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_styled_player_view, this);
        setDescendantFocusability(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f20424x = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.f20425y = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            this.f20426z = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(viewOnLayoutChangeListenerC21835x);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.f20426z = null;
        }
        this.f20401E = false;
        this.f20407K = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f20408L = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f20402F = imageView2;
        this.f20412P = imageView2 != null;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f20403G = subtitleView;
        if (subtitleView != null) {
            subtitleView.m15579d();
            subtitleView.m15580h();
        }
        View viewFindViewById = findViewById(R.id.exo_buffering);
        this.f20404H = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.f20414R = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f20405I = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C21830s c21830s = (C21830s) findViewById(R.id.exo_controller);
        View viewFindViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (c21830s != null) {
            this.f20406J = c21830s;
        } else if (viewFindViewById2 != null) {
            C21830s c21830s2 = new C21830s(context);
            this.f20406J = c21830s2;
            c21830s2.setId(R.id.exo_controller);
            c21830s2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(c21830s2, iIndexOfChild);
        } else {
            this.f20406J = null;
        }
        C21830s c21830s3 = this.f20406J;
        this.f20417U = c21830s3 != null ? ErrorCodes.WebsocketMethodErrors.cServerErrors : 0;
        this.f20420a0 = true;
        this.f20418V = true;
        this.f20419W = true;
        this.f20410N = c21830s3 != null;
        if (c21830s3 != null) {
            C11842c0 c11842c0 = c21830s3.f84165G0;
            int i13 = c11842c0.f38612t;
            if (i13 != 3 && i13 != 2) {
                c11842c0.m31793h();
                c11842c0.m31796k(2);
            }
            this.f20406J.f84222x.add(viewOnLayoutChangeListenerC21835x);
        }
        m15575j();
    }

    /* JADX INFO: renamed from: a */
    public static void m15566a(TextureView textureView, int i13) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i13 != 0) {
            float f13 = width / 2.0f;
            float f14 = height / 2.0f;
            matrix.postRotate(i13, f13, f14);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f13, f14);
        }
        textureView.setTransform(matrix);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15567b() {
        InterfaceC31519b1 interfaceC31519b1 = this.f20409M;
        return interfaceC31519b1 != null && ((C31571u) interfaceC31519b1).m97214i0() && ((C31571u) this.f20409M).m97211d0();
    }

    /* JADX INFO: renamed from: c */
    public final void m15568c(boolean z4) {
        if (!(m15567b() && this.f20419W) && m15578m()) {
            C21830s c21830s = this.f20406J;
            boolean z13 = c21830s.m61762g() && c21830s.getShowTimeoutMs() <= 0;
            boolean zM15570e = m15570e();
            if (z4 || z13 || zM15570e) {
                m15571f(zM15570e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15569d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f13 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f20424x;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f13);
                }
                ImageView imageView = this.f20402F;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC31519b1 interfaceC31519b1 = this.f20409M;
        if (interfaceC31519b1 != null && ((C31571u) interfaceC31519b1).m97214i0()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z4 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C21830s c21830s = this.f20406J;
        if (z4 && m15578m() && !c21830s.m61762g()) {
            m15568c(true);
            return true;
        }
        if ((m15578m() && c21830s.m61758c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m15568c(true);
            return true;
        }
        if (z4 && m15578m()) {
            m15568c(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15570e() {
        InterfaceC31519b1 interfaceC31519b1 = this.f20409M;
        if (interfaceC31519b1 == null) {
            return true;
        }
        int iM97212e0 = ((C31571u) interfaceC31519b1).m97212e0();
        if (!this.f20418V || ((C31571u) this.f20409M).m97209b0().m97175p()) {
            return false;
        }
        if (iM97212e0 != 1 && iM97212e0 != 4) {
            InterfaceC31519b1 interfaceC31519b2 = this.f20409M;
            interfaceC31519b2.getClass();
            if (((C31571u) interfaceC31519b2).m97211d0()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m15571f(boolean z4) {
        if (m15578m()) {
            int i13 = z4 ? 0 : this.f20417U;
            C21830s c21830s = this.f20406J;
            c21830s.setShowTimeoutMs(i13);
            C11842c0 c11842c0 = c21830s.f84165G0;
            C21830s c21830s2 = (C21830s) c11842c0.f38616x;
            if (!c21830s2.m61763h()) {
                c21830s2.setVisibility(0);
                c21830s2.m61764i();
                View view = c21830s2.f84160E;
                if (view != null) {
                    view.requestFocus();
                }
            }
            c11842c0.m31797n();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15572g() {
        if (m15578m() && this.f20409M != null) {
            C21830s c21830s = this.f20406J;
            if (!c21830s.m61762g()) {
                m15568c(true);
                return true;
            }
            if (this.f20420a0) {
                c21830s.m61761f();
                return true;
            }
        }
        return false;
    }

    public List<C21809a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f20408L;
        if (frameLayout != null) {
            arrayList.add(new C21809a(frameLayout));
        }
        C21830s c21830s = this.f20406J;
        if (c21830s != null) {
            arrayList.add(new C21809a(c21830s));
        }
        return AbstractC41023g0.m133252m(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f20407K;
        AbstractC24543a.m71575k(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.f20418V;
    }

    public boolean getControllerHideOnTouch() {
        return this.f20420a0;
    }

    public int getControllerShowTimeoutMs() {
        return this.f20417U;
    }

    public Drawable getDefaultArtwork() {
        return this.f20413Q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f20408L;
    }

    public InterfaceC31519b1 getPlayer() {
        return this.f20409M;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f20424x;
        AbstractC24543a.m71574j(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f20403G;
    }

    public boolean getUseArtwork() {
        return this.f20412P;
    }

    public boolean getUseController() {
        return this.f20410N;
    }

    public View getVideoSurfaceView() {
        return this.f20426z;
    }

    /* JADX INFO: renamed from: h */
    public final void m15573h() {
        C25737r c25737r;
        InterfaceC31519b1 interfaceC31519b1 = this.f20409M;
        if (interfaceC31519b1 != null) {
            C31571u c31571u = (C31571u) interfaceC31519b1;
            c31571u.m97198B0();
            c25737r = c31571u.f130388I0;
        } else {
            c25737r = C25737r.f101428E;
        }
        int i13 = c25737r.f101429w;
        int i14 = c25737r.f101430x;
        int i15 = c25737r.f101431y;
        float f13 = (i14 == 0 || i13 == 0) ? 0.0f : (i13 * c25737r.f101432z) / i14;
        View view = this.f20426z;
        if (view instanceof TextureView) {
            if (f13 > 0.0f && (i15 == 90 || i15 == 270)) {
                f13 = 1.0f / f13;
            }
            int i16 = this.f20421b0;
            ViewOnLayoutChangeListenerC21835x viewOnLayoutChangeListenerC21835x = this.f20423w;
            if (i16 != 0) {
                view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC21835x);
            }
            this.f20421b0 = i15;
            if (i15 != 0) {
                view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC21835x);
            }
            m15566a((TextureView) view, this.f20421b0);
        }
        float f14 = this.f20401E ? 0.0f : f13;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f20424x;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX INFO: renamed from: i */
    public final void m15574i() {
        boolean z4;
        View view = this.f20404H;
        if (view != null) {
            InterfaceC31519b1 interfaceC31519b1 = this.f20409M;
            if (interfaceC31519b1 == null || ((C31571u) interfaceC31519b1).m97212e0() != 2) {
                z4 = false;
            } else {
                int i13 = this.f20414R;
                z4 = true;
                if (i13 != 2 && (i13 != 1 || !((C31571u) this.f20409M).m97211d0())) {
                    z4 = false;
                }
            }
            view.setVisibility(z4 ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15575j() {
        C21830s c21830s = this.f20406J;
        if (c21830s == null || !this.f20410N) {
            setContentDescription(null);
        } else if (c21830s.m61762g()) {
            setContentDescription(this.f20420a0 ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15576k() {
        TextView textView = this.f20405I;
        if (textView != null) {
            CharSequence charSequence = this.f20416T;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            InterfaceC31519b1 interfaceC31519b1 = this.f20409M;
            if (interfaceC31519b1 != null) {
                C31571u c31571u = (C31571u) interfaceC31519b1;
                c31571u.m97198B0();
                ExoPlaybackException exoPlaybackException = c31571u.f130392K0.f130446f;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15577l(boolean z4) {
        InterfaceC31519b1 interfaceC31519b1 = this.f20409M;
        View view = this.f20425y;
        ImageView imageView = this.f20402F;
        if (interfaceC31519b1 != null) {
            C31571u c31571u = (C31571u) interfaceC31519b1;
            c31571u.m97198B0();
            if (!c31571u.f130392K0.f130449i.f77584d.f130358w.isEmpty()) {
                if (z4 && !this.f20415S && view != null) {
                    view.setVisibility(0);
                }
                c31571u.m97198B0();
                AbstractC41023g0 abstractC41023g0 = c31571u.f130392K0.f130449i.f77584d.f130358w;
                boolean z13 = false;
                for (int i13 = 0; i13 < abstractC41023g0.size(); i13++) {
                    C31561p1 c31561p1 = (C31561p1) abstractC41023g0.get(i13);
                    for (boolean z14 : c31561p1.f130354z) {
                        if (z14) {
                            if (c31561p1.f130353y != 2) {
                                break;
                            }
                            z13 = true;
                            break;
                        }
                    }
                }
                if (z13) {
                    if (imageView != null) {
                        imageView.setImageResource(android.R.color.transparent);
                        imageView.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (view != null) {
                    view.setVisibility(0);
                }
                if (this.f20412P) {
                    AbstractC24543a.m71574j(imageView);
                    c31571u.m97198B0();
                    byte[] bArr = c31571u.f130425p0.f130254K;
                    if ((bArr != null ? m15569d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length))) : false) || m15569d(this.f20413Q)) {
                        return;
                    }
                }
                if (imageView != null) {
                    imageView.setImageResource(android.R.color.transparent);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (this.f20415S) {
            return;
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m15578m() {
        if (!this.f20410N) {
            return false;
        }
        AbstractC24543a.m71574j(this.f20406J);
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m15578m() && this.f20409M != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f20422c0 = true;
                return true;
            }
            if (action == 1 && this.f20422c0) {
                this.f20422c0 = false;
                return performClick();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m15578m() || this.f20409M == null) {
            return false;
        }
        m15568c(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return m15572g();
    }

    public void setAspectRatioListener(InterfaceC21811b interfaceC21811b) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f20424x;
        AbstractC24543a.m71574j(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC21811b);
    }

    public void setControllerAutoShow(boolean z4) {
        this.f20418V = z4;
    }

    public void setControllerHideDuringAds(boolean z4) {
        this.f20419W = z4;
    }

    public void setControllerHideOnTouch(boolean z4) {
        AbstractC24543a.m71574j(this.f20406J);
        this.f20420a0 = z4;
        m15575j();
    }

    public void setControllerOnFullScreenModeChangedListener(InterfaceC21824m interfaceC21824m) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        c21830s.setOnFullScreenModeChangedListener(interfaceC21824m);
    }

    public void setControllerShowTimeoutMs(int i13) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        this.f20417U = i13;
        if (c21830s.m61762g()) {
            m15571f(m15570e());
        }
    }

    public void setControllerVisibilityListener(InterfaceC21829r interfaceC21829r) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        CopyOnWriteArrayList copyOnWriteArrayList = c21830s.f84222x;
        InterfaceC21829r interfaceC21829r2 = this.f20411O;
        if (interfaceC21829r2 == interfaceC21829r) {
            return;
        }
        if (interfaceC21829r2 != null) {
            copyOnWriteArrayList.remove(interfaceC21829r2);
        }
        this.f20411O = interfaceC21829r;
        if (interfaceC21829r != null) {
            copyOnWriteArrayList.add(interfaceC21829r);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC24543a.m71573i(this.f20405I != null);
        this.f20416T = charSequence;
        m15576k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f20413Q != drawable) {
            this.f20413Q = drawable;
            m15577l(false);
        }
    }

    public void setErrorMessageProvider(InterfaceC24546d interfaceC24546d) {
        if (interfaceC24546d != null) {
            m15576k();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z4) {
        if (this.f20415S != z4) {
            this.f20415S = z4;
            m15577l(false);
        }
    }

    public void setPlayer(InterfaceC31519b1 interfaceC31519b1) {
        AbstractC24543a.m71573i(Looper.myLooper() == Looper.getMainLooper());
        AbstractC24543a.m71569e(interfaceC31519b1 == null || ((C31571u) interfaceC31519b1).f130403T == Looper.getMainLooper());
        InterfaceC31519b1 interfaceC31519b2 = this.f20409M;
        if (interfaceC31519b2 == interfaceC31519b1) {
            return;
        }
        View view = this.f20426z;
        ViewOnLayoutChangeListenerC21835x viewOnLayoutChangeListenerC21835x = this.f20423w;
        if (interfaceC31519b2 != null) {
            C31571u c31571u = (C31571u) interfaceC31519b2;
            c31571u.m97220o0(viewOnLayoutChangeListenerC21835x);
            if (view instanceof TextureView) {
                TextureView textureView = (TextureView) view;
                c31571u.m97198B0();
                if (textureView == c31571u.f130432w0) {
                    c31571u.m97201S();
                }
            } else if (view instanceof SurfaceView) {
                c31571u.m97198B0();
                SurfaceHolder holder = ((SurfaceView) view).getHolder();
                c31571u.m97198B0();
                if (holder != null && holder == c31571u.f130429t0) {
                    c31571u.m97201S();
                }
            }
        }
        SubtitleView subtitleView = this.f20403G;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f20409M = interfaceC31519b1;
        boolean zM15578m = m15578m();
        C21830s c21830s = this.f20406J;
        if (zM15578m) {
            c21830s.setPlayer(interfaceC31519b1);
        }
        m15574i();
        m15576k();
        m15577l(true);
        if (interfaceC31519b1 == null) {
            if (c21830s != null) {
                c21830s.m61761f();
                return;
            }
            return;
        }
        AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC31519b1;
        if (abstractC0152a.m367A(27)) {
            if (view instanceof TextureView) {
                TextureView textureView2 = (TextureView) view;
                C31571u c31571u2 = (C31571u) interfaceC31519b1;
                c31571u2.m97198B0();
                c31571u2.m97221p0();
                c31571u2.f130432w0 = textureView2;
                if (textureView2.getSurfaceTextureListener() != null) {
                    Log.w("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
                }
                textureView2.setSurfaceTextureListener(c31571u2.f130408Y);
                SurfaceTexture surfaceTexture = textureView2.isAvailable() ? textureView2.getSurfaceTexture() : null;
                if (surfaceTexture == null) {
                    c31571u2.m97228w0(null);
                    c31571u2.m97217l0(0, 0);
                } else {
                    Surface surface = new Surface(surfaceTexture);
                    c31571u2.m97228w0(surface);
                    c31571u2.f130428s0 = surface;
                    c31571u2.m97217l0(textureView2.getWidth(), textureView2.getHeight());
                }
            } else if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                C31571u c31571u3 = (C31571u) interfaceC31519b1;
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = c31571u3.f130408Y;
                c31571u3.m97198B0();
                if (surfaceView instanceof InterfaceC25729j) {
                    c31571u3.m97221p0();
                    c31571u3.m97228w0(surfaceView);
                    c31571u3.m97224s0(surfaceView.getHolder());
                } else if (surfaceView instanceof C26880m) {
                    c31571u3.m97221p0();
                    c31571u3.f130430u0 = (C26880m) surfaceView;
                    C31525d1 c31525d1M97202U = c31571u3.m97202U(c31571u3.f130409Z);
                    AbstractC24543a.m71573i(!c31525d1M97202U.f130122g);
                    c31525d1M97202U.f130119d = InterfaceC33561b.INVALID_OWNERSHIP;
                    C26880m c26880m = c31571u3.f130430u0;
                    AbstractC24543a.m71573i(true ^ c31525d1M97202U.f130122g);
                    c31525d1M97202U.f130120e = c26880m;
                    c31525d1M97202U.m97125c();
                    c31571u3.f130430u0.f107288w.add(surfaceHolderCallbackC31565r);
                    c31571u3.m97228w0(c31571u3.f130430u0.getVideoSurface());
                    c31571u3.m97224s0(surfaceView.getHolder());
                } else {
                    SurfaceHolder holder2 = surfaceView.getHolder();
                    c31571u3.m97198B0();
                    if (holder2 == null) {
                        c31571u3.m97201S();
                    } else {
                        c31571u3.m97221p0();
                        c31571u3.f130431v0 = true;
                        c31571u3.f130429t0 = holder2;
                        holder2.addCallback(surfaceHolderCallbackC31565r);
                        Surface surface2 = holder2.getSurface();
                        if (surface2 == null || !surface2.isValid()) {
                            c31571u3.m97228w0(null);
                            c31571u3.m97217l0(0, 0);
                        } else {
                            c31571u3.m97228w0(surface2);
                            Rect surfaceFrame = holder2.getSurfaceFrame();
                            c31571u3.m97217l0(surfaceFrame.width(), surfaceFrame.height());
                        }
                    }
                }
            }
            m15573h();
        }
        if (subtitleView != null && abstractC0152a.m367A(28)) {
            C31571u c31571u4 = (C31571u) interfaceC31519b1;
            c31571u4.m97198B0();
            subtitleView.setCues(c31571u4.f130380E0);
        }
        ((C31571u) interfaceC31519b1).m97199Q(viewOnLayoutChangeListenerC21835x);
        m15568c(false);
    }

    public void setRepeatToggleModes(int i13) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        c21830s.setRepeatToggleModes(i13);
    }

    public void setResizeMode(int i13) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f20424x;
        AbstractC24543a.m71574j(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i13);
    }

    public void setShowBuffering(int i13) {
        if (this.f20414R != i13) {
            this.f20414R = i13;
            m15574i();
        }
    }

    public void setShowFastForwardButton(boolean z4) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        c21830s.setShowFastForwardButton(z4);
    }

    public void setShowMultiWindowTimeBar(boolean z4) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        c21830s.setShowMultiWindowTimeBar(z4);
    }

    public void setShowNextButton(boolean z4) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        c21830s.setShowNextButton(z4);
    }

    public void setShowPreviousButton(boolean z4) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        c21830s.setShowPreviousButton(z4);
    }

    public void setShowRewindButton(boolean z4) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        c21830s.setShowRewindButton(z4);
    }

    public void setShowShuffleButton(boolean z4) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        c21830s.setShowShuffleButton(z4);
    }

    public void setShowSubtitleButton(boolean z4) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        c21830s.setShowSubtitleButton(z4);
    }

    public void setShowVrButton(boolean z4) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71574j(c21830s);
        c21830s.setShowVrButton(z4);
    }

    public void setShutterBackgroundColor(int i13) {
        View view = this.f20425y;
        if (view != null) {
            view.setBackgroundColor(i13);
        }
    }

    public void setUseArtwork(boolean z4) {
        AbstractC24543a.m71573i((z4 && this.f20402F == null) ? false : true);
        if (this.f20412P != z4) {
            this.f20412P = z4;
            m15577l(false);
        }
    }

    public void setUseController(boolean z4) {
        C21830s c21830s = this.f20406J;
        AbstractC24543a.m71573i((z4 && c21830s == null) ? false : true);
        if (this.f20410N == z4) {
            return;
        }
        this.f20410N = z4;
        if (m15578m()) {
            c21830s.setPlayer(this.f20409M);
        } else if (c21830s != null) {
            c21830s.m61761f();
            c21830s.setPlayer(null);
        }
        m15575j();
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        View view = this.f20426z;
        if (view instanceof SurfaceView) {
            view.setVisibility(i13);
        }
    }
}
