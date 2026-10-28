package androidx.lifecycle;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.lifecycle.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1574d1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6200w;

    /* JADX INFO: renamed from: x */
    public int f6201x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f6202y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f6203z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1574d1(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f6200w = i13;
        this.f6203z = interfaceC4351m;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f6200w) {
            case 0:
                C1574d1 c1574d1 = new C1574d1(this.f6203z, interfaceC30057d, 0);
                c1574d1.f6202y = obj;
                return c1574d1;
            default:
                C1574d1 c1574d2 = new C1574d1(this.f6203z, interfaceC30057d, 1);
                c1574d2.f6202y = obj;
                return c1574d2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6200w) {
            case 0:
                return ((C1574d1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C1574d1) create((AbstractC14134f) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6200w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f6201x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f6202y;
                    this.f6201x = 1;
                    if (this.f6203z.invoke(interfaceC2994c0, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f6201x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC14134f abstractC14134f = (AbstractC14134f) this.f6202y;
                    this.f6201x = 1;
                    obj = this.f6203z.invoke(abstractC14134f, this);
                    if (obj == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                AbstractC14134f abstractC14134f2 = (AbstractC14134f) obj;
                AbstractC22676k.m65748h(abstractC14134f2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) ((C14129a) abstractC14134f2).f50834b.f2818x).set(true);
                return abstractC14134f2;
        }
    }
}
