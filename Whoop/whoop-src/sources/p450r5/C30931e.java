package p450r5;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import gp.C16027e;
import gp.C16031g;
import gp.C16033h;
import gp.C16035i;
import gp.C16051q;
import gp.EnumC16045n;
import iq.C20816a;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import mp.C25801t0;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p108e4.AbstractC12667a;
import p320m5.C25069m;
import p320m5.C25071o;
import p320m5.C25073q;
import p320m5.InterfaceC25063g;
import p334n5.C26289a;
import p402po.C29393j;
import p414q5.AbstractC29978b;
import p495t5.AbstractC33540a;
import p687zo.AbstractC40909b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: r5.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C30931e extends AbstractC29978b {

    /* JADX INFO: renamed from: e */
    public final Context f127632e;

    /* JADX INFO: renamed from: f */
    public InterfaceC25063g f127633f;

    /* JADX INFO: renamed from: g */
    public Executor f127634g;

    /* JADX INFO: renamed from: h */
    public CancellationSignal f127635h;

    /* JADX INFO: renamed from: i */
    public final ResultReceiverC30930d f127636i;

    public C30931e(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.f127632e = context;
        this.f127636i = new ResultReceiverC30930d(this, new Handler(Looper.getMainLooper()), 0);
    }

    /* JADX WARN: Code duplicated, block: B:94:0x0179 A[Catch: JSONException -> 0x011f, all -> 0x019c, TryCatch #2 {JSONException -> 0x011f, blocks: (B:59:0x0103, B:61:0x010a, B:63:0x0111, B:66:0x0122, B:68:0x0126, B:69:0x012b, B:72:0x0131, B:73:0x0136, B:75:0x013a, B:78:0x0143, B:94:0x0179, B:95:0x017c, B:97:0x0180, B:99:0x018a, B:81:0x014b, B:91:0x016f, B:92:0x0176), top: B:120:0x0103, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0180 A[Catch: JSONException -> 0x011f, all -> 0x019c, TryCatch #2 {JSONException -> 0x011f, blocks: (B:59:0x0103, B:61:0x010a, B:63:0x0111, B:66:0x0122, B:68:0x0126, B:69:0x012b, B:72:0x0131, B:73:0x0136, B:75:0x013a, B:78:0x0143, B:94:0x0179, B:95:0x017c, B:97:0x0180, B:99:0x018a, B:81:0x014b, B:91:0x016f, B:92:0x0176), top: B:120:0x0103, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x018a A[Catch: JSONException -> 0x011f, all -> 0x019c, TRY_LEAVE, TryCatch #2 {JSONException -> 0x011f, blocks: (B:59:0x0103, B:61:0x010a, B:63:0x0111, B:66:0x0122, B:68:0x0126, B:69:0x012b, B:72:0x0131, B:73:0x0136, B:75:0x013a, B:78:0x0143, B:94:0x0179, B:95:0x017c, B:97:0x0180, B:99:0x018a, B:81:0x014b, B:91:0x016f, B:92:0x0176), top: B:120:0x0103, outer: #1 }] */
    /* JADX INFO: renamed from: d */
    public final C25071o m95138d(C29393j c29393j) throws GetCredentialCancellationException, GetPublicKeyCredentialDomException, GetCredentialUnknownException {
        AbstractC12667a c25069m;
        Object obj;
        C16027e c16027e;
        String string;
        C16051q c16051q = c29393j.f119234I;
        String str = c29393j.f119232G;
        String str2 = c29393j.f119235w;
        String str3 = c29393j.f119231F;
        if (str3 != null) {
            AbstractC22676k.m65749i(str2, "response.id");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str3);
            c25069m = new C25073q(bundle, str3);
        } else {
            boolean z4 = false;
            JSONObject jSONObject = null;
            if (str != null) {
                AbstractC22676k.m65749i(str2, "response.id");
                String str4 = c29393j.f119236x;
                if (str4 == null) {
                    str4 = null;
                }
                String str5 = c29393j.f119237y;
                if (str5 == null) {
                    str5 = null;
                }
                String str6 = c29393j.f119238z;
                if (str6 == null) {
                    str6 = null;
                }
                String str7 = c29393j.f119233H;
                if (str7 == null) {
                    str7 = null;
                }
                Uri uri = c29393j.f119230E;
                Uri uri2 = uri != null ? uri : null;
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str2);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str4);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str6);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
                bundle2.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str7);
                bundle2.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri2);
                c25069m = new C20816a("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", 0, bundle2);
                if (str2.length() <= 0) {
                    throw new IllegalArgumentException("id should not be empty");
                }
                if (str.length() <= 0) {
                    throw new IllegalArgumentException("idToken should not be empty");
                }
            } else if (c16051q != null) {
                C16035i c16035i = c16051q.f60704F;
                C16031g c16031g = c16051q.f60703E;
                C16033h c16033h = c16051q.f60710z;
                LinkedHashMap linkedHashMap = AbstractC33540a.f140002a;
                JSONObject jSONObject2 = new JSONObject();
                if (c16033h != null) {
                    obj = c16033h;
                } else if (c16031g != null) {
                    obj = c16031g;
                } else {
                    if (c16035i == null) {
                        throw new IllegalStateException("No response set.");
                    }
                    obj = c16035i;
                }
                if (obj instanceof C16035i) {
                    C16035i c16035i2 = (C16035i) obj;
                    EnumC16045n enumC16045n = c16035i2.f60660w;
                    AbstractC22676k.m65749i(enumC16045n, "authenticatorResponse.errorCode");
                    String str8 = c16035i2.f60661x;
                    C26289a c26289a = (C26289a) AbstractC33540a.f140002a.get(enumC16045n);
                    if (c26289a == null) {
                        throw new GetPublicKeyCredentialDomException(new C26289a(26), AbstractC11266d.m30461o("unknown fido gms exception - ", str8));
                    }
                    if (enumC16045n == EnumC16045n.NOT_ALLOWED_ERR && str8 != null && AbstractC39414r.m125876U(str8, "Unable to get sync account", false)) {
                        throw new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.");
                    }
                    throw new GetPublicKeyCredentialDomException(c26289a, str8);
                }
                if (obj instanceof C16031g) {
                    try {
                        C25801t0 c25801t0 = c16051q.f60709y;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (c25801t0 != null && c25801t0.m76050m().length > 0) {
                                jSONObject3.put("rawId", AbstractC40909b.m132600b(c25801t0.m76050m()));
                            }
                            String str9 = c16051q.f60706H;
                            if (str9 != null) {
                                jSONObject3.put("authenticatorAttachment", str9);
                            }
                            String str10 = c16051q.f60708x;
                            if (str10 != null && c16035i == null) {
                                jSONObject3.put("type", str10);
                            }
                            String str11 = c16051q.f60707w;
                            if (str11 != null) {
                                jSONObject3.put("id", str11);
                            }
                            String str12 = "response";
                            if (c16031g != null) {
                                jSONObject = c16031g.m45344b();
                            } else {
                                if (c16033h != null) {
                                    jSONObject = c16033h.m45345b();
                                } else if (c16035i != null) {
                                    try {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("code", c16035i.f60660w.f60693w);
                                        String str13 = c16035i.f60661x;
                                        if (str13 != null) {
                                            jSONObject.put("message", str13);
                                        }
                                        str12 = "error";
                                    } catch (JSONException e5) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e5);
                                    }
                                }
                                if (jSONObject != null) {
                                    jSONObject3.put(str12, jSONObject);
                                }
                                c16027e = c16051q.f60705G;
                                if (c16027e != null) {
                                    jSONObject3.put("clientExtensionResults", c16027e.m45343b());
                                } else if (z4) {
                                    jSONObject3.put("clientExtensionResults", new JSONObject());
                                }
                                string = jSONObject3.toString();
                                AbstractC22676k.m65749i(string, "publicKeyCred.toJson()");
                            }
                            z4 = true;
                            if (jSONObject != null) {
                                jSONObject3.put(str12, jSONObject);
                            }
                            c16027e = c16051q.f60705G;
                            if (c16027e != null) {
                                jSONObject3.put("clientExtensionResults", c16027e.m45343b());
                            } else if (z4) {
                                jSONObject3.put("clientExtensionResults", new JSONObject());
                            }
                            string = jSONObject3.toString();
                            AbstractC22676k.m65749i(string, "publicKeyCred.toJson()");
                        } catch (JSONException e13) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e13);
                        }
                    } catch (Throwable th3) {
                        throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th3.getMessage());
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                    string = jSONObject2.toString();
                    AbstractC22676k.m65749i(string, "json.toString()");
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", string);
                c25069m = new C25069m(string, 1, bundle3);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                c25069m = null;
            }
        }
        if (c25069m != null) {
            return new C25071o(c25069m);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC25063g m95139e() {
        InterfaceC25063g interfaceC25063g = this.f127633f;
        if (interfaceC25063g != null) {
            return interfaceC25063g;
        }
        AbstractC22676k.m65757q("callback");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final Executor m95140f() {
        Executor executor = this.f127634g;
        if (executor != null) {
            return executor;
        }
        AbstractC22676k.m65757q("executor");
        throw null;
    }
}
