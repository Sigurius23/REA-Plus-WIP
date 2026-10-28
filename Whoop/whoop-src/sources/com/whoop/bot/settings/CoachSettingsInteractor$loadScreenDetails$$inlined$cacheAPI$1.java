package com.whoop.bot.settings;

import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1", m100430f = "CoachSettingsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class CoachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1 extends AbstractC32275i implements Function3 {
    final /* synthetic */ InterfaceC26834e $dataSource$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
        super(3, interfaceC30057d);
        this.$dataSource$inlined = interfaceC26834e;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        CoachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1 coachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1 = new CoachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1(interfaceC30057d, this.$dataSource$inlined);
        coachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1.L$0 = interfaceC13062m;
        coachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1.L$1 = c26832c;
        return coachSettingsInteractor$loadScreenDetails$$inlined$cacheAPI$1.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            C26832c c26832c = (C26832c) this.L$1;
            InterfaceC26834e interfaceC26834e = this.$dataSource$inlined;
            InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
            Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
            InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(CoachSettingsResponse.class);
            InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(CoachSettingsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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

    @Override // p715kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
