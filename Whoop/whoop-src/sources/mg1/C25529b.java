package mg1;

import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.connectivityCore.firmware.models.WhoopDeviceName;
import com.whoop.data.repositories.FeatureFlagChecker;
import io.getstream.chat.android.client.internal.file.C19099c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import l83.C23454a0;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import x83.AbstractC38093j;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: mg1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u0010J\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0007¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lmg1/b;", "", "Lbc3/z;", "dispatcher", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "Ljava/io/File;", "filesDir", "<init>", "(Lbc3/z;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Ljava/io/File;)V", "", "path", "", "e", "(Ljava/lang/String;)Z", "serial", "", "zippedBytes", "k", "(Ljava/lang/String;[BLq83/d;)Ljava/lang/Object;", "Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;", "deviceName", "firmwareVersion", "g", "(Ljava/lang/String;Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;)Ljava/io/File;", "fileNamePrefix", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "f", "zippedFile", "m", "(Ljava/io/File;[B)Z", "inputPath", "outputPath", "l", "(Ljava/lang/String;Ljava/lang/String;)Z", "a", "Lbc3/z;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Ltr2/n;", "d", "Ljava/io/File;", "firmwareDir", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25529b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC3076z dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final File firmwareDir;

    /* JADX INFO: renamed from: mg1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.data.helper.FirmwareFilesHelper$saveFirmwareBinaries$2", m100430f = "FirmwareFilesHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99946w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f99948y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ byte[] f99949z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, byte[] bArr, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f99948y = str;
            this.f99949z = bArr;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25529b.this.new a(this.f99948y, this.f99949z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f99946w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            File file = new File(C25529b.this.firmwareDir, this.f99948y);
            C25529b c25529b = C25529b.this;
            String path = file.getPath();
            AbstractC22676k.m65749i(path, "getPath(...)");
            boolean zM75083e = c25529b.m75083e(path);
            boolean zM75090l = false;
            if (zM75083e) {
                File file2 = new File(file, "firmwares.zip");
                if (C25529b.this.m75091m(file2, this.f99949z)) {
                    C25529b c25529b2 = C25529b.this;
                    String path2 = file2.getPath();
                    AbstractC22676k.m65749i(path2, "getPath(...)");
                    String path3 = file.getPath();
                    AbstractC22676k.m65749i(path3, "getPath(...)");
                    zM75090l = c25529b2.m75090l(path2, path3);
                }
            }
            return Boolean.valueOf(zM75090l);
        }
    }

    public C25529b(AbstractC3076z dispatcher, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger, File filesDir) {
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(filesDir, "filesDir");
        this.dispatcher = dispatcher;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
        this.firmwareDir = new File(filesDir, "whoop_firmware");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final boolean m75083e(String path) {
        File file = new File(path);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final boolean m75084h(String str, File file) {
        AbstractC22676k.m65747g(file);
        return AbstractC39414r.m125876U(AbstractC38093j.m122040n(file), str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final boolean m75085j(String str, String str2, File file) {
        AbstractC22676k.m65747g(file);
        return AbstractC39421y.m125930O(AbstractC38093j.m122040n(file), str + "-" + str2, true);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m75086f(String serial) {
        AbstractC22676k.m65750j(serial, "serial");
        return AbstractC38093j.m122038l(new File(this.firmwareDir, serial));
    }

    /* JADX INFO: renamed from: g */
    public final File m75087g(String serial, WhoopDeviceName deviceName, String firmwareVersion) {
        AbstractC22676k.m65750j(serial, "serial");
        AbstractC22676k.m65750j(deviceName, "deviceName");
        AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
        File[] fileArrListFiles = new File(this.firmwareDir, serial).listFiles(new C19099c(firmwareVersion, 1));
        Object objM74079t0 = fileArrListFiles != null ? AbstractC25260n.m74079t0(fileArrListFiles) : null;
        if (objM74079t0 != null) {
            this.logger.mo85216g(AbstractC31061c.m95640p("Firmware file v-", firmwareVersion, " found for ", deviceName.name()), new AbstractC30556a.a[0]);
        }
        return (File) objM74079t0;
    }

    /* JADX INFO: renamed from: i */
    public final File m75088i(String serial, final String fileNamePrefix, String firmwareVersion) {
        AbstractC22676k.m65750j(serial, "serial");
        AbstractC22676k.m65750j(fileNamePrefix, "fileNamePrefix");
        AbstractC22676k.m65750j(firmwareVersion, "firmwareVersion");
        File file = new File(this.firmwareDir, serial);
        final String strM125926K = AbstractC39421y.m125926K(firmwareVersion, ".", "_", false);
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: mg1.a
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return C25529b.m75085j(fileNamePrefix, strM125926K, file2);
            }
        });
        Object objM74079t0 = fileArrListFiles != null ? AbstractC25260n.m74079t0(fileArrListFiles) : null;
        if (objM74079t0 != null) {
            this.logger.mo85216g(AbstractC31061c.m95640p("Firmware file v-", firmwareVersion, " found for ", fileNamePrefix), new AbstractC30556a.a[0]);
        }
        return (File) objM74079t0;
    }

    /* JADX INFO: renamed from: k */
    public final Object m75089k(String str, byte[] bArr, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher, new a(str, bArr, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m75090l(String inputPath, String outputPath) {
        AbstractC22676k.m65750j(inputPath, "inputPath");
        AbstractC22676k.m65750j(outputPath, "outputPath");
        this.logger.mo85228t("Unzipping the downloaded fw folder", new AbstractC30556a.a[0]);
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(inputPath));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    this.logger.mo85228t("Unzipping complete", new AbstractC30556a.a[0]);
                    return true;
                }
                if (nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    AbstractC22676k.m65749i(name, "getName(...)");
                    m75083e(name);
                } else {
                    FileOutputStream fileOutputStream = new FileOutputStream(outputPath + "/" + nextEntry.getName());
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                    while (true) {
                        int i13 = zipInputStream.read(bArr);
                        if (i13 == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, i13);
                    }
                    zipInputStream.closeEntry();
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                }
            }
        } catch (Exception e5) {
            this.logger.mo85230v("Unzipping failed", e5, new AbstractC30556a.a[0]);
            e5.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m75091m(File zippedFile, byte[] zippedBytes) throws IOException {
        AbstractC22676k.m65750j(zippedFile, "zippedFile");
        AbstractC22676k.m65750j(zippedBytes, "zippedBytes");
        this.logger.mo85228t("Zipping started", new AbstractC30556a.a[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(zippedFile);
        try {
            fileOutputStream.write(zippedBytes);
            fileOutputStream.close();
            this.logger.mo85228t("Zipping complete", new AbstractC30556a.a[0]);
            return true;
        } catch (IOException e5) {
            fileOutputStream.close();
            this.logger.mo85230v("Caught an exception while trying to save fw to zipped folder", e5, new AbstractC30556a.a[0]);
            return false;
        }
    }
}
