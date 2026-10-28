package sk;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.IntentFilter;
import ch3.C4703q;
import p249jc.C21565a;
import xg3.C38280g;

/* JADX INFO: renamed from: sk.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC32570a {
    static {
        BluetoothAdapter.getDefaultAdapter();
    }

    /* JADX INFO: renamed from: a */
    public static C38280g m101620a(Context context) {
        return C38280g.m122641j(new C4703q(1, context, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"))).m122682x(new C21565a(23));
    }
}
