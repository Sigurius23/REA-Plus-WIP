package bg2;

import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bg2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lbg2/h;", "Lbg2/c;", "a", "(Lbg2/h;)Lbg2/c;", "sms_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3236i {
    /* JADX INFO: renamed from: a */
    public static final AbstractC3230c m9377a(AbstractC3235h abstractC3235h) {
        AbstractC22676k.m65750j(abstractC3235h, "<this>");
        if (abstractC3235h instanceof AbstractC3235h.b) {
            return AbstractC3230c.a.f12621a;
        }
        if (abstractC3235h instanceof AbstractC3235h.c) {
            return AbstractC3230c.e.f12625a;
        }
        if (abstractC3235h instanceof AbstractC3235h.d) {
            return new AbstractC3230c.d(((AbstractC3235h.d) abstractC3235h).getPhoneNumber());
        }
        if (abstractC3235h instanceof AbstractC3235h.a) {
            return new AbstractC3230c.c(((AbstractC3235h.a) abstractC3235h).getCode());
        }
        if (abstractC3235h instanceof AbstractC3235h.f) {
            return AbstractC3230c.f.f12626a;
        }
        if (abstractC3235h instanceof AbstractC3235h.e) {
            return new AbstractC3230c.b(((AbstractC3235h.e) abstractC3235h).getDestinationPhoneNumber());
        }
        throw new NoWhenBranchMatchedException();
    }
}
