package bg;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.sentry.config.AbstractC20301a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import l83.C23454a0;
import m83.AbstractC25260n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.AbstractC32145e0;
import s83.AbstractC32275i;
import va3.AbstractC35854l;
import x83.C38084a;

/* JADX INFO: renamed from: bg.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C3206a extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12561w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f12562x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3206a(int i13, String str, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f12561w = i13;
        this.f12562x = str;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f12561w) {
            case 0:
                return new C3206a(0, this.f12562x, interfaceC30057d);
            default:
                return new C3206a(1, this.f12562x, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f12561w) {
            case 0:
                break;
        }
        return ((C3206a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0017, B:9:0x0025, B:11:0x002b, B:18:0x003b, B:19:0x0043, B:22:0x004b, B:24:0x005f, B:27:0x0075, B:28:0x008e, B:29:0x008f, B:30:0x00ad), top: B:39:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0017, B:9:0x0025, B:11:0x002b, B:18:0x003b, B:19:0x0043, B:22:0x004b, B:24:0x005f, B:27:0x0075, B:28:0x008e, B:29:0x008f, B:30:0x00ad), top: B:39:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0017, B:9:0x0025, B:11:0x002b, B:18:0x003b, B:19:0x0043, B:22:0x004b, B:24:0x005f, B:27:0x0075, B:28:0x008e, B:29:0x008f, B:30:0x00ad), top: B:39:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0017, B:9:0x0025, B:11:0x002b, B:18:0x003b, B:19:0x0043, B:22:0x004b, B:24:0x005f, B:27:0x0075, B:28:0x008e, B:29:0x008f, B:30:0x00ad), top: B:39:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #0 {all -> 0x0034, blocks: (B:5:0x0017, B:9:0x0025, B:11:0x002b, B:18:0x003b, B:19:0x0043, B:22:0x004b, B:24:0x005f, B:27:0x0075, B:28:0x008e, B:29:0x008f, B:30:0x00ad), top: B:39:0x0017 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0075, please report this as an issue */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws IOException {
        int i13;
        C38084a c38084a;
        int size;
        int i14 = this.f12561w;
        String str = this.f12562x;
        switch (i14) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InetAddress[] allByName = InetAddress.getAllByName(str);
                AbstractC22676k.m65749i(allByName, "getAllByName(...)");
                ArrayList arrayList = new ArrayList(allByName.length);
                for (InetAddress inetAddress : allByName) {
                    AbstractC22676k.m65747g(inetAddress);
                    arrayList.add(AbstractC20301a.m56331b0(inetAddress));
                }
                return arrayList;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                File file = new File(str);
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    long length = file.length();
                    if (length > 2147483647L) {
                        throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
                    }
                    int i15 = (int) length;
                    byte[] bArrCopyOf = new byte[i15];
                    int i16 = 0;
                    int i17 = i15;
                    while (i17 > 0) {
                        int i18 = fileInputStream.read(bArrCopyOf, i16, i17);
                        if (i18 < 0) {
                            if (i17 > 0) {
                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i16);
                                AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
                            } else {
                                i13 = fileInputStream.read();
                                if (i13 == -1) {
                                    c38084a = new C38084a(8193);
                                    c38084a.write(i13);
                                    AbstractC32145e0.m100096c(fileInputStream, c38084a);
                                    size = c38084a.size() + i15;
                                    if (size >= 0) {
                                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                                    }
                                    byte[] bArrM122035b = c38084a.m122035b();
                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                                    AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
                                    AbstractC25260n.m74060c0(i15, 0, c38084a.size(), bArrM122035b, bArrCopyOf);
                                }
                            }
                            fileInputStream.close();
                            return bArrCopyOf;
                        }
                        i17 -= i18;
                        i16 += i18;
                    }
                    if (i17 > 0) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i16);
                        AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
                    } else {
                        i13 = fileInputStream.read();
                        if (i13 == -1) {
                            c38084a = new C38084a(8193);
                            c38084a.write(i13);
                            AbstractC32145e0.m100096c(fileInputStream, c38084a);
                            size = c38084a.size() + i15;
                            if (size >= 0) {
                                throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                            }
                            byte[] bArrM122035b2 = c38084a.m122035b();
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                            AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
                            AbstractC25260n.m74060c0(i15, 0, c38084a.size(), bArrM122035b2, bArrCopyOf);
                        }
                    }
                    fileInputStream.close();
                    return bArrCopyOf;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(fileInputStream, th3);
                        throw th4;
                    }
                }
        }
    }
}
