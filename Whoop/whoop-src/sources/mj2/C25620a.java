package mj2;

import ec3.C13060l1;
import ec3.InterfaceC13058l;
import java.util.ArrayList;
import l83.C23454a0;
import m83.AbstractC25265s;
import nj2.C26773t;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: mj2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lmj2/a;", "", "<init>", "()V", "Lec3/l;", "Lnj2/t;", "upstream", "a", "(Lec3/l;)Lec3/l;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25620a {

    /* JADX INFO: renamed from: mj2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.BreathingEventAccumulatingReducer$accumulate$1", m100430f = "BreathingEventAccumulatingReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lnj2/t;", "previousViewState", "currentViewState", "<anonymous>", "(Lnj2/t;Lnj2/t;)Lnj2/t;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f100505w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100506x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100507y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C26773t c26773t, C26773t c26773t2, InterfaceC30057d<? super C26773t> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f100506x = c26773t;
            aVar.f100507y = c26773t2;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C26773t c26773t = (C26773t) this.f100506x;
            C26773t c26773t2 = (C26773t) this.f100507y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f100505w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(c26773t.m79782c());
            arrayListM74097F1.addAll(c26773t2.m79782c());
            return C26773t.m79780b(c26773t2, false, false, null, null, null, null, arrayListM74097F1, 63, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m75352a(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C26773t(true, false, null, null, null, null, null, 126, null), upstream, new a(null));
    }
}
