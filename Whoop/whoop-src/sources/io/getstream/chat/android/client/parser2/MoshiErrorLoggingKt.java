package io.getstream.chat.android.client.parser2;

import hn.C17508p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.AbstractC29199m;
import pg3.C29224y0;
import pg3.InterfaceC29201n;
import tg3.C33800a;
import tg3.C33802c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltg3/a;", "Lpg3/m;", "withErrorLogging", "(Ltg3/a;)Lpg3/m;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MoshiErrorLoggingKt {
    public static final AbstractC29199m withErrorLogging(final C33800a c33800a) {
        AbstractC22676k.m65750j(c33800a, "<this>");
        return new AbstractC29199m() { // from class: io.getstream.chat.android.client.parser2.MoshiErrorLoggingKt.withErrorLogging.1
            @Override // pg3.AbstractC29199m
            public final InterfaceC29201n requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, C29224y0 retrofit) {
                AbstractC22676k.m65750j(type, "type");
                AbstractC22676k.m65750j(parameterAnnotations, "parameterAnnotations");
                AbstractC22676k.m65750j(methodAnnotations, "methodAnnotations");
                AbstractC22676k.m65750j(retrofit, "retrofit");
                return c33800a.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
            }

            @Override // pg3.AbstractC29199m
            public final InterfaceC29201n responseBodyConverter(Type type, Annotation[] annotations, C29224y0 retrofit) {
                AbstractC22676k.m65750j(type, "type");
                AbstractC22676k.m65750j(annotations, "annotations");
                AbstractC22676k.m65750j(retrofit, "retrofit");
                return new C17508p((C33802c) c33800a.responseBodyConverter(type, annotations, retrofit), 4);
            }

            @Override // pg3.AbstractC29199m
            public final InterfaceC29201n stringConverter(Type type, Annotation[] annotations, C29224y0 retrofit) {
                AbstractC22676k.m65750j(type, "type");
                AbstractC22676k.m65750j(annotations, "annotations");
                AbstractC22676k.m65750j(retrofit, "retrofit");
                return c33800a.stringConverter(type, annotations, retrofit);
            }
        };
    }
}
