package p566vz;

import java.util.Map;
import m83.C25272z;
import p477s2.AbstractC32069a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C36610b implements InterfaceC36611c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f156833w;

    /* JADX INFO: renamed from: x */
    public final String f156834x;

    public C36610b(String siteKey, int i13) {
        this.f156833w = i13;
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(siteKey, "siteKey");
                this.f156834x = siteKey;
                break;
            case 2:
                this.f156834x = siteKey;
                break;
            default:
                AbstractC22676k.m65750j(siteKey, "siteKey");
                this.f156834x = siteKey;
                break;
        }
    }

    @Override // p566vz.InterfaceC36611c
    /* JADX INFO: renamed from: a */
    public final Map mo117602a() {
        switch (this.f156833w) {
            case 0:
                break;
            case 1:
                break;
        }
        return C25272z.f99163w;
    }

    @Override // p664yy.InterfaceC39847a
    /* JADX INFO: renamed from: b */
    public final String mo7174b() {
        switch (this.f156833w) {
            case 0:
                return "elements.captcha.passive.execute";
            case 1:
                return "elements.captcha.passive.init";
            default:
                return "elements.captcha.passive.success";
        }
    }

    @Override // p566vz.InterfaceC36611c
    /* JADX INFO: renamed from: c */
    public final String mo117603c() {
        switch (this.f156833w) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f156834x;
    }

    @Override // p566vz.InterfaceC36611c
    public final Map getParams() {
        switch (this.f156833w) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC32069a.m99685w(this);
    }
}
