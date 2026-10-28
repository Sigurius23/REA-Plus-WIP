package tr2;

import android.content.Context;
import java.io.File;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tr2.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Ltr2/l;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "b", "(Landroid/content/Context;)Ljava/io/File;", "", "a", "()Ljava/lang/String;", "cacheDirName", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC34114l {
    /* JADX INFO: renamed from: a */
    String mo107844a();

    /* JADX INFO: renamed from: b */
    default File mo107845b(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return new File(context.getCacheDir(), mo107844a());
    }
}
