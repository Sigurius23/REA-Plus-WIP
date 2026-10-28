package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wi0.C37312d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010\u0019R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010\u0015R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b>\u00104\u001a\u0004\b=\u0010\u0015R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b@\u00104\u001a\u0004\b?\u0010\u0015R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010A\u0012\u0004\bC\u00104\u001a\u0004\bB\u0010\u001e¨\u0006F"}, m65681d2 = {"Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "", "", "title", "Lgz0/m0;", "icon", "Lcom/whoop/trends/data/model/MeterModel;", "meter", "subtitle", "subtitleSuffix", "description", "Lcom/whoop/trends/data/model/ModalModel;", "modal", "<init>", "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lgz0/m0;", "component3", "()Lcom/whoop/trends/data/model/MeterModel;", "component4", "component5", "component6", "component7", "()Lcom/whoop/trends/data/model/ModalModel;", "copy", "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/trends/data/model/MeterModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/ModalModel;)Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Lgz0/m0;", "getIcon", "getIcon$annotations", "Lcom/whoop/trends/data/model/MeterModel;", "getMeter", "getMeter$annotations", "getSubtitle", "getSubtitle$annotations", "getSubtitleSuffix", "getSubtitleSuffix$annotations", "getDescription", "getDescription$annotations", "Lcom/whoop/trends/data/model/ModalModel;", "getModal", "getModal$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CardioFitnessLevelModel {

    @SerializedName("description")
    private final String description;

    @SerializedName("icon")
    private final EnumC16313m0 icon;

    @SerializedName("meter")
    private final MeterModel meter;

    @SerializedName("modal")
    private final ModalModel modal;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("subtitle_suffix")
    private final String subtitleSuffix;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37312d(17)), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/CardioFitnessLevelModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CardioFitnessLevelModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CardioFitnessLevelModel(int i13, String str, EnumC16313m0 enumC16313m0, MeterModel meterModel, String str2, String str3, String str4, ModalModel modalModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, CardioFitnessLevelModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.icon = enumC16313m0;
        this.meter = meterModel;
        this.subtitle = str2;
        this.subtitleSuffix = str3;
        this.description = str4;
        this.modal = modalModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ CardioFitnessLevelModel copy$default(CardioFitnessLevelModel cardioFitnessLevelModel, String str, EnumC16313m0 enumC16313m0, MeterModel meterModel, String str2, String str3, String str4, ModalModel modalModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cardioFitnessLevelModel.title;
        }
        if ((i13 & 2) != 0) {
            enumC16313m0 = cardioFitnessLevelModel.icon;
        }
        if ((i13 & 4) != 0) {
            meterModel = cardioFitnessLevelModel.meter;
        }
        if ((i13 & 8) != 0) {
            str2 = cardioFitnessLevelModel.subtitle;
        }
        if ((i13 & 16) != 0) {
            str3 = cardioFitnessLevelModel.subtitleSuffix;
        }
        if ((i13 & 32) != 0) {
            str4 = cardioFitnessLevelModel.description;
        }
        if ((i13 & 64) != 0) {
            modalModel = cardioFitnessLevelModel.modal;
        }
        String str5 = str4;
        ModalModel modalModel2 = modalModel;
        String str6 = str3;
        MeterModel meterModel2 = meterModel;
        return cardioFitnessLevelModel.copy(str, enumC16313m0, meterModel2, str2, str6, str5, modalModel2);
    }

    @InterfaceC37143h("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("icon")
    public static /* synthetic */ void getIcon$annotations() {
    }

    @InterfaceC37143h("meter")
    public static /* synthetic */ void getMeter$annotations() {
    }

    @InterfaceC37143h("modal")
    public static /* synthetic */ void getModal$annotations() {
    }

    @InterfaceC37143h("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("subtitle_suffix")
    public static /* synthetic */ void getSubtitleSuffix$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(CardioFitnessLevelModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.icon);
        output.encodeSerializableElement(serialDesc, 2, MeterModel$$serializer.INSTANCE, self.meter);
        output.encodeStringElement(serialDesc, 3, self.subtitle);
        output.encodeStringElement(serialDesc, 4, self.subtitleSuffix);
        output.encodeStringElement(serialDesc, 5, self.description);
        output.encodeNullableSerializableElement(serialDesc, 6, ModalModel$$serializer.INSTANCE, self.modal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MeterModel getMeter() {
        return this.meter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitleSuffix() {
        return this.subtitleSuffix;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ModalModel getModal() {
        return this.modal;
    }

    public final CardioFitnessLevelModel copy(String title, EnumC16313m0 icon, MeterModel meter, String subtitle, String subtitleSuffix, String description, ModalModel modal) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(meter, "meter");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(subtitleSuffix, "subtitleSuffix");
        AbstractC22676k.m65750j(description, "description");
        return new CardioFitnessLevelModel(title, icon, meter, subtitle, subtitleSuffix, description, modal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardioFitnessLevelModel)) {
            return false;
        }
        CardioFitnessLevelModel cardioFitnessLevelModel = (CardioFitnessLevelModel) other;
        return AbstractC22676k.m65745e(this.title, cardioFitnessLevelModel.title) && this.icon == cardioFitnessLevelModel.icon && AbstractC22676k.m65745e(this.meter, cardioFitnessLevelModel.meter) && AbstractC22676k.m65745e(this.subtitle, cardioFitnessLevelModel.subtitle) && AbstractC22676k.m65745e(this.subtitleSuffix, cardioFitnessLevelModel.subtitleSuffix) && AbstractC22676k.m65745e(this.description, cardioFitnessLevelModel.description) && AbstractC22676k.m65745e(this.modal, cardioFitnessLevelModel.modal);
    }

    public final String getDescription() {
        return this.description;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final MeterModel getMeter() {
        return this.meter;
    }

    public final ModalModel getModal() {
        return this.modal;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleSuffix() {
        return this.subtitleSuffix;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.meter.hashCode() + AbstractC17176i.m48500b(this.icon, this.title.hashCode() * 31, 31)) * 31, 31, this.subtitle), 31, this.subtitleSuffix), 31, this.description);
        ModalModel modalModel = this.modal;
        return iM30450d + (modalModel == null ? 0 : modalModel.hashCode());
    }

    public String toString() {
        String str = this.title;
        EnumC16313m0 enumC16313m0 = this.icon;
        MeterModel meterModel = this.meter;
        String str2 = this.subtitle;
        String str3 = this.subtitleSuffix;
        String str4 = this.description;
        ModalModel modalModel = this.modal;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("CardioFitnessLevelModel(title=", str, ", icon=", enumC16313m0, ", meter=");
        sbM61141l.append(meterModel);
        sbM61141l.append(", subtitle=");
        sbM61141l.append(str2);
        sbM61141l.append(", subtitleSuffix=");
        AbstractC11266d.m30444B(sbM61141l, str3, ", description=", str4, ", modal=");
        sbM61141l.append(modalModel);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }

    public CardioFitnessLevelModel(String title, EnumC16313m0 icon, MeterModel meter, String subtitle, String subtitleSuffix, String description, ModalModel modalModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(meter, "meter");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(subtitleSuffix, "subtitleSuffix");
        AbstractC22676k.m65750j(description, "description");
        this.title = title;
        this.icon = icon;
        this.meter = meter;
        this.subtitle = subtitle;
        this.subtitleSuffix = subtitleSuffix;
        this.description = description;
        this.modal = modalModel;
    }
}
