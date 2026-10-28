package e81;

import androidx.health.platform.client.proto.C1533u;
import bg2.AbstractC3235h;
import cg2.AbstractC4574a;
import e90.AbstractC12884g;
import eg.C13161j;
import eg2.AbstractC13176i;
import eg2.AbstractC13177j;
import eg2.AbstractC13181n;
import ei2.C13223c;
import ej1.AbstractC13234d;
import ej1.AbstractC13240g;
import ji2.C21724c;
import p040c0.InterfaceC3770q;
import p148fg.C14432b;
import p148fg.C14435e;
import p148fg.InterfaceC14443m;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e81.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12824e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43962w;

    public /* synthetic */ C12824e(int i13) {
        this.f43962w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f43962w) {
            case 0:
                return AbstractC12836k.m36023y(obj);
            case 1:
                return AbstractC12836k.m35997b0(obj);
            case 2:
                return AbstractC12836k.m35989V(obj);
            case 3:
                return AbstractC12836k.m35982O((Integer) obj);
            case 4:
                return AbstractC12836k.m35973F(obj);
            case 5:
                return AbstractC12823d0.m35940i((Integer) obj);
            case 6:
                return AbstractC12884g.m36218x((String) obj);
            case 7:
                return AbstractC12884g.m36204j(obj);
            case 8:
                InterfaceC14443m DslBuilderProperty = (InterfaceC14443m) obj;
                AbstractC22676k.m65750j(DslBuilderProperty, "$this$DslBuilderProperty");
                C14432b c14432b = ((C14435e) DslBuilderProperty).f52692a;
                c14432b.getClass();
                return new C13161j(c14432b, 7);
            case 9:
                return AbstractC13176i.m36990y((AbstractC4574a) obj);
            case 10:
                return Integer.valueOf(AbstractC13176i.m36952J(((Integer) obj).intValue()));
            case 11:
                return Integer.valueOf(AbstractC13176i.m36953K(((Integer) obj).intValue()));
            case 12:
                return Integer.valueOf(AbstractC13176i.m36954L(((Integer) obj).intValue()));
            case 13:
                return Integer.valueOf(AbstractC13176i.m36955M(((Integer) obj).intValue()));
            case 14:
                return AbstractC13176i.m36946D((AbstractC3235h) obj);
            case 15:
                return AbstractC13176i.m36948F((AbstractC4574a) obj);
            case 16:
                return AbstractC13176i.m36951I((InterfaceC3770q) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC13177j.m37008P((AbstractC4574a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13177j.m36996D((InterfaceC3770q) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Integer.valueOf(AbstractC13177j.m36997E(((Integer) obj).intValue()));
            case 20:
                return Integer.valueOf(AbstractC13177j.m36998F(((Integer) obj).intValue()));
            case 21:
                return Integer.valueOf(AbstractC13177j.m36999G(((Integer) obj).intValue()));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Integer.valueOf(AbstractC13177j.m37000H(((Integer) obj).intValue()));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC13177j.m37040w((AbstractC3235h) obj);
            case 24:
                return AbstractC13177j.m37042y((AbstractC4574a) obj);
            case 25:
                return AbstractC13181n.m37056j((InterfaceC26064q) obj);
            case 26:
                return AbstractC13181n.m37061o(obj);
            case 27:
                return C13223c.m37121c((C21724c) obj);
            case 28:
                return AbstractC13234d.m37167i(obj);
            default:
                return AbstractC13240g.m37201f(obj);
        }
    }
}
