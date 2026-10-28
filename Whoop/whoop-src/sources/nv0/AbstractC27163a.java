package nv0;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: nv0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lnv0/a;", "", "<init>", "()V", "b", "d", "c", "a", "e", "Lnv0/a$a;", "Lnv0/a$b;", "Lnv0/a$c;", "Lnv0/a$d;", "Lnv0/a$e;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27163a {

    /* JADX INFO: renamed from: nv0.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnv0/a$a;", "Lnv0/a;", "<init>", "()V", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC27163a {

        /* JADX INFO: renamed from: a */
        public static final a f108667a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: nv0.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lnv0/a$b;", "Lnv0/a;", "", "searchQuery", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC27163a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String searchQuery;

        public b(String str) {
            super(null);
            this.searchQuery = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.searchQuery, ((b) other).searchQuery);
        }

        public int hashCode() {
            String str = this.searchQuery;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("GetContent(searchQuery=", this.searchQuery, ")");
        }
    }

    /* JADX INFO: renamed from: nv0.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lnv0/a$c;", "Lnv0/a;", "", "searchQuery", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC27163a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String searchQuery;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String searchQuery) {
            super(null);
            AbstractC22676k.m65750j(searchQuery, "searchQuery");
            this.searchQuery = searchQuery;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSearchQuery() {
            return this.searchQuery;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.searchQuery, ((c) other).searchQuery);
        }

        public int hashCode() {
            return this.searchQuery.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("GetNextPage(searchQuery=", this.searchQuery, ")");
        }
    }

    /* JADX INFO: renamed from: nv0.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lnv0/a$d;", "Lnv0/a;", "", "filter", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC27163a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String filter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String filter) {
            super(null);
            AbstractC22676k.m65750j(filter, "filter");
            this.filter = filter;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFilter() {
            return this.filter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.filter, ((d) other).filter);
        }

        public int hashCode() {
            return this.filter.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("OnFilterSelected(filter=", this.filter, ")");
        }
    }

    /* JADX INFO: renamed from: nv0.a$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lnv0/a$e;", "Lnv0/a;", "", "newText", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "content-search_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC27163a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String newText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String newText) {
            super(null);
            AbstractC22676k.m65750j(newText, "newText");
            this.newText = newText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNewText() {
            return this.newText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.newText, ((e) other).newText);
        }

        public int hashCode() {
            return this.newText.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SearchFieldTextChanged(newText=", this.newText, ")");
        }
    }

    public /* synthetic */ AbstractC27163a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC27163a() {
    }
}
