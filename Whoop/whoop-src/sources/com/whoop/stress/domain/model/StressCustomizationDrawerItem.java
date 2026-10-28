package com.whoop.stress.domain.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
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
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b4\u0010+\u001a\u0004\b3\u0010\u001f¨\u00068"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem;", "", "", "id", "label", "subLabel", "description", "", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$stress_release", "(Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getLabel", "getLabel$annotations", "getSubLabel", "getSubLabel$annotations", "getDescription", "getDescription$annotations", "Z", "getSelected", "getSelected$annotations", "Companion", "$serializer", "a", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressCustomizationDrawerItem {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("description_display")
    private final String description;

    @SerializedName("id")
    private final String id;

    @SerializedName("label_display")
    private final String label;

    @SerializedName("selected")
    private final boolean selected;

    @SerializedName("sub_label_display")
    private final String subLabel;

    /* JADX INFO: renamed from: com.whoop.stress.domain.model.StressCustomizationDrawerItem$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem;", "serializer", "()Lwc3/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressCustomizationDrawerItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StressCustomizationDrawerItem(int i13, String str, String str2, String str3, String str4, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, StressCustomizationDrawerItem$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.label = str2;
        this.subLabel = str3;
        this.description = str4;
        this.selected = z4;
    }

    public static /* synthetic */ StressCustomizationDrawerItem copy$default(StressCustomizationDrawerItem stressCustomizationDrawerItem, String str, String str2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stressCustomizationDrawerItem.id;
        }
        if ((i13 & 2) != 0) {
            str2 = stressCustomizationDrawerItem.label;
        }
        if ((i13 & 4) != 0) {
            str3 = stressCustomizationDrawerItem.subLabel;
        }
        if ((i13 & 8) != 0) {
            str4 = stressCustomizationDrawerItem.description;
        }
        if ((i13 & 16) != 0) {
            z4 = stressCustomizationDrawerItem.selected;
        }
        boolean z13 = z4;
        String str5 = str3;
        return stressCustomizationDrawerItem.copy(str, str2, str5, str4, z13);
    }

    @InterfaceC37143h("description_display")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("label_display")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @InterfaceC37143h("selected")
    public static /* synthetic */ void getSelected$annotations() {
    }

    @InterfaceC37143h("sub_label_display")
    public static /* synthetic */ void getSubLabel$annotations() {
    }

    public static final /* synthetic */ void write$Self$stress_release(StressCustomizationDrawerItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subLabel);
        output.encodeStringElement(serialDesc, 3, self.description);
        output.encodeBooleanElement(serialDesc, 4, self.selected);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubLabel() {
        return this.subLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final StressCustomizationDrawerItem copy(String id4, String label, String subLabel, String description, boolean selected) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(description, "description");
        return new StressCustomizationDrawerItem(id4, label, subLabel, description, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressCustomizationDrawerItem)) {
            return false;
        }
        StressCustomizationDrawerItem stressCustomizationDrawerItem = (StressCustomizationDrawerItem) other;
        return AbstractC22676k.m65745e(this.id, stressCustomizationDrawerItem.id) && AbstractC22676k.m65745e(this.label, stressCustomizationDrawerItem.label) && AbstractC22676k.m65745e(this.subLabel, stressCustomizationDrawerItem.subLabel) && AbstractC22676k.m65745e(this.description, stressCustomizationDrawerItem.description) && this.selected == stressCustomizationDrawerItem.selected;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getSubLabel() {
        return this.subLabel;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.label);
        String str = this.subLabel;
        return Boolean.hashCode(this.selected) + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.description);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        String str3 = this.subLabel;
        String str4 = this.description;
        boolean z4 = this.selected;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StressCustomizationDrawerItem(id=", str, ", label=", str2, ", subLabel=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", description=", str4, ", selected=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public StressCustomizationDrawerItem(String id4, String label, String str, String description, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(description, "description");
        this.id = id4;
        this.label = label;
        this.subLabel = str;
        this.description = description;
        this.selected = z4;
    }
}
