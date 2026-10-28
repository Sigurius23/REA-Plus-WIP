package id1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: id1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lid1/b;", "", "<init>", "()V", "a", "b", "Lid1/b$a;", "Lid1/b$b;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18411b {

    /* JADX INFO: renamed from: id1.b$a */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m65681d2 = {"Lid1/b$a;", "Lid1/b;", "", "itemType", "<init>", "(Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC18411b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object itemType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object itemType) {
            super(null);
            AbstractC22676k.m65750j(itemType, "itemType");
            this.itemType = itemType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getItemType() {
            return this.itemType;
        }
    }

    /* JADX INFO: renamed from: id1.b$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m65681d2 = {"Lid1/b$b;", "Lid1/b;", "", "searchQuery", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC18411b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String searchQuery;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String searchQuery) {
            super(null);
            AbstractC22676k.m65750j(searchQuery, "searchQuery");
            this.searchQuery = searchQuery;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }
    }

    public /* synthetic */ AbstractC18411b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18411b() {
    }
}
