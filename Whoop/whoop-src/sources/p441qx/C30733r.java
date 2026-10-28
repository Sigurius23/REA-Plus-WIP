package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;

/* JADX INFO: renamed from: qx.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C30733r extends JsonAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JsonAdapter f126523b;

    public /* synthetic */ C30733r(JsonAdapter jsonAdapter, int i13) {
        this.f126522a = i13;
        this.f126523b = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        switch (this.f126522a) {
            case 0:
                return this.f126523b.fromJson(jsonReader);
            case 1:
                boolean z4 = jsonReader.f22075E;
                jsonReader.f22075E = true;
                try {
                    return this.f126523b.fromJson(jsonReader);
                } finally {
                    jsonReader.f22075E = z4;
                }
            default:
                boolean z13 = jsonReader.f22076F;
                jsonReader.f22076F = true;
                try {
                    return this.f126523b.fromJson(jsonReader);
                } finally {
                    jsonReader.f22076F = z13;
                }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final boolean isLenient() {
        switch (this.f126522a) {
            case 0:
                return this.f126523b.isLenient();
            case 1:
                return true;
            default:
                return this.f126523b.isLenient();
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        switch (this.f126522a) {
            case 0:
                boolean z4 = abstractC30704c0.f126434G;
                abstractC30704c0.f126434G = true;
                try {
                    this.f126523b.toJson(abstractC30704c0, obj);
                    return;
                } finally {
                    abstractC30704c0.f126434G = z4;
                }
            case 1:
                boolean z13 = abstractC30704c0.f126433F;
                abstractC30704c0.f126433F = true;
                try {
                    this.f126523b.toJson(abstractC30704c0, obj);
                    return;
                } finally {
                    abstractC30704c0.f126433F = z13;
                }
            default:
                this.f126523b.toJson(abstractC30704c0, obj);
                return;
        }
    }

    public final String toString() {
        switch (this.f126522a) {
            case 0:
                return this.f126523b + ".serializeNulls()";
            case 1:
                return this.f126523b + ".lenient()";
            default:
                return this.f126523b + ".failOnUnknown()";
        }
    }
}
