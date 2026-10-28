package com.whoop.hormonalinsights.pregnancyinsights.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010#¨\u00067"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;", "", "", "title", "editMethodDisplay", "editDateDisplay", "editNameDisplay", "editWeightDisplay", "deleteDisplay", "", "allowEdit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getEditMethodDisplay", "getEditDateDisplay", "getEditNameDisplay", "getEditWeightDisplay", "getDeleteDisplay", "Z", "getAllowEdit", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BottomSheet {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean allowEdit;
    private final String deleteDisplay;
    private final String editDateDisplay;
    private final String editMethodDisplay;
    private final String editNameDisplay;
    private final String editWeightDisplay;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BottomSheet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BottomSheet(int i13, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, BottomSheet$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.editMethodDisplay = str2;
        this.editDateDisplay = str3;
        this.editNameDisplay = str4;
        this.editWeightDisplay = str5;
        this.deleteDisplay = str6;
        this.allowEdit = z4;
    }

    public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, String str, String str2, String str3, String str4, String str5, String str6, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bottomSheet.title;
        }
        if ((i13 & 2) != 0) {
            str2 = bottomSheet.editMethodDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = bottomSheet.editDateDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = bottomSheet.editNameDisplay;
        }
        if ((i13 & 16) != 0) {
            str5 = bottomSheet.editWeightDisplay;
        }
        if ((i13 & 32) != 0) {
            str6 = bottomSheet.deleteDisplay;
        }
        if ((i13 & 64) != 0) {
            z4 = bottomSheet.allowEdit;
        }
        String str7 = str6;
        boolean z13 = z4;
        String str8 = str5;
        String str9 = str3;
        return bottomSheet.copy(str, str2, str9, str4, str8, str7, z13);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(BottomSheet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.editMethodDisplay);
        output.encodeStringElement(serialDesc, 2, self.editDateDisplay);
        output.encodeStringElement(serialDesc, 3, self.editNameDisplay);
        output.encodeStringElement(serialDesc, 4, self.editWeightDisplay);
        output.encodeStringElement(serialDesc, 5, self.deleteDisplay);
        output.encodeBooleanElement(serialDesc, 6, self.allowEdit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEditMethodDisplay() {
        return this.editMethodDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEditDateDisplay() {
        return this.editDateDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEditNameDisplay() {
        return this.editNameDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEditWeightDisplay() {
        return this.editWeightDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeleteDisplay() {
        return this.deleteDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getAllowEdit() {
        return this.allowEdit;
    }

    public final BottomSheet copy(String title, String editMethodDisplay, String editDateDisplay, String editNameDisplay, String editWeightDisplay, String deleteDisplay, boolean allowEdit) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(editMethodDisplay, "editMethodDisplay");
        AbstractC22676k.m65750j(editDateDisplay, "editDateDisplay");
        AbstractC22676k.m65750j(editNameDisplay, "editNameDisplay");
        AbstractC22676k.m65750j(editWeightDisplay, "editWeightDisplay");
        AbstractC22676k.m65750j(deleteDisplay, "deleteDisplay");
        return new BottomSheet(title, editMethodDisplay, editDateDisplay, editNameDisplay, editWeightDisplay, deleteDisplay, allowEdit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheet)) {
            return false;
        }
        BottomSheet bottomSheet = (BottomSheet) other;
        return AbstractC22676k.m65745e(this.title, bottomSheet.title) && AbstractC22676k.m65745e(this.editMethodDisplay, bottomSheet.editMethodDisplay) && AbstractC22676k.m65745e(this.editDateDisplay, bottomSheet.editDateDisplay) && AbstractC22676k.m65745e(this.editNameDisplay, bottomSheet.editNameDisplay) && AbstractC22676k.m65745e(this.editWeightDisplay, bottomSheet.editWeightDisplay) && AbstractC22676k.m65745e(this.deleteDisplay, bottomSheet.deleteDisplay) && this.allowEdit == bottomSheet.allowEdit;
    }

    public final boolean getAllowEdit() {
        return this.allowEdit;
    }

    public final String getDeleteDisplay() {
        return this.deleteDisplay;
    }

    public final String getEditDateDisplay() {
        return this.editDateDisplay;
    }

    public final String getEditMethodDisplay() {
        return this.editMethodDisplay;
    }

    public final String getEditNameDisplay() {
        return this.editNameDisplay;
    }

    public final String getEditWeightDisplay() {
        return this.editWeightDisplay;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.allowEdit) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.editMethodDisplay), 31, this.editDateDisplay), 31, this.editNameDisplay), 31, this.editWeightDisplay), 31, this.deleteDisplay);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.editMethodDisplay;
        String str3 = this.editDateDisplay;
        String str4 = this.editNameDisplay;
        String str5 = this.editWeightDisplay;
        String str6 = this.deleteDisplay;
        boolean z4 = this.allowEdit;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BottomSheet(title=", str, ", editMethodDisplay=", str2, ", editDateDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", editNameDisplay=", str4, ", editWeightDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", deleteDisplay=", str6, ", allowEdit=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public BottomSheet(String title, String editMethodDisplay, String editDateDisplay, String editNameDisplay, String editWeightDisplay, String deleteDisplay, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(editMethodDisplay, "editMethodDisplay");
        AbstractC22676k.m65750j(editDateDisplay, "editDateDisplay");
        AbstractC22676k.m65750j(editNameDisplay, "editNameDisplay");
        AbstractC22676k.m65750j(editWeightDisplay, "editWeightDisplay");
        AbstractC22676k.m65750j(deleteDisplay, "deleteDisplay");
        this.title = title;
        this.editMethodDisplay = editMethodDisplay;
        this.editDateDisplay = editDateDisplay;
        this.editNameDisplay = editNameDisplay;
        this.editWeightDisplay = editWeightDisplay;
        this.deleteDisplay = deleteDisplay;
        this.allowEdit = z4;
    }
}
