package d42;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import bm2.AbstractC3487z0;
import ep1.AbstractC13422q;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: d42.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C11689e implements DatePickerDialog.OnDateSetListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37789a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Calendar f37790b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37791c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC28601c1 f37792d;

    public /* synthetic */ C11689e(Calendar calendar, Object obj, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f37789a = i13;
        this.f37790b = calendar;
        this.f37791c = obj;
        this.f37792d = interfaceC28601c1;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i13, int i14, int i15) {
        switch (this.f37789a) {
            case 0:
                AbstractC11694j.m31184F(this.f37790b, (SimpleDateFormat) this.f37791c, this.f37792d, datePicker, i13, i14, i15);
                break;
            case 1:
                AbstractC13422q.m38055x(this.f37790b, (SimpleDateFormat) this.f37791c, this.f37792d, datePicker, i13, i14, i15);
                break;
            default:
                AbstractC3487z0.m10219B(this.f37790b, (Function1) this.f37791c, this.f37792d, datePicker, i13, i14, i15);
                break;
        }
    }
}
