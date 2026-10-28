package ur1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;
import yr1.EnumC39731b;

/* JADX INFO: renamed from: ur1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lur1/l;", "Lur1/g;", "<init>", "()V", "d", "e", "a", "b", "f", "c", "Lur1/l$a;", "Lur1/l$b;", "Lur1/l$c;", "Lur1/l$d;", "Lur1/l$e;", "Lur1/l$f;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35195l implements InterfaceC35190g {

    /* JADX INFO: renamed from: ur1.l$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/l$a;", "Lur1/l;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC35195l {

        /* JADX INFO: renamed from: a */
        public static final a f149536a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.l$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/l$b;", "Lur1/l;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC35195l {

        /* JADX INFO: renamed from: a */
        public static final b f149537a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.l$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lur1/l$c;", "Lur1/l;", "", "searchTerm", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC35195l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String searchTerm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String searchTerm) {
            super(null);
            AbstractC22676k.m65750j(searchTerm, "searchTerm");
            this.searchTerm = searchTerm;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.searchTerm, ((c) other).searchTerm);
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("PerformFuzzySearch(searchTerm=", this.searchTerm, ")");
        }
    }

    /* JADX INFO: renamed from: ur1.l$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lur1/l$e;", "Lur1/l;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC35195l {

        /* JADX INFO: renamed from: a */
        public static final e f149547a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ur1.l$f */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lur1/l$f;", "Lur1/l;", "", "", "selectedItems", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC35195l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Integer> selectedItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<Integer> selectedItems) {
            super(null);
            AbstractC22676k.m65750j(selectedItems, "selectedItems");
            this.selectedItems = selectedItems;
        }

        /* JADX INFO: renamed from: a */
        public final List<Integer> m111452a() {
            return this.selectedItems;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.selectedItems, ((f) other).selectedItems);
        }

        public int hashCode() {
            return this.selectedItems.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("SaveCustomizeJournal(selectedItems=", ")", this.selectedItems);
        }
    }

    public /* synthetic */ AbstractC35195l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35195l() {
    }

    /* JADX INFO: renamed from: ur1.l$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b#\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b%\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b\u001c\u0010'¨\u0006("}, m65681d2 = {"Lur1/l$d;", "Lur1/l;", "", "requestDate", "", "cycleId", "", "isAutoPop", "source", "label", "shouldSaveCurrentEntryFirst", "shouldShowDateSelectorLoader", "Lyr1/b;", "journalDateNavigationType", "<init>", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;ZZLyr1/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "J", "()J", "c", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "g", "e", "f", "Lyr1/b;", "()Lyr1/b;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC35195l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String requestDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isAutoPop;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean shouldSaveCurrentEntryFirst;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean shouldShowDateSelectorLoader;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final EnumC39731b journalDateNavigationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String requestDate, long j7, boolean z4, String source, String str, boolean z13, boolean z14, EnumC39731b enumC39731b) {
            super(null);
            AbstractC22676k.m65750j(requestDate, "requestDate");
            AbstractC22676k.m65750j(source, "source");
            this.requestDate = requestDate;
            this.cycleId = j7;
            this.isAutoPop = z4;
            this.source = source;
            this.label = str;
            this.shouldSaveCurrentEntryFirst = z13;
            this.shouldShowDateSelectorLoader = z14;
            this.journalDateNavigationType = enumC39731b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC39731b getJournalDateNavigationType() {
            return this.journalDateNavigationType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRequestDate() {
            return this.requestDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getShouldSaveCurrentEntryFirst() {
            return this.shouldSaveCurrentEntryFirst;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.requestDate, dVar.requestDate) && this.cycleId == dVar.cycleId && this.isAutoPop == dVar.isAutoPop && AbstractC22676k.m65745e(this.source, dVar.source) && AbstractC22676k.m65745e(this.label, dVar.label) && this.shouldSaveCurrentEntryFirst == dVar.shouldSaveCurrentEntryFirst && this.shouldShowDateSelectorLoader == dVar.shouldShowDateSelectorLoader && this.journalDateNavigationType == dVar.journalDateNavigationType;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShouldShowDateSelectorLoader() {
            return this.shouldShowDateSelectorLoader;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsAutoPop() {
            return this.isAutoPop;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30451e(this.requestDate.hashCode() * 31, this.cycleId, 31), 31, this.isAutoPop), 31, this.source);
            String str = this.label;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.shouldSaveCurrentEntryFirst), 31, this.shouldShowDateSelectorLoader);
            EnumC39731b enumC39731b = this.journalDateNavigationType;
            return iM8289b + (enumC39731b != null ? enumC39731b.hashCode() : 0);
        }

        public String toString() {
            String str = this.requestDate;
            long j7 = this.cycleId;
            boolean z4 = this.isAutoPop;
            String str2 = this.source;
            String str3 = this.label;
            boolean z13 = this.shouldSaveCurrentEntryFirst;
            boolean z14 = this.shouldShowDateSelectorLoader;
            EnumC39731b enumC39731b = this.journalDateNavigationType;
            StringBuilder sbM32000s = AbstractC11895b.m32000s("Refresh(requestDate=", str, j7, ", cycleId=");
            sbM32000s.append(", isAutoPop=");
            sbM32000s.append(z4);
            sbM32000s.append(", source=");
            sbM32000s.append(str2);
            sbM32000s.append(", label=");
            sbM32000s.append(str3);
            sbM32000s.append(", shouldSaveCurrentEntryFirst=");
            sbM32000s.append(z13);
            sbM32000s.append(", shouldShowDateSelectorLoader=");
            sbM32000s.append(z14);
            sbM32000s.append(", journalDateNavigationType=");
            sbM32000s.append(enumC39731b);
            sbM32000s.append(")");
            return sbM32000s.toString();
        }

        public /* synthetic */ d(String str, long j7, boolean z4, String str2, String str3, boolean z13, boolean z14, EnumC39731b enumC39731b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j7, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? false : z14, (i13 & 128) != 0 ? null : enumC39731b);
        }
    }
}
