package i63;

import al.AbstractC0954a;
import io.ktor.http.IllegalHeaderNameException;
import io.ktor.http.IllegalHeaderValueException;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: i63.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C18175n extends AbstractC0954a {
    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: E0 */
    public final void mo2417E0(String name) {
        AbstractC22676k.m65750j(name, "name");
        List list = AbstractC18179r.f70507a;
        int i13 = 0;
        int i14 = 0;
        while (i13 < name.length()) {
            char cCharAt = name.charAt(i13);
            int i15 = i14 + 1;
            if (AbstractC22676k.m65751k(cCharAt, 32) <= 0 || AbstractC39414r.m125875T("\"(),/:;<=>?@[\\]{}", cCharAt, false)) {
                throw new IllegalHeaderNameException(name, i14);
            }
            i13++;
            i14 = i15;
        }
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: F0 */
    public final void mo2418F0(String value) {
        AbstractC22676k.m65750j(value, "value");
        List list = AbstractC18179r.f70507a;
        int i13 = 0;
        int i14 = 0;
        while (i13 < value.length()) {
            char cCharAt = value.charAt(i13);
            int i15 = i14 + 1;
            if (AbstractC22676k.m65751k(cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new IllegalHeaderValueException(value, i14);
            }
            i13++;
            i14 = i15;
        }
    }
}
