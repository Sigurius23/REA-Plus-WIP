package oa2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oa2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Loa2/b;", "", "Lcom/whoop/design/util/TextResource;", "text", "Lcom/whoop/navigation/e;", "destination", "", "tracking", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "c", "Ljava/lang/String;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27754b {

    /* JADX INFO: renamed from: d */
    public static final int f111929d = C9598e.f28134d | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String tracking;

    public C27754b(TextResource text, C9598e c9598e, String str) {
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
        this.destination = c9598e;
        this.tracking = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTracking() {
        return this.tracking;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27754b)) {
            return false;
        }
        C27754b c27754b = (C27754b) other;
        return AbstractC22676k.m65745e(this.text, c27754b.text) && AbstractC22676k.m65745e(this.destination, c27754b.destination) && AbstractC22676k.m65745e(this.tracking, c27754b.tracking);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str = this.tracking;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.text;
        C9598e c9598e = this.destination;
        String str = this.tracking;
        StringBuilder sb4 = new StringBuilder("MyAccountHeaderCta(text=");
        sb4.append(textResource);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", tracking=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}
