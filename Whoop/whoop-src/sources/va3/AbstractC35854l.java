package va3;

import a33.C0352d;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import au.C2044a;
import au.C2048e;
import au.C2049f;
import au.EnumC2046c;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.whoop.service.network.model.UserSessionDto;
import dm.C12171a;
import dm.C12172b;
import dm.C12173c;
import dm.InterfaceC12175e;
import et.InterfaceC13595a;
import gm.C15988p;
import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.AbstractPolymorphicSerializerKt;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p000.AbstractC30802r;
import p098dt.C12355g;
import p098dt.C12357i;
import p537ux.C35331f0;
import p636y3.AbstractC39170b;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import ro.C31624i;
import tt.C34149c;
import tt.InterfaceC34150d;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37145j;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40542e;
import zd3.C40580x;

/* JADX INFO: renamed from: va3.l */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35854l {
    /* JADX INFO: renamed from: a */
    public static final C35845c m113821a(String str) {
        C35847e c35847e = C35853k.f152632a;
        return new C35845c(C35853k.f152639h, C35850h.m113814e(str));
    }

    /* JADX INFO: renamed from: b */
    public static final C35845c m113822b(String str) {
        C35847e c35847e = C35853k.f152632a;
        return new C35845c(C35853k.f152632a, C35850h.m113814e(str));
    }

    /* JADX INFO: renamed from: c */
    public static final C35845c m113823c(String str) {
        C35847e c35847e = C35853k.f152632a;
        return new C35845c(C35853k.f152634c, C35850h.m113814e(str));
    }

    /* JADX INFO: renamed from: d */
    public static final void m113824d(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C35845c m113825e(C35850h c35850h) {
        C35847e c35847e = C35853k.f152632a;
        C35845c c35845c = C35853k.f152643l;
        return new C35845c(c35845c.f152609a, C35850h.m113814e(c35850h.m113818c().concat(c35845c.m113777f().m113818c())));
    }

    /* JADX INFO: renamed from: f */
    public static final C35845c m113826f(String str) {
        C35847e c35847e = C35853k.f152632a;
        return new C35845c(C35853k.f152633b, C35850h.m113814e(str));
    }

    /* JADX INFO: renamed from: g */
    public static final C35845c m113827g(C35845c c35845c) {
        C35847e c35847e = C35853k.f152632a;
        return new C35845c(C35853k.f152632a, C35850h.m113814e("U".concat(c35845c.m113777f().m113818c())));
    }

    /* JADX INFO: renamed from: h */
    public static void m113828h(Appendable appendable, Object obj, Function1 function1) {
        AbstractC22676k.m65750j(appendable, "<this>");
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m113829i(Closeable closeable, Throwable th3) {
        if (closeable != null) {
            if (th3 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th4) {
                AbstractC29125c.m88530g(th3, th4);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m113830j() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C12355g.m34608b();
            C12355g c12355gM34608b = C12355g.m34608b();
            c12355gM34608b.m34610a();
            Context context = c12355gM34608b.f41519a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC37137b m113831k(AbstractPolymorphicSerializer abstractPolymorphicSerializer, InterfaceC40539b interfaceC40539b, String str) {
        AbstractC22676k.m65750j(abstractPolymorphicSerializer, "<this>");
        InterfaceC37137b interfaceC37137bFindPolymorphicSerializerOrNull = abstractPolymorphicSerializer.findPolymorphicSerializerOrNull(interfaceC40539b, str);
        if (interfaceC37137bFindPolymorphicSerializerOrNull != null) {
            return interfaceC37137bFindPolymorphicSerializerOrNull;
        }
        AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(str, abstractPolymorphicSerializer.getBaseClass());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC37145j m113832l(AbstractPolymorphicSerializer abstractPolymorphicSerializer, InterfaceC40542e encoder, Object value) {
        AbstractC22676k.m65750j(abstractPolymorphicSerializer, "<this>");
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        InterfaceC37145j interfaceC37145jFindPolymorphicSerializerOrNull = abstractPolymorphicSerializer.findPolymorphicSerializerOrNull(encoder, value);
        if (interfaceC37145jFindPolymorphicSerializerOrNull != null) {
            return interfaceC37145jFindPolymorphicSerializerOrNull;
        }
        AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(AbstractC22671h0.f89337a.getOrCreateKotlinClass(value.getClass()), abstractPolymorphicSerializer.getBaseClass());
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: m */
    public static long m113833m(int i13, int i14, int i15, int i16) {
        int i17 = 262142;
        int iMin = Math.min(i15, 262142);
        int iMin2 = i16 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i16, 262142);
        int i18 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i18 >= 8191) {
            if (i18 < 32767) {
                i17 = 65534;
            } else if (i18 < 65535) {
                i17 = 32766;
            } else {
                if (i18 >= 262143) {
                    AbstractC39170b.m124780l(i18);
                    throw new KotlinNothingValueException();
                }
                i17 = 8190;
            }
        }
        return AbstractC39170b.m124769a(Math.min(i17, i13), i14 != Integer.MAX_VALUE ? Math.min(i17, i14) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX INFO: renamed from: n */
    public static long m113834n(int i13, int i14, int i15, int i16) {
        int i17 = 262142;
        int iMin = Math.min(i13, 262142);
        int iMin2 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i14, 262142);
        int i18 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i18 >= 8191) {
            if (i18 < 32767) {
                i17 = 65534;
            } else if (i18 < 65535) {
                i17 = 32766;
            } else {
                if (i18 >= 262143) {
                    AbstractC39170b.m124780l(i18);
                    throw new KotlinNothingValueException();
                }
                i17 = 8190;
            }
        }
        return AbstractC39170b.m124769a(iMin, iMin2, Math.min(i17, i15), i16 != Integer.MAX_VALUE ? Math.min(i17, i16) : Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x0160  */
    /* JADX WARN: Code duplicated, block: B:82:0x016a  */
    /* JADX WARN: Code duplicated, block: B:83:0x016c  */
    /* JADX INFO: renamed from: o */
    public static void m113835o(Intent intent) {
        long j7;
        C12355g c12355gM34608b;
        C12357i c12357i;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        if (m113837q(intent)) {
            m113836p(intent.getExtras(), "_nr");
        }
        int iIntValue = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : m113830j()) {
            InterfaceC12175e interfaceC12175e = (InterfaceC12175e) FirebaseMessaging.f21613l.get();
            if (interfaceC12175e == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            C2048e c2048eM6438a = null;
            str = null;
            String str4 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                C2044a c2044aM6452a = C2048e.m6452a();
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                c2044aM6452a.m6450m(iIntValue);
                c2044aM6452a.m6442e();
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        C12355g c12355gM34608b2 = C12355g.m34608b();
                        try {
                            Object obj2 = C34149c.f143137m;
                            c12355gM34608b2.m34610a();
                            string = (String) Tasks.await(((C34149c) c12355gM34608b2.f41522d.mo1617a(InterfaceC34150d.class)).m107922c());
                        } catch (InterruptedException e5) {
                            e = e5;
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException | ExecutionException e13) {
                        e = e13;
                    }
                }
                c2044aM6452a.m6443f(string);
                C12355g c12355gM34608b3 = C12355g.m34608b();
                c12355gM34608b3.m34610a();
                c2044aM6452a.m6446i(c12355gM34608b3.f41519a.getPackageName());
                c2044aM6452a.m6448k();
                c2044aM6452a.m6445h(C40580x.m131566n(extras) ? EnumC2046c.DISPLAY_NOTIFICATION : EnumC2046c.DATA_MESSAGE);
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                if (string2 != null) {
                    c2044aM6452a.m6444g(string2);
                }
                String string3 = extras.getString("from");
                if (string3 != null && string3.startsWith("/topics/")) {
                    str4 = string3;
                }
                if (str4 != null) {
                    c2044aM6452a.m6449l(str4);
                }
                String string4 = extras.getString("collapse_key");
                if (string4 != null) {
                    c2044aM6452a.m6440c(string4);
                }
                String string5 = extras.getString("google.c.a.m_l");
                if (string5 != null) {
                    c2044aM6452a.m6439b(string5);
                }
                String string6 = extras.getString("google.c.a.c_l");
                if (string6 != null) {
                    c2044aM6452a.m6441d(string6);
                }
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        j7 = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e14) {
                        Log.w("FirebaseMessaging", "error parsing project number", e14);
                        c12355gM34608b = C12355g.m34608b();
                        c12357i = c12355gM34608b.f41521c;
                        c12355gM34608b.m34610a();
                        str = c12357i.f41537e;
                        if (str != null) {
                            try {
                                j7 = Long.parseLong(str);
                            } catch (NumberFormatException e15) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e15);
                                c12355gM34608b.m34610a();
                                str2 = c12357i.f41534b;
                                if (str2.startsWith("1:")) {
                                    strArrSplit = str2.split(":");
                                    if (strArrSplit.length < 2) {
                                        j7 = 0;
                                    } else {
                                        str3 = strArrSplit[1];
                                        if (str3.isEmpty()) {
                                            j7 = 0;
                                        } else {
                                            try {
                                                j7 = Long.parseLong(str3);
                                            } catch (NumberFormatException e16) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e16);
                                                j7 = 0;
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        j7 = Long.parseLong(str2);
                                    } catch (NumberFormatException e17) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e17);
                                        j7 = 0;
                                    }
                                }
                            }
                        } else {
                            c12355gM34608b.m34610a();
                            str2 = c12357i.f41534b;
                            if (str2.startsWith("1:")) {
                                j7 = Long.parseLong(str2);
                            } else {
                                strArrSplit = str2.split(":");
                                if (strArrSplit.length < 2) {
                                    j7 = 0;
                                } else {
                                    str3 = strArrSplit[1];
                                    if (str3.isEmpty()) {
                                        j7 = 0;
                                    } else {
                                        j7 = Long.parseLong(str3);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    c12355gM34608b = C12355g.m34608b();
                    c12357i = c12355gM34608b.f41521c;
                    c12355gM34608b.m34610a();
                    str = c12357i.f41537e;
                    if (str != null) {
                        j7 = Long.parseLong(str);
                    } else {
                        c12355gM34608b.m34610a();
                        str2 = c12357i.f41534b;
                        if (str2.startsWith("1:")) {
                            j7 = Long.parseLong(str2);
                        } else {
                            strArrSplit = str2.split(":");
                            if (strArrSplit.length < 2) {
                                j7 = 0;
                            } else {
                                str3 = strArrSplit[1];
                                if (str3.isEmpty()) {
                                    j7 = 0;
                                } else {
                                    j7 = Long.parseLong(str3);
                                }
                            }
                        }
                    }
                }
                if (j7 > 0) {
                    c2044aM6452a.m6447j(j7);
                }
                c2048eM6438a = c2044aM6452a.m6438a();
            }
            if (c2048eM6438a == null) {
                return;
            }
            try {
                C12172b c12172bM33678a = C12172b.m33678a(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                C0352d c0352dM45131a = ((C15988p) interfaceC12175e).m45131a(C12173c.m33679a(), new C35331f0(17));
                C31624i c31624iM6453a = C2049f.m6453a();
                c31624iM6453a.m97700C(c2048eM6438a);
                c0352dM45131a.m926O(C12171a.m33677a(c31624iM6453a.m97712q(), c12172bM33678a));
            } catch (RuntimeException e18) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e18);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m113836p(Bundle bundle, String str) {
        try {
            C12355g.m34608b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e5) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e5);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e13) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e13);
                }
            }
            String str2 = C40580x.m131566n(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            C12355g c12355gM34608b = C12355g.m34608b();
            c12355gM34608b.m34610a();
            AbstractC30802r.m94771t(c12355gM34608b.f41522d.mo1617a(InterfaceC13595a.class));
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m113837q(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(extras.getString("google.c.a.e"));
    }
}
