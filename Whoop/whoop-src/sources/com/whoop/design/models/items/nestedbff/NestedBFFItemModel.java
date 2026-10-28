package com.whoop.design.models.items.nestedbff;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;", "request", "", "showLoading", "fallbackBehavior", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;ZLjava/lang/String;)Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/items/nestedbff/NestedBFFRequestModel;", "getRequest", "Z", "getShowLoading", "getFallbackBehavior", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NestedBFFItemModel implements DesignSystemModel {
    private final String fallbackBehavior;
    private final String id;
    private final NestedBFFRequestModel request;
    private final boolean showLoading;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/nestedbff/NestedBFFItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NestedBFFItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NestedBFFItemModel(int i13, String str, NestedBFFRequestModel nestedBFFRequestModel, boolean z4, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, NestedBFFItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.request = nestedBFFRequestModel;
        if ((i13 & 4) == 0) {
            this.showLoading = true;
        } else {
            this.showLoading = z4;
        }
        if ((i13 & 8) == 0) {
            this.fallbackBehavior = "HIDE";
        } else {
            this.fallbackBehavior = str2;
        }
    }

    public static /* synthetic */ NestedBFFItemModel copy$default(NestedBFFItemModel nestedBFFItemModel, String str, NestedBFFRequestModel nestedBFFRequestModel, boolean z4, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = nestedBFFItemModel.id;
        }
        if ((i13 & 2) != 0) {
            nestedBFFRequestModel = nestedBFFItemModel.request;
        }
        if ((i13 & 4) != 0) {
            z4 = nestedBFFItemModel.showLoading;
        }
        if ((i13 & 8) != 0) {
            str2 = nestedBFFItemModel.fallbackBehavior;
        }
        return nestedBFFItemModel.copy(str, nestedBFFRequestModel, z4, str2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(NestedBFFItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, NestedBFFRequestModel$$serializer.INSTANCE, self.request);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.showLoading) {
            output.encodeBooleanElement(serialDesc, 2, self.showLoading);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.fallbackBehavior, "HIDE")) {
            return;
        }
        output.encodeStringElement(serialDesc, 3, self.fallbackBehavior);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NestedBFFRequestModel getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    public final NestedBFFItemModel copy(String id4, NestedBFFRequestModel request, boolean showLoading, String fallbackBehavior) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(fallbackBehavior, "fallbackBehavior");
        return new NestedBFFItemModel(id4, request, showLoading, fallbackBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NestedBFFItemModel)) {
            return false;
        }
        NestedBFFItemModel nestedBFFItemModel = (NestedBFFItemModel) other;
        return AbstractC22676k.m65745e(this.id, nestedBFFItemModel.id) && AbstractC22676k.m65745e(this.request, nestedBFFItemModel.request) && this.showLoading == nestedBFFItemModel.showLoading && AbstractC22676k.m65745e(this.fallbackBehavior, nestedBFFItemModel.fallbackBehavior);
    }

    public final String getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    public final String getId() {
        return this.id;
    }

    public final NestedBFFRequestModel getRequest() {
        return this.request;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public int hashCode() {
        return this.fallbackBehavior.hashCode() + AbstractC2875y.m8289b((this.request.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.showLoading);
    }

    public String toString() {
        String str = this.id;
        NestedBFFRequestModel nestedBFFRequestModel = this.request;
        boolean z4 = this.showLoading;
        String str2 = this.fallbackBehavior;
        StringBuilder sb4 = new StringBuilder("NestedBFFItemModel(id=");
        sb4.append(str);
        sb4.append(", request=");
        sb4.append(nestedBFFRequestModel);
        sb4.append(", showLoading=");
        return AbstractC21702c.m61139j(sb4, z4, ", fallbackBehavior=", str2, ")");
    }

    public NestedBFFItemModel(String id4, NestedBFFRequestModel request, boolean z4, String fallbackBehavior) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(fallbackBehavior, "fallbackBehavior");
        this.id = id4;
        this.request = request;
        this.showLoading = z4;
        this.fallbackBehavior = fallbackBehavior;
    }

    public /* synthetic */ NestedBFFItemModel(String str, NestedBFFRequestModel nestedBFFRequestModel, boolean z4, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, nestedBFFRequestModel, (i13 & 4) != 0 ? true : z4, (i13 & 8) != 0 ? "HIDE" : str2);
    }
}
