package androidx.media3.p019ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.ViewOnClickListenerC5018l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p087db.C11849g;
import p087db.C11876t0;
import p087db.InterfaceC11874s0;
import p516u8.C34611p0;
import p516u8.C34613q0;
import p516u8.C34621u0;

/* JADX INFO: loaded from: classes5.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: E */
    public final ViewOnClickListenerC5018l f6499E;

    /* JADX INFO: renamed from: F */
    public final ArrayList f6500F;

    /* JADX INFO: renamed from: G */
    public final HashMap f6501G;

    /* JADX INFO: renamed from: H */
    public boolean f6502H;

    /* JADX INFO: renamed from: I */
    public boolean f6503I;

    /* JADX INFO: renamed from: J */
    public InterfaceC11874s0 f6504J;

    /* JADX INFO: renamed from: K */
    public CheckedTextView[][] f6505K;

    /* JADX INFO: renamed from: L */
    public boolean f6506L;

    /* JADX INFO: renamed from: w */
    public final int f6507w;

    /* JADX INFO: renamed from: x */
    public final LayoutInflater f6508x;

    /* JADX INFO: renamed from: y */
    public final CheckedTextView f6509y;

    /* JADX INFO: renamed from: z */
    public final CheckedTextView f6510z;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f6507w = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f6508x = layoutInflaterFrom;
        ViewOnClickListenerC5018l viewOnClickListenerC5018l = new ViewOnClickListenerC5018l(this, 1);
        this.f6499E = viewOnClickListenerC5018l;
        this.f6504J = new C11849g(getResources(), 0);
        this.f6500F = new ArrayList();
        this.f6501G = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f6509y = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.whoop.android.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC5018l);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.whoop.android.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f6510z = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.whoop.android.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC5018l);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: a */
    public final void m5092a() {
        this.f6509y.setChecked(this.f6506L);
        boolean z4 = this.f6506L;
        HashMap map = this.f6501G;
        this.f6510z.setChecked(!z4 && map.size() == 0);
        for (int i13 = 0; i13 < this.f6505K.length; i13++) {
            C34613q0 c34613q0 = (C34613q0) map.get(((C34621u0) this.f6500F.get(i13)).f145858b);
            int i14 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f6505K[i13];
                if (i14 < checkedTextViewArr.length) {
                    if (c34613q0 != null) {
                        Object tag = checkedTextViewArr[i14].getTag();
                        tag.getClass();
                        this.f6505K[i13][i14].setChecked(c34613q0.f145804b.contains(Integer.valueOf(((C11876t0) tag).f38757b)));
                    } else {
                        checkedTextViewArr[i14].setChecked(false);
                    }
                    i14++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5093b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f6500F;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f6510z;
        CheckedTextView checkedTextView2 = this.f6509y;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f6505K = new CheckedTextView[arrayList.size()][];
        boolean z4 = this.f6503I && arrayList.size() > 1;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            C34621u0 c34621u0 = (C34621u0) arrayList.get(i13);
            boolean z13 = this.f6502H && c34621u0.f145859c;
            CheckedTextView[][] checkedTextViewArr = this.f6505K;
            int i14 = c34621u0.f145857a;
            checkedTextViewArr[i13] = new CheckedTextView[i14];
            C11876t0[] c11876t0Arr = new C11876t0[i14];
            for (int i15 = 0; i15 < c34621u0.f145857a; i15++) {
                c11876t0Arr[i15] = new C11876t0(c34621u0, i15);
            }
            for (int i16 = 0; i16 < i14; i16++) {
                LayoutInflater layoutInflater = this.f6508x;
                if (i16 == 0) {
                    addView(layoutInflater.inflate(com.whoop.android.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z13 || z4) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f6507w);
                InterfaceC11874s0 interfaceC11874s0 = this.f6504J;
                C11876t0 c11876t0 = c11876t0Arr[i16];
                checkedTextView3.setText(((C11849g) interfaceC11874s0).m31808e(c11876t0.f38756a.f145858b.f145799d[c11876t0.f38757b]));
                checkedTextView3.setTag(c11876t0Arr[i16]);
                if (c34621u0.m109416a(i16)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f6499E);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f6505K[i13][i16] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        m5092a();
    }

    public boolean getIsDisabled() {
        return this.f6506L;
    }

    public Map<C34611p0, C34613q0> getOverrides() {
        return this.f6501G;
    }

    public void setAllowAdaptiveSelections(boolean z4) {
        if (this.f6502H != z4) {
            this.f6502H = z4;
            m5093b();
        }
    }

    public void setAllowMultipleOverrides(boolean z4) {
        if (this.f6503I != z4) {
            this.f6503I = z4;
            if (!z4) {
                HashMap map = this.f6501G;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList = this.f6500F;
                        if (i13 >= arrayList.size()) {
                            break;
                        }
                        C34613q0 c34613q0 = (C34613q0) map.get(((C34621u0) arrayList.get(i13)).f145858b);
                        if (c34613q0 != null && map2.isEmpty()) {
                            map2.put(c34613q0.f145803a, c34613q0);
                        }
                        i13++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            m5093b();
        }
    }

    public void setShowDisableOption(boolean z4) {
        this.f6509y.setVisibility(z4 ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC11874s0 interfaceC11874s0) {
        interfaceC11874s0.getClass();
        this.f6504J = interfaceC11874s0;
        m5093b();
    }
}
