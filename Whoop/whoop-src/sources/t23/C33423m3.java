package t23;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c43.C4200p;
import c43.C4205u;
import ec3.C13045h2;
import ec3.InterfaceC13062m;
import g53.AbstractC15508m;
import g53.C15498c;
import g53.C15499d;
import g53.C15500e;
import g53.C15501f;
import g53.C15502g;
import g53.C15503h;
import g53.C15504i;
import g53.C15505j;
import g53.C15507l;
import io.getstream.android.video.generated.models.VideoEvent;
import io.getstream.video.android.model.StreamCallId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import ng3.C26702o;
import p479s4.AbstractC32120a;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import w33.C36794c;
import wb3.AbstractC37056f;
import x43.C37981m;

/* JADX INFO: renamed from: t23.m3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33423m3 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139548w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33366b4 f139549x;

    public /* synthetic */ C33423m3(C33366b4 c33366b4, int i13) {
        this.f139548w = i13;
        this.f139549x = c33366b4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public Object m105857b(AbstractC15508m abstractC15508m, InterfaceC30057d interfaceC30057d) {
        C33428n3 c33428n3;
        C33423m3 c33423m3;
        if (interfaceC30057d instanceof C33428n3) {
            c33428n3 = (C33428n3) interfaceC30057d;
            int i13 = c33428n3.f139560z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33428n3.f139560z = i13 - Integer.MIN_VALUE;
            } else {
                c33428n3 = new C33428n3(this, interfaceC30057d);
            }
        } else {
            c33428n3 = new C33428n3(this, interfaceC30057d);
        }
        C33428n3 c33428n4 = c33428n3;
        Object objM105803u = c33428n4.f139558x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33428n4.f139560z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM105803u);
            C33366b4 c33366b4 = this.f139549x;
            LinkedHashMap linkedHashMap = c33366b4.f139253Z;
            if ((abstractC15508m instanceof C15498c) && !linkedHashMap.isEmpty()) {
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C33368c0) it.next()).f139308v);
                }
                Map mapM99987n = AbstractC32120a.m99987n(new C36794c(AbstractC25265s.m74103I1(arrayList)));
                c33428n4.f139557w = this;
                c33428n4.f139560z = 1;
                objM105803u = c33366b4.m105803u(mapM99987n, AbstractC37056f.m118958J(new C4205u()), 25, true, c33428n4);
                if (objM105803u == enumC31071a) {
                    return enumC31071a;
                }
                c33423m3 = this;
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c33423m3 = c33428n4.f139557w;
        AbstractC34132o.m107864I(objM105803u);
        C33366b4 c33366b5 = c33423m3.f139549x;
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM105803u;
        if (abstractC26205h instanceof C26203f) {
            C2345k c2345kM105799q = c33366b5.m105799q();
            InterfaceC2339e interfaceC2339e = c2345kM105799q.f9275c;
            String str = c2345kM105799q.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM105799q.f9274b.log(enumC2341g, str, "Failed to re-watch calls (" + ((C26203f) abstractC26205h).f103918a, null);
            }
        }
        return C23454a0.f92919a;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        Object obj2;
        switch (this.f139548w) {
            case 0:
                this.f139549x.m105797o((VideoEvent) obj, "");
                return C23454a0.f92919a;
            case 1:
                AbstractC15508m socketState = (AbstractC15508m) obj;
                C33391g1 c33391g1 = this.f139549x.f139248U;
                c33391g1.getClass();
                AbstractC22676k.m65750j(socketState, "socketState");
                if (socketState instanceof C15504i) {
                    obj2 = C33411k1.f139496a;
                } else if (socketState instanceof C15499d) {
                    obj2 = C33406j1.f139481a;
                } else if (socketState instanceof C15498c) {
                    obj2 = C33396h1.f139459a;
                } else {
                    boolean z4 = socketState instanceof C15502g;
                    Object obj3 = C33416l1.f139537a;
                    if (!z4 && !(socketState instanceof C15507l)) {
                        boolean z13 = socketState instanceof C15505j;
                        obj3 = C33401i1.f139474a;
                        if (!z13 && !(socketState instanceof C15503h) && !(socketState instanceof C15500e) && !(socketState instanceof C15501f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    obj2 = obj3;
                }
                C13045h2 c13045h2 = c33391g1.f139401d;
                c13045h2.getClass();
                c13045h2.m36571k(null, obj2);
                return C23454a0.f92919a;
            case 2:
                C33391g1 c33391g2 = this.f139549x.f139248U;
                AbstractC26202e error = ((C37981m) obj).f162639a;
                c33391g2.getClass();
                AbstractC22676k.m65750j(error, "error");
                C13045h2 c13045h3 = c33391g2.f139401d;
                C26702o c26702o = new C26702o(28, false);
                c13045h3.getClass();
                c13045h3.m36571k(null, c26702o);
                return C23454a0.f92919a;
            case 3:
                return m105857b((AbstractC15508m) obj, interfaceC30057d);
            default:
                StreamCallId streamCallId = (StreamCallId) obj;
                Object objM105828w = this.f139549x.m105796n(streamCallId.getType(), streamCallId.getId()).m105828w(C4200p.f17058a, interfaceC30057d);
                return objM105828w == EnumC31071a.f128113w ? objM105828w : C23454a0.f92919a;
        }
    }
}
