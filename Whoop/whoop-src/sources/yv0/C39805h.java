package yv0;

import android.app.Application;
import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.core.networking.SendAnalyticsRequestV2Worker;
import com.whoop.core.details.activitytargets.ActivityTargetsModel;
import com.whoop.nativestore.pdp.domain.model.PackItemModel;
import com.whoop.nativestore.pdp.domain.model.ProductAccordionListModel;
import com.whoop.nativestore.pdp.domain.model.ProductDescriptionHeaderModel;
import com.whoop.nativestore.pdp.domain.model.ProductDetailsSectionModel;
import com.whoop.nativestore.pdp.domain.model.ProductVariantSelectorModel;
import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxMeasurementModel;
import ih0.AbstractC18489d0;
import jb1.C21536b;
import p012ab.C0684i0;
import p664yy.C39853d;
import p664yy.C39883w;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;
import q30.C29938w0;
import yb3.C39408l;
import yb3.C39410n;
import yb3.InterfaceC39407k;
import yv2.AbstractC39811e;
import yx2.C39846a;
import yy2.C39897a;
import yz1.AbstractC39907a;
import yz1.AbstractC39908b;
import yz1.AbstractC39909c;
import yz1.AbstractC39910d;
import yz1.AbstractC39912f;
import yz1.AbstractC39914h;

/* JADX INFO: renamed from: yv0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C39805h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171541w;

    public /* synthetic */ C39805h(int i13) {
        this.f171541w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f171541w) {
            case 0:
                return AbstractC39806i.m127604f((ActivityTargetsModel) obj);
            case 1:
                return AbstractC39811e.m127636g((C21536b) obj);
            case 2:
                return AbstractC39811e.m127639j((C25308q) obj);
            case 3:
                return AbstractC39811e.m127637h((C23749z0) obj);
            case 4:
                return AbstractC39811e.m127638i((OneRepMaxMeasurementModel) obj);
            case 5:
                return C39846a.m127924d((C21536b) obj);
            case 6:
                return AnalyticsRequestV2.createPostParams$lambda$1((C39853d) obj);
            case 7:
                InterfaceC39407k it = (InterfaceC39407k) obj;
                AbstractC22676k.m65750j(it, "it");
                return AbstractC18489d0.m53369j(((C39408l) ((C39410n) it).m125843a()).get(1), "<b>", "</b>");
            case 8:
                InterfaceC39407k it3 = (InterfaceC39407k) obj;
                AbstractC22676k.m65750j(it3, "it");
                return AbstractC18489d0.m53369j(((C39408l) ((C39410n) it3).m125843a()).get(1), "<b>", "</b>");
            case 9:
                InterfaceC39407k it4 = (InterfaceC39407k) obj;
                AbstractC22676k.m65750j(it4, "it");
                C39410n c39410n = (C39410n) it4;
                return "<a href=\"" + ((C39408l) c39410n.m125843a()).get(2) + "\">" + ((C39408l) c39410n.m125843a()).get(1) + "</a>";
            case 10:
                C39883w it5 = (C39883w) obj;
                AbstractC22676k.m65750j(it5, "it");
                return it5.toString();
            case 11:
                Context it6 = (Context) obj;
                C0684i0 c0684i0 = SendAnalyticsRequestV2Worker.f22162w;
                AbstractC22676k.m65750j(it6, "it");
                Context applicationContext = it6.getApplicationContext();
                AbstractC22676k.m65748h(applicationContext, "null cannot be cast to non-null type android.app.Application");
                return new C29938w0((Application) applicationContext);
            case 12:
                String name = (String) obj;
                AbstractC22676k.m65750j(name, "name");
                String property = System.getProperty(name);
                return property == null ? "" : property;
            case 13:
                return C39897a.m127998d((C21536b) obj);
            case 14:
                return AbstractC39907a.m128025e((C21536b) obj);
            case 15:
                return AbstractC39907a.m128026f((C23749z0) obj);
            case 16:
                return AbstractC39907a.m128027g((PackItemModel) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC39908b.m128034e((C21536b) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC39908b.m128035f((C23749z0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC39908b.m128036g((ProductAccordionListModel) obj);
            case 20:
                return AbstractC39909c.m128044e((C21536b) obj);
            case 21:
                return AbstractC39909c.m128045f((C23749z0) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC39909c.m128046g((ProductDescriptionHeaderModel) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC39910d.m128053e((C21536b) obj);
            case 24:
                return AbstractC39910d.m128054f((C23749z0) obj);
            case 25:
                return AbstractC39910d.m128055g((ProductDetailsSectionModel) obj);
            case 26:
                return AbstractC39912f.m128064e((C21536b) obj);
            case 27:
                return AbstractC39912f.m128065f((C23749z0) obj);
            case 28:
                return AbstractC39912f.m128066g((ProductVariantSelectorModel) obj);
            default:
                return AbstractC39914h.m128076g((C21536b) obj);
        }
    }
}
