package d42;

import android.app.DatePickerDialog;
import c93.InterfaceC4339a;
import ep1.AbstractC13422q;

/* JADX INFO: renamed from: d42.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C11693i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37814w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DatePickerDialog f37815x;

    public /* synthetic */ C11693i(DatePickerDialog datePickerDialog, int i13) {
        this.f37814w = i13;
        this.f37815x = datePickerDialog;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f37814w) {
            case 0:
                return AbstractC11694j.m31203q(this.f37815x);
            default:
                return AbstractC13422q.m38057z(this.f37815x);
        }
    }
}
