package x30;

import al1.C0982c;
import android.os.Parcel;
import android.view.Window;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.universalcheckout.features.buynow.view.UniversalBuyNowDialogFragment;
import dc3.C11923h;
import dp0.InterfaceC12251g;
import e11.C12584d;
import ec3.C13045h2;
import g40.C15430u2;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p031b9.C2817b;
import p127ev.AbstractC13673n;
import p294l3.C23277r0;
import p329n0.InterfaceC26064q;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.AbstractC40313e4;
import p748zc1.AbstractC40490v2;
import p748zc1.C40324f4;
import tk2.C33894l;
import tk2.InterfaceC33892j;
import uw1.C35311d;
import vp2.C36276c;
import wb0.C37035f;
import wf1.C37245c;
import wn2.InterfaceC37431i;
import x22.C37864c;
import x31.AbstractC37947f;
import x31.EnumC37944c;
import x90.C38096b;
import x90.C38097c;
import xd3.C38223f;
import xp2.AbstractC38537f;
import y31.C39192a;
import y31.C39193b;
import yb0.AbstractC39388k;
import yf1.AbstractC39518g;
import yi0.AbstractC39566d;
import yi1.InterfaceC39570d;
import yk2.AbstractC39612l;
import yn2.AbstractC39675b;
import yw1.AbstractC39826m;
import yz0.AbstractC39905b;
import yz0.C39906c;
import z22.AbstractC40029h;
import zi1.AbstractC40677g;
import zk1.AbstractC40837a;
import zk1.C40839c;
import zq0.AbstractC40965f;
import zt2.AbstractC41141j;

/* JADX INFO: renamed from: x30.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C37900j1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162277w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f162278x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f162279y;

    public /* synthetic */ C37900j1(int i13, Object obj, Object obj2) {
        this.f162277w = i13;
        this.f162279y = obj;
        this.f162278x = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f162277w) {
            case 0:
                C15430u2 c15430u2 = (C15430u2) this.f162279y;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f162278x;
                ((Boolean) obj).getClass();
                AbstractC13673n.m38550B(!((Boolean) interfaceC28601c1.getValue()).booleanValue(), (C13045h2) c15430u2.f58003e, null);
                return C23454a0.f92919a;
            case 1:
                C37906l1 c37906l1 = (C37906l1) this.f162279y;
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) this.f162278x;
                ((Boolean) obj).getClass();
                AbstractC13673n.m38550B(!((Boolean) interfaceC28601c2.getValue()).booleanValue(), c37906l1.f162296b, null);
                return C23454a0.f92919a;
            case 2:
                return AbstractC37947f.m121494A((EnumC37944c) this.f162279y, (InterfaceC28601c1) this.f162278x, (C23277r0) obj);
            case 3:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f162279y;
                C11923h c11923h = (C11923h) this.f162278x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (atomicBoolean.compareAndSet(false, true)) {
                    c11923h.mo32218s(c23454a0);
                }
                return c23454a0;
            case 4:
                return ((C38096b) this.f162279y).m122053j((C38097c) this.f162278x, (InterfaceC33687a) obj);
            case 5:
                C38223f c38223f = (C38223f) this.f162279y;
                C2817b c2817b = (C2817b) this.f162278x;
                IOException it = (IOException) obj;
                AbstractC22676k.m65750j(it, "it");
                synchronized (c38223f) {
                    c2817b.m8008i();
                }
                return C23454a0.f92919a;
            case 6:
                return AbstractC38537f.m123468l((C36276c.c) this.f162279y, (Function1) this.f162278x, (InterfaceC26064q) obj);
            case 7:
                return C39193b.m124836e((InterfaceC12251g) this.f162279y, (Function1) this.f162278x, (C39192a) obj);
            case 8:
                return AbstractC39388k.m125728l0((C37035f) this.f162279y, (Function1) this.f162278x, ((Boolean) obj).booleanValue());
            case 9:
                return AbstractC39518g.m126208m((C37245c.d) this.f162279y, (Function1) this.f162278x, (InterfaceC26064q) obj);
            case 10:
                return AbstractC39566d.m126354p((Map) this.f162279y, (InterfaceC28601c1) this.f162278x, (C28624i0) obj);
            case 11:
                return AbstractC39566d.m126362x((ProgressButtonModel) this.f162279y, (Function1) this.f162278x, (EnumC3919c) obj);
            case 12:
                return AbstractC39612l.m126524W((Function1) this.f162279y, (C33894l) this.f162278x, (InterfaceC33892j) obj);
            case 13:
                return AbstractC39675b.m126897u((InterfaceC37431i) this.f162279y, (Function1) this.f162278x, (InterfaceC26064q) obj);
            case 14:
                return UniversalBuyNowDialogFragment.m27596X((UniversalBuyNowDialogFragment) this.f162279y, (InterfaceC37431i) this.f162278x, obj);
            case 15:
                return AbstractC39826m.m127745k((C35311d.c) this.f162279y, (Function1) this.f162278x, (InterfaceC26064q) obj);
            case 16:
                return AbstractC39905b.m128015e((C39906c) this.f162279y, (Function1) this.f162278x, (Modifier) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                Parcel parcel = (Parcel) this.f162279y;
                ClassLoader classLoader = (ClassLoader) this.f162278x;
                ((Integer) obj).intValue();
                return parcel.readValue(classLoader);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40029h.m128338o((C37864c.d) this.f162279y, (Function1) this.f162278x, (InterfaceC26064q) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40490v2.m131020r((String) this.f162279y, (InterfaceC28601c1) this.f162278x, obj);
            case 20:
                return AbstractC40313e4.m129648l((C40324f4) this.f162279y, (InterfaceC28601c1) this.f162278x, obj);
            case 21:
                return AbstractC40677g.m132053g((InterfaceC39570d.c) this.f162279y, (Function1) this.f162278x, (InterfaceC26064q) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40837a.m132343o((C0982c) this.f162279y, (C40839c) this.f162278x, (String) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40965f.m132980u((Window) this.f162279y, (InterfaceC23462h) this.f162278x, (C28624i0) obj);
            default:
                return AbstractC41141j.m133615l((C12584d) this.f162279y, (InterfaceC4339a) this.f162278x, obj);
        }
    }
}
