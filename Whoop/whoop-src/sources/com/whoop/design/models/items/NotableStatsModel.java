package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import w91.C36961h;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J^\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010#R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010%R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010=\u0012\u0004\b?\u0010<\u001a\u0004\b>\u0010'¨\u0006B"}, m65681d2 = {"Lcom/whoop/design/models/items/NotableStatsModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "icon", "title", "subtitle", "Lcom/whoop/design/models/items/InfoModel;", "info", "Lcom/whoop/design/models/items/CurrentValueDisplay;", "currentValueDisplay", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InfoModel;Lcom/whoop/design/models/items/CurrentValueDisplay;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InfoModel;Lcom/whoop/design/models/items/CurrentValueDisplay;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/NotableStatsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/InfoModel;", "component6", "()Lcom/whoop/design/models/items/CurrentValueDisplay;", "component7", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/InfoModel;Lcom/whoop/design/models/items/CurrentValueDisplay;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/NotableStatsModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getIcon", "getTitle", "getSubtitle", "Lcom/whoop/design/models/items/InfoModel;", "getInfo", "Lcom/whoop/design/models/items/CurrentValueDisplay;", "getCurrentValueDisplay", "getCurrentValueDisplay$annotations", "()V", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NotableStatsModel implements DesignSystemModel {
    private final CurrentValueDisplay currentValueDisplay;
    private final C9598e destination;
    private final String icon;
    private final String id;
    private final InfoModel info;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36961h(8))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/NotableStatsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/NotableStatsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NotableStatsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NotableStatsModel(int i13, String str, String str2, String str3, String str4, InfoModel infoModel, CurrentValueDisplay currentValueDisplay, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, NotableStatsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.icon = str2;
        this.title = str3;
        this.subtitle = str4;
        this.info = infoModel;
        this.currentValueDisplay = currentValueDisplay;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ NotableStatsModel copy$default(NotableStatsModel notableStatsModel, String str, String str2, String str3, String str4, InfoModel infoModel, CurrentValueDisplay currentValueDisplay, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = notableStatsModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = notableStatsModel.icon;
        }
        if ((i13 & 4) != 0) {
            str3 = notableStatsModel.title;
        }
        if ((i13 & 8) != 0) {
            str4 = notableStatsModel.subtitle;
        }
        if ((i13 & 16) != 0) {
            infoModel = notableStatsModel.info;
        }
        if ((i13 & 32) != 0) {
            currentValueDisplay = notableStatsModel.currentValueDisplay;
        }
        if ((i13 & 64) != 0) {
            c9598e = notableStatsModel.destination;
        }
        CurrentValueDisplay currentValueDisplay2 = currentValueDisplay;
        C9598e c9598e2 = c9598e;
        InfoModel infoModel2 = infoModel;
        String str5 = str3;
        return notableStatsModel.copy(str, str2, str5, str4, infoModel2, currentValueDisplay2, c9598e2);
    }

    @InterfaceC37143h("current_value_display")
    public static /* synthetic */ void getCurrentValueDisplay$annotations() {
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(NotableStatsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 4, InfoModel$$serializer.INSTANCE, self.info);
        output.encodeSerializableElement(serialDesc, 5, CurrentValueDisplay$$serializer.INSTANCE, self.currentValueDisplay);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InfoModel getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CurrentValueDisplay getCurrentValueDisplay() {
        return this.currentValueDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final NotableStatsModel copy(String id4, String icon, String title, String subtitle, InfoModel info, CurrentValueDisplay currentValueDisplay, C9598e destination) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(currentValueDisplay, "currentValueDisplay");
        return new NotableStatsModel(id4, icon, title, subtitle, info, currentValueDisplay, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotableStatsModel)) {
            return false;
        }
        NotableStatsModel notableStatsModel = (NotableStatsModel) other;
        return AbstractC22676k.m65745e(this.id, notableStatsModel.id) && AbstractC22676k.m65745e(this.icon, notableStatsModel.icon) && AbstractC22676k.m65745e(this.title, notableStatsModel.title) && AbstractC22676k.m65745e(this.subtitle, notableStatsModel.subtitle) && AbstractC22676k.m65745e(this.info, notableStatsModel.info) && AbstractC22676k.m65745e(this.currentValueDisplay, notableStatsModel.currentValueDisplay) && AbstractC22676k.m65745e(this.destination, notableStatsModel.destination);
    }

    public final CurrentValueDisplay getCurrentValueDisplay() {
        return this.currentValueDisplay;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final InfoModel getInfo() {
        return this.info;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.icon), 31, this.title);
        String str2 = this.subtitle;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        InfoModel infoModel = this.info;
        int iHashCode2 = (this.currentValueDisplay.hashCode() + ((iHashCode + (infoModel == null ? 0 : infoModel.hashCode())) * 31)) * 31;
        C9598e c9598e = this.destination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.icon;
        String str3 = this.title;
        String str4 = this.subtitle;
        InfoModel infoModel = this.info;
        CurrentValueDisplay currentValueDisplay = this.currentValueDisplay;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NotableStatsModel(id=", str, ", icon=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitle=", str4, ", info=");
        sbM32001t.append(infoModel);
        sbM32001t.append(", currentValueDisplay=");
        sbM32001t.append(currentValueDisplay);
        sbM32001t.append(", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public NotableStatsModel(String str, String icon, String title, String str2, InfoModel infoModel, CurrentValueDisplay currentValueDisplay, C9598e c9598e) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(currentValueDisplay, "currentValueDisplay");
        this.id = str;
        this.icon = icon;
        this.title = title;
        this.subtitle = str2;
        this.info = infoModel;
        this.currentValueDisplay = currentValueDisplay;
        this.destination = c9598e;
    }
}
