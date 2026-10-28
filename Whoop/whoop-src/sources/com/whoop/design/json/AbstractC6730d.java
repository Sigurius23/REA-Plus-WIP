package com.whoop.design.json;

import ad3.AbstractC0757c;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.graph.plot.GraphPlot;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.json.AppScreenTypeAdapterFactory;
import com.whoop.navigation.json.NavigationActionTypeAdapter;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.serialization.ActionTypeAdapter;
import iy1.C21033f;
import iy1.InterfaceC21030c;
import j93.InterfaceC21461d;
import java.lang.reflect.Type;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import u82.AbstractC34650k;
import w82.AbstractC36948a;
import xf3.C38266c;

/* JADX INFO: renamed from: com.whoop.design.json.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00050\u0003¢\u0006\u0004\b\t\u0010\n\u001aI\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00050\u0003¢\u0006\u0004\b\u000b\u0010\f\u001aS\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00032\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00050\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lxf3/c;", "Lcom/google/gson/GsonBuilder;", "gsonBuilder", "", "", "Lj93/d;", "featureModels", "Lcom/whoop/whoopaction/domain/models/Action;", "featureActions", "e", "(Lxf3/c;Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;", "d", "(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;", "Liy1/c;", "metricWriter", "b", "(Lcom/google/gson/GsonBuilder;Liy1/c;Ljava/util/Map;Ljava/util/Map;)Lcom/google/gson/GsonBuilder;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6730d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final GsonBuilder m20384b(GsonBuilder gsonBuilder, InterfaceC21030c metricWriter, Map<String, ? extends InterfaceC21461d> featureModels, Map<String, ? extends InterfaceC21461d> featureActions) {
        AbstractC22676k.m65750j(gsonBuilder, "<this>");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(featureModels, "featureModels");
        AbstractC22676k.m65750j(featureActions, "featureActions");
        gsonBuilder.setFieldNamingStrategy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        gsonBuilder.registerTypeAdapter(AiAction.class, new C6729c());
        int i13 = 2;
        gsonBuilder.registerTypeAdapter(DesignSystemModel.class, new DesignSystemDeserializer(featureModels, null, i13, 0 == true ? 1 : 0));
        int i14 = 1;
        gsonBuilder.registerTypeAdapter(C9598e.class, new NavigationActionTypeAdapter(0 == true ? 1 : 0, metricWriter, i14, 0 == true ? 1 : 0));
        gsonBuilder.registerTypeAdapter(Action.class, new ActionTypeAdapter(featureActions, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0));
        gsonBuilder.registerTypeAdapter(AnyModal.class, new AnyModalDeserializer());
        gsonBuilder.registerTypeAdapter(GraphPlot.class, new GraphPlotDeserializer());
        gsonBuilder.registerTypeAdapter(TextResource.class, new TextResourceDeserializer());
        gsonBuilder.registerTypeAdapterFactory(new DesignSystemEnumTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new AppScreenTypeAdapterFactory(0 == true ? 1 : 0, i14, 0 == true ? 1 : 0));
        AbstractC36948a.m118635a(gsonBuilder);
        return gsonBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final AiAction m20385c(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
        String string = jsonElement.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        abstractC0757cM109496c.getClass();
        return (AiAction) abstractC0757cM109496c.m1831b(AiAction.INSTANCE.serializer(), string);
    }

    /* JADX INFO: renamed from: d */
    public static final GsonBuilder m20386d(GsonBuilder gsonBuilder, Map<String, ? extends InterfaceC21461d> featureModels, Map<String, ? extends InterfaceC21461d> featureActions) {
        AbstractC22676k.m65750j(gsonBuilder, "<this>");
        AbstractC22676k.m65750j(featureModels, "featureModels");
        AbstractC22676k.m65750j(featureActions, "featureActions");
        return m20384b(gsonBuilder, C21033f.f79657a, featureModels, featureActions);
    }

    /* JADX INFO: renamed from: e */
    public static final GsonBuilder m20387e(C38266c c38266c, GsonBuilder gsonBuilder, Map<String, ? extends InterfaceC21461d> featureModels, Map<String, ? extends InterfaceC21461d> featureActions) {
        AbstractC22676k.m65750j(c38266c, "<this>");
        AbstractC22676k.m65750j(gsonBuilder, "gsonBuilder");
        AbstractC22676k.m65750j(featureModels, "featureModels");
        AbstractC22676k.m65750j(featureActions, "featureActions");
        return m20384b(gsonBuilder, (InterfaceC21030c) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null), featureModels, featureActions);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ GsonBuilder m20388f(GsonBuilder gsonBuilder, Map map, Map map2, int i13, Object obj) {
        int i14 = i13 & 1;
        C25272z c25272z = C25272z.f99163w;
        if (i14 != 0) {
            map = c25272z;
        }
        if ((i13 & 2) != 0) {
            map2 = c25272z;
        }
        return m20386d(gsonBuilder, map, map2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ GsonBuilder m20389g(C38266c c38266c, GsonBuilder gsonBuilder, Map map, Map map2, int i13, Object obj) {
        int i14 = i13 & 2;
        C25272z c25272z = C25272z.f99163w;
        if (i14 != 0) {
            map = c25272z;
        }
        if ((i13 & 4) != 0) {
            map2 = c25272z;
        }
        return m20387e(c38266c, gsonBuilder, map, map2);
    }
}
