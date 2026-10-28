package org.jni_zero;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class JniTestInstancesSnapshot {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Object[] mValues;

    private JniTestInstancesSnapshot(Object[] objArr) {
        this.mValues = objArr;
    }

    public static void clearAllForTesting() {
        restoreSnapshotForTesting(new JniTestInstancesSnapshot(new Object[0]));
    }

    public static void restoreSnapshotForTesting(JniTestInstancesSnapshot jniTestInstancesSnapshot) {
        synchronized (JniTestInstanceHolder.class) {
            try {
                Object[] objArr = jniTestInstancesSnapshot.mValues;
                ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
                int length = objArr.length;
                if (arrayList == null) {
                    return;
                }
                int size = arrayList.size();
                for (int i13 = 0; i13 < length; i13++) {
                    arrayList.get(i13).value = objArr[i13];
                }
                while (length < size) {
                    arrayList.get(length).value = null;
                    length++;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static JniTestInstancesSnapshot snapshotOverridesForTesting() {
        synchronized (JniTestInstanceHolder.class) {
            try {
                ArrayList<JniTestInstanceHolder> arrayList = JniTestInstanceHolder.sAllOverrides;
                if (arrayList == null) {
                    return new JniTestInstancesSnapshot(new Object[0]);
                }
                Object[] objArr = new Object[arrayList.size()];
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    objArr[i13] = arrayList.get(i13).value;
                }
                return new JniTestInstancesSnapshot(objArr);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
