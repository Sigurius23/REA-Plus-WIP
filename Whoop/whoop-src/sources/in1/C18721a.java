package in1;

import an1.AbstractC1057a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.homecustomization.domain.models.CustomizableMetricModel;
import com.whoop.homecustomization.domain.models.CustomizeOverviewResponse;
import dn1.C12220d;
import dn1.C12221e;
import dn1.C12225i;
import dn1.InterfaceC12219c;
import dn1.InterfaceC12222f;
import e41.C12704i;
import e41.EnumC12706k;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import ln1.C24526d;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: in1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0017\u001a\u00020\u0016*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u0019*\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lin1/a;", "", "<init>", "()V", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "response", "Ldn1/i;", "selectedValue", "Lin1/g;", "saveState", "Lin1/d;", "f", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;Ldn1/i;Lin1/g;)Lin1/d;", "Lin1/h;", "e", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;)Lin1/h;", "Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;", "", "index", "", "isDraggable", "shouldHighlight", "Le41/i;", "a", "(Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;IZZ)Le41/i;", "Lln1/d;", "d", "(Lcom/whoop/homecustomization/domain/models/CustomizableMetricModel;Z)Lln1/d;", "Ldn1/c;", "b", "(Ldn1/c;)Lin1/d;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18721a {
    /* JADX INFO: renamed from: a */
    private final C12704i m54436a(CustomizableMetricModel customizableMetricModel, int i13, boolean z4, boolean z13) {
        String metric = customizableMetricModel.getMetric();
        EnumC16313m0 enumC16313m0M46377b = AbstractC16315n0.m46377b(customizableMetricModel.getIcon());
        if (enumC16313m0M46377b == null) {
            enumC16313m0M46377b = EnumC16313m0.WHOOP_W_CIRCLE;
        }
        return new C12704i(metric, null, false, z13, z4, false, true, false, enumC16313m0M46377b, AbstractC16315n0.m46377b(customizableMetricModel.getPreviewIcon()), AbstractC8693b.m21278l(customizableMetricModel.getName()), EnumC12706k.NOT_EXPANDED, 162, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C12704i m54437c(C18721a c18721a, CustomizableMetricModel customizableMetricModel, int i13, boolean z4, boolean z13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            z13 = false;
        }
        return c18721a.m54436a(customizableMetricModel, i13, z4, z13);
    }

    /* JADX INFO: renamed from: d */
    private final C24526d m54438d(CustomizableMetricModel customizableMetricModel, boolean z4) {
        EnumC16313m0 enumC16313m0;
        String metric = customizableMetricModel.getMetric();
        String icon = customizableMetricModel.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new C24526d(metric, z4, enumC16313m1, AbstractC8693b.m21278l(customizableMetricModel.getName()));
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC18728h m54439e(CustomizeOverviewResponse response) {
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC18724d m54440f(CustomizeOverviewResponse response, C12225i selectedValue, EnumC18727g saveState) {
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC1057a.f4119c);
        m54439e(response);
        TextResource pinnedMetricsHeader = response.getPinnedMetricsHeader();
        List<CustomizableMetricModel> metrics = response.getPinnedMetricsSection().getMetrics();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(metrics, 10));
        int i13 = 0;
        for (Object obj : metrics) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(m54437c(this, (CustomizableMetricModel) obj, i13, true, false, 4, null));
            i13 = i14;
        }
        C18726f c18726f = new C18726f(pinnedMetricsHeader, arrayList);
        TextResource unpinnedMetricsHeader = response.getUnpinnedMetricsHeader();
        List<CustomizableMetricModel> metrics2 = response.getUnpinnedMetricsSection().getMetrics();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(metrics2, 10));
        int i15 = 0;
        for (Object obj2 : metrics2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList2.add(m54437c(this, (CustomizableMetricModel) obj2, i15, false, false, 4, null));
            i15 = i16;
        }
        C18726f c18726f2 = new C18726f(unpinnedMetricsHeader, arrayList2);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC1057a.f4127k);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC1057a.f4123g);
        TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC1057a.f4125i);
        List<CustomizableMetricModel> bottomSheetMetrics = response.getBottomSheetMetrics();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(bottomSheetMetrics, 10));
        for (CustomizableMetricModel customizableMetricModel : bottomSheetMetrics) {
            arrayList3.add(m54438d(customizableMetricModel, AbstractC22676k.m65745e(customizableMetricModel.getMetric(), selectedValue != null ? selectedValue.getSelectedMetricType() : null)));
        }
        return new InterfaceC18724d.c(c8688bM21277k, null, c18726f, c18726f2, c8688bM21277k2, new C18725e(c8688bM21277k3, c8688bM21277k4, arrayList3, AbstractC8693b.m21277k(AbstractC1057a.f4122f)), saveState);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC18724d m54441g(C18721a c18721a, CustomizeOverviewResponse customizeOverviewResponse, C12225i c12225i, EnumC18727g enumC18727g, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            c12225i = null;
        }
        if ((i13 & 4) != 0) {
            enumC18727g = null;
        }
        return c18721a.m54440f(customizeOverviewResponse, c12225i, enumC18727g);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC18724d m54442b(InterfaceC12219c response) {
        AbstractC22676k.m65750j(response, "response");
        if (response instanceof InterfaceC12219c.a) {
            return InterfaceC18724d.b.f73582a;
        }
        if (response instanceof C12220d) {
            return new InterfaceC18724d.a(((C12220d) response).getErrorType());
        }
        if (response instanceof C12221e) {
            C12221e c12221e = (C12221e) response;
            return m54441g(this, c12221e.getResponse(), c12221e.getSelectedValue(), null, 4, null);
        }
        if (response instanceof InterfaceC12222f.a) {
            return m54441g(this, ((InterfaceC12222f.a) response).getResponse(), null, EnumC18727g.ERROR, 2, null);
        }
        if (response instanceof InterfaceC12222f.c) {
            return m54441g(this, ((InterfaceC12222f.c) response).getResponse(), null, EnumC18727g.SUCCESS, 2, null);
        }
        if (response instanceof InterfaceC12222f.b) {
            return m54441g(this, ((InterfaceC12222f.b) response).getResponse(), null, EnumC18727g.SAVING, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
