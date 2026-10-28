package nj0;

import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nj0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u001a\u0010\u0006\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0003\"\u001a\u0010\n\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0002\u001a\u0004\b\u0007\u0010\u0003¨\u0006\u000b"}, m65681d2 = {"Ljava/util/UUID;", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "HARVARD_SERVICE_UUID", "b", "MAVERICK_SERVICE_UUID", "c", "d", "SYMPHONY_SERVICE_UUID", "MONUMENT_SERVICE_UUID", "whoop-ble-api"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26749e {

    /* JADX INFO: renamed from: a */
    private static final UUID f106371a;

    /* JADX INFO: renamed from: b */
    private static final UUID f106372b;

    /* JADX INFO: renamed from: c */
    private static final UUID f106373c;

    /* JADX INFO: renamed from: d */
    private static final UUID f106374d;

    static {
        UUID uuidFromString = UUID.fromString("61080001-8d6d-82b8-614a-1c8cb0f8dcc6");
        AbstractC22676k.m65749i(uuidFromString, "fromString(...)");
        f106371a = uuidFromString;
        UUID uuidFromString2 = UUID.fromString("fd4b0001-cce1-4033-93ce-002d5875f58a");
        AbstractC22676k.m65749i(uuidFromString2, "fromString(...)");
        f106372b = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("59830001-5955-419b-bb8d-c8262926af23");
        AbstractC22676k.m65749i(uuidFromString3, "fromString(...)");
        f106373c = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("8a580001-2fe8-4796-9267-b87a2b0c8234");
        AbstractC22676k.m65749i(uuidFromString4, "fromString(...)");
        f106374d = uuidFromString4;
    }

    /* JADX INFO: renamed from: a */
    public static final UUID m79615a() {
        return f106371a;
    }

    /* JADX INFO: renamed from: b */
    public static final UUID m79616b() {
        return f106372b;
    }

    /* JADX INFO: renamed from: c */
    public static final UUID m79617c() {
        return f106374d;
    }

    /* JADX INFO: renamed from: d */
    public static final UUID m79618d() {
        return f106373c;
    }
}
