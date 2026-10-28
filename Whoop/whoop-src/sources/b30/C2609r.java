package b30;

import androidx.health.platform.client.proto.C1533u;
import bs1.AbstractC3583c0;
import c41.AbstractC4133v1;
import ci0.AbstractC4729d;
import com.whoop.core.details.view.AbstractC6470a;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;
import cs1.AbstractC11103c;
import do0.AbstractC12228b;
import f01.AbstractC13881n;
import fe0.AbstractC14415e;
import g40.C15396n3;
import hv2.AbstractC17687i;
import i51.AbstractC18109f;
import i51.AbstractC18121r;
import jp1.AbstractC21861m;
import kb1.C22325e;
import l83.C23454a0;
import lf0.AbstractC23938l;
import lf0.AbstractC23940l1;
import m01.AbstractC24876d;
import m80.AbstractC25222d;
import m90.AbstractC25285b;
import nh0.AbstractC26718b;
import o51.AbstractC27537c;
import p12.AbstractC28734x;
import p12.C28714e;
import p294l3.C23277r0;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p710im1.AbstractC18697t0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.EnumC40298d0;
import v41.EnumC35690s;

/* JADX INFO: renamed from: b30.r */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2609r implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10161w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f10162x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f10163y;

    public /* synthetic */ C2609r(Function1 function1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f10161w = i13;
        this.f10163y = function1;
        this.f10162x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10161w) {
            case 0:
                C2602q item = (C2602q) obj;
                AbstractC22676k.m65750j(item, "item");
                this.f10162x.setValue(Boolean.FALSE);
                this.f10163y.invoke(item);
                return C23454a0.f92919a;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return AbstractC3583c0.m10770L1(this.f10162x, this.f10163y, zBooleanValue);
            case 2:
                return AbstractC3583c0.m10836f2(this.f10162x, this.f10163y, (AbstractC11103c) obj);
            case 3:
                return AbstractC3583c0.m10809Y1(this.f10162x, this.f10163y, (AbstractC11103c) obj);
            case 4:
                return AbstractC4133v1.m12798z(this.f10163y, this.f10162x, (C23277r0) obj);
            case 5:
                return AtomicGalleryFragment.m21110G0(this.f10162x, this.f10163y, (EnumC40298d0) obj);
            case 6:
                return AbstractC4729d.m14778B(this.f10163y, this.f10162x, ((Float) obj).floatValue());
            case 7:
                return AbstractC4729d.m14779C(this.f10163y, this.f10162x, ((Float) obj).floatValue());
            case 8:
                return AbstractC12228b.m33987t(this.f10163y, this.f10162x, (String) obj);
            case 9:
                return AbstractC12228b.m33989v(this.f10163y, this.f10162x, (String) obj);
            case 10:
                return AbstractC13881n.m39400v(this.f10163y, this.f10162x, obj);
            case 11:
                return AbstractC14415e.m41073N(this.f10163y, this.f10162x, obj);
            case 12:
                C15396n3 item2 = (C15396n3) obj;
                AbstractC22676k.m65750j(item2, "item");
                this.f10163y.invoke(item2);
                this.f10162x.setValue(Boolean.FALSE);
                return C23454a0.f92919a;
            case 13:
                return AbstractC17687i.m50505k0(this.f10163y, this.f10162x, obj);
            case 14:
                return AbstractC18109f.m51971h(this.f10163y, this.f10162x, (EnumC35690s) obj);
            case 15:
                return AbstractC18121r.m52033h(this.f10163y, this.f10162x, (EnumC35690s) obj);
            case 16:
                return AbstractC18697t0.m54328f1(this.f10163y, this.f10162x, (C22325e) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                return AbstractC21861m.m61924p(this.f10162x, this.f10163y, zBooleanValue2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23938l.m70471s(this.f10163y, this.f10162x, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23940l1.m70512x(this.f10163y, this.f10162x, obj);
            case 20:
                return AbstractC24876d.m72911G(this.f10163y, this.f10162x, (InterfaceC39147y) obj);
            case 21:
                return AbstractC25222d.m73901z(this.f10163y, this.f10162x, ((Boolean) obj).booleanValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC25285b.m74211w(this.f10163y, this.f10162x, (String) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC25285b.m74205q(this.f10163y, this.f10162x, (String) obj);
            case 24:
                return AbstractC25285b.m74208t(this.f10163y, this.f10162x, (String) obj);
            case 25:
                return AbstractC26718b.m79437l(this.f10163y, this.f10162x, obj);
            case 26:
                return AbstractC27537c.m83068n(this.f10163y, this.f10162x, ((Integer) obj).intValue());
            case 27:
                return AbstractC6470a.m19772F(this.f10162x, this.f10163y, obj);
            case 28:
                return AbstractC28734x.m87409V(this.f10163y, this.f10162x, (C28714e) obj);
            default:
                C23277r0 it = (C23277r0) obj;
                AbstractC22676k.m65750j(it, "it");
                this.f10162x.setValue(it);
                this.f10163y.invoke(it);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C2609r(InterfaceC28601c1 interfaceC28601c1, Function1 function1, int i13) {
        this.f10161w = i13;
        this.f10162x = interfaceC28601c1;
        this.f10163y = function1;
    }
}
