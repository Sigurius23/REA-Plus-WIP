package p658yr;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: yr.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39717d {

    /* JADX INFO: renamed from: a */
    public static final Charset f170956a = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: b */
    public static final Charset f170957b = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: c */
    public static final Charset f170958c = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: d */
    public static final Charset f170959d;

    static {
        Charset charset = StandardCharsets.UTF_16BE;
        Charset charset2 = StandardCharsets.UTF_16LE;
        f170959d = StandardCharsets.UTF_16;
    }
}
