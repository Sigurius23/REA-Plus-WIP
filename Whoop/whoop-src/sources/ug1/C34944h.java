package ug1;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ug1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u001dB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u001d\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010%\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lug1/h;", "Lug1/g;", "Lbc3/z;", "dispatcher", "<init>", "(Lbc3/z;)V", "Ljava/io/InputStream;", "inputStream", "", "useFileLength", "Ll83/a0;", "l", "(Ljava/io/InputStream;Z)V", "Ljava/io/File;", "file", "b", "(Ljava/io/File;ZLq83/d;)Ljava/lang/Object;", "Ljava/nio/ByteBuffer;", "destBuffer", "", "destOffset", "byteCount", "e", "(Ljava/nio/ByteBuffer;IILq83/d;)Ljava/lang/Object;", "c", "(Lq83/d;)Ljava/lang/Object;", "position", "d", "(ILq83/d;)Ljava/lang/Object;", "a", "Lbc3/z;", "Ljava/io/InputStream;", "fileInputStream", "I", "imageLength", "getLength", "()I", "length", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34944h implements InterfaceC34943g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC3076z dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private InputStream inputStream;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private InputStream fileInputStream;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int imageLength;

    /* JADX INFO: renamed from: ug1.h$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.FwImageImpl$close$2", m100430f = "FwImage.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f147836w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34944h.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f147836w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InputStream inputStream = C34944h.this.inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            InputStream inputStream2 = C34944h.this.fileInputStream;
            if (inputStream2 == null) {
                return null;
            }
            inputStream2.close();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug1.h$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.FwImageImpl$open$2", m100430f = "FwImage.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f147838w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ File f147840y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f147841z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, boolean z4, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147840y = file;
            this.f147841z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34944h.this.new c(this.f147840y, this.f147841z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f147838w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InputStream inputStream = C34944h.this.inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            C34944h.this.fileInputStream = new FileInputStream(this.f147840y);
            C34944h.this.inputStream = new BufferedInputStream(C34944h.this.fileInputStream);
            C34944h c34944h = C34944h.this;
            InputStream inputStream2 = c34944h.inputStream;
            AbstractC22676k.m65747g(inputStream2);
            c34944h.m110384l(inputStream2, this.f147841z);
            InputStream inputStream3 = C34944h.this.inputStream;
            if (inputStream3 != null) {
                inputStream3.close();
            }
            InputStream inputStream4 = C34944h.this.fileInputStream;
            if (inputStream4 != null) {
                inputStream4.close();
            }
            C34944h.this.fileInputStream = new FileInputStream(this.f147840y);
            C34944h.this.inputStream = new BufferedInputStream(C34944h.this.fileInputStream);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug1.h$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.FwImageImpl$readChunk$3", m100430f = "FwImage.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)I"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f147842E;

        /* JADX INFO: renamed from: w */
        int f147843w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ByteBuffer f147845y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f147846z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ByteBuffer byteBuffer, int i13, int i14, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147845y = byteBuffer;
            this.f147846z = i13;
            this.f147842E = i14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34944h.this.new d(this.f147845y, this.f147846z, this.f147842E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Integer> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f147843w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            try {
                InputStream inputStream = C34944h.this.inputStream;
                AbstractC22676k.m65747g(inputStream);
                inputStream.mark(C34944h.this.imageLength);
                InputStream inputStream2 = C34944h.this.inputStream;
                AbstractC22676k.m65747g(inputStream2);
                i13 = inputStream2.read(this.f147845y.array(), this.f147846z, this.f147842E);
                if (i13 >= 0) {
                    ByteBuffer byteBuffer = this.f147845y;
                    byteBuffer.position(byteBuffer.position() + i13);
                }
            } catch (IOException unused) {
                i13 = -1;
            }
            return new Integer(i13);
        }
    }

    /* JADX INFO: renamed from: ug1.h$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.FwImageImpl$reset$2", m100430f = "FwImage.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f147847w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34944h.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f147847w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InputStream inputStream = C34944h.this.inputStream;
            if (inputStream == null) {
                return null;
            }
            inputStream.reset();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug1.h$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.firmwareUpdateService.strategy.FwImageImpl$setStart$2", m100430f = "FwImage.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)J"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f147849w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f147851y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i13, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147851y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34944h.this.new f(this.f147851y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Long> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f147849w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InputStream inputStream = C34944h.this.inputStream;
            if (inputStream != null) {
                return new Long(inputStream.skip(this.f147851y));
            }
            return null;
        }
    }

    public C34944h(AbstractC3076z dispatcher) {
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m110384l(InputStream inputStream, boolean useFileLength) throws IOException {
        if (useFileLength) {
            this.imageLength = inputStream.available();
            return;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(512).order(ByteOrder.LITTLE_ENDIAN);
        inputStream.read(byteBufferOrder.array(), 0, 512);
        this.imageLength = byteBufferOrder.getInt(4);
    }

    @Override // ug1.InterfaceC34943g
    /* JADX INFO: renamed from: a */
    public Object mo110373a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new e(null), interfaceC30057d);
    }

    @Override // ug1.InterfaceC34943g
    /* JADX INFO: renamed from: b */
    public Object mo110374b(File file, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcher, new c(file, z4, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    @Override // ug1.InterfaceC34943g
    /* JADX INFO: renamed from: c */
    public Object mo110375c(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new b(null), interfaceC30057d);
    }

    @Override // ug1.InterfaceC34943g
    /* JADX INFO: renamed from: d */
    public Object mo110376d(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C22365e c22365e = AbstractC3050q0.f12077a;
        Object objM8705K = AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new f(i13, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    @Override // ug1.InterfaceC34943g
    /* JADX INFO: renamed from: e */
    public Object mo110377e(ByteBuffer byteBuffer, int i13, int i14, InterfaceC30057d<? super Integer> interfaceC30057d) {
        if (this.inputStream == null) {
            throw new IllegalArgumentException("Use open() to initialise input stream");
        }
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new d(byteBuffer, i13, i14, null), interfaceC30057d);
    }

    @Override // ug1.InterfaceC34943g
    public int getLength() {
        return this.imageLength + 512;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C34944h(AbstractC3076z abstractC3076z, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            abstractC3076z = ExecutorC22364d.f87316w;
        }
        this(abstractC3076z);
    }
}
