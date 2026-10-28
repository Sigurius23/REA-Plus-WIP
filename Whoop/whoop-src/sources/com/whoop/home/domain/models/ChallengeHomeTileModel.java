package com.whoop.home.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc2.C39434a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFB\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u007f\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0088\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b>\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b?\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010$¨\u0006H"}, m65681d2 = {"Lcom/whoop/home/domain/models/ChallengeHomeTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "headerTitle", "title", "subtitle", "imageUrl", "backgroundStyle", "daysLeftDisplay", "Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;", "progressBar", "Lcom/whoop/design/models/items/CardButtonModel;", "ctaButton", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;", "component9", "()Lcom/whoop/design/models/items/CardButtonModel;", "component10", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;)Lcom/whoop/home/domain/models/ChallengeHomeTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/ChallengeHomeTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getHeaderTitle", "getTitle", "getSubtitle", "getImageUrl", "getBackgroundStyle", "getDaysLeftDisplay", "Lcom/whoop/home/domain/models/ChallengeHomeTileProgressModel;", "getProgressBar", "Lcom/whoop/design/models/items/CardButtonModel;", "getCtaButton", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChallengeHomeTileModel implements DesignSystemModel {
    private final String backgroundStyle;
    private final CardButtonModel ctaButton;
    private final String daysLeftDisplay;
    private final C9598e destination;
    private final String headerTitle;
    private final String id;
    private final String imageUrl;
    private final ChallengeHomeTileProgressModel progressBar;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | CardButtonModel.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C39434a(14))};

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/ChallengeHomeTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/ChallengeHomeTileModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChallengeHomeTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ChallengeHomeTileModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ChallengeHomeTileProgressModel) null, (CardButtonModel) null, (C9598e) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ChallengeHomeTileModel copy$default(ChallengeHomeTileModel challengeHomeTileModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, ChallengeHomeTileProgressModel challengeHomeTileProgressModel, CardButtonModel cardButtonModel, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = challengeHomeTileModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = challengeHomeTileModel.headerTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = challengeHomeTileModel.title;
        }
        if ((i13 & 8) != 0) {
            str4 = challengeHomeTileModel.subtitle;
        }
        if ((i13 & 16) != 0) {
            str5 = challengeHomeTileModel.imageUrl;
        }
        if ((i13 & 32) != 0) {
            str6 = challengeHomeTileModel.backgroundStyle;
        }
        if ((i13 & 64) != 0) {
            str7 = challengeHomeTileModel.daysLeftDisplay;
        }
        if ((i13 & 128) != 0) {
            challengeHomeTileProgressModel = challengeHomeTileModel.progressBar;
        }
        if ((i13 & 256) != 0) {
            cardButtonModel = challengeHomeTileModel.ctaButton;
        }
        if ((i13 & 512) != 0) {
            c9598e = challengeHomeTileModel.destination;
        }
        CardButtonModel cardButtonModel2 = cardButtonModel;
        C9598e c9598e2 = c9598e;
        String str8 = str7;
        ChallengeHomeTileProgressModel challengeHomeTileProgressModel2 = challengeHomeTileProgressModel;
        String str9 = str5;
        String str10 = str6;
        return challengeHomeTileModel.copy(str, str2, str3, str4, str9, str10, str8, challengeHomeTileProgressModel2, cardButtonModel2, c9598e2);
    }

    public static final /* synthetic */ void write$Self$home_release(ChallengeHomeTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.headerTitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.headerTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.backgroundStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.backgroundStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.daysLeftDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.daysLeftDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.progressBar != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, ChallengeHomeTileProgressModel$$serializer.INSTANCE, self.progressBar);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.ctaButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, CardButtonModel$$serializer.INSTANCE, self.ctaButton);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDaysLeftDisplay() {
        return this.daysLeftDisplay;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ChallengeHomeTileProgressModel getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CardButtonModel getCtaButton() {
        return this.ctaButton;
    }

    public final ChallengeHomeTileModel copy(String id4, String headerTitle, String title, String subtitle, String imageUrl, String backgroundStyle, String daysLeftDisplay, ChallengeHomeTileProgressModel progressBar, CardButtonModel ctaButton, C9598e destination) {
        return new ChallengeHomeTileModel(id4, headerTitle, title, subtitle, imageUrl, backgroundStyle, daysLeftDisplay, progressBar, ctaButton, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeHomeTileModel)) {
            return false;
        }
        ChallengeHomeTileModel challengeHomeTileModel = (ChallengeHomeTileModel) other;
        return AbstractC22676k.m65745e(this.id, challengeHomeTileModel.id) && AbstractC22676k.m65745e(this.headerTitle, challengeHomeTileModel.headerTitle) && AbstractC22676k.m65745e(this.title, challengeHomeTileModel.title) && AbstractC22676k.m65745e(this.subtitle, challengeHomeTileModel.subtitle) && AbstractC22676k.m65745e(this.imageUrl, challengeHomeTileModel.imageUrl) && AbstractC22676k.m65745e(this.backgroundStyle, challengeHomeTileModel.backgroundStyle) && AbstractC22676k.m65745e(this.daysLeftDisplay, challengeHomeTileModel.daysLeftDisplay) && AbstractC22676k.m65745e(this.progressBar, challengeHomeTileModel.progressBar) && AbstractC22676k.m65745e(this.ctaButton, challengeHomeTileModel.ctaButton) && AbstractC22676k.m65745e(this.destination, challengeHomeTileModel.destination);
    }

    public final String getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final CardButtonModel getCtaButton() {
        return this.ctaButton;
    }

    public final String getDaysLeftDisplay() {
        return this.daysLeftDisplay;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ChallengeHomeTileProgressModel getProgressBar() {
        return this.progressBar;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.headerTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.backgroundStyle;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.daysLeftDisplay;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ChallengeHomeTileProgressModel challengeHomeTileProgressModel = this.progressBar;
        int iHashCode8 = (iHashCode7 + (challengeHomeTileProgressModel == null ? 0 : challengeHomeTileProgressModel.hashCode())) * 31;
        CardButtonModel cardButtonModel = this.ctaButton;
        int iHashCode9 = (iHashCode8 + (cardButtonModel == null ? 0 : cardButtonModel.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode9 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.headerTitle;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.imageUrl;
        String str6 = this.backgroundStyle;
        String str7 = this.daysLeftDisplay;
        ChallengeHomeTileProgressModel challengeHomeTileProgressModel = this.progressBar;
        CardButtonModel cardButtonModel = this.ctaButton;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChallengeHomeTileModel(id=", str, ", headerTitle=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitle=", str4, ", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", backgroundStyle=", str6, ", daysLeftDisplay=");
        sbM32001t.append(str7);
        sbM32001t.append(", progressBar=");
        sbM32001t.append(challengeHomeTileProgressModel);
        sbM32001t.append(", ctaButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ ChallengeHomeTileModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, ChallengeHomeTileProgressModel challengeHomeTileProgressModel, CardButtonModel cardButtonModel, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.headerTitle = null;
        } else {
            this.headerTitle = str2;
        }
        if ((i13 & 4) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i13 & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str4;
        }
        if ((i13 & 16) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str5;
        }
        if ((i13 & 32) == 0) {
            this.backgroundStyle = null;
        } else {
            this.backgroundStyle = str6;
        }
        if ((i13 & 64) == 0) {
            this.daysLeftDisplay = null;
        } else {
            this.daysLeftDisplay = str7;
        }
        if ((i13 & 128) == 0) {
            this.progressBar = null;
        } else {
            this.progressBar = challengeHomeTileProgressModel;
        }
        if ((i13 & 256) == 0) {
            this.ctaButton = null;
        } else {
            this.ctaButton = cardButtonModel;
        }
        if ((i13 & 512) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    public ChallengeHomeTileModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, ChallengeHomeTileProgressModel challengeHomeTileProgressModel, CardButtonModel cardButtonModel, C9598e c9598e) {
        this.id = str;
        this.headerTitle = str2;
        this.title = str3;
        this.subtitle = str4;
        this.imageUrl = str5;
        this.backgroundStyle = str6;
        this.daysLeftDisplay = str7;
        this.progressBar = challengeHomeTileProgressModel;
        this.ctaButton = cardButtonModel;
        this.destination = c9598e;
    }

    public /* synthetic */ ChallengeHomeTileModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, ChallengeHomeTileProgressModel challengeHomeTileProgressModel, CardButtonModel cardButtonModel, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & 128) != 0 ? null : challengeHomeTileProgressModel, (i13 & 256) != 0 ? null : cardButtonModel, (i13 & 512) != 0 ? null : c9598e);
    }
}
