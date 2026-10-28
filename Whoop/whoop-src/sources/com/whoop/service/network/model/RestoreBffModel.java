package com.whoop.service.network.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jx2.C22038b;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jf\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010#R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010 R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010 R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b=\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010*¨\u0006B"}, m65681d2 = {"Lcom/whoop/service/network/model/RestoreBffModel;", "", "", "header", "subHeader", "Lcom/whoop/service/network/model/ReplacementStatus;", "replacementStatus", "tag", "subtitle", "", "Lcom/whoop/service/network/model/RestorePerk;", "perks", "disclaimer", "Lcom/whoop/service/network/model/RestoreCta;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/service/network/model/RestoreBffModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/service/network/model/ReplacementStatus;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "()Lcom/whoop/service/network/model/RestoreCta;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/ReplacementStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/service/network/model/RestoreCta;)Lcom/whoop/service/network/model/RestoreBffModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getSubHeader", "Lcom/whoop/service/network/model/ReplacementStatus;", "getReplacementStatus", "getTag", "getSubtitle", "Ljava/util/List;", "getPerks", "getDisclaimer", "Lcom/whoop/service/network/model/RestoreCta;", "getCta", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RestoreBffModel {
    private static final InterfaceC23462h[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("cta")
    private final RestoreCta cta;

    @SerializedName("disclaimer")
    private final String disclaimer;

    @SerializedName("header")
    private final String header;

    @SerializedName("perks")
    private final List<RestorePerk> perks;

    @SerializedName("replacement_status")
    private final ReplacementStatus replacementStatus;

    @SerializedName("sub_header")
    private final String subHeader;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("tag")
    private final String tag;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/RestoreBffModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/service/network/model/RestoreBffModel;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RestoreBffModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C22038b(18)), null, null, AbstractC30060g.m92087G(enumC23463i, new C22038b(19)), null, null};
    }

    public /* synthetic */ RestoreBffModel(int i13, String str, String str2, ReplacementStatus replacementStatus, String str3, String str4, List list, String str5, RestoreCta restoreCta, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, RestoreBffModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = str;
        this.subHeader = str2;
        this.replacementStatus = replacementStatus;
        this.tag = str3;
        this.subtitle = str4;
        this.perks = list;
        this.disclaimer = str5;
        this.cta = restoreCta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ReplacementStatus.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(RestorePerk$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RestoreBffModel copy$default(RestoreBffModel restoreBffModel, String str, String str2, ReplacementStatus replacementStatus, String str3, String str4, List list, String str5, RestoreCta restoreCta, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = restoreBffModel.header;
        }
        if ((i13 & 2) != 0) {
            str2 = restoreBffModel.subHeader;
        }
        if ((i13 & 4) != 0) {
            replacementStatus = restoreBffModel.replacementStatus;
        }
        if ((i13 & 8) != 0) {
            str3 = restoreBffModel.tag;
        }
        if ((i13 & 16) != 0) {
            str4 = restoreBffModel.subtitle;
        }
        if ((i13 & 32) != 0) {
            list = restoreBffModel.perks;
        }
        if ((i13 & 64) != 0) {
            str5 = restoreBffModel.disclaimer;
        }
        if ((i13 & 128) != 0) {
            restoreCta = restoreBffModel.cta;
        }
        String str6 = str5;
        RestoreCta restoreCta2 = restoreCta;
        String str7 = str4;
        List list2 = list;
        return restoreBffModel.copy(str, str2, replacementStatus, str3, str7, list2, str6, restoreCta2);
    }

    public static final /* synthetic */ void write$Self$core_release(RestoreBffModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.header);
        output.encodeStringElement(serialDesc, 1, self.subHeader);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.replacementStatus);
        output.encodeStringElement(serialDesc, 3, self.tag);
        output.encodeStringElement(serialDesc, 4, self.subtitle);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.perks);
        output.encodeStringElement(serialDesc, 6, self.disclaimer);
        output.encodeSerializableElement(serialDesc, 7, RestoreCta$$serializer.INSTANCE, self.cta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubHeader() {
        return this.subHeader;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ReplacementStatus getReplacementStatus() {
        return this.replacementStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<RestorePerk> component6() {
        return this.perks;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final RestoreCta getCta() {
        return this.cta;
    }

    public final RestoreBffModel copy(String header, String subHeader, ReplacementStatus replacementStatus, String tag, String subtitle, List<RestorePerk> perks, String disclaimer, RestoreCta cta) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(subHeader, "subHeader");
        AbstractC22676k.m65750j(replacementStatus, "replacementStatus");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(perks, "perks");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(cta, "cta");
        return new RestoreBffModel(header, subHeader, replacementStatus, tag, subtitle, perks, disclaimer, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestoreBffModel)) {
            return false;
        }
        RestoreBffModel restoreBffModel = (RestoreBffModel) other;
        return AbstractC22676k.m65745e(this.header, restoreBffModel.header) && AbstractC22676k.m65745e(this.subHeader, restoreBffModel.subHeader) && this.replacementStatus == restoreBffModel.replacementStatus && AbstractC22676k.m65745e(this.tag, restoreBffModel.tag) && AbstractC22676k.m65745e(this.subtitle, restoreBffModel.subtitle) && AbstractC22676k.m65745e(this.perks, restoreBffModel.perks) && AbstractC22676k.m65745e(this.disclaimer, restoreBffModel.disclaimer) && AbstractC22676k.m65745e(this.cta, restoreBffModel.cta);
    }

    public final RestoreCta getCta() {
        return this.cta;
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getHeader() {
        return this.header;
    }

    public final List<RestorePerk> getPerks() {
        return this.perks;
    }

    public final ReplacementStatus getReplacementStatus() {
        return this.replacementStatus;
    }

    public final String getSubHeader() {
        return this.subHeader;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return this.cta.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.replacementStatus.hashCode() + AbstractC11266d.m30450d(this.header.hashCode() * 31, 31, this.subHeader)) * 31, 31, this.tag), 31, this.subtitle), 31, this.perks), 31, this.disclaimer);
    }

    public String toString() {
        String str = this.header;
        String str2 = this.subHeader;
        ReplacementStatus replacementStatus = this.replacementStatus;
        String str3 = this.tag;
        String str4 = this.subtitle;
        List<RestorePerk> list = this.perks;
        String str5 = this.disclaimer;
        RestoreCta restoreCta = this.cta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RestoreBffModel(header=", str, ", subHeader=", str2, ", replacementStatus=");
        sbM32001t.append(replacementStatus);
        sbM32001t.append(", tag=");
        sbM32001t.append(str3);
        sbM32001t.append(", subtitle=");
        AbstractC36095b.m114694v(str4, ", perks=", ", disclaimer=", sbM32001t, list);
        sbM32001t.append(str5);
        sbM32001t.append(", cta=");
        sbM32001t.append(restoreCta);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public RestoreBffModel(String header, String subHeader, ReplacementStatus replacementStatus, String tag, String subtitle, List<RestorePerk> perks, String disclaimer, RestoreCta cta) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(subHeader, "subHeader");
        AbstractC22676k.m65750j(replacementStatus, "replacementStatus");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(perks, "perks");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        AbstractC22676k.m65750j(cta, "cta");
        this.header = header;
        this.subHeader = subHeader;
        this.replacementStatus = replacementStatus;
        this.tag = tag;
        this.subtitle = subtitle;
        this.perks = perks;
        this.disclaimer = disclaimer;
        this.cta = cta;
    }
}
