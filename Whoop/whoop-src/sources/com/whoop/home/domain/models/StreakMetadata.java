package com.whoop.home.domain.models;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import we1.C37224h;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001b¨\u00065"}, m65681d2 = {"Lcom/whoop/home/domain/models/StreakMetadata;", "", "", "streakValue", "streakState", "lottieUrl", "imageUrl", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "animationAccentColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/StreakMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/navigation/e;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/home/domain/models/StreakMetadata;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStreakValue", "getStreakState", "getLottieUrl", "getImageUrl", "Lcom/whoop/navigation/e;", "getNavigation", "getAnimationAccentColor", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StreakMetadata {

    @SerializedName("animation_accent_color")
    private final String animationAccentColor;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("lottie_url")
    private final String lottieUrl;

    @SerializedName(NotificationCompat.CATEGORY_NAVIGATION)
    private final C9598e navigation;

    @SerializedName("streak_state")
    private final String streakState;

    @SerializedName("streak_value")
    private final String streakValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37224h(27)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/StreakMetadata$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/StreakMetadata;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StreakMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StreakMetadata(int i13, String str, String str2, String str3, String str4, C9598e c9598e, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, StreakMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.streakValue = str;
        this.streakState = str2;
        this.lottieUrl = str3;
        this.imageUrl = str4;
        this.navigation = c9598e;
        this.animationAccentColor = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ StreakMetadata copy$default(StreakMetadata streakMetadata, String str, String str2, String str3, String str4, C9598e c9598e, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = streakMetadata.streakValue;
        }
        if ((i13 & 2) != 0) {
            str2 = streakMetadata.streakState;
        }
        if ((i13 & 4) != 0) {
            str3 = streakMetadata.lottieUrl;
        }
        if ((i13 & 8) != 0) {
            str4 = streakMetadata.imageUrl;
        }
        if ((i13 & 16) != 0) {
            c9598e = streakMetadata.navigation;
        }
        if ((i13 & 32) != 0) {
            str5 = streakMetadata.animationAccentColor;
        }
        C9598e c9598e2 = c9598e;
        String str6 = str5;
        return streakMetadata.copy(str, str2, str3, str4, c9598e2, str6);
    }

    public static final /* synthetic */ void write$Self$home_release(StreakMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.streakValue);
        output.encodeStringElement(serialDesc, 1, self.streakState);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.lottieUrl);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.imageUrl);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.navigation);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.animationAccentColor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStreakValue() {
        return this.streakValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStreakState() {
        return this.streakState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAnimationAccentColor() {
        return this.animationAccentColor;
    }

    public final StreakMetadata copy(String streakValue, String streakState, String lottieUrl, String imageUrl, C9598e navigation, String animationAccentColor) {
        AbstractC22676k.m65750j(streakValue, "streakValue");
        AbstractC22676k.m65750j(streakState, "streakState");
        AbstractC22676k.m65750j(navigation, "navigation");
        return new StreakMetadata(streakValue, streakState, lottieUrl, imageUrl, navigation, animationAccentColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreakMetadata)) {
            return false;
        }
        StreakMetadata streakMetadata = (StreakMetadata) other;
        return AbstractC22676k.m65745e(this.streakValue, streakMetadata.streakValue) && AbstractC22676k.m65745e(this.streakState, streakMetadata.streakState) && AbstractC22676k.m65745e(this.lottieUrl, streakMetadata.lottieUrl) && AbstractC22676k.m65745e(this.imageUrl, streakMetadata.imageUrl) && AbstractC22676k.m65745e(this.navigation, streakMetadata.navigation) && AbstractC22676k.m65745e(this.animationAccentColor, streakMetadata.animationAccentColor);
    }

    public final String getAnimationAccentColor() {
        return this.animationAccentColor;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final String getStreakState() {
        return this.streakState;
    }

    public final String getStreakValue() {
        return this.streakValue;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.streakValue.hashCode() * 31, 31, this.streakState);
        String str = this.lottieUrl;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iM114673a = AbstractC36095b.m114673a(this.navigation, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.animationAccentColor;
        return iM114673a + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.streakValue;
        String str2 = this.streakState;
        String str3 = this.lottieUrl;
        String str4 = this.imageUrl;
        C9598e c9598e = this.navigation;
        String str5 = this.animationAccentColor;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StreakMetadata(streakValue=", str, ", streakState=", str2, ", lottieUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", imageUrl=", str4, ", navigation=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", animationAccentColor=");
        sbM32001t.append(str5);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public StreakMetadata(String streakValue, String streakState, String str, String str2, C9598e navigation, String str3) {
        AbstractC22676k.m65750j(streakValue, "streakValue");
        AbstractC22676k.m65750j(streakState, "streakState");
        AbstractC22676k.m65750j(navigation, "navigation");
        this.streakValue = streakValue;
        this.streakState = streakState;
        this.lottieUrl = str;
        this.imageUrl = str2;
        this.navigation = navigation;
        this.animationAccentColor = str3;
    }
}
