package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p027b3.AbstractC2378g1;
import p137f5.AbstractC14085d;
import p137f5.C14084c;
import p474s.AbstractC31967i2;
import p474s.AbstractC31971j2;
import p474s.AbstractC32004s;
import p474s.C31980m;
import p474s.C31981m0;
import p474s.C32000r;
import p474s.C32001r0;
import p474s.C32009t0;
import p474s.C32020w;
import p474s.InterfaceC32005s0;
import p505ts.AbstractC34132o;
import p543v4.AbstractC35646e;
import p550vd.AbstractC35902e;
import p550vd.AbstractC35903f;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes5.dex */
public class AppCompatTextView extends TextView {
    private final C31980m mBackgroundTintHelper;
    private C32000r mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<AbstractC14085d> mPrecomputedTextFuture;
    private InterfaceC32005s0 mSuperCaller;
    private final C31981m0 mTextClassifierHelper;
    private final C32001r0 mTextHelper;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C32000r getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C32000r(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            c31980m.m99468a();
        }
        C32001r0 c32001r0 = this.mTextHelper;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC32005s0 getSuperCaller() {
        if (this.mSuperCaller == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.mSuperCaller = new C32009t0(this);
            } else {
                this.mSuperCaller = new C32020w(this);
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            return c31980m.m99469b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            return c31980m.m99470c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m99523d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m99524e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<AbstractC14085d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                PrecomputedText.Params textMetricsParams = getTextMetricsParams();
                textMetricsParams.getTextPaint();
                textMetricsParams.getTextDirection();
                textMetricsParams.getBreakStrategy();
                textMetricsParams.getHyphenationFrequency();
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public C14084c getTextMetricsParamsCompat() {
        return new C14084c(getTextMetricsParams());
    }

    public boolean isEmojiCompatEnabled() {
        return ((AbstractC35903f) getEmojiTextViewHelper().f132803b.f67507x).mo59957x();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC35902e.m113956a0(editorInfo, getText());
        }
        AbstractC32004s.m99548q(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 || i13 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        C32001r0 c32001r0 = this.mTextHelper;
        if (c32001r0 != null) {
            c32001r0.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i13, int i14) {
        Future<AbstractC14085d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                PrecomputedText.Params textMetricsParams = getTextMetricsParams();
                textMetricsParams.getTextPaint();
                textMetricsParams.getTextDirection();
                textMetricsParams.getBreakStrategy();
                textMetricsParams.getHyphenationFrequency();
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i13, i14);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        super.onTextChanged(charSequence, i13, i14, i15);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().m99518c(z4);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i13, int i14, int i15, int i16) throws IllegalArgumentException {
        super.setAutoSizeTextTypeUniformWithConfiguration(i13, i14, i15, i16);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i13) throws IllegalArgumentException {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i13);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i13) {
        super.setAutoSizeTextTypeWithDefaults(i13);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            c31980m.m99472e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            c31980m.m99473f(i13);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.mTextHelper;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.mTextHelper;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.mTextHelper;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.mTextHelper;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().m99519d(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m99516a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i13) {
        getSuperCaller().mo99558c(i13);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i13) {
        getSuperCaller().mo99556a(i13);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i13) {
        AbstractC35902e.m113958b0(this, i13);
    }

    public void setPrecomputedText(AbstractC14085d abstractC14085d) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        PrecomputedText.Params textMetricsParams = getTextMetricsParams();
        textMetricsParams.getTextPaint();
        textMetricsParams.getTextDirection();
        textMetricsParams.getBreakStrategy();
        textMetricsParams.getHyphenationFrequency();
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            c31980m.m99475h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            c31980m.m99476i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m99527h(colorStateList);
        this.mTextHelper.m99522b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m99528i(mode);
        this.mTextHelper.m99522b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        C32001r0 c32001r0 = this.mTextHelper;
        if (c32001r0 != null) {
            c32001r0.m99526g(context, i13);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<AbstractC14085d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C14084c c14084c) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c14084c.f50613b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i13 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i13 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i13 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i13 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i13 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i13 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i13 = 7;
            }
        }
        setTextDirection(i13);
        getPaint().set(c14084c.f50612a);
        setBreakStrategy(c14084c.f50614c);
        setHyphenationFrequency(c14084c.f50615d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i13, float f13) {
        super.setTextSize(i13, f13);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i13) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i13 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC34132o abstractC34132o = AbstractC35646e.f151456a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i13);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i13);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC31971j2.m99463a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        AbstractC31967i2.m99459a(getContext(), this);
        C31980m c31980m = new C31980m(this);
        this.mBackgroundTintHelper = c31980m;
        c31980m.m99471d(attributeSet, i13);
        C32001r0 c32001r0 = new C32001r0(this);
        this.mTextHelper = c32001r0;
        c32001r0.m99525f(attributeSet, i13);
        c32001r0.m99522b();
        this.mTextClassifierHelper = new C31981m0();
        getEmojiTextViewHelper().m99517b(attributeSet, i13);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i13, float f13) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            getSuperCaller().mo99557b(i13, f13);
        } else if (i14 >= 34) {
            AbstractC2378g1.m7345t(this, i13, f13);
        } else {
            AbstractC35902e.m113958b0(this, Math.round(TypedValue.applyDimension(i13, f13, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i13 != 0 ? AbstractC30060g.m92133x(context, i13) : null, i14 != 0 ? AbstractC30060g.m92133x(context, i14) : null, i15 != 0 ? AbstractC30060g.m92133x(context, i15) : null, i16 != 0 ? AbstractC30060g.m92133x(context, i16) : null);
        C32001r0 c32001r0 = this.mTextHelper;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i13, int i14, int i15, int i16) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i13 != 0 ? AbstractC30060g.m92133x(context, i13) : null, i14 != 0 ? AbstractC30060g.m92133x(context, i14) : null, i15 != 0 ? AbstractC30060g.m92133x(context, i15) : null, i16 != 0 ? AbstractC30060g.m92133x(context, i16) : null);
        C32001r0 c32001r0 = this.mTextHelper;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }
}
