package cs1;

import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import w71.AbstractC36877d;
import yr1.EnumC39731b;

/* JADX INFO: renamed from: cs1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, m65681d2 = {"Lcs1/c;", "", "<init>", "()V", "j", "l", "a", "n", "e", "f", "p", "q", "b", "k", "g", "o", "c", "r", "m", "i", "s", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "Lcs1/c$a;", "Lcs1/c$b;", "Lcs1/c$c;", "Lcs1/c$d;", "Lcs1/c$e;", "Lcs1/c$f;", "Lcs1/c$g;", "Lcs1/c$h;", "Lcs1/c$i;", "Lcs1/c$j;", "Lcs1/c$k;", "Lcs1/c$l;", "Lcs1/c$m;", "Lcs1/c$n;", "Lcs1/c$o;", "Lcs1/c$p;", "Lcs1/c$q;", "Lcs1/c$r;", "Lcs1/c$s;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11103c {

    /* JADX INFO: renamed from: cs1.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcs1/c$a;", "Lcs1/c;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC11103c {

        /* JADX INFO: renamed from: a */
        public static final a f35266a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: cs1.c$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lcs1/c$b;", "Lcs1/c;", "", MapboxMap.QFE_OFFSET, "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int offset;

        public b(int i13) {
            super(null);
            this.offset = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && this.offset == ((b) other).offset;
        }

        public int hashCode() {
            return Integer.hashCode(this.offset);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.offset, "CalendarPaged(offset=", ")");
        }
    }

    /* JADX INFO: renamed from: cs1.c$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lcs1/c$c;", "Lcs1/c;", "", "categoryIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int categoryIndex;

        public c(int i13) {
            super(null);
            this.categoryIndex = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCategoryIndex() {
            return this.categoryIndex;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.categoryIndex == ((c) other).categoryIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.categoryIndex);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.categoryIndex, "ChangeCategory(categoryIndex=", ")");
        }
    }

    /* JADX INFO: renamed from: cs1.c$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcs1/c$d;", "Lcs1/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC11103c {

        /* JADX INFO: renamed from: a */
        public static final d f35269a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -806520438;
        }

        public String toString() {
            return "ClearOnSaveNavigation";
        }
    }

    /* JADX INFO: renamed from: cs1.c$e */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcs1/c$e;", "Lcs1/c;", "", "checkboxCheck", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getCheckboxCheck", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean checkboxCheck;

        public e(boolean z4) {
            super(null);
            this.checkboxCheck = z4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.checkboxCheck == ((e) other).checkboxCheck;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checkboxCheck);
        }

        public String toString() {
            return AbstractC3855a.m11827k("HideDismissConfirmationDialog(checkboxCheck=", ")", this.checkboxCheck);
        }
    }

    /* JADX INFO: renamed from: cs1.c$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcs1/c$f;", "Lcs1/c;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC11103c {

        /* JADX INFO: renamed from: a */
        public static final f f35271a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: cs1.c$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcs1/c$g;", "Lcs1/c;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC11103c {

        /* JADX INFO: renamed from: a */
        public static final g f35272a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: cs1.c$h */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcs1/c$h;", "Lcs1/c;", "", "searchTerm", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String searchTerm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String searchTerm) {
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
            return (other instanceof h) && AbstractC22676k.m65745e(this.searchTerm, ((h) other).searchTerm);
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("PerformFuzzySearch(searchTerm=", this.searchTerm, ")");
        }
    }

    /* JADX INFO: renamed from: cs1.c$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcs1/c$i;", "Lcs1/c;", "", HttpHeaders.DATE, "", "displayLoading", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean displayLoading;

        public i(String str, boolean z4) {
            super(null);
            this.date = str;
            this.displayLoading = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getDisplayLoading() {
            return this.displayLoading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return AbstractC22676k.m65745e(this.date, iVar.date) && this.displayLoading == iVar.displayLoading;
        }

        public int hashCode() {
            String str = this.date;
            return Boolean.hashCode(this.displayLoading) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("RefreshDatePicker(date=", this.date, ", displayLoading=", ")", this.displayLoading);
        }

        public /* synthetic */ i(String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? true : z4);
        }
    }

    /* JADX INFO: renamed from: cs1.c$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcs1/c$k;", "Lcs1/c;", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && AbstractC22676k.m65745e(this.date, ((k) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("RefreshSpecificCalendarDate(date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: cs1.c$l */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcs1/c$l;", "Lcs1/c;", "", "usePreviousAnswersToggleEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getUsePreviousAnswersToggleEnabled", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean usePreviousAnswersToggleEnabled;

        public l(boolean z4) {
            super(null);
            this.usePreviousAnswersToggleEnabled = z4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && this.usePreviousAnswersToggleEnabled == ((l) other).usePreviousAnswersToggleEnabled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.usePreviousAnswersToggleEnabled);
        }

        public String toString() {
            return AbstractC3855a.m11827k("Save(usePreviousAnswersToggleEnabled=", ")", this.usePreviousAnswersToggleEnabled);
        }
    }

    /* JADX INFO: renamed from: cs1.c$m */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lcs1/c$m;", "Lcs1/c;", "", "", "lastSelectedToggleIds", "selectedItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<Integer> lastSelectedToggleIds;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<Integer> selectedItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List<Integer> lastSelectedToggleIds, List<Integer> selectedItems) {
            super(null);
            AbstractC22676k.m65750j(lastSelectedToggleIds, "lastSelectedToggleIds");
            AbstractC22676k.m65750j(selectedItems, "selectedItems");
            this.lastSelectedToggleIds = lastSelectedToggleIds;
            this.selectedItems = selectedItems;
        }

        /* JADX INFO: renamed from: a */
        public final List<Integer> m30019a() {
            return this.lastSelectedToggleIds;
        }

        /* JADX INFO: renamed from: b */
        public final List<Integer> m30020b() {
            return this.selectedItems;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.lastSelectedToggleIds, mVar.lastSelectedToggleIds) && AbstractC22676k.m65745e(this.selectedItems, mVar.selectedItems);
        }

        public int hashCode() {
            return this.selectedItems.hashCode() + (this.lastSelectedToggleIds.hashCode() * 31);
        }

        public String toString() {
            return AbstractC13673n.m38562i("SaveCustomizeJournal(lastSelectedToggleIds=", ", selectedItems=", this.lastSelectedToggleIds, ")", this.selectedItems);
        }
    }

    /* JADX INFO: renamed from: cs1.c$n */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcs1/c$n;", "Lcs1/c;", "<init>", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC11103c {

        /* JADX INFO: renamed from: a */
        public static final n f35288a = new n();

        private n() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: cs1.c$o */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcs1/c$o;", "Lcs1/c;", "", "id", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String id4) {
            super(null);
            AbstractC22676k.m65750j(id4, "id");
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && AbstractC22676k.m65745e(this.id, ((o) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ToggleItem(id=", this.id, ")");
        }
    }

    /* JADX INFO: renamed from: cs1.c$p */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcs1/c$p;", "Lcs1/c;", "Lw71/d;", "journalQuestionViewEvent", "<init>", "(Lw71/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw71/d;", "()Lw71/d;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p extends AbstractC11103c {

        /* JADX INFO: renamed from: b */
        public static final int f35290b = AbstractC36877d.f157722a;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC36877d journalQuestionViewEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(AbstractC36877d journalQuestionViewEvent) {
            super(null);
            AbstractC22676k.m65750j(journalQuestionViewEvent, "journalQuestionViewEvent");
            this.journalQuestionViewEvent = journalQuestionViewEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC36877d getJournalQuestionViewEvent() {
            return this.journalQuestionViewEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p) && AbstractC22676k.m65745e(this.journalQuestionViewEvent, ((p) other).journalQuestionViewEvent);
        }

        public int hashCode() {
            return this.journalQuestionViewEvent.hashCode();
        }

        public String toString() {
            return "UpdateAnswers(journalQuestionViewEvent=" + this.journalQuestionViewEvent + ")";
        }
    }

    /* JADX INFO: renamed from: cs1.c$q */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcs1/c$q;", "Lcs1/c;", "", "defaultToggleStatus", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean defaultToggleStatus;

        public q(boolean z4) {
            super(null);
            this.defaultToggleStatus = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDefaultToggleStatus() {
            return this.defaultToggleStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof q) && this.defaultToggleStatus == ((q) other).defaultToggleStatus;
        }

        public int hashCode() {
            return Boolean.hashCode(this.defaultToggleStatus);
        }

        public String toString() {
            return AbstractC3855a.m11827k("UpdateDefaultToggleStatus(defaultToggleStatus=", ")", this.defaultToggleStatus);
        }
    }

    /* JADX INFO: renamed from: cs1.c$r */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcs1/c$r;", "Lcs1/c;", "", "query", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String query) {
            super(null);
            AbstractC22676k.m65750j(query, "query");
            this.query = query;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof r) && AbstractC22676k.m65745e(this.query, ((r) other).query);
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateSearchQuery(query=", this.query, ")");
        }
    }

    /* JADX INFO: renamed from: cs1.c$s */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcs1/c$s;", "Lcs1/c;", "", "selectedDate", "currentDate", "", "hasUserEditJournal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s extends AbstractC11103c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectedDate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String currentDate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean hasUserEditJournal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String selectedDate, String str, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(selectedDate, "selectedDate");
            this.selectedDate = selectedDate;
            this.currentDate = str;
            this.hasUserEditJournal = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrentDate() {
            return this.currentDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasUserEditJournal() {
            return this.hasUserEditJournal;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSelectedDate() {
            return this.selectedDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof s)) {
                return false;
            }
            s sVar = (s) other;
            return AbstractC22676k.m65745e(this.selectedDate, sVar.selectedDate) && AbstractC22676k.m65745e(this.currentDate, sVar.currentDate) && this.hasUserEditJournal == sVar.hasUserEditJournal;
        }

        public int hashCode() {
            int iHashCode = this.selectedDate.hashCode() * 31;
            String str = this.currentDate;
            return Boolean.hashCode(this.hasUserEditJournal) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.selectedDate;
            String str2 = this.currentDate;
            return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("UpdateSelectedPill(selectedDate=", str, ", currentDate=", str2, ", hasUserEditJournal="), this.hasUserEditJournal, ")");
        }
    }

    public /* synthetic */ AbstractC11103c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC11103c() {
    }

    /* JADX INFO: renamed from: cs1.c$j */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b#\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b%\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(¨\u0006)"}, m65681d2 = {"Lcs1/c$j;", "Lcs1/c;", "", "requestDate", "", "cycleId", "", "isAutoPop", "source", "label", "shouldSaveCurrentEntryFirst", "shouldShowDateSelectorLoader", "Lyr1/b;", "dateNavigationType", "<init>", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;ZZLyr1/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "J", "()J", "c", "Z", "g", "()Z", "f", "e", "getShouldShowDateSelectorLoader", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lyr1/b;", "()Lyr1/b;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC11103c {

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
        private final EnumC39731b dateNavigationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String requestDate, long j7, boolean z4, String source, String str, boolean z13, boolean z14, EnumC39731b enumC39731b) {
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
            this.dateNavigationType = enumC39731b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC39731b getDateNavigationType() {
            return this.dateNavigationType;
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
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.requestDate, jVar.requestDate) && this.cycleId == jVar.cycleId && this.isAutoPop == jVar.isAutoPop && AbstractC22676k.m65745e(this.source, jVar.source) && AbstractC22676k.m65745e(this.label, jVar.label) && this.shouldSaveCurrentEntryFirst == jVar.shouldSaveCurrentEntryFirst && this.shouldShowDateSelectorLoader == jVar.shouldShowDateSelectorLoader && this.dateNavigationType == jVar.dateNavigationType;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsAutoPop() {
            return this.isAutoPop;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30451e(this.requestDate.hashCode() * 31, this.cycleId, 31), 31, this.isAutoPop), 31, this.source);
            String str = this.label;
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.shouldSaveCurrentEntryFirst), 31, this.shouldShowDateSelectorLoader);
            EnumC39731b enumC39731b = this.dateNavigationType;
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
            EnumC39731b enumC39731b = this.dateNavigationType;
            StringBuilder sbM32000s = AbstractC11895b.m32000s("RefreshQuestionsV2(requestDate=", str, j7, ", cycleId=");
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
            sbM32000s.append(", dateNavigationType=");
            sbM32000s.append(enumC39731b);
            sbM32000s.append(")");
            return sbM32000s.toString();
        }

        public /* synthetic */ j(String str, long j7, boolean z4, String str2, String str3, boolean z13, boolean z14, EnumC39731b enumC39731b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j7, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? false : z14, (i13 & 128) != 0 ? null : enumC39731b);
        }
    }
}
