package com.whoop.healthspan.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/LockedContent;", "", "", "lockedIcon", "headerTextDisplay", "descriptionDisplay", "buttonStyle", "buttonTextDisplay", "Lcom/whoop/navigation/e;", "buttonDestination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/models/LockedContent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/healthspan/domain/models/LockedContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLockedIcon", "getHeaderTextDisplay", "getDescriptionDisplay", "getButtonStyle", "getButtonTextDisplay", "Lcom/whoop/navigation/e;", "getButtonDestination", "getButtonDestination$annotations", "()V", "Companion", "$serializer", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LockedContent {
    private final C9598e buttonDestination;
    private final String buttonStyle;
    private final String buttonTextDisplay;
    private final String descriptionDisplay;
    private final String headerTextDisplay;
    private final String lockedIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15620a(19))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/LockedContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/models/LockedContent;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LockedContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LockedContent(int i13, String str, String str2, String str3, String str4, String str5, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, LockedContent$$serializer.INSTANCE.getDescriptor());
        }
        this.lockedIcon = str;
        this.headerTextDisplay = str2;
        this.descriptionDisplay = str3;
        this.buttonStyle = str4;
        this.buttonTextDisplay = str5;
        this.buttonDestination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ LockedContent copy$default(LockedContent lockedContent, String str, String str2, String str3, String str4, String str5, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = lockedContent.lockedIcon;
        }
        if ((i13 & 2) != 0) {
            str2 = lockedContent.headerTextDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = lockedContent.descriptionDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = lockedContent.buttonStyle;
        }
        if ((i13 & 16) != 0) {
            str5 = lockedContent.buttonTextDisplay;
        }
        if ((i13 & 32) != 0) {
            c9598e = lockedContent.buttonDestination;
        }
        String str6 = str5;
        C9598e c9598e2 = c9598e;
        return lockedContent.copy(str, str2, str3, str4, str6, c9598e2);
    }

    public static /* synthetic */ void getButtonDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$healthspan_release(LockedContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.lockedIcon);
        output.encodeStringElement(serialDesc, 1, self.headerTextDisplay);
        output.encodeStringElement(serialDesc, 2, self.descriptionDisplay);
        output.encodeStringElement(serialDesc, 3, self.buttonStyle);
        output.encodeStringElement(serialDesc, 4, self.buttonTextDisplay);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.buttonDestination);
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
    public final String getButtonStyle() {
        return this.buttonStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getButtonTextDisplay() {
        return this.buttonTextDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C9598e getButtonDestination() {
        return this.buttonDestination;
    }

    public final LockedContent copy(String lockedIcon, String headerTextDisplay, String descriptionDisplay, String buttonStyle, String buttonTextDisplay, C9598e buttonDestination) {
        AbstractC22676k.m65750j(lockedIcon, "lockedIcon");
        AbstractC22676k.m65750j(headerTextDisplay, "headerTextDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonStyle, "buttonStyle");
        AbstractC22676k.m65750j(buttonTextDisplay, "buttonTextDisplay");
        return new LockedContent(lockedIcon, headerTextDisplay, descriptionDisplay, buttonStyle, buttonTextDisplay, buttonDestination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LockedContent)) {
            return false;
        }
        LockedContent lockedContent = (LockedContent) other;
        return AbstractC22676k.m65745e(this.lockedIcon, lockedContent.lockedIcon) && AbstractC22676k.m65745e(this.headerTextDisplay, lockedContent.headerTextDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, lockedContent.descriptionDisplay) && AbstractC22676k.m65745e(this.buttonStyle, lockedContent.buttonStyle) && AbstractC22676k.m65745e(this.buttonTextDisplay, lockedContent.buttonTextDisplay) && AbstractC22676k.m65745e(this.buttonDestination, lockedContent.buttonDestination);
    }

    public final C9598e getButtonDestination() {
        return this.buttonDestination;
    }

    public final String getButtonStyle() {
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
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.lockedIcon.hashCode() * 31, 31, this.headerTextDisplay), 31, this.descriptionDisplay), 31, this.buttonStyle), 31, this.buttonTextDisplay);
        C9598e c9598e = this.buttonDestination;
        return iM30450d + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        String str = this.lockedIcon;
        String str2 = this.headerTextDisplay;
        String str3 = this.descriptionDisplay;
        String str4 = this.buttonStyle;
        String str5 = this.buttonTextDisplay;
        C9598e c9598e = this.buttonDestination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LockedContent(lockedIcon=", str, ", headerTextDisplay=", str2, ", descriptionDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", buttonStyle=", str4, ", buttonTextDisplay=");
        return AbstractC13673n.m38563j(sbM32001t, str5, ", buttonDestination=", c9598e, ")");
    }

    public LockedContent(String lockedIcon, String headerTextDisplay, String descriptionDisplay, String buttonStyle, String buttonTextDisplay, C9598e c9598e) {
        AbstractC22676k.m65750j(lockedIcon, "lockedIcon");
        AbstractC22676k.m65750j(headerTextDisplay, "headerTextDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonStyle, "buttonStyle");
        AbstractC22676k.m65750j(buttonTextDisplay, "buttonTextDisplay");
        this.lockedIcon = lockedIcon;
        this.headerTextDisplay = headerTextDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.buttonStyle = buttonStyle;
        this.buttonTextDisplay = buttonTextDisplay;
        this.buttonDestination = c9598e;
    }
}
