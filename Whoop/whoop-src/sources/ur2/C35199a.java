package ur2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.widget.Toast;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.domain.model.User;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.p069ui.InterfaceC10603n;
import ec3.InterfaceC13087t1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import jk0.InterfaceC21750d;
import js0.AbstractC21909c;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.AbstractC28184n0;
import or2.C28162g;
import p031b9.AbstractC2875y;
import p314m.DialogInterfaceC24846j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s03.C32052a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34108f;
import tr2.InterfaceC34114l;
import tr2.InterfaceC34116n;
import va3.AbstractC35854l;
import yb3.AbstractC39421y;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ur2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 )2\u00020\u0001:\u000213B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J&\u0010'\u001a\u00020&2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\"H\u0082@¢\u0006\u0004\b)\u0010*J%\u0010-\u001a\u00020,2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010+\u001a\u00020&H\u0002¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010JR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010K¨\u0006L"}, m65681d2 = {"Lur2/a;", "", "Lbc3/c0;", "coroutineScope", "Ltr2/f;", "dao", "Lq83/j;", "ioContext", "mainContext", "Ltr2/l;", "cacheProvider", "Ltr2/n;", "logger", "Ls03/a;", "logEventUploadScheduler", "Ljs0/c;", "configurationRepository", "Lz92/a;", "userInfoAccessor", "Lcom/whoop/ui/n;", "toaster", "Lur2/c;", "logFileEmailOpener", "Lzr2/a;", "clock", "Lor2/g;", "buildConfigProvider", "Lci2/b;", "strapProvider", "Lur2/b;", "errorDisplayer", "<init>", "(Lbc3/c0;Ltr2/f;Lq83/j;Lq83/j;Ltr2/l;Ltr2/n;Ls03/a;Ljs0/c;Lz92/a;Lcom/whoop/ui/n;Lur2/c;Lzr2/a;Lor2/g;Lci2/b;Lur2/b;)V", "", "", "allLogs", "Landroid/content/Context;", "context", "Ljava/io/File;", "o", "(Ljava/util/List;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;", "p", "(Lq83/d;)Ljava/lang/Object;", "file", "Ll83/a0;", "q", "(Ljava/util/List;Ljava/io/File;)V", "n", "(Landroid/content/Context;)V", "a", "Lbc3/c0;", "b", "Ltr2/f;", "c", "Lq83/j;", "d", "e", "Ltr2/l;", "f", "Ltr2/n;", "g", "Ls03/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljs0/c;", "i", "Lz92/a;", "j", "Lcom/whoop/ui/n;", "k", "Lur2/c;", "l", "Lzr2/a;", "m", "Lor2/g;", "Lci2/b;", "Lur2/b;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35199a {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34108f dao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC30063j ioContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC30063j mainContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34114l cacheProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C32052a logEventUploadScheduler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC10603n toaster;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C35201c logFileEmailOpener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC41070a clock;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC4733b strapProvider;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C35200b errorDisplayer;

    /* JADX INFO: renamed from: ur2.a$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lur2/a$a;", "", "<init>", "()V", "Ljava/io/File;", "gzFile", "inputFile", "Ltr2/n;", "logger", "Ll83/a0;", "b", "(Ljava/io/File;Ljava/io/File;Ltr2/n;)V", "", "LOG_AUTHORITY_SUFFIX", "Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final void m111537b(File gzFile, File inputFile, InterfaceC34116n logger) {
            if (gzFile.exists()) {
                gzFile.delete();
            }
            File parentFile = gzFile.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(inputFile);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(gzFile));
                    try {
                        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                        while (true) {
                            int i13 = fileInputStream.read(bArr);
                            if (i13 == -1) {
                                gZIPOutputStream.close();
                                fileInputStream.close();
                                return;
                            }
                            gZIPOutputStream.write(bArr, 0, i13);
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                AbstractC35854l.m113829i(fileInputStream, th);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            AbstractC35854l.m113829i(gZIPOutputStream, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            } catch (IOException e5) {
                logger.mo85230v("Error zipping logs", e5, new AbstractC30556a.a[0]);
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ur2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lur2/a$b;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Ljava/lang/Exception;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception cause) {
            super(cause);
            AbstractC22676k.m65750j(cause, "cause");
        }
    }

    /* JADX INFO: renamed from: ur2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.log.exporter.LocalLogExporter$emailLogData$1", m100430f = "LocalLogExporter.kt", m100431l = {67, 89, 93}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Context f149709F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f149710G;

        /* JADX INFO: renamed from: w */
        Object f149711w;

        /* JADX INFO: renamed from: x */
        Object f149712x;

        /* JADX INFO: renamed from: y */
        int f149713y;

        /* JADX INFO: renamed from: z */
        int f149714z;

        /* JADX INFO: renamed from: ur2.a$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.util.log.exporter.LocalLogExporter$emailLogData$1$1", m100430f = "LocalLogExporter.kt", m100431l = {69, 81}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C35199a f149715E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ int f149716F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ C22669g0 f149717G;

            /* JADX INFO: renamed from: H */
            final /* synthetic */ Context f149718H;

            /* JADX INFO: renamed from: w */
            Object f149719w;

            /* JADX INFO: renamed from: x */
            Object f149720x;

            /* JADX INFO: renamed from: y */
            Object f149721y;

            /* JADX INFO: renamed from: z */
            int f149722z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35199a c35199a, int i13, C22669g0 c22669g0, Context context, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f149715E = c35199a;
                this.f149716F = i13;
                this.f149717G = c22669g0;
                this.f149718H = context;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f149715E, this.f149716F, this.f149717G, this.f149718H, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.internal.g0] */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                List list;
                ?? r10;
                C22669g0 c22669g0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                ?? r14 = this.f149722z;
                File file = null;
                try {
                    try {
                        if (r14 == 0) {
                            AbstractC34132o.m107864I(obj);
                            InterfaceC34108f interfaceC34108f = this.f149715E.dao;
                            int i13 = this.f149716F;
                            this.f149722z = 1;
                            obj = interfaceC34108f.mo107810d(i13, this);
                            if (obj == enumC31071a) {
                            }
                            return enumC31071a;
                        }
                        if (r14 == 1) {
                            AbstractC34132o.m107864I(obj);
                        } else {
                            if (r14 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C22669g0 c22669g1 = (C22669g0) this.f149721y;
                            C22669g0 c22669g2 = (C22669g0) this.f149720x;
                            AbstractC34132o.m107864I(obj);
                            c22669g0 = c22669g1;
                            r14 = c22669g2;
                        }
                        file = (File) obj;
                        r10 = c22669g0;
                        r10.f89336w = file;
                        return C23454a0.f92919a;
                        list = (List) obj;
                    } catch (Exception e5) {
                        AbstractC3006f0.m8721o(getContext());
                        this.f149715E.logger.mo85230v("LocalLogExporter failed to export logs", new b(e5), new AbstractC30556a.a[0]);
                        r10 = r14;
                    }
                } catch (SQLException e13) {
                    this.f149715E.logger.mo85230v("Failed to get logs from db", e13, new AbstractC30556a.a[0]);
                    list = C25271y.f99162w;
                }
                if (list.isEmpty()) {
                    this.f149715E.logger.mo85230v("no logs for export seems suspicious", new b(new RuntimeException("no logs for export seems suspicious")), new AbstractC30556a.a[0]);
                }
                C22669g0 c22669g3 = this.f149717G;
                C35199a c35199a = this.f149715E;
                Context context = this.f149718H;
                this.f149719w = null;
                this.f149720x = c22669g3;
                this.f149721y = c22669g3;
                this.f149722z = 2;
                obj = c35199a.m111532o(list, context, this);
                if (obj != enumC31071a) {
                    c22669g0 = c22669g3;
                    r14 = c22669g3;
                    file = (File) obj;
                    r10 = c22669g0;
                    r10.f89336w = file;
                    return C23454a0.f92919a;
                }
                return enumC31071a;
            }
        }

        /* JADX INFO: renamed from: ur2.a$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.util.log.exporter.LocalLogExporter$emailLogData$1$2", m100430f = "LocalLogExporter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lm/j;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lbc3/c0;)Lm/j;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f149723w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35199a f149724x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Context f149725y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C35199a c35199a, Context context, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f149724x = c35199a;
                this.f149725y = context;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f149724x, this.f149725y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super DialogInterfaceC24846j> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f149723w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return this.f149724x.errorDisplayer.m111538a(this.f149725y);
            }
        }

        /* JADX INFO: renamed from: ur2.a$c$c, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.util.log.exporter.LocalLogExporter$emailLogData$1$3", m100430f = "LocalLogExporter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lbc3/c0;)Ljava/lang/Object;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42507c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C22669g0 f149726E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ Toast f149727F;

            /* JADX INFO: renamed from: w */
            int f149728w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35199a f149729x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Context f149730y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f149731z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42507c(C35199a c35199a, Context context, String str, C22669g0 c22669g0, Toast toast, InterfaceC30057d<? super C42507c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f149729x = c35199a;
                this.f149730y = context;
                this.f149731z = str;
                this.f149726E = c22669g0;
                this.f149727F = toast;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42507c(this.f149729x, this.f149730y, this.f149731z, this.f149726E, this.f149727F, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<Object> interfaceC30057d) {
                return ((C42507c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) throws IOException {
                InterfaceC13087t1 interfaceC13087t1Mo14818b;
                List replayCache;
                InterfaceC21750d interfaceC21750d;
                WhoopStrapInfo whoopStrapInfo;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f149728w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC4733b interfaceC4733b = this.f149729x.strapProvider;
                Intent intentM111541b = this.f149729x.logFileEmailOpener.m111541b(this.f149730y, this.f149731z, (File) this.f149726E.f89336w, this.f149729x.buildConfigProvider, (interfaceC4733b == null || (interfaceC13087t1Mo14818b = interfaceC4733b.mo14818b()) == null || (replayCache = interfaceC13087t1Mo14818b.getReplayCache()) == null || (interfaceC21750d = (InterfaceC21750d) AbstractC25265s.m74100H0(replayCache)) == null || (whoopStrapInfo = interfaceC21750d.get_strapInfo()) == null) ? null : whoopStrapInfo.getSerialNumber());
                this.f149727F.cancel();
                try {
                    this.f149730y.startActivity(intentM111541b);
                    return C23454a0.f92919a;
                } catch (ActivityNotFoundException e5) {
                    this.f149729x.logger.mo85230v("LocalLogExporter failed to find activity for email", new b(e5), new AbstractC30556a.a[0]);
                    return this.f149729x.errorDisplayer.m111539b(this.f149730y);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f149709F = context;
            this.f149710G = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35199a.this.new c(this.f149709F, this.f149710G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0085  */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
        
            if (bc3.AbstractC3006f0.m8705K(r14, r2, r13) == r0) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x016c, code lost:
        
            if (bc3.AbstractC3006f0.m8705K(r14, r6, r13) == r0) goto L57;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 387
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ur2.C35199a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ur2.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.log.exporter.LocalLogExporter", m100430f = "LocalLogExporter.kt", m100431l = {114}, m100432m = "export", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f149733F;

        /* JADX INFO: renamed from: w */
        Object f149734w;

        /* JADX INFO: renamed from: x */
        Object f149735x;

        /* JADX INFO: renamed from: y */
        Object f149736y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f149737z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f149737z = obj;
            this.f149733F |= Integer.MIN_VALUE;
            return C35199a.this.m111532o(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ur2.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.log.exporter.LocalLogExporter", m100430f = "LocalLogExporter.kt", m100431l = {125}, m100432m = "logFileNameSuffix", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f149738w;

        /* JADX INFO: renamed from: y */
        int f149740y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f149738w = obj;
            this.f149740y |= Integer.MIN_VALUE;
            return C35199a.this.m111533p(this);
        }
    }

    public C35199a(InterfaceC2994c0 coroutineScope, InterfaceC34108f dao, InterfaceC30063j ioContext, InterfaceC30063j mainContext, InterfaceC34114l cacheProvider, InterfaceC34116n logger, C32052a logEventUploadScheduler, AbstractC21909c configurationRepository, InterfaceC40205a userInfoAccessor, InterfaceC10603n toaster, C35201c logFileEmailOpener, InterfaceC41070a clock, C28162g buildConfigProvider, InterfaceC4733b interfaceC4733b, C35200b errorDisplayer) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(dao, "dao");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(mainContext, "mainContext");
        AbstractC22676k.m65750j(cacheProvider, "cacheProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(logEventUploadScheduler, "logEventUploadScheduler");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(toaster, "toaster");
        AbstractC22676k.m65750j(logFileEmailOpener, "logFileEmailOpener");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        AbstractC22676k.m65750j(errorDisplayer, "errorDisplayer");
        this.coroutineScope = coroutineScope;
        this.dao = dao;
        this.ioContext = ioContext;
        this.mainContext = mainContext;
        this.cacheProvider = cacheProvider;
        this.logger = logger;
        this.logEventUploadScheduler = logEventUploadScheduler;
        this.configurationRepository = configurationRepository;
        this.userInfoAccessor = userInfoAccessor;
        this.toaster = toaster;
        this.logFileEmailOpener = logFileEmailOpener;
        this.clock = clock;
        this.buildConfigProvider = buildConfigProvider;
        this.strapProvider = interfaceC4733b;
        this.errorDisplayer = errorDisplayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m111532o(List<String> list, Context context, InterfaceC30057d<? super File> interfaceC30057d) throws IOException {
        d dVar;
        List<String> list2;
        File file;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f149733F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f149733F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM111533p = dVar.f149737z;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f149733F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM111533p);
            File fileMo107845b = this.cacheProvider.mo107845b(context);
            fileMo107845b.mkdirs();
            dVar.f149734w = list;
            dVar.f149735x = null;
            dVar.f149736y = fileMo107845b;
            dVar.f149733F = 1;
            objM111533p = m111533p(dVar);
            if (objM111533p == obj) {
                return obj;
            }
            list2 = list;
            file = fileMo107845b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) dVar.f149736y;
            list2 = (List) dVar.f149734w;
            AbstractC34132o.m107864I(objM111533p);
        }
        String strM53369j = AbstractC18489d0.m53369j(objM111533p, "EventLog-", ".txt");
        File file2 = new File(file, strM53369j);
        m111534q(list2, file2);
        File file3 = new File(file, AbstractC2875y.m8299l(strM53369j, ".gz"));
        INSTANCE.m111537b(file3, file2, this.logger);
        file2.delete();
        return file3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m111533p(InterfaceC30057d<? super String> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f149740y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f149740y = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objMo129089c = eVar.f149738w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f149740y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            eVar.f149740y = 1;
            objMo129089c = interfaceC40205a.mo129089c(eVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        User user = (User) objMo129089c;
        Integer num = new Integer(user != null ? user.getId() : 0);
        int iIntValue = num.intValue();
        Object obj = num;
        if (iIntValue == 0) {
            obj = null;
        }
        if (obj == null) {
            obj = "NoUser";
        }
        String strValueOf = String.valueOf(obj);
        String strM85304b = AbstractC28184n0.m85304b(this.clock.mo133364c());
        AbstractC22676k.m65749i(strM85304b, "dateTimeToIsoDateString(...)");
        return AbstractC18489d0.m53370k(strValueOf, "-", AbstractC39421y.m125927L(strM85304b, ':', '-'));
    }

    /* JADX INFO: renamed from: q */
    private final void m111534q(List<String> allLogs, File file) throws IOException {
        if (file.exists()) {
            file.delete();
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        PrintWriter printWriter = new PrintWriter(new FileWriter(file));
        try {
            int size = allLogs.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i13 = size - 1;
                    printWriter.println(allLogs.get(size));
                    if (i13 < 0) {
                        break;
                    } else {
                        size = i13;
                    }
                }
            }
            if (allLogs.isEmpty()) {
                printWriter.println("No logs were found for export");
            }
            printWriter.flush();
            printWriter.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(printWriter, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m111535n(Context context) {
        AbstractC22676k.m65750j(context, "context");
        String strM8299l = AbstractC2875y.m8299l(this.buildConfigProvider.getApplicationId(), ".logProvider");
        this.logger.mo85228t("user is exporting logs manually", new AbstractC30556a.a[0]);
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(context, strM8299l, null), 3);
    }

    public /* synthetic */ C35199a(InterfaceC2994c0 interfaceC2994c0, InterfaceC34108f interfaceC34108f, InterfaceC30063j interfaceC30063j, InterfaceC30063j interfaceC30063j2, InterfaceC34114l interfaceC34114l, InterfaceC34116n interfaceC34116n, C32052a c32052a, AbstractC21909c abstractC21909c, InterfaceC40205a interfaceC40205a, InterfaceC10603n interfaceC10603n, C35201c c35201c, InterfaceC41070a interfaceC41070a, C28162g c28162g, InterfaceC4733b interfaceC4733b, C35200b c35200b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, interfaceC34108f, interfaceC30063j, interfaceC30063j2, interfaceC34114l, interfaceC34116n, c32052a, abstractC21909c, interfaceC40205a, interfaceC10603n, c35201c, interfaceC41070a, c28162g, interfaceC4733b, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? new C35200b() : c35200b);
    }
}
