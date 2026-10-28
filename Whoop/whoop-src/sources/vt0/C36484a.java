package vt0;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import lu0.InterfaceC24745a;
import or2.AbstractC28209v1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22667f0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: vt0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JJ\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lvt0/a;", "", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "Ljava/io/File;", "outputFile", "", "Llu0/a;", "dataPacketList", "", "revision", "", "maxFileSize", "Lq83/j;", "ioDispatcher", "Lvt0/b;", "a", "(Ljava/io/File;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Long;Lq83/j;Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "connectivity-data-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36484a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vt0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityDataPackets.DataPacketUploadFileWriter", m100430f = "DataPacketUploadFileWriter.kt", m100431l = {33}, m100432m = "writeDataPacketsToFile", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f155832E;

        /* JADX INFO: renamed from: F */
        Object f155833F;

        /* JADX INFO: renamed from: G */
        Object f155834G;

        /* JADX INFO: renamed from: H */
        Object f155835H;

        /* JADX INFO: renamed from: I */
        Object f155836I;

        /* JADX INFO: renamed from: J */
        Object f155837J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f155838K;

        /* JADX INFO: renamed from: M */
        int f155840M;

        /* JADX INFO: renamed from: w */
        Object f155841w;

        /* JADX INFO: renamed from: x */
        Object f155842x;

        /* JADX INFO: renamed from: y */
        Object f155843y;

        /* JADX INFO: renamed from: z */
        Object f155844z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155838K = obj;
            this.f155840M |= Integer.MIN_VALUE;
            return C36484a.this.m116917a(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: vt0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityDataPackets.DataPacketUploadFileWriter$writeDataPacketsToFile$2", m100430f = "DataPacketUploadFileWriter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ljava/io/BufferedOutputStream;", "<anonymous>", "(Lbc3/c0;)Ljava/io/BufferedOutputStream;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155845w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ File f155846x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155846x = file;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f155846x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super BufferedOutputStream> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155845w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new BufferedOutputStream(new FileOutputStream(this.f155846x));
        }
    }

    public C36484a(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    public static Object m116916b(C36484a c36484a, File file, List list, Integer num, Long l7, InterfaceC30063j interfaceC30063j, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        if ((i13 & 8) != 0) {
            l7 = null;
        }
        if ((i13 & 16) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = ExecutorC22364d.f87316w;
        }
        return c36484a.m116917a(file, list, num, l7, interfaceC30063j, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m116917a(File file, List<? extends InterfaceC24745a> list, Integer num, Long l7, InterfaceC30063j interfaceC30063j, InterfaceC30057d<? super C36485b> interfaceC30057d) throws Throwable {
        a aVar;
        Object obj;
        Object obj2;
        C22665e0 c22665e0;
        C22667f0 c22667f0;
        C22667f0 c22667f1;
        List<? extends InterfaceC24745a> list2;
        File file2;
        C22667f0 c22667f2;
        C22667f0 c22667f3;
        Integer num2;
        Long l12;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f155840M;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f155840M = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj3 = aVar.f155838K;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f155840M;
        try {
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    c22665e0 = new C22665e0();
                    c22665e0.f89334w = -1;
                    c22667f0 = new C22667f0();
                    c22667f1 = new C22667f0();
                    c22667f1.f89335w = Long.MAX_VALUE;
                    C22667f0 c22667f4 = new C22667f0();
                    C22667f0 c22667f5 = new C22667f0();
                    try {
                        b bVar = new b(file, null);
                        aVar.f155841w = file;
                        list2 = list;
                        aVar.f155842x = list2;
                        aVar.f155843y = num;
                        aVar.f155844z = l7;
                        aVar.f155832E = null;
                        aVar.f155833F = c22665e0;
                        aVar.f155834G = c22667f0;
                        aVar.f155835H = c22667f1;
                        aVar.f155836I = c22667f4;
                        aVar.f155837J = c22667f5;
                        aVar.f155840M = 1;
                        Object objM8705K = AbstractC3006f0.m8705K(interfaceC30063j, bVar, aVar);
                        if (objM8705K == enumC31071a) {
                            return enumC31071a;
                        }
                        file2 = file;
                        c22667f2 = c22667f4;
                        obj3 = objM8705K;
                        c22667f3 = c22667f5;
                        num2 = num;
                        l12 = l7;
                    } catch (FileNotFoundException e5) {
                        e = e5;
                        obj2 = null;
                        this.logger.mo85230v("Failed to create export file from Room db", e, new AbstractC30556a.a[0]);
                        return obj2;
                    } catch (IndexOutOfBoundsException e13) {
                        e = e13;
                        obj = null;
                        this.logger.mo85230v("Failed to write to the export file", e, new AbstractC30556a.a[0]);
                        return obj;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c22667f3 = (C22667f0) aVar.f155837J;
                    c22667f2 = (C22667f0) aVar.f155836I;
                    c22667f1 = (C22667f0) aVar.f155835H;
                    c22667f0 = (C22667f0) aVar.f155834G;
                    c22665e0 = (C22665e0) aVar.f155833F;
                    l12 = (Long) aVar.f155844z;
                    num2 = (Integer) aVar.f155843y;
                    list2 = (List) aVar.f155842x;
                    File file3 = (File) aVar.f155841w;
                    AbstractC34132o.m107864I(obj3);
                    file2 = file3;
                }
                Closeable closeable = (Closeable) obj3;
                try {
                    BufferedOutputStream bufferedOutputStream = (BufferedOutputStream) closeable;
                    Iterator<? extends InterfaceC24745a> it = list2.iterator();
                    boolean z4 = true;
                    while (it.hasNext()) {
                        InterfaceC24745a next = it.next();
                        byte[] bArrArray = next.getPacketData().array();
                        if (l12 != null && c22667f3.f89335w + ((long) bArrArray.length) > l12.longValue()) {
                            break;
                        }
                        if (z4 == 0) {
                            if (c22665e0.f89334w != next.getVersionId()) {
                                this.logger.mo85228t("Change in version detected for the R" + num2 + " packets. First version is " + c22665e0.f89334w + " and current version is " + next.getVersionId() + ". Breaking out", new AbstractC30556a.a[0]);
                                break;
                            }
                        } else {
                            c22665e0.f89334w = next.getVersionId();
                            z4 = false;
                        }
                        long timestamp = next.getTimestamp();
                        bufferedOutputStream.write(bArrArray);
                        BufferedOutputStream bufferedOutputStream2 = bufferedOutputStream;
                        c22667f2.f89335w++;
                        c22667f3.f89335w += (long) bArrArray.length;
                        if (timestamp > c22667f0.f89335w) {
                            c22667f0.f89335w = timestamp;
                        }
                        if (timestamp < c22667f1.f89335w) {
                            c22667f1.f89335w = timestamp;
                        }
                        it = it;
                        z4 = z4;
                        bufferedOutputStream = bufferedOutputStream2;
                    }
                    this.logger.mo85219j("Exported " + c22667f2.f89335w + " of R" + num2 + " data packets for range " + AbstractC28209v1.m85388b(c22667f1.f89335w) + " - " + AbstractC28209v1.m85388b(c22667f0.f89335w), new AbstractC30556a.a[0]);
                    AbstractC35854l.m113829i(closeable, null);
                    return new C36485b(c22665e0.f89334w, c22667f0.f89335w, c22667f1.f89335w, c22667f2.f89335w, file2);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(closeable, th3);
                        throw th4;
                    }
                }
            } catch (Exception e14) {
                this.logger.mo85230v("Caught an exception when trying to export data", e14, new AbstractC30556a.a[0]);
                AbstractC3006f0.m8721o(aVar.getContext());
                return null;
            }
        } catch (FileNotFoundException e15) {
            e = e15;
            obj2 = null;
        } catch (IndexOutOfBoundsException e16) {
            e = e16;
            obj = null;
        }
    }
}
