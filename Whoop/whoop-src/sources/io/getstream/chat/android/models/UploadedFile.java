package io.getstream.chat.android.models;

import java.util.Map;
import m83.C25272z;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/models/UploadedFile;", "", "file", "", "thumbUrl", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getFile", "()Ljava/lang/String;", "getThumbUrl", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UploadedFile {
    private final Map<String, Object> extraData;
    private final String file;
    private final String thumbUrl;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadedFile(String file) {
        this(file, null, null, 6, null);
        AbstractC22676k.m65750j(file, "file");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadedFile copy$default(UploadedFile uploadedFile, String str, String str2, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = uploadedFile.file;
        }
        if ((i13 & 2) != 0) {
            str2 = uploadedFile.thumbUrl;
        }
        if ((i13 & 4) != 0) {
            map = uploadedFile.extraData;
        }
        return uploadedFile.copy(str, str2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    public final Map<String, Object> component3() {
        return this.extraData;
    }

    public final UploadedFile copy(String file, String thumbUrl, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(file, "file");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new UploadedFile(file, thumbUrl, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadedFile)) {
            return false;
        }
        UploadedFile uploadedFile = (UploadedFile) other;
        return AbstractC22676k.m65745e(this.file, uploadedFile.file) && AbstractC22676k.m65745e(this.thumbUrl, uploadedFile.thumbUrl) && AbstractC22676k.m65745e(this.extraData, uploadedFile.extraData);
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getFile() {
        return this.file;
    }

    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    public int hashCode() {
        int iHashCode = this.file.hashCode() * 31;
        String str = this.thumbUrl;
        return this.extraData.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.file;
        String str2 = this.thumbUrl;
        return AbstractC13673n.m38565l(AbstractC11895b.m32001t("UploadedFile(file=", str, ", thumbUrl=", str2, ", extraData="), this.extraData, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadedFile(String file, String str) {
        this(file, str, null, 4, null);
        AbstractC22676k.m65750j(file, "file");
    }

    public UploadedFile(String file, String str, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(file, "file");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.file = file;
        this.thumbUrl = str;
        this.extraData = extraData;
    }

    public /* synthetic */ UploadedFile(String str, String str2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? C25272z.f99163w : map);
    }
}
