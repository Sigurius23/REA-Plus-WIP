package p042c2;

import android.view.ViewStructure;
import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: c2.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C3864i {

    /* JADX INFO: renamed from: a */
    public static final C3861f f15798a = new C3861f();

    /* JADX INFO: renamed from: a */
    public static int m11844a(ViewStructure viewStructure) {
        return viewStructure.addChildCount(1);
    }

    /* JADX INFO: renamed from: b */
    public static AutofillValue m11845b(String str) {
        return AutofillValue.forText(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11846c(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11847d(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11848e(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11849f(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    /* JADX INFO: renamed from: g */
    public static ViewStructure m11850g(ViewStructure viewStructure, int i13) {
        return viewStructure.newChild(i13);
    }

    /* JADX INFO: renamed from: h */
    public static CharSequence m11851h(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
