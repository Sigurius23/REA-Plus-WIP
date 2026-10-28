package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import hc3.AbstractC17176i;
import j93.InterfaceC21467g;
import j93.InterfaceC21477l;
import j93.InterfaceC21484q;
import j93.InterfaceC21490w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p471rx.AbstractC31885f;
import p715kotlin.jvm.internal.AbstractC22676k;
import sx.AbstractC33058d;
import sx.C33055a;
import sx.C33056b;

/* JADX INFO: renamed from: qx.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C30732q0 extends JsonAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126517a = 1;

    /* JADX INFO: renamed from: b */
    public final C30740v f126518b;

    /* JADX INFO: renamed from: c */
    public final Object f126519c;

    /* JADX INFO: renamed from: d */
    public final Object f126520d;

    /* JADX INFO: renamed from: e */
    public final Object f126521e;

    public C30732q0(InterfaceC21467g interfaceC21467g, ArrayList arrayList, ArrayList arrayList2, C30740v c30740v) {
        this.f126519c = interfaceC21467g;
        this.f126520d = arrayList;
        this.f126521e = arrayList2;
        this.f126518b = c30740v;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader reader) {
        switch (this.f126517a) {
            case 0:
                int iMo16726a0 = reader.mo16726a0(this.f126518b);
                if (iMo16726a0 != -1) {
                    return ((Enum[]) this.f126521e)[iMo16726a0];
                }
                String strM16727b = reader.m16727b();
                String strNextString = reader.nextString();
                StringBuilder sb4 = new StringBuilder("Expected one of ");
                AbstractC17176i.m48511m(" but was ", strNextString, " at path ", sb4, Arrays.asList((String[]) this.f126520d));
                sb4.append(strM16727b);
                throw new JsonDataException(sb4.toString());
            default:
                AbstractC22676k.m65750j(reader, "reader");
                InterfaceC21467g interfaceC21467g = (InterfaceC21467g) this.f126519c;
                int size = interfaceC21467g.getParameters().size();
                ArrayList arrayList = (ArrayList) this.f126520d;
                int size2 = arrayList.size();
                Object[] objArr = new Object[size2];
                int i13 = 0;
                while (true) {
                    Object obj = AbstractC33058d.f137851a;
                    if (i13 >= size2) {
                        reader.beginObject();
                        while (reader.hasNext()) {
                            int iMo16725T = reader.mo16725T(this.f126518b);
                            if (iMo16725T == -1) {
                                reader.mo16728b0();
                                reader.skipValue();
                            } else {
                                C33055a c33055a = (C33055a) ((ArrayList) this.f126521e).get(iMo16725T);
                                int i14 = c33055a.f137848e;
                                InterfaceC21490w interfaceC21490w = c33055a.f137846c;
                                if (objArr[i14] != obj) {
                                    throw new JsonDataException("Multiple values for '" + interfaceC21490w.getName() + "' at " + reader.m16727b());
                                }
                                Object objFromJson = c33055a.f137845b.fromJson(reader);
                                objArr[i14] = objFromJson;
                                if (objFromJson == null && !interfaceC21490w.getReturnType().isMarkedNullable()) {
                                    throw AbstractC31885f.m99135m(interfaceC21490w.getName(), c33055a.f137844a, reader);
                                }
                            }
                        }
                        reader.endObject();
                        boolean z4 = arrayList.size() == size;
                        for (int i15 = 0; i15 < size; i15++) {
                            if (objArr[i15] == obj) {
                                if (((InterfaceC21484q) interfaceC21467g.getParameters().get(i15)).isOptional()) {
                                    z4 = false;
                                } else {
                                    if (!((InterfaceC21484q) interfaceC21467g.getParameters().get(i15)).getType().isMarkedNullable()) {
                                        String name = ((InterfaceC21484q) interfaceC21467g.getParameters().get(i15)).getName();
                                        C33055a c33055a2 = (C33055a) arrayList.get(i15);
                                        throw AbstractC31885f.m99129g(name, c33055a2 != null ? c33055a2.f137844a : null, reader);
                                    }
                                    objArr[i15] = null;
                                }
                            }
                        }
                        Object objCall = z4 ? interfaceC21467g.call(Arrays.copyOf(objArr, size2)) : interfaceC21467g.callBy(new C33056b(interfaceC21467g.getParameters(), objArr));
                        int size3 = arrayList.size();
                        while (size < size3) {
                            Object obj2 = arrayList.get(size);
                            AbstractC22676k.m65747g(obj2);
                            C33055a c33055a3 = (C33055a) obj2;
                            Object obj3 = objArr[size];
                            if (obj3 != obj) {
                                ((InterfaceC21477l) c33055a3.f137846c).set(objCall, obj3);
                            }
                            size++;
                        }
                        return objCall;
                    }
                    objArr[i13] = obj;
                    i13++;
                }
                break;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 writer, Object obj) {
        switch (this.f126517a) {
            case 0:
                writer.mo94362F0(((String[]) this.f126520d)[((Enum) obj).ordinal()]);
                return;
            default:
                AbstractC22676k.m65750j(writer, "writer");
                if (obj == null) {
                    throw new NullPointerException("value == null");
                }
                writer.mo94368h();
                for (C33055a c33055a : (ArrayList) this.f126520d) {
                    if (c33055a != null) {
                        writer.mo94373x(c33055a.f137844a);
                        c33055a.f137845b.toJson(writer, c33055a.f137846c.get(obj));
                    }
                }
                writer.mo94370m();
                return;
        }
    }

    public final String toString() {
        switch (this.f126517a) {
            case 0:
                return "JsonAdapter(" + ((Class) this.f126519c).getName() + ")";
            default:
                return "KotlinJsonAdapter(" + ((InterfaceC21467g) this.f126519c).getReturnType() + ')';
        }
    }

    public C30732q0(Class cls) {
        int i13 = 0;
        this.f126519c = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f126521e = enumArr;
            this.f126520d = new String[enumArr.length];
            while (true) {
                Enum[] enumArr2 = (Enum[]) this.f126521e;
                if (i13 < enumArr2.length) {
                    String strName = enumArr2[i13].name();
                    String[] strArr = (String[]) this.f126520d;
                    Field field = cls.getField(strName);
                    Set set = AbstractC31885f.f132390a;
                    InterfaceC30731q interfaceC30731q = (InterfaceC30731q) field.getAnnotation(InterfaceC30731q.class);
                    if (interfaceC30731q != null) {
                        String strName2 = interfaceC30731q.name();
                        if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName2)) {
                            strName = strName2;
                        }
                    }
                    strArr[i13] = strName;
                    i13++;
                } else {
                    this.f126518b = C30740v.m94403a((String[]) this.f126520d);
                    return;
                }
            }
        } catch (NoSuchFieldException e5) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e5);
        }
    }
}
