package t30;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;
import com.whoop.android.R;
import e93.AbstractC12889b;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p098dt.AbstractC12350b;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33192k;
import r30.C30898c;

/* JADX INFO: renamed from: t30.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C33518t extends FrameLayout {

    /* JADX INFO: renamed from: E */
    public final int f139929E;

    /* JADX INFO: renamed from: F */
    public final int f139930F;

    /* JADX INFO: renamed from: G */
    public final int f139931G;

    /* JADX INFO: renamed from: w */
    public final boolean f139932w;

    /* JADX INFO: renamed from: x */
    public final ThreeDS2TextView f139933x;

    /* JADX INFO: renamed from: y */
    public final LinearLayout f139934y;

    /* JADX INFO: renamed from: z */
    public final int f139935z;

    public C33518t(AbstractActivityC1340r0 abstractActivityC1340r0, boolean z4) {
        super(abstractActivityC1340r0, null, 0);
        this.f139932w = z4;
        if (getId() == -1) {
            setId(R.id.stripe_3ds2_default_challenge_zone_select_view_id);
        }
        this.f139935z = abstractActivityC1340r0.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_vertical_margin);
        this.f139929E = abstractActivityC1340r0.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_label_padding);
        this.f139930F = abstractActivityC1340r0.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_offset_margin);
        this.f139931G = abstractActivityC1340r0.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_min_height);
        int i13 = R.id.select_group;
        if (z4) {
            View viewInflate = LayoutInflater.from(abstractActivityC1340r0).inflate(R.layout.stripe_challenge_zone_single_select_view, (ViewGroup) this, false);
            addView(viewInflate);
            ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) AbstractC34235f.m108203J(viewInflate, R.id.label);
            if (threeDS2TextView != null) {
                RadioGroup radioGroup = (RadioGroup) AbstractC34235f.m108203J(viewInflate, R.id.select_group);
                if (radioGroup != null) {
                    this.f139933x = threeDS2TextView;
                    this.f139934y = radioGroup;
                    return;
                }
            } else {
                i13 = R.id.label;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
        }
        View viewInflate2 = LayoutInflater.from(abstractActivityC1340r0).inflate(R.layout.stripe_challenge_zone_multi_select_view, (ViewGroup) this, false);
        addView(viewInflate2);
        ThreeDS2TextView threeDS2TextView2 = (ThreeDS2TextView) AbstractC34235f.m108203J(viewInflate2, R.id.label);
        if (threeDS2TextView2 != null) {
            LinearLayout linearLayout = (LinearLayout) AbstractC34235f.m108203J(viewInflate2, R.id.select_group);
            if (linearLayout != null) {
                this.f139933x = threeDS2TextView2;
                this.f139934y = linearLayout;
                return;
            }
        } else {
            i13 = R.id.label;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i13)));
    }

    public final List<CheckBox> getCheckBoxes() {
        if (this.f139932w) {
            return null;
        }
        LinearLayout linearLayout = this.f139934y;
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, linearLayout.getChildCount());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (it.hasNext()) {
            View childAt = linearLayout.getChildAt(((AbstractC25243e0) it).nextInt());
            AbstractC22676k.m65748h(childAt, "null cannot be cast to non-null type android.widget.CheckBox");
            arrayList.add((CheckBox) childAt);
        }
        return arrayList;
    }

    public final ThreeDS2TextView getInfoLabel$3ds2sdk_release() {
        return this.f139933x;
    }

    public final LinearLayout getSelectGroup$3ds2sdk_release() {
        return this.f139934y;
    }

    public final List<Integer> getSelectedIndexes$3ds2sdk_release() {
        LinearLayout linearLayout = this.f139934y;
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, linearLayout.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = c18284jM36278i0.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            View childAt = linearLayout.getChildAt(iNextInt);
            AbstractC22676k.m65748h(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
            Integer numValueOf = ((CompoundButton) childAt).isChecked() ? Integer.valueOf(iNextInt) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return AbstractC25265s.m74156w1(arrayList, this.f139932w ? 1 : arrayList.size());
    }

    public final List<C30898c> getSelectedOptions() {
        List<Integer> selectedIndexes$3ds2sdk_release = getSelectedIndexes$3ds2sdk_release();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(selectedIndexes$3ds2sdk_release, 10));
        Iterator<T> it = selectedIndexes$3ds2sdk_release.iterator();
        while (it.hasNext()) {
            Object tag = this.f139934y.getChildAt(((Number) it.next()).intValue()).getTag();
            AbstractC22676k.m65748h(tag, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption");
            arrayList.add((C30898c) tag);
        }
        return arrayList;
    }

    public String getUserEntry() {
        return AbstractC25265s.m74110N0(getSelectedOptions(), ",", null, null, new C33192k(26), 30);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        AbstractC22676k.m65750j(state, "state");
        if (!(state instanceof Bundle)) {
            super.onRestoreInstanceState(state);
            return;
        }
        Bundle bundle = (Bundle) state;
        super.onRestoreInstanceState((Parcelable) AbstractC12350b.m34600u(bundle, Parcelable.class, "state_super"));
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("state_selected_indexes");
        if (integerArrayList != null) {
            for (Integer num : integerArrayList) {
                AbstractC22676k.m65747g(num);
                View childAt = this.f139934y.getChildAt(num.intValue());
                AbstractC22676k.m65748h(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
                ((CompoundButton) childAt).setChecked(true);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return AbstractC12889b.m36273g(new C23465k("state_super", super.onSaveInstanceState()), new C23465k("state_selected_indexes", new ArrayList(getSelectedIndexes$3ds2sdk_release())));
    }
}
