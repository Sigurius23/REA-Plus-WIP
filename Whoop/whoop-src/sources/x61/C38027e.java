package x61;

import android.content.Context;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x61.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lx61/e;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/whoop/design/util/TextResource;", "text", "", "a", "(Lcom/whoop/design/util/TextResource;)I", "Landroid/content/Context;", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38027e {

    /* JADX INFO: renamed from: c */
    public static final int f162931c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    public C38027e(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    /* JADX INFO: renamed from: a */
    public final int m121760a(TextResource text) {
        CharSequence charSequenceResolve;
        if (text == null || (charSequenceResolve = text.resolve(this.context)) == null) {
            return 3;
        }
        return charSequenceResolve.length();
    }
}
