package p133f1;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import p027b3.C2354b2;
import p027b3.C2386i;
import p027b3.C2428q1;
import p027b3.InterfaceC2433r1;
import p208i2.C17919x;
import p208i2.C17924z0;
import p294l3.C23248d;
import p294l3.C23250e;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23283u0;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p412q3.C29891y;
import p478s3.C32096b;
import p505ts.AbstractC34132o;
import p510u0.EnumC34318g0;
import p558vp.AbstractC36259c;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p636y3.C39183o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import se.AbstractC32410a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: f1.m1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13959m1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49757w;

    /* JADX INFO: renamed from: x */
    public int f49758x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13977s1 f49759y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13959m1(C13977s1 c13977s1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f49757w = i13;
        this.f49759y = c13977s1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f49757w) {
            case 0:
                return new C13959m1(this.f49759y, interfaceC30057d, 0);
            default:
                return new C13959m1(this.f49759y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f49757w) {
            case 0:
                break;
        }
        return ((C13959m1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:153:0x033e  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object c2428q1;
        C23454a0 c23454a0;
        Object c23254g;
        CharSequence text;
        int i13;
        C23254g c23254g2;
        switch (this.f49757w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f49758x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                C13977s1 c13977s1 = this.f49759y;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (!C23283u0.m67357c(c13977s1.m39783m().f122126b)) {
                        InterfaceC2433r1 interfaceC2433r1 = c13977s1.f49852h;
                        if (interfaceC2433r1 != null) {
                            C2428q1 c2428q1M101029f0 = AbstractC32410a.m101029f0(AbstractC36259c.m115676V(c13977s1.m39783m()));
                            this.f49758x = 1;
                            ((C2386i) interfaceC2433r1).m7389a(c2428q1M101029f0);
                            if (c23454a1 == enumC31071a) {
                                return enumC31071a;
                            }
                        }
                    }
                    return c23454a1;
                }
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C23254g c23254gM115679Z = AbstractC36259c.m115679Z(c13977s1.m39783m(), c13977s1.m39783m().f122125a.f92135x.length());
                C23254g c23254gM115678Y = AbstractC36259c.m115678Y(c13977s1.m39783m(), c13977s1.m39783m().f122125a.f92135x.length());
                C23248d c23248d = new C23248d(c23254gM115679Z);
                c23248d.m67301c(c23254gM115678Y);
                C23254g c23254gM67309k = c23248d.m67309k();
                int iM67360f = C23283u0.m67360f(c13977s1.m39783m().f122126b);
                C29891y c29891yM39774e = C13977s1.m39774e(c23254gM67309k, AbstractC21478l0.m60431f(iM67360f, iM67360f));
                c13977s1.f49847c.invoke(c29891yM39774e);
                c13977s1.f49867w = new C23283u0(c29891yM39774e.f122126b);
                c13977s1.m39786p(EnumC34318g0.f144086w);
                c13977s1.f49845a.f144358e = true;
                return c23454a1;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f49758x;
                C23454a0 c23454a2 = C23454a0.f92919a;
                byte b = 1;
                C13977s1 c13977s2 = this.f49759y;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2433r1 interfaceC2433r2 = c13977s2.f49852h;
                    if (interfaceC2433r2 != null) {
                        this.f49758x = 1;
                        ClipData primaryClip = ((C2386i) interfaceC2433r2).f9436a.f9446a.getPrimaryClip();
                        c2428q1 = primaryClip != null ? new C2428q1(primaryClip) : null;
                        if (c2428q1 == enumC31071a2) {
                            return enumC31071a2;
                        }
                    } else {
                        c23454a0 = c23454a2;
                    }
                    return c23454a0;
                }
                if (i15 == 1) {
                    AbstractC34132o.m107864I(obj);
                    c2428q1 = obj;
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    c23254g = obj;
                    c23454a0 = c23454a2;
                }
                c23254g2 = (C23254g) c23254g;
                if (c23254g2 != null) {
                    C23248d c23248d2 = new C23248d(AbstractC36259c.m115679Z(c13977s2.m39783m(), c13977s2.m39783m().f122125a.f92135x.length()));
                    c23248d2.m67301c(c23254g2);
                    C23254g c23254gM67309k2 = c23248d2.m67309k();
                    C23254g c23254gM115678Y2 = AbstractC36259c.m115678Y(c13977s2.m39783m(), c13977s2.m39783m().f122125a.f92135x.length());
                    C23248d c23248d3 = new C23248d(c23254gM67309k2);
                    c23248d3.m67301c(c23254gM115678Y2);
                    C23254g c23254gM67309k3 = c23248d3.m67309k();
                    int length = c23254g2.f92135x.length() + C23283u0.m67360f(c13977s2.m39783m().f122126b);
                    C29891y c29891yM39774e2 = C13977s1.m39774e(c23254gM67309k3, AbstractC21478l0.m60431f(length, length));
                    c13977s2.f49847c.invoke(c29891yM39774e2);
                    c13977s2.f49867w = new C23283u0(c29891yM39774e2.f122126b);
                    c13977s2.m39786p(EnumC34318g0.f144086w);
                    c13977s2.f49845a.f144358e = true;
                }
                return c23454a0;
                C2428q1 c2428q2 = (C2428q1) c2428q1;
                if (c2428q2 != null) {
                    this.f49758x = 2;
                    ClipData clipData = c2428q2.f9518a;
                    int i16 = 0;
                    ClipData.Item itemAt = clipData.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        c23454a0 = c23454a2;
                        c23254g = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        AbstractC22676k.m65750j(annotationArr, "<this>");
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i17 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i17];
                                int i18 = i16;
                                if (AbstractC22676k.m65745e(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    C2354b2 c2354b2 = new C2354b2(annotation.getValue());
                                    Parcel parcel = c2354b2.f9307b;
                                    long jM7273a = C17919x.f69637n;
                                    long jM7273a2 = jM7273a;
                                    long jM7274b = C39183o.f168428c;
                                    long jM7274b2 = jM7274b;
                                    C28780r c28780r = null;
                                    C28776n c28776n = null;
                                    C28777o c28777o = null;
                                    String string = null;
                                    C36765a c36765a = null;
                                    C36780p c36780p = null;
                                    C36776l c36776l = null;
                                    C17924z0 c17924z0 = null;
                                    while (true) {
                                        if (parcel.dataAvail() > b) {
                                            byte b6 = parcel.readByte();
                                            text = text;
                                            if (b6 == b) {
                                                if (parcel.dataAvail() >= 8) {
                                                    jM7273a = c2354b2.m7273a();
                                                    text = text;
                                                }
                                            } else if (b6 == 2) {
                                                if (parcel.dataAvail() >= 5) {
                                                    jM7274b = c2354b2.m7274b();
                                                    b = 1;
                                                }
                                            } else if (b6 == 3) {
                                                if (parcel.dataAvail() >= 4) {
                                                    c28780r = new C28780r(parcel.readInt());
                                                    b = 1;
                                                }
                                            } else if (b6 == 4) {
                                                b = 1;
                                                if (parcel.dataAvail() >= 1) {
                                                    byte b8 = parcel.readByte();
                                                    c28776n = new C28776n((b8 != 0 && b8 == 1) ? 1 : i18);
                                                    text = text;
                                                }
                                            } else if (b6 != 5) {
                                                if (b6 == 6) {
                                                    string = parcel.readString();
                                                } else if (b6 == 7) {
                                                    if (parcel.dataAvail() >= 5) {
                                                        jM7274b2 = c2354b2.m7274b();
                                                    }
                                                } else if (b6 == 8) {
                                                    if (parcel.dataAvail() >= 4) {
                                                        c36765a = new C36765a(parcel.readFloat());
                                                    }
                                                } else if (b6 == 9) {
                                                    if (parcel.dataAvail() >= 8) {
                                                        c36780p = new C36780p(parcel.readFloat(), parcel.readFloat());
                                                    }
                                                } else if (b6 != 10) {
                                                    if (b6 != 11) {
                                                        c23454a0 = c23454a2;
                                                        if (b6 == 12) {
                                                            if (parcel.dataAvail() >= 20) {
                                                                c23454a2 = c23454a0;
                                                                c17924z0 = new C17924z0(c2354b2.m7273a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                            }
                                                        }
                                                        b = 1;
                                                    } else if (parcel.dataAvail() >= 4) {
                                                        int i19 = parcel.readInt();
                                                        int i24 = (i19 & 2) != 0 ? 1 : i18;
                                                        int i25 = (i19 & 1) != 0 ? 1 : i18;
                                                        C36776l c36776l2 = C36776l.f157353d;
                                                        int i26 = i25;
                                                        C36776l c36776l3 = C36776l.f157352c;
                                                        if (i24 == 0 || i26 == 0) {
                                                            c23454a0 = c23454a2;
                                                            if (i24 != 0) {
                                                                c36776l = c36776l2;
                                                            } else {
                                                                if (i26 == 0) {
                                                                    c36776l3 = C36776l.f157351b;
                                                                }
                                                                c36776l = c36776l3;
                                                            }
                                                        } else {
                                                            List listM118959K = AbstractC37056f.m118959K(c36776l2, c36776l3);
                                                            Integer numValueOf = Integer.valueOf(i18);
                                                            int size = listM118959K.size();
                                                            c23454a0 = c23454a2;
                                                            int i27 = i18;
                                                            while (i27 < size) {
                                                                numValueOf = Integer.valueOf(((C36776l) listM118959K.get(i27)).f157354a | numValueOf.intValue());
                                                                i27++;
                                                                listM118959K = listM118959K;
                                                            }
                                                            c36776l = new C36776l(numValueOf.intValue());
                                                        }
                                                    }
                                                    c23454a2 = c23454a0;
                                                    b = 1;
                                                } else if (parcel.dataAvail() >= 8) {
                                                    jM7273a2 = c2354b2.m7273a();
                                                }
                                                b = 1;
                                            } else if (parcel.dataAvail() >= 1) {
                                                byte b14 = parcel.readByte();
                                                if (b14 == 0) {
                                                    i13 = i18;
                                                } else if (b14 == 1) {
                                                    i13 = 65535;
                                                } else {
                                                    if (b14 == 3) {
                                                        i13 = 2;
                                                    } else {
                                                        i13 = b14 == 2 ? 1 : i18;
                                                    }
                                                    c28777o = new C28777o(i13);
                                                    b = 1;
                                                }
                                                c28777o = new C28777o(i13);
                                                b = 1;
                                            }
                                        } else {
                                            text = text;
                                        }
                                        c23454a0 = c23454a2;
                                    }
                                    arrayList.add(new C23250e(new C23267m0(jM7273a, jM7274b, c28780r, c28776n, c28777o, (AbstractC28771i) null, string, jM7274b2, c36765a, c36780p, (C32096b) null, jM7273a2, c36776l, c17924z0, 49152), spanStart, spanEnd));
                                } else {
                                    text = text;
                                    c23454a0 = c23454a2;
                                }
                                if (i17 != length2) {
                                    i17++;
                                    i16 = i18;
                                    text = text;
                                    c23454a2 = c23454a0;
                                    b = 1;
                                }
                            }
                        } else {
                            text = text;
                            c23454a0 = c23454a2;
                        }
                        c23254g = new C23254g(4, text.toString(), arrayList);
                    } else {
                        c23254g = new C23254g(text.toString());
                        c23454a0 = c23454a2;
                    }
                    if (c23254g == enumC31071a2) {
                        return enumC31071a2;
                    }
                    c23254g2 = (C23254g) c23254g;
                    if (c23254g2 != null) {
                        C23248d c23248d4 = new C23248d(AbstractC36259c.m115679Z(c13977s2.m39783m(), c13977s2.m39783m().f122125a.f92135x.length()));
                        c23248d4.m67301c(c23254g2);
                        C23254g c23254gM67309k4 = c23248d4.m67309k();
                        C23254g c23254gM115678Y3 = AbstractC36259c.m115678Y(c13977s2.m39783m(), c13977s2.m39783m().f122125a.f92135x.length());
                        C23248d c23248d5 = new C23248d(c23254gM67309k4);
                        c23248d5.m67301c(c23254gM115678Y3);
                        C23254g c23254gM67309k5 = c23248d5.m67309k();
                        int length3 = c23254g2.f92135x.length() + C23283u0.m67360f(c13977s2.m39783m().f122126b);
                        C29891y c29891yM39774e3 = C13977s1.m39774e(c23254gM67309k5, AbstractC21478l0.m60431f(length3, length3));
                        c13977s2.f49847c.invoke(c29891yM39774e3);
                        c13977s2.f49867w = new C23283u0(c29891yM39774e3.f122126b);
                        c13977s2.m39786p(EnumC34318g0.f144086w);
                        c13977s2.f49845a.f144358e = true;
                    }
                } else {
                    c23454a0 = c23454a2;
                }
                return c23454a0;
        }
    }
}
