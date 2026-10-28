package p566vz;

import java.util.Map;
import p477s2.AbstractC32069a;
import p555vl.AbstractC36095b;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: vz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36609a implements InterfaceC36611c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f156830w = 1;

    /* JADX INFO: renamed from: x */
    public final String f156831x;

    /* JADX INFO: renamed from: y */
    public final Map f156832y;

    public C36609a(String str, Throwable th3) {
        this.f156831x = str;
        this.f156832y = AbstractC31061c.m95645u("error_message", th3 != null ? th3.getMessage() : null);
    }

    @Override // p566vz.InterfaceC36611c
    /* JADX INFO: renamed from: a */
    public final Map mo117602a() {
        switch (this.f156830w) {
            case 0:
                break;
        }
        return this.f156832y;
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f156830w) {
            case 0:
                return "elements.captcha.passive.attach";
            default:
                return "elements.captcha.passive.error";
        }
    }

    @Override // p566vz.InterfaceC36611c
    /* JADX INFO: renamed from: c */
    public final String mo117603c() {
        switch (this.f156830w) {
            case 0:
                break;
        }
        return this.f156831x;
    }

    @Override // p566vz.InterfaceC36611c
    public final Map getParams() {
        switch (this.f156830w) {
            case 0:
                break;
        }
        return AbstractC32069a.m99685w(this);
    }

    public C36609a(boolean z4, String str) {
        this.f156831x = str;
        this.f156832y = AbstractC36095b.m114688p(Boolean.valueOf(z4), "is_ready");
    }
}
