package com.whoop.journal.view.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import as1.AbstractC1941b;
import as1.C1942c;
import as1.C1943d;
import as1.C1944e;
import as1.C1945f;
import as1.C1946g;
import as1.C1947h;
import as1.C1948i;
import as1.C1949j;
import as1.C1950k;
import as1.EnumC1940a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bs1.AbstractC3583c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.mapbox.common.HttpHeaders;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.journal.model.CurrentCycle;
import com.whoop.navigation.BehaviorDetailsScreenModel;
import com.whoop.navigation.C9598e;
import cs1.AbstractC11103c;
import cs1.C11101a;
import dp0.AbstractC12252h;
import dp0.InterfaceC12251g;
import ds1.AbstractC12331a;
import ds1.C12335e;
import ds1.C12341k;
import ec3.AbstractC13091v;
import ec3.C13043h0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ep0.C13398d;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import n92.InterfaceC26483e;
import or2.AbstractC28163g0;
import or2.C28204u;
import or2.C28216y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p114eb.C12962i;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p558vp.AbstractC36259c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import w71.AbstractC36877d;
import yr1.C39730a;
import yr1.C39733d;
import yr1.EnumC39731b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\n\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010-J)\u00104\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u0010\u0003J'\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010\u0003J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0018H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0006H\u0002¢\u0006\u0004\b@\u0010\u0003R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010O\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010NR\u001b\u0010R\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010H\u001a\u0004\bQ\u0010NR\u001b\u0010U\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010H\u001a\u0004\bT\u0010NR\u001b\u0010X\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010H\u001a\u0004\bW\u0010NR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010H\u001a\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010H\u001a\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010H\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010H\u001a\u0004\bn\u0010oR\u001b\u0010u\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010H\u001a\u0004\bs\u0010tR\u001b\u0010z\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010H\u001a\u0004\bx\u0010yR\u001b\u0010\u007f\u001a\u00020{8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010H\u001a\u0004\b}\u0010~R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010H\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u008f\u0001²\u0006\u000e\u0010\u008b\u0001\u001a\u00030\u008a\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u008d\u0001\u001a\u00030\u008c\u00018\nX\u008a\u0084\u0002²\u0006\r\u0010\u008e\u0001\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "m1", "n1", "Landroidx/compose/ui/platform/ComposeView;", "q0", "()Landroidx/compose/ui/platform/ComposeView;", "Lcom/whoop/journal/view/fragment/c;", "navigationRouter", "", "autoSaveEnabled", "hasUserEditJournal", "Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$a;", "g0", "(Lcom/whoop/journal/view/fragment/c;ZZ)Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$a;", "Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$b;", "z0", "()Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$b;", "Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$c;", "D0", "()Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$c;", "Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$d;", "G0", "(Lcom/whoop/journal/view/fragment/c;)Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$d;", "Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$e;", "J0", "()Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$e;", "I0", "()Lcom/whoop/journal/view/fragment/c;", "c1", "(Lcom/whoop/journal/view/fragment/c;)V", "", "cycleId", "", HttpHeaders.DATE, "Lyr1/b;", "dateNavigationType", "e1", "(Ljava/lang/Long;Ljava/lang/String;Lyr1/b;)V", "b1", "(ZZ)V", "f1", "usePreviousAnswersToggleEnabled", "g1", "(ZZZ)V", "h1", "userDismissed", "O0", "(Z)V", "i1", "Las1/k;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Leb/i;", "P0", "()Las1/k;", "args", "x", "Ll83/h;", "X0", "()Ljava/lang/String;", "requestDate", "y", "Z0", "()J", "todayCycleStart", "z", "Y0", "todayCycleEnd", "E", "W0", "previousCycleStart", "F", "V0", "previousCycleEnd", "Ltr2/n;", "G", "Ltr2/n;", "logger", "Lcom/whoop/journal/model/CurrentCycle;", "H", "Q0", "()Lcom/whoop/journal/model/CurrentCycle;", "currentCycle", "Lcs1/a;", "I", "a1", "()Lcs1/a;", "viewModel", "Lj02/o0;", "J", "getNavigator", "()Lj02/o0;", "navigator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "K", "R0", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "L", "U0", "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Lor2/y;", "M", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lyr1/a;", "N", "T0", "()Lyr1/a;", "journalAnalyticsHelper", "Ln92/e;", "O", "S0", "()Ln92/e;", "inAppMessageController", "a", "b", "c", "d", "e", "Lds1/k;", "viewState", "", "savedScrollPosition", "scrollToTopRequest", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JournalSurveyAnswerFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h onboardingStatusChecker;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC23462h journalAnalyticsHelper;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC23462h inAppMessageController;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C1950k.class), new C8993p(this));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h requestDate = AbstractC30060g.m92088H(new C1944e(this, 3));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h todayCycleStart = AbstractC30060g.m92088H(new C1944e(this, 6));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h todayCycleEnd = AbstractC30060g.m92088H(new C1944e(this, 7));

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h previousCycleStart = AbstractC30060g.m92088H(new C1944e(this, 8));

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h previousCycleEnd = AbstractC30060g.m92088H(new C1944e(this, 9));

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("JournalSurveyAnswerFragment");

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h currentCycle = AbstractC30060g.m92088H(new C1944e(this, 10));

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b&\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b \u0010#R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b'\u0010\u001e¨\u0006("}, m65681d2 = {"Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$a;", "", "Lkotlin/Function1;", "Lw71/d;", "Ll83/a0;", "onJournalQuestionClicked", "", "defaultToggleCallbackType", "Lkotlin/Function0;", "onRefresh", "onSavedClicked", "onSavedFinish", "onExitClicked", "exit", "onDefaultsQuestionClicked", "onViewEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function1;", "e", "()Lkotlin/jvm/functions/Function1;", "b", "c", "Lc93/a;", "f", "()Lc93/a;", "d", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class C8978a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Function1 onJournalQuestionClicked;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Function1 defaultToggleCallbackType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC4339a onRefresh;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Function1 onSavedClicked;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final InterfaceC4339a onSavedFinish;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC4339a onExitClicked;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final Function1 exit;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final InterfaceC4339a onDefaultsQuestionClicked;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final Function1 onViewEvent;

        public C8978a(Function1 onJournalQuestionClicked, Function1 defaultToggleCallbackType, InterfaceC4339a onRefresh, Function1 onSavedClicked, InterfaceC4339a onSavedFinish, InterfaceC4339a onExitClicked, Function1 exit, InterfaceC4339a onDefaultsQuestionClicked, Function1 onViewEvent) {
            AbstractC22676k.m65750j(onJournalQuestionClicked, "onJournalQuestionClicked");
            AbstractC22676k.m65750j(defaultToggleCallbackType, "defaultToggleCallbackType");
            AbstractC22676k.m65750j(onRefresh, "onRefresh");
            AbstractC22676k.m65750j(onSavedClicked, "onSavedClicked");
            AbstractC22676k.m65750j(onSavedFinish, "onSavedFinish");
            AbstractC22676k.m65750j(onExitClicked, "onExitClicked");
            AbstractC22676k.m65750j(exit, "exit");
            AbstractC22676k.m65750j(onDefaultsQuestionClicked, "onDefaultsQuestionClicked");
            AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
            this.onJournalQuestionClicked = onJournalQuestionClicked;
            this.defaultToggleCallbackType = defaultToggleCallbackType;
            this.onRefresh = onRefresh;
            this.onSavedClicked = onSavedClicked;
            this.onSavedFinish = onSavedFinish;
            this.onExitClicked = onExitClicked;
            this.exit = exit;
            this.onDefaultsQuestionClicked = onDefaultsQuestionClicked;
            this.onViewEvent = onViewEvent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Function1 getDefaultToggleCallbackType() {
            return this.defaultToggleCallbackType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Function1 getExit() {
            return this.exit;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC4339a getOnDefaultsQuestionClicked() {
            return this.onDefaultsQuestionClicked;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC4339a getOnExitClicked() {
            return this.onExitClicked;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Function1 getOnJournalQuestionClicked() {
            return this.onJournalQuestionClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C8978a)) {
                return false;
            }
            C8978a c8978a = (C8978a) other;
            return AbstractC22676k.m65745e(this.onJournalQuestionClicked, c8978a.onJournalQuestionClicked) && AbstractC22676k.m65745e(this.defaultToggleCallbackType, c8978a.defaultToggleCallbackType) && AbstractC22676k.m65745e(this.onRefresh, c8978a.onRefresh) && AbstractC22676k.m65745e(this.onSavedClicked, c8978a.onSavedClicked) && AbstractC22676k.m65745e(this.onSavedFinish, c8978a.onSavedFinish) && AbstractC22676k.m65745e(this.onExitClicked, c8978a.onExitClicked) && AbstractC22676k.m65745e(this.exit, c8978a.exit) && AbstractC22676k.m65745e(this.onDefaultsQuestionClicked, c8978a.onDefaultsQuestionClicked) && AbstractC22676k.m65745e(this.onViewEvent, c8978a.onViewEvent);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final InterfaceC4339a getOnRefresh() {
            return this.onRefresh;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Function1 getOnSavedClicked() {
            return this.onSavedClicked;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final InterfaceC4339a getOnSavedFinish() {
            return this.onSavedFinish;
        }

        public int hashCode() {
            return this.onViewEvent.hashCode() + AbstractC30802r.m94755d(AbstractC30802r.m94756e(this.exit, AbstractC30802r.m94755d(AbstractC30802r.m94755d(AbstractC30802r.m94756e(this.onSavedClicked, AbstractC30802r.m94755d(AbstractC30802r.m94756e(this.defaultToggleCallbackType, this.onJournalQuestionClicked.hashCode() * 31, 31), 31, this.onRefresh), 31), 31, this.onSavedFinish), 31, this.onExitClicked), 31), 31, this.onDefaultsQuestionClicked);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Function1 getOnViewEvent() {
            return this.onViewEvent;
        }

        public String toString() {
            return "ActionHandlers(onJournalQuestionClicked=" + this.onJournalQuestionClicked + ", defaultToggleCallbackType=" + this.defaultToggleCallbackType + ", onRefresh=" + this.onRefresh + ", onSavedClicked=" + this.onSavedClicked + ", onSavedFinish=" + this.onSavedFinish + ", onExitClicked=" + this.onExitClicked + ", exit=" + this.exit + ", onDefaultsQuestionClicked=" + this.onDefaultsQuestionClicked + ", onViewEvent=" + this.onViewEvent + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0082\b\u0018\u00002\u00020\u0001B_\u0012&\u0010\b\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R7\u0010\b\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, m65681d2 = {"Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$b;", "", "Lkotlin/Function4;", "", "", "Lyr1/b;", "", "Ll83/a0;", "onDateClicked", "Lkotlin/Function2;", "onCalendarOpened", "Lkotlin/Function1;", "", "onCalendarPaged", "<init>", "(Lc93/n;Lc93/m;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lc93/n;", "c", "()Lc93/n;", "b", "Lc93/m;", "()Lc93/m;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class C8979b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC4352n onDateClicked;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC4351m onCalendarOpened;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Function1 onCalendarPaged;

        public C8979b(InterfaceC4352n onDateClicked, InterfaceC4351m onCalendarOpened, Function1 onCalendarPaged) {
            AbstractC22676k.m65750j(onDateClicked, "onDateClicked");
            AbstractC22676k.m65750j(onCalendarOpened, "onCalendarOpened");
            AbstractC22676k.m65750j(onCalendarPaged, "onCalendarPaged");
            this.onDateClicked = onDateClicked;
            this.onCalendarOpened = onCalendarOpened;
            this.onCalendarPaged = onCalendarPaged;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC4351m getOnCalendarOpened() {
            return this.onCalendarOpened;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Function1 getOnCalendarPaged() {
            return this.onCalendarPaged;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC4352n getOnDateClicked() {
            return this.onDateClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C8979b)) {
                return false;
            }
            C8979b c8979b = (C8979b) other;
            return AbstractC22676k.m65745e(this.onDateClicked, c8979b.onDateClicked) && AbstractC22676k.m65745e(this.onCalendarOpened, c8979b.onCalendarOpened) && AbstractC22676k.m65745e(this.onCalendarPaged, c8979b.onCalendarPaged);
        }

        public int hashCode() {
            return this.onCalendarPaged.hashCode() + ((this.onCalendarOpened.hashCode() + (this.onDateClicked.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "DateHandlers(onDateClicked=" + this.onDateClicked + ", onCalendarOpened=" + this.onCalendarOpened + ", onCalendarPaged=" + this.onCalendarPaged + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$c;", "", "Lkotlin/Function2;", "", "Ll83/a0;", "onDismissConfirmationDialogClicked", "Lkotlin/Function1;", "onNeverShowDismissDialogClick", "<init>", "(Lc93/m;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lc93/m;", "()Lc93/m;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class C8980c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC4351m onDismissConfirmationDialogClicked;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Function1 onNeverShowDismissDialogClick;

        public C8980c(InterfaceC4351m onDismissConfirmationDialogClicked, Function1 onNeverShowDismissDialogClick) {
            AbstractC22676k.m65750j(onDismissConfirmationDialogClicked, "onDismissConfirmationDialogClicked");
            AbstractC22676k.m65750j(onNeverShowDismissDialogClick, "onNeverShowDismissDialogClick");
            this.onDismissConfirmationDialogClicked = onDismissConfirmationDialogClicked;
            this.onNeverShowDismissDialogClick = onNeverShowDismissDialogClick;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC4351m getOnDismissConfirmationDialogClicked() {
            return this.onDismissConfirmationDialogClicked;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Function1 getOnNeverShowDismissDialogClick() {
            return this.onNeverShowDismissDialogClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C8980c)) {
                return false;
            }
            C8980c c8980c = (C8980c) other;
            return AbstractC22676k.m65745e(this.onDismissConfirmationDialogClicked, c8980c.onDismissConfirmationDialogClicked) && AbstractC22676k.m65745e(this.onNeverShowDismissDialogClick, c8980c.onNeverShowDismissDialogClick);
        }

        public int hashCode() {
            return this.onNeverShowDismissDialogClick.hashCode() + (this.onDismissConfirmationDialogClicked.hashCode() * 31);
        }

        public String toString() {
            return "DialogHandlers(onDismissConfirmationDialogClicked=" + this.onDismissConfirmationDialogClicked + ", onNeverShowDismissDialogClick=" + this.onNeverShowDismissDialogClick + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$d */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$d;", "", "Lkotlin/Function1;", "Lcom/whoop/navigation/e;", "Ll83/a0;", "onNavigationButtonClicked", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class C8981d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Function1 onNavigationButtonClicked;

        public C8981d(Function1 onNavigationButtonClicked) {
            AbstractC22676k.m65750j(onNavigationButtonClicked, "onNavigationButtonClicked");
            this.onNavigationButtonClicked = onNavigationButtonClicked;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Function1 getOnNavigationButtonClicked() {
            return this.onNavigationButtonClicked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C8981d) && AbstractC22676k.m65745e(this.onNavigationButtonClicked, ((C8981d) other).onNavigationButtonClicked);
        }

        public int hashCode() {
            return this.onNavigationButtonClicked.hashCode();
        }

        public String toString() {
            return "NavigationHandlers(onNavigationButtonClicked=" + this.onNavigationButtonClicked + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$e */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R+\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$e;", "", "Lkotlin/Function2;", "", "Lds1/a;", "Ll83/a0;", "onBottomSheetStateChanged", "Lkotlin/Function0;", "onBottomSheetDismissed", "Lkotlin/Function1;", "onSearchFieldFocusChanged", "<init>", "(Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lc93/m;", "b", "()Lc93/m;", "Lc93/a;", "()Lc93/a;", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class C8982e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC4351m onBottomSheetStateChanged;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC4339a onBottomSheetDismissed;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Function1 onSearchFieldFocusChanged;

        public C8982e(InterfaceC4351m onBottomSheetStateChanged, InterfaceC4339a onBottomSheetDismissed, Function1 onSearchFieldFocusChanged) {
            AbstractC22676k.m65750j(onBottomSheetStateChanged, "onBottomSheetStateChanged");
            AbstractC22676k.m65750j(onBottomSheetDismissed, "onBottomSheetDismissed");
            AbstractC22676k.m65750j(onSearchFieldFocusChanged, "onSearchFieldFocusChanged");
            this.onBottomSheetStateChanged = onBottomSheetStateChanged;
            this.onBottomSheetDismissed = onBottomSheetDismissed;
            this.onSearchFieldFocusChanged = onSearchFieldFocusChanged;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC4339a getOnBottomSheetDismissed() {
            return this.onBottomSheetDismissed;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC4351m getOnBottomSheetStateChanged() {
            return this.onBottomSheetStateChanged;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Function1 getOnSearchFieldFocusChanged() {
            return this.onSearchFieldFocusChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C8982e)) {
                return false;
            }
            C8982e c8982e = (C8982e) other;
            return AbstractC22676k.m65745e(this.onBottomSheetStateChanged, c8982e.onBottomSheetStateChanged) && AbstractC22676k.m65745e(this.onBottomSheetDismissed, c8982e.onBottomSheetDismissed) && AbstractC22676k.m65745e(this.onSearchFieldFocusChanged, c8982e.onSearchFieldFocusChanged);
        }

        public int hashCode() {
            return this.onSearchFieldFocusChanged.hashCode() + AbstractC30802r.m94755d(this.onBottomSheetStateChanged.hashCode() * 31, 31, this.onBottomSheetDismissed);
        }

        public String toString() {
            return "UIHandlers(onBottomSheetStateChanged=" + this.onBottomSheetStateChanged + ", onBottomSheetDismissed=" + this.onBottomSheetDismissed + ", onSearchFieldFocusChanged=" + this.onSearchFieldFocusChanged + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C8983f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26900a;

        static {
            int[] iArr = new int[EnumC1940a.values().length];
            try {
                iArr[EnumC1940a.FULL_SAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1940a.EXIT_IMMEDIATELY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1940a.SHOW_DISMISS_DIALOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26900a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$g */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$createComposeContent$1$1$1", m100430f = "JournalSurveyAnswerFragment.kt", m100431l = {140}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8984g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26901w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC12251g f26902x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ JournalSurveyAnswerFragment f26903y;

        /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ JournalSurveyAnswerFragment f26904w;

            public a(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
                this.f26904w = journalSurveyAnswerFragment;
            }

            /* JADX INFO: renamed from: b */
            public final Object m22395b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (!z4) {
                    this.f26904w.m22333a1().m29999z();
                }
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m22395b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$g$b */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f26905w;

            /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$g$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f26906w;

                /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$g$b$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$createComposeContent$1$1$1$invokeSuspend$$inlined$map$1$2", m100430f = "JournalSurveyAnswerFragment.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41400a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f26907E;

                    /* JADX INFO: renamed from: F */
                    Object f26908F;

                    /* JADX INFO: renamed from: G */
                    Object f26909G;

                    /* JADX INFO: renamed from: H */
                    int f26910H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f26911w;

                    /* JADX INFO: renamed from: x */
                    int f26912x;

                    /* JADX INFO: renamed from: y */
                    Object f26913y;

                    public C41400a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f26911w = obj;
                        this.f26912x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f26906w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41400a c41400a;
                    if (interfaceC30057d instanceof C41400a) {
                        c41400a = (C41400a) interfaceC30057d;
                        int i13 = c41400a.f26912x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41400a.f26912x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41400a = new C41400a(interfaceC30057d);
                        }
                    } else {
                        c41400a = new C41400a(interfaceC30057d);
                    }
                    Object obj2 = c41400a.f26911w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41400a.f26912x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f26906w;
                        Boolean boolValueOf = Boolean.valueOf(((C13398d) obj).getIsBottomSheetVisible());
                        c41400a.f26913y = null;
                        c41400a.f26907E = null;
                        c41400a.f26908F = null;
                        c41400a.f26909G = null;
                        c41400a.f26910H = 0;
                        c41400a.f26912x = 1;
                        if (interfaceC13062m.emit(boolValueOf, c41400a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            public b(InterfaceC13058l interfaceC13058l) {
                this.f26905w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f26905w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8984g(InterfaceC12251g interfaceC12251g, JournalSurveyAnswerFragment journalSurveyAnswerFragment, InterfaceC30057d<? super C8984g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26902x = interfaceC12251g;
            this.f26903y = journalSurveyAnswerFragment;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C8984g(this.f26902x, this.f26903y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8984g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26901w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13043h0 c13043h0M36612v = AbstractC13091v.m36612v(AbstractC13091v.m36610t(new b(this.f26902x.getState())), 1);
                a aVar = new a(this.f26903y);
                this.f26901w = 1;
                if (c13043h0M36612v.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$h */
    @InterfaceC32271e(m100429c = "com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$onSavedFinish$1", m100430f = "JournalSurveyAnswerFragment.kt", m100431l = {363}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8985h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26915w;

        public C8985h(InterfaceC30057d<? super C8985h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JournalSurveyAnswerFragment.this.new C8985h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8985h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26915w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f26915w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            JournalSurveyAnswerFragment.this.m22309O0(false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$i */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/journal/view/fragment/JournalSurveyAnswerFragment$i", "Lg/t;", "Ll83/a0;", "d", "()V", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8986i extends AbstractC14917t {
        public C8986i() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            C12335e c12335eM34484f = ((C12341k) JournalSurveyAnswerFragment.this.m22333a1().getViewState().getValue()).getIsSuccess();
            JournalSurveyAnswerFragment.this.m22335b1(c12335eM34484f.getAutoSaveEnabled(), c12335eM34484f.getHasUserEditJournal());
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8987j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26918w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26919x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26920y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8987j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26918w = componentCallbacks;
            this.f26919x = interfaceC35951a;
            this.f26920y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26918w;
            InterfaceC35951a interfaceC35951a = this.f26919x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26920y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8988k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26921w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26922x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26923y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8988k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26921w = componentCallbacks;
            this.f26922x = interfaceC35951a;
            this.f26923y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f26921w;
            InterfaceC35951a interfaceC35951a = this.f26922x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26923y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$l */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8989l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26924w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26925x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26926y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8989l(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26924w = componentCallbacks;
            this.f26925x = interfaceC35951a;
            this.f26926y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.onboarding.OnboardingStatusChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final OnboardingStatusChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f26924w;
            InterfaceC35951a interfaceC35951a = this.f26925x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26926y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OnboardingStatusChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$m */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8990m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26927w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26928x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26929y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8990m(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26927w = componentCallbacks;
            this.f26928x = interfaceC35951a;
            this.f26929y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f26927w;
            InterfaceC35951a interfaceC35951a = this.f26928x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26929y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$n */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8991n extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26930w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26931x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26932y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8991n(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26930w = componentCallbacks;
            this.f26931x = interfaceC35951a;
            this.f26932y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yr1.a] */
        @Override // c93.InterfaceC4339a
        public final C39730a invoke() {
            ComponentCallbacks componentCallbacks = this.f26930w;
            InterfaceC35951a interfaceC35951a = this.f26931x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26932y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39730a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$o */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8992o extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26933w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26934x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26935y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8992o(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26933w = componentCallbacks;
            this.f26934x = interfaceC35951a;
            this.f26935y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, n92.e] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC26483e invoke() {
            ComponentCallbacks componentCallbacks = this.f26933w;
            InterfaceC35951a interfaceC35951a = this.f26934x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26935y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26483e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$p */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8993p extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f26936w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8993p(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f26936w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f26936w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f26936w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$q */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8994q extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26937w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8994q(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26937w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26937w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.journal.view.fragment.JournalSurveyAnswerFragment$r */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8995r extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26938w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26939x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26940y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26941z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8995r(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26938w = componentCallbacks;
            this.f26939x = interfaceC35951a;
            this.f26940y = interfaceC4339a;
            this.f26941z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, cs1.a] */
        @Override // c93.InterfaceC4339a
        public final C11101a invoke() {
            return AbstractC34132o.m107857B(this.f26938w, this.f26939x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11101a.class), this.f26940y, this.f26941z);
        }
    }

    public JournalSurveyAnswerFragment() {
        C1944e c1944e = new C1944e(this, 11);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8995r(this, null, new C8994q(this), c1944e));
        C1944e c1944e2 = new C1944e(this, 12);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8987j(this, null, c1944e2));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C8988k(this, null, null));
        this.onboardingStatusChecker = AbstractC30060g.m92087G(enumC23463i, new C8989l(this, null, null));
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C8990m(this, null, null));
        this.journalAnalyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8991n(this, null, null));
        this.inAppMessageController = AbstractC30060g.m92087G(enumC23463i, new C8992o(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m22281A0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, Long l7, String requestDate, EnumC39731b dateNavigationType, boolean z4) {
        String str;
        EnumC39731b enumC39731b;
        AbstractC22676k.m65750j(requestDate, "requestDate");
        AbstractC22676k.m65750j(dateNavigationType, "dateNavigationType");
        journalSurveyAnswerFragment.m22333a1().m29994E(l7 != null ? l7.longValue() : journalSurveyAnswerFragment.m22311P0().m5947a(), requestDate);
        if (dateNavigationType == EnumC39731b.CAROUSEL_DATE_SELECTION || dateNavigationType == EnumC39731b.DATE_SELECTION) {
            str = requestDate;
            enumC39731b = dateNavigationType;
        } else {
            str = requestDate;
            enumC39731b = dateNavigationType;
            C39730a.m127122g(journalSurveyAnswerFragment.m22319T0(), enumC39731b, str, null, 4, null);
        }
        journalSurveyAnswerFragment.m22341e1(l7, str, enumC39731b);
        if (z4) {
            journalSurveyAnswerFragment.m22319T0().m127126b(str);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m22283B0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, String date, String str) {
        AbstractC22676k.m65750j(date, "date");
        journalSurveyAnswerFragment.m22319T0().m127134m(str);
        journalSurveyAnswerFragment.m22333a1().m29993D(new AbstractC11103c.k(date));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m22285C0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, int i13) {
        journalSurveyAnswerFragment.m22333a1().m29993D(new AbstractC11103c.b(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D0 */
    private final C8980c m22287D0() {
        return new C8980c(new C1942c(this, 2), new C1943d(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m22289E0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, boolean z4, boolean z13) {
        journalSurveyAnswerFragment.m22319T0().m127129e(z13);
        if (z13) {
            journalSurveyAnswerFragment.m22309O0(true);
        } else {
            journalSurveyAnswerFragment.m22333a1().m29993D(new AbstractC11103c.e(z4));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m22291F0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, boolean z4) {
        journalSurveyAnswerFragment.m22333a1().m29993D(AbstractC11103c.f.f35271a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G0 */
    private final C8981d m22293G0(C8998c navigationRouter) {
        return new C8981d(new C1948i(this, navigationRouter, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m22295H0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, C8998c c8998c, C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        journalSurveyAnswerFragment.m22319T0().m127133l();
        if (it.getParameters() instanceof BehaviorDetailsScreenModel) {
            it = C9598e.m23127b(it, null, new BehaviorDetailsScreenModel("Journal"), null, 5, null);
        }
        c8998c.m22397b(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I0 */
    private final C8998c m22297I0() {
        return new C8998c(getNavigator(), AbstractC5583n.m16799z(this), m22321U0(), m22315R0());
    }

    /* JADX INFO: renamed from: J0 */
    private final C8982e m22299J0() {
        return new C8982e(new C1942c(this, 3), new C1944e(this, 5), new C1943d(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m22301K0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, boolean z4, AbstractC12331a abstractC12331a) {
        if (z4 && (abstractC12331a instanceof AbstractC12331a.a)) {
            journalSurveyAnswerFragment.requireActivity().getWindow().setSoftInputMode(48);
        } else {
            journalSurveyAnswerFragment.requireActivity().getWindow().setSoftInputMode(16);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m22303L0(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        journalSurveyAnswerFragment.m22319T0().m127125a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m22305M0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, boolean z4) {
        journalSurveyAnswerFragment.m22319T0().m127137p();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final CurrentCycle m22307N0(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        return new CurrentCycle(journalSurveyAnswerFragment.m22331Z0(), journalSurveyAnswerFragment.m22329Y0(), journalSurveyAnswerFragment.m22325W0(), journalSurveyAnswerFragment.m22323V0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public final void m22309O0(boolean userDismissed) {
        if (userDismissed) {
            m22319T0().m127128d();
        }
        if (!userDismissed) {
            getParentFragmentManager().m4168f0(new Bundle(0), "completed_journal_fragment_result_key");
        }
        AbstractC5583n.m16799z(this).m36410z();
    }

    /* JADX INFO: renamed from: P0 */
    private final C1950k m22311P0() {
        return (C1950k) this.args.getValue();
    }

    /* JADX INFO: renamed from: Q0 */
    private final CurrentCycle m22313Q0() {
        return (CurrentCycle) this.currentCycle.getValue();
    }

    /* JADX INFO: renamed from: R0 */
    private final FeatureFlagChecker m22315R0() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: S0 */
    private final InterfaceC26483e m22317S0() {
        return (InterfaceC26483e) this.inAppMessageController.getValue();
    }

    /* JADX INFO: renamed from: T0 */
    private final C39730a m22319T0() {
        return (C39730a) this.journalAnalyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: U0 */
    private final OnboardingStatusChecker m22321U0() {
        return (OnboardingStatusChecker) this.onboardingStatusChecker.getValue();
    }

    /* JADX INFO: renamed from: V0 */
    private final long m22323V0() {
        return ((Number) this.previousCycleEnd.getValue()).longValue();
    }

    /* JADX INFO: renamed from: W0 */
    private final long m22325W0() {
        return ((Number) this.previousCycleStart.getValue()).longValue();
    }

    /* JADX INFO: renamed from: X0 */
    private final String m22327X0() {
        return (String) this.requestDate.getValue();
    }

    /* JADX INFO: renamed from: Y0 */
    private final long m22329Y0() {
        return ((Number) this.todayCycleEnd.getValue()).longValue();
    }

    /* JADX INFO: renamed from: Z0 */
    private final long m22331Z0() {
        return ((Number) this.todayCycleStart.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public final C11101a m22333a1() {
        return (C11101a) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public final void m22335b1(boolean autoSaveEnabled, boolean hasUserEditJournal) {
        int i13 = C8983f.f26900a[AbstractC1941b.m5946a(autoSaveEnabled, hasUserEditJournal).ordinal()];
        if (i13 == 1) {
            m22333a1().m29993D(new AbstractC11103c.l(false));
        } else if (i13 == 2) {
            m22309O0(true);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            m22333a1().m29993D(AbstractC11103c.n.f35288a);
        }
    }

    /* JADX INFO: renamed from: c1 */
    private final void m22337c1(C8998c navigationRouter) {
        if (m22311P0().m5951e()) {
            navigationRouter.m22396a(AbstractC8996a.a.f26942a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C34911a m22339d1(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        return AbstractC15751g.m44431K(journalSurveyAnswerFragment.requireActivity());
    }

    /* JADX INFO: renamed from: e1 */
    private final void m22341e1(Long cycleId, String date, EnumC39731b dateNavigationType) {
        m22333a1().m29993D(new AbstractC11103c.j(date, cycleId != null ? cycleId.longValue() : m22311P0().m5947a(), false, "Journal", m22311P0().m5952f(), true, false, dateNavigationType, 68, null));
        m22333a1().m29993D(new AbstractC11103c.k(date));
    }

    /* JADX INFO: renamed from: f1 */
    private final void m22343f1() {
        C11101a c11101aM22333a1 = m22333a1();
        String strM5956j = m22311P0().m5956j();
        AbstractC22676k.m65749i(strM5956j, "getRequestDate(...)");
        long jM5947a = m22311P0().m5947a();
        String strM5958l = m22311P0().m5958l();
        if (strM5958l == null) {
            strM5958l = "Overview";
        }
        c11101aM22333a1.m29993D(new AbstractC11103c.j(strM5956j, jM5947a, false, strM5958l, m22311P0().m5952f(), false, false, null, 228, null));
    }

    /* JADX INFO: renamed from: g0 */
    private final C8978a m22344g0(C8998c navigationRouter, boolean autoSaveEnabled, boolean hasUserEditJournal) {
        return new C8978a(new C1945f(this, autoSaveEnabled, 0), new C1943d(this, 1), new C1944e(this, 1), new C1946g(autoSaveEnabled, hasUserEditJournal, 0, this), new C1944e(this, 2), new C1947h(autoSaveEnabled, hasUserEditJournal, 0, this), new C1943d(this, 2), new C1944e(this, 4), new C1948i(this, navigationRouter, 0));
    }

    /* JADX INFO: renamed from: g1 */
    private final void m22345g1(boolean usePreviousAnswersToggleEnabled, boolean autoSaveEnabled, boolean hasUserEditJournal) {
        if (AbstractC1941b.m5946a(autoSaveEnabled, hasUserEditJournal) == EnumC1940a.EXIT_IMMEDIATELY) {
            m22309O0(false);
        } else {
            m22333a1().m29993D(new AbstractC11103c.l(usePreviousAnswersToggleEnabled));
        }
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m22346h0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, boolean z4, AbstractC36877d it) {
        AbstractC22676k.m65750j(it, "it");
        journalSurveyAnswerFragment.m22333a1().m29993D(new AbstractC11103c.p(it));
        if (z4) {
            journalSurveyAnswerFragment.m22333a1().m29993D(AbstractC11103c.a.f35266a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h1 */
    private final void m22347h1() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(viewLifecycleOwner), null, null, new C8985h(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m22348i0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, boolean z4) {
        journalSurveyAnswerFragment.m22333a1().m29993D(new AbstractC11103c.q(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i1 */
    private final void m22349i1() {
        C28216y externalLinkNavigator = getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        C28216y.m85414y(externalLinkNavigator, abstractActivityC1340r0RequireActivity, m22333a1().getJournalHelpShortLink(), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m22350j0(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        journalSurveyAnswerFragment.m22343f1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final long m22351j1(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        return journalSurveyAnswerFragment.m22311P0().m5954h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m22352k0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, boolean z4, boolean z13, boolean z14) {
        journalSurveyAnswerFragment.m22345g1(z14, z4, z13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final long m22353k1(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        return journalSurveyAnswerFragment.m22311P0().m5955i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m22354l0(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        journalSurveyAnswerFragment.m22347h1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final String m22355l1(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        return journalSurveyAnswerFragment.m22311P0().m5956j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m22356m0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, boolean z4, boolean z13) {
        journalSurveyAnswerFragment.m22335b1(z4, z13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m1 */
    private final void m22357m1() {
        C14923z onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.m43015a(viewLifecycleOwner, new C8986i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m22358n0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, boolean z4) {
        journalSurveyAnswerFragment.m22309O0(z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n1 */
    private final void m22359n1() {
        getLifecycle().mo4986a(new C39733d(m22317S0(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m22360o0(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        journalSurveyAnswerFragment.m22349i1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final long m22361o1(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        return journalSurveyAnswerFragment.m22311P0().m5959m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m22362p0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, C8998c c8998c, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC11103c.g) {
            journalSurveyAnswerFragment.m22319T0().m127132k();
        }
        if (event instanceof AbstractC11103c.m) {
            AbstractC11103c.m mVar = (AbstractC11103c.m) event;
            journalSurveyAnswerFragment.m22319T0().m127135n(mVar.m30019a(), mVar.m30020b());
        }
        if (event instanceof AbstractC11103c) {
            journalSurveyAnswerFragment.m22333a1().m29993D((AbstractC11103c) event);
        }
        if (event instanceof C9598e) {
            c8998c.m22397b((C9598e) event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final long m22363p1(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        return journalSurveyAnswerFragment.m22311P0().m5960n();
    }

    /* JADX INFO: renamed from: q0 */
    private final ComposeView m22364q0() {
        return AbstractC22387b0.m64387c(this, new C37816b(new C1942c(this, 0), true, 1955188565));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C34911a m22365q1(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        return AbstractC15751g.m44431K(Long.valueOf(journalSurveyAnswerFragment.m22311P0().m5947a()), journalSurveyAnswerFragment.m22313Q0(), journalSurveyAnswerFragment.m22327X0(), Boolean.valueOf(journalSurveyAnswerFragment.m22311P0().m5950d()), journalSurveyAnswerFragment.m22311P0().m5958l(), journalSurveyAnswerFragment.m22311P0().m5952f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m22366r0(final JournalSurveyAnswerFragment journalSurveyAnswerFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(journalSurveyAnswerFragment.m22333a1().getViewState(), new C12341k(true, null, false, false, false, null, 62, null), null, c28655q, 0, 2);
            InterfaceC28601c1 interfaceC28601c1M115714z = AbstractC36259c.m115714z(journalSurveyAnswerFragment.m22333a1().getSavedScrollPosition(), 0, c28655q, 48);
            InterfaceC28601c1 interfaceC28601c1M115714z2 = AbstractC36259c.m115714z(journalSurveyAnswerFragment.m22333a1().getScrollToTopRequest(), Boolean.FALSE, c28655q, 48);
            InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
            C11101a c11101aM22333a1 = journalSurveyAnswerFragment.m22333a1();
            boolean zM87157i = c28655q.m87157i(interfaceC12251g) | c28655q.m87157i(journalSurveyAnswerFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C8984g(interfaceC12251g, journalSurveyAnswerFragment, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87254h(interfaceC12251g, c11101aM22333a1, (InterfaceC4351m) objM87133R, c28655q);
            C8998c c8998cM22297I0 = journalSurveyAnswerFragment.m22297I0();
            journalSurveyAnswerFragment.m22337c1(c8998cM22297I0);
            final C8979b c8979bM22376z0 = journalSurveyAnswerFragment.m22376z0();
            C8981d c8981dM22293G0 = journalSurveyAnswerFragment.m22293G0(c8998cM22297I0);
            C8980c c8980cM22287D0 = journalSurveyAnswerFragment.m22287D0();
            C8982e c8982eM22299J0 = journalSurveyAnswerFragment.m22299J0();
            C8978a c8978aM22344g0 = journalSurveyAnswerFragment.m22344g0(c8998cM22297I0, m22367s0(interfaceC28601c1M87260n).getIsSuccess().getAutoSaveEnabled(), m22367s0(interfaceC28601c1M87260n).getIsSuccess().getHasUserEditJournal());
            C12341k c12341kM22367s0 = m22367s0(interfaceC28601c1M87260n);
            Function1 onJournalQuestionClicked = c8978aM22344g0.getOnJournalQuestionClicked();
            Function1 defaultToggleCallbackType = c8978aM22344g0.getDefaultToggleCallbackType();
            InterfaceC4339a onRefresh = c8978aM22344g0.getOnRefresh();
            Function1 onSavedClicked = c8978aM22344g0.getOnSavedClicked();
            InterfaceC4339a onSavedFinish = c8978aM22344g0.getOnSavedFinish();
            InterfaceC4339a onExitClicked = c8978aM22344g0.getOnExitClicked();
            Function1 exit = c8978aM22344g0.getExit();
            Function1 onNeverShowDismissDialogClick = c8980cM22287D0.getOnNeverShowDismissDialogClick();
            InterfaceC4351m onDismissConfirmationDialogClicked = c8980cM22287D0.getOnDismissConfirmationDialogClicked();
            InterfaceC4339a onDefaultsQuestionClicked = c8978aM22344g0.getOnDefaultsQuestionClicked();
            boolean zM85369l = C28204u.INSTANCE.m85369l(journalSurveyAnswerFragment.m22327X0(), journalSurveyAnswerFragment.logger);
            InterfaceC4352n onDateClicked = c8979bM22376z0.getOnDateClicked();
            boolean zM87157i2 = c28655q.m87157i(journalSurveyAnswerFragment) | c28655q.m87153g(c8979bM22376z0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new InterfaceC4351m() { // from class: com.whoop.journal.view.fragment.b
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return JournalSurveyAnswerFragment.m22370v0(this.f26943w, c8979bM22376z0, ((Long) obj).longValue(), (String) obj2);
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R2;
            InterfaceC4351m onCalendarOpened = c8979bM22376z0.getOnCalendarOpened();
            Function1 onCalendarPaged = c8979bM22376z0.getOnCalendarPaged();
            Function1 onNavigationButtonClicked = c8981dM22293G0.getOnNavigationButtonClicked();
            Function1 onSearchFieldFocusChanged = c8982eM22299J0.getOnSearchFieldFocusChanged();
            InterfaceC4339a onBottomSheetDismissed = c8982eM22299J0.getOnBottomSheetDismissed();
            InterfaceC4351m onBottomSheetStateChanged = c8982eM22299J0.getOnBottomSheetStateChanged();
            Function1 onViewEvent = c8978aM22344g0.getOnViewEvent();
            boolean zM5957k = journalSurveyAnswerFragment.m22311P0().m5957k();
            int iM22368t0 = m22368t0(interfaceC28601c1M115714z);
            boolean zM87157i3 = c28655q.m87157i(journalSurveyAnswerFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C1943d(journalSurveyAnswerFragment, 0);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM22369u0 = m22369u0(interfaceC28601c1M115714z2);
            boolean zM87157i4 = c28655q.m87157i(journalSurveyAnswerFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C1944e(journalSurveyAnswerFragment, 0);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
            long jM5947a = journalSurveyAnswerFragment.m22311P0().m5947a();
            boolean zM87157i5 = c28655q.m87157i(journalSurveyAnswerFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C1942c(journalSurveyAnswerFragment, 1);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC3583c0.m10883r1(c12341kM22367s0, onJournalQuestionClicked, defaultToggleCallbackType, onRefresh, onSavedClicked, onSavedFinish, onExitClicked, exit, onNeverShowDismissDialogClick, onDismissConfirmationDialogClicked, onDefaultsQuestionClicked, zM85369l, null, onDateClicked, interfaceC4351m, onCalendarOpened, onCalendarPaged, onNavigationButtonClicked, onSearchFieldFocusChanged, onBottomSheetDismissed, onBottomSheetStateChanged, onViewEvent, zM5957k, iM22368t0, function1, zM22369u0, interfaceC4339a, jM5947a, (InterfaceC4351m) objM87133R5, c28655q, 0, 0, 0, 4096);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s0 */
    private static final C12341k m22367s0(InterfaceC28670t2 interfaceC28670t2) {
        return (C12341k) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    private static final int m22368t0(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).intValue();
    }

    /* JADX INFO: renamed from: u0 */
    private static final boolean m22369u0(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m22370v0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, C8979b c8979b, long j7, String date) {
        AbstractC22676k.m65750j(date, "date");
        journalSurveyAnswerFragment.m22333a1().m29994E(j7, date);
        journalSurveyAnswerFragment.m22333a1().m29991B();
        c8979b.getOnDateClicked().invoke(Long.valueOf(j7), date, EnumC39731b.CAROUSEL_DATE_SELECTION, Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m22371w0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, int i13) {
        journalSurveyAnswerFragment.m22333a1().m29992C(i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m22372x0(JournalSurveyAnswerFragment journalSurveyAnswerFragment) {
        journalSurveyAnswerFragment.m22333a1().m29995r();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m22374y0(JournalSurveyAnswerFragment journalSurveyAnswerFragment, long j7, String date) {
        AbstractC22676k.m65750j(date, "date");
        journalSurveyAnswerFragment.m22333a1().m29994E(j7, date);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z0 */
    private final C8979b m22376z0() {
        return new C8979b(new C1949j(this, 0), new C1942c(this, 4), new C1943d(this, 5));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        m22357m1();
        m22359n1();
        return m22364q0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }
}
