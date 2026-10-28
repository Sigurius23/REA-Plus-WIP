package pg3;

import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import ce3.C4497a0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.whoop.android.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23797r;
import lb3.AbstractC23811y;
import lb3.C23785l;
import lb3.C23794p0;
import lb3.InterfaceC23760b0;
import lb3.InterfaceC23796q0;
import mb3.AbstractC25390g;
import mb3.C25388e;
import mb3.C25389f;
import mb3.InterfaceC25385b;
import mb3.InterfaceC25386c;
import ne3.InterfaceC26620j;
import no.nordicsemi.android.dfu.DfuBaseService;
import o93.AbstractC27736h;
import ob3.C27791a;
import ob3.EnumC27792b;
import ob3.EnumC27806p;
import ob3.InterfaceC27793c;
import ob3.InterfaceC27794d;
import ob3.InterfaceC27796f;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27798h;
import ob3.InterfaceC27799i;
import ob3.InterfaceC27800j;
import ob3.InterfaceC27801k;
import ob3.InterfaceC27802l;
import ob3.InterfaceC27803m;
import org.json.JSONException;
import org.json.JSONObject;
import p073cq.C11040i;
import p098dt.C12355g;
import p108e4.AbstractC12682p;
import p477s2.AbstractC32073e;
import p507tx.AbstractC34235f;
import p533ut.C35227a;
import p674z8.C40172h;
import p674z8.InterfaceC40169e;
import p674z8.InterfaceC40170f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import so.C32791h;
import ud3.AbstractC34799a1;
import ud3.C34818h0;
import ud3.C34852y0;
import yb3.AbstractC39397a;
import yb3.C39412p;
import za3.C40246a;

