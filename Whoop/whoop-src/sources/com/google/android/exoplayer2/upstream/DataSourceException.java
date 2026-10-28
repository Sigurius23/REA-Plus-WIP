package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f20436x = 0;

    /* JADX INFO: renamed from: w */
    public final int f20437w;

    public DataSourceException(int i13) {
        this.f20437w = i13;
    }

    public DataSourceException(int i13, Exception exc) {
        super(exc);
        this.f20437w = i13;
    }

    public DataSourceException(Exception exc, String str, int i13) {
        super(str, exc);
        this.f20437w = i13;
    }
}
