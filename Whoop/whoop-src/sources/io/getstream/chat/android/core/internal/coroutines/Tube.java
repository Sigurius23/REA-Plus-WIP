package io.getstream.chat.android.core.internal.coroutines;

import bc3.AbstractC3034m0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.HashSet;
import java.util.Iterator;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR0\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0010j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/core/internal/coroutines/Tube;", "T", "Lec3/l;", "Lec3/m;", "<init>", "()V", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "value", "emit", "(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;", "Lmc3/a;", "mutex", "Lmc3/a;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "collectors", "Ljava/util/HashSet;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class Tube<T> implements InterfaceC13058l, InterfaceC13062m {
    private final InterfaceC25435a mutex = AbstractC25438d.m74669a();
    private final HashSet<InterfaceC13062m> collectors = new HashSet<>();

    /* JADX INFO: renamed from: io.getstream.chat.android.core.internal.coroutines.Tube$collect$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.core.internal.coroutines.Tube", m100430f = "Tube.kt", m100431l = {80, 46, 91, 91}, m100432m = "collect")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194581 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ Tube<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194581(Tube<T> tube, InterfaceC30057d<? super C194581> interfaceC30057d) {
            super(interfaceC30057d);
            this.this$0 = tube;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.core.internal.coroutines.Tube$emit$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.core.internal.coroutines.Tube", m100430f = "Tube.kt", m100431l = {80, 66}, m100432m = "emit")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194591 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ Tube<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194591(Tube<T> tube, InterfaceC30057d<? super C194591> interfaceC30057d) {
            super(interfaceC30057d);
            this.this$0 = tube;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C194581 c194581;
        InterfaceC13062m interfaceC13062m2;
        InterfaceC25435a interfaceC25435a;
        InterfaceC25435a interfaceC25435a2;
        int i13;
        if (interfaceC30057d instanceof C194581) {
            c194581 = (C194581) interfaceC30057d;
            int i14 = c194581.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c194581.label = i14 - Integer.MIN_VALUE;
            } else {
                c194581 = new C194581(this, interfaceC30057d);
            }
        } else {
            c194581 = new C194581(this, interfaceC30057d);
        }
        Object obj = c194581.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c194581.label;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a2 = this.mutex;
                c194581.L$0 = interfaceC13062m;
                c194581.L$1 = interfaceC25435a2;
                c194581.I$0 = 0;
                c194581.label = 1;
                if (interfaceC25435a2.mo68211b(c194581) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 == 2) {
                    AbstractC34132o.m107864I(obj);
                    throw new KotlinNothingValueException();
                }
                if (i15 == 3) {
                    interfaceC25435a = (InterfaceC25435a) c194581.L$1;
                    interfaceC13062m2 = (InterfaceC13062m) c194581.L$0;
                    AbstractC34132o.m107864I(obj);
                    try {
                        this.collectors.remove(interfaceC13062m2);
                        return C23454a0.f92919a;
                    } finally {
                        interfaceC25435a.mo68214i(null);
                    }
                }
                if (i15 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c194581.L$2;
                Throwable th3 = (Throwable) c194581.L$1;
                InterfaceC13062m interfaceC13062m3 = (InterfaceC13062m) c194581.L$0;
                AbstractC34132o.m107864I(obj);
                try {
                    this.collectors.remove(interfaceC13062m3);
                    throw th3;
                } finally {
                    interfaceC25435a3.mo68214i(null);
                }
            }
            int i16 = c194581.I$0;
            interfaceC25435a2 = (InterfaceC25435a) c194581.L$1;
            InterfaceC13062m interfaceC13062m4 = (InterfaceC13062m) c194581.L$0;
            try {
                AbstractC34132o.m107864I(obj);
                i13 = i16;
                interfaceC13062m = interfaceC13062m4;
            } catch (Throwable unused) {
                interfaceC13062m = interfaceC13062m4;
                InterfaceC25435a interfaceC25435a4 = this.mutex;
                c194581.L$0 = interfaceC13062m;
                c194581.L$1 = interfaceC25435a4;
                c194581.I$0 = 0;
                c194581.label = 3;
                if (interfaceC25435a4.mo68211b(c194581) != enumC31071a) {
                    interfaceC13062m2 = interfaceC13062m;
                    interfaceC25435a = interfaceC25435a4;
                    this.collectors.remove(interfaceC13062m2);
                    return C23454a0.f92919a;
                }
                return enumC31071a;
            }
            try {
                this.collectors.add(interfaceC13062m);
                interfaceC25435a2.mo68214i(null);
                c194581.L$0 = interfaceC13062m;
                c194581.L$1 = null;
                c194581.I$0 = i13;
                c194581.I$1 = 0;
                c194581.label = 2;
                AbstractC3034m0.m8781a(c194581);
                return enumC31071a;
            } catch (Throwable th4) {
                interfaceC25435a2.mo68214i(null);
                throw th4;
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0081 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #0 {all -> 0x00a4, blocks: (B:24:0x007b, B:26:0x0081), top: B:38:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ec3.InterfaceC13062m
    public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C194591 c194591;
        InterfaceC25435a interfaceC25435a;
        int i13;
        Object obj;
        InterfaceC25435a interfaceC25435a2;
        Iterator<T> it;
        int i14;
        int i15;
        int i16;
        InterfaceC13062m interfaceC13062m;
        if (interfaceC30057d instanceof C194591) {
            c194591 = (C194591) interfaceC30057d;
            int i17 = c194591.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                c194591.label = i17 - Integer.MIN_VALUE;
            } else {
                c194591 = new C194591(this, interfaceC30057d);
            }
        } else {
            c194591 = new C194591(this, interfaceC30057d);
        }
        Object obj2 = c194591.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i18 = c194591.label;
        try {
            if (i18 == 0) {
                AbstractC34132o.m107864I(obj2);
                interfaceC25435a = this.mutex;
                c194591.L$0 = t14;
                c194591.L$1 = interfaceC25435a;
                c194591.I$0 = 0;
                c194591.label = 1;
                if (interfaceC25435a.mo68211b(c194591) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i18 == 1) {
                int i19 = c194591.I$0;
                interfaceC25435a = (InterfaceC25435a) c194591.L$1;
                Object obj3 = c194591.L$0;
                AbstractC34132o.m107864I(obj2);
                i13 = i19;
                t14 = (T) obj3;
            } else {
                if (i18 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = c194591.I$2;
                i15 = c194591.I$1;
                i16 = c194591.I$0;
                it = (Iterator) c194591.L$3;
                interfaceC25435a2 = (InterfaceC25435a) c194591.L$1;
                obj = c194591.L$0;
                AbstractC34132o.m107864I(obj2);
            }
            while (it.hasNext()) {
                try {
                    interfaceC13062m = (InterfaceC13062m) it.next();
                    c194591.L$0 = obj;
                    c194591.L$1 = interfaceC25435a2;
                    c194591.L$2 = null;
                    c194591.L$3 = it;
                    c194591.L$4 = null;
                    c194591.L$5 = null;
                    c194591.I$0 = i16;
                    c194591.I$1 = i15;
                    c194591.I$2 = i14;
                    c194591.I$3 = 0;
                    c194591.label = 2;
                    if (interfaceC13062m.emit(obj, c194591) == enumC31071a) {
                        return enumC31071a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC25435a = interfaceC25435a2;
                    interfaceC25435a.mo68214i(null);
                    throw th;
                }
            }
            interfaceC25435a2.mo68214i(null);
            return C23454a0.f92919a;
            obj = t14;
            interfaceC25435a2 = interfaceC25435a;
            it = this.collectors.iterator();
            i14 = 0;
            i15 = 0;
            i16 = i13;
            while (it.hasNext()) {
                interfaceC13062m = (InterfaceC13062m) it.next();
                c194591.L$0 = obj;
                c194591.L$1 = interfaceC25435a2;
                c194591.L$2 = null;
                c194591.L$3 = it;
                c194591.L$4 = null;
                c194591.L$5 = null;
                c194591.I$0 = i16;
                c194591.I$1 = i15;
                c194591.I$2 = i14;
                c194591.I$3 = 0;
                c194591.label = 2;
                if (interfaceC13062m.emit(obj, c194591) == enumC31071a) {
                    return enumC31071a;
                }
            }
            interfaceC25435a2.mo68214i(null);
            return C23454a0.f92919a;
        } catch (Throwable th4) {
            th = th4;
            interfaceC25435a.mo68214i(null);
            throw th;
        }
    }
}
