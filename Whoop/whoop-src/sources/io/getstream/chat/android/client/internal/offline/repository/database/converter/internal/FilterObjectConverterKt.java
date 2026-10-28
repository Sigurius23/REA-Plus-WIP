package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import io.getstream.chat.android.models.AndFilterObject;
import io.getstream.chat.android.models.AutocompleteFilterObject;
import io.getstream.chat.android.models.ContainsFilterObject;
import io.getstream.chat.android.models.DistinctFilterObject;
import io.getstream.chat.android.models.EqualsFilterObject;
import io.getstream.chat.android.models.ExistsFilterObject;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.GreaterThanFilterObject;
import io.getstream.chat.android.models.GreaterThanOrEqualsFilterObject;
import io.getstream.chat.android.models.InFilterObject;
import io.getstream.chat.android.models.LessThanFilterObject;
import io.getstream.chat.android.models.LessThanOrEqualsFilterObject;
import io.getstream.chat.android.models.NeutralFilterObject;
import io.getstream.chat.android.models.NorFilterObject;
import io.getstream.chat.android.models.NotEqualsFilterObject;
import io.getstream.chat.android.models.NotExistsFilterObject;
import io.getstream.chat.android.models.NotInFilterObject;
import io.getstream.chat.android.models.OrFilterObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import nh3.AbstractC26725a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010&\n\u0002\b\u0012\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0005H\u0002\u001a\u0018\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\u0001H\u0002\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m65681d2 = {"toFilterObject", "Lio/getstream/chat/android/models/FilterObject;", "", "", "", "", "toMap", "KEY_EXIST", "KEY_CONTAINS", "KEY_AND", "KEY_OR", "KEY_NOR", "KEY_EQUALS", "KEY_NOT_EQUALS", "KEY_GREATER_THAN", "KEY_GREATER_THAN_OR_EQUALS", "KEY_LESS_THAN", "KEY_LESS_THAN_OR_EQUALS", "KEY_IN", "KEY_NOT_IN", "KEY_AUTOCOMPLETE", "KEY_DISTINCT", "KEY_MEMBERS", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FilterObjectConverterKt {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final FilterObject toFilterObject(Map<String, ? extends Object> map) {
        if (map.isEmpty()) {
            return NeutralFilterObject.INSTANCE;
        }
        if (map.size() == 1) {
            return toFilterObject((Map.Entry<String, ? extends Object>) AbstractC25265s.m74094E0(map.entrySet()));
        }
        if (map.size() != 2 || !map.containsKey(KEY_DISTINCT) || !map.containsKey("members")) {
            throw new IllegalArgumentException(AbstractC26725a.m79504h("FilterObject can not be created with this map `", "`", map));
        }
        Object obj = map.get("members");
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        return Filters.distinct((List) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Object> toMap(FilterObject filterObject) {
        if (filterObject instanceof AndFilterObject) {
            Set<FilterObject> filterObjects = ((AndFilterObject) filterObject).getFilterObjects();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(filterObjects, 10));
            Iterator<T> it = filterObjects.iterator();
            while (it.hasNext()) {
                arrayList.add(toMap((FilterObject) it.next()));
            }
            return AbstractC25247g0.m73989X(new C23465k(KEY_AND, arrayList));
        }
        if (filterObject instanceof OrFilterObject) {
            Set<FilterObject> filterObjects2 = ((OrFilterObject) filterObject).getFilterObjects();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(filterObjects2, 10));
            Iterator<T> it3 = filterObjects2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(toMap((FilterObject) it3.next()));
            }
            return AbstractC25247g0.m73989X(new C23465k(KEY_OR, arrayList2));
        }
        if (filterObject instanceof NorFilterObject) {
            Set<FilterObject> filterObjects3 = ((NorFilterObject) filterObject).getFilterObjects();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(filterObjects3, 10));
            Iterator<T> it4 = filterObjects3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(toMap((FilterObject) it4.next()));
            }
            return AbstractC25247g0.m73989X(new C23465k(KEY_NOR, arrayList3));
        }
        if (filterObject instanceof ExistsFilterObject) {
            return AbstractC38963t7.m124385o(((ExistsFilterObject) filterObject).getFieldName(), AbstractC36095b.m114688p(Boolean.TRUE, KEY_EXIST));
        }
        if (filterObject instanceof NotExistsFilterObject) {
            return AbstractC38963t7.m124385o(((NotExistsFilterObject) filterObject).getFieldName(), AbstractC36095b.m114688p(Boolean.FALSE, KEY_EXIST));
        }
        if (filterObject instanceof EqualsFilterObject) {
            EqualsFilterObject equalsFilterObject = (EqualsFilterObject) filterObject;
            return AbstractC38963t7.m124385o(equalsFilterObject.getFieldName(), AbstractC36095b.m114689q(equalsFilterObject.getValue(), KEY_EQUALS));
        }
        if (filterObject instanceof NotEqualsFilterObject) {
            NotEqualsFilterObject notEqualsFilterObject = (NotEqualsFilterObject) filterObject;
            return AbstractC38963t7.m124385o(notEqualsFilterObject.getFieldName(), AbstractC36095b.m114689q(notEqualsFilterObject.getValue(), KEY_NOT_EQUALS));
        }
        if (filterObject instanceof ContainsFilterObject) {
            ContainsFilterObject containsFilterObject = (ContainsFilterObject) filterObject;
            return AbstractC38963t7.m124385o(containsFilterObject.getFieldName(), AbstractC36095b.m114689q(containsFilterObject.getValue(), KEY_CONTAINS));
        }
        if (filterObject instanceof GreaterThanFilterObject) {
            GreaterThanFilterObject greaterThanFilterObject = (GreaterThanFilterObject) filterObject;
            return AbstractC38963t7.m124385o(greaterThanFilterObject.getFieldName(), AbstractC36095b.m114689q(greaterThanFilterObject.getValue(), KEY_GREATER_THAN));
        }
        if (filterObject instanceof GreaterThanOrEqualsFilterObject) {
            GreaterThanOrEqualsFilterObject greaterThanOrEqualsFilterObject = (GreaterThanOrEqualsFilterObject) filterObject;
            return AbstractC38963t7.m124385o(greaterThanOrEqualsFilterObject.getFieldName(), AbstractC36095b.m114689q(greaterThanOrEqualsFilterObject.getValue(), KEY_GREATER_THAN_OR_EQUALS));
        }
        if (filterObject instanceof LessThanFilterObject) {
            LessThanFilterObject lessThanFilterObject = (LessThanFilterObject) filterObject;
            return AbstractC38963t7.m124385o(lessThanFilterObject.getFieldName(), AbstractC36095b.m114689q(lessThanFilterObject.getValue(), KEY_LESS_THAN));
        }
        if (filterObject instanceof LessThanOrEqualsFilterObject) {
            LessThanOrEqualsFilterObject lessThanOrEqualsFilterObject = (LessThanOrEqualsFilterObject) filterObject;
            return AbstractC38963t7.m124385o(lessThanOrEqualsFilterObject.getFieldName(), AbstractC36095b.m114689q(lessThanOrEqualsFilterObject.getValue(), KEY_LESS_THAN_OR_EQUALS));
        }
        if (filterObject instanceof InFilterObject) {
            InFilterObject inFilterObject = (InFilterObject) filterObject;
            return AbstractC38963t7.m124385o(inFilterObject.getFieldName(), AbstractC25247g0.m73989X(new C23465k(KEY_IN, inFilterObject.getValues())));
        }
        if (filterObject instanceof NotInFilterObject) {
            NotInFilterObject notInFilterObject = (NotInFilterObject) filterObject;
            return AbstractC38963t7.m124385o(notInFilterObject.getFieldName(), AbstractC25247g0.m73989X(new C23465k(KEY_NOT_IN, notInFilterObject.getValues())));
        }
        if (filterObject instanceof AutocompleteFilterObject) {
            AutocompleteFilterObject autocompleteFilterObject = (AutocompleteFilterObject) filterObject;
            return AbstractC38963t7.m124385o(autocompleteFilterObject.getFieldName(), AbstractC31061c.m95645u(KEY_AUTOCOMPLETE, autocompleteFilterObject.getValue()));
        }
        if (filterObject instanceof DistinctFilterObject) {
            return AbstractC25247g0.m73990Y(new C23465k(KEY_DISTINCT, Boolean.TRUE), new C23465k("members", ((DistinctFilterObject) filterObject).getMemberIds()));
        }
        if (filterObject instanceof NeutralFilterObject) {
            return C25272z.f99163w;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final FilterObject toFilterObject(Map.Entry<String, ? extends Object> entry) {
        String key = entry.getKey();
        int iHashCode = key.hashCode();
        if (iHashCode != 38151) {
            if (iHashCode != 1169203) {
                if (iHashCode == 1181741 && key.equals(KEY_NOR)) {
                    Object value = entry.getValue();
                    AbstractC22676k.m65748h(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
                    List list = (List) value;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(toFilterObject((Map<String, ? extends Object>) it.next()));
                    }
                    FilterObject[] filterObjectArr = (FilterObject[]) arrayList.toArray(new FilterObject[0]);
                    return Filters.nor((FilterObject[]) Arrays.copyOf(filterObjectArr, filterObjectArr.length));
                }
            } else if (key.equals(KEY_AND)) {
                Object value2 = entry.getValue();
                AbstractC22676k.m65748h(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
                List list2 = (List) value2;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(toFilterObject((Map<String, ? extends Object>) it3.next()));
                }
                FilterObject[] filterObjectArr2 = (FilterObject[]) arrayList2.toArray(new FilterObject[0]);
                return Filters.and((FilterObject[]) Arrays.copyOf(filterObjectArr2, filterObjectArr2.length));
            }
        } else if (key.equals(KEY_OR)) {
            Object value3 = entry.getValue();
            AbstractC22676k.m65748h(value3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
            List list3 = (List) value3;
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(toFilterObject((Map<String, ? extends Object>) it4.next()));
            }
            FilterObject[] filterObjectArr3 = (FilterObject[]) arrayList3.toArray(new FilterObject[0]);
            return Filters.m54984or((FilterObject[]) Arrays.copyOf(filterObjectArr3, filterObjectArr3.length));
        }
        Object value4 = entry.getValue();
        AbstractC22676k.m65748h(value4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        Map.Entry entry2 = (Map.Entry) AbstractC25265s.m74094E0(((Map) value4).entrySet());
        String str = (String) entry2.getKey();
        switch (str.hashCode()) {
            case -1211297213:
                if (str.equals(KEY_CONTAINS)) {
                    return Filters.contains(entry.getKey(), entry2.getValue());
                }
                break;
            case 37840:
                if (str.equals(KEY_EQUALS)) {
                    return Filters.m54979eq(entry.getKey(), entry2.getValue());
                }
                break;
            case 37905:
                if (str.equals(KEY_GREATER_THAN)) {
                    return Filters.greaterThan(entry.getKey(), entry2.getValue());
                }
                break;
            case 37961:
                if (str.equals(KEY_IN)) {
                    String key2 = entry.getKey();
                    Object value5 = entry2.getValue();
                    AbstractC22676k.m65748h(value5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    return Filters.m54980in(key2, (List<? extends Object>) value5);
                }
                break;
            case 38060:
                if (str.equals(KEY_LESS_THAN)) {
                    return Filters.lessThan(entry.getKey(), entry2.getValue());
                }
                break;
            case 38107:
                if (str.equals(KEY_NOT_EQUALS)) {
                    return Filters.m54983ne(entry.getKey(), entry2.getValue());
                }
                break;
            case 1175156:
                if (str.equals(KEY_GREATER_THAN_OR_EQUALS)) {
                    return Filters.greaterThanEquals(entry.getKey(), entry2.getValue());
                }
                break;
            case 1179961:
                if (str.equals(KEY_LESS_THAN_OR_EQUALS)) {
                    return Filters.lessThanEquals(entry.getKey(), entry2.getValue());
                }
                break;
            case 1181551:
                if (str.equals(KEY_NOT_IN)) {
                    String key3 = entry.getKey();
                    Object value6 = entry2.getValue();
                    AbstractC22676k.m65748h(value6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    return Filters.nin(key3, (List<? extends Object>) value6);
                }
                break;
            case 596003200:
                if (str.equals(KEY_EXIST)) {
                    Object value7 = entry2.getValue();
                    AbstractC22676k.m65748h(value7, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue = ((Boolean) value7).booleanValue();
                    if (zBooleanValue) {
                        return Filters.exists(entry.getKey());
                    }
                    if (!zBooleanValue) {
                        return Filters.notExists(entry.getKey());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                break;
            case 1484446220:
                if (str.equals(KEY_AUTOCOMPLETE)) {
                    String key4 = entry.getKey();
                    Object value8 = entry2.getValue();
                    AbstractC22676k.m65748h(value8, "null cannot be cast to non-null type kotlin.String");
                    return Filters.autocomplete(key4, (String) value8);
                }
                break;
        }
        throw new IllegalArgumentException("FilterObject can be create with this map `" + entry + "`");
    }
}
