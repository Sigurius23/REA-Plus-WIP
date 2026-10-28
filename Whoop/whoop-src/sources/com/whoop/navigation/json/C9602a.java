package com.whoop.navigation.json;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import ad3.InterfaceC0773p;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.FeatureSpecificAppScreen;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.exception.NavigationDeserializationException;
import iy1.C21033f;
import iy1.InterfaceC21030c;
import j02.C21173v0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25267u;
import m83.C25272z;
import p000.AbstractC11266d;
import p097ds.AbstractC12313p;
import p549vb.AbstractC35862g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: com.whoop.navigation.json.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B/\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m65681d2 = {"Lcom/whoop/navigation/json/a;", "Lwc3/c;", "Lcom/whoop/navigation/e;", "", "Lcom/whoop/navigation/FeatureSpecificAppScreen;", "Lj93/d;", "Lcom/whoop/navigation/NavigationScreenModel;", "screenModelMap", "Liy1/c;", "metricWriter", "<init>", "(Ljava/util/Map;Liy1/c;)V", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "b", "(Lzc3/e;Lcom/whoop/navigation/e;)V", "Lzc3/d;", "decoder", "a", "(Lzc3/d;)Lcom/whoop/navigation/e;", "Ljava/util/Map;", "Liy1/c;", "Ltr2/n;", "c", "Ltr2/n;", "logger", "Lyc3/g;", "d", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "e", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9602a implements InterfaceC37138c {

    /* JADX INFO: renamed from: f */
    public static final int f28151f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<FeatureSpecificAppScreen, InterfaceC21461d> screenModelMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39443g descriptor;

    /* JADX WARN: Multi-variable type inference failed */
    public C9602a(Map<FeatureSpecificAppScreen, ? extends InterfaceC21461d> screenModelMap, InterfaceC21030c metricWriter) {
        AbstractC22676k.m65750j(screenModelMap, "screenModelMap");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.screenModelMap = screenModelMap;
        this.metricWriter = metricWriter;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("NavigationActionSerializer");
        this.descriptor = AbstractC35952b.m114195c("NavigationAction", new InterfaceC39443g[0]);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C9598e deserialize(InterfaceC40541d decoder) {
        String content;
        JsonObject jsonObject;
        NavigationScreenModel navigationScreenModel;
        JsonElement jsonElement;
        String content2;
        AbstractC22676k.m65750j(decoder, "decoder");
        C21173v0 c21173v0 = null;
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new SerializationException("NavigationActionSerializer only works with JSON");
        }
        JsonElement jsonElementMo1838b = interfaceC0768k.mo1838b();
        if (!(jsonElementMo1838b instanceof JsonObject)) {
            this.logger.mo85222m("Failed to find the element NavigationAction: " + jsonElementMo1838b, new AbstractC30556a.a[0]);
            return new C9598e(null, null, null, 7, null);
        }
        JsonObject jsonObject2 = (JsonObject) jsonElementMo1838b;
        JsonElement jsonElement2 = (JsonElement) jsonObject2.get((Object) HMSTrackSource.SCREEN);
        if (jsonElement2 == null || (content = AbstractC0770m.m1848j(jsonElement2).getContent()) == null) {
            throw new SerializationException("NavigationAction is missing \"screen\"");
        }
        JsonElement jsonElement3 = (JsonElement) jsonObject2.get((Object) "parameters");
        if (jsonElement3 == null) {
            jsonObject = new JsonObject(C25272z.f99163w);
        } else {
            if (!(jsonElement3 instanceof JsonObject)) {
                throw new SerializationException(AbstractC11266d.m30461o("NavigationAction \"parameters\" must be an object, got ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(jsonElement3.getClass()).getSimpleName()));
            }
            jsonObject = (JsonObject) jsonElement3;
        }
        Object obj = jsonObject2.get((Object) "tab");
        JsonObject jsonObject3 = obj instanceof JsonObject ? (JsonObject) obj : null;
        if (jsonObject3 != null && (jsonElement = (JsonElement) jsonObject3.get((Object) "id")) != null && (content2 = AbstractC0770m.m1848j(jsonElement).getContent()) != null) {
            c21173v0 = new C21173v0(content2);
        }
        AppScreen.Companion companion = AppScreen.INSTANCE;
        Set<FeatureSpecificAppScreen> setKeySet = this.screenModelMap.keySet();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeatureSpecificAppScreen) it.next()).getName());
        }
        AppScreen appScreenM23031a = companion.m23031a(content, arrayList);
        AppScreen.C9318g6 c9318g6 = AppScreen.C9318g6.f27632w;
        if (AbstractC22676k.m65745e(appScreenM23031a, c9318g6)) {
            NavigationScreenModel.DeserializationError deserializationError = new NavigationScreenModel.DeserializationError(content, jsonObject);
            NavigationDeserializationException.INSTANCE.m23134c(content, jsonObject, this.logger, this.metricWriter);
            return new C9598e(c9318g6, deserializationError, c21173v0);
        }
        InterfaceC21461d interfaceC21461d = appScreenM23031a instanceof FeatureSpecificAppScreen ? this.screenModelMap.get(appScreenM23031a) : NavigationActionTypeAdapter.INSTANCE.m23142a().get(appScreenM23031a);
        if (interfaceC21461d != null) {
            navigationScreenModel = (NavigationScreenModel) interfaceC0768k.mo1837a().m1830a(AbstractC35862g.m113846i(interfaceC21461d), jsonObject);
            if (navigationScreenModel == null) {
                navigationScreenModel = NavigationScreenModel.None.INSTANCE;
            }
        } else {
            navigationScreenModel = NavigationScreenModel.None.INSTANCE;
        }
        return new C9598e(appScreenM23031a, navigationScreenModel, c21173v0);
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, C9598e value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC0773p interfaceC0773p = encoder instanceof InterfaceC0773p ? (InterfaceC0773p) encoder : null;
        if (interfaceC0773p == null) {
            throw new SerializationException("NavigationActionSerializer only works with JSON");
        }
        JsonPrimitive element = AbstractC0770m.m1841c(value.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName());
        InterfaceC21461d interfaceC21461d = value.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof FeatureSpecificAppScreen ? this.screenModelMap.get(value.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()) : NavigationActionTypeAdapter.INSTANCE.m23142a().get(value.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
        InterfaceC37138c interfaceC37138cM113846i = interfaceC21461d != null ? AbstractC35862g.m113846i(interfaceC21461d) : NavigationScreenModel.None.INSTANCE.serializer();
        AbstractC22676k.m65748h(interfaceC37138cM113846i, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<com.whoop.navigation.NavigationScreenModel>");
        AbstractC0757c abstractC0757cMo1852a = interfaceC0773p.mo1852a();
        NavigationScreenModel parameters = value.getParameters();
        abstractC0757cMo1852a.getClass();
        JsonElement jsonElementM34290h0 = AbstractC12313p.m34290h0(abstractC0757cMo1852a, parameters, interfaceC37138cM113846i);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC22676k.m65750j(element, "element");
        C21173v0 tab = value.getTab();
        if (tab != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            JsonPrimitive element2 = AbstractC0770m.m1841c(tab.getId());
            AbstractC22676k.m65750j(element2, "element");
        }
        interfaceC0773p.mo1853c(new JsonObject(linkedHashMap));
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return this.descriptor;
    }

    public /* synthetic */ C9602a(Map map, InterfaceC21030c interfaceC21030c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map, (i13 & 2) != 0 ? C21033f.f79657a : interfaceC21030c);
    }
}
