package y42;

import c52.AbstractC4251b;
import c52.AbstractC4252c;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: y42.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ly42/a;", "Lc52/b;", "a", "(Ly42/a;Lq83/d;)Ljava/lang/Object;", "puffin_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39227i {

    /* JADX INFO: renamed from: y42.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinKt$awaitConnectionResult$2", m100430f = "Puffin.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lc52/b;", "it", "", "<anonymous>", "(Lc52/b;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168640w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f168641x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f168641x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4251b abstractC4251b, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((a) create(abstractC4251b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC4251b abstractC4251b = (AbstractC4251b) this.f168641x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168640w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(AbstractC4252c.m13282a(abstractC4251b));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m124987a(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super AbstractC4251b> interfaceC30057d) {
        return AbstractC13091v.m36616z(interfaceC39219a.mo124937l(), new a(null), interfaceC30057d);
    }
}
