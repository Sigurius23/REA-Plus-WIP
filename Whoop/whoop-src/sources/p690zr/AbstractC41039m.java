package p690zr;

import java.util.Map;
import p463rj.AbstractC31479j;

/* JADX INFO: renamed from: zr.m */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC41039m implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC31479j.m96940s(getKey(), entry.getKey()) && AbstractC31479j.m96940s(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
