package i33;

import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.PublishOption;

/* JADX INFO: renamed from: i33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18057a {

    /* JADX INFO: renamed from: a */
    public final PublishOption f70141a;

    /* JADX INFO: renamed from: b */
    public List f70142b;

    public C18057a(PublishOption publishOption, List list) {
        this.f70141a = publishOption;
        this.f70142b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18057a)) {
            return false;
        }
        C18057a c18057a = (C18057a) obj;
        return AbstractC22676k.m65745e(this.f70141a, c18057a.f70141a) && AbstractC22676k.m65745e(this.f70142b, c18057a.f70142b);
    }

    public final int hashCode() {
        return this.f70142b.hashCode() + (this.f70141a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackLayersCache(publishOption=" + this.f70141a + ", layers=" + this.f70142b + ")";
    }
}
