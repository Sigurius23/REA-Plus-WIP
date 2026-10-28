package p320m5;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.p017os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import eu.C13610f;
import p108e4.AbstractC12667a;
import p550vd.AbstractC35902e;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: m5.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C25066j implements OutcomeReceiver {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f98197w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC25063g f98198x;

    public C25066j(C13610f c13610f, C25068l c25068l) {
        this.f98198x = c13610f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x008a A[Catch: FrameworkClassParsingException -> 0x0097, TryCatch #0 {FrameworkClassParsingException -> 0x0097, blocks: (B:24:0x0084, B:26:0x008a, B:27:0x0091, B:28:0x0096), top: B:64:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0091 A[Catch: FrameworkClassParsingException -> 0x0097, TryCatch #0 {FrameworkClassParsingException -> 0x0097, blocks: (B:24:0x0084, B:26:0x008a, B:27:0x0091, B:28:0x0096), top: B:64:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0116  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138 A[Catch: FrameworkClassParsingException -> 0x0145, TryCatch #1 {FrameworkClassParsingException -> 0x0145, blocks: (B:54:0x0132, B:56:0x0138, B:57:0x013f, B:58:0x0144), top: B:65:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x013f A[Catch: FrameworkClassParsingException -> 0x0145, TryCatch #1 {FrameworkClassParsingException -> 0x0145, blocks: (B:54:0x0132, B:56:0x0138, B:57:0x013f, B:58:0x0144), top: B:65:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014c  */
    public final void onError(Throwable th3) {
        Object createCredentialCustomException;
        Object getCredentialCustomException;
        int i13 = this.f98197w;
        InterfaceC25063g interfaceC25063g = this.f98198x;
        switch (i13) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th3;
                AbstractC22676k.m65750j(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                switch (error.getType()) {
                    case "android.credentials.CreateCredentialException.TYPE_USER_CANCELED":
                        createCredentialCustomException = new CreateCredentialCancellationException(error.getMessage());
                    case "android.credentials.CreateCredentialException.TYPE_UNKNOWN":
                        createCredentialCustomException = new CreateCredentialUnknownException(error.getMessage());
                    case "android.credentials.CreateCredentialException.TYPE_INTERRUPTED":
                        createCredentialCustomException = new CreateCredentialInterruptedException(error.getMessage());
                    case "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS":
                        createCredentialCustomException = new CreateCredentialNoCreateOptionException(error.getMessage());
                    default:
                        String type = error.getType();
                        AbstractC22676k.m65749i(type, "error.type");
                        if (AbstractC39421y.m125930O(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            int i14 = CreatePublicKeyCredentialException.f5309w;
                            String type2 = error.getType();
                            AbstractC22676k.m65749i(type2, "error.type");
                            String message = error.getMessage();
                            try {
                                if (!AbstractC39414r.m125876U(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                                    throw new FrameworkClassParsingException();
                                }
                                int i15 = CreatePublicKeyCredentialDomException.f5308x;
                                createCredentialCustomException = AbstractC35902e.m113969k(type2, message);
                            } catch (FrameworkClassParsingException unused) {
                                createCredentialCustomException = new CreateCredentialCustomException(type2, message);
                            }
                        } else {
                            String type3 = error.getType();
                            AbstractC22676k.m65749i(type3, "error.type");
                            createCredentialCustomException = new CreateCredentialCustomException(type3, error.getMessage());
                        }
                }
            default:
                GetCredentialException error2 = (GetCredentialException) th3;
                AbstractC22676k.m65750j(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                switch (error2.getType()) {
                    case "android.credentials.GetCredentialException.TYPE_UNKNOWN":
                        getCredentialCustomException = new GetCredentialUnknownException(error2.getMessage());
                    case "android.credentials.GetCredentialException.TYPE_INTERRUPTED":
                        getCredentialCustomException = new GetCredentialInterruptedException(error2.getMessage());
                    case "android.credentials.GetCredentialException.TYPE_USER_CANCELED":
                        getCredentialCustomException = new GetCredentialCancellationException(error2.getMessage());
                    case "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL":
                        getCredentialCustomException = new NoCredentialException(error2.getMessage());
                    default:
                        String type4 = error2.getType();
                        AbstractC22676k.m65749i(type4, "error.type");
                        if (AbstractC39421y.m125930O(type4, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            int i16 = GetPublicKeyCredentialException.f5311w;
                            String type5 = error2.getType();
                            AbstractC22676k.m65749i(type5, "error.type");
                            String message2 = error2.getMessage();
                            try {
                                if (!AbstractC39421y.m125930O(type5, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                                    throw new FrameworkClassParsingException();
                                }
                                int i17 = GetPublicKeyCredentialDomException.f5310x;
                                getCredentialCustomException = AbstractC36259c.m115667C(type5, message2);
                            } catch (FrameworkClassParsingException unused2) {
                                getCredentialCustomException = new GetCredentialCustomException(type5, message2);
                            }
                        } else {
                            String type6 = error2.getType();
                            AbstractC22676k.m65749i(type6, "error.type");
                            getCredentialCustomException = new GetCredentialCustomException(type6, error2.getMessage());
                        }
                }
        }
    }

    public final void onResult(Object obj) {
        C25059c c25059c;
        AbstractC12667a c25069m;
        switch (this.f98197w) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                AbstractC22676k.m65750j(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                C13610f c13610f = (C13610f) this.f98198x;
                AbstractC22676k.m65749i(response.getData(), "response.data");
                try {
                    c25059c = new C25059c();
                    break;
                } catch (FrameworkClassParsingException unused) {
                    c25059c = new C25059c();
                }
                c13610f.onResult(c25059c);
                return;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                AbstractC22676k.m65750j(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                C13610f c13610f2 = (C13610f) this.f98198x;
                Credential credential = response2.getCredential();
                AbstractC22676k.m65749i(credential, "response.credential");
                String type = credential.getType();
                AbstractC22676k.m65749i(type, "credential.type");
                Bundle data = credential.getData();
                AbstractC22676k.m65749i(data, "credential.data");
                try {
                    if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            AbstractC22676k.m65747g(string);
                            AbstractC22676k.m65747g(string2);
                            c25069m = new C25073q(data, string2);
                        } catch (Exception unused2) {
                            throw new FrameworkClassParsingException();
                        }
                    } else {
                        if (!type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                            throw new FrameworkClassParsingException();
                        }
                        try {
                            String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            AbstractC22676k.m65747g(string3);
                            c25069m = new C25069m(string3, 1, data);
                        } catch (Exception unused3) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    break;
                } catch (FrameworkClassParsingException unused4) {
                    c25069m = new C25069m(type, 0, data);
                }
                c13610f2.onResult(new C25071o(c25069m));
                return;
        }
    }

    public C25066j(C13610f c13610f, C25060d c25060d, C25068l c25068l) {
        this.f98198x = c13610f;
    }
}
