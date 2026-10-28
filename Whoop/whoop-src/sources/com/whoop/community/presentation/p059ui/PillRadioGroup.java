package com.whoop.community.presentation.p059ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.Keep;
import c93.InterfaceC4339a;
import com.whoop.community.presentation.p059ui.PillRadioGroup;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import jo.ViewOnClickListenerC21821j;
import p002a0.C0030i1;
import p028b4.RunnableC2690a;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xp0.AbstractC38501b0;
import xp0.AbstractC38509f0;
import xp0.AbstractC38528y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J/\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0#¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b(\u0010\u0013J\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u000f¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0/¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b3\u0010+J\u001b\u00106\u001a\u0002052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\f0#¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020:H\u0007¢\u0006\u0004\b?\u0010=R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010@R$\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010KR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010TR\u001c\u0010Y\u001a\b\u0012\u0004\u0012\u00020,0V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Z"}, m65681d2 = {"Lcom/whoop/community/presentation/ui/PillRadioGroup;", "Landroid/widget/RadioGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "array", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroid/content/res/TypedArray;)V", "", "", "buttons", "e", "(Ljava/util/List;)V", "Landroid/widget/CompoundButton;", "child", "l", "(Landroid/widget/CompoundButton;)V", "n", "m", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkotlin/Function0;", "onTouchListener", "setCustomTouchListener", "(Lc93/a;)V", "texts", "d", "colorResource", "setSelectorColor", "(I)V", "Landroid/widget/RadioButton;", "getButtons", "()Ljava/util/List;", "Lkotlin/Function1;", "onItemChangeListener", "setOnItemChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "k", "action", "", "i", "(Lc93/a;)Z", "getSelectedIndex", "()Ljava/lang/Integer;", "", "left", "setSelectionLeft", "(F)V", "right", "setSelectionRight", "Lc93/a;", "x", "Lkotlin/jvm/functions/Function1;", "Landroid/graphics/RectF;", "y", "Landroid/graphics/RectF;", "selector", "z", "outline", "Landroid/graphics/Paint;", "E", "Landroid/graphics/Paint;", "selectorPaint", "F", "outlinePaint", "G", "I", "selectorColor", "H", "outlineColor", "Ljava/lang/Integer;", "selectedIndex", "", "J", "Ljava/util/List;", "radioButtons", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PillRadioGroup extends RadioGroup {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Paint selectorPaint;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Paint outlinePaint;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int selectorColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int outlineColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private Integer selectedIndex;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private List<RadioButton> radioButtons;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private InterfaceC4339a onTouchListener;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private Function1 onItemChangeListener;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private RectF selector;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final RectF outline;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PillRadioGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: e */
    private final void m19536e(List<String> buttons) {
        for (String str : buttons) {
            Object systemService = getContext().getSystemService("layout_inflater");
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View viewInflate = ((LayoutInflater) systemService).inflate(AbstractC38501b0.f165475A0, (ViewGroup) this, false);
            AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type android.widget.RadioButton");
            final RadioButton radioButton = (RadioButton) viewInflate;
            this.radioButtons.add(radioButton);
            radioButton.setText(str);
            radioButton.setTextColor(this.outlineColor);
            addView(radioButton);
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: tq0.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                    PillRadioGroup.m19537f(this.f142941a, radioButton, compoundButton, z4);
                }
            });
            radioButton.setOnClickListener(new ViewOnClickListenerC21821j(this, 17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m19537f(PillRadioGroup pillRadioGroup, RadioButton radioButton, CompoundButton view, boolean z4) {
        AbstractC22676k.m65750j(view, "view");
        if (!z4) {
            radioButton.setTextColor(pillRadioGroup.outlineColor);
            return;
        }
        ViewParent parent = view.getParent();
        AbstractC22676k.m65748h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int iIndexOfChild = ((ViewGroup) parent).indexOfChild(view);
        pillRadioGroup.selectedIndex = Integer.valueOf(iIndexOfChild);
        Function1 function1 = pillRadioGroup.onItemChangeListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(iIndexOfChild));
        }
        pillRadioGroup.m19542m(view);
        radioButton.setTextColor(pillRadioGroup.selectorColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m19538g(PillRadioGroup pillRadioGroup, View view) {
        InterfaceC4339a interfaceC4339a = pillRadioGroup.onTouchListener;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m19539h(TypedArray array) {
        CharSequence[] textArray = array.getTextArray(AbstractC38509f0.f165749f);
        ArrayList arrayList = new ArrayList();
        if (textArray != null) {
            C0030i1 c0030i1M65777h = AbstractC22681m0.m65777h(textArray);
            while (c0030i1M65777h.hasNext()) {
                arrayList.add(((CharSequence) c0030i1M65777h.next()).toString());
            }
        }
        m19536e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m19540j(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
    }

    /* JADX INFO: renamed from: l */
    private final void m19541l(CompoundButton child) {
        m19543n(child);
        child.setChecked(true);
    }

    /* JADX INFO: renamed from: m */
    private final void m19542m(CompoundButton child) {
        RectF rectF = this.selector;
        if (rectF == null) {
            m19541l(child);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "selectionLeft", rectF.left, child.getLeft() + 6.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "selectionRight", rectF.right, child.getRight() - 6.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: n */
    private final void m19543n(CompoundButton child) {
        if (this.selector == null) {
            this.selector = new RectF();
        }
        RectF rectF = this.selector;
        if (rectF != null) {
            rectF.top = 6.0f;
        }
        if (rectF != null) {
            rectF.left = child.getLeft() + 6.0f;
        }
        RectF rectF2 = this.selector;
        if (rectF2 != null) {
            rectF2.bottom = getHeight() - 6.0f;
        }
        RectF rectF3 = this.selector;
        if (rectF3 != null) {
            rectF3.right = child.getRight() - 6.0f;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public final void m19544d(List<String> texts) {
        AbstractC22676k.m65750j(texts, "texts");
        m19536e(texts);
    }

    public final List<RadioButton> getButtons() {
        return this.radioButtons;
    }

    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m19545i(InterfaceC4339a action) {
        AbstractC22676k.m65750j(action, "action");
        View childAt = getChildAt(0);
        if (childAt != null) {
            return childAt.post(new RunnableC2690a(action, 8));
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m19546k(int child) {
        View childAt = getChildAt(child);
        AbstractC22676k.m65748h(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
        m19541l((CompoundButton) childAt);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.outline;
        float f13 = (rectF.bottom - rectF.top) / 2;
        canvas.drawRoundRect(rectF, f13, f13, this.outlinePaint);
        RectF rectF2 = this.selector;
        if (rectF2 != null) {
            canvas.drawRoundRect(rectF2, f13, f13, this.selectorPaint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w9, int h7, int oldw, int oldh) {
        super.onSizeChanged(w9, h7, oldw, oldh);
        RectF rectF = this.outline;
        float f13 = h7 - 6.0f;
        rectF.bottom = f13;
        rectF.right = w9 - 6.0f;
        RectF rectF2 = this.selector;
        if (rectF2 != null) {
            rectF2.bottom = f13;
        }
    }

    public final void setCustomTouchListener(InterfaceC4339a onTouchListener) {
        AbstractC22676k.m65750j(onTouchListener, "onTouchListener");
        this.onTouchListener = onTouchListener;
    }

    public final void setOnItemChangeListener(Function1 onItemChangeListener) {
        AbstractC22676k.m65750j(onItemChangeListener, "onItemChangeListener");
        this.onItemChangeListener = onItemChangeListener;
    }

    @Keep
    public final void setSelectionLeft(float left) {
        RectF rectF = this.selector;
        if (rectF != null) {
            rectF.left = left;
        }
        invalidate();
    }

    @Keep
    public final void setSelectionRight(float right) {
        RectF rectF = this.selector;
        if (rectF != null) {
            rectF.right = right;
        }
        invalidate();
    }

    public final void setSelectorColor(int colorResource) {
        this.selectorColor = colorResource;
        this.selectorPaint.setColor(colorResource);
        Integer num = this.selectedIndex;
        if (num != null) {
            int iIntValue = num.intValue();
            List<RadioButton> buttons = getButtons();
            buttons.get(iIntValue).setTextColor(this.selectorColor);
            buttons.get(iIntValue).invalidate();
        }
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillRadioGroup(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
        RectF rectF = new RectF();
        this.outline = rectF;
        this.radioButtons = new ArrayList();
        setOrientation(0);
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC38509f0.f165746c, i13, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.selectorColor = typedArrayObtainStyledAttributes.getColor(AbstractC38509f0.f165748e, -1);
        int color = typedArrayObtainStyledAttributes.getColor(AbstractC38509f0.f165747d, AbstractC32122c.getColor(context, AbstractC38528y.f165807e));
        this.outlineColor = color;
        Paint paint = new Paint();
        this.selectorPaint = paint;
        paint.setColor(this.selectorColor);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setFlags(1);
        paint.setStrokeWidth(6.0f);
        Paint paint2 = new Paint();
        this.outlinePaint = paint2;
        paint2.setColor(color);
        paint2.setStyle(style);
        paint2.setFlags(1);
        paint2.setStrokeWidth(6.0f);
        rectF.top = 6.0f;
        rectF.left = 6.0f;
        try {
            m19539h(typedArrayObtainStyledAttributes);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ PillRadioGroup(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
