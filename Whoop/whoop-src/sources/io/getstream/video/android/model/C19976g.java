package io.getstream.video.android.model;

import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import wc3.C37142g;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: io.getstream.video.android.model.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C19976g extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public static final C19976g f74948w = new C19976g(0);

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37142g("io.getstream.video.android.model.UserType", c22673i0.getOrCreateKotlinClass(UserType.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(UserType.Anonymous.class), c22673i0.getOrCreateKotlinClass(UserType.Authenticated.class), c22673i0.getOrCreateKotlinClass(UserType.Guest.class)}, new InterfaceC37138c[]{new ObjectSerializer("io.getstream.video.android.model.UserType.Anonymous", UserType.Anonymous.INSTANCE, new Annotation[0]), new ObjectSerializer("io.getstream.video.android.model.UserType.Authenticated", UserType.Authenticated.INSTANCE, new Annotation[0]), new ObjectSerializer("io.getstream.video.android.model.UserType.Guest", UserType.Guest.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
