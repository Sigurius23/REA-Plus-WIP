package p028b4;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p018ui.node.Owner;
import p027b3.AbstractC2346a;
import p390p1.C28647o;
import p474s.C31983m2;
import p492t2.C33316d;
import p634y1.InterfaceC39032e;
import p634y1.InterfaceC39033f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b4.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C2711v extends AbstractC2701l {

    /* JADX INFO: renamed from: c0 */
    public final View f10679c0;

    /* JADX INFO: renamed from: d0 */
    public final C33316d f10680d0;

    /* JADX INFO: renamed from: e0 */
    public InterfaceC39032e f10681e0;

    /* JADX INFO: renamed from: f0 */
    public Function1 f10682f0;

    /* JADX INFO: renamed from: g0 */
    public Function1 f10683g0;

    /* JADX INFO: renamed from: h0 */
    public Function1 f10684h0;

    public C2711v(Context context, Function1 function1, C28647o c28647o, InterfaceC39033f interfaceC39033f, int i13, Owner owner) {
        View view = (View) function1.invoke(context);
        C33316d c33316d = new C33316d();
        super(context, c28647o, i13, c33316d, view, owner);
        this.f10679c0 = view;
        this.f10680d0 = c33316d;
        setClipChildren(false);
        String strValueOf = String.valueOf(i13);
        Object objMo7448f = interfaceC39033f != null ? interfaceC39033f.mo7448f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo7448f instanceof SparseArray ? (SparseArray) objMo7448f : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC39033f != null) {
            setSavableRegistryEntry(interfaceC39033f.mo7445b(new C2710u(this, 0), strValueOf));
        }
        C2692c c2692c = C2692c.f10591E;
        this.f10682f0 = c2692c;
        this.f10683g0 = c2692c;
        this.f10684h0 = c2692c;
    }

    /* JADX INFO: renamed from: n */
    public static final void m7593n(C2711v c2711v) {
        c2711v.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(InterfaceC39032e interfaceC39032e) {
        InterfaceC39032e interfaceC39032e2 = this.f10681e0;
        if (interfaceC39032e2 != null) {
            ((C31983m2) interfaceC39032e2).m99494u();
        }
        this.f10681e0 = interfaceC39032e;
    }

    public final C33316d getDispatcher() {
        return this.f10680d0;
    }

    public final Function1 getReleaseBlock() {
        return this.f10684h0;
    }

    public final Function1 getResetBlock() {
        return this.f10683g0;
    }

    public /* bridge */ /* synthetic */ AbstractC2346a getSubCompositionView() {
        return null;
    }

    public final Function1 getUpdateBlock() {
        return this.f10682f0;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(Function1 function1) {
        this.f10684h0 = function1;
        setRelease(new C2710u(this, 1));
    }

    public final void setResetBlock(Function1 function1) {
        this.f10683g0 = function1;
        setReset(new C2710u(this, 2));
    }

    public final void setUpdateBlock(Function1 function1) {
        this.f10682f0 = function1;
        setUpdate(new C2710u(this, 3));
    }
}
