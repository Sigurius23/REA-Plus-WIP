package a31;

import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import i93.C18284j;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: a31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"La31/a;", "", "", "min", "max", "<init>", "(II)V", "coercedNumber", "", "atMax", "Lcom/whoop/design/util/TextResource;", "a", "(Ljava/lang/Integer;Z)Lcom/whoop/design/util/TextResource;", "number", "La31/g;", "c", "(Ljava/lang/Integer;)La31/g;", "increment", "b", "(Ljava/lang/Integer;I)I", "Li93/j;", "Li93/j;", "range", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0339a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C18284j range;

    public C0339a(int i13, int i14) {
        this.range = i13 <= i14 ? new C18284j(i13, i14, 1) : new C18284j(0, 0, 1);
    }

    /* JADX INFO: renamed from: a */
    private final TextResource m869a(Integer coercedNumber, boolean atMax) {
        if (coercedNumber != null) {
            return atMax ? new TextResource.C8688b(AbstractC16277f.f62392w1, new TextResource.AbstractC8690d.b(coercedNumber)) : new TextResource.C8691e(String.valueOf(coercedNumber.intValue()));
        }
        return new TextResource.C8688b(AbstractC16277f.f62384u1, null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public int m870b(Integer number, int increment) {
        return number != null ? AbstractC12889b.m36285o(number.intValue() + increment, this.range) : this.range.f71133w;
    }

    /* JADX INFO: renamed from: c */
    public C0345g m871c(Integer number) {
        boolean z4 = number != null;
        Integer numValueOf = number != null ? Integer.valueOf(AbstractC12889b.m36285o(number.intValue(), this.range)) : null;
        boolean z13 = numValueOf != null && numValueOf.intValue() == this.range.f71134x && z4;
        return new C0345g(numValueOf, m869a(numValueOf, z13), z4, z13, numValueOf != null && numValueOf.intValue() == this.range.f71133w && z4);
    }
}
