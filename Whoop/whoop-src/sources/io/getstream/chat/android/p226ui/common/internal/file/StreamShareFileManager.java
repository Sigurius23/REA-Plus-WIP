package io.getstream.chat.android.p226ui.common.internal.file;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.internal.file.StreamFileManager;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Attachment;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b \u0010!JT\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001c\b\u0002\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0086@¢\u0006\u0004\b(\u0010)J&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b*\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/ui/common/internal/file/StreamShareFileManager;", "", "Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "fileManager", "Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;", "uriProvider", "Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;", "config", "<init>", "(Lio/getstream/chat/android/client/internal/file/StreamFileManager;Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;)V", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/models/Attachment;", "attachment", "Ln23/h;", "Ljava/io/File;", "getCachedFileForAttachment", "(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lq83/d;)Ljava/lang/Object;", "file", "", "expectedSize", "", "isCachedFileValid", "(Ljava/io/File;J)Z", "", "getCacheFileName", "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;", "Landroid/net/Uri;", "getUriForFile", "(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "bitmap", "writeBitmapToShareableFile", "(Landroid/content/Context;Landroid/graphics/Bitmap;Lq83/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Ll83/a0;", "onProgress", "Lkotlin/Function0;", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "writeAttachmentToShareableFile", "(Landroid/content/Context;Lio/getstream/chat/android/models/Attachment;Lc93/m;Lc93/a;Lq83/d;)Ljava/lang/Object;", "getShareableUriForAttachment", "Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;", "Lio/getstream/chat/android/ui/common/internal/file/ShareCacheConfig;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamShareFileManager {
    public static final int $stable = 8;
    private final ShareCacheConfig config;
    private final StreamFileManager fileManager;
    private final ShareableUriProvider uriProvider;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager$getCachedFileForAttachment$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager", m100430f = "StreamShareFileManager.kt", m100431l = {133}, m100432m = "getCachedFileForAttachment")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C196081 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C196081(InterfaceC30057d<? super C196081> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StreamShareFileManager.this.getCachedFileForAttachment(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager$getShareableUriForAttachment$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager$getShareableUriForAttachment$2", m100430f = "StreamShareFileManager.kt", m100431l = {126}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Landroid/net/Uri;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196092 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Attachment $attachment;
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196092(Context context, Attachment attachment, InterfaceC30057d<? super C196092> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$context = context;
            this.$attachment = attachment;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamShareFileManager.this.new C196092(this.$context, this.$attachment, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C196092) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StreamShareFileManager streamShareFileManager = StreamShareFileManager.this;
                Context context = this.$context;
                Attachment attachment = this.$attachment;
                this.label = 1;
                obj = streamShareFileManager.getCachedFileForAttachment(context, attachment, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            StreamShareFileManager streamShareFileManager2 = StreamShareFileManager.this;
            Context context2 = this.$context;
            if (abstractC26205h instanceof C26204g) {
                return new C26204g(StreamShareFileManager.access$getUriForFile(streamShareFileManager2, context2, (File) ((C26204g) abstractC26205h).f103919a));
            }
            if (abstractC26205h instanceof C26203f) {
                return abstractC26205h;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager$writeAttachmentToShareableFile$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager$writeAttachmentToShareableFile$3", m100430f = "StreamShareFileManager.kt", m100431l = {91, 95, 101, 109}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Landroid/net/Uri;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196103 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Attachment $attachment;
        final /* synthetic */ InterfaceC4339a $chatClient;
        final /* synthetic */ Context $context;
        final /* synthetic */ InterfaceC4351m $onProgress;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196103(Context context, Attachment attachment, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super C196103> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$context = context;
            this.$attachment = attachment;
            this.$chatClient = interfaceC4339a;
            this.$onProgress = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamShareFileManager.this.new C196103(this.$context, this.$attachment, this.$chatClient, this.$onProgress, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C196103) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00ee A[PHI: r0
          0x00ee: PHI (r0v20 java.lang.Object) = (r0v16 java.lang.Object), (r0v44 java.lang.Object) binds: [B:31:0x00eb, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:37:0x0108  */
        /* JADX WARN: Code duplicated, block: B:38:0x0117  */
        /* JADX WARN: Code duplicated, block: B:43:0x013c  */
        /* JADX WARN: Code duplicated, block: B:47:0x0148  */
        /* JADX WARN: Code duplicated, block: B:49:0x0158  */
        /* JADX WARN: Code duplicated, block: B:51:0x015c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:52:0x015d  */
        /* JADX WARN: Code duplicated, block: B:54:0x0163  */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0136, code lost:
        
            if (r0 == r8) goto L41;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.common.internal.file.StreamShareFileManager.C196103.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager$writeBitmapToShareableFile$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.internal.file.StreamShareFileManager$writeBitmapToShareableFile$2", m100430f = "StreamShareFileManager.kt", m100431l = {67}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Landroid/net/Uri;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196112 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ Context $context;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ StreamShareFileManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196112(Bitmap bitmap, StreamShareFileManager streamShareFileManager, Context context, InterfaceC30057d<? super C196112> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$bitmap = bitmap;
            this.this$0 = streamShareFileManager;
            this.$context = context;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C196112(this.$bitmap, this.this$0, this.$context, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C196112) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    this.$bitmap.compress(Bitmap.CompressFormat.PNG, this.this$0.config.getBitmapQuality(), byteArrayOutputStream);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    StreamFileManager streamFileManager = this.this$0.fileManager;
                    Context context = this.$context;
                    String bitmapShareFilename = this.this$0.config.getBitmapShareFilename();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 1;
                    obj = streamFileManager.writeFileInCache(context, bitmapShareFilename, byteArrayInputStream, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
                StreamShareFileManager streamShareFileManager = this.this$0;
                Context context2 = this.$context;
                if (abstractC26205h instanceof C26204g) {
                    return new C26204g(StreamShareFileManager.access$getUriForFile(streamShareFileManager, context2, (File) ((C26204g) abstractC26205h).f103919a));
                }
                if (abstractC26205h instanceof C26203f) {
                    return abstractC26205h;
                }
                throw new NoWhenBranchMatchedException();
            } catch (Exception e5) {
                return new C26203f(new C26201d("Could not write bitmap.", e5));
            }
        }
    }

    public StreamShareFileManager() {
        this(null, null, null, 7, null);
    }

    public static final Uri access$getUriForFile(StreamShareFileManager streamShareFileManager, Context context, File file) {
        return streamShareFileManager.uriProvider.getUriForFile(context, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCacheFileName(Attachment attachment) {
        String assetUrl = attachment.getAssetUrl();
        if (assetUrl == null) {
            assetUrl = attachment.getImageUrl();
        }
        int iHashCode = assetUrl != null ? assetUrl.hashCode() : 0;
        return this.config.getCacheFilePrefix() + iHashCode + attachment.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getCachedFileForAttachment(Context context, Attachment attachment, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C196081 c196081;
        if (interfaceC30057d instanceof C196081) {
            c196081 = (C196081) interfaceC30057d;
            int i13 = c196081.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c196081.label = i13 - Integer.MIN_VALUE;
            } else {
                c196081 = new C196081(interfaceC30057d);
            }
        } else {
            c196081 = new C196081(interfaceC30057d);
        }
        Object fileFromCache = c196081.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c196081.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(fileFromCache);
            String cacheFileName = getCacheFileName(attachment);
            StreamFileManager streamFileManager = this.fileManager;
            c196081.L$0 = null;
            c196081.L$1 = attachment;
            c196081.L$2 = null;
            c196081.label = 1;
            fileFromCache = streamFileManager.getFileFromCache(context, cacheFileName, c196081);
            if (fileFromCache == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attachment = (Attachment) c196081.L$1;
            AbstractC34132o.m107864I(fileFromCache);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) fileFromCache;
        if (abstractC26205h instanceof C26204g) {
            File file = (File) ((C26204g) abstractC26205h).f103919a;
            return isCachedFileValid(file, (long) attachment.getFileSize()) ? new C26204g(file) : new C26203f(new C26198a("Cached file is invalid, incomplete, or expired."));
        }
        if (abstractC26205h instanceof C26203f) {
            return abstractC26205h;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Uri getUriForFile(Context context, File file) {
        return this.uriProvider.getUriForFile(context, file);
    }

    private final boolean isCachedFileValid(File file, long expectedSize) {
        return file.exists() && file.length() == expectedSize && System.currentTimeMillis() - file.lastModified() < this.config.getCacheTtlMs();
    }

    public static /* synthetic */ Object writeAttachmentToShareableFile$default(StreamShareFileManager streamShareFileManager, Context context, Attachment attachment, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            interfaceC4351m = null;
        }
        InterfaceC4351m interfaceC4351m2 = interfaceC4351m;
        if ((i13 & 8) != 0) {
            interfaceC4339a = new C19383k(20);
        }
        return streamShareFileManager.writeAttachmentToShareableFile(context, attachment, interfaceC4351m2, interfaceC4339a, interfaceC30057d);
    }

    public final Object getShareableUriForAttachment(Context context, Attachment attachment, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getIO(), new C196092(context, attachment, null), interfaceC30057d);
    }

    public final Object writeAttachmentToShareableFile(Context context, Attachment attachment, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getIO(), new C196103(context, attachment, interfaceC4339a, interfaceC4351m, null), interfaceC30057d);
    }

    public final Object writeBitmapToShareableFile(Context context, Bitmap bitmap, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getIO(), new C196112(bitmap, this, context, null), interfaceC30057d);
    }

    public StreamShareFileManager(StreamFileManager fileManager, ShareableUriProvider uriProvider, ShareCacheConfig config) {
        AbstractC22676k.m65750j(fileManager, "fileManager");
        AbstractC22676k.m65750j(uriProvider, "uriProvider");
        AbstractC22676k.m65750j(config, "config");
        this.fileManager = fileManager;
        this.uriProvider = uriProvider;
        this.config = config;
    }

    public StreamShareFileManager(StreamFileManager streamFileManager, ShareableUriProvider shareableUriProvider, ShareCacheConfig shareCacheConfig, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new StreamFileManager() : streamFileManager, (i13 & 2) != 0 ? new ShareableUriProvider() : shareableUriProvider, (i13 & 4) != 0 ? new ShareCacheConfig(null, null, 0, 0L, 0L, 31, null) : shareCacheConfig);
    }
}
