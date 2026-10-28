package com.whoop.profile.view.memberlevels;

import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class MemberLevelsFragment$special$$inlined$navArgs$1 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ AbstractComponentCallbacksC1320m0 $this_navArgs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberLevelsFragment$special$$inlined$navArgs$1(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        super(0);
        this.$this_navArgs = abstractComponentCallbacksC1320m0;
    }

    @Override // c93.InterfaceC4339a
    public final Bundle invoke() {
        Bundle arguments = this.$this_navArgs.getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.$this_navArgs, " has null arguments"));
    }
}
