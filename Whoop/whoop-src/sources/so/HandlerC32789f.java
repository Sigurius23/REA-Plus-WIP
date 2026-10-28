package so;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import jp.HandlerC21846d;
import p002a0.C0021f1;

/* JADX INFO: renamed from: so.f */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC32789f extends HandlerC21846d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32785b f136477a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC32789f(C32785b c32785b, Looper looper) {
        super(looper);
        this.f136477a = c32785b;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C32785b c32785b = this.f136477a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C32790g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C32791h) {
                        c32785b.f136472g = (C32791h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c32785b.f136471f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = C32785b.f136465j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c32785b.m102846b(extras, strGroup);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (stringExtra2.startsWith("|")) {
                    String[] strArrSplit = stringExtra2.split("\\|");
                    if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    String str = strArrSplit[2];
                    String strSubstring = strArrSplit[3];
                    if (strSubstring.startsWith(":")) {
                        strSubstring = strSubstring.substring(1);
                    }
                    c32785b.m102846b(intent2.putExtra("error", strSubstring).getExtras(), str);
                    return;
                }
                synchronized (c32785b.f136466a) {
                    int i13 = 0;
                    while (true) {
                        try {
                            C0021f1 c0021f1 = c32785b.f136466a;
                            if (i13 < c0021f1.f50y) {
                                c32785b.m102846b(intent2.getExtras(), (String) c0021f1.m38g(i13));
                                i13++;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
