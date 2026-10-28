package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import un1.C35100f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/items/MiniMonitorCardBodyModel;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "magnitude", "", "icon", "Lcom/whoop/design/models/items/MiniMonitorStatusType;", NotificationCompat.CATEGORY_STATUS, "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/items/MiniMonitorStatusType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/items/MiniMonitorStatusType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MiniMonitorCardBodyModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "()Lcom/whoop/design/models/items/MiniMonitorStatusType;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/items/MiniMonitorStatusType;)Lcom/whoop/design/models/items/MiniMonitorCardBodyModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "getMagnitude", "Ljava/lang/String;", "getIcon", "Lcom/whoop/design/models/items/MiniMonitorStatusType;", "getStatus", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MiniMonitorCardBodyModel {
    private final String icon;
    private final TextResource magnitude;
    private final MiniMonitorStatusType status;
    private final TextResource subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35100f(23))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MiniMonitorCardBodyModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MiniMonitorCardBodyModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MiniMonitorCardBodyModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MiniMonitorCardBodyModel(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, String str, MiniMonitorStatusType miniMonitorStatusType, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MiniMonitorCardBodyModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = textResource2;
        this.magnitude = textResource3;
        this.icon = str;
        this.status = miniMonitorStatusType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.MiniMonitorStatusType", MiniMonitorStatusType.values());
    }

    public static /* synthetic */ MiniMonitorCardBodyModel copy$default(MiniMonitorCardBodyModel miniMonitorCardBodyModel, TextResource textResource, TextResource textResource2, TextResource textResource3, String str, MiniMonitorStatusType miniMonitorStatusType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = miniMonitorCardBodyModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = miniMonitorCardBodyModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            textResource3 = miniMonitorCardBodyModel.magnitude;
        }
        if ((i13 & 8) != 0) {
            str = miniMonitorCardBodyModel.icon;
        }
        if ((i13 & 16) != 0) {
            miniMonitorStatusType = miniMonitorCardBodyModel.status;
        }
        MiniMonitorStatusType miniMonitorStatusType2 = miniMonitorStatusType;
        TextResource textResource4 = textResource3;
        return miniMonitorCardBodyModel.copy(textResource, textResource2, textResource4, str, miniMonitorStatusType2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MiniMonitorCardBodyModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, c25452a, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, c25452a, self.magnitude);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.icon);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.status);
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
    public final TextResource getMagnitude() {
        return this.magnitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MiniMonitorStatusType getStatus() {
        return this.status;
    }

    public final MiniMonitorCardBodyModel copy(TextResource title, TextResource subtitle, TextResource magnitude, String icon, MiniMonitorStatusType status) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        return new MiniMonitorCardBodyModel(title, subtitle, magnitude, icon, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniMonitorCardBodyModel)) {
            return false;
        }
        MiniMonitorCardBodyModel miniMonitorCardBodyModel = (MiniMonitorCardBodyModel) other;
        return AbstractC22676k.m65745e(this.title, miniMonitorCardBodyModel.title) && AbstractC22676k.m65745e(this.subtitle, miniMonitorCardBodyModel.subtitle) && AbstractC22676k.m65745e(this.magnitude, miniMonitorCardBodyModel.magnitude) && AbstractC22676k.m65745e(this.icon, miniMonitorCardBodyModel.icon) && this.status == miniMonitorCardBodyModel.status;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final TextResource getMagnitude() {
        return this.magnitude;
    }

    public final MiniMonitorStatusType getStatus() {
        return this.status;
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
        TextResource textResource2 = this.magnitude;
        int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        String str = this.icon;
        return this.status.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.magnitude;
        String str = this.icon;
        MiniMonitorStatusType miniMonitorStatusType = this.status;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MiniMonitorCardBodyModel(title=", textResource, ", subtitle=", textResource2, ", magnitude=");
        AbstractC30007c.m91856z(sbM106658q, textResource3, ", icon=", str, ", status=");
        sbM106658q.append(miniMonitorStatusType);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public MiniMonitorCardBodyModel(TextResource title, TextResource textResource, TextResource textResource2, String str, MiniMonitorStatusType status) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        this.title = title;
        this.subtitle = textResource;
        this.magnitude = textResource2;
        this.icon = str;
        this.status = status;
    }
}
