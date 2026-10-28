package xj0;

import lt0.EnumC24728e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: xj0.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lxj0/n;", "Lxj0/b;", "Lst0/v;", "deviceType", "<init>", "(Lst0/v;)V", "", "i", "Z", "p", "()Z", "dualResponse", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38370n extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean dualResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38370n(EnumC32978v deviceType) {
        super(EnumC24728e.GET_DATA_RANGE, null, deviceType, 2, null);
        AbstractC22676k.m65750j(deviceType, "deviceType");
        this.dualResponse = true;
    }

    @Override // xj0.AbstractC38334b, vk0.InterfaceC36081g
    /* JADX INFO: renamed from: p, reason: from getter */
    public boolean getDualResponse() {
        return this.dualResponse;
    }
}
