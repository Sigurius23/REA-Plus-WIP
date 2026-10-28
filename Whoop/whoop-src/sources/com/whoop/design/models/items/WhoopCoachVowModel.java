package com.whoop.design.models.items;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36965l;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJT\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b7\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b8\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b9\u0010\u001c¨\u0006<"}, m65681d2 = {"Lcom/whoop/design/models/items/WhoopCoachVowModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "vow", "Lcom/whoop/design/models/items/WhoopCoachEntryPoint;", "entryPoint", "Lcom/whoop/navigation/e;", "destination", "header", "style", "icon", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachEntryPoint;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/WhoopCoachEntryPoint;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/WhoopCoachVowModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/WhoopCoachEntryPoint;", "component3", "()Lcom/whoop/navigation/e;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/WhoopCoachEntryPoint;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/WhoopCoachVowModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVow", "Lcom/whoop/design/models/items/WhoopCoachEntryPoint;", "getEntryPoint", "getEntryPoint$annotations", "()V", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "getHeader", "getStyle", "getIcon", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopCoachVowModel implements DesignSystemModel {
    private final C9598e destination;

    @SerializedName("entrypoint")
    private final WhoopCoachEntryPoint entryPoint;
    private final String header;
    private final String icon;
    private final String style;
    private final String vow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36965l(8)), null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/WhoopCoachVowModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopCoachVowModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WhoopCoachVowModel() {
        this((String) null, (WhoopCoachEntryPoint) null, (C9598e) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ WhoopCoachVowModel copy$default(WhoopCoachVowModel whoopCoachVowModel, String str, WhoopCoachEntryPoint whoopCoachEntryPoint, C9598e c9598e, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = whoopCoachVowModel.vow;
        }
        if ((i13 & 2) != 0) {
            whoopCoachEntryPoint = whoopCoachVowModel.entryPoint;
        }
        if ((i13 & 4) != 0) {
            c9598e = whoopCoachVowModel.destination;
        }
        if ((i13 & 8) != 0) {
            str2 = whoopCoachVowModel.header;
        }
        if ((i13 & 16) != 0) {
            str3 = whoopCoachVowModel.style;
        }
        if ((i13 & 32) != 0) {
            str4 = whoopCoachVowModel.icon;
        }
        String str5 = str3;
        String str6 = str4;
        return whoopCoachVowModel.copy(str, whoopCoachEntryPoint, c9598e, str2, str5, str6);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    @InterfaceC37143h("entrypoint")
    public static /* synthetic */ void getEntryPoint$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(WhoopCoachVowModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.vow, "")) {
            output.encodeStringElement(serialDesc, 0, self.vow);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.entryPoint != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, WhoopCoachEntryPoint$$serializer.INSTANCE, self.entryPoint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.header != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.header);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.style, "")) {
            output.encodeStringElement(serialDesc, 4, self.style);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.icon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.icon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVow() {
        return this.vow;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WhoopCoachEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final WhoopCoachVowModel copy(String vow, WhoopCoachEntryPoint entryPoint, C9598e destination, String header, String style, String icon) {
        AbstractC22676k.m65750j(vow, "vow");
        AbstractC22676k.m65750j(style, "style");
        return new WhoopCoachVowModel(vow, entryPoint, destination, header, style, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopCoachVowModel)) {
            return false;
        }
        WhoopCoachVowModel whoopCoachVowModel = (WhoopCoachVowModel) other;
        return AbstractC22676k.m65745e(this.vow, whoopCoachVowModel.vow) && AbstractC22676k.m65745e(this.entryPoint, whoopCoachVowModel.entryPoint) && AbstractC22676k.m65745e(this.destination, whoopCoachVowModel.destination) && AbstractC22676k.m65745e(this.header, whoopCoachVowModel.header) && AbstractC22676k.m65745e(this.style, whoopCoachVowModel.style) && AbstractC22676k.m65745e(this.icon, whoopCoachVowModel.icon);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final WhoopCoachEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getVow() {
        return this.vow;
    }

    public int hashCode() {
        int iHashCode = this.vow.hashCode() * 31;
        WhoopCoachEntryPoint whoopCoachEntryPoint = this.entryPoint;
        int iHashCode2 = (iHashCode + (whoopCoachEntryPoint == null ? 0 : whoopCoachEntryPoint.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str = this.header;
        int iM30450d = AbstractC11266d.m30450d((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.style);
        String str2 = this.icon;
        return iM30450d + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.vow;
        WhoopCoachEntryPoint whoopCoachEntryPoint = this.entryPoint;
        C9598e c9598e = this.destination;
        String str2 = this.header;
        String str3 = this.style;
        String str4 = this.icon;
        StringBuilder sb4 = new StringBuilder("WhoopCoachVowModel(vow=");
        sb4.append(str);
        sb4.append(", entryPoint=");
        sb4.append(whoopCoachEntryPoint);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", header=");
        sb4.append(str2);
        sb4.append(", style=");
        return AbstractC11266d.m30464r(sb4, str3, ", icon=", str4, ")");
    }

    public /* synthetic */ WhoopCoachVowModel(int i13, String str, WhoopCoachEntryPoint whoopCoachEntryPoint, C9598e c9598e, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.vow = "";
        } else {
            this.vow = str;
        }
        if ((i13 & 2) == 0) {
            this.entryPoint = null;
        } else {
            this.entryPoint = whoopCoachEntryPoint;
        }
        if ((i13 & 4) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 8) == 0) {
            this.header = null;
        } else {
            this.header = str2;
        }
        if ((i13 & 16) == 0) {
            this.style = "";
        } else {
            this.style = str3;
        }
        if ((i13 & 32) == 0) {
            this.icon = null;
        } else {
            this.icon = str4;
        }
    }

    public WhoopCoachVowModel(String vow, WhoopCoachEntryPoint whoopCoachEntryPoint, C9598e c9598e, String str, String style, String str2) {
        AbstractC22676k.m65750j(vow, "vow");
        AbstractC22676k.m65750j(style, "style");
        this.vow = vow;
        this.entryPoint = whoopCoachEntryPoint;
        this.destination = c9598e;
        this.header = str;
        this.style = style;
        this.icon = str2;
    }

    public /* synthetic */ WhoopCoachVowModel(String str, WhoopCoachEntryPoint whoopCoachEntryPoint, C9598e c9598e, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : whoopCoachEntryPoint, (i13 & 4) != 0 ? null : c9598e, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? "" : str3, (i13 & 32) != 0 ? null : str4);
    }
}
