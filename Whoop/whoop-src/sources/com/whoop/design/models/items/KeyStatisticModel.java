package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.util.TrendKey;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import un1.C35100f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010#JX\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b5\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b8\u0010#R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b9\u0010#¨\u0006<"}, m65681d2 = {"Lcom/whoop/design/models/items/KeyStatisticModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/util/TrendKey;", "trendKey", "Lcom/whoop/design/util/TextResource;", "title", "currentValueDisplay", "thirtyDayValueDisplay", "", "state", "icon", "style", "<init>", "(Lcom/whoop/util/TrendKey;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/util/TrendKey;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/KeyStatisticModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/util/TrendKey;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "copy", "(Lcom/whoop/util/TrendKey;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/KeyStatisticModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/util/TrendKey;", "getTrendKey", "Lcom/whoop/design/util/TextResource;", "getTitle", "getCurrentValueDisplay", "getThirtyDayValueDisplay", "Ljava/lang/String;", "getState", "getIcon", "getStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class KeyStatisticModel implements DesignSystemModel {
    private final TextResource currentValueDisplay;
    private final String icon;
    private final String state;
    private final String style;
    private final TextResource thirtyDayValueDisplay;
    private final TextResource title;
    private final TrendKey trendKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35100f(21)), null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/KeyStatisticModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/KeyStatisticModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return KeyStatisticModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public KeyStatisticModel() {
        this((TrendKey) null, (TextResource) null, (TextResource) null, (TextResource) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return TrendKey.INSTANCE.serializer();
    }

    public static /* synthetic */ KeyStatisticModel copy$default(KeyStatisticModel keyStatisticModel, TrendKey trendKey, TextResource textResource, TextResource textResource2, TextResource textResource3, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            trendKey = keyStatisticModel.trendKey;
        }
        if ((i13 & 2) != 0) {
            textResource = keyStatisticModel.title;
        }
        if ((i13 & 4) != 0) {
            textResource2 = keyStatisticModel.currentValueDisplay;
        }
        if ((i13 & 8) != 0) {
            textResource3 = keyStatisticModel.thirtyDayValueDisplay;
        }
        if ((i13 & 16) != 0) {
            str = keyStatisticModel.state;
        }
        if ((i13 & 32) != 0) {
            str2 = keyStatisticModel.icon;
        }
        if ((i13 & 64) != 0) {
            str3 = keyStatisticModel.style;
        }
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        TextResource textResource4 = textResource2;
        return keyStatisticModel.copy(trendKey, textResource, textResource4, textResource3, str6, str4, str5);
    }

    public static final /* synthetic */ void write$Self$design_models_release(KeyStatisticModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.trendKey != TrendKey.NONE) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.trendKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.currentValueDisplay, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.currentValueDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.thirtyDayValueDisplay, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 3, C25452a.f99689a, self.thirtyDayValueDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.state, "")) {
            output.encodeStringElement(serialDesc, 4, self.state);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.icon, "")) {
            output.encodeStringElement(serialDesc, 5, self.icon);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && AbstractC22676k.m65745e(self.style, "DEFAULT")) {
            return;
        }
        output.encodeStringElement(serialDesc, 6, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TrendKey getTrendKey() {
        return this.trendKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getCurrentValueDisplay() {
        return this.currentValueDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getThirtyDayValueDisplay() {
        return this.thirtyDayValueDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final KeyStatisticModel copy(TrendKey trendKey, TextResource title, TextResource currentValueDisplay, TextResource thirtyDayValueDisplay, String state, String icon, String style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(currentValueDisplay, "currentValueDisplay");
        AbstractC22676k.m65750j(thirtyDayValueDisplay, "thirtyDayValueDisplay");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(style, "style");
        return new KeyStatisticModel(trendKey, title, currentValueDisplay, thirtyDayValueDisplay, state, icon, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyStatisticModel)) {
            return false;
        }
        KeyStatisticModel keyStatisticModel = (KeyStatisticModel) other;
        return this.trendKey == keyStatisticModel.trendKey && AbstractC22676k.m65745e(this.title, keyStatisticModel.title) && AbstractC22676k.m65745e(this.currentValueDisplay, keyStatisticModel.currentValueDisplay) && AbstractC22676k.m65745e(this.thirtyDayValueDisplay, keyStatisticModel.thirtyDayValueDisplay) && AbstractC22676k.m65745e(this.state, keyStatisticModel.state) && AbstractC22676k.m65745e(this.icon, keyStatisticModel.icon) && AbstractC22676k.m65745e(this.style, keyStatisticModel.style);
    }

    public final TextResource getCurrentValueDisplay() {
        return this.currentValueDisplay;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStyle() {
        return this.style;
    }

    public final TextResource getThirtyDayValueDisplay() {
        return this.thirtyDayValueDisplay;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final TrendKey getTrendKey() {
        return this.trendKey;
    }

    public int hashCode() {
        TrendKey trendKey = this.trendKey;
        return this.style.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((trendKey == null ? 0 : trendKey.hashCode()) * 31, this.title, 31), this.currentValueDisplay, 31), this.thirtyDayValueDisplay, 31), 31, this.state), 31, this.icon);
    }

    public String toString() {
        TrendKey trendKey = this.trendKey;
        TextResource textResource = this.title;
        TextResource textResource2 = this.currentValueDisplay;
        TextResource textResource3 = this.thirtyDayValueDisplay;
        String str = this.state;
        String str2 = this.icon;
        String str3 = this.style;
        StringBuilder sb4 = new StringBuilder("KeyStatisticModel(trendKey=");
        sb4.append(trendKey);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", currentValueDisplay=");
        AbstractC30007c.m91855y(sb4, textResource2, ", thirtyDayValueDisplay=", textResource3, ", state=");
        AbstractC11266d.m30444B(sb4, str, ", icon=", str2, ", style=");
        return AbstractC25012a.m73376i(str3, ")", sb4);
    }

    public /* synthetic */ KeyStatisticModel(int i13, TrendKey trendKey, TextResource textResource, TextResource textResource2, TextResource textResource3, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.trendKey = (i13 & 1) == 0 ? TrendKey.NONE : trendKey;
        if ((i13 & 2) == 0) {
            this.title = AbstractC8693b.m21267a();
        } else {
            this.title = textResource;
        }
        if ((i13 & 4) == 0) {
            this.currentValueDisplay = AbstractC8693b.m21267a();
        } else {
            this.currentValueDisplay = textResource2;
        }
        if ((i13 & 8) == 0) {
            this.thirtyDayValueDisplay = AbstractC8693b.m21267a();
        } else {
            this.thirtyDayValueDisplay = textResource3;
        }
        if ((i13 & 16) == 0) {
            this.state = "";
        } else {
            this.state = str;
        }
        if ((i13 & 32) == 0) {
            this.icon = "";
        } else {
            this.icon = str2;
        }
        if ((i13 & 64) == 0) {
            this.style = "DEFAULT";
        } else {
            this.style = str3;
        }
    }

    public KeyStatisticModel(TrendKey trendKey, TextResource title, TextResource currentValueDisplay, TextResource thirtyDayValueDisplay, String state, String icon, String style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(currentValueDisplay, "currentValueDisplay");
        AbstractC22676k.m65750j(thirtyDayValueDisplay, "thirtyDayValueDisplay");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(style, "style");
        this.trendKey = trendKey;
        this.title = title;
        this.currentValueDisplay = currentValueDisplay;
        this.thirtyDayValueDisplay = thirtyDayValueDisplay;
        this.state = state;
        this.icon = icon;
        this.style = style;
    }

    public /* synthetic */ KeyStatisticModel(TrendKey trendKey, TextResource textResource, TextResource textResource2, TextResource textResource3, String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? TrendKey.NONE : trendKey, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? "" : str2, (i13 & 64) != 0 ? "DEFAULT" : str3);
    }
}
