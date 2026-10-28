package com.whoop.weightlifting.feature.onerepmax.manualentry.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b/\u0010\u001c¨\u00063"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;", "", "", "saveButtonTitle", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;", "saveConfirmDialog", "caption", "deleteButtonTitle", "deleteConfirmDialog", "<init>", "(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSaveButtonTitle", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;", "getSaveConfirmDialog", "getCaption", "getDeleteButtonTitle", "getDeleteConfirmDialog", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OneRepMaxFooter {
    private final String caption;
    private final String deleteButtonTitle;
    private final OneRepMaxConfirmDialog deleteConfirmDialog;
    private final String saveButtonTitle;
    private final OneRepMaxConfirmDialog saveConfirmDialog;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxFooter$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OneRepMaxFooter$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OneRepMaxFooter(int i13, String str, OneRepMaxConfirmDialog oneRepMaxConfirmDialog, String str2, String str3, OneRepMaxConfirmDialog oneRepMaxConfirmDialog2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, OneRepMaxFooter$$serializer.INSTANCE.getDescriptor());
        }
        this.saveButtonTitle = str;
        this.saveConfirmDialog = oneRepMaxConfirmDialog;
        this.caption = str2;
        this.deleteButtonTitle = str3;
        this.deleteConfirmDialog = oneRepMaxConfirmDialog2;
    }

    public static /* synthetic */ OneRepMaxFooter copy$default(OneRepMaxFooter oneRepMaxFooter, String str, OneRepMaxConfirmDialog oneRepMaxConfirmDialog, String str2, String str3, OneRepMaxConfirmDialog oneRepMaxConfirmDialog2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = oneRepMaxFooter.saveButtonTitle;
        }
        if ((i13 & 2) != 0) {
            oneRepMaxConfirmDialog = oneRepMaxFooter.saveConfirmDialog;
        }
        if ((i13 & 4) != 0) {
            str2 = oneRepMaxFooter.caption;
        }
        if ((i13 & 8) != 0) {
            str3 = oneRepMaxFooter.deleteButtonTitle;
        }
        if ((i13 & 16) != 0) {
            oneRepMaxConfirmDialog2 = oneRepMaxFooter.deleteConfirmDialog;
        }
        OneRepMaxConfirmDialog oneRepMaxConfirmDialog3 = oneRepMaxConfirmDialog2;
        String str4 = str2;
        return oneRepMaxFooter.copy(str, oneRepMaxConfirmDialog, str4, str3, oneRepMaxConfirmDialog3);
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(OneRepMaxFooter self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.saveButtonTitle);
        OneRepMaxConfirmDialog$$serializer oneRepMaxConfirmDialog$$serializer = OneRepMaxConfirmDialog$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, oneRepMaxConfirmDialog$$serializer, self.saveConfirmDialog);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.caption);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.deleteButtonTitle);
        output.encodeNullableSerializableElement(serialDesc, 4, oneRepMaxConfirmDialog$$serializer, self.deleteConfirmDialog);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OneRepMaxConfirmDialog getSaveConfirmDialog() {
        return this.saveConfirmDialog;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeleteButtonTitle() {
        return this.deleteButtonTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OneRepMaxConfirmDialog getDeleteConfirmDialog() {
        return this.deleteConfirmDialog;
    }

    public final OneRepMaxFooter copy(String saveButtonTitle, OneRepMaxConfirmDialog saveConfirmDialog, String caption, String deleteButtonTitle, OneRepMaxConfirmDialog deleteConfirmDialog) {
        AbstractC22676k.m65750j(saveButtonTitle, "saveButtonTitle");
        AbstractC22676k.m65750j(saveConfirmDialog, "saveConfirmDialog");
        return new OneRepMaxFooter(saveButtonTitle, saveConfirmDialog, caption, deleteButtonTitle, deleteConfirmDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneRepMaxFooter)) {
            return false;
        }
        OneRepMaxFooter oneRepMaxFooter = (OneRepMaxFooter) other;
        return AbstractC22676k.m65745e(this.saveButtonTitle, oneRepMaxFooter.saveButtonTitle) && AbstractC22676k.m65745e(this.saveConfirmDialog, oneRepMaxFooter.saveConfirmDialog) && AbstractC22676k.m65745e(this.caption, oneRepMaxFooter.caption) && AbstractC22676k.m65745e(this.deleteButtonTitle, oneRepMaxFooter.deleteButtonTitle) && AbstractC22676k.m65745e(this.deleteConfirmDialog, oneRepMaxFooter.deleteConfirmDialog);
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getDeleteButtonTitle() {
        return this.deleteButtonTitle;
    }

    public final OneRepMaxConfirmDialog getDeleteConfirmDialog() {
        return this.deleteConfirmDialog;
    }

    public final String getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    public final OneRepMaxConfirmDialog getSaveConfirmDialog() {
        return this.saveConfirmDialog;
    }

    public int hashCode() {
        int iHashCode = (this.saveConfirmDialog.hashCode() + (this.saveButtonTitle.hashCode() * 31)) * 31;
        String str = this.caption;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deleteButtonTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OneRepMaxConfirmDialog oneRepMaxConfirmDialog = this.deleteConfirmDialog;
        return iHashCode3 + (oneRepMaxConfirmDialog != null ? oneRepMaxConfirmDialog.hashCode() : 0);
    }

    public String toString() {
        String str = this.saveButtonTitle;
        OneRepMaxConfirmDialog oneRepMaxConfirmDialog = this.saveConfirmDialog;
        String str2 = this.caption;
        String str3 = this.deleteButtonTitle;
        OneRepMaxConfirmDialog oneRepMaxConfirmDialog2 = this.deleteConfirmDialog;
        StringBuilder sb4 = new StringBuilder("OneRepMaxFooter(saveButtonTitle=");
        sb4.append(str);
        sb4.append(", saveConfirmDialog=");
        sb4.append(oneRepMaxConfirmDialog);
        sb4.append(", caption=");
        AbstractC11266d.m30444B(sb4, str2, ", deleteButtonTitle=", str3, ", deleteConfirmDialog=");
        sb4.append(oneRepMaxConfirmDialog2);
        sb4.append(")");
        return sb4.toString();
    }

    public OneRepMaxFooter(String saveButtonTitle, OneRepMaxConfirmDialog saveConfirmDialog, String str, String str2, OneRepMaxConfirmDialog oneRepMaxConfirmDialog) {
        AbstractC22676k.m65750j(saveButtonTitle, "saveButtonTitle");
        AbstractC22676k.m65750j(saveConfirmDialog, "saveConfirmDialog");
        this.saveButtonTitle = saveButtonTitle;
        this.saveConfirmDialog = saveConfirmDialog;
        this.caption = str;
        this.deleteButtonTitle = str2;
        this.deleteConfirmDialog = oneRepMaxConfirmDialog;
    }
}
