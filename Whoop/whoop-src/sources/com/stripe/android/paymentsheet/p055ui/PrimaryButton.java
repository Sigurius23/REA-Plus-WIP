package com.stripe.android.paymentsheet.p055ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.p018ui.platform.ComposeView;
import b30.AbstractC2590o3;
import b30.AnimationAnimationListenerC2613r3;
import b30.C2566l3;
import b30.C2574m3;
import b30.C2582n3;
import b30.C2598p3;
import b30.C2647w2;
import b30.ViewOnClickListenerC2558k3;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.whoop.android.R;
import d40.AbstractC11672q;
import d40.AbstractC11673r;
import d40.C11666k;
import h02.C16587n0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import m20.C24941b;
import m83.AbstractC25265s;
import p003a1.C0111j;
import p016an.C1053d;
import p027b3.C2384h2;
import p184h5.AbstractC16901p0;
import p479s4.AbstractC32128i;
import p507tx.AbstractC34235f;
import p602x1.C37816b;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.AnimationAnimationListenerC32191z;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001:\u000234J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000eR*\u0010%\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b$\u0010\u001d\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0016R \u0010,\u001a\u00020&8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010\u001d\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u0012¨\u00065"}, m65681d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton;", "Landroid/widget/FrameLayout;", "", "color", "Ll83/a0;", "setDefaultLabelColor", "(I)V", "drawable", "setLockIconDrawable", "setIndicatorColor", "setConfirmedIconDrawable", "Landroid/content/res/ColorStateList;", "tintList", "setBackgroundTintList", "(Landroid/content/res/ColorStateList;)V", "", "enabled", "setEnabled", "(Z)V", "Lzy/c;", "text", "setLabel", "(Lzy/c;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/content/res/ColorStateList;", "getDefaultTintList$paymentsheet_release", "()Landroid/content/res/ColorStateList;", "setDefaultTintList$paymentsheet_release", "getDefaultTintList$paymentsheet_release$annotations", "()V", "defaultTintList", "F", "Lzy/c;", "getExternalLabel$paymentsheet_release", "()Lzy/c;", "setExternalLabel$paymentsheet_release", "getExternalLabel$paymentsheet_release$annotations", "externalLabel", "Lm20/b;", "G", "Lm20/b;", "getViewBinding$paymentsheet_release", "()Lm20/b;", "getViewBinding$paymentsheet_release$annotations", "viewBinding", "H", "Z", "getLockVisible$paymentsheet_release", "()Z", "setLockVisible$paymentsheet_release", "lockVisible", "b30/o3", "b30/p3", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PrimaryButton extends FrameLayout {

    /* JADX INFO: renamed from: O */
    public static final /* synthetic */ int f22398O = 0;

    /* JADX INFO: renamed from: E */
    public Integer f22399E;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public InterfaceC41211c externalLabel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final C24941b viewBinding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean lockVisible;

    /* JADX INFO: renamed from: I */
    public final ImageView f22403I;

    /* JADX INFO: renamed from: J */
    public float f22404J;

    /* JADX INFO: renamed from: K */
    public float f22405K;

    /* JADX INFO: renamed from: L */
    public int f22406L;

    /* JADX INFO: renamed from: M */
    public int f22407M;

    /* JADX INFO: renamed from: N */
    public int f22408N;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public ColorStateList defaultTintList;

    /* JADX INFO: renamed from: x */
    public AbstractC2590o3 f22410x;

    /* JADX INFO: renamed from: y */
    public final C1053d f22411y;

    /* JADX INFO: renamed from: z */
    public InterfaceC41211c f22412z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        this.f22411y = new C1053d(context);
        LayoutInflater.from(context).inflate(R.layout.stripe_primary_button, this);
        int i13 = R.id.confirmed_icon;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(this, R.id.confirmed_icon);
        if (imageView != null) {
            i13 = R.id.confirming_icon;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) AbstractC34235f.m108203J(this, R.id.confirming_icon);
            if (circularProgressIndicator != null) {
                i13 = R.id.label;
                ComposeView composeView = (ComposeView) AbstractC34235f.m108203J(this, R.id.label);
                if (composeView != null) {
                    i13 = R.id.lock_icon;
                    ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(this, R.id.lock_icon);
                    if (imageView2 != null) {
                        this.viewBinding = new C24941b(this, imageView, circularProgressIndicator, composeView, imageView2);
                        this.lockVisible = true;
                        this.f22403I = imageView;
                        C11666k c11666k = AbstractC11672q.f37695e;
                        this.f22404J = AbstractC11673r.m31073b(context, c11666k.f37661c.f37656a);
                        this.f22405K = AbstractC11673r.m31073b(context, c11666k.f37661c.f37657b);
                        this.f22406L = AbstractC11673r.m31076e(c11666k, context);
                        this.f22407M = AbstractC11673r.m31085n(c11666k, context);
                        this.f22408N = AbstractC11673r.m31080i(c11666k, context);
                        composeView.setViewCompositionStrategy(C2384h2.f9434x);
                        Context context2 = getContext();
                        AbstractC22676k.m65749i(context2, "getContext(...)");
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC25265s.m74091C1(AbstractC37056f.m118958J(Integer.valueOf(android.R.attr.text))), 0, 0);
                        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
                        typedArrayObtainStyledAttributes.recycle();
                        if (text != null) {
                            setLabel(AbstractC32128i.m100055i(text.toString()));
                        }
                        setClickable(true);
                        setEnabled(false);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i13)));
    }

    public static /* synthetic */ void getDefaultTintList$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getExternalLabel$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    private final void setLabel(InterfaceC41211c text) {
        this.externalLabel = text;
        if (text != null) {
            if (!(this.f22410x instanceof C2582n3)) {
                this.f22412z = text;
            }
            this.viewBinding.f97656d.setContent(new C37816b(new C2647w2(3, text, this), true, -47128405));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16867a() {
        C24941b c24941b = this.viewBinding;
        for (View view : AbstractC37056f.m118959K(c24941b.f97656d, c24941b.f97657e)) {
            AbstractC2590o3 abstractC2590o3 = this.f22410x;
            view.setAlpha(((abstractC2590o3 == null || (abstractC2590o3 instanceof C2574m3)) && !isEnabled()) ? 0.5f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16868b(boolean z4) {
        this.viewBinding.f97657e.setVisibility((this.lockVisible && z4) ? 0 : 8);
    }

    /* JADX INFO: renamed from: c */
    public final void m16869c(AbstractC2590o3 abstractC2590o3) {
        this.f22410x = abstractC2590o3;
        m16867a();
        boolean z4 = abstractC2590o3 instanceof C2574m3;
        C24941b c24941b = this.viewBinding;
        if (z4) {
            m16868b(true);
            setClickable(true);
            InterfaceC41211c interfaceC41211c = this.f22412z;
            if (interfaceC41211c != null) {
                Context context = getContext();
                AbstractC22676k.m65749i(context, "getContext(...)");
                AbstractC16901p0.m47585p(this, interfaceC41211c.mo133889M(context));
                setLabel(interfaceC41211c);
            }
            ColorStateList colorStateList = this.defaultTintList;
            if (colorStateList != null) {
                setBackgroundTintList(colorStateList);
            }
            c24941b.f97657e.setVisibility(this.lockVisible ? 0 : 8);
            c24941b.f97655c.setVisibility(8);
            return;
        }
        if (AbstractC22676k.m65745e(abstractC2590o3, C2582n3.f10042a)) {
            m16868b(false);
            c24941b.f97655c.setVisibility(0);
            setClickable(false);
            C41210b c41210bM100054h = AbstractC32128i.m100054h(R.string.stripe_paymentsheet_primary_button_processing);
            Context context2 = getContext();
            AbstractC22676k.m65749i(context2, "getContext(...)");
            AbstractC16901p0.m47585p(this, c41210bM100054h.mo133889M(context2));
            setLabel(c41210bM100054h);
            return;
        }
        if (!(abstractC2590o3 instanceof C2566l3)) {
            if (abstractC2590o3 != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        C16587n0 c16587n0 = ((C2566l3) abstractC2590o3).f9969a;
        m16868b(false);
        setClickable(false);
        C41210b c41210bM100054h2 = AbstractC32128i.m100054h(R.string.stripe_successful_transaction_description);
        Context context3 = getContext();
        AbstractC22676k.m65749i(context3, "getContext(...)");
        AbstractC16901p0.m47585p(this, c41210bM100054h2.mo133889M(context3));
        setBackgroundTintList(ColorStateList.valueOf(this.f22407M));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f22408N);
        ImageView imageView = this.f22403I;
        imageView.setImageTintList(colorStateListValueOf);
        ComposeView composeView = c24941b.f97656d;
        C1053d c1053d = this.f22411y;
        Context context4 = (Context) c1053d.f4099y;
        Context context5 = (Context) c1053d.f4099y;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context4, R.anim.stripe_transition_fade_out);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC32191z(composeView, 2));
        composeView.startAnimation(animationLoadAnimation);
        CircularProgressIndicator circularProgressIndicator = c24941b.f97655c;
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context5, R.anim.stripe_transition_fade_out);
        animationLoadAnimation2.setAnimationListener(new AnimationAnimationListenerC32191z(circularProgressIndicator, 2));
        circularProgressIndicator.startAnimation(animationLoadAnimation2);
        int width = getWidth();
        C0111j c0111j = new C0111j(c16587n0, 7);
        Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context5, R.anim.stripe_transition_fade_in);
        animationLoadAnimation3.setAnimationListener(new AnimationAnimationListenerC2613r3(imageView, c1053d, width, c0111j));
        imageView.startAnimation(animationLoadAnimation3);
    }

    /* JADX INFO: renamed from: d */
    public final void m16870d(C2598p3 c2598p3) {
        setVisibility(c2598p3 != null ? 0 : 8);
        if (c2598p3 != null) {
            InterfaceC41211c interfaceC41211c = c2598p3.f10106a;
            this.lockVisible = c2598p3.f10111f;
            AbstractC2590o3 abstractC2590o3 = this.f22410x;
            if (!(abstractC2590o3 instanceof C2582n3) && !(abstractC2590o3 instanceof C2566l3)) {
                setLabel(interfaceC41211c);
                Context context = getContext();
                AbstractC22676k.m65749i(context, "getContext(...)");
                AbstractC16901p0.m47585p(this, interfaceC41211c.mo133889M(context));
                m16868b(true);
            }
            setEnabled(c2598p3.f10110e);
            setOnClickListener(new ViewOnClickListenerC2558k3(c2598p3, 0));
        }
    }

    /* JADX INFO: renamed from: getDefaultTintList$paymentsheet_release, reason: from getter */
    public final ColorStateList getDefaultTintList() {
        return this.defaultTintList;
    }

    /* JADX INFO: renamed from: getExternalLabel$paymentsheet_release, reason: from getter */
    public final InterfaceC41211c getExternalLabel() {
        return this.externalLabel;
    }

    /* JADX INFO: renamed from: getLockVisible$paymentsheet_release, reason: from getter */
    public final boolean getLockVisible() {
        return this.lockVisible;
    }

    /* JADX INFO: renamed from: getViewBinding$paymentsheet_release, reason: from getter */
    public final C24941b getViewBinding() {
        return this.viewBinding;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setClassName("android.widget.Button");
        }
        if (accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setEnabled(isEnabled());
        }
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList tintList) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f22404J);
        gradientDrawable.setColor(tintList);
        gradientDrawable.setStroke((int) this.f22405K, this.f22406L);
        setBackground(gradientDrawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.stripe_paymentsheet_primary_button_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public final void setConfirmedIconDrawable(int drawable) {
        this.viewBinding.f97654b.setImageResource(drawable);
    }

    public final void setDefaultLabelColor(int color) {
        this.f22399E = Integer.valueOf(color);
    }

    public final void setDefaultTintList$paymentsheet_release(ColorStateList colorStateList) {
        this.defaultTintList = colorStateList;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        m16867a();
    }

    public final void setExternalLabel$paymentsheet_release(InterfaceC41211c interfaceC41211c) {
        this.externalLabel = interfaceC41211c;
    }

    public final void setIndicatorColor(int color) {
        this.viewBinding.f97655c.setIndicatorColor(color);
    }

    public final void setLockIconDrawable(int drawable) {
        this.viewBinding.f97657e.setImageResource(drawable);
    }

    public final void setLockVisible$paymentsheet_release(boolean z4) {
        this.lockVisible = z4;
    }
}
