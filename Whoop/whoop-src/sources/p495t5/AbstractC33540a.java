package p495t5;

import gp.EnumC16045n;
import java.util.LinkedHashMap;
import l83.C23465k;
import m83.AbstractC25247g0;
import p334n5.C26289a;

/* JADX INFO: renamed from: t5.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC33540a {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f140002a;

    static {
        C23465k[] c23465kArr = {new C23465k(EnumC16045n.UNKNOWN_ERR, new C26289a(26)), new C23465k(EnumC16045n.ABORT_ERR, new C26289a(0)), new C23465k(EnumC16045n.ATTESTATION_NOT_PRIVATE_ERR, new C26289a(16)), new C23465k(EnumC16045n.CONSTRAINT_ERR, new C26289a(1)), new C23465k(EnumC16045n.DATA_ERR, new C26289a(3)), new C23465k(EnumC16045n.INVALID_STATE_ERR, new C26289a(10)), new C23465k(EnumC16045n.ENCODING_ERR, new C26289a(4)), new C23465k(EnumC16045n.NETWORK_ERR, new C26289a(12)), new C23465k(EnumC16045n.NOT_ALLOWED_ERR, new C26289a(14)), new C23465k(EnumC16045n.NOT_SUPPORTED_ERR, new C26289a(17)), new C23465k(EnumC16045n.SECURITY_ERR, new C26289a(22)), new C23465k(EnumC16045n.TIMEOUT_ERR, new C26289a(24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(12));
        AbstractC25247g0.m73997f0(linkedHashMap, c23465kArr);
        f140002a = linkedHashMap;
    }
}
