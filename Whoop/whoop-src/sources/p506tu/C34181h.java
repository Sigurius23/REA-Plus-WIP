package p506tu;

import com.google.gson.annotations.SerializedName;
import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tu.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001a\u0010%\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010+\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Ltu/h;", "", "", "a", "Ljava/lang/String;", "getETag", "()Ljava/lang/String;", "eTag", "", "b", "Z", "getMustRevalidate", "()Z", "mustRevalidate", "c", "getNoContent", "noContent", "d", "getModified", "modified", "Ltu/j;", "e", "Ltu/j;", "getSource", "()Ltu/j;", "source", "f", "getNotModified", "notModified", "g", "getExpires", "expires", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "getSize", "()I", "size", "Ltu/b;", "i", "Ltu/b;", "getError", "()Ltu/b;", "error", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C34181h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(HttpHeaders.ETAG)
    private final String eTag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("must-revalidate")
    private final boolean mustRevalidate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("no-content")
    private final boolean noContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("modified")
    private final String modified;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("source")
    private final EnumC34183j source;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("not-modified")
    private final boolean notModified;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("expires")
    private final String expires;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("size")
    private final int size;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("error")
    private final C34175b error;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34181h)) {
            return false;
        }
        C34181h c34181h = (C34181h) obj;
        return AbstractC22676k.m65745e(this.eTag, c34181h.eTag) && this.mustRevalidate == c34181h.mustRevalidate && this.noContent == c34181h.noContent && AbstractC22676k.m65745e(this.modified, c34181h.modified) && this.source == c34181h.source && this.notModified == c34181h.notModified && AbstractC22676k.m65745e(this.expires, c34181h.expires) && this.size == c34181h.size && AbstractC22676k.m65745e(this.error, c34181h.error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final int hashCode() {
        String str = this.eTag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z4 = this.mustRevalidate;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        int i13 = (iHashCode + r10) * 31;
        boolean z13 = this.noContent;
        ?? r14 = z13;
        if (z13) {
            r14 = 1;
        }
        int i14 = (i13 + r14) * 31;
        String str2 = this.modified;
        int iHashCode2 = (this.source.hashCode() + ((i14 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        boolean z14 = this.notModified;
        int i15 = (iHashCode2 + (z14 ? 1 : z14)) * 31;
        String str3 = this.expires;
        int iM30448b = AbstractC11266d.m30448b(this.size, (i15 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        C34175b c34175b = this.error;
        return iM30448b + (c34175b != null ? c34175b.hashCode() : 0);
    }

    public final String toString() {
        return "Response(eTag=" + this.eTag + ", mustRevalidate=" + this.mustRevalidate + ", noContent=" + this.noContent + ", modified=" + this.modified + ", source=" + this.source + ", notModified=" + this.notModified + ", expires=" + this.expires + ", size=" + this.size + ", error=" + this.error + ')';
    }
}
