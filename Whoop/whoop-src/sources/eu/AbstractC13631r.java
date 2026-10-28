package eu;

import androidx.lifecycle.EnumC1632v;

/* JADX INFO: renamed from: eu.r */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC13631r {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f48316a;

    static {
        int[] iArr = new int[EnumC1632v.values().length];
        iArr[EnumC1632v.ON_CREATE.ordinal()] = 1;
        iArr[EnumC1632v.ON_START.ordinal()] = 2;
        iArr[EnumC1632v.ON_RESUME.ordinal()] = 3;
        iArr[EnumC1632v.ON_PAUSE.ordinal()] = 4;
        iArr[EnumC1632v.ON_STOP.ordinal()] = 5;
        iArr[EnumC1632v.ON_DESTROY.ordinal()] = 6;
        f48316a = iArr;
    }
}
