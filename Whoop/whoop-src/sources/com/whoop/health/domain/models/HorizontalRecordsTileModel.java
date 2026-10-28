package com.whoop.health.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import sh2.C32513d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBe\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+Jn\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010+¨\u0006E"}, m65681d2 = {"Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "cardName", "title", "endIcon", "Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;", "bodyContent", "Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;", "tag", "Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;", "footer", "cta", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;", "component5", "()Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;", "component6", "()Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;", "component7", "component8", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardName", "getTitle", "getEndIcon", "Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;", "getBodyContent", "Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;", "getTag", "Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;", "getFooter", "getCta", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HorizontalRecordsTileModel implements DesignSystemModel {
    private final HorizontalRecordsTileBodyContentModel bodyContent;
    private final String cardName;
    private final String cta;
    private final C9598e destination;
    private final String endIcon;
    private final HorizontalRecordsTileFooterModel footer;
    private final HorizontalRecordsTileTagModel tag;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32513d(8))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/HorizontalRecordsTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HorizontalRecordsTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HorizontalRecordsTileModel() {
        this((String) null, (String) null, (String) null, (HorizontalRecordsTileBodyContentModel) null, (HorizontalRecordsTileTagModel) null, (HorizontalRecordsTileFooterModel) null, (String) null, (C9598e) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ HorizontalRecordsTileModel copy$default(HorizontalRecordsTileModel horizontalRecordsTileModel, String str, String str2, String str3, HorizontalRecordsTileBodyContentModel horizontalRecordsTileBodyContentModel, HorizontalRecordsTileTagModel horizontalRecordsTileTagModel, HorizontalRecordsTileFooterModel horizontalRecordsTileFooterModel, String str4, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = horizontalRecordsTileModel.cardName;
        }
        if ((i13 & 2) != 0) {
            str2 = horizontalRecordsTileModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = horizontalRecordsTileModel.endIcon;
        }
        if ((i13 & 8) != 0) {
            horizontalRecordsTileBodyContentModel = horizontalRecordsTileModel.bodyContent;
        }
        if ((i13 & 16) != 0) {
            horizontalRecordsTileTagModel = horizontalRecordsTileModel.tag;
        }
        if ((i13 & 32) != 0) {
            horizontalRecordsTileFooterModel = horizontalRecordsTileModel.footer;
        }
        if ((i13 & 64) != 0) {
            str4 = horizontalRecordsTileModel.cta;
        }
        if ((i13 & 128) != 0) {
            c9598e = horizontalRecordsTileModel.destination;
        }
        String str5 = str4;
        C9598e c9598e2 = c9598e;
        HorizontalRecordsTileTagModel horizontalRecordsTileTagModel2 = horizontalRecordsTileTagModel;
        HorizontalRecordsTileFooterModel horizontalRecordsTileFooterModel2 = horizontalRecordsTileFooterModel;
        return horizontalRecordsTileModel.copy(str, str2, str3, horizontalRecordsTileBodyContentModel, horizontalRecordsTileTagModel2, horizontalRecordsTileFooterModel2, str5, c9598e2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    public static final /* synthetic */ void write$Self$health_release(HorizontalRecordsTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.cardName != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.cardName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.endIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.endIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3)) {
            output.encodeSerializableElement(serialDesc, 3, HorizontalRecordsTileBodyContentModel$$serializer.INSTANCE, self.bodyContent);
        } else {
            if (!AbstractC22676k.m65745e(self.bodyContent, new HorizontalRecordsTileBodyContentModel((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 3, HorizontalRecordsTileBodyContentModel$$serializer.INSTANCE, self.bodyContent);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.tag != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, HorizontalRecordsTileTagModel$$serializer.INSTANCE, self.tag);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.footer != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, HorizontalRecordsTileFooterModel$$serializer.INSTANCE, self.footer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.cta != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.cta);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HorizontalRecordsTileBodyContentModel getBodyContent() {
        return this.bodyContent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HorizontalRecordsTileTagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HorizontalRecordsTileFooterModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final HorizontalRecordsTileModel copy(String cardName, String title, String endIcon, HorizontalRecordsTileBodyContentModel bodyContent, HorizontalRecordsTileTagModel tag, HorizontalRecordsTileFooterModel footer, String cta, C9598e destination) {
        AbstractC22676k.m65750j(bodyContent, "bodyContent");
        return new HorizontalRecordsTileModel(cardName, title, endIcon, bodyContent, tag, footer, cta, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalRecordsTileModel)) {
            return false;
        }
        HorizontalRecordsTileModel horizontalRecordsTileModel = (HorizontalRecordsTileModel) other;
        return AbstractC22676k.m65745e(this.cardName, horizontalRecordsTileModel.cardName) && AbstractC22676k.m65745e(this.title, horizontalRecordsTileModel.title) && AbstractC22676k.m65745e(this.endIcon, horizontalRecordsTileModel.endIcon) && AbstractC22676k.m65745e(this.bodyContent, horizontalRecordsTileModel.bodyContent) && AbstractC22676k.m65745e(this.tag, horizontalRecordsTileModel.tag) && AbstractC22676k.m65745e(this.footer, horizontalRecordsTileModel.footer) && AbstractC22676k.m65745e(this.cta, horizontalRecordsTileModel.cta) && AbstractC22676k.m65745e(this.destination, horizontalRecordsTileModel.destination);
    }

    public final HorizontalRecordsTileBodyContentModel getBodyContent() {
        return this.bodyContent;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final String getCta() {
        return this.cta;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final HorizontalRecordsTileFooterModel getFooter() {
        return this.footer;
    }

    public final HorizontalRecordsTileTagModel getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.cardName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.endIcon;
        int iHashCode3 = (this.bodyContent.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        HorizontalRecordsTileTagModel horizontalRecordsTileTagModel = this.tag;
        int iHashCode4 = (iHashCode3 + (horizontalRecordsTileTagModel == null ? 0 : horizontalRecordsTileTagModel.hashCode())) * 31;
        HorizontalRecordsTileFooterModel horizontalRecordsTileFooterModel = this.footer;
        int iHashCode5 = (iHashCode4 + (horizontalRecordsTileFooterModel == null ? 0 : horizontalRecordsTileFooterModel.hashCode())) * 31;
        String str4 = this.cta;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode6 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.cardName;
        String str2 = this.title;
        String str3 = this.endIcon;
        HorizontalRecordsTileBodyContentModel horizontalRecordsTileBodyContentModel = this.bodyContent;
        HorizontalRecordsTileTagModel horizontalRecordsTileTagModel = this.tag;
        HorizontalRecordsTileFooterModel horizontalRecordsTileFooterModel = this.footer;
        String str4 = this.cta;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HorizontalRecordsTileModel(cardName=", str, ", title=", str2, ", endIcon=");
        sbM32001t.append(str3);
        sbM32001t.append(", bodyContent=");
        sbM32001t.append(horizontalRecordsTileBodyContentModel);
        sbM32001t.append(", tag=");
        sbM32001t.append(horizontalRecordsTileTagModel);
        sbM32001t.append(", footer=");
        sbM32001t.append(horizontalRecordsTileFooterModel);
        sbM32001t.append(", cta=");
        return AbstractC13673n.m38563j(sbM32001t, str4, ", destination=", c9598e, ")");
    }

    public /* synthetic */ HorizontalRecordsTileModel(int i13, String str, String str2, String str3, HorizontalRecordsTileBodyContentModel horizontalRecordsTileBodyContentModel, HorizontalRecordsTileTagModel horizontalRecordsTileTagModel, HorizontalRecordsTileFooterModel horizontalRecordsTileFooterModel, String str4, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.cardName = null;
        } else {
            this.cardName = str;
        }
        if ((i13 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.endIcon = null;
        } else {
            this.endIcon = str3;
        }
        if ((i13 & 8) == 0) {
            this.bodyContent = new HorizontalRecordsTileBodyContentModel((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        } else {
            this.bodyContent = horizontalRecordsTileBodyContentModel;
        }
        if ((i13 & 16) == 0) {
            this.tag = null;
        } else {
            this.tag = horizontalRecordsTileTagModel;
        }
        if ((i13 & 32) == 0) {
            this.footer = null;
        } else {
            this.footer = horizontalRecordsTileFooterModel;
        }
        if ((i13 & 64) == 0) {
            this.cta = null;
        } else {
            this.cta = str4;
        }
        if ((i13 & 128) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    public HorizontalRecordsTileModel(String str, String str2, String str3, HorizontalRecordsTileBodyContentModel bodyContent, HorizontalRecordsTileTagModel horizontalRecordsTileTagModel, HorizontalRecordsTileFooterModel horizontalRecordsTileFooterModel, String str4, C9598e c9598e) {
        AbstractC22676k.m65750j(bodyContent, "bodyContent");
        this.cardName = str;
        this.title = str2;
        this.endIcon = str3;
        this.bodyContent = bodyContent;
        this.tag = horizontalRecordsTileTagModel;
        this.footer = horizontalRecordsTileFooterModel;
        this.cta = str4;
        this.destination = c9598e;
    }

    public /* synthetic */ HorizontalRecordsTileModel(String str, String str2, String str3, HorizontalRecordsTileBodyContentModel horizontalRecordsTileBodyContentModel, HorizontalRecordsTileTagModel horizontalRecordsTileTagModel, HorizontalRecordsTileFooterModel horizontalRecordsTileFooterModel, String str4, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? new HorizontalRecordsTileBodyContentModel((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : horizontalRecordsTileBodyContentModel, (i13 & 16) != 0 ? null : horizontalRecordsTileTagModel, (i13 & 32) != 0 ? null : horizontalRecordsTileFooterModel, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : c9598e);
    }
}
