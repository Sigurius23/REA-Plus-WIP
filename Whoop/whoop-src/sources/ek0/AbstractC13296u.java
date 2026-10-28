package ek0;

import fk2.C14554a;
import java.nio.ByteBuffer;
import org.joda.time.DateTime;
import ot0.C28323a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ek0.u */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lek0/u;", "Lot0/a;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13296u extends C28323a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13296u(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
    }

    @Override // ot0.C28323a, lt0.AbstractC24726c
    public String toString() {
        String string = super.toString();
        C14554a timestamp = getTimestamp();
        return string + " time=" + (timestamp != null ? new DateTime(timestamp.m41583j()) : null);
    }
}
