package p192he;

import cf.InterfaceC4526a;
import l83.C23468n;
import p326mf.InterfaceC25488h;
import p460rg.AbstractC31366a;
import p460rg.AbstractC31375j;
import p460rg.InterfaceC31373h;
import p485sf.C32429a;
import p485sf.C32430b;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wf.C37236a;

/* JADX INFO: renamed from: he.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C17208c implements InterfaceC4526a {

    /* JADX INFO: renamed from: a */
    public static final C17208c f66103a = new C17208c();

    /* JADX INFO: renamed from: o */
    public static void m48605o(InterfaceC31373h interfaceC31373h, C37236a c37236a) {
        if (interfaceC31373h == null || c37236a == null) {
            return;
        }
        InterfaceC25488h interfaceC25488h = c37236a.f159236b;
        String str = (String) interfaceC25488h.get("x-amz-request-id");
        if (str != null) {
            AbstractC31375j.m96498n(interfaceC31373h, "aws.request_id", str);
        }
        String str2 = (String) interfaceC25488h.get("x-amz-id-2");
        if (str2 != null) {
            AbstractC31375j.m96498n(interfaceC31373h, "aws.extended_request_id", str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: e */
    public final Object mo14171e(C32430b c32430b, InterfaceC30057d interfaceC30057d) {
        C17207b c17207b;
        if (interfaceC30057d instanceof C17207b) {
            c17207b = (C17207b) interfaceC30057d;
            int i13 = c17207b.f66102y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c17207b.f66102y = i13 - Integer.MIN_VALUE;
            } else {
                c17207b = new C17207b(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c17207b = new C17207b(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c17207b.f66100w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c17207b.f66102y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        m48605o(AbstractC31366a.m96473m(c17207b.getContext()), c32430b.f134259d);
        c17207b.f66102y = 1;
        Object obj2 = c32430b.f134257b;
        return obj2 == enumC31071a ? enumC31071a : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cf.InterfaceC4526a
    /* JADX INFO: renamed from: g */
    public final Object mo14173g(C32429a c32429a, InterfaceC30057d interfaceC30057d) {
        C17206a c17206a;
        if (interfaceC30057d instanceof C17206a) {
            c17206a = (C17206a) interfaceC30057d;
            int i13 = c17206a.f66099y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c17206a.f66099y = i13 - Integer.MIN_VALUE;
            } else {
                c17206a = new C17206a(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c17206a = new C17206a(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c17206a.f66097w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c17206a.f66099y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        m48605o(AbstractC31366a.m96473m(c17206a.getContext()), c32429a.f134254d);
        c17206a.f66099y = 1;
        Object obj2 = c32429a.f134252b;
        return obj2 == enumC31071a ? enumC31071a : obj2;
    }
}
