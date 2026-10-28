package jg3;

import com.squareup.wire.AbstractC5583n;
import g73.C15553a;
import java.io.DataInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.regex.Pattern;
import ng3.EnumC26688a;
import og3.C27928g;
import org.threeten.p379bp.DateTimeException;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: jg3.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C21685l implements Externalizable {

    /* JADX INFO: renamed from: w */
    public byte f83269w;

    /* JADX INFO: renamed from: x */
    public Object f83270x;

    public C21685l() {
    }

    /* JADX INFO: renamed from: a */
    public static Serializable m61059a(byte b, DataInput dataInput) throws IOException {
        if (b == 64) {
            int i13 = C21681h.f83258H;
            byte b6 = dataInput.readByte();
            byte b8 = dataInput.readByte();
            EnumC21680g enumC21680gM61047o = EnumC21680g.m61047o(b6);
            AbstractC5583n.m16762V(enumC21680gM61047o, "month");
            EnumC26688a.DAY_OF_MONTH.m79394f(b8);
            if (b8 <= enumC21680gM61047o.m61051n()) {
                return new C21681h(enumC21680gM61047o.m61049l(), b8);
            }
            StringBuilder sbM30466t = AbstractC11266d.m30466t(b8, "Illegal value for DayOfMonth field, value ", " is not valid for month ");
            sbM30466t.append(enumC21680gM61047o.name());
            throw new DateTimeException(sbM30466t.toString());
        }
        switch (b) {
            case 1:
                C21675b c21675b = C21675b.f83231y;
                long j7 = dataInput.readLong();
                long j13 = dataInput.readInt();
                return C21675b.m60989a(AbstractC5583n.m16743B(1000000000, j13), AbstractC5583n.m16763W(j7, AbstractC5583n.m16742A(j13, 1000000000L)));
            case 2:
                C21676c c21676c = C21676c.f83234H;
                return C21676c.m60992q0(dataInput.readLong(), dataInput.readInt());
            case 3:
                C21677d c21677d = C21677d.f83237I;
                return C21677d.m61003t0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
            case 4:
                C21678e c21678e = C21678e.f83243H;
                C21677d c21677d2 = C21677d.f83237I;
                return C21678e.m61018t0(C21677d.m61003t0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte()), C21679f.m61028B0(dataInput));
            case 5:
                return C21679f.m61028B0(dataInput);
            case 6:
                C21678e c21678e2 = C21678e.f83243H;
                C21677d c21677d3 = C21677d.f83237I;
                C21678e c21678eM61018t0 = C21678e.m61018t0(C21677d.m61003t0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte()), C21679f.m61028B0(dataInput));
                C21689p c21689pM61078t = C21689p.m61078t(dataInput);
                AbstractC21688o abstractC21688o = (AbstractC21688o) m61059a(dataInput.readByte(), dataInput);
                AbstractC5583n.m16762V(abstractC21688o, "zone");
                if (!(abstractC21688o instanceof C21689p) || c21689pM61078t.equals(abstractC21688o)) {
                    return new C21691r(c21678eM61018t0, abstractC21688o, c21689pM61078t);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                Pattern pattern = C21690q.f83284z;
                String utf = dataInput.readUTF();
                if (utf.equals("Z") || utf.startsWith("+") || utf.startsWith("-")) {
                    throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(utf));
                }
                if (utf.equals("UTC") || utf.equals("GMT") || utf.equals("UT")) {
                    C21689p c21689p = C21689p.f83278F;
                    c21689p.getClass();
                    return new C21690q(utf, new C27928g(c21689p));
                }
                if (utf.startsWith("UTC+") || utf.startsWith("GMT+") || utf.startsWith("UTC-") || utf.startsWith("GMT-")) {
                    C21689p c21689pM61074p = C21689p.m61074p(utf.substring(3));
                    if (c21689pM61074p.f83282x == 0) {
                        return new C21690q(utf.substring(0, 3), new C27928g(c21689pM61074p));
                    }
                    return new C21690q(utf.substring(0, 3) + c21689pM61074p.f83283y, new C27928g(c21689pM61074p));
                }
                if (!utf.startsWith("UT+") && !utf.startsWith("UT-")) {
                    return C21690q.m61080o(utf, false);
                }
                C21689p c21689pM61074p2 = C21689p.m61074p(utf.substring(2));
                if (c21689pM61074p2.f83282x == 0) {
                    return new C21690q("UT", new C27928g(c21689pM61074p2));
                }
                return new C21690q("UT" + c21689pM61074p2.f83283y, new C27928g(c21689pM61074p2));
            case 8:
                return C21689p.m61078t(dataInput);
            default:
                switch (b) {
                    case 66:
                        int i14 = C21683j.f83264H;
                        return new C21683j(C21679f.m61028B0(dataInput), C21689p.m61078t(dataInput));
                    case 67:
                        int i15 = C21686m.f83271G;
                        return C21686m.m61060o0(dataInput.readInt());
                    case 68:
                        int i16 = C21687n.f83273H;
                        int i17 = dataInput.readInt();
                        byte b14 = dataInput.readByte();
                        EnumC26688a.YEAR.m79394f(i17);
                        EnumC26688a.MONTH_OF_YEAR.m79394f(b14);
                        return new C21687n(i17, b14);
                    case 69:
                        C15553a c15553a = C21682i.f83261H;
                        C21677d c21677d4 = C21677d.f83237I;
                        return new C21682i(C21678e.m61018t0(C21677d.m61003t0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte()), C21679f.m61028B0(dataInput)), C21689p.m61078t(dataInput));
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.f83270x;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.f83269w = b;
        this.f83270x = m61059a(b, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f83269w;
        Object obj = this.f83270x;
        objectOutput.writeByte(b);
        if (b == 64) {
            C21681h c21681h = (C21681h) obj;
            objectOutput.writeByte(c21681h.f83259F);
            objectOutput.writeByte(c21681h.f83260G);
            return;
        }
        switch (b) {
            case 1:
                C21675b c21675b = (C21675b) obj;
                objectOutput.writeLong(c21675b.f83232w);
                objectOutput.writeInt(c21675b.f83233x);
                return;
            case 2:
                C21676c c21676c = (C21676c) obj;
                objectOutput.writeLong(c21676c.f83235F);
                objectOutput.writeInt(c21676c.f83236G);
                return;
            case 3:
                C21677d c21677d = (C21677d) obj;
                objectOutput.writeInt(c21677d.f83240F);
                objectOutput.writeByte(c21677d.f83241G);
                objectOutput.writeByte(c21677d.f83242H);
                return;
            case 4:
                C21678e c21678e = (C21678e) obj;
                C21677d c21677d2 = c21678e.f83246F;
                objectOutput.writeInt(c21677d2.f83240F);
                objectOutput.writeByte(c21677d2.f83241G);
                objectOutput.writeByte(c21677d2.f83242H);
                c21678e.f83247G.m61040H0(objectOutput);
                return;
            case 5:
                ((C21679f) obj).m61040H0(objectOutput);
                return;
            case 6:
                C21691r c21691r = (C21691r) obj;
                C21678e c21678e2 = c21691r.f83287F;
                C21677d c21677d3 = c21678e2.f83246F;
                objectOutput.writeInt(c21677d3.f83240F);
                objectOutput.writeByte(c21677d3.f83241G);
                objectOutput.writeByte(c21677d3.f83242H);
                c21678e2.f83247G.m61040H0(objectOutput);
                c21691r.f83288G.m61079u(objectOutput);
                c21691r.f83289H.mo61072n(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((C21690q) obj).f83285x);
                return;
            case 8:
                ((C21689p) obj).m61079u(objectOutput);
                return;
            default:
                switch (b) {
                    case 66:
                        C21683j c21683j = (C21683j) obj;
                        c21683j.f83265F.m61040H0(objectOutput);
                        c21683j.f83266G.m61079u(objectOutput);
                        return;
                    case 67:
                        objectOutput.writeInt(((C21686m) obj).f83272F);
                        return;
                    case 68:
                        C21687n c21687n = (C21687n) obj;
                        objectOutput.writeInt(c21687n.f83274F);
                        objectOutput.writeByte(c21687n.f83275G);
                        return;
                    case 69:
                        C21682i c21682i = (C21682i) obj;
                        C21678e c21678e3 = c21682i.f83262F;
                        C21677d c21677d4 = c21678e3.f83246F;
                        objectOutput.writeInt(c21677d4.f83240F);
                        objectOutput.writeByte(c21677d4.f83241G);
                        objectOutput.writeByte(c21677d4.f83242H);
                        c21678e3.f83247G.m61040H0(objectOutput);
                        c21682i.f83263G.m61079u(objectOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }

    public C21685l(Object obj, byte b) {
        this.f83269w = b;
        this.f83270x = obj;
    }
}
