package gz0;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.mapbox.common.MapboxServices;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.C22396h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0003\u0010\f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\r\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b&\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b(\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010\u001cR#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b)\u00104¨\u00065"}, m65681d2 = {"Lgz0/a;", "", "", "add", "checkMark", "collapse", "copy", "cross", "customize", "delete", NotificationCompat.CATEGORY_EMAIL, "journal", "pencil", "remove", MapboxServices.SEARCH, "startActivity", "undo", "filter", "upload", "", "Lkd1/h;", "descriptions", "<init>", "(IIIIIIIIIIIIIIIILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "e", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "k", "j", "l", "m", "n", "o", "p", "q", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16288a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int add;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int checkMark;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int collapse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int copy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int cross;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int customize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int delete;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int email;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int journal;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int pencil;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int remove;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int search;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int startActivity;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int undo;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int filter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int upload;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final List<C22396h<Integer>> descriptions;

    public C16288a(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27, int i28, int i29, int i34, int i35, int i36, List<C22396h<Integer>> descriptions) {
        AbstractC22676k.m65750j(descriptions, "descriptions");
        this.add = i13;
        this.checkMark = i14;
        this.collapse = i15;
        this.copy = i16;
        this.cross = i17;
        this.customize = i18;
        this.delete = i19;
        this.email = i24;
        this.journal = i25;
        this.pencil = i26;
        this.remove = i27;
        this.search = i28;
        this.startActivity = i29;
        this.undo = i34;
        this.filter = i35;
        this.upload = i36;
        this.descriptions = descriptions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAdd() {
        return this.add;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCheckMark() {
        return this.checkMark;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCollapse() {
        return this.collapse;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCopy() {
        return this.copy;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCross() {
        return this.cross;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16288a)) {
            return false;
        }
        C16288a c16288a = (C16288a) other;
        return this.add == c16288a.add && this.checkMark == c16288a.checkMark && this.collapse == c16288a.collapse && this.copy == c16288a.copy && this.cross == c16288a.cross && this.customize == c16288a.customize && this.delete == c16288a.delete && this.email == c16288a.email && this.journal == c16288a.journal && this.pencil == c16288a.pencil && this.remove == c16288a.remove && this.search == c16288a.search && this.startActivity == c16288a.startActivity && this.undo == c16288a.undo && this.filter == c16288a.filter && this.upload == c16288a.upload && AbstractC22676k.m65745e(this.descriptions, c16288a.descriptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCustomize() {
        return this.customize;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDelete() {
        return this.delete;
    }

    /* JADX INFO: renamed from: h */
    public final List<C22396h<Integer>> m46122h() {
        return this.descriptions;
    }

    public int hashCode() {
        return this.descriptions.hashCode() + AbstractC11266d.m30448b(this.upload, AbstractC11266d.m30448b(this.filter, AbstractC11266d.m30448b(this.undo, AbstractC11266d.m30448b(this.startActivity, AbstractC11266d.m30448b(this.search, AbstractC11266d.m30448b(this.remove, AbstractC11266d.m30448b(this.pencil, AbstractC11266d.m30448b(this.journal, AbstractC11266d.m30448b(this.email, AbstractC11266d.m30448b(this.delete, AbstractC11266d.m30448b(this.customize, AbstractC11266d.m30448b(this.cross, AbstractC11266d.m30448b(this.copy, AbstractC11266d.m30448b(this.collapse, AbstractC11266d.m30448b(this.checkMark, Integer.hashCode(this.add) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getFilter() {
        return this.filter;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getJournal() {
        return this.journal;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getPencil() {
        return this.pencil;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getRemove() {
        return this.remove;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSearch() {
        return this.search;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getStartActivity() {
        return this.startActivity;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getUndo() {
        return this.undo;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getUpload() {
        return this.upload;
    }

    public String toString() {
        int i13 = this.add;
        int i14 = this.checkMark;
        int i15 = this.collapse;
        int i16 = this.copy;
        int i17 = this.cross;
        int i18 = this.customize;
        int i19 = this.delete;
        int i24 = this.email;
        int i25 = this.journal;
        int i26 = this.pencil;
        int i27 = this.remove;
        int i28 = this.search;
        int i29 = this.startActivity;
        int i34 = this.undo;
        int i35 = this.filter;
        int i36 = this.upload;
        List<C22396h<Integer>> list = this.descriptions;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "ActionIcons(add=", ", checkMark=", ", collapse=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", copy=", i16, ", cross=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", customize=", i18, ", delete=");
        AbstractC30802r.m94773v(sbM30465s, i19, ", email=", i24, ", journal=");
        AbstractC30802r.m94773v(sbM30465s, i25, ", pencil=", i26, ", remove=");
        AbstractC30802r.m94773v(sbM30465s, i27, ", search=", i28, ", startActivity=");
        AbstractC30802r.m94773v(sbM30465s, i29, ", undo=", i34, ", filter=");
        AbstractC30802r.m94773v(sbM30465s, i35, ", upload=", i36, ", descriptions=");
        return AbstractC3855a.m11829m(sbM30465s, list, ")");
    }
}
