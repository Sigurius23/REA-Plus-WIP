package k91;

import p208i2.AbstractC17897m;
import p208i2.AbstractC17904p0;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p208i2.C17898m0;
import p208i2.InterfaceC17910s0;
import p490t0.AbstractC33244a;
import p490t0.C33252i;
import p490t0.InterfaceC33245b;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: k91.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lk91/b;", "Lt0/a;", "Lt0/i;", "roundRect", "Li2/s0;", "path", "<init>", "(Lt0/i;Li2/s0;)V", "Lt0/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "c", "(Lt0/b;Lt0/b;Lt0/b;Lt0/b;)Lt0/a;", "Lh2/e;", "size", "", "Ly3/m;", "layoutDirection", "Li2/p0;", "e", "(JFFFFLy3/m;)Li2/p0;", "Lt0/i;", "getRoundRect", "()Lt0/i;", "f", "Li2/s0;", "j", "()Li2/s0;", "setPath", "(Li2/s0;)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22303b extends AbstractC33244a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C33252i roundRect;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC17910s0 path;

    public /* synthetic */ C22303b(C33252i c33252i, InterfaceC17910s0 interfaceC17910s0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c33252i, (i13 & 2) != 0 ? AbstractC17897m.m51478a() : interfaceC17910s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p490t0.AbstractC33244a
    /* JADX INFO: renamed from: c */
    public AbstractC33244a mo64096c(InterfaceC33245b topStart, InterfaceC33245b topEnd, InterfaceC33245b bottomEnd, InterfaceC33245b bottomStart) {
        AbstractC22676k.m65750j(topStart, "topStart");
        AbstractC22676k.m65750j(topEnd, "topEnd");
        AbstractC22676k.m65750j(bottomEnd, "bottomEnd");
        AbstractC22676k.m65750j(bottomStart, "bottomStart");
        return new C22303b(new C33252i(topStart, topEnd, bottomEnd, bottomStart), null, 2, 0 == true ? 1 : 0);
    }

    @Override // p490t0.AbstractC33244a
    /* JADX INFO: renamed from: e */
    public AbstractC17904p0 mo64097e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, EnumC39181m layoutDirection) {
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        AbstractC17904p0 abstractC17904p0Mo64097e = this.roundRect.mo64097e(size, topStart, topEnd, bottomEnd, bottomStart, layoutDirection);
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        C17891j c17891jM51478a2 = AbstractC17897m.m51478a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (size >> 32)) / 2.0f;
        float f13 = 4;
        float f14 = f13 * f13;
        c17891jM51478a2.m51462i(fIntBitsToFloat - f14, 0.0f);
        float f15 = -f14;
        c17891jM51478a2.m51461h(fIntBitsToFloat, f15);
        c17891jM51478a2.m51461h(f14 + fIntBitsToFloat, 0.0f);
        c17891jM51478a2.m51462i(fIntBitsToFloat, f15);
        c17891jM51478a2.m51459f();
        C17891j c17891jM51478a3 = AbstractC17897m.m51478a();
        AbstractC17918w0.m51526n(c17891jM51478a3, abstractC17904p0Mo64097e);
        c17891jM51478a.m51463j(c17891jM51478a3, c17891jM51478a2, 3);
        this.path = c17891jM51478a;
        return new C17898m0(c17891jM51478a);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC17910s0 getPath() {
        return this.path;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22303b(C33252i roundRect, InterfaceC17910s0 path) {
        super(roundRect.m105482i(), roundRect.m105481h(), roundRect.m105479f(), roundRect.m105480g());
        AbstractC22676k.m65750j(roundRect, "roundRect");
        AbstractC22676k.m65750j(path, "path");
        this.roundRect = roundRect;
        this.path = path;
    }
}
