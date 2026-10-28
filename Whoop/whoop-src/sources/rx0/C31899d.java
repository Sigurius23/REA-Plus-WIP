package rx0;

import ad3.AbstractC0757c;
import com.whoop.design.models.DesignSystemModel;
import jb1.C21535a;
import kotlinx.serialization.SerializationException;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import wb3.AbstractC37056f;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rx0.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lrx0/d;", "", "Lad3/c;", "json", "Ljb1/a;", "reducer", "<init>", "(Lad3/c;Ljb1/a;)V", "", "rawJson", "Lrx0/c;", "a", "(Ljava/lang/String;)Lrx0/c;", "Lad3/c;", "b", "Ljb1/a;", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31899d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a reducer;

    public C31899d(AbstractC0757c json, C21535a reducer) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(reducer, "reducer");
        this.json = json;
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC31898c m99152a(String rawJson) {
        AbstractC22676k.m65750j(rawJson, "rawJson");
        String string = AbstractC39414r.m125869O0(rawJson).toString();
        if (AbstractC39414r.m125890i0(string)) {
            return InterfaceC31898c.a.f132405a;
        }
        InterfaceC37138c interfaceC37138cMo13924b = this.json.f2764b.mo13924b(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DesignSystemModel.class), C25271y.f99162w);
        if (interfaceC37138cMo13924b == null) {
            return new InterfaceC31898c.b("No design-model serializer registered");
        }
        try {
            C25306o c25306o = (C25306o) AbstractC25265s.m74100H0(C21535a.m60536k(this.reducer, AbstractC37056f.m118958J((DesignSystemModel) this.json.m1831b(interfaceC37138cMo13924b, string)), null, 2, null));
            return c25306o != null ? new InterfaceC31898c.c(c25306o) : new InterfaceC31898c.b("Unknown or unsupported design model type");
        } catch (SerializationException e5) {
            String message = e5.getMessage();
            return new InterfaceC31898c.b(message != null ? message : "Invalid JSON");
        } catch (IllegalArgumentException e13) {
            String message2 = e13.getMessage();
            return new InterfaceC31898c.b(message2 != null ? message2 : "Invalid JSON");
        }
    }
}
