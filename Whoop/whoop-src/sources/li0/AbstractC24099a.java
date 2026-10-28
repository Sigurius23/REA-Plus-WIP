package li0;

import c93.InterfaceC4351m;
import ec3.C13065m2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: li0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"T", "Lec3/t1;", "initial", "a", "(Lec3/t1;Ljava/lang/Object;)Lec3/t1;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24099a {

    /* JADX INFO: renamed from: li0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.arch.flow.FlowUtilKt$startsWith$1", m100430f = "FlowUtil.kt", m100431l = {6}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"T", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95182w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f95183x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ T f95184y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t14, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95184y = t14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f95184y, interfaceC30057d);
            aVar.f95183x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f95183x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95182w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Object obj2 = this.f95184y;
                this.f95183x = null;
                this.f95182w = 1;
                if (interfaceC13062m.emit(obj2, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC13087t1 m71009a(InterfaceC13087t1 interfaceC13087t1, T t14) {
        AbstractC22676k.m65750j(interfaceC13087t1, "<this>");
        return new C13065m2(interfaceC13087t1, new a(t14, null));
    }
}
