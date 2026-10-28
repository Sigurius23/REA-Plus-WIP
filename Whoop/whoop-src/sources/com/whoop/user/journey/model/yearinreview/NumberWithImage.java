package com.whoop.user.journey.model.yearinreview;

import androidx.recyclerview.widget.AbstractC1707m0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.model.UserJourneyStep;
import cq2.C11062a;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 Y2\u00020\u0001:\u0002ZYB·\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019BÃ\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u0010&J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010 J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010 J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010 JÌ\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010 J\u0010\u00106\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bG\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bI\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bJ\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bM\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bN\u0010 R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bO\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bP\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bQ\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u0010-R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bT\u0010-R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bU\u0010&R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bV\u0010 R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010E\u001a\u0004\bW\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bX\u0010 ¨\u0006["}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;", "Lcom/whoop/user/journey/model/UserJourneyStep;", "", "title", "displayNumber", "Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;", "numberFontSize", "imageUrl", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "highlightedTexts", "name", "theme", "themeVariant", "recoveryBadgeLevel", "recoveryBadgeImageUrl", "", "foundingMember", "whoopPro", "Lcom/whoop/user/journey/model/yearinreview/FooterText;", "footerTexts", "footerText", "footerSubText", "backgroundImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "component10", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getDisplayNumber", "Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;", "getNumberFontSize", "getImageUrl", "Ljava/util/List;", "getHighlightedTexts", "getName", "getTheme", "getThemeVariant", "getRecoveryBadgeLevel", "getRecoveryBadgeImageUrl", "Z", "getFoundingMember", "getWhoopPro", "getFooterTexts", "getFooterText", "getFooterSubText", "getBackgroundImageUrl", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NumberWithImage implements UserJourneyStep {
    private static final InterfaceC23462h[] $childSerializers;
    private final String backgroundImageUrl;
    private final String displayNumber;
    private final String footerSubText;
    private final String footerText;
    private final List<FooterText> footerTexts;
    private final boolean foundingMember;
    private final List<HighlightedText> highlightedTexts;
    private final String imageUrl;
    private final String name;
    private final NumberWithImageFontSize numberFontSize;
    private final String recoveryBadgeImageUrl;
    private final String recoveryBadgeLevel;
    private final String theme;
    private final String themeVariant;
    private final String title;
    private final boolean whoopPro;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/NumberWithImage$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/NumberWithImage;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NumberWithImage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C11062a(8)), null, AbstractC30060g.m92087G(enumC23463i, new C11062a(9)), null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C11062a(10)), null, null, null};
    }

    public /* synthetic */ NumberWithImage(int i13, String str, String str2, NumberWithImageFontSize numberWithImageFontSize, String str3, List list, String str4, String str5, String str6, String str7, String str8, boolean z4, boolean z13, List list2, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (250 != (i13 & AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, NumberWithImage$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        this.displayNumber = str2;
        if ((i13 & 4) == 0) {
            this.numberFontSize = null;
        } else {
            this.numberFontSize = numberWithImageFontSize;
        }
        this.imageUrl = str3;
        this.highlightedTexts = list;
        this.name = str4;
        this.theme = str5;
        this.themeVariant = str6;
        if ((i13 & 256) == 0) {
            this.recoveryBadgeLevel = "";
        } else {
            this.recoveryBadgeLevel = str7;
        }
        if ((i13 & 512) == 0) {
            this.recoveryBadgeImageUrl = "";
        } else {
            this.recoveryBadgeImageUrl = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.foundingMember = false;
        } else {
            this.foundingMember = z4;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.whoopPro = false;
        } else {
            this.whoopPro = z13;
        }
        if ((i13 & 4096) == 0) {
            this.footerTexts = null;
        } else {
            this.footerTexts = list2;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.footerText = null;
        } else {
            this.footerText = str9;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.footerSubText = null;
        } else {
            this.footerSubText = str10;
        }
        if ((i13 & 32768) == 0) {
            this.backgroundImageUrl = null;
        } else {
            this.backgroundImageUrl = str11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return NumberWithImageFontSize.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(HighlightedText$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(FooterText$$serializer.INSTANCE);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(NumberWithImage self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        }
        output.encodeStringElement(serialDesc, 1, self.displayNumber);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.numberFontSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.numberFontSize);
        }
        output.encodeStringElement(serialDesc, 3, self.imageUrl);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.highlightedTexts);
        output.encodeStringElement(serialDesc, 5, self.name);
        output.encodeStringElement(serialDesc, 6, self.theme);
        output.encodeStringElement(serialDesc, 7, self.themeVariant);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.recoveryBadgeLevel, "")) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.recoveryBadgeLevel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.recoveryBadgeImageUrl, "")) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.recoveryBadgeImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.foundingMember) {
            output.encodeBooleanElement(serialDesc, 10, self.foundingMember);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.whoopPro) {
            output.encodeBooleanElement(serialDesc, 11, self.whoopPro);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.footerTexts != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.footerTexts);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.footerText != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.footerText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.footerSubText != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.footerSubText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 15) && self.backgroundImageUrl == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.backgroundImageUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRecoveryBadgeImageUrl() {
        return this.recoveryBadgeImageUrl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getFoundingMember() {
        return this.foundingMember;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getWhoopPro() {
        return this.whoopPro;
    }

    public final List<FooterText> component13() {
        return this.footerTexts;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFooterSubText() {
        return this.footerSubText;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayNumber() {
        return this.displayNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NumberWithImageFontSize getNumberFontSize() {
        return this.numberFontSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<HighlightedText> component5() {
        return this.highlightedTexts;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getThemeVariant() {
        return this.themeVariant;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRecoveryBadgeLevel() {
        return this.recoveryBadgeLevel;
    }

    public final NumberWithImage copy(String title, String displayNumber, NumberWithImageFontSize numberFontSize, String imageUrl, List<HighlightedText> highlightedTexts, String name, String theme, String themeVariant, String recoveryBadgeLevel, String recoveryBadgeImageUrl, boolean foundingMember, boolean whoopPro, List<FooterText> footerTexts, String footerText, String footerSubText, String backgroundImageUrl) {
        AbstractC22676k.m65750j(displayNumber, "displayNumber");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        return new NumberWithImage(title, displayNumber, numberFontSize, imageUrl, highlightedTexts, name, theme, themeVariant, recoveryBadgeLevel, recoveryBadgeImageUrl, foundingMember, whoopPro, footerTexts, footerText, footerSubText, backgroundImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumberWithImage)) {
            return false;
        }
        NumberWithImage numberWithImage = (NumberWithImage) other;
        return AbstractC22676k.m65745e(this.title, numberWithImage.title) && AbstractC22676k.m65745e(this.displayNumber, numberWithImage.displayNumber) && this.numberFontSize == numberWithImage.numberFontSize && AbstractC22676k.m65745e(this.imageUrl, numberWithImage.imageUrl) && AbstractC22676k.m65745e(this.highlightedTexts, numberWithImage.highlightedTexts) && AbstractC22676k.m65745e(this.name, numberWithImage.name) && AbstractC22676k.m65745e(this.theme, numberWithImage.theme) && AbstractC22676k.m65745e(this.themeVariant, numberWithImage.themeVariant) && AbstractC22676k.m65745e(this.recoveryBadgeLevel, numberWithImage.recoveryBadgeLevel) && AbstractC22676k.m65745e(this.recoveryBadgeImageUrl, numberWithImage.recoveryBadgeImageUrl) && this.foundingMember == numberWithImage.foundingMember && this.whoopPro == numberWithImage.whoopPro && AbstractC22676k.m65745e(this.footerTexts, numberWithImage.footerTexts) && AbstractC22676k.m65745e(this.footerText, numberWithImage.footerText) && AbstractC22676k.m65745e(this.footerSubText, numberWithImage.footerSubText) && AbstractC22676k.m65745e(this.backgroundImageUrl, numberWithImage.backgroundImageUrl);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final String getDisplayNumber() {
        return this.displayNumber;
    }

    public final String getFooterSubText() {
        return this.footerSubText;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final List<FooterText> getFooterTexts() {
        return this.footerTexts;
    }

    public final boolean getFoundingMember() {
        return this.foundingMember;
    }

    public final List<HighlightedText> getHighlightedTexts() {
        return this.highlightedTexts;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final NumberWithImageFontSize getNumberFontSize() {
        return this.numberFontSize;
    }

    public final String getRecoveryBadgeImageUrl() {
        return this.recoveryBadgeImageUrl;
    }

    public final String getRecoveryBadgeLevel() {
        return this.recoveryBadgeLevel;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getThemeVariant() {
        return this.themeVariant;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getWhoopPro() {
        return this.whoopPro;
    }

    public int hashCode() {
        String str = this.title;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.displayNumber);
        NumberWithImageFontSize numberWithImageFontSize = this.numberFontSize;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d((iM30450d + (numberWithImageFontSize == null ? 0 : numberWithImageFontSize.hashCode())) * 31, 31, this.imageUrl), 31, this.highlightedTexts), 31, this.name), 31, this.theme), 31, this.themeVariant);
        String str2 = this.recoveryBadgeLevel;
        int iHashCode = (iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recoveryBadgeImageUrl;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.foundingMember), 31, this.whoopPro);
        List<FooterText> list = this.footerTexts;
        int iHashCode2 = (iM8289b + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.footerText;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.footerSubText;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.backgroundImageUrl;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.displayNumber;
        NumberWithImageFontSize numberWithImageFontSize = this.numberFontSize;
        String str3 = this.imageUrl;
        List<HighlightedText> list = this.highlightedTexts;
        String str4 = this.name;
        String str5 = this.theme;
        String str6 = this.themeVariant;
        String str7 = this.recoveryBadgeLevel;
        String str8 = this.recoveryBadgeImageUrl;
        boolean z4 = this.foundingMember;
        boolean z13 = this.whoopPro;
        List<FooterText> list2 = this.footerTexts;
        String str9 = this.footerText;
        String str10 = this.footerSubText;
        String str11 = this.backgroundImageUrl;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NumberWithImage(title=", str, ", displayNumber=", str2, ", numberFontSize=");
        sbM32001t.append(numberWithImageFontSize);
        sbM32001t.append(", imageUrl=");
        sbM32001t.append(str3);
        sbM32001t.append(", highlightedTexts=");
        AbstractC17176i.m48511m(", name=", str4, ", theme=", sbM32001t, list);
        AbstractC11266d.m30444B(sbM32001t, str5, ", themeVariant=", str6, ", recoveryBadgeLevel=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", recoveryBadgeImageUrl=", str8, ", foundingMember=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", whoopPro=", z13, ", footerTexts=");
        AbstractC17176i.m48511m(", footerText=", str9, ", footerSubText=", sbM32001t, list2);
        return AbstractC11266d.m30464r(sbM32001t, str10, ", backgroundImageUrl=", str11, ")");
    }

    public NumberWithImage(String str, String displayNumber, NumberWithImageFontSize numberWithImageFontSize, String imageUrl, List<HighlightedText> highlightedTexts, String name, String theme, String themeVariant, String str2, String str3, boolean z4, boolean z13, List<FooterText> list, String str4, String str5, String str6) {
        AbstractC22676k.m65750j(displayNumber, "displayNumber");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(highlightedTexts, "highlightedTexts");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(theme, "theme");
        AbstractC22676k.m65750j(themeVariant, "themeVariant");
        this.title = str;
        this.displayNumber = displayNumber;
        this.numberFontSize = numberWithImageFontSize;
        this.imageUrl = imageUrl;
        this.highlightedTexts = highlightedTexts;
        this.name = name;
        this.theme = theme;
        this.themeVariant = themeVariant;
        this.recoveryBadgeLevel = str2;
        this.recoveryBadgeImageUrl = str3;
        this.foundingMember = z4;
        this.whoopPro = z13;
        this.footerTexts = list;
        this.footerText = str4;
        this.footerSubText = str5;
        this.backgroundImageUrl = str6;
    }

    public /* synthetic */ NumberWithImage(String str, String str2, NumberWithImageFontSize numberWithImageFontSize, String str3, List list, String str4, String str5, String str6, String str7, String str8, boolean z4, boolean z13, List list2, String str9, String str10, String str11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, (i13 & 4) != 0 ? null : numberWithImageFontSize, str3, list, str4, str5, str6, (i13 & 256) != 0 ? "" : str7, (i13 & 512) != 0 ? "" : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z13, (i13 & 4096) != 0 ? null : list2, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str10, (i13 & 32768) != 0 ? null : str11);
    }
}