/* JADX INFO: renamed from: pg3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C29203o implements InterfaceC29187g, InterfaceC29201n, InterfaceC25385b, InterfaceC40169e {

    /* JADX INFO: renamed from: w */
    public Object f118198w;

    /* JADX INFO: renamed from: x */
    public final Object f118199x;

    public /* synthetic */ C29203o(Object obj, Object obj2) {
        this.f118198w = obj;
        this.f118199x = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: n0 */
    public static C29203o m88698n0(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new C29203o(channel, fileLockLock);
                } catch (IOException e5) {
                    e = e5;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e13) {
                    e = e13;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e14) {
                    e = e14;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e15) {
                e = e15;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e16) {
            e = e16;
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: A */
    public boolean mo74526A(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        return !AbstractC22676k.m65745e(AbstractC25390g.m74487X(mo74557f(interfaceC27797g)), AbstractC25390g.m74487X(mo74570l0(interfaceC27797g)));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: B */
    public /* bridge */ boolean mo74527B(InterfaceC27801k interfaceC27801k) {
        return AbstractC25390g.m74475L(interfaceC27801k);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: C */
    public /* bridge */ boolean mo74528C(InterfaceC27802l interfaceC27802l) {
        return AbstractC25390g.m74517z(interfaceC27802l);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: D */
    public InterfaceC27801k mo74529D(InterfaceC27800j interfaceC27800j, int i13) {
        AbstractC22676k.m65750j(interfaceC27800j, "<this>");
        if (interfaceC27800j instanceof InterfaceC27799i) {
            return AbstractC25390g.m74504m((InterfaceC27797g) interfaceC27800j, i13);
        }
        if (interfaceC27800j instanceof C27791a) {
            E e5 = ((C27791a) interfaceC27800j).get(i13);
            AbstractC22676k.m65749i(e5, "get(...)");
            return (InterfaceC27801k) e5;
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC27800j + ", " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(interfaceC27800j.getClass())).toString());
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: E */
    public /* bridge */ int mo74530E(InterfaceC27802l interfaceC27802l) {
        return AbstractC25390g.m74481R(interfaceC27802l);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: F */
    public InterfaceC27797g mo74531F(InterfaceC27797g interfaceC27797g) {
        return AbstractC25390g.m74480Q(interfaceC27797g);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: G */
    public /* bridge */ InterfaceC27798h mo74532G(InterfaceC27798h interfaceC27798h) {
        EnumC27792b enumC27792b = EnumC27792b.f112043w;
        return AbstractC25390g.m74500i(interfaceC27798h);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: H */
    public boolean mo74533H(InterfaceC27802l c3, InterfaceC27802l c7) {
        AbstractC22676k.m65750j(c3, "c1");
        AbstractC22676k.m65750j(c7, "c2");
        if (!(c3 instanceof InterfaceC23796q0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(c7 instanceof InterfaceC23796q0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (AbstractC25390g.m74490a(c3, c7)) {
            return true;
        }
        InterfaceC23796q0 interfaceC23796q0 = (InterfaceC23796q0) c3;
        InterfaceC23796q0 interfaceC23796q1 = (InterfaceC23796q0) c7;
        Map map = (Map) this.f118198w;
        if (((InterfaceC25386c) this.f118199x).mo39748a(interfaceC23796q0, interfaceC23796q1)) {
            return true;
        }
        if (map == null) {
            return false;
        }
        InterfaceC23796q0 interfaceC23796q2 = (InterfaceC23796q0) map.get(interfaceC23796q0);
        InterfaceC23796q0 interfaceC23796q3 = (InterfaceC23796q0) map.get(interfaceC23796q1);
        if (interfaceC23796q2 == null || !interfaceC23796q2.equals(interfaceC23796q1)) {
            return interfaceC23796q3 != null && interfaceC23796q3.equals(interfaceC23796q0);
        }
        return true;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: I */
    public void mo74534I(InterfaceC27798h interfaceC27798h, InterfaceC27802l interfaceC27802l) {
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: J */
    public /* bridge */ boolean mo74535J(InterfaceC27802l interfaceC27802l) {
        return AbstractC25390g.m74464A(interfaceC27802l);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: K */
    public /* bridge */ InterfaceC27801k mo74536K(InterfaceC27797g interfaceC27797g, int i13) {
        return AbstractC25390g.m74504m(interfaceC27797g, i13);
    }

    @Override // mb3.InterfaceC25385b
    /* JADX INFO: renamed from: L */
    public /* bridge */ AbstractC23763c0 mo74456L(AbstractC23811y abstractC23811y) {
        return AbstractC25390g.m74498g(abstractC23811y);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: M */
    public /* bridge */ InterfaceC27800j mo74537M(InterfaceC27798h interfaceC27798h) {
        return AbstractC25390g.m74494c(interfaceC27798h);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: N */
    public InterfaceC27802l mo74538N(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        InterfaceC27798h interfaceC27798hM74498g = AbstractC25390g.m74498g(interfaceC27797g);
        if (interfaceC27798hM74498g == null) {
            interfaceC27798hM74498g = mo74557f(interfaceC27797g);
        }
        return AbstractC25390g.m74487X(interfaceC27798hM74498g);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: O */
    public /* bridge */ EnumC27792b mo74539O(InterfaceC27794d interfaceC27794d) {
        return AbstractC25390g.m74501j(interfaceC27794d);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: P */
    public boolean mo74540P(InterfaceC27798h interfaceC27798h) {
        return AbstractC25390g.m74468E(AbstractC25390g.m74487X(interfaceC27798h));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: Q */
    public /* bridge */ InterfaceC27797g mo74541Q(InterfaceC27797g interfaceC27797g) {
        return AbstractC25390g.m74493b0(this, interfaceC27797g);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: R */
    public /* bridge */ boolean mo74542R(InterfaceC27797g interfaceC27797g) {
        return AbstractC25390g.m74470G(interfaceC27797g);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: S */
    public InterfaceC27801k mo74543S(InterfaceC27798h interfaceC27798h, int i13) {
        if (i13 < 0 || i13 >= AbstractC25390g.m74492b(interfaceC27798h)) {
            return null;
        }
        return AbstractC25390g.m74504m(interfaceC27798h, i13);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: T */
    public /* bridge */ InterfaceC27802l mo74544T(InterfaceC27798h interfaceC27798h) {
        return AbstractC25390g.m74487X(interfaceC27798h);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: U */
    public void mo74545U(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        AbstractC25390g.m74497f(interfaceC27797g);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: V */
    public /* bridge */ boolean mo74546V(InterfaceC27798h interfaceC27798h, InterfaceC27798h interfaceC27798h2) {
        return AbstractC25390g.m74515x(interfaceC27798h, interfaceC27798h2);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: W */
    public boolean mo74547W(AbstractC23773f1 abstractC23773f1) {
        AbstractC22676k.m65750j(abstractC23773f1, "<this>");
        return AbstractC25390g.m74470G(mo74557f(abstractC23773f1)) != AbstractC25390g.m74470G(mo74570l0(abstractC23773f1));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: X */
    public /* bridge */ Collection mo74548X(InterfaceC27798h interfaceC27798h) {
        return AbstractC25390g.m74482S(this, interfaceC27798h);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: Y */
    public int mo74549Y(InterfaceC27800j interfaceC27800j) {
        AbstractC22676k.m65750j(interfaceC27800j, "<this>");
        if (interfaceC27800j instanceof InterfaceC27798h) {
            return AbstractC25390g.m74492b((InterfaceC27797g) interfaceC27800j);
        }
        if (interfaceC27800j instanceof C27791a) {
            return ((C27791a) interfaceC27800j).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC27800j + ", " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(interfaceC27800j.getClass())).toString());
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: Z */
    public /* bridge */ InterfaceC27797g mo74550Z(InterfaceC27801k interfaceC27801k) {
        return AbstractC25390g.m74509r(this, interfaceC27801k);
    }

    @Override // mb3.InterfaceC25385b, ob3.InterfaceC27805o
    /* JADX INFO: renamed from: a */
    public /* bridge */ AbstractC23763c0 mo74457a(InterfaceC27796f interfaceC27796f) {
        return AbstractC25390g.m74489Z(interfaceC27796f);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: a0 */
    public /* bridge */ void mo74551a0(InterfaceC27798h interfaceC27798h) {
        AbstractC25390g.m74476M(interfaceC27798h);
    }

    @Override // pg3.InterfaceC29187g
    public Object adapt(InterfaceC29182e interfaceC29182e) {
        Executor executor = (Executor) this.f118199x;
        return executor == null ? interfaceC29182e : new C29207q(executor, interfaceC29182e);
    }

    @Override // mb3.InterfaceC25385b, ob3.InterfaceC27805o
    /* JADX INFO: renamed from: b */
    public /* bridge */ AbstractC23763c0 mo74458b(InterfaceC27796f interfaceC27796f) {
        return AbstractC25390g.m74478O(interfaceC27796f);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: b0 */
    public /* bridge */ boolean mo74552b0(InterfaceC27802l interfaceC27802l) {
        return AbstractC25390g.m74516y(interfaceC27802l);
    }

    @Override // mb3.InterfaceC25385b
    /* JADX INFO: renamed from: c */
    public AbstractC27736h mo74459c() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ InterfaceC27803m mo74553c0(InterfaceC27802l interfaceC27802l, int i13) {
        return AbstractC25390g.m74506o(interfaceC27802l, i13);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    @Override // pg3.InterfaceC29201n
    public Object convert(Object obj) {
        Charset charsetM109889a;
        AbstractC34799a1 abstractC34799a1 = (AbstractC34799a1) obj;
        Gson gson = (Gson) this.f118198w;
        C34852y0 c34852y0 = abstractC34799a1.f146523w;
        if (c34852y0 == null) {
            InterfaceC26620j interfaceC26620jMo1940d1 = abstractC34799a1.mo1940d1();
            C34818h0 c34818h0Mo1942k = abstractC34799a1.mo1942k();
            if (c34818h0Mo1942k != null) {
                C39412p c39412p = C34818h0.f146589e;
                charsetM109889a = c34818h0Mo1942k.m109889a(null);
                if (charsetM109889a == null) {
                    charsetM109889a = AbstractC39397a.f169546a;
                }
            } else {
                charsetM109889a = AbstractC39397a.f169546a;
            }
            c34852y0 = new C34852y0(interfaceC26620jMo1940d1, charsetM109889a);
            abstractC34799a1.f146523w = c34852y0;
        }
        JsonReader jsonReaderNewJsonReader = gson.newJsonReader(c34852y0);
        try {
            Object obj2 = ((TypeAdapter) this.f118199x).read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            abstractC34799a1.close();
            return obj2;
        } catch (Throwable th3) {
            abstractC34799a1.close();
            throw th3;
        }
    }

    @Override // p674z8.InterfaceC40169e
    public InterfaceC40170f createDataSource() {
        return new C40172h((Context) this.f118198w, ((C4497a0) this.f118199x).createDataSource());
    }

    @Override // mb3.InterfaceC25385b, ob3.InterfaceC27805o
    /* JADX INFO: renamed from: d */
    public /* bridge */ AbstractC23763c0 mo74460d(InterfaceC27798h interfaceC27798h) {
        return AbstractC25390g.m74491a0(interfaceC27798h, true);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: d0 */
    public /* bridge */ boolean mo74554d0(InterfaceC27794d interfaceC27794d) {
        return AbstractC25390g.m74474K(interfaceC27794d);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: e */
    public boolean mo74555e(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        AbstractC23763c0 abstractC23763c0M74498g = AbstractC25390g.m74498g(interfaceC27797g);
        return (abstractC23763c0M74498g != null ? AbstractC25390g.m74495d(this, m88703s0(abstractC23763c0M74498g)) : null) != null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: e0 */
    public /* bridge */ InterfaceC27801k mo74556e0(InterfaceC27797g interfaceC27797g) {
        return AbstractC25390g.m74499h(interfaceC27797g);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: f */
    public InterfaceC27798h mo74557f(InterfaceC27797g interfaceC27797g) {
        AbstractC23763c0 abstractC23763c0M74478O;
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        AbstractC23797r abstractC23797rM74497f = AbstractC25390g.m74497f(interfaceC27797g);
        if (abstractC23797rM74497f != null && (abstractC23763c0M74478O = AbstractC25390g.m74478O(abstractC23797rM74497f)) != null) {
            return abstractC23763c0M74478O;
        }
        AbstractC23763c0 abstractC23763c0M74498g = AbstractC25390g.m74498g(interfaceC27797g);
        AbstractC22676k.m65747g(abstractC23763c0M74498g);
        return abstractC23763c0M74498g;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: f0 */
    public boolean mo74558f0(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        AbstractC23763c0 abstractC23763c0M74498g = AbstractC25390g.m74498g(interfaceC27797g);
        return (abstractC23763c0M74498g != null ? AbstractC25390g.m74496e(abstractC23763c0M74498g) : null) != null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: g */
    public /* bridge */ int mo74559g(InterfaceC27797g interfaceC27797g) {
        return AbstractC25390g.m74492b(interfaceC27797g);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: g0 */
    public boolean mo74560g0(InterfaceC27794d interfaceC27794d) {
        return interfaceC27794d instanceof C40246a;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: h */
    public boolean mo74561h(InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
        return AbstractC25390g.m74471H(mo74538N(interfaceC27798h)) && !AbstractC25390g.m74472I(interfaceC27798h);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: h0 */
    public /* bridge */ InterfaceC27798h mo74562h0(InterfaceC27797g interfaceC27797g) {
        return AbstractC25390g.m74498g(interfaceC27797g);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: i */
    public /* bridge */ EnumC27806p mo74563i(InterfaceC27801k interfaceC27801k) {
        return AbstractC25390g.m74511t(interfaceC27801k);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: i0 */
    public InterfaceC27794d mo74564i0(InterfaceC27798h interfaceC27798h) {
        return AbstractC25390g.m74495d(this, m88703s0(interfaceC27798h));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: j */
    public boolean mo74565j(InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
        return AbstractC25390g.m74517z(AbstractC25390g.m74487X(interfaceC27798h));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: j0 */
    public /* bridge */ boolean mo74566j0(InterfaceC27797g interfaceC27797g) {
        return AbstractC25390g.m74466C(interfaceC27797g);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: k */
    public /* bridge */ InterfaceC27793c mo74567k(InterfaceC27794d interfaceC27794d) {
        return AbstractC25390g.m74488Y(interfaceC27794d);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: k0 */
    public /* bridge */ InterfaceC27797g mo74568k0(InterfaceC27794d interfaceC27794d) {
        return AbstractC25390g.m74479P(interfaceC27794d);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: l */
    public /* bridge */ EnumC27806p mo74569l(InterfaceC27803m interfaceC27803m) {
        return AbstractC25390g.m74512u(interfaceC27803m);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: l0 */
    public InterfaceC27798h mo74570l0(InterfaceC27797g interfaceC27797g) {
        AbstractC23763c0 abstractC23763c0M74489Z;
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        AbstractC23797r abstractC23797rM74497f = AbstractC25390g.m74497f(interfaceC27797g);
        if (abstractC23797rM74497f != null && (abstractC23763c0M74489Z = AbstractC25390g.m74489Z(abstractC23797rM74497f)) != null) {
            return abstractC23763c0M74489Z;
        }
        AbstractC23763c0 abstractC23763c0M74498g = AbstractC25390g.m74498g(interfaceC27797g);
        AbstractC22676k.m65747g(abstractC23763c0M74498g);
        return abstractC23763c0M74498g;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: m */
    public boolean mo74571m(InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
        return AbstractC25390g.m74496e(interfaceC27798h) != null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: m0 */
    public /* bridge */ boolean mo74572m0(InterfaceC27802l interfaceC27802l) {
        return AbstractC25390g.m74468E(interfaceC27802l);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: n */
    public /* bridge */ AbstractC32073e mo74573n(InterfaceC27798h interfaceC27798h) {
        return AbstractC25390g.m74485V(this, interfaceC27798h);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: o */
    public boolean mo74575o(InterfaceC27797g receiver) {
        AbstractC22676k.m65750j(receiver, "$receiver");
        return receiver instanceof InterfaceC23760b0;
    }

    /* JADX INFO: renamed from: o0 */
    public File m88699o0() {
        if (((File) this.f118198w) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f118198w) == null) {
                        C12355g c12355g = (C12355g) this.f118199x;
                        c12355g.m34610a();
                        this.f118198w = new File(c12355g.f41519a.getFilesDir(), "PersistedInstallation." + ((C12355g) this.f118199x).m34611c() + ".json");
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return (File) this.f118198w;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: p */
    public /* bridge */ void mo74577p(InterfaceC27798h interfaceC27798h) {
        AbstractC25390g.m74477N(interfaceC27798h);
    }

    /* JADX INFO: renamed from: p0 */
    public String m88700p0(String str) {
        String str2 = (String) this.f118199x;
        Resources resources = (Resources) this.f118198w;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: q */
    public /* bridge */ boolean mo74579q(InterfaceC27803m interfaceC27803m, InterfaceC27802l interfaceC27802l) {
        return AbstractC25390g.m74514w(interfaceC27803m, interfaceC27802l);
    }

    /* JADX INFO: renamed from: q0 */
    public void m88701q0(C35227a c35227a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c35227a.f149823a);
            jSONObject.put("Status", AbstractC12682p.m35485e(c35227a.f149824b));
            jSONObject.put("AuthToken", c35227a.f149825c);
            jSONObject.put("RefreshToken", c35227a.f149826d);
            jSONObject.put("TokenCreationEpochInSecs", c35227a.f149828f);
            jSONObject.put("ExpiresInSecs", c35227a.f149827e);
            jSONObject.put("FisError", c35227a.f149829g);
            C12355g c12355g = (C12355g) this.f118199x;
            c12355g.m34610a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c12355g.f41519a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m88699o0())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: r */
    public /* bridge */ InterfaceC27796f mo74581r(InterfaceC27797g interfaceC27797g) {
        return AbstractC25390g.m74497f(interfaceC27797g);
    }

    /* JADX INFO: renamed from: r0 */
    public C23794p0 m88702r0() {
        return new C23794p0(true, true, this, C25388e.f99473a, C25389f.f99474a);
    }

    @Override // pg3.InterfaceC29187g
    public Type responseType() {
        return (Type) this.f118198w;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: s */
    public /* bridge */ Collection mo74582s(InterfaceC27802l interfaceC27802l) {
        return AbstractC25390g.m74486W(interfaceC27802l);
    }

    /* JADX INFO: renamed from: s0 */
    public InterfaceC27799i m88703s0(InterfaceC27798h interfaceC27798h) {
        AbstractC23763c0 abstractC23763c0;
        C23785l c23785lM74496e = AbstractC25390g.m74496e(interfaceC27798h);
        return (c23785lM74496e == null || (abstractC23763c0 = c23785lM74496e.f94167x) == null) ? (InterfaceC27799i) interfaceC27798h : abstractC23763c0;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: t */
    public /* bridge */ boolean mo74583t(InterfaceC27802l interfaceC27802l) {
        return AbstractC25390g.m74465B(interfaceC27802l);
    }

    /* JADX INFO: renamed from: t0 */
    public C35227a m88704t0() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[DfuBaseService.ERROR_CONNECTION_MASK];
        try {
            FileInputStream fileInputStream = new FileInputStream(m88699o0());
            while (true) {
                try {
                    int i13 = fileInputStream.read(bArr, 0, DfuBaseService.ERROR_CONNECTION_MASK);
                    if (i13 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i13);
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i14 = AbstractC12682p.m35486f(5)[iOptInt];
        if (i14 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i14 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C35227a(strOptString, i14, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: u */
    public /* bridge */ boolean mo74584u(InterfaceC27802l interfaceC27802l) {
        return AbstractC25390g.m74471H(interfaceC27802l);
    }

    /* JADX INFO: renamed from: u0 */
    public void m88705u0() {
        try {
            ((FileLock) this.f118199x).release();
            ((FileChannel) this.f118198w).close();
        } catch (IOException e5) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e5);
        }
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: v */
    public /* bridge */ boolean mo74585v(InterfaceC27802l interfaceC27802l) {
        return AbstractC25390g.m74469F(interfaceC27802l);
    }

    /* JADX INFO: renamed from: v0 */
    public void m88706v0(Status status, boolean z4) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.f118198w;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.f118199x;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z4 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m15603Y(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z4 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C11040i) entry2.getKey()).m29688c(new ApiException(status));
            }
        }
    }

    @Override // mb3.InterfaceC25385b
    /* JADX INFO: renamed from: w */
    public /* bridge */ AbstractC23773f1 mo74461w(InterfaceC27799i interfaceC27799i, InterfaceC27799i interfaceC27799i2) {
        return AbstractC25390g.m74503l(this, interfaceC27799i, interfaceC27799i2);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: x */
    public /* bridge */ InterfaceC27801k mo74586x(InterfaceC27793c interfaceC27793c) {
        return AbstractC25390g.m74483T(interfaceC27793c);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: y */
    public /* bridge */ InterfaceC27794d mo74587y(InterfaceC27799i interfaceC27799i) {
        return AbstractC25390g.m74495d(this, interfaceC27799i);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: z */
    public InterfaceC27797g mo74588z(ArrayList arrayList) {
        return AbstractC34235f.m108209Q(arrayList);
    }

    public C29203o(Context context, int i13) {
        switch (i13) {
            case 10:
                C4497a0 c4497a0 = new C4497a0(3);
                this.f118198w = context.getApplicationContext();
                this.f118199x = c4497a0;
                break;
            default:
                Resources resources = context.getResources();
                this.f118198w = resources;
                this.f118199x = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
        }
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: a */
    public /* bridge */ InterfaceC27798h mo74457a(InterfaceC27796f interfaceC27796f) {
        return AbstractC25390g.m74489Z(interfaceC27796f);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: b */
    public /* bridge */ InterfaceC27798h mo74458b(InterfaceC27796f interfaceC27796f) {
        return AbstractC25390g.m74478O(interfaceC27796f);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: d */
    public /* bridge */ InterfaceC27798h mo74460d(InterfaceC27798h interfaceC27798h) {
        return AbstractC25390g.m74491a0(interfaceC27798h, false);
    }

    public C29203o(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f118198w = new Messenger(iBinder);
            this.f118199x = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f118199x = new C32791h(iBinder);
            this.f118198w = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public C29203o(HashMap map, InterfaceC25386c equalityAxioms) {
        AbstractC22676k.m65750j(equalityAxioms, "equalityAxioms");
        this.f118198w = map;
        this.f118199x = equalityAxioms;
    }

    public C29203o(int i13) {
        switch (i13) {
            case 4:
                this.f118198w = Collections.synchronizedMap(new WeakHashMap());
                this.f118199x = Collections.synchronizedMap(new WeakHashMap());
                break;
            default:
                this.f118198w = new Object();
                this.f118199x = new LinkedHashMap();
                break;
        }
    }

    public C29203o(C12355g c12355g) {
        this.f118199x = c12355g;
    }
}
