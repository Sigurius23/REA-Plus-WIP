package d42;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import p715kotlin.jvm.functions.Function1;
import vp1.AbstractC36272h;

/* JADX INFO: renamed from: d42.m */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C11697m implements DatePickerDialog.OnDateSetListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Calendar f37822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SimpleDateFormat f37823c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function1 f37824d;

    public /* synthetic */ C11697m(Calendar calendar, SimpleDateFormat simpleDateFormat, Function1 function1, int i13) {
        this.f37821a = i13;
        this.f37822b = calendar;
        this.f37823c = simpleDateFormat;
        this.f37824d = function1;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i13, int i14, int i15) {
        switch (this.f37821a) {
            case 0:
                AbstractC11700p.m31229D(this.f37822b, this.f37823c, this.f37824d, datePicker, i13, i14, i15);
                break;
            default:
                AbstractC36272h.m115851k0(this.f37822b, this.f37823c, this.f37824d, datePicker, i13, i14, i15);
                break;
        }
    }
}
