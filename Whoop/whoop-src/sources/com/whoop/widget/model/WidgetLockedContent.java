package com.whoop.widget.model;

import ad3.C0756b0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fw0.C14833a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JP\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/widget/model/WidgetLockedContent;", "", "", "lockedIcon", "headerTextDisplay", "descriptionDisplay", "Lcom/whoop/widget/model/LockedContentButtonStyle;", "buttonStyle", "buttonTextDisplay", "Lkotlinx/serialization/json/JsonObject;", "buttonDestination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/widget/model/LockedContentButtonStyle;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/widget/model/LockedContentButtonStyle;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$widget_release", "(Lcom/whoop/widget/model/WidgetLockedContent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/widget/model/LockedContentButtonStyle;", "component5", "component6", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/widget/model/LockedContentButtonStyle;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/whoop/widget/model/WidgetLockedContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLockedIcon", "getHeaderTextDisplay", "getDescriptionDisplay", "Lcom/whoop/widget/model/LockedContentButtonStyle;", "getButtonStyle", "getButtonTextDisplay", "Lkotlinx/serialization/json/JsonObject;", "getButtonDestination", "Companion", "$serializer", "a", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WidgetLockedContent {
    private final JsonObject buttonDestination;
    private final LockedContentButtonStyle buttonStyle;
    private final String buttonTextDisplay;
    private final String descriptionDisplay;
    private final String headerTextDisplay;
    private final String lockedIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C14833a(10)), null, null};

    /* JADX INFO: renamed from: com.whoop.widget.model.WidgetLockedContent$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/widget/model/WidgetLockedContent$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/widget/model/WidgetLockedContent;", "serializer", "()Lwc3/c;", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WidgetLockedContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WidgetLockedContent(int i13, String str, String str2, String str3, LockedContentButtonStyle lockedContentButtonStyle, String str4, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, WidgetLockedContent$$serializer.INSTANCE.getDescriptor());
        }
        this.lockedIcon = str;
        this.headerTextDisplay = str2;
        this.descriptionDisplay = str3;
        this.buttonStyle = lockedContentButtonStyle;
        this.buttonTextDisplay = str4;
        this.buttonDestination = jsonObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return LockedContentButtonStyle.INSTANCE.serializer();
    }

    public static /* synthetic */ WidgetLockedContent copy$default(WidgetLockedContent widgetLockedContent, String str, String str2, String str3, LockedContentButtonStyle lockedContentButtonStyle, String str4, JsonObject jsonObject, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = widgetLockedContent.lockedIcon;
        }
        if ((i13 & 2) != 0) {
            str2 = widgetLockedContent.headerTextDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = widgetLockedContent.descriptionDisplay;
        }
        if ((i13 & 8) != 0) {
            lockedContentButtonStyle = widgetLockedContent.buttonStyle;
        }
        if ((i13 & 16) != 0) {
            str4 = widgetLockedContent.buttonTextDisplay;
        }
        if ((i13 & 32) != 0) {
            jsonObject = widgetLockedContent.buttonDestination;
        }
        String str5 = str4;
        JsonObject jsonObject2 = jsonObject;
        return widgetLockedContent.copy(str, str2, str3, lockedContentButtonStyle, str5, jsonObject2);
    }

    public static final /* synthetic */ void write$Self$widget_release(WidgetLockedContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.lockedIcon);
        output.encodeStringElement(serialDesc, 1, self.headerTextDisplay);
        output.encodeStringElement(serialDesc, 2, self.descriptionDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.buttonStyle);
        output.encodeStringElement(serialDesc, 4, self.buttonTextDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, C0756b0.f2760a, self.buttonDestination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLockedIcon() {
        return this.lockedIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderTextDisplay() {
        return this.headerTextDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LockedContentButtonStyle getButtonStyle() {
        return this.buttonStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getButtonTextDisplay() {
        return this.buttonTextDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final JsonObject getButtonDestination() {
        return this.buttonDestination;
    }

    public final WidgetLockedContent copy(String lockedIcon, String headerTextDisplay, String descriptionDisplay, LockedContentButtonStyle buttonStyle, String buttonTextDisplay, JsonObject buttonDestination) {
        AbstractC22676k.m65750j(lockedIcon, "lockedIcon");
        AbstractC22676k.m65750j(headerTextDisplay, "headerTextDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonTextDisplay, "buttonTextDisplay");
        return new WidgetLockedContent(lockedIcon, headerTextDisplay, descriptionDisplay, buttonStyle, buttonTextDisplay, buttonDestination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetLockedContent)) {
            return false;
        }
        WidgetLockedContent widgetLockedContent = (WidgetLockedContent) other;
        return AbstractC22676k.m65745e(this.lockedIcon, widgetLockedContent.lockedIcon) && AbstractC22676k.m65745e(this.headerTextDisplay, widgetLockedContent.headerTextDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, widgetLockedContent.descriptionDisplay) && this.buttonStyle == widgetLockedContent.buttonStyle && AbstractC22676k.m65745e(this.buttonTextDisplay, widgetLockedContent.buttonTextDisplay) && AbstractC22676k.m65745e(this.buttonDestination, widgetLockedContent.buttonDestination);
    }

    public final JsonObject getButtonDestination() {
        return this.buttonDestination;
    }

    public final LockedContentButtonStyle getButtonStyle() {
        return this.buttonStyle;
    }

    public final String getButtonTextDisplay() {
        return this.buttonTextDisplay;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final String getHeaderTextDisplay() {
        return this.headerTextDisplay;
    }

    public final String getLockedIcon() {
        return this.lockedIcon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.lockedIcon.hashCode() * 31, 31, this.headerTextDisplay), 31, this.descriptionDisplay);
        LockedContentButtonStyle lockedContentButtonStyle = this.buttonStyle;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (lockedContentButtonStyle == null ? 0 : lockedContentButtonStyle.hashCode())) * 31, 31, this.buttonTextDisplay);
        JsonObject jsonObject = this.buttonDestination;
        return iM30450d2 + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    public String toString() {
        String str = this.lockedIcon;
        String str2 = this.headerTextDisplay;
        String str3 = this.descriptionDisplay;
        LockedContentButtonStyle lockedContentButtonStyle = this.buttonStyle;
        String str4 = this.buttonTextDisplay;
        JsonObject jsonObject = this.buttonDestination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WidgetLockedContent(lockedIcon=", str, ", headerTextDisplay=", str2, ", descriptionDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", buttonStyle=");
        sbM32001t.append(lockedContentButtonStyle);
        sbM32001t.append(", buttonTextDisplay=");
        sbM32001t.append(str4);
        sbM32001t.append(", buttonDestination=");
        sbM32001t.append(jsonObject);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public WidgetLockedContent(String lockedIcon, String headerTextDisplay, String descriptionDisplay, LockedContentButtonStyle lockedContentButtonStyle, String buttonTextDisplay, JsonObject jsonObject) {
        AbstractC22676k.m65750j(lockedIcon, "lockedIcon");
        AbstractC22676k.m65750j(headerTextDisplay, "headerTextDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonTextDisplay, "buttonTextDisplay");
        this.lockedIcon = lockedIcon;
        this.headerTextDisplay = headerTextDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.buttonStyle = lockedContentButtonStyle;
        this.buttonTextDisplay = buttonTextDisplay;
        this.buttonDestination = jsonObject;
    }
}
