package io.getstream.chat.android.client.internal.state.utils.internal;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0097@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;", "T", "Lec3/f2;", "Lkotlin/Function0;", "getValue", "Lec3/l;", "flow", "<init>", "(Lc93/a;Lec3/l;)V", "Lec3/m;", "collector", "", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "Lc93/a;", "Lec3/l;", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "()Ljava/lang/Object;", "value", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DerivedStateFlow<T> implements InterfaceC13037f2 {
    private final InterfaceC13058l flow;
    private final InterfaceC4339a getValue;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlow$collect$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlow", m100430f = "DerivedStateFlow.kt", m100431l = {46}, m100432m = "collect")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193731 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DerivedStateFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193731(DerivedStateFlow<T> derivedStateFlow, InterfaceC30057d<? super C193731> interfaceC30057d) {
            super(interfaceC30057d);
            this.this$0 = derivedStateFlow;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            this.this$0.collect(null, this);
            return EnumC31071a.f128113w;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlow$collect$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlow$collect$2", m100430f = "DerivedStateFlow.kt", m100431l = {46, 46}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/Void;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C193742 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC13062m $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DerivedStateFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193742(DerivedStateFlow<T> derivedStateFlow, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C193742> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.this$0 = derivedStateFlow;
            this.$collector = interfaceC13062m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C193742 c193742 = new C193742(this.this$0, this.$collector, interfaceC30057d);
            c193742.L$0 = obj;
            return c193742;
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<?> interfaceC30057d) {
            ((C193742) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            return EnumC31071a.f128113w;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (((ec3.InterfaceC13037f2) r7).collect(r0, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.L$0
                bc3.c0 r0 = (bc3.InterfaceC2994c0) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.label
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L21
                if (r2 == r5) goto L1d
                if (r2 == r4) goto L19
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L48
            L1d:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L39
            L21:
                p505ts.AbstractC34132o.m107864I(r7)
                io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlow<T> r7 = r6.this$0
                ec3.l r7 = io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlow.access$getFlow$p(r7)
                ec3.l r7 = ec3.AbstractC13091v.m36610t(r7)
                r6.L$0 = r3
                r6.label = r5
                java.lang.Object r7 = ec3.AbstractC13091v.m36588N(r7, r0, r6)
                if (r7 != r1) goto L39
                goto L47
            L39:
                ec3.f2 r7 = (ec3.InterfaceC13037f2) r7
                ec3.m r0 = r6.$collector
                r6.L$0 = r3
                r6.label = r4
                java.lang.Object r7 = r7.collect(r0, r6)
                if (r7 != r1) goto L48
            L47:
                return r1
            L48:
                kotlin.KotlinNothingValueException r7 = new kotlin.KotlinNothingValueException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlow.C193742.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<?>) obj2);
            return EnumC31071a.f128113w;
        }
    }

    public DerivedStateFlow(InterfaceC4339a getValue, InterfaceC13058l flow) {
        AbstractC22676k.m65750j(getValue, "getValue");
        AbstractC22676k.m65750j(flow, "flow");
        this.getValue = getValue;
        this.flow = flow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d<?> interfaceC30057d) {
        C193731 c193731;
        if (interfaceC30057d instanceof C193731) {
            c193731 = (C193731) interfaceC30057d;
            int i13 = c193731.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193731.label = i13 - Integer.MIN_VALUE;
            } else {
                c193731 = new C193731(this, interfaceC30057d);
            }
        } else {
            c193731 = new C193731(this, interfaceC30057d);
        }
        Object obj = c193731.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193731.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C193742 c193742 = new C193742(this, interfaceC13062m, null);
            c193731.L$0 = null;
            c193731.label = 1;
            if (AbstractC3006f0.m8719m(c193742, c193731) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // ec3.InterfaceC13087t1
    public final List<T> getReplayCache() {
        return AbstractC37056f.m118958J(this.getValue.invoke());
    }

    @Override // ec3.InterfaceC13037f2
    public final T getValue() {
        return (T) this.getValue.invoke();
    }
}
