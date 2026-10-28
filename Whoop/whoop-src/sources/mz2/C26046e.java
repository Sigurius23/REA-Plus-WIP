package mz2;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l83.C23454a0;
import m83.AbstractC25260n;
import or2.AbstractC28178l0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yw2.AbstractC39833e;

/* JADX INFO: renamed from: mz2.e */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R$\u0010+\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010'\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u001bR\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\r008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00101R\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\r038\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b-\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010>¨\u0006@"}, m65681d2 = {"Lmz2/e;", "", "Lbc3/c0;", "scope", "Landroid/content/Context;", "context", "<init>", "(Lbc3/c0;Landroid/content/Context;)V", "", "fileName", "Ll83/a0;", "g", "(Ljava/lang/String;)V", "Lcom/whoop/design/util/TextResource;", "error", "i", "(Lcom/whoop/design/util/TextResource;)V", "filename", "j", "Ljava/io/File;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/io/File;", "b", "()V", "c", "file", "d", "(Ljava/io/File;)V", "", "value", "k", "([B)V", "a", "Lbc3/c0;", "getScope", "()Lbc3/c0;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/io/File;", "outputFolder", "f", "setOutputFile", "outputFile", "Ljava/io/OutputStream;", "e", "Ljava/io/OutputStream;", "outputStream", "Lec3/o1;", "Lec3/o1;", "_errorFlow", "Lec3/t1;", "Lec3/t1;", "()Lec3/t1;", "errorFlow", "Ljava/nio/ByteBuffer;", "Ljava/nio/ByteBuffer;", "packetBuffer", "", "B", "padding", "", "I", "payloadCrc", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26046e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final File outputFolder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private File outputFile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private OutputStream outputStream;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13072o1 _errorFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13087t1 errorFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ByteBuffer packetBuffer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final byte padding;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int payloadCrc;

    /* JADX INFO: renamed from: mz2.e$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.WhoopLabsFileWriter$reportError$1", m100430f = "WhoopLabsFileWriter.kt", m100431l = {109}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103107w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ TextResource f103109y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource textResource, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f103109y = textResource;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26046e.this.new a(this.f103109y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f103107w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C26046e.this._errorFlow;
                TextResource textResource = this.f103109y;
                this.f103107w = 1;
                if (interfaceC13072o1.emit(textResource, this) == enumC31071a) {
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

    public C26046e(InterfaceC2994c0 scope, Context context) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(context, "context");
        this.scope = scope;
        this.context = context;
        File file = new File(context.getExternalFilesDir(null), "HrData");
        this.outputFolder = file;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this._errorFlow = c13096w1M36592b;
        this.errorFlow = AbstractC13091v.m36597g(c13096w1M36592b);
        file.mkdirs();
        if (!file.exists()) {
            m77507i(new TextResource.C8688b(AbstractC39833e.f171721f, new TextResource.AbstractC8690d.a(file.getPath())));
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(37).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) -86);
        byteBufferOrder.putShort((short) 33);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.put((byte) -47);
        this.packetBuffer = byteBufferOrder;
    }

    /* JADX INFO: renamed from: g */
    private final void m77506g(String fileName) {
        this.outputFile = new File(this.outputFolder, fileName);
        this.outputStream = new FileOutputStream(this.outputFile, true);
    }

    /* JADX INFO: renamed from: i */
    private final void m77507i(TextResource error) {
        AbstractC3006f0.m8732z(this.scope, null, null, new a(error, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m77508b() {
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException unused) {
            }
            AbstractC28178l0.m85295a(outputStream);
        }
        this.outputStream = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m77509c() {
        m77510d(this.outputFile);
    }

    /* JADX INFO: renamed from: d */
    public final void m77510d(File file) {
        if (file != null) {
            file.delete();
        }
        if (AbstractC22676k.m65745e(file, this.outputFile)) {
            this.outputFile = null;
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC13087t1 getErrorFlow() {
        return this.errorFlow;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final File getOutputFile() {
        return this.outputFile;
    }

    /* JADX INFO: renamed from: h */
    public final File m77513h() {
        File[] fileArrListFiles = this.outputFolder.listFiles();
        if (fileArrListFiles != null) {
            return (File) AbstractC25260n.m74079t0(fileArrListFiles);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m77514j(String filename) {
        AbstractC22676k.m65750j(filename, "filename");
        m77508b();
        m77506g(filename);
    }

    /* JADX INFO: renamed from: k */
    public final void m77515k(byte[] value) throws IOException {
        AbstractC22676k.m65750j(value, "value");
        if (value.length > 20) {
            value = AbstractC25260n.m74070k0(value, 0, 20);
        }
        this.packetBuffer.position(5);
        this.packetBuffer.putLong(System.currentTimeMillis());
        this.packetBuffer.put(value);
        int length = value.length;
        while (true) {
            length++;
            if (length >= 21) {
                break;
            } else {
                this.packetBuffer.put(this.padding);
            }
        }
        this.packetBuffer.putInt(this.payloadCrc);
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            outputStream.write(this.packetBuffer.array());
        }
    }
}
