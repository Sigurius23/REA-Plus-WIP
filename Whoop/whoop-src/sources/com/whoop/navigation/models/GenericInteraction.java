package com.whoop.navigation.models;

import ad3.C0771n;
import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JL\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u0019R\u0011\u0010/\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, m65681d2 = {"Lcom/whoop/navigation/models/GenericInteraction;", "", "Lkotlinx/serialization/json/JsonElement;", NotificationCompat.CATEGORY_NAVIGATION, "modal", "action", "dismissEvent", "analyticEvent", "<init>", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/models/GenericInteraction;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lkotlinx/serialization/json/JsonElement;", "component2", "component3", "component4", "component5", "copy", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/navigation/models/GenericInteraction;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonElement;", "getNavigation", "getModal", "getAction", "getDismissEvent", "getAnalyticEvent", "isEmpty", "()Z", "Companion", "$serializer", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GenericInteraction {
    private final JsonElement action;
    private final JsonElement analyticEvent;
    private final JsonElement dismissEvent;
    private final JsonElement modal;
    private final JsonElement navigation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/models/GenericInteraction$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/models/GenericInteraction;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GenericInteraction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public GenericInteraction() {
        this((JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GenericInteraction copy$default(GenericInteraction genericInteraction, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, JsonElement jsonElement4, JsonElement jsonElement5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            jsonElement = genericInteraction.navigation;
        }
        if ((i13 & 2) != 0) {
            jsonElement2 = genericInteraction.modal;
        }
        if ((i13 & 4) != 0) {
            jsonElement3 = genericInteraction.action;
        }
        if ((i13 & 8) != 0) {
            jsonElement4 = genericInteraction.dismissEvent;
        }
        if ((i13 & 16) != 0) {
            jsonElement5 = genericInteraction.analyticEvent;
        }
        JsonElement jsonElement6 = jsonElement5;
        JsonElement jsonElement7 = jsonElement3;
        return genericInteraction.copy(jsonElement, jsonElement2, jsonElement7, jsonElement4, jsonElement6);
    }

    public static final /* synthetic */ void write$Self$navigation_release(GenericInteraction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.navigation != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, C0771n.f2806a, self.navigation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.modal != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, C0771n.f2806a, self.modal);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, C0771n.f2806a, self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.dismissEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, C0771n.f2806a, self.dismissEvent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.analyticEvent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, C0771n.f2806a, self.analyticEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonElement getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonElement getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonElement getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonElement getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final JsonElement getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final GenericInteraction copy(JsonElement navigation, JsonElement modal, JsonElement action, JsonElement dismissEvent, JsonElement analyticEvent) {
        return new GenericInteraction(navigation, modal, action, dismissEvent, analyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericInteraction)) {
            return false;
        }
        GenericInteraction genericInteraction = (GenericInteraction) other;
        return AbstractC22676k.m65745e(this.navigation, genericInteraction.navigation) && AbstractC22676k.m65745e(this.modal, genericInteraction.modal) && AbstractC22676k.m65745e(this.action, genericInteraction.action) && AbstractC22676k.m65745e(this.dismissEvent, genericInteraction.dismissEvent) && AbstractC22676k.m65745e(this.analyticEvent, genericInteraction.analyticEvent);
    }

    public final JsonElement getAction() {
        return this.action;
    }

    public final JsonElement getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final JsonElement getDismissEvent() {
        return this.dismissEvent;
    }

    public final JsonElement getModal() {
        return this.modal;
    }

    public final JsonElement getNavigation() {
        return this.navigation;
    }

    public int hashCode() {
        JsonElement jsonElement = this.navigation;
        int iHashCode = (jsonElement == null ? 0 : jsonElement.hashCode()) * 31;
        JsonElement jsonElement2 = this.modal;
        int iHashCode2 = (iHashCode + (jsonElement2 == null ? 0 : jsonElement2.hashCode())) * 31;
        JsonElement jsonElement3 = this.action;
        int iHashCode3 = (iHashCode2 + (jsonElement3 == null ? 0 : jsonElement3.hashCode())) * 31;
        JsonElement jsonElement4 = this.dismissEvent;
        int iHashCode4 = (iHashCode3 + (jsonElement4 == null ? 0 : jsonElement4.hashCode())) * 31;
        JsonElement jsonElement5 = this.analyticEvent;
        return iHashCode4 + (jsonElement5 != null ? jsonElement5.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.navigation == null && this.modal == null && this.action == null && this.dismissEvent == null && this.analyticEvent == null;
    }

    public String toString() {
        return "GenericInteraction(navigation=" + this.navigation + ", modal=" + this.modal + ", action=" + this.action + ", dismissEvent=" + this.dismissEvent + ", analyticEvent=" + this.analyticEvent + ")";
    }

    public /* synthetic */ GenericInteraction(int i13, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, JsonElement jsonElement4, JsonElement jsonElement5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.navigation = null;
        } else {
            this.navigation = jsonElement;
        }
        if ((i13 & 2) == 0) {
            this.modal = null;
        } else {
            this.modal = jsonElement2;
        }
        if ((i13 & 4) == 0) {
            this.action = null;
        } else {
            this.action = jsonElement3;
        }
        if ((i13 & 8) == 0) {
            this.dismissEvent = null;
        } else {
            this.dismissEvent = jsonElement4;
        }
        if ((i13 & 16) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = jsonElement5;
        }
    }

    public GenericInteraction(JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, JsonElement jsonElement4, JsonElement jsonElement5) {
        this.navigation = jsonElement;
        this.modal = jsonElement2;
        this.action = jsonElement3;
        this.dismissEvent = jsonElement4;
        this.analyticEvent = jsonElement5;
    }

    public /* synthetic */ GenericInteraction(JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, JsonElement jsonElement4, JsonElement jsonElement5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : jsonElement, (i13 & 2) != 0 ? null : jsonElement2, (i13 & 4) != 0 ? null : jsonElement3, (i13 & 8) != 0 ? null : jsonElement4, (i13 & 16) != 0 ? null : jsonElement5);
    }
}
