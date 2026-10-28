package io.getstream.chat.android.models;

import java.util.List;
import l83.InterfaceC23457c;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0010\u0004\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J!\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00052\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0007J)\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000e\"\u00020\bH\u0007¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bH\u0007J)\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u000e\"\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001dJ)\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000e\"\u00020\bH\u0007¢\u0006\u0002\u0010\u001aJ\u001e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bH\u0007J)\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u000e\"\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0016\u0010 \u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u001bH\u0007¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/models/Filters;", "", "<init>", "()V", "neutral", "Lio/getstream/chat/android/models/FilterObject;", "exists", "fieldName", "", "notExists", "contains", "value", "and", "filters", "", "([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;", "or", "nor", "eq", "ne", "greaterThan", "greaterThanEquals", "lessThan", "lessThanEquals", "in", "values", "(Ljava/lang/String;[Ljava/lang/String;)Lio/getstream/chat/android/models/FilterObject;", "", "", "(Ljava/lang/String;[Ljava/lang/Number;)Lio/getstream/chat/android/models/FilterObject;", "nin", "autocomplete", "distinct", "memberIds", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class Filters {
    public static final Filters INSTANCE = new Filters();

    private Filters() {
    }

    public static final FilterObject and(FilterObject... filters) {
        AbstractC22676k.m65750j(filters, "filters");
        return new AndFilterObject(AbstractC25260n.m74059b1(filters));
    }

    public static final FilterObject autocomplete(String fieldName, String value) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        return new AutocompleteFilterObject(fieldName, value);
    }

    public static final FilterObject contains(String fieldName, Object value) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        return new ContainsFilterObject(fieldName, value);
    }

    public static final FilterObject distinct(List<String> memberIds) {
        AbstractC22676k.m65750j(memberIds, "memberIds");
        return new DistinctFilterObject(AbstractC25265s.m74103I1(memberIds));
    }

    /* JADX INFO: renamed from: eq */
    public static final FilterObject m54979eq(String fieldName, Object value) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        return new EqualsFilterObject(fieldName, value);
    }

    public static final FilterObject exists(String fieldName) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        return new ExistsFilterObject(fieldName);
    }

    public static final FilterObject greaterThan(String fieldName, Object value) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        return new GreaterThanFilterObject(fieldName, value);
    }

    public static final FilterObject greaterThanEquals(String fieldName, Object value) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        return new GreaterThanOrEqualsFilterObject(fieldName, value);
    }

    /* JADX INFO: renamed from: in */
    public static final FilterObject m54982in(String fieldName, String... values) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(values, "values");
        return new InFilterObject(fieldName, AbstractC25260n.m74059b1(values));
    }

    public static final FilterObject lessThan(String fieldName, Object value) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        return new LessThanFilterObject(fieldName, value);
    }

    public static final FilterObject lessThanEquals(String fieldName, Object value) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        return new LessThanOrEqualsFilterObject(fieldName, value);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: ne */
    public static final FilterObject m54983ne(String fieldName, Object value) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(value, "value");
        return new NotEqualsFilterObject(fieldName, value);
    }

    public static final FilterObject neutral() {
        return NeutralFilterObject.INSTANCE;
    }

    @InterfaceC23457c
    public static final FilterObject nin(String fieldName, String... values) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(values, "values");
        return new NotInFilterObject(fieldName, AbstractC25260n.m74059b1(values));
    }

    public static final FilterObject nor(FilterObject... filters) {
        AbstractC22676k.m65750j(filters, "filters");
        return new NorFilterObject(AbstractC25260n.m74059b1(filters));
    }

    public static final FilterObject notExists(String fieldName) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        return new NotExistsFilterObject(fieldName);
    }

    /* JADX INFO: renamed from: or */
    public static final FilterObject m54984or(FilterObject... filters) {
        AbstractC22676k.m65750j(filters, "filters");
        return new OrFilterObject(AbstractC25260n.m74059b1(filters));
    }

    /* JADX INFO: renamed from: in */
    public static final FilterObject m54980in(String fieldName, List<? extends Object> values) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(values, "values");
        return new InFilterObject(fieldName, AbstractC25265s.m74103I1(values));
    }

    @InterfaceC23457c
    public static final FilterObject nin(String fieldName, List<? extends Object> values) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(values, "values");
        return new NotInFilterObject(fieldName, AbstractC25265s.m74103I1(values));
    }

    /* JADX INFO: renamed from: in */
    public static final FilterObject m54981in(String fieldName, Number... values) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(values, "values");
        return new InFilterObject(fieldName, AbstractC25260n.m74059b1(values));
    }

    @InterfaceC23457c
    public static final FilterObject nin(String fieldName, Number... values) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(values, "values");
        return new NotInFilterObject(fieldName, AbstractC25260n.m74059b1(values));
    }
}
