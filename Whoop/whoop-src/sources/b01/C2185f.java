package b01;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import b02.AbstractC2198b;
import b02.C2202f;
import b03.AbstractC2207d;
import b10.C2273z0;
import b11.AbstractC2283j;
import b11.C2274a;
import b30.AbstractC2495c4;
import b30.C2474a;
import b30.C2497c6;
import b31.AbstractC2673b;
import b72.AbstractC2784b;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.items.ItemsCardModel;
import com.whoop.design.models.items.TagSelectorModel;
import com.whoop.nativestore.pdp.domain.model.ProductImageGalleryModel;
import com.whoop.navigation.C9598e;
import h20.AbstractC16736t0;
import h20.C16724r0;
import j93.InterfaceC21493z;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p040c0.InterfaceC3770q;
import p208i2.InterfaceC17886g0;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p745y81.C39336i;
import r20.C30877o;
import r20.InterfaceC30881s;
import y00.C38915o4;

/* JADX INFO: renamed from: b01.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C2185f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8672w;

    public /* synthetic */ C2185f(int i13) {
        this.f8672w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C38915o4 c38915o4;
        int i13 = this.f8672w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return AbstractC2187h.m6885g((InterfaceC22129c) obj);
            case 1:
                return AbstractC2195p.m6934t(obj);
            case 2:
                return AbstractC2195p.m6906H((InterfaceC17886g0) obj);
            case 3:
                return AbstractC2198b.m6962i((C21536b) obj);
            case 4:
                return AbstractC2198b.m6963j((C23749z0) obj);
            case 5:
                return AbstractC2198b.m6965l((C23749z0) obj);
            case 6:
                return AbstractC2198b.m6967n((C23749z0) obj);
            case 7:
                return AbstractC2198b.m6968o((ItemsCardModel) obj);
            case 8:
                return AbstractC2198b.m6966m((TagSelectorModel) obj);
            case 9:
                return AbstractC2198b.m6964k((ProductImageGalleryModel) obj);
            case 10:
                return C2202f.m7020p((C39336i) obj);
            case 11:
                return AbstractC2207d.m7038f(obj);
            case 12:
                return c23454a0;
            case 13:
                return c23454a0;
            case 14:
                return C2274a.m7108f((AbstractC2283j.a) obj);
            case 15:
                AbstractC22676k.m65750j((String) obj, "it");
                return c23454a0;
            case 16:
                InterfaceC30881s it = (InterfaceC30881s) obj;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(it instanceof C30877o);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51807f(semantics, 1);
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j((C2474a) obj, "it");
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                InterfaceC18044z semantics2 = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics2, "$this$semantics");
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                ((C18030l) semantics2).m51772e(AbstractC18039u.f70048o, c23454a0);
                return c23454a0;
            case 20:
                InterfaceC3770q AnimatedContent = (InterfaceC3770q) obj;
                AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
                return AbstractC2495c4.f9723a;
            case 21:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC16736t0 it3 = (AbstractC16736t0) obj;
                AbstractC22676k.m65750j(it3, "it");
                String str = null;
                C16724r0 c16724r0 = it3 instanceof C16724r0 ? (C16724r0) it3 : null;
                if (c16724r0 != null && (c38915o4 = c16724r0.f64267c) != null) {
                    str = c38915o4.f167527w;
                }
                return AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new Object[]{it3.mo47256a(), str}), "-", null, null, null, 62);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C2497c6 it4 = (C2497c6) obj;
                AbstractC22676k.m65750j(it4, "it");
                return it4.f9735b;
            case 24:
                return AbstractC2673b.m7535f((Modifier) obj);
            case 25:
                return AbstractC2673b.m7536g((Modifier) obj);
            case 26:
                return c23454a0;
            case 27:
                return p699b70.Function1.m7862s((C9598e) obj);
            case 28:
                return p699b70.Function1.m7863t((AnalyticEventModel) obj);
            default:
                return AbstractC2784b.m7905n(((Float) obj).floatValue());
        }
    }

    public /* synthetic */ C2185f(C2273z0 c2273z0) {
        this.f8672w = 13;
    }
}
