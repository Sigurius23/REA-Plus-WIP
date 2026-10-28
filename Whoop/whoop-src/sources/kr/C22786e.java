package kr;

import a30.C0280c0;
import a30.C0332w0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import androidx.datastore.preferences.protobuf.InterfaceC1215g;
import at.InterfaceC1978v;
import bc3.InterfaceC3018i0;
import cg3.EnumC4578c;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.Tasks;
import cr.C11078p;
import dg3.C12012a;
import dg3.InterfaceC12013b;
import h20.C16689l1;
import java.io.Serializable;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p023ay.C2129d;
import p073cq.C11052u;
import p073cq.InterfaceC11039h;
import p095dp.InterfaceC12237a;
import p123en.InterfaceC13359f;
import p148fg.C14431a;
import p148fg.C14432b;
import p148fg.C14435e;
import p257jq.AbstractC21885a;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p565vy.InterfaceC36562b;
import p588wm.C37370l;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37374p;
import p598wy.InterfaceC37689b;
import p607x8.AbstractC38065t;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32410a;
import v00.C35484p;
import vg.InterfaceC35960g;
import wb3.AbstractC37056f;
import x43.AbstractC37978j;
import y00.C38793c;
import y00.C38915o4;
import y00.C38977v3;
import y00.C39013z3;
import y00.EnumC38863j;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: kr.e */
/* JADX INFO: loaded from: classes6.dex */
public class C22786e implements InterfaceC1215g, InterfaceC1978v, InterfaceC37689b, InterfaceC11039h, InterfaceC12013b, InterfaceC13359f, InterfaceC35960g {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ C22786e f89708x = new C22786e(18);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89709w;

    public /* synthetic */ C22786e(int i13) {
        this.f89709w = i13;
    }

    /* JADX INFO: renamed from: b */
    public static final Map m65995b(List list) {
        if (list.isEmpty()) {
            list = null;
        }
        Map mapM73989X = list != null ? AbstractC25247g0.m73989X(new C23465k("expand", list)) : null;
        return mapM73989X == null ? C25272z.f99163w : mapM73989X;
    }

