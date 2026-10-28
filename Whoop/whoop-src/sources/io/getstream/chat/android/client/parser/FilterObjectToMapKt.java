package io.getstream.chat.android.client.parser;

import io.getstream.chat.android.models.AndFilterObject;
import io.getstream.chat.android.models.AutocompleteFilterObject;
import io.getstream.chat.android.models.ContainsFilterObject;
import io.getstream.chat.android.models.DistinctFilterObject;
import io.getstream.chat.android.models.EqualsFilterObject;
import io.getstream.chat.android.models.ExistsFilterObject;
import io.getstream.chat.android.models.FilterObject;
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
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25272z;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000\"\u000e\u0010\u0005\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m65681d2 = {"toMap", "", "", "", "Lio/getstream/chat/android/models/FilterObject;", "KEY_EXIST", "KEY_CONTAINS", "KEY_AND", "KEY_OR", "KEY_NOR", "KEY_NOT_EQUALS", "KEY_GREATER_THAN", "KEY_GREATER_THAN_OR_EQUALS", "KEY_LESS_THAN", "KEY_LESS_THAN_OR_EQUALS", "KEY_IN", "KEY_NOT_IN", "KEY_AUTOCOMPLETE", "KEY_DISTINCT", "KEY_MEMBERS", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FilterObjectToMapKt {
    private static final String KEY_AND = "$and";
    private static final String KEY_AUTOCOMPLETE = "$autocomplete";
    private static final String KEY_CONTAINS = "$contains";
    private static final String KEY_DISTINCT = "distinct";
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

    public static final Map<String, Object> toMap(FilterObject filterObject) {
        AbstractC22676k.m65750j(filterObject, "<this>");
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
            return AbstractC36095b.m114689q(equalsFilterObject.getValue(), equalsFilterObject.getFieldName());
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
}
