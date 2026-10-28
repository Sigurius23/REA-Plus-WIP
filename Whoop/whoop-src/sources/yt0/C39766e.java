package yt0;

import com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsMetadata;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: yt0.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C39766e implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ ConsolePacketsMetadata f171294E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f171295F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171296w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39767f f171297x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f171298y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f171299z;

    public /* synthetic */ C39766e(C39767f c39767f, long j7, long j13, ConsolePacketsMetadata consolePacketsMetadata, int i13, int i14) {
        this.f171296w = i14;
        this.f171297x = c39767f;
        this.f171298y = j7;
        this.f171299z = j13;
        this.f171294E = consolePacketsMetadata;
        this.f171295F = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f171296w) {
            case 0:
                return this.f171297x.m127308q(this.f171298y, this.f171299z, this.f171294E, this.f171295F, (InterfaceC33687a) obj);
            default:
                return this.f171297x.m127310s(this.f171298y, this.f171299z, this.f171294E, this.f171295F, (InterfaceC33687a) obj);
        }
    }
}
