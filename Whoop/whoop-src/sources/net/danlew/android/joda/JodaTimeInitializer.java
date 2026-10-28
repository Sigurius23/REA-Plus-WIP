package net.danlew.android.joda;

import android.content.Context;
import android.content.IntentFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import ld3.C23869b;
import ld3.C23870c;
import org.joda.time.DateTimeZone;
import p644yb.InterfaceC39377b;

/* JADX INFO: loaded from: classes5.dex */
public class JodaTimeInitializer implements InterfaceC39377b {
    @Override // p644yb.InterfaceC39377b
    public final Object create(Context context) {
        try {
            DateTimeZone.setProvider(new C23869b(context));
            context.getApplicationContext().registerReceiver(new C23870c(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            return new Object();
        } catch (IOException e5) {
            throw new RuntimeException("Could not read ZoneInfoMap. You are probably using Proguard wrong.", e5);
        }
    }

    @Override // p644yb.InterfaceC39377b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
