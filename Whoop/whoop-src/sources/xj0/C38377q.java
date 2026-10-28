package xj0;

import java.nio.ByteBuffer;
import lt0.EnumC24728e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: xj0.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lxj0/q;", "Lxj0/b;", "Ljava/nio/ByteBuffer;", "dataPayload", "Lst0/v;", "deviceType", "<init>", "(Ljava/nio/ByteBuffer;Lst0/v;)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38377q extends AbstractC38334b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38377q(ByteBuffer dataPayload, EnumC32978v deviceType) {
        super(EnumC24728e.HISTORICAL_DATA_RESULT, dataPayload, deviceType);
        AbstractC22676k.m65750j(dataPayload, "dataPayload");
        AbstractC22676k.m65750j(deviceType, "deviceType");
    }
}
