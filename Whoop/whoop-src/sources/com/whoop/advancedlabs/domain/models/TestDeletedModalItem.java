package com.whoop.advancedlabs.domain.models;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;", "", "", "title", "description", "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;", "primaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;)Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;", "getPrimaryButton", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TestDeletedModalItem {
    private final String description;
    private final PrimaryButtonModel primaryButton;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TestDeletedModalItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TestDeletedModalItem(int i13, String str, String str2, PrimaryButtonModel primaryButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, TestDeletedModalItem$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.primaryButton = primaryButtonModel;
    }

    public static /* synthetic */ TestDeletedModalItem copy$default(TestDeletedModalItem testDeletedModalItem, String str, String str2, PrimaryButtonModel primaryButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = testDeletedModalItem.title;
        }
        if ((i13 & 2) != 0) {
            str2 = testDeletedModalItem.description;
        }
        if ((i13 & 4) != 0) {
            primaryButtonModel = testDeletedModalItem.primaryButton;
        }
        return testDeletedModalItem.copy(str, str2, primaryButtonModel);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(TestDeletedModalItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.description);
        output.encodeNullableSerializableElement(serialDesc, 2, PrimaryButtonModel$$serializer.INSTANCE, self.primaryButton);
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
    public final PrimaryButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final TestDeletedModalItem copy(String title, String description, PrimaryButtonModel primaryButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        return new TestDeletedModalItem(title, description, primaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestDeletedModalItem)) {
            return false;
        }
        TestDeletedModalItem testDeletedModalItem = (TestDeletedModalItem) other;
        return AbstractC22676k.m65745e(this.title, testDeletedModalItem.title) && AbstractC22676k.m65745e(this.description, testDeletedModalItem.description) && AbstractC22676k.m65745e(this.primaryButton, testDeletedModalItem.primaryButton);
    }

    public final String getDescription() {
        return this.description;
    }

    public final PrimaryButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description);
        PrimaryButtonModel primaryButtonModel = this.primaryButton;
        return iM30450d + (primaryButtonModel == null ? 0 : primaryButtonModel.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        PrimaryButtonModel primaryButtonModel = this.primaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TestDeletedModalItem(title=", str, ", description=", str2, ", primaryButton=");
        sbM32001t.append(primaryButtonModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public TestDeletedModalItem(String title, String description, PrimaryButtonModel primaryButtonModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.title = title;
        this.description = description;
        this.primaryButton = primaryButtonModel;
    }
}
