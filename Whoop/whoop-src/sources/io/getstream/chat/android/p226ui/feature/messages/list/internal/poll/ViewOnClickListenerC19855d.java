package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import android.view.View;
import com.whoop.community.presentation.login.JoinTeamActivity;
import com.whoop.domain.model.Invitation;
import com.whoop.domain.model.User;
import io.C18744f;
import io.C18745g;
import io.C20708t;
import io.C20709u;
import io.getstream.chat.android.models.Answer;
import io.getstream.chat.android.models.Poll;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import jo.C21828q;
import jo.C21830s;
import p087db.AbstractC11879v;
import p309lo.AbstractC24555m;
import p465rm.C31571u;
import p465rm.InterfaceC31519b1;
import p690zr.AbstractC41023g0;
import sn.C32766w0;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.internal.poll.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19855d implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74759w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74760x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f74761y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f74762z;

    public /* synthetic */ ViewOnClickListenerC19855d(Object obj, Object obj2, Object obj3, int i13) {
        this.f74759w = i13;
        this.f74760x = obj;
        this.f74761y = obj2;
        this.f74762z = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74759w) {
            case 0:
                PollCommentsDialogFragment.render$lambda$5((PollCommentsDialogFragment) this.f74760x, (Poll) this.f74761y, (Answer) this.f74762z, view);
                break;
            case 1:
                AbstractC11879v abstractC11879v = (AbstractC11879v) this.f74760x;
                C32766w0 c32766w0 = (C32766w0) this.f74761y;
                C21828q c21828q = (C21828q) this.f74762z;
                C21830s c21830s = (C21830s) abstractC11879v.f38766c;
                InterfaceC31519b1 interfaceC31519b1 = c21830s.f84215r0;
                if (interfaceC31519b1 != null) {
                    C18744f c18744fM97213g0 = ((C31571u) interfaceC31519b1).m97213g0();
                    HashMap map = new HashMap(c18744fM97213g0.f77575X.f77530w);
                    C20708t c20708t = new C20708t(c32766w0, AbstractC41023g0.m133256r(Integer.valueOf(c21828q.f84153b)));
                    C32766w0 c32766w1 = c20708t.f77527w;
                    int iM71613g = AbstractC24555m.m71613g(c32766w1.f136262y[0].f130077L);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        if (AbstractC24555m.m71613g(((C20708t) it.next()).f77527w.f136262y[0].f130077L) == iM71613g) {
                            it.remove();
                        }
                    }
                    map.put(c32766w1, c20708t);
                    C20709u c20709u = new C20709u(map);
                    HashSet hashSet = new HashSet(c18744fM97213g0.f77576Y);
                    hashSet.remove(Integer.valueOf(c21828q.f84152a.f130353y));
                    InterfaceC31519b1 interfaceC31519b2 = c21830s.f84215r0;
                    interfaceC31519b2.getClass();
                    C18745g c18745g = new C18745g(c18744fM97213g0);
                    c18745g.f77554x = c20709u;
                    c18745g.mo54512c(hashSet);
                    ((C31571u) interfaceC31519b2).m97227v0(c18745g.mo54511a());
                    abstractC11879v.mo31836e(c21828q.f84154c);
                    c21830s.f84175L0.dismiss();
                    break;
                }
                break;
            default:
                ((JoinTeamActivity) this.f74760x).m19348T((Invitation) this.f74761y, (User) this.f74762z, view);
                break;
        }
    }
}
