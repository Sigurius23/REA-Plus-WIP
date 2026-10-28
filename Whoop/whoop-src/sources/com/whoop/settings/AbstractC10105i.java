package com.whoop.settings;

import hj0.AbstractC17354m;
import p479s4.AbstractC32122c;
import p705ea2.AbstractC12918o;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: com.whoop.settings.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003¨\u0006\b"}, m65681d2 = {"Lcom/whoop/settings/i;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "E", "F", "onResume", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10105i extends AbstractC17354m {

    /* JADX INFO: renamed from: w */
    public static final int f30385w = AbstractC17354m.$stable;

    /* JADX INFO: renamed from: E */
    private final void m25417E() {
        getActivity();
    }

    /* JADX INFO: renamed from: F */
    private final void m25418F() {
        requireActivity().getWindow().setStatusBarColor(AbstractC32122c.getColor(requireContext(), AbstractC12918o.f44466a));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        m25418F();
        m25417E();
    }
}
