package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.system.internal;

import io.getstream.chat.android.p226ui.common.permissions.VisualMediaType;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/system/internal/AttachmentsPickerSystemConfig;", "", "visualMediaAttachmentsTabEnabled", "", "visualMediaAllowMultiple", "visualMediaType", "Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;", "fileAttachmentsTabEnabled", "cameraAttachmentsTabEnabled", "pollAttachmentsTabEnabled", "<init>", "(ZZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;ZZZ)V", "getVisualMediaAttachmentsTabEnabled", "()Z", "getVisualMediaAllowMultiple", "getVisualMediaType", "()Lio/getstream/chat/android/ui/common/permissions/VisualMediaType;", "getFileAttachmentsTabEnabled", "getCameraAttachmentsTabEnabled", "getPollAttachmentsTabEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AttachmentsPickerSystemConfig {
    private final boolean cameraAttachmentsTabEnabled;
    private final boolean fileAttachmentsTabEnabled;
    private final boolean pollAttachmentsTabEnabled;
    private final boolean visualMediaAllowMultiple;
    private final boolean visualMediaAttachmentsTabEnabled;
    private final VisualMediaType visualMediaType;

    public AttachmentsPickerSystemConfig(boolean z4, boolean z13, VisualMediaType visualMediaType, boolean z14, boolean z15, boolean z16) {
        AbstractC22676k.m65750j(visualMediaType, "visualMediaType");
        this.visualMediaAttachmentsTabEnabled = z4;
        this.visualMediaAllowMultiple = z13;
        this.visualMediaType = visualMediaType;
        this.fileAttachmentsTabEnabled = z14;
        this.cameraAttachmentsTabEnabled = z15;
        this.pollAttachmentsTabEnabled = z16;
    }

    public static /* synthetic */ AttachmentsPickerSystemConfig copy$default(AttachmentsPickerSystemConfig attachmentsPickerSystemConfig, boolean z4, boolean z13, VisualMediaType visualMediaType, boolean z14, boolean z15, boolean z16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = attachmentsPickerSystemConfig.visualMediaAttachmentsTabEnabled;
        }
        if ((i13 & 2) != 0) {
            z13 = attachmentsPickerSystemConfig.visualMediaAllowMultiple;
        }
        if ((i13 & 4) != 0) {
            visualMediaType = attachmentsPickerSystemConfig.visualMediaType;
        }
        if ((i13 & 8) != 0) {
            z14 = attachmentsPickerSystemConfig.fileAttachmentsTabEnabled;
        }
        if ((i13 & 16) != 0) {
            z15 = attachmentsPickerSystemConfig.cameraAttachmentsTabEnabled;
        }
        if ((i13 & 32) != 0) {
            z16 = attachmentsPickerSystemConfig.pollAttachmentsTabEnabled;
        }
        boolean z17 = z15;
        boolean z18 = z16;
        return attachmentsPickerSystemConfig.copy(z4, z13, visualMediaType, z14, z17, z18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getVisualMediaAttachmentsTabEnabled() {
        return this.visualMediaAttachmentsTabEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getVisualMediaAllowMultiple() {
        return this.visualMediaAllowMultiple;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VisualMediaType getVisualMediaType() {
        return this.visualMediaType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getFileAttachmentsTabEnabled() {
        return this.fileAttachmentsTabEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCameraAttachmentsTabEnabled() {
        return this.cameraAttachmentsTabEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getPollAttachmentsTabEnabled() {
        return this.pollAttachmentsTabEnabled;
    }

    public final AttachmentsPickerSystemConfig copy(boolean visualMediaAttachmentsTabEnabled, boolean visualMediaAllowMultiple, VisualMediaType visualMediaType, boolean fileAttachmentsTabEnabled, boolean cameraAttachmentsTabEnabled, boolean pollAttachmentsTabEnabled) {
        AbstractC22676k.m65750j(visualMediaType, "visualMediaType");
        return new AttachmentsPickerSystemConfig(visualMediaAttachmentsTabEnabled, visualMediaAllowMultiple, visualMediaType, fileAttachmentsTabEnabled, cameraAttachmentsTabEnabled, pollAttachmentsTabEnabled);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentsPickerSystemConfig)) {
            return false;
        }
        AttachmentsPickerSystemConfig attachmentsPickerSystemConfig = (AttachmentsPickerSystemConfig) other;
        return this.visualMediaAttachmentsTabEnabled == attachmentsPickerSystemConfig.visualMediaAttachmentsTabEnabled && this.visualMediaAllowMultiple == attachmentsPickerSystemConfig.visualMediaAllowMultiple && this.visualMediaType == attachmentsPickerSystemConfig.visualMediaType && this.fileAttachmentsTabEnabled == attachmentsPickerSystemConfig.fileAttachmentsTabEnabled && this.cameraAttachmentsTabEnabled == attachmentsPickerSystemConfig.cameraAttachmentsTabEnabled && this.pollAttachmentsTabEnabled == attachmentsPickerSystemConfig.pollAttachmentsTabEnabled;
    }

    public final boolean getCameraAttachmentsTabEnabled() {
        return this.cameraAttachmentsTabEnabled;
    }

    public final boolean getFileAttachmentsTabEnabled() {
        return this.fileAttachmentsTabEnabled;
    }

    public final boolean getPollAttachmentsTabEnabled() {
        return this.pollAttachmentsTabEnabled;
    }

    public final boolean getVisualMediaAllowMultiple() {
        return this.visualMediaAllowMultiple;
    }

    public final boolean getVisualMediaAttachmentsTabEnabled() {
        return this.visualMediaAttachmentsTabEnabled;
    }

    public final VisualMediaType getVisualMediaType() {
        return this.visualMediaType;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.pollAttachmentsTabEnabled) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.visualMediaType.hashCode() + AbstractC2875y.m8289b(Boolean.hashCode(this.visualMediaAttachmentsTabEnabled) * 31, 31, this.visualMediaAllowMultiple)) * 31, 31, this.fileAttachmentsTabEnabled), 31, this.cameraAttachmentsTabEnabled);
    }

    public final String toString() {
        boolean z4 = this.visualMediaAttachmentsTabEnabled;
        boolean z13 = this.visualMediaAllowMultiple;
        VisualMediaType visualMediaType = this.visualMediaType;
        boolean z14 = this.fileAttachmentsTabEnabled;
        boolean z15 = this.cameraAttachmentsTabEnabled;
        boolean z16 = this.pollAttachmentsTabEnabled;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("AttachmentsPickerSystemConfig(visualMediaAttachmentsTabEnabled=", ", visualMediaAllowMultiple=", ", visualMediaType=", z4, z13);
        sbM32002u.append(visualMediaType);
        sbM32002u.append(", fileAttachmentsTabEnabled=");
        sbM32002u.append(z14);
        sbM32002u.append(", cameraAttachmentsTabEnabled=");
        return AbstractC36095b.m114682j(sbM32002u, z15, ", pollAttachmentsTabEnabled=", z16, ")");
    }
}
