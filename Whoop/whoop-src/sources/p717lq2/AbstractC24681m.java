package p717lq2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2476a1;
import gb1.AbstractC15673b0;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kr2.AbstractC22815d;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p097ds.AbstractC12313p;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p390p1.C28655q;
import p390p1.C28674u2;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lq2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Llq2/e;", "type", "g", "(Landroidx/compose/ui/Modifier;Llq2/e;)Landroidx/compose/ui/Modifier;", "Llq2/g;", "b", "(Landroidx/compose/ui/Modifier;Llq2/g;)Landroidx/compose/ui/Modifier;", "Llq2/t;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Llq2/t;)Landroidx/compose/ui/Modifier;", "Li2/x;", "color", "Li2/t;", "c", "(J)Li2/t;", "d", "e", "f", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24681m {
    /* JADX INFO: renamed from: b */
    public static final Modifier m72127b(Modifier modifier, AbstractC24675g type) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(type, "type");
        Modifier modifierM52565c = AbstractC18249c.m52565c(C2314t.f9131w, AbstractC18249c.m52577o(AbstractC17918w0.m51517e(4278585358L)));
        EnumC24674f option = type.getOption();
        EnumC24674f enumC24674f = EnumC24674f.SECONDARY;
        long topEllipseColor = type.getTopEllipseColor();
        if (option == enumC24674f) {
            topEllipseColor = C17919x.m51541c(0.4f, topEllipseColor);
        }
        EnumC24674f option2 = type.getOption();
        long sideEllipseColor = type.getSideEllipseColor();
        if (option2 == enumC24674f) {
            sideEllipseColor = C17919x.m51541c(0.4f, sideEllipseColor);
        }
        return modifier.mo3471e(modifierM52565c.mo3471e(AbstractC18249c.m52565c(modifier, AbstractC18249c.m52570h(m72131f(topEllipseColor)))).mo3471e(AbstractC18249c.m52565c(modifier, AbstractC18249c.m52570h(m72130e(sideEllipseColor)))).mo3471e(AbstractC18249c.m52565c(modifier, AbstractC18249c.m52570h(type.getOption() == enumC24674f ? m72129d(C17919x.m51541c(0.5f, type.getBottomEllipseColor())) : m72128c(type.getBottomEllipseColor())))));
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC17911t m72128c(long j7) {
        return C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(EnumC39333f.TRANSPARENT.getColor())), (((long) Float.floatToRawIntBits(2400.0f)) & 4294967295L) | (Float.floatToRawIntBits(1400.0f) << 32), 1500.0f, 8);
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC17911t m72129d(long j7) {
        return C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(EnumC39333f.TRANSPARENT.getColor())), (((long) Float.floatToRawIntBits(2300.0f)) & 4294967295L) | (Float.floatToRawIntBits(-400.0f) << 32), 1500.0f, 8);
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC17911t m72130e(long j7) {
        return C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(EnumC39333f.TRANSPARENT.getColor())), (((long) Float.floatToRawIntBits(900.0f)) & 4294967295L) | (Float.floatToRawIntBits(1700.0f) << 32), 1100.0f, 8);
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC17911t m72131f(long j7) {
        return C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(EnumC39333f.TRANSPARENT.getColor())), (((long) Float.floatToRawIntBits(-300.0f)) & 4294967295L) | (Float.floatToRawIntBits(-900.0f) << 32), 1500.0f, 8);
    }

    /* JADX INFO: renamed from: g */
    public static final Modifier m72132g(Modifier modifier, InterfaceC24673e type) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(type, "type");
        if (type instanceof AbstractC24688t) {
            return m72133h(modifier, (AbstractC24688t) type);
        }
        if (type instanceof AbstractC24675g) {
            return m72127b(modifier, (AbstractC24675g) type);
        }
        return type instanceof AbstractC22815d ? modifier.mo3471e(C24684p.f96548a.m72153e((AbstractC22815d) type)) : modifier;
    }

    /* JADX INFO: renamed from: h */
    public static final Modifier m72133h(Modifier modifier, AbstractC24688t type) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(type, "type");
        return AbstractC37056f.m118997u(modifier, new C2476a1(type, 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Modifier m72134i(AbstractC24688t abstractC24688t, Modifier composed, Composer composer, int i13) {
        float f13;
        long j7;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        int iFloatToRawIntBits;
        Modifier modifierMo3471e;
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(496282);
        boolean z4 = abstractC24688t instanceof AbstractC24688t.b;
        C2314t c2314t = C2314t.f9131w;
        if (z4) {
            c28655q.m87150e0(1899890759);
            c28655q.m87173q(false);
            modifierMo3471e = composed.mo3471e(AbstractC15673b0.m44028b0(c2314t));
        } else {
            c28655q.m87150e0(1899999414);
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(150);
            float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(500);
            float fMo743q2 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(393);
            float fMo743q3 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(280);
            boolean z13 = abstractC24688t.getOption() == EnumC24674f.PRIMARY;
            Modifier modifierM34301s = AbstractC12313p.m34301s(200, c2314t);
            C17909s c17909s = AbstractC17911t.f69612b;
            List<C17919x> listM72265a = z13 ? abstractC24688t.m72265a() : abstractC24688t.m72267c();
            if (z13) {
                f13 = 0.0f;
                j7 = 4294967295L;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
            } else {
                f13 = 0.0f;
                j7 = 4294967295L;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMo743q3)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            long j13 = jFloatToRawIntBits;
            if (z13) {
                jFloatToRawIntBits2 = Float.floatToRawIntBits(fMo743q0);
                iFloatToRawIntBits = Float.floatToRawIntBits(fMo743q1);
            } else {
                jFloatToRawIntBits2 = Float.floatToRawIntBits(fMo743q2);
                iFloatToRawIntBits = Float.floatToRawIntBits(f13);
            }
            modifierMo3471e = composed.mo3471e(AbstractC1092a.m3357b(modifierM34301s, C17909s.m51486d(c17909s, listM72265a, j13, (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits) & j7), 8), null, z13 ? 0.4f : 0.3f, 2));
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return modifierMo3471e;
    }
}
