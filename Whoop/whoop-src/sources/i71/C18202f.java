package i71;

import com.google.android.gms.common.util.VisibleForTesting;
import com.mapbox.maps.MapboxMap;
import e93.AbstractC12889b;
import java.util.List;
import k61.InterfaceC22229b;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i71.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\tJ=\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b \u0010\u0019¨\u0006!"}, m65681d2 = {"Li71/f;", "Li71/g;", "", "windowSize", "<init>", "(I)V", "offsetIndex", "dataCount", "c", "(II)I", "b", "Lk61/b;", "T", "", "data", "Li71/h;", "position", "Li71/d;", MapboxMap.QFE_OFFSET, "a", "(Ljava/util/List;Li71/h;Li71/d;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWindowSize", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18202f implements InterfaceC18203g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int windowSize;

    public C18202f(@VisibleForTesting int i13) {
        this.windowSize = i13;
    }

    /* JADX INFO: renamed from: b */
    private final int m52263b(int offsetIndex, int dataCount) {
        return AbstractC12889b.m36284n(offsetIndex + this.windowSize + 1, 0, dataCount);
    }

    /* JADX INFO: renamed from: c */
    private final int m52264c(int offsetIndex, int dataCount) {
        return AbstractC12889b.m36284n(offsetIndex, 0, dataCount);
    }

    @Override // i71.InterfaceC18203g
    /* JADX INFO: renamed from: a */
    public <T extends InterfaceC22229b> List<T> mo52257a(List<? extends T> data, C18204h position, C18200d offset) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(offset, "offset");
        if (this.windowSize <= 0 || data.isEmpty()) {
            return C25271y.f99162w;
        }
        Integer totalCount = offset.getTotalCount();
        int iFloor = ((int) Math.floor(Float.intBitsToFloat((int) (position.m52266a() >> 32)) * (totalCount != null ? totalCount.intValue() : data.size()))) - offset.getIndexOffset();
        return data.subList(m52264c(iFloor, data.size()), m52263b(iFloor, data.size()));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C18202f) && this.windowSize == ((C18202f) other).windowSize;
    }

    public int hashCode() {
        return Integer.hashCode(this.windowSize);
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.windowSize, "FixedWindowDataScroller(windowSize=", ")");
    }
}