    /* JADX INFO: renamed from: c */
    public static C22786e m65996c(Context context, int i13) {
        AbstractC37056f.m118990m(i13 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i13, AbstractC21885a.f84563w);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 4);
        AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 9);
        AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C22792k.m66025a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C22782a(0)).m66021a();
        typedArrayObtainStyledAttributes.recycle();
        C22786e c22786e = new C22786e(19);
        AbstractC37056f.m118991n(rect.left);
        AbstractC37056f.m118991n(rect.top);
        AbstractC37056f.m118991n(rect.right);
        AbstractC37056f.m118991n(rect.bottom);
        return c22786e;
    }

    /* JADX INFO: renamed from: j */
    public static String m65997j(String str) {
        return AbstractC11266d.m30461o("https://api.stripe.com/v1/", str);
    }

    /* JADX INFO: renamed from: n */
    public static String m65998n(String str, Object... objArr) {
        Locale locale = Locale.ENGLISH;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return m65997j(String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1215g
    /* JADX INFO: renamed from: a */
    public byte[] mo3806a(byte[] bArr, int i13, int i14) {
        return Arrays.copyOfRange(bArr, i13, i14 + i13);
    }

    @Override // p123en.InterfaceC13359f
    /* JADX INFO: renamed from: d */
    public InterfaceC37374p mo2199d() {
        return new C37370l(-9223372036854775807L);
    }

    @Override // p123en.InterfaceC13359f, p362oa.InterfaceC27750d
    /* JADX INFO: renamed from: e */
    public void mo2200e(long j7) {
    }

    @Override // at.InterfaceC1978v
    /* JADX INFO: renamed from: f */
    public Object mo6029f(String str, Provider provider) {
        switch (this.f89709w) {
            case 7:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 8:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 9:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // vg.InterfaceC35960g
    /* JADX INFO: renamed from: g */
    public Object mo56533g(Function1 function1) {
        C14431a c14431a = new C14431a();
        function1.invoke(c14431a);
        return new C14435e(new C14432b(c14431a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public Serializable m65999h(List list, C0332w0 c0332w0, AbstractC32269c abstractC32269c) {
        C0280c0 c0280c0;
        boolean zMo112183F;
        String upperCase;
        boolean zContains;
        C38793c c38793c;
        String str;
        if (abstractC32269c instanceof C0280c0) {
            c0280c0 = (C0280c0) abstractC32269c;
            int i13 = c0280c0.f986z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0280c0.f986z = i13 - Integer.MIN_VALUE;
            } else {
                c0280c0 = new C0280c0(this, abstractC32269c);
            }
        } else {
            c0280c0 = new C0280c0(this, abstractC32269c);
        }
        Object objM101049s = c0280c0.f984x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0280c0.f986z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM101049s);
            InterfaceC3018i0 interfaceC3018i0 = (InterfaceC3018i0) c0332w0.f1166G;
            String str2 = (String) c0332w0.f1170z;
            C35484p c35484p = (C35484p) c0332w0.f1169y;
            boolean z4 = c35484p != null ? c35484p.f151062z : false;
            c0280c0.f983w = c0332w0;
            c0280c0.f986z = 1;
            objM101049s = AbstractC32410a.m101049s(list, interfaceC3018i0, z4, str2, c0280c0);
            if (objM101049s == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0332w0 = c0280c0.f983w;
            AbstractC34132o.m107864I(objM101049s);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objM101049s) {
            C38915o4 c38915o4 = (C38915o4) obj;
            C39013z3 c39013z3 = c38915o4.f167514H;
            if (c39013z3 != null) {
                InterfaceC35322b interfaceC35322b = (InterfaceC35322b) c0332w0.f1165F;
                C33647p c33647p = EnumC38863j.f167290x;
                String str3 = c39013z3.f167912G;
                c33647p.getClass();
                zMo112183F = interfaceC35322b.mo112183F(C33647p.m106269k(str3));
            } else {
                zMo112183F = true;
            }
            if (((InterfaceC35320a) c0332w0.f1164E).mo112178l0(c38915o4) && zMo112183F) {
                C16689l1 billingDetailsCollectionConfiguration = (C16689l1) c0332w0.f1168x;
                AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                Set setM47249b = billingDetailsCollectionConfiguration.m47249b();
                if (setM47249b.isEmpty()) {
                    zContains = true;
                } else {
                    C38977v3 c38977v3 = c38915o4.f167512F;
                    if (c38977v3 == null || (c38793c = c38977v3.f167773w) == null || (str = c38793c.f166961x) == null) {
                        upperCase = null;
                    } else {
                        upperCase = str.toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    }
                    zContains = upperCase != null ? setM47249b.contains(upperCase) : false;
                }
                if (zContains) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // p073cq.InterfaceC11039h
    /* JADX INFO: renamed from: i */
    public /* synthetic */ C11052u mo8623i(Object obj) {
        int i13 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return Tasks.m15640d(null);
    }

    @Override // p123en.InterfaceC13359f
    /* JADX INFO: renamed from: k */
    public long mo2204k(InterfaceC37368j interfaceC37368j) {
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0158  */
    /* JADX WARN: Code duplicated, block: B:134:0x015d  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da A[FALL_THROUGH] */
    @Override // dg3.InterfaceC12013b
    /* JADX INFO: renamed from: l */
    public C12012a mo33146l(CharSequence charSequence, int i13, int i14) {
        char c3;
        char c7;
        int i15;
        char c14;
        boolean z4;
        char cCharAt;
        int i16 = i13;
        switch (this.f89709w) {
            case 21:
                int i17 = i16 - 1;
                boolean z13 = true;
                int i18 = -1;
                while (true) {
                    c3 = '9';
                    c7 = '-';
                    if (i17 >= i14) {
                        char cCharAt2 = charSequence.charAt(i17);
                        if ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < 'a' || cCharAt2 > 'z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 >= 128 || cCharAt2 == '!' || cCharAt2 == '-' || cCharAt2 == '/' || cCharAt2 == '=' || cCharAt2 == '?' || cCharAt2 == '*' || cCharAt2 == '+'))) {
                            switch (cCharAt2) {
                                default:
                                    switch (cCharAt2) {
                                        default:
                                            switch (cCharAt2) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    break;
                                                default:
                                                    if (cCharAt2 == '.' && !z13) {
                                                        z13 = true;
                                                    }
                                                    break;
                                            }
                                        case '^':
                                        case '_':
                                        case '`':
                                            i18 = i17;
                                            z13 = false;
                                            continue;
                                    }
                                case '#':
                                case '$':
                                case '%':
                                case '&':
                                case '\'':
                                    i18 = i17;
                                    z13 = false;
                                    continue;
                            }
                        } else {
                            i18 = i17;
                            z13 = false;
                            continue;
                        }
                        i17--;
                    }
                }
                if (i18 != -1) {
                    int i19 = i16 + 1;
                    boolean z14 = false;
                    boolean z15 = true;
                    int i24 = -1;
                    int i25 = -1;
                    while (i19 < charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i19);
                        if (z15) {
                            if ((cCharAt3 < 'A' || cCharAt3 > 'Z') && ((cCharAt3 < 'a' || cCharAt3 > 'z') && ((cCharAt3 < '0' || cCharAt3 > c3) && cCharAt3 < 128))) {
                                if (i24 != -1 || i24 > i25) {
                                    i15 = -1;
                                } else {
                                    i15 = i25;
                                }
                                if (i15 != -1) {
                                    return new C12012a(EnumC4578c.f18439x, i18, i15 + 1);
                                }
                            } else {
                                i25 = i19;
                                c14 = c3;
                                z15 = false;
                                z4 = true;
                                i19++;
                                c3 = c14;
                                z14 = z4;
                                c7 = '-';
                            }
                        } else if (cCharAt3 != '.') {
                            if (cCharAt3 == c7) {
                                z4 = false;
                                c14 = '9';
                            } else {
                                if ((cCharAt3 < 'A' || cCharAt3 > 'Z') && (cCharAt3 < 'a' || cCharAt3 > 'z')) {
                                    c14 = '9';
                                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                                        if (cCharAt3 < 128) {
                                            if (i24 != -1) {
                                                i15 = -1;
                                            } else {
                                                i15 = -1;
                                            }
                                            if (i15 != -1) {
                                                return new C12012a(EnumC4578c.f18439x, i18, i15 + 1);
                                            }
                                        }
                                    }
                                    i25 = i19;
                                    z4 = true;
                                } else {
                                    c14 = '9';
                                }
                                i25 = i19;
                                z4 = true;
                            }
                            i19++;
                            c3 = c14;
                            z14 = z4;
                            c7 = '-';
                        } else if (z14) {
                            if (i24 == -1) {
                                i24 = i19;
                            }
                            z4 = z14;
                            z15 = true;
                            c14 = '9';
                            i19++;
                            c3 = c14;
                            z14 = z4;
                            c7 = '-';
                        } else {
                            if (i24 != -1) {
                                i15 = -1;
                            } else {
                                i15 = -1;
                            }
                            if (i15 != -1) {
                                return new C12012a(EnumC4578c.f18439x, i18, i15 + 1);
                            }
                        }
                    }
                    if (i24 != -1) {
                        i15 = -1;
                    } else {
                        i15 = -1;
                    }
                    if (i15 != -1) {
                        return new C12012a(EnumC4578c.f18439x, i18, i15 + 1);
                    }
                }
                return null;
            default:
                int i26 = i16 + 4;
                if (i26 < charSequence.length() && charSequence.charAt(i16 + 1) == 'w' && charSequence.charAt(i16 + 2) == 'w' && charSequence.charAt(i16 + 3) == '.') {
                    if (i16 != i14 && ((cCharAt = charSequence.charAt(i16 - 1)) == '.' || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= '0' && cCharAt <= '9'))))) {
                        i16 = -1;
                    }
                    if (i16 != -1) {
                        int iM121663x = AbstractC37978j.m121663x(i26, charSequence);
                        if (iM121663x == -1) {
                            iM121663x = -1;
                        } else {
                            int i27 = iM121663x;
                            while (true) {
                                i27--;
                                if (i27 > i26) {
                                    if (charSequence.charAt(i27) != '.' || i27 <= i26) {
                                    }
                                }
                            }
                            iM121663x = -1;
                        }
                        if (iM121663x != -1) {
                            return new C12012a(EnumC4578c.f18440y, i16, iM121663x + 1);
                        }
                    }
                }
                return null;
        }
    }

    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public InterfaceC36562b mo8011m(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("client_secret");
        AbstractC22676k.m65747g(strOptString);
        if (AbstractC39414r.m125890i0(strOptString)) {
            strOptString = null;
        }
        if (strOptString == null) {
            return null;
        }
        return new C2129d(strOptString);
    }

    /* JADX INFO: renamed from: o */
    public C11078p m66000o(Context context, String str, InterfaceC12237a interfaceC12237a) {
        C11078p c11078p = new C11078p();
        c11078p.f35038a = 0;
        c11078p.f35039b = 0;
        c11078p.f35040c = 0;
        int iMo30617d = interfaceC12237a.mo30617d(context, str, true);
        c11078p.f35039b = iMo30617d;
        if (iMo30617d != 0) {
            c11078p.f35040c = 1;
            return c11078p;
        }
        int iMo30621k = interfaceC12237a.mo30621k(context, str);
        c11078p.f35038a = iMo30621k;
        if (iMo30621k != 0) {
            c11078p.f35040c = -1;
        }
        return c11078p;
    }

    public C22786e() {
        this.f89709w = 14;
        if (AbstractC38065t.f163031a >= 35) {
        }
    }

    public C22786e(Context context) {
        this.f89709w = 15;
    }

    public C22786e(int[] iArr, ValueAnimator valueAnimator) {
        this.f89709w = 20;
    }
}
