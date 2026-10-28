package com.whoop.strava.domain.models;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b.\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b/\u0010\u0019¨\u00063"}, m65681d2 = {"Lcom/whoop/strava/domain/models/ActivitiesItemResponse;", "", "", "menuItemTitle", "menuItemSubtitle", "leftIcon", "rightIcon", "menuItemState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strava_release", "(Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/strava/domain/models/ActivitiesItemResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMenuItemTitle", "getMenuItemTitle$annotations", "()V", "getMenuItemSubtitle", "getMenuItemSubtitle$annotations", "getLeftIcon", "getRightIcon", "getMenuItemState", "Companion", "$serializer", "a", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivitiesItemResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String leftIcon;
    private final String menuItemState;
    private final String menuItemSubtitle;
    private final String menuItemTitle;
    private final String rightIcon;

    /* JADX INFO: renamed from: com.whoop.strava.domain.models.ActivitiesItemResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strava/domain/models/ActivitiesItemResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strava/domain/models/ActivitiesItemResponse;", "serializer", "()Lwc3/c;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivitiesItemResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivitiesItemResponse(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ActivitiesItemResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.menuItemTitle = str;
        this.menuItemSubtitle = str2;
        this.leftIcon = str3;
        this.rightIcon = str4;
        this.menuItemState = str5;
    }

    public static /* synthetic */ ActivitiesItemResponse copy$default(ActivitiesItemResponse activitiesItemResponse, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activitiesItemResponse.menuItemTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = activitiesItemResponse.menuItemSubtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = activitiesItemResponse.leftIcon;
        }
        if ((i13 & 8) != 0) {
            str4 = activitiesItemResponse.rightIcon;
        }
        if ((i13 & 16) != 0) {
            str5 = activitiesItemResponse.menuItemState;
        }
        String str6 = str5;
        String str7 = str3;
        return activitiesItemResponse.copy(str, str2, str7, str4, str6);
    }

    @InterfaceC37143h("subtitle")
    public static /* synthetic */ void getMenuItemSubtitle$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getMenuItemTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$strava_release(ActivitiesItemResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.menuItemTitle);
        output.encodeStringElement(serialDesc, 1, self.menuItemSubtitle);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.leftIcon);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.menuItemState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMenuItemTitle() {
        return this.menuItemTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMenuItemSubtitle() {
        return this.menuItemSubtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMenuItemState() {
        return this.menuItemState;
    }

    public final ActivitiesItemResponse copy(String menuItemTitle, String menuItemSubtitle, String leftIcon, String rightIcon, String menuItemState) {
        AbstractC22676k.m65750j(menuItemTitle, "menuItemTitle");
        AbstractC22676k.m65750j(menuItemSubtitle, "menuItemSubtitle");
        return new ActivitiesItemResponse(menuItemTitle, menuItemSubtitle, leftIcon, rightIcon, menuItemState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivitiesItemResponse)) {
            return false;
        }
        ActivitiesItemResponse activitiesItemResponse = (ActivitiesItemResponse) other;
        return AbstractC22676k.m65745e(this.menuItemTitle, activitiesItemResponse.menuItemTitle) && AbstractC22676k.m65745e(this.menuItemSubtitle, activitiesItemResponse.menuItemSubtitle) && AbstractC22676k.m65745e(this.leftIcon, activitiesItemResponse.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, activitiesItemResponse.rightIcon) && AbstractC22676k.m65745e(this.menuItemState, activitiesItemResponse.menuItemState);
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getMenuItemState() {
        return this.menuItemState;
    }

    public final String getMenuItemSubtitle() {
        return this.menuItemSubtitle;
    }

    public final String getMenuItemTitle() {
        return this.menuItemTitle;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.menuItemTitle.hashCode() * 31, 31, this.menuItemSubtitle);
        String str = this.leftIcon;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rightIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.menuItemState;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.menuItemTitle;
        String str2 = this.menuItemSubtitle;
        String str3 = this.leftIcon;
        String str4 = this.rightIcon;
        String str5 = this.menuItemState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivitiesItemResponse(menuItemTitle=", str, ", menuItemSubtitle=", str2, ", leftIcon=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", rightIcon=", str4, ", menuItemState=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public ActivitiesItemResponse(String menuItemTitle, String menuItemSubtitle, String str, String str2, String str3) {
        AbstractC22676k.m65750j(menuItemTitle, "menuItemTitle");
        AbstractC22676k.m65750j(menuItemSubtitle, "menuItemSubtitle");
        this.menuItemTitle = menuItemTitle;
        this.menuItemSubtitle = menuItemSubtitle;
        this.leftIcon = str;
        this.rightIcon = str2;
        this.menuItemState = str3;
    }
}
