package c80;

import com.whoop.activation.iajf.domain.SignUpSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c80.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/activation/iajf/domain/SignUpSource;", "", "a", "(Lcom/whoop/activation/iajf/domain/SignUpSource;)Z", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4300a {
    /* JADX INFO: renamed from: a */
    public static final boolean m13542a(SignUpSource signUpSource) {
        AbstractC22676k.m65750j(signUpSource, "<this>");
        return signUpSource == SignUpSource.IAJF_V2;
    }
}
