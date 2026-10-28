package qc3;

import kotlinx.datetime.DateTimeFormatException;
import l83.C23470p;
import p031b9.AbstractC2875y;
import q83.AbstractC30060g;
import qa1.C30112a;

/* JADX INFO: renamed from: qc3.l1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC30257l1 {

    /* JADX INFO: renamed from: a */
    public static final C30278w f123798a = new C30278w(null, null);

    /* JADX INFO: renamed from: b */
    public static final C23470p f123799b = AbstractC30060g.m92088H(new C30112a(16));

    /* JADX INFO: renamed from: a */
    public static final void m92518a(Object obj, String str) {
        if (obj == null) {
            throw new DateTimeFormatException(AbstractC2875y.m8300m("Can not create a ", str, " from the given input: the field ", str, " is missing"));
        }
    }
}
