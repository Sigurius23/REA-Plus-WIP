package fh2;

import dh2.AbstractC12050c;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: fh2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lfh2/a;", "", "<init>", "()V", "Lec3/l;", "Ldh2/c;", "upstream", "Lcom/whoop/stealthmode/view/a;", "a", "(Lec3/l;)Lec3/l;", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14491a {

    /* JADX INFO: renamed from: fh2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f52911w;

        /* JADX INFO: renamed from: fh2.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41587a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f52912w;

            /* JADX INFO: renamed from: fh2.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stealthmode.reducer.StealthModeNavigationReducer$navigate$$inlined$map$1$2", m100430f = "StealthModeNavigationReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41588a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f52913E;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f52914w;

                /* JADX INFO: renamed from: x */
                int f52915x;

                /* JADX INFO: renamed from: z */
                Object f52917z;

                public C41588a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f52914w = obj;
                    this.f52915x |= Integer.MIN_VALUE;
                    return C41587a.this.emit(null, this);
                }
            }

            public C41587a(InterfaceC13062m interfaceC13062m) {
                this.f52912w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41588a c41588a;
                if (interfaceC30057d instanceof C41588a) {
                    c41588a = (C41588a) interfaceC30057d;
                    int i13 = c41588a.f52915x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41588a.f52915x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41588a = new C41588a(interfaceC30057d);
                    }
                } else {
                    c41588a = new C41588a(interfaceC30057d);
                }
                Object obj2 = c41588a.f52914w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41588a.f52915x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    throw new IllegalStateException("Cannot navigate from domain state " + ((AbstractC12050c) obj));
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj2);
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l) {
            this.f52911w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f52911w.collect(new C41587a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m41398a(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream);
    }
}
