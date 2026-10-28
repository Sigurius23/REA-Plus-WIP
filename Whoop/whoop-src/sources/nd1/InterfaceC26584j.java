package nd1;

import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import tf3.C33768a;

/* JADX INFO: renamed from: nd1.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lnd1/j;", "", "Ltf3/a;", "define", "()Ltf3/a;", "", "getDependencies", "()Ljava/util/List;", "dependencies", "getKey", "()Ljava/lang/Object;", "key", "di_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC26584j {
    C33768a define();

    default List<InterfaceC26584j> getDependencies() {
        return C25271y.f99162w;
    }

    default Object getKey() {
        return AbstractC22671h0.f89337a.getOrCreateKotlinClass(getClass());
    }
}
