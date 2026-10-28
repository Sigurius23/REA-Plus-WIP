package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gt.C16163b;
import java.util.List;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/google/firebase/ktx/FirebaseCommonLegacyRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lgt/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common-ktx"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C16163b> getComponents() {
        return AbstractC37056f.m118958J(AbstractC21598x.m60712y("fire-core-ktx", "21.0.0"));
    }
}
