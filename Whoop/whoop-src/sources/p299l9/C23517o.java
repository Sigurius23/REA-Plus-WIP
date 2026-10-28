package p299l9;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import p031b9.AbstractC2875y;
import p249jc.C21567b;
import p389p0.C28521f0;
import p390p1.C28617g1;
import p390p1.C28621h1;
import p409q0.AbstractC29701y;
import p499t9.C33640l;
import p658yr.InterfaceC39722i;
import p674z8.InterfaceC40169e;

/* JADX INFO: renamed from: l9.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C23517o {

    /* JADX INFO: renamed from: a */
    public boolean f93077a;

    /* JADX INFO: renamed from: b */
    public final Object f93078b;

    /* JADX INFO: renamed from: c */
    public final Object f93079c;

    /* JADX INFO: renamed from: d */
    public final Object f93080d;

    /* JADX INFO: renamed from: e */
    public Object f93081e;

    /* JADX INFO: renamed from: f */
    public Object f93082f;

    public C23517o(int i13, float f13, AbstractC29701y abstractC29701y) {
        this.f93078b = abstractC29701y;
        this.f93079c = new C28621h1(i13);
        this.f93080d = new C28617g1(f13);
        this.f93082f = new C28521f0(i13, 30, 100);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC39722i m68090a(int i13) {
        InterfaceC39722i interfaceC39722i;
        InterfaceC39722i c23515n;
        HashMap map = (HashMap) this.f93079c;
        InterfaceC39722i interfaceC39722i2 = (InterfaceC39722i) map.get(Integer.valueOf(i13));
        if (interfaceC39722i2 != null) {
            return interfaceC39722i2;
        }
        final InterfaceC40169e interfaceC40169e = (InterfaceC40169e) this.f93081e;
        interfaceC40169e.getClass();
        final int i14 = 0;
        if (i13 != 0) {
            final int i15 = 1;
            if (i13 != 1) {
                final int i16 = 2;
                if (i13 != 2) {
                    final int i17 = 3;
                    if (i13 == 3) {
                        c23515n = new C23515n(0, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC23485b0.class));
                    } else {
                        if (i13 != 4) {
                            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unrecognized contentType: "));
                        }
                        interfaceC39722i = new InterfaceC39722i() { // from class: l9.m
                            @Override // p658yr.InterfaceC39722i
                            public final Object get() {
                                switch (i17) {
                                    case 0:
                                        return C23519p.m68091e((Class) this, interfaceC40169e);
                                    case 1:
                                        return C23519p.m68091e((Class) this, interfaceC40169e);
                                    case 2:
                                        return C23519p.m68091e((Class) this, interfaceC40169e);
                                    default:
                                        return new C23530u0(interfaceC40169e, (C33640l) ((C23517o) this).f93078b);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(InterfaceC23485b0.class);
                    c23515n = new InterfaceC39722i() { // from class: l9.m
                        @Override // p658yr.InterfaceC39722i
                        public final Object get() {
                            switch (i16) {
                                case 0:
                                    return C23519p.m68091e((Class) genericDeclarationAsSubclass, interfaceC40169e);
                                case 1:
                                    return C23519p.m68091e((Class) genericDeclarationAsSubclass, interfaceC40169e);
                                case 2:
                                    return C23519p.m68091e((Class) genericDeclarationAsSubclass, interfaceC40169e);
                                default:
                                    return new C23530u0(interfaceC40169e, (C33640l) ((C23517o) genericDeclarationAsSubclass).f93078b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC23485b0.class);
                c23515n = new InterfaceC39722i() { // from class: l9.m
                    @Override // p658yr.InterfaceC39722i
                    public final Object get() {
                        switch (i15) {
                            case 0:
                                return C23519p.m68091e((Class) genericDeclarationAsSubclass2, interfaceC40169e);
                            case 1:
                                return C23519p.m68091e((Class) genericDeclarationAsSubclass2, interfaceC40169e);
                            case 2:
                                return C23519p.m68091e((Class) genericDeclarationAsSubclass2, interfaceC40169e);
                            default:
                                return new C23530u0(interfaceC40169e, (C33640l) ((C23517o) genericDeclarationAsSubclass2).f93078b);
                        }
                    }
                };
            }
            interfaceC39722i = c23515n;
        } else {
            final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(InterfaceC23485b0.class);
            interfaceC39722i = new InterfaceC39722i() { // from class: l9.m
                @Override // p658yr.InterfaceC39722i
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return C23519p.m68091e((Class) clsAsSubclass, interfaceC40169e);
                        case 1:
                            return C23519p.m68091e((Class) clsAsSubclass, interfaceC40169e);
                        case 2:
                            return C23519p.m68091e((Class) clsAsSubclass, interfaceC40169e);
                        default:
                            return new C23530u0(interfaceC40169e, (C33640l) ((C23517o) clsAsSubclass).f93078b);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i13), interfaceC39722i);
        return interfaceC39722i;
    }

    public C23517o(C33640l c33640l, C21567b c21567b) {
        this.f93078b = c33640l;
        this.f93082f = c21567b;
        this.f93079c = new HashMap();
        this.f93080d = new HashMap();
        this.f93077a = true;
    }
}
