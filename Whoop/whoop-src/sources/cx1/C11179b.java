package cx1;

import bx1.InterfaceC3688b;
import c93.InterfaceC4353o;
import dx1.InterfaceC12428b;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ex1.InterfaceC13728b;
import fx1.C14846b;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: cx1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcx1/b;", "", "<init>", "()V", "Lec3/l;", "Lex1/b;", "managementFlow", "Lfx1/b;", "adjustmentCheckoutFlow", "Ldx1/b;", "manageMembershipFlow", "Lbx1/b;", "checkoutFlow", "Lcx1/a;", "a", "(Lec3/l;Lec3/l;Lec3/l;Lec3/l;)Lec3/l;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11179b {

    /* JADX INFO: renamed from: cx1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.combiner.MembershipManagementResultCombiner$combine$1", m100430f = "MembershipManagementResultCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m65681d2 = {"Lex1/b;", "managementResult", "Lfx1/b;", "adjustmentCheckoutResult", "Ldx1/b;", "manageMembershipResult", "Lbx1/b;", "checkoutResult", "Lcx1/a;", "<anonymous>", "(Lex1/b;Lfx1/b;Ldx1/b;Lbx1/b;)Lcx1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4353o {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f35794E;

        /* JADX INFO: renamed from: w */
        int f35795w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f35796x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f35797y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f35798z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(5, interfaceC30057d);
        }

        @Override // c93.InterfaceC4353o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13728b interfaceC13728b, C14846b c14846b, InterfaceC12428b interfaceC12428b, InterfaceC3688b interfaceC3688b, InterfaceC30057d<? super C11178a> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f35796x = interfaceC13728b;
            aVar.f35797y = c14846b;
            aVar.f35798z = interfaceC12428b;
            aVar.f35794E = interfaceC3688b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13728b interfaceC13728b = (InterfaceC13728b) this.f35796x;
            C14846b c14846b = (C14846b) this.f35797y;
            InterfaceC12428b interfaceC12428b = (InterfaceC12428b) this.f35798z;
            InterfaceC3688b interfaceC3688b = (InterfaceC3688b) this.f35794E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f35795w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C11178a(interfaceC13728b, c14846b, interfaceC12428b, interfaceC3688b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m30290a(InterfaceC13058l managementFlow, InterfaceC13058l adjustmentCheckoutFlow, InterfaceC13058l manageMembershipFlow, InterfaceC13058l checkoutFlow) {
        AbstractC22676k.m65750j(managementFlow, "managementFlow");
        AbstractC22676k.m65750j(adjustmentCheckoutFlow, "adjustmentCheckoutFlow");
        AbstractC22676k.m65750j(manageMembershipFlow, "manageMembershipFlow");
        AbstractC22676k.m65750j(checkoutFlow, "checkoutFlow");
        return AbstractC13091v.m36605o(managementFlow, adjustmentCheckoutFlow, manageMembershipFlow, checkoutFlow, new a(null));
    }
}
