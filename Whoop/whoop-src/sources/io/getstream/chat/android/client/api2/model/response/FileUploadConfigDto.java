package io.getstream.chat.android.client.api2.model.response;

import java.util.List;
import jh3.AbstractC21702c;
import live.hms.video.utils.HMSFieldTrials;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JZ\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;", "", "allowed_file_extensions", "", "", "allowed_mime_types", "blocked_file_extensions", "blocked_mime_types", "size_limit", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "getAllowed_file_extensions", "()Ljava/util/List;", "getAllowed_mime_types", "getBlocked_file_extensions", "getBlocked_mime_types", "getSize_limit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class FileUploadConfigDto {
    private final List<String> allowed_file_extensions;
    private final List<String> allowed_mime_types;
    private final List<String> blocked_file_extensions;
    private final List<String> blocked_mime_types;
    private final Long size_limit;

    public FileUploadConfigDto(List<String> allowed_file_extensions, List<String> allowed_mime_types, List<String> blocked_file_extensions, List<String> blocked_mime_types, Long l7) {
        AbstractC22676k.m65750j(allowed_file_extensions, "allowed_file_extensions");
        AbstractC22676k.m65750j(allowed_mime_types, "allowed_mime_types");
        AbstractC22676k.m65750j(blocked_file_extensions, "blocked_file_extensions");
        AbstractC22676k.m65750j(blocked_mime_types, "blocked_mime_types");
        this.allowed_file_extensions = allowed_file_extensions;
        this.allowed_mime_types = allowed_mime_types;
        this.blocked_file_extensions = blocked_file_extensions;
        this.blocked_mime_types = blocked_mime_types;
        this.size_limit = l7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileUploadConfigDto copy$default(FileUploadConfigDto fileUploadConfigDto, List list, List list2, List list3, List list4, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = fileUploadConfigDto.allowed_file_extensions;
        }
        if ((i13 & 2) != 0) {
            list2 = fileUploadConfigDto.allowed_mime_types;
        }
        if ((i13 & 4) != 0) {
            list3 = fileUploadConfigDto.blocked_file_extensions;
        }
        if ((i13 & 8) != 0) {
            list4 = fileUploadConfigDto.blocked_mime_types;
        }
        if ((i13 & 16) != 0) {
            l7 = fileUploadConfigDto.size_limit;
        }
        Long l12 = l7;
        List list5 = list3;
        return fileUploadConfigDto.copy(list, list2, list5, list4, l12);
    }

    public final List<String> component1() {
        return this.allowed_file_extensions;
    }

    public final List<String> component2() {
        return this.allowed_mime_types;
    }

    public final List<String> component3() {
        return this.blocked_file_extensions;
    }

    public final List<String> component4() {
        return this.blocked_mime_types;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getSize_limit() {
        return this.size_limit;
    }

    public final FileUploadConfigDto copy(List<String> allowed_file_extensions, List<String> allowed_mime_types, List<String> blocked_file_extensions, List<String> blocked_mime_types, Long size_limit) {
        AbstractC22676k.m65750j(allowed_file_extensions, "allowed_file_extensions");
        AbstractC22676k.m65750j(allowed_mime_types, "allowed_mime_types");
        AbstractC22676k.m65750j(blocked_file_extensions, "blocked_file_extensions");
        AbstractC22676k.m65750j(blocked_mime_types, "blocked_mime_types");
        return new FileUploadConfigDto(allowed_file_extensions, allowed_mime_types, blocked_file_extensions, blocked_mime_types, size_limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUploadConfigDto)) {
            return false;
        }
        FileUploadConfigDto fileUploadConfigDto = (FileUploadConfigDto) other;
        return AbstractC22676k.m65745e(this.allowed_file_extensions, fileUploadConfigDto.allowed_file_extensions) && AbstractC22676k.m65745e(this.allowed_mime_types, fileUploadConfigDto.allowed_mime_types) && AbstractC22676k.m65745e(this.blocked_file_extensions, fileUploadConfigDto.blocked_file_extensions) && AbstractC22676k.m65745e(this.blocked_mime_types, fileUploadConfigDto.blocked_mime_types) && AbstractC22676k.m65745e(this.size_limit, fileUploadConfigDto.size_limit);
    }

    public final List<String> getAllowed_file_extensions() {
        return this.allowed_file_extensions;
    }

    public final List<String> getAllowed_mime_types() {
        return this.allowed_mime_types;
    }

    public final List<String> getBlocked_file_extensions() {
        return this.blocked_file_extensions;
    }

    public final List<String> getBlocked_mime_types() {
        return this.blocked_mime_types;
    }

    public final Long getSize_limit() {
        return this.size_limit;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.allowed_file_extensions.hashCode() * 31, 31, this.allowed_mime_types), 31, this.blocked_file_extensions), 31, this.blocked_mime_types);
        Long l7 = this.size_limit;
        return iM31983b + (l7 == null ? 0 : l7.hashCode());
    }

    public String toString() {
        List<String> list = this.allowed_file_extensions;
        List<String> list2 = this.allowed_mime_types;
        List<String> list3 = this.blocked_file_extensions;
        List<String> list4 = this.blocked_mime_types;
        Long l7 = this.size_limit;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("FileUploadConfigDto(allowed_file_extensions=", ", allowed_mime_types=", list, ", blocked_file_extensions=", list2);
        AbstractC21702c.m61148s(sbM124380j, list3, ", blocked_mime_types=", list4, ", size_limit=");
        sbM124380j.append(l7);
        sbM124380j.append(")");
        return sbM124380j.toString();
    }
}
