package o72;

import a72.AbstractC0524a;
import a81.C0556g;
import am2.C1040r;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import b72.AbstractC2784b;
import b72.C2787e;
import b90.C2880b;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import bm2.C3446h1;
import c41.C4071m2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import ep0.C13404j;
import f01.AbstractC13852d0;
import f01.C13855e0;
import f72.AbstractC14227b;
import gb1.AbstractC15673b0;
import h51.C16934f;
import hy0.C17749h0;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j81.C21421e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import js2.C21927e;
import k71.C22252i;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.InterfaceC23459e;
import live.hms.video.utils.AndroidSDKConstants;
import m72.AbstractC25206e;
import m72.AbstractC25208g;
import m72.C25202a;
import m72.C25205d;
import m72.C25210i;
import m72.C25212k;
import m83.AbstractC25265s;
import n81.AbstractC26452e;
import n81.C26453f;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26957l;
import no0.C26970r0;
import nw0.C27207n;
import nx1.C27225g;
import o51.AbstractC27535a;
import o51.AbstractC27537c;
import o51.C27538d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.InterfaceC22974l;
import p319m4.AbstractC25012a;
import p329n0.C26057j;
import p353o0.C27325i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p72.AbstractC28959b;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import q11.AbstractC29791a;
import q63.AbstractC30007c;
import q72.AbstractC30018a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s01.C32048d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: o72.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aa\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u008d\u0001\u0010\u0018\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0097\u0001\u0010#\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\"\u001a\u00020\nH\u0007¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(\u001a?\u0010*\u001a\u00020\u00042\u0006\u0010&\u001a\u00020)2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b*\u0010+\u001aq\u0010.\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010-\u001a\u00020,2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\"\u001a\u00020\nH\u0000¢\u0006\u0004\b.\u0010/\u001a?\u00101\u001a\u00020\u00042\u0006\u0010-\u001a\u0002002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b1\u00102\u001aG\u00104\u001a\u00020\u00042\u0006\u0010-\u001a\u0002032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u00105\u001a?\u00107\u001a\u00020\u00042\u0006\u0010-\u001a\u0002062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b7\u00108¨\u0006;²\u0006\u000e\u0010:\u001a\u0002098\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lm72/g$c;", "viewState", "Lkotlin/Function1;", "Lm72/e;", "Ll83/a0;", "onViewEvent", "Lf72/b;", "onNavigationEvent", "La72/a;", "onAnalyticsEvent", "", "source", "z", "(Lm72/g$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "", "Lm72/i;", "sections", "navigationTitle", "Lhy0/h1;", "navigationTag", "Lkotlin/Function0;", "onTagClick", "Lep0/j;", "screenContextMetadata", "P", "(Ljava/util/List;Ljava/lang/String;Lhy0/h1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lep0/j;Landroidx/compose/runtime/Composer;II)V", "section", "Landroidx/compose/ui/Modifier;", "titleModifier", "Lb72/e;", "sageGaugeState", "Lo51/a;", "onCompactTrendAction", "updateLatestSelectedTag", "latestSelectedTag", "J", "(Lm72/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb72/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Lhy0/h0;", "item", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lhy0/h0;Landroidx/compose/runtime/Composer;I)V", "Lm72/k;", "M", "(Lm72/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", NotificationCompat.CATEGORY_EVENT, "h0", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "Ln81/e$b;", "g0", "(Ln81/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ln81/e$a;", "f0", "(Ln81/e$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", "e0", "(Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "showNavigationTagDialog", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27647h {

    /* JADX INFO: renamed from: o72.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.sage.view.SageSuccessScreenKt$SageSuccessScreen$2$1", m100430f = "SageSuccessScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111243w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f111244x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC25208g.c f111245y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f111246z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, AbstractC25208g.c cVar, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111244x = function1;
            this.f111245y = cVar;
            this.f111246z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f111244x, this.f111245y, this.f111246z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f111243w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f111244x.invoke(new AbstractC0524a.x(this.f111245y.getLockedContent() != null, this.f111246z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: o72.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.sage.view.SageSuccessScreenKt$SageSuccessScreen$3$1", m100430f = "SageSuccessScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111247w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2994c0 f111248x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f111249y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15199y3 f111250z;

        /* JADX INFO: renamed from: o72.h$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.sage.view.SageSuccessScreenKt$SageSuccessScreen$3$1$1", m100430f = "SageSuccessScreen.kt", m100431l = {104}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f111251w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15199y3 f111252x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f111252x = c15199y3;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f111252x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f111251w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C15199y3 c15199y3 = this.f111252x;
                    this.f111251w = 1;
                    if (c15199y3.m43225f(this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111248x = interfaceC2994c0;
            this.f111249y = interfaceC28601c1;
            this.f111250z = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f111248x, this.f111249y, this.f111250z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f111247w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC27647h.m83492C(this.f111249y)) {
                AbstractC3006f0.m8732z(this.f111248x, null, null, new a(this.f111250z, null), 3);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: o72.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.sage.view.SageSuccessScreenKt$SageSuccessScreen$5$1$1", m100430f = "SageSuccessScreen.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f111253w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f111254x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f111254x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f111254x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f111253w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f111254x;
                this.f111253w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m83490A(AbstractC25206e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m83491B(AbstractC25208g.c cVar, Function1 function1, Function1 function2, Function1 function3, String str, int i13, int i14, Composer composer, int i15) {
        m83549z(cVar, function1, function2, function3, str, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final boolean m83492C(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D */
    private static final void m83493D(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m83494E(InterfaceC28601c1 interfaceC28601c1) {
        m83493D(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m83495F(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m83496G(Function1 function1, C9598e navigationAction) {
        AbstractC22676k.m65750j(navigationAction, "navigationAction");
        function1.invoke(new AbstractC14227b.c(navigationAction));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m83497H(AbstractC25208g.c cVar, Function1 function1, Function1 function2, Function1 function3, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C25202a c25202aM73821d = cVar.getContent();
            C13404j c13404jM73796d = c25202aM73821d != null ? c25202aM73821d.getScreenContextMetadata() : null;
            int i14 = C13404j.f46947x;
            Modifier modifierM34129b = AbstractC12250f.m34129b(modifierM3407d, c13404jM73796d, false, c28655q, (i14 << 3) | 6, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM34129b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66722k);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (cVar.getContent() != null) {
                c28655q.m87150e0(1402884365);
                List<C25210i> listM73797e = cVar.getContent().m73797e();
                String strM73825h = cVar.getNavigationTitle();
                C17750h1 c17750h1M73824g = cVar.getNavigationTag();
                boolean zM87153g = c28655q.m87153g(function3) | c28655q.m87157i(cVar);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C26057j(function3, cVar, interfaceC28601c1, 10);
                    c28655q.m87172p0(objM87133R);
                }
                m83505P(listM73797e, strM73825h, c17750h1M73824g, function1, function2, function3, (InterfaceC4339a) objM87133R, cVar.getContent().getScreenContextMetadata(), c28655q, (C17750h1.f69012w << 6) | (i14 << 21), 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (cVar.getLockedContent() != null) {
                c28655q.m87150e0(1403723535);
                AbstractC27641b.m83461e(null, cVar.getLockedContent(), cVar.getNavigationTitle(), function2, c28655q, (AbstractC22403o.f87638a | C9598e.f28134d) << 3, 1);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1404051918);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m83498I(Function1 function1, AbstractC25208g.c cVar, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(AbstractC0524a.r.f1810a);
        if (cVar.getSageBottomSheetState() != null) {
            m83493D(interfaceC28601c1, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0259  */
    /* JADX WARN: Code duplicated, block: B:107:0x0263  */
    /* JADX WARN: Code duplicated, block: B:109:0x026d  */
    /* JADX WARN: Code duplicated, block: B:114:0x027f  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:131:0x031d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0329  */
    /* JADX WARN: Code duplicated, block: B:135:0x0331  */
    /* JADX WARN: Code duplicated, block: B:136:0x0334  */
    /* JADX WARN: Code duplicated, block: B:138:0x033d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0341  */
    /* JADX WARN: Code duplicated, block: B:143:0x0372  */
    /* JADX WARN: Code duplicated, block: B:145:0x037e  */
    /* JADX WARN: Code duplicated, block: B:146:0x038f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0393  */
    /* JADX WARN: Code duplicated, block: B:149:0x03af  */
    /* JADX WARN: Code duplicated, block: B:151:0x03be  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:156:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:159:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:163:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:168:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:175:0x0400  */
    /* JADX WARN: Code duplicated, block: B:179:0x044d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0457  */
    /* JADX WARN: Code duplicated, block: B:188:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x027f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:78:0x0101  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x012e  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x015f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:95:0x01df  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:99:0x0245  */
    /* JADX INFO: renamed from: J */
    public static final void m83499J(C25210i section, Modifier modifier, Function1 function1, C2787e c2787e, Function1 function2, Function1 function3, Function1 function4, Function1 updateLatestSelectedTag, String latestSelectedTag, Composer composer, int i13, int i14) {
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        int i15;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        String strM73833e;
        int i16;
        boolean z13;
        String strM73832d;
        InterfaceC22974l interfaceC22974lM66746i;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        C2314t c2314t2;
        int i17;
        boolean z14;
        char c3;
        int i18;
        char c7;
        boolean z15;
        boolean z16;
        C28655q c28655q;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R;
        C2787e c2787e2;
        List<InterfaceC25312u> listM73831c;
        Iterator<T> it;
        InterfaceC25312u interfaceC25312u;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Function1 onViewEvent = function1;
        Function1 onCompactTrendAction = function2;
        Function1 onNavigationEvent = function3;
        Function1 onAnalyticsEvent = function4;
        AbstractC22676k.m65750j(section, "section");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onCompactTrendAction, "onCompactTrendAction");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(updateLatestSelectedTag, "updateLatestSelectedTag");
        AbstractC22676k.m65750j(latestSelectedTag, "latestSelectedTag");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(45875144);
        int i34 = (i13 & 6) == 0 ? (c28655q2.m87157i(section) ? 4 : 2) | i13 : i13;
        int i35 = i14 & 2;
        if (i35 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i34 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(onViewEvent)) {
                    i29 = 256;
                } else {
                    i29 = 128;
                }
                i34 |= i29;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87153g(c2787e)) {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i34 |= i28;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(onCompactTrendAction)) {
                    i27 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i27 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i34 |= i27;
            }
            if ((196608 & i13) == 0) {
                if (c28655q2.m87157i(onNavigationEvent)) {
                    i26 = 131072;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i34 |= i26;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q2.m87157i(onAnalyticsEvent)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i34 |= i25;
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(updateLatestSelectedTag)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i34 |= i24;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87153g(latestSelectedTag)) {
                    i19 = 67108864;
                } else {
                    i19 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i34 |= i19;
            }
            if ((i34 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i34 & 1, z4)) {
                i15 = i34;
                c2314t = C2314t.f9131w;
                if (i35 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                strM73833e = section.getTitleDisplay();
                if (strM73833e == null) {
                    c28655q2.m87150e0(-1356694017);
                    z13 = false;
                    c28655q2.m87173q(false);
                    i16 = 256;
                } else {
                    c28655q2.m87150e0(-1356694016);
                    i16 = 256;
                    AbstractC30795n.m94707h(strM73833e, modifier4, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (C2886a) section.getTitleStyle().getGetStyle().invoke(c28655q2, 0), null, c28655q2, i15 & 112, C2886a.f11498d << 18, 196600);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3394p(((float) 0.5d) * 8, c2314t));
                    z13 = false;
                    c28655q2.m87173q(false);
                }
                strM73832d = section.getSubtitleDisplay();
                if (strM73832d == null) {
                    c28655q2.m87150e0(-1356362038);
                    c28655q2.m87173q(z13);
                } else {
                    c28655q2.m87150e0(-1356362037);
                    C38072d c38072d = C38072d.f163053a;
                    int i36 = C38072d.f163054b;
                    AbstractC30795n.m94707h(strM73832d, null, c38072d.m121949b(c28655q2, i36).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i36).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C2305k c2305k = C2299e.f9111N;
                if (section.m73831c().size() > 1) {
                    listM73831c = section.m73831c();
                    if ((listM73831c instanceof Collection) || !listM73831c.isEmpty()) {
                        it = listM73831c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                interfaceC25312u = (InterfaceC25312u) it.next();
                                if (!(interfaceC25312u instanceof C16934f) || (interfaceC25312u instanceof C26453f)) {
                                    interfaceC22974lM66746i = AbstractC22977m.f90652c;
                                }
                            }
                        }
                    }
                    interfaceC22974lM66746i = AbstractC22977m.m66746i(((float) 1.5d) * 8);
                } else {
                    interfaceC22974lM66746i = AbstractC22977m.f90652c;
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(interfaceC22974lM66746i, c2305k, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                c28655q2.m87150e0(1172059395);
                for (InterfaceC25312u interfaceC25312u2 : section.m73831c()) {
                    if (interfaceC25312u2 instanceof C27538d) {
                        c28655q2.m87150e0(1681450311);
                        i17 = i15;
                        c3 = 0;
                        AbstractC27537c.m83064j(c2314t, (C27538d) interfaceC25312u2, onCompactTrendAction, c28655q2, ((i15 >> 6) & 896) | 6, 0);
                        c2314t2 = c2314t;
                        z14 = false;
                        c28655q2.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        i17 = i15;
                        z14 = false;
                        c3 = 0;
                        if (interfaceC25312u2 instanceof C2787e) {
                            c28655q2.m87150e0(1681745803);
                            if (c2787e == null) {
                                c2787e2 = (C2787e) interfaceC25312u2;
                            } else {
                                c2787e2 = c2787e;
                            }
                            AbstractC2784b.m7908q(c2787e2, c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            if (interfaceC25312u2 instanceof C13855e0) {
                                c28655q2.m87150e0(1681890294);
                                i18 = i17;
                                C28655q c28655q3 = c28655q2;
                                c7 = 0;
                                z16 = true;
                                AbstractC13852d0.m39235f(null, (C13855e0) interfaceC25312u2, null, c28655q3, 0, 5);
                                c28655q = c28655q3;
                                z15 = false;
                                c28655q.m87173q(false);
                            } else {
                                i18 = i17;
                                c7 = 0;
                                z15 = false;
                                z16 = true;
                                c28655q = c28655q2;
                                if (interfaceC25312u2 instanceof C17749h0) {
                                    c28655q.m87150e0(-1608309453);
                                    m83546w((C17749h0) interfaceC25312u2, c28655q, 0);
                                    c28655q.m87173q(false);
                                } else if (interfaceC25312u2 instanceof C25212k) {
                                    c28655q.m87150e0(-1608306878);
                                    m83502M((C25212k) interfaceC25312u2, onNavigationEvent, onAnalyticsEvent, c28655q, (i18 >> 12) & MessageListItemViewType.GIPHY);
                                    c28655q.m87173q(false);
                                    c28655q2 = c28655q;
                                    i17 = i18;
                                } else {
                                    c28655q.m87150e0(1682332881);
                                    C25307p c25307pM91893b = AbstractC30018a.m91893b();
                                    if ((i18 & 896) == i16) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    if ((458752 & i18) == 131072) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    boolean z27 = z17 | z18;
                                    if ((3670016 & i18) == 1048576) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    boolean z28 = z27 | z19;
                                    if ((29360128 & i18) == 8388608) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    boolean z29 = z28 | z24;
                                    if ((234881024 & i18) == 67108864) {
                                        z25 = true;
                                    } else {
                                        z25 = false;
                                    }
                                    z26 = z29 | z25;
                                    objM87133R = c28655q.m87133R();
                                    if (z26 || objM87133R == C28635l.f115821a) {
                                        C1040r c1040r = new C1040r(onViewEvent, (Object) function3, (Object) onAnalyticsEvent, (Object) updateLatestSelectedTag, (Object) latestSelectedTag, 28);
                                        c28655q.m87172p0(c1040r);
                                        objM87133R = c1040r;
                                    }
                                    i17 = i18;
                                    i16 = 256;
                                    AbstractC25303l.m74291r(interfaceC25312u2, c25307pM91893b, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
                                    c28655q2 = c28655q;
                                    c28655q2.m87173q(false);
                                }
                            }
                            c28655q2 = c28655q;
                            i17 = i18;
                        }
                        onViewEvent = function1;
                        onCompactTrendAction = function2;
                        onNavigationEvent = function3;
                        onAnalyticsEvent = function4;
                        i15 = i17;
                        i16 = i16;
                        c2314t = c2314t2;
                    }
                    i16 = i16;
                    onViewEvent = function1;
                    onCompactTrendAction = function2;
                    onNavigationEvent = function3;
                    onAnalyticsEvent = function4;
                    i15 = i17;
                    i16 = i16;
                    c2314t = c2314t2;
                }
                AbstractC25012a.m73392y(c28655q2, false, true, true);
                modifier3 = modifier4;
            } else {
                c28655q2.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3446h1(section, modifier3, function1, c2787e, function2, function3, function4, updateLatestSelectedTag, latestSelectedTag, i13, i14, 3);
            }
        }
        i34 |= 48;
        modifier2 = modifier;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(onViewEvent)) {
                i29 = 256;
            } else {
                i29 = 128;
            }
            i34 |= i29;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87153g(c2787e)) {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i34 |= i28;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87157i(onCompactTrendAction)) {
                i27 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i27 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i34 |= i27;
        }
        if ((196608 & i13) == 0) {
            if (c28655q2.m87157i(onNavigationEvent)) {
                i26 = 131072;
            } else {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i34 |= i26;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q2.m87157i(onAnalyticsEvent)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i34 |= i25;
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q2.m87157i(updateLatestSelectedTag)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i34 |= i24;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q2.m87153g(latestSelectedTag)) {
                i19 = 67108864;
            } else {
                i19 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i34 |= i19;
        }
        if ((i34 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i34 & 1, z4)) {
            i15 = i34;
            c2314t = C2314t.f9131w;
            if (i35 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
            strM73833e = section.getTitleDisplay();
            if (strM73833e == null) {
                c28655q2.m87150e0(-1356694017);
                z13 = false;
                c28655q2.m87173q(false);
                i16 = 256;
            } else {
                c28655q2.m87150e0(-1356694016);
                i16 = 256;
                AbstractC30795n.m94707h(strM73833e, modifier4, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (C2886a) section.getTitleStyle().getGetStyle().invoke(c28655q2, 0), null, c28655q2, i15 & 112, C2886a.f11498d << 18, 196600);
                AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3394p(((float) 0.5d) * 8, c2314t));
                z13 = false;
                c28655q2.m87173q(false);
            }
            strM73832d = section.getSubtitleDisplay();
            if (strM73832d == null) {
                c28655q2.m87150e0(-1356362038);
                c28655q2.m87173q(z13);
            } else {
                c28655q2.m87150e0(-1356362037);
                C38072d c38072d2 = C38072d.f163053a;
                int i37 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM73832d, null, c38072d2.m121949b(c28655q2, i37).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i37).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q2.m87173q(false);
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C2305k c2305k2 = C2299e.f9111N;
            if (section.m73831c().size() > 1) {
                listM73831c = section.m73831c();
                if (listM73831c instanceof Collection) {
                    it = listM73831c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            interfaceC25312u = (InterfaceC25312u) it.next();
                            if (!(interfaceC25312u instanceof C16934f)) {
                            }
                            interfaceC22974lM66746i = AbstractC22977m.f90652c;
                        } else {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(((float) 1.5d) * 8);
                        }
                    }
                } else {
                    it = listM73831c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            interfaceC25312u = (InterfaceC25312u) it.next();
                            if (!(interfaceC25312u instanceof C16934f)) {
                            }
                            interfaceC22974lM66746i = AbstractC22977m.f90652c;
                        } else {
                            interfaceC22974lM66746i = AbstractC22977m.m66746i(((float) 1.5d) * 8);
                        }
                    }
                }
            } else {
                interfaceC22974lM66746i = AbstractC22977m.f90652c;
            }
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(interfaceC22974lM66746i, c2305k2, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i2 = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            c28655q2.m87150e0(1172059395);
            while (r0.hasNext()) {
                if (interfaceC25312u2 instanceof C27538d) {
                    c28655q2.m87150e0(1681450311);
                    i17 = i15;
                    c3 = 0;
                    AbstractC27537c.m83064j(c2314t, (C27538d) interfaceC25312u2, onCompactTrendAction, c28655q2, ((i15 >> 6) & 896) | 6, 0);
                    c2314t2 = c2314t;
                    z14 = false;
                    c28655q2.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    i17 = i15;
                    z14 = false;
                    c3 = 0;
                    if (interfaceC25312u2 instanceof C2787e) {
                        c28655q2.m87150e0(1681745803);
                        if (c2787e == null) {
                            c2787e2 = (C2787e) interfaceC25312u2;
                        } else {
                            c2787e2 = c2787e;
                        }
                        AbstractC2784b.m7908q(c2787e2, c28655q2, 0);
                        c28655q2.m87173q(false);
                    } else {
                        if (interfaceC25312u2 instanceof C13855e0) {
                            c28655q2.m87150e0(1681890294);
                            i18 = i17;
                            C28655q c28655q4 = c28655q2;
                            c7 = 0;
                            z16 = true;
                            AbstractC13852d0.m39235f(null, (C13855e0) interfaceC25312u2, null, c28655q4, 0, 5);
                            c28655q = c28655q4;
                            z15 = false;
                            c28655q.m87173q(false);
                        } else {
                            i18 = i17;
                            c7 = 0;
                            z15 = false;
                            z16 = true;
                            c28655q = c28655q2;
                            if (interfaceC25312u2 instanceof C17749h0) {
                                c28655q.m87150e0(-1608309453);
                                m83546w((C17749h0) interfaceC25312u2, c28655q, 0);
                                c28655q.m87173q(false);
                            } else if (interfaceC25312u2 instanceof C25212k) {
                                c28655q.m87150e0(-1608306878);
                                m83502M((C25212k) interfaceC25312u2, onNavigationEvent, onAnalyticsEvent, c28655q, (i18 >> 12) & MessageListItemViewType.GIPHY);
                                c28655q.m87173q(false);
                                c28655q2 = c28655q;
                                i17 = i18;
                            } else {
                                c28655q.m87150e0(1682332881);
                                C25307p c25307pM91893b2 = AbstractC30018a.m91893b();
                                if ((i18 & 896) == i16) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if ((458752 & i18) == 131072) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                boolean z210 = z17 | z18;
                                if ((3670016 & i18) == 1048576) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                boolean z211 = z210 | z19;
                                if ((29360128 & i18) == 8388608) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                boolean z212 = z211 | z24;
                                if ((234881024 & i18) == 67108864) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                z26 = z212 | z25;
                                objM87133R = c28655q.m87133R();
                                if (z26) {
                                    C1040r c1040r2 = new C1040r(onViewEvent, (Object) function3, (Object) onAnalyticsEvent, (Object) updateLatestSelectedTag, (Object) latestSelectedTag, 28);
                                    c28655q.m87172p0(c1040r2);
                                    objM87133R = c1040r2;
                                } else {
                                    C1040r c1040r3 = new C1040r(onViewEvent, (Object) function3, (Object) onAnalyticsEvent, (Object) updateLatestSelectedTag, (Object) latestSelectedTag, 28);
                                    c28655q.m87172p0(c1040r3);
                                    objM87133R = c1040r3;
                                }
                                i17 = i18;
                                i16 = 256;
                                AbstractC25303l.m74291r(interfaceC25312u2, c25307pM91893b2, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
                                c28655q2 = c28655q;
                                c28655q2.m87173q(false);
                            }
                        }
                        c28655q2 = c28655q;
                        i17 = i18;
                    }
                    onViewEvent = function1;
                    onCompactTrendAction = function2;
                    onNavigationEvent = function3;
                    onAnalyticsEvent = function4;
                    i15 = i17;
                    i16 = i16;
                    c2314t = c2314t2;
                }
                i16 = i16;
                onViewEvent = function1;
                onCompactTrendAction = function2;
                onNavigationEvent = function3;
                onAnalyticsEvent = function4;
                i15 = i17;
                i16 = i16;
                c2314t = c2314t2;
            }
            AbstractC25012a.m73392y(c28655q2, false, true, true);
            modifier3 = modifier4;
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3446h1(section, modifier3, function1, c2787e, function2, function3, function4, updateLatestSelectedTag, latestSelectedTag, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m83500K(Function1 function1, Function1 function2, Function1 function3, Function1 function4, String str, Object it) {
        AbstractC22676k.m65750j(it, "it");
        m83531h0(function1, function2, function3, it, function4, str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m83501L(C25210i c25210i, Modifier modifier, Function1 function1, C2787e c2787e, Function1 function2, Function1 function3, Function1 function4, Function1 function5, String str, int i13, int i14, Composer composer, int i15) {
        m83499J(c25210i, modifier, function1, c2787e, function2, function3, function4, function5, str, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    public static final void m83502M(C25212k item, Function1 onNavigationEvent, Function1 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1091719311);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C25307p c25307pM91893b = AbstractC30018a.m91893b();
            boolean z4 = ((i14 & 896) == 256) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C2777c(onAnalyticsEvent, 12, onNavigationEvent);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(item, c25307pM91893b, null, (Function1) objM87133R, c28655q, (C25307p.f99300b << 3) | (i14 & 14), 4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) item, onNavigationEvent, (InterfaceC23459e) onAnalyticsEvent, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m83503N(Function1 function1, Function1 function2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C9598e) {
            function1.invoke(AbstractC0524a.k.f1802a);
            function2.invoke(new AbstractC14227b.c((C9598e) event));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m83504O(C25212k c25212k, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m83502M(c25212k, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014a A[LOOP:0: B:100:0x0144->B:102:0x014a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x016f  */
    /* JADX WARN: Code duplicated, block: B:112:0x018d  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ae A[LOOP:2: B:114:0x01a8->B:116:0x01ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:134:0x0264  */
    /* JADX WARN: Code duplicated, block: B:135:0x0268  */
    /* JADX WARN: Code duplicated, block: B:138:0x027d  */
    /* JADX WARN: Code duplicated, block: B:141:0x028e  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:153:0x0344  */
    /* JADX WARN: Code duplicated, block: B:155:0x0371  */
    /* JADX WARN: Code duplicated, block: B:157:0x039a  */
    /* JADX WARN: Code duplicated, block: B:158:0x039e  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:170:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:171:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:174:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:177:0x0404  */
    /* JADX WARN: Code duplicated, block: B:178:0x0418  */
    /* JADX WARN: Code duplicated, block: B:182:0x044c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x044e  */
    /* JADX WARN: Code duplicated, block: B:187:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:188:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:191:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:195:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:199:0x050b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0513  */
    /* JADX WARN: Code duplicated, block: B:203:0x051f  */
    /* JADX WARN: Code duplicated, block: B:206:0x052a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0534  */
    /* JADX WARN: Code duplicated, block: B:211:0x053e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0545  */
    /* JADX WARN: Code duplicated, block: B:219:0x054b  */
    /* JADX WARN: Code duplicated, block: B:221:0x055a  */
    /* JADX WARN: Code duplicated, block: B:224:0x0580  */
    /* JADX WARN: Code duplicated, block: B:225:0x0584  */
    /* JADX WARN: Code duplicated, block: B:228:0x0597  */
    /* JADX WARN: Code duplicated, block: B:230:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:233:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:236:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:239:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:243:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:244:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:247:0x0612  */
    /* JADX WARN: Code duplicated, block: B:248:0x0615  */
    /* JADX WARN: Code duplicated, block: B:251:0x061d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0620  */
    /* JADX WARN: Code duplicated, block: B:255:0x0628  */
    /* JADX WARN: Code duplicated, block: B:257:0x062c  */
    /* JADX WARN: Code duplicated, block: B:258:0x062f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0641  */
    /* JADX WARN: Code duplicated, block: B:263:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:264:0x0673  */
    /* JADX WARN: Code duplicated, block: B:267:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:270:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:273:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:277:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:278:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:283:0x0716  */
    /* JADX WARN: Code duplicated, block: B:286:0x0725  */
    /* JADX WARN: Code duplicated, block: B:290:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x0705 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x06c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x06d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:? A[LOOP:5: B:271:0x06c6->B:304:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x05c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:? A[LOOP:6: B:237:0x05c6->B:307:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x0548 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:? A[LOOP:7: B:207:0x052e->B:312:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3 A[PHI: r19
      0x00d3: PHI (r19v11 int) = (r19v0 int), (r19v6 int), (r19v7 int) binds: [B:66:0x00d1, B:76:0x00ee, B:75:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0108  */
    /* JADX WARN: Code duplicated, block: B:85:0x010b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0111  */
    /* JADX WARN: Code duplicated, block: B:90:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    /* JADX WARN: Code duplicated, block: B:95:0x012c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0130  */
    /* JADX WARN: Code duplicated, block: B:98:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX INFO: renamed from: P */
    public static final void m83505P(List<C25210i> sections, String navigationTitle, C17750h1 c17750h1, Function1 function1, Function1 onNavigationEvent, final Function1 onAnalyticsEvent, InterfaceC4339a interfaceC4339a, C13404j c13404j, Composer composer, int i13, int i14) {
        Function1 function2;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean zM87157i;
        boolean z4;
        InterfaceC4339a interfaceC4339a2;
        C13404j c13404j2;
        Function1 function3;
        C17750h1 c17750h2;
        C28677v1 c28677v1M87180u;
        C17750h1 c17750h3;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC4339a interfaceC4339a3;
        C13404j c13404j3;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        C2787e c2787e;
        boolean zM87153g;
        Object objM87133R;
        final InterfaceC28601c1 interfaceC28601c1;
        final Context context;
        ArrayList arrayList3;
        Iterator it3;
        ArrayList arrayList4;
        C26453f c26453f;
        boolean zM87153g2;
        Object objM87133R2;
        String strM78342f;
        C2314t c2314t;
        C2305k c2305k;
        final C27643d c27643d;
        int iHashCode;
        C0213j c0213j;
        List<C25210i> list;
        C0209i c0209i;
        C0209i c0209i2;
        C2305k c2305k2;
        C0209i c0209i3;
        float f13;
        boolean z13;
        Object objM87133R3;
        int i19;
        float f14;
        InterfaceC28601c1 interfaceC28601c2;
        C0209i c0209i4;
        C25210i c25210i;
        int iHashCode2;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R4;
        C28676v0 c28676v1;
        Context context2;
        C27643d c27643d2;
        final Function1 function5;
        final C2787e c2787e2;
        Object obj;
        C0209i c0209i5;
        C28676v0 c28676v2;
        C28655q c28655q;
        boolean zM87153g3;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c3;
        Function1 function6;
        C28676v0 c28676v3;
        C2787e c2787e3;
        int i24;
        Context context3;
        C0209i c0209i6;
        boolean z17;
        int i25;
        int iHashCode3;
        Iterator it4;
        int i26;
        Object next;
        int i27;
        List<InterfaceC25312u> listM73831c;
        Iterator it5;
        InterfaceC25312u interfaceC25312u;
        boolean z18;
        boolean z19;
        float f15;
        int i28;
        Modifier modifierM3396r;
        int iHashCode4;
        C0213j c0213j2;
        C0209i c0209i7;
        List<InterfaceC25312u> listM73831c2;
        Iterator it6;
        boolean z24;
        Modifier modifierM3394p;
        boolean z25;
        final C27643d c27643d3;
        final C2787e c2787e4;
        final Context context4;
        ?? r14;
        ?? r15;
        ?? r10;
        Object objM87133R6;
        C28676v0 c28676v4;
        Context context5;
        C27643d c27643d4;
        C28676v0 c28676v5;
        Object obj2;
        InterfaceC28601c1 interfaceC28601c4;
        boolean zM87153g4;
        Object objM87133R7;
        float f16;
        List<InterfaceC25312u> listM73831c3;
        Iterator it7;
        ?? r16;
        float f17;
        C28676v0 c28676v6;
        Object objM87133R8;
        int i29;
        int i34;
        C2307m c2307m = C2299e.f9114w;
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(170804290);
        int i35 = (i13 & 6) == 0 ? (c28655q2.m87157i(sections) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i35 |= c28655q2.m87153g(navigationTitle) ? 32 : 16;
        }
        int i36 = i14 & 4;
        if (i36 != 0) {
            i35 |= 384;
        } else if ((i13 & 384) == 0) {
            i35 |= (i13 & 512) == 0 ? c28655q2.m87153g(c17750h1) : c28655q2.m87157i(c17750h1) ? 256 : 128;
        }
        int i37 = i14 & 8;
        if (i37 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i35 |= c28655q2.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(onNavigationEvent)) {
                    i34 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i34 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i35 |= i34;
            }
            if ((196608 & i13) == 0) {
                if (c28655q2.m87157i(onAnalyticsEvent)) {
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i35 |= i29;
            }
            i15 = i14 & 64;
            if (i15 != 0) {
                i35 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(interfaceC4339a)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i35 |= i16;
            }
            i17 = i14 & 128;
            i18 = 12582912;
            if (i17 == 0) {
                i35 |= i18;
            } else if ((i13 & 12582912) == 0) {
                if ((i13 & 16777216) == 0) {
                    zM87157i = c28655q2.m87153g(c13404j);
                } else {
                    zM87157i = c28655q2.m87157i(c13404j);
                }
                if (zM87157i) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i35 |= i18;
            }
            if ((i35 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i35 & 1, z4)) {
                if (i36 != 0) {
                    c17750h3 = null;
                } else {
                    c17750h3 = c17750h1;
                }
                c28676v0 = C28635l.f115821a;
                if (i37 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C27644e(4);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                } else {
                    function4 = function2;
                }
                if (i15 != 0) {
                    interfaceC4339a3 = null;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i17 != 0) {
                    c13404j3 = null;
                } else {
                    c13404j3 = c13404j;
                }
                C27643d c27643d5 = new C27643d();
                List<C25210i> list2 = sections;
                arrayList = new ArrayList();
                it = list2.iterator();
                while (it.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList, ((C25210i) it.next()).m73831c());
                }
                arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof C2787e) {
                        arrayList2.add(obj3);
                    }
                }
                c2787e = (C2787e) AbstractC25265s.m74100H0(arrayList2);
                zM87153g = c28655q2.m87153g(c2787e);
                objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(c2787e);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                arrayList3 = new ArrayList();
                it3 = list2.iterator();
                while (it3.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList3, ((C25210i) it3.next()).m73831c());
                }
                arrayList4 = new ArrayList();
                for (Object obj4 : arrayList3) {
                    if (obj4 instanceof C26453f) {
                        arrayList4.add(obj4);
                    }
                }
                c26453f = (C26453f) AbstractC25265s.m74100H0(arrayList4);
                zM87153g2 = c28655q2.m87153g(c26453f);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    if (c26453f != null || (strM78342f = c26453f.getSelectedTag()) == null) {
                        strM78342f = "SLEEP";
                    }
                    objM87133R2 = AbstractC28683x.m87272z(strM78342f);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R2;
                c2314t = C2314t.f9131w;
                Modifier modifierM34108a = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q2, 1), 14), c13404j3, 0.0f, false, c28655q2, (C13404j.f46947x << 3) | ((i35 >> 18) & 112), 6);
                C13404j c13404j4 = c13404j3;
                C22957g c22957g = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                c27643d = c27643d5;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM34108a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                list = list2;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c2305k2 = c2305k;
                } else {
                    c2305k2 = c2305k;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i3 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N);
                    float f18 = 8;
                    float f19 = 1 * f18;
                    Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t, f19, c28655q2, c2314t, 1.0f);
                    f13 = f18;
                    AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(navigationTitle), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC35283c.f150167E)), null, null, null, false, null, null, null, null, null, c17750h3, null, null, 28666, null);
                    if ((57344 & i35) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z13 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C27207n(onNavigationEvent, 9);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    i19 = i35 >> 3;
                    C2305k c2305k3 = c2305k2;
                    InterfaceC4339a interfaceC4339a4 = interfaceC4339a3;
                    f14 = f19;
                    interfaceC28601c2 = interfaceC28601c5;
                    c0209i4 = c0209i8;
                    AbstractC6719b.m20143d(modifierM91835e, aVar, null, (InterfaceC4339a) objM87133R3, null, interfaceC4339a4, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6 | (i19 & 458752), 20);
                    c25210i = (C25210i) AbstractC25265s.m74100H0(sections);
                    if (c25210i == null) {
                        c28655q2.m87150e0(536394090);
                        c28655q2.m87173q(false);
                        interfaceC28601c3 = interfaceC28601c1;
                        list = list;
                        c2787e3 = c2787e;
                        c0209i4 = c0209i4;
                        c0209i3 = c0209i3;
                        c0209i6 = c0209i2;
                        i24 = i19;
                        c0209i5 = c0209i;
                        i25 = 0;
                        c28676v3 = c28676v0;
                        function6 = function4;
                        context3 = context;
                        z17 = true;
                        c28655q2 = c28655q2;
                    } else {
                        c28655q2.m87150e0(536394091);
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 5 * f13, 0.0f, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N2);
                        C2787e c2787eM83508S = m83508S(interfaceC28601c1);
                        String strM83510U = m83510U(interfaceC28601c2);
                        boolean zM87153g5 = c28655q2.m87153g(c27643d) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(c2787e) | c28655q2.m87157i(context);
                        if ((i35 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z26 = zM87153g5 | z14;
                        if ((i35 & 458752) == 131072) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z26 | z15;
                        objM87133R4 = c28655q2.m87133R();
                        if (z16) {
                            c28676v1 = c28676v0;
                        } else {
                            c28676v1 = c28676v0;
                            if (objM87133R4 == c28676v1) {
                                c2787e2 = c2787e;
                                c0209i5 = c0209i;
                                obj = objM87133R4;
                                c27643d2 = c27643d;
                                c28655q = c28655q2;
                                c28676v2 = c28676v1;
                                context2 = context;
                                function5 = function4;
                            }
                            Function1 function7 = (Function1) obj;
                            zM87153g3 = c28655q.m87153g(interfaceC28601c2);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87153g3 || objM87133R5 == c28676v2) {
                                objM87133R5 = new C21927e(23, interfaceC28601c2);
                                c28655q.m87172p0(objM87133R5);
                            }
                            int i38 = i35 << 3;
                            int i39 = (i19 & 896) | (i38 & 458752) | (i38 & 3670016);
                            interfaceC28601c3 = interfaceC28601c1;
                            c28655q2 = c28655q;
                            function6 = function5;
                            c28676v3 = c28676v2;
                            c2787e3 = c2787e2;
                            i24 = i19;
                            context3 = context2;
                            c0209i6 = c0209i2;
                            interfaceC28601c2 = interfaceC28601c2;
                            c27643d = c27643d2;
                            m83499J(c25210i, null, function6, c2787eM83508S, function7, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R5, strM83510U, c28655q2, i39, 2);
                            z17 = true;
                            c28655q2.m87173q(true);
                            i25 = 0;
                            c28655q2.m87173q(false);
                        }
                        final int i44 = 1;
                        c28655q = c28655q2;
                        c28676v2 = c28676v1;
                        function5 = function4;
                        c2787e2 = c2787e;
                        c0209i5 = c0209i;
                        obj = new Function1() { // from class: o72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i44) {
                                    case 0:
                                        return AbstractC27647h.m83517a0(c27643d, c2787e2, context, function5, onAnalyticsEvent, interfaceC28601c1, (AbstractC27535a) obj5);
                                    default:
                                        return AbstractC27647h.m83513X(c27643d, c2787e2, context, function5, onAnalyticsEvent, interfaceC28601c1, (AbstractC27535a) obj5);
                                }
                            }
                        };
                        context2 = context;
                        c27643d2 = c27643d;
                        c28655q.m87172p0(obj);
                        Function1 function8 = (Function1) obj;
                        zM87153g3 = c28655q.m87153g(interfaceC28601c2);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R5 = new C21927e(23, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C21927e(23, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i310 = i35 << 3;
                        int i311 = (i19 & 896) | (i310 & 458752) | (i310 & 3670016);
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q2 = c28655q;
                        function6 = function5;
                        c28676v3 = c28676v2;
                        c2787e3 = c2787e2;
                        i24 = i19;
                        context3 = context2;
                        c0209i6 = c0209i2;
                        interfaceC28601c2 = interfaceC28601c2;
                        c27643d = c27643d2;
                        m83499J(c25210i, null, function6, c2787eM83508S, function8, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R5, strM83510U, c28655q2, i311, 2);
                        z17 = true;
                        c28655q2.m87173q(true);
                        i25 = 0;
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3392n = AbstractC1099a.m3392n(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, -70, z17 ? 1 : 0);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k3, c28655q2, i25);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3392n);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N3);
                    c28655q2.m87150e0(-2021331611);
                    it4 = AbstractC25265s.m74161z0(list, z17 ? 1 : 0).iterator();
                    i26 = 0;
                    while (it4.hasNext()) {
                        next = it4.next();
                        i27 = i26 + 1;
                        if (i26 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C25210i c25210i2 = (C25210i) next;
                        listM73831c = c25210i2.m73831c();
                        if (!(listM73831c instanceof Collection) && listM73831c.isEmpty()) {
                            z19 = z17;
                            break;
                        }
                        it5 = listM73831c.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z19 = z17;
                                break;
                            }
                            interfaceC25312u = (InterfaceC25312u) it5.next();
                            if (!(interfaceC25312u instanceof C16934f) || (interfaceC25312u instanceof C26453f)) {
                                z18 = z17;
                            } else {
                                z18 = false;
                            }
                            if (z18) {
                                z19 = false;
                                break;
                            }
                        }
                        if (z19) {
                            i28 = 2;
                            f15 = f13;
                            modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * f15, 0.0f, 2);
                        } else {
                            f15 = f13;
                            i28 = 2;
                            modifierM3396r = c2314t;
                        }
                        c2307m = c2307m;
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                        c0209i7 = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i7);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                        listM73831c2 = c25210i2.m73831c();
                        if (!(listM73831c2 instanceof Collection) && listM73831c2.isEmpty()) {
                            z24 = false;
                            break;
                        }
                        it6 = listM73831c2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                if (((InterfaceC25312u) it6.next()) instanceof C26453f) {
                                    z24 = z17;
                                    break;
                                }
                            } else {
                                z24 = false;
                                break;
                            }
                        }
                        if (z24) {
                            modifierM3394p = AbstractC1099a.m3394p(i28 * f15, c2314t);
                        } else {
                            modifierM3394p = c2314t;
                        }
                        C2787e c2787eM83508S2 = m83508S(interfaceC28601c3);
                        z25 = z17;
                        String strM83510U2 = m83510U(interfaceC28601c2);
                        c27643d3 = c27643d;
                        final InterfaceC28601c1 interfaceC28601c6 = interfaceC28601c3;
                        c2787e4 = c2787e3;
                        context4 = context3;
                        ?? r17 = ((((c28655q2.m87153g(c27643d3) ? 1 : 0) | (c28655q2.m87153g(interfaceC28601c6) ? 1 : 0)) | (c28655q2.m87153g(c2787e4) ? 1 : 0)) == true ? 1 : 0) | (c28655q2.m87157i(context4) ? 1 : 0);
                        i35 = i35;
                        if ((i35 & 7168) == 2048) {
                            r14 = z25 ? 1 : 0;
                        } else {
                            r14 = 0;
                        }
                        ?? r18 = r17 | r14;
                        if ((i35 & 458752) == 131072) {
                            r15 = z25 ? 1 : 0;
                        } else {
                            r15 = 0;
                        }
                        r10 = (r18 == true ? 1 : 0) | r15;
                        objM87133R6 = c28655q2.m87133R();
                        if (r10 == 0) {
                            c28676v6 = c28676v3;
                            if (objM87133R6 == c28676v6) {
                                c28676v4 = c28676v6;
                            } else {
                                c28676v5 = c28676v6;
                                obj2 = objM87133R6;
                                c2787e3 = c2787e4;
                                context5 = context4;
                                c27643d4 = c27643d3;
                            }
                            Function1 function9 = (Function1) obj2;
                            interfaceC28601c4 = interfaceC28601c2;
                            zM87153g4 = c28655q2.m87153g(interfaceC28601c4);
                            objM87133R7 = c28655q2.m87133R();
                            if (zM87153g4 || objM87133R7 == c28676v5) {
                                objM87133R7 = new C21927e(24, interfaceC28601c4);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            int i45 = i35 << 3;
                            Iterator it8 = it4;
                            interfaceC28601c2 = interfaceC28601c4;
                            c28676v3 = c28676v5;
                            f16 = f15;
                            m83499J(c25210i2, modifierM3394p, function6, c2787eM83508S2, function9, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R7, strM83510U2, c28655q2, (i24 & 896) | (i45 & 458752) | (i45 & 3670016), 0);
                            c28655q2.m87173q(z25);
                            listM73831c3 = c25210i2.m73831c();
                            if (!(listM73831c3 instanceof Collection) && listM73831c3.isEmpty()) {
                                r16 = 0;
                                break;
                            }
                            it7 = listM73831c3.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                        r16 = z25 ? 1 : 0;
                                        break;
                                    }
                                } else {
                                    r16 = 0;
                                    break;
                                }
                            }
                            if (r16 != 0) {
                                f17 = f14;
                                AbstractC33745d.m106667z(c28655q2, 264300956, c2314t, f17, c28655q2);
                                c28655q2.m87173q(false);
                            } else {
                                f17 = f14;
                                c28655q2.m87150e0(264303388);
                                AbstractC25012a.m73388u(2, f16, c2314t, c28655q2, false);
                            }
                            f13 = f16;
                            f14 = f17;
                            i26 = i27;
                            c27643d = c27643d4;
                            interfaceC28601c3 = interfaceC28601c6;
                            context3 = context5;
                            z17 = z25 ? 1 : 0;
                            it4 = it8;
                        } else {
                            c28676v4 = c28676v3;
                        }
                        final int i46 = 0;
                        final Function1 function10 = function6;
                        c28676v5 = c28676v4;
                        obj2 = new Function1() { // from class: o72.g
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i46) {
                                    case 0:
                                        return AbstractC27647h.m83517a0(c27643d3, c2787e4, context4, function10, onAnalyticsEvent, interfaceC28601c6, (AbstractC27535a) obj5);
                                    default:
                                        return AbstractC27647h.m83513X(c27643d3, c2787e4, context4, function10, onAnalyticsEvent, interfaceC28601c6, (AbstractC27535a) obj5);
                                }
                            }
                        };
                        c27643d4 = c27643d3;
                        c2787e3 = c2787e4;
                        context5 = context4;
                        function6 = function10;
                        c28655q2.m87172p0(obj2);
                        Function1 function11 = (Function1) obj2;
                        interfaceC28601c4 = interfaceC28601c2;
                        zM87153g4 = c28655q2.m87153g(interfaceC28601c4);
                        objM87133R7 = c28655q2.m87133R();
                        if (zM87153g4) {
                            objM87133R7 = new C21927e(24, interfaceC28601c4);
                            c28655q2.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C21927e(24, interfaceC28601c4);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        int i47 = i35 << 3;
                        Iterator it9 = it4;
                        interfaceC28601c2 = interfaceC28601c4;
                        c28676v3 = c28676v5;
                        f16 = f15;
                        m83499J(c25210i2, modifierM3394p, function6, c2787eM83508S2, function11, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R7, strM83510U2, c28655q2, (i24 & 896) | (i47 & 458752) | (i47 & 3670016), 0);
                        c28655q2.m87173q(z25);
                        listM73831c3 = c25210i2.m73831c();
                        if (!(listM73831c3 instanceof Collection)) {
                            it7 = listM73831c3.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                        r16 = z25 ? 1 : 0;
                                        break;
                                    }
                                } else {
                                    r16 = 0;
                                    break;
                                }
                            }
                        } else {
                            it7 = listM73831c3.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                        r16 = z25 ? 1 : 0;
                                        break;
                                    }
                                } else {
                                    r16 = 0;
                                    break;
                                }
                            }
                        }
                        if (r16 != 0) {
                            f17 = f14;
                            AbstractC33745d.m106667z(c28655q2, 264300956, c2314t, f17, c28655q2);
                            c28655q2.m87173q(false);
                        } else {
                            f17 = f14;
                            c28655q2.m87150e0(264303388);
                            AbstractC25012a.m73388u(2, f16, c2314t, c28655q2, false);
                        }
                        f13 = f16;
                        f14 = f17;
                        i26 = i27;
                        c27643d = c27643d4;
                        interfaceC28601c3 = interfaceC28601c6;
                        context3 = context5;
                        z17 = z25 ? 1 : 0;
                        it4 = it9;
                    }
                    boolean z27 = z17;
                    AbstractC25012a.m73392y(c28655q2, false, z27, z27);
                    function3 = function6;
                    interfaceC4339a2 = interfaceC4339a4;
                    c13404j2 = c13404j4;
                    c17750h2 = c17750h3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                c0209i3 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N);
                float f110 = 8;
                float f111 = 1 * f110;
                Modifier modifierM91835e2 = AbstractC30007c.m91835e(c2314t, f111, c28655q2, c2314t, 1.0f);
                f13 = f110;
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(navigationTitle), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC35283c.f150167E)), null, null, null, false, null, null, null, null, null, c17750h3, null, null, 28666, null);
                if ((57344 & i35) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z13) {
                    objM87133R3 = new C27207n(onNavigationEvent, 9);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C27207n(onNavigationEvent, 9);
                    c28655q2.m87172p0(objM87133R3);
                }
                i19 = i35 >> 3;
                C2305k c2305k4 = c2305k2;
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                f14 = f111;
                interfaceC28601c2 = interfaceC28601c5;
                c0209i4 = c0209i8;
                AbstractC6719b.m20143d(modifierM91835e2, aVar2, null, (InterfaceC4339a) objM87133R3, null, interfaceC4339a5, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6 | (i19 & 458752), 20);
                c25210i = (C25210i) AbstractC25265s.m74100H0(sections);
                if (c25210i == null) {
                    c28655q2.m87150e0(536394090);
                    c28655q2.m87173q(false);
                    interfaceC28601c3 = interfaceC28601c1;
                    list = list;
                    c2787e3 = c2787e;
                    c0209i4 = c0209i4;
                    c0209i3 = c0209i3;
                    c0209i6 = c0209i2;
                    i24 = i19;
                    c0209i5 = c0209i;
                    i25 = 0;
                    c28676v3 = c28676v0;
                    function6 = function4;
                    context3 = context;
                    z17 = true;
                    c28655q2 = c28655q2;
                } else {
                    c28655q2.m87150e0(536394091);
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, 5 * f13, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3396r3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N5);
                    C2787e c2787eM83508S3 = m83508S(interfaceC28601c1);
                    String strM83510U3 = m83510U(interfaceC28601c2);
                    boolean zM87153g6 = c28655q2.m87153g(c27643d) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(c2787e) | c28655q2.m87157i(context);
                    if ((i35 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z28 = zM87153g6 | z14;
                    if ((i35 & 458752) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z28 | z15;
                    objM87133R4 = c28655q2.m87133R();
                    if (z16) {
                        c28676v1 = c28676v0;
                        if (objM87133R4 == c28676v1) {
                            c2787e2 = c2787e;
                            c0209i5 = c0209i;
                            obj = objM87133R4;
                            c27643d2 = c27643d;
                            c28655q = c28655q2;
                            c28676v2 = c28676v1;
                            context2 = context;
                            function5 = function4;
                        }
                        Function1 function12 = (Function1) obj;
                        zM87153g3 = c28655q.m87153g(interfaceC28601c2);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R5 = new C21927e(23, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C21927e(23, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i312 = i35 << 3;
                        int i313 = (i19 & 896) | (i312 & 458752) | (i312 & 3670016);
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q2 = c28655q;
                        function6 = function5;
                        c28676v3 = c28676v2;
                        c2787e3 = c2787e2;
                        i24 = i19;
                        context3 = context2;
                        c0209i6 = c0209i2;
                        interfaceC28601c2 = interfaceC28601c2;
                        c27643d = c27643d2;
                        m83499J(c25210i, null, function6, c2787eM83508S3, function12, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R5, strM83510U3, c28655q2, i313, 2);
                        z17 = true;
                        c28655q2.m87173q(true);
                        i25 = 0;
                        c28655q2.m87173q(false);
                    } else {
                        c28676v1 = c28676v0;
                    }
                    final int i48 = 1;
                    c28655q = c28655q2;
                    c28676v2 = c28676v1;
                    function5 = function4;
                    c2787e2 = c2787e;
                    c0209i5 = c0209i;
                    obj = new Function1() { // from class: o72.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i48) {
                                case 0:
                                    return AbstractC27647h.m83517a0(c27643d, c2787e2, context, function5, onAnalyticsEvent, interfaceC28601c1, (AbstractC27535a) obj5);
                                default:
                                    return AbstractC27647h.m83513X(c27643d, c2787e2, context, function5, onAnalyticsEvent, interfaceC28601c1, (AbstractC27535a) obj5);
                            }
                        }
                    };
                    context2 = context;
                    c27643d2 = c27643d;
                    c28655q.m87172p0(obj);
                    Function1 function13 = (Function1) obj;
                    zM87153g3 = c28655q.m87153g(interfaceC28601c2);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R5 = new C21927e(23, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C21927e(23, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i314 = i35 << 3;
                    int i315 = (i19 & 896) | (i314 & 458752) | (i314 & 3670016);
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q2 = c28655q;
                    function6 = function5;
                    c28676v3 = c28676v2;
                    c2787e3 = c2787e2;
                    i24 = i19;
                    context3 = context2;
                    c0209i6 = c0209i2;
                    interfaceC28601c2 = interfaceC28601c2;
                    c27643d = c27643d2;
                    m83499J(c25210i, null, function6, c2787eM83508S3, function13, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R5, strM83510U3, c28655q2, i315, 2);
                    z17 = true;
                    c28655q2.m87173q(true);
                    i25 = 0;
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3392n2 = AbstractC1099a.m3392n(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, -70, z17 ? 1 : 0);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k4, c28655q2, i25);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3392n2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N6);
                c28655q2.m87150e0(-2021331611);
                it4 = AbstractC25265s.m74161z0(list, z17 ? 1 : 0).iterator();
                i26 = 0;
                while (it4.hasNext()) {
                    next = it4.next();
                    i27 = i26 + 1;
                    if (i26 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C25210i c25210i3 = (C25210i) next;
                    listM73831c = c25210i3.m73831c();
                    if (!(listM73831c instanceof Collection)) {
                        it5 = listM73831c.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z19 = z17;
                                break;
                            }
                            interfaceC25312u = (InterfaceC25312u) it5.next();
                            if (interfaceC25312u instanceof C16934f) {
                                z18 = z17;
                            } else {
                                z18 = z17;
                            }
                            if (z18) {
                                z19 = false;
                                break;
                            }
                        }
                    } else {
                        it5 = listM73831c.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z19 = z17;
                                break;
                            }
                            interfaceC25312u = (InterfaceC25312u) it5.next();
                            if (interfaceC25312u instanceof C16934f) {
                                z18 = z17;
                            } else {
                                z18 = z17;
                            }
                            if (z18) {
                                z19 = false;
                                break;
                            }
                        }
                    }
                    if (z19) {
                        i28 = 2;
                        f15 = f13;
                        modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * f15, 0.0f, 2);
                    } else {
                        f15 = f13;
                        i28 = 2;
                        modifierM3396r = c2314t;
                    }
                    c2307m = c2307m;
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i7 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                    listM73831c2 = c25210i3.m73831c();
                    if (!(listM73831c2 instanceof Collection)) {
                        it6 = listM73831c2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                if (((InterfaceC25312u) it6.next()) instanceof C26453f) {
                                    z24 = z17;
                                    break;
                                }
                            } else {
                                z24 = false;
                                break;
                            }
                        }
                    } else {
                        it6 = listM73831c2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                if (((InterfaceC25312u) it6.next()) instanceof C26453f) {
                                    z24 = z17;
                                    break;
                                }
                            } else {
                                z24 = false;
                                break;
                            }
                        }
                    }
                    if (z24) {
                        modifierM3394p = AbstractC1099a.m3394p(i28 * f15, c2314t);
                    } else {
                        modifierM3394p = c2314t;
                    }
                    C2787e c2787eM83508S4 = m83508S(interfaceC28601c3);
                    z25 = z17;
                    String strM83510U4 = m83510U(interfaceC28601c2);
                    c27643d3 = c27643d;
                    final InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c3;
                    c2787e4 = c2787e3;
                    context4 = context3;
                    ?? r19 = ((((c28655q2.m87153g(c27643d3) ? 1 : 0) | (c28655q2.m87153g(interfaceC28601c7) ? 1 : 0)) | (c28655q2.m87153g(c2787e4) ? 1 : 0)) == true ? 1 : 0) | (c28655q2.m87157i(context4) ? 1 : 0);
                    i35 = i35;
                    if ((i35 & 7168) == 2048) {
                        r14 = z25 ? 1 : 0;
                    } else {
                        r14 = 0;
                    }
                    ?? r110 = r19 | r14;
                    if ((i35 & 458752) == 131072) {
                        r15 = z25 ? 1 : 0;
                    } else {
                        r15 = 0;
                    }
                    r10 = (r110 == true ? 1 : 0) | r15;
                    objM87133R6 = c28655q2.m87133R();
                    if (r10 == 0) {
                        c28676v6 = c28676v3;
                        if (objM87133R6 == c28676v6) {
                            c28676v4 = c28676v6;
                        } else {
                            c28676v5 = c28676v6;
                            obj2 = objM87133R6;
                            c2787e3 = c2787e4;
                            context5 = context4;
                            c27643d4 = c27643d3;
                        }
                        Function1 function14 = (Function1) obj2;
                        interfaceC28601c4 = interfaceC28601c2;
                        zM87153g4 = c28655q2.m87153g(interfaceC28601c4);
                        objM87133R7 = c28655q2.m87133R();
                        if (zM87153g4) {
                            objM87133R7 = new C21927e(24, interfaceC28601c4);
                            c28655q2.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C21927e(24, interfaceC28601c4);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        int i49 = i35 << 3;
                        Iterator it10 = it4;
                        interfaceC28601c2 = interfaceC28601c4;
                        c28676v3 = c28676v5;
                        f16 = f15;
                        m83499J(c25210i3, modifierM3394p, function6, c2787eM83508S4, function14, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R7, strM83510U4, c28655q2, (i24 & 896) | (i49 & 458752) | (i49 & 3670016), 0);
                        c28655q2.m87173q(z25);
                        listM73831c3 = c25210i3.m73831c();
                        if (!(listM73831c3 instanceof Collection)) {
                            it7 = listM73831c3.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                        r16 = z25 ? 1 : 0;
                                        break;
                                    }
                                } else {
                                    r16 = 0;
                                    break;
                                }
                            }
                        } else {
                            it7 = listM73831c3.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                        r16 = z25 ? 1 : 0;
                                        break;
                                    }
                                } else {
                                    r16 = 0;
                                    break;
                                }
                            }
                        }
                        if (r16 != 0) {
                            f17 = f14;
                            AbstractC33745d.m106667z(c28655q2, 264300956, c2314t, f17, c28655q2);
                            c28655q2.m87173q(false);
                        } else {
                            f17 = f14;
                            c28655q2.m87150e0(264303388);
                            AbstractC25012a.m73388u(2, f16, c2314t, c28655q2, false);
                        }
                        f13 = f16;
                        f14 = f17;
                        i26 = i27;
                        c27643d = c27643d4;
                        interfaceC28601c3 = interfaceC28601c7;
                        context3 = context5;
                        z17 = z25 ? 1 : 0;
                        it4 = it10;
                    } else {
                        c28676v4 = c28676v3;
                    }
                    final int i410 = 0;
                    final Function1 function15 = function6;
                    c28676v5 = c28676v4;
                    obj2 = new Function1() { // from class: o72.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i410) {
                                case 0:
                                    return AbstractC27647h.m83517a0(c27643d3, c2787e4, context4, function15, onAnalyticsEvent, interfaceC28601c7, (AbstractC27535a) obj5);
                                default:
                                    return AbstractC27647h.m83513X(c27643d3, c2787e4, context4, function15, onAnalyticsEvent, interfaceC28601c7, (AbstractC27535a) obj5);
                            }
                        }
                    };
                    c27643d4 = c27643d3;
                    c2787e3 = c2787e4;
                    context5 = context4;
                    function6 = function15;
                    c28655q2.m87172p0(obj2);
                    Function1 function16 = (Function1) obj2;
                    interfaceC28601c4 = interfaceC28601c2;
                    zM87153g4 = c28655q2.m87153g(interfaceC28601c4);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87153g4) {
                        objM87133R7 = new C21927e(24, interfaceC28601c4);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C21927e(24, interfaceC28601c4);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    int i411 = i35 << 3;
                    Iterator it11 = it4;
                    interfaceC28601c2 = interfaceC28601c4;
                    c28676v3 = c28676v5;
                    f16 = f15;
                    m83499J(c25210i3, modifierM3394p, function6, c2787eM83508S4, function16, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R7, strM83510U4, c28655q2, (i24 & 896) | (i411 & 458752) | (i411 & 3670016), 0);
                    c28655q2.m87173q(z25);
                    listM73831c3 = c25210i3.m73831c();
                    if (!(listM73831c3 instanceof Collection)) {
                        it7 = listM73831c3.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                    r16 = z25 ? 1 : 0;
                                    break;
                                }
                            } else {
                                r16 = 0;
                                break;
                            }
                        }
                    } else {
                        it7 = listM73831c3.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                    r16 = z25 ? 1 : 0;
                                    break;
                                }
                            } else {
                                r16 = 0;
                                break;
                            }
                        }
                    }
                    if (r16 != 0) {
                        f17 = f14;
                        AbstractC33745d.m106667z(c28655q2, 264300956, c2314t, f17, c28655q2);
                        c28655q2.m87173q(false);
                    } else {
                        f17 = f14;
                        c28655q2.m87150e0(264303388);
                        AbstractC25012a.m73388u(2, f16, c2314t, c28655q2, false);
                    }
                    f13 = f16;
                    f14 = f17;
                    i26 = i27;
                    c27643d = c27643d4;
                    interfaceC28601c3 = interfaceC28601c7;
                    context3 = context5;
                    z17 = z25 ? 1 : 0;
                    it4 = it11;
                }
                boolean z29 = z17;
                AbstractC25012a.m73392y(c28655q2, false, z29, z29);
                function3 = function6;
                interfaceC4339a2 = interfaceC4339a5;
                c13404j2 = c13404j4;
                c17750h2 = c17750h3;
            } else {
                c28655q2.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                c13404j2 = c13404j;
                function3 = function2;
                c17750h2 = c17750h1;
            }
            c28677v1M87180u = c28655q2.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b((Object) sections, (Object) navigationTitle, (Object) c17750h2, function3, onNavigationEvent, onAnalyticsEvent, (InterfaceC23459e) interfaceC4339a2, (Object) c13404j2, i13, i14, 13);
            }
        }
        i35 |= 3072;
        function2 = function1;
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87157i(onNavigationEvent)) {
                i34 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i34 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i35 |= i34;
        }
        if ((196608 & i13) == 0) {
            if (c28655q2.m87157i(onAnalyticsEvent)) {
                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i29 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i35 |= i29;
        }
        i15 = i14 & 64;
        if (i15 != 0) {
            i35 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q2.m87157i(interfaceC4339a)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i35 |= i16;
        }
        i17 = i14 & 128;
        i18 = 12582912;
        if (i17 == 0) {
            i35 |= i18;
        } else if ((i13 & 12582912) == 0) {
            if ((i13 & 16777216) == 0) {
                zM87157i = c28655q2.m87153g(c13404j);
            } else {
                zM87157i = c28655q2.m87157i(c13404j);
            }
            if (zM87157i) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i35 |= i18;
        }
        if ((i35 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i35 & 1, z4)) {
            if (i36 != 0) {
                c17750h3 = null;
            } else {
                c17750h3 = c17750h1;
            }
            c28676v0 = C28635l.f115821a;
            if (i37 != 0) {
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C27644e(4);
                    c28655q2.m87172p0(objM87133R8);
                }
                function4 = (Function1) objM87133R8;
            } else {
                function4 = function2;
            }
            if (i15 != 0) {
                interfaceC4339a3 = null;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            if (i17 != 0) {
                c13404j3 = null;
            } else {
                c13404j3 = c13404j;
            }
            C27643d c27643d6 = new C27643d();
            List<C25210i> list3 = sections;
            arrayList = new ArrayList();
            it = list3.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((C25210i) it.next()).m73831c());
            }
            arrayList2 = new ArrayList();
            while (r14.hasNext()) {
                if (obj3 instanceof C2787e) {
                    arrayList2.add(obj3);
                }
            }
            c2787e = (C2787e) AbstractC25265s.m74100H0(arrayList2);
            zM87153g = c28655q2.m87153g(c2787e);
            objM87133R = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R = AbstractC28683x.m87272z(c2787e);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(c2787e);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            arrayList3 = new ArrayList();
            it3 = list3.iterator();
            while (it3.hasNext()) {
                AbstractC25265s.m74141p0(arrayList3, ((C25210i) it3.next()).m73831c());
            }
            arrayList4 = new ArrayList();
            while (r14.hasNext()) {
                if (obj4 instanceof C26453f) {
                    arrayList4.add(obj4);
                }
            }
            c26453f = (C26453f) AbstractC25265s.m74100H0(arrayList4);
            zM87153g2 = c28655q2.m87153g(c26453f);
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g2) {
                if (c26453f != null) {
                    strM78342f = "SLEEP";
                } else {
                    strM78342f = "SLEEP";
                }
                objM87133R2 = AbstractC28683x.m87272z(strM78342f);
                c28655q2.m87172p0(objM87133R2);
            } else {
                if (c26453f != null) {
                    strM78342f = "SLEEP";
                } else {
                    strM78342f = "SLEEP";
                }
                objM87133R2 = AbstractC28683x.m87272z(strM78342f);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R2;
            c2314t = C2314t.f9131w;
            Modifier modifierM34108a2 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q2, 1), 14), c13404j3, 0.0f, false, c28655q2, (C13404j.f46947x << 3) | ((i35 >> 18) & 112), 6);
            C13404j c13404j5 = c13404j3;
            C22957g c22957g2 = AbstractC22977m.f90652c;
            c2305k = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q2, 0);
            c27643d = c27643d6;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM34108a2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            list = list3;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
            C0209i c0209i9 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m8);
            c0209i2 = C0217k.f732j;
            if (c28655q2.f115903S) {
                c2305k2 = c2305k;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i3 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N8);
                float f112 = 8;
                float f113 = 1 * f112;
                Modifier modifierM91835e3 = AbstractC30007c.m91835e(c2314t, f113, c28655q2, c2314t, 1.0f);
                f13 = f112;
                AbstractC6721d.a aVar3 = new AbstractC6721d.a(AbstractC8693b.m21278l(navigationTitle), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC35283c.f150167E)), null, null, null, false, null, null, null, null, null, c17750h3, null, null, 28666, null);
                if ((57344 & i35) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z13) {
                    objM87133R3 = new C27207n(onNavigationEvent, 9);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C27207n(onNavigationEvent, 9);
                    c28655q2.m87172p0(objM87133R3);
                }
                i19 = i35 >> 3;
                C2305k c2305k5 = c2305k2;
                InterfaceC4339a interfaceC4339a6 = interfaceC4339a3;
                f14 = f113;
                interfaceC28601c2 = interfaceC28601c8;
                c0209i4 = c0209i9;
                AbstractC6719b.m20143d(modifierM91835e3, aVar3, null, (InterfaceC4339a) objM87133R3, null, interfaceC4339a6, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6 | (i19 & 458752), 20);
                c25210i = (C25210i) AbstractC25265s.m74100H0(sections);
                if (c25210i == null) {
                    c28655q2.m87150e0(536394090);
                    c28655q2.m87173q(false);
                    interfaceC28601c3 = interfaceC28601c1;
                    list = list;
                    c2787e3 = c2787e;
                    c0209i4 = c0209i4;
                    c0209i3 = c0209i3;
                    c0209i6 = c0209i2;
                    i24 = i19;
                    c0209i5 = c0209i;
                    i25 = 0;
                    c28676v3 = c28676v0;
                    function6 = function4;
                    context3 = context;
                    z17 = true;
                    c28655q2 = c28655q2;
                } else {
                    c28655q2.m87150e0(536394091);
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, 5 * f13, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m9);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N9);
                    C2787e c2787eM83508S5 = m83508S(interfaceC28601c1);
                    String strM83510U5 = m83510U(interfaceC28601c2);
                    boolean zM87153g7 = c28655q2.m87153g(c27643d) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(c2787e) | c28655q2.m87157i(context);
                    if ((i35 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z210 = zM87153g7 | z14;
                    if ((i35 & 458752) == 131072) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z210 | z15;
                    objM87133R4 = c28655q2.m87133R();
                    if (z16) {
                        c28676v1 = c28676v0;
                        if (objM87133R4 == c28676v1) {
                            c2787e2 = c2787e;
                            c0209i5 = c0209i;
                            obj = objM87133R4;
                            c27643d2 = c27643d;
                            c28655q = c28655q2;
                            c28676v2 = c28676v1;
                            context2 = context;
                            function5 = function4;
                        }
                        Function1 function17 = (Function1) obj;
                        zM87153g3 = c28655q.m87153g(interfaceC28601c2);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g3) {
                            objM87133R5 = new C21927e(23, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C21927e(23, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R5);
                        }
                        int i316 = i35 << 3;
                        int i317 = (i19 & 896) | (i316 & 458752) | (i316 & 3670016);
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q2 = c28655q;
                        function6 = function5;
                        c28676v3 = c28676v2;
                        c2787e3 = c2787e2;
                        i24 = i19;
                        context3 = context2;
                        c0209i6 = c0209i2;
                        interfaceC28601c2 = interfaceC28601c2;
                        c27643d = c27643d2;
                        m83499J(c25210i, null, function6, c2787eM83508S5, function17, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R5, strM83510U5, c28655q2, i317, 2);
                        z17 = true;
                        c28655q2.m87173q(true);
                        i25 = 0;
                        c28655q2.m87173q(false);
                    } else {
                        c28676v1 = c28676v0;
                    }
                    final int i412 = 1;
                    c28655q = c28655q2;
                    c28676v2 = c28676v1;
                    function5 = function4;
                    c2787e2 = c2787e;
                    c0209i5 = c0209i;
                    obj = new Function1() { // from class: o72.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i412) {
                                case 0:
                                    return AbstractC27647h.m83517a0(c27643d, c2787e2, context, function5, onAnalyticsEvent, interfaceC28601c1, (AbstractC27535a) obj5);
                                default:
                                    return AbstractC27647h.m83513X(c27643d, c2787e2, context, function5, onAnalyticsEvent, interfaceC28601c1, (AbstractC27535a) obj5);
                            }
                        }
                    };
                    context2 = context;
                    c27643d2 = c27643d;
                    c28655q.m87172p0(obj);
                    Function1 function18 = (Function1) obj;
                    zM87153g3 = c28655q.m87153g(interfaceC28601c2);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R5 = new C21927e(23, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C21927e(23, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i318 = i35 << 3;
                    int i319 = (i19 & 896) | (i318 & 458752) | (i318 & 3670016);
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q2 = c28655q;
                    function6 = function5;
                    c28676v3 = c28676v2;
                    c2787e3 = c2787e2;
                    i24 = i19;
                    context3 = context2;
                    c0209i6 = c0209i2;
                    interfaceC28601c2 = interfaceC28601c2;
                    c27643d = c27643d2;
                    m83499J(c25210i, null, function6, c2787eM83508S5, function18, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R5, strM83510U5, c28655q2, i319, 2);
                    z17 = true;
                    c28655q2.m87173q(true);
                    i25 = 0;
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3392n3 = AbstractC1099a.m3392n(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, -70, z17 ? 1 : 0);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k5, c28655q2, i25);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3392n3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m10);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N10);
                c28655q2.m87150e0(-2021331611);
                it4 = AbstractC25265s.m74161z0(list, z17 ? 1 : 0).iterator();
                i26 = 0;
                while (it4.hasNext()) {
                    next = it4.next();
                    i27 = i26 + 1;
                    if (i26 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C25210i c25210i4 = (C25210i) next;
                    listM73831c = c25210i4.m73831c();
                    if (!(listM73831c instanceof Collection)) {
                        it5 = listM73831c.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z19 = z17;
                                break;
                            }
                            interfaceC25312u = (InterfaceC25312u) it5.next();
                            if (interfaceC25312u instanceof C16934f) {
                                z18 = z17;
                            } else {
                                z18 = z17;
                            }
                            if (z18) {
                                z19 = false;
                                break;
                            }
                        }
                    } else {
                        it5 = listM73831c.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z19 = z17;
                                break;
                            }
                            interfaceC25312u = (InterfaceC25312u) it5.next();
                            if (interfaceC25312u instanceof C16934f) {
                                z18 = z17;
                            } else {
                                z18 = z17;
                            }
                            if (z18) {
                                z19 = false;
                                break;
                            }
                        }
                    }
                    if (z19) {
                        i28 = 2;
                        f15 = f13;
                        modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * f15, 0.0f, 2);
                    } else {
                        f15 = f13;
                        i28 = 2;
                        modifierM3396r = c2314t;
                    }
                    c2307m = c2307m;
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i7 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i7);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i7);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11);
                    listM73831c2 = c25210i4.m73831c();
                    if (!(listM73831c2 instanceof Collection)) {
                        it6 = listM73831c2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                if (((InterfaceC25312u) it6.next()) instanceof C26453f) {
                                    z24 = z17;
                                    break;
                                }
                            } else {
                                z24 = false;
                                break;
                            }
                        }
                    } else {
                        it6 = listM73831c2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                if (((InterfaceC25312u) it6.next()) instanceof C26453f) {
                                    z24 = z17;
                                    break;
                                }
                            } else {
                                z24 = false;
                                break;
                            }
                        }
                    }
                    if (z24) {
                        modifierM3394p = AbstractC1099a.m3394p(i28 * f15, c2314t);
                    } else {
                        modifierM3394p = c2314t;
                    }
                    C2787e c2787eM83508S6 = m83508S(interfaceC28601c3);
                    z25 = z17;
                    String strM83510U6 = m83510U(interfaceC28601c2);
                    c27643d3 = c27643d;
                    final InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c3;
                    c2787e4 = c2787e3;
                    context4 = context3;
                    ?? r111 = ((((c28655q2.m87153g(c27643d3) ? 1 : 0) | (c28655q2.m87153g(interfaceC28601c9) ? 1 : 0)) | (c28655q2.m87153g(c2787e4) ? 1 : 0)) == true ? 1 : 0) | (c28655q2.m87157i(context4) ? 1 : 0);
                    i35 = i35;
                    if ((i35 & 7168) == 2048) {
                        r14 = z25 ? 1 : 0;
                    } else {
                        r14 = 0;
                    }
                    ?? r112 = r111 | r14;
                    if ((i35 & 458752) == 131072) {
                        r15 = z25 ? 1 : 0;
                    } else {
                        r15 = 0;
                    }
                    r10 = (r112 == true ? 1 : 0) | r15;
                    objM87133R6 = c28655q2.m87133R();
                    if (r10 == 0) {
                        c28676v6 = c28676v3;
                        if (objM87133R6 == c28676v6) {
                            c28676v4 = c28676v6;
                        } else {
                            c28676v5 = c28676v6;
                            obj2 = objM87133R6;
                            c2787e3 = c2787e4;
                            context5 = context4;
                            c27643d4 = c27643d3;
                        }
                        Function1 function19 = (Function1) obj2;
                        interfaceC28601c4 = interfaceC28601c2;
                        zM87153g4 = c28655q2.m87153g(interfaceC28601c4);
                        objM87133R7 = c28655q2.m87133R();
                        if (zM87153g4) {
                            objM87133R7 = new C21927e(24, interfaceC28601c4);
                            c28655q2.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C21927e(24, interfaceC28601c4);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        int i413 = i35 << 3;
                        Iterator it12 = it4;
                        interfaceC28601c2 = interfaceC28601c4;
                        c28676v3 = c28676v5;
                        f16 = f15;
                        m83499J(c25210i4, modifierM3394p, function6, c2787eM83508S6, function19, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R7, strM83510U6, c28655q2, (i24 & 896) | (i413 & 458752) | (i413 & 3670016), 0);
                        c28655q2.m87173q(z25);
                        listM73831c3 = c25210i4.m73831c();
                        if (!(listM73831c3 instanceof Collection)) {
                            it7 = listM73831c3.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                        r16 = z25 ? 1 : 0;
                                        break;
                                    }
                                } else {
                                    r16 = 0;
                                    break;
                                }
                            }
                        } else {
                            it7 = listM73831c3.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                        r16 = z25 ? 1 : 0;
                                        break;
                                    }
                                } else {
                                    r16 = 0;
                                    break;
                                }
                            }
                        }
                        if (r16 != 0) {
                            f17 = f14;
                            AbstractC33745d.m106667z(c28655q2, 264300956, c2314t, f17, c28655q2);
                            c28655q2.m87173q(false);
                        } else {
                            f17 = f14;
                            c28655q2.m87150e0(264303388);
                            AbstractC25012a.m73388u(2, f16, c2314t, c28655q2, false);
                        }
                        f13 = f16;
                        f14 = f17;
                        i26 = i27;
                        c27643d = c27643d4;
                        interfaceC28601c3 = interfaceC28601c9;
                        context3 = context5;
                        z17 = z25 ? 1 : 0;
                        it4 = it12;
                    } else {
                        c28676v4 = c28676v3;
                    }
                    final int i414 = 0;
                    final Function1 function110 = function6;
                    c28676v5 = c28676v4;
                    obj2 = new Function1() { // from class: o72.g
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i414) {
                                case 0:
                                    return AbstractC27647h.m83517a0(c27643d3, c2787e4, context4, function110, onAnalyticsEvent, interfaceC28601c9, (AbstractC27535a) obj5);
                                default:
                                    return AbstractC27647h.m83513X(c27643d3, c2787e4, context4, function110, onAnalyticsEvent, interfaceC28601c9, (AbstractC27535a) obj5);
                            }
                        }
                    };
                    c27643d4 = c27643d3;
                    c2787e3 = c2787e4;
                    context5 = context4;
                    function6 = function110;
                    c28655q2.m87172p0(obj2);
                    Function1 function111 = (Function1) obj2;
                    interfaceC28601c4 = interfaceC28601c2;
                    zM87153g4 = c28655q2.m87153g(interfaceC28601c4);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87153g4) {
                        objM87133R7 = new C21927e(24, interfaceC28601c4);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C21927e(24, interfaceC28601c4);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    int i415 = i35 << 3;
                    Iterator it13 = it4;
                    interfaceC28601c2 = interfaceC28601c4;
                    c28676v3 = c28676v5;
                    f16 = f15;
                    m83499J(c25210i4, modifierM3394p, function6, c2787eM83508S6, function111, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R7, strM83510U6, c28655q2, (i24 & 896) | (i415 & 458752) | (i415 & 3670016), 0);
                    c28655q2.m87173q(z25);
                    listM73831c3 = c25210i4.m73831c();
                    if (!(listM73831c3 instanceof Collection)) {
                        it7 = listM73831c3.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                    r16 = z25 ? 1 : 0;
                                    break;
                                }
                            } else {
                                r16 = 0;
                                break;
                            }
                        }
                    } else {
                        it7 = listM73831c3.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                    r16 = z25 ? 1 : 0;
                                    break;
                                }
                            } else {
                                r16 = 0;
                                break;
                            }
                        }
                    }
                    if (r16 != 0) {
                        f17 = f14;
                        AbstractC33745d.m106667z(c28655q2, 264300956, c2314t, f17, c28655q2);
                        c28655q2.m87173q(false);
                    } else {
                        f17 = f14;
                        c28655q2.m87150e0(264303388);
                        AbstractC25012a.m73388u(2, f16, c2314t, c28655q2, false);
                    }
                    f13 = f16;
                    f14 = f17;
                    i26 = i27;
                    c27643d = c27643d4;
                    interfaceC28601c3 = interfaceC28601c9;
                    context3 = context5;
                    z17 = z25 ? 1 : 0;
                    it4 = it13;
                }
                boolean z211 = z17;
                AbstractC25012a.m73392y(c28655q2, false, z211, z211);
                function3 = function6;
                interfaceC4339a2 = interfaceC4339a6;
                c13404j2 = c13404j5;
                c17750h2 = c17750h3;
            } else {
                c2305k2 = c2305k;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
            c0209i3 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N8);
            float f114 = 8;
            float f115 = 1 * f114;
            Modifier modifierM91835e4 = AbstractC30007c.m91835e(c2314t, f115, c28655q2, c2314t, 1.0f);
            f13 = f114;
            AbstractC6721d.a aVar4 = new AbstractC6721d.a(AbstractC8693b.m21278l(navigationTitle), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC35283c.f150167E)), null, null, null, false, null, null, null, null, null, c17750h3, null, null, 28666, null);
            if ((57344 & i35) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R3 = c28655q2.m87133R();
            if (z13) {
                objM87133R3 = new C27207n(onNavigationEvent, 9);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C27207n(onNavigationEvent, 9);
                c28655q2.m87172p0(objM87133R3);
            }
            i19 = i35 >> 3;
            C2305k c2305k6 = c2305k2;
            InterfaceC4339a interfaceC4339a7 = interfaceC4339a3;
            f14 = f115;
            interfaceC28601c2 = interfaceC28601c8;
            c0209i4 = c0209i9;
            AbstractC6719b.m20143d(modifierM91835e4, aVar4, null, (InterfaceC4339a) objM87133R3, null, interfaceC4339a7, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6 | (i19 & 458752), 20);
            c25210i = (C25210i) AbstractC25265s.m74100H0(sections);
            if (c25210i == null) {
                c28655q2.m87150e0(536394090);
                c28655q2.m87173q(false);
                interfaceC28601c3 = interfaceC28601c1;
                list = list;
                c2787e3 = c2787e;
                c0209i4 = c0209i4;
                c0209i3 = c0209i3;
                c0209i6 = c0209i2;
                i24 = i19;
                c0209i5 = c0209i;
                i25 = 0;
                c28676v3 = c28676v0;
                function6 = function4;
                context3 = context;
                z17 = true;
                c28655q2 = c28655q2;
            } else {
                c28655q2.m87150e0(536394091);
                Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, 5 * f13, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3396r5);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N12);
                C2787e c2787eM83508S7 = m83508S(interfaceC28601c1);
                String strM83510U7 = m83510U(interfaceC28601c2);
                boolean zM87153g8 = c28655q2.m87153g(c27643d) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(c2787e) | c28655q2.m87157i(context);
                if ((i35 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z212 = zM87153g8 | z14;
                if ((i35 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z212 | z15;
                objM87133R4 = c28655q2.m87133R();
                if (z16) {
                    c28676v1 = c28676v0;
                    if (objM87133R4 == c28676v1) {
                        c2787e2 = c2787e;
                        c0209i5 = c0209i;
                        obj = objM87133R4;
                        c27643d2 = c27643d;
                        c28655q = c28655q2;
                        c28676v2 = c28676v1;
                        context2 = context;
                        function5 = function4;
                    }
                    Function1 function112 = (Function1) obj;
                    zM87153g3 = c28655q.m87153g(interfaceC28601c2);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R5 = new C21927e(23, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C21927e(23, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i3110 = i35 << 3;
                    int i3111 = (i19 & 896) | (i3110 & 458752) | (i3110 & 3670016);
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q2 = c28655q;
                    function6 = function5;
                    c28676v3 = c28676v2;
                    c2787e3 = c2787e2;
                    i24 = i19;
                    context3 = context2;
                    c0209i6 = c0209i2;
                    interfaceC28601c2 = interfaceC28601c2;
                    c27643d = c27643d2;
                    m83499J(c25210i, null, function6, c2787eM83508S7, function112, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R5, strM83510U7, c28655q2, i3111, 2);
                    z17 = true;
                    c28655q2.m87173q(true);
                    i25 = 0;
                    c28655q2.m87173q(false);
                } else {
                    c28676v1 = c28676v0;
                }
                final int i416 = 1;
                c28655q = c28655q2;
                c28676v2 = c28676v1;
                function5 = function4;
                c2787e2 = c2787e;
                c0209i5 = c0209i;
                obj = new Function1() { // from class: o72.g
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i416) {
                            case 0:
                                return AbstractC27647h.m83517a0(c27643d, c2787e2, context, function5, onAnalyticsEvent, interfaceC28601c1, (AbstractC27535a) obj5);
                            default:
                                return AbstractC27647h.m83513X(c27643d, c2787e2, context, function5, onAnalyticsEvent, interfaceC28601c1, (AbstractC27535a) obj5);
                        }
                    }
                };
                context2 = context;
                c27643d2 = c27643d;
                c28655q.m87172p0(obj);
                Function1 function113 = (Function1) obj;
                zM87153g3 = c28655q.m87153g(interfaceC28601c2);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g3) {
                    objM87133R5 = new C21927e(23, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C21927e(23, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                }
                int i3112 = i35 << 3;
                int i3113 = (i19 & 896) | (i3112 & 458752) | (i3112 & 3670016);
                interfaceC28601c3 = interfaceC28601c1;
                c28655q2 = c28655q;
                function6 = function5;
                c28676v3 = c28676v2;
                c2787e3 = c2787e2;
                i24 = i19;
                context3 = context2;
                c0209i6 = c0209i2;
                interfaceC28601c2 = interfaceC28601c2;
                c27643d = c27643d2;
                m83499J(c25210i, null, function6, c2787eM83508S7, function113, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R5, strM83510U7, c28655q2, i3113, 2);
                z17 = true;
                c28655q2.m87173q(true);
                i25 = 0;
                c28655q2.m87173q(false);
            }
            Modifier modifierM3392n4 = AbstractC1099a.m3392n(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, -70, z17 ? 1 : 0);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k6, c28655q2, i25);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3392n4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m13);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i3, modifierM118962N13);
            c28655q2.m87150e0(-2021331611);
            it4 = AbstractC25265s.m74161z0(list, z17 ? 1 : 0).iterator();
            i26 = 0;
            while (it4.hasNext()) {
                next = it4.next();
                i27 = i26 + 1;
                if (i26 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C25210i c25210i5 = (C25210i) next;
                listM73831c = c25210i5.m73831c();
                if (!(listM73831c instanceof Collection)) {
                    it5 = listM73831c.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z19 = z17;
                            break;
                        }
                        interfaceC25312u = (InterfaceC25312u) it5.next();
                        if (interfaceC25312u instanceof C16934f) {
                            z18 = z17;
                        } else {
                            z18 = z17;
                        }
                        if (z18) {
                            z19 = false;
                            break;
                        }
                    }
                } else {
                    it5 = listM73831c.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z19 = z17;
                            break;
                        }
                        interfaceC25312u = (InterfaceC25312u) it5.next();
                        if (interfaceC25312u instanceof C16934f) {
                            z18 = z17;
                        } else {
                            z18 = z17;
                        }
                        if (z18) {
                            z19 = false;
                            break;
                        }
                    }
                }
                if (z19) {
                    i28 = 2;
                    f15 = f13;
                    modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * f15, 0.0f, 2);
                } else {
                    f15 = f13;
                    i28 = 2;
                    modifierM3396r = c2314t;
                }
                c2307m = c2307m;
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i7 = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i7);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i7);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N14);
                listM73831c2 = c25210i5.m73831c();
                if (!(listM73831c2 instanceof Collection)) {
                    it6 = listM73831c2.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (((InterfaceC25312u) it6.next()) instanceof C26453f) {
                                z24 = z17;
                                break;
                            }
                        } else {
                            z24 = false;
                            break;
                        }
                    }
                } else {
                    it6 = listM73831c2.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            if (((InterfaceC25312u) it6.next()) instanceof C26453f) {
                                z24 = z17;
                                break;
                            }
                        } else {
                            z24 = false;
                            break;
                        }
                    }
                }
                if (z24) {
                    modifierM3394p = AbstractC1099a.m3394p(i28 * f15, c2314t);
                } else {
                    modifierM3394p = c2314t;
                }
                C2787e c2787eM83508S8 = m83508S(interfaceC28601c3);
                z25 = z17;
                String strM83510U8 = m83510U(interfaceC28601c2);
                c27643d3 = c27643d;
                final InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c3;
                c2787e4 = c2787e3;
                context4 = context3;
                ?? r113 = ((((c28655q2.m87153g(c27643d3) ? 1 : 0) | (c28655q2.m87153g(interfaceC28601c10) ? 1 : 0)) | (c28655q2.m87153g(c2787e4) ? 1 : 0)) == true ? 1 : 0) | (c28655q2.m87157i(context4) ? 1 : 0);
                i35 = i35;
                if ((i35 & 7168) == 2048) {
                    r14 = z25 ? 1 : 0;
                } else {
                    r14 = 0;
                }
                ?? r114 = r113 | r14;
                if ((i35 & 458752) == 131072) {
                    r15 = z25 ? 1 : 0;
                } else {
                    r15 = 0;
                }
                r10 = (r114 == true ? 1 : 0) | r15;
                objM87133R6 = c28655q2.m87133R();
                if (r10 == 0) {
                    c28676v6 = c28676v3;
                    if (objM87133R6 == c28676v6) {
                        c28676v4 = c28676v6;
                    } else {
                        c28676v5 = c28676v6;
                        obj2 = objM87133R6;
                        c2787e3 = c2787e4;
                        context5 = context4;
                        c27643d4 = c27643d3;
                    }
                    Function1 function114 = (Function1) obj2;
                    interfaceC28601c4 = interfaceC28601c2;
                    zM87153g4 = c28655q2.m87153g(interfaceC28601c4);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87153g4) {
                        objM87133R7 = new C21927e(24, interfaceC28601c4);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C21927e(24, interfaceC28601c4);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    int i417 = i35 << 3;
                    Iterator it14 = it4;
                    interfaceC28601c2 = interfaceC28601c4;
                    c28676v3 = c28676v5;
                    f16 = f15;
                    m83499J(c25210i5, modifierM3394p, function6, c2787eM83508S8, function114, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R7, strM83510U8, c28655q2, (i24 & 896) | (i417 & 458752) | (i417 & 3670016), 0);
                    c28655q2.m87173q(z25);
                    listM73831c3 = c25210i5.m73831c();
                    if (!(listM73831c3 instanceof Collection)) {
                        it7 = listM73831c3.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                    r16 = z25 ? 1 : 0;
                                    break;
                                }
                            } else {
                                r16 = 0;
                                break;
                            }
                        }
                    } else {
                        it7 = listM73831c3.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                    r16 = z25 ? 1 : 0;
                                    break;
                                }
                            } else {
                                r16 = 0;
                                break;
                            }
                        }
                    }
                    if (r16 != 0) {
                        f17 = f14;
                        AbstractC33745d.m106667z(c28655q2, 264300956, c2314t, f17, c28655q2);
                        c28655q2.m87173q(false);
                    } else {
                        f17 = f14;
                        c28655q2.m87150e0(264303388);
                        AbstractC25012a.m73388u(2, f16, c2314t, c28655q2, false);
                    }
                    f13 = f16;
                    f14 = f17;
                    i26 = i27;
                    c27643d = c27643d4;
                    interfaceC28601c3 = interfaceC28601c10;
                    context3 = context5;
                    z17 = z25 ? 1 : 0;
                    it4 = it14;
                } else {
                    c28676v4 = c28676v3;
                }
                final int i418 = 0;
                final Function1 function115 = function6;
                c28676v5 = c28676v4;
                obj2 = new Function1() { // from class: o72.g
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i418) {
                            case 0:
                                return AbstractC27647h.m83517a0(c27643d3, c2787e4, context4, function115, onAnalyticsEvent, interfaceC28601c10, (AbstractC27535a) obj5);
                            default:
                                return AbstractC27647h.m83513X(c27643d3, c2787e4, context4, function115, onAnalyticsEvent, interfaceC28601c10, (AbstractC27535a) obj5);
                        }
                    }
                };
                c27643d4 = c27643d3;
                c2787e3 = c2787e4;
                context5 = context4;
                function6 = function115;
                c28655q2.m87172p0(obj2);
                Function1 function116 = (Function1) obj2;
                interfaceC28601c4 = interfaceC28601c2;
                zM87153g4 = c28655q2.m87153g(interfaceC28601c4);
                objM87133R7 = c28655q2.m87133R();
                if (zM87153g4) {
                    objM87133R7 = new C21927e(24, interfaceC28601c4);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C21927e(24, interfaceC28601c4);
                    c28655q2.m87172p0(objM87133R7);
                }
                int i419 = i35 << 3;
                Iterator it15 = it4;
                interfaceC28601c2 = interfaceC28601c4;
                c28676v3 = c28676v5;
                f16 = f15;
                m83499J(c25210i5, modifierM3394p, function6, c2787eM83508S8, function116, onNavigationEvent, onAnalyticsEvent, (Function1) objM87133R7, strM83510U8, c28655q2, (i24 & 896) | (i419 & 458752) | (i419 & 3670016), 0);
                c28655q2.m87173q(z25);
                listM73831c3 = c25210i5.m73831c();
                if (!(listM73831c3 instanceof Collection)) {
                    it7 = listM73831c3.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                r16 = z25 ? 1 : 0;
                                break;
                            }
                        } else {
                            r16 = 0;
                            break;
                        }
                    }
                } else {
                    it7 = listM73831c3.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            if (((InterfaceC25312u) it7.next()) instanceof C16934f) {
                                r16 = z25 ? 1 : 0;
                                break;
                            }
                        } else {
                            r16 = 0;
                            break;
                        }
                    }
                }
                if (r16 != 0) {
                    f17 = f14;
                    AbstractC33745d.m106667z(c28655q2, 264300956, c2314t, f17, c28655q2);
                    c28655q2.m87173q(false);
                } else {
                    f17 = f14;
                    c28655q2.m87150e0(264303388);
                    AbstractC25012a.m73388u(2, f16, c2314t, c28655q2, false);
                }
                f13 = f16;
                f14 = f17;
                i26 = i27;
                c27643d = c27643d4;
                interfaceC28601c3 = interfaceC28601c10;
                context3 = context5;
                z17 = z25 ? 1 : 0;
                it4 = it15;
            }
            boolean z213 = z17;
            AbstractC25012a.m73392y(c28655q2, false, z213, z213);
            function3 = function6;
            interfaceC4339a2 = interfaceC4339a7;
            c13404j2 = c13404j5;
            c17750h2 = c17750h3;
        } else {
            c28655q2.m87138X();
            interfaceC4339a2 = interfaceC4339a;
            c13404j2 = c13404j;
            function3 = function2;
            c17750h2 = c17750h1;
        }
        c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b((Object) sections, (Object) navigationTitle, (Object) c17750h2, function3, onNavigationEvent, onAnalyticsEvent, (InterfaceC23459e) interfaceC4339a2, (Object) c13404j2, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m83506Q(AbstractC25206e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m83507R(List list, String str, C17750h1 c17750h1, Function1 function1, Function1 function2, Function1 function3, InterfaceC4339a interfaceC4339a, C13404j c13404j, int i13, int i14, Composer composer, int i15) {
        m83505P(list, str, c17750h1, function1, function2, function3, interfaceC4339a, c13404j, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private static final C2787e m83508S(InterfaceC28601c1 interfaceC28601c1) {
        return (C2787e) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: T */
    private static final void m83509T(InterfaceC28601c1 interfaceC28601c1, C2787e c2787e) {
        interfaceC28601c1.setValue(c2787e);
    }

    /* JADX INFO: renamed from: U */
    private static final String m83510U(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: V */
    private static final void m83511V(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m83512W(Function1 function1) {
        function1.invoke(AbstractC14227b.b.f51971a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m83513X(C27643d c27643d, C2787e c2787e, Context context, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, AbstractC27535a action) {
        AbstractC22676k.m65750j(action, "action");
        c27643d.m83466a(action, m83508S(interfaceC28601c1), c2787e, context, new C21927e(25, interfaceC28601c1), function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m83514Y(InterfaceC28601c1 interfaceC28601c1, C2787e c2787e) {
        m83509T(interfaceC28601c1, c2787e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m83515Z(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m83511V(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m83517a0(C27643d c27643d, C2787e c2787e, Context context, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, AbstractC27535a action) {
        AbstractC22676k.m65750j(action, "action");
        c27643d.m83466a(action, m83508S(interfaceC28601c1), c2787e, context, new C21927e(26, interfaceC28601c1), function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m83519b0(InterfaceC28601c1 interfaceC28601c1, C2787e c2787e) {
        m83509T(interfaceC28601c1, c2787e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m83521c0(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m83511V(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e0 */
    private static final void m83525e0(ArticleTileModelEvent.Url url, Function1 function1, Function1 function2) {
        function2.invoke(new AbstractC0524a.a(url.getIndex(), url.getId()));
        function1.invoke(new AbstractC14227b.a(url));
    }

    /* JADX INFO: renamed from: f0 */
    private static final void m83527f0(AbstractC26452e.a aVar, Function1 function1, Function1 function2, String str) {
        C9598e c9598eM91240a;
        Object objM78336a = aVar.getAny();
        if (objM78336a instanceof AbstractC29791a.a) {
            Object objM78336a2 = aVar.getAny();
            AbstractC29791a.a aVar2 = objM78336a2 instanceof AbstractC29791a.a ? (AbstractC29791a.a) objM78336a2 : null;
            if (aVar2 == null || (c9598eM91240a = aVar2.getNavigationAction()) == null) {
                return;
            }
            function2.invoke(AbstractC0524a.l.f1803a);
            function1.invoke(new AbstractC14227b.c(c9598eM91240a));
            return;
        }
        if (objM78336a instanceof AbstractC29791a.b) {
            Object objM78336a3 = aVar.getAny();
            AbstractC29791a.b bVar = objM78336a3 instanceof AbstractC29791a.b ? (AbstractC29791a.b) objM78336a3 : null;
            if (bVar != null) {
                function2.invoke(new AbstractC0524a.m(str, bVar.getIndex()));
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    private static final void m83529g0(AbstractC26452e.b bVar, Function1 function1, Function1 function2) {
        function1.invoke(bVar.getTag());
        function2.invoke(new AbstractC0524a.n(bVar.getTag()));
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m83531h0(Function1 onViewEvent, Function1 onNavigationEvent, Function1 onAnalyticsEvent, Object event, Function1 updateLatestSelectedTag, String latestSelectedTag) {
        String strM12480a;
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(updateLatestSelectedTag, "updateLatestSelectedTag");
        AbstractC22676k.m65750j(latestSelectedTag, "latestSelectedTag");
        if (event instanceof AbstractC26452e.b) {
            m83529g0((AbstractC26452e.b) event, updateLatestSelectedTag, onAnalyticsEvent);
            return;
        }
        if (event instanceof AbstractC26452e.a) {
            m83527f0((AbstractC26452e.a) event, onNavigationEvent, onAnalyticsEvent, latestSelectedTag);
            return;
        }
        if (event instanceof ArticleTileModelEvent.Url) {
            m83525e0((ArticleTileModelEvent.Url) event, onNavigationEvent, onAnalyticsEvent);
            return;
        }
        if (event instanceof C32048d) {
            C9598e c9598eM99591c = ((C32048d) event).getDestination();
            if (c9598eM99591c != null) {
                onNavigationEvent.invoke(new AbstractC14227b.c(c9598eM99591c));
                return;
            }
            return;
        }
        if (event instanceof C9598e) {
            C9598e c9598e = (C9598e) event;
            if (c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9277b5) {
                onAnalyticsEvent.invoke(AbstractC0524a.f.f1793a);
            }
            onNavigationEvent.invoke(new AbstractC14227b.c(c9598e));
            return;
        }
        if (!(event instanceof C4071m2) || (strM12480a = ((C4071m2) event).getComponentId()) == null) {
            return;
        }
        onViewEvent.invoke(new AbstractC25206e.b(strM12480a));
    }

    /* JADX INFO: renamed from: w */
    public static final void m83546w(C17749h0 item, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-340241145);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(item) : c28655q2.m87157i(item) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q = c28655q2;
            AbstractC25303l.m74291r(C17749h0.m50892b(item, null, null, null, null, 130, null, false, 111, null), AbstractC30018a.m91893b(), new C26970r0(8), null, c28655q, C17749h0.f69004h | (C25307p.f99300b << 3), 8);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(item, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Modifier m83547x(C17749h0 it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(994324696);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC37056f.m118994r(C2314t.f9131w, AbstractC33253j.m105489e(3 * 4)));
        c28655q.m87173q(false);
        return modifierM3409f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m83548y(C17749h0 c17749h0, int i13, Composer composer, int i14) {
        m83546w(c17749h0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0194  */
    /* JADX WARN: Code duplicated, block: B:102:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0142  */
    /* JADX WARN: Code duplicated, block: B:89:0x015c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0178  */
    /* JADX WARN: Code duplicated, block: B:96:0x018a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0192 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: z */
    public static final void m83549z(AbstractC25208g.c viewState, Function1 function1, Function1 onNavigationEvent, Function1 onAnalyticsEvent, String str, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        String str2;
        int i17;
        boolean z4;
        Function1 function3;
        String str3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        String str4;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        InterfaceC2994c0 interfaceC2994c0;
        C15199y3 c15199y3M3460c;
        boolean zM87157i;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R5;
        boolean zM87157i2;
        Object objM87133R6;
        boolean z16;
        Object objM87133R7;
        Object objM87133R8;
        int i18;
        int i19;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1203967768);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(onNavigationEvent)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i15 |= i19;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onAnalyticsEvent)) {
                    i18 = 2048;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i18;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i17 = 16384;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C27644e(3);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function3 = (Function1) objM87133R8;
                    } else {
                        function3 = function2;
                    }
                    if (i16 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zM87157i3 = z13 | c28655q.m87157i(viewState);
                    if ((57344 & i15) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i3 | z14;
                    objM87133R = c28655q.m87133R();
                    if (z15 || objM87133R == c28676v0) {
                        objM87133R = new a(onAnalyticsEvent, viewState, str4, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, null);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                    Boolean boolValueOf = Boolean.valueOf(m83492C(interfaceC28601c1));
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
                    objM87133R4 = c28655q.m87133R();
                    if (!zM87157i || objM87133R4 == c28676v0) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R4 = new b(interfaceC2994c0, interfaceC28601c2, c15199y3M3460c, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf);
                    C25205d c25205dM73826i = viewState.getSageBottomSheetState();
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C27325i(1, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R5;
                    zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C3196h(interfaceC2994c0, c15199y3M3460c, 18);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                    z16 = (i15 & 896) == 256;
                    objM87133R7 = c28655q.m87133R();
                    if (z16 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C26957l(onNavigationEvent, 17);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC28959b.m87962e(c25205dM73826i, c15199y3M3460c, interfaceC4339a, interfaceC4339a2, (Function1) objM87133R7, AbstractC37817c.m121344e(-1946689104, c28655q, new C0556g((Object) viewState, function3, (Object) onNavigationEvent, (Object) onAnalyticsEvent, (Object) interfaceC28601c2, 10)), c28655q, C17750h1.f69012w | C9598e.f28134d | 197056, 0);
                    c28655q = c28655q;
                    str3 = str4;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    str3 = str2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e((AbstractC25208g) viewState, function3, onNavigationEvent, onAnalyticsEvent, str3, i13, i14, 13);
                }
            }
            i15 |= 24576;
            str2 = str;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C27644e(3);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function3 = (Function1) objM87133R8;
                } else {
                    function3 = function2;
                }
                if (i16 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87157i4 = z13 | c28655q.m87157i(viewState);
                if ((57344 & i15) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i4 | z14;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new a(onAnalyticsEvent, viewState, str4, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(onAnalyticsEvent, viewState, str4, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, null);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                Boolean boolValueOf2 = Boolean.valueOf(m83492C(interfaceC28601c1));
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R4 = new b(interfaceC2994c0, interfaceC28601c2, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R4 = new b(interfaceC2994c0, interfaceC28601c2, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf2);
                C25205d c25205dM73826i2 = viewState.getSageBottomSheetState();
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C27325i(1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R6 = new C3196h(interfaceC2994c0, c15199y3M3460c, 18);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C3196h(interfaceC2994c0, c15199y3M3460c, 18);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                if ((i15 & 896) == 256) {
                }
                objM87133R7 = c28655q.m87133R();
                if (z16) {
                    objM87133R7 = new C26957l(onNavigationEvent, 17);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C26957l(onNavigationEvent, 17);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC28959b.m87962e(c25205dM73826i2, c15199y3M3460c, interfaceC4339a3, interfaceC4339a4, (Function1) objM87133R7, AbstractC37817c.m121344e(-1946689104, c28655q, new C0556g((Object) viewState, function3, (Object) onNavigationEvent, (Object) onAnalyticsEvent, (Object) interfaceC28601c2, 10)), c28655q, C17750h1.f69012w | C9598e.f28134d | 197056, 0);
                c28655q = c28655q;
                str3 = str4;
            } else {
                c28655q.m87138X();
                function3 = function2;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e((AbstractC25208g) viewState, function3, onNavigationEvent, onAnalyticsEvent, str3, i13, i14, 13);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(onNavigationEvent)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i15 |= i19;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onAnalyticsEvent)) {
                i18 = 2048;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i18;
        }
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                str2 = str;
                if (c28655q.m87153g(str2)) {
                    i17 = 16384;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C27644e(3);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function3 = (Function1) objM87133R8;
                } else {
                    function3 = function2;
                }
                if (i16 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if ((i15 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87157i5 = z13 | c28655q.m87157i(viewState);
                if ((57344 & i15) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i5 | z14;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new a(onAnalyticsEvent, viewState, str4, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(onAnalyticsEvent, viewState, str4, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, null);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                Boolean boolValueOf3 = Boolean.valueOf(m83492C(interfaceC28601c1));
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R4 = new b(interfaceC2994c0, interfaceC28601c2, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R4 = new b(interfaceC2994c0, interfaceC28601c2, c15199y3M3460c, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf3);
                C25205d c25205dM73826i3 = viewState.getSageBottomSheetState();
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C27325i(1, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R5;
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R6 = new C3196h(interfaceC2994c0, c15199y3M3460c, 18);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C3196h(interfaceC2994c0, c15199y3M3460c, 18);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R6;
                if ((i15 & 896) == 256) {
                }
                objM87133R7 = c28655q.m87133R();
                if (z16) {
                    objM87133R7 = new C26957l(onNavigationEvent, 17);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C26957l(onNavigationEvent, 17);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC28959b.m87962e(c25205dM73826i3, c15199y3M3460c, interfaceC4339a5, interfaceC4339a6, (Function1) objM87133R7, AbstractC37817c.m121344e(-1946689104, c28655q, new C0556g((Object) viewState, function3, (Object) onNavigationEvent, (Object) onAnalyticsEvent, (Object) interfaceC28601c2, 10)), c28655q, C17750h1.f69012w | C9598e.f28134d | 197056, 0);
                c28655q = c28655q;
                str3 = str4;
            } else {
                c28655q.m87138X();
                function3 = function2;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e((AbstractC25208g) viewState, function3, onNavigationEvent, onAnalyticsEvent, str3, i13, i14, 13);
            }
        }
        i15 |= 24576;
        str2 = str;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C27644e(3);
                    c28655q.m87172p0(objM87133R8);
                }
                function3 = (Function1) objM87133R8;
            } else {
                function3 = function2;
            }
            if (i16 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if ((i15 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zM87157i6 = z13 | c28655q.m87157i(viewState);
            if ((57344 & i15) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i6 | z14;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new a(onAnalyticsEvent, viewState, str4, null);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new a(onAnalyticsEvent, viewState, str4, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, null);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R3;
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
            Boolean boolValueOf4 = Boolean.valueOf(m83492C(interfaceC28601c1));
            zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R4 = new b(interfaceC2994c0, interfaceC28601c2, c15199y3M3460c, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R4 = new b(interfaceC2994c0, interfaceC28601c2, c15199y3M3460c, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, boolValueOf4);
            C25205d c25205dM73826i4 = viewState.getSageBottomSheetState();
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C27325i(1, interfaceC28601c2);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
            zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
            objM87133R6 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R6 = new C3196h(interfaceC2994c0, c15199y3M3460c, 18);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C3196h(interfaceC2994c0, c15199y3M3460c, 18);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R6;
            if ((i15 & 896) == 256) {
            }
            objM87133R7 = c28655q.m87133R();
            if (z16) {
                objM87133R7 = new C26957l(onNavigationEvent, 17);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C26957l(onNavigationEvent, 17);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC28959b.m87962e(c25205dM73826i4, c15199y3M3460c, interfaceC4339a7, interfaceC4339a8, (Function1) objM87133R7, AbstractC37817c.m121344e(-1946689104, c28655q, new C0556g((Object) viewState, function3, (Object) onNavigationEvent, (Object) onAnalyticsEvent, (Object) interfaceC28601c2, 10)), c28655q, C17750h1.f69012w | C9598e.f28134d | 197056, 0);
            c28655q = c28655q;
            str3 = str4;
        } else {
            c28655q.m87138X();
            function3 = function2;
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e((AbstractC25208g) viewState, function3, onNavigationEvent, onAnalyticsEvent, str3, i13, i14, 13);
        }
    }
}
