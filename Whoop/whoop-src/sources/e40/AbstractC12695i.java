package e40;

import ad3.AbstractC0757c;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import do0.C12229c;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e40.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12695i {
    static {
        AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C12229c(22));
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m35502a(IdentifierSpec identifierSpec) {
        C5705a c5705a = IdentifierSpec.Companion;
        c5705a.getClass();
        if (AbstractC22676k.m65745e(identifierSpec, IdentifierSpec.PostalCode)) {
            return true;
        }
        c5705a.getClass();
        return AbstractC22676k.m65745e(identifierSpec, IdentifierSpec.City);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: renamed from: b */
    public static final java.util.ArrayList m35503b(java.lang.String r21, java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.AbstractC12695i.m35503b(java.lang.String, java.util.List):java.util.ArrayList");
    }
}
