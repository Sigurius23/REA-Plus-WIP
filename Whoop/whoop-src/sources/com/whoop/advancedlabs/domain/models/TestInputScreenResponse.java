package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.items.TagModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0084\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b;\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b<\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b=\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b>\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b?\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b@\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bA\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bB\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010$¨\u0006G"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;", "", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "", "imageUrl", "title", "subtitle", "nameLabel", "nameValue", "dateLabel", "dateIcon", "timeLabel", "dateTimeValue", "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;", "button", "<init>", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;", "copy", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "getNavigationBar", "Ljava/lang/String;", "getImageUrl", "getTitle", "getSubtitle", "getNameLabel", "getNameValue", "getDateLabel", "getDateIcon", "getTimeLabel", "getDateTimeValue", "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;", "getButton", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TestInputScreenResponse {
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PrimaryButtonModel button;
    private final String dateIcon;
    private final String dateLabel;
    private final String dateTimeValue;
    private final String imageUrl;
    private final String nameLabel;
    private final String nameValue;
    private final NavigationBarModel navigationBar;
    private final String subtitle;
    private final String timeLabel;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TestInputScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        $stable = i13 | TextResource.$stable | i13 | TagModel.$stable;
    }

    public /* synthetic */ TestInputScreenResponse(int i13, NavigationBarModel navigationBarModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, PrimaryButtonModel primaryButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, TestInputScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = navigationBarModel;
        this.imageUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.nameLabel = str4;
        this.nameValue = str5;
        this.dateLabel = str6;
        this.dateIcon = str7;
        this.timeLabel = str8;
        this.dateTimeValue = str9;
        this.button = primaryButtonModel;
    }

    public static /* synthetic */ TestInputScreenResponse copy$default(TestInputScreenResponse testInputScreenResponse, NavigationBarModel navigationBarModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, PrimaryButtonModel primaryButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = testInputScreenResponse.navigationBar;
        }
        if ((i13 & 2) != 0) {
            str = testInputScreenResponse.imageUrl;
        }
        if ((i13 & 4) != 0) {
            str2 = testInputScreenResponse.title;
        }
        if ((i13 & 8) != 0) {
            str3 = testInputScreenResponse.subtitle;
        }
        if ((i13 & 16) != 0) {
            str4 = testInputScreenResponse.nameLabel;
        }
        if ((i13 & 32) != 0) {
            str5 = testInputScreenResponse.nameValue;
        }
        if ((i13 & 64) != 0) {
            str6 = testInputScreenResponse.dateLabel;
        }
        if ((i13 & 128) != 0) {
            str7 = testInputScreenResponse.dateIcon;
        }
        if ((i13 & 256) != 0) {
            str8 = testInputScreenResponse.timeLabel;
        }
        if ((i13 & 512) != 0) {
            str9 = testInputScreenResponse.dateTimeValue;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            primaryButtonModel = testInputScreenResponse.button;
        }
        String str10 = str9;
        PrimaryButtonModel primaryButtonModel2 = primaryButtonModel;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        String str15 = str4;
        String str16 = str2;
        return testInputScreenResponse.copy(navigationBarModel, str, str16, str3, str15, str13, str14, str11, str12, str10, primaryButtonModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(TestInputScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeStringElement(serialDesc, 1, self.imageUrl);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.subtitle);
        output.encodeStringElement(serialDesc, 4, self.nameLabel);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.nameValue);
        output.encodeStringElement(serialDesc, 6, self.dateLabel);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.dateIcon);
        output.encodeStringElement(serialDesc, 8, self.timeLabel);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.dateTimeValue);
        output.encodeSerializableElement(serialDesc, 10, PrimaryButtonModel$$serializer.INSTANCE, self.button);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDateTimeValue() {
        return this.dateTimeValue;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final PrimaryButtonModel getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
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
    public final String getNameLabel() {
        return this.nameLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNameValue() {
        return this.nameValue;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDateLabel() {
        return this.dateLabel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDateIcon() {
        return this.dateIcon;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTimeLabel() {
        return this.timeLabel;
    }

    public final TestInputScreenResponse copy(NavigationBarModel navigationBar, String imageUrl, String title, String subtitle, String nameLabel, String nameValue, String dateLabel, String dateIcon, String timeLabel, String dateTimeValue, PrimaryButtonModel button) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(nameLabel, "nameLabel");
        AbstractC22676k.m65750j(dateLabel, "dateLabel");
        AbstractC22676k.m65750j(timeLabel, "timeLabel");
        AbstractC22676k.m65750j(button, "button");
        return new TestInputScreenResponse(navigationBar, imageUrl, title, subtitle, nameLabel, nameValue, dateLabel, dateIcon, timeLabel, dateTimeValue, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestInputScreenResponse)) {
            return false;
        }
        TestInputScreenResponse testInputScreenResponse = (TestInputScreenResponse) other;
        return AbstractC22676k.m65745e(this.navigationBar, testInputScreenResponse.navigationBar) && AbstractC22676k.m65745e(this.imageUrl, testInputScreenResponse.imageUrl) && AbstractC22676k.m65745e(this.title, testInputScreenResponse.title) && AbstractC22676k.m65745e(this.subtitle, testInputScreenResponse.subtitle) && AbstractC22676k.m65745e(this.nameLabel, testInputScreenResponse.nameLabel) && AbstractC22676k.m65745e(this.nameValue, testInputScreenResponse.nameValue) && AbstractC22676k.m65745e(this.dateLabel, testInputScreenResponse.dateLabel) && AbstractC22676k.m65745e(this.dateIcon, testInputScreenResponse.dateIcon) && AbstractC22676k.m65745e(this.timeLabel, testInputScreenResponse.timeLabel) && AbstractC22676k.m65745e(this.dateTimeValue, testInputScreenResponse.dateTimeValue) && AbstractC22676k.m65745e(this.button, testInputScreenResponse.button);
    }

    public final PrimaryButtonModel getButton() {
        return this.button;
    }

    public final String getDateIcon() {
        return this.dateIcon;
    }

    public final String getDateLabel() {
        return this.dateLabel;
    }

    public final String getDateTimeValue() {
        return this.dateTimeValue;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getNameLabel() {
        return this.nameLabel;
    }

    public final String getNameValue() {
        return this.nameValue;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTimeLabel() {
        return this.timeLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationBar.hashCode() * 31, 31, this.imageUrl), 31, this.title), 31, this.subtitle), 31, this.nameLabel);
        String str = this.nameValue;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.dateLabel);
        String str2 = this.dateIcon;
        int iM30450d3 = AbstractC11266d.m30450d((iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.timeLabel);
        String str3 = this.dateTimeValue;
        return this.button.hashCode() + ((iM30450d3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        NavigationBarModel navigationBarModel = this.navigationBar;
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.nameLabel;
        String str5 = this.nameValue;
        String str6 = this.dateLabel;
        String str7 = this.dateIcon;
        String str8 = this.timeLabel;
        String str9 = this.dateTimeValue;
        PrimaryButtonModel primaryButtonModel = this.button;
        StringBuilder sb4 = new StringBuilder("TestInputScreenResponse(navigationBar=");
        sb4.append(navigationBarModel);
        sb4.append(", imageUrl=");
        sb4.append(str);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str2, ", subtitle=", str3, ", nameLabel=");
        AbstractC11266d.m30444B(sb4, str4, ", nameValue=", str5, ", dateLabel=");
        AbstractC11266d.m30444B(sb4, str6, ", dateIcon=", str7, ", timeLabel=");
        AbstractC11266d.m30444B(sb4, str8, ", dateTimeValue=", str9, ", button=");
        sb4.append(primaryButtonModel);
        sb4.append(")");
        return sb4.toString();
    }

    public TestInputScreenResponse(NavigationBarModel navigationBar, String imageUrl, String title, String subtitle, String nameLabel, String str, String dateLabel, String str2, String timeLabel, String str3, PrimaryButtonModel button) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(nameLabel, "nameLabel");
        AbstractC22676k.m65750j(dateLabel, "dateLabel");
        AbstractC22676k.m65750j(timeLabel, "timeLabel");
        AbstractC22676k.m65750j(button, "button");
        this.navigationBar = navigationBar;
        this.imageUrl = imageUrl;
        this.title = title;
        this.subtitle = subtitle;
        this.nameLabel = nameLabel;
        this.nameValue = str;
        this.dateLabel = dateLabel;
        this.dateIcon = str2;
        this.timeLabel = timeLabel;
        this.dateTimeValue = str3;
        this.button = button;
    }
}
