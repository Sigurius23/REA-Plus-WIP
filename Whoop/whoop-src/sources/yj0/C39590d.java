package yj0;

import java.nio.ByteBuffer;
import lt0.EnumC24728e;
import org.joda.time.DateTimeConstants;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xj0.AbstractC38334b;

/* JADX INFO: renamed from: yj0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lyj0/d;", "Lxj0/b;", "", "timeout", "<init>", "(I)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39590d extends AbstractC38334b {
    /* JADX WARN: Illegal instructions before constructor call */
    public C39590d(int i13) {
        EnumC24728e enumC24728e = EnumC24728e.START_RAW_DATA;
        ByteBuffer byteBufferM126473a = AbstractC39591e.m126473a();
        byteBufferM126473a.putInt(i13 * DateTimeConstants.MILLIS_PER_HOUR);
        super(enumC24728e, byteBufferM126473a, null, 4, null);
    }

    public /* synthetic */ C39590d(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13);
    }
}
