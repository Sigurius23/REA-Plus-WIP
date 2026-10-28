package i71;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import k61.InterfaceC22229b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i71.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Li71/i;", "Li71/g;", "<init>", "()V", "Lk61/b;", "T", "", "data", "Li71/h;", "position", "Li71/d;", MapboxMap.QFE_OFFSET, "a", "(Ljava/util/List;Li71/h;Li71/d;)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18205i implements InterfaceC18203g {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // i71.InterfaceC18203g
    /* JADX INFO: renamed from: a */
    public <T extends InterfaceC22229b> List<T> mo52257a(List<? extends T> data, C18204h position, C18200d offset) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(offset, "offset");
        return data;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return C18205i.class.equals(other != null ? other.getClass() : null);
    }

    public int hashCode() {
        return C18205i.class.hashCode();
    }
}
