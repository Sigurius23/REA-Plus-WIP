package lt0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: lt0.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m65681d2 = {"Llt0/n;", "", "", "tag", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "SUCCESS", "FAIL_CRC8", "FAIL_CRC16", "FAIL_CRC32", "FAIL_FRAME_INVALID", "FAIL_TOO_SHORT", "FAIL_UNALIGNED", "FAIL_NO_PAYLOAD", "FAIL_OTHER", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC24737n {
    SUCCESS("success"),
    FAIL_CRC8("crc8"),
    FAIL_CRC16("crc16"),
    FAIL_CRC32("crc32"),
    FAIL_FRAME_INVALID("frame_invalid"),
    FAIL_TOO_SHORT("too_short"),
    FAIL_UNALIGNED("unaligned"),
    FAIL_NO_PAYLOAD("no_payload"),
    FAIL_OTHER("other");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String tag;

    EnumC24737n(String str) {
        this.tag = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getTag() {
        return this.tag;
    }
}
