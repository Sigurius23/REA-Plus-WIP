package lr;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p550vd.AbstractC35902e;

/* JADX INFO: renamed from: lr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C24689a extends AbstractC35902e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96592w;

    /* JADX INFO: renamed from: x */
    public final SideSheetBehavior f96593x;

    public /* synthetic */ C24689a(SideSheetBehavior sideSheetBehavior, int i13) {
        this.f96592w = i13;
        this.f96593x = sideSheetBehavior;
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: A */
    public final int mo72268A() {
        switch (this.f96592w) {
            case 0:
                return -this.f96593x.f21030l;
            default:
                return mo72281x();
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: B */
    public final int mo72269B(View view) {
        switch (this.f96592w) {
            case 0:
                return view.getRight() + this.f96593x.f21033o;
            default:
                return view.getLeft() - this.f96593x.f21033o;
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: C */
    public final int mo72270C(CoordinatorLayout coordinatorLayout) {
        switch (this.f96592w) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: E */
    public final int mo72271E() {
        switch (this.f96592w) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: I */
    public final boolean mo72272I(float f13) {
        switch (this.f96592w) {
            case 0:
                return f13 > 0.0f;
            default:
                return f13 < 0.0f;
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: K */
    public final boolean mo72273K(View view) {
        switch (this.f96592w) {
            case 0:
                return view.getRight() < (mo72281x() - mo72282y()) / 2;
            default:
                return view.getLeft() > (mo72281x() + this.f96593x.f21031m) / 2;
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: L */
    public final boolean mo72274L(float f13, float f14) {
        switch (this.f96592w) {
            case 0:
                return Math.abs(f13) > Math.abs(f14) && Math.abs(f13) > ((float) 500);
            default:
                return Math.abs(f13) > Math.abs(f14) && Math.abs(f13) > ((float) 500);
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: e0 */
    public final boolean mo72275e0(View view, float f13) {
        switch (this.f96592w) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f96593x;
                float fAbs = Math.abs((f13 * sideSheetBehavior.f21029k) + left);
                sideSheetBehavior.getClass();
                return fAbs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f96593x;
                float fAbs2 = Math.abs((f13 * sideSheetBehavior2.f21029k) + right);
                sideSheetBehavior2.getClass();
                return fAbs2 > 0.5f;
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: h */
    public final int mo72276h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f96592w) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: i */
    public final float mo72277i(int i13) {
        switch (this.f96592w) {
            case 0:
                float fMo72282y = mo72282y();
                return (i13 - fMo72282y) / (mo72281x() - fMo72282y);
            default:
                float f13 = this.f96593x.f21031m;
                return (f13 - i13) / (f13 - mo72281x());
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: j0 */
    public final void mo72278j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i13) {
        switch (this.f96592w) {
            case 0:
                marginLayoutParams.leftMargin = i13;
                break;
            default:
                marginLayoutParams.rightMargin = i13;
                break;
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: k0 */
    public final void mo72279k0(ViewGroup.MarginLayoutParams marginLayoutParams, int i13, int i14) {
        switch (this.f96592w) {
            case 0:
                if (i13 <= this.f96593x.f21031m) {
                    marginLayoutParams.leftMargin = i14;
                }
                break;
            default:
                int i15 = this.f96593x.f21031m;
                if (i13 <= i15) {
                    marginLayoutParams.rightMargin = i15 - i13;
                }
                break;
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: w */
    public final int mo72280w(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f96592w) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: x */
    public final int mo72281x() {
        switch (this.f96592w) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f96593x;
                return Math.max(0, sideSheetBehavior.f21032n + sideSheetBehavior.f21033o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f96593x;
                return Math.max(0, (sideSheetBehavior2.f21031m - sideSheetBehavior2.f21030l) - sideSheetBehavior2.f21033o);
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: y */
    public final int mo72282y() {
        switch (this.f96592w) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f96593x;
                return (-sideSheetBehavior.f21030l) - sideSheetBehavior.f21033o;
            default:
                return this.f96593x.f21031m;
        }
    }

    @Override // p550vd.AbstractC35902e
    /* JADX INFO: renamed from: z */
    public final int mo72283z() {
        switch (this.f96592w) {
            case 0:
                return this.f96593x.f21033o;
            default:
                return this.f96593x.f21031m;
        }
    }
}
