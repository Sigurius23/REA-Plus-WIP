package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.List;
import jh3.AbstractC21702c;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003JS\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/android/video/generated/models/FileUploadConfig;", "", "sizeLimit", "", "allowedFileExtensions", "", "", "allowedMimeTypes", "blockedFileExtensions", "blockedMimeTypes", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAllowedFileExtensions", "()Ljava/util/List;", "getAllowedMimeTypes", "getBlockedFileExtensions", "getBlockedMimeTypes", "getSizeLimit", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class FileUploadConfig {
    private final List<String> allowedFileExtensions;
    private final List<String> allowedMimeTypes;
    private final List<String> blockedFileExtensions;
    private final List<String> blockedMimeTypes;
    private final int sizeLimit;

    public FileUploadConfig(@InterfaceC30731q(name = "size_limit") int i13, @InterfaceC30731q(name = "allowed_file_extensions") List<String> allowedFileExtensions, @InterfaceC30731q(name = "allowed_mime_types") List<String> allowedMimeTypes, @InterfaceC30731q(name = "blocked_file_extensions") List<String> blockedFileExtensions, @InterfaceC30731q(name = "blocked_mime_types") List<String> blockedMimeTypes) {
        AbstractC22676k.m65750j(allowedFileExtensions, "allowedFileExtensions");
        AbstractC22676k.m65750j(allowedMimeTypes, "allowedMimeTypes");
        AbstractC22676k.m65750j(blockedFileExtensions, "blockedFileExtensions");
        AbstractC22676k.m65750j(blockedMimeTypes, "blockedMimeTypes");
        this.sizeLimit = i13;
        this.allowedFileExtensions = allowedFileExtensions;
        this.allowedMimeTypes = allowedMimeTypes;
        this.blockedFileExtensions = blockedFileExtensions;
        this.blockedMimeTypes = blockedMimeTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileUploadConfig copy$default(FileUploadConfig fileUploadConfig, int i13, List list, List list2, List list3, List list4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = fileUploadConfig.sizeLimit;
        }
        if ((i14 & 2) != 0) {
            list = fileUploadConfig.allowedFileExtensions;
        }
        if ((i14 & 4) != 0) {
            list2 = fileUploadConfig.allowedMimeTypes;
        }
        if ((i14 & 8) != 0) {
            list3 = fileUploadConfig.blockedFileExtensions;
        }
        if ((i14 & 16) != 0) {
            list4 = fileUploadConfig.blockedMimeTypes;
        }
        List list5 = list4;
        List list6 = list2;
        return fileUploadConfig.copy(i13, list, list6, list3, list5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSizeLimit() {
        return this.sizeLimit;
    }

    public final List<String> component2() {
        return this.allowedFileExtensions;
    }

    public final List<String> component3() {
        return this.allowedMimeTypes;
    }

    public final List<String> component4() {
        return this.blockedFileExtensions;
    }

    public final List<String> component5() {
        return this.blockedMimeTypes;
    }

    public final FileUploadConfig copy(@InterfaceC30731q(name = "size_limit") int sizeLimit, @InterfaceC30731q(name = "allowed_file_extensions") List<String> allowedFileExtensions, @InterfaceC30731q(name = "allowed_mime_types") List<String> allowedMimeTypes, @InterfaceC30731q(name = "blocked_file_extensions") List<String> blockedFileExtensions, @InterfaceC30731q(name = "blocked_mime_types") List<String> blockedMimeTypes) {
        AbstractC22676k.m65750j(allowedFileExtensions, "allowedFileExtensions");
        AbstractC22676k.m65750j(allowedMimeTypes, "allowedMimeTypes");
        AbstractC22676k.m65750j(blockedFileExtensions, "blockedFileExtensions");
        AbstractC22676k.m65750j(blockedMimeTypes, "blockedMimeTypes");
        return new FileUploadConfig(sizeLimit, allowedFileExtensions, allowedMimeTypes, blockedFileExtensions, blockedMimeTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUploadConfig)) {
            return false;
        }
        FileUploadConfig fileUploadConfig = (FileUploadConfig) other;
        return this.sizeLimit == fileUploadConfig.sizeLimit && AbstractC22676k.m65745e(this.allowedFileExtensions, fileUploadConfig.allowedFileExtensions) && AbstractC22676k.m65745e(this.allowedMimeTypes, fileUploadConfig.allowedMimeTypes) && AbstractC22676k.m65745e(this.blockedFileExtensions, fileUploadConfig.blockedFileExtensions) && AbstractC22676k.m65745e(this.blockedMimeTypes, fileUploadConfig.blockedMimeTypes);
    }

    public final List<String> getAllowedFileExtensions() {
        return this.allowedFileExtensions;
    }

    public final List<String> getAllowedMimeTypes() {
        return this.allowedMimeTypes;
    }

    public final List<String> getBlockedFileExtensions() {
        return this.blockedFileExtensions;
    }

    public final List<String> getBlockedMimeTypes() {
        return this.blockedMimeTypes;
    }

    public final int getSizeLimit() {
        return this.sizeLimit;
    }

    public int hashCode() {
        return this.blockedMimeTypes.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(Integer.hashCode(this.sizeLimit) * 31, 31, this.allowedFileExtensions), 31, this.allowedMimeTypes), 31, this.blockedFileExtensions);
    }

    public String toString() {
        int i13 = this.sizeLimit;
        List<String> list = this.allowedFileExtensions;
        List<String> list2 = this.allowedMimeTypes;
        List<String> list3 = this.blockedFileExtensions;
        List<String> list4 = this.blockedMimeTypes;
        StringBuilder sb4 = new StringBuilder("FileUploadConfig(sizeLimit=");
        sb4.append(i13);
        sb4.append(", allowedFileExtensions=");
        sb4.append(list);
        sb4.append(", allowedMimeTypes=");
        AbstractC21702c.m61148s(sb4, list2, ", blockedFileExtensions=", list3, ", blockedMimeTypes=");
        return AbstractC3855a.m11829m(sb4, list4, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FileUploadConfig(int i13, List list, List list2, List list3, List list4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        int i15 = i14 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(i13, i15 != 0 ? c25271y : list, (i14 & 4) != 0 ? c25271y : list2, (i14 & 8) != 0 ? c25271y : list3, (i14 & 16) != 0 ? c25271y : list4);
    }
}
