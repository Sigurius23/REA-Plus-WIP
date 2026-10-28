package p203hy;

import androidx.core.app.NotificationCompat;
import com.squareup.wire.AbstractC5583n;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;
import y00.EnumC38930q1;

/* JADX INFO: renamed from: hy.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C17717f extends AbstractC17719h {

    /* JADX INFO: renamed from: e */
    public final String f68875e;

    /* JADX INFO: renamed from: f */
    public final String f68876f;

    /* JADX INFO: renamed from: g */
    public final EnumC38930q1 f68877g;

    /* JADX INFO: renamed from: h */
    public final boolean f68878h;

    /* JADX INFO: renamed from: i */
    public final boolean f68879i;

    /* JADX INFO: renamed from: j */
    public final EnumC17715d f68880j;

    /* JADX INFO: renamed from: k */
    public final C17716e f68881k;

    /* JADX INFO: renamed from: l */
    public final boolean f68882l;

    /* JADX INFO: renamed from: m */
    public final String f68883m;

    /* JADX INFO: renamed from: n */
    public final boolean f68884n;

    /* JADX INFO: renamed from: o */
    public final String f68885o;

    /* JADX INFO: renamed from: p */
    public final String f68886p;

    /* JADX INFO: renamed from: q */
    public final String f68887q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17717f(String arbId, String str, EnumC38930q1 experiment, boolean z4, boolean z13, EnumC17715d enumC17715d, C17716e providedDefaultValues, boolean z14, String str2, boolean z15, String elementsSessionId, String mobileSessionId) {
        super(experiment, arbId, str, AbstractC5583n.m16798y(AbstractC25247g0.m73990Y(new C23465k("integration_type", "mpe_android"), new C23465k("is_returning_link_user", String.valueOf(z4)), new C23465k("dvs_provided", AbstractC25265s.m74110N0(AbstractC25260n.m74077r0(new String[]{providedDefaultValues.f68872a ? NotificationCompat.CATEGORY_EMAIL : null, providedDefaultValues.f68873b ? "name" : null, providedDefaultValues.f68874c ? "phone" : null}), " ", null, null, null, 62)), new C23465k("use_link_native", String.valueOf(z13)), new C23465k("recognition_type", enumC17715d == null ? null : NotificationCompat.CATEGORY_EMAIL), new C23465k("has_spms", String.valueOf(z14)), new C23465k("integration_shape", str2), new C23465k("link_displayed", String.valueOf(z15)), new C23465k("mobile_sdk_version", "22.6.1"), new C23465k("elements_session_id", elementsSessionId), new C23465k("mobile_session_id", mobileSessionId))));
        AbstractC22676k.m65750j(arbId, "arbId");
        AbstractC22676k.m65750j(experiment, "experiment");
        AbstractC22676k.m65750j(providedDefaultValues, "providedDefaultValues");
        AbstractC22676k.m65750j(elementsSessionId, "elementsSessionId");
        AbstractC22676k.m65750j(mobileSessionId, "mobileSessionId");
        this.f68875e = arbId;
        this.f68876f = str;
        this.f68877g = experiment;
        this.f68878h = z4;
        this.f68879i = z13;
        this.f68880j = enumC17715d;
        this.f68881k = providedDefaultValues;
        this.f68882l = z14;
        this.f68883m = str2;
        this.f68884n = z15;
        this.f68885o = elementsSessionId;
        this.f68886p = "22.6.1";
        this.f68887q = mobileSessionId;
    }

    @Override // p203hy.AbstractC17719h
    /* JADX INFO: renamed from: a */
    public final String mo50710a() {
        return this.f68875e;
    }

    @Override // p203hy.AbstractC17719h
    /* JADX INFO: renamed from: b */
    public final EnumC38930q1 mo50711b() {
        return this.f68877g;
    }

    @Override // p203hy.AbstractC17719h
    /* JADX INFO: renamed from: c */
    public final String mo50712c() {
        return this.f68876f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17717f)) {
            return false;
        }
        C17717f c17717f = (C17717f) obj;
        return AbstractC22676k.m65745e(this.f68875e, c17717f.f68875e) && AbstractC22676k.m65745e(this.f68876f, c17717f.f68876f) && this.f68877g == c17717f.f68877g && this.f68878h == c17717f.f68878h && this.f68879i == c17717f.f68879i && this.f68880j == c17717f.f68880j && AbstractC22676k.m65745e(this.f68881k, c17717f.f68881k) && this.f68882l == c17717f.f68882l && AbstractC22676k.m65745e(this.f68883m, c17717f.f68883m) && this.f68884n == c17717f.f68884n && AbstractC22676k.m65745e(this.f68885o, c17717f.f68885o) && AbstractC22676k.m65745e(this.f68886p, c17717f.f68886p) && AbstractC22676k.m65745e(this.f68887q, c17717f.f68887q);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f68877g.hashCode() + AbstractC11266d.m30450d(this.f68875e.hashCode() * 31, 31, this.f68876f)) * 31, 31, this.f68878h), 31, this.f68879i);
        EnumC17715d enumC17715d = this.f68880j;
        return this.f68887q.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC2875y.m8289b((this.f68881k.hashCode() + ((iM8289b + (enumC17715d == null ? 0 : enumC17715d.hashCode())) * 31)) * 31, 31, this.f68882l), 31, this.f68883m), 31, this.f68884n), 31, this.f68885o), 31, this.f68886p);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LinkHoldback(arbId=", this.f68875e, ", group=", this.f68876f, ", experiment=");
        sbM32001t.append(this.f68877g);
        sbM32001t.append(", isReturningLinkUser=");
        sbM32001t.append(this.f68878h);
        sbM32001t.append(", useLinkNative=");
        sbM32001t.append(this.f68879i);
        sbM32001t.append(", emailRecognitionSource=");
        sbM32001t.append(this.f68880j);
        sbM32001t.append(", providedDefaultValues=");
        sbM32001t.append(this.f68881k);
        sbM32001t.append(", spmEnabled=");
        sbM32001t.append(this.f68882l);
        sbM32001t.append(", integrationShape=");
        AbstractC38963t7.m124390t(sbM32001t, this.f68883m, ", linkDisplayed=", this.f68884n, ", elementsSessionId=");
        AbstractC11266d.m30444B(sbM32001t, this.f68885o, ", mobileSdkVersion=", this.f68886p, ", mobileSessionId=");
        return AbstractC25012a.m73376i(this.f68887q, ")", sbM32001t);
    }
}
