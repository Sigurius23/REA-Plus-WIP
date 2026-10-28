package com.whoop.settings.journalv2;

import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.journal.model.CurrentCycle;
import com.whoop.settings.AbstractC10105i;
import com.whoop.settings.journalv2.JournalSettingsFragmentV2;
import java.time.LocalDate;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nf1.AbstractC26660a;
import or2.AbstractC28163g0;
import p031b9.AbstractC2875y;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p114eb.C12997x0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import pp2.C29451o;
import q83.AbstractC30060g;
import tx0.C34238a;
import u91.C34656a;
import vf3.InterfaceC35951a;
import yb0.AbstractC39383f;
import z82.InterfaceC40188b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/settings/journalv2/JournalSettingsFragmentV2;", "Lcom/whoop/settings/i;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "Lz82/b;", "x", "Ll83/h;", "N", "()Lz82/b;", "analyticsManager", "Lcom/whoop/settings/journalv2/g;", "y", "O", "()Lcom/whoop/settings/journalv2/g;", "viewModel", "", "getLogTag", "()Ljava/lang/String;", "logTag", "Lcom/whoop/settings/journalv2/h;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JournalSettingsFragmentV2 extends AbstractC10105i {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsManager = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10107a(this, null, null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10109c(this, null, new C10108b(this), null));

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.JournalSettingsFragmentV2$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10107a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30389w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30390x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30391y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10107a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30389w = componentCallbacks;
            this.f30390x = interfaceC35951a;
            this.f30391y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, z82.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC40188b invoke() {
            ComponentCallbacks componentCallbacks = this.f30389w;
            InterfaceC35951a interfaceC35951a = this.f30390x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30391y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.JournalSettingsFragmentV2$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10108b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30392w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10108b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30392w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30392w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.journalv2.JournalSettingsFragmentV2$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10109c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30393w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30394x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30395y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30396z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10109c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30393w = componentCallbacks;
            this.f30394x = interfaceC35951a;
            this.f30395y = interfaceC4339a;
            this.f30396z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, com.whoop.settings.journalv2.g] */
        @Override // c93.InterfaceC4339a
        public final C10116g invoke() {
            return AbstractC34132o.m107857B(this.f30393w, this.f30394x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10116g.class), this.f30395y, this.f30396z);
        }
    }

    /* JADX INFO: renamed from: N */
    private final InterfaceC40188b m25426N() {
        return (InterfaceC40188b) this.analyticsManager.getValue();
    }

    /* JADX INFO: renamed from: O */
    private final C10116g m25427O() {
        return (C10116g) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m25428P(final JournalSettingsFragmentV2 journalSettingsFragmentV2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(journalSettingsFragmentV2.m25427O().getViewState(), InterfaceC10117h.b.f30464a, null, c28655q, 48, 2);
            C12997x0 c12997x0 = new C12997x0(false, false, -1, false, false, AbstractC26660a.f105967l, -1, -1, AbstractC26660a.f105964i);
            InterfaceC10117h interfaceC10117hM25429Q = m25429Q(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(journalSettingsFragmentV2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new InterfaceC4339a(journalSettingsFragmentV2) { // from class: ub2.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ JournalSettingsFragmentV2 f146392x;

                    {
                        this.f146392x = journalSettingsFragmentV2;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return JournalSettingsFragmentV2.m25430R(this.f146392x);
                            default:
                                return JournalSettingsFragmentV2.m25435W(this.f146392x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(journalSettingsFragmentV2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i15 = 0;
                objM87133R2 = new Function1(journalSettingsFragmentV2) { // from class: ub2.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ JournalSettingsFragmentV2 f146394x;

                    {
                        this.f146394x = journalSettingsFragmentV2;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i16 = i15;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        switch (i16) {
                            case 0:
                                return JournalSettingsFragmentV2.m25431S(this.f146394x, zBooleanValue);
                            default:
                                return JournalSettingsFragmentV2.m25434V(this.f146394x, zBooleanValue);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C34656a(5);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(journalSettingsFragmentV2) | c28655q.m87157i(c12997x0);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C29451o(15, journalSettingsFragmentV2, c12997x0);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(journalSettingsFragmentV2);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                final int i16 = 1;
                objM87133R5 = new Function1(journalSettingsFragmentV2) { // from class: ub2.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ JournalSettingsFragmentV2 f146394x;

                    {
                        this.f146394x = journalSettingsFragmentV2;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        switch (i17) {
                            case 0:
                                return JournalSettingsFragmentV2.m25431S(this.f146394x, zBooleanValue);
                            default:
                                return JournalSettingsFragmentV2.m25434V(this.f146394x, zBooleanValue);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function2 = (Function1) objM87133R5;
            boolean zM87157i5 = c28655q.m87157i(journalSettingsFragmentV2);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i5 || objM87133R6 == c28676v0) {
                final int i17 = 1;
                objM87133R6 = new InterfaceC4339a(journalSettingsFragmentV2) { // from class: ub2.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ JournalSettingsFragmentV2 f146392x;

                    {
                        this.f146392x = journalSettingsFragmentV2;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return JournalSettingsFragmentV2.m25430R(this.f146392x);
                            default:
                                return JournalSettingsFragmentV2.m25435W(this.f146392x);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC10114e.m25467q(interfaceC10117hM25429Q, interfaceC4339a, function1, interfaceC4339a2, interfaceC4351m, function2, (InterfaceC4339a) objM87133R6, c28655q, 3072);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final InterfaceC10117h m25429Q(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC10117h) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m25430R(JournalSettingsFragmentV2 journalSettingsFragmentV2) {
        AbstractC5583n.m16799z(journalSettingsFragmentV2).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m25431S(JournalSettingsFragmentV2 journalSettingsFragmentV2, boolean z4) {
        journalSettingsFragmentV2.m25426N().mo41428k("Recording Data", null, null, "Journal - Toggle Feature", AbstractC36095b.m114688p(Boolean.valueOf(z4), "On or Off"));
        journalSettingsFragmentV2.m25427O().m25488o(new AbstractC10115f.a(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m25432T() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m25433U(JournalSettingsFragmentV2 journalSettingsFragmentV2, C12997x0 c12997x0, long j7, CurrentCycle currentCycle) {
        AbstractC22676k.m65750j(currentCycle, "currentCycle");
        LocalDate localDateNow = LocalDate.now();
        long previousCycleStartTime = currentCycle.getPreviousCycleStartTime();
        long previousCycleEndTime = currentCycle.getPreviousCycleEndTime();
        long todayCycleStartTime = currentCycle.getTodayCycleStartTime();
        long todayCycleEndTime = currentCycle.getTodayCycleEndTime();
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "android-app://com.whoop.journal.view.fragment/", "/");
        sbM125596b.append(previousCycleStartTime);
        AbstractC2875y.m8285A(sbM125596b, "/", previousCycleEndTime, "?todayCycleStartTime=");
        sbM125596b.append(todayCycleStartTime);
        AbstractC2875y.m8285A(sbM125596b, "&todayCycleEndTime=", todayCycleEndTime, "&fromSettings=true&source=Settings&newHome=false&fromFab=false&showCustomize=false&requestDate=");
        sbM125596b.append(localDateNow);
        Uri uri = Uri.parse(sbM125596b.toString());
        AbstractC22676k.m65750j(uri, "uri");
        C12969k0 c12969k0 = new C12969k0(uri, null, null);
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(journalSettingsFragmentV2);
        abstractC12939a0M16799z.getClass();
        abstractC12939a0M16799z.m36409x(c12969k0, c12997x0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m25434V(JournalSettingsFragmentV2 journalSettingsFragmentV2, boolean z4) {
        journalSettingsFragmentV2.m25427O().m25488o(new AbstractC10115f.b(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m25435W(JournalSettingsFragmentV2 journalSettingsFragmentV2) {
        journalSettingsFragmentV2.m25427O().m25488o(AbstractC10115f.c.f30437a);
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return "JournalSettingsFragmentV2";
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        requireActivity().getWindow().setSoftInputMode(48);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 6), true, 1812352227));
    }

    @Override // com.whoop.settings.AbstractC10105i, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }
}
