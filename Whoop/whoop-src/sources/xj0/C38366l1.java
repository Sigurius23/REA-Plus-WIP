package xj0;

import lt0.EnumC24728e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;

/* JADX INFO: renamed from: xj0.l1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lxj0/l1;", "Lxj0/b;", "", "enabled", "Lst0/v;", "deviceType", "<init>", "(ZLst0/v;)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38366l1 extends AbstractC38334b {
    public /* synthetic */ C38366l1(boolean z4, EnumC32978v enumC32978v, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? EnumC32978v.MAVERICK : enumC32978v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38366l1(boolean z4, EnumC32978v deviceType) {
        super(EnumC24728e.TOGGLE_REALTIME_HR, z4 ? AbstractC38334b.INSTANCE.m122895c() : AbstractC38334b.INSTANCE.m122894b(), deviceType);
        AbstractC22676k.m65750j(deviceType, "deviceType");
    }
}
