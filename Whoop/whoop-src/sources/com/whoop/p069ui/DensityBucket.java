package com.whoop.p069ui;

import ge3.AbstractC15751g;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/ui/DensityBucket;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "map", "getValueFromMap", "(Ljava/util/Map;)Ljava/lang/String;", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Companion", "a", "LDPI", "MDPI", "HDPI", "XHDPI", "XXHDPI", "XXXHDPI", "DEFAULT", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum DensityBucket {
    LDPI("0.75x"),
    MDPI("1x"),
    HDPI("1.5x"),
    XHDPI("2x"),
    XXHDPI("3x"),
    XXXHDPI("4x"),
    DEFAULT("3x");

    private final String key;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.whoop.ui.DensityBucket$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/ui/DensityBucket$a;", "", "<init>", "()V", "", "bucket", "Lcom/whoop/ui/DensityBucket;", "a", "(Ljava/lang/String;)Lcom/whoop/ui/DensityBucket;", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final DensityBucket m26645a(String bucket) {
            AbstractC22676k.m65750j(bucket, "bucket");
            for (DensityBucket densityBucket : DensityBucket.values()) {
                if (AbstractC22676k.m65745e(densityBucket.getKey(), bucket)) {
                    if (densityBucket == null) {
                        return DensityBucket.DEFAULT;
                    }
                    return densityBucket;
                }
            }
            densityBucket = null;
            if (densityBucket == null) {
                return DensityBucket.DEFAULT;
            }
            return densityBucket;
        }

        private Companion() {
        }
    }

    DensityBucket(String str) {
        this.key = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValueFromMap(Map<String, String> map) {
        AbstractC22676k.m65750j(map, "map");
        String str = map.get(this.key);
        return str == null ? map.get(DEFAULT.key) : str;
    }
}
