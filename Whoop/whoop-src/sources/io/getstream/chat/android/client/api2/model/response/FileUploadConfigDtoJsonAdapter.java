package io.getstream.chat.android.client.api2.model.response;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p471rx.C31882d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;)V", "Lqx/v;", "options", "Lqx/v;", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableLongAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FileUploadConfigDtoJsonAdapter extends JsonAdapter<FileUploadConfigDto> {
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final C30740v options;

    public FileUploadConfigDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("allowed_file_extensions", "allowed_mime_types", "blocked_file_extensions", "blocked_mime_types", "size_limit");
        C31882d c31882dM5369F = AbstractC1772c1.m5369F(List.class, String.class);
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.listOfStringAdapter = moshi.m94400c(c31882dM5369F, c25235a0, "allowed_file_extensions");
        this.nullableLongAdapter = moshi.m94400c(Long.class, c25235a0, "size_limit");
    }

    public String toString() {
        return AbstractC36095b.m114677e(41, "GeneratedJsonAdapter(FileUploadConfigDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public FileUploadConfigDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        Long l7 = null;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                list = (List) this.listOfStringAdapter.fromJson(reader);
                if (list == null) {
                    throw AbstractC31885f.m99135m("allowed_file_extensions", "allowed_file_extensions", reader);
                }
            } else if (iMo16725T == 1) {
                list2 = (List) this.listOfStringAdapter.fromJson(reader);
                if (list2 == null) {
                    throw AbstractC31885f.m99135m("allowed_mime_types", "allowed_mime_types", reader);
                }
            } else if (iMo16725T == 2) {
                list3 = (List) this.listOfStringAdapter.fromJson(reader);
                if (list3 == null) {
                    throw AbstractC31885f.m99135m("blocked_file_extensions", "blocked_file_extensions", reader);
                }
            } else if (iMo16725T == 3) {
                list4 = (List) this.listOfStringAdapter.fromJson(reader);
                if (list4 == null) {
                    throw AbstractC31885f.m99135m("blocked_mime_types", "blocked_mime_types", reader);
                }
            } else if (iMo16725T == 4) {
                l7 = (Long) this.nullableLongAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw AbstractC31885f.m99129g("allowed_file_extensions", "allowed_file_extensions", reader);
        }
        if (list2 == null) {
            throw AbstractC31885f.m99129g("allowed_mime_types", "allowed_mime_types", reader);
        }
        if (list3 == null) {
            throw AbstractC31885f.m99129g("blocked_file_extensions", "blocked_file_extensions", reader);
        }
        if (list4 != null) {
            return new FileUploadConfigDto(list, list2, list3, list4, l7);
        }
        throw AbstractC31885f.m99129g("blocked_mime_types", "blocked_mime_types", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, FileUploadConfigDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("allowed_file_extensions");
        this.listOfStringAdapter.toJson(writer, value_.getAllowed_file_extensions());
        writer.mo94373x("allowed_mime_types");
        this.listOfStringAdapter.toJson(writer, value_.getAllowed_mime_types());
        writer.mo94373x("blocked_file_extensions");
        this.listOfStringAdapter.toJson(writer, value_.getBlocked_file_extensions());
        writer.mo94373x("blocked_mime_types");
        this.listOfStringAdapter.toJson(writer, value_.getBlocked_mime_types());
        writer.mo94373x("size_limit");
        this.nullableLongAdapter.toJson(writer, value_.getSize_limit());
        writer.mo94370m();
    }
}
