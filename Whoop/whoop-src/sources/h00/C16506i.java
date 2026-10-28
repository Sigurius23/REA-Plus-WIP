package h00;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import ik1.C18605b;
import j11.AbstractC21215r;
import java.util.List;
import kk1.AbstractC22546g;
import l83.C23454a0;
import o73.C27648a;
import org.joda.time.LocalDate;
import p335n6.InterfaceC26398o;
import p335n6.InterfaceC26401r;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32583a3;
import p736sz0.AbstractC33186i;
import p748zc1.AbstractC40458s0;
import se.AbstractC32411b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: h00.i */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16506i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f63469E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f63470F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f63471G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63472w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f63473x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f63474y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f63475z;

    public /* synthetic */ C16506i(int i13, int i14, int i15, Modifier modifier, InterfaceC4339a interfaceC4339a, String str) {
        this.f63473x = i13;
        this.f63469E = str;
        this.f63470F = modifier;
        this.f63471G = interfaceC4339a;
        this.f63474y = i14;
        this.f63475z = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f63472w) {
            case 0:
                String str = (String) this.f63469E;
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f63474y | 1);
                AbstractC32411b.m101085b((Modifier) this.f63470F, str, (InterfaceC4339a) this.f63471G, this.f63473x, iM87244L, (Composer) obj, this.f63475z);
                return C23454a0.f92919a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC21215r.m59515g((LocalDate) this.f63469E, this.f63473x, (InterfaceC41070a) this.f63470F, (Function1) this.f63471G, this.f63474y, this.f63475z, (Composer) obj, iIntValue);
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22546g.m65252p0((Modifier) this.f63470F, (C18605b) this.f63469E, this.f63473x, (Function1) this.f63471G, this.f63474y, this.f63475z, (Composer) obj, iIntValue2);
            case 3:
                ((Integer) obj2).getClass();
                C27648a.m83581d((InterfaceC26401r) this.f63470F, (String) this.f63469E, (InterfaceC26398o) this.f63471G, this.f63473x, (Composer) obj, AbstractC28683x.m87244L(this.f63474y | 1), this.f63475z);
                return C23454a0.f92919a;
            case 4:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC32583a3.m101643g((String) this.f63469E, (List) this.f63470F, this.f63473x, (Function1) this.f63471G, this.f63474y, this.f63475z, (Composer) obj, iIntValue3);
            case 5:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC33186i.m105161c((TextResource) this.f63469E, (TextResource) this.f63471G, this.f63473x, (Modifier) this.f63470F, this.f63474y, this.f63475z, (Composer) obj, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC40458s0.m130806i((List) this.f63469E, this.f63473x, (Function1) this.f63471G, (Modifier) this.f63470F, this.f63474y, this.f63475z, (Composer) obj, iIntValue5);
        }
    }

    public /* synthetic */ C16506i(int i13, int i14, int i15, Modifier modifier, TextResource textResource, TextResource textResource2) {
        this.f63469E = textResource;
        this.f63471G = textResource2;
        this.f63473x = i13;
        this.f63470F = modifier;
        this.f63474y = i14;
        this.f63475z = i15;
    }

    public /* synthetic */ C16506i(Modifier modifier, C18605b c18605b, int i13, Function1 function1, int i14, int i15) {
        this.f63470F = modifier;
        this.f63469E = c18605b;
        this.f63473x = i13;
        this.f63471G = function1;
        this.f63474y = i14;
        this.f63475z = i15;
    }

    public /* synthetic */ C16506i(Modifier modifier, List list, Function1 function1, int i13, int i14, int i15) {
        this.f63469E = list;
        this.f63473x = i13;
        this.f63471G = function1;
        this.f63470F = modifier;
        this.f63474y = i14;
        this.f63475z = i15;
    }

    public /* synthetic */ C16506i(String str, List list, int i13, Function1 function1, int i14, int i15) {
        this.f63469E = str;
        this.f63470F = list;
        this.f63473x = i13;
        this.f63471G = function1;
        this.f63474y = i14;
        this.f63475z = i15;
    }

    public /* synthetic */ C16506i(InterfaceC26401r interfaceC26401r, String str, InterfaceC26398o interfaceC26398o, int i13, int i14, int i15) {
        this.f63470F = interfaceC26401r;
        this.f63469E = str;
        this.f63471G = interfaceC26398o;
        this.f63473x = i13;
        this.f63474y = i14;
        this.f63475z = i15;
    }

    public /* synthetic */ C16506i(LocalDate localDate, int i13, InterfaceC41070a interfaceC41070a, Function1 function1, int i14, int i15) {
        this.f63469E = localDate;
        this.f63473x = i13;
        this.f63470F = interfaceC41070a;
        this.f63471G = function1;
        this.f63474y = i14;
        this.f63475z = i15;
    }
}
