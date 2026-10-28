package io.getstream.chat.android.models;

import java.util.List;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JS\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/models/FileUploadConfig;", "", "allowedFileExtensions", "", "", "allowedMimeTypes", "blockedFileExtensions", "blockedMimeTypes", "sizeLimitInBytes", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;J)V", "getAllowedFileExtensions", "()Ljava/util/List;", "getAllowedMimeTypes", "getBlockedFileExtensions", "getBlockedMimeTypes", "getSizeLimitInBytes", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class FileUploadConfig {
    private final List<String> allowedFileExtensions;
    private final List<String> allowedMimeTypes;
    private final List<String> blockedFileExtensions;
    private final List<String> blockedMimeTypes;
    private final long sizeLimitInBytes;

    public FileUploadConfig(List<String> allowedFileExtensions, List<String> allowedMimeTypes, List<String> blockedFileExtensions, List<String> blockedMimeTypes, long j7) {
        AbstractC22676k.m65750j(allowedFileExtensions, "allowedFileExtensions");
        AbstractC22676k.m65750j(allowedMimeTypes, "allowedMimeTypes");
        AbstractC22676k.m65750j(blockedFileExtensions, "blockedFileExtensions");
        AbstractC22676k.m65750j(blockedMimeTypes, "blockedMimeTypes");
        this.allowedFileExtensions = allowedFileExtensions;
        this.allowedMimeTypes = allowedMimeTypes;
        this.blockedFileExtensions = blockedFileExtensions;
        this.blockedMimeTypes = blockedMimeTypes;
        this.sizeLimitInBytes = j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileUploadConfig copy$default(FileUploadConfig fileUploadConfig, List list, List list2, List list3, List list4, long j7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = fileUploadConfig.allowedFileExtensions;
        }
        if ((i13 & 2) != 0) {
            list2 = fileUploadConfig.allowedMimeTypes;
        }
        if ((i13 & 4) != 0) {
            list3 = fileUploadConfig.blockedFileExtensions;
        }
        if ((i13 & 8) != 0) {
            list4 = fileUploadConfig.blockedMimeTypes;
        }
        if ((i13 & 16) != 0) {
            j7 = fileUploadConfig.sizeLimitInBytes;
        }
        long j13 = j7;
        return fileUploadConfig.copy(list, list2, list3, list4, j13);
    }

    public final List<String> component1() {
        return this.allowedFileExtensions;
    }

    public final List<String> component2() {
        return this.allowedMimeTypes;
    }

    public final List<String> component3() {
        return this.blockedFileExtensions;
    }

    public final List<String> component4() {
        return this.blockedMimeTypes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSizeLimitInBytes() {
        return this.sizeLimitInBytes;
    }

    public final FileUploadConfig copy(List<String> allowedFileExtensions, List<String> allowedMimeTypes, List<String> blockedFileExtensions, List<String> blockedMimeTypes, long sizeLimitInBytes) {
        AbstractC22676k.m65750j(allowedFileExtensions, "allowedFileExtensions");
        AbstractC22676k.m65750j(allowedMimeTypes, "allowedMimeTypes");
        AbstractC22676k.m65750j(blockedFileExtensions, "blockedFileExtensions");
        AbstractC22676k.m65750j(blockedMimeTypes, "blockedMimeTypes");
        return new FileUploadConfig(allowedFileExtensions, allowedMimeTypes, blockedFileExtensions, blockedMimeTypes, sizeLimitInBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUploadConfig)) {
            return false;
        }
        FileUploadConfig fileUploadConfig = (FileUploadConfig) other;
        return AbstractC22676k.m65745e(this.allowedFileExtensions, fileUploadConfig.allowedFileExtensions) && AbstractC22676k.m65745e(this.allowedMimeTypes, fileUploadConfig.allowedMimeTypes) && AbstractC22676k.m65745e(this.blockedFileExtensions, fileUploadConfig.blockedFileExtensions) && AbstractC22676k.m65745e(this.blockedMimeTypes, fileUploadConfig.blockedMimeTypes) && this.sizeLimitInBytes == fileUploadConfig.sizeLimitInBytes;
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

    public final long getSizeLimitInBytes() {
        return this.sizeLimitInBytes;
    }

    public int hashCode() {
        return Long.hashCode(this.sizeLimitInBytes) + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.allowedFileExtensions.hashCode() * 31, 31, this.allowedMimeTypes), 31, this.blockedFileExtensions), 31, this.blockedMimeTypes);
    }

    public String toString() {
        List<String> list = this.allowedFileExtensions;
        List<String> list2 = this.allowedMimeTypes;
        List<String> list3 = this.blockedFileExtensions;
        List<String> list4 = this.blockedMimeTypes;
        long j7 = this.sizeLimitInBytes;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("FileUploadConfig(allowedFileExtensions=", ", allowedMimeTypes=", list, ", blockedFileExtensions=", list2);
        AbstractC21702c.m61148s(sbM124380j, list3, ", blockedMimeTypes=", list4, ", sizeLimitInBytes=");
        return AbstractC11266d.m30457k(j7, ")", sbM124380j);
    }
}
