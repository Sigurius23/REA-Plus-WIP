package u82;

import j93.InterfaceC21461d;
import p005a3.EnumC0236o2;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import xr2.InterfaceC38631a;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: u82.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0012\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"", "Lxr2/a;", "T", "defaultValue", "Lwc3/c;", "a", "(Ljava/lang/Enum;)Lwc3/c;", "serialization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34649j {

    /* JADX INFO: renamed from: u82.j$a */
    @Metadata(m65680d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"u82/j$a", "Lwc3/c;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "b", "(Lzc3/e;Ljava/lang/Enum;)V", "Lzc3/d;", "decoder", "a", "(Lzc3/d;)Ljava/lang/Enum;", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "serialization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC37138c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC39443g descriptor;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC21461d f145955b;

        /* JADX INFO: Incorrect field signature: [TT; */
        /* JADX INFO: renamed from: c */
        final /* synthetic */ Enum[] f145956c;

        /* JADX INFO: Incorrect field signature: TT; */
        /* JADX INFO: renamed from: d */
        final /* synthetic */ Enum f145957d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC34116n f145958e;

        /* JADX WARN: Incorrect types in method signature: (Lj93/d;[TT;TT;Ltr2/n;)V */
        public a(InterfaceC21461d interfaceC21461d, Enum[] enumArr, Enum r10, InterfaceC34116n interfaceC34116n) {
            this.f145955b = interfaceC21461d;
            this.f145956c = enumArr;
            this.f145957d = r10;
            this.f145958e = interfaceC34116n;
            String qualifiedName = interfaceC21461d.getQualifiedName();
            this.descriptor = AbstractC35952b.m114194b(qualifiedName == null ? "Unknown" : qualifiedName, C39441e.f169698i);
        }

        /* JADX WARN: Incorrect return type in method signature: (Lzc3/d;)TT; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // wc3.InterfaceC37137b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Enum deserialize(InterfaceC40541d decoder) {
            EnumC0236o2 enumC0236o2;
            AbstractC22676k.m65750j(decoder, "decoder");
            String strDecodeString = decoder.decodeString();
            Enum[] enumArr = this.f145956c;
            int length = enumArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC0236o2 = 0;
                    break;
                }
                enumC0236o2 = enumArr[i13];
                if (AbstractC22676k.m65745e(((InterfaceC38631a) enumC0236o2).getSerializedValue(), strDecodeString)) {
                    break;
                }
                i13++;
            }
            if (enumC0236o2 != 0) {
                return enumC0236o2;
            }
            Enum r10 = this.f145957d;
            InterfaceC34116n interfaceC34116n = this.f145958e;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Unknown value \"", strDecodeString, "\" for ", this.f145955b.getQualifiedName(), ", using ");
            sbM32001t.append(r10);
            interfaceC34116n.mo85226q(sbM32001t.toString(), new AbstractC30556a.a[0]);
            return r10;
        }

        /* JADX WARN: Incorrect types in method signature: (Lzc3/e;TT;)V */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // wc3.InterfaceC37145j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(InterfaceC40542e encoder, Enum value) {
            AbstractC22676k.m65750j(encoder, "encoder");
            AbstractC22676k.m65750j(value, "value");
            encoder.encodeString(((InterfaceC38631a) value).getSerializedValue());
        }

        @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
        public InterfaceC39443g getDescriptor() {
            return this.descriptor;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lxr2/a;>(TT;)Lwc3/c; */
    /* JADX INFO: renamed from: a */
    public static final InterfaceC37138c m109491a(Enum defaultValue) {
        AbstractC22676k.m65750j(defaultValue, "defaultValue");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("SerializableEnumSerializer");
        InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(defaultValue.getClass());
        return new a(orCreateKotlinClass, (Enum[]) AbstractC21598x.m60663S(orCreateKotlinClass).getEnumConstants(), defaultValue, interfaceC34116nM107848a);
    }
}
