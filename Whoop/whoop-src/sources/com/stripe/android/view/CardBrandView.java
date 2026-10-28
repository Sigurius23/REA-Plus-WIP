package com.stripe.android.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import java.util.ArrayList;
import java.util.List;
import jo.ViewOnClickListenerC21821j;
import m83.AbstractC25265s;
import p032bc.AbstractC2938a0;
import p032bc.AbstractC2974w;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.C32153h;
import s40.C32156i;
import s40.C32159j;
import s40.C32161k;
import y00.C38787b3;
import y00.C38942r4;
import y00.EnumC38853i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001d#R$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0005\"\u0004\b\u0018\u0010\u0007R$\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0005\"\u0004\b\u001b\u0010\u0007R$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, m65681d2 = {"Lcom/stripe/android/view/CardBrandView;", "Landroid/widget/FrameLayout;", "", "value", "isCbcEligible", "()Z", "setCbcEligible", "(Z)V", "Ly00/i;", "getBrand", "()Ly00/i;", "setBrand", "(Ly00/i;)V", "brand", "", "getPossibleBrands", "()Ljava/util/List;", "setPossibleBrands", "(Ljava/util/List;)V", "possibleBrands", "getMerchantPreferredNetworks", "setMerchantPreferredNetworks", "merchantPreferredNetworks", "getShouldShowCvc", "setShouldShowCvc", "shouldShowCvc", "getShouldShowErrorIcon", "setShouldShowErrorIcon", "shouldShowErrorIcon", "Ls40/k;", "getState", "()Ls40/k;", "setState", "(Ls40/k;)V", "state", "s40/j", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CardBrandView extends FrameLayout {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ int f22473E = 0;

    /* JADX INFO: renamed from: w */
    public final ImageView f22474w;

    /* JADX INFO: renamed from: x */
    public final ImageView f22475x;

    /* JADX INFO: renamed from: y */
    public final ListPopupWindow f22476y;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f22477z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        LayoutInflater.from(context).inflate(R.layout.stripe_card_brand_view, this);
        int i13 = R.id.chevron;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(this, R.id.chevron);
        if (imageView != null) {
            i13 = R.id.icon;
            ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(this, R.id.icon);
            if (imageView2 != null) {
                this.f22474w = imageView2;
                this.f22475x = imageView;
                this.f22476y = new ListPopupWindow(context);
                this.f22477z = AbstractC13091v.m36593c(new C32161k());
                setClickable(false);
                setFocusable(false);
                m16899c();
                m16902f(false);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: a */
    public static void m16897a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            AbstractC2938a0.f11825c.remove(viewGroup);
            ArrayList arrayList = (ArrayList) AbstractC2938a0.m8569b().get(viewGroup);
            if (arrayList != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    ((AbstractC2974w) arrayList2.get(size)).mo8597o(viewGroup);
                }
            }
            AbstractC2938a0.m8568a(viewGroup, null);
        }
    }

    private final C32161k getState() {
        return (C32161k) this.f22477z.getValue();
    }

    private final void setState(C32161k c32161k) {
        this.f22477z.m36570j(c32161k);
    }

    /* JADX INFO: renamed from: b */
    public final C38787b3 m16898b() {
        String str;
        String str2;
        EnumC38853i brand = getBrand();
        EnumC38853i enumC38853i = EnumC38853i.Unknown;
        if (brand == enumC38853i) {
            brand = null;
        }
        C38787b3 c38787b3 = (brand == null || (str2 = brand.f167260w) == null) ? null : new C38787b3(str2);
        if (!getState().f133225w || getPossibleBrands().size() <= 1) {
            c38787b3 = null;
        }
        if (c38787b3 != null) {
            return c38787b3;
        }
        EnumC38853i enumC38853i2 = (EnumC38853i) AbstractC25265s.m74100H0(getMerchantPreferredNetworks());
        if (enumC38853i2 != null) {
            if (enumC38853i2 == enumC38853i) {
                enumC38853i2 = null;
            }
            if (enumC38853i2 != null && (str = enumC38853i2.f167260w) != null) {
                return new C38787b3(str);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m16899c() {
        EnumC38853i enumC38853i;
        if (getState().f133221E.size() > 1) {
            enumC38853i = getState().f133228z;
            List possibleBrands = getState().f133221E;
            List merchantPreferredBrands = getState().f133222F;
            AbstractC22676k.m65750j(possibleBrands, "possibleBrands");
            AbstractC22676k.m65750j(merchantPreferredBrands, "merchantPreferredBrands");
            Object obj = null;
            if (enumC38853i != EnumC38853i.Unknown && !AbstractC25265s.m74155w0(possibleBrands, enumC38853i)) {
                enumC38853i = null;
            }
            for (Object obj2 : merchantPreferredBrands) {
                if (possibleBrands.contains((EnumC38853i) obj2)) {
                    obj = obj2;
                    break;
                }
            }
            EnumC38853i enumC38853i2 = (EnumC38853i) obj;
            if (enumC38853i == null) {
                enumC38853i = enumC38853i2 == null ? EnumC38853i.Unknown : enumC38853i2;
            }
        } else {
            enumC38853i = getState().f133227y;
        }
        if (getBrand() != enumC38853i) {
            setBrand(enumC38853i);
        }
        m16901e();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    /* JADX INFO: renamed from: d */
    public final C38942r4 m16900d() {
        C38942r4 c38942r4;
        String str;
        if (getBrand() == EnumC38853i.Unknown) {
            c38942r4 = null;
        } else {
            c38942r4 = new C38942r4(getBrand().f167260w);
            if (!getState().f133225w || getPossibleBrands().size() <= 1) {
                c38942r4 = null;
            }
        }
        if (c38942r4 != null) {
            return c38942r4;
        }
        EnumC38853i enumC38853i = (EnumC38853i) AbstractC25265s.m74100H0(getMerchantPreferredNetworks());
        if (enumC38853i == null || (str = enumC38853i.f167260w) == null) {
            return null;
        }
        return new C38942r4(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m16901e() {
        int i13;
        if (getShouldShowErrorIcon()) {
            i13 = getState().f133227y.f167252E;
        } else {
            i13 = getShouldShowCvc() ? getState().f133227y.f167263z : getState().f133227y.f167262y;
        }
        this.f22474w.setImageResource(i13);
    }

    /* JADX INFO: renamed from: f */
    public final void m16902f(boolean z4) {
        boolean z13 = getState().f133225w && getPossibleBrands().size() > 1 && !getShouldShowCvc() && !getShouldShowErrorIcon();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        ImageView imageView = this.f22475x;
        if (!z13) {
            setOnClickListener(null);
            if (z4) {
                m16897a(viewGroup);
            }
            imageView.setVisibility(8);
            return;
        }
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        C32153h c32153h = new C32153h(context, getPossibleBrands(), getBrand());
        ListPopupWindow listPopupWindow = this.f22476y;
        listPopupWindow.setAdapter(c32153h);
        listPopupWindow.setModal(true);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c32153h.getCount();
        int i13 = 0;
        for (int i14 = 0; i14 < count; i14++) {
            View view = c32153h.getView(i14, null, this);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (i13 < measuredWidth) {
                i13 = measuredWidth;
            }
        }
        listPopupWindow.setWidth(i13);
        listPopupWindow.setOnItemClickListener(new C32156i(this, 0));
        listPopupWindow.setAnchorView(this.f22474w);
        setOnClickListener(new ViewOnClickListenerC21821j(this, 16));
        if (z4) {
            m16897a(viewGroup);
        }
        imageView.setVisibility(0);
    }

    public final EnumC38853i getBrand() {
        return getState().f133227y;
    }

    public final List<EnumC38853i> getMerchantPreferredNetworks() {
        return getState().f133222F;
    }

    public final List<EnumC38853i> getPossibleBrands() {
        return getState().f133221E;
    }

    public final boolean getShouldShowCvc() {
        return getState().f133223G;
    }

    public final boolean getShouldShowErrorIcon() {
        return getState().f133224H;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C32161k c32161k;
        Parcelable superState;
        C32159j c32159j = parcelable instanceof C32159j ? (C32159j) parcelable : null;
        if (c32159j == null || (c32161k = c32159j.f133219x) == null) {
            c32161k = new C32161k();
        }
        setState(c32161k);
        m16899c();
        m16902f(false);
        if (c32159j != null && (superState = c32159j.getSuperState()) != null) {
            parcelable = superState;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new C32159j(super.onSaveInstanceState(), getState());
    }

    public final void setBrand(EnumC38853i value) {
        AbstractC22676k.m65750j(value, "value");
        while (true) {
            C13045h2 c13045h2 = this.f22477z;
            Object value2 = c13045h2.getValue();
            EnumC38853i enumC38853i = value;
            if (c13045h2.m36569i(value2, C32161k.m100107b((C32161k) value2, false, enumC38853i, null, null, null, false, false, 251))) {
                m16899c();
                m16902f(true);
                return;
            }
            value = enumC38853i;
        }
    }

    public final void setCbcEligible(boolean z4) {
        while (true) {
            C13045h2 c13045h2 = this.f22477z;
            Object value = c13045h2.getValue();
            boolean z13 = z4;
            if (c13045h2.m36569i(value, C32161k.m100107b((C32161k) value, z13, null, null, null, null, false, false, 254))) {
                m16902f(true);
                return;
            }
            z4 = z13;
        }
    }

    public final void setMerchantPreferredNetworks(List<? extends EnumC38853i> value) {
        AbstractC22676k.m65750j(value, "value");
        while (true) {
            C13045h2 c13045h2 = this.f22477z;
            Object value2 = c13045h2.getValue();
            List<? extends EnumC38853i> list = value;
            if (c13045h2.m36569i(value2, C32161k.m100107b((C32161k) value2, false, null, null, null, list, false, false, 223))) {
                m16899c();
                return;
            }
            value = list;
        }
    }

    public final void setPossibleBrands(List<? extends EnumC38853i> value) {
        AbstractC22676k.m65750j(value, "value");
        while (true) {
            C13045h2 c13045h2 = this.f22477z;
            Object value2 = c13045h2.getValue();
            List<? extends EnumC38853i> list = value;
            if (c13045h2.m36569i(value2, C32161k.m100107b((C32161k) value2, false, null, null, list, null, false, false, 239))) {
                m16899c();
                m16902f(true);
                return;
            }
            value = list;
        }
    }

    public final void setShouldShowCvc(boolean z4) {
        while (true) {
            C13045h2 c13045h2 = this.f22477z;
            Object value = c13045h2.getValue();
            boolean z13 = z4;
            if (c13045h2.m36569i(value, C32161k.m100107b((C32161k) value, false, null, null, null, null, z13, false, 191))) {
                m16901e();
                m16902f(false);
                return;
            }
            z4 = z13;
        }
    }

    public final void setShouldShowErrorIcon(boolean z4) {
        while (true) {
            C13045h2 c13045h2 = this.f22477z;
            Object value = c13045h2.getValue();
            boolean z13 = z4;
            if (c13045h2.m36569i(value, C32161k.m100107b((C32161k) value, false, null, null, null, null, false, z13, 127))) {
                m16901e();
                return;
            }
            z4 = z13;
        }
    }
}
