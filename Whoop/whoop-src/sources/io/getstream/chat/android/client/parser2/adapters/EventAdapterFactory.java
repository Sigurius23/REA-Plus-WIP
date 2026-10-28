package io.getstream.chat.android.client.parser2.adapters;

import androidx.room.AbstractC1772c1;
import com.squareup.moshi.JsonAdapter;
import io.getstream.chat.android.client.api2.model.dto.ChatEventDto;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p441qx.C30722l0;
import p441qx.InterfaceC30735s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/adapters/EventAdapterFactory;", "Lqx/s;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lqx/l0;", "moshi", "Lcom/squareup/moshi/JsonAdapter;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lqx/l0;)Lcom/squareup/moshi/JsonAdapter;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EventAdapterFactory implements InterfaceC30735s {
    @Override // p441qx.InterfaceC30735s
    public final JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, C30722l0 moshi) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(moshi, "moshi");
        Class clsM5407z = AbstractC1772c1.m5407z(type);
        AbstractC22676k.m65749i(clsM5407z, "getRawType(this)");
        if (clsM5407z.equals(ChatEventDto.class)) {
            return new EventDtoAdapter(moshi);
        }
        return null;
    }
}
