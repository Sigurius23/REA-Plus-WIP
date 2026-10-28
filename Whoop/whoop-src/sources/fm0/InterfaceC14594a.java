package fm0;

import c13.AbstractC3855a;
import com.whoop.appconfiguration.TabConfiguration;
import j02.C21140f;
import java.util.List;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fm0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lfm0/a;", "", "c", "a", "b", "Lfm0/a$a;", "Lfm0/a$b;", "Lfm0/a$c;", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14594a {

    /* JADX INFO: renamed from: fm0.a$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lfm0/a$a;", "Lfm0/a;", "", "show", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC14594a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean show;

        public a(boolean z4) {
            this.show = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getShow() {
            return this.show;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.show == ((a) other).show;
        }

        public int hashCode() {
            return Boolean.hashCode(this.show);
        }

        public String toString() {
            return AbstractC3855a.m11827k("SetCommunityBadge(show=", ")", this.show);
        }
    }

    /* JADX INFO: renamed from: fm0.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfm0/a$b;", "Lfm0/a;", "Lj02/f;", "input", "<init>", "(Lj02/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj02/f;", "()Lj02/f;", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC14594a {

        /* JADX INFO: renamed from: b */
        public static final int f53670b = C21140f.f80217d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21140f input;

        public b(C21140f input) {
            AbstractC22676k.m65750j(input, "input");
            this.input = input;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C21140f getInput() {
            return this.input;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.input, ((b) other).input);
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        public String toString() {
            return "SetNavInput(input=" + this.input + ")";
        }
    }

    /* JADX INFO: renamed from: fm0.a$c */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lfm0/a$c;", "Lfm0/a;", "", "Lcom/whoop/appconfiguration/TabConfiguration;", "tabs", "", "defaultTabId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC14594a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<TabConfiguration> tabs;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String defaultTabId;

        public c(List<TabConfiguration> tabs, String str) {
            AbstractC22676k.m65750j(tabs, "tabs");
            this.tabs = tabs;
            this.defaultTabId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDefaultTabId() {
            return this.defaultTabId;
        }

        /* JADX INFO: renamed from: b */
        public final List<TabConfiguration> m41744b() {
            return this.tabs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.tabs, cVar.tabs) && AbstractC22676k.m65745e(this.defaultTabId, cVar.defaultTabId);
        }

        public int hashCode() {
            int iHashCode = this.tabs.hashCode() * 31;
            String str = this.defaultTabId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC30802r.m94761j("SetTabs(tabs=", ", defaultTabId=", this.defaultTabId, ")", this.tabs);
        }
    }
}
