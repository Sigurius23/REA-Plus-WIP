package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import w91.C36964k;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JT\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010'¨\u0006@"}, m65681d2 = {"Lcom/whoop/design/models/items/StatusTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "icon", "Lcom/whoop/navigation/e;", "destination", "", "completed", "Lcom/whoop/design/models/items/CardButtonModel;", "cta", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;ZLcom/whoop/design/models/items/CardButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;ZLcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/StatusTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/navigation/e;", "component5", "()Z", "component6", "()Lcom/whoop/design/models/items/CardButtonModel;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;ZLcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/design/models/items/StatusTileModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "Ljava/lang/String;", "getIcon", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Z", "getCompleted", "Lcom/whoop/design/models/items/CardButtonModel;", "getCta", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StatusTileModel implements DesignSystemModel {
    private final boolean completed;
    private final CardButtonModel cta;
    private final C9598e destination;
    private final String icon;
    private final TextResource subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36964k(1)), null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/StatusTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/StatusTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StatusTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StatusTileModel(int i13, TextResource textResource, TextResource textResource2, String str, C9598e c9598e, boolean z4, CardButtonModel cardButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, StatusTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = textResource2;
        this.icon = str;
        this.destination = c9598e;
        this.completed = z4;
        this.cta = cardButtonModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ StatusTileModel copy$default(StatusTileModel statusTileModel, TextResource textResource, TextResource textResource2, String str, C9598e c9598e, boolean z4, CardButtonModel cardButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = statusTileModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = statusTileModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str = statusTileModel.icon;
        }
        if ((i13 & 8) != 0) {
            c9598e = statusTileModel.destination;
        }
        if ((i13 & 16) != 0) {
            z4 = statusTileModel.completed;
        }
        if ((i13 & 32) != 0) {
            cardButtonModel = statusTileModel.cta;
        }
        boolean z13 = z4;
        CardButtonModel cardButtonModel2 = cardButtonModel;
        return statusTileModel.copy(textResource, textResource2, str, c9598e, z13, cardButtonModel2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(StatusTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, c25452a, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.destination);
        output.encodeBooleanElement(serialDesc, 4, self.completed);
        output.encodeNullableSerializableElement(serialDesc, 5, CardButtonModel$$serializer.INSTANCE, self.cta);
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
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CardButtonModel getCta() {
        return this.cta;
    }

    public final StatusTileModel copy(TextResource title, TextResource subtitle, String icon, C9598e destination, boolean completed, CardButtonModel cta) {
        AbstractC22676k.m65750j(title, "title");
        return new StatusTileModel(title, subtitle, icon, destination, completed, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusTileModel)) {
            return false;
        }
        StatusTileModel statusTileModel = (StatusTileModel) other;
        return AbstractC22676k.m65745e(this.title, statusTileModel.title) && AbstractC22676k.m65745e(this.subtitle, statusTileModel.subtitle) && AbstractC22676k.m65745e(this.icon, statusTileModel.icon) && AbstractC22676k.m65745e(this.destination, statusTileModel.destination) && this.completed == statusTileModel.completed && AbstractC22676k.m65745e(this.cta, statusTileModel.cta);
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final CardButtonModel getCta() {
        return this.cta;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.subtitle;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        String str = this.icon;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31, this.completed);
        CardButtonModel cardButtonModel = this.cta;
        return iM8289b + (cardButtonModel != null ? cardButtonModel.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        String str = this.icon;
        C9598e c9598e = this.destination;
        boolean z4 = this.completed;
        CardButtonModel cardButtonModel = this.cta;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("StatusTileModel(title=", textResource, ", subtitle=", textResource2, ", icon=");
        AbstractC30007c.m91827B(sbM106658q, str, ", destination=", c9598e, ", completed=");
        sbM106658q.append(z4);
        sbM106658q.append(", cta=");
        sbM106658q.append(cardButtonModel);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public StatusTileModel(TextResource title, TextResource textResource, String str, C9598e c9598e, boolean z4, CardButtonModel cardButtonModel) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.subtitle = textResource;
        this.icon = str;
        this.destination = c9598e;
        this.completed = z4;
        this.cta = cardButtonModel;
    }
}
