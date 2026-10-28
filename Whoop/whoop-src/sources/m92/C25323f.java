package m92;

import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m92.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \b2\u00020\u0001:\u0001\u000bB\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u001a"}, m65681d2 = {"Lm92/f;", "", "", "", "map", "<init>", "(Ljava/util/Map;)V", "key", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "d", "sourceIdOrNull", "c", "notificationType", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25323f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, String> map;

    public C25323f(Map<String, String> map) {
        AbstractC22676k.m65750j(map, "map");
        this.map = map;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74367a(String key) {
        return this.map.containsKey(key);
    }

    /* JADX INFO: renamed from: b */
    public final String m74368b(String key) {
        AbstractC22676k.m65750j(key, "key");
        return this.map.get(key);
    }

    /* JADX INFO: renamed from: c */
    public final String m74369c() {
        return this.map.get("notificationType");
    }

    /* JADX INFO: renamed from: d */
    public final String m74370d() {
        return this.map.get("source_id");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C25323f) && AbstractC22676k.m65745e(this.map, ((C25323f) other).map);
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return "PushData: " + this.map;
    }
}
