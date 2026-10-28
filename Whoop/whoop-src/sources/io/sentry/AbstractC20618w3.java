package io.sentry;

import io.sentry.rrweb.EnumC20524c;
import io.sentry.rrweb.EnumC20525d;

/* JADX INFO: renamed from: io.sentry.w3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC20618w3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f77156a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f77157b;

    static {
        int[] iArr = new int[EnumC20524c.values().length];
        f77157b = iArr;
        try {
            iArr[EnumC20524c.IncrementalSnapshot.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f77157b[EnumC20524c.Meta.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f77157b[EnumC20524c.Custom.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC20525d.values().length];
        f77156a = iArr2;
        try {
            iArr2[EnumC20525d.MouseInteraction.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f77156a[EnumC20525d.TouchMove.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
