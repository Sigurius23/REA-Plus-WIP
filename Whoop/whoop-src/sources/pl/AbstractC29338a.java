package pl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.profileinstaller.ProfileVerifier;
import com.bumptech.glide.EnumC4962d;
import gl.AbstractC15939d;
import gl.C15946k;
import gl.C15951p;
import no.nordicsemi.android.dfu.DfuBaseService;
import p283kl.C22553b;
import p283kl.C22554c;
import p586wk.C37329g;
import p586wk.C37330h;
import p586wk.InterfaceC37327e;
import p586wk.InterfaceC37334l;
import p684zk.C40786k;
import pf.AbstractC29125c;
import sl.C32577c;
import tl.AbstractC33913l;
import tl.C33903b;

/* JADX INFO: renamed from: pl.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC29338a implements Cloneable {

    /* JADX INFO: renamed from: E */
    public Drawable f118858E;

    /* JADX INFO: renamed from: F */
    public int f118859F;

    /* JADX INFO: renamed from: K */
    public boolean f118864K;

    /* JADX INFO: renamed from: P */
    public boolean f118869P;

    /* JADX INFO: renamed from: Q */
    public boolean f118870Q;

    /* JADX INFO: renamed from: S */
    public boolean f118872S;

    /* JADX INFO: renamed from: w */
    public int f118873w;

    /* JADX INFO: renamed from: z */
    public int f118876z;

    /* JADX INFO: renamed from: x */
    public C40786k f118874x = C40786k.f175894e;

    /* JADX INFO: renamed from: y */
    public EnumC4962d f118875y = EnumC4962d.f20311w;

    /* JADX INFO: renamed from: G */
    public boolean f118860G = true;

    /* JADX INFO: renamed from: H */
    public int f118861H = -1;

    /* JADX INFO: renamed from: I */
    public int f118862I = -1;

    /* JADX INFO: renamed from: J */
    public InterfaceC37327e f118863J = C32577c.f134967b;

    /* JADX INFO: renamed from: L */
    public boolean f118865L = true;

    /* JADX INFO: renamed from: M */
    public C37330h f118866M = new C37330h();

    /* JADX INFO: renamed from: N */
    public C33903b f118867N = new C33903b(0);

    /* JADX INFO: renamed from: O */
    public Class f118868O = Object.class;

    /* JADX INFO: renamed from: R */
    public boolean f118871R = true;

    /* JADX INFO: renamed from: g */
    public static boolean m89312g(int i13, int i14) {
        return (i13 & i14) != 0;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC29338a mo15533a(AbstractC29338a abstractC29338a) {
        if (this.f118870Q) {
            return clone().mo15533a(abstractC29338a);
        }
        int i13 = abstractC29338a.f118873w;
        if (m89312g(abstractC29338a.f118873w, 1048576)) {
            this.f118872S = abstractC29338a.f118872S;
        }
        if (m89312g(abstractC29338a.f118873w, 4)) {
            this.f118874x = abstractC29338a.f118874x;
        }
        if (m89312g(abstractC29338a.f118873w, 8)) {
            this.f118875y = abstractC29338a.f118875y;
        }
        if (m89312g(abstractC29338a.f118873w, 16)) {
            this.f118876z = 0;
            this.f118873w &= -33;
        }
        if (m89312g(abstractC29338a.f118873w, 32)) {
            this.f118876z = abstractC29338a.f118876z;
            this.f118873w &= -17;
        }
        if (m89312g(abstractC29338a.f118873w, 64)) {
            this.f118858E = abstractC29338a.f118858E;
            this.f118859F = 0;
            this.f118873w &= -129;
        }
        if (m89312g(abstractC29338a.f118873w, 128)) {
            this.f118859F = abstractC29338a.f118859F;
            this.f118858E = null;
            this.f118873w &= -65;
        }
        if (m89312g(abstractC29338a.f118873w, 256)) {
            this.f118860G = abstractC29338a.f118860G;
        }
        if (m89312g(abstractC29338a.f118873w, 512)) {
            this.f118862I = abstractC29338a.f118862I;
            this.f118861H = abstractC29338a.f118861H;
        }
        if (m89312g(abstractC29338a.f118873w, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED)) {
            this.f118863J = abstractC29338a.f118863J;
        }
        if (m89312g(abstractC29338a.f118873w, 4096)) {
            this.f118868O = abstractC29338a.f118868O;
        }
        if (m89312g(abstractC29338a.f118873w, DfuBaseService.ERROR_REMOTE_MASK)) {
            this.f118873w &= -16385;
        }
        if (m89312g(abstractC29338a.f118873w, DfuBaseService.ERROR_CONNECTION_MASK)) {
            this.f118873w &= -8193;
        }
        if (m89312g(abstractC29338a.f118873w, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST)) {
            this.f118865L = abstractC29338a.f118865L;
        }
        if (m89312g(abstractC29338a.f118873w, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ)) {
            this.f118864K = abstractC29338a.f118864K;
        }
        if (m89312g(abstractC29338a.f118873w, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS)) {
            this.f118867N.putAll(abstractC29338a.f118867N);
            this.f118871R = abstractC29338a.f118871R;
        }
        if (!this.f118865L) {
            this.f118867N.clear();
            int i14 = this.f118873w;
            this.f118864K = false;
            this.f118873w = i14 & (-133121);
            this.f118871R = true;
        }
        this.f118873w |= abstractC29338a.f118873w;
        this.f118866M.f159595b.mo39h(abstractC29338a.f118866M.f159595b);
        m89323o();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC29338a clone() {
        try {
            AbstractC29338a abstractC29338a = (AbstractC29338a) super.clone();
            C37330h c37330h = new C37330h();
            abstractC29338a.f118866M = c37330h;
            c37330h.f159595b.mo39h(this.f118866M.f159595b);
            C33903b c33903b = new C33903b(0);
            abstractC29338a.f118867N = c33903b;
            c33903b.putAll(this.f118867N);
            abstractC29338a.f118869P = false;
            abstractC29338a.f118870Q = false;
            return abstractC29338a;
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC29338a m89313c(Class cls) {
        if (this.f118870Q) {
            return clone().m89313c(cls);
        }
        this.f118868O = cls;
        this.f118873w |= 4096;
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC29338a m89314d(C40786k c40786k) {
        if (this.f118870Q) {
            return clone().m89314d(c40786k);
        }
        this.f118874x = c40786k;
        this.f118873w |= 4;
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC29338a m89315e() {
        if (this.f118870Q) {
            return clone().m89315e();
        }
        this.f118867N.clear();
        int i13 = this.f118873w;
        this.f118864K = false;
        this.f118865L = false;
        this.f118873w = (i13 & (-133121)) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        this.f118871R = true;
        m89323o();
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC29338a)) {
            return false;
        }
        AbstractC29338a abstractC29338a = (AbstractC29338a) obj;
        if (Float.compare(1.0f, 1.0f) != 0 || this.f118876z != abstractC29338a.f118876z) {
            return false;
        }
        char[] cArr = AbstractC33913l.f142093a;
        return this.f118859F == abstractC29338a.f118859F && AbstractC33913l.m107266a(this.f118858E, abstractC29338a.f118858E) && this.f118860G == abstractC29338a.f118860G && this.f118861H == abstractC29338a.f118861H && this.f118862I == abstractC29338a.f118862I && this.f118864K == abstractC29338a.f118864K && this.f118865L == abstractC29338a.f118865L && this.f118874x.equals(abstractC29338a.f118874x) && this.f118875y == abstractC29338a.f118875y && this.f118866M.equals(abstractC29338a.f118866M) && this.f118867N.equals(abstractC29338a.f118867N) && this.f118868O.equals(abstractC29338a.f118868O) && this.f118863J.equals(abstractC29338a.f118863J);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC29338a m89316f(int i13) {
        if (this.f118870Q) {
            return clone().m89316f(i13);
        }
        this.f118876z = i13;
        this.f118873w = (this.f118873w | 32) & (-17);
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC29338a m89317h(C15946k c15946k, AbstractC15939d abstractC15939d) {
        if (this.f118870Q) {
            return clone().m89317h(c15946k, abstractC15939d);
        }
        m89324p(C15946k.f60359g, c15946k);
        return m89329u(abstractC15939d, false);
    }

    public final int hashCode() {
        char[] cArr = AbstractC33913l.f142093a;
        return AbstractC33913l.m107271f(AbstractC33913l.m107271f(AbstractC33913l.m107271f(AbstractC33913l.m107271f(AbstractC33913l.m107271f(AbstractC33913l.m107271f(AbstractC33913l.m107271f(AbstractC33913l.m107270e(0, AbstractC33913l.m107270e(0, AbstractC33913l.m107270e(this.f118865L ? 1 : 0, AbstractC33913l.m107270e(this.f118864K ? 1 : 0, AbstractC33913l.m107270e(this.f118862I, AbstractC33913l.m107270e(this.f118861H, AbstractC33913l.m107270e(this.f118860G ? 1 : 0, AbstractC33913l.m107271f(AbstractC33913l.m107270e(0, AbstractC33913l.m107271f(AbstractC33913l.m107270e(this.f118859F, AbstractC33913l.m107271f(AbstractC33913l.m107270e(this.f118876z, AbstractC33913l.m107270e(Float.floatToIntBits(1.0f), 17)), null)), this.f118858E)), null)))))))), this.f118874x), this.f118875y), this.f118866M), this.f118867N), this.f118868O), this.f118863J), null);
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC29338a m89318i(int i13, int i14) {
        if (this.f118870Q) {
            return clone().m89318i(i13, i14);
        }
        this.f118862I = i13;
        this.f118861H = i14;
        this.f118873w |= 512;
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC29338a m89319j(int i13) {
        if (this.f118870Q) {
            return clone().m89319j(i13);
        }
        this.f118859F = i13;
        int i14 = this.f118873w | 128;
        this.f118858E = null;
        this.f118873w = i14 & (-65);
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC29338a m89320k(Drawable drawable) {
        if (this.f118870Q) {
            return clone().m89320k(drawable);
        }
        this.f118858E = drawable;
        int i13 = this.f118873w | 64;
        this.f118859F = 0;
        this.f118873w = i13 & (-129);
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC29338a m89321l() {
        if (this.f118870Q) {
            return clone().m89321l();
        }
        this.f118875y = EnumC4962d.f20312x;
        this.f118873w |= 8;
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC29338a m89322n(C15946k c15946k, AbstractC15939d abstractC15939d, boolean z4) {
        AbstractC29338a abstractC29338aM89327s = z4 ? m89327s(c15946k, abstractC15939d) : m89317h(c15946k, abstractC15939d);
        abstractC29338aM89327s.f118871R = true;
        return abstractC29338aM89327s;
    }

    /* JADX INFO: renamed from: o */
    public final void m89323o() {
        if (this.f118869P) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC29338a m89324p(C37329g c37329g, Object obj) {
        if (this.f118870Q) {
            return clone().m89324p(c37329g, obj);
        }
        AbstractC29125c.m88538o(c37329g);
        this.f118866M.f159595b.put(c37329g, obj);
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC29338a m89325q(InterfaceC37327e interfaceC37327e) {
        if (this.f118870Q) {
            return clone().m89325q(interfaceC37327e);
        }
        this.f118863J = interfaceC37327e;
        this.f118873w |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC29338a m89326r(boolean z4) {
        if (this.f118870Q) {
            return clone().m89326r(true);
        }
        this.f118860G = !z4;
        this.f118873w |= 256;
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC29338a m89327s(C15946k c15946k, AbstractC15939d abstractC15939d) {
        if (this.f118870Q) {
            return clone().m89327s(c15946k, abstractC15939d);
        }
        m89324p(C15946k.f60359g, c15946k);
        return m89329u(abstractC15939d, true);
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC29338a m89328t(Class cls, InterfaceC37334l interfaceC37334l, boolean z4) {
        if (this.f118870Q) {
            return clone().m89328t(cls, interfaceC37334l, z4);
        }
        AbstractC29125c.m88538o(interfaceC37334l);
        this.f118867N.put(cls, interfaceC37334l);
        int i13 = this.f118873w;
        this.f118865L = true;
        this.f118873w = 67584 | i13;
        this.f118871R = false;
        if (z4) {
            this.f118873w = i13 | 198656;
            this.f118864K = true;
        }
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC29338a m89329u(InterfaceC37334l interfaceC37334l, boolean z4) {
        if (this.f118870Q) {
            return clone().m89329u(interfaceC37334l, z4);
        }
        C15951p c15951p = new C15951p(interfaceC37334l, z4);
        m89328t(Bitmap.class, interfaceC37334l, z4);
        m89328t(Drawable.class, c15951p, z4);
        m89328t(BitmapDrawable.class, c15951p, z4);
        m89328t(C22553b.class, new C22554c(interfaceC37334l), z4);
        m89323o();
        return this;
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC29338a m89330v() {
        if (this.f118870Q) {
            return clone().m89330v();
        }
        this.f118872S = true;
        this.f118873w |= 1048576;
        m89323o();
        return this;
    }
}
