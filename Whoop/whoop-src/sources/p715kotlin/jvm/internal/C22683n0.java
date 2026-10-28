package p715kotlin.jvm.internal;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.util.List;
import kotlinx.serialization.internal.CollectionDescriptorsKt;
import m83.AbstractC25265s;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: kotlin.jvm.internal.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22683n0 implements InterfaceC21456a0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC21463e f89340w;

    /* JADX INFO: renamed from: x */
    public final List f89341x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC21456a0 f89342y;

    /* JADX INFO: renamed from: z */
    public final int f89343z;

    public C22683n0(InterfaceC21463e classifier, List arguments, InterfaceC21456a0 interfaceC21456a0, int i13) {
        AbstractC22676k.m65750j(classifier, "classifier");
        AbstractC22676k.m65750j(arguments, "arguments");
        this.f89340w = classifier;
        this.f89341x = arguments;
        this.f89342y = interfaceC21456a0;
        this.f89343z = i13;
    }

    /* JADX INFO: renamed from: a */
    public final String m65779a(boolean z4) {
        String name;
        InterfaceC21463e interfaceC21463e = this.f89340w;
        InterfaceC21461d interfaceC21461d = interfaceC21463e instanceof InterfaceC21461d ? (InterfaceC21461d) interfaceC21463e : null;
        Class clsM60663S = interfaceC21461d != null ? AbstractC21598x.m60663S(interfaceC21461d) : null;
        if (clsM60663S == null) {
            name = interfaceC21463e.toString();
        } else if ((this.f89343z & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (!clsM60663S.isArray()) {
            name = (z4 && clsM60663S.isPrimitive()) ? AbstractC21598x.m60664T((InterfaceC21461d) interfaceC21463e).getName() : clsM60663S.getName();
        } else if (clsM60663S.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsM60663S.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsM60663S.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsM60663S.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsM60663S.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsM60663S.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsM60663S.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsM60663S.equals(double[].class) ? "kotlin.DoubleArray" : CollectionDescriptorsKt.ARRAY_NAME;
        }
        List list = this.f89341x;
        String strM53370k = AbstractC18489d0.m53370k(name, list.isEmpty() ? "" : AbstractC25265s.m74110N0(list, ", ", "<", ">", new C19962a(this, 17), 24), isMarkedNullable() ? "?" : "");
        InterfaceC21456a0 interfaceC21456a0 = this.f89342y;
        if (!(interfaceC21456a0 instanceof C22683n0)) {
            return strM53370k;
        }
        String strM65779a = ((C22683n0) interfaceC21456a0).m65779a(true);
        if (AbstractC22676k.m65745e(strM65779a, strM53370k)) {
            return strM53370k;
        }
        if (AbstractC22676k.m65745e(strM65779a, strM53370k + '?')) {
            return strM53370k + '!';
        }
        return "(" + strM53370k + ".." + strM65779a + ')';
    }

    /* JADX INFO: renamed from: b */
    public final int m65780b() {
        return this.f89343z;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC21456a0 m65781c() {
        return this.f89342y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22683n0)) {
            return false;
        }
        C22683n0 c22683n0 = (C22683n0) obj;
        return AbstractC22676k.m65745e(this.f89340w, c22683n0.f89340w) && AbstractC22676k.m65745e(this.f89341x, c22683n0.f89341x) && AbstractC22676k.m65745e(this.f89342y, c22683n0.f89342y) && this.f89343z == c22683n0.f89343z;
    }

    @Override // j93.InterfaceC21457b
    public final List getAnnotations() {
        return C25271y.f99162w;
    }

    @Override // j93.InterfaceC21456a0
    public final List getArguments() {
        return this.f89341x;
    }

    @Override // j93.InterfaceC21456a0
    public final InterfaceC21463e getClassifier() {
        return this.f89340w;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89343z) + AbstractC11895b.m31983b(this.f89340w.hashCode() * 31, 31, this.f89341x);
    }

    @Override // j93.InterfaceC21456a0
    public final boolean isMarkedNullable() {
        return (this.f89343z & 1) != 0;
    }

    public final String toString() {
        return m65779a(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22683n0(InterfaceC21463e classifier, List arguments, boolean z4) {
        this(classifier, arguments, null, z4 ? 1 : 0);
        AbstractC22676k.m65750j(classifier, "classifier");
        AbstractC22676k.m65750j(arguments, "arguments");
    }
}
