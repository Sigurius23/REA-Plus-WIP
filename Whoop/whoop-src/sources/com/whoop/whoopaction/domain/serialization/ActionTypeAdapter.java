package com.whoop.whoopaction.domain.serialization;

import ad3.AbstractC0757c;
import ad3.C0764g;
import cd3.C4455g;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.json.C9602a;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.UnknownAction;
import j93.InterfaceC21461d;
import java.lang.reflect.Type;
import java.util.Map;
import l83.C23454a0;
import m83.C25272z;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import to1.C34015h;
import tr2.InterfaceC34116n;
import u82.AbstractC34650k;
import uw2.C35317b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B/\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!¨\u0006#"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/serialization/ActionTypeAdapter;", "Lcom/google/gson/JsonSerializer;", "Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/google/gson/JsonDeserializer;", "", "", "Lj93/d;", "customActionTypes", "Ltr2/n;", "logger", "<init>", "(Ljava/util/Map;Ltr2/n;)V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "context", "Lcom/google/gson/JsonElement;", "d", "(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;", "json", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "b", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/whoopaction/domain/models/Action;", "a", "Ljava/util/Map;", "Ltr2/n;", "Luw2/b;", "c", "Luw2/b;", "actionSerializer", "Lad3/c;", "Lad3/c;", "jsonModule", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ActionTypeAdapter implements JsonSerializer<Action>, JsonDeserializer<Action> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, InterfaceC21461d> customActionTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C35317b actionSerializer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC0757c jsonModule;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionTypeAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m28437c(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        C4455g c4455g = new C4455g();
        c4455g.mo2325k(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), new C9602a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        Json.f2788o = c4455g.m13953r();
        return C23454a0.f92919a;
    }

    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Action deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(typeOfT, "typeOfT");
        AbstractC22676k.m65750j(context, "context");
        try {
            AbstractC0757c abstractC0757c = this.jsonModule;
            String string = json.toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            return (Action) this.jsonModule.m1830a(this.actionSerializer, abstractC0757c.m1835f(string));
        } catch (Exception e5) {
            this.logger.mo85230v("Action deserialization failed, returning UnknownAction", e5, new AbstractC30556a.a[0]);
            return UnknownAction.INSTANCE;
        }
    }

    @Override // com.google.gson.JsonSerializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public JsonElement serialize(Action src, Type typeOfSrc, JsonSerializationContext context) {
        AbstractC22676k.m65750j(typeOfSrc, "typeOfSrc");
        AbstractC22676k.m65750j(context, "context");
        throw new UnsupportedOperationException("Serialization of Action not supported. Actions only deserialized from backend.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionTypeAdapter(Map<String, ? extends InterfaceC21461d> customActionTypes, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(customActionTypes, "customActionTypes");
        AbstractC22676k.m65750j(logger, "logger");
        this.customActionTypes = customActionTypes;
        this.logger = logger;
        this.actionSerializer = new C35317b(customActionTypes, logger);
        this.jsonModule = AbstractC34132o.m107878b(AbstractC34650k.m109496c(), new C34015h(22));
    }

    public /* synthetic */ ActionTypeAdapter(Map map, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActionTypeAdapter") : interfaceC34116n);
    }
}
