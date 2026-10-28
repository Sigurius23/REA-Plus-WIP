package bj;

import b30.C2570m;
import hg3.AbstractC17269i;
import p049cj.C4738d;
import p426qi.C30387i;
import p581we.C37199o;
import p616xi.C38313a;
import p616xi.C38314b;

/* JADX INFO: renamed from: bj.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C3310i {

    /* JADX INFO: renamed from: f */
    public static final C37199o f12878f = C37199o.m119195L("ef");

    /* JADX INFO: renamed from: g */
    public static final C37199o f12879g = C37199o.m119195L("nm", "v");

    /* JADX INFO: renamed from: a */
    public C38313a f12880a;

    /* JADX INFO: renamed from: b */
    public C38314b f12881b;

    /* JADX INFO: renamed from: c */
    public C38314b f12882c;

    /* JADX INFO: renamed from: d */
    public C38314b f12883d;

    /* JADX INFO: renamed from: e */
    public C38314b f12884e;

    /* JADX INFO: renamed from: a */
    public final C2570m m9606a(C4738d c4738d, C30387i c30387i) {
        C38314b c38314b;
        C38314b c38314b2;
        C38314b c38314b3;
        C38314b c38314b4;
        while (c4738d.hasNext()) {
            if (c4738d.mo14824m(f12878f) != 0) {
                c4738d.mo14825s();
                c4738d.skipValue();
            } else {
                c4738d.beginArray();
                while (c4738d.hasNext()) {
                    c4738d.beginObject();
                    String strNextString = "";
                    while (c4738d.hasNext()) {
                        int iMo14824m = c4738d.mo14824m(f12879g);
                        if (iMo14824m == 0) {
                            strNextString = c4738d.nextString();
                        } else if (iMo14824m == 1) {
                            strNextString.getClass();
                            switch (strNextString) {
                                case "Distance":
                                    this.f12883d = AbstractC17269i.m48885c0(c4738d, c30387i, true);
                                    break;
                                case "Opacity":
                                    this.f12881b = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                                    break;
                                case "Direction":
                                    this.f12882c = AbstractC17269i.m48885c0(c4738d, c30387i, false);
                                    break;
                                case "Shadow Color":
                                    this.f12880a = AbstractC17269i.m48883b0(c4738d, c30387i);
                                    break;
                                case "Softness":
                                    this.f12884e = AbstractC17269i.m48885c0(c4738d, c30387i, true);
                                    break;
                                default:
                                    c4738d.skipValue();
                                    break;
                            }
                        } else {
                            c4738d.mo14825s();
                            c4738d.skipValue();
                        }
                    }
                    c4738d.endObject();
                }
                c4738d.endArray();
            }
        }
        C38313a c38313a = this.f12880a;
        if (c38313a == null || (c38314b = this.f12881b) == null || (c38314b2 = this.f12882c) == null || (c38314b3 = this.f12883d) == null || (c38314b4 = this.f12884e) == null) {
            return null;
        }
        return new C2570m(c38313a, c38314b, c38314b2, c38314b3, c38314b4, 1);
    }
}
