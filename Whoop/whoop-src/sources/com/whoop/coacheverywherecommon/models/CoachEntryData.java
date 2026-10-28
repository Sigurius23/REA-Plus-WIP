package com.whoop.coacheverywherecommon.models;

import androidx.annotation.Keep;
import com.whoop.navigation.DrawerPresentation;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ej1.C13228a;
import ep0.EnumC13400f;
import ep0.EnumC13401g;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABB[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jd\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010\"J\u0010\u0010.\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010*¨\u0006C"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/CoachEntryData;", "", "", "showMic", "useVoice", "", "placeholder", "Lep0/f;", "onLoadStyle", "Lep0/g;", "loadStyle", "", "maxLines", "Lcom/whoop/navigation/DrawerPresentation;", "drawerPresentation", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lep0/f;Lep0/g;Ljava/lang/Integer;Lcom/whoop/navigation/DrawerPresentation;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lep0/f;Lep0/g;Ljava/lang/Integer;Lcom/whoop/navigation/DrawerPresentation;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$coach_everywhere_common_release", "(Lcom/whoop/coacheverywherecommon/models/CoachEntryData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lep0/f;", "component5", "()Lep0/g;", "component6", "()Ljava/lang/Integer;", "component7", "()Lcom/whoop/navigation/DrawerPresentation;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lep0/f;Lep0/g;Ljava/lang/Integer;Lcom/whoop/navigation/DrawerPresentation;)Lcom/whoop/coacheverywherecommon/models/CoachEntryData;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getShowMic", "getUseVoice", "Ljava/lang/String;", "getPlaceholder", "Lep0/f;", "getOnLoadStyle", "Lep0/g;", "getLoadStyle", "Ljava/lang/Integer;", "getMaxLines", "Lcom/whoop/navigation/DrawerPresentation;", "getDrawerPresentation", "Companion", "$serializer", "a", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CoachEntryData {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DrawerPresentation drawerPresentation;
    private final EnumC13401g loadStyle;
    private final Integer maxLines;
    private final EnumC13400f onLoadStyle;
    private final String placeholder;
    private final Boolean showMic;
    private final Boolean useVoice;

    /* JADX INFO: renamed from: com.whoop.coacheverywherecommon.models.CoachEntryData$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/CoachEntryData$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/coacheverywherecommon/models/CoachEntryData;", "serializer", "()Lwc3/c;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CoachEntryData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C13228a(11)), AbstractC30060g.m92087G(enumC23463i, new C13228a(12)), null, AbstractC30060g.m92087G(enumC23463i, new C13228a(13))};
    }

    public CoachEntryData() {
        this((Boolean) null, (Boolean) null, (String) null, (EnumC13400f) null, (EnumC13401g) null, (Integer) null, (DrawerPresentation) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.coacheverywherecommon.models.ProactiveLoadAction", EnumC13400f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.coacheverywherecommon.models.ProactiveLoadingStyle", EnumC13401g.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return DrawerPresentation.INSTANCE.serializer();
    }

    public static /* synthetic */ CoachEntryData copy$default(CoachEntryData coachEntryData, Boolean bool, Boolean bool2, String str, EnumC13400f enumC13400f, EnumC13401g enumC13401g, Integer num, DrawerPresentation drawerPresentation, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = coachEntryData.showMic;
        }
        if ((i13 & 2) != 0) {
            bool2 = coachEntryData.useVoice;
        }
        if ((i13 & 4) != 0) {
            str = coachEntryData.placeholder;
        }
        if ((i13 & 8) != 0) {
            enumC13400f = coachEntryData.onLoadStyle;
        }
        if ((i13 & 16) != 0) {
            enumC13401g = coachEntryData.loadStyle;
        }
        if ((i13 & 32) != 0) {
            num = coachEntryData.maxLines;
        }
        if ((i13 & 64) != 0) {
            drawerPresentation = coachEntryData.drawerPresentation;
        }
        Integer num2 = num;
        DrawerPresentation drawerPresentation2 = drawerPresentation;
        EnumC13401g enumC13401g2 = enumC13401g;
        String str2 = str;
        return coachEntryData.copy(bool, bool2, str2, enumC13400f, enumC13401g2, num2, drawerPresentation2);
    }

    public static final /* synthetic */ void write$Self$coach_everywhere_common_release(CoachEntryData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.showMic != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.showMic);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.useVoice != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.useVoice);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.placeholder != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.placeholder);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.onLoadStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.onLoadStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.loadStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.loadStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.maxLines != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.maxLines);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.drawerPresentation == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.drawerPresentation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getShowMic() {
        return this.showMic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getUseVoice() {
        return this.useVoice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC13400f getOnLoadStyle() {
        return this.onLoadStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC13401g getLoadStyle() {
        return this.loadStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DrawerPresentation getDrawerPresentation() {
        return this.drawerPresentation;
    }

    public final CoachEntryData copy(Boolean showMic, Boolean useVoice, String placeholder, EnumC13400f onLoadStyle, EnumC13401g loadStyle, Integer maxLines, DrawerPresentation drawerPresentation) {
        return new CoachEntryData(showMic, useVoice, placeholder, onLoadStyle, loadStyle, maxLines, drawerPresentation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachEntryData)) {
            return false;
        }
        CoachEntryData coachEntryData = (CoachEntryData) other;
        return AbstractC22676k.m65745e(this.showMic, coachEntryData.showMic) && AbstractC22676k.m65745e(this.useVoice, coachEntryData.useVoice) && AbstractC22676k.m65745e(this.placeholder, coachEntryData.placeholder) && this.onLoadStyle == coachEntryData.onLoadStyle && this.loadStyle == coachEntryData.loadStyle && AbstractC22676k.m65745e(this.maxLines, coachEntryData.maxLines) && this.drawerPresentation == coachEntryData.drawerPresentation;
    }

    public final DrawerPresentation getDrawerPresentation() {
        return this.drawerPresentation;
    }

    public final EnumC13401g getLoadStyle() {
        return this.loadStyle;
    }

    public final Integer getMaxLines() {
        return this.maxLines;
    }

    public final EnumC13400f getOnLoadStyle() {
        return this.onLoadStyle;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final Boolean getShowMic() {
        return this.showMic;
    }

    public final Boolean getUseVoice() {
        return this.useVoice;
    }

    public int hashCode() {
        Boolean bool = this.showMic;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.useVoice;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.placeholder;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC13400f enumC13400f = this.onLoadStyle;
        int iHashCode4 = (iHashCode3 + (enumC13400f == null ? 0 : enumC13400f.hashCode())) * 31;
        EnumC13401g enumC13401g = this.loadStyle;
        int iHashCode5 = (iHashCode4 + (enumC13401g == null ? 0 : enumC13401g.hashCode())) * 31;
        Integer num = this.maxLines;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        DrawerPresentation drawerPresentation = this.drawerPresentation;
        return iHashCode6 + (drawerPresentation != null ? drawerPresentation.hashCode() : 0);
    }

    public String toString() {
        return "CoachEntryData(showMic=" + this.showMic + ", useVoice=" + this.useVoice + ", placeholder=" + this.placeholder + ", onLoadStyle=" + this.onLoadStyle + ", loadStyle=" + this.loadStyle + ", maxLines=" + this.maxLines + ", drawerPresentation=" + this.drawerPresentation + ")";
    }

    public /* synthetic */ CoachEntryData(int i13, Boolean bool, Boolean bool2, String str, EnumC13400f enumC13400f, EnumC13401g enumC13401g, Integer num, DrawerPresentation drawerPresentation, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.showMic = null;
        } else {
            this.showMic = bool;
        }
        if ((i13 & 2) == 0) {
            this.useVoice = null;
        } else {
            this.useVoice = bool2;
        }
        if ((i13 & 4) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str;
        }
        if ((i13 & 8) == 0) {
            this.onLoadStyle = null;
        } else {
            this.onLoadStyle = enumC13400f;
        }
        if ((i13 & 16) == 0) {
            this.loadStyle = null;
        } else {
            this.loadStyle = enumC13401g;
        }
        if ((i13 & 32) == 0) {
            this.maxLines = null;
        } else {
            this.maxLines = num;
        }
        if ((i13 & 64) == 0) {
            this.drawerPresentation = null;
        } else {
            this.drawerPresentation = drawerPresentation;
        }
    }

    public CoachEntryData(Boolean bool, Boolean bool2, String str, EnumC13400f enumC13400f, EnumC13401g enumC13401g, Integer num, DrawerPresentation drawerPresentation) {
        this.showMic = bool;
        this.useVoice = bool2;
        this.placeholder = str;
        this.onLoadStyle = enumC13400f;
        this.loadStyle = enumC13401g;
        this.maxLines = num;
        this.drawerPresentation = drawerPresentation;
    }

    public /* synthetic */ CoachEntryData(Boolean bool, Boolean bool2, String str, EnumC13400f enumC13400f, EnumC13401g enumC13401g, Integer num, DrawerPresentation drawerPresentation, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : bool2, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : enumC13400f, (i13 & 16) != 0 ? null : enumC13401g, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : drawerPresentation);
    }
}
