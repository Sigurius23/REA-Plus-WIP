package qm2;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whoop.domain.model.Invitation;
import hj0.AbstractActivityC17361t;
import or2.C28169i0;
import rm2.EnumC31606f;

/* JADX INFO: renamed from: qm2.o */
/* JADX INFO: loaded from: classes10.dex */
public class C30498o extends AbstractActivityC17361t.b<Object> {
    public C30498o(Context context, Class<?> cls) {
        super(context, cls);
    }

    /* JADX INFO: renamed from: A */
    public void m93403A(Invitation invitation) {
        m49150i().putExtra("invitationJson", C28169i0.m85278i(invitation));
    }

    /* JADX INFO: renamed from: r */
    public C30498o m93404r(boolean z4) {
        m49150i().putExtra("asAccountAuth", z4);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public C30498o m93405s() {
        m49150i().putExtra("asBrowse", true);
        return this;
    }

    /* JADX INFO: renamed from: t */
    public C30498o m93406t(C30498o c30498o) {
        m93404r(c30498o.m93410x());
        m93403A(c30498o.m93409w());
        if (c30498o.m93411y()) {
            m93405s();
        }
        return this;
    }

    /* JADX INFO: renamed from: u */
    public String m93407u() {
        return m49150i().getStringExtra("completionDestination");
    }

    /* JADX INFO: renamed from: v */
    public String m93408v() {
        return m49150i().getStringExtra("bleChooseStrapDestination") == null ? EnumC31606f.CHOOSE_STRAP.getIdentifier() : m49150i().getStringExtra("bleChooseStrapDestination");
    }

    /* JADX INFO: renamed from: w */
    public Invitation m93409w() {
        String stringExtra = m49150i().getStringExtra("invitationJson");
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        return (Invitation) C28169i0.m85275e(stringExtra, Invitation.class);
    }

    /* JADX INFO: renamed from: x */
    public boolean m93410x() {
        return m49150i().getBooleanExtra("asAccountAuth", true);
    }

    /* JADX INFO: renamed from: y */
    public boolean m93411y() {
        return m49150i().getBooleanExtra("asBrowse", false);
    }

    /* JADX INFO: renamed from: z */
    public C30498o m93412z(String str) {
        m49150i().putExtra("completionDestination", str);
        return this;
    }

    public C30498o(Context context, Intent intent) {
        super(context, intent);
    }
}
