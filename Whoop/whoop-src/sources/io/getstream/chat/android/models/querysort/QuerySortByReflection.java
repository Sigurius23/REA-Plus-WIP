package io.getstream.chat.android.models.querysort;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.extensions.StringExtensionsKt;
import io.getstream.chat.android.models.CustomObject;
import io.getstream.chat.android.models.querysort.internal.ComparationsKt;
import io.getstream.chat.android.models.querysort.internal.SortAttribute;
import io.getstream.chat.android.models.querysort.internal.SortSpecification;
import j93.InterfaceC21461d;
import j93.InterfaceC21490w;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 >*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001>B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b*\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000fJ'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002¢\u0006\u0004\b\u0018\u0010\u001cJ5\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J5\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J#\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0010¢\u0006\u0004\b'\u0010(J/\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b,\u0010+J+\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b*\u0010-J+\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b,\u0010-J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010.J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b,\u0010.J+\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b*\u0010/J+\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b,\u0010/J!\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0100H\u0000¢\u0006\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m65681d2 = {"Lio/getstream/chat/android/models/querysort/QuerySortByReflection;", "", "T", "Lio/getstream/chat/android/models/querysort/BaseQuerySort;", "<init>", "()V", "Lj93/w;", "", "Lio/getstream/chat/android/models/querysort/SortDirection;", "sortDirection", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Lj93/w;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;", "", "(Ljava/lang/String;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;", "any", "field", "comparableFromExtraData", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Comparable;", "fieldName", "Ljava/lang/Class;", "javaClass", "Lio/getstream/chat/android/models/querysort/internal/SortAttribute;", "getSortFeature", "(Ljava/lang/String;Ljava/lang/Class;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;", "Lj93/d;", "kClass", "(Ljava/lang/String;Lj93/d;)Lio/getstream/chat/android/models/querysort/internal/SortAttribute;", "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;", "firstSort", "comparatorFromFieldSort", "(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;", "Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;", "name", "comparatorFromNameAttribute", "(Lio/getstream/chat/android/models/querysort/internal/SortAttribute$FieldNameSortAttribute;Lio/getstream/chat/android/models/querysort/SortDirection;)Ljava/util/Comparator;", "Lio/getstream/chat/android/models/querysort/internal/SortSpecification;", "sortSpecification", "add$stream_chat_android_core", "(Lio/getstream/chat/android/models/querysort/internal/SortSpecification;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;", "add", "asc", "(Lj93/w;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;", "desc", "(Ljava/lang/String;Ljava/lang/Class;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;", "(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;", "(Ljava/lang/String;Lj93/d;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;", "", "Ll83/k;", "toList$stream_chat_android_core", "()Ljava/util/List;", "toList", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/models/querysort/FieldSearcher;", "fieldSearcher", "Lio/getstream/chat/android/models/querysort/FieldSearcher;", "Companion", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class QuerySortByReflection<T> extends BaseQuerySort<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger = AbstractC1772c1.m5382S(this, "QuerySort");
    private final FieldSearcher fieldSearcher = new FieldSearcher();

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\n\b\u0001\u0010\u0004\u0018\u0001*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\n\b\u0001\u0010\u0004\u0018\u0001*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\n\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\n\b\u0001\u0010\u0004\u0018\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\n\b\u0001\u0010\r\u0018\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u000e\u0010\fJ7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\u000f¢\u0006\u0004\b\u000b\u0010\u0012J7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\u000f¢\u0006\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/models/querysort/QuerySortByReflection$Companion;", "", "<init>", "()V", "T", "Lio/getstream/chat/android/models/querysort/QuerySortByReflection;", "", "fieldName", "ascByName", "(Lio/getstream/chat/android/models/querysort/QuerySortByReflection;Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;", "descByName", "asc", "(Ljava/lang/String;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;", "R", "desc", "Lj93/w;", "", "field", "(Lj93/w;)Lio/getstream/chat/android/models/querysort/QuerySortByReflection;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> QuerySortByReflection<T> asc(String fieldName) {
            AbstractC22676k.m65750j(fieldName, "fieldName");
            new QuerySortByReflection();
            AbstractC22676k.m65756p();
            throw null;
        }

        public final <T> QuerySortByReflection<T> ascByName(QuerySortByReflection<T> querySortByReflection, String fieldName) {
            AbstractC22676k.m65750j(querySortByReflection, "<this>");
            AbstractC22676k.m65750j(fieldName, "fieldName");
            AbstractC22676k.m65756p();
            throw null;
        }

        public final <R> QuerySortByReflection<R> desc(String fieldName) {
            AbstractC22676k.m65750j(fieldName, "fieldName");
            new QuerySortByReflection();
            AbstractC22676k.m65756p();
            throw null;
        }

        public final <T> QuerySortByReflection<T> descByName(QuerySortByReflection<T> querySortByReflection, String fieldName) {
            AbstractC22676k.m65750j(querySortByReflection, "<this>");
            AbstractC22676k.m65750j(fieldName, "fieldName");
            AbstractC22676k.m65756p();
            throw null;
        }

        private Companion() {
        }

        public final <T> QuerySortByReflection<T> asc(InterfaceC21490w field) {
            AbstractC22676k.m65750j(field, "field");
            return new QuerySortByReflection().asc(field);
        }

        public final <T> QuerySortByReflection<T> desc(InterfaceC21490w field) {
            AbstractC22676k.m65750j(field, "field");
            return new QuerySortByReflection().desc(field);
        }
    }

    private final Comparable<Object> comparableFromExtraData(Object any, String field) {
        Map<String, Object> extraData;
        CustomObject customObject = any instanceof CustomObject ? (CustomObject) any : null;
        Object obj = (customObject == null || (extraData = customObject.getExtraData()) == null) ? null : extraData.get(field);
        if (obj instanceof Comparable) {
            return (Comparable) obj;
        }
        return null;
    }

    private final Comparator<T> comparator(InterfaceC21490w interfaceC21490w, SortDirection sortDirection) {
        return new C19467a(interfaceC21490w, sortDirection, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int comparator$lambda$1$lambda$0(InterfaceC21490w interfaceC21490w, SortDirection sortDirection, Object obj, Object obj2) {
        Object objCall = interfaceC21490w.getGetter().call(obj);
        Comparable comparable = objCall instanceof Comparable ? (Comparable) objCall : null;
        Object objCall2 = interfaceC21490w.getGetter().call(obj2);
        return ComparationsKt.compare(comparable, objCall2 instanceof Comparable ? (Comparable) objCall2 : null, sortDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int comparator$lambda$2(QuerySortByReflection querySortByReflection, String str, SortDirection sortDirection, Object obj, Object obj2) {
        AbstractC22676k.m65747g(obj);
        Comparable<Object> comparableComparableFromExtraData = querySortByReflection.comparableFromExtraData(obj, str);
        if (comparableComparableFromExtraData == null) {
            comparableComparableFromExtraData = querySortByReflection.fieldSearcher.findComparable$stream_chat_android_core(obj, str);
        }
        AbstractC22676k.m65747g(obj2);
        Comparable<Object> comparableComparableFromExtraData2 = querySortByReflection.comparableFromExtraData(obj2, str);
        if (comparableComparableFromExtraData2 == null) {
            comparableComparableFromExtraData2 = querySortByReflection.fieldSearcher.findComparable$stream_chat_android_core(obj2, str);
        }
        return ComparationsKt.compare(comparableComparableFromExtraData, comparableComparableFromExtraData2, sortDirection);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final SortAttribute<T> getSortFeature(String fieldName, Class<T> javaClass) {
        InterfaceC21461d interfaceC21461dCreateKotlinClass = AbstractC22671h0.f89337a.createKotlinClass(javaClass);
        AbstractC22676k.m65748h(interfaceC21461dCreateKotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<T of io.getstream.chat.android.models.querysort.QuerySortByReflection>");
        return getSortFeature(fieldName, interfaceC21461dCreateKotlinClass);
    }

    public QuerySortByReflection<T> add$stream_chat_android_core(SortSpecification<T> sortSpecification) {
        AbstractC22676k.m65750j(sortSpecification, "sortSpecification");
        setSortSpecifications(AbstractC25265s.m74128f1(sortSpecification, getSortSpecifications()));
        return this;
    }

    public QuerySortByReflection<T> asc(InterfaceC21490w field) {
        AbstractC22676k.m65750j(field, "field");
        return add$stream_chat_android_core(new SortSpecification<>(new SortAttribute.FieldSortAttribute(field, StringExtensionsKt.camelCaseToSnakeCase(field.getName())), SortDirection.ASC));
    }

    @Override // io.getstream.chat.android.models.querysort.BaseQuerySort
    public Comparator<T> comparatorFromFieldSort(SortAttribute.FieldSortAttribute<T> firstSort, SortDirection sortDirection) {
        AbstractC22676k.m65750j(firstSort, "firstSort");
        AbstractC22676k.m65750j(sortDirection, "sortDirection");
        return comparator(firstSort.getField(), sortDirection);
    }

    @Override // io.getstream.chat.android.models.querysort.BaseQuerySort
    public Comparator<T> comparatorFromNameAttribute(SortAttribute.FieldNameSortAttribute<T> name, SortDirection sortDirection) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(sortDirection, "sortDirection");
        return comparator(name.getName(), sortDirection);
    }

    public QuerySortByReflection<T> desc(InterfaceC21490w field) {
        AbstractC22676k.m65750j(field, "field");
        return add$stream_chat_android_core(new SortSpecification<>(new SortAttribute.FieldSortAttribute(field, StringExtensionsKt.camelCaseToSnakeCase(field.getName())), SortDirection.DESC));
    }

    public final List<C23465k> toList$stream_chat_android_core() {
        List<SortSpecification<T>> sortSpecifications = getSortSpecifications();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sortSpecifications, 10));
        Iterator<T> it = sortSpecifications.iterator();
        while (it.hasNext()) {
            SortSpecification sortSpecification = (SortSpecification) it.next();
            arrayList.add(new C23465k(sortSpecification.getSortAttribute().getName(), sortSpecification.getSortDirection()));
        }
        return arrayList;
    }

    private final Comparator<T> comparator(final String str, final SortDirection sortDirection) {
        return new Comparator() { // from class: io.getstream.chat.android.models.querysort.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QuerySortByReflection.comparator$lambda$2(this.f73976w, str, sortDirection, obj, obj2);
            }
        };
    }

    private final SortAttribute<T> getSortFeature(String fieldName, InterfaceC21461d kClass) {
        InterfaceC21490w interfaceC21490wFindComparableMemberProperty$stream_chat_android_core = this.fieldSearcher.findComparableMemberProperty$stream_chat_android_core(fieldName, kClass);
        SortAttribute.FieldSortAttribute fieldSortAttribute = interfaceC21490wFindComparableMemberProperty$stream_chat_android_core != null ? new SortAttribute.FieldSortAttribute(interfaceC21490wFindComparableMemberProperty$stream_chat_android_core, fieldName) : null;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[getSortFeature] A field to sort was found. Using field: " + fieldSortAttribute, null);
        }
        return fieldSortAttribute != null ? fieldSortAttribute : new SortAttribute.FieldNameSortAttribute(fieldName);
    }

    public QuerySortByReflection<T> asc(String fieldName, Class<T> javaClass) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(javaClass, "javaClass");
        return add$stream_chat_android_core(new SortSpecification<>(getSortFeature(fieldName, javaClass), SortDirection.ASC));
    }

    public QuerySortByReflection<T> asc(String fieldName) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        return add$stream_chat_android_core(new SortSpecification<>(new SortAttribute.FieldNameSortAttribute(fieldName), SortDirection.ASC));
    }

    public QuerySortByReflection<T> desc(String fieldName, Class<T> javaClass) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(javaClass, "javaClass");
        return add$stream_chat_android_core(new SortSpecification<>(getSortFeature(fieldName, javaClass), SortDirection.DESC));
    }

    public QuerySortByReflection<T> desc(String fieldName) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        return add$stream_chat_android_core(new SortSpecification<>(new SortAttribute.FieldNameSortAttribute(fieldName), SortDirection.DESC));
    }

    public QuerySortByReflection<T> asc(String fieldName, InterfaceC21461d kClass) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(kClass, "kClass");
        return add$stream_chat_android_core(new SortSpecification<>(getSortFeature(fieldName, kClass), SortDirection.ASC));
    }

    public QuerySortByReflection<T> desc(String fieldName, InterfaceC21461d kClass) {
        AbstractC22676k.m65750j(fieldName, "fieldName");
        AbstractC22676k.m65750j(kClass, "kClass");
        return add$stream_chat_android_core(new SortSpecification<>(getSortFeature(fieldName, kClass), SortDirection.DESC));
    }
}
