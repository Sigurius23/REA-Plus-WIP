package com.whoop.home.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lz0.EnumC24822g;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc2.C39434a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%JZ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/home/domain/models/PregnancyTileHeader;", "", "", "title", "trimesterDisplay", "pregnancyIcon", "endIcon", "Llz0/g;", "style", "dueDate", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llz0/g;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llz0/g;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/PregnancyTileHeader;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Llz0/g;", "component6", "component7", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llz0/g;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/home/domain/models/PregnancyTileHeader;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTrimesterDisplay", "getPregnancyIcon", "getEndIcon", "Llz0/g;", "getStyle", "getDueDate", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PregnancyTileHeader {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final String dueDate;
    private final String endIcon;
    private final String pregnancyIcon;
    private final EnumC24822g style;
    private final String title;
    private final String trimesterDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/PregnancyTileHeader$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/PregnancyTileHeader;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PregnancyTileHeader$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C39434a(23)), null, AbstractC30060g.m92087G(enumC23463i, new C39434a(24))};
    }

    public /* synthetic */ PregnancyTileHeader(int i13, String str, String str2, String str3, String str4, EnumC24822g enumC24822g, String str5, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, PregnancyTileHeader$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.trimesterDisplay = str2;
        this.pregnancyIcon = str3;
        this.endIcon = str4;
        this.style = enumC24822g;
        this.dueDate = str5;
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.progressbar.TrimesterStyle", EnumC24822g.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ PregnancyTileHeader copy$default(PregnancyTileHeader pregnancyTileHeader, String str, String str2, String str3, String str4, EnumC24822g enumC24822g, String str5, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pregnancyTileHeader.title;
        }
        if ((i13 & 2) != 0) {
            str2 = pregnancyTileHeader.trimesterDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = pregnancyTileHeader.pregnancyIcon;
        }
        if ((i13 & 8) != 0) {
            str4 = pregnancyTileHeader.endIcon;
        }
        if ((i13 & 16) != 0) {
            enumC24822g = pregnancyTileHeader.style;
        }
        if ((i13 & 32) != 0) {
            str5 = pregnancyTileHeader.dueDate;
        }
        if ((i13 & 64) != 0) {
            c9598e = pregnancyTileHeader.destination;
        }
        String str6 = str5;
        C9598e c9598e2 = c9598e;
        EnumC24822g enumC24822g2 = enumC24822g;
        String str7 = str3;
        return pregnancyTileHeader.copy(str, str2, str7, str4, enumC24822g2, str6, c9598e2);
    }

    public static final /* synthetic */ void write$Self$home_release(PregnancyTileHeader self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.trimesterDisplay);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.pregnancyIcon);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.endIcon);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.style);
        output.encodeStringElement(serialDesc, 5, self.dueDate);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrimesterDisplay() {
        return this.trimesterDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPregnancyIcon() {
        return this.pregnancyIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC24822g getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final PregnancyTileHeader copy(String title, String trimesterDisplay, String pregnancyIcon, String endIcon, EnumC24822g style, String dueDate, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trimesterDisplay, "trimesterDisplay");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(dueDate, "dueDate");
        AbstractC22676k.m65750j(destination, "destination");
        return new PregnancyTileHeader(title, trimesterDisplay, pregnancyIcon, endIcon, style, dueDate, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PregnancyTileHeader)) {
            return false;
        }
        PregnancyTileHeader pregnancyTileHeader = (PregnancyTileHeader) other;
        return AbstractC22676k.m65745e(this.title, pregnancyTileHeader.title) && AbstractC22676k.m65745e(this.trimesterDisplay, pregnancyTileHeader.trimesterDisplay) && AbstractC22676k.m65745e(this.pregnancyIcon, pregnancyTileHeader.pregnancyIcon) && AbstractC22676k.m65745e(this.endIcon, pregnancyTileHeader.endIcon) && this.style == pregnancyTileHeader.style && AbstractC22676k.m65745e(this.dueDate, pregnancyTileHeader.dueDate) && AbstractC22676k.m65745e(this.destination, pregnancyTileHeader.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final String getPregnancyIcon() {
        return this.pregnancyIcon;
    }

    public final EnumC24822g getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrimesterDisplay() {
        return this.trimesterDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.trimesterDisplay);
        String str = this.pregnancyIcon;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endIcon;
        return this.destination.hashCode() + AbstractC11266d.m30450d((this.style.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.dueDate);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.trimesterDisplay;
        String str3 = this.pregnancyIcon;
        String str4 = this.endIcon;
        EnumC24822g enumC24822g = this.style;
        String str5 = this.dueDate;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PregnancyTileHeader(title=", str, ", trimesterDisplay=", str2, ", pregnancyIcon=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", endIcon=", str4, ", style=");
        sbM32001t.append(enumC24822g);
        sbM32001t.append(", dueDate=");
        sbM32001t.append(str5);
        sbM32001t.append(", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }

    public PregnancyTileHeader(String title, String trimesterDisplay, String str, String str2, EnumC24822g style, String dueDate, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trimesterDisplay, "trimesterDisplay");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(dueDate, "dueDate");
        AbstractC22676k.m65750j(destination, "destination");
        this.title = title;
        this.trimesterDisplay = trimesterDisplay;
        this.pregnancyIcon = str;
        this.endIcon = str2;
        this.style = style;
        this.dueDate = dueDate;
        this.destination = destination;
    }
}
