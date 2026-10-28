package b53;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import p002a0.C0005a0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2743a extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C2743a f10778x;

    /* JADX INFO: renamed from: y */
    public static final C2743a f10779y;

    /* JADX INFO: renamed from: z */
    public static final C2743a f10780z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10781w;

    static {
        int i13 = 0;
        f10778x = new C2743a(i13, 0);
        f10779y = new C2743a(i13, 1);
        f10780z = new C2743a(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2743a(int i13, int i14) {
        super(i13);
        this.f10781w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f10781w) {
            case 0:
                return new C0005a0(300);
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StreamDateFormatter.DATE_FORMAT, Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            default:
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(StreamDateFormatter.DATE_FORMAT_WITHOUT_NANOSECONDS, Locale.US);
                simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat2;
        }
    }
}
