package p015ak;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import l83.C23465k;
import l83.C23468n;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p617xj.C38330b;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;

/* JADX INFO: renamed from: ak.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C0933a implements InterfaceC0935c {

    /* JADX INFO: renamed from: a */
    public final int[] f3431a = new int[2];

    /* JADX WARN: Code duplicated, block: B:64:0x0121  */
    @Override // p015ak.InterfaceC0935c
    /* JADX INFO: renamed from: a */
    public final C38330b mo2366a(View view, C23465k c23465k) {
        Object objM107888l;
        String string;
        CharSequence text;
        AbstractC22676k.m65750j(view, "<this>");
        AbstractC18489d0.m53382w(1, "targetType");
        float fFloatValue = ((Number) c23465k.f92937w).floatValue();
        float fFloatValue2 = ((Number) c23465k.f92938x).floatValue();
        int[] iArr = this.f3431a;
        view.getLocationOnScreen(iArr);
        int i13 = iArr[0];
        int i14 = iArr[1];
        String string2 = null;
        if (((fFloatValue < ((float) i13) || fFloatValue > ((float) (i13 + view.getWidth())) || fFloatValue2 < ((float) i14) || fFloatValue2 > ((float) (i14 + view.getHeight())) || !view.isClickable() || view.getVisibility() != 0) ? null : view) == null) {
            return null;
        }
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        String str = canonicalName;
        try {
            if (view.getId() == -1 || ((view.getId() & (-16777216)) == 0 && (view.getId() & 16777215) != 0)) {
                throw new Resources.NotFoundException();
            }
            Resources resources = view.getContext().getResources();
            objM107888l = resources != null ? resources.getResourceEntryName(view.getId()) : null;
            if (objM107888l == null) {
                objM107888l = "";
            }
            if (C23468n.m68037a(objM107888l) != null) {
                if (view.getId() == -1) {
                    objM107888l = null;
                } else {
                    int id4 = view.getId();
                    AbstractC35846d.m113779c(16);
                    String string3 = Integer.toString(id4, 16);
                    AbstractC22676k.m65749i(string3, "toString(this, checkRadix(radix))");
                    objM107888l = "0x".concat(string3);
                }
            }
            String str2 = (String) objM107888l;
            ArrayList arrayList = new ArrayList();
            View view2 = view;
            while (view2 != null) {
                arrayList.add(view2.getClass().getSimpleName());
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
            String strM74110N0 = AbstractC25265s.m74110N0(arrayList, " → ", null, null, null, 62);
            Object tag = view.getTag();
            if (tag == null) {
                string = null;
            } else {
                if (!(tag instanceof String) && !(tag instanceof Number) && !(tag instanceof Boolean) && !(tag instanceof Character)) {
                    tag = null;
                }
                if (tag != null) {
                    string = tag.toString();
                } else {
                    string = null;
                }
            }
            Button button = view instanceof Button ? (Button) view : null;
            if (button != null && (text = button.getText()) != null) {
                string2 = text.toString();
            }
            return new C38330b(view, str, str2, string, string2, "android_view", strM74110N0);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
    }
}
