package or2;

import java.util.HashMap;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: or2.x */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\tR0\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lor2/x;", "", "<init>", "()V", "Ll83/a0;", "b", "c", "", "a", "Ljava/lang/String;", "key", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "efficientCounter", "()I", "count", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28213x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String key = "counter";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HashMap<String, Integer> efficientCounter;

    public C28213x() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("counter", 0);
        this.efficientCounter = map;
    }

    /* JADX INFO: renamed from: a */
    public final int m85400a() {
        Integer num = this.efficientCounter.get(this.key);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m85401b() {
        if (!this.efficientCounter.containsKey(this.key)) {
            this.efficientCounter.put(this.key, 0);
            return;
        }
        Integer num = this.efficientCounter.get(this.key);
        if (num != null) {
            this.efficientCounter.put(this.key, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m85402c() {
        this.efficientCounter.put(this.key, 0);
    }
}
