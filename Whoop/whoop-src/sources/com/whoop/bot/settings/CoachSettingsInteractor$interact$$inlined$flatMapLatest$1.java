package com.whoop.bot.settings;

import ec3.InterfaceC13062m;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CoachSettingsInteractor.kt", m100431l = {193, 189}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class CoachSettingsInteractor$interact$$inlined$flatMapLatest$1 extends AbstractC32275i implements Function3 {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ CoachSettingsInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoachSettingsInteractor$interact$$inlined$flatMapLatest$1(InterfaceC30057d interfaceC30057d, CoachSettingsInteractor coachSettingsInteractor) {
        super(3, interfaceC30057d);
        this.this$0 = coachSettingsInteractor;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, CoachSettingsViewEvent coachSettingsViewEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        CoachSettingsInteractor$interact$$inlined$flatMapLatest$1 coachSettingsInteractor$interact$$inlined$flatMapLatest$1 = new CoachSettingsInteractor$interact$$inlined$flatMapLatest$1(interfaceC30057d, this.this$0);
        coachSettingsInteractor$interact$$inlined$flatMapLatest$1.L$0 = interfaceC13062m;
        coachSettingsInteractor$interact$$inlined$flatMapLatest$1.L$1 = coachSettingsViewEvent;
        return coachSettingsInteractor$interact$$inlined$flatMapLatest$1.invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r3, r8) == r0) goto L24;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L32
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r8.L$0
            ec3.m r0 = (ec3.InterfaceC13062m) r0
            p505ts.AbstractC34132o.m107864I(r9)
            goto L9a
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.L$4
            com.whoop.bot.settings.CoachSettingsViewEvent r1 = (com.whoop.bot.settings.CoachSettingsViewEvent) r1
            java.lang.Object r1 = r8.L$3
            q83.d r1 = (q83.InterfaceC30057d) r1
            java.lang.Object r1 = r8.L$2
            ec3.m r1 = (ec3.InterfaceC13062m) r1
            java.lang.Object r3 = r8.L$0
            ec3.m r3 = (ec3.InterfaceC13062m) r3
            p505ts.AbstractC34132o.m107864I(r9)
            goto L84
        L32:
            p505ts.AbstractC34132o.m107864I(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            ec3.m r1 = (ec3.InterfaceC13062m) r1
            java.lang.Object r9 = r8.L$1
            com.whoop.bot.settings.CoachSettingsViewEvent r9 = (com.whoop.bot.settings.CoachSettingsViewEvent) r9
            com.whoop.bot.settings.CoachSettingsViewEvent$DismissError r5 = com.whoop.bot.settings.CoachSettingsViewEvent.DismissError.INSTANCE
            boolean r5 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r9, r5)
            if (r5 == 0) goto L4f
            com.whoop.bot.settings.InternalEvent$DismissError r9 = com.whoop.bot.settings.InternalEvent.DismissError.INSTANCE
            a6.u r3 = new a6.u
            r5 = 1
            r3.<init>(r9, r5)
            goto L85
        L4f:
            com.whoop.bot.settings.CoachSettingsViewEvent$Load r5 = com.whoop.bot.settings.CoachSettingsViewEvent.Load.INSTANCE
            boolean r5 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r9, r5)
            if (r5 == 0) goto L5e
            com.whoop.bot.settings.CoachSettingsInteractor r9 = r8.this$0
            ec3.l r3 = com.whoop.bot.settings.CoachSettingsInteractor.access$loadScreenDetails(r9)
            goto L85
        L5e:
            boolean r5 = r9 instanceof com.whoop.bot.settings.CoachSettingsViewEvent.Toggle
            if (r5 == 0) goto L9d
            com.whoop.bot.settings.CoachSettingsInteractor r5 = r8.this$0
            com.whoop.bot.settings.CoachSettingsViewEvent$Toggle r9 = (com.whoop.bot.settings.CoachSettingsViewEvent.Toggle) r9
            java.lang.String r6 = r9.getKey()
            boolean r9 = r9.getEnabled()
            r8.L$0 = r4
            r8.L$1 = r4
            r8.L$2 = r1
            r8.L$3 = r4
            r8.L$4 = r4
            r7 = 0
            r8.I$0 = r7
            r8.label = r3
            java.lang.Object r9 = com.whoop.bot.settings.CoachSettingsInteractor.access$togglesSetting(r5, r6, r9, r8)
            if (r9 != r0) goto L84
            goto L99
        L84:
            r3 = r9
        L85:
            ec3.l r3 = (ec3.InterfaceC13058l) r3
            r8.L$0 = r4
            r8.L$1 = r4
            r8.L$2 = r4
            r8.L$3 = r4
            r8.L$4 = r4
            r8.label = r2
            java.lang.Object r9 = ec3.AbstractC13091v.m36613w(r1, r3, r8)
            if (r9 != r0) goto L9a
        L99:
            return r0
        L9a:
            l83.a0 r9 = l83.C23454a0.f92919a
            return r9
        L9d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "found "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = ": this should never happen"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p715kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC13062m) obj, (CoachSettingsViewEvent) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
