package c92;

import android.bluetooth.BluetoothDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import or2.AbstractC28188o1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tt0.AbstractC34156a;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: c92.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroid/bluetooth/BluetoothDevice;", "", "a", "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4337i {
    /* JADX INFO: renamed from: a */
    public static final String m13733a(BluetoothDevice bluetoothDevice) {
        List listM118958J;
        AbstractC22676k.m65750j(bluetoothDevice, "<this>");
        String input = AbstractC34156a.m107933a(bluetoothDevice);
        if (!AbstractC28188o1.m85313c(input) || AbstractC22676k.m65745e(input, "unknown")) {
            return "";
        }
        Pattern patternCompile = Pattern.compile("\\s+");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        AbstractC22676k.m65750j(input, "input");
        AbstractC39414r.m125903v0(0);
        Matcher matcher = patternCompile.matcher(input);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(input.subSequence(iEnd, input.length()).toString());
            listM118958J = arrayList;
        } else {
            listM118958J = AbstractC37056f.m118958J(input.toString());
        }
        if (listM118958J.size() != 2 || !AbstractC22676k.m65745e(listM118958J.get(0), "WHOOP") || !AbstractC28188o1.m85314d((String) listM118958J.get(1))) {
            return "";
        }
        switch (((String) listM118958J.get(1)).charAt(0)) {
            case '3':
                return "Gen3";
            case '4':
                return "Gen4";
            case '5':
                return "Maverick";
            default:
                return "";
        }
    }
}
