package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u0019¨\u00065"}, m65681d2 = {"Lcom/whoop/trends/data/model/ReplaceDialog;", "", "", "title", "description", "primaryButtonTitle", "secondaryButtonTitle", "startingWeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/ReplaceDialog;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/trends/data/model/ReplaceDialog;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "getPrimaryButtonTitle", "getPrimaryButtonTitle$annotations", "getSecondaryButtonTitle", "getSecondaryButtonTitle$annotations", "getStartingWeight", "getStartingWeight$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReplaceDialog {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("description")
    private final String description;

    @SerializedName("primary_button_title")
    private final String primaryButtonTitle;

    @SerializedName("secondary_button_title")
    private final String secondaryButtonTitle;

    @SerializedName("starting_weight")
    private final String startingWeight;

    @SerializedName("title")
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/ReplaceDialog$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/ReplaceDialog;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReplaceDialog$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReplaceDialog(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ReplaceDialog$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.primaryButtonTitle = str3;
        this.secondaryButtonTitle = str4;
        this.startingWeight = str5;
    }

    public static /* synthetic */ ReplaceDialog copy$default(ReplaceDialog replaceDialog, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = replaceDialog.title;
        }
        if ((i13 & 2) != 0) {
            str2 = replaceDialog.description;
        }
        if ((i13 & 4) != 0) {
            str3 = replaceDialog.primaryButtonTitle;
        }
        if ((i13 & 8) != 0) {
            str4 = replaceDialog.secondaryButtonTitle;
        }
        if ((i13 & 16) != 0) {
            str5 = replaceDialog.startingWeight;
        }
        String str6 = str5;
        String str7 = str3;
        return replaceDialog.copy(str, str2, str7, str4, str6);
    }

    @InterfaceC37143h("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("primary_button_title")
    public static /* synthetic */ void getPrimaryButtonTitle$annotations() {
    }

    @InterfaceC37143h("secondary_button_title")
    public static /* synthetic */ void getSecondaryButtonTitle$annotations() {
    }

    @InterfaceC37143h("starting_weight")
    public static /* synthetic */ void getStartingWeight$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(ReplaceDialog self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.description);
        output.encodeStringElement(serialDesc, 2, self.primaryButtonTitle);
        output.encodeStringElement(serialDesc, 3, self.secondaryButtonTitle);
        output.encodeStringElement(serialDesc, 4, self.startingWeight);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStartingWeight() {
        return this.startingWeight;
    }

    public final ReplaceDialog copy(String title, String description, String primaryButtonTitle, String secondaryButtonTitle, String startingWeight) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryButtonTitle, "primaryButtonTitle");
        AbstractC22676k.m65750j(secondaryButtonTitle, "secondaryButtonTitle");
        AbstractC22676k.m65750j(startingWeight, "startingWeight");
        return new ReplaceDialog(title, description, primaryButtonTitle, secondaryButtonTitle, startingWeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplaceDialog)) {
            return false;
        }
        ReplaceDialog replaceDialog = (ReplaceDialog) other;
        return AbstractC22676k.m65745e(this.title, replaceDialog.title) && AbstractC22676k.m65745e(this.description, replaceDialog.description) && AbstractC22676k.m65745e(this.primaryButtonTitle, replaceDialog.primaryButtonTitle) && AbstractC22676k.m65745e(this.secondaryButtonTitle, replaceDialog.secondaryButtonTitle) && AbstractC22676k.m65745e(this.startingWeight, replaceDialog.startingWeight);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    public final String getStartingWeight() {
        return this.startingWeight;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.startingWeight.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description), 31, this.primaryButtonTitle), 31, this.secondaryButtonTitle);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.primaryButtonTitle;
        String str4 = this.secondaryButtonTitle;
        String str5 = this.startingWeight;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReplaceDialog(title=", str, ", description=", str2, ", primaryButtonTitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", secondaryButtonTitle=", str4, ", startingWeight=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public ReplaceDialog(String title, String description, String primaryButtonTitle, String secondaryButtonTitle, String startingWeight) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryButtonTitle, "primaryButtonTitle");
        AbstractC22676k.m65750j(secondaryButtonTitle, "secondaryButtonTitle");
        AbstractC22676k.m65750j(startingWeight, "startingWeight");
        this.title = title;
        this.description = description;
        this.primaryButtonTitle = primaryButtonTitle;
        this.secondaryButtonTitle = secondaryButtonTitle;
        this.startingWeight = startingWeight;
    }
}
