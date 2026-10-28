package com.whoop.design.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.models.modal.UnknownModal;
import j93.InterfaceC21461d;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/design/json/AnyModalDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/whoop/design/models/modal/AnyModal;", "<init>", "()V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "context", "a", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/modal/AnyModal;", "Ltr2/n;", "Ltr2/n;", "logger", "b", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AnyModalDeserializer implements JsonDeserializer<AnyModal> {

    /* JADX INFO: renamed from: b */
    private static final C6723a f25671b = new C6723a(null);

    /* JADX INFO: renamed from: c */
    public static final int f25672c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("AnyModalDeserializer");

    /* JADX INFO: renamed from: com.whoop.design.json.AnyModalDeserializer$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/json/AnyModalDeserializer$a;", "", "<init>", "()V", "", "TYPE", "Ljava/lang/String;", "CONTENT", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6723a {
        public /* synthetic */ C6723a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6723a() {
        }
    }

    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AnyModal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        Modal modal;
        String asString;
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(typeOfT, "typeOfT");
        AbstractC22676k.m65750j(context, "context");
        try {
            JsonObject asJsonObject = json.getAsJsonObject();
            JsonElement jsonElement = asJsonObject.get("type");
            if (jsonElement == null || (asString = jsonElement.getAsString()) == null) {
                throw new IllegalStateException("Missing \"type\" field");
            }
            Map<String, InterfaceC21461d> mapM20375a = C6727a.INSTANCE.m20375a();
            String upperCase = asString.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            InterfaceC21461d interfaceC21461d = mapM20375a.get(upperCase);
            if (interfaceC21461d == null) {
                throw new IllegalStateException("Unknown modal type: ".concat(asString).toString());
            }
            JsonElement jsonElement2 = asJsonObject.get("content");
            if (jsonElement2 == null) {
                throw new IllegalStateException("Missing \"content\" field");
            }
            Object objDeserialize = context.deserialize(jsonElement2, AbstractC21598x.m60663S(interfaceC21461d));
            AbstractC22676k.m65747g(objDeserialize);
            modal = (Modal) objDeserialize;
            return new AnyModal(modal, null, null, 6, null);
        } catch (Exception e5) {
            this.logger.mo85213c("Modal deserialization failed, returning UnknownModal", e5, new AbstractC30556a.a[0]);
            modal = UnknownModal.INSTANCE;
        }
    }
}
