package com.whoop.service.network.model.achievements;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\u0007\u001a\u00020\u0002H\u0096\u0080\u0004¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/achievements/UserStreaks;", "Ljava/util/HashMap;", "", "Lcom/whoop/service/network/model/achievements/StreakValues;", "Lkotlin/collections/HashMap;", "<init>", "()V", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UserStreaks extends HashMap<String, StreakValues> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(StreakValues streakValues) {
        return super.containsValue((Object) streakValues);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, StreakValues>> entrySet() {
        return getEntries();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ StreakValues get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ Set<Map.Entry<String, StreakValues>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public final /* bridge */ StreakValues getOrDefault(Object obj, StreakValues streakValues) {
        return !(obj instanceof String) ? streakValues : getOrDefault((String) obj, streakValues);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<StreakValues> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ StreakValues remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        Set<String> setKeySet = keySet();
        AbstractC22676k.m65749i(setKeySet, "<get-keys>(...)");
        if (setKeySet.size() == 0) {
            return "";
        }
        String str = "{";
        for (String str2 : keySet()) {
            AbstractC22676k.m65749i(str2, "next(...)");
            String str3 = str2;
            str = str + "\"" + str3 + "\": " + get((Object) str3) + ", ";
        }
        String strSubstring = str.substring(0, str.length() - (str.length() - AbstractC39414r.m125892k0(str, DateTimeRange.lowerUpperDelimiter, 0, 6)));
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring.concat("}");
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<StreakValues> values() {
        return getValues();
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof StreakValues) {
            return containsValue((StreakValues) obj);
        }
        return false;
    }

    public /* bridge */ StreakValues get(String str) {
        return (StreakValues) super.get((Object) str);
    }

    public /* bridge */ StreakValues getOrDefault(String str, StreakValues streakValues) {
        return (StreakValues) super.getOrDefault((Object) str, streakValues);
    }

    public /* bridge */ StreakValues remove(String str) {
        return (StreakValues) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (StreakValues) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof StreakValues)) {
            return remove((String) obj, (StreakValues) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, StreakValues streakValues) {
        return super.remove((Object) str, (Object) streakValues);
    }
}
