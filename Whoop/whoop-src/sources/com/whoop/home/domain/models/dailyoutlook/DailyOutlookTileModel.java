package com.whoop.home.domain.models.dailyoutlook;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import yq0.C39708a;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJN\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b6\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b9\u0010\u001f¨\u0006<"}, m65681d2 = {"Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;", "", "", "hasGradient", "", "leftIcon", "Lcom/whoop/design/util/TextResource;", "title", "rightIcon", "Lcom/whoop/navigation/e;", "destination", "style", "<init>", "(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/util/TextResource;", "component4", "component5", "()Lcom/whoop/navigation/e;", "component6", "copy", "(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHasGradient", "getHasGradient$annotations", "()V", "Ljava/lang/String;", "getLeftIcon", "Lcom/whoop/design/util/TextResource;", "getTitle", "getRightIcon", "Lcom/whoop/navigation/e;", "getDestination", "getStyle", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DailyOutlookTileModel {
    private final C9598e destination;
    private final boolean hasGradient;
    private final String leftIcon;
    private final String rightIcon;
    private final String style;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C39708a(1)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DailyOutlookTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DailyOutlookTileModel(int i13, boolean z4, String str, TextResource textResource, String str2, C9598e c9598e, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, DailyOutlookTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.hasGradient = z4;
        this.leftIcon = str;
        this.title = textResource;
        this.rightIcon = str2;
        this.destination = c9598e;
        this.style = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ DailyOutlookTileModel copy$default(DailyOutlookTileModel dailyOutlookTileModel, boolean z4, String str, TextResource textResource, String str2, C9598e c9598e, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = dailyOutlookTileModel.hasGradient;
        }
        if ((i13 & 2) != 0) {
            str = dailyOutlookTileModel.leftIcon;
        }
        if ((i13 & 4) != 0) {
            textResource = dailyOutlookTileModel.title;
        }
        if ((i13 & 8) != 0) {
            str2 = dailyOutlookTileModel.rightIcon;
        }
        if ((i13 & 16) != 0) {
            c9598e = dailyOutlookTileModel.destination;
        }
        if ((i13 & 32) != 0) {
            str3 = dailyOutlookTileModel.style;
        }
        C9598e c9598e2 = c9598e;
        String str4 = str3;
        return dailyOutlookTileModel.copy(z4, str, textResource, str2, c9598e2, str4);
    }

    @InterfaceC23457c
    public static /* synthetic */ void getHasGradient$annotations() {
    }

    public static final /* synthetic */ void write$Self$home_release(DailyOutlookTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.hasGradient);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.leftIcon);
        output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.title);
        output.encodeStringElement(serialDesc, 3, self.rightIcon);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
        output.encodeStringElement(serialDesc, 5, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasGradient() {
        return this.hasGradient;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final DailyOutlookTileModel copy(boolean hasGradient, String leftIcon, TextResource title, String rightIcon, C9598e destination, String style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(rightIcon, "rightIcon");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(style, "style");
        return new DailyOutlookTileModel(hasGradient, leftIcon, title, rightIcon, destination, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyOutlookTileModel)) {
            return false;
        }
        DailyOutlookTileModel dailyOutlookTileModel = (DailyOutlookTileModel) other;
        return this.hasGradient == dailyOutlookTileModel.hasGradient && AbstractC22676k.m65745e(this.leftIcon, dailyOutlookTileModel.leftIcon) && AbstractC22676k.m65745e(this.title, dailyOutlookTileModel.title) && AbstractC22676k.m65745e(this.rightIcon, dailyOutlookTileModel.rightIcon) && AbstractC22676k.m65745e(this.destination, dailyOutlookTileModel.destination) && AbstractC22676k.m65745e(this.style, dailyOutlookTileModel.style);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final boolean getHasGradient() {
        return this.hasGradient;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getStyle() {
        return this.style;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasGradient) * 31;
        String str = this.leftIcon;
        return this.style.hashCode() + AbstractC36095b.m114673a(this.destination, AbstractC11266d.m30450d(AbstractC31061c.m95625a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.title, 31), 31, this.rightIcon), 31);
    }

    public String toString() {
        boolean z4 = this.hasGradient;
        String str = this.leftIcon;
        TextResource textResource = this.title;
        String str2 = this.rightIcon;
        C9598e c9598e = this.destination;
        String str3 = this.style;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("DailyOutlookTileModel(hasGradient=", ", leftIcon=", str, ", title=", z4);
        AbstractC30007c.m91856z(sbM38567n, textResource, ", rightIcon=", str2, ", destination=");
        sbM38567n.append(c9598e);
        sbM38567n.append(", style=");
        sbM38567n.append(str3);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public DailyOutlookTileModel(boolean z4, String str, TextResource title, String rightIcon, C9598e destination, String style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(rightIcon, "rightIcon");
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(style, "style");
        this.hasGradient = z4;
        this.leftIcon = str;
        this.title = title;
        this.rightIcon = rightIcon;
        this.destination = destination;
        this.style = style;
    }
}
