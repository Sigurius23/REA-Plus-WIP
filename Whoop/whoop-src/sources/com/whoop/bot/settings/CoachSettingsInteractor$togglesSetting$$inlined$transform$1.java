package com.whoop.bot.settings;

import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.time.Instant;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsInteractor$togglesSetting$$inlined$transform$1", m100430f = "CoachSettingsInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class CoachSettingsInteractor$togglesSetting$$inlined$transform$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ Instant $start$inlined;
    final /* synthetic */ InterfaceC13058l $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CoachSettingsInteractor this$0;

    /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C60621<T> implements InterfaceC13062m {
        final /* synthetic */ InterfaceC13062m $$this$flow;
        final /* synthetic */ Instant $start$inlined;
        final /* synthetic */ CoachSettingsInteractor this$0;

        /* JADX INFO: renamed from: com.whoop.bot.settings.CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "com.whoop.bot.settings.CoachSettingsInteractor$togglesSetting$$inlined$transform$1$1", m100430f = "CoachSettingsInteractor.kt", m100431l = {40, 43, 47, 48, 49}, m100432m = "emit", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class AnonymousClass1 extends AbstractC32269c {
            int I$0;
            long J$0;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C60621.this.emit(null, this);
            }
        }

        public C60621(InterfaceC13062m interfaceC13062m, Instant instant, CoachSettingsInteractor coachSettingsInteractor) {
            this.$start$inlined = instant;
            this.this$0 = coachSettingsInteractor;
            this.$$this$flow = interfaceC13062m;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0114  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
        
            if (r2.emit(r15, r0) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0135, code lost:
        
            if (r2.emit(r15, r0) == r1) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // ec3.InterfaceC13062m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r14, q83.InterfaceC30057d<? super l83.C23454a0> r15) {
            /*
                Method dump skipped, instruction units count: 321
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.bot.settings.CoachSettingsInteractor$togglesSetting$$inlined$transform$1.C60621.emit(java.lang.Object, q83.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoachSettingsInteractor$togglesSetting$$inlined$transform$1(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, Instant instant, CoachSettingsInteractor coachSettingsInteractor) {
        super(2, interfaceC30057d);
        this.$this_transform = interfaceC13058l;
        this.$start$inlined = instant;
        this.this$0 = coachSettingsInteractor;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        CoachSettingsInteractor$togglesSetting$$inlined$transform$1 coachSettingsInteractor$togglesSetting$$inlined$transform$1 = new CoachSettingsInteractor$togglesSetting$$inlined$transform$1(this.$this_transform, interfaceC30057d, this.$start$inlined, this.this$0);
        coachSettingsInteractor$togglesSetting$$inlined$transform$1.L$0 = obj;
        return coachSettingsInteractor$togglesSetting$$inlined$transform$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((CoachSettingsInteractor$togglesSetting$$inlined$transform$1) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            InterfaceC13058l interfaceC13058l = this.$this_transform;
            C60621 c60621 = new C60621(interfaceC13062m, this.$start$inlined, this.this$0);
            this.L$0 = null;
            this.label = 1;
            if (interfaceC13058l.collect(c60621, this) == enumC31071a) {
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
