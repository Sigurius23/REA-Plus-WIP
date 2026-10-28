package p474s;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: s.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C32025x0 {

    /* JADX INFO: renamed from: a */
    public int f132885a = 0;

    /* JADX INFO: renamed from: b */
    public float f132886b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f132887c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f132888d = -1.0f;

    /* JADX INFO: renamed from: e */
    public int[] f132889e = new int[0];

    /* JADX INFO: renamed from: f */
    public boolean f132890f = false;

    /* JADX INFO: renamed from: g */
    public final TextView f132891g;

    /* JADX INFO: renamed from: h */
    public final Context f132892h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C32025x0(TextView textView) {
        this.f132891g = textView;
        this.f132892h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new C32017v0();
        } else {
            new C32013u0();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int[] m99578a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i13 : iArr) {
                if (i13 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i13)) < 0) {
                    arrayList.add(Integer.valueOf(i13));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i14 = 0; i14 < size; i14++) {
                    iArr2[i14] = ((Integer) arrayList.get(i14)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m99579b() {
        return !(this.f132891g instanceof AppCompatEditText);
    }
}
