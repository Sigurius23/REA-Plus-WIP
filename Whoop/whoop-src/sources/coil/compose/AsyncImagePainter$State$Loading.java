package coil.compose;

import ch.AbstractC4585f;
import p331n2.AbstractC26165a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"coil/compose/AsyncImagePainter$State$Loading", "Lch/f;", "Ln2/a;", "painter", "Ln2/a;", "a", "()Ln2/a;", "coil-compose-base_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AsyncImagePainter$State$Loading extends AbstractC4585f {
    private final AbstractC26165a painter;

    public AsyncImagePainter$State$Loading(AbstractC26165a abstractC26165a) {
        this.painter = abstractC26165a;
    }

    @Override // ch.AbstractC4585f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC26165a getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AsyncImagePainter$State$Loading) && AbstractC22676k.m65745e(this.painter, ((AsyncImagePainter$State$Loading) obj).painter);
    }

    public final int hashCode() {
        AbstractC26165a abstractC26165a = this.painter;
        if (abstractC26165a == null) {
            return 0;
        }
        return abstractC26165a.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.painter + ')';
    }
}
