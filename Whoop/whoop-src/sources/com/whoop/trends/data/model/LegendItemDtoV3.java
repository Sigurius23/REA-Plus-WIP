package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import vl2.EnumC36124q;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wi0.C37312d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/trends/data/model/LegendItemDtoV3;", "", "Lvl2/q;", "style", "", "text", "<init>", "(Lvl2/q;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILvl2/q;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/LegendItemDtoV3;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lvl2/q;", "component2", "()Ljava/lang/String;", "copy", "(Lvl2/q;Ljava/lang/String;)Lcom/whoop/trends/data/model/LegendItemDtoV3;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvl2/q;", "getStyle", "getStyle$annotations", "()V", "Ljava/lang/String;", "getText", "getText$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LegendItemDtoV3 {
    public static final int $stable = 0;

    @SerializedName("graph_legend_style")
    private final EnumC36124q style;

    @SerializedName("legend_text")
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37312d(19)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/LegendItemDtoV3$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/LegendItemDtoV3;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LegendItemDtoV3$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LegendItemDtoV3(int i13, EnumC36124q enumC36124q, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, LegendItemDtoV3$$serializer.INSTANCE.getDescriptor());
        }
        this.style = enumC36124q;
        this.text = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.trends.data.domain.TrendSegmentStyle", EnumC36124q.values());
    }

    public static /* synthetic */ LegendItemDtoV3 copy$default(LegendItemDtoV3 legendItemDtoV3, EnumC36124q enumC36124q, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC36124q = legendItemDtoV3.style;
        }
        if ((i13 & 2) != 0) {
            str = legendItemDtoV3.text;
        }
        return legendItemDtoV3.copy(enumC36124q, str);
    }

    @InterfaceC37143h("graph_legend_style")
    public static /* synthetic */ void getStyle$annotations() {
    }

    @InterfaceC37143h("legend_text")
    public static /* synthetic */ void getText$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(LegendItemDtoV3 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.style);
        output.encodeStringElement(serialDesc, 1, self.text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC36124q getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final LegendItemDtoV3 copy(EnumC36124q style, String text) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(text, "text");
        return new LegendItemDtoV3(style, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegendItemDtoV3)) {
            return false;
        }
        LegendItemDtoV3 legendItemDtoV3 = (LegendItemDtoV3) other;
        return this.style == legendItemDtoV3.style && AbstractC22676k.m65745e(this.text, legendItemDtoV3.text);
    }

    public final EnumC36124q getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.style.hashCode() * 31);
    }

    public String toString() {
        return "LegendItemDtoV3(style=" + this.style + ", text=" + this.text + ")";
    }

    public LegendItemDtoV3(EnumC36124q style, String text) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(text, "text");
        this.style = style;
        this.text = text;
    }
}
