package xz1;

import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xz1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lxz1/c;", "", "<init>", "()V", "a", "b", "c", "Lxz1/c$a;", "Lxz1/c$b;", "Lxz1/c$c;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38758c {

    /* JADX INFO: renamed from: xz1.c$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lxz1/c$a;", "Lxz1/c;", "", "slug", "sku", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC38758c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String slug;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String sku;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String slug, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(slug, "slug");
            this.slug = slug;
            this.sku = str;
            this.source = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.slug, aVar.slug) && AbstractC22676k.m65745e(this.sku, aVar.sku) && AbstractC22676k.m65745e(this.source, aVar.source);
        }

        public int hashCode() {
            int iHashCode = this.slug.hashCode() * 31;
            String str = this.sku;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.source, ")", AbstractC11895b.m32001t("FetchPdp(slug=", this.slug, ", sku=", this.sku, ", source="));
        }
    }

    /* JADX INFO: renamed from: xz1.c$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, m65681d2 = {"Lxz1/c$b;", "Lxz1/c;", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "level", "", "optionKey", "", "variantIndex", "packItemId", "packItemProductKey", "<init>", "(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "b", "Ljava/lang/String;", "c", "I", "e", "d", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC38758c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SelectorLevel level;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String optionKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int variantIndex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String packItemId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String packItemProductKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SelectorLevel level, String optionKey, int i13, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(level, "level");
            AbstractC22676k.m65750j(optionKey, "optionKey");
            this.level = level;
            this.optionKey = optionKey;
            this.variantIndex = i13;
            this.packItemId = str;
            this.packItemProductKey = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SelectorLevel getLevel() {
            return this.level;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getOptionKey() {
            return this.optionKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPackItemId() {
            return this.packItemId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPackItemProductKey() {
            return this.packItemProductKey;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getVariantIndex() {
            return this.variantIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.level == bVar.level && AbstractC22676k.m65745e(this.optionKey, bVar.optionKey) && this.variantIndex == bVar.variantIndex && AbstractC22676k.m65745e(this.packItemId, bVar.packItemId) && AbstractC22676k.m65745e(this.packItemProductKey, bVar.packItemProductKey);
        }

        public int hashCode() {
            int iM30448b = AbstractC11266d.m30448b(this.variantIndex, AbstractC11266d.m30450d(this.level.hashCode() * 31, 31, this.optionKey), 31);
            String str = this.packItemId;
            int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.packItemProductKey;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            SelectorLevel selectorLevel = this.level;
            String str = this.optionKey;
            int i13 = this.variantIndex;
            String str2 = this.packItemId;
            String str3 = this.packItemProductKey;
            StringBuilder sb4 = new StringBuilder("SelectVariant(level=");
            sb4.append(selectorLevel);
            sb4.append(", optionKey=");
            sb4.append(str);
            sb4.append(", variantIndex=");
            AbstractC11895b.m31979B(i13, ", packItemId=", str2, ", packItemProductKey=", sb4);
            return AbstractC25012a.m73376i(str3, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: xz1.c$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lxz1/c$c;", "Lxz1/c;", "", "tagId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC38758c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String tagId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String tagId) {
            super(null);
            AbstractC22676k.m65750j(tagId, "tagId");
            this.tagId = tagId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTagId() {
            return this.tagId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.tagId, ((c) other).tagId);
        }

        public int hashCode() {
            return this.tagId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SelectWywTag(tagId=", this.tagId, ")");
        }
    }

    public /* synthetic */ AbstractC38758c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC38758c() {
    }
}
