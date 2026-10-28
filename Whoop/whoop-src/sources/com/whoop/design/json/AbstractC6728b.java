package com.whoop.design.json;

import ad3.AbstractC0757c;
import ad3.C0764g;
import cd3.AbstractC4454f;
import cd3.AbstractC4457i;
import cd3.C4452d;
import cd3.C4455g;
import com.whoop.design.json.serializers.ExampleDataClass;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.graph.plot.GraphPlot;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.FeatureSpecificAppScreen;
import com.whoop.navigation.json.C9602a;
import com.whoop.whoopaction.domain.models.Action;
import iy1.C21033f;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.util.Map;
import l83.C23454a0;
import m83.C25272z;
import o91.C27684a;
import o91.C27686c;
import o91.C27688e;
import p007a6.C0467z0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import rr2.InterfaceC31766c;
import u82.AbstractC34650k;
import uw2.C35317b;
import xf3.C38266c;

/* JADX INFO: renamed from: com.whoop.design.json.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a}\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00030\u00012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00030\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010\u001ay\u0010\u0011\u001a\u00020\u000e2\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00030\u00012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00030\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012\u001aw\u0010\u0013\u001a\u00020\u000e2\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00030\u00012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00030\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012\"\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lxf3/c;", "", "", "Lj93/d;", "featureModels", "Lcom/whoop/navigation/FeatureSpecificAppScreen;", "Lcom/whoop/navigation/NavigationScreenModel;", "screenModelMap", "Lcom/whoop/whoopaction/domain/models/Action;", "customActionTypes", "Liy1/c;", "metricWriter", "Lrr2/c;", "crashReporter", "Lad3/c;", "c", "(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;)Lad3/c;", "b", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;)Lad3/c;", "f", "Lcd3/f;", "a", "Lcd3/f;", "getDesignModelSerializersModule", "()Lcd3/f;", "designModelSerializersModule", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6728b {

    /* JADX INFO: renamed from: a */
    private static final AbstractC4454f f25691a;

    static {
        C4455g c4455g = new C4455g();
        C27686c c27686c = C27686c.f111452a;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c4455g.mo2325k(c22673i0.getOrCreateKotlinClass(ExampleDataClass.class), c27686c);
        c4455g.mo2325k(c22673i0.getOrCreateKotlinClass(GraphPlot.class), C27688e.f111459a);
        f25691a = c4455g.m13953r();
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC0757c m20377b(Map<String, ? extends InterfaceC21461d> featureModels, Map<FeatureSpecificAppScreen, ? extends InterfaceC21461d> screenModelMap, Map<String, ? extends InterfaceC21461d> customActionTypes, InterfaceC21030c metricWriter, InterfaceC31766c interfaceC31766c) {
        AbstractC22676k.m65750j(featureModels, "featureModels");
        AbstractC22676k.m65750j(screenModelMap, "screenModelMap");
        AbstractC22676k.m65750j(customActionTypes, "customActionTypes");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        return m20381f(featureModels, screenModelMap, customActionTypes, metricWriter, interfaceC31766c);
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC0757c m20378c(C38266c c38266c, Map<String, ? extends InterfaceC21461d> featureModels, Map<FeatureSpecificAppScreen, ? extends InterfaceC21461d> screenModelMap, Map<String, ? extends InterfaceC21461d> customActionTypes, InterfaceC21030c metricWriter, InterfaceC31766c interfaceC31766c) {
        AbstractC22676k.m65750j(c38266c, "<this>");
        AbstractC22676k.m65750j(featureModels, "featureModels");
        AbstractC22676k.m65750j(screenModelMap, "screenModelMap");
        AbstractC22676k.m65750j(customActionTypes, "customActionTypes");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        return m20381f(featureModels, screenModelMap, customActionTypes, metricWriter, interfaceC31766c);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ AbstractC0757c m20379d(Map map, Map map2, Map map3, InterfaceC21030c interfaceC21030c, InterfaceC31766c interfaceC31766c, int i13, Object obj) {
        int i14 = i13 & 1;
        C25272z c25272z = C25272z.f99163w;
        if (i14 != 0) {
            map = c25272z;
        }
        if ((i13 & 2) != 0) {
            map2 = c25272z;
        }
        if ((i13 & 4) != 0) {
            map3 = c25272z;
        }
        if ((i13 & 8) != 0) {
            interfaceC21030c = C21033f.f79657a;
        }
        if ((i13 & 16) != 0) {
            interfaceC31766c = null;
        }
        return m20377b(map, map2, map3, interfaceC21030c, interfaceC31766c);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC0757c m20380e(C38266c c38266c, Map map, Map map2, Map map3, InterfaceC21030c interfaceC21030c, InterfaceC31766c interfaceC31766c, int i13, Object obj) {
        int i14 = i13 & 1;
        C25272z c25272z = C25272z.f99163w;
        if (i14 != 0) {
            map = c25272z;
        }
        if ((i13 & 2) != 0) {
            map2 = c25272z;
        }
        if ((i13 & 4) != 0) {
            map3 = c25272z;
        }
        if ((i13 & 8) != 0) {
            interfaceC21030c = (InterfaceC21030c) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        }
        if ((i13 & 16) != 0) {
            interfaceC31766c = (InterfaceC31766c) c38266c.m122604c(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), null);
        }
        return m20378c(c38266c, map, map2, map3, interfaceC21030c, interfaceC31766c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    private static final AbstractC0757c m20381f(Map<String, ? extends InterfaceC21461d> map, Map<FeatureSpecificAppScreen, ? extends InterfaceC21461d> map2, Map<String, ? extends InterfaceC21461d> map3, InterfaceC21030c interfaceC21030c, InterfaceC31766c interfaceC31766c) {
        C4455g c4455g = new C4455g();
        C27684a c27684a = new C27684a(map, null, interfaceC31766c, 2, null);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c4455g.mo2325k(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), c27684a);
        C4452d c4452dM13953r = c4455g.m13953r();
        C4455g c4455g2 = new C4455g();
        c4455g2.mo2325k(c22673i0.getOrCreateKotlinClass(C9598e.class), new C9602a(map2, interfaceC21030c));
        C4452d c4452dM13953r2 = c4455g2.m13953r();
        C4455g c4455g3 = new C4455g();
        c4455g3.mo2325k(c22673i0.getOrCreateKotlinClass(Action.class), new C35317b(map3, null, 2, 0 == true ? 1 : 0));
        return AbstractC34132o.m107878b(AbstractC34650k.m109496c(), new C0467z0(c4452dM13953r, c4452dM13953r2, c4455g3.m13953r(), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m20382g(AbstractC4454f abstractC4454f, AbstractC4454f abstractC4454f2, AbstractC4454f abstractC4454f3, C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2788o = AbstractC4457i.m13960a(AbstractC4457i.m13960a(AbstractC4457i.m13960a(f25691a, abstractC4454f), abstractC4454f2), abstractC4454f3);
        return C23454a0.f92919a;
    }
}
