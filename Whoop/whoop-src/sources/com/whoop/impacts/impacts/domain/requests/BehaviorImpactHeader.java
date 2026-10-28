package com.whoop.impacts.impacts.domain.requests;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J:\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u0018¨\u00063"}, m65681d2 = {"Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;", "", "Lcom/whoop/design/util/TextResource;", "infoContentDisplay", "lastRefreshTextDisplay", "title", "subtitle", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$behavior_impact_release", "(Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getInfoContentDisplay", "getInfoContentDisplay$annotations", "()V", "getLastRefreshTextDisplay", "getLastRefreshTextDisplay$annotations", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "Companion", "$serializer", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorImpactHeader {

    @SerializedName("info_content_display")
    private final TextResource infoContentDisplay;

    @SerializedName("last_refresh_text_display")
    private final TextResource lastRefreshTextDisplay;

    @SerializedName("impact_subtitle_display")
    private final TextResource subtitle;

    @SerializedName("impact_title_display")
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactHeader;", "serializer", "()Lwc3/c;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorImpactHeader$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BehaviorImpactHeader(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i13 & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 14, BehaviorImpactHeader$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.infoContentDisplay = null;
        } else {
            this.infoContentDisplay = textResource;
        }
        this.lastRefreshTextDisplay = textResource2;
        this.title = textResource3;
        this.subtitle = textResource4;
    }

    public static /* synthetic */ BehaviorImpactHeader copy$default(BehaviorImpactHeader behaviorImpactHeader, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = behaviorImpactHeader.infoContentDisplay;
        }
        if ((i13 & 2) != 0) {
            textResource2 = behaviorImpactHeader.lastRefreshTextDisplay;
        }
        if ((i13 & 4) != 0) {
            textResource3 = behaviorImpactHeader.title;
        }
        if ((i13 & 8) != 0) {
            textResource4 = behaviorImpactHeader.subtitle;
        }
        return behaviorImpactHeader.copy(textResource, textResource2, textResource3, textResource4);
    }

    @InterfaceC37143h("info_content_display")
    public static /* synthetic */ void getInfoContentDisplay$annotations() {
    }

    @InterfaceC37143h("last_refresh_text_display")
    public static /* synthetic */ void getLastRefreshTextDisplay$annotations() {
    }

    @InterfaceC37143h("impact_subtitle_display")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @InterfaceC37143h("impact_title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$behavior_impact_release(BehaviorImpactHeader self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.infoContentDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, C25452a.f99689a, self.infoContentDisplay);
        }
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.lastRefreshTextDisplay);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.subtitle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getInfoContentDisplay() {
        return this.infoContentDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getLastRefreshTextDisplay() {
        return this.lastRefreshTextDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final BehaviorImpactHeader copy(TextResource infoContentDisplay, TextResource lastRefreshTextDisplay, TextResource title, TextResource subtitle) {
        AbstractC22676k.m65750j(lastRefreshTextDisplay, "lastRefreshTextDisplay");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new BehaviorImpactHeader(infoContentDisplay, lastRefreshTextDisplay, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorImpactHeader)) {
            return false;
        }
        BehaviorImpactHeader behaviorImpactHeader = (BehaviorImpactHeader) other;
        return AbstractC22676k.m65745e(this.infoContentDisplay, behaviorImpactHeader.infoContentDisplay) && AbstractC22676k.m65745e(this.lastRefreshTextDisplay, behaviorImpactHeader.lastRefreshTextDisplay) && AbstractC22676k.m65745e(this.title, behaviorImpactHeader.title) && AbstractC22676k.m65745e(this.subtitle, behaviorImpactHeader.subtitle);
    }

    public final TextResource getInfoContentDisplay() {
        return this.infoContentDisplay;
    }

    public final TextResource getLastRefreshTextDisplay() {
        return this.lastRefreshTextDisplay;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextResource textResource = this.infoContentDisplay;
        return this.subtitle.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a((textResource == null ? 0 : textResource.hashCode()) * 31, this.lastRefreshTextDisplay, 31), this.title, 31);
    }

    public String toString() {
        TextResource textResource = this.infoContentDisplay;
        TextResource textResource2 = this.lastRefreshTextDisplay;
        return AbstractC33745d.m106655n(AbstractC33745d.m106658q("BehaviorImpactHeader(infoContentDisplay=", textResource, ", lastRefreshTextDisplay=", textResource2, ", title="), this.title, ", subtitle=", this.subtitle, ")");
    }

    public BehaviorImpactHeader(TextResource textResource, TextResource lastRefreshTextDisplay, TextResource title, TextResource subtitle) {
        AbstractC22676k.m65750j(lastRefreshTextDisplay, "lastRefreshTextDisplay");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.infoContentDisplay = textResource;
        this.lastRefreshTextDisplay = lastRefreshTextDisplay;
        this.title = title;
        this.subtitle = subtitle;
    }

    public /* synthetic */ BehaviorImpactHeader(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : textResource, textResource2, textResource3, textResource4);
    }
}
