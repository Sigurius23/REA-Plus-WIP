package p734sl0;

import com.mapbox.maps.MapboxMap;
import p208i2.C17919x;
import p208i2.C17924z0;
import p294l3.C23248d;
import p294l3.C23267m0;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sl0.b3 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, m65681d2 = {"Lsl0/b3;", "", "", "totalLength", "window", "", "minAlpha", "Li2/x;", "color", "<init>", "(IIFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ll3/d;", "builder", "", "text", "Ll83/a0;", "a", "(Ll3/d;Ljava/lang/String;)V", "I", "b", "c", "F", "d", "J", "e", MapboxMap.QFE_OFFSET, "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32588b3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int totalLength;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int window;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float minAlpha;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int offset;

    public /* synthetic */ C32588b3(int i13, int i14, float f13, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, f13, j7);
    }

    /* JADX INFO: renamed from: a */
    public final void m101644a(C23248d builder, String text) {
        AbstractC22676k.m65750j(builder, "builder");
        AbstractC22676k.m65750j(text, "text");
        int length = builder.f92119w.length();
        builder.m67300b(text);
        int i13 = this.totalLength - this.window;
        int length2 = text.length();
        for (int i14 = 0; i14 < length2; i14++) {
            int i15 = this.offset + i14;
            if (i15 >= i13) {
                float fM101974l0 = AbstractC32637l2.m101974l0((this.totalLength - 1) - i15, this.window, this.minAlpha);
                if (fM101974l0 < 1.0f) {
                    C23267m0 c23267m0 = new C23267m0(C17919x.m51541c(fM101974l0, this.color), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534);
                    int i16 = length + i14;
                    builder.m67299a(c23267m0, i16, i16 + 1);
                }
            }
        }
        this.offset = text.length() + this.offset;
    }

    private C32588b3(int i13, int i14, float f13, long j7) {
        this.totalLength = i13;
        this.window = i14;
        this.minAlpha = f13;
        this.color = j7;
    }
}
