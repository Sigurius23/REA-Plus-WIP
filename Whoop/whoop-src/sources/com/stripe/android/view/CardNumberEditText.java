package com.stripe.android.view;

import al0.C0971f;
import android.content.Context;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.lifecycle.InterfaceC1583f2;
import b10.C2222b;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.C2996c2;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import hc3.AbstractC17182o;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.AbstractC25265s;
import m83.C25235a0;
import m83.C25271y;
import p279kd.C22379f;
import p465rm.C31559p;
import p664yy.C39865j;
import p695zx.AbstractC41187i;
import p695zx.C41185g;
import p695zx.C41186h;
import p695zx.C41192n;
import p695zx.C41193o;
import p695zx.C41197s;
import p695zx.C41198t;
import p695zx.InterfaceC41202x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29934u0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r12.C30856a;
import rq0.ViewOnFocusChangeListenerC31661e0;
import rx0.C31901f;
import s32.C32112d;
import s40.AbstractC32145e0;
import s40.C32181u;
import s40.C32183v;
import y00.C38783b;
import y00.EnumC38853i;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002abR\"\u0010\t\u001a\u00020\u00028G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@@X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RB\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010*\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019RB\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R6\u00106\u001a\b\u0012\u0004\u0012\u00020\u00120/2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120/8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105RN\u0010:\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120/\u0012\u0004\u0012\u00020\u001e0\u001d2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120/\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010!\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R(\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001e0;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR \u0010I\u001a\u00020C8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010\u001b\u001a\u0004\bF\u0010GR.\u0010N\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010!\u001a\u0004\bL\u0010#\"\u0004\bM\u0010%R\u0014\u0010R\u001a\u00020O8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010V\u001a\u0004\u0018\u00010S8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010QR\u0014\u0010`\u001a\u00020]8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006c"}, m65681d2 = {"Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/StripeEditText;", "Lq83/j;", "V", "Lq83/j;", "getWorkContext", "()Lq83/j;", "setWorkContext", "(Lq83/j;)V", "workContext", "Landroidx/lifecycle/f2;", "c0", "Landroidx/lifecycle/f2;", "getViewModelStoreOwner$payments_core_release", "()Landroidx/lifecycle/f2;", "setViewModelStoreOwner$payments_core_release", "(Landroidx/lifecycle/f2;)V", "viewModelStoreOwner", "Ly00/i;", "value", "d0", "Ly00/i;", "getCardBrand", "()Ly00/i;", "setCardBrand$payments_core_release", "(Ly00/i;)V", "getCardBrand$annotations", "()V", "cardBrand", "Lkotlin/Function1;", "Ll83/a0;", "callback", "e0", "Lkotlin/jvm/functions/Function1;", "getBrandChangeCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setBrandChangeCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "brandChangeCallback", "f0", "getImplicitCardBrandForCbc$payments_core_release", "setImplicitCardBrandForCbc$payments_core_release", "implicitCardBrandForCbc", "g0", "getImplicitCardBrandChangeCallback$payments_core_release", "setImplicitCardBrandChangeCallback$payments_core_release", "implicitCardBrandChangeCallback", "", "h0", "Ljava/util/List;", "getPossibleCardBrands$payments_core_release", "()Ljava/util/List;", "setPossibleCardBrands$payments_core_release", "(Ljava/util/List;)V", "possibleCardBrands", "i0", "getPossibleCardBrandsCallback$payments_core_release", "setPossibleCardBrandsCallback$payments_core_release", "possibleCardBrandsCallback", "Lkotlin/Function0;", "j0", "Lc93/a;", "getCompletionCallback$payments_core_release", "()Lc93/a;", "setCompletionCallback$payments_core_release", "(Lc93/a;)V", "completionCallback", "Lzx/s;", "m0", "Lzx/s;", "getAccountRangeService$payments_core_release", "()Lzx/s;", "getAccountRangeService$payments_core_release$annotations", "accountRangeService", "", "n0", "isLoadingCallback$payments_core_release", "setLoadingCallback$payments_core_release", "isLoadingCallback", "", "getPanLength$payments_core_release", "()I", "panLength", "Lzx/h;", "getValidatedCardNumber$payments_core_release", "()Lzx/h;", "validatedCardNumber", "", "getAccessibilityText", "()Ljava/lang/String;", "accessibilityText", "getFormattedPanLength", "formattedPanLength", "Lzx/g;", "getUnvalidatedCardNumber", "()Lzx/g;", "unvalidatedCardNumber", "s40/v", "s40/u", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CardNumberEditText extends StripeEditText {

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ int f22507p0 = 0;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public InterfaceC30063j workContext;

    /* JADX INFO: renamed from: W */
    public final C41192n f22509W;

    /* JADX INFO: renamed from: a0 */
    public final C39865j f22510a0;

    /* JADX INFO: renamed from: b0 */
    public final C2222b f22511b0;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public InterfaceC1583f2 viewModelStoreOwner;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public EnumC38853i cardBrand;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public /* synthetic */ Function1 brandChangeCallback;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public EnumC38853i implicitCardBrandForCbc;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public Function1 implicitCardBrandChangeCallback;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public List possibleCardBrands;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public /* synthetic */ Function1 possibleCardBrandsCallback;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public /* synthetic */ InterfaceC4339a completionCallback;

    /* JADX INFO: renamed from: k0 */
    public boolean f22520k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f22521l0;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public final C41197s accountRangeService;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public /* synthetic */ Function1 isLoadingCallback;

    /* JADX INFO: renamed from: o0 */
    public C2996c2 f22524o0;

    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        AbstractC22676k.m65750j(context, "context");
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 uiContext = AbstractC17182o.f65999a;
        ExecutorC22364d workContext = ExecutorC22364d.f87316w;
        C0971f c0971f = new C0971f(context, 9);
        C41192n cardAccountRangeRepository = (C41192n) new C41193o(context, C25235a0.f99113w).f177722e.getValue();
        C41198t c41198t = new C41198t();
        C39865j c39865j = new C39865j();
        C2222b c2222b = new C2222b(context, new C31559p(c0971f, 8));
        AbstractC22676k.m65750j(uiContext, "uiContext");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(cardAccountRangeRepository, "cardAccountRangeRepository");
        super(context, attributeSet, R.attr.editTextStyle);
        this.workContext = workContext;
        this.f22509W = cardAccountRangeRepository;
        this.f22510a0 = c39865j;
        this.f22511b0 = c2222b;
        this.viewModelStoreOwner = null;
        EnumC38853i enumC38853i = EnumC38853i.Unknown;
        this.cardBrand = enumC38853i;
        this.brandChangeCallback = new C32112d(2);
        this.implicitCardBrandForCbc = enumC38853i;
        this.implicitCardBrandChangeCallback = new C32112d(3);
        this.possibleCardBrands = C25271y.f99162w;
        this.possibleCardBrandsCallback = new C32112d(4);
        this.completionCallback = new C31901f(22);
        this.accountRangeService = new C41197s(cardAccountRangeRepository, uiContext, workContext, c41198t, null, null, new C29934u0(this, 16), null, 176);
        this.isLoadingCallback = new C32112d(5);
        m16927c();
        setErrorMessage(getResources().getString(R.string.stripe_invalid_card_number));
        addTextChangedListener(new C32181u(this));
        getInternalFocusChangeListeners().add(new ViewOnFocusChangeListenerC31661e0(this, 1));
        setAutofillHints("creditCardNumber");
        m16908f(this);
        setLayoutDirection(0);
    }

    /* JADX INFO: renamed from: d */
    public static void m16906d(CardNumberEditText cardNumberEditText, boolean z4) {
        if (z4) {
            return;
        }
        C41185g unvalidatedCardNumber = cardNumberEditText.getUnvalidatedCardNumber();
        int panLength$payments_core_release = cardNumberEditText.getPanLength$payments_core_release();
        String str = unvalidatedCardNumber.f177696d;
        if (str.length() == panLength$payments_core_release || AbstractC39414r.m125890i0(str)) {
            return;
        }
        cardNumberEditText.setShouldShowError(true);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m16908f(CardNumberEditText cardNumberEditText) {
        int formattedPanLength = cardNumberEditText.getFormattedPanLength();
        cardNumberEditText.getClass();
        cardNumberEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(formattedPanLength)});
    }

    public static /* synthetic */ void getAccountRangeService$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getCardBrand$annotations() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    private final int getFormattedPanLength() {
        int panLength$payments_core_release = getPanLength$payments_core_release();
        Set set = AbstractC41187i.f177702a;
        Set set2 = (Set) AbstractC41187i.f177703b.get(Integer.valueOf(getPanLength$payments_core_release()));
        if (set2 == null) {
            set2 = AbstractC41187i.f177702a;
        }
        return set2.size() + panLength$payments_core_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C41185g getUnvalidatedCardNumber() {
        return new C41185g(getFieldText$payments_core_release());
    }

    @Override // com.stripe.android.view.StripeEditText
    public String getAccessibilityText() {
        String string = getResources().getString(R.string.stripe_acc_label_card_number_node, getText());
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: getAccountRangeService$payments_core_release, reason: from getter */
    public final C41197s getAccountRangeService() {
        return this.accountRangeService;
    }

    /* JADX INFO: renamed from: getBrandChangeCallback$payments_core_release, reason: from getter */
    public final Function1 getBrandChangeCallback() {
        return this.brandChangeCallback;
    }

    public final EnumC38853i getCardBrand() {
        return this.cardBrand;
    }

    /* JADX INFO: renamed from: getCompletionCallback$payments_core_release, reason: from getter */
    public final InterfaceC4339a getCompletionCallback() {
        return this.completionCallback;
    }

    /* JADX INFO: renamed from: getImplicitCardBrandChangeCallback$payments_core_release, reason: from getter */
    public final Function1 getImplicitCardBrandChangeCallback() {
        return this.implicitCardBrandChangeCallback;
    }

    /* JADX INFO: renamed from: getImplicitCardBrandForCbc$payments_core_release, reason: from getter */
    public final EnumC38853i getImplicitCardBrandForCbc() {
        return this.implicitCardBrandForCbc;
    }

    public final int getPanLength$payments_core_release() {
        C41197s c41197s = this.accountRangeService;
        C38783b c38783bM133833a = c41197s.m133833a();
        if (c38783bM133833a != null) {
            return c38783bM133833a.f166933x;
        }
        InterfaceC41202x interfaceC41202x = c41197s.f177733d;
        C41185g cardNumber = getUnvalidatedCardNumber();
        C41198t c41198t = (C41198t) interfaceC41202x;
        c41198t.getClass();
        AbstractC22676k.m65750j(cardNumber, "cardNumber");
        C38783b c38783b = (C38783b) AbstractC25265s.m74100H0(c41198t.m133837a(cardNumber));
        if (c38783b != null) {
            return c38783b.f166933x;
        }
        return 16;
    }

    public final List<EnumC38853i> getPossibleCardBrands$payments_core_release() {
        return this.possibleCardBrands;
    }

    /* JADX INFO: renamed from: getPossibleCardBrandsCallback$payments_core_release, reason: from getter */
    public final Function1 getPossibleCardBrandsCallback() {
        return this.possibleCardBrandsCallback;
    }

    public final C41186h getValidatedCardNumber$payments_core_release() {
        C41185g unvalidatedCardNumber = getUnvalidatedCardNumber();
        int panLength$payments_core_release = getPanLength$payments_core_release();
        String str = unvalidatedCardNumber.f177696d;
        if (panLength$payments_core_release >= 14 && str.length() == panLength$payments_core_release && unvalidatedCardNumber.f177700h) {
            return new C41186h(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: getViewModelStoreOwner$payments_core_release, reason: from getter */
    public final InterfaceC1583f2 getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    public final InterfaceC30063j getWorkContext() {
        return this.workContext;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22524o0 = AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(this.workContext), null, null, new C22379f(this, (InterfaceC30057d) null, 29), 3);
        AbstractC32145e0.m100097d(this, this.viewModelStoreOwner, new C30856a(this, 16));
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public final void onDetachedFromWindow() {
        C2996c2 c2996c2 = this.f22524o0;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        this.f22524o0 = null;
        C41197s c41197s = this.accountRangeService;
        InterfaceC3027k1 interfaceC3027k1 = c41197s.f177744o;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        c41197s.f177744o = null;
        super.onDetachedFromWindow();
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable superState;
        C32183v c32183v = parcelable instanceof C32183v ? (C32183v) parcelable : null;
        this.f22521l0 = c32183v != null ? c32183v.f133293x : false;
        if (c32183v != null && (superState = c32183v.getSuperState()) != null) {
            parcelable = superState;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C32183v(super.onSaveInstanceState(), this.f22521l0);
    }

    public final void setBrandChangeCallback$payments_core_release(Function1 callback) {
        AbstractC22676k.m65750j(callback, "callback");
        this.brandChangeCallback = callback;
        callback.invoke(this.cardBrand);
    }

    public final void setCardBrand$payments_core_release(EnumC38853i value) {
        AbstractC22676k.m65750j(value, "value");
        EnumC38853i enumC38853i = this.cardBrand;
        this.cardBrand = value;
        if (value != enumC38853i) {
            this.brandChangeCallback.invoke(value);
            m16908f(this);
        }
    }

    public final void setCompletionCallback$payments_core_release(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.completionCallback = interfaceC4339a;
    }

    public final void setImplicitCardBrandChangeCallback$payments_core_release(Function1 callback) {
        AbstractC22676k.m65750j(callback, "callback");
        this.implicitCardBrandChangeCallback = callback;
        callback.invoke(this.implicitCardBrandForCbc);
    }

    public final void setImplicitCardBrandForCbc$payments_core_release(EnumC38853i value) {
        AbstractC22676k.m65750j(value, "value");
        EnumC38853i enumC38853i = this.implicitCardBrandForCbc;
        this.implicitCardBrandForCbc = value;
        if (value != enumC38853i) {
            this.implicitCardBrandChangeCallback.invoke(value);
            m16908f(this);
        }
    }

    public final void setLoadingCallback$payments_core_release(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.isLoadingCallback = function1;
    }

    public final void setPossibleCardBrands$payments_core_release(List<? extends EnumC38853i> value) {
        AbstractC22676k.m65750j(value, "value");
        List list = this.possibleCardBrands;
        this.possibleCardBrands = value;
        if (value.equals(list)) {
            return;
        }
        this.possibleCardBrandsCallback.invoke(value);
        m16908f(this);
    }

    public final void setPossibleCardBrandsCallback$payments_core_release(Function1 callback) {
        AbstractC22676k.m65750j(callback, "callback");
        this.possibleCardBrandsCallback = callback;
        callback.invoke(this.possibleCardBrands);
    }

    public final void setViewModelStoreOwner$payments_core_release(InterfaceC1583f2 interfaceC1583f2) {
        this.viewModelStoreOwner = interfaceC1583f2;
    }

    public final void setWorkContext(InterfaceC30063j interfaceC30063j) {
        AbstractC22676k.m65750j(interfaceC30063j, "<set-?>");
        this.workContext = interfaceC30063j;
    }
}
