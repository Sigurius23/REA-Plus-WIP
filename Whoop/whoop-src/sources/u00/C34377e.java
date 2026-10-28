package u00;

import a13.C0150h;
import a30.C0308l1;
import a30.C0311m1;
import a30.C0314n1;
import al.InterfaceC0955b;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.AbstractC1848z0;
import androidx.room.C1766b;
import androidx.room.C1770c;
import androidx.room.C1774d;
import androidx.room.C1778e;
import at.InterfaceC1978v;
import bc3.AbstractC3006f0;
import bc3.C3033m;
import c93.InterfaceC4339a;
import cg3.EnumC4578c;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.tasks.Tasks;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.whoop.android.R;
import dalvik.system.DelegateLastClassLoader;
import dg3.C12012a;
import dg3.InterfaceC12013b;
import eg.C13152a;
import eg.C13153b;
import eg.C13157f;
import ge3.AbstractC15751g;
import h00.C16520p;
import h00.C16522q;
import h00.C16524r;
import h20.EnumC16701n1;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.List;
import java.util.concurrent.Callable;
import javax.crypto.KeyAgreement;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONObject;
import p023ay.C2127c;
import p034bl.InterfaceC3361a;
import p072cp.BinderC10935b;
import p073cq.C11052u;
import p073cq.InterfaceC11039h;
import p095dp.AbstractC12240d;
import p095dp.C12238b;
import p095dp.C12241e;
import p095dp.C12242f;
import p095dp.C12243g;
import p095dp.InterfaceC12237a;
import p161g.C14899c0;
import p161g.C14901d0;
import p284ko.C22629m;
import p310lp.AbstractC24629h;
import p398p9.InterfaceC28989m;
import p477s2.AbstractC32073e;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p529uo.AbstractC35135w;
import p537ux.C35338j;
import p537ux.EnumC35336i;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p565vy.InterfaceC36562b;
import p586wk.InterfaceC37327e;
import p598wy.InterfaceC37689b;
import p607x8.AbstractC38065t;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29731o;
import q20.EnumC29806a;
import q83.InterfaceC30057d;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import se.AbstractC32417h;
import sz.C33122b0;
import sz.C33124c0;
import vg.InterfaceC35960g;
import x43.AbstractC37978j;
import y00.EnumC38828f4;
import yb3.AbstractC39414r;
import z63.C40132d;

/* JADX INFO: renamed from: u00.e */
/* JADX INFO: loaded from: classes6.dex */
public class C34377e implements InterfaceC0955b, InterfaceC1978v, InterfaceC37689b, InterfaceC3361a, InterfaceC11039h, InterfaceC30062i, InterfaceC12013b, InterfaceC12237a, InterfaceC28989m, InterfaceC35960g {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ C34377e f144465x = new C34377e(18);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144466w;

    public /* synthetic */ C34377e(int i13) {
        this.f144466w = i13;
    }

