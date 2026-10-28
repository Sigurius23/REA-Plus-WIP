package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wl2.C37358a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001b¨\u00060"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;", "", "", "title", "subtitle", "Lgz0/m0;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lgz0/m0;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;)Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Lgz0/m0;", "getIcon", "getIcon$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SegmentalAnalysisHeaderModel {
    public static final int $stable = 0;

    @SerializedName("icon")
    private final EnumC16313m0 icon;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37358a(3))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SegmentalAnalysisHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SegmentalAnalysisHeaderModel(int i13, String str, String str2, EnumC16313m0 enumC16313m0, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, SegmentalAnalysisHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.icon = enumC16313m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ SegmentalAnalysisHeaderModel copy$default(SegmentalAnalysisHeaderModel segmentalAnalysisHeaderModel, String str, String str2, EnumC16313m0 enumC16313m0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = segmentalAnalysisHeaderModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = segmentalAnalysisHeaderModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = segmentalAnalysisHeaderModel.icon;
        }
        return segmentalAnalysisHeaderModel.copy(str, str2, enumC16313m0);
    }

    @InterfaceC37143h("icon")
    public static /* synthetic */ void getIcon$annotations() {
    }

    @InterfaceC37143h("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(SegmentalAnalysisHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.icon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final SegmentalAnalysisHeaderModel copy(String title, String subtitle, EnumC16313m0 icon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        return new SegmentalAnalysisHeaderModel(title, subtitle, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentalAnalysisHeaderModel)) {
            return false;
        }
        SegmentalAnalysisHeaderModel segmentalAnalysisHeaderModel = (SegmentalAnalysisHeaderModel) other;
        return AbstractC22676k.m65745e(this.title, segmentalAnalysisHeaderModel.title) && AbstractC22676k.m65745e(this.subtitle, segmentalAnalysisHeaderModel.subtitle) && this.icon == segmentalAnalysisHeaderModel.icon;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return this.icon.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SegmentalAnalysisHeaderModel(title=", str, ", subtitle=", str2, ", icon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SegmentalAnalysisHeaderModel(String title, String str, EnumC16313m0 icon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        this.title = title;
        this.subtitle = str;
        this.icon = icon;
    }
}
