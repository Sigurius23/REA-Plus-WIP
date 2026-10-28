package io.getstream.chat.android.client.api2.model.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/AppDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/AppDto;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/api2/model/response/AppDto;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/api2/model/response/AppDto;)V", "Lqx/v;", "options", "Lqx/v;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/api2/model/response/FileUploadConfigDto;", "fileUploadConfigDtoAdapter", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AppDtoJsonAdapter extends JsonAdapter<AppDto> {
    private final JsonAdapter<FileUploadConfigDto> fileUploadConfigDtoAdapter;
    private final C30740v options;
    private final JsonAdapter<String> stringAdapter;

    public AppDtoJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("name", "file_upload_config", "image_upload_config");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.stringAdapter = moshi.m94400c(String.class, c25235a0, "name");
        this.fileUploadConfigDtoAdapter = moshi.m94400c(FileUploadConfigDto.class, c25235a0, "file_upload_config");
    }

    public String toString() {
        return AbstractC36095b.m114677e(28, "GeneratedJsonAdapter(AppDto)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AppDto fromJson(JsonReader reader) {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        String str = null;
        FileUploadConfigDto fileUploadConfigDto = null;
        FileUploadConfigDto fileUploadConfigDto2 = null;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw AbstractC31885f.m99135m("name", "name", reader);
                }
            } else if (iMo16725T == 1) {
                fileUploadConfigDto = (FileUploadConfigDto) this.fileUploadConfigDtoAdapter.fromJson(reader);
                if (fileUploadConfigDto == null) {
                    throw AbstractC31885f.m99135m("file_upload_config", "file_upload_config", reader);
                }
            } else if (iMo16725T == 2 && (fileUploadConfigDto2 = (FileUploadConfigDto) this.fileUploadConfigDtoAdapter.fromJson(reader)) == null) {
                throw AbstractC31885f.m99135m("image_upload_config", "image_upload_config", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw AbstractC31885f.m99129g("name", "name", reader);
        }
        if (fileUploadConfigDto == null) {
            throw AbstractC31885f.m99129g("file_upload_config", "file_upload_config", reader);
        }
        if (fileUploadConfigDto2 != null) {
            return new AppDto(str, fileUploadConfigDto, fileUploadConfigDto2);
        }
        throw AbstractC31885f.m99129g("image_upload_config", "image_upload_config", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(AbstractC30704c0 writer, AppDto value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.mo94373x("file_upload_config");
        this.fileUploadConfigDtoAdapter.toJson(writer, value_.getFile_upload_config());
        writer.mo94373x("image_upload_config");
        this.fileUploadConfigDtoAdapter.toJson(writer, value_.getImage_upload_config());
        writer.mo94370m();
    }
}
