package vq0;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: vq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lvq0/a;", "", "<init>", "()V", "", "sheetHeight", "", "shouldExpandToFullHeight", "a", "(IZ)I", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36277a {
    /* JADX INFO: renamed from: a */
    public final int m115964a(int sheetHeight, boolean shouldExpandToFullHeight) {
        return shouldExpandToFullHeight ? sheetHeight : (int) (((double) sheetHeight) * 0.8d);
    }
}
