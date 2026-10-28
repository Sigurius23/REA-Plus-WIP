package nz2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: nz2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "Ltr2/n;", "logger", "", "a", "(Lcom/whoop/design/util/TextResource;Ltr2/n;)Ljava/lang/String;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27312f {
    /* JADX INFO: renamed from: a */
    public static final String m82462a(TextResource textResource, InterfaceC34116n logger) {
        CharSequence value;
        String string;
        AbstractC22676k.m65750j(logger, "logger");
        TextResource.C8691e c8691e = textResource instanceof TextResource.C8691e ? (TextResource.C8691e) textResource : null;
        if (c8691e != null && (value = c8691e.getValue()) != null && (string = value.toString()) != null) {
            return string;
        }
        if (textResource == null) {
            return "";
        }
        logger.mo85222m("toPlainString: unexpected TextResource type " + textResource, new AbstractC30556a.a[0]);
        return "";
    }
}
