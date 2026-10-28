package com.whoop.impacts.details.domain.requests;

import com.whoop.design.models.items.ImpactStyle;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jp1.C21864p;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JX\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'¨\u0006>"}, m65681d2 = {"Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;", "", "Lcom/whoop/design/util/TextResource;", "detailsTitleDisplay", "detailsSubtitleDisplay", "detailsTagLabelDisplay", "Lcom/whoop/design/models/items/ImpactStyle;", "detailsImpactStyle", "detailsImpactValueDisplay", "", "detailsImageDisplay", "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;", "subHeader", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$behavior_impact_release", "(Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/ImpactStyle;", "component5", "component6", "()Ljava/lang/String;", "component7", "()Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactStyle;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;)Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getDetailsTitleDisplay", "getDetailsSubtitleDisplay", "getDetailsTagLabelDisplay", "Lcom/whoop/design/models/items/ImpactStyle;", "getDetailsImpactStyle", "getDetailsImpactValueDisplay", "Ljava/lang/String;", "getDetailsImageDisplay", "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsSubHeader;", "getSubHeader", "Companion", "$serializer", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorDetailsHeader {
    private final String detailsImageDisplay;
    private final ImpactStyle detailsImpactStyle;
    private final TextResource detailsImpactValueDisplay;
    private final TextResource detailsSubtitleDisplay;
    private final TextResource detailsTagLabelDisplay;
    private final TextResource detailsTitleDisplay;
    private final BehaviorDetailsSubHeader subHeader;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21864p(7)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsHeader;", "serializer", "()Lwc3/c;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorDetailsHeader$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BehaviorDetailsHeader(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, ImpactStyle impactStyle, TextResource textResource4, String str, BehaviorDetailsSubHeader behaviorDetailsSubHeader, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, BehaviorDetailsHeader$$serializer.INSTANCE.getDescriptor());
        }
        this.detailsTitleDisplay = textResource;
        this.detailsSubtitleDisplay = textResource2;
        this.detailsTagLabelDisplay = textResource3;
        this.detailsImpactStyle = impactStyle;
        this.detailsImpactValueDisplay = textResource4;
        this.detailsImageDisplay = str;
        this.subHeader = behaviorDetailsSubHeader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ImpactStyle", ImpactStyle.values());
    }

    public static /* synthetic */ BehaviorDetailsHeader copy$default(BehaviorDetailsHeader behaviorDetailsHeader, TextResource textResource, TextResource textResource2, TextResource textResource3, ImpactStyle impactStyle, TextResource textResource4, String str, BehaviorDetailsSubHeader behaviorDetailsSubHeader, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = behaviorDetailsHeader.detailsTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            textResource2 = behaviorDetailsHeader.detailsSubtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            textResource3 = behaviorDetailsHeader.detailsTagLabelDisplay;
        }
        if ((i13 & 8) != 0) {
            impactStyle = behaviorDetailsHeader.detailsImpactStyle;
        }
        if ((i13 & 16) != 0) {
            textResource4 = behaviorDetailsHeader.detailsImpactValueDisplay;
        }
        if ((i13 & 32) != 0) {
            str = behaviorDetailsHeader.detailsImageDisplay;
        }
        if ((i13 & 64) != 0) {
            behaviorDetailsSubHeader = behaviorDetailsHeader.subHeader;
        }
        String str2 = str;
        BehaviorDetailsSubHeader behaviorDetailsSubHeader2 = behaviorDetailsSubHeader;
        TextResource textResource5 = textResource4;
        TextResource textResource6 = textResource3;
        return behaviorDetailsHeader.copy(textResource, textResource2, textResource6, impactStyle, textResource5, str2, behaviorDetailsSubHeader2);
    }

    public static final /* synthetic */ void write$Self$behavior_impact_release(BehaviorDetailsHeader self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.detailsTitleDisplay);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.detailsSubtitleDisplay);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.detailsTagLabelDisplay);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.detailsImpactStyle);
        output.encodeSerializableElement(serialDesc, 4, c25452a, self.detailsImpactValueDisplay);
        output.encodeStringElement(serialDesc, 5, self.detailsImageDisplay);
        output.encodeNullableSerializableElement(serialDesc, 6, BehaviorDetailsSubHeader$$serializer.INSTANCE, self.subHeader);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getDetailsTitleDisplay() {
        return this.detailsTitleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getDetailsSubtitleDisplay() {
        return this.detailsSubtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getDetailsTagLabelDisplay() {
        return this.detailsTagLabelDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImpactStyle getDetailsImpactStyle() {
        return this.detailsImpactStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getDetailsImpactValueDisplay() {
        return this.detailsImpactValueDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDetailsImageDisplay() {
        return this.detailsImageDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BehaviorDetailsSubHeader getSubHeader() {
        return this.subHeader;
    }

    public final BehaviorDetailsHeader copy(TextResource detailsTitleDisplay, TextResource detailsSubtitleDisplay, TextResource detailsTagLabelDisplay, ImpactStyle detailsImpactStyle, TextResource detailsImpactValueDisplay, String detailsImageDisplay, BehaviorDetailsSubHeader subHeader) {
        AbstractC22676k.m65750j(detailsTitleDisplay, "detailsTitleDisplay");
        AbstractC22676k.m65750j(detailsSubtitleDisplay, "detailsSubtitleDisplay");
        AbstractC22676k.m65750j(detailsTagLabelDisplay, "detailsTagLabelDisplay");
        AbstractC22676k.m65750j(detailsImpactStyle, "detailsImpactStyle");
        AbstractC22676k.m65750j(detailsImpactValueDisplay, "detailsImpactValueDisplay");
        AbstractC22676k.m65750j(detailsImageDisplay, "detailsImageDisplay");
        return new BehaviorDetailsHeader(detailsTitleDisplay, detailsSubtitleDisplay, detailsTagLabelDisplay, detailsImpactStyle, detailsImpactValueDisplay, detailsImageDisplay, subHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorDetailsHeader)) {
            return false;
        }
        BehaviorDetailsHeader behaviorDetailsHeader = (BehaviorDetailsHeader) other;
        return AbstractC22676k.m65745e(this.detailsTitleDisplay, behaviorDetailsHeader.detailsTitleDisplay) && AbstractC22676k.m65745e(this.detailsSubtitleDisplay, behaviorDetailsHeader.detailsSubtitleDisplay) && AbstractC22676k.m65745e(this.detailsTagLabelDisplay, behaviorDetailsHeader.detailsTagLabelDisplay) && this.detailsImpactStyle == behaviorDetailsHeader.detailsImpactStyle && AbstractC22676k.m65745e(this.detailsImpactValueDisplay, behaviorDetailsHeader.detailsImpactValueDisplay) && AbstractC22676k.m65745e(this.detailsImageDisplay, behaviorDetailsHeader.detailsImageDisplay) && AbstractC22676k.m65745e(this.subHeader, behaviorDetailsHeader.subHeader);
    }

    public final String getDetailsImageDisplay() {
        return this.detailsImageDisplay;
    }

    public final ImpactStyle getDetailsImpactStyle() {
        return this.detailsImpactStyle;
    }

    public final TextResource getDetailsImpactValueDisplay() {
        return this.detailsImpactValueDisplay;
    }

    public final TextResource getDetailsSubtitleDisplay() {
        return this.detailsSubtitleDisplay;
    }

    public final TextResource getDetailsTagLabelDisplay() {
        return this.detailsTagLabelDisplay;
    }

    public final TextResource getDetailsTitleDisplay() {
        return this.detailsTitleDisplay;
    }

    public final BehaviorDetailsSubHeader getSubHeader() {
        return this.subHeader;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC31061c.m95625a((this.detailsImpactStyle.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.detailsTitleDisplay.hashCode() * 31, this.detailsSubtitleDisplay, 31), this.detailsTagLabelDisplay, 31)) * 31, this.detailsImpactValueDisplay, 31), 31, this.detailsImageDisplay);
        BehaviorDetailsSubHeader behaviorDetailsSubHeader = this.subHeader;
        return iM30450d + (behaviorDetailsSubHeader == null ? 0 : behaviorDetailsSubHeader.hashCode());
    }

    public String toString() {
        TextResource textResource = this.detailsTitleDisplay;
        TextResource textResource2 = this.detailsSubtitleDisplay;
        TextResource textResource3 = this.detailsTagLabelDisplay;
        ImpactStyle impactStyle = this.detailsImpactStyle;
        TextResource textResource4 = this.detailsImpactValueDisplay;
        String str = this.detailsImageDisplay;
        BehaviorDetailsSubHeader behaviorDetailsSubHeader = this.subHeader;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("BehaviorDetailsHeader(detailsTitleDisplay=", textResource, ", detailsSubtitleDisplay=", textResource2, ", detailsTagLabelDisplay=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", detailsImpactStyle=");
        sbM106658q.append(impactStyle);
        sbM106658q.append(", detailsImpactValueDisplay=");
        AbstractC30007c.m91856z(sbM106658q, textResource4, ", detailsImageDisplay=", str, ", subHeader=");
        sbM106658q.append(behaviorDetailsSubHeader);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public BehaviorDetailsHeader(TextResource detailsTitleDisplay, TextResource detailsSubtitleDisplay, TextResource detailsTagLabelDisplay, ImpactStyle detailsImpactStyle, TextResource detailsImpactValueDisplay, String detailsImageDisplay, BehaviorDetailsSubHeader behaviorDetailsSubHeader) {
        AbstractC22676k.m65750j(detailsTitleDisplay, "detailsTitleDisplay");
        AbstractC22676k.m65750j(detailsSubtitleDisplay, "detailsSubtitleDisplay");
        AbstractC22676k.m65750j(detailsTagLabelDisplay, "detailsTagLabelDisplay");
        AbstractC22676k.m65750j(detailsImpactStyle, "detailsImpactStyle");
        AbstractC22676k.m65750j(detailsImpactValueDisplay, "detailsImpactValueDisplay");
        AbstractC22676k.m65750j(detailsImageDisplay, "detailsImageDisplay");
        this.detailsTitleDisplay = detailsTitleDisplay;
        this.detailsSubtitleDisplay = detailsSubtitleDisplay;
        this.detailsTagLabelDisplay = detailsTagLabelDisplay;
        this.detailsImpactStyle = detailsImpactStyle;
        this.detailsImpactValueDisplay = detailsImpactValueDisplay;
        this.detailsImageDisplay = detailsImageDisplay;
        this.subHeader = behaviorDetailsSubHeader;
    }
}
