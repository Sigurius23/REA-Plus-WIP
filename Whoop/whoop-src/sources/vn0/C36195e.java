package vn0;

import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.PasswordRequirement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import wn0.C37416g;

/* JADX INFO: renamed from: vn0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lvn0/e;", "", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "", "password", "", "Lcom/whoop/service/network/model/PasswordRequirement;", "requirements", "Lwn0/g;", "a", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "Ltr2/n;", "b", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36195e {

    /* JADX INFO: renamed from: c */
    public static final int f154992c = 8;

    /* JADX INFO: renamed from: d */
    private static final List<String> f154993d = AbstractC37056f.m118958J("PasswordHistoryPolicy");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C36195e(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final List<C37416g> m115189a(String password, List<PasswordRequirement> requirements) {
        C37416g c37416g;
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(requirements, "requirements");
        ArrayList<PasswordRequirement> arrayList = new ArrayList();
        for (Object obj : requirements) {
            if (!f154993d.contains(((PasswordRequirement) obj).getName())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (PasswordRequirement passwordRequirement : arrayList) {
            try {
                String pattern = passwordRequirement.getPolicyRegex();
                AbstractC22676k.m65750j(pattern, "pattern");
                Pattern patternCompile = Pattern.compile(pattern);
                AbstractC22676k.m65749i(patternCompile, "compile(...)");
                c37416g = new C37416g(passwordRequirement.getName(), new TextResource.C8691e(passwordRequirement.getErrorDescription()), patternCompile.matcher(password).matches());
            } catch (PatternSyntaxException e5) {
                this.logger.mo85230v(AbstractC11266d.m30461o("Invalid regex pattern from server: ", passwordRequirement.getPolicyRegex()), e5, new AbstractC30556a.a[0]);
                c37416g = new C37416g(passwordRequirement.getName(), new TextResource.C8691e(passwordRequirement.getErrorDescription()), false);
            }
            arrayList2.add(c37416g);
        }
        return arrayList2;
    }

    public /* synthetic */ C36195e(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PasswordValidator") : interfaceC34116n);
    }
}
