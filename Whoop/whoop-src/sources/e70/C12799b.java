package e70;

import c93.InterfaceC4352n;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import f70.InterfaceC14176e;
import l83.C23454a0;
import m70.InterfaceC25188b;
import o70.C27629c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: e70.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Le70/b;", "", "<init>", "()V", "Lec3/l;", "Lf70/e;", "activationFlow", "Lm70/b;", "paymentsFlow", "Lo70/c;", "privacyFlow", "Le70/a;", "a", "(Lec3/l;Lec3/l;Lec3/l;)Lec3/l;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12799b {

    /* JADX INFO: renamed from: e70.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.combiner.ActivationDomainResultCombiner$combine$1", m100430f = "ActivationDomainResultCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Lf70/e;", "activationResult", "Lm70/b;", "paymentsResult", "Lo70/c;", "privacyFlow", "Le70/a;", "<anonymous>", "(Lf70/e;Lm70/b;Lo70/c;)Le70/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        int f43801w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f43802x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f43803y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f43804z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(4, interfaceC30057d);
        }

        @Override // c93.InterfaceC4352n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14176e interfaceC14176e, InterfaceC25188b interfaceC25188b, C27629c c27629c, InterfaceC30057d<? super C12798a> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f43802x = interfaceC14176e;
            aVar.f43803y = interfaceC25188b;
            aVar.f43804z = c27629c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC14176e interfaceC14176e = (InterfaceC14176e) this.f43802x;
            InterfaceC25188b interfaceC25188b = (InterfaceC25188b) this.f43803y;
            C27629c c27629c = (C27629c) this.f43804z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f43801w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C12798a(interfaceC14176e, interfaceC25188b, c27629c);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m35838a(InterfaceC13058l activationFlow, InterfaceC13058l paymentsFlow, InterfaceC13058l privacyFlow) {
        AbstractC22676k.m65750j(activationFlow, "activationFlow");
        AbstractC22676k.m65750j(paymentsFlow, "paymentsFlow");
        AbstractC22676k.m65750j(privacyFlow, "privacyFlow");
        return AbstractC13091v.m36606p(activationFlow, paymentsFlow, privacyFlow, new a(null));
    }
}
