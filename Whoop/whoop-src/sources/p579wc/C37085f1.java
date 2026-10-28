package p579wc;

import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import p250jf.AbstractC21636e;
import p250jf.C21632a;
import p319m4.AbstractC25012a;
import p646yd.AbstractC39455f;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pf.InterfaceC29123a;
import vg.InterfaceC35967n;

/* JADX INFO: renamed from: wc.f1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37085f1 {
    /* JADX INFO: renamed from: a */
    public static C37091h1 m119013a(String str, InterfaceC29123a interfaceC29123a, InterfaceC35967n interfaceC35967n) {
        Duration.Companion companion = Duration.INSTANCE;
        long duration = DurationKt.toDuration(900, DurationUnit.SECONDS);
        C21632a c21632a = AbstractC39455f.f169751m;
        Object objM60881b = AbstractC21636e.m60881b(c21632a, interfaceC35967n);
        if (objM60881b == null) {
            StringBuilder sb4 = new StringBuilder("Required field `roleArn` could not be automatically inferred for StsWebIdentityCredentialsProvider. Either explicitly pass a value, set the environment variable `");
            sb4.append(c21632a.f83067c);
            sb4.append("`, or set the JVM system property `");
            throw new ProviderConfigurationException(AbstractC25012a.m73377j(sb4, c21632a.f83066b, '`'), null);
        }
        String str2 = (String) objM60881b;
        C21632a c21632a2 = AbstractC39455f.f169753o;
        Object objM60881b2 = AbstractC21636e.m60881b(c21632a2, interfaceC35967n);
        if (objM60881b2 != null) {
            String str3 = (String) objM60881b2;
            if (str == null) {
                str = (String) AbstractC21636e.m60881b(AbstractC39455f.f169742d, interfaceC35967n);
            }
            return new C37091h1(str2, str3, str, null, duration, interfaceC35967n, interfaceC29123a);
        }
        StringBuilder sb5 = new StringBuilder("Required field `webIdentityTokenFilePath` could not be automatically inferred for StsWebIdentityCredentialsProvider. Either explicitly pass a value, set the environment variable `");
        sb5.append(c21632a2.f83067c);
        sb5.append("`, or set the JVM system property `");
        throw new ProviderConfigurationException(AbstractC25012a.m73377j(sb5, c21632a2.f83066b, '`'), null);
    }
}
