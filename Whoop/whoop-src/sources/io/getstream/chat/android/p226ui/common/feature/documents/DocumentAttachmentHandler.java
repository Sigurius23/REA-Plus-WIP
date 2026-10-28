package io.getstream.chat.android.p226ui.common.feature.documents;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.google.android.material.snackbar.SnackbarContentLayout;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.internal.file.StreamShareFileManager;
import io.getstream.chat.android.p226ui.common.utils.MediaStringUtil;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.InterfaceC23462h;
import mr.C25908n;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nR\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/documents/DocumentAttachmentHandler;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/models/Attachment;", "attachment", "Ll83/a0;", "openWithExternalApp", "(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;)V", "Landroid/net/Uri;", "uri", "openFileUri", "(Landroid/content/Context;Landroid/net/Uri;Lio/getstream/chat/android/models/Attachment;)V", "Landroidx/lifecycle/g0;", "findLifecycleOwner", "(Landroid/content/Context;)Landroidx/lifecycle/g0;", "Landroid/app/Activity;", "findActivity", "(Landroid/content/Context;)Landroid/app/Activity;", "openAttachment", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;", "shareFileManager", "Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;", "", "SNACKBAR_DELAY_MS", "J", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DocumentAttachmentHandler {
    public static final int $stable;
    public static final DocumentAttachmentHandler INSTANCE;
    private static final long SNACKBAR_DELAY_MS = 500;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private static final InterfaceC23462h logger;
    private static final StreamShareFileManager shareFileManager;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.documents.DocumentAttachmentHandler$openWithExternalApp$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.documents.DocumentAttachmentHandler$openWithExternalApp$1", m100430f = "DocumentAttachmentHandler.kt", m100431l = {87}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194981 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Attachment $attachment;
        final /* synthetic */ Context $context;
        final /* synthetic */ View $rootView;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194981(View view, Context context, Attachment attachment, InterfaceC30057d<? super C194981> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$rootView = view;
            this.$context = context;
            this.$attachment = attachment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 invokeSuspend$lambda$3(C22669g0 c22669g0, Context context, long j7, long j13) {
            final C25908n c25908n = (C25908n) c22669g0.f89336w;
            if (c25908n != null) {
                final String string = context.getString(C19470R.string.stream_ui_message_list_attachment_downloading, MediaStringUtil.convertFileSizeByteCount(j7), MediaStringUtil.convertFileSizeByteCount(j13));
                AbstractC22676k.m65749i(string, "getString(...)");
                c25908n.f102259i.post(new Runnable() { // from class: io.getstream.chat.android.ui.common.feature.documents.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((SnackbarContentLayout) c25908n.f102259i.getChildAt(0)).getMessageView().setText(string);
                    }
                });
            }
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C194981 c194981 = new C194981(this.$rootView, this.$context, this.$attachment, interfaceC30057d);
            c194981.L$0 = obj;
            return c194981;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194981) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3027k1 interfaceC3027k1M8732z;
            Object objWriteAttachmentToShareableFile$default;
            C22669g0 c22669g0;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                final C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
                View view = this.$rootView;
                interfaceC3027k1M8732z = view != null ? AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new DocumentAttachmentHandler$openWithExternalApp$1$snackbarJob$1$1(c22669g0M32004w, view, this.$context, this.$attachment, null), 3) : null;
                StreamShareFileManager streamShareFileManager = DocumentAttachmentHandler.shareFileManager;
                final Context context = this.$context;
                Attachment attachment = this.$attachment;
                InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: io.getstream.chat.android.ui.common.feature.documents.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        DocumentAttachmentHandler.C194981.invokeSuspend$lambda$3(c22669g0M32004w, context, ((Long) obj2).longValue(), ((Long) obj3).longValue());
                        return C23454a0.f92919a;
                    }
                };
                this.L$0 = null;
                this.L$1 = c22669g0M32004w;
                this.L$2 = interfaceC3027k1M8732z;
                this.label = 1;
                objWriteAttachmentToShareableFile$default = StreamShareFileManager.writeAttachmentToShareableFile$default(streamShareFileManager, context, attachment, interfaceC4351m, null, this, 8, null);
                if (objWriteAttachmentToShareableFile$default == enumC31071a) {
                    return enumC31071a;
                }
                c22669g0 = c22669g0M32004w;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.L$2;
                c22669g0 = (C22669g0) this.L$1;
                AbstractC34132o.m107864I(obj);
                interfaceC3027k1M8732z = interfaceC3027k1;
                objWriteAttachmentToShareableFile$default = obj;
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) objWriteAttachmentToShareableFile$default;
            Context context2 = this.$context;
            Attachment attachment2 = this.$attachment;
            boolean z4 = abstractC26205h instanceof C26204g;
            if (z4) {
                Uri uri = (Uri) ((C26204g) abstractC26205h).f103919a;
                if (interfaceC3027k1M8732z != null) {
                    interfaceC3027k1M8732z.cancel((CancellationException) null);
                }
                C25908n c25908n = (C25908n) c22669g0.f89336w;
                if (c25908n != null) {
                    c25908n.m76610a(3);
                }
                DocumentAttachmentHandler.INSTANCE.openFileUri(context2, uri, attachment2);
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context3 = this.$context;
            Attachment attachment3 = this.$attachment;
            if (!z4) {
                if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                if (interfaceC3027k1M8732z != null) {
                    interfaceC3027k1M8732z.cancel((CancellationException) null);
                }
                C25908n c25908n2 = (C25908n) c22669g0.f89336w;
                if (c25908n2 != null) {
                    c25908n2.m76610a(3);
                }
                C2345k logger = DocumentAttachmentHandler.INSTANCE.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[openWithExternalApp] Failed to download file: ", abstractC26202e.mo77807a()), null);
                }
                int i14 = C19470R.string.stream_ui_message_list_attachment_download_failed;
                String name = attachment3.getName();
                if (name == null) {
                    name = "";
                }
                String string = context3.getString(i14, name);
                AbstractC22676k.m65749i(string, "getString(...)");
                Toast.makeText(context3, string, 0).show();
            }
            return C23454a0.f92919a;
        }
    }

    static {
        DocumentAttachmentHandler documentAttachmentHandler = new DocumentAttachmentHandler();
        INSTANCE = documentAttachmentHandler;
        logger = AbstractC1772c1.m5382S(documentAttachmentHandler, "Chat:DocumentAttachmentHandler");
        shareFileManager = new StreamShareFileManager(null, null, null, 7, null);
        $stable = 8;
    }

    private DocumentAttachmentHandler() {
    }

    private final Activity findActivity(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            context = contextWrapper != null ? contextWrapper.getBaseContext() : null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    private final InterfaceC1585g0 findLifecycleOwner(Context context) {
        while (context != 0) {
            if (context instanceof InterfaceC1585g0) {
                return (InterfaceC1585g0) context;
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            context = contextWrapper != null ? contextWrapper.getBaseContext() : 0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openFileUri(Context context, Uri uri, Attachment attachment) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, attachment.getMimeType());
            intent.addFlags(1);
            context.startActivity(Intent.createChooser(intent, attachment.getName()));
        } catch (ActivityNotFoundException e5) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e = logger2.f9275c;
            String str = logger2.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger2.f9274b.log(enumC2341g, str, "[openFileUri] No app available to open file.", e5);
            }
            Toast.makeText(context, C19470R.string.stream_ui_message_list_attachment_no_app, 0).show();
        }
    }

    private final void openWithExternalApp(Context context, Attachment attachment) {
        InterfaceC1585g0 interfaceC1585g0FindLifecycleOwner = findLifecycleOwner(context);
        if (interfaceC1585g0FindLifecycleOwner != null) {
            Activity activityFindActivity = findActivity(context);
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(interfaceC1585g0FindLifecycleOwner), null, null, new C194981(activityFindActivity != null ? activityFindActivity.findViewById(R.id.content) : null, context, attachment, null), 3);
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e = logger2.f9275c;
        String str = logger2.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger2.f9274b.log(enumC2341g, str, "[openWithExternalApp] Could not find a LifecycleOwner from Context. Cannot download file.", null);
        }
    }

    public final void openAttachment(Context context, Attachment attachment) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attachment, "attachment");
        openWithExternalApp(context, attachment);
    }
}
