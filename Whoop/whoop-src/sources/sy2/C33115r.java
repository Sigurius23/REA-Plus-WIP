package sy2;

import android.webkit.WebView;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sy2.r */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33115r implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f138119E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ SurveyProvider f138120F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138121w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f138122x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f138123y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f138124z;

    public /* synthetic */ C33115r(InterfaceC28601c1 interfaceC28601c1, Function1 function1, String str, InterfaceC28601c1 interfaceC28601c2, SurveyProvider surveyProvider, int i13) {
        this.f138121w = i13;
        this.f138122x = interfaceC28601c1;
        this.f138119E = function1;
        this.f138124z = str;
        this.f138123y = interfaceC28601c2;
        this.f138120F = surveyProvider;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f138121w) {
            case 0:
                return AbstractC33117t.m105012z(this.f138122x, this.f138119E, this.f138124z, this.f138123y, this.f138120F, (Integer) obj);
            case 1:
                return AbstractC33117t.m104983D(this.f138122x, this.f138123y, this.f138124z, this.f138119E, this.f138120F, (WebView) obj);
            default:
                return AbstractC33117t.m105011y(this.f138122x, this.f138119E, this.f138124z, this.f138123y, this.f138120F, (String) obj);
        }
    }

    public /* synthetic */ C33115r(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, String str, Function1 function1, SurveyProvider surveyProvider) {
        this.f138121w = 1;
        this.f138122x = interfaceC28601c1;
        this.f138123y = interfaceC28601c2;
        this.f138124z = str;
        this.f138119E = function1;
        this.f138120F = surveyProvider;
    }
}
