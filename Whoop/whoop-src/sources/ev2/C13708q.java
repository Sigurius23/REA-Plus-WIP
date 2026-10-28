package ev2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import com.whoop.startactivity.selectactivity.SelectActivityPickerModel;
import jx1.C22016g;
import jx1.EnumC22030t;
import mx1.AbstractC26007m;
import p238j0.InterfaceC21083i;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import tg2.AbstractC33790d;

/* JADX INFO: renamed from: ev2.q */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13708q implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f48598E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48599w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f48600x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f48601y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f48602z;

    public /* synthetic */ C13708q(SelectActivityPickerModel selectActivityPickerModel, String str, boolean z4, Function1 function1) {
        this.f48601y = selectActivityPickerModel;
        this.f48602z = str;
        this.f48600x = z4;
        this.f48598E = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f48599w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC13712u.m38767Y(this.f48600x, (InterfaceC25312u) this.f48601y, (InterfaceC21083i) this.f48602z, (Function1) this.f48598E, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC26007m.m77234Z((C22016g) this.f48601y, this.f48600x, (EnumC22030t) this.f48602z, (C22016g) this.f48598E, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC33790d.m106871r((SelectActivityPickerModel) this.f48601y, (String) this.f48602z, this.f48600x, (Function1) this.f48598E, (InterfaceC23013y) obj, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ C13708q(C22016g c22016g, boolean z4, EnumC22030t enumC22030t, C22016g c22016g2) {
        this.f48601y = c22016g;
        this.f48600x = z4;
        this.f48602z = enumC22030t;
        this.f48598E = c22016g2;
    }

    public /* synthetic */ C13708q(boolean z4, InterfaceC25312u interfaceC25312u, InterfaceC21083i interfaceC21083i, Function1 function1) {
        this.f48600x = z4;
        this.f48601y = interfaceC25312u;
        this.f48602z = interfaceC21083i;
        this.f48598E = function1;
    }
}
