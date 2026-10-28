package io.getstream.chat.android.client.receipts;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.api.ChatApi;
import io.getstream.chat.android.client.persistence.repository.MessageReceiptRepository;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/receipts/MessageReceiptReporter;", "", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;", "messageReceiptRepository", "Lio/getstream/chat/android/client/api/ChatApi;", "api", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;Lio/getstream/chat/android/client/api/ChatApi;)V", "Ll83/a0;", "start", "()V", "Lbc3/c0;", "Lio/getstream/chat/android/client/persistence/repository/MessageReceiptRepository;", "Lio/getstream/chat/android/client/api/ChatApi;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageReceiptReporter {
    private final ChatApi api;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final MessageReceiptRepository messageReceiptRepository;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.receipts.MessageReceiptReporter$start$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.receipts.MessageReceiptReporter$start$2", m100430f = "MessageReceiptReporter.kt", m100431l = {47, 62, 72}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194272 extends AbstractC32275i implements InterfaceC4351m {
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        public C194272(InterfaceC30057d<? super C194272> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194272 c194272 = MessageReceiptReporter.this.new C194272(interfaceC30057d);
            c194272.L$0 = obj;
            return c194272;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194272) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0071  */
        /* JADX WARN: Code duplicated, block: B:24:0x0073 A[Catch: all -> 0x0022, PHI: r3
          0x0073: PHI (r3v9 java.lang.Object) = (r3v24 java.lang.Object), (r3v26 java.lang.Object) binds: [B:22:0x006f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x008a A[Catch: all -> 0x0022, LOOP:0: B:25:0x0084->B:27:0x008a, LOOP_END, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0109 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x011b A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x014e A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x0163 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0195 A[Catch: all -> 0x0022, LOOP:1: B:39:0x018f->B:41:0x0195, LOOP_END, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:45:0x01c7 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x01d1 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x01d5 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x01e9 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x0210 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x0216 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x021c A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:8:0x001c, B:19:0x0057, B:21:0x005d, B:24:0x0073, B:25:0x0084, B:27:0x008a, B:28:0x0103, B:30:0x0109, B:32:0x011b, B:33:0x013a, B:35:0x014e, B:37:0x0163, B:38:0x0182, B:39:0x018f, B:41:0x0195, B:42:0x01a3, B:47:0x01cb, B:49:0x01d1, B:51:0x01d5, B:53:0x01e9, B:54:0x0210, B:55:0x0215, B:45:0x01c7, B:56:0x0216, B:57:0x021b, B:58:0x021c, B:15:0x0049, B:16:0x004e), top: B:71:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x023c  */
        /* JADX WARN: Code duplicated, block: B:64:0x024e  */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0235, code lost:
        
            if (bc3.AbstractC3034m0.m8782b(1000, r64) == r2) goto L60;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x011b, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x0163, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:53:0x01e9, please report this as an issue */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0235 -> B:61:0x0238). Please report as a decompilation issue!!! */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r65) {
            /*
                Method dump skipped, instruction units count: 622
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.receipts.MessageReceiptReporter.C194272.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MessageReceiptReporter(InterfaceC2994c0 scope, MessageReceiptRepository messageReceiptRepository, ChatApi api) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(messageReceiptRepository, "messageReceiptRepository");
        AbstractC22676k.m65750j(api, "api");
        this.scope = scope;
        this.messageReceiptRepository = messageReceiptRepository;
        this.api = api;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MessageReceiptReporter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    public final void start() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "Starting reporter…", null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C194272(null), 3);
    }
}
