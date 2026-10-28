package androidx.media3.p019ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
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
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.p019ui.PlayerView;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.android.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jo.C21809a;
import live.hms.video.error.ErrorCodes;
import p004a2.AbstractC0152a;
import p009a8.RunnableC0533c;
import p027b3.AbstractC2378g1;
import p031b9.C2830f0;
import p031b9.C2831f1;
import p031b9.SurfaceHolderCallbackC2821c0;
import p087db.AbstractC11854i0;
import p087db.C11842c0;
import p087db.C11852h0;
import p087db.C11882x;
import p087db.InterfaceC11837a;
import p087db.InterfaceC11848f0;
import p087db.InterfaceC11850g0;
import p087db.InterfaceC11863n;
import p087db.InterfaceC11881w;
import p087db.ViewOnClickListenerC11846e0;
import p454r9.C31086k;
import p454r9.InterfaceC31087l;
import p479s4.AbstractC32122c;
import p484s9.C32284i;
import p497t7.InterfaceC33561b;
import p516u8.C34621u0;
import p516u8.C34629y0;
import p516u8.InterfaceC34599j0;
import p516u8.InterfaceC34604m;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import va3.AbstractC35849g;

/* JADX INFO: loaded from: classes5.dex */
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ int f6457j0 = 0;

    /* JADX INFO: renamed from: E */
    public final boolean f6458E;

    /* JADX INFO: renamed from: F */
    public final C11852h0 f6459F;

    /* JADX INFO: renamed from: G */
    public final ImageView f6460G;

    /* JADX INFO: renamed from: H */
    public final ImageView f6461H;

    /* JADX INFO: renamed from: I */
    public final SubtitleView f6462I;

    /* JADX INFO: renamed from: J */
    public final View f6463J;

    /* JADX INFO: renamed from: K */
    public final TextView f6464K;

    /* JADX INFO: renamed from: L */
    public final C11882x f6465L;

    /* JADX INFO: renamed from: M */
    public final FrameLayout f6466M;

    /* JADX INFO: renamed from: N */
    public final FrameLayout f6467N;

    /* JADX INFO: renamed from: O */
    public final Handler f6468O;

    /* JADX INFO: renamed from: P */
    public final Class f6469P;

    /* JADX INFO: renamed from: Q */
    public final Method f6470Q;

    /* JADX INFO: renamed from: R */
    public final Object f6471R;

    /* JADX INFO: renamed from: S */
    public InterfaceC34599j0 f6472S;

    /* JADX INFO: renamed from: T */
    public boolean f6473T;

    /* JADX INFO: renamed from: U */
    public InterfaceC11881w f6474U;

    /* JADX INFO: renamed from: V */
    public int f6475V;

    /* JADX INFO: renamed from: W */
    public int f6476W;

    /* JADX INFO: renamed from: a0 */
    public Drawable f6477a0;

    /* JADX INFO: renamed from: b0 */
    public int f6478b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f6479c0;

    /* JADX INFO: renamed from: d0 */
    public CharSequence f6480d0;

    /* JADX INFO: renamed from: e0 */
    public int f6481e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f6482f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f6483g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f6484h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f6485i0;

    /* JADX INFO: renamed from: w */
    public final ViewOnClickListenerC11846e0 f6486w;

    /* JADX INFO: renamed from: x */
    public final AspectRatioFrameLayout f6487x;

    /* JADX INFO: renamed from: y */
    public final View f6488y;

    /* JADX INFO: renamed from: z */
    public final View f6489z;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet) {
        int i13;
        int i14;
        boolean z4;
        boolean z13;
        boolean z14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z15;
        boolean z16;
        int i25;
        boolean z17;
        int i26;
        boolean z18;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, attributeSet, 0);
        ViewOnClickListenerC11846e0 viewOnClickListenerC11846e0 = new ViewOnClickListenerC11846e0(this);
        this.f6486w = viewOnClickListenerC11846e0;
        this.f6468O = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f6487x = null;
            this.f6488y = null;
            this.f6489z = null;
            this.f6458E = false;
            this.f6459F = null;
            this.f6460G = null;
            this.f6461H = null;
            this.f6462I = null;
            this.f6463J = null;
            this.f6464K = null;
            this.f6465L = null;
            this.f6466M = null;
            this.f6467N = null;
            this.f6469P = null;
            this.f6470Q = null;
            this.f6471R = null;
            ImageView imageView = new ImageView(context);
            if (AbstractC38065t.f163031a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(2131231748, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(2131231748, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC11854i0.f38683e, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(49, true);
                int i27 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i28 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i29 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i34 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z16 = z24;
                i13 = typedArrayObtainStyledAttributes.getInt(38, ErrorCodes.WebsocketMethodErrors.cServerErrors);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.f6479c0 = typedArrayObtainStyledAttributes.getBoolean(16, this.f6479c0);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                i14 = resourceId;
                z13 = z26;
                i17 = i28;
                z17 = zHasValue;
                i15 = integer;
                i24 = color;
                i19 = i29;
                i18 = i34;
                i16 = resourceId2;
                z14 = z27;
                z4 = z25;
                i25 = i27;
                z15 = z19;
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        } else {
            i13 = 5000;
            i14 = R.layout.exo_player_view;
            z4 = true;
            z13 = true;
            z14 = true;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            i18 = 0;
            i19 = 1;
            i24 = 0;
            z15 = true;
            z16 = true;
            i25 = 1;
            z17 = false;
        }
        LayoutInflater.from(context).inflate(i14, this);
        setDescendantFocusability(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f6487x = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i18);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.f6488y = viewFindViewById;
        if (viewFindViewById != null && z17) {
            viewFindViewById.setBackgroundColor(i24);
        }
        if (aspectRatioFrameLayout == null || i19 == 0) {
            i26 = 0;
            this.f6489z = null;
            z18 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i19 != 2) {
                if (i19 == 3) {
                    try {
                        int i35 = C32284i.f133607L;
                        this.f6489z = (View) C32284i.class.getConstructor(Context.class).newInstance(context);
                        z18 = true;
                    } catch (Exception e5) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e5);
                    }
                } else if (i19 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (AbstractC38065t.f163031a >= 34) {
                        AbstractC2378g1.m7346u(surfaceView);
                    }
                    this.f6489z = surfaceView;
                } else {
                    try {
                        int i36 = C31086k.f128214x;
                        this.f6489z = (View) C31086k.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e13) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e13);
                    }
                }
                this.f6489z.setLayoutParams(layoutParams);
                this.f6489z.setOnClickListener(viewOnClickListenerC11846e0);
                i26 = 0;
                this.f6489z.setClickable(false);
                aspectRatioFrameLayout.addView(this.f6489z, 0);
            } else {
                this.f6489z = new TextureView(context);
            }
            z18 = false;
            this.f6489z.setLayoutParams(layoutParams);
            this.f6489z.setOnClickListener(viewOnClickListenerC11846e0);
            i26 = 0;
            this.f6489z.setClickable(false);
            aspectRatioFrameLayout.addView(this.f6489z, 0);
        }
        this.f6458E = z18;
        this.f6459F = AbstractC38065t.f163031a == 34 ? new C11852h0() : null;
        this.f6466M = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f6467N = (FrameLayout) findViewById(R.id.exo_overlay);
        this.f6460G = (ImageView) findViewById(R.id.exo_image);
        this.f6476W = i17;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: db.d0
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i37 = PlayerView.f6457j0;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = this.f38626a;
                    playerView.f6468O.post(new RunnableC0533c(20, playerView, bitmap));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f6469P = cls;
        this.f6470Q = method;
        this.f6471R = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f6461H = imageView2;
        this.f6475V = (!z15 || i25 == 0 || imageView2 == null) ? i26 : i25;
        if (i16 != 0) {
            this.f6477a0 = AbstractC32122c.getDrawable(getContext(), i16);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f6462I = subtitleView;
        if (subtitleView != null) {
            subtitleView.m5089a();
            subtitleView.m5090b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.f6463J = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f6478b0 = i15;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f6464K = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C11882x c11882x = (C11882x) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (c11882x != null) {
            this.f6465L = c11882x;
        } else if (viewFindViewById3 != null) {
            C11882x c11882x2 = new C11882x(context, attributeSet);
            this.f6465L = c11882x2;
            c11882x2.setId(R.id.exo_controller);
            c11882x2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(c11882x2, iIndexOfChild);
        } else {
            this.f6465L = null;
        }
        C11882x c11882x3 = this.f6465L;
        this.f6481e0 = c11882x3 != null ? i13 : i26;
        this.f6484h0 = z4;
        this.f6482f0 = z13;
        this.f6483g0 = z14;
        this.f6473T = (!z16 || c11882x3 == null) ? i26 : 1;
        if (c11882x3 != null) {
            C11842c0 c11842c0 = c11882x3.f38840w;
            int i37 = c11842c0.f38612t;
            if (i37 != 3 && i37 != 2) {
                c11842c0.m31793h();
                c11842c0.m31796k(2);
            }
            C11882x c11882x4 = this.f6465L;
            ViewOnClickListenerC11846e0 viewOnClickListenerC11846e1 = this.f6486w;
            c11882x4.getClass();
            viewOnClickListenerC11846e1.getClass();
            c11882x4.f38846z.add(viewOnClickListenerC11846e1);
        }
        if (z16) {
            setClickable(true);
        }
        m5084m();
    }

    /* JADX INFO: renamed from: a */
    public static void m5072a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        if (playerView.m5074c()) {
            return;
        }
        ImageView imageView = playerView.f6460G;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.m5087p();
        }
        View view = playerView.f6488y;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f6460G;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        m5087p();
    }

    private void setImageOutput(InterfaceC34599j0 interfaceC34599j0) {
        Class cls = this.f6469P;
        if (cls == null || !cls.isAssignableFrom(interfaceC34599j0.getClass())) {
            return;
        }
        try {
            Method method = this.f6470Q;
            method.getClass();
            Object obj = this.f6471R;
            obj.getClass();
            method.invoke(interfaceC34599j0, obj);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5073b() {
        InterfaceC34599j0 interfaceC34599j0 = this.f6472S;
        return interfaceC34599j0 != null && this.f6471R != null && ((AbstractC0152a) interfaceC34599j0).m367A(30) && ((C2830f0) interfaceC34599j0).m8105d0().m109417a(4);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5074c() {
        InterfaceC34599j0 interfaceC34599j0 = this.f6472S;
        return interfaceC34599j0 != null && ((AbstractC0152a) interfaceC34599j0).m367A(30) && ((C2830f0) interfaceC34599j0).m8105d0().m109417a(2);
    }

    /* JADX INFO: renamed from: d */
    public final void m5075d() {
        ImageView imageView = this.f6460G;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C11852h0 c11852h0;
        super.dispatchDraw(canvas);
        if (AbstractC38065t.f163031a == 34 && (c11852h0 = this.f6459F) != null && this.f6485i0) {
            c11852h0.m31811b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC34599j0 interfaceC34599j0 = this.f6472S;
        if (interfaceC34599j0 != null && ((AbstractC0152a) interfaceC34599j0).m367A(16) && ((C2830f0) this.f6472S).m8112l0()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z4 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C11882x c11882x = this.f6465L;
        if (z4 && m5088q() && !c11882x.m31852g()) {
            m5077f(true);
            return true;
        }
        if ((m5088q() && c11882x.m31848c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m5077f(true);
            return true;
        }
        if (z4 && m5088q()) {
            m5077f(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5076e() {
        InterfaceC34599j0 interfaceC34599j0 = this.f6472S;
        return interfaceC34599j0 != null && ((AbstractC0152a) interfaceC34599j0).m367A(16) && ((C2830f0) this.f6472S).m8112l0() && ((C2830f0) this.f6472S).m8108g0();
    }

    /* JADX INFO: renamed from: f */
    public final void m5077f(boolean z4) {
        if (!(m5076e() && this.f6483g0) && m5088q()) {
            C11882x c11882x = this.f6465L;
            boolean z13 = c11882x.m31852g() && c11882x.getShowTimeoutMs() <= 0;
            boolean zM5079h = m5079h();
            if (z4 || z13 || zM5079h) {
                m5080i(zM5079h);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5078g(Drawable drawable) {
        ImageView imageView = this.f6461H;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f6475V == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f6487x;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public List<C21809a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f6467N;
        if (frameLayout != null) {
            arrayList.add(new C21809a(frameLayout));
        }
        C11882x c11882x = this.f6465L;
        if (c11882x != null) {
            arrayList.add(new C21809a(c11882x));
        }
        return AbstractC41023g0.m133252m(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f6466M;
        AbstractC35849g.m113809k(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f6475V;
    }

    public boolean getControllerAutoShow() {
        return this.f6482f0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f6484h0;
    }

    public int getControllerShowTimeoutMs() {
        return this.f6481e0;
    }

    public Drawable getDefaultArtwork() {
        return this.f6477a0;
    }

    public int getImageDisplayMode() {
        return this.f6476W;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f6467N;
    }

    public InterfaceC34599j0 getPlayer() {
        return this.f6472S;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6487x;
        AbstractC35849g.m113808j(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f6462I;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f6475V != 0;
    }

    public boolean getUseController() {
        return this.f6473T;
    }

    public View getVideoSurfaceView() {
        return this.f6489z;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5079h() {
        InterfaceC34599j0 interfaceC34599j0 = this.f6472S;
        if (interfaceC34599j0 == null) {
            return true;
        }
        int iM8110i0 = ((C2830f0) interfaceC34599j0).m8110i0();
        if (!this.f6482f0) {
            return false;
        }
        if (((AbstractC0152a) this.f6472S).m367A(17) && ((C2830f0) this.f6472S).m8104c0().m109408p()) {
            return false;
        }
        if (iM8110i0 != 1 && iM8110i0 != 4) {
            InterfaceC34599j0 interfaceC34599j1 = this.f6472S;
            interfaceC34599j1.getClass();
            if (((C2830f0) interfaceC34599j1).m8108g0()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m5080i(boolean z4) {
        if (m5088q()) {
            int i13 = z4 ? 0 : this.f6481e0;
            C11882x c11882x = this.f6465L;
            c11882x.setShowTimeoutMs(i13);
            C11842c0 c11842c0 = c11882x.f38840w;
            C11882x c11882x2 = (C11882x) c11842c0.f38616x;
            if (!c11882x2.m31853h()) {
                c11882x2.setVisibility(0);
                c11882x2.m31854i();
                ImageView imageView = c11882x2.f38798O;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            c11842c0.m31797n();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5081j() {
        if (!m5088q() || this.f6472S == null) {
            return;
        }
        C11882x c11882x = this.f6465L;
        if (!c11882x.m31852g()) {
            m5077f(true);
        } else if (this.f6484h0) {
            c11882x.m31851f();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5082k() {
        C34629y0 c34629y0;
        InterfaceC34599j0 interfaceC34599j0 = this.f6472S;
        if (interfaceC34599j0 != null) {
            C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
            c2830f0.m8091L0();
            c34629y0 = c2830f0.f11107G0;
        } else {
            c34629y0 = C34629y0.f145874d;
        }
        int i13 = c34629y0.f145875a;
        int i14 = c34629y0.f145876b;
        float f13 = this.f6458E ? 0.0f : (i14 == 0 || i13 == 0) ? 0.0f : (i13 * c34629y0.f145877c) / i14;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6487x;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX INFO: renamed from: l */
    public final void m5083l() {
        boolean z4;
        View view = this.f6463J;
        if (view != null) {
            InterfaceC34599j0 interfaceC34599j0 = this.f6472S;
            if (interfaceC34599j0 == null || ((C2830f0) interfaceC34599j0).m8110i0() != 2) {
                z4 = false;
            } else {
                int i13 = this.f6478b0;
                z4 = true;
                if (i13 != 2 && (i13 != 1 || !((C2830f0) this.f6472S).m8108g0())) {
                    z4 = false;
                }
            }
            view.setVisibility(z4 ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5084m() {
        C11882x c11882x = this.f6465L;
        if (c11882x == null || !this.f6473T) {
            setContentDescription(null);
        } else if (c11882x.m31852g()) {
            setContentDescription(this.f6484h0 ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5085n() {
        TextView textView = this.f6464K;
        if (textView != null) {
            CharSequence charSequence = this.f6480d0;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            InterfaceC34599j0 interfaceC34599j0 = this.f6472S;
            if (interfaceC34599j0 != null) {
                C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
                c2830f0.m8091L0();
                ExoPlaybackException exoPlaybackException = c2830f0.f11111I0.f11050f;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5086o(boolean z4) {
        Drawable drawable;
        InterfaceC34599j0 interfaceC34599j0 = this.f6472S;
        boolean zM5078g = false;
        boolean z13 = (interfaceC34599j0 == null || !((AbstractC0152a) interfaceC34599j0).m367A(30) || ((C2830f0) interfaceC34599j0).m8105d0().f145864a.isEmpty()) ? false : true;
        boolean z14 = this.f6479c0;
        ImageView imageView = this.f6461H;
        View view = this.f6488y;
        if (!z14 && (!z13 || z4)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            m5075d();
        }
        if (z13) {
            boolean zM5074c = m5074c();
            boolean zM5073b = m5073b();
            if (!zM5074c && !zM5073b) {
                if (view != null) {
                    view.setVisibility(0);
                }
                m5075d();
            }
            ImageView imageView2 = this.f6460G;
            boolean z15 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM5073b && !zM5074c && z15) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m5087p();
                }
            } else if (zM5074c && !zM5073b && z15) {
                m5075d();
            }
            if (!zM5074c && !zM5073b && this.f6475V != 0) {
                AbstractC35849g.m113808j(imageView);
                if (interfaceC34599j0 != null && ((AbstractC0152a) interfaceC34599j0).m367A(18)) {
                    C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
                    c2830f0.m8091L0();
                    byte[] bArr = c2830f0.f11147q0.f145615f;
                    if (bArr != null) {
                        zM5078g = m5078g(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    }
                }
                if (zM5078g || m5078g(this.f6477a0)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m5088q() || this.f6472S == null) {
            return false;
        }
        m5077f(true);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m5087p() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f6460G;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f6476W == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f6487x) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean performClick() {
        m5081j();
        return super.performClick();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5088q() {
        if (!this.f6473T) {
            return false;
        }
        AbstractC35849g.m113808j(this.f6465L);
        return true;
    }

    public void setArtworkDisplayMode(int i13) {
        AbstractC35849g.m113807i(i13 == 0 || this.f6461H != null);
        if (this.f6475V != i13) {
            this.f6475V = i13;
            m5086o(false);
        }
    }

    public void setAspectRatioListener(InterfaceC11837a interfaceC11837a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6487x;
        AbstractC35849g.m113808j(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC11837a);
    }

    public void setControllerAnimationEnabled(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setAnimationEnabled(z4);
    }

    public void setControllerAutoShow(boolean z4) {
        this.f6482f0 = z4;
    }

    public void setControllerHideDuringAds(boolean z4) {
        this.f6483g0 = z4;
    }

    public void setControllerHideOnTouch(boolean z4) {
        AbstractC35849g.m113808j(this.f6465L);
        this.f6484h0 = z4;
        m5084m();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(InterfaceC11863n interfaceC11863n) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setOnFullScreenModeChangedListener(interfaceC11863n);
    }

    public void setControllerShowTimeoutMs(int i13) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        this.f6481e0 = i13;
        if (c11882x.m31852g()) {
            m5080i(m5079h());
        }
    }

    public void setControllerVisibilityListener(InterfaceC11848f0 interfaceC11848f0) {
        if (interfaceC11848f0 != null) {
            setControllerVisibilityListener((InterfaceC11881w) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC35849g.m113807i(this.f6464K != null);
        this.f6480d0 = charSequence;
        m5085n();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f6477a0 != drawable) {
            this.f6477a0 = drawable;
            m5086o(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z4) {
        this.f6485i0 = z4;
    }

    public void setErrorMessageProvider(InterfaceC34604m interfaceC34604m) {
        if (interfaceC34604m != null) {
            m5085n();
        }
    }

    public void setFullscreenButtonClickListener(InterfaceC11850g0 interfaceC11850g0) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setOnFullScreenModeChangedListener(this.f6486w);
    }

    public void setFullscreenButtonState(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.m31856k(z4);
    }

    public void setImageDisplayMode(int i13) {
        AbstractC35849g.m113807i(this.f6460G != null);
        if (this.f6476W != i13) {
            this.f6476W = i13;
            m5087p();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z4) {
        if (this.f6479c0 != z4) {
            this.f6479c0 = z4;
            m5086o(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01ec  */
    public void setPlayer(InterfaceC34599j0 interfaceC34599j0) {
        AbstractC35849g.m113807i(Looper.myLooper() == Looper.getMainLooper());
        AbstractC35849g.m113802d(interfaceC34599j0 == null || ((C2830f0) interfaceC34599j0).f11125U == Looper.getMainLooper());
        InterfaceC34599j0 interfaceC34599j1 = this.f6472S;
        if (interfaceC34599j1 == interfaceC34599j0) {
            return;
        }
        View view = this.f6489z;
        ViewOnClickListenerC11846e0 viewOnClickListenerC11846e0 = this.f6486w;
        if (interfaceC34599j1 != null) {
            C2830f0 c2830f0 = (C2830f0) interfaceC34599j1;
            c2830f0.m8118s0(viewOnClickListenerC11846e0);
            if (((AbstractC0152a) interfaceC34599j1).m367A(27)) {
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    c2830f0.m8091L0();
                    if (textureView == c2830f0.f11153w0) {
                        c2830f0.m8094S();
                    }
                } else if (view instanceof SurfaceView) {
                    c2830f0.m8091L0();
                    SurfaceHolder holder = ((SurfaceView) view).getHolder();
                    c2830f0.m8091L0();
                    if (holder != null && holder == c2830f0.f11150t0) {
                        c2830f0.m8094S();
                    }
                }
            }
            Class cls = this.f6469P;
            if (cls != null && cls.isAssignableFrom(interfaceC34599j1.getClass())) {
                try {
                    Method method = this.f6470Q;
                    method.getClass();
                    method.invoke(interfaceC34599j1, null);
                } catch (IllegalAccessException | InvocationTargetException e5) {
                    throw new RuntimeException(e5);
                }
            }
        }
        SubtitleView subtitleView = this.f6462I;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f6472S = interfaceC34599j0;
        boolean zM5088q = m5088q();
        C11882x c11882x = this.f6465L;
        if (zM5088q) {
            c11882x.setPlayer(interfaceC34599j0);
        }
        m5083l();
        m5085n();
        m5086o(true);
        if (interfaceC34599j0 == null) {
            if (c11882x != null) {
                c11882x.m31851f();
                return;
            }
            return;
        }
        AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
        if (abstractC0152a.m367A(27)) {
            if (view instanceof TextureView) {
                TextureView textureView2 = (TextureView) view;
                C2830f0 c2830f1 = (C2830f0) interfaceC34599j0;
                c2830f1.m8091L0();
                c2830f1.m8120u0();
                c2830f1.f11153w0 = textureView2;
                if (textureView2.getSurfaceTextureListener() != null) {
                    AbstractC38046a.m121826u("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
                }
                textureView2.setSurfaceTextureListener(c2830f1.f11131a0);
                SurfaceTexture surfaceTexture = textureView2.isAvailable() ? textureView2.getSurfaceTexture() : null;
                if (surfaceTexture == null) {
                    c2830f1.m8084E0(null);
                    c2830f1.m8115p0(0, 0);
                } else {
                    Surface surface = new Surface(surfaceTexture);
                    c2830f1.m8084E0(surface);
                    c2830f1.f11149s0 = surface;
                    c2830f1.m8115p0(textureView2.getWidth(), textureView2.getHeight());
                }
            } else if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                C2830f0 c2830f2 = (C2830f0) interfaceC34599j0;
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = c2830f2.f11131a0;
                c2830f2.m8091L0();
                if (surfaceView instanceof InterfaceC31087l) {
                    c2830f2.m8120u0();
                    c2830f2.m8084E0(surfaceView);
                    c2830f2.m8124y0(surfaceView.getHolder());
                } else if (surfaceView instanceof C32284i) {
                    c2830f2.m8120u0();
                    c2830f2.f11151u0 = (C32284i) surfaceView;
                    C2831f1 c2831f1M8096U = c2830f2.m8096U(c2830f2.f11132b0);
                    AbstractC35849g.m113807i(!c2831f1M8096U.f11164f);
                    c2831f1M8096U.f11161c = InterfaceC33561b.INVALID_OWNERSHIP;
                    C32284i c32284i = c2830f2.f11151u0;
                    AbstractC35849g.m113807i(true ^ c2831f1M8096U.f11164f);
                    c2831f1M8096U.f11162d = c32284i;
                    c2831f1M8096U.m8127b();
                    c2830f2.f11151u0.f133615w.add(surfaceHolderCallbackC2821c0);
                    c2830f2.m8084E0(c2830f2.f11151u0.getVideoSurface());
                    c2830f2.m8124y0(surfaceView.getHolder());
                } else {
                    SurfaceHolder holder2 = surfaceView.getHolder();
                    c2830f2.m8091L0();
                    if (holder2 == null) {
                        c2830f2.m8094S();
                    } else {
                        c2830f2.m8120u0();
                        c2830f2.f11152v0 = true;
                        c2830f2.f11150t0 = holder2;
                        holder2.addCallback(surfaceHolderCallbackC2821c0);
                        Surface surface2 = holder2.getSurface();
                        if (surface2 == null || !surface2.isValid()) {
                            c2830f2.m8084E0(null);
                            c2830f2.m8115p0(0, 0);
                        } else {
                            c2830f2.m8084E0(surface2);
                            Rect surfaceFrame = holder2.getSurfaceFrame();
                            c2830f2.m8115p0(surfaceFrame.width(), surfaceFrame.height());
                        }
                    }
                }
            }
            if (abstractC0152a.m367A(30)) {
                AbstractC41023g0 abstractC41023g0 = ((C2830f0) interfaceC34599j0).m8105d0().f145864a;
                boolean z4 = false;
                loop0: for (int i13 = 0; i13 < abstractC41023g0.size(); i13++) {
                    if (((C34621u0) abstractC41023g0.get(i13)).f145858b.f145798c == 2) {
                        C34621u0 c34621u0 = (C34621u0) abstractC41023g0.get(i13);
                        for (int i14 = 0; i14 < c34621u0.f145860d.length; i14++) {
                            if (c34621u0.m109416a(i14)) {
                                z4 = true;
                                break loop0;
                            }
                        }
                    }
                }
                if (z4) {
                    m5082k();
                }
            } else {
                m5082k();
            }
        }
        if (subtitleView != null && abstractC0152a.m367A(28)) {
            C2830f0 c2830f3 = (C2830f0) interfaceC34599j0;
            c2830f3.m8091L0();
            subtitleView.setCues(c2830f3.f11099B0.f158063a);
        }
        ((C2830f0) interfaceC34599j0).m8092Q(viewOnClickListenerC11846e0);
        setImageOutput(interfaceC34599j0);
        m5077f(false);
    }

    public void setRepeatToggleModes(int i13) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setRepeatToggleModes(i13);
    }

    public void setResizeMode(int i13) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f6487x;
        AbstractC35849g.m113808j(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i13);
    }

    public void setShowBuffering(int i13) {
        if (this.f6478b0 != i13) {
            this.f6478b0 = i13;
            m5083l();
        }
    }

    public void setShowFastForwardButton(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setShowFastForwardButton(z4);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setShowMultiWindowTimeBar(z4);
    }

    public void setShowNextButton(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setShowNextButton(z4);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setShowPlayButtonIfPlaybackIsSuppressed(z4);
    }

    public void setShowPreviousButton(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setShowPreviousButton(z4);
    }

    public void setShowRewindButton(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setShowRewindButton(z4);
    }

    public void setShowShuffleButton(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setShowShuffleButton(z4);
    }

    public void setShowSubtitleButton(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setShowSubtitleButton(z4);
    }

    public void setShowVrButton(boolean z4) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        c11882x.setShowVrButton(z4);
    }

    public void setShutterBackgroundColor(int i13) {
        View view = this.f6488y;
        if (view != null) {
            view.setBackgroundColor(i13);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z4) {
        setArtworkDisplayMode(!z4 ? 1 : 0);
    }

    public void setUseController(boolean z4) {
        boolean z13 = true;
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113807i((z4 && c11882x == null) ? false : true);
        if (!z4 && !hasOnClickListeners()) {
            z13 = false;
        }
        setClickable(z13);
        if (this.f6473T == z4) {
            return;
        }
        this.f6473T = z4;
        if (m5088q()) {
            c11882x.setPlayer(this.f6472S);
        } else if (c11882x != null) {
            c11882x.m31851f();
            c11882x.setPlayer(null);
        }
        m5084m();
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        View view = this.f6489z;
        if (view instanceof SurfaceView) {
            view.setVisibility(i13);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(InterfaceC11881w interfaceC11881w) {
        C11882x c11882x = this.f6465L;
        AbstractC35849g.m113808j(c11882x);
        CopyOnWriteArrayList copyOnWriteArrayList = c11882x.f38846z;
        InterfaceC11881w interfaceC11881w2 = this.f6474U;
        if (interfaceC11881w2 == interfaceC11881w) {
            return;
        }
        if (interfaceC11881w2 != null) {
            copyOnWriteArrayList.remove(interfaceC11881w2);
        }
        this.f6474U = interfaceC11881w;
        if (interfaceC11881w != null) {
            copyOnWriteArrayList.add(interfaceC11881w);
            setControllerVisibilityListener((InterfaceC11848f0) null);
        }
    }
}
