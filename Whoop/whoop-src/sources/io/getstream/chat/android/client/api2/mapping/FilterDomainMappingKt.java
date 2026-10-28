package io.getstream.chat.android.client.api2.mapping;

import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.NeutralFilterObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0019\u001a5\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0018\u00010\u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0004\u0012\u00020\u00040\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0010\u001a\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001b\"\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001b\"\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001b\"\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001b\"\u0014\u0010$\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001b\"\u0014\u0010%\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001b\"\u0014\u0010&\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001b\"\u0014\u0010'\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001b\"\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001b\"\u0014\u0010)\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001b\"\u0014\u0010*\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001b¨\u0006+"}, m65681d2 = {"", "", "", "Ll83/k;", "Lio/getstream/chat/android/models/FilterObject;", "", "toFilterDomainWithFields", "(Ljava/util/Map;)Ll83/k;", "map", "", "fields", "parseFilterMap", "(Ljava/util/Map;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;", "key", "value", "parseSingleEntry", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Set;)Lio/getstream/chat/android/models/FilterObject;", "Lkotlin/Function1;", "", "factory", "parseLogicalOperator", "(Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/FilterObject;", "fieldName", "parseFieldFilter", "normalizeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "KEY_EXIST", "Ljava/lang/String;", "KEY_CONTAINS", "KEY_AND", "KEY_OR", "KEY_NOR", "KEY_EQUALS", "KEY_NOT_EQUALS", "KEY_GREATER_THAN", "KEY_GREATER_THAN_OR_EQUALS", "KEY_LESS_THAN", "KEY_LESS_THAN_OR_EQUALS", "KEY_IN", "KEY_NOT_IN", "KEY_AUTOCOMPLETE", "KEY_DISTINCT", "KEY_MEMBERS", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FilterDomainMappingKt {
    private static final String KEY_AND = "$and";
    private static final String KEY_AUTOCOMPLETE = "$autocomplete";
    private static final String KEY_CONTAINS = "$contains";
    private static final String KEY_DISTINCT = "distinct";
    private static final String KEY_EQUALS = "$eq";
    private static final String KEY_EXIST = "$exists";
    private static final String KEY_GREATER_THAN = "$gt";
    private static final String KEY_GREATER_THAN_OR_EQUALS = "$gte";
    private static final String KEY_IN = "$in";
    private static final String KEY_LESS_THAN = "$lt";
    private static final String KEY_LESS_THAN_OR_EQUALS = "$lte";
    private static final String KEY_MEMBERS = "members";
    private static final String KEY_NOR = "$nor";
    private static final String KEY_NOT_EQUALS = "$ne";
    private static final String KEY_NOT_IN = "$nin";
    private static final String KEY_OR = "$or";

    private static final Object normalizeValue(Object obj) {
        if (obj instanceof Double) {
            Number number = (Number) obj;
            if (number.doubleValue() == ((long) number.doubleValue())) {
                long jDoubleValue = (long) number.doubleValue();
                return (-2147483648L > jDoubleValue || jDoubleValue > 2147483647L) ? Long.valueOf(jDoubleValue) : Integer.valueOf((int) jDoubleValue);
            }
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        for (Object objNormalizeValue : iterable) {
            if (objNormalizeValue != null) {
                objNormalizeValue = normalizeValue(objNormalizeValue);
            }
            arrayList.add(objNormalizeValue);
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final FilterObject parseFieldFilter(String str, Object obj, Set<String> set) {
        set.add(str);
        if (!(obj instanceof Map)) {
            return Filters.m54979eq(str, normalizeValue(obj));
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) AbstractC25265s.m74094E0(map.entrySet());
        String str2 = (String) entry.getKey();
        Object value = entry.getValue();
        switch (str2.hashCode()) {
            case -1211297213:
                if (str2.equals(KEY_CONTAINS)) {
                    return Filters.contains(str, normalizeValue(value));
                }
                return null;
            case 37840:
                if (str2.equals(KEY_EQUALS)) {
                    return Filters.m54979eq(str, normalizeValue(value));
                }
                return null;
            case 37905:
                if (str2.equals(KEY_GREATER_THAN)) {
                    return Filters.greaterThan(str, normalizeValue(value));
                }
                return null;
            case 37961:
                if (str2.equals(KEY_IN)) {
                    Collection collection = value instanceof Collection ? (Collection) value : null;
                    if (collection == null) {
                        return null;
                    }
                    Collection collection2 = collection;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collection2, 10));
                    for (Object obj2 : collection2) {
                        if (obj2 == null) {
                            return null;
                        }
                        arrayList.add(normalizeValue(obj2));
                    }
                    return Filters.m54980in(str, arrayList);
                }
                return null;
            case 38060:
                if (str2.equals(KEY_LESS_THAN)) {
                    return Filters.lessThan(str, normalizeValue(value));
                }
                return null;
            case 38107:
                if (str2.equals(KEY_NOT_EQUALS)) {
                    return Filters.m54983ne(str, normalizeValue(value));
                }
                return null;
            case 1175156:
                if (str2.equals(KEY_GREATER_THAN_OR_EQUALS)) {
                    return Filters.greaterThanEquals(str, normalizeValue(value));
                }
                return null;
            case 1179961:
                if (str2.equals(KEY_LESS_THAN_OR_EQUALS)) {
                    return Filters.lessThanEquals(str, normalizeValue(value));
                }
                return null;
            case 1181551:
                if (str2.equals(KEY_NOT_IN)) {
                    Collection collection3 = value instanceof Collection ? (Collection) value : null;
                    if (collection3 == null) {
                        return null;
                    }
                    Collection collection4 = collection3;
                    ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(collection4, 10));
                    for (Object obj3 : collection4) {
                        if (obj3 == null) {
                            return null;
                        }
                        arrayList2.add(normalizeValue(obj3));
                    }
                    return Filters.nin(str, arrayList2);
                }
                return null;
            case 596003200:
                if (str2.equals(KEY_EXIST)) {
                    Boolean bool = value instanceof Boolean ? (Boolean) value : null;
                    if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
                        return Filters.exists(str);
                    }
                    if (AbstractC22676k.m65745e(bool, Boolean.FALSE)) {
                        return Filters.notExists(str);
                    }
                    if (bool == null) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return null;
            case 1484446220:
                if (str2.equals(KEY_AUTOCOMPLETE)) {
                    String str3 = value instanceof String ? (String) value : null;
                    if (str3 == null) {
                        return null;
                    }
                    return Filters.autocomplete(str, str3);
                }
                return null;
            default:
                return null;
        }
    }

    private static final FilterObject parseFilterMap(Map<String, ? extends Object> map, Set<String> set) {
        if (map.isEmpty()) {
            return NeutralFilterObject.INSTANCE;
        }
        if (map.size() == 2 && map.containsKey(KEY_DISTINCT) && map.containsKey("members")) {
            Object obj = map.get("members");
            Collection collection = obj instanceof Collection ? (Collection) obj : null;
            if (collection == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : collection) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
            return Filters.distinct(arrayList);
        }
        if (map.size() == 1) {
            Map.Entry entry = (Map.Entry) AbstractC25265s.m74094E0(map.entrySet());
            return parseSingleEntry((String) entry.getKey(), entry.getValue(), set);
        }
        Set<Map.Entry<String, ? extends Object>> setEntrySet = map.entrySet();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            FilterObject singleEntry = parseSingleEntry((String) entry2.getKey(), entry2.getValue(), set);
            if (singleEntry != null) {
                arrayList2.add(singleEntry);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        if (arrayList2.size() == 1) {
            return (FilterObject) AbstractC25265s.m74096F0(arrayList2);
        }
        FilterObject[] filterObjectArr = (FilterObject[]) arrayList2.toArray(new FilterObject[0]);
        return Filters.and((FilterObject[]) Arrays.copyOf(filterObjectArr, filterObjectArr.length));
    }

    private static final FilterObject parseLogicalOperator(Object obj, Set<String> set, Function1 function1) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Map map = obj2 instanceof Map ? (Map) obj2 : null;
            FilterObject filterMap = map != null ? parseFilterMap(map, set) : null;
            if (filterMap != null) {
                arrayList.add(filterMap);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (FilterObject) function1.invoke(arrayList.toArray(new FilterObject[0]));
    }

    private static final FilterObject parseSingleEntry(String str, Object obj, Set<String> set) {
        int iHashCode = str.hashCode();
        if (iHashCode != 38151) {
            if (iHashCode != 1169203) {
                if (iHashCode == 1181741 && str.equals(KEY_NOR)) {
                    return parseLogicalOperator(obj, set, new C19031a(5));
                }
            } else if (str.equals(KEY_AND)) {
                return parseLogicalOperator(obj, set, new C19031a(3));
            }
        } else if (str.equals(KEY_OR)) {
            return parseLogicalOperator(obj, set, new C19031a(4));
        }
        return parseFieldFilter(str, obj, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FilterObject parseSingleEntry$lambda$1(FilterObject[] it) {
        AbstractC22676k.m65750j(it, "it");
        return Filters.and((FilterObject[]) Arrays.copyOf(it, it.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FilterObject parseSingleEntry$lambda$2(FilterObject[] it) {
        AbstractC22676k.m65750j(it, "it");
        return Filters.m54984or((FilterObject[]) Arrays.copyOf(it, it.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FilterObject parseSingleEntry$lambda$3(FilterObject[] it) {
        AbstractC22676k.m65750j(it, "it");
        return Filters.nor((FilterObject[]) Arrays.copyOf(it, it.length));
    }

    public static final C23465k toFilterDomainWithFields(Map<String, ? extends Object> map) {
        LinkedHashSet linkedHashSet;
        FilterObject filterMap;
        if (map == null || (filterMap = parseFilterMap(map, (linkedHashSet = new LinkedHashSet()))) == null) {
            return null;
        }
        return new C23465k(filterMap, linkedHashSet);
    }
}
