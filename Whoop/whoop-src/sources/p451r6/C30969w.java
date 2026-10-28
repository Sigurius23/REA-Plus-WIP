package p451r6;

import androidx.glance.appwidget.protobuf.AbstractC1367a;
import androidx.glance.appwidget.protobuf.AbstractC1368a0;
import androidx.glance.appwidget.protobuf.AbstractC1370b;
import androidx.glance.appwidget.protobuf.C1369a1;
import androidx.glance.appwidget.protobuf.C1431z;
import androidx.glance.appwidget.protobuf.C1432z0;
import androidx.glance.appwidget.protobuf.InterfaceC1380e0;
import androidx.glance.appwidget.protobuf.InterfaceC1426w0;
import java.util.ArrayList;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: r6.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C30969w extends AbstractC1368a0 {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final C30969w DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_ALPHA_FIELD_NUMBER = 12;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile InterfaceC1426w0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private InterfaceC1380e0 children_ = C1432z0.f5996z;
    private boolean hasAction_;
    private boolean hasImageAlpha_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        C30969w c30969w = new C30969w();
        DEFAULT_INSTANCE = c30969w;
        AbstractC1368a0.m4273k(C30969w.class, c30969w);
    }

    /* JADX INFO: renamed from: A */
    public static C30968v m95259A() {
        return (C30968v) DEFAULT_INSTANCE.m4274c();
    }

    /* JADX INFO: renamed from: n */
    public static void m95260n(C30969w c30969w, EnumC30970x enumC30970x) {
        c30969w.getClass();
        if (enumC30970x == EnumC30970x.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c30969w.type_ = enumC30970x.f127717w;
    }

    /* JADX INFO: renamed from: o */
    public static void m95261o(C30969w c30969w, EnumC30962p enumC30962p) {
        c30969w.getClass();
        c30969w.width_ = enumC30962p.m95246a();
    }

    /* JADX INFO: renamed from: p */
    public static void m95262p(C30969w c30969w, EnumC30962p enumC30962p) {
        c30969w.getClass();
        c30969w.height_ = enumC30962p.m95246a();
    }

    /* JADX INFO: renamed from: q */
    public static void m95263q(C30969w c30969w, EnumC30963q enumC30963q) {
        c30969w.getClass();
        if (enumC30963q == EnumC30963q.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c30969w.horizontalAlignment_ = enumC30963q.f127704w;
    }

    /* JADX INFO: renamed from: r */
    public static void m95264r(C30969w c30969w, EnumC30971y enumC30971y) {
        c30969w.getClass();
        if (enumC30971y == EnumC30971y.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c30969w.verticalAlignment_ = enumC30971y.f127723w;
    }

    /* JADX INFO: renamed from: s */
    public static void m95265s(C30969w c30969w, EnumC30961o enumC30961o) {
        c30969w.getClass();
        if (enumC30961o == EnumC30961o.UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c30969w.imageScale_ = enumC30961o.f127691w;
    }

    /* JADX INFO: renamed from: t */
    public static void m95266t(C30969w c30969w) {
        c30969w.getClass();
        c30969w.identity_ = 1;
    }

    /* JADX INFO: renamed from: u */
    public static void m95267u(C30969w c30969w, boolean z4) {
        c30969w.hasAction_ = z4;
    }

    /* JADX INFO: renamed from: v */
    public static void m95268v(C30969w c30969w, ArrayList arrayList) {
        InterfaceC1380e0 interfaceC1380e0 = c30969w.children_;
        if (!((AbstractC1370b) interfaceC1380e0).f5867w) {
            int size = interfaceC1380e0.size();
            c30969w.children_ = interfaceC1380e0.mo4286i(size == 0 ? 10 : size * 2);
        }
        AbstractC1367a.m4268a(arrayList, c30969w.children_);
    }

    /* JADX INFO: renamed from: w */
    public static void m95269w(C30969w c30969w, boolean z4) {
        c30969w.hasImageDescription_ = z4;
    }

    /* JADX INFO: renamed from: x */
    public static void m95270x(C30969w c30969w) {
        c30969w.hasImageColorFilter_ = false;
    }

    /* JADX INFO: renamed from: y */
    public static void m95271y(C30969w c30969w, boolean z4) {
        c30969w.hasImageAlpha_ = z4;
    }

    /* JADX INFO: renamed from: z */
    public static C30969w m95272z() {
        return DEFAULT_INSTANCE;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1368a0
    /* JADX INFO: renamed from: d */
    public final Object mo4275d(int i13) {
        InterfaceC1426w0 c1431z;
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1369a1(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007\f\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", C30969w.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_", "hasImageAlpha_"});
            case 3:
                return new C30969w();
            case 4:
                return new C30968v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC1426w0 interfaceC1426w0 = PARSER;
                if (interfaceC1426w0 != null) {
                    return interfaceC1426w0;
                }
                synchronized (C30969w.class) {
                    try {
                        c1431z = PARSER;
                        if (c1431z == null) {
                            c1431z = new C1431z();
                            PARSER = c1431z;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return c1431z;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
