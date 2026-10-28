package com.whoop.advancedlabs.testupload.domain.models;

import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel$$serializer;
import com.whoop.advancedlabs.domain.models.NavigationBarModel;
import com.whoop.advancedlabs.domain.models.NavigationBarModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xa1.C38138a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010\u001f¨\u00066"}, m65681d2 = {"Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;", "", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;", "sections", "Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;", "fileSelectButton", "imageSelectButton", "<init>", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;", "component4", "copy", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;)Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "getNavigationBar", "Ljava/util/List;", "getSections", "Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;", "getFileSelectButton", "getImageSelectButton", "Companion", "$serializer", "a", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TestUploadScreen {
    private final ButtonModel fileSelectButton;
    private final ButtonModel imageSelectButton;
    private final NavigationBarModel navigationBar;
    private final List<AdvancedLabsSectionModel> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38138a(6)), null, null};

    /* JADX INFO: renamed from: com.whoop.advancedlabs.testupload.domain.models.TestUploadScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TestUploadScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TestUploadScreen(int i13, NavigationBarModel navigationBarModel, List list, ButtonModel buttonModel, ButtonModel buttonModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, TestUploadScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = navigationBarModel;
        this.sections = list;
        this.fileSelectButton = buttonModel;
        this.imageSelectButton = buttonModel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AdvancedLabsSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestUploadScreen copy$default(TestUploadScreen testUploadScreen, NavigationBarModel navigationBarModel, List list, ButtonModel buttonModel, ButtonModel buttonModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = testUploadScreen.navigationBar;
        }
        if ((i13 & 2) != 0) {
            list = testUploadScreen.sections;
        }
        if ((i13 & 4) != 0) {
            buttonModel = testUploadScreen.fileSelectButton;
        }
        if ((i13 & 8) != 0) {
            buttonModel2 = testUploadScreen.imageSelectButton;
        }
        return testUploadScreen.copy(navigationBarModel, list, buttonModel, buttonModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(TestUploadScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        ButtonModel$$serializer buttonModel$$serializer = ButtonModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, buttonModel$$serializer, self.fileSelectButton);
        output.encodeSerializableElement(serialDesc, 3, buttonModel$$serializer, self.imageSelectButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<AdvancedLabsSectionModel> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ButtonModel getFileSelectButton() {
        return this.fileSelectButton;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ButtonModel getImageSelectButton() {
        return this.imageSelectButton;
    }

    public final TestUploadScreen copy(NavigationBarModel navigationBar, List<AdvancedLabsSectionModel> sections, ButtonModel fileSelectButton, ButtonModel imageSelectButton) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(fileSelectButton, "fileSelectButton");
        AbstractC22676k.m65750j(imageSelectButton, "imageSelectButton");
        return new TestUploadScreen(navigationBar, sections, fileSelectButton, imageSelectButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestUploadScreen)) {
            return false;
        }
        TestUploadScreen testUploadScreen = (TestUploadScreen) other;
        return AbstractC22676k.m65745e(this.navigationBar, testUploadScreen.navigationBar) && AbstractC22676k.m65745e(this.sections, testUploadScreen.sections) && AbstractC22676k.m65745e(this.fileSelectButton, testUploadScreen.fileSelectButton) && AbstractC22676k.m65745e(this.imageSelectButton, testUploadScreen.imageSelectButton);
    }

    public final ButtonModel getFileSelectButton() {
        return this.fileSelectButton;
    }

    public final ButtonModel getImageSelectButton() {
        return this.imageSelectButton;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<AdvancedLabsSectionModel> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.imageSelectButton.hashCode() + ((this.fileSelectButton.hashCode() + AbstractC11895b.m31983b(this.navigationBar.hashCode() * 31, 31, this.sections)) * 31);
    }

    public String toString() {
        return "TestUploadScreen(navigationBar=" + this.navigationBar + ", sections=" + this.sections + ", fileSelectButton=" + this.fileSelectButton + ", imageSelectButton=" + this.imageSelectButton + ")";
    }

    public TestUploadScreen(NavigationBarModel navigationBar, List<AdvancedLabsSectionModel> sections, ButtonModel fileSelectButton, ButtonModel imageSelectButton) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(fileSelectButton, "fileSelectButton");
        AbstractC22676k.m65750j(imageSelectButton, "imageSelectButton");
        this.navigationBar = navigationBar;
        this.sections = sections;
        this.fileSelectButton = fileSelectButton;
        this.imageSelectButton = imageSelectButton;
    }
}
