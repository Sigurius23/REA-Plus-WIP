package p557vo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import bc3.AbstractC3006f0;
import cd3.AbstractC4454f;
import cd3.C4452d;
import cf.InterfaceC4535j;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import e93.AbstractC12889b;
import gf.C15768i;
import j93.C21462d0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import l83.C23467m;
import m83.AbstractC25267u;
import m83.C25271y;
import mg.C25525g;
import mg.C25527i;
import mg.InterfaceC25523e;
import mg.InterfaceC25526h;
import ng.C26671a;
import ng.C26676f;
import ng.C26678h;
import p031b9.AbstractC2875y;
import p097ds.AbstractC12314q;
import p460rg.AbstractC31375j;
import p460rg.C31371f;
import p460rg.C31374i;
import p460rg.C31376k;
import p460rg.C31377l;
import p460rg.EnumC31369d;
import p460rg.EnumC31370e;
import p474s.C31983m2;
import p505ts.AbstractC34132o;
import p549vb.AbstractC35862g;
import p646yd.C39450a;
import p646yd.C39451b;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import vg.InterfaceC35954a;
import vv1.C36532c;
import wb3.AbstractC37056f;
import wc3.AbstractC37146k;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;

/* JADX INFO: renamed from: vo.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC36220b {

    /* JADX INFO: renamed from: a */
    public static C41113q f155064a;

    /* JADX INFO: renamed from: A */
    public static long m115289A(Parcel parcel, int i13) {
        m115295G(parcel, i13, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: B */
    public static int m115290B(Parcel parcel, int i13) {
        return (i13 & (-65536)) != -65536 ? (char) (i13 >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: C */
    public static final long m115291C(long j7) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j7 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j7 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4 A[RETURN] */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC37138c m115292D(AbstractC4454f abstractC4454f, InterfaceC21456a0 interfaceC21456a0, boolean z4) {
        InterfaceC37138c interfaceC37138cM119062a;
        InterfaceC37138c interfaceC37138cMo13924b;
        InterfaceC37138c c37140e;
        InterfaceC21461d interfaceC21461dKclass = Platform_commonKt.kclass(interfaceC21456a0);
        boolean zIsMarkedNullable = interfaceC21456a0.isMarkedNullable();
        List arguments = interfaceC21456a0.getArguments();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arguments, 10));
        Iterator it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(Platform_commonKt.typeOrThrow((C21462d0) it.next()));
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List list = C25271y.f99162w;
        if (zIsEmpty) {
            if (!PlatformKt.isInterface(interfaceC21461dKclass) || abstractC4454f.mo13924b(interfaceC21461dKclass, list) == null) {
                interfaceC37138cM119062a = AbstractC37146k.m119062a(interfaceC21461dKclass, zIsMarkedNullable);
            } else {
                interfaceC37138cM119062a = null;
            }
        } else if (((C4452d) abstractC4454f).f17958f) {
            interfaceC37138cM119062a = null;
        } else {
            Object objM119063b = AbstractC37146k.m119063b(interfaceC21461dKclass, arrayList, zIsMarkedNullable);
            if (objM119063b instanceof C23467m) {
                objM119063b = null;
            }
            interfaceC37138cM119062a = (InterfaceC37138c) objM119063b;
        }
        if (interfaceC37138cM119062a != null) {
            return interfaceC37138cM119062a;
        }
        if (arrayList.isEmpty()) {
            interfaceC37138cMo13924b = AbstractC35862g.m113847j(interfaceC21461dKclass);
            if (interfaceC37138cMo13924b == null && (interfaceC37138cMo13924b = abstractC4454f.mo13924b(interfaceC21461dKclass, list)) == null) {
                if (PlatformKt.isInterface(interfaceC21461dKclass)) {
                    c37140e = new C37140e(interfaceC21461dKclass);
                    interfaceC37138cMo13924b = c37140e;
                } else {
                    interfaceC37138cMo13924b = null;
                }
            }
            if (interfaceC37138cMo13924b != null) {
                if (zIsMarkedNullable) {
                    return AbstractC38195a.m122336d(interfaceC37138cMo13924b);
                }
                return interfaceC37138cMo13924b;
            }
        } else {
            ArrayList arrayListM113848k = AbstractC35862g.m113848k(abstractC4454f, arrayList, z4);
            if (arrayListM113848k != null) {
                InterfaceC37138c interfaceC37138cM113844g = AbstractC35862g.m113844g(interfaceC21461dKclass, arrayListM113848k, new C36532c(arrayList, 11));
                if (interfaceC37138cM113844g == null) {
                    interfaceC37138cMo13924b = abstractC4454f.mo13924b(interfaceC21461dKclass, arrayListM113848k);
                    if (interfaceC37138cMo13924b == null) {
                        if (PlatformKt.isInterface(interfaceC21461dKclass)) {
                            c37140e = new C37140e(interfaceC21461dKclass);
                            interfaceC37138cMo13924b = c37140e;
                        } else {
                            interfaceC37138cMo13924b = null;
                        }
                    }
                } else {
                    interfaceC37138cMo13924b = interfaceC37138cM113844g;
                }
                if (interfaceC37138cMo13924b != null) {
                    if (zIsMarkedNullable) {
                        return AbstractC38195a.m122336d(interfaceC37138cMo13924b);
                    }
                    return interfaceC37138cMo13924b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static void m115293E(Parcel parcel, int i13) {
        parcel.setDataPosition(parcel.dataPosition() + m115290B(parcel, i13));
    }

    /* JADX INFO: renamed from: F */
    public static int m115294F(Parcel parcel) {
        int i13 = parcel.readInt();
        int iM115290B = m115290B(parcel, i13);
        char c3 = (char) i13;
        int iDataPosition = parcel.dataPosition();
        if (c3 != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i13))), parcel);
        }
        int i14 = iM115290B + iDataPosition;
        if (i14 >= iDataPosition && i14 <= parcel.dataSize()) {
            return i14;
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i14).length());
        sb4.append("Size read is invalid start=");
        sb4.append(iDataPosition);
        sb4.append(" end=");
        sb4.append(i14);
        throw new SafeParcelReader$ParseException(sb4.toString(), parcel);
    }

    /* JADX INFO: renamed from: G */
    public static void m115295G(Parcel parcel, int i13, int i14) {
        int iM115290B = m115290B(parcel, i13);
        if (iM115290B == i14) {
            return;
        }
        String hexString = Integer.toHexString(iM115290B);
        int length = String.valueOf(i14).length();
        StringBuilder sb4 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iM115290B).length() + 4 + 1);
        sb4.append("Expected size ");
        sb4.append(i14);
        sb4.append(" got ");
        sb4.append(iM115290B);
        throw new SafeParcelReader$ParseException(AbstractC2875y.m8304q(sb4, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: H */
    public static void m115296H(Parcel parcel, int i13, int i14) {
        if (i13 == i14) {
            return;
        }
        String hexString = Integer.toHexString(i13);
        int length = String.valueOf(i14).length();
        StringBuilder sb4 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i13).length() + 4 + 1);
        sb4.append("Expected size ");
        sb4.append(i14);
        sb4.append(" got ");
        sb4.append(i13);
        throw new SafeParcelReader$ParseException(AbstractC2875y.m8304q(sb4, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: a */
    public static final long m115297a(int i13, int i14) {
        return (((long) i14) & 4294967295L) | (((long) i13) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static Bundle m115298c(Parcel parcel, int i13) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM115290B);
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m115299d(Parcel parcel, int i13) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM115290B);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m115300e(Parcel parcel, int i13) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM115290B);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m115301f(Parcel parcel, int i13) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = parcel.readInt();
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iM115290B);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static Parcelable m115302g(Parcel parcel, int i13, Parcelable.Creator creator) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM115290B);
        return parcelable;
    }

    /* JADX INFO: renamed from: h */
    public static String m115303h(Parcel parcel, int i13) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM115290B);
        return string;
    }

    /* JADX INFO: renamed from: i */
    public static String[] m115304i(Parcel parcel, int i13) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM115290B);
        return strArrCreateStringArray;
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList m115305j(Parcel parcel, int i13) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM115290B);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: renamed from: k */
    public static Object[] m115306k(Parcel parcel, int i13, Parcelable.Creator creator) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM115290B);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList m115307l(Parcel parcel, int i13, Parcelable.Creator creator) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM115290B);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: m */
    public static void m115308m(Parcel parcel, int i13) {
        if (parcel.dataPosition() == i13) {
            return;
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i13).length() + 26);
        sb4.append("Overread allowed size end=");
        sb4.append(i13);
        throw new SafeParcelReader$ParseException(sb4.toString(), parcel);
    }

    /* JADX INFO: renamed from: q */
    public static C41113q m115309q() {
        C41113q c41113q;
        C41113q c41113q2 = f155064a;
        if (c41113q2 != null) {
            return c41113q2;
        }
        try {
            c41113q = new C41113q(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            c41113q = new C41113q((Method) null, (Method) null, (Method) null, (Method) null);
        }
        f155064a = c41113q;
        return c41113q;
    }

    /* JADX INFO: renamed from: r */
    public static final long m115310r(long j7, long j13, float f13) {
        return (((long) AbstractC12889b.m36250P(f13, (int) (j7 >> 32), (int) (j13 >> 32))) << 32) | (((long) AbstractC12889b.m36250P(f13, (int) (j7 & 4294967295L), (int) (j13 & 4294967295L))) & 4294967295L);
    }

    /* JADX INFO: renamed from: s */
    public static Boolean m115311s(Class clazz) throws IllegalAccessException, InvocationTargetException {
        AbstractC22676k.m65750j(clazz, "clazz");
        Method method = (Method) m115309q().f177224x;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(clazz, null);
        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m115312t(Parcel parcel, int i13) {
        m115295G(parcel, i13, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: u */
    public static byte m115313u(Parcel parcel, int i13) {
        m115295G(parcel, i13, 4);
        return (byte) parcel.readInt();
    }

    /* JADX INFO: renamed from: v */
    public static float m115314v(Parcel parcel, int i13) {
        m115295G(parcel, i13, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: renamed from: w */
    public static Float m115315w(Parcel parcel, int i13) {
        int iM115290B = m115290B(parcel, i13);
        if (iM115290B == 0) {
            return null;
        }
        m115296H(parcel, iM115290B, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* JADX INFO: renamed from: x */
    public static IBinder m115316x(Parcel parcel, int i13) {
        int iM115290B = m115290B(parcel, i13);
        int iDataPosition = parcel.dataPosition();
        if (iM115290B == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM115290B);
        return strongBinder;
    }

    /* JADX INFO: renamed from: y */
    public static int m115317y(Parcel parcel, int i13) {
        m115295G(parcel, i13, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: z */
    public static Integer m115318z(Parcel parcel, int i13) {
        int iM115290B = m115290B(parcel, i13);
        if (iM115290B == 0) {
            return null;
        }
        m115296H(parcel, iM115290B, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC37056f mo36635b();

    /* JADX INFO: renamed from: n */
    public abstract void mo36636n(AbstractC37056f abstractC37056f);

    /* JADX INFO: renamed from: o */
    public abstract Object mo36637o(AbstractC37056f abstractC37056f, C31983m2 c31983m2, C31983m2 c31983m3, C39450a c39450a);

    /* JADX WARN: Code duplicated, block: B:56:0x00ec A[Catch: all -> 0x002c, TryCatch #3 {all -> 0x002c, blocks: (B:12:0x0027, B:54:0x00e8, B:56:0x00ec, B:58:0x00fc, B:57:0x00f4), top: B:61:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4 A[Catch: all -> 0x002c, TryCatch #3 {all -> 0x002c, blocks: (B:12:0x0027, B:54:0x00e8, B:56:0x00ec, B:58:0x00fc, B:57:0x00f4), top: B:61:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public Object m115319p(Function1 function1, AbstractC32269c abstractC32269c) throws Throwable {
        C39451b c39451b;
        InterfaceC25526h interfaceC25526hMo36647l;
        Throwable th3;
        C31371f c31371f;
        Exception exc;
        InterfaceC30063j c26678h;
        InterfaceC35954a interfaceC35954a;
        InterfaceC25526h interfaceC25526hM75078s;
        if (abstractC32269c instanceof C39451b) {
            c39451b = (C39451b) abstractC32269c;
            int i13 = c39451b.f169729E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39451b.f169729E = i13 - Integer.MIN_VALUE;
            } else {
                c39451b = new C39451b(this, abstractC32269c);
            }
        } else {
            c39451b = new C39451b(this, abstractC32269c);
        }
        Object obj = c39451b.f169732y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39451b.f169729E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c31371f = c39451b.f169731x;
            InterfaceC35954a interfaceC35954a2 = c39451b.f169730w;
            try {
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC35954a = interfaceC35954a2;
                    c31371f.getClass();
                    return interfaceC35954a.build();
                } catch (Exception e5) {
                    exc = e5;
                    if (exc instanceof CancellationException) {
                        AbstractC31375j.m96498n(c31371f, "cancelled", Boolean.TRUE);
                        throw exc;
                    }
                    EnumC31370e[] enumC31370eArr = EnumC31370e.f129032w;
                    c31371f.m96484b();
                    AbstractC31375j.m96497m(c31371f, exc);
                    throw exc;
                }
            } catch (Throwable th4) {
                th3 = th4;
                c31371f.getClass();
                throw th3;
            }
        }
        AbstractC34132o.m107864I(obj);
        AbstractC37056f abstractC37056fMo36635b = mo36635b();
        InterfaceC4535j interfaceC4535jMo36632A = abstractC37056fMo36635b.mo36632A();
        C26676f c26676f = null;
        InterfaceC25523e interfaceC25523e = abstractC37056fMo36635b instanceof InterfaceC25523e ? (InterfaceC25523e) abstractC37056fMo36635b : null;
        if (interfaceC25523e == null || (interfaceC25526hMo36647l = interfaceC25523e.mo36647l()) == null) {
            InterfaceC25526h.f99937a.getClass();
            interfaceC25526hMo36647l = C25525g.f99936b;
        }
        ((C31377l) interfaceC25526hMo36647l.mo75077d()).getClass();
        EnumC31369d enumC31369d = EnumC31369d.f129029w;
        AbstractC12314q.m34346z(c39451b.getContext());
        C31371f c31371fM96483a = C31376k.f129039a.m96483a("fromEnvironment", C15768i.f59433w, enumC31369d);
        try {
            C25527i c25527i = (C25527i) c39451b.getContext().get(C25527i.f99938x);
            if (c25527i != null && (interfaceC25526hM75078s = c25527i.m75078s()) != null && interfaceC25526hM75078s.mo75076b() != null) {
                c26676f = C26671a.f106051a;
            }
            C30064k c30064k = C30064k.f122676w;
            if (c26676f != null) {
                c26678h = new C26678h(c26676f);
            } else {
                c26678h = (C26678h) c39451b.getContext().get(C26678h.f106054x);
                if (c26678h == null) {
                    c26678h = c30064k;
                }
            }
            InterfaceC30063j interfaceC30063jPlus = new C31374i(c31371fM96483a).plus(c26678h).plus(c30064k);
            C39450a c39450a = new C39450a(c31371fM96483a, null, interfaceC4535jMo36632A, function1, this, abstractC37056fMo36635b);
            c39451b.f169730w = abstractC37056fMo36635b;
            c39451b.f169731x = c31371fM96483a;
            c39451b.f169729E = 1;
            if (AbstractC3006f0.m8705K(interfaceC30063jPlus, c39450a, c39451b) == enumC31071a) {
                return enumC31071a;
            }
            c31371f = c31371fM96483a;
            interfaceC35954a = abstractC37056fMo36635b;
            c31371f.getClass();
            return interfaceC35954a.build();
        } catch (Exception e13) {
            exc = e13;
            c31371f = c31371fM96483a;
            if (exc instanceof CancellationException) {
                AbstractC31375j.m96498n(c31371f, "cancelled", Boolean.TRUE);
                throw exc;
            }
            EnumC31370e[] enumC31370eArr2 = EnumC31370e.f129032w;
            c31371f.m96484b();
            AbstractC31375j.m96497m(c31371f, exc);
            throw exc;
        } catch (Throwable th5) {
            th3 = th5;
            c31371f = c31371fM96483a;
            c31371f.getClass();
            throw th3;
        }
    }
}
