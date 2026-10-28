package coil.compose;

import ch.AbstractC4585f;
import mh.C25537e;
import p331n2.AbstractC26165a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"coil/compose/AsyncImagePainter$State$Error", "Lch/f;", "Ln2/a;", "painter", "Ln2/a;", "a", "()Ln2/a;", "coil-compose-base_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AsyncImagePainter$State$Error extends AbstractC4585f {

    /* JADX INFO: renamed from: a */
    public final C25537e f20226a;
    private final AbstractC26165a painter;

    public AsyncImagePainter$State$Error(AbstractC26165a abstractC26165a, C25537e c25537e) {
        this.painter = abstractC26165a;
        this.f20226a = c25537e;
    }

    /* JADX INFO: renamed from: b */
    public static AsyncImagePainter$State$Error m15507b(AsyncImagePainter$State$Error asyncImagePainter$State$Error, AbstractC26165a abstractC26165a) {
        C25537e c25537e = asyncImagePainter$State$Error.f20226a;
        asyncImagePainter$State$Error.getClass();
        return new AsyncImagePainter$State$Error(abstractC26165a, c25537e);
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
        if (!(obj instanceof AsyncImagePainter$State$Error)) {
            return false;
        }
        AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) obj;
        return AbstractC22676k.m65745e(this.painter, asyncImagePainter$State$Error.painter) && AbstractC22676k.m65745e(this.f20226a, asyncImagePainter$State$Error.f20226a);
    }

    public final int hashCode() {
        AbstractC26165a abstractC26165a = this.painter;
        return this.f20226a.hashCode() + ((abstractC26165a == null ? 0 : abstractC26165a.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.painter + ", result=" + this.f20226a + ')';
    }
}
