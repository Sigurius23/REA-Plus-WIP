package io.getstream.chat.android.client.api2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p441qx.C30722l0;
import p471rx.AbstractC31885f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.AbstractC29199m;
import pg3.C29224y0;
import pg3.InterfaceC29201n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory;", "Lpg3/m;", "Lqx/l0;", "moshi", "<init>", "(Lqx/l0;)V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lpg3/y0;", "retrofit", "Lpg3/n;", "", "stringConverter", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lpg3/y0;)Lpg3/n;", "Lqx/l0;", "UrlQueryPayloadConverted", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MoshiUrlQueryPayloadFactory extends AbstractC29199m {
    private final C30722l0 moshi;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory$UrlQueryPayloadConverted;", "Lpg3/n;", "", "", "Lqx/l0;", "moshi", "Ljava/lang/reflect/Type;", "type", "<init>", "(Lqx/l0;Ljava/lang/reflect/Type;)V", "value", "convert", "(Ljava/lang/Object;)Ljava/lang/String;", "Lqx/l0;", "Ljava/lang/reflect/Type;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class UrlQueryPayloadConverted implements InterfaceC29201n {
        private final C30722l0 moshi;
        private final Type type;

        public UrlQueryPayloadConverted(C30722l0 moshi, Type type) {
            AbstractC22676k.m65750j(moshi, "moshi");
            AbstractC22676k.m65750j(type, "type");
            this.moshi = moshi;
            this.type = type;
        }

        @Override // pg3.InterfaceC29201n
        public final String convert(Object value) {
            AbstractC22676k.m65750j(value, "value");
            C30722l0 c30722l0 = this.moshi;
            Type type = this.type;
            c30722l0.getClass();
            String json = c30722l0.m94399b(type, AbstractC31885f.f132390a).toJson(value);
            AbstractC22676k.m65749i(json, "toJson(...)");
            return json;
        }
    }

    public MoshiUrlQueryPayloadFactory(C30722l0 moshi) {
        AbstractC22676k.m65750j(moshi, "moshi");
        this.moshi = moshi;
    }

    @Override // pg3.AbstractC29199m
    public final InterfaceC29201n stringConverter(Type type, Annotation[] annotations, C29224y0 retrofit) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(retrofit, "retrofit");
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotations) {
            if (annotation instanceof UrlQueryPayload) {
                arrayList.add(annotation);
            }
        }
        return !arrayList.isEmpty() ? new UrlQueryPayloadConverted(this.moshi, type) : super.stringConverter(type, annotations, retrofit);
    }
}
