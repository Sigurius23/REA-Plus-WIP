package com.whoop.design.models.items.nestedbff;

import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xa1.C38138a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;", "", "", "path", "Lcom/whoop/navigation/models/GenericHttpMethod;", "method", "", "metadata", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/models/GenericHttpMethod;", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Ljava/util/Map;)Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Lcom/whoop/navigation/models/GenericHttpMethod;", "getMethod", "Ljava/util/Map;", "getMetadata", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NestedBFFRequestModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, String> metadata;
    private final GenericHttpMethod method;
    private final String path;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NestedBFFRequestModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C38138a(0)), AbstractC30060g.m92087G(enumC23463i, new C38138a(1))};
    }

    public /* synthetic */ NestedBFFRequestModel(int i13, String str, GenericHttpMethod genericHttpMethod, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, NestedBFFRequestModel$$serializer.INSTANCE.getDescriptor());
        }
        this.path = str;
        if ((i13 & 2) == 0) {
            this.method = GenericHttpMethod.GET;
        } else {
            this.method = genericHttpMethod;
        }
        if ((i13 & 4) == 0) {
            this.metadata = null;
        } else {
            this.metadata = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return GenericHttpMethod.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NestedBFFRequestModel copy$default(NestedBFFRequestModel nestedBFFRequestModel, String str, GenericHttpMethod genericHttpMethod, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = nestedBFFRequestModel.path;
        }
        if ((i13 & 2) != 0) {
            genericHttpMethod = nestedBFFRequestModel.method;
        }
        if ((i13 & 4) != 0) {
            map = nestedBFFRequestModel.metadata;
        }
        return nestedBFFRequestModel.copy(str, genericHttpMethod, map);
    }

    public static final /* synthetic */ void write$Self$design_models_release(NestedBFFRequestModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.path);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.method != GenericHttpMethod.GET) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.method);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.metadata == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GenericHttpMethod getMethod() {
        return this.method;
    }

    public final Map<String, String> component3() {
        return this.metadata;
    }

    public final NestedBFFRequestModel copy(String path, GenericHttpMethod method, Map<String, String> metadata) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(method, "method");
        return new NestedBFFRequestModel(path, method, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NestedBFFRequestModel)) {
            return false;
        }
        NestedBFFRequestModel nestedBFFRequestModel = (NestedBFFRequestModel) other;
        return AbstractC22676k.m65745e(this.path, nestedBFFRequestModel.path) && this.method == nestedBFFRequestModel.method && AbstractC22676k.m65745e(this.metadata, nestedBFFRequestModel.metadata);
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final GenericHttpMethod getMethod() {
        return this.method;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        int iHashCode = (this.method.hashCode() + (this.path.hashCode() * 31)) * 31;
        Map<String, String> map = this.metadata;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        String str = this.path;
        GenericHttpMethod genericHttpMethod = this.method;
        Map<String, String> map = this.metadata;
        StringBuilder sb4 = new StringBuilder("NestedBFFRequestModel(path=");
        sb4.append(str);
        sb4.append(", method=");
        sb4.append(genericHttpMethod);
        sb4.append(", metadata=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }

    public NestedBFFRequestModel(String path, GenericHttpMethod method, Map<String, String> map) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(method, "method");
        this.path = path;
        this.method = method;
        this.metadata = map;
    }

    public /* synthetic */ NestedBFFRequestModel(String str, GenericHttpMethod genericHttpMethod, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? GenericHttpMethod.GET : genericHttpMethod, (i13 & 4) != 0 ? null : map);
    }
}
