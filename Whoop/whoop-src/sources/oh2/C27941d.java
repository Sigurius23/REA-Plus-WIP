package oh2;

import java.util.Objects;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: oh2.d */
/* JADX INFO: loaded from: classes4.dex */
public class C27941d {

    /* JADX INFO: renamed from: a */
    private C27940c f112693a;

    /* JADX INFO: renamed from: b */
    private InterfaceC27939b f112694b;

    /* JADX INFO: renamed from: c */
    private InterfaceC27939b f112695c;

    /* JADX INFO: renamed from: d */
    private C27942e f112696d;

    /* JADX INFO: renamed from: e */
    private byte f112697e;

    /* JADX INFO: renamed from: f */
    private byte f112698f;

    /* JADX INFO: renamed from: g */
    private String f112699g;

    /* JADX INFO: renamed from: h */
    private C27938a f112700h;

    /* JADX INFO: renamed from: oh2.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private C27940c f112701a;

        /* JADX INFO: renamed from: b */
        private InterfaceC27939b f112702b;

        /* JADX INFO: renamed from: c */
        private InterfaceC27939b f112703c;

        /* JADX INFO: renamed from: d */
        private C27942e f112704d;

        /* JADX INFO: renamed from: e */
        private byte f112705e;

        /* JADX INFO: renamed from: f */
        private byte f112706f;

        /* JADX INFO: renamed from: g */
        private String f112707g;

        /* JADX INFO: renamed from: a */
        public a m84348a(byte b) {
            this.f112706f = b;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m84349b(byte b) {
            this.f112705e = b;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C27941d m84350c() {
            return new C27941d(this.f112701a, this.f112702b, this.f112703c, this.f112704d, this.f112705e, this.f112706f, this.f112707g, 0);
        }

        /* JADX INFO: renamed from: d */
        public a m84351d(InterfaceC27939b interfaceC27939b) {
            this.f112702b = interfaceC27939b;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m84352e(C27940c c27940c) {
            this.f112701a = c27940c;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m84353f(C27942e c27942e) {
            this.f112704d = c27942e;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m84354g(String str) {
            this.f112707g = str;
            return this;
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("HistoryHeartDataVersion.HistoryHeartDataVersionBuilder(hardwareVersion=");
            sb4.append(this.f112701a);
            sb4.append(", firmwareVersion=");
            sb4.append(this.f112702b);
            sb4.append(", bluetoothVersion=");
            sb4.append(this.f112703c);
            sb4.append(", sigProcVersion=");
            sb4.append(this.f112704d);
            sb4.append(", binaryVersion=");
            sb4.append((int) this.f112705e);
            sb4.append(", binaryFlags=");
            sb4.append((int) this.f112706f);
            sb4.append(", strapId=");
            return AbstractC25012a.m73376i(this.f112707g, ")", sb4);
        }
    }

    public /* synthetic */ C27941d(C27940c c27940c, InterfaceC27939b interfaceC27939b, InterfaceC27939b interfaceC27939b2, C27942e c27942e, byte b, byte b6, String str, int i13) {
        this(c27940c, interfaceC27939b, interfaceC27939b2, c27942e, b, b6, str);
    }

    /* JADX INFO: renamed from: b */
    public static a m84339b() {
        return new a();
    }

    /* JADX INFO: renamed from: i */
    public static C27941d m84340i(C27938a c27938a) {
        C27941d c27941d = new C27941d(c27938a.getHardwareVersion(), c27938a.getFirmwareVersion(), c27938a.getBluetoothVersion(), c27938a.getSigProcVersion(), c27938a.getVersion(), (byte) 0, c27938a.getStrapId());
        c27941d.f112700h = c27938a;
        return c27941d;
    }

    /* JADX INFO: renamed from: a */
    public C27938a m84341a() {
        if (this.f112700h == null) {
            this.f112700h = C27938a.m84304a().m84315d(this.f112693a).m84314c(this.f112694b).m84312a(this.f112695c).m84316e(this.f112696d).m84317f(this.f112699g).m84318g(this.f112697e).m84313b();
        }
        return this.f112700h;
    }

    /* JADX INFO: renamed from: c */
    public byte m84342c() {
        return this.f112698f;
    }

    /* JADX INFO: renamed from: d */
    public byte m84343d() {
        return this.f112697e;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC27939b m84344e() {
        return this.f112694b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C27941d)) {
            return false;
        }
        C27941d c27941d = (C27941d) obj;
        if (this.f112697e != c27941d.f112697e || this.f112698f != c27941d.f112698f || !Objects.equals(this.f112693a, c27941d.f112693a) || !Objects.equals(this.f112694b, c27941d.f112694b) || !Objects.equals(this.f112695c, c27941d.f112695c) || !Objects.equals(this.f112696d, c27941d.f112696d)) {
            return false;
        }
        String str = this.f112699g;
        return str == null ? c27941d.f112696d == null : str.equals(c27941d.f112699g);
    }

    /* JADX INFO: renamed from: f */
    public C27940c m84345f() {
        return this.f112693a;
    }

    /* JADX INFO: renamed from: g */
    public C27942e m84346g() {
        return this.f112696d;
    }

    /* JADX INFO: renamed from: h */
    public String m84347h() {
        return this.f112699g;
    }

    public int hashCode() {
        return Objects.hash(this.f112693a, this.f112694b, this.f112695c, this.f112696d, Byte.valueOf(this.f112697e), Byte.valueOf(this.f112698f), this.f112699g);
    }

    private C27941d(C27940c c27940c, InterfaceC27939b interfaceC27939b, InterfaceC27939b interfaceC27939b2, C27942e c27942e, byte b, byte b6, String str) {
        this.f112693a = c27940c;
        this.f112694b = interfaceC27939b;
        this.f112695c = interfaceC27939b2;
        this.f112696d = c27942e;
        this.f112697e = b;
        this.f112698f = b6;
        this.f112699g = str;
    }
}
