package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.whoop.android.R;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p235iz.C21039c;
import p412q3.C29875i;
import p479s4.AbstractC32122c;
import p499t9.C33623c0;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.C32158i1;
import y00.C38915o4;
import y00.C39013z3;
import y00.EnumC38853i;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\u00128G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lcom/stripe/android/view/MaskedCardView;", "Landroid/widget/LinearLayout;", "", "selected", "Ll83/a0;", "setSelected", "(Z)V", "Ly00/o4;", "paymentMethod", "setPaymentMethod", "(Ly00/o4;)V", "Ly00/i;", "value", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ly00/i;", "getCardBrand", "()Ly00/i;", "cardBrand", "", "x", "Ljava/lang/String;", "getLast4", "()Ljava/lang/String;", "last4", "Liz/c;", "y", "Liz/c;", "getViewBinding$payments_core_release", "()Liz/c;", "viewBinding", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class MaskedCardView extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public EnumC38853i cardBrand;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public String last4;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final C21039c viewBinding;

    /* JADX INFO: renamed from: z */
    public final C29875i f22548z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        this.cardBrand = EnumC38853i.Unknown;
        LayoutInflater.from(context).inflate(R.layout.stripe_masked_card_view, this);
        int i13 = R.id.brand_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC34235f.m108203J(this, R.id.brand_icon);
        if (appCompatImageView != null) {
            i13 = R.id.check_icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) AbstractC34235f.m108203J(this, R.id.check_icon);
            if (appCompatImageView2 != null) {
                i13 = R.id.details;
                AppCompatTextView appCompatTextView = (AppCompatTextView) AbstractC34235f.m108203J(this, R.id.details);
                if (appCompatTextView != null) {
                    this.viewBinding = new C21039c(this, appCompatImageView, appCompatImageView2, appCompatTextView);
                    C32158i1 c32158i1 = new C32158i1(context);
                    Resources resources = getResources();
                    AbstractC22676k.m65749i(resources, "getResources(...)");
                    this.f22548z = new C29875i(resources, c32158i1);
                    int i14 = c32158i1.f133214a;
                    appCompatImageView.setImageTintList(ColorStateList.valueOf(i14));
                    appCompatImageView2.setImageTintList(ColorStateList.valueOf(i14));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: a */
    public final void m16917a() {
        int i13;
        SpannableString spannableString;
        C21039c c21039c = this.viewBinding;
        AppCompatImageView appCompatImageView = c21039c.f79770b;
        Context context = getContext();
        switch (this.cardBrand.ordinal()) {
            case 0:
                i13 = R.drawable.stripe_ic_visa_template_32;
                break;
            case 1:
                i13 = R.drawable.stripe_ic_mastercard_template_32;
                break;
            case 2:
                i13 = R.drawable.stripe_ic_amex_template_32;
                break;
            case 3:
                i13 = R.drawable.stripe_ic_discover_template_32;
                break;
            case 4:
                i13 = R.drawable.stripe_ic_jcb_template_32;
                break;
            case 5:
                i13 = R.drawable.stripe_ic_diners_template_32;
                break;
            case 6:
                i13 = R.drawable.stripe_ic_unionpay_template_32;
                break;
            case 7:
                i13 = R.drawable.stripe_ic_cartebancaire_template_32;
                break;
            case 8:
                i13 = R.drawable.stripe_ic_interac_template_32;
                break;
            case 9:
                i13 = R.drawable.stripe_ic_unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageDrawable(AbstractC32122c.getDrawable(context, i13));
        AppCompatTextView appCompatTextView = c21039c.f79772d;
        EnumC38853i brand = this.cardBrand;
        String str = this.last4;
        boolean zIsSelected = isSelected();
        C29875i c29875i = this.f22548z;
        c29875i.getClass();
        AbstractC22676k.m65750j(brand, "brand");
        String str2 = brand.f167261x;
        int length = str2.length();
        if (str == null || AbstractC39414r.m125890i0(str)) {
            spannableString = new SpannableString(str2);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), 0, length, 33);
        } else {
            String string = ((Resources) c29875i.f122095w).getString(R.string.stripe_card_ending_in, str2, str);
            AbstractC22676k.m65749i(string, "getString(...)");
            int length2 = string.length();
            int iM125888g0 = AbstractC39414r.m125888g0(string, str, 0, false, 6);
            int length3 = str.length() + iM125888g0;
            int iM125888g1 = AbstractC39414r.m125888g0(string, str2, 0, false, 6);
            int length4 = str2.length() + iM125888g1;
            C32158i1 c32158i1 = (C32158i1) c29875i.f122096x;
            int i14 = zIsSelected ? c32158i1.f133214a : c32158i1.f133215b;
            int i15 = zIsSelected ? c32158i1.f133216c : c32158i1.f133217d;
            spannableString = new SpannableString(string);
            spannableString.setSpan(new ForegroundColorSpan(i15), 0, length2, 33);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), iM125888g1, length4, 33);
            spannableString.setSpan(new ForegroundColorSpan(i14), iM125888g1, length4, 33);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), iM125888g0, length3, 33);
            spannableString.setSpan(new ForegroundColorSpan(i14), iM125888g0, length3, 33);
        }
        appCompatTextView.setText(spannableString);
    }

    public final EnumC38853i getCardBrand() {
        return this.cardBrand;
    }

    public final String getLast4() {
        return this.last4;
    }

    /* JADX INFO: renamed from: getViewBinding$payments_core_release, reason: from getter */
    public final C21039c getViewBinding() {
        return this.viewBinding;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028 A[PHI: r0
      0x0028: PHI (r0v4 y00.i) = (r0v3 y00.i), (r0v6 y00.i) binds: [B:10:0x001d, B:14:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public final void setPaymentMethod(C38915o4 paymentMethod) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        C39013z3 c39013z3 = paymentMethod.f167514H;
        C33623c0 c33623c0 = EnumC38853i.f167238M;
        String str = c39013z3 != null ? c39013z3.f167917L : null;
        c33623c0.getClass();
        EnumC38853i enumC38853iM106236i = C33623c0.m106236i(str);
        EnumC38853i enumC38853i = EnumC38853i.Unknown;
        if (enumC38853iM106236i == enumC38853i) {
            enumC38853iM106236i = null;
        }
        if (enumC38853iM106236i != null) {
            enumC38853i = enumC38853iM106236i;
        } else {
            enumC38853iM106236i = c39013z3 != null ? c39013z3.f167918w : null;
            if (enumC38853iM106236i != null) {
                enumC38853i = enumC38853iM106236i;
            }
        }
        this.cardBrand = enumC38853i;
        this.last4 = c39013z3 != null ? c39013z3.f167913H : null;
        m16917a();
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        this.viewBinding.f79771c.setVisibility(isSelected() ? 0 : 4);
        m16917a();
    }
}
