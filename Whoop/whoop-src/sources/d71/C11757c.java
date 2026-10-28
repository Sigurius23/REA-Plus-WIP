package d71;

import ah0.C0882c;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bb0.C2921a;
import c93.InterfaceC4351m;
import com.whoop.design.showcase.shared.view.DesignShowcaseView;
import com.whoop.share.model.ShareBackground;
import d81.AbstractC11775c;
import d81.C11776d;
import d91.AbstractC11817e;
import db0.AbstractC11887c;
import dv2.C12390a;
import e71.C12801b;
import e81.AbstractC12836k;
import e81.C12837k0;
import ev2.AbstractC13712u;
import f01.AbstractC13852d0;
import f01.C13855e0;
import f51.AbstractC14099j;
import f51.C14102m;
import f71.AbstractC14223d;
import f71.C14224e;
import g01.AbstractC14940c;
import g01.C14938a;
import g11.AbstractC15219c;
import gr2.AbstractC16117e;
import gr2.C16114b;
import h00.AbstractC16518o;
import h02.AbstractC16575h0;
import h02.C16583l0;
import h20.EnumC16701n1;
import h41.AbstractC16848b;
import h41.C16849c;
import hd2.C17202d;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import i41.AbstractC18081a;
import i41.C18084d;
import id2.AbstractC18435t;
import io2.AbstractC20766j;
import io2.AbstractC20773m0;
import io2.AbstractC20775n0;
import io2.AbstractC20782s;
import io2.C20748a;
import io2.C20772m;
import io2.C20786w;
import iw0.AbstractC20992x;
import iw0.C20968f0;
import j50.AbstractC21331c;
import j50.C21332d;
import k03.C22098c;
import k31.AbstractC22173c;
import k31.C22174d;
import l83.C23454a0;
import p291l0.InterfaceC22997s1;
import p292l1.InterfaceC23098g1;
import p390p1.AbstractC28683x;
import p696zy.InterfaceC41211c;
import p708hb2.AbstractC42784j;
import se.AbstractC32410a;

/* JADX INFO: renamed from: d71.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11757c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38030w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f38031x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f38032y;

    public /* synthetic */ C11757c(Object obj, int i13, int i14) {
        this.f38030w = i14;
        this.f38032y = obj;
        this.f38031x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f38030w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i14 = this.f38031x;
        Object obj3 = this.f38032y;
        switch (i13) {
            case 0:
                return AbstractC11758d.m31456i((C12801b) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC11775c.m31567f((C11776d) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC11817e.m31686l((AbstractC11817e) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC11887c.m31879N((C2921a) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC12836k.m35987T((C12837k0) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return AbstractC13712u.m38781d0((C12390a) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC13852d0.m39242m((C13855e0) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC14099j.m40163f((C14102m) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC14223d.m40681k((C14224e) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AbstractC14940c.m43044j((C14938a) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return AbstractC15219c.m43266p((InterfaceC23098g1) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                ((Integer) obj2).intValue();
                AbstractC32410a.m101047q((InterfaceC41211c) obj3, (Composer) obj, AbstractC28683x.m87244L(i14 | 1));
                return c23454a0;
            case 12:
                return AbstractC16117e.m45660h((C16114b) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
                ((Integer) obj2).getClass();
                AbstractC16518o.m46684h((InterfaceC22997s1) obj3, (Composer) obj, AbstractC28683x.m87244L(i14 | 1));
                return c23454a0;
            case 14:
                return AbstractC16575h0.m46977m((C16583l0) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return AbstractC16848b.m47464p((C16849c) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return AbstractC42784j.m48322N((C0882c) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return DesignShowcaseView.m21259s((DesignShowcaseView) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC17808z1.m51176d((C17731c2) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC18081a.m51921c((C18084d) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return AbstractC18435t.m53131w((ShareBackground) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return AbstractC18435t.m53133y((C17202d.b) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC20766j.m57187e((C20748a) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC20766j.m57191i((C20772m) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return AbstractC20782s.m57260E((C20786w) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return AbstractC20773m0.m57230v((AbstractC20775n0.a) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return AbstractC20992x.m58357H1((C20968f0) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC21331c.m59872l((C21332d) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return C22098c.m63259z((C22098c) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC22173c.m63473e((C22174d) obj3, i14, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C11757c(InterfaceC22997s1 interfaceC22997s1, int i13) {
        this.f38030w = 13;
        EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
        this.f38032y = interfaceC22997s1;
        this.f38031x = i13;
    }
}