    /* JADX INFO: renamed from: p */
    public static C0314n1 m108674p(Boolean bool, String str, boolean z4, EnumC29806a enumC29806a, boolean z13, List list, C33124c0 c33124c0, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, boolean z14, List walletsAllowedInHeader, DisplayablePaymentDetails displayablePaymentDetails, boolean z15, InterfaceC35322b cardFundingFilter, InterfaceC35320a cardBrandFilter, int i13) {
        C0311m1 c0311m1;
        C35338j c35338j;
        int i14;
        EnumC35336i enumC35336i;
        AbstractC32417h c16524r;
        DisplayablePaymentDetails displayablePaymentDetails2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : displayablePaymentDetails;
        boolean z16 = (i13 & 4096) != 0 ? false : z15;
        EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
        AbstractC22676k.m65750j(walletsAllowedInHeader, "walletsAllowedInHeader");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
            C29731o c29731oM99744f0 = displayablePaymentDetails2 != null ? AbstractC32073e.m99744f0(displayablePaymentDetails2, z16) : null;
            if (c29731oM99744f0 != null) {
                c16524r = new C16522q(c29731oM99744f0);
            } else {
                c16524r = str != null ? new C16524r(str) : C16520p.f63515a;
            }
            c0311m1 = new C0311m1(c16524r, enumC16701n1);
        } else {
            c0311m1 = null;
        }
        boolean z17 = c33124c0 != null ? c33124c0.f138173G : false;
        List list2 = c33124c0 != null ? c33124c0.f138174H : null;
        if (list2 == null) {
            list2 = C25271y.f99162w;
        }
        if (c33124c0 != null) {
            C33122b0 c33122b0 = c33124c0.f138171E;
            boolean z18 = c33122b0.f138163w;
            int iOrdinal = c33122b0.f138164x.ordinal();
            if (iOrdinal == 0) {
                enumC35336i = EnumC35336i.Min;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC35336i = EnumC35336i.Full;
            }
            c35338j = new C35338j(z18, enumC35336i, c33122b0.f138165y);
        } else {
            c35338j = null;
        }
        C0308l1 c0308l1 = z4 ? new C0308l1(enumC29806a, z17, c35338j, list2) : null;
        if (c0311m1 == null && c0308l1 == null) {
            return null;
        }
        Object objM74146r1 = AbstractC25265s.m74146r1(list);
        C33623c0 c33623c0 = EnumC38828f4.f167088G;
        if (AbstractC22676k.m65745e(objM74146r1, "card") && !z14) {
            i14 = R.string.stripe_paymentsheet_or_pay_with_card;
        } else if (AbstractC25265s.m74146r1(list) != null || z14) {
            i14 = (AbstractC22676k.m65745e(AbstractC25265s.m74146r1(list), "card") && z14) ? R.string.stripe_paymentsheet_or_use_a_card : R.string.stripe_paymentsheet_or_use;
        } else {
            i14 = R.string.stripe_paymentsheet_or_pay_using;
        }
        return new C0314n1(c0311m1, c0308l1, walletsAllowedInHeader, z13, i14, cardFundingFilter, cardBrandFilter, interfaceC4339a, interfaceC4339a2);
    }

    /* JADX INFO: renamed from: q */
    public static C14901d0 m108675q() {
        return new C14901d0(0, 0, 2, C14899c0.f55571y);
    }

    /* JADX INFO: renamed from: t */
    public static Path m108676t(float f13, float f14, float f15, float f16) {
        Path path = new Path();
        path.moveTo(f13, f14);
        path.lineTo(f15, f16);
        return path;
    }

    @Override // al.InterfaceC0955b
    /* JADX INFO: renamed from: a */
    public void mo2430a(int i13) {
    }

    @Override // al.InterfaceC0955b
    /* JADX INFO: renamed from: b */
    public void mo2431b() {
    }

    @Override // p398p9.InterfaceC28989m
    /* JADX INFO: renamed from: c */
    public Object mo36141c(Uri uri, C22629m c22629m) {
        return Long.valueOf(AbstractC38065t.m121899M(new BufferedReader(new InputStreamReader(c22629m)).readLine()));
    }

    @Override // p034bl.InterfaceC3361a
    public void clear() {
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b7 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:10:0x0031, B:12:0x003d, B:52:0x00c0, B:17:0x0046, B:19:0x004d, B:21:0x0053, B:26:0x0059, B:28:0x005d, B:31:0x0066, B:33:0x006e, B:36:0x0075, B:43:0x009f, B:44:0x00a7, B:39:0x007c, B:41:0x0082, B:42:0x0091, B:47:0x00aa, B:50:0x00ad, B:51:0x00b7, B:18:0x0049), top: B:137:0x0031, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x018f  */
    @Override // p095dp.InterfaceC12237a
    /* JADX INFO: renamed from: d */
    public int mo30617d(Context context, String str, boolean z4) {
        int i13;
        Cursor cursor;
        try {
            synchronized (C12238b.class) {
                Boolean bool = C12238b.f40941c;
                boolean z13 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        C12238b.m34032f(classLoader);
                                    } catch (DynamiteModule$LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!C12238b.m34030d(context)) {
                                        return 0;
                                    }
                                    if (C12238b.f40943e) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM34031e = C12238b.m34031e(context, str, z4, true);
                                                String str2 = C12238b.f40942d;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM34067d0 = AbstractC12240d.m34067d0();
                                                    if (classLoaderM34067d0 == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            String str3 = C12238b.f40942d;
                                                            AbstractC35135w.m111094f(str3);
                                                            classLoaderM34067d0 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = C12238b.f40942d;
                                                            AbstractC35135w.m111094f(str4);
                                                            classLoaderM34067d0 = new C12241e(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    C12238b.m34032f(classLoaderM34067d0);
                                                    declaredField.set(null, classLoaderM34067d0);
                                                    C12238b.f40941c = bool2;
                                                    return iM34031e;
                                                }
                                                return iM34031e;
                                            } catch (DynamiteModule$LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                C12238b.f40941c = bool;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e5) {
                        String string = e5.toString();
                        StringBuilder sb4 = new StringBuilder(string.length() + 30);
                        sb4.append("Failed to load module via V2: ");
                        sb4.append(string);
                        Log.w("DynamiteModule", sb4.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return C12238b.m34031e(context, str, z4, false);
                    } catch (DynamiteModule$LoadingException e13) {
                        String message = e13.getMessage();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb5.append("Failed to retrieve remote module version: ");
                        sb5.append(message);
                        Log.w("DynamiteModule", sb5.toString());
                        return 0;
                    }
                }
                C12243g c12243gM34033g = C12238b.m34033g(context);
                try {
                    if (c12243gM34033g == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelM57320c0 = c12243gM34033g.m57320c0(c12243gM34033g.m57322k0(), 6);
                        int i14 = parcelM57320c0.readInt();
                        parcelM57320c0.recycle();
                        if (i14 < 3) {
                            if (i14 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                BinderC10935b binderC10935b = new BinderC10935b(context);
                                Parcel parcelM57322k0 = c12243gM34033g.m57322k0();
                                AbstractC24629h.m71963b(parcelM57322k0, binderC10935b);
                                parcelM57322k0.writeString(str);
                                parcelM57322k0.writeInt(z4 ? 1 : 0);
                                Parcel parcelM57320c1 = c12243gM34033g.m57320c0(parcelM57322k0, 5);
                                i13 = parcelM57320c1.readInt();
                                parcelM57320c1.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                BinderC10935b binderC10935b2 = new BinderC10935b(context);
                                Parcel parcelM57322k1 = c12243gM34033g.m57322k0();
                                AbstractC24629h.m71963b(parcelM57322k1, binderC10935b2);
                                parcelM57322k1.writeString(str);
                                parcelM57322k1.writeInt(z4 ? 1 : 0);
                                Parcel parcelM57320c2 = c12243gM34033g.m57320c0(parcelM57322k1, 3);
                                i13 = parcelM57320c2.readInt();
                                parcelM57320c2.recycle();
                            }
                            return i13;
                        }
                        ThreadLocal threadLocal = C12238b.f40946h;
                        C12242f c12242f = (C12242f) threadLocal.get();
                        if (c12242f != null && (cursor = c12242f.f40955a) != null) {
                            return cursor.getInt(0);
                        }
                        Cursor cursor3 = (Cursor) BinderC10935b.m28987c0(c12243gM34033g.m34092o0(new BinderC10935b(context), str, z4, ((Long) C12238b.f40947i.get()).longValue()));
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    int i15 = cursor3.getInt(0);
                                    if (i15 > 0) {
                                        C12242f c12242f2 = (C12242f) threadLocal.get();
                                        if (c12242f2 == null || c12242f2.f40955a != null) {
                                            z13 = false;
                                        } else {
                                            c12242f2.f40955a = cursor3;
                                        }
                                        cursor2 = z13 ? null : cursor3;
                                    }
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    return i15;
                                }
                            } catch (RemoteException e14) {
                                e = e14;
                                cursor2 = cursor3;
                                String message2 = e.getMessage();
                                StringBuilder sb6 = new StringBuilder(String.valueOf(message2).length() + 42);
                                sb6.append("Failed to retrieve remote module version: ");
                                sb6.append(message2);
                                Log.w("DynamiteModule", sb6.toString());
                                if (cursor2 == null) {
                                    return 0;
                                }
                                cursor2.close();
                                return 0;
                            } catch (Throwable th4) {
                                th = th4;
                                cursor2 = cursor3;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        }
                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                        if (cursor3 == null) {
                            return 0;
                        }
                        cursor3.close();
                        return 0;
                    } catch (RemoteException e15) {
                        e = e15;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            try {
                AbstractC35135w.m111094f(context);
                throw th6;
            } catch (Exception e16) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e16);
                throw th6;
            }
        }
    }

    @Override // al.InterfaceC0955b
    /* JADX INFO: renamed from: e */
    public Bitmap mo2432e(int i13, int i14, Bitmap.Config config) {
        return Bitmap.createBitmap(i13, i14, config);
    }

    @Override // at.InterfaceC1978v
    /* JADX INFO: renamed from: f */
    public Object mo6029f(String str, Provider provider) {
        switch (this.f144466w) {
            case 7:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 8:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // vg.InterfaceC35960g
    /* JADX INFO: renamed from: g */
    public Object mo56533g(Function1 function1) {
        C13152a c13152a = new C13152a();
        function1.invoke(c13152a);
        return new C13157f(new C13153b(c13152a));
    }

    @Override // al.InterfaceC0955b
    /* JADX INFO: renamed from: h */
    public void mo2433h(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p073cq.InterfaceC11039h
    /* JADX INFO: renamed from: i */
    public /* synthetic */ C11052u mo8623i(Object obj) {
        int i13 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return Tasks.m15640d(null);
    }

    @Override // p034bl.InterfaceC3361a
    /* JADX INFO: renamed from: j */
    public void mo9710j(InterfaceC37327e interfaceC37327e, C40132d c40132d) {
    }

    @Override // p095dp.InterfaceC12237a
    /* JADX INFO: renamed from: k */
    public int mo30621k(Context context, String str) {
        return C12238b.m34028a(context, str);
    }

    @Override // dg3.InterfaceC12013b
    /* JADX INFO: renamed from: l */
    public C12012a mo33146l(CharSequence charSequence, int i13, int i14) {
        int iM121663x;
        int i15 = i13 + 3;
        if (i15 >= charSequence.length() || charSequence.charAt(i13 + 1) != '/' || charSequence.charAt(i13 + 2) != '/') {
            return null;
        }
        int i16 = -1;
        int i17 = -1;
        for (int i18 = i13 - 1; i18 >= i14; i18--) {
            char cCharAt = charSequence.charAt(i18);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt != '+' && cCharAt != '-' && cCharAt != '.') {
                        break;
                    }
                } else {
                    i17 = i18;
                }
            } else {
                i16 = i18;
            }
        }
        if (i16 > 0 && i16 - 1 == i17) {
            i16 = -1;
        }
        if (i16 == -1 || (iM121663x = AbstractC37978j.m121663x(i15, charSequence)) == -1) {
            return null;
        }
        return new C12012a(EnumC4578c.f18438w, i16, iM121663x + 1);
    }

    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public InterfaceC36562b mo8011m(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("message");
        AbstractC22676k.m65747g(strOptString);
        if (AbstractC39414r.m125890i0(strOptString)) {
            strOptString = null;
        }
        String strOptString2 = jSONObject.optString("type");
        AbstractC22676k.m65747g(strOptString2);
        if (AbstractC39414r.m125890i0(strOptString2)) {
            strOptString2 = null;
        }
        String strOptString3 = jSONObject.optString("code");
        AbstractC22676k.m65747g(strOptString3);
        return new C2127c(strOptString, strOptString2, AbstractC39414r.m125890i0(strOptString3) ? null : strOptString3);
    }

    @Override // p034bl.InterfaceC3361a
    /* JADX INFO: renamed from: n */
    public File mo9711n(InterfaceC37327e interfaceC37327e) {
        return null;
    }

    @Override // al.InterfaceC0955b
    /* JADX INFO: renamed from: o */
    public Bitmap mo2434o(int i13, int i14, Bitmap.Config config) {
        return Bitmap.createBitmap(i13, i14, config);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public Object m108677r(AbstractC1848z0 abstractC1848z0, CancellationSignal cancellationSignal, Callable callable, InterfaceC30057d interfaceC30057d) {
        C1770c c1770c;
        if (interfaceC30057d instanceof C1770c) {
            c1770c = (C1770c) interfaceC30057d;
            int i13 = c1770c.f6975G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1770c.f6975G = i13 - Integer.MIN_VALUE;
            } else {
                c1770c = new C1770c(this, interfaceC30057d);
            }
        } else {
            c1770c = new C1770c(this, interfaceC30057d);
        }
        Object objM44421A = c1770c.f6973E;
        Object obj = EnumC31071a.f128113w;
        int i14 = c1770c.f6975G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM44421A);
            if (abstractC1848z0.isOpenInternal$room_runtime() && abstractC1848z0.inTransaction()) {
                return callable.call();
            }
            c1770c.f6976w = abstractC1848z0;
            c1770c.f6977x = cancellationSignal;
            c1770c.f6978y = callable;
            c1770c.f6975G = 1;
            objM44421A = AbstractC15751g.m44421A(abstractC1848z0, false, c1770c);
            if (objM44421A != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM44421A);
            return objM44421A;
        }
        callable = c1770c.f6978y;
        cancellationSignal = c1770c.f6977x;
        abstractC1848z0 = c1770c.f6976w;
        AbstractC34132o.m107864I(objM44421A);
        InterfaceC30063j interfaceC30063j = (InterfaceC30063j) objM44421A;
        c1770c.f6976w = abstractC1848z0;
        c1770c.f6977x = cancellationSignal;
        c1770c.f6978y = callable;
        c1770c.f6979z = interfaceC30063j;
        c1770c.f6975G = 2;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c1770c));
        c3033m.m8774s();
        c3033m.m8776u(new C1774d(0, cancellationSignal, AbstractC3006f0.m8732z(abstractC1848z0.getCoroutineScope(), interfaceC30063j, null, new C1778e(callable, c3033m, null, 0), 2)));
        Object objM8773r = c3033m.m8773r();
        return objM8773r == obj ? obj : objM8773r;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public Object m108678s(AbstractC1848z0 abstractC1848z0, boolean z4, Callable callable, InterfaceC30057d interfaceC30057d) throws Throwable {
        C1766b c1766b;
        if (interfaceC30057d instanceof C1766b) {
            c1766b = (C1766b) interfaceC30057d;
            int i13 = c1766b.f6961z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1766b.f6961z = i13 - Integer.MIN_VALUE;
            } else {
                c1766b = new C1766b(this, interfaceC30057d);
            }
        } else {
            c1766b = new C1766b(this, interfaceC30057d);
        }
        Object objM44421A = c1766b.f6959x;
        Object obj = EnumC31071a.f128113w;
        int i14 = c1766b.f6961z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM44421A);
            if (abstractC1848z0.isOpenInternal$room_runtime() && abstractC1848z0.inTransaction()) {
                return callable.call();
            }
            c1766b.f6958w = callable;
            c1766b.f6961z = 1;
            objM44421A = AbstractC15751g.m44421A(abstractC1848z0, z4, c1766b);
            if (objM44421A != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM44421A);
            return objM44421A;
        }
        callable = c1766b.f6958w;
        AbstractC34132o.m107864I(objM44421A);
        C0150h c0150h = new C0150h(callable, null, 1);
        c1766b.f6958w = null;
        c1766b.f6961z = 2;
        Object objM8705K = AbstractC3006f0.m8705K((InterfaceC30063j) objM44421A, c0150h, c1766b);
        return objM8705K == obj ? obj : objM8705K;
    }

    public C34377e(Context context) {
        this.f144466w = 14;
    }

    public C34377e(float f13, float f14) {
        this.f144466w = 28;
    }
}
