package com.whoop.profile.view.edit.form;

import com.whoop.design.util.TextResource;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.form.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9777a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28430w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f28431x;

    public /* synthetic */ C9777a(TextResource textResource, int i13) {
        this.f28430w = i13;
        this.f28431x = textResource;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28430w) {
            case 0:
                return EditProfileFormUtils.applyUsernameValidationResult$lambda$0(this.f28431x, (FieldState) obj);
            case 1:
                return EditProfileFormUtils.applyEmailValidationResult$lambda$0(this.f28431x, (FieldState) obj);
            case 2:
                return EditProfileFormUtils.handleEmailValidation$lambda$0(this.f28431x, (FieldState) obj);
            case 3:
                return EditProfileFormUtils.handleEmailValidation$lambda$2(this.f28431x, (FieldState) obj);
            default:
                return EditProfileFormUtils.handleUsernameFieldBlur$lambda$0(this.f28431x, (FieldState) obj);
        }
    }
}
