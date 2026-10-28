package io.getstream.chat.android.client.attachment.worker;

import android.content.Context;
import androidx.room.AbstractC1772c1;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.channel.state.ChannelStateLogicProvider;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.models.UploadAttachmentsNetworkType;
import java.util.LinkedHashSet;
import java.util.UUID;
import l83.C23465k;
import l83.C23470p;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p024b0.C2178b;
import p218ic.AbstractC18386u;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18380r;
import p218ic.C18392z;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p249jc.C21596v;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "doWork", "(Lq83/d;)Ljava/lang/Object;", "Companion", "Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UploadAttachmentsAndroidWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String DATA_CHANNEL_ID = "channel_id";
    private static final String DATA_CHANNEL_TYPE = "channel_type";
    private static final String DATA_MESSAGE_ID = "message_id";
    private static final String ERROR_KEY = "error";
    private static final String TAG = "Chat:SystemUploadWorker";

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/attachment/worker/UploadAttachmentsAndroidWorker$Companion;", "", "<init>", "()V", "Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;", "Lic/x;", "toNetworkType", "(Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Lic/x;", "Landroid/content/Context;", "context", "", "channelType", "channelId", "messageId", "networkType", "Ljava/util/UUID;", "start", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/UploadAttachmentsNetworkType;)Ljava/util/UUID;", "workId", "Ll83/a0;", "stop", "(Landroid/content/Context;Ljava/util/UUID;)V", "TAG", "Ljava/lang/String;", "DATA_MESSAGE_ID", "DATA_CHANNEL_TYPE", "DATA_CHANNEL_ID", "ERROR_KEY", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {

        @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[UploadAttachmentsNetworkType.values().length];
                try {
                    iArr[UploadAttachmentsNetworkType.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UploadAttachmentsNetworkType.UNMETERED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UploadAttachmentsNetworkType.NOT_ROAMING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[UploadAttachmentsNetworkType.METERED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        private final EnumC18390x toNetworkType(UploadAttachmentsNetworkType uploadAttachmentsNetworkType) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[uploadAttachmentsNetworkType.ordinal()];
            if (i13 == 1) {
                return EnumC18390x.f71561x;
            }
            if (i13 == 2) {
                return EnumC18390x.f71562y;
            }
            if (i13 == 3) {
                return EnumC18390x.f71563z;
            }
            if (i13 == 4) {
                return EnumC18390x.f71557E;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final UUID start(Context context, String channelType, String channelId, String messageId, UploadAttachmentsNetworkType networkType) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(channelType, "channelType");
            AbstractC22676k.m65750j(channelId, "channelId");
            AbstractC22676k.m65750j(messageId, "messageId");
            AbstractC22676k.m65750j(networkType, "networkType");
            C18392z c18392z = new C18392z(UploadAttachmentsAndroidWorker.class);
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C18392z c18392z2 = (C18392z) c18392z.m52880f(new C18354e(new C31222e(null), toNetworkType(networkType), false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet)));
            C23465k[] c23465kArr = {new C23465k(UploadAttachmentsAndroidWorker.DATA_CHANNEL_ID, channelId), new C23465k(UploadAttachmentsAndroidWorker.DATA_CHANNEL_TYPE, channelType), new C23465k(UploadAttachmentsAndroidWorker.DATA_MESSAGE_ID, messageId)};
            C2178b c2178b = new C2178b(1);
            for (int i13 = 0; i13 < 3; i13++) {
                C23465k c23465k = c23465kArr[i13];
                c2178b.m6858d(c23465k.f92938x, (String) c23465k.f92937w);
            }
            C18347a0 c18347a0 = (C18347a0) ((C18392z) c18392z2.m52882h(c2178b.m6856b())).m52878b();
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            C2343i c2343i = C2343i.f9269a;
            if (C2343i.f9272d.isLoggable(enumC2341g, UploadAttachmentsAndroidWorker.TAG)) {
                C2343i.f9271c.log(enumC2341g, UploadAttachmentsAndroidWorker.TAG, "[start] #uploader; Enqueueing attachments upload work for ".concat(messageId), null);
            }
            C21596v.m60637g(context).m52876e(channelId.concat(messageId), EnumC18368l.f71504x, c18347a0);
            return c18347a0.f71547a;
        }

        public final void stop(Context context, UUID workId) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(workId, "workId");
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            C2343i c2343i = C2343i.f9269a;
            if (C2343i.f9272d.isLoggable(enumC2341g, UploadAttachmentsAndroidWorker.TAG)) {
                C2343i.f9271c.log(enumC2341g, UploadAttachmentsAndroidWorker.TAG, "[stop] #uploader; upload attachments work cancelled", null);
            }
            C21596v.m60637g(context).m60638f(workId);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.attachment.worker.UploadAttachmentsAndroidWorker$doWork$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.attachment.worker.UploadAttachmentsAndroidWorker", m100430f = "UploadAttachmentsAndroidWorker.kt", m100431l = {55}, m100432m = "doWork")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C190621 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C190621(InterfaceC30057d<? super C190621> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UploadAttachmentsAndroidWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadAttachmentsAndroidWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(workerParams, "workerParams");
    }

    private static final C2345k doWork$lambda$0(InterfaceC23462h interfaceC23462h) {
        return (C2345k) interfaceC23462h.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object doWork(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C190621 c190621;
        InterfaceC23462h interfaceC23462h;
        if (interfaceC30057d instanceof C190621) {
            c190621 = (C190621) interfaceC30057d;
            int i13 = c190621.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c190621.label = i13 - Integer.MIN_VALUE;
            } else {
                c190621 = new C190621(interfaceC30057d);
            }
        } else {
            c190621 = new C190621(interfaceC30057d);
        }
        Object objUploadAttachmentsForMessage = c190621.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c190621.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objUploadAttachmentsForMessage);
            String strM52860c = getInputData().m52860c(DATA_CHANNEL_TYPE);
            AbstractC22676k.m65747g(strM52860c);
            String strM52860c2 = getInputData().m52860c(DATA_CHANNEL_ID);
            AbstractC22676k.m65747g(strM52860c2);
            String strM52860c3 = getInputData().m52860c(DATA_MESSAGE_ID);
            AbstractC22676k.m65747g(strM52860c3);
            C23470p c23470pM5382S = AbstractC1772c1.m5382S(this, TAG);
            ChatClient chatClientInstance = ChatClient.INSTANCE.instance();
            RepositoryFacade repositoryFacade = chatClientInstance.getRepositoryFacade();
            ChannelStateLogicProvider logicRegistry = chatClientInstance.getLogicRegistry();
            UploadAttachmentsWorker uploadAttachmentsWorker = new UploadAttachmentsWorker(strM52860c, strM52860c2, logicRegistry != null ? logicRegistry.channelStateLogic(strM52860c, strM52860c2) : null, repositoryFacade, chatClientInstance, null, 32, null);
            c190621.L$0 = null;
            c190621.L$1 = null;
            c190621.L$2 = null;
            c190621.L$3 = c23470pM5382S;
            c190621.L$4 = null;
            c190621.L$5 = null;
            c190621.label = 1;
            objUploadAttachmentsForMessage = uploadAttachmentsWorker.uploadAttachmentsForMessage(strM52860c3, c190621);
            if (objUploadAttachmentsForMessage == enumC31071a) {
                return enumC31071a;
            }
            interfaceC23462h = c23470pM5382S;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC23462h = (InterfaceC23462h) c190621.L$3;
            AbstractC34132o.m107864I(objUploadAttachmentsForMessage);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objUploadAttachmentsForMessage;
        if (abstractC26205h instanceof C26204g) {
            C2345k c2345k = (C2345k) interfaceC23462h.getValue();
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "[doWork] #uploader; attachments uploaded successfully", null);
            }
            return AbstractC18386u.m52885b();
        }
        if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        C2345k c2345k2 = (C2345k) interfaceC23462h.getValue();
        InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
        String str2 = c2345k2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345k2.f9274b.log(enumC2341g2, str2, "[doWork] #uploader; error while uploading attachments: " + ((C26203f) abstractC26205h).f103918a, null);
        }
        C2178b c2178b = new C2178b(1);
        c2178b.m6859e(AbstractC25247g0.m73989X(new C23465k("error", ((C26203f) abstractC26205h).f103918a.mo77807a())));
        return new C18380r(c2178b.m6856b());
    }
}
