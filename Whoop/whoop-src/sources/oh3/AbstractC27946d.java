package oh3;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import l83.InterfaceC23457c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oh3.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC27946d {

    /* JADX INFO: renamed from: a */
    private final ThreadLocal<String> f112717a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public void mo84367a(String str, Object... args) {
        AbstractC22676k.m65750j(args, "args");
        m84378l(3, str, null, Arrays.copyOf(args, args.length));
    }

    /* JADX INFO: renamed from: b */
    public void mo84368b(String str, Object... args) {
        AbstractC22676k.m65750j(args, "args");
        m84378l(6, str, null, Arrays.copyOf(args, args.length));
    }

    /* JADX INFO: renamed from: c */
    public void mo84369c(Throwable th3) {
        m84378l(6, null, th3, new Object[0]);
    }

    /* JADX INFO: renamed from: d */
    public void mo84370d(Throwable th3, String str, Object... args) {
        AbstractC22676k.m65750j(args, "args");
        m84378l(6, str, th3, Arrays.copyOf(args, args.length));
    }

    /* JADX INFO: renamed from: e */
    public String m84374e(String message, Object[] args) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(args, "args");
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        return String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ThreadLocal m84375f() {
        return this.f112717a;
    }

    /* JADX INFO: renamed from: g */
    public /* synthetic */ String mo84365g() {
        String str = this.f112717a.get();
        if (str != null) {
            this.f112717a.remove();
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public void mo84371h(String str, Object... args) {
        AbstractC22676k.m65750j(args, "args");
        m84378l(4, str, null, Arrays.copyOf(args, args.length));
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: i */
    public boolean m84376i(int i13) {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean m84377j(String str, int i13) {
        return m84376i(i13);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo16951k(int i13, String str, String str2, Throwable th3);

    /* JADX INFO: renamed from: l */
    public final void m84378l(int i13, String str, Throwable th3, Object... objArr) {
        String strMo84365g = mo84365g();
        if (m84377j(strMo84365g, i13)) {
            if (str != null && str.length() != 0) {
                if (objArr.length != 0) {
                    str = m84374e(str, objArr);
                }
                if (th3 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append((Object) str);
                    sb4.append('\n');
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th3.printStackTrace(printWriter);
                    printWriter.flush();
                    String string = stringWriter.toString();
                    AbstractC22676k.m65749i(string, "sw.toString()");
                    sb4.append(string);
                    str = sb4.toString();
                }
            } else {
                if (th3 == null) {
                    return;
                }
                StringWriter stringWriter2 = new StringWriter(256);
                PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                th3.printStackTrace(printWriter2);
                printWriter2.flush();
                str = stringWriter2.toString();
                AbstractC22676k.m65749i(str, "sw.toString()");
            }
            mo16951k(i13, strMo84365g, str, th3);
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo84372m(String str, Object... args) {
        AbstractC22676k.m65750j(args, "args");
        m84378l(2, str, null, Arrays.copyOf(args, args.length));
    }

    /* JADX INFO: renamed from: n */
    public void mo84373n(String str, Object... args) {
        AbstractC22676k.m65750j(args, "args");
        m84378l(5, str, null, Arrays.copyOf(args, args.length));
    }
}
