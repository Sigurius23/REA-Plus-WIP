package za2;

import ny0.C27256h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: za2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lza2/a;", "", "<init>", "()V", "c", "b", "a", "Lza2/a$a;", "Lza2/a$b;", "Lza2/a$c;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40225a {

    /* JADX INFO: renamed from: za2.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lza2/a$a;", "Lza2/a;", "", "screenId", "value", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC40225a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String screenId, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(screenId, "screenId");
            this.screenId = screenId;
            this.value = str;
            this.category = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getScreenId() {
            return this.screenId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.screenId, aVar.screenId) && AbstractC22676k.m65745e(this.value, aVar.value) && AbstractC22676k.m65745e(this.category, aVar.category);
        }

        public int hashCode() {
            int iHashCode = this.screenId.hashCode() * 31;
            String str = this.value;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.category;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.category, ")", AbstractC11895b.m32001t("DismissCard(screenId=", this.screenId, ", value=", this.value, ", category="));
        }
    }

    /* JADX INFO: renamed from: za2.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lza2/a$b;", "Lza2/a;", "Lny0/h;", "button", "", "value", "category", "<init>", "(Lny0/h;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lny0/h;", "()Lny0/h;", "b", "Ljava/lang/String;", "c", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC40225a {

        /* JADX INFO: renamed from: d */
        public static final int f173725d = C27256h.f109055z;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C27256h button;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String category;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C27256h button, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(button, "button");
            this.button = button;
            this.value = str;
            this.category = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C27256h getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.button, bVar.button) && AbstractC22676k.m65745e(this.value, bVar.value) && AbstractC22676k.m65745e(this.category, bVar.category);
        }

        public int hashCode() {
            int iHashCode = this.button.hashCode() * 31;
            String str = this.value;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.category;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            C27256h c27256h = this.button;
            String str = this.value;
            String str2 = this.category;
            StringBuilder sb4 = new StringBuilder("UpsellButtonClicked(button=");
            sb4.append(c27256h);
            sb4.append(", value=");
            sb4.append(str);
            sb4.append(", category=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: za2.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lza2/a$c;", "Lza2/a;", "", "value", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC40225a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String category;

        public c(String str, String str2) {
            super(null);
            this.value = str;
            this.category = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.value, cVar.value) && AbstractC22676k.m65745e(this.category, cVar.category);
        }

        public int hashCode() {
            String str = this.value;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.category;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("UpsellCardViewed(value=", this.value, ", category=", this.category, ")");
        }
    }

    public /* synthetic */ AbstractC40225a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC40225a() {
    }
}
