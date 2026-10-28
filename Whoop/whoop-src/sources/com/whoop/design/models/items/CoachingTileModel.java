package com.whoop.design.models.items;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
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
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36955b;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J^\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010%¨\u0006="}, m65681d2 = {"Lcom/whoop/design/models/items/CoachingTileModel;", "", "", "icon", "title", "subtitle", "ctaText", "errorText", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/AlarmStatus;", "alarmState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/AlarmStatus;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/AlarmStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CoachingTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/navigation/e;", "component7", "()Lcom/whoop/design/models/items/AlarmStatus;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/AlarmStatus;)Lcom/whoop/design/models/items/CoachingTileModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "getSubtitle", "getCtaText", "getErrorText", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Lcom/whoop/design/models/items/AlarmStatus;", "getAlarmState", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CoachingTileModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final AlarmStatus alarmState;
    private final String ctaText;
    private final C9598e destination;
    private final String errorText;
    private final String icon;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CoachingTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CoachingTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CoachingTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36955b(0)), AbstractC30060g.m92087G(enumC23463i, new C36955b(1))};
    }

    public CoachingTileModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (C9598e) null, (AlarmStatus) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.AlarmStatus", AlarmStatus.values());
    }

    public static /* synthetic */ CoachingTileModel copy$default(CoachingTileModel coachingTileModel, String str, String str2, String str3, String str4, String str5, C9598e c9598e, AlarmStatus alarmStatus, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = coachingTileModel.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = coachingTileModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = coachingTileModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = coachingTileModel.ctaText;
        }
        if ((i13 & 16) != 0) {
            str5 = coachingTileModel.errorText;
        }
        if ((i13 & 32) != 0) {
            c9598e = coachingTileModel.destination;
        }
        if ((i13 & 64) != 0) {
            alarmStatus = coachingTileModel.alarmState;
        }
        C9598e c9598e2 = c9598e;
        AlarmStatus alarmStatus2 = alarmStatus;
        String str6 = str5;
        String str7 = str3;
        return coachingTileModel.copy(str, str2, str7, str4, str6, c9598e2, alarmStatus2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(CoachingTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.icon, "")) {
            output.encodeStringElement(serialDesc, 0, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 1, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.subtitle, "")) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.ctaText, "")) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.ctaText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.errorText, "")) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.errorText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.destination);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.alarmState == AlarmStatus.OFF) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.alarmState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AlarmStatus getAlarmState() {
        return this.alarmState;
    }

    public final CoachingTileModel copy(String icon, String title, String subtitle, String ctaText, String errorText, C9598e destination, AlarmStatus alarmState) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(alarmState, "alarmState");
        return new CoachingTileModel(icon, title, subtitle, ctaText, errorText, destination, alarmState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachingTileModel)) {
            return false;
        }
        CoachingTileModel coachingTileModel = (CoachingTileModel) other;
        return AbstractC22676k.m65745e(this.icon, coachingTileModel.icon) && AbstractC22676k.m65745e(this.title, coachingTileModel.title) && AbstractC22676k.m65745e(this.subtitle, coachingTileModel.subtitle) && AbstractC22676k.m65745e(this.ctaText, coachingTileModel.ctaText) && AbstractC22676k.m65745e(this.errorText, coachingTileModel.errorText) && AbstractC22676k.m65745e(this.destination, coachingTileModel.destination) && this.alarmState == coachingTileModel.alarmState;
    }

    public final AlarmStatus getAlarmState() {
        return this.alarmState;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ctaText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return this.alarmState.hashCode() + ((iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.ctaText;
        String str5 = this.errorText;
        C9598e c9598e = this.destination;
        AlarmStatus alarmStatus = this.alarmState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CoachingTileModel(icon=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", ctaText=", str4, ", errorText=");
        AbstractC30007c.m91827B(sbM32001t, str5, ", destination=", c9598e, ", alarmState=");
        sbM32001t.append(alarmStatus);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ CoachingTileModel(int i13, String str, String str2, String str3, String str4, String str5, C9598e c9598e, AlarmStatus alarmStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.icon = "";
        } else {
            this.icon = str;
        }
        if ((i13 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str3;
        }
        if ((i13 & 8) == 0) {
            this.ctaText = "";
        } else {
            this.ctaText = str4;
        }
        if ((i13 & 16) == 0) {
            this.errorText = "";
        } else {
            this.errorText = str5;
        }
        if ((i13 & 32) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 64) == 0) {
            this.alarmState = AlarmStatus.OFF;
        } else {
            this.alarmState = alarmStatus;
        }
    }

    public CoachingTileModel(String icon, String title, String str, String str2, String str3, C9598e c9598e, AlarmStatus alarmState) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(alarmState, "alarmState");
        this.icon = icon;
        this.title = title;
        this.subtitle = str;
        this.ctaText = str2;
        this.errorText = str3;
        this.destination = c9598e;
        this.alarmState = alarmState;
    }

    public /* synthetic */ CoachingTileModel(String str, String str2, String str3, String str4, String str5, C9598e c9598e, AlarmStatus alarmStatus, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? null : c9598e, (i13 & 64) != 0 ? AlarmStatus.OFF : alarmStatus);
    }
}
