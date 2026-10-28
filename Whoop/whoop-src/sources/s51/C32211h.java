package s51;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: s51.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b'\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b\u001a\u0010)¨\u0006*"}, m65681d2 = {"Ls51/h;", "Lm91/u;", "", "id", "Lgz0/m0;", "icon", "title", "subtitle", "Ls51/e;", "info", "value", "unit", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ls51/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "f", "d", "e", "Ls51/e;", "()Ls51/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32211h implements InterfaceC25312u {

    /* JADX INFO: renamed from: i */
    public static final int f133374i = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C32208e info;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String unit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C9598e destination;

    public C32211h(String id4, EnumC16313m0 enumC16313m0, String title, String str, C32208e c32208e, String value, String unit, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(unit, "unit");
        this.id = id4;
        this.icon = enumC16313m0;
        this.title = title;
        this.subtitle = str;
        this.info = c32208e;
        this.value = value;
        this.unit = unit;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C32208e getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32211h)) {
            return false;
        }
        C32211h c32211h = (C32211h) other;
        return AbstractC22676k.m65745e(this.id, c32211h.id) && this.icon == c32211h.icon && AbstractC22676k.m65745e(this.title, c32211h.title) && AbstractC22676k.m65745e(this.subtitle, c32211h.subtitle) && AbstractC22676k.m65745e(this.info, c32211h.info) && AbstractC22676k.m65745e(this.value, c32211h.value) && AbstractC22676k.m65745e(this.unit, c32211h.unit) && AbstractC22676k.m65745e(this.destination, c32211h.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode2 = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        C32208e c32208e = this.info;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (c32208e == null ? 0 : c32208e.hashCode())) * 31, 31, this.value), 31, this.unit);
        C9598e c9598e = this.destination;
        return iM30450d2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        EnumC16313m0 enumC16313m0 = this.icon;
        String str2 = this.title;
        String str3 = this.subtitle;
        C32208e c32208e = this.info;
        String str4 = this.value;
        String str5 = this.unit;
        C9598e c9598e = this.destination;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("NotableStatsViewState(id=", str, ", icon=", enumC16313m0, ", title=");
        AbstractC11266d.m30444B(sbM61141l, str2, ", subtitle=", str3, ", info=");
        sbM61141l.append(c32208e);
        sbM61141l.append(", value=");
        sbM61141l.append(str4);
        sbM61141l.append(", unit=");
        return AbstractC13673n.m38563j(sbM61141l, str5, ", destination=", c9598e, ")");
    }
}
