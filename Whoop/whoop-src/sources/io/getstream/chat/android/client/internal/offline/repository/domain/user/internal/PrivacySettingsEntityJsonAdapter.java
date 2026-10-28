package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import m83.C25235a0;
import p441qx.AbstractC30704c0;
import p441qx.C30722l0;
import p441qx.C30740v;
import p471rx.AbstractC31885f;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;", "Lqx/c0;", "writer", "value_", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;)V", "Lqx/v;", "options", "Lqx/v;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;", "nullableTypingIndicatorsEntityAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;", "nullableReadReceiptsEntityAdapter", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;", "nullableDeliveryReceiptsEntityAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PrivacySettingsEntityJsonAdapter extends JsonAdapter<PrivacySettingsEntity> {
    private volatile Constructor<PrivacySettingsEntity> constructorRef;
    private final JsonAdapter<DeliveryReceiptsEntity> nullableDeliveryReceiptsEntityAdapter;
    private final JsonAdapter<ReadReceiptsEntity> nullableReadReceiptsEntityAdapter;
    private final JsonAdapter<TypingIndicatorsEntity> nullableTypingIndicatorsEntityAdapter;
    private final C30740v options;

    public PrivacySettingsEntityJsonAdapter(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.options = C30740v.m94403a("typingIndicators", "readReceipts", "deliveryReceipts");
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.nullableTypingIndicatorsEntityAdapter = moshi.m94400c(TypingIndicatorsEntity.class, c25235a0, "typingIndicators");
        this.nullableReadReceiptsEntityAdapter = moshi.m94400c(ReadReceiptsEntity.class, c25235a0, "readReceipts");
        this.nullableDeliveryReceiptsEntityAdapter = moshi.m94400c(DeliveryReceiptsEntity.class, c25235a0, "deliveryReceipts");
    }

    public final String toString() {
        return AbstractC36095b.m114677e(43, "GeneratedJsonAdapter(PrivacySettingsEntity)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PrivacySettingsEntity fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC22676k.m65750j(reader, "reader");
        reader.beginObject();
        TypingIndicatorsEntity typingIndicatorsEntity = null;
        ReadReceiptsEntity readReceiptsEntity = null;
        DeliveryReceiptsEntity deliveryReceiptsEntity = null;
        int i13 = -1;
        while (reader.hasNext()) {
            int iMo16725T = reader.mo16725T(this.options);
            if (iMo16725T == -1) {
                reader.mo16728b0();
                reader.skipValue();
            } else if (iMo16725T == 0) {
                typingIndicatorsEntity = (TypingIndicatorsEntity) this.nullableTypingIndicatorsEntityAdapter.fromJson(reader);
                i13 &= -2;
            } else if (iMo16725T == 1) {
                readReceiptsEntity = (ReadReceiptsEntity) this.nullableReadReceiptsEntityAdapter.fromJson(reader);
                i13 &= -3;
            } else if (iMo16725T == 2) {
                deliveryReceiptsEntity = (DeliveryReceiptsEntity) this.nullableDeliveryReceiptsEntityAdapter.fromJson(reader);
                i13 &= -5;
            }
        }
        reader.endObject();
        if (i13 == -8) {
            return new PrivacySettingsEntity(typingIndicatorsEntity, readReceiptsEntity, deliveryReceiptsEntity);
        }
        Constructor<PrivacySettingsEntity> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = PrivacySettingsEntity.class.getDeclaredConstructor(TypingIndicatorsEntity.class, ReadReceiptsEntity.class, DeliveryReceiptsEntity.class, Integer.TYPE, AbstractC31885f.f132392c);
            this.constructorRef = declaredConstructor;
            AbstractC22676k.m65749i(declaredConstructor, "also(...)");
        }
        PrivacySettingsEntity privacySettingsEntityNewInstance = declaredConstructor.newInstance(typingIndicatorsEntity, readReceiptsEntity, deliveryReceiptsEntity, Integer.valueOf(i13), null);
        AbstractC22676k.m65749i(privacySettingsEntityNewInstance, "newInstance(...)");
        return privacySettingsEntityNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(AbstractC30704c0 writer, PrivacySettingsEntity value_) {
        AbstractC22676k.m65750j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo94368h();
        writer.mo94373x("typingIndicators");
        this.nullableTypingIndicatorsEntityAdapter.toJson(writer, value_.getTypingIndicators());
        writer.mo94373x("readReceipts");
        this.nullableReadReceiptsEntityAdapter.toJson(writer, value_.getReadReceipts());
        writer.mo94373x("deliveryReceipts");
        this.nullableDeliveryReceiptsEntityAdapter.toJson(writer, value_.getDeliveryReceipts());
        writer.mo94370m();
    }
}
