package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: qx.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C30730p0 extends JsonAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126516a;

    public /* synthetic */ C30730p0(int i13) {
        this.f126516a = i13;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        switch (this.f126516a) {
            case 0:
                return jsonReader.nextString();
            case 1:
                return Boolean.valueOf(jsonReader.mo16729h());
            case 2:
                return Byte.valueOf((byte) AbstractC30736s0.m94402a(jsonReader, "a byte", -128, 255));
            case 3:
                String strNextString = jsonReader.nextString();
                if (strNextString.length() <= 1) {
                    return Character.valueOf(strNextString.charAt(0));
                }
                throw new JsonDataException(AbstractC31061c.m95640p("Expected a char but was ", AbstractC31061c.m95633i('\"', "\"", strNextString), " at path ", jsonReader.m16727b()));
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                float fNextDouble = (float) jsonReader.nextDouble();
                if (jsonReader.f22075E || !Float.isInfinite(fNextDouble)) {
                    return Float.valueOf(fNextDouble);
                }
                throw new JsonDataException("JSON forbids NaN and infinities: " + fNextDouble + " at path " + jsonReader.m16727b());
            case 6:
                return Integer.valueOf(jsonReader.nextInt());
            case 7:
                return Long.valueOf(jsonReader.nextLong());
            default:
                return Short.valueOf((short) AbstractC30736s0.m94402a(jsonReader, "a short", -32768, 32767));
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        switch (this.f126516a) {
            case 0:
                abstractC30704c0.mo94362F0((String) obj);
                break;
            case 1:
                abstractC30704c0.mo94364M0(((Boolean) obj).booleanValue());
                break;
            case 2:
                abstractC30704c0.mo94372p0(((Byte) obj).intValue() & 255);
                break;
            case 3:
                abstractC30704c0.mo94362F0(((Character) obj).toString());
                break;
            case 4:
                abstractC30704c0.mo94371o0(((Double) obj).doubleValue());
                break;
            case 5:
                Float f13 = (Float) obj;
                f13.getClass();
                abstractC30704c0.mo94374x0(f13);
                break;
            case 6:
                abstractC30704c0.mo94372p0(((Integer) obj).intValue());
                break;
            case 7:
                abstractC30704c0.mo94372p0(((Long) obj).longValue());
                break;
            default:
                abstractC30704c0.mo94372p0(((Short) obj).intValue());
                break;
        }
    }

    public final String toString() {
        switch (this.f126516a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
