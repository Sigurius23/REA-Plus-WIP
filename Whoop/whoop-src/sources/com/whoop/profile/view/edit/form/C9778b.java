package com.whoop.profile.view.edit.form;

import com.whoop.design.util.TextResource;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p742vw1.C36544c;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.form.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9778b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28432w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f28433x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f28434y;

    public /* synthetic */ C9778b(String str, TextResource textResource, int i13) {
        this.f28432w = i13;
        this.f28433x = str;
        this.f28434y = textResource;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28432w) {
            case 0:
                return EditProfileFormUtils.updateUsernameField$lambda$0(this.f28433x, this.f28434y, (FieldState) obj);
            default:
                return C36544c.m117168c(this.f28433x, this.f28434y, (C21536b) obj);
        }
    }
}
