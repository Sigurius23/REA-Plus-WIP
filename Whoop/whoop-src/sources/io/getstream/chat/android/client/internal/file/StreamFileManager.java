package io.getstream.chat.android.client.internal.file;

import android.content.Context;
import android.os.Environment;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25269w;
import m83.C25271y;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.AbstractC32145e0;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import va3.AbstractC35854l;
import x83.AbstractC38093j;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0012J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0014J#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0086@¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b$\u0010%J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b&\u0010'J0\u0010+\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0086@¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b-\u0010\u0012J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b.\u0010\u0012J\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b/\u0010\u0012J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b0\u0010\u0012J\u001b\u00101\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b1\u0010\u0012¨\u00063"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/file/StreamFileManager;", "", "<init>", "()V", "", "prefix", "extension", "createMediaFilename", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "filename", "", "matchesMediaFilenamePattern", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "Ln23/h;", "Ljava/io/File;", "getOrCreateCacheDir", "(Landroid/content/Context;)Ln23/h;", "getStreamCacheDir", "(Landroid/content/Context;)Ljava/io/File;", "createTimestampedCacheDir", "", "listFilesInCache", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "Ll83/a0;", "clearImageCache", "clearTimestampedCacheFolders", "getImageCache", "fileName", "createFileInCache", "(Landroid/content/Context;Ljava/lang/String;)Ln23/h;", "Ljava/io/InputStream;", "source", "writeFileInCache", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Lq83/d;)Ljava/lang/Object;", "writeFileInTimestampedCache", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;)Ln23/h;", "getFileFromCache", "(Landroid/content/Context;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "ttlMs", "maxSizeBytes", "evictCacheFiles", "(Landroid/content/Context;Ljava/lang/String;JJLq83/d;)Ljava/lang/Object;", "clearCache", "clearAllCache", "createPhotoInExternalDir", "createVideoInExternalDir", "clearExternalStorage", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamFileManager {
    private static final String CACHE_DIR = "stream_cache";
    private static final Companion Companion = new Companion();
    private static final String EXTERNAL_DIR_TIMESTAMP_FORMAT = "yyyyMMdd_HHmmss";
    private static final String IMAGE_CACHE_DIR = "stream_image_cache";
    private static final String PHOTO_EXTENSION = "jpg";
    private static final String PHOTO_PREFIX = "STREAM_IMG";
    private static final String TIMESTAMPED_DIR_PREFIX = "STREAM_";
    private static final String TIMESTAMPED_DIR_TIMESTAMP_FORMAT = "HHmmssSSS";
    private static final String VIDEO_EXTENSION = "mp4";
    private static final String VIDEO_PREFIX = "STREAM_VID";

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/file/StreamFileManager$Companion;", "", "<init>", "()V", "CACHE_DIR", "", "IMAGE_CACHE_DIR", "TIMESTAMPED_DIR_TIMESTAMP_FORMAT", "TIMESTAMPED_DIR_PREFIX", "EXTERNAL_DIR_TIMESTAMP_FORMAT", "PHOTO_PREFIX", "PHOTO_EXTENSION", "VIDEO_PREFIX", "VIDEO_EXTENSION", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.file.StreamFileManager$evictCacheFiles$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.file.StreamFileManager$evictCacheFiles$2", m100430f = "StreamFileManager.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190932 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Context $context;
        final /* synthetic */ long $maxSizeBytes;
        final /* synthetic */ String $prefix;
        final /* synthetic */ long $ttlMs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190932(Context context, String str, long j7, long j13, InterfaceC30057d<? super C190932> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$context = context;
            this.$prefix = str;
            this.$maxSizeBytes = j7;
            this.$ttlMs = j13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamFileManager.this.new C190932(this.$context, this.$prefix, this.$maxSizeBytes, this.$ttlMs, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C190932 c190932 = (C190932) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c190932.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(StreamFileManager.this.listFilesInCache(this.$context, this.$prefix));
            long j7 = this.$ttlMs;
            ArrayList<File> arrayList = new ArrayList();
            for (Object obj2 : arrayListM74097F1) {
                if (jCurrentTimeMillis - ((File) obj2).lastModified() >= j7) {
                    arrayList.add(obj2);
                }
            }
            for (File file : arrayList) {
                if (file.delete()) {
                    arrayListM74097F1.remove(file);
                }
            }
            if (arrayListM74097F1.size() > 1) {
                AbstractC25269w.m74166l0(arrayListM74097F1, new C19094xf9a3cc34());
            }
            Iterator it = arrayListM74097F1.iterator();
            long length = 0;
            while (it.hasNext()) {
                length += ((File) it.next()).length();
            }
            Iterator it3 = arrayListM74097F1.iterator();
            while (length > this.$maxSizeBytes && it3.hasNext()) {
                File file2 = (File) it3.next();
                long length2 = file2.length();
                if (file2.delete()) {
                    length -= length2;
                    it3.remove();
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.file.StreamFileManager$getFileFromCache$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.file.StreamFileManager$getFileFromCache$2", m100430f = "StreamFileManager.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ljava/io/File;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190952 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fileName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190952(Context context, String str, InterfaceC30057d<? super C190952> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$context = context;
            this.$fileName = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamFileManager.this.new C190952(this.$context, this.$fileName, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190952) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                AbstractC26205h orCreateCacheDir = StreamFileManager.this.getOrCreateCacheDir(this.$context);
                String str = this.$fileName;
                if (orCreateCacheDir instanceof C26204g) {
                    File file = new File((File) ((C26204g) orCreateCacheDir).f103919a, str);
                    return file.exists() ? new C26204g(file) : new C26203f(new C26198a("File not found in cache."));
                }
                if (orCreateCacheDir instanceof C26203f) {
                    return orCreateCacheDir;
                }
                throw new NoWhenBranchMatchedException();
            } catch (Exception e5) {
                return new C26203f(new C26201d("Failed to get file from cache.", e5));
            }
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.file.StreamFileManager$writeFileInCache$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.file.StreamFileManager$writeFileInCache$2", m100430f = "StreamFileManager.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ljava/io/File;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190962 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fileName;
        final /* synthetic */ InputStream $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190962(Context context, String str, InputStream inputStream, InterfaceC30057d<? super C190962> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$context = context;
            this.$fileName = str;
            this.$source = inputStream;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamFileManager.this.new C190962(this.$context, this.$fileName, this.$source, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C190962) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                AbstractC26205h orCreateCacheDir = StreamFileManager.this.getOrCreateCacheDir(this.$context);
                String str = this.$fileName;
                InputStream inputStream = this.$source;
                if (!(orCreateCacheDir instanceof C26204g)) {
                    if (orCreateCacheDir instanceof C26203f) {
                        return orCreateCacheDir;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                File file = new File((File) ((C26204g) orCreateCacheDir).f103919a, str);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        AbstractC32145e0.m100096c(inputStream, fileOutputStream);
                        fileOutputStream.close();
                        inputStream.close();
                        return new C26204g(file);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC35854l.m113829i(fileOutputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC35854l.m113829i(inputStream, th5);
                        throw th6;
                    }
                }
            } catch (Exception e5) {
                return new C26203f(new C26201d("Failed to write file to cache.", e5));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearExternalStorage$lambda$10(StreamFileManager streamFileManager, File file) {
        if (!file.isFile()) {
            return false;
        }
        String name = file.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        return streamFileManager.matchesMediaFilenamePattern(name, PHOTO_PREFIX, PHOTO_EXTENSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearExternalStorage$lambda$12(StreamFileManager streamFileManager, File file) {
        if (!file.isFile()) {
            return false;
        }
        String name = file.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        return streamFileManager.matchesMediaFilenamePattern(name, VIDEO_PREFIX, "mp4");
    }

    private final AbstractC26205h clearImageCache(Context context) {
        try {
            File imageCache = getImageCache(context);
            boolean zExists = imageCache.exists();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (zExists && !AbstractC38093j.m122038l(imageCache)) {
                return new C26203f(new C26198a("Could not clear image cache directory."));
            }
            return new C26204g(c23454a0);
        } catch (Exception e5) {
            return new C26203f(new C26201d("Could not clear image cache directory.", e5));
        }
    }

    private final AbstractC26205h clearTimestampedCacheFolders(Context context) {
        try {
            File[] fileArrListFiles = context.getCacheDir().listFiles(new FileFilter() { // from class: io.getstream.chat.android.client.internal.file.a
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return StreamFileManager.clearTimestampedCacheFolders$lambda$15(file);
                }
            });
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            for (File file : fileArrListFiles) {
                if (file.exists() && !AbstractC38093j.m122038l(file)) {
                    return new C26203f(new C26198a("Could not clear all timestamped cache folders."));
                }
            }
            return new C26204g(C23454a0.f92919a);
        } catch (Exception e5) {
            return new C26203f(new C26201d("Could not clear timestamped cache folders.", e5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearTimestampedCacheFolders$lambda$15(File file) {
        if (file.isDirectory()) {
            String name = file.getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            if (AbstractC39421y.m125930O(name, "STREAM_", false)) {
                return true;
            }
        }
        return false;
    }

    private final String createMediaFilename(String prefix, String extension) {
        return prefix + "_" + new SimpleDateFormat(EXTERNAL_DIR_TIMESTAMP_FORMAT, Locale.US).format(Long.valueOf(new Date().getTime())) + "." + extension;
    }

    private final AbstractC26205h createTimestampedCacheDir(Context context) {
        try {
            File file = new File(context.getCacheDir(), "STREAM_" + new SimpleDateFormat("HHmmssSSS", Locale.US).format(Long.valueOf(new Date().getTime())));
            file.mkdirs();
            return new C26204g(file);
        } catch (Exception e5) {
            return new C26203f(new C26201d("Could not get or create cache directory.", e5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC26205h getOrCreateCacheDir(Context context) {
        try {
            File streamCacheDir = getStreamCacheDir(context);
            streamCacheDir.mkdirs();
            return new C26204g(streamCacheDir);
        } catch (Exception e5) {
            return new C26203f(new C26201d("Could not get or create cache directory.", e5));
        }
    }

    private final File getStreamCacheDir(Context context) {
        return new File(context.getCacheDir(), CACHE_DIR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<File> listFilesInCache(Context context, String prefix) {
        File[] fileArrListFiles = getStreamCacheDir(context).listFiles(new C19099c(prefix, 0));
        return fileArrListFiles != null ? AbstractC25260n.m74049W0(fileArrListFiles) : C25271y.f99162w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listFilesInCache$lambda$14(String str, File file) {
        if (file.isFile()) {
            String name = file.getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            if (AbstractC39421y.m125930O(name, str, false)) {
                return true;
            }
        }
        return false;
    }

    private final boolean matchesMediaFilenamePattern(String filename, String prefix, String extension) {
        AbstractC22676k.m65750j(prefix, "literal");
        String strQuote = Pattern.quote(prefix);
        AbstractC22676k.m65749i(strQuote, "quote(...)");
        AbstractC22676k.m65750j(extension, "literal");
        String strQuote2 = Pattern.quote(extension);
        AbstractC22676k.m65749i(strQuote2, "quote(...)");
        String pattern = AbstractC2875y.m8300m("^", strQuote, "_\\d{8}_\\d{6}\\.", strQuote2, "$");
        AbstractC22676k.m65750j(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        AbstractC22676k.m65750j(filename, "input");
        return patternCompile.matcher(filename).matches();
    }

    public final AbstractC26205h clearAllCache(Context context) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC26205h abstractC26205hClearCache = clearCache(context);
        AbstractC26205h abstractC26205hClearImageCache = clearImageCache(context);
        AbstractC26205h abstractC26205hClearTimestampedCacheFolders = clearTimestampedCacheFolders(context);
        if (abstractC26205hClearCache instanceof C26204g) {
            abstractC26205hClearCache = abstractC26205hClearImageCache;
        } else if (!(abstractC26205hClearCache instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (abstractC26205hClearCache instanceof C26204g) {
            return abstractC26205hClearTimestampedCacheFolders;
        }
        if (abstractC26205hClearCache instanceof C26203f) {
            return abstractC26205hClearCache;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final AbstractC26205h clearCache(Context context) {
        AbstractC22676k.m65750j(context, "context");
        try {
            File streamCacheDir = getStreamCacheDir(context);
            boolean zExists = streamCacheDir.exists();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (zExists && !AbstractC38093j.m122038l(streamCacheDir)) {
                return new C26203f(new C26198a("Could not clear Stream cache directory."));
            }
            return new C26204g(c23454a0);
        } catch (Exception e5) {
            return new C26203f(new C26201d("Could not clear Stream cache directory.", e5));
        }
    }

    public final AbstractC26205h clearExternalStorage(Context context) {
        AbstractC22676k.m65750j(context, "context");
        try {
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            File externalFilesDir2 = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
            boolean z4 = true;
            if (externalFilesDir != null) {
                final int i13 = 0;
                File[] fileArrListFiles = externalFilesDir.listFiles(new FileFilter(this) { // from class: io.getstream.chat.android.client.internal.file.b

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ StreamFileManager f73807b;

                    {
                        this.f73807b = this;
                    }

                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        switch (i13) {
                            case 0:
                                return StreamFileManager.clearExternalStorage$lambda$10(this.f73807b, file);
                            default:
                                return StreamFileManager.clearExternalStorage$lambda$12(this.f73807b, file);
                        }
                    }
                });
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.delete()) {
                            z4 = false;
                        }
                    }
                }
            }
            if (externalFilesDir2 != null) {
                final int i14 = 1;
                File[] fileArrListFiles2 = externalFilesDir2.listFiles(new FileFilter(this) { // from class: io.getstream.chat.android.client.internal.file.b

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ StreamFileManager f73807b;

                    {
                        this.f73807b = this;
                    }

                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        switch (i14) {
                            case 0:
                                return StreamFileManager.clearExternalStorage$lambda$10(this.f73807b, file2);
                            default:
                                return StreamFileManager.clearExternalStorage$lambda$12(this.f73807b, file2);
                        }
                    }
                });
                if (fileArrListFiles2 != null) {
                    for (File file2 : fileArrListFiles2) {
                        if (!file2.delete()) {
                            z4 = false;
                        }
                    }
                }
            }
            return z4 ? new C26204g(C23454a0.f92919a) : new C26203f(new C26198a("Could not delete all external storage files."));
        } catch (Exception e5) {
            return new C26203f(new C26201d("Could not clear external storage.", e5));
        }
    }

    public final AbstractC26205h createFileInCache(Context context, String fileName) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(fileName, "fileName");
        AbstractC26205h orCreateCacheDir = getOrCreateCacheDir(context);
        if (orCreateCacheDir instanceof C26204g) {
            return new C26204g(new File((File) ((C26204g) orCreateCacheDir).m77814e(), fileName));
        }
        if (orCreateCacheDir instanceof C26203f) {
            return orCreateCacheDir;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final AbstractC26205h createPhotoInExternalDir(Context context) {
        AbstractC22676k.m65750j(context, "context");
        try {
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            AbstractC26205h c26204g = externalFilesDir != null ? new C26204g(externalFilesDir) : getOrCreateCacheDir(context);
            if (c26204g instanceof C26204g) {
                return new C26204g(new File((File) ((C26204g) c26204g).m77814e(), createMediaFilename(PHOTO_PREFIX, PHOTO_EXTENSION)));
            }
            if (c26204g instanceof C26203f) {
                return c26204g;
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e5) {
            return new C26203f(new C26201d("Could not create photo file.", e5));
        }
    }

    public final AbstractC26205h createVideoInExternalDir(Context context) {
        AbstractC22676k.m65750j(context, "context");
        try {
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES);
            AbstractC26205h c26204g = externalFilesDir != null ? new C26204g(externalFilesDir) : getOrCreateCacheDir(context);
            if (c26204g instanceof C26204g) {
                return new C26204g(new File((File) ((C26204g) c26204g).m77814e(), createMediaFilename(VIDEO_PREFIX, "mp4")));
            }
            if (c26204g instanceof C26203f) {
                return c26204g;
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e5) {
            return new C26203f(new C26201d("Could not create video file.", e5));
        }
    }

    public final Object evictCacheFiles(Context context, String str, long j7, long j13, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getIO(), new C190932(context, str, j13, j7, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    public final Object getFileFromCache(Context context, String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getIO(), new C190952(context, str, null), interfaceC30057d);
    }

    public final File getImageCache(Context context) {
        AbstractC22676k.m65750j(context, "context");
        File cacheDir = context.getCacheDir();
        AbstractC22676k.m65749i(cacheDir, "getCacheDir(...)");
        return AbstractC38093j.m122041o(cacheDir, IMAGE_CACHE_DIR);
    }

    public final Object writeFileInCache(Context context, String str, InputStream inputStream, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getIO(), new C190962(context, str, inputStream, null), interfaceC30057d);
    }

    public final AbstractC26205h writeFileInTimestampedCache(Context context, String fileName, InputStream source) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(fileName, "fileName");
        AbstractC22676k.m65750j(source, "source");
        try {
            AbstractC26205h abstractC26205hCreateTimestampedCacheDir = createTimestampedCacheDir(context);
            if (!(abstractC26205hCreateTimestampedCacheDir instanceof C26204g)) {
                if (abstractC26205hCreateTimestampedCacheDir instanceof C26203f) {
                    return abstractC26205hCreateTimestampedCacheDir;
                }
                throw new NoWhenBranchMatchedException();
            }
            File file = new File((File) ((C26204g) abstractC26205hCreateTimestampedCacheDir).m77814e(), fileName);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    AbstractC32145e0.m100096c(source, fileOutputStream);
                    fileOutputStream.close();
                    source.close();
                    return new C26204g(file);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(fileOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    AbstractC35854l.m113829i(source, th5);
                    throw th6;
                }
            }
        } catch (Exception e5) {
            return new C26203f(new C26201d("Failed to write file to timestamped cache.", e5));
        }
    }
}
