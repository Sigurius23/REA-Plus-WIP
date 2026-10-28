package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36965l;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%¨\u0006<"}, m65681d2 = {"Lcom/whoop/design/models/items/VowCtaModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "cta", "Lcom/whoop/design/models/items/VowCtaText;", "ctaText", "Lcom/whoop/design/models/items/AlarmStatus;", "alarmState", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/VowCtaText;Lcom/whoop/design/models/items/AlarmStatus;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/VowCtaText;Lcom/whoop/design/models/items/AlarmStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/VowCtaModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/VowCtaText;", "component6", "()Lcom/whoop/design/models/items/AlarmStatus;", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/VowCtaText;Lcom/whoop/design/models/items/AlarmStatus;)Lcom/whoop/design/models/items/VowCtaModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "getCta", "Lcom/whoop/design/models/items/VowCtaText;", "getCtaText", "Lcom/whoop/design/models/items/AlarmStatus;", "getAlarmState", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VowCtaModel implements DesignSystemModel {
    private final AlarmStatus alarmState;
    private final String cta;
    private final VowCtaText ctaText;
    private final String icon;
    private final String subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36965l(2))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/VowCtaModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/VowCtaModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VowCtaModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VowCtaModel() {
        this((String) null, (TextResource) null, (String) null, (String) null, (VowCtaText) null, (AlarmStatus) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.AlarmStatus", AlarmStatus.values());
    }

    public static /* synthetic */ VowCtaModel copy$default(VowCtaModel vowCtaModel, String str, TextResource textResource, String str2, String str3, VowCtaText vowCtaText, AlarmStatus alarmStatus, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = vowCtaModel.icon;
        }
        if ((i13 & 2) != 0) {
            textResource = vowCtaModel.title;
        }
        if ((i13 & 4) != 0) {
            str2 = vowCtaModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str3 = vowCtaModel.cta;
        }
        if ((i13 & 16) != 0) {
            vowCtaText = vowCtaModel.ctaText;
        }
        if ((i13 & 32) != 0) {
            alarmStatus = vowCtaModel.alarmState;
        }
        VowCtaText vowCtaText2 = vowCtaText;
        AlarmStatus alarmStatus2 = alarmStatus;
        return vowCtaModel.copy(str, textResource, str2, str3, vowCtaText2, alarmStatus2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    public static final /* synthetic */ void write$Self$design_models_release(VowCtaModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.icon, "")) {
            output.encodeStringElement(serialDesc, 0, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.cta, "")) {
            output.encodeStringElement(serialDesc, 3, self.cta);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4)) {
            output.encodeSerializableElement(serialDesc, 4, VowCtaText$$serializer.INSTANCE, self.ctaText);
        } else {
            if (!AbstractC22676k.m65745e(self.ctaText, new VowCtaText((TextResource) null, (String) null, (String) null, (BatteryStatus) null, 15, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 4, VowCtaText$$serializer.INSTANCE, self.ctaText);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.alarmState == AlarmStatus.OFF) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.alarmState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final VowCtaText getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AlarmStatus getAlarmState() {
        return this.alarmState;
    }

    public final VowCtaModel copy(String icon, TextResource title, String subtitle, String cta, VowCtaText ctaText, AlarmStatus alarmState) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(alarmState, "alarmState");
        return new VowCtaModel(icon, title, subtitle, cta, ctaText, alarmState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VowCtaModel)) {
            return false;
        }
        VowCtaModel vowCtaModel = (VowCtaModel) other;
        return AbstractC22676k.m65745e(this.icon, vowCtaModel.icon) && AbstractC22676k.m65745e(this.title, vowCtaModel.title) && AbstractC22676k.m65745e(this.subtitle, vowCtaModel.subtitle) && AbstractC22676k.m65745e(this.cta, vowCtaModel.cta) && AbstractC22676k.m65745e(this.ctaText, vowCtaModel.ctaText) && this.alarmState == vowCtaModel.alarmState;
    }

    public final AlarmStatus getAlarmState() {
        return this.alarmState;
    }

    public final String getCta() {
        return this.cta;
    }

    public final VowCtaText getCtaText() {
        return this.ctaText;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.icon.hashCode() * 31, this.title, 31);
        String str = this.subtitle;
        return this.alarmState.hashCode() + ((this.ctaText.hashCode() + AbstractC11266d.m30450d((iM95625a + (str == null ? 0 : str.hashCode())) * 31, 31, this.cta)) * 31);
    }

    public String toString() {
        String str = this.icon;
        TextResource textResource = this.title;
        String str2 = this.subtitle;
        String str3 = this.cta;
        VowCtaText vowCtaText = this.ctaText;
        AlarmStatus alarmStatus = this.alarmState;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("VowCtaModel(icon=", str, ", title=", textResource, ", subtitle=");
        AbstractC11266d.m30444B(sbM91847q, str2, ", cta=", str3, ", ctaText=");
        sbM91847q.append(vowCtaText);
        sbM91847q.append(", alarmState=");
        sbM91847q.append(alarmStatus);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    public /* synthetic */ VowCtaModel(int i13, String str, TextResource textResource, String str2, String str3, VowCtaText vowCtaText, AlarmStatus alarmStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.icon = "";
        } else {
            this.icon = str;
        }
        if ((i13 & 2) == 0) {
            this.title = AbstractC8693b.m21267a();
        } else {
            this.title = textResource;
        }
        if ((i13 & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i13 & 8) == 0) {
            this.cta = "";
        } else {
            this.cta = str3;
        }
        if ((i13 & 16) == 0) {
            this.ctaText = new VowCtaText((TextResource) null, (String) null, (String) null, (BatteryStatus) null, 15, (DefaultConstructorMarker) null);
        } else {
            this.ctaText = vowCtaText;
        }
        if ((i13 & 32) == 0) {
            this.alarmState = AlarmStatus.OFF;
        } else {
            this.alarmState = alarmStatus;
        }
    }

    public VowCtaModel(String icon, TextResource title, String str, String cta, VowCtaText ctaText, AlarmStatus alarmState) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(alarmState, "alarmState");
        this.icon = icon;
        this.title = title;
        this.subtitle = str;
        this.cta = cta;
        this.ctaText = ctaText;
        this.alarmState = alarmState;
    }

    public /* synthetic */ VowCtaModel(String str, TextResource textResource, String str2, String str3, VowCtaText vowCtaText, AlarmStatus alarmStatus, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? new VowCtaText((TextResource) null, (String) null, (String) null, (BatteryStatus) null, 15, (DefaultConstructorMarker) null) : vowCtaText, (i13 & 32) != 0 ? AlarmStatus.OFF : alarmStatus);
    }
}
