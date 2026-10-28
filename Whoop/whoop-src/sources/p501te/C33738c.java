package p501te;

import gf.C15760a;
import gf.C15762c;
import java.util.List;
import m83.C25271y;

/* JADX INFO: renamed from: te.c */
/* JADX INFO: loaded from: classes6.dex */
public class C33738c {

    /* JADX INFO: renamed from: b */
    public static final C15760a f141119b = new C15760a("aws.smithy.kotlin#ClientContext");

    /* JADX INFO: renamed from: c */
    public static final C15760a f141120c = new C15760a("aws.smithy.kotlin#Retryable");

    /* JADX INFO: renamed from: d */
    public static final C15760a f141121d = new C15760a("aws.smithy.kotlin#ThrottlingError");

    /* JADX INFO: renamed from: a */
    public final C15762c f141122a = new C15762c();

    /* JADX INFO: renamed from: a */
    public final C15762c m106620a() {
        return this.f141122a;
    }

    /* JADX INFO: renamed from: b */
    public final List m106621b() {
        List list = (List) this.f141122a.mo33082b(f141119b);
        return list == null ? C25271y.f99162w : list;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m106622c() {
        Boolean bool = (Boolean) this.f141122a.mo33082b(f141120c);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m106623d() {
        Boolean bool = (Boolean) this.f141122a.mo33082b(f141121d);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
