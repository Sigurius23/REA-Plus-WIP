package n53;

import yb3.C39408l;
import yb3.C39410n;
import yb3.C39412p;

/* JADX INFO: renamed from: n53.c0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC26313c0 {

    /* JADX INFO: renamed from: a */
    public static final C39412p f104585a = new C39412p("(\\d*)");

    /* JADX INFO: renamed from: b */
    public static final C39412p f104587b = new C39412p("(\\S*) (\\d*) (\\d*) (\\S*) IP(\\d) (\\S*)");

    /* JADX INFO: renamed from: c */
    public static final C39412p f104589c = new C39412p("(.*)");

    /* JADX INFO: renamed from: d */
    public static final C39412p f104591d = new C39412p("(.*)");

    /* JADX INFO: renamed from: e */
    public static final C39412p f104593e = new C39412p("(.*)");

    /* JADX INFO: renamed from: f */
    public static final C39412p f104595f = new C39412p("(.*)");

    /* JADX INFO: renamed from: g */
    public static final C39412p f104597g = new C39412p("(.*)");

    /* JADX INFO: renamed from: h */
    public static final C39412p f104599h = new C39412p("(.*)");

    /* JADX INFO: renamed from: i */
    public static final C39412p f104601i = new C39412p("(.*)");

    /* JADX INFO: renamed from: j */
    public static final C39412p f104603j = new C39412p("(\\d*) (\\d*)");

    /* JADX INFO: renamed from: k */
    public static final C39412p f104605k = new C39412p("IN IP(\\d) (\\S*)");

    /* JADX INFO: renamed from: l */
    public static final C39412p f104607l = new C39412p("(TIAS|AS|CT|RR|RS):(\\d*)");

    /* JADX INFO: renamed from: m */
    public static final C39412p f104609m = new C39412p("(\\w*) (\\d*) ([\\w/]*)(?: (.*))?");

    /* JADX INFO: renamed from: n */
    public static final C39412p f104610n = new C39412p("rtpmap:(\\d*) ([\\w\\-.]*)(?:\\s*/(\\d*)(?:\\s*/(\\S*))?)?");

    /* JADX INFO: renamed from: o */
    public static final C39412p f104611o = new C39412p("fmtp:(\\d*) ([\\S| ]*)");

    /* JADX INFO: renamed from: p */
    public static final C39412p f104612p = new C39412p("control:(.*)");

    /* JADX INFO: renamed from: q */
    public static final C39412p f104613q = new C39412p("rtcp:(\\d*)(?: (\\S*) IP(\\d) (\\S*))?");

    /* JADX INFO: renamed from: r */
    public static final C39412p f104614r = new C39412p("rtcp-fb:(\\*|\\d*) trr-int (\\d*)");

    /* JADX INFO: renamed from: s */
    public static final C39412p f104615s = new C39412p("rtcp-fb:(\\*|\\d*) ([\\w-_]*)(?: ([\\w-_]*))?");

    /* JADX INFO: renamed from: t */
    public static final C39412p f104616t = new C39412p("extmap:(\\d+)(?:/(\\w+))?(?: (urn:ietf:params:rtp-hdrext:encrypt))? (\\S*)(?: (\\S*))?");

    /* JADX INFO: renamed from: u */
    public static final C39412p f104617u = new C39412p("(extmap-allow-mixed)");

    /* JADX INFO: renamed from: v */
    public static final C39412p f104618v = new C39412p("crypto:(\\d*) ([\\w_]*) (\\S*)(?: (\\S*))?");

    /* JADX INFO: renamed from: w */
    public static final C39412p f104619w = new C39412p("setup:(\\w*)");

    /* JADX INFO: renamed from: x */
    public static final C39412p f104620x = new C39412p("connection:(new|existing)");

    /* JADX INFO: renamed from: y */
    public static final C39412p f104621y = new C39412p("mid:([^\\s]*)");

    /* JADX INFO: renamed from: z */
    public static final C39412p f104622z = new C39412p("msid:(.*)");

    /* JADX INFO: renamed from: A */
    public static final C39412p f104559A = new C39412p("ptime:(\\d*(?:\\.\\d*)*)");

    /* JADX INFO: renamed from: B */
    public static final C39412p f104560B = new C39412p("maxptime:(\\d*(?:\\.\\d*)*)");

    /* JADX INFO: renamed from: C */
    public static final C39412p f104561C = new C39412p("(sendrecv|recvonly|sendonly|inactive)");

    /* JADX INFO: renamed from: D */
    public static final C39412p f104562D = new C39412p("(ice-lite)");

    /* JADX INFO: renamed from: E */
    public static final C39412p f104563E = new C39412p("ice-ufrag:(\\S*)");

    /* JADX INFO: renamed from: F */
    public static final C39412p f104564F = new C39412p("ice-pwd:(\\S*)");

    /* JADX INFO: renamed from: G */
    public static final C39412p f104565G = new C39412p("fingerprint:(\\S*) (\\S*)");

    /* JADX INFO: renamed from: H */
    public static final C39412p f104566H = new C39412p("candidate:(\\S*) (\\d*) (\\S*) (\\d*) (\\S*) (\\d*) typ (\\S*)(?: raddr (\\S*) rport (\\d*))?(?: tcptype (\\S*))?(?: generation (\\d*))?(?: network-id (\\d*))?(?: network-cost (\\d*))?");

    /* JADX INFO: renamed from: I */
    public static final C39412p f104567I = new C39412p("(end-of-candidates)");

    /* JADX INFO: renamed from: J */
    public static final C39412p f104568J = new C39412p("remote-candidates:(.*)");

    /* JADX INFO: renamed from: K */
    public static final C39412p f104569K = new C39412p("ice-options:(\\S*)");

    /* JADX INFO: renamed from: L */
    public static final C39412p f104570L = new C39412p("ssrc:(\\d*) ([\\w_-]*)(?::(.*))?");

    /* JADX INFO: renamed from: M */
    public static final C39412p f104571M = new C39412p("ssrc-group:([\\x21\\x23\\x24\\x25\\x26\\x27\\x2A\\x2B\\x2D\\x2E\\w]*) (.*)");

    /* JADX INFO: renamed from: N */
    public static final C39412p f104572N = new C39412p("msid-semantic:\\s?(\\w*) (\\S*)");

    /* JADX INFO: renamed from: O */
    public static final C39412p f104573O = new C39412p("group:(\\w*) (.*)");

    /* JADX INFO: renamed from: P */
    public static final C39412p f104574P = new C39412p("(rtcp-mux)");

    /* JADX INFO: renamed from: Q */
    public static final C39412p f104575Q = new C39412p("(rtcp-rsize)");

    /* JADX INFO: renamed from: R */
    public static final C39412p f104576R = new C39412p("sctpmap:([\\w_/]*) (\\S*)(?: (\\S*))?");

    /* JADX INFO: renamed from: S */
    public static final C39412p f104577S = new C39412p("x-google-flag:([^\\s]*)");

    /* JADX INFO: renamed from: T */
    public static final C39412p f104578T = new C39412p("rid:([\\d\\w]+) (\\w+)(?: ([\\S| ]*))?");

    /* JADX INFO: renamed from: U */
    public static final C39412p f104579U = new C39412p("imageattr:(\\d+|\\*)[\\s\\t]+(send|recv)[\\s\\t]+(\\*|[\\S+](?:[\\s\\t]+[\\S+])*)(?:[\\s\\t]+(recv|send)[\\s\\t]+(\\*|[\\S+](?:[\\s\\t]+[\\S+])*))?");

    /* JADX INFO: renamed from: V */
    public static final C39412p f104580V = new C39412p("simulcast:(send|recv) ([a-zA-Z0-9\\-_~;,]+)(?:\\s?(send|recv) ([a-zA-Z0-9\\-_~;,]+))?$");

    /* JADX INFO: renamed from: W */
    public static final C39412p f104581W = new C39412p("simulcast:[\\s\\t]+([\\S+\\s\\t]+)$");

    /* JADX INFO: renamed from: X */
    public static final C39412p f104582X = new C39412p("framerate:(\\d+(?:$|\\.\\d+))");

    /* JADX INFO: renamed from: Y */
    public static final C39412p f104583Y = new C39412p("source-filter: *(excl|incl) (\\S*) (IP4|IP6|\\*) (\\S*) (.*)");

    /* JADX INFO: renamed from: Z */
    public static final C39412p f104584Z = new C39412p("(bundle-only)");

    /* JADX INFO: renamed from: a0 */
    public static final C39412p f104586a0 = new C39412p("label:(.+)");

    /* JADX INFO: renamed from: b0 */
    public static final C39412p f104588b0 = new C39412p("sctp-port:(\\d+)$");

    /* JADX INFO: renamed from: c0 */
    public static final C39412p f104590c0 = new C39412p("max-message-size:(\\d+)$");

    /* JADX INFO: renamed from: d0 */
    public static final C39412p f104592d0 = new C39412p("ts-refclk:([^\\s=]*)(?:=(\\S*))?");

    /* JADX INFO: renamed from: e0 */
    public static final C39412p f104594e0 = new C39412p("mediaclk:(?:id=(\\S*))? *([^\\s=]*)(?:=(\\S*))?(?: *rate=(\\d+)/(\\d+))?");

    /* JADX INFO: renamed from: f0 */
    public static final C39412p f104596f0 = new C39412p("keywds:(.+)$");

    /* JADX INFO: renamed from: g0 */
    public static final C39412p f104598g0 = new C39412p("content:(.+)");

    /* JADX INFO: renamed from: h0 */
    public static final C39412p f104600h0 = new C39412p("floorctrl:(c-only|s-only|c-s)");

    /* JADX INFO: renamed from: i0 */
    public static final C39412p f104602i0 = new C39412p("confid:(\\d+)");

    /* JADX INFO: renamed from: j0 */
    public static final C39412p f104604j0 = new C39412p("userid:(\\d+)");

    /* JADX INFO: renamed from: k0 */
    public static final C39412p f104606k0 = new C39412p("floorid:(.+) (?:m-stream|mstrm):(.+)");

    /* JADX INFO: renamed from: l0 */
    public static final C39412p f104608l0 = new C39412p("(.*)");

    /* JADX INFO: renamed from: a */
    public static C26330i m78068a(String str) {
        C39410n c39410nM125850d = f104602i0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26330i((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: b */
    public static C26333j m78069b(String str) {
        C39410n c39410nM125850d = f104600h0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26333j((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: c */
    public static C26336k m78070c(String str) {
        C39410n c39410nM125850d = f104606k0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26336k((String) ((C39408l) c39410nM125850d.m125843a()).get(1), (String) ((C39408l) c39410nM125850d.m125843a()).get(2));
    }

    /* JADX INFO: renamed from: d */
    public static C26339l m78071d(String str) {
        C39410n c39410nM125850d = f104604j0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26339l((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: e */
    public static C26342m m78072e(String str) {
        C39410n c39410nM125850d = f104584Z.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26342m((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: f */
    public static C26354q m78073f(String str) {
        C39410n c39410nM125850d = f104598g0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26354q((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: g */
    public static C26309b0 m78074g(String str) {
        C39410n c39410nM125850d = f104582X.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26309b0(Long.parseLong((String) ((C39408l) c39410nM125850d.m125843a()).get(1)));
    }

    /* JADX INFO: renamed from: h */
    public static C26331i0 m78075h(String str) {
        C39410n c39410nM125850d = f104579U.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26331i0((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: i */
    public static C26334j0 m78076i(String str) {
        C39410n c39410nM125850d = f104608l0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26334j0((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: j */
    public static C26337k0 m78077j(String str) {
        C39410n c39410nM125850d = f104596f0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26337k0((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: k */
    public static C26340l0 m78078k(String str) {
        C39410n c39410nM125850d = f104586a0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26340l0((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: l */
    public static C26343m0 m78079l(String str) {
        C39410n c39410nM125850d = f104590c0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26343m0(Long.parseLong((String) ((C39408l) c39410nM125850d.m125843a()).get(1)));
    }

    /* JADX INFO: renamed from: m */
    public static C26352p0 m78080m(String str) {
        C39410n c39410nM125850d = f104594e0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26352p0((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: n */
    public static C26306a1 m78081n(String str) {
        C39410n c39410nM125850d = f104578T.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26306a1((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: o */
    public static C26323f1 m78082o(String str) {
        C39410n c39410nM125850d = f104575Q.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26323f1((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: p */
    public static C26329h1 m78083p(String str) {
        C39410n c39410nM125850d = f104576R.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26329h1((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: q */
    public static C26332i1 m78084q(String str) {
        C39410n c39410nM125850d = f104588b0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26332i1(Long.parseLong((String) ((C39408l) c39410nM125850d.m125843a()).get(1)));
    }

    /* JADX INFO: renamed from: r */
    public static C26341l1 m78085r(String str) {
        C39410n c39410nM125850d = f104580V.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26341l1((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: s */
    public static C26338k1 m78086s(String str) {
        C39410n c39410nM125850d = f104581W.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26338k1((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: t */
    public static C26344m1 m78087t(String str) {
        C39410n c39410nM125850d = f104583Y.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26344m1((String) ((C39408l) c39410nM125850d.m125843a()).get(1), (String) ((C39408l) c39410nM125850d.m125843a()).get(2), (String) ((C39408l) c39410nM125850d.m125843a()).get(3), (String) ((C39408l) c39410nM125850d.m125843a()).get(4), (String) ((C39408l) c39410nM125850d.m125843a()).get(5));
    }

    /* JADX INFO: renamed from: u */
    public static C26359r1 m78088u(String str) {
        C39410n c39410nM125850d = f104592d0.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26359r1((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }

    /* JADX INFO: renamed from: v */
    public static C26368u1 m78089v(String str) {
        C39410n c39410nM125850d = f104577S.m125850d(str);
        if (c39410nM125850d == null) {
            return null;
        }
        return new C26368u1((String) ((C39408l) c39410nM125850d.m125843a()).get(1));
    }
}
