package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%JP\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;", "", "", "title", "subtitle", "searchHeaderDisplay", "Lcom/whoop/advancedlabs/domain/models/TestTileModel;", "testTile", "Lcom/whoop/advancedlabs/domain/models/FormContent;", "formContent", "Lcom/whoop/advancedlabs/domain/models/SchedulingButton;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/advancedlabs/domain/models/TestTileModel;", "component5", "()Lcom/whoop/advancedlabs/domain/models/FormContent;", "component6", "()Lcom/whoop/advancedlabs/domain/models/SchedulingButton;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestTileModel;Lcom/whoop/advancedlabs/domain/models/FormContent;Lcom/whoop/advancedlabs/domain/models/SchedulingButton;)Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getSearchHeaderDisplay", "Lcom/whoop/advancedlabs/domain/models/TestTileModel;", "getTestTile", "Lcom/whoop/advancedlabs/domain/models/FormContent;", "getFormContent", "Lcom/whoop/advancedlabs/domain/models/SchedulingButton;", "getButton", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SchedulingFormResponse {
    private final SchedulingButton button;
    private final FormContent formContent;
    private final String searchHeaderDisplay;
    private final String subtitle;
    private final TestTileModel testTile;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SchedulingFormResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SchedulingFormResponse(int i13, String str, String str2, String str3, TestTileModel testTileModel, FormContent formContent, SchedulingButton schedulingButton, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, SchedulingFormResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.searchHeaderDisplay = str3;
        this.testTile = testTileModel;
        this.formContent = formContent;
        this.button = schedulingButton;
    }

    public static /* synthetic */ SchedulingFormResponse copy$default(SchedulingFormResponse schedulingFormResponse, String str, String str2, String str3, TestTileModel testTileModel, FormContent formContent, SchedulingButton schedulingButton, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = schedulingFormResponse.title;
        }
        if ((i13 & 2) != 0) {
            str2 = schedulingFormResponse.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = schedulingFormResponse.searchHeaderDisplay;
        }
        if ((i13 & 8) != 0) {
            testTileModel = schedulingFormResponse.testTile;
        }
        if ((i13 & 16) != 0) {
            formContent = schedulingFormResponse.formContent;
        }
        if ((i13 & 32) != 0) {
            schedulingButton = schedulingFormResponse.button;
        }
        FormContent formContent2 = formContent;
        SchedulingButton schedulingButton2 = schedulingButton;
        return schedulingFormResponse.copy(str, str2, str3, testTileModel, formContent2, schedulingButton2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(SchedulingFormResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeStringElement(serialDesc, 2, self.searchHeaderDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, TestTileModel$$serializer.INSTANCE, self.testTile);
        output.encodeNullableSerializableElement(serialDesc, 4, FormContent$$serializer.INSTANCE, self.formContent);
        output.encodeSerializableElement(serialDesc, 5, SchedulingButton$$serializer.INSTANCE, self.button);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSearchHeaderDisplay() {
        return this.searchHeaderDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TestTileModel getTestTile() {
        return this.testTile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FormContent getFormContent() {
        return this.formContent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SchedulingButton getButton() {
        return this.button;
    }

    public final SchedulingFormResponse copy(String title, String subtitle, String searchHeaderDisplay, TestTileModel testTile, FormContent formContent, SchedulingButton button) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(searchHeaderDisplay, "searchHeaderDisplay");
        AbstractC22676k.m65750j(button, "button");
        return new SchedulingFormResponse(title, subtitle, searchHeaderDisplay, testTile, formContent, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchedulingFormResponse)) {
            return false;
        }
        SchedulingFormResponse schedulingFormResponse = (SchedulingFormResponse) other;
        return AbstractC22676k.m65745e(this.title, schedulingFormResponse.title) && AbstractC22676k.m65745e(this.subtitle, schedulingFormResponse.subtitle) && AbstractC22676k.m65745e(this.searchHeaderDisplay, schedulingFormResponse.searchHeaderDisplay) && AbstractC22676k.m65745e(this.testTile, schedulingFormResponse.testTile) && AbstractC22676k.m65745e(this.formContent, schedulingFormResponse.formContent) && AbstractC22676k.m65745e(this.button, schedulingFormResponse.button);
    }

    public final SchedulingButton getButton() {
        return this.button;
    }

    public final FormContent getFormContent() {
        return this.formContent;
    }

    public final String getSearchHeaderDisplay() {
        return this.searchHeaderDisplay;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TestTileModel getTestTile() {
        return this.testTile;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.searchHeaderDisplay);
        TestTileModel testTileModel = this.testTile;
        int iHashCode = (iM30450d + (testTileModel == null ? 0 : testTileModel.hashCode())) * 31;
        FormContent formContent = this.formContent;
        return this.button.hashCode() + ((iHashCode + (formContent != null ? formContent.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.searchHeaderDisplay;
        TestTileModel testTileModel = this.testTile;
        FormContent formContent = this.formContent;
        SchedulingButton schedulingButton = this.button;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SchedulingFormResponse(title=", str, ", subtitle=", str2, ", searchHeaderDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", testTile=");
        sbM32001t.append(testTileModel);
        sbM32001t.append(", formContent=");
        sbM32001t.append(formContent);
        sbM32001t.append(", button=");
        sbM32001t.append(schedulingButton);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SchedulingFormResponse(String title, String subtitle, String searchHeaderDisplay, TestTileModel testTileModel, FormContent formContent, SchedulingButton button) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(searchHeaderDisplay, "searchHeaderDisplay");
        AbstractC22676k.m65750j(button, "button");
        this.title = title;
        this.subtitle = subtitle;
        this.searchHeaderDisplay = searchHeaderDisplay;
        this.testTile = testTileModel;
        this.formContent = formContent;
        this.button = button;
    }
}
