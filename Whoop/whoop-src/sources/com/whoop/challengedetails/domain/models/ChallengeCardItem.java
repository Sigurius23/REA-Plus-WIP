package com.whoop.challengedetails.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000232B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001c¨\u00064"}, m65681d2 = {"Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;", "", "", "icon", "iconColor", "Lcom/whoop/design/util/TextResource;", "text", "subText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$challenge_details_release", "(Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/util/TextResource;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getIcon$annotations", "()V", "getIconColor", "getIconColor$annotations", "Lcom/whoop/design/util/TextResource;", "getText", "getText$annotations", "getSubText", "getSubText$annotations", "Companion", "$serializer", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChallengeCardItem {

    @SerializedName("icon")
    private final String icon;

    @SerializedName("icon_color")
    private final String iconColor;

    @SerializedName("sub_text")
    private final TextResource subText;

    @SerializedName("text")
    private final TextResource text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/challengedetails/domain/models/ChallengeCardItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;", "serializer", "()Lwc3/c;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChallengeCardItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ChallengeCardItem(int i13, String str, String str2, TextResource textResource, TextResource textResource2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ChallengeCardItem$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.iconColor = str2;
        this.text = textResource;
        this.subText = textResource2;
    }

    public static /* synthetic */ ChallengeCardItem copy$default(ChallengeCardItem challengeCardItem, String str, String str2, TextResource textResource, TextResource textResource2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = challengeCardItem.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = challengeCardItem.iconColor;
        }
        if ((i13 & 4) != 0) {
            textResource = challengeCardItem.text;
        }
        if ((i13 & 8) != 0) {
            textResource2 = challengeCardItem.subText;
        }
        return challengeCardItem.copy(str, str2, textResource, textResource2);
    }

    @InterfaceC37143h("icon")
    public static /* synthetic */ void getIcon$annotations() {
    }

    @InterfaceC37143h("icon_color")
    public static /* synthetic */ void getIconColor$annotations() {
    }

    @InterfaceC37143h("sub_text")
    public static /* synthetic */ void getSubText$annotations() {
    }

    @InterfaceC37143h("text")
    public static /* synthetic */ void getText$annotations() {
    }

    public static final /* synthetic */ void write$Self$challenge_details_release(ChallengeCardItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.iconColor);
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.text);
        output.encodeNullableSerializableElement(serialDesc, 3, c25452a, self.subText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getSubText() {
        return this.subText;
    }

    public final ChallengeCardItem copy(String icon, String iconColor, TextResource text, TextResource subText) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(text, "text");
        return new ChallengeCardItem(icon, iconColor, text, subText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeCardItem)) {
            return false;
        }
        ChallengeCardItem challengeCardItem = (ChallengeCardItem) other;
        return AbstractC22676k.m65745e(this.icon, challengeCardItem.icon) && AbstractC22676k.m65745e(this.iconColor, challengeCardItem.iconColor) && AbstractC22676k.m65745e(this.text, challengeCardItem.text) && AbstractC22676k.m65745e(this.subText, challengeCardItem.subText);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final TextResource getSubText() {
        return this.subText;
    }

    public final TextResource getText() {
        return this.text;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.iconColor), this.text, 31);
        TextResource textResource = this.subText;
        return iM95625a + (textResource == null ? 0 : textResource.hashCode());
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.iconColor;
        return AbstractC33745d.m106655n(AbstractC11895b.m32001t("ChallengeCardItem(icon=", str, ", iconColor=", str2, ", text="), this.text, ", subText=", this.subText, ")");
    }

    public ChallengeCardItem(String icon, String iconColor, TextResource text, TextResource textResource) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(text, "text");
        this.icon = icon;
        this.iconColor = iconColor;
        this.text = text;
        this.subText = textResource;
    }
}
