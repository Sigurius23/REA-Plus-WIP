package com.stripe.android.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import java.io.IOException;
import java.util.ArrayList;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rx0.C31901f;
import s32.C32112d;
import s40.C32141d;
import s40.C32144e;
import s40.C32147f;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001R0\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText;", "Lcom/stripe/android/view/StripeEditText;", "Lkotlin/Function1;", "Ls40/d;", "Ll83/a0;", "W", "Lkotlin/jvm/functions/Function1;", "getOnBankChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnBankChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "onBankChangedCallback", "Lkotlin/Function0;", "a0", "Lc93/a;", "getOnCompletedCallback", "()Lc93/a;", "setOnCompletedCallback", "(Lc93/a;)V", "onCompletedCallback", "getBank", "()Ls40/d;", "bank", "", "getBsb$payments_core_release", "()Ljava/lang/String;", "bsb", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class BecsDebitBsbEditText extends StripeEditText {

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ int f22466b0 = 0;

    /* JADX INFO: renamed from: V */
    public final C32144e f22467V;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public Function1 onBankChangedCallback;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public InterfaceC4339a onCompletedCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC22676k.m65750j(context, "context");
        this.f22467V = new C32144e(context);
        this.onBankChangedCallback = new C32112d(1);
        this.onCompletedCallback = new C31901f(21);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(7)});
        setInputType(2);
        addTextChangedListener(new C32147f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C32141d getBank() {
        String bsb = getFieldText$payments_core_release();
        C32144e c32144e = this.f22467V;
        c32144e.getClass();
        AbstractC22676k.m65750j(bsb, "bsb");
        ArrayList arrayList = c32144e.f133187a;
        C32141d c32141d = C32144e.f133186c;
        Object obj = null;
        if (!c32144e.f133188b) {
            c32141d = null;
        }
        for (Object obj2 : AbstractC25265s.m74129g1(arrayList, AbstractC37056f.m118960L(c32141d))) {
            if (AbstractC39421y.m125930O(bsb, ((C32141d) obj2).f133178w, false)) {
                obj = obj2;
                break;
            }
        }
        return (C32141d) obj;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16896e() {
        return getBank() != null && getFieldText$payments_core_release().length() == 7;
    }

    public final String getBsb$payments_core_release() throws IOException {
        String string;
        if (getFieldText$payments_core_release().length() < 2) {
            string = getResources().getString(R.string.stripe_becs_widget_bsb_incomplete);
        } else if (getBank() == null) {
            string = getResources().getString(R.string.stripe_becs_widget_bsb_invalid);
        } else {
            string = getFieldText$payments_core_release().length() < 7 ? getResources().getString(R.string.stripe_becs_widget_bsb_incomplete) : null;
        }
        setErrorMessage$payments_core_release(string);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        StringBuilder sb4 = new StringBuilder();
        int length = fieldText$payments_core_release.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = fieldText$payments_core_release.charAt(i13);
            if (Character.isDigit(cCharAt)) {
                sb4.append(cCharAt);
            }
        }
        String string2 = sb4.toString();
        if (m16896e()) {
            return string2;
        }
        return null;
    }

    public final Function1 getOnBankChangedCallback() {
        return this.onBankChangedCallback;
    }

    public final InterfaceC4339a getOnCompletedCallback() {
        return this.onCompletedCallback;
    }

    public final void setOnBankChangedCallback(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.onBankChangedCallback = function1;
    }

    public final void setOnCompletedCallback(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.onCompletedCallback = interfaceC4339a;
    }
}
