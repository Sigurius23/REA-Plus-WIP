package or2;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s40.AbstractC32145e0;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.C34117o;
import ud3.AbstractC34799a1;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: or2.a0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lor2/a0;", "", "Landroid/content/Context;", "context", "Ltr2/o;", "taggedLogger", "<init>", "(Landroid/content/Context;Ltr2/o;)V", "Ljava/io/File;", "directory", "", "f", "(Ljava/io/File;)Z", "Ll83/a0;", "d", "()V", "file", "e", "(Ljava/io/File;)V", "", "fileName", "", "bytes", "g", "(Ljava/lang/String;[B)Ljava/io/File;", "Lud3/a1;", "responseBody", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lud3/a1;)Ljava/io/File;", "Landroid/net/Uri;", "uri", "c", "(Landroid/net/Uri;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Ltr2/o;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28144a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34117o taggedLogger;

    /* JADX INFO: renamed from: or2.a0$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.FileManager$copyUriToTempFile$2", m100430f = "FileManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ljava/io/File;", "<anonymous>", "(Lbc3/c0;)Ljava/io/File;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113810w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Uri f113812y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f113813z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113812y = uri;
            this.f113813z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28144a0.this.new a(this.f113812y, this.f113813z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super File> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f113810w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                InputStream inputStreamOpenInputStream = C28144a0.this.context.getContentResolver().openInputStream(this.f113812y);
                File file = new File(C28144a0.this.context.getCacheDir(), "temp_uploads");
                file.mkdirs();
                File file2 = new File(file, this.f113813z);
                if (inputStreamOpenInputStream != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            long jM100096c = AbstractC32145e0.m100096c(inputStreamOpenInputStream, fileOutputStream);
                            fileOutputStream.close();
                            new Long(jM100096c);
                            inputStreamOpenInputStream.close();
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
                            AbstractC35854l.m113829i(inputStreamOpenInputStream, th5);
                            throw th6;
                        }
                    }
                }
                C28144a0.this.taggedLogger.mo85216g("Successfully copied URI to temp file: " + file2.getAbsolutePath(), new AbstractC30556a.a[0]);
                return file2;
            } catch (Exception e5) {
                C28144a0.this.taggedLogger.mo85230v("Failed to copy URI to temp file", e5, new AbstractC30556a.a[0]);
                return null;
            }
        }
    }

    public C28144a0(Context context, C34117o taggedLogger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(taggedLogger, "taggedLogger");
        this.context = context;
        this.taggedLogger = taggedLogger;
    }

    /* JADX INFO: renamed from: f */
    private final boolean m85159f(File directory) {
        if (directory == null || !directory.isDirectory()) {
            if (directory == null || !directory.isFile()) {
                return false;
            }
            return directory.delete();
        }
        for (String str : directory.list()) {
            if (!m85159f(new File(directory, str))) {
                return false;
            }
        }
        return directory.delete();
    }

    /* JADX INFO: renamed from: c */
    public final Object m85160c(Uri uri, String str, InterfaceC30057d<? super File> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new a(uri, str, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: d */
    public final void m85161d() {
        try {
            m85159f(this.context.getExternalCacheDir());
        } catch (Exception e5) {
            this.taggedLogger.mo85230v("Error deleting cache", e5, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m85162e(File file) {
        if (file != null && file.isFile() && file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: g */
    public final File m85163g(String fileName, byte[] bytes) throws IOException {
        AbstractC22676k.m65750j(fileName, "fileName");
        AbstractC22676k.m65750j(bytes, "bytes");
        File file = new File(this.context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS) + File.separator + fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return file;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(fileOutputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final File m85164h(String fileName, AbstractC34799a1 responseBody) throws Throwable {
        FileOutputStream fileOutputStream;
        AbstractC22676k.m65750j(fileName, "fileName");
        AbstractC22676k.m65750j(responseBody, "responseBody");
        BufferedInputStream bufferedInputStream = null;
        try {
            File file = new File(this.context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS) + File.separator + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] bArr = new byte[4096];
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(responseBody.m109858b(), DfuBaseService.ERROR_REMOTE_MASK);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    for (int i13 = bufferedInputStream2.read(bArr); i13 != -1; i13 = bufferedInputStream2.read(bArr)) {
                        fileOutputStream.write(bArr, 0, i13);
                    }
                    fileOutputStream.flush();
                    bufferedInputStream2.close();
                    fileOutputStream.close();
                    responseBody.close();
                    return file;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    responseBody.close();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }
}
