package coil.compose;

import ch.AbstractC4585f;
import mh.C25547o;
import p331n2.AbstractC26165a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"coil/compose/AsyncImagePainter$State$Success", "Lch/f;", "Ln2/a;", "painter", "Ln2/a;", "a", "()Ln2/a;", "coil-compose-base_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AsyncImagePainter$State$Success extends AbstractC4585f {

    /* JADX INFO: renamed from: a */
    public final C25547o f20227a;
    private final AbstractC26165a painter;

    public AsyncImagePainter$State$Success(AbstractC26165a abstractC26165a, C25547o c25547o) {
        this.painter = abstractC26165a;
        this.f20227a = c25547o;
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
        if (!(obj instanceof AsyncImagePainter$State$Success)) {
            return false;
        }
        AsyncImagePainter$State$Success asyncImagePainter$State$Success = (AsyncImagePainter$State$Success) obj;
        return AbstractC22676k.m65745e(this.painter, asyncImagePainter$State$Success.painter) && AbstractC22676k.m65745e(this.f20227a, asyncImagePainter$State$Success.f20227a);
    }

    public final int hashCode() {
        return this.f20227a.hashCode() + (this.painter.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.painter + ", result=" + this.f20227a + ')';
    }
}
