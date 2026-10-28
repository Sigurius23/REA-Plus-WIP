package s40;

import android.content.Intent;
import android.os.Bundle;
import p161g.AbstractActivityC14909l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C32132a {

    /* JADX INFO: renamed from: a */
    public final AbstractActivityC14909l f133153a;

    /* JADX INFO: renamed from: b */
    public final Integer f133154b;

    /* JADX INFO: renamed from: c */
    public final AbstractActivityC14909l f133155c;

    public C32132a(AbstractActivityC14909l abstractActivityC14909l, Integer num) {
        this.f133153a = abstractActivityC14909l;
        this.f133154b = num;
        this.f133155c = abstractActivityC14909l;
    }

    /* JADX INFO: renamed from: a */
    public final void m100080a(Class cls, Bundle bundle, int i13) {
        AbstractActivityC14909l abstractActivityC14909l = this.f133153a;
        Intent intentPutExtras = new Intent(abstractActivityC14909l, (Class<?>) cls).putExtras(bundle);
        AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
        abstractActivityC14909l.startActivityForResult(intentPutExtras, i13);
    }
}
