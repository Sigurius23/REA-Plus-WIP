package com.whoop.data.datastore;

import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hg3.AbstractC17269i;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/data/datastore/EmailDataStoreHelper;", "", "La6/g;", "Lf6/f;", "prefs", "Ltr2/n;", "logger", "<init>", "(La6/g;Ltr2/n;)V", "Lec3/l;", "", "emailFlow", "()Lec3/l;", "getEmail", "(Lq83/d;)Ljava/lang/Object;", "value", "Ll83/a0;", "saveEmail", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "clearEmail", "La6/g;", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EmailDataStoreHelper {
    private final InterfaceC34116n logger;
    private final InterfaceC0422g prefs;

    /* JADX INFO: renamed from: com.whoop.data.datastore.EmailDataStoreHelper$clearEmail$1 */
    /* JADX INFO: loaded from: classes5.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.datastore.EmailDataStoreHelper", m100430f = "EmailDataStoreHelper.kt", m100431l = {74}, m100432m = "clearEmail", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C64721 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C64721(InterfaceC30057d<? super C64721> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailDataStoreHelper.this.clearEmail(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.datastore.EmailDataStoreHelper$clearEmail$2 */
    /* JADX INFO: loaded from: classes5.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.datastore.EmailDataStoreHelper$clearEmail$2", m100430f = "EmailDataStoreHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C64732 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C64732(InterfaceC30057d<? super C64732> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C64732 c64732 = new C64732(interfaceC30057d);
            c64732.L$0 = obj;
            return c64732;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C64732) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40229f(EmailDataStoreHelperKt.EMAIL_KEY);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.datastore.EmailDataStoreHelper$emailFlow$1 */
    /* JADX INFO: loaded from: classes5.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.datastore.EmailDataStoreHelper$emailFlow$1", m100430f = "EmailDataStoreHelper.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lf6/f;", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C64751 extends AbstractC32275i implements Function3 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C64751(InterfaceC30057d<? super C64751> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C64751 c64751 = EmailDataStoreHelper.this.new C64751(interfaceC30057d);
            c64751.L$0 = interfaceC13062m;
            c64751.L$1 = th3;
            return c64751.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            Throwable th3 = (Throwable) this.L$1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof IOException)) {
                    throw th3;
                }
                EmailDataStoreHelper.this.logger.mo85230v("[EmailDataStoreHelper] IO error; emitting empty prefs", th3, new AbstractC30556a.a[0]);
                C14129a c14129a = new C14129a(true);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (interfaceC13062m.emit(c14129a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.data.datastore.EmailDataStoreHelper$getEmail$1 */
    /* JADX INFO: loaded from: classes5.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.datastore.EmailDataStoreHelper", m100430f = "EmailDataStoreHelper.kt", m100431l = {48}, m100432m = "getEmail", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C64761 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C64761(InterfaceC30057d<? super C64761> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailDataStoreHelper.this.getEmail(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.datastore.EmailDataStoreHelper$saveEmail$1 */
    /* JADX INFO: loaded from: classes5.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.datastore.EmailDataStoreHelper", m100430f = "EmailDataStoreHelper.kt", m100431l = {61}, m100432m = "saveEmail", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C64771 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C64771(InterfaceC30057d<? super C64771> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailDataStoreHelper.this.saveEmail(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.datastore.EmailDataStoreHelper$saveEmail$2 */
    /* JADX INFO: loaded from: classes5.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.datastore.EmailDataStoreHelper$saveEmail$2", m100430f = "EmailDataStoreHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C64782 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64782(String str, InterfaceC30057d<? super C64782> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$value = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C64782 c64782 = new C64782(this.$value, interfaceC30057d);
            c64782.L$0 = obj;
            return c64782;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C64782) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(EmailDataStoreHelperKt.EMAIL_KEY, this.$value);
            return C23454a0.f92919a;
        }
    }

    public EmailDataStoreHelper(InterfaceC0422g prefs, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(prefs, "prefs");
        AbstractC22676k.m65750j(logger, "logger");
        this.prefs = prefs;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object clearEmail(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C64721 c64721;
        if (interfaceC30057d instanceof C64721) {
            c64721 = (C64721) interfaceC30057d;
            int i13 = c64721.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c64721.label = i13 - Integer.MIN_VALUE;
            } else {
                c64721 = new C64721(interfaceC30057d);
            }
        } else {
            c64721 = new C64721(interfaceC30057d);
        }
        Object obj = c64721.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c64721.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.prefs;
                C64732 c64732 = new C64732(null);
                c64721.label = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, c64732, c64721) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("[EmailDataStoreHelper] Failed to clear email", e13, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    public final InterfaceC13058l emailFlow() {
        final C13015a0 c13015a0 = new C13015a0(this.prefs.getData(), new C64751(null));
        return AbstractC13091v.m36610t(new InterfaceC13058l() { // from class: com.whoop.data.datastore.EmailDataStoreHelper$emailFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.whoop.data.datastore.EmailDataStoreHelper$emailFlow$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C64742<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: com.whoop.data.datastore.EmailDataStoreHelper$emailFlow$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "com.whoop.data.datastore.EmailDataStoreHelper$emailFlow$$inlined$map$1$2", m100430f = "EmailDataStoreHelper.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
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
                        return C64742.this.emit(null, this);
                    }
                }

                public C64742(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Object objMo40227b = ((AbstractC14134f) obj).mo40227b(EmailDataStoreHelperKt.EMAIL_KEY);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(objMo40227b, anonymousClass1) == enumC31071a) {
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

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = c13015a0.collect(new C64742(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getEmail(InterfaceC30057d<? super String> interfaceC30057d) {
        C64761 c64761;
        if (interfaceC30057d instanceof C64761) {
            c64761 = (C64761) interfaceC30057d;
            int i13 = c64761.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c64761.label = i13 - Integer.MIN_VALUE;
            } else {
                c64761 = new C64761(interfaceC30057d);
            }
        } else {
            c64761 = new C64761(interfaceC30057d);
        }
        Object objM36575A = c64761.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c64761.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM36575A);
                InterfaceC13058l data = this.prefs.getData();
                c64761.label = 1;
                objM36575A = AbstractC13091v.m36575A(data, c64761);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM36575A);
            }
            return (String) ((AbstractC14134f) objM36575A).mo40227b(EmailDataStoreHelperKt.EMAIL_KEY);
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("[EmailDataStoreHelper] Failed to read email", e13, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object saveEmail(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C64771 c64771;
        if (interfaceC30057d instanceof C64771) {
            c64771 = (C64771) interfaceC30057d;
            int i13 = c64771.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c64771.label = i13 - Integer.MIN_VALUE;
            } else {
                c64771 = new C64771(interfaceC30057d);
            }
        } else {
            c64771 = new C64771(interfaceC30057d);
        }
        Object obj = c64771.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c64771.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.prefs;
                C64782 c64782 = new C64782(str, null);
                c64771.L$0 = null;
                c64771.label = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, c64782, c64771) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("[EmailDataStoreHelper] Failed to save email", e13, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ EmailDataStoreHelper(InterfaceC0422g interfaceC0422g, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0422g, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EmailDataStoreHelper") : interfaceC34116n);
    }
}
