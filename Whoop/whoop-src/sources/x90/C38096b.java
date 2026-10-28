package x90;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.activitysession.C5765a;
import ge3.AbstractC15751g;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p599wz.C37722h1;
import q83.InterfaceC30057d;
import x30.C37894h1;
import x30.C37900j1;

/* JADX INFO: renamed from: x90.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C38096b implements InterfaceC38095a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f163146a;

    /* JADX INFO: renamed from: c */
    private final C5765a f163148c = new C5765a();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f163147b = new a();

    /* JADX INFO: renamed from: x90.b$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C38097c c38097c) {
            interfaceC33689c.mo5356p(1, c38097c.getId());
            if (c38097c.getActivitySessionId() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c38097c.getActivitySessionId());
            }
            if (c38097c.getState() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, c38097c.getState());
            }
            if (c38097c.getSelectedActivityInternalName() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, c38097c.getSelectedActivityInternalName());
            }
            interfaceC33689c.mo5356p(5, c38097c.getGpsTrackingEnabled() ? 1L : 0L);
            interfaceC33689c.mo5356p(6, c38097c.getStartTimeMs());
            if (c38097c.getResumeNavigationJson() == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, c38097c.getResumeNavigationJson());
            }
            String strM17215b = C38096b.this.f163148c.m17215b(c38097c.m122060f());
            if (strM17215b == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, strM17215b);
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `active_activity_session_table` (`id`,`activitySessionId`,`state`,`selectedActivityInternalName`,`gpsTrackingEnabled`,`startTimeMs`,`resumeNavigationJson`,`pauseSegmentsJson`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    public C38096b(AbstractC1848z0 abstractC1848z0) {
        this.f163146a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: g */
    public static List<Class<?>> m122050g() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C23454a0 m122051h(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM active_activity_session_table");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ C38097c m122052i(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM active_activity_session_table LIMIT 1");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "activitySessionId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "state");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "selectedActivityInternalName");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "gpsTrackingEnabled");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "startTimeMs");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "resumeNavigationJson");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "pauseSegmentsJson");
            C38097c c38097c = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                try {
                    c38097c = new C38097c((int) interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), ((int) interfaceC33689cMo68212g1.getLong(iM60658N5)) != 0, interfaceC33689cMo68212g1.getLong(iM60658N6), interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7), this.f163148c.m17214a(interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8)));
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33689cMo68212g1.close();
                    throw th;
                }
            }
            interfaceC33689cMo68212g1.close();
            return c38097c;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ C23454a0 m122053j(C38097c c38097c, InterfaceC33687a interfaceC33687a) {
        this.f163147b.insert(interfaceC33687a, c38097c);
        return C23454a0.f92919a;
    }

    @Override // x90.InterfaceC38095a
    /* JADX INFO: renamed from: a */
    public Object mo122044a(InterfaceC30057d<? super C38097c> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f163146a, true, false, new C37894h1(this, 2), interfaceC30057d);
    }

    @Override // x90.InterfaceC38095a
    /* JADX INFO: renamed from: b */
    public Object mo122045b(C38097c c38097c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c38097c.getClass();
        return AbstractC15751g.m44434N(this.f163146a, false, true, new C37900j1(4, this, c38097c), interfaceC30057d);
    }

    @Override // x90.InterfaceC38095a
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f163146a, false, true, new C37722h1(27), interfaceC30057d);
    }
}
