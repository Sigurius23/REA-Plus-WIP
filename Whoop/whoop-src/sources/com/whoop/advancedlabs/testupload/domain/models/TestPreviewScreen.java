package com.whoop.advancedlabs.testupload.domain.models;

import com.whoop.advancedlabs.domain.models.NavigationBarModel;
import com.whoop.advancedlabs.domain.models.NavigationBarModel$$serializer;
import com.whoop.design.models.items.TagModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001e¨\u00063"}, m65681d2 = {"Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;", "", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "", "coachFooter", "Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;", "reuploadButton", "saveButton", "<init>", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;", "component4", "copy", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/lang/String;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;)Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "getNavigationBar", "Ljava/lang/String;", "getCoachFooter", "Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;", "getReuploadButton", "getSaveButton", "Companion", "$serializer", "a", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TestPreviewScreen {
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String coachFooter;
    private final NavigationBarModel navigationBar;
    private final ButtonModel reuploadButton;
    private final ButtonModel saveButton;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testupload.domain.models.TestPreviewScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TestPreviewScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        $stable = i13 | TagModel.$stable | i13;
    }

    public /* synthetic */ TestPreviewScreen(int i13, NavigationBarModel navigationBarModel, String str, ButtonModel buttonModel, ButtonModel buttonModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, TestPreviewScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = navigationBarModel;
        this.coachFooter = str;
        this.reuploadButton = buttonModel;
        this.saveButton = buttonModel2;
    }

    public static /* synthetic */ TestPreviewScreen copy$default(TestPreviewScreen testPreviewScreen, NavigationBarModel navigationBarModel, String str, ButtonModel buttonModel, ButtonModel buttonModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = testPreviewScreen.navigationBar;
        }
        if ((i13 & 2) != 0) {
            str = testPreviewScreen.coachFooter;
        }
        if ((i13 & 4) != 0) {
            buttonModel = testPreviewScreen.reuploadButton;
        }
        if ((i13 & 8) != 0) {
            buttonModel2 = testPreviewScreen.saveButton;
        }
        return testPreviewScreen.copy(navigationBarModel, str, buttonModel, buttonModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(TestPreviewScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.coachFooter);
        ButtonModel$$serializer buttonModel$$serializer = ButtonModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, buttonModel$$serializer, self.reuploadButton);
        output.encodeSerializableElement(serialDesc, 3, buttonModel$$serializer, self.saveButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCoachFooter() {
        return this.coachFooter;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ButtonModel getReuploadButton() {
        return this.reuploadButton;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ButtonModel getSaveButton() {
        return this.saveButton;
    }

    public final TestPreviewScreen copy(NavigationBarModel navigationBar, String coachFooter, ButtonModel reuploadButton, ButtonModel saveButton) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(reuploadButton, "reuploadButton");
        AbstractC22676k.m65750j(saveButton, "saveButton");
        return new TestPreviewScreen(navigationBar, coachFooter, reuploadButton, saveButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestPreviewScreen)) {
            return false;
        }
        TestPreviewScreen testPreviewScreen = (TestPreviewScreen) other;
        return AbstractC22676k.m65745e(this.navigationBar, testPreviewScreen.navigationBar) && AbstractC22676k.m65745e(this.coachFooter, testPreviewScreen.coachFooter) && AbstractC22676k.m65745e(this.reuploadButton, testPreviewScreen.reuploadButton) && AbstractC22676k.m65745e(this.saveButton, testPreviewScreen.saveButton);
    }

    public final String getCoachFooter() {
        return this.coachFooter;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final ButtonModel getReuploadButton() {
        return this.reuploadButton;
    }

    public final ButtonModel getSaveButton() {
        return this.saveButton;
    }

    public int hashCode() {
        int iHashCode = this.navigationBar.hashCode() * 31;
        String str = this.coachFooter;
        return this.saveButton.hashCode() + ((this.reuploadButton.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        return "TestPreviewScreen(navigationBar=" + this.navigationBar + ", coachFooter=" + this.coachFooter + ", reuploadButton=" + this.reuploadButton + ", saveButton=" + this.saveButton + ")";
    }

    public TestPreviewScreen(NavigationBarModel navigationBar, String str, ButtonModel reuploadButton, ButtonModel saveButton) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(reuploadButton, "reuploadButton");
        AbstractC22676k.m65750j(saveButton, "saveButton");
        this.navigationBar = navigationBar;
        this.coachFooter = str;
        this.reuploadButton = reuploadButton;
        this.saveButton = saveButton;
    }
}
