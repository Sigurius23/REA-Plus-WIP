package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.profileinstaller.ProfileVerifier;
import com.whoop.android.R;
import p290l.AbstractC22932a;
import p444r.C30820n;
import p444r.InterfaceC30831y;
import p444r.MenuC30818l;
import p474s.C31983m2;

/* JADX INFO: loaded from: classes5.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC30831y, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: E */
    public CheckBox f4232E;

    /* JADX INFO: renamed from: F */
    public TextView f4233F;

    /* JADX INFO: renamed from: G */
    public ImageView f4234G;

    /* JADX INFO: renamed from: H */
    public ImageView f4235H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f4236I;

    /* JADX INFO: renamed from: J */
    public final Drawable f4237J;

    /* JADX INFO: renamed from: K */
    public final int f4238K;

    /* JADX INFO: renamed from: L */
    public final Context f4239L;

    /* JADX INFO: renamed from: M */
    public boolean f4240M;

    /* JADX INFO: renamed from: N */
    public final Drawable f4241N;

    /* JADX INFO: renamed from: O */
    public final boolean f4242O;

    /* JADX INFO: renamed from: P */
    public LayoutInflater f4243P;

    /* JADX INFO: renamed from: Q */
    public boolean f4244Q;

    /* JADX INFO: renamed from: w */
    public C30820n f4245w;

    /* JADX INFO: renamed from: x */
    public ImageView f4246x;

    /* JADX INFO: renamed from: y */
    public RadioButton f4247y;

    /* JADX INFO: renamed from: z */
    public TextView f4248z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C31983m2 c31983m2M99479q = C31983m2.m99479q(getContext(), attributeSet, AbstractC22932a.f90525r, R.attr.listMenuViewStyle);
        this.f4237J = c31983m2M99479q.m99486j(5);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        this.f4238K = typedArray.getResourceId(1, -1);
        this.f4240M = typedArray.getBoolean(7, false);
        this.f4239L = context;
        this.f4241N = c31983m2M99479q.m99486j(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f4242O = typedArrayObtainStyledAttributes.hasValue(0);
        c31983m2M99479q.m99491r();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4243P == null) {
            this.f4243P = LayoutInflater.from(getContext());
        }
        return this.f4243P;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f4234G;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4235H;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4235H.getLayoutParams();
        rect.top = this.f4235H.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    @Override // p444r.InterfaceC30831y
    /* JADX INFO: renamed from: c */
    public final void mo3252c(C30820n c30820n) {
        boolean z4;
        int i13;
        String string;
        boolean z13;
        this.f4245w = c30820n;
        boolean zIsVisible = c30820n.isVisible();
        MenuC30818l menuC30818l = c30820n.f127099o;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(c30820n.f127090f);
        setCheckable(c30820n.isCheckable());
        if (menuC30818l.mo94803p()) {
            if ((menuC30818l.mo94802o() ? c30820n.f127095k : c30820n.f127093i) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        menuC30818l.mo94802o();
        if (z4) {
            C30820n c30820n2 = this.f4245w;
            MenuC30818l menuC30818l2 = c30820n2.f127099o;
            if (menuC30818l2.mo94803p()) {
                if ((menuC30818l2.mo94802o() ? c30820n2.f127095k : c30820n2.f127093i) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            i13 = z13 ? 0 : 8;
        }
        if (i13 == 0) {
            TextView textView = this.f4233F;
            C30820n c30820n3 = this.f4245w;
            MenuC30818l menuC30818l3 = c30820n3.f127099o;
            Context context = menuC30818l3.f127055b;
            char c3 = menuC30818l3.mo94802o() ? c30820n3.f127095k : c30820n3.f127093i;
            if (c3 == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb4 = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb4.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i14 = menuC30818l3.mo94802o() ? c30820n3.f127096l : c30820n3.f127094j;
                C30820n.m94829a(i14, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST, resources.getString(R.string.abc_menu_meta_shortcut_label), sb4);
                C30820n.m94829a(i14, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb4);
                C30820n.m94829a(i14, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb4);
                C30820n.m94829a(i14, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb4);
                C30820n.m94829a(i14, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb4);
                C30820n.m94829a(i14, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb4);
                if (c3 == '\b') {
                    sb4.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c3 == '\n') {
                    sb4.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c3 != ' ') {
                    sb4.append(c3);
                } else {
                    sb4.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb4.toString();
            }
            textView.setText(string);
        }
        if (this.f4233F.getVisibility() != i13) {
            this.f4233F.setVisibility(i13);
        }
        setIcon(c30820n.getIcon());
        setEnabled(c30820n.isEnabled());
        setSubMenuArrowVisible(c30820n.hasSubMenu());
        setContentDescription(c30820n.f127102r);
    }

    @Override // p444r.InterfaceC30831y
    public C30820n getItemData() {
        return this.f4245w;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f4237J);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f4248z = textView;
        int i13 = this.f4238K;
        if (i13 != -1) {
            textView.setTextAppearance(this.f4239L, i13);
        }
        this.f4233F = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f4234G = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4241N);
        }
        this.f4235H = (ImageView) findViewById(R.id.group_divider);
        this.f4236I = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (this.f4246x != null && this.f4240M) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4246x.getLayoutParams();
            int i15 = layoutParams.height;
            if (i15 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i15;
            }
        }
        super.onMeasure(i13, i14);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f4247y == null && this.f4232E == null) {
            return;
        }
        if ((this.f4245w.f127109y & 4) != 0) {
            if (this.f4247y == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4247y = radioButton;
                LinearLayout linearLayout = this.f4236I;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4247y;
            view = this.f4232E;
        } else {
            if (this.f4232E == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4232E = checkBox;
                LinearLayout linearLayout2 = this.f4236I;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4232E;
            view = this.f4247y;
        }
        if (z4) {
            compoundButton.setChecked(this.f4245w.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f4232E;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4247y;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f4245w.f127109y & 4) != 0) {
            if (this.f4247y == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4247y = radioButton;
                LinearLayout linearLayout = this.f4236I;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4247y;
        } else {
            if (this.f4232E == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4232E = checkBox;
                LinearLayout linearLayout2 = this.f4236I;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4232E;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f4244Q = z4;
        this.f4240M = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f4235H;
        if (imageView != null) {
            imageView.setVisibility((this.f4242O || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        MenuC30818l menuC30818l = this.f4245w.f127099o;
        boolean z4 = this.f4244Q;
        if (z4 || this.f4240M) {
            ImageView imageView = this.f4246x;
            if (imageView == null && drawable == null && !this.f4240M) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f4246x = imageView2;
                LinearLayout linearLayout = this.f4236I;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f4240M) {
                this.f4246x.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f4246x;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f4246x.getVisibility() != 0) {
                this.f4246x.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4248z.getVisibility() != 8) {
                this.f4248z.setVisibility(8);
            }
        } else {
            this.f4248z.setText(charSequence);
            if (this.f4248z.getVisibility() != 0) {
                this.f4248z.setVisibility(0);
            }
        }
    }
}
