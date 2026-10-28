package com.whoop.access.measurementprogress.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\\\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b9\u0010#R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b:\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'¨\u0006@"}, m65681d2 = {"Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "icon", "title", "Lcom/whoop/design/models/items/ImpactModel;", "tag", "Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;", "start", "latest", "target", "Lcom/whoop/design/models/InfoCalloutTileModel;", "callout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$access_release", "(Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/ImpactModel;", "component4", "()Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;", "component5", "component6", "component7", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "Lcom/whoop/design/models/items/ImpactModel;", "getTag", "Lcom/whoop/access/measurementprogress/models/MeasurementReadingModel;", "getStart", "getLatest", "getTarget", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getCallout", "Companion", "$serializer", "a", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MeasurementProgressModel implements DesignSystemModel {
    private final InfoCalloutTileModel callout;
    private final String icon;
    private final MeasurementReadingModel latest;
    private final MeasurementReadingModel start;
    private final ImpactModel tag;
    private final MeasurementReadingModel target;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = InfoCalloutTileModel.$stable | ImpactModel.$stable;

    /* JADX INFO: renamed from: com.whoop.access.measurementprogress.models.MeasurementProgressModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/access/measurementprogress/models/MeasurementProgressModel;", "serializer", "()Lwc3/c;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MeasurementProgressModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MeasurementProgressModel(int i13, String str, String str2, ImpactModel impactModel, MeasurementReadingModel measurementReadingModel, MeasurementReadingModel measurementReadingModel2, MeasurementReadingModel measurementReadingModel3, InfoCalloutTileModel infoCalloutTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, MeasurementProgressModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.title = str2;
        this.tag = impactModel;
        this.start = measurementReadingModel;
        this.latest = measurementReadingModel2;
        this.target = measurementReadingModel3;
        this.callout = infoCalloutTileModel;
    }

    public static /* synthetic */ MeasurementProgressModel copy$default(MeasurementProgressModel measurementProgressModel, String str, String str2, ImpactModel impactModel, MeasurementReadingModel measurementReadingModel, MeasurementReadingModel measurementReadingModel2, MeasurementReadingModel measurementReadingModel3, InfoCalloutTileModel infoCalloutTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = measurementProgressModel.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = measurementProgressModel.title;
        }
        if ((i13 & 4) != 0) {
            impactModel = measurementProgressModel.tag;
        }
        if ((i13 & 8) != 0) {
            measurementReadingModel = measurementProgressModel.start;
        }
        if ((i13 & 16) != 0) {
            measurementReadingModel2 = measurementProgressModel.latest;
        }
        if ((i13 & 32) != 0) {
            measurementReadingModel3 = measurementProgressModel.target;
        }
        if ((i13 & 64) != 0) {
            infoCalloutTileModel = measurementProgressModel.callout;
        }
        MeasurementReadingModel measurementReadingModel4 = measurementReadingModel3;
        InfoCalloutTileModel infoCalloutTileModel2 = infoCalloutTileModel;
        MeasurementReadingModel measurementReadingModel5 = measurementReadingModel2;
        ImpactModel impactModel2 = impactModel;
        return measurementProgressModel.copy(str, str2, impactModel2, measurementReadingModel, measurementReadingModel5, measurementReadingModel4, infoCalloutTileModel2);
    }

    public static final /* synthetic */ void write$Self$access_release(MeasurementProgressModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.icon);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, ImpactModel$$serializer.INSTANCE, self.tag);
        MeasurementReadingModel$$serializer measurementReadingModel$$serializer = MeasurementReadingModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, measurementReadingModel$$serializer, self.start);
        output.encodeSerializableElement(serialDesc, 4, measurementReadingModel$$serializer, self.latest);
        output.encodeSerializableElement(serialDesc, 5, measurementReadingModel$$serializer, self.target);
        output.encodeNullableSerializableElement(serialDesc, 6, InfoCalloutTileModel$$serializer.INSTANCE, self.callout);
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
    public final ImpactModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MeasurementReadingModel getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MeasurementReadingModel getLatest() {
        return this.latest;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MeasurementReadingModel getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final MeasurementProgressModel copy(String icon, String title, ImpactModel tag, MeasurementReadingModel start, MeasurementReadingModel latest, MeasurementReadingModel target, InfoCalloutTileModel callout) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(start, "start");
        AbstractC22676k.m65750j(latest, "latest");
        AbstractC22676k.m65750j(target, "target");
        return new MeasurementProgressModel(icon, title, tag, start, latest, target, callout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasurementProgressModel)) {
            return false;
        }
        MeasurementProgressModel measurementProgressModel = (MeasurementProgressModel) other;
        return AbstractC22676k.m65745e(this.icon, measurementProgressModel.icon) && AbstractC22676k.m65745e(this.title, measurementProgressModel.title) && AbstractC22676k.m65745e(this.tag, measurementProgressModel.tag) && AbstractC22676k.m65745e(this.start, measurementProgressModel.start) && AbstractC22676k.m65745e(this.latest, measurementProgressModel.latest) && AbstractC22676k.m65745e(this.target, measurementProgressModel.target) && AbstractC22676k.m65745e(this.callout, measurementProgressModel.callout);
    }

    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final MeasurementReadingModel getLatest() {
        return this.latest;
    }

    public final MeasurementReadingModel getStart() {
        return this.start;
    }

    public final ImpactModel getTag() {
        return this.tag;
    }

    public final MeasurementReadingModel getTarget() {
        return this.target;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.icon;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        ImpactModel impactModel = this.tag;
        int iHashCode = (this.target.hashCode() + ((this.latest.hashCode() + ((this.start.hashCode() + ((iM30450d + (impactModel == null ? 0 : impactModel.hashCode())) * 31)) * 31)) * 31)) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        return iHashCode + (infoCalloutTileModel != null ? infoCalloutTileModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        ImpactModel impactModel = this.tag;
        MeasurementReadingModel measurementReadingModel = this.start;
        MeasurementReadingModel measurementReadingModel2 = this.latest;
        MeasurementReadingModel measurementReadingModel3 = this.target;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MeasurementProgressModel(icon=", str, ", title=", str2, ", tag=");
        sbM32001t.append(impactModel);
        sbM32001t.append(", start=");
        sbM32001t.append(measurementReadingModel);
        sbM32001t.append(", latest=");
        sbM32001t.append(measurementReadingModel2);
        sbM32001t.append(", target=");
        sbM32001t.append(measurementReadingModel3);
        sbM32001t.append(", callout=");
        sbM32001t.append(infoCalloutTileModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MeasurementProgressModel(String str, String title, ImpactModel impactModel, MeasurementReadingModel start, MeasurementReadingModel latest, MeasurementReadingModel target, InfoCalloutTileModel infoCalloutTileModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(start, "start");
        AbstractC22676k.m65750j(latest, "latest");
        AbstractC22676k.m65750j(target, "target");
        this.icon = str;
        this.title = title;
        this.tag = impactModel;
        this.start = start;
        this.latest = latest;
        this.target = target;
        this.callout = infoCalloutTileModel;
    }
}
