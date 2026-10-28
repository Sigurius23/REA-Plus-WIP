package p709he2;

import android.widget.NumberPicker;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p725ot1.AbstractC28328d;
import x21.AbstractC37861d;

/* JADX INFO: renamed from: he2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17216b implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f66156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC28601c1 f66157c;

    public /* synthetic */ C17216b(Object obj, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f66155a = i13;
        this.f66156b = obj;
        this.f66157c = interfaceC28601c1;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i13, int i14) {
        switch (this.f66155a) {
            case 0:
                AbstractC17217c.m48674j((String[]) this.f66156b, this.f66157c, numberPicker, i13, i14);
                break;
            case 1:
                AbstractC28328d.m85849j((String[]) this.f66156b, this.f66157c, numberPicker, i13, i14);
                break;
            default:
                AbstractC37861d.m121402o((Function1) this.f66156b, this.f66157c, numberPicker, i13, i14);
                break;
        }
    }
}
