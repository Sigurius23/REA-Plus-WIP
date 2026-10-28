package iz0;

import androidx.compose.runtime.Composer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p294l3.C23285v0;
import p392p3.C28780r;
import p715kotlin.Metadata;
import x81.C38072d;

/* JADX INFO: renamed from: iz0.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¥\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Liz0/l;", "", "<init>", "()V", "Ll3/v0;", "textStyle", "Li2/x;", "textColor", "linkColor", "blockQuoteLineColor", "Lp3/r;", "strongEmphasisFontWeight", "strongEmphasisColor", "Lp3/n;", "emphasisFontStyle", "emphasisColor", "Liz0/a;", "headingStyles", "tableBorderColor", "Ly3/f;", "tableCellPadding", "tableCellWidth", "", "enableHorizontalScrollOnTable", "enableMailtoAction", "paragraphSpacing", "Liz0/m;", "a", "(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21053l {

    /* JADX INFO: renamed from: a */
    public static final C21053l f79834a = new C21053l();

    /* JADX INFO: renamed from: b */
    public static final int f79835b = 0;

    private C21053l() {
    }

    /* JADX INFO: renamed from: a */
    public final C21054m m58880a(C23285v0 c23285v0, long j7, long j13, long j14, C28780r c28780r, long j15, int i13, long j16, C21042a c21042a, long j17, float f13, float f14, boolean z4, boolean z13, float f15, Composer composer, int i14, int i15, int i16) {
        C28780r c28780r2;
        int i17;
        C21042a c21042a2;
        float f16;
        float f17;
        C23285v0 style = (i16 & 1) != 0 ? C38072d.f163053a.m121952e(composer, 6).getB1().getStyle() : c23285v0;
        long brandWhite = (i16 & 2) != 0 ? C38072d.f163053a.m121949b(composer, 6).getBrandWhite() : j7;
        long strain = (i16 & 4) != 0 ? C38072d.f163053a.m121949b(composer, 6).getStrain() : j13;
        long recovery = (i16 & 8) != 0 ? C38072d.f163053a.m121949b(composer, 6).getRecovery() : j14;
        if ((i16 & 16) != 0) {
            C28780r c28780r3 = C28780r.f116544x;
            c28780r2 = C28780r.f116542I;
        } else {
            c28780r2 = c28780r;
        }
        long brandWhite2 = (i16 & 32) != 0 ? C38072d.f163053a.m121949b(composer, 6).getBrandWhite() : j15;
        int i18 = (i16 & 64) != 0 ? 1 : i13;
        long brandWhite3 = (i16 & 128) != 0 ? C38072d.f163053a.m121949b(composer, 6).getBrandWhite() : j16;
        if ((i16 & 256) != 0) {
            C38072d c38072d = C38072d.f163053a;
            i17 = 6;
            c21042a2 = new C21042a(c38072d.m121952e(composer, 6).getT1(), c38072d.m121952e(composer, 6).getT2(), c38072d.m121952e(composer, 6).getT3(), c38072d.m121952e(composer, 6).getT4());
        } else {
            i17 = 6;
            c21042a2 = c21042a;
        }
        long brandWhite4 = (i16 & 512) != 0 ? C38072d.f163053a.m121949b(composer, i17).getBrandWhite() : j17;
        float f18 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 * 8 : f13;
        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            f16 = 4 * 0;
        } else {
            f16 = f14;
        }
        boolean z14 = (i16 & 4096) != 0 ? false : z4;
        boolean z15 = (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z13;
        if ((i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0) {
            f17 = 8 * 0;
        } else {
            f17 = f15;
        }
        return new C21054m(style, brandWhite, strain, recovery, c28780r2, brandWhite2, i18, brandWhite3, c21042a2, brandWhite4, f18, f16, z14, z15, f17, null);
    }
}
