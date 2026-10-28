package me2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.shepherd.feature.welcome.domain.models.ShepherdWelcomeScreenResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import l83.C23454a0;
import le2.InterfaceC23878b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: me2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lme2/d;", "", "<init>", "()V", "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;", "bffFeed", "Lme2/c$a;", "c", "(Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;)Lme2/c$a;", "Lec3/l;", "Lle2/b;", "domainStateFlow", "Lme2/c;", "b", "(Lec3/l;)Lec3/l;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25476d {

    /* JADX INFO: renamed from: me2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f99780w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25476d f99781x;

        /* JADX INFO: renamed from: me2.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41995a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f99782w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25476d f99783x;

            /* JADX INFO: renamed from: me2.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.welcome.presentation.ShepherdWelcomeViewStateReducer$reduce$$inlined$map$1$2", m100430f = "ShepherdWelcomeViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41996a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f99784E;

                /* JADX INFO: renamed from: F */
                Object f99785F;

                /* JADX INFO: renamed from: G */
                Object f99786G;

                /* JADX INFO: renamed from: H */
                int f99787H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f99788w;

                /* JADX INFO: renamed from: x */
                int f99789x;

                /* JADX INFO: renamed from: y */
                Object f99790y;

                public C41996a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f99788w = obj;
                    this.f99789x |= Integer.MIN_VALUE;
                    return C41995a.this.emit(null, this);
                }
            }

            public C41995a(InterfaceC13062m interfaceC13062m, C25476d c25476d) {
                this.f99782w = interfaceC13062m;
                this.f99783x = c25476d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41996a c41996a;
                Object objM74896c;
                if (interfaceC30057d instanceof C41996a) {
                    c41996a = (C41996a) interfaceC30057d;
                    int i13 = c41996a.f99789x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41996a.f99789x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41996a = new C41996a(interfaceC30057d);
                    }
                } else {
                    c41996a = new C41996a(interfaceC30057d);
                }
                Object obj2 = c41996a.f99788w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41996a.f99789x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f99782w;
                    InterfaceC23878b interfaceC23878b = (InterfaceC23878b) obj;
                    if (interfaceC23878b instanceof InterfaceC23878b.b) {
                        objM74896c = InterfaceC25475c.b.INSTANCE.m74894b();
                    } else if (interfaceC23878b instanceof InterfaceC23878b.a) {
                        objM74896c = InterfaceC25475c.b.INSTANCE.m74893a();
                    } else {
                        if (!(interfaceC23878b instanceof InterfaceC23878b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM74896c = this.f99783x.m74896c(((InterfaceC23878b.c) interfaceC23878b).getWelcomeScreenResponse());
                    }
                    c41996a.f99790y = null;
                    c41996a.f99784E = null;
                    c41996a.f99785F = null;
                    c41996a.f99786G = null;
                    c41996a.f99787H = 0;
                    c41996a.f99789x = 1;
                    if (interfaceC13062m.emit(objM74896c, c41996a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, C25476d c25476d) {
            this.f99780w = interfaceC13058l;
            this.f99781x = c25476d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f99780w.collect(new C41995a(interfaceC13062m, this.f99781x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final InterfaceC25475c.a m74896c(ShepherdWelcomeScreenResponse bffFeed) {
        EnumC16313m0 enumC16313m0;
        String icon = bffFeed.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CROSS;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new InterfaceC25475c.a(enumC16313m1.toWhoopIcon(), AbstractC8693b.m21278l(bffFeed.getTitle()), AbstractC8693b.m21278l(bffFeed.getDescription()), new C25477e(AbstractC8693b.m21278l(bffFeed.getButton().getLabel()), bffFeed.getButton().getFocus()), new AbstractC22403o.c(bffFeed.getBackgroundImage(), 0, 0, 0, 14, null));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m74897b(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return new a(domainStateFlow, this);
    }
}
