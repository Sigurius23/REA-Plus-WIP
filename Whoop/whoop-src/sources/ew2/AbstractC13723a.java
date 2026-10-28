package ew2;

import androidx.work.CoroutineWorker;
import p031b9.AbstractC2875y;
import p218ic.AbstractC18386u;
import p218ic.C18380r;
import p218ic.C18382s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: ew2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a6\u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Landroidx/work/CoroutineWorker;", "Lic/u;", "c", "(Landroidx/work/CoroutineWorker;)Lic/u;", "errorResult", "Lkotlin/Function1;", "Lq83/d;", "Ll83/a0;", "", "onFailureErrorResult", "b", "(Lic/u;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "Lu02/a$b;", "", "a", "(Lu02/a$b;)Ljava/lang/String;", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13723a {

    /* JADX INFO: renamed from: ew2.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.workmanagers.WeightliftingBackgroundWorkerExtensionKt", m100430f = "WeightliftingBackgroundWorkerExtension.kt", m100431l = {29}, m100432m = "handleApiError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f48730w;

        /* JADX INFO: renamed from: x */
        Object f48731x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48732y;

        /* JADX INFO: renamed from: z */
        int f48733z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f48732y = obj;
            this.f48733z |= Integer.MIN_VALUE;
            return AbstractC13723a.m38898b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m38897a(InterfaceC34385a.b<?> bVar) {
        AbstractC22676k.m65750j(bVar, "<this>");
        if (bVar instanceof InterfaceC34385a.b.a) {
            return AbstractC2875y.m8295h(((InterfaceC34385a.b.a) bVar).getErrorCode(), "error ");
        }
        if (bVar instanceof InterfaceC34385a.b.C42432b) {
            return "noNetwork";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m38898b(AbstractC18386u abstractC18386u, Function1 function1, InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f48733z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f48733z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f48732y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = aVar.f48733z;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC18386u abstractC18386u2 = (AbstractC18386u) aVar.f48730w;
            AbstractC34132o.m107864I(obj);
            return abstractC18386u2;
        }
        AbstractC34132o.m107864I(obj);
        if (AbstractC22676k.m65745e(abstractC18386u, new C18380r())) {
            aVar.f48730w = abstractC18386u;
            aVar.f48731x = null;
            aVar.f48733z = 1;
            if (function1.invoke(aVar) == obj2) {
                return obj2;
            }
        }
        return abstractC18386u;
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC18386u m38899c(CoroutineWorker coroutineWorker) {
        AbstractC22676k.m65750j(coroutineWorker, "<this>");
        return coroutineWorker.getRunAttemptCount() >= 100 ? new C18380r() : new C18382s();
    }
}
