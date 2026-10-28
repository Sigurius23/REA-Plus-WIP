package i20;

import ah0.C0882c;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.BottomSheet;
import com.whoop.startactivity.selectactivity.SelectActivityPickerModel;
import ih0.AbstractC18491e0;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import p292l1.C23196w3;
import p390p1.AbstractC28683x;
import p390p1.InterfaceC28601c1;
import p412q3.C29891y;
import p602x1.C37816b;
import p668z1.C39970s;
import p715kotlin.jvm.functions.Function1;
import tg2.AbstractC33790d;

/* JADX INFO: renamed from: i20.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C17927a1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f69674E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f69675F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f69676G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f69677H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f69678I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69679w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f69680x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f69681y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f69682z;

    public /* synthetic */ C17927a1(C23196w3 c23196w3, BottomSheet bottomSheet, InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, SelectActivityPickerModel selectActivityPickerModel, String str, boolean z4, Function1 function1) {
        this.f69682z = c23196w3;
        this.f69675F = bottomSheet;
        this.f69676G = interfaceC2994c0;
        this.f69674E = interfaceC4339a;
        this.f69677H = selectActivityPickerModel;
        this.f69681y = str;
        this.f69680x = z4;
        this.f69678I = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69679w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(14352385);
                AbstractC17960l1.m51582i(this.f69680x, (String) this.f69681y, (String) this.f69682z, (InterfaceC4339a) this.f69674E, (InterfaceC4339a) this.f69675F, (C37816b) this.f69676G, (C37816b) this.f69677H, (C37816b) this.f69678I, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            case 1:
                return AbstractC18491e0.m53539z0(this.f69680x, (Map) this.f69681y, (C0882c) this.f69682z, (C39970s) this.f69674E, (Set) this.f69675F, (C0882c) this.f69676G, (InterfaceC28601c1) this.f69677H, (InterfaceC28601c1) this.f69678I, (String) obj, (C29891y) obj2);
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33790d.m106867n((C23196w3) this.f69682z, (BottomSheet) this.f69675F, (InterfaceC2994c0) this.f69676G, (InterfaceC4339a) this.f69674E, (SelectActivityPickerModel) this.f69677H, (String) this.f69681y, this.f69680x, (Function1) this.f69678I, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C17927a1(boolean z4, String str, String str2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C37816b c37816b, C37816b c37816b2, C37816b c37816b3, int i13) {
        this.f69680x = z4;
        this.f69681y = str;
        this.f69682z = str2;
        this.f69674E = interfaceC4339a;
        this.f69675F = interfaceC4339a2;
        this.f69676G = c37816b;
        this.f69677H = c37816b2;
        this.f69678I = c37816b3;
    }

    public /* synthetic */ C17927a1(boolean z4, Map map, C0882c c0882c, C39970s c39970s, Set set, C0882c c0882c2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f69680x = z4;
        this.f69681y = map;
        this.f69682z = c0882c;
        this.f69674E = c39970s;
        this.f69675F = set;
        this.f69676G = c0882c2;
        this.f69677H = interfaceC28601c1;
        this.f69678I = interfaceC28601c2;
    }
}
