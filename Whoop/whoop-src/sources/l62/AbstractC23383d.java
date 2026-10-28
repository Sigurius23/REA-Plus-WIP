package l62;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: l62.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Ll62/f;", "referralType", "", "source", "a", "(Ll62/f;Ljava/lang/String;)Ljava/lang/String;", "refer-a-friend_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23383d {
    /* JADX INFO: renamed from: a */
    public static final String m67684a(EnumC23385f referralType, String source) {
        AbstractC22676k.m65750j(referralType, "referralType");
        AbstractC22676k.m65750j(source, "source");
        return AbstractC31061c.m95640p("referral-service/v1/raf-hub?referralType=", referralType.name(), "&source=", source);
    }
}
