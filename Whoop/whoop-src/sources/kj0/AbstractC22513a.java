package kj0;

import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kj0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\r\"\u001a\u0010\u0005\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0003\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0006\u0010\b\"\u0017\u0010\f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\u0001\u0010\b¨\u0006\r"}, m65681d2 = {"Ljava/util/UUID;", "a", "Ljava/util/UUID;", "getUUID_SECURE_DFU_SERVICE$annotations", "()V", "UUID_SECURE_DFU_SERVICE", "b", "c", "()Ljava/util/UUID;", "UUID_HR_SERVICE", "UUID_HR_CHARACTERISTIC", "d", "UUID_CLIENT_CHARACTERISTIC_CONFIG", "connectivity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22513a {

    /* JADX INFO: renamed from: a */
    public static final UUID f88234a;

    /* JADX INFO: renamed from: b */
    private static final UUID f88235b;

    /* JADX INFO: renamed from: c */
    private static final UUID f88236c;

    /* JADX INFO: renamed from: d */
    private static final UUID f88237d;

    static {
        UUID uuidFromString = UUID.fromString("0000fe59-0000-1000-8000-00805f9b34fb");
        AbstractC22676k.m65749i(uuidFromString, "fromString(...)");
        f88234a = uuidFromString;
        UUID uuidFromString2 = UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb");
        AbstractC22676k.m65749i(uuidFromString2, "fromString(...)");
        f88235b = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb");
        AbstractC22676k.m65749i(uuidFromString3, "fromString(...)");
        f88236c = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        AbstractC22676k.m65749i(uuidFromString4, "fromString(...)");
        f88237d = uuidFromString4;
    }

    /* JADX INFO: renamed from: a */
    public static final UUID m65015a() {
        return f88237d;
    }

    /* JADX INFO: renamed from: b */
    public static final UUID m65016b() {
        return f88236c;
    }

    /* JADX INFO: renamed from: c */
    public static final UUID m65017c() {
        return f88235b;
    }
}
