package com.whoop.bot.settings;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsViewModel$viewState$1", m100430f = "CoachSettingsViewModel.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class CoachSettingsViewModel$viewState$1 extends AbstractC32275i implements InterfaceC4351m {
    private /* synthetic */ Object L$0;
    int label;

    public CoachSettingsViewModel$viewState$1(InterfaceC30057d<? super CoachSettingsViewModel$viewState$1> interfaceC30057d) {
        super(2, interfaceC30057d);
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        CoachSettingsViewModel$viewState$1 coachSettingsViewModel$viewState$1 = new CoachSettingsViewModel$viewState$1(interfaceC30057d);
        coachSettingsViewModel$viewState$1.L$0 = obj;
        return coachSettingsViewModel$viewState$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((CoachSettingsViewModel$viewState$1) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            CoachSettingsViewEvent.Load load = CoachSettingsViewEvent.Load.INSTANCE;
            this.L$0 = null;
            this.label = 1;
            if (interfaceC13062m.emit(load, this) == enumC31071a) {
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
