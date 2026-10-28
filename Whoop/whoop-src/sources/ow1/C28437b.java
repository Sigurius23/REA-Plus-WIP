package ow1;

import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pw1.C29586b;
import q83.InterfaceC30057d;
import qw1.C30689c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ow1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Low1/b;", "", "<init>", "()V", "Lec3/l;", "Lpw1/b;", "familyPlanFlow", "Lqw1/c;", "inviteMemberFlow", "Low1/a;", "a", "(Lec3/l;Lec3/l;)Lec3/l;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28437b {

    /* JADX INFO: renamed from: ow1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.domain.interactor.combiner.FamilyPlanResultCombiner$combine$1", m100430f = "FamilyPlanResultCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lpw1/b;", "familyPlanResult", "Lqw1/c;", "inviteMemberResult", "Low1/a;", "<anonymous>", "(Lpw1/b;Lqw1/c;)Low1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f114666w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f114667x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f114668y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C29586b c29586b, C30689c c30689c, InterfaceC30057d<? super C28436a> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f114667x = c29586b;
            aVar.f114668y = c30689c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C29586b c29586b = (C29586b) this.f114667x;
            C30689c c30689c = (C30689c) this.f114668y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f114666w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C28436a(c29586b, c30689c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m86168a(InterfaceC13058l familyPlanFlow, InterfaceC13058l inviteMemberFlow) {
        AbstractC22676k.m65750j(familyPlanFlow, "familyPlanFlow");
        AbstractC22676k.m65750j(inviteMemberFlow, "inviteMemberFlow");
        return new C13060l1(familyPlanFlow, inviteMemberFlow, new a(null), 1);
    }
}
