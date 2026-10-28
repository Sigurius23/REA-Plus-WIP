package p734sl0;

import l83.C23465k;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sl0.p0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f¨\u0006\u0014"}, m65681d2 = {"Lsl0/p0;", "", "<init>", "()V", "", "ffEnabled", "", "sourceType", "Li2/t;", "e", "(ZLjava/lang/String;)Li2/t;", "a", "()Li2/t;", "coachBackgroundGradient", "c", "dailyOutlookGradient", "d", "dayInReviewGradient", "b", "coachWrapperBackgroundGradient", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32655p0 {

    /* JADX INFO: renamed from: a */
    public static final C32655p0 f135412a = new C32655p0();

    private C32655p0() {
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC17911t m102117a() {
        return C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(4280824633L))), new C23465k(Float.valueOf(0.34f), new C17919x(AbstractC17918w0.m51517e(4279507229L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4279244056L)))}, 0.0f, Float.POSITIVE_INFINITY, 8);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC17911t m102118b() {
        return C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(1300199935)), new C17919x(AbstractC17918w0.m51515c(643417086)), new C17919x(AbstractC17918w0.m51515c(5882878))), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 2000.0f, 8);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC17911t m102119c() {
        return C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.m51541c(0.5f, AbstractC17918w0.m51517e(4294960066L)))), new C23465k(Float.valueOf(0.3f), new C17919x(C17919x.m51541c(0.3f, AbstractC17918w0.m51517e(4287483391L)))), new C23465k(Float.valueOf(0.5f), new C17919x(AbstractC17918w0.m51517e(4279244056L)))}, 0.0f, Float.POSITIVE_INFINITY, 8);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC17911t m102120d() {
        return C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(1297143295)), new C17919x(AbstractC17918w0.m51515c(1300980479)), new C17919x(AbstractC17918w0.m51515c(445342463)), new C17919x(AbstractC17918w0.m51517e(4279244056L))), (((long) Float.floatToRawIntBits(1000.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 2000.0f, 8);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC17911t m102121e(boolean ffEnabled, String sourceType) {
        AbstractC22676k.m65750j(sourceType, "sourceType");
        if (!ffEnabled) {
            return m102120d();
        }
        if (sourceType.equals("WAKE_UP_REPORT")) {
            return m102119c();
        }
        return sourceType.equals("WIND_DOWN_REPORT") ? m102120d() : m102117a();
    }
}
