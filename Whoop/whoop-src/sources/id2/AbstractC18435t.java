package id2;

import a31.C0341c;
import ad2.AbstractC0752a;
import am2.C1042s;
import android.content.Context;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import aq1.C1909c;
import ar2.C1935f;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bd2.C3108a;
import c31.AbstractC3924h;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd2.AbstractC4446a;
import cd2.C4447b;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.share.model.ShareBackground;
import com.whoop.share.model.StyleType;
import d30.C11558r;
import d71.C11757c;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc0.C14359c;
import fd2.EnumC14407e;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import hb3.AbstractC17104a0;
import hd2.AbstractC17200b;
import hd2.C17199a;
import hd2.C17201c;
import hd2.C17202d;
import hy0.AbstractC17755i2;
import hy0.C17737e0;
import hy0.C17794v;
import ib0.C18332c;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jd2.C21614c;
import jf3.C21647a;
import kd1.C22401m;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p163g1.AbstractC15170v4;
import p208i2.AbstractC17918w0;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p409q0.AbstractC29677c0;
import p409q0.AbstractC29701y;
import p409q0.C29674b;
import p409q0.InterfaceC29694r;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p698au1.C2059d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25312u;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: id2.t */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000´\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a[\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010 \u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0003¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0003¢\u0006\u0004\b+\u0010,\u001a\u000f\u0010-\u001a\u00020\u0004H\u0003¢\u0006\u0004\b-\u0010.\u001a'\u00101\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u00100\u001a\u00020/H\u0003¢\u0006\u0004\b1\u00102\u001av\u0010;\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u00162\u0006\u00108\u001a\u0002072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010:\u001a\u0002092\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0010H\u0080@¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010>\u001a\u00020\u001e*\u00020=H\u0000¢\u0006\u0004\b>\u0010?\"\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\"\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F\"\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\"\u0014\u0010M\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010J\"\u0014\u0010O\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010J¨\u0006T²\u0006\f\u0010Q\u001a\u00020P8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010S\u001a\u00020R8\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "path", "source", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "R", "(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lhd2/d;", "viewState", "onRetry", "Lbd2/a;", "shareActionsHelper", "Lkotlin/Function1;", "Lcd2/a;", "onShareEvent", "Lkotlin/Function2;", "", "Lfd2/e;", "onShareRender", "E", "(Lhd2/d;Lc93/a;Lbd2/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "Lhd2/d$b;", "asset", "", "backgroundEnabled", "Lid2/j;", "snapshotCapture", "O", "(Lhd2/d$b;ZLid2/j;Landroidx/compose/runtime/Composer;I)V", "Lid2/c;", "config", "z", "(Lhd2/d$b;ZLid2/c;Landroidx/compose/runtime/Composer;I)V", "x", "(Lhd2/d$b;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/share/model/ShareBackground;", "background", "v", "(Lcom/whoop/share/model/ShareBackground;Landroidx/compose/runtime/Composer;I)V", "", "pageCount", "currentPage", "t", "(IILandroidx/compose/runtime/Composer;I)V", "M", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "B", "(Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lid2/d;", NotificationCompat.CATEGORY_EVENT, "capture", "currentAsset", "Lhd2/d$a;", "screenContent", "Landroid/content/Context;", "context", "e0", "(Lid2/d;Lid2/j;Lhd2/d$b;Lhd2/d$a;ZLandroid/content/Context;Lbd2/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/share/model/StyleType;", "g0", "(Lcom/whoop/share/model/StyleType;)Lid2/c;", "Ltr2/n;", "a", "Ltr2/n;", "shareSheetLogger", "Lm91/p;", "b", "Lm91/p;", "shareItemViewFactory", "Ly3/f;", "c", "F", "DefaultShareCardWidth", "d", "DefaultShareCardHeight", "e", "DefaultShareCardCornerRadius", "Lhd2/c;", "viewModel", "Lcd2/b;", "shareAnalyticsHelper", "share_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18435t {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f71706a = InterfaceC34116n.INSTANCE.m107848a("WhoopShareSheet");

    /* JADX INFO: renamed from: b */
    private static final C25307p f71707b = Function1.m74306g(new C18332c(12));

    /* JADX INFO: renamed from: c */
    private static final float f71708c;

    /* JADX INFO: renamed from: d */
    private static final float f71709d;

    /* JADX INFO: renamed from: e */
    private static final float f71710e;

    /* JADX INFO: renamed from: id2.t$a */
    @InterfaceC32271e(m100429c = "com.whoop.share.view.WhoopShareSheetKt$ShareSheetInnerContent$1$1", m100430f = "WhoopShareSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71711w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f71712x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C17202d.a f71713y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f71714z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p715kotlin.jvm.functions.Function1 function1, C17202d.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71712x = function1;
            this.f71713y = aVar;
            this.f71714z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f71712x, this.f71713y, this.f71714z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f71711w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f71712x.invoke(new AbstractC4446a.f(this.f71713y.m48583a(), AbstractC18435t.m53081F(this.f71714z)));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: id2.t$b */
    @InterfaceC32271e(m100429c = "com.whoop.share.view.WhoopShareSheetKt$ShareSheetInnerContent$2$1$3$1$1", m100430f = "WhoopShareSheet.kt", m100431l = {249}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C17202d.a f71715E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Context f71716F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C3108a f71717G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f71718H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC4351m f71719I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC28601c1 f71720J;

        /* JADX INFO: renamed from: w */
        int f71721w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC18419d f71722x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C18425j f71723y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C17202d.b f71724z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC18419d abstractC18419d, C18425j c18425j, C17202d.b bVar, C17202d.a aVar, Context context, C3108a c3108a, p715kotlin.jvm.functions.Function1 function1, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71722x = abstractC18419d;
            this.f71723y = c18425j;
            this.f71724z = bVar;
            this.f71715E = aVar;
            this.f71716F = context;
            this.f71717G = c3108a;
            this.f71718H = function1;
            this.f71719I = interfaceC4351m;
            this.f71720J = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f71722x, this.f71723y, this.f71724z, this.f71715E, this.f71716F, this.f71717G, this.f71718H, this.f71719I, this.f71720J, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71721w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC18419d abstractC18419d = this.f71722x;
                C18425j c18425j = this.f71723y;
                C17202d.b bVar = this.f71724z;
                C17202d.a aVar = this.f71715E;
                boolean zM53081F = AbstractC18435t.m53081F(this.f71720J);
                Context context = this.f71716F;
                C3108a c3108a = this.f71717G;
                p715kotlin.jvm.functions.Function1 function1 = this.f71718H;
                InterfaceC4351m interfaceC4351m = this.f71719I;
                this.f71721w = 1;
                if (AbstractC18435t.m53111e0(abstractC18419d, c18425j, bVar, aVar, zM53081F, context, c3108a, function1, interfaceC4351m, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: id2.t$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f71725a;

        static {
            int[] iArr = new int[StyleType.values().length];
            try {
                iArr[StyleType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71725a = iArr;
        }
    }

    /* JADX INFO: renamed from: id2.t$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f71726w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f71727x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f71728y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f71726w = c38266c;
            this.f71727x = interfaceC35951a;
            this.f71728y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [bd2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3108a invoke() {
            return this.f71726w.m122602a(this.f71728y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3108a.class), this.f71727x);
        }
    }

    /* JADX INFO: renamed from: id2.t$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f71729w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f71730x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f71731y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f71729w = c38266c;
            this.f71730x = interfaceC35951a;
            this.f71731y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [cd2.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C4447b invoke() {
            return this.f71729w.m122602a(this.f71731y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4447b.class), this.f71730x);
        }
    }

    /* JADX INFO: renamed from: id2.t$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f71732w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f71733x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f71734y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f71735z;

        /* JADX INFO: renamed from: id2.t$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f71736w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f71736w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f71736w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f71732w = c38266c;
            this.f71733x = interfaceC35951a;
            this.f71734y = interfaceC4339a;
            this.f71735z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, hd2.c] */
        @Override // c93.InterfaceC4339a
        public final C17201c invoke() {
            return AbstractC21598x.m60668X(this.f71732w, this.f71733x, new a(this.f71735z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17201c.class), null, this.f71734y);
        }
    }

    /* JADX INFO: renamed from: id2.t$g */
    @InterfaceC32271e(m100429c = "com.whoop.share.view.WhoopShareSheetKt$WhoopShareSheetContent$1$1", m100430f = "WhoopShareSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71737w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f71738x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f71739y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f71740z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71738x = str;
            this.f71739y = str2;
            this.f71740z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f71738x, this.f71739y, this.f71740z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f71737w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC18435t.m53094S(this.f71740z).m48578o(new AbstractC17200b.a(this.f71738x, this.f71739y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: id2.t$h */
    @InterfaceC32271e(m100429c = "com.whoop.share.view.WhoopShareSheetKt$WhoopShareSheetContent$2$1", m100430f = "WhoopShareSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71741w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f71742x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71742x = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f71742x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f71741w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C17202d.a aVarM48580c = AbstractC18435t.m53097V(this.f71742x).getScreenContent();
            if (aVarM48580c != null) {
                InterfaceC34116n interfaceC34116n = AbstractC18435t.f71706a;
                String orDefault = aVarM48580c.m48583a().getOrDefault("category", "unknown");
                String orDefault2 = aVarM48580c.m48583a().getOrDefault("source", "unknown");
                interfaceC34116n.mo85216g("Share sheet opened: category=" + ((Object) orDefault) + ", source=" + ((Object) orDefault2) + ", item_count=" + aVarM48580c.m48584b().size(), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: id2.t$i */
    @InterfaceC32271e(m100429c = "com.whoop.share.view.WhoopShareSheetKt", m100430f = "WhoopShareSheet.kt", m100431l = {411, 431, 435, 439, 443}, m100432m = "executeShareAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f71743E;

        /* JADX INFO: renamed from: F */
        Object f71744F;

        /* JADX INFO: renamed from: G */
        Object f71745G;

        /* JADX INFO: renamed from: H */
        Object f71746H;

        /* JADX INFO: renamed from: I */
        Object f71747I;

        /* JADX INFO: renamed from: J */
        Object f71748J;

        /* JADX INFO: renamed from: K */
        boolean f71749K;

        /* JADX INFO: renamed from: L */
        long f71750L;

        /* JADX INFO: renamed from: M */
        long f71751M;

        /* JADX INFO: renamed from: N */
        /* synthetic */ Object f71752N;

        /* JADX INFO: renamed from: O */
        int f71753O;

        /* JADX INFO: renamed from: w */
        Object f71754w;

        /* JADX INFO: renamed from: x */
        Object f71755x;

        /* JADX INFO: renamed from: y */
        Object f71756y;

        /* JADX INFO: renamed from: z */
        Object f71757z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f71752N = obj;
            this.f71753O |= Integer.MIN_VALUE;
            return AbstractC18435t.m53111e0(null, null, null, null, false, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: id2.t$j */
    @InterfaceC32271e(m100429c = "com.whoop.share.view.WhoopShareSheetKt$executeShareAction$loaded$1", m100430f = "WhoopShareSheet.kt", m100431l = {414}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71758w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22401m f71759x;

        /* JADX INFO: renamed from: id2.t$j$a */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f71760w;

            /* JADX INFO: renamed from: id2.t$j$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41740a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f71761w;

                /* JADX INFO: renamed from: id2.t$j$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.share.view.WhoopShareSheetKt$executeShareAction$loaded$1$invokeSuspend$$inlined$filter$1$2", m100430f = "WhoopShareSheet.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41741a extends AbstractC32269c {

                    /* JADX INFO: renamed from: F */
                    Object f71763F;

                    /* JADX INFO: renamed from: G */
                    Object f71764G;

                    /* JADX INFO: renamed from: H */
                    int f71765H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f71766w;

                    /* JADX INFO: renamed from: x */
                    int f71767x;

                    /* JADX INFO: renamed from: y */
                    Object f71768y;

                    /* JADX INFO: renamed from: z */
                    Object f71769z;

                    public C41741a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f71766w = obj;
                        this.f71767x |= Integer.MIN_VALUE;
                        return C41740a.this.emit(null, this);
                    }
                }

                public C41740a(InterfaceC13062m interfaceC13062m) {
                    this.f71761w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41741a c41741a;
                    if (interfaceC30057d instanceof C41741a) {
                        c41741a = (C41741a) interfaceC30057d;
                        int i13 = c41741a.f71767x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41741a.f71767x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41741a = new C41741a(interfaceC30057d);
                        }
                    } else {
                        c41741a = new C41741a(interfaceC30057d);
                    }
                    Object obj2 = c41741a.f71766w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41741a.f71767x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f71761w;
                        if (((Boolean) obj).booleanValue()) {
                            c41741a.f71768y = null;
                            c41741a.f71769z = null;
                            c41741a.f71763F = null;
                            c41741a.f71764G = null;
                            c41741a.f71765H = 0;
                            c41741a.f71767x = 1;
                            if (interfaceC13062m.emit(obj, c41741a) == enumC31071a) {
                                return enumC31071a;
                            }
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

            public a(InterfaceC13058l interfaceC13058l) {
                this.f71760w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f71760w.collect(new C41740a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C22401m c22401m, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71759x = c22401m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m53136h(C22401m c22401m) {
            return c22401m.m64479a();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f71759x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71758w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            a aVar = new a(AbstractC28683x.m87240H(new C18436u(this.f71759x, 0)));
            this.f71758w = 1;
            Object objM36575A = AbstractC13091v.m36575A(aVar, this);
            return objM36575A == enumC31071a ? enumC31071a : objM36575A;
        }
    }

    static {
        float f13 = 4;
        f71708c = 71 * f13;
        f71709d = 100 * f13;
        f71710e = 6 * f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m53076A(C17202d.b bVar, boolean z4, C18418c c18418c, int i13, Composer composer, int i14) {
        m53134z(bVar, z4, c18418c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m53077B(InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1945377129);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(interfaceC4339a) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC0752a.f2743f);
            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC0752a.f2744g);
            boolean z4 = (i15 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C18433r(interfaceC4339a, 0);
                c28655q.m87172p0(objM87133R);
            }
            int i17 = TextResource.C8688b.f25889c;
            AbstractC3924h.m11918d(c8688bM21277k, c8688bM21277k2, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q, (i17 << 3) | i17, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2059d(interfaceC4339a, modifier2, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m53078C(InterfaceC4339a interfaceC4339a, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        if (it == EnumC3919c.ERROR_MESSAGE) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m53079D(InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m53077B(interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x025d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:106:0x0309  */
    /* JADX WARN: Code duplicated, block: B:108:0x0351  */
    /* JADX WARN: Code duplicated, block: B:109:0x036a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0389  */
    /* JADX WARN: Code duplicated, block: B:114:0x038c  */
    /* JADX WARN: Code duplicated, block: B:120:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:123:0x0435  */
    /* JADX WARN: Code duplicated, block: B:124:0x0437  */
    /* JADX WARN: Code duplicated, block: B:127:0x0440  */
    /* JADX WARN: Code duplicated, block: B:128:0x0442  */
    /* JADX WARN: Code duplicated, block: B:134:0x0450  */
    /* JADX WARN: Code duplicated, block: B:137:0x047d  */
    /* JADX WARN: Code duplicated, block: B:138:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x023e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0242  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E */
    public static final void m53080E(C17202d viewState, InterfaceC4339a onRetry, C3108a shareActionsHelper, p715kotlin.jvm.functions.Function1 onShareEvent, InterfaceC4351m onShareRender, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C17202d.a aVar;
        float f13;
        int iHashCode;
        C38072d c38072d;
        int i15;
        float f14;
        C17202d.a aVar2;
        C29674b c29674b;
        C28655q c28655q2;
        C28655q c28655q3;
        boolean z4;
        boolean z13;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object obj;
        int i16;
        C29674b c29674b2;
        C28655q c28655q4;
        int i17;
        Object obj2;
        Object obj3;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        ?? r15;
        float f15;
        C28655q c28655q5;
        Float fValueOf = Float.valueOf(1.0f);
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onRetry, "onRetry");
        AbstractC22676k.m65750j(shareActionsHelper, "shareActionsHelper");
        AbstractC22676k.m65750j(onShareEvent, "onShareEvent");
        AbstractC22676k.m65750j(onShareRender, "onShareRender");
        C28655q c28655q6 = (C28655q) composer;
        c28655q6.m87154g0(61009104);
        if ((i13 & 6) == 0) {
            i14 = (c28655q6.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q6.m87157i(onRetry) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q6.m87157i(shareActionsHelper) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q6.m87157i(onShareEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q6.m87157i(onShareRender) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q6.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            Context context = (Context) c28655q6.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Object objM87133R3 = c28655q6.m87133R();
            Object obj4 = C28635l.f115821a;
            if (objM87133R3 == obj4) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q6.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            if (viewState.getIsLoading()) {
                c28655q6.m87150e0(751428514);
                m53088M(c28655q6, 0);
                c28655q6.m87173q(false);
            } else {
                boolean zM48581d = viewState.getIsError();
                C2314t c2314t = C2314t.f9131w;
                if (zM48581d) {
                    c28655q6.m87150e0(751511997);
                    float f16 = 8;
                    m53077B(onRetry, AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), 2 * f16, 3 * f16), c28655q6, ((i14 >> 3) & 14) | 48, 0);
                    c28655q6.m87173q(false);
                } else if (viewState.getDisplayRefreshingSpinner() && viewState.getScreenContent() == null) {
                    c28655q6.m87150e0(751830274);
                    m53088M(c28655q6, 0);
                    c28655q6.m87173q(false);
                } else if (viewState.getScreenContent() != null) {
                    c28655q6.m87150e0(752081870);
                    C17202d.a aVarM48580c = viewState.getScreenContent();
                    int i18 = i14 & 7168;
                    boolean zM87157i = (i18 == 2048) | c28655q6.m87157i(aVarM48580c);
                    Object objM87133R4 = c28655q6.m87133R();
                    if (zM87157i || objM87133R4 == obj4) {
                        objM87133R4 = new a(onShareEvent, aVarM48580c, interfaceC28601c2, null);
                        c28655q6.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q6, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
                    Object objM87133R5 = c28655q6.m87133R();
                    if (objM87133R5 == obj4) {
                        objM87133R5 = AbstractC28683x.m87262p(c28655q6);
                        c28655q6.m87172p0(objM87133R5);
                    }
                    Object obj5 = (InterfaceC2994c0) objM87133R5;
                    boolean zM87157i2 = c28655q6.m87157i(aVarM48580c);
                    Object objM87133R6 = c28655q6.m87133R();
                    if (zM87157i2 || objM87133R6 == obj4) {
                        objM87133R6 = new C18436u(aVarM48580c, 1);
                        c28655q6.m87172p0(objM87133R6);
                    }
                    C29674b c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R6, 0, 0, c28655q6, 3);
                    boolean zM87149e = c28655q6.m87149e(aVarM48580c.m48584b().size());
                    Object objM87133R7 = c28655q6.m87133R();
                    Object obj6 = objM87133R7;
                    if (zM87149e || objM87133R7 == obj4) {
                        int size = aVarM48580c.m48584b().size();
                        ArrayList arrayList = new ArrayList(size);
                        int i19 = 0;
                        while (i19 < size) {
                            arrayList.add(new C18425j());
                            i19++;
                            size = size;
                        }
                        c28655q6.m87172p0(arrayList);
                        obj6 = arrayList;
                    }
                    List list = (List) obj6;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    int i24 = i14;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode2 = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q6.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q6, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    InterfaceC4339a interfaceC4339a = C0217k.f724b;
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(interfaceC4339a);
                    } else {
                        c28655q6.m87178s0();
                    }
                    C0209i c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q6, c0209i, interfaceC39127r0M66763d);
                    C0209i c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m);
                    C0209i c0209i3 = C0217k.f732j;
                    if (c28655q6.f115903S) {
                        aVar = aVarM48580c;
                    } else {
                        aVar = aVarM48580c;
                        if (!AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode2))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N);
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        float f17 = 8;
                        f13 = 2 * f17;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9111N, c28655q6, 54);
                        iHashCode = Long.hashCode(c28655q6.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q6.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q6, modifierM3409f2);
                        c28655q6.m87158i0();
                        if (c28655q6.f115903S) {
                            c28655q6.m87163l(interfaceC4339a);
                        } else {
                            c28655q6.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q6, c0209i, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q6, c0209i4, modifierM118962N2);
                        String strM48585c = aVar.getTitle();
                        c38072d = C38072d.f163053a;
                        i15 = C38072d.f163054b;
                        f14 = 1 * f17;
                        aVar2 = aVar;
                        AbstractC30795n.m94707h(strM48585c, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13, 0.0f, f14, 5), c38072d.m121949b(c28655q6, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q6, i15).getT3(), fValueOf, c28655q6, 48, (C2886a.f11498d << 18) | 12582912, 65528);
                        if (aVar2.m48584b().size() == 1) {
                            c28655q6.m87150e0(1979395634);
                            m53090O((C17202d.b) AbstractC25265s.m74096F0(aVar2.m48584b()), m53081F(interfaceC28601c2), (C18425j) list.get(0), c28655q6, 0);
                            c28655q6.m87173q(false);
                            c28655q3 = c28655q6;
                            c29674b = c29674bM91150b;
                        } else {
                            c28655q6.m87150e0(1979706719);
                            AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3409f(1.0f, c2314t), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(-1830096368, c28655q6, new C14359c(aVar2, list, interfaceC28601c2, 2)), c28655q6, 48, 24576, 16380);
                            c29674b = c29674bM91150b;
                            c28655q2 = c28655q6;
                            if (aVar2.m48584b().size() > 1) {
                                c28655q2.m87150e0(1980482525);
                                m53128t(aVar2.m48584b().size(), c29674b.m91162k(), c28655q2, 0);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(1980713165);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        }
                        boolean z17 = !m53081F(interfaceC28601c2);
                        boolean zM87157i3 = c28655q3.m87157i(aVar2) | c28655q3.m87153g(c29674b);
                        if (i18 == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        z13 = zM87157i3 | z4;
                        objM87133R = c28655q3.m87133R();
                        if (!z13 || objM87133R == obj4) {
                            C29674b c29674b3 = c29674b;
                            interfaceC28601c1 = interfaceC28601c2;
                            obj = obj4;
                            i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                            objM87133R = new C1042s((Object) aVar2, (Object) c29674b3, onShareEvent, (Object) interfaceC28601c1, 24);
                            c29674b2 = c29674b3;
                            c28655q3.m87172p0(objM87133R);
                        } else {
                            c29674b2 = c29674b;
                            obj = obj4;
                            interfaceC28601c1 = interfaceC28601c2;
                            i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                        }
                        c28655q4 = c28655q3;
                        AbstractC18417b.m53001b(z17, (p715kotlin.jvm.functions.Function1) objM87133R, null, c28655q4, 0, 4);
                        i17 = i16;
                        AbstractC17755i2.m50938j(AbstractC1102d.m3409f(1.0f, c2314t), null, null, AbstractC8693b.m21277k(AbstractC0752a.f2753p), fValueOf, 0L, 0L, null, c28655q4, (TextResource.C8688b.f25889c << 9) | 24582, 230);
                        obj2 = (C17202d.b) aVar2.m48584b().get(c29674b2.m91162k());
                        obj3 = (C18425j) list.get(c29674b2.m91162k());
                        boolean zM87157i4 = c28655q4.m87157i(obj5) | c28655q4.m87157i(obj3) | c28655q4.m87157i(obj2) | c28655q4.m87157i(aVar2) | c28655q4.m87157i(r41) | c28655q4.m87157i(shareActionsHelper);
                        if (i18 == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z18 = z14 | zM87157i4;
                        if ((i24 & 57344) == i17) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | z18;
                        objM87133R2 = c28655q4.m87133R();
                        if (!z16 || objM87133R2 == obj) {
                            r15 = 1;
                            Object c18434s = new C18434s(obj5, obj3, obj2, aVar2, context, shareActionsHelper, onShareEvent, onShareRender, interfaceC28601c1, 0);
                            c28655q4.m87172p0(c18434s);
                            objM87133R2 = c18434s;
                        } else {
                            r15 = 1;
                        }
                        AbstractC18422g.m53014i(null, (p715kotlin.jvm.functions.Function1) objM87133R2, c28655q4, 0, r15);
                        f15 = 4;
                        AbstractC25012a.m73388u(9, f15, r10, c28655q4, r15);
                        if (viewState.getDisplayRefreshingSpinner()) {
                            AbstractC15170v4.m43202b(AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(AbstractC18489d0.m53365f(c28655q4, 1227554601, f15, f15, c2314t), C2299e.f9116y), 0.0f, f14, f13, 0.0f, 9), c38072d.m121949b(c28655q4, i15).getBrandWhite(), 0.0f, 0L, 0, c28655q4, 0, 28);
                            C28655q c28655q7 = c28655q4;
                            c28655q7.m87173q(false);
                            c28655q5 = c28655q7;
                        } else {
                            C28655q c28655q8 = c28655q4;
                            c28655q8.m87150e0(1227906327);
                            c28655q8.m87173q(false);
                            c28655q5 = c28655q8;
                        }
                        c28655q5.m87173q(r15);
                        c28655q5.m87173q(false);
                        c28655q = c28655q5;
                    }
                    AbstractC11266d.m30471y(iHashCode2, c28655q6, iHashCode2, c0209i3);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q6, c0209i5, modifierM118962N);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    float f18 = 8;
                    f13 = 2 * f18;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9111N, c28655q6, 54);
                    iHashCode = Long.hashCode(c28655q6.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q6.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q6, modifierM3409f3);
                    c28655q6.m87158i0();
                    if (c28655q6.f115903S) {
                        c28655q6.m87163l(interfaceC4339a);
                    } else {
                        c28655q6.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q6.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q6, c0209i5, modifierM118962N3);
                    String strM48585c2 = aVar.getTitle();
                    c38072d = C38072d.f163053a;
                    i15 = C38072d.f163054b;
                    f14 = 1 * f18;
                    aVar2 = aVar;
                    AbstractC30795n.m94707h(strM48585c2, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13, 0.0f, f14, 5), c38072d.m121949b(c28655q6, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q6, i15).getT3(), fValueOf, c28655q6, 48, (C2886a.f11498d << 18) | 12582912, 65528);
                    if (aVar2.m48584b().size() == 1) {
                        c28655q6.m87150e0(1979395634);
                        m53090O((C17202d.b) AbstractC25265s.m74096F0(aVar2.m48584b()), m53081F(interfaceC28601c2), (C18425j) list.get(0), c28655q6, 0);
                        c28655q6.m87173q(false);
                        c28655q3 = c28655q6;
                        c29674b = c29674bM91150b;
                    } else {
                        c28655q6.m87150e0(1979706719);
                        AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3409f(1.0f, c2314t), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(-1830096368, c28655q6, new C14359c(aVar2, list, interfaceC28601c2, 2)), c28655q6, 48, 24576, 16380);
                        c29674b = c29674bM91150b;
                        c28655q2 = c28655q6;
                        if (aVar2.m48584b().size() > 1) {
                            c28655q2.m87150e0(1980482525);
                            m53128t(aVar2.m48584b().size(), c29674b.m91162k(), c28655q2, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1980713165);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    boolean z19 = !m53081F(interfaceC28601c2);
                    boolean zM87157i5 = c28655q3.m87157i(aVar2) | c28655q3.m87153g(c29674b);
                    if (i18 == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z13 = zM87157i5 | z4;
                    objM87133R = c28655q3.m87133R();
                    if (z13) {
                        C29674b c29674b4 = c29674b;
                        interfaceC28601c1 = interfaceC28601c2;
                        obj = obj4;
                        i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                        objM87133R = new C1042s((Object) aVar2, (Object) c29674b4, onShareEvent, (Object) interfaceC28601c1, 24);
                        c29674b2 = c29674b4;
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        C29674b c29674b5 = c29674b;
                        interfaceC28601c1 = interfaceC28601c2;
                        obj = obj4;
                        i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                        objM87133R = new C1042s((Object) aVar2, (Object) c29674b5, onShareEvent, (Object) interfaceC28601c1, 24);
                        c29674b2 = c29674b5;
                        c28655q3.m87172p0(objM87133R);
                    }
                    c28655q4 = c28655q3;
                    AbstractC18417b.m53001b(z19, (p715kotlin.jvm.functions.Function1) objM87133R, null, c28655q4, 0, 4);
                    i17 = i16;
                    AbstractC17755i2.m50938j(AbstractC1102d.m3409f(1.0f, c2314t), null, null, AbstractC8693b.m21277k(AbstractC0752a.f2753p), fValueOf, 0L, 0L, null, c28655q4, (TextResource.C8688b.f25889c << 9) | 24582, 230);
                    obj2 = (C17202d.b) aVar2.m48584b().get(c29674b2.m91162k());
                    obj3 = (C18425j) list.get(c29674b2.m91162k());
                    boolean zM87157i6 = c28655q4.m87157i(obj5) | c28655q4.m87157i(obj3) | c28655q4.m87157i(obj2) | c28655q4.m87157i(aVar2) | c28655q4.m87157i(r41) | c28655q4.m87157i(shareActionsHelper);
                    if (i18 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z110 = z14 | zM87157i6;
                    if ((i24 & 57344) == i17) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z15 | z110;
                    objM87133R2 = c28655q4.m87133R();
                    if (z16) {
                        r15 = 1;
                        Object c18434s2 = new C18434s(obj5, obj3, obj2, aVar2, context, shareActionsHelper, onShareEvent, onShareRender, interfaceC28601c1, 0);
                        c28655q4.m87172p0(c18434s2);
                        objM87133R2 = c18434s2;
                    } else {
                        r15 = 1;
                        Object c18434s3 = new C18434s(obj5, obj3, obj2, aVar2, context, shareActionsHelper, onShareEvent, onShareRender, interfaceC28601c1, 0);
                        c28655q4.m87172p0(c18434s3);
                        objM87133R2 = c18434s3;
                    }
                    AbstractC18422g.m53014i(null, (p715kotlin.jvm.functions.Function1) objM87133R2, c28655q4, 0, r15);
                    f15 = 4;
                    AbstractC25012a.m73388u(9, f15, r10, c28655q4, r15);
                    if (viewState.getDisplayRefreshingSpinner()) {
                        AbstractC15170v4.m43202b(AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(AbstractC18489d0.m53365f(c28655q4, 1227554601, f15, f15, c2314t), C2299e.f9116y), 0.0f, f14, f13, 0.0f, 9), c38072d.m121949b(c28655q4, i15).getBrandWhite(), 0.0f, 0L, 0, c28655q4, 0, 28);
                        C28655q c28655q9 = c28655q4;
                        c28655q9.m87173q(false);
                        c28655q5 = c28655q9;
                    } else {
                        C28655q c28655q10 = c28655q4;
                        c28655q10.m87150e0(1227906327);
                        c28655q10.m87173q(false);
                        c28655q5 = c28655q10;
                    }
                    c28655q5.m87173q(r15);
                    c28655q5.m87173q(false);
                    c28655q = c28655q5;
                } else {
                    C28655q c28655q11 = c28655q6;
                    c28655q11.m87150e0(757104242);
                    c28655q11.m87173q(false);
                    c28655q = c28655q11;
                }
            }
            c28655q = c28655q6;
        } else {
            C28655q c28655q12 = c28655q6;
            c28655q12.m87138X();
            c28655q = c28655q12;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) viewState, (Object) onRetry, (Object) shareActionsHelper, onShareEvent, (InterfaceC23459e) onShareRender, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final boolean m53081F(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: G */
    private static final void m53082G(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final int m53083H(C17202d.a aVar) {
        return aVar.m48584b().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m53084I(C17202d.a aVar, List list, InterfaceC28601c1 interfaceC28601c1, InterfaceC29694r HorizontalPager, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3409f);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        m53090O(aVar.m48584b().get(i13), m53081F(interfaceC28601c1), (C18425j) list.get(i13), composer, 0);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m53085J(C17202d.a aVar, AbstractC29701y abstractC29701y, p715kotlin.jvm.functions.Function1 function1, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        C17202d.b bVar = (C17202d.b) AbstractC25265s.m74102I0(abstractC29701y.m91162k(), aVar.m48584b());
        boolean z13 = !z4;
        function1.invoke(new AbstractC4446a.a(aVar.m48583a(), z13, bVar != null ? bVar.getId() : null));
        m53082G(interfaceC28601c1, z13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m53086K(InterfaceC2994c0 interfaceC2994c0, C18425j c18425j, C17202d.b bVar, C17202d.a aVar, Context context, C3108a c3108a, p715kotlin.jvm.functions.Function1 function1, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1, AbstractC18419d event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(event, c18425j, bVar, aVar, context, c3108a, function1, interfaceC4351m, interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m53087L(C17202d c17202d, InterfaceC4339a interfaceC4339a, C3108a c3108a, p715kotlin.jvm.functions.Function1 function1, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m53080E(c17202d, interfaceC4339a, c3108a, function1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final void m53088M(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1783790514);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13 * f13, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC15170v4.m43202b(AbstractC1102d.m3419p(6 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0.0f, 0L, 0, c28655q, 6, 28);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m53089N(int i13, Composer composer, int i14) {
        m53088M(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final void m53090O(C17202d.b bVar, boolean z4, C18425j c18425j, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(893192569);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c18425j) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C18418c c18418cM53115g0 = m53115g0(bVar.getStyle());
            AbstractC18429n.m53059l(new C39174f(c18418cM53115g0.getWidth()), new C39174f(c18418cM53115g0.getHeight()), c18425j, AbstractC37817c.m121344e(361653760, c28655q, new C0341c(bVar, z4, c18418cM53115g0, 8)), c28655q, (i14 & 896) | 3072, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(bVar, z4, c18425j, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m53091P(C17202d.b bVar, boolean z4, C18418c c18418c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m53134z(bVar, z4, c18418c, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m53092Q(C17202d.b bVar, boolean z4, C18425j c18425j, int i13, Composer composer, int i14) {
        m53090O(bVar, z4, c18425j, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x013c  */
    /* JADX WARN: Code duplicated, block: B:52:0x013e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0146  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x0202  */
    /* JADX WARN: Code duplicated, block: B:76:0x0244  */
    /* JADX WARN: Code duplicated, block: B:77:0x0246  */
    /* JADX WARN: Code duplicated, block: B:80:0x024c  */
    /* JADX WARN: Code duplicated, block: B:81:0x024e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0259  */
    /* JADX WARN: Code duplicated, block: B:89:0x0276  */
    /* JADX WARN: Code duplicated, block: B:93:0x028d  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: R */
    public static final void m53093R(String path, String str, InterfaceC4339a onDismiss, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        boolean z4;
        String str3;
        C28677v1 c28677v1M87180u;
        String str4;
        C26669a c26669a;
        C38266c c38266c;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        C26669a c26669a2;
        C38266c c38266c2;
        boolean zM87153g2;
        Object objM87133R2;
        InterfaceC23462h interfaceC23462h2;
        C26669a c26669a3;
        C38266c c38266c3;
        boolean zM87153g3;
        Object objM87133R3;
        InterfaceC23462h interfaceC23462h3;
        InterfaceC28601c1 interfaceC28601c1M87260n;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        boolean z15;
        Object objM87133R4;
        boolean zM87153g4;
        Object objM87133R5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R6;
        boolean zM87157i;
        Object objM87133R7;
        boolean zM87157i2;
        Object objM87133R8;
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1950428539);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(path) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                c28655q.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(c38266c, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                c28655q.m87152f0(1903845737);
                c26669a2 = C29155a.f118017b;
                if (c26669a2 != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c2 = c26669a2.f106046a.f159364d;
                c28655q.m87152f0(-3686552);
                zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c2, null, null));
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                interfaceC23462h2 = (InterfaceC23462h) objM87133R2;
                c28655q.m87173q(false);
                c28655q.m87152f0(1903845737);
                c26669a3 = C29155a.f118017b;
                if (c26669a3 != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c3 = c26669a3.f106046a.f159364d;
                c28655q.m87152f0(-3686552);
                zM87153g3 = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new e(c38266c3, null, null));
                    c28655q.m87172p0(objM87133R3);
                }
                c28655q.m87173q(false);
                interfaceC23462h3 = (InterfaceC23462h) objM87133R3;
                c28655q.m87173q(false);
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(m53094S(interfaceC23462h).getViewState(), new C17202d(true, false, false, null, 14, null), null, c28655q, 0, 2);
                boolean zM87157i3 = c28655q.m87157i(interfaceC23462h);
                i16 = i15 & 14;
                if (i16 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z19 = zM87157i3 | z13;
                i17 = i15 & 112;
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z19 | z14;
                objM87133R4 = c28655q.m87133R();
                if (z15 || objM87133R4 == c28676v0) {
                    objM87133R4 = new g(path, str4, interfaceC23462h, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(path, str4, (InterfaceC4351m) objM87133R4, c28655q);
                AbstractC14874j.m42904c(m53097V(interfaceC28601c1M87260n), "share_sheet", c28655q, 48);
                C17202d.a aVarM48580c = m53097V(interfaceC28601c1M87260n).getScreenContent();
                zM87153g4 = c28655q.m87153g(interfaceC28601c1M87260n);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g4 || objM87133R5 == c28676v0) {
                    objM87133R5 = new h(interfaceC28601c1M87260n, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, aVarM48580c);
                C2314t c2314t = C2314t.f9131w;
                float f13 = 4;
                float f14 = f13 * f13;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1099a.m3394p(2 * 8, AbstractC15673b0.m44010T(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12)))));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                float f15 = 1 * f13;
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f15, AbstractC1102d.m3424u(16 * f13, c2314t)), AbstractC33253j.m105489e(f15)), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30(), AbstractC17918w0.f69621a), c28655q, 0);
                C17202d c17202dM53097V = m53097V(interfaceC28601c1M87260n);
                boolean zM87157i4 = c28655q.m87157i(interfaceC23462h);
                if (i16 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z24 = zM87157i4 | z16;
                if (i17 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z24 | z17;
                objM87133R6 = c28655q.m87133R();
                if (z18 || objM87133R6 == c28676v0) {
                    objM87133R6 = new C11558r(path, str4, interfaceC23462h, 27);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
                C3108a c3108aM53095T = m53095T(interfaceC23462h2);
                zM87157i = c28655q.m87157i(interfaceC23462h3);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i || objM87133R7 == c28676v0) {
                    objM87133R7 = new C18433r(interfaceC23462h3, 1);
                    c28655q.m87172p0(objM87133R7);
                }
                p715kotlin.jvm.functions.Function1 function1 = (p715kotlin.jvm.functions.Function1) objM87133R7;
                zM87157i2 = c28655q.m87157i(interfaceC23462h3);
                objM87133R8 = c28655q.m87133R();
                if (zM87157i2 || objM87133R8 == c28676v0) {
                    objM87133R8 = new C18427l(interfaceC23462h3, 2);
                    c28655q.m87172p0(objM87133R8);
                }
                m53080E(c17202dM53097V, interfaceC4339a, c3108aM53095T, function1, (InterfaceC4351m) objM87133R8, c28655q, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                str3 = str4;
            } else {
                c28655q.m87138X();
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 9, path, str3, onDismiss);
            }
        }
        i15 |= 48;
        str2 = str;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            c28655q.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87152f0(1903845737);
            c26669a2 = C29155a.f118017b;
            if (c26669a2 != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c2 = c26669a2.f106046a.f159364d;
            c28655q.m87152f0(-3686552);
            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c2, null, null));
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c2, null, null));
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            interfaceC23462h2 = (InterfaceC23462h) objM87133R2;
            c28655q.m87173q(false);
            c28655q.m87152f0(1903845737);
            c26669a3 = C29155a.f118017b;
            if (c26669a3 != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c3 = c26669a3.f106046a.f159364d;
            c28655q.m87152f0(-3686552);
            zM87153g3 = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g3) {
                objM87133R3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new e(c38266c3, null, null));
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new e(c38266c3, null, null));
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            interfaceC23462h3 = (InterfaceC23462h) objM87133R3;
            c28655q.m87173q(false);
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(m53094S(interfaceC23462h).getViewState(), new C17202d(true, false, false, null, 14, null), null, c28655q, 0, 2);
            boolean zM87157i5 = c28655q.m87157i(interfaceC23462h);
            i16 = i15 & 14;
            if (i16 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z110 = zM87157i5 | z13;
            i17 = i15 & 112;
            if (i17 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z110 | z14;
            objM87133R4 = c28655q.m87133R();
            if (z15) {
                objM87133R4 = new g(path, str4, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new g(path, str4, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87254h(path, str4, (InterfaceC4351m) objM87133R4, c28655q);
            AbstractC14874j.m42904c(m53097V(interfaceC28601c1M87260n), "share_sheet", c28655q, 48);
            C17202d.a aVarM48580c2 = m53097V(interfaceC28601c1M87260n).getScreenContent();
            zM87153g4 = c28655q.m87153g(interfaceC28601c1M87260n);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g4) {
                objM87133R5 = new h(interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new h(interfaceC28601c1M87260n, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, aVarM48580c2);
            C2314t c2314t2 = C2314t.f9131w;
            float f16 = 4;
            float f17 = f16 * f16;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1099a.m3394p(2 * 8, AbstractC15673b0.m44010T(AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t2), AbstractC33253j.m105491g(f17, f17, 0.0f, 0.0f, 12)))));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            float f18 = 1 * f16;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f18, AbstractC1102d.m3424u(16 * f16, c2314t2)), AbstractC33253j.m105489e(f18)), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30(), AbstractC17918w0.f69621a), c28655q, 0);
            C17202d c17202dM53097V2 = m53097V(interfaceC28601c1M87260n);
            boolean zM87157i6 = c28655q.m87157i(interfaceC23462h);
            if (i16 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z25 = zM87157i6 | z16;
            if (i17 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z25 | z17;
            objM87133R6 = c28655q.m87133R();
            if (z18) {
                objM87133R6 = new C11558r(path, str4, interfaceC23462h, 27);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C11558r(path, str4, interfaceC23462h, 27);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
            C3108a c3108aM53095T2 = m53095T(interfaceC23462h2);
            zM87157i = c28655q.m87157i(interfaceC23462h3);
            objM87133R7 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R7 = new C18433r(interfaceC23462h3, 1);
                c28655q.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C18433r(interfaceC23462h3, 1);
                c28655q.m87172p0(objM87133R7);
            }
            p715kotlin.jvm.functions.Function1 function2 = (p715kotlin.jvm.functions.Function1) objM87133R7;
            zM87157i2 = c28655q.m87157i(interfaceC23462h3);
            objM87133R8 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R8 = new C18427l(interfaceC23462h3, 2);
                c28655q.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new C18427l(interfaceC23462h3, 2);
                c28655q.m87172p0(objM87133R8);
            }
            m53080E(c17202dM53097V2, interfaceC4339a2, c3108aM53095T2, function2, (InterfaceC4351m) objM87133R8, c28655q, 0);
            c28655q = c28655q;
            c28655q.m87173q(true);
            str3 = str4;
        } else {
            c28655q.m87138X();
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 9, path, str3, onDismiss);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C17201c m53094S(InterfaceC23462h interfaceC23462h) {
        return (C17201c) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: T */
    private static final C3108a m53095T(InterfaceC23462h interfaceC23462h) {
        return (C3108a) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: U */
    private static final C4447b m53096U(InterfaceC23462h interfaceC23462h) {
        return (C4447b) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C17202d m53097V(InterfaceC28670t2 interfaceC28670t2) {
        return (C17202d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m53098W(String str, String str2, InterfaceC23462h interfaceC23462h) {
        m53094S(interfaceC23462h).m48578o(new AbstractC17200b.a(str, str2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m53099X(InterfaceC23462h interfaceC23462h, AbstractC4446a it) {
        AbstractC22676k.m65750j(it, "it");
        m53096U(interfaceC23462h).m13910a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m53100Y(InterfaceC23462h interfaceC23462h, long j7, EnumC14407e result) {
        AbstractC22676k.m65750j(result, "result");
        m53096U(interfaceC23462h).m13913d(j7, result);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m53101Z(String str, String str2, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m53093R(str, str2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x01c7 A[Catch: all -> 0x020a, TRY_LEAVE, TryCatch #2 {all -> 0x020a, blocks: (B:39:0x01b3, B:41:0x01c7), top: B:77:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0201  */
    /* JADX WARN: Code duplicated, block: B:51:0x020e A[Catch: all -> 0x0206, TryCatch #1 {all -> 0x0206, blocks: (B:43:0x01f0, B:51:0x020e, B:53:0x0218, B:56:0x0252, B:58:0x025a, B:61:0x0293, B:63:0x029b, B:68:0x02d8, B:69:0x02dd), top: B:76:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0218 A[Catch: all -> 0x0206, TryCatch #1 {all -> 0x0206, blocks: (B:43:0x01f0, B:51:0x020e, B:53:0x0218, B:56:0x0252, B:58:0x025a, B:61:0x0293, B:63:0x029b, B:68:0x02d8, B:69:0x02dd), top: B:76:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0250  */
    /* JADX WARN: Code duplicated, block: B:56:0x0252 A[Catch: all -> 0x0206, TryCatch #1 {all -> 0x0206, blocks: (B:43:0x01f0, B:51:0x020e, B:53:0x0218, B:56:0x0252, B:58:0x025a, B:61:0x0293, B:63:0x029b, B:68:0x02d8, B:69:0x02dd), top: B:76:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x025a A[Catch: all -> 0x0206, TryCatch #1 {all -> 0x0206, blocks: (B:43:0x01f0, B:51:0x020e, B:53:0x0218, B:56:0x0252, B:58:0x025a, B:61:0x0293, B:63:0x029b, B:68:0x02d8, B:69:0x02dd), top: B:76:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0292  */
    /* JADX WARN: Code duplicated, block: B:61:0x0293 A[Catch: all -> 0x0206, TryCatch #1 {all -> 0x0206, blocks: (B:43:0x01f0, B:51:0x020e, B:53:0x0218, B:56:0x0252, B:58:0x025a, B:61:0x0293, B:63:0x029b, B:68:0x02d8, B:69:0x02dd), top: B:76:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x029b A[Catch: all -> 0x0206, TRY_LEAVE, TryCatch #1 {all -> 0x0206, blocks: (B:43:0x01f0, B:51:0x020e, B:53:0x0218, B:56:0x0252, B:58:0x025a, B:61:0x0293, B:63:0x029b, B:68:0x02d8, B:69:0x02dd), top: B:76:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x02d8 A[Catch: all -> 0x0206, TRY_ENTER, TryCatch #1 {all -> 0x0206, blocks: (B:43:0x01f0, B:51:0x020e, B:53:0x0218, B:56:0x0252, B:58:0x025a, B:61:0x0293, B:63:0x029b, B:68:0x02d8, B:69:0x02dd), top: B:76:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02d1, code lost:
    
        if (r13.m8934i(r14, r1, r0, r2) == r3) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX INFO: renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m53111e0(id2.AbstractC18419d r18, id2.C18425j r19, hd2.C17202d.b r20, hd2.C17202d.a r21, boolean r22, android.content.Context r23, bd2.C3108a r24, p715kotlin.jvm.functions.Function1 r25, c93.InterfaceC4351m r26, q83.InterfaceC30057d<? super l83.C23454a0> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.AbstractC18435t.m53111e0(id2.d, id2.j, hd2.d$b, hd2.d$a, boolean, android.content.Context, bd2.a, kotlin.jvm.functions.Function1, c93.m, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m53113f0(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17199a.class), new C21614c());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g0 */
    public static final C18418c m53115g0(StyleType styleType) {
        AbstractC22676k.m65750j(styleType, "<this>");
        if (c.f71725a[styleType.ordinal()] == 1) {
            return new C18418c(f71708c, f71709d, f71710e, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: t */
    private static final void m53128t(int i13, int i14, Composer composer, int i15) {
        long jM125374Y0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1406683977);
        int i16 = (i15 & 6) == 0 ? (c28655q.m87149e(i13) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i16 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            C22971k c22971kM66746i = AbstractC22977m.m66746i(4);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, 1 * 8, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(50154621);
            for (int i17 = 0; i17 < i13; i17++) {
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(6, c2314t), AbstractC33253j.m105486b(50));
                if (i17 == i14) {
                    c28655q.m87150e0(-1910647279);
                    jM125374Y0 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(-1910558092);
                    jM125374Y0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30();
                    c28655q.m87173q(false);
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM118994r, jM125374Y0, AbstractC17918w0.f69621a), c28655q, 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18432q(i13, i14, i15, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m53129u(int i13, int i14, int i15, Composer composer, int i16) {
        m53128t(i13, i14, composer, AbstractC28683x.m87244L(i15 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m53130v(ShareBackground shareBackground, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1441480287);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(shareBackground) : c28655q.m87157i(shareBackground) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            new C18423h().m53023b(shareBackground, c28655q, (i14 & 14) | ColorThemeModel.$stable);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(shareBackground, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m53131w(ShareBackground shareBackground, int i13, Composer composer, int i14) {
        m53130v(shareBackground, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m53132x(C17202d.b bVar, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1191299636);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-815241685);
            Iterator<T> it = bVar.m48589d().iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), f71707b, null, null, c28655q, C25307p.f99300b << 3, 12);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(bVar, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m53133y(C17202d.b bVar, int i13, Composer composer, int i14) {
        m53132x(bVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m53134z(C17202d.b bVar, boolean z4, C18418c c18418c, Composer composer, int i13) {
        int i14;
        C18418c c18418c2;
        Modifier modifierM44455h;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1640812846);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            c18418c2 = c18418c;
            i14 |= c28655q.m87153g(c18418c2) ? 256 : 128;
        } else {
            c18418c2 = c18418c;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C33252i c33252iM105489e = AbstractC33253j.m105489e(c18418c2.getCornerRadius());
            float fM53005c = c18418c2.getWidth();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3411h(c18418c2.getHeight(), AbstractC1102d.m3424u(fM53005c, c2314t)), c33252iM105489e);
            if (z4) {
                c28655q.m87150e0(433070513);
                modifierM44455h = AbstractC15751g.m44455h(c2314t, 1, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), c33252iM105489e);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(433173092);
                c28655q.m87173q(false);
                modifierM44455h = c2314t;
            }
            Modifier modifierMo3471e = modifierM118994r.mo3471e(modifierM44455h);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(C1100b.f4583a.mo3401b(c2314t), c33252iM105489e);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM118994r2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            if (z4) {
                c28655q.m87150e0(-2032802291);
                m53130v(bVar.getBackground(), c28655q, ColorThemeModel.$stable);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2032722528);
                c28655q.m87173q(false);
            }
            m53132x(bVar, c28655q, i14 & 14);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(bVar, z4, c18418c, i13, 19);
        }
    }
}
