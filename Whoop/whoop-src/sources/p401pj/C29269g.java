package p401pj;

import android.content.Context;
import android.graphics.Typeface;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import p208i2.AbstractC17918w0;
import p392p3.C28780r;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: pj.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C29269g extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Typeface f118444E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C28780r f118445F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float f118446w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f118447x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f118448y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f118449z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29269g(float f13, long j7, int i13, long j13, Typeface typeface, C28780r c28780r) {
        super(1);
        this.f118446w = f13;
        this.f118447x = j7;
        this.f118448y = i13;
        this.f118449z = j13;
        this.f118444E = typeface;
        this.f118445F = c28780r;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        AbstractC22676k.m65750j(context, "context");
        TextView textView = new TextView(context);
        textView.setTextSize(this.f118446w);
        textView.setTextColor(AbstractC17918w0.m51506H(this.f118447x));
        textView.setTextAlignment(this.f118448y);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinksClickable(true);
        textView.setLinkTextColor(AbstractC17918w0.m51506H(this.f118449z));
        textView.setTypeface(this.f118444E);
        Typeface typefaceCreate = Typeface.create(textView.getTypeface(), this.f118445F.f116547w, false);
        AbstractC22676k.m65749i(typefaceCreate, "create(textView.typeface…fontWeight.weight, false)");
        textView.setTypeface(typefaceCreate);
        return textView;
    }
}
