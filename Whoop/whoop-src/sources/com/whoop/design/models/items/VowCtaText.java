package com.whoop.design.models.items;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36965l;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/VowCtaText;", "", "Lcom/whoop/design/util/TextResource;", "text", "", "textState", "icon", "Lcom/whoop/design/models/items/BatteryStatus;", "batteryState", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/BatteryStatus;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/BatteryStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/VowCtaText;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/design/models/items/BatteryStatus;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/BatteryStatus;)Lcom/whoop/design/models/items/VowCtaText;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getText", "Ljava/lang/String;", "getTextState", "getIcon", "Lcom/whoop/design/models/items/BatteryStatus;", "getBatteryState", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VowCtaText {
    private final BatteryStatus batteryState;
    private final String icon;
    private final TextResource text;
    private final String textState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36965l(3))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/VowCtaText$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/VowCtaText;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VowCtaText$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VowCtaText() {
        this((TextResource) null, (String) null, (String) null, (BatteryStatus) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.BatteryStatus", BatteryStatus.values());
    }

    public static /* synthetic */ VowCtaText copy$default(VowCtaText vowCtaText, TextResource textResource, String str, String str2, BatteryStatus batteryStatus, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = vowCtaText.text;
        }
        if ((i13 & 2) != 0) {
            str = vowCtaText.textState;
        }
        if ((i13 & 4) != 0) {
            str2 = vowCtaText.icon;
        }
        if ((i13 & 8) != 0) {
            batteryStatus = vowCtaText.batteryState;
        }
        return vowCtaText.copy(textResource, str, str2, batteryStatus);
    }

    public static final /* synthetic */ void write$Self$design_models_release(VowCtaText self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.text, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.text);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.textState, "")) {
            output.encodeStringElement(serialDesc, 1, self.textState);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.icon, "")) {
            output.encodeStringElement(serialDesc, 2, self.icon);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.batteryState == BatteryStatus.CHARGED) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.batteryState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTextState() {
        return this.textState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BatteryStatus getBatteryState() {
        return this.batteryState;
    }

    public final VowCtaText copy(TextResource text, String textState, String icon, BatteryStatus batteryState) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(textState, "textState");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(batteryState, "batteryState");
        return new VowCtaText(text, textState, icon, batteryState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VowCtaText)) {
            return false;
        }
        VowCtaText vowCtaText = (VowCtaText) other;
        return AbstractC22676k.m65745e(this.text, vowCtaText.text) && AbstractC22676k.m65745e(this.textState, vowCtaText.textState) && AbstractC22676k.m65745e(this.icon, vowCtaText.icon) && this.batteryState == vowCtaText.batteryState;
    }

    public final BatteryStatus getBatteryState() {
        return this.batteryState;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final TextResource getText() {
        return this.text;
    }

    public final String getTextState() {
        return this.textState;
    }

    public int hashCode() {
        return this.batteryState.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.text.hashCode() * 31, 31, this.textState), 31, this.icon);
    }

    public String toString() {
        TextResource textResource = this.text;
        String str = this.textState;
        String str2 = this.icon;
        BatteryStatus batteryStatus = this.batteryState;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("VowCtaText(text=", textResource, ", textState=", str, ", icon=");
        sbM91845o.append(str2);
        sbM91845o.append(", batteryState=");
        sbM91845o.append(batteryStatus);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    public /* synthetic */ VowCtaText(int i13, TextResource textResource, String str, String str2, BatteryStatus batteryStatus, SerializationConstructorMarker serializationConstructorMarker) {
        this.text = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.textState = "";
        } else {
            this.textState = str;
        }
        if ((i13 & 4) == 0) {
            this.icon = "";
        } else {
            this.icon = str2;
        }
        if ((i13 & 8) == 0) {
            this.batteryState = BatteryStatus.CHARGED;
        } else {
            this.batteryState = batteryStatus;
        }
    }

    public VowCtaText(TextResource text, String textState, String icon, BatteryStatus batteryState) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(textState, "textState");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(batteryState, "batteryState");
        this.text = text;
        this.textState = textState;
        this.icon = icon;
        this.batteryState = batteryState;
    }

    public /* synthetic */ VowCtaText(TextResource textResource, String str, String str2, BatteryStatus batteryStatus, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? BatteryStatus.CHARGED : batteryStatus);
    }
}
