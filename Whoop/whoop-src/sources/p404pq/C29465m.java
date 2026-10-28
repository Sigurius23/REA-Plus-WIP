package p404pq;

import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC1230l;
import io.sentry.internal.debugmeta.C20378c;
import java.util.Iterator;
import java.util.List;
import p184h5.C16866d1;
import p184h5.C16905q1;
import p287kq.AbstractC22766a;

/* JADX INFO: renamed from: pq.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C29465m extends AbstractC1230l {

    /* JADX INFO: renamed from: E */
    public int f119646E;

    /* JADX INFO: renamed from: F */
    public int f119647F;

    /* JADX INFO: renamed from: G */
    public final int[] f119648G;

    /* JADX INFO: renamed from: z */
    public final View f119649z;

    public C29465m(View view) {
        super(0);
        this.f119648G = new int[2];
        this.f119649z = view;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: g */
    public final void mo3872g(C16866d1 c16866d1) {
        this.f119649z.setTranslationY(0.0f);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: h */
    public final void mo3873h() {
        View view = this.f119649z;
        int[] iArr = this.f119648G;
        view.getLocationOnScreen(iArr);
        this.f119646E = iArr[1];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: i */
    public final C16905q1 mo3874i(C16905q1 c16905q1, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16866d1 c16866d1 = (C16866d1) it.next();
            if ((c16866d1.f64800a.mo47490c() & 8) != 0) {
                this.f119649z.setTranslationY(AbstractC22766a.m65971c(c16866d1.f64800a.mo47489b(), this.f119647F, 0));
                break;
            }
        }
        return c16905q1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: j */
    public final C20378c mo3875j(C16866d1 c16866d1, C20378c c20378c) {
        View view = this.f119649z;
        int[] iArr = this.f119648G;
        view.getLocationOnScreen(iArr);
        int i13 = this.f119646E - iArr[1];
        this.f119647F = i13;
        view.setTranslationY(i13);
        return c20378c;
    }
}
