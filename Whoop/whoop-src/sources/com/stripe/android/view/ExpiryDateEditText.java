package com.stripe.android.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import j93.InterfaceC21493z;
import java.util.Calendar;
import l83.C23467m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import rq0.ViewOnFocusChangeListenerC31661e0;
import rx0.C31901f;
import s40.C32150g;
import s40.C32164l0;
import wb3.AbstractC37056f;
import y00.AbstractC38833g;
import y00.C38806d2;
import y00.C38816e2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0006R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lcom/stripe/android/view/ExpiryDateEditText;", "Lcom/stripe/android/view/StripeEditText;", "", "include", "Ll83/a0;", "setIncludeSeparatorGaps", "(Z)V", "Lkotlin/Function0;", "V", "Lc93/a;", "getCompletionCallback$payments_core_release", "()Lc93/a;", "setCompletionCallback$payments_core_release", "(Lc93/a;)V", "completionCallback", "<set-?>", "a0", "Lf93/d;", "getIncludeSeparatorGaps$payments_core_release", "()Z", "setIncludeSeparatorGaps$payments_core_release", "includeSeparatorGaps", "Ly00/e2;", "getValidatedDate", "()Ly00/e2;", "validatedDate", "", "getAccessibilityText", "()Ljava/lang/String;", "accessibilityText", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ExpiryDateEditText extends StripeEditText {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ InterfaceC21493z[] f22539d0 = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(ExpiryDateEditText.class, "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release()Z", 0))};

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public /* synthetic */ InterfaceC4339a completionCallback;

    /* JADX INFO: renamed from: W */
    public boolean f22541W;

    /* JADX INFO: renamed from: a0 */
    public final C32150g f22542a0;

    /* JADX INFO: renamed from: b0 */
    public final int f22543b0;

    /* JADX INFO: renamed from: c0 */
    public String f22544c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC22676k.m65750j(context, "context");
        this.completionCallback = new C31901f(24);
        this.f22542a0 = new C32150g(this);
        this.f22543b0 = context.getResources().getInteger(R.integer.stripe_date_digits_length);
        this.f22544c0 = "/";
        m16927c();
        m16916d(false);
        addTextChangedListener(new C32164l0(this));
        setAutofillHints("creditCardExpirationDate");
        getInternalFocusChangeListeners().add(new ViewOnFocusChangeListenerC31661e0(this, 4));
        setLayoutDirection(0);
    }

    /* JADX INFO: renamed from: d */
    public final void m16916d(boolean z4) {
        this.f22544c0 = z4 ? " / " : "/";
        setFilters((InputFilter[]) AbstractC37056f.m118958J(new InputFilter.LengthFilter(this.f22544c0.length() + this.f22543b0)).toArray(new InputFilter.LengthFilter[0]));
    }

    @Override // com.stripe.android.view.StripeEditText
    public String getAccessibilityText() {
        String string = getResources().getString(R.string.stripe_acc_label_expiry_date_node, getText());
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: getCompletionCallback$payments_core_release, reason: from getter */
    public final InterfaceC4339a getCompletionCallback() {
        return this.completionCallback;
    }

    public final boolean getIncludeSeparatorGaps$payments_core_release() {
        return ((Boolean) this.f22542a0.getValue(this, f22539d0[0])).booleanValue();
    }

    public final C38816e2 getValidatedDate() {
        Object objM107888l;
        boolean z4 = this.f22541W;
        if (!z4) {
            if (z4) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }
        C38806d2 c38806d2 = C38806d2.f166997f;
        C38806d2 c38806d2M124345a = AbstractC38833g.m124345a(getFieldText$payments_core_release());
        String str = c38806d2M124345a.f166998a;
        String str2 = c38806d2M124345a.f166999b;
        try {
            int i13 = Integer.parseInt(str);
            int i14 = Integer.parseInt(str2);
            Calendar calendar = Calendar.getInstance();
            AbstractC22676k.m65749i(calendar, "getInstance(...)");
            int i15 = calendar.get(1);
            int i16 = i15 / 100;
            int i17 = i15 % 100;
            if (i17 > 80 && i14 < 20) {
                i16++;
            } else if (i17 < 20 && i14 > 80) {
                i16--;
            }
            objM107888l = new C38816e2(i13, (i16 * 100) + i14);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        return (C38816e2) (objM107888l instanceof C23467m ? null : objM107888l);
    }

    public final void setCompletionCallback$payments_core_release(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.completionCallback = interfaceC4339a;
    }

    public final void setIncludeSeparatorGaps(boolean include) {
        setIncludeSeparatorGaps$payments_core_release(include);
    }

    public final void setIncludeSeparatorGaps$payments_core_release(boolean z4) {
        this.f22542a0.setValue(this, f22539d0[0], Boolean.valueOf(z4));
    }
}
