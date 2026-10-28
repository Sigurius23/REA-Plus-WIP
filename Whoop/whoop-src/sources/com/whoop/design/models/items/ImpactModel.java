package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hy0.EnumC17727b2;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import w91.C36959f;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JF\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010#¨\u0006:"}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "", "backgroundEnabled", "Lhy0/b2;", "trend", "icon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;ZLhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ImpactModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lhy0/b2;", "component4", "component5", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;ZLhy0/b2;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/ImpactModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "Z", "getBackgroundEnabled", "Lhy0/b2;", "getTrend", "getIcon", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImpactModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final boolean backgroundEnabled;
    private final C9598e destination;
    private final String icon;
    private final String titleDisplay;
    private final EnumC17727b2 trend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ImpactModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImpactModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C36959f(14)), null, AbstractC30060g.m92087G(enumC23463i, new C36959f(15))};
    }

    public /* synthetic */ ImpactModel(int i13, String str, boolean z4, EnumC17727b2 enumC17727b2, String str2, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ImpactModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.backgroundEnabled = z4;
        this.trend = enumC17727b2;
        this.icon = str2;
        if ((i13 & 16) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.TrendTypeState", EnumC17727b2.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ImpactModel copy$default(ImpactModel impactModel, String str, boolean z4, EnumC17727b2 enumC17727b2, String str2, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = impactModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            z4 = impactModel.backgroundEnabled;
        }
        if ((i13 & 4) != 0) {
            enumC17727b2 = impactModel.trend;
        }
        if ((i13 & 8) != 0) {
            str2 = impactModel.icon;
        }
        if ((i13 & 16) != 0) {
            c9598e = impactModel.destination;
        }
        C9598e c9598e2 = c9598e;
        EnumC17727b2 enumC17727b3 = enumC17727b2;
        return impactModel.copy(str, z4, enumC17727b3, str2, c9598e2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ImpactModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeBooleanElement(serialDesc, 1, self.backgroundEnabled);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.trend);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.icon);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getBackgroundEnabled() {
        return this.backgroundEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC17727b2 getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final ImpactModel copy(String titleDisplay, boolean backgroundEnabled, EnumC17727b2 trend, String icon, C9598e destination) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(trend, "trend");
        return new ImpactModel(titleDisplay, backgroundEnabled, trend, icon, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpactModel)) {
            return false;
        }
        ImpactModel impactModel = (ImpactModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, impactModel.titleDisplay) && this.backgroundEnabled == impactModel.backgroundEnabled && this.trend == impactModel.trend && AbstractC22676k.m65745e(this.icon, impactModel.icon) && AbstractC22676k.m65745e(this.destination, impactModel.destination);
    }

    public final boolean getBackgroundEnabled() {
        return this.backgroundEnabled;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final EnumC17727b2 getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iHashCode = (this.trend.hashCode() + AbstractC2875y.m8289b(this.titleDisplay.hashCode() * 31, 31, this.backgroundEnabled)) * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.titleDisplay;
        boolean z4 = this.backgroundEnabled;
        EnumC17727b2 enumC17727b2 = this.trend;
        String str2 = this.icon;
        C9598e c9598e = this.destination;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ImpactModel(titleDisplay=", str, ", backgroundEnabled=", ", trend=", z4);
        sbM73379l.append(enumC17727b2);
        sbM73379l.append(", icon=");
        sbM73379l.append(str2);
        sbM73379l.append(", destination=");
        return AbstractC33745d.m106656o(sbM73379l, c9598e, ")");
    }

    public ImpactModel(String titleDisplay, boolean z4, EnumC17727b2 trend, String str, C9598e c9598e) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(trend, "trend");
        this.titleDisplay = titleDisplay;
        this.backgroundEnabled = z4;
        this.trend = trend;
        this.icon = str;
        this.destination = c9598e;
    }

    public /* synthetic */ ImpactModel(String str, boolean z4, EnumC17727b2 enumC17727b2, String str2, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z4, enumC17727b2, str2, (i13 & 16) != 0 ? null : c9598e);
    }
}
