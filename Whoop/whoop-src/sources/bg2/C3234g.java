package bg2;

import c93.InterfaceC4351m;
import com.whoop.sms.common.data.SmsPhoneNumberResponse;
import com.whoop.sms.common.data.SmsPrefilledBodyResponse;
import com.whoop.sms.common.data.SmsVerificationApi;
import com.whoop.sms.common.data.SmsVerificationRequest;
import com.whoop.sms.common.data.SmsVerifyResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wf2.C37246a;

/* JADX INFO: renamed from: bg2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\f¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lbg2/g;", "", "Lcom/whoop/sms/common/data/SmsVerificationApi;", "api", "Lwf2/a;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/sms/common/data/SmsVerificationApi;Lwf2/a;Ltr2/n;)V", "", "phoneNumber", "Lec3/l;", "Lbg2/d;", "n", "(Ljava/lang/String;)Lec3/l;", "code", "m", "destinationPhoneNumber", "l", "k", "()Lec3/l;", "o", "p", "Lbg2/c;", "upstream", "j", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/sms/common/data/SmsVerificationApi;", "b", "Lwf2/a;", "c", "Ltr2/n;", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3234g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SmsVerificationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C37246a analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: bg2.g$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SmsSetupInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f12649w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f12650x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f12651y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C3234g f12652z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C3234g c3234g) {
            super(3, interfaceC30057d);
            this.f12652z = c3234g;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC3230c abstractC3230c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f12652z);
            aVar.f12650x = interfaceC13062m;
            aVar.f12651y = abstractC3230c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM9367l;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f12649w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f12650x;
                AbstractC3230c abstractC3230c = (AbstractC3230c) this.f12651y;
                if (abstractC3230c instanceof AbstractC3230c.a) {
                    interfaceC13058lM9367l = this.f12652z.m9366k();
                } else if (abstractC3230c instanceof AbstractC3230c.e) {
                    interfaceC13058lM9367l = this.f12652z.m9370o();
                } else if (abstractC3230c instanceof AbstractC3230c.d) {
                    interfaceC13058lM9367l = this.f12652z.m9369n(((AbstractC3230c.d) abstractC3230c).getPhoneNumber());
                } else if (abstractC3230c instanceof AbstractC3230c.c) {
                    interfaceC13058lM9367l = this.f12652z.m9368m(((AbstractC3230c.c) abstractC3230c).getCode());
                } else if (abstractC3230c instanceof AbstractC3230c.f) {
                    interfaceC13058lM9367l = this.f12652z.m9371p();
                } else {
                    if (!(abstractC3230c instanceof AbstractC3230c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM9367l = this.f12652z.m9367l(((AbstractC3230c.b) abstractC3230c).getDestinationPhoneNumber());
                }
                this.f12650x = null;
                this.f12651y = null;
                this.f12649w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM9367l, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC3230c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: bg2.g$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$interact$2", m100430f = "SmsSetupInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbg2/d;", "accumulator", "newState", "<anonymous>", "(Lbg2/d;Lbg2/d;)Lbg2/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f12653w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f12654x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f12655y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3231d c3231d, C3231d c3231d2, InterfaceC30057d<? super C3231d> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f12654x = c3231d;
            bVar.f12655y = c3231d2;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C3231d c3231d = (C3231d) this.f12654x;
            C3231d c3231d2 = (C3231d) this.f12655y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12653w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String phoneNumber = c3231d2.getPhoneNumber();
            if (phoneNumber.length() == 0) {
                phoneNumber = c3231d.getPhoneNumber();
            }
            return c3231d2.m9335a((65534 & 1) != 0 ? c3231d2.phoneNumber : phoneNumber, (65534 & 2) != 0 ? c3231d2.isPhoneSubmitting : false, (65534 & 4) != 0 ? c3231d2.phoneSubmitSuccess : false, (65534 & 8) != 0 ? c3231d2.phoneSubmitError : false, (65534 & 16) != 0 ? c3231d2.isCodeSubmitting : false, (65534 & 32) != 0 ? c3231d2.codeVerified : false, (65534 & 64) != 0 ? c3231d2.codeSubmitError : false, (65534 & 128) != 0 ? c3231d2.codeErrorMessage : null, (65534 & 256) != 0 ? c3231d2.coachPhoneNumber : null, (65534 & 512) != 0 ? c3231d2.isStartingTextingWhoop : false, (65534 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c3231d2.isTextingWhoopError : false, (65534 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c3231d2.destinationPhoneNumber : null, (65534 & 4096) != 0 ? c3231d2.contactPhoneNumbers : null, (65534 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c3231d2.prefilledBody : null, (65534 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c3231d2.isPhoneNumberError : false, (65534 & 32768) != 0 ? c3231d2.isFetchingDestinationPhoneNumber : false);
        }
    }

    /* JADX INFO: renamed from: bg2.g$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$saveWhoopContact$1", m100430f = "SmsSetupInteractor.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 101, 107, 116, 119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lbg2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f12656E;

        /* JADX INFO: renamed from: w */
        Object f12658w;

        /* JADX INFO: renamed from: x */
        Object f12659x;

        /* JADX INFO: renamed from: y */
        Object f12660y;

        /* JADX INFO: renamed from: z */
        int f12661z;

        /* JADX INFO: renamed from: bg2.g$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$saveWhoopContact$1$response$1", m100430f = "SmsSetupInteractor.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/sms/common/data/SmsPhoneNumberResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f12662w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3234g f12663x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3234g c3234g, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f12663x = c3234g;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f12663x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f12662w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                SmsVerificationApi smsVerificationApi = this.f12663x.api;
                this.f12662w = 1;
                Object objPhoneNumber = smsVerificationApi.phoneNumber(this);
                return objPhoneNumber == enumC31071a ? enumC31071a : objPhoneNumber;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<SmsPhoneNumberResponse>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C3234g.this.new c(interfaceC30057d);
            cVar.f12656E = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:45:0x0131  */
        /* JADX WARN: Code duplicated, block: B:48:0x016b  */
        /* JADX WARN: Code duplicated, block: B:50:0x016f  */
        /* JADX WARN: Code duplicated, block: B:55:0x01a8  */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
        
            if (r8.emit(r14, r33) == r9) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0168, code lost:
        
            if (r8.emit(r14, r33) == r9) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x01a2, code lost:
        
            if (r8.emit(r14, r33) == r9) goto L52;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instruction units count: 430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bg2.C3234g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: bg2.g$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$startTextingWhoop$1", m100430f = "SmsSetupInteractor.kt", m100431l = {82, 83, 89, 91, 94}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lbg2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f12665F;

        /* JADX INFO: renamed from: w */
        Object f12666w;

        /* JADX INFO: renamed from: x */
        Object f12667x;

        /* JADX INFO: renamed from: y */
        int f12668y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f12669z;

        /* JADX INFO: renamed from: bg2.g$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$startTextingWhoop$1$response$1", m100430f = "SmsSetupInteractor.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/sms/common/data/SmsPrefilledBodyResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f12670w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3234g f12671x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3234g c3234g, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f12671x = c3234g;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f12671x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f12670w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                SmsVerificationApi smsVerificationApi = this.f12671x.api;
                this.f12670w = 1;
                Object objPrefilledBody = smsVerificationApi.prefilledBody(this);
                return objPrefilledBody == enumC31071a ? enumC31071a : objPrefilledBody;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<SmsPrefilledBodyResponse>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12665F = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C3234g.this.new d(this.f12665F, interfaceC30057d);
            dVar.f12669z = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:35:0x0107  */
        /* JADX WARN: Code duplicated, block: B:38:0x013f  */
        /* JADX WARN: Code duplicated, block: B:40:0x0143  */
        /* JADX WARN: Code duplicated, block: B:45:0x017c  */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0104, code lost:
        
            if (r8.emit(r14, r33) == r9) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x013c, code lost:
        
            if (r8.emit(r14, r33) == r9) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0176, code lost:
        
            if (r8.emit(r14, r33) == r9) goto L42;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instruction units count: 386
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bg2.C3234g.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: bg2.g$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$submitCode$1", m100430f = "SmsSetupInteractor.kt", m100431l = {54, 55, 61, 68, 76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lbg2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f12673F;

        /* JADX INFO: renamed from: w */
        Object f12674w;

        /* JADX INFO: renamed from: x */
        Object f12675x;

        /* JADX INFO: renamed from: y */
        int f12676y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f12677z;

        /* JADX INFO: renamed from: bg2.g$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$submitCode$1$response$1", m100430f = "SmsSetupInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/sms/common/data/SmsVerifyResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f12678w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3234g f12679x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f12680y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3234g c3234g, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f12679x = c3234g;
                this.f12680y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f12679x, this.f12680y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f12678w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                SmsVerificationApi smsVerificationApi = this.f12679x.api;
                String str = this.f12680y;
                this.f12678w = 1;
                Object objVerifyCode = smsVerificationApi.verifyCode(str, this);
                return objVerifyCode == enumC31071a ? enumC31071a : objVerifyCode;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<SmsVerifyResponse>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12673F = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C3234g.this.new e(this.f12673F, interfaceC30057d);
            eVar.f12677z = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x009e  */
        /* JADX WARN: Code duplicated, block: B:37:0x0104  */
        /* JADX WARN: Code duplicated, block: B:38:0x0109  */
        /* JADX WARN: Code duplicated, block: B:40:0x010c  */
        /* JADX WARN: Code duplicated, block: B:41:0x010f  */
        /* JADX WARN: Code duplicated, block: B:45:0x0146  */
        /* JADX WARN: Code duplicated, block: B:47:0x014a  */
        /* JADX WARN: Code duplicated, block: B:52:0x0184  */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00fc, code lost:
        
            if (r8.emit(r15, r34) == r9) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0143, code lost:
        
            if (r8.emit(r15, r34) == r9) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x017e, code lost:
        
            if (r8.emit(r15, r34) == r9) goto L49;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instruction units count: 394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bg2.C3234g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: bg2.g$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$submitPhone$1", m100430f = "SmsSetupInteractor.kt", m100431l = {41, 43, 47, 49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lbg2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f12681E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C3234g f12682F;

        /* JADX INFO: renamed from: w */
        Object f12683w;

        /* JADX INFO: renamed from: x */
        Object f12684x;

        /* JADX INFO: renamed from: y */
        int f12685y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f12686z;

        /* JADX INFO: renamed from: bg2.g$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$submitPhone$1$response$1", m100430f = "SmsSetupInteractor.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f12687w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3234g f12688x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ SmsVerificationRequest f12689y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3234g c3234g, SmsVerificationRequest smsVerificationRequest, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f12688x = c3234g;
                this.f12689y = smsVerificationRequest;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f12688x, this.f12689y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f12687w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                SmsVerificationApi smsVerificationApi = this.f12688x.api;
                SmsVerificationRequest smsVerificationRequest = this.f12689y;
                this.f12687w = 1;
                Object objSendVerificationCode = smsVerificationApi.sendVerificationCode(smsVerificationRequest, this);
                return objSendVerificationCode == enumC31071a ? enumC31071a : objSendVerificationCode;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, C3234g c3234g, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12681E = str;
            this.f12682F = c3234g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f12681E, this.f12682F, interfaceC30057d);
            fVar.f12686z = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:25:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:27:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:32:0x0126  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e4, code lost:
        
            if (r8.emit(r13, r32) == r9) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0120, code lost:
        
            if (r8.emit(r13, r32) == r9) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r33) {
            /*
                Method dump skipped, instruction units count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bg2.C3234g.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: bg2.g$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$trackOptIn$1", m100430f = "SmsSetupInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lbg2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12690w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C3234g.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12690w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C3234g.this.analyticsHelper.m119387d();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: bg2.g$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.domain.SmsSetupInteractor$trackTextWhoop$1", m100430f = "SmsSetupInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lbg2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12692w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C3234g.this.new h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12692w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C3234g.this.analyticsHelper.m119388e();
            return C23454a0.f92919a;
        }
    }

    public C3234g(SmsVerificationApi api, C37246a analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC13058l m9366k() {
        return new C13084s1(new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m9367l(String destinationPhoneNumber) {
        return new C13084s1(new d(destinationPhoneNumber, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m9368m(String code) {
        return new C13084s1(new e(code, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m9369n(String phoneNumber) {
        return new C13084s1(new f(phoneNumber, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m9370o() {
        return new C13084s1(new g(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC13058l m9371p() {
        return new C13084s1(new h(null));
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m9372j(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C3231d(null, false, false, false, false, false, false, null, null, false, false, null, null, null, false, false, 65535, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new b(null));
    }

    public /* synthetic */ C3234g(SmsVerificationApi smsVerificationApi, C37246a c37246a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(smsVerificationApi, c37246a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SmsSetupInteractor") : interfaceC34116n);
    }
}
