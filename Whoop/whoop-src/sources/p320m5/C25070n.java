package p320m5;

import java.util.List;

/* JADX INFO: renamed from: m5.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C25070n {

    /* JADX INFO: renamed from: a */
    public final List f98202a;

    public C25070n(List list) {
        this.f98202a = list;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
    }
}
