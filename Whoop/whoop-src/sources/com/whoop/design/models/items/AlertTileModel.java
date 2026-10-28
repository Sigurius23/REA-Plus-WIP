package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import w70.C36870a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010 J^\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b5\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b:\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b;\u0010 ¨\u0006>"}, m65681d2 = {"Lcom/whoop/design/models/items/AlertTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "reason", "type", "Lcom/whoop/navigation/e;", "destination", "tracking", "dismissalId", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AlertTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/whoop/navigation/e;", "component6", "component7", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/AlertTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "Ljava/lang/String;", "getReason", "getType", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "getTracking", "getDismissalId", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AlertTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final C9598e destination;
    private final String dismissalId;
    private final String reason;
    private final TextResource subtitle;
    private final TextResource title;
    private final String tracking;
    private final String type;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AlertTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AlertTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AlertTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        $stable = i13 | i14 | i14;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36870a(17)), null, null};
    }

    public AlertTileModel() {
        this((TextResource) null, (TextResource) null, (String) null, (String) null, (C9598e) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ AlertTileModel copy$default(AlertTileModel alertTileModel, TextResource textResource, TextResource textResource2, String str, String str2, C9598e c9598e, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = alertTileModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = alertTileModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str = alertTileModel.reason;
        }
        if ((i13 & 8) != 0) {
            str2 = alertTileModel.type;
        }
        if ((i13 & 16) != 0) {
            c9598e = alertTileModel.destination;
        }
        if ((i13 & 32) != 0) {
            str3 = alertTileModel.tracking;
        }
        if ((i13 & 64) != 0) {
            str4 = alertTileModel.dismissalId;
        }
        String str5 = str3;
        String str6 = str4;
        C9598e c9598e2 = c9598e;
        String str7 = str;
        return alertTileModel.copy(textResource, textResource2, str7, str2, c9598e2, str5, str6);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(AlertTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, C25452a.f99689a, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.reason, "")) {
            output.encodeStringElement(serialDesc, 2, self.reason);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.type, "")) {
            output.encodeStringElement(serialDesc, 3, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.tracking, "")) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.tracking);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && AbstractC22676k.m65745e(self.dismissalId, "")) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.dismissalId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTracking() {
        return this.tracking;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDismissalId() {
        return this.dismissalId;
    }

    public final AlertTileModel copy(TextResource title, TextResource subtitle, String reason, String type, C9598e destination, String tracking, String dismissalId) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(type, "type");
        return new AlertTileModel(title, subtitle, reason, type, destination, tracking, dismissalId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertTileModel)) {
            return false;
        }
        AlertTileModel alertTileModel = (AlertTileModel) other;
        return AbstractC22676k.m65745e(this.title, alertTileModel.title) && AbstractC22676k.m65745e(this.subtitle, alertTileModel.subtitle) && AbstractC22676k.m65745e(this.reason, alertTileModel.reason) && AbstractC22676k.m65745e(this.type, alertTileModel.type) && AbstractC22676k.m65745e(this.destination, alertTileModel.destination) && AbstractC22676k.m65745e(this.tracking, alertTileModel.tracking) && AbstractC22676k.m65745e(this.dismissalId, alertTileModel.dismissalId);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getDismissalId() {
        return this.dismissalId;
    }

    public final String getReason() {
        return this.reason;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final String getTracking() {
        return this.tracking;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subtitle;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.reason), 31, this.type);
        C9598e c9598e = this.destination;
        int iHashCode2 = (iM30450d + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str = this.tracking;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dismissalId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        String str = this.reason;
        String str2 = this.type;
        C9598e c9598e = this.destination;
        String str3 = this.tracking;
        String str4 = this.dismissalId;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("AlertTileModel(title=", textResource, ", subtitle=", textResource2, ", reason=");
        AbstractC11266d.m30444B(sbM106658q, str, ", type=", str2, ", destination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", tracking=");
        sbM106658q.append(str3);
        sbM106658q.append(", dismissalId=");
        return AbstractC25012a.m73376i(str4, ")", sbM106658q);
    }

    public /* synthetic */ AlertTileModel(int i13, TextResource textResource, TextResource textResource2, String str, String str2, C9598e c9598e, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = textResource2;
        }
        if ((i13 & 4) == 0) {
            this.reason = "";
        } else {
            this.reason = str;
        }
        if ((i13 & 8) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        if ((i13 & 16) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 32) == 0) {
            this.tracking = "";
        } else {
            this.tracking = str3;
        }
        if ((i13 & 64) == 0) {
            this.dismissalId = "";
        } else {
            this.dismissalId = str4;
        }
    }

    public AlertTileModel(TextResource title, TextResource textResource, String reason, String type, C9598e c9598e, String str, String str2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(type, "type");
        this.title = title;
        this.subtitle = textResource;
        this.reason = reason;
        this.type = type;
        this.destination = c9598e;
        this.tracking = str;
        this.dismissalId = str2;
    }

    public /* synthetic */ AlertTileModel(TextResource textResource, TextResource textResource2, String str, String str2, C9598e c9598e, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : textResource2, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? null : c9598e, (i13 & 32) != 0 ? "" : str3, (i13 & 64) != 0 ? "" : str4);
    }
}
