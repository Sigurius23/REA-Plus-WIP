package lo0;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.util.TextResource;
import hy0.C17750h1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lo0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, m65681d2 = {"Llo0/e;", "Lm91/u;", "", "id", "Llo0/c;", HttpHeaders.DATE, "Lcom/whoop/design/util/TextResource;", "time", "Lhy0/h1;", "confirmationTag", "<init>", "(Ljava/lang/String;Llo0/c;Lcom/whoop/design/util/TextResource;Lhy0/h1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Llo0/c;", "()Llo0/c;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "d", "Lhy0/h1;", "()Lhy0/h1;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24576e implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f96031e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C24572c date;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource time;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17750h1 confirmationTag;

    static {
        int i13 = C17750h1.f69012w;
        int i14 = TextResource.$stable;
        f96031e = i13 | i14 | i14 | i14;
    }

    public C24576e(String id4, C24572c date, TextResource time, C17750h1 confirmationTag) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(confirmationTag, "confirmationTag");
        this.id = id4;
        this.date = date;
        this.time = time;
        this.confirmationTag = confirmationTag;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C17750h1 getConfirmationTag() {
        return this.confirmationTag;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C24572c getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTime() {
        return this.time;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24576e)) {
            return false;
        }
        C24576e c24576e = (C24576e) other;
        return AbstractC22676k.m65745e(this.id, c24576e.id) && AbstractC22676k.m65745e(this.date, c24576e.date) && AbstractC22676k.m65745e(this.time, c24576e.time) && AbstractC22676k.m65745e(this.confirmationTag, c24576e.confirmationTag);
    }

    public int hashCode() {
        return this.confirmationTag.hashCode() + AbstractC31061c.m95625a((this.date.hashCode() + (this.id.hashCode() * 31)) * 31, this.time, 31);
    }

    public String toString() {
        return "AppointmentTimeInfoViewState(id=" + this.id + ", date=" + this.date + ", time=" + this.time + ", confirmationTag=" + this.confirmationTag + ")";
    }
}
