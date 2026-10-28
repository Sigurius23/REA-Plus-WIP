package jg3;

import com.squareup.wire.AbstractC5583n;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.regex.Pattern;
import og3.AbstractC27929h;
import og3.C27925d;
import og3.C27928g;
import org.threeten.p379bp.DateTimeException;
import org.threeten.p379bp.zone.ZoneRulesException;

/* JADX INFO: renamed from: jg3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C21690q extends AbstractC21688o {

    /* JADX INFO: renamed from: z */
    public static final Pattern f83284z = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* JADX INFO: renamed from: x */
    public final String f83285x;

    /* JADX INFO: renamed from: y */
    public final transient AbstractC27929h f83286y;

    public C21690q(String str, AbstractC27929h abstractC27929h) {
        this.f83285x = str;
        this.f83286y = abstractC27929h;
    }

    /* JADX INFO: renamed from: o */
    public static C21690q m61080o(String str, boolean z4) {
        AbstractC27929h c27928g;
        AbstractC5583n.m16762V(str, "zoneId");
        if (str.length() < 2 || !f83284z.matcher(str).matches()) {
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        try {
            c27928g = C27925d.m84272a(str);
        } catch (ZoneRulesException e5) {
            if (str.equals("GMT0")) {
                C21689p c21689p = C21689p.f83278F;
                c21689p.getClass();
                c27928g = new C27928g(c21689p);
            } else {
                if (z4) {
                    throw e5;
                }
                c27928g = null;
            }
        }
        return new C21690q(str, c27928g);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 7);
    }

    @Override // jg3.AbstractC21688o
    public final String getId() {
        return this.f83285x;
    }

    @Override // jg3.AbstractC21688o
    /* JADX INFO: renamed from: k */
    public final AbstractC27929h mo61071k() {
        AbstractC27929h abstractC27929h = this.f83286y;
        return abstractC27929h != null ? abstractC27929h : C27925d.m84272a(this.f83285x);
    }

    @Override // jg3.AbstractC21688o
    /* JADX INFO: renamed from: n */
    public final void mo61072n(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f83285x);
    }
}
