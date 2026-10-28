package com.whoop.weightlifting;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.lifecycle.C1601k1;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import ck1.C4780c;
import com.whoop.profile.view.edit.form.C9779c;
import com.whoop.weightlifting.data.domain.StrapLaterality;
import com.whoop.weightlifting.data.domain.StrapLocation;
import cu2.C11121a;
import cu2.C11129i;
import cu2.EnumC11122b;
import ih0.AbstractC18489d0;
import in2.C18733e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p114eb.AbstractC12958g1;
import p114eb.C12953f;
import p114eb.C12970k1;
import p114eb.C12974m;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12999y0;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\n\u001f !\"#$%&'(BE\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0011\u001a\u00020\u00032.\u0010\u0010\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f0\u000e\"\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\u0082\u0001\n)*+,-./012¨\u00063"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination;", "ARGS", "", "", "name", "", "Leb/f;", "requiredArguments", "optionalArguments", "Lkotlin/Function1;", "Leb/q;", "navArgsFactory", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "Ll83/k;", "args", "routeWithArgs", "([Ll83/k;)Ljava/lang/String;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "getNavArgsFactory", "()Lkotlin/jvm/functions/Function1;", "arguments", "getArguments", "()Ljava/util/List;", "route", "getRoute", "j", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "d", "i", "c", "a", "g", "b", "Lcom/whoop/weightlifting/StrengthTrainerDestination$a;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$b;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$c;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$d;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$e;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$f;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$g;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$h;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$i;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$j;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class StrengthTrainerDestination<ARGS> {
    public static final int $stable = 8;
    private final List<C12953f> arguments;
    private final String name;
    private final Function1 navArgsFactory;
    private final List<C12953f> optionalArguments;
    private final List<C12953f> requiredArguments;
    private final String route;

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\f*\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\f*\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$a;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;", "<init>", "()V", "Leb/a0;", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "strapLocation", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "strapLaterality", "", "isQuickStart", "Ll83/a0;", "k", "(Leb/a0;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Z)V", "n", "(Leb/a0;)V", "o", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10738a extends StrengthTrainerDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10738a f32750a = new C10738a();

        /* JADX INFO: renamed from: b */
        public static final int f32751b = 8;

        /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$a$a */
        @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b$\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\u0019\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b\u001d\u0010(¨\u0006)"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$a$a;", "", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "strapLocation", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "strapLaterality", "", "restoreState", "isQuickStart", "Lin2/e;", "initialListPosition", "Lkotlin/Function0;", "Ll83/a0;", "onInitialListPositionConsumed", "<init>", "(Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZZLin2/e;Lc93/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "e", "()Lcom/whoop/weightlifting/data/domain/StrapLocation;", "b", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "d", "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "c", "Z", "()Z", "f", "Lin2/e;", "()Lin2/e;", "Lc93/a;", "()Lc93/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final StrapLocation strapLocation;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final StrapLaterality strapLaterality;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final boolean restoreState;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final boolean isQuickStart;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final C18733e initialListPosition;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final InterfaceC4339a onInitialListPositionConsumed;

            public a(StrapLocation strapLocation, StrapLaterality strapLaterality, boolean z4, boolean z13, C18733e c18733e, InterfaceC4339a onInitialListPositionConsumed) {
                AbstractC22676k.m65750j(strapLocation, "strapLocation");
                AbstractC22676k.m65750j(strapLaterality, "strapLaterality");
                AbstractC22676k.m65750j(onInitialListPositionConsumed, "onInitialListPositionConsumed");
                this.strapLocation = strapLocation;
                this.strapLaterality = strapLaterality;
                this.restoreState = z4;
                this.isQuickStart = z13;
                this.initialListPosition = c18733e;
                this.onInitialListPositionConsumed = onInitialListPositionConsumed;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C18733e getInitialListPosition() {
                return this.initialListPosition;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final InterfaceC4339a getOnInitialListPositionConsumed() {
                return this.onInitialListPositionConsumed;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getRestoreState() {
                return this.restoreState;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final StrapLaterality getStrapLaterality() {
                return this.strapLaterality;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final StrapLocation getStrapLocation() {
                return this.strapLocation;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return this.strapLocation == aVar.strapLocation && this.strapLaterality == aVar.strapLaterality && this.restoreState == aVar.restoreState && this.isQuickStart == aVar.isQuickStart && AbstractC22676k.m65745e(this.initialListPosition, aVar.initialListPosition) && AbstractC22676k.m65745e(this.onInitialListPositionConsumed, aVar.onInitialListPositionConsumed);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final boolean getIsQuickStart() {
                return this.isQuickStart;
            }

            public int hashCode() {
                int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.strapLaterality.hashCode() + (this.strapLocation.hashCode() * 31)) * 31, 31, this.restoreState), 31, this.isQuickStart);
                C18733e c18733e = this.initialListPosition;
                return this.onInitialListPositionConsumed.hashCode() + ((iM8289b + (c18733e == null ? 0 : c18733e.hashCode())) * 31);
            }

            public String toString() {
                StrapLocation strapLocation = this.strapLocation;
                StrapLaterality strapLaterality = this.strapLaterality;
                boolean z4 = this.restoreState;
                boolean z13 = this.isQuickStart;
                C18733e c18733e = this.initialListPosition;
                InterfaceC4339a interfaceC4339a = this.onInitialListPositionConsumed;
                StringBuilder sb4 = new StringBuilder("NavArgs(strapLocation=");
                sb4.append(strapLocation);
                sb4.append(", strapLaterality=");
                sb4.append(strapLaterality);
                sb4.append(", restoreState=");
                AbstractC38963t7.m124392v(sb4, z4, ", isQuickStart=", z13, ", initialListPosition=");
                sb4.append(c18733e);
                sb4.append(", onInitialListPositionConsumed=");
                sb4.append(interfaceC4339a);
                sb4.append(")");
                return sb4.toString();
            }
        }

        private C10738a() {
            C12974m c12974m = new C12974m();
            m28016e(c12974m);
            List listM118958J = AbstractC37056f.m118958J(new C12953f("restoreState", c12974m.f44811a.m36452a()));
            C12974m c12974m2 = new C12974m();
            m28017f(c12974m2);
            C12953f c12953f = new C12953f("strapLocation", c12974m2.f44811a.m36452a());
            C12974m c12974m3 = new C12974m();
            m28018g(c12974m3);
            C12953f c12953f2 = new C12953f("strapLaterality", c12974m3.f44811a.m36452a());
            C12974m c12974m4 = new C12974m();
            m28019h(c12974m4);
            super("activeWorkout", listM118958J, AbstractC37056f.m118959K(c12953f, c12953f2, new C12953f("isQuickStart", c12974m4.f44811a.m36452a())), new C9779c(11), null);
        }

        /* JADX INFO: renamed from: e */
        private static final C23454a0 m28016e(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44767l);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: f */
        private static final C23454a0 m28017f(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            navArgument.f44811a.f44789a = true;
            navArgument.m36461a(null);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: g */
        private static final C23454a0 m28018g(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            navArgument.f44811a.f44789a = true;
            navArgument.m36461a(null);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: h */
        private static final C23454a0 m28019h(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44767l);
            navArgument.m36461a(Boolean.FALSE);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final a m28020i(C12982q c12982q) {
            StrapLocation strapLocation;
            StrapLaterality strapLaterality;
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            DefaultConstructorMarker defaultConstructorMarker = null;
            String string = bundleM36479a != null ? bundleM36479a.getString("strapLocation") : null;
            StrapLocation strapLocation2 = StrapLocation.Wrist;
            StrapLocation[] strapLocationArrValues = StrapLocation.values();
            int length = strapLocationArrValues.length;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    strapLocation = null;
                    break;
                }
                strapLocation = strapLocationArrValues[i14];
                if (AbstractC22676k.m65745e(strapLocation.getSerializedValue(), string)) {
                    break;
                }
                i14++;
            }
            StrapLocation strapLocation3 = strapLocation == null ? strapLocation2 : strapLocation;
            Bundle bundleM36479a2 = c12982q.m36479a();
            String string2 = bundleM36479a2 != null ? bundleM36479a2.getString("strapLaterality") : null;
            StrapLaterality strapLaterality2 = StrapLaterality.Left;
            StrapLaterality[] strapLateralityArrValues = StrapLaterality.values();
            int length2 = strapLateralityArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    strapLaterality = null;
                    break;
                }
                strapLaterality = strapLateralityArrValues[i15];
                if (AbstractC22676k.m65745e(strapLaterality.getSerializedValue(), string2)) {
                    break;
                }
                i15++;
            }
            StrapLaterality strapLaterality3 = strapLaterality == null ? strapLaterality2 : strapLaterality;
            Bundle bundleM36479a3 = c12982q.m36479a();
            boolean z4 = bundleM36479a3 != null ? bundleM36479a3.getBoolean("restoreState") : false;
            Bundle bundleM36479a4 = c12982q.m36479a();
            boolean z13 = bundleM36479a4 != null ? bundleM36479a4.getBoolean("isQuickStart") : false;
            Integer num = (Integer) c12982q.m36480b().m5001b("indexOfFirstNewGroup");
            return new a(strapLocation3, strapLaterality3, z4, z13, num != null ? new C18733e(num.intValue(), i13, 2, defaultConstructorMarker) : null, new C11129i(c12982q, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C23454a0 m28021j(C12982q c12982q) {
            c12982q.m36480b().m5003d("indexOfFirstNewGroup");
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: l */
        public static /* synthetic */ void m28022l(C10738a c10738a, AbstractC12939a0 abstractC12939a0, StrapLocation strapLocation, StrapLaterality strapLaterality, boolean z4, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                z4 = false;
            }
            c10738a.m28025k(abstractC12939a0, strapLocation, strapLaterality, z4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public static final C23454a0 m28023m(C12999y0 navigate) {
            AbstractC22676k.m65750j(navigate, "$this$navigate");
            String route = C10747j.f32796a.getRoute();
            AbstractC22676k.m65750j(route, "route");
            if (AbstractC39414r.m125890i0(route)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            navigate.f44918e = route;
            navigate.f44917d = -1;
            navigate.f44919f = false;
            navigate.f44920g = false;
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public static final C23454a0 m28024p(C12999y0 navigate) {
            AbstractC22676k.m65750j(navigate, "$this$navigate");
            String route = C10747j.f32796a.getRoute();
            AbstractC22676k.m65750j(route, "route");
            if (AbstractC39414r.m125890i0(route)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            navigate.f44918e = route;
            navigate.f44917d = -1;
            navigate.f44919f = false;
            navigate.f44920g = false;
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: k */
        public final void m28025k(AbstractC12939a0 abstractC12939a0, StrapLocation strapLocation, StrapLaterality strapLaterality, boolean z4) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(strapLocation, "strapLocation");
            AbstractC22676k.m65750j(strapLaterality, "strapLaterality");
            abstractC12939a0.m36408w(routeWithArgs(new C23465k("restoreState", Boolean.FALSE), new C23465k("strapLocation", strapLocation.getSerializedValue()), new C23465k("strapLaterality", strapLaterality.getSerializedValue()), new C23465k("isQuickStart", Boolean.valueOf(z4))), new C9779c(12));
        }

        /* JADX INFO: renamed from: n */
        public final void m28026n(AbstractC12939a0 abstractC12939a0) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            m28025k(abstractC12939a0, StrapLocation.Wrist, StrapLaterality.Left, true);
        }

        /* JADX INFO: renamed from: o */
        public final void m28027o(AbstractC12939a0 abstractC12939a0) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            abstractC12939a0.m36408w(routeWithArgs(new C23465k("restoreState", Boolean.TRUE)), new C9779c(10));
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$b;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;", "<init>", "()V", "", "exerciseId", "source", "e", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Leb/a0;", "Ll83/a0;", "f", "(Leb/a0;Ljava/lang/String;Ljava/lang/String;)V", "exerciseIdToLink", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Leb/a0;Ljava/lang/String;)Z", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10739b extends StrengthTrainerDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10739b f32758a = new C10739b();

        /* JADX INFO: renamed from: b */
        public static final int f32759b = 8;

        /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$b$a */
        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$b$a;", "", "", "exerciseId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String exerciseId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String source;

            public a(String str, String source) {
                AbstractC22676k.m65750j(source, "source");
                this.exerciseId = str;
                this.source = source;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getExerciseId() {
                return this.exerciseId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.exerciseId, aVar.exerciseId) && AbstractC22676k.m65745e(this.source, aVar.source);
            }

            public int hashCode() {
                String str = this.exerciseId;
                return this.source.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public String toString() {
                return AbstractC2875y.m8300m("NavArgs(exerciseId=", this.exerciseId, ", source=", this.source, ")");
            }
        }

        private C10739b() {
            C12974m c12974m = new C12974m();
            m28035b(c12974m);
            C12953f c12953f = new C12953f("exerciseId", c12974m.f44811a.m36452a());
            C12974m c12974m2 = new C12974m();
            m28036c(c12974m2);
            super("customExerciseScreen", null, AbstractC37056f.m118959K(c12953f, new C12953f("source", c12974m2.f44811a.m36452a())), new C9779c(13), 2, null);
        }

        /* JADX INFO: renamed from: b */
        private static final C23454a0 m28035b(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            navArgument.f44811a.f44789a = true;
            navArgument.m36461a(null);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: c */
        private static final C23454a0 m28036c(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            navArgument.m36461a("Exercise Details");
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final a m28037d(C12982q c12982q) {
            String string;
            String string2;
            String string3;
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            String str = null;
            if (bundleM36479a == null || (string3 = bundleM36479a.getString("exerciseId")) == null || (string = AbstractC39414r.m125869O0(string3).toString()) == null || string.length() <= 0) {
                string = null;
            }
            String str2 = (String) c12982q.m36480b().m5001b("linkedExerciseId");
            Bundle bundleM36479a2 = c12982q.m36479a();
            String string4 = bundleM36479a2 != null ? bundleM36479a2.getString("source") : null;
            if (string4 == null || AbstractC39414r.m125890i0(string4)) {
                string4 = "Exercise Details";
            }
            if (string == null) {
                if (str2 != null && (string2 = AbstractC39414r.m125869O0(str2).toString()) != null && string2.length() > 0) {
                    str = string2;
                }
                if (str != null) {
                    c12982q.m36480b().m5003d("linkedExerciseId");
                }
                string = str;
            }
            return new a(string, string4);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m28038g(C10739b c10739b, AbstractC12939a0 abstractC12939a0, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = null;
            }
            if ((i13 & 2) != 0) {
                str2 = "Exercise Details";
            }
            c10739b.m28040f(abstractC12939a0, str, str2);
        }

        /* JADX INFO: renamed from: e */
        public final String m28039e(String exerciseId, String source) {
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            AbstractC22676k.m65750j(source, "source");
            C23465k c23465k = new C23465k("exerciseId", exerciseId);
            if (AbstractC39414r.m125890i0(source)) {
                source = "Exercise Details";
            }
            return routeWithArgs(c23465k, new C23465k("source", source));
        }

        /* JADX INFO: renamed from: f */
        public final void m28040f(AbstractC12939a0 abstractC12939a0, String str, String source) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(source, "source");
            C23465k c23465k = new C23465k("exerciseId", str);
            if (AbstractC39414r.m125890i0(source)) {
                source = "Exercise Details";
            }
            AbstractC12939a0.m36374y(abstractC12939a0, routeWithArgs(c23465k, new C23465k("source", source)), null, 6);
        }

        /* JADX INFO: renamed from: h */
        public final boolean m28041h(AbstractC12939a0 abstractC12939a0, String exerciseIdToLink) {
            C12982q c12982qM36398m;
            C1601k1 c1601k1M36480b;
            C12977n0 c12977n0;
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(exerciseIdToLink, "exerciseIdToLink");
            C12982q c12982qM36398m2 = abstractC12939a0.m36398m();
            if (AbstractC22676k.m65745e((c12982qM36398m2 == null || (c12977n0 = c12982qM36398m2.f44844x) == null) ? null : c12977n0.f44820I, f32758a.getRoute()) && (c12982qM36398m = abstractC12939a0.m36398m()) != null && (c1601k1M36480b = c12982qM36398m.m36480b()) != null) {
                c1601k1M36480b.m5004e(exerciseIdToLink, "linkedExerciseId");
            }
            return abstractC12939a0.m36410z();
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$c */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$c;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "Lcu2/a;", "<init>", "()V", "Leb/a0;", "Ll83/a0;", "a", "(Leb/a0;)V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10740c extends StrengthTrainerDestination<C11121a> {

        /* JADX INFO: renamed from: a */
        public static final C10740c f32762a = new C10740c();

        /* JADX INFO: renamed from: b */
        public static final int f32763b = 8;

        private C10740c() {
            super("deviceLocation", null, null, AbstractC10757a.f32831a, 6, null);
        }

        /* JADX INFO: renamed from: a */
        public final void m28044a(AbstractC12939a0 abstractC12939a0) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC12939a0.m36374y(abstractC12939a0, getRoute(), null, 6);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$d */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004JW\u0010\u0010\u001a\u00020\u000f*\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$d;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;", "<init>", "()V", "Leb/a0;", "", "templateId", "", "activityId", "popUpToDestination", "", "isFromWhoopCoach", "isCopyFlow", "entryPoint", "Ll83/a0;", "l", "(Leb/a0;JLjava/lang/String;Lcom/whoop/weightlifting/StrengthTrainerDestination;ZZLjava/lang/String;)V", "sharedTemplateId", "m", "(Leb/a0;Ljava/lang/String;)V", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10741d extends StrengthTrainerDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10741d f32764a = new C10741d();

        /* JADX INFO: renamed from: b */
        public static final int f32765b = 8;

        /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$d$a */
        @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b&\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b\u001e\u0010\u0013¨\u0006-"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;", "", "Lin2/e;", "initialListPosition", "Lkotlin/Function0;", "Ll83/a0;", "onInitialListPositionConsumed", "", "templateId", "", "activityId", "sharedTemplateId", "", "isFromWhoopCoach", "isCopyFlow", "entryPoint", "<init>", "(Lin2/e;Lc93/a;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lin2/e;", "c", "()Lin2/e;", "b", "Lc93/a;", "d", "()Lc93/a;", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "Ljava/lang/String;", "e", "Ljava/lang/Boolean;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/lang/Boolean;", "g", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C18733e initialListPosition;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final InterfaceC4339a onInitialListPositionConsumed;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final Long templateId;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String activityId;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final String sharedTemplateId;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final Boolean isFromWhoopCoach;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final boolean isCopyFlow;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final String entryPoint;

            public a(C18733e c18733e, InterfaceC4339a onInitialListPositionConsumed, Long l7, String str, String str2, Boolean bool, boolean z4, String str3) {
                AbstractC22676k.m65750j(onInitialListPositionConsumed, "onInitialListPositionConsumed");
                this.initialListPosition = c18733e;
                this.onInitialListPositionConsumed = onInitialListPositionConsumed;
                this.templateId = l7;
                this.activityId = str;
                this.sharedTemplateId = str2;
                this.isFromWhoopCoach = bool;
                this.isCopyFlow = z4;
                this.entryPoint = str3;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getActivityId() {
                return this.activityId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getEntryPoint() {
                return this.entryPoint;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final C18733e getInitialListPosition() {
                return this.initialListPosition;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final InterfaceC4339a getOnInitialListPositionConsumed() {
                return this.onInitialListPositionConsumed;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getSharedTemplateId() {
                return this.sharedTemplateId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.initialListPosition, aVar.initialListPosition) && AbstractC22676k.m65745e(this.onInitialListPositionConsumed, aVar.onInitialListPositionConsumed) && AbstractC22676k.m65745e(this.templateId, aVar.templateId) && AbstractC22676k.m65745e(this.activityId, aVar.activityId) && AbstractC22676k.m65745e(this.sharedTemplateId, aVar.sharedTemplateId) && AbstractC22676k.m65745e(this.isFromWhoopCoach, aVar.isFromWhoopCoach) && this.isCopyFlow == aVar.isCopyFlow && AbstractC22676k.m65745e(this.entryPoint, aVar.entryPoint);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Long getTemplateId() {
                return this.templateId;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getIsCopyFlow() {
                return this.isCopyFlow;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Boolean getIsFromWhoopCoach() {
                return this.isFromWhoopCoach;
            }

            public int hashCode() {
                C18733e c18733e = this.initialListPosition;
                int iM94755d = AbstractC30802r.m94755d((c18733e == null ? 0 : c18733e.hashCode()) * 31, 31, this.onInitialListPositionConsumed);
                Long l7 = this.templateId;
                int iHashCode = (iM94755d + (l7 == null ? 0 : l7.hashCode())) * 31;
                String str = this.activityId;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.sharedTemplateId;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.isFromWhoopCoach;
                int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isCopyFlow);
                String str3 = this.entryPoint;
                return iM8289b + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                C18733e c18733e = this.initialListPosition;
                InterfaceC4339a interfaceC4339a = this.onInitialListPositionConsumed;
                Long l7 = this.templateId;
                String str = this.activityId;
                String str2 = this.sharedTemplateId;
                Boolean bool = this.isFromWhoopCoach;
                boolean z4 = this.isCopyFlow;
                String str3 = this.entryPoint;
                StringBuilder sb4 = new StringBuilder("NavArgs(initialListPosition=");
                sb4.append(c18733e);
                sb4.append(", onInitialListPositionConsumed=");
                sb4.append(interfaceC4339a);
                sb4.append(", templateId=");
                sb4.append(l7);
                sb4.append(", activityId=");
                sb4.append(str);
                sb4.append(", sharedTemplateId=");
                AbstractC36095b.m114692t(bool, str2, ", isFromWhoopCoach=", ", isCopyFlow=", sb4);
                return AbstractC21702c.m61139j(sb4, z4, ", entryPoint=", str3, ")");
            }
        }

        private C10741d() {
            C12974m c12974m = new C12974m();
            m28048d(c12974m);
            C12953f c12953f = new C12953f("templateId", c12974m.f44811a.m36452a());
            C12974m c12974m2 = new C12974m();
            m28049e(c12974m2);
            C12953f c12953f2 = new C12953f("activityId", c12974m2.f44811a.m36452a());
            C12974m c12974m3 = new C12974m();
            m28050f(c12974m3);
            C12953f c12953f3 = new C12953f("sharedTemplateId", c12974m3.f44811a.m36452a());
            C12974m c12974m4 = new C12974m();
            m28051g(c12974m4);
            C12953f c12953f4 = new C12953f("isFromWhoopCoach", c12974m4.f44811a.m36452a());
            C12974m c12974m5 = new C12974m();
            m28052h(c12974m5);
            C12953f c12953f5 = new C12953f("isCopyFlow", c12974m5.f44811a.m36452a());
            C12974m c12974m6 = new C12974m();
            m28053i(c12974m6);
            super("editWorkout", null, AbstractC37056f.m118959K(c12953f, c12953f2, c12953f3, c12953f4, c12953f5, new C12953f("entryPoint", c12974m6.f44811a.m36452a())), new C9779c(14), 2, null);
        }

        /* JADX INFO: renamed from: d */
        private static final C23454a0 m28048d(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44761f);
            navArgument.m36461a(-1);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: e */
        private static final C23454a0 m28049e(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            navArgument.f44811a.f44789a = true;
            navArgument.m36461a(null);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: f */
        private static final C23454a0 m28050f(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            navArgument.f44811a.f44789a = true;
            navArgument.m36461a(null);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: g */
        private static final C23454a0 m28051g(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44767l);
            navArgument.m36461a(Boolean.FALSE);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: h */
        private static final C23454a0 m28052h(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44767l);
            navArgument.m36461a(Boolean.FALSE);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: i */
        private static final C23454a0 m28053i(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            navArgument.f44811a.f44789a = true;
            navArgument.m36461a(null);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:15:0x004d  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: j */
        public static final a m28054j(C12982q c12982q) {
            Long lValueOf;
            String string;
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            int i13 = 0;
            boolean z4 = bundleM36479a != null ? bundleM36479a.getBoolean("isCopyFlow") : false;
            Integer num = (Integer) c12982q.m36480b().m5001b("indexOfFirstNewGroup");
            C18733e c18733e = num != null ? new C18733e(num.intValue(), i13, 2, 0 == true ? 1 : 0) : null;
            C11129i c11129i = new C11129i(c12982q, 1);
            Bundle bundleM36479a2 = c12982q.m36479a();
            if (bundleM36479a2 != null) {
                long j7 = bundleM36479a2.getLong("templateId");
                lValueOf = Long.valueOf(j7);
                if (j7 <= -1) {
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            Bundle bundleM36479a3 = c12982q.m36479a();
            String str = (bundleM36479a3 == null || (string = bundleM36479a3.getString("activityId")) == null || string.length() <= 0) ? null : string;
            Bundle bundleM36479a4 = c12982q.m36479a();
            String string2 = bundleM36479a4 != null ? bundleM36479a4.getString("sharedTemplateId") : null;
            Bundle bundleM36479a5 = c12982q.m36479a();
            Boolean boolValueOf = bundleM36479a5 != null ? Boolean.valueOf(bundleM36479a5.getBoolean("isFromWhoopCoach")) : null;
            Bundle bundleM36479a6 = c12982q.m36479a();
            return new a(c18733e, c11129i, lValueOf, str, string2, boolValueOf, z4, bundleM36479a6 != null ? bundleM36479a6.getString("entryPoint") : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final C23454a0 m28055k(C12982q c12982q) {
            c12982q.m36480b().m5003d("indexOfFirstNewGroup");
            return C23454a0.f92919a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m28056n(C10741d c10741d, AbstractC12939a0 abstractC12939a0, long j7, String str, StrengthTrainerDestination strengthTrainerDestination, boolean z4, boolean z13, String str2, int i13, Object obj) {
            c10741d.m28058l(abstractC12939a0, (i13 & 1) != 0 ? -1L : j7, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? C10747j.f32796a : strengthTrainerDestination, (i13 & 8) != 0 ? false : z4, (i13 & 16) == 0 ? z13 : false, (i13 & 32) != 0 ? null : str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public static final C23454a0 m28057o(StrengthTrainerDestination strengthTrainerDestination, C12999y0 navigate) {
            AbstractC22676k.m65750j(navigate, "$this$navigate");
            if (strengthTrainerDestination != null) {
                String route = strengthTrainerDestination.getRoute();
                AbstractC22676k.m65750j(route, "route");
                if (AbstractC39414r.m125890i0(route)) {
                    throw new IllegalArgumentException("Cannot pop up to an empty route");
                }
                navigate.f44918e = route;
                navigate.f44917d = -1;
                navigate.f44919f = false;
                navigate.f44920g = false;
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: l */
        public final void m28058l(AbstractC12939a0 abstractC12939a0, long j7, String str, StrengthTrainerDestination<?> strengthTrainerDestination, boolean z4, boolean z13, String str2) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            abstractC12939a0.m36408w(routeWithArgs(new C23465k("templateId", Long.valueOf(j7)), new C23465k("activityId", str), new C23465k("isFromWhoopCoach", Boolean.valueOf(z4)), new C23465k("isCopyFlow", Boolean.valueOf(z13)), new C23465k("entryPoint", str2)), new C4780c(strengthTrainerDestination, 12));
        }

        /* JADX INFO: renamed from: m */
        public final void m28059m(AbstractC12939a0 abstractC12939a0, String sharedTemplateId) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(sharedTemplateId, "sharedTemplateId");
            AbstractC12939a0.m36374y(abstractC12939a0, routeWithArgs(new C23465k("sharedTemplateId", sharedTemplateId)), null, 6);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$e */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J=\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0011\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$e;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;", "<init>", "()V", "", "exerciseId", "", "showSelectExerciseCTA", "Lcu2/b;", "entryPointType", "analyticsEntryPoint", "isExerciseDetailsV2ExperimentEnabled", "j", "(Ljava/lang/String;ZLcu2/b;Ljava/lang/String;Z)Ljava/lang/String;", "Leb/a0;", "Ll83/a0;", "o", "(Leb/a0;Ljava/lang/String;ZLcu2/b;Ljava/lang/String;Z)V", "l", "(Leb/a0;Ljava/lang/String;Z)V", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10742e extends StrengthTrainerDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10742e f32774a = new C10742e();

        /* JADX INFO: renamed from: b */
        public static final int f32775b = 8;

        /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$e$a */
        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;", "", "", "exerciseId", "", "showCTA", "Lcu2/b;", "entryPointType", "analyticsEntryPoint", "isExerciseDetailsV2ExperimentEnabled", "<init>", "(Ljava/lang/String;ZLcu2/b;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "d", "()Z", "Lcu2/b;", "()Lcu2/b;", "e", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String exerciseId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final boolean showCTA;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final EnumC11122b entryPointType;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String analyticsEntryPoint;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final boolean isExerciseDetailsV2ExperimentEnabled;

            public a(String str, boolean z4, EnumC11122b entryPointType, String str2, boolean z13) {
                AbstractC22676k.m65750j(entryPointType, "entryPointType");
                this.exerciseId = str;
                this.showCTA = z4;
                this.entryPointType = entryPointType;
                this.analyticsEntryPoint = str2;
                this.isExerciseDetailsV2ExperimentEnabled = z13;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAnalyticsEntryPoint() {
                return this.analyticsEntryPoint;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EnumC11122b getEntryPointType() {
                return this.entryPointType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getExerciseId() {
                return this.exerciseId;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getShowCTA() {
                return this.showCTA;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getIsExerciseDetailsV2ExperimentEnabled() {
                return this.isExerciseDetailsV2ExperimentEnabled;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.exerciseId, aVar.exerciseId) && this.showCTA == aVar.showCTA && this.entryPointType == aVar.entryPointType && AbstractC22676k.m65745e(this.analyticsEntryPoint, aVar.analyticsEntryPoint) && this.isExerciseDetailsV2ExperimentEnabled == aVar.isExerciseDetailsV2ExperimentEnabled;
            }

            public int hashCode() {
                String str = this.exerciseId;
                int iHashCode = (this.entryPointType.hashCode() + AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.showCTA)) * 31;
                String str2 = this.analyticsEntryPoint;
                return Boolean.hashCode(this.isExerciseDetailsV2ExperimentEnabled) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public String toString() {
                String str = this.exerciseId;
                boolean z4 = this.showCTA;
                EnumC11122b enumC11122b = this.entryPointType;
                String str2 = this.analyticsEntryPoint;
                boolean z13 = this.isExerciseDetailsV2ExperimentEnabled;
                StringBuilder sbM73379l = AbstractC25012a.m73379l("NavArgs(exerciseId=", str, ", showCTA=", ", entryPointType=", z4);
                sbM73379l.append(enumC11122b);
                sbM73379l.append(", analyticsEntryPoint=");
                sbM73379l.append(str2);
                sbM73379l.append(", isExerciseDetailsV2ExperimentEnabled=");
                return AbstractC18489d0.m53372m(sbM73379l, z13, ")");
            }
        }

        private C10742e() {
            C12974m c12974m = new C12974m();
            m28071d(c12974m);
            C12953f c12953f = new C12953f("exerciseId", c12974m.f44811a.m36452a());
            C12974m c12974m2 = new C12974m();
            m28072e(c12974m2);
            List listM118959K = AbstractC37056f.m118959K(c12953f, new C12953f("showCTA", c12974m2.f44811a.m36452a()));
            C12974m c12974m3 = new C12974m();
            m28073f(c12974m3);
            C12953f c12953f2 = new C12953f("entryPointType", c12974m3.f44811a.m36452a());
            C12974m c12974m4 = new C12974m();
            m28074g(c12974m4);
            C12953f c12953f3 = new C12953f("analyticsEntryPoint", c12974m4.f44811a.m36452a());
            C12974m c12974m5 = new C12974m();
            m28075h(c12974m5);
            super("exerciseDetails", listM118959K, AbstractC37056f.m118959K(c12953f2, c12953f3, new C12953f("isExerciseDetailsV2ExperimentEnabled", c12974m5.f44811a.m36452a())), new C9779c(15), null);
        }

        /* JADX INFO: renamed from: d */
        private static final C23454a0 m28071d(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: e */
        private static final C23454a0 m28072e(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44767l);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: f */
        private static final C23454a0 m28073f(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            navArgument.m36461a("INTERNAL");
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: g */
        private static final C23454a0 m28074g(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            navArgument.m36461a("");
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: h */
        private static final C23454a0 m28075h(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44767l);
            navArgument.m36461a(Boolean.FALSE);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final a m28076i(C12982q c12982q) {
            Object next;
            String string;
            String strName;
            Bundle bundleM36479a;
            AbstractC22676k.m65750j(c12982q, "<this>");
            Iterator<E> it = EnumC11122b.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                strName = ((EnumC11122b) next).name();
                bundleM36479a = c12982q.m36479a();
            } while (!AbstractC22676k.m65745e(strName, bundleM36479a != null ? bundleM36479a.getString("entryPointType") : null));
            EnumC11122b enumC11122b = (EnumC11122b) next;
            if (enumC11122b == null) {
                enumC11122b = EnumC11122b.INTERNAL;
            }
            EnumC11122b enumC11122b2 = enumC11122b;
            Bundle bundleM36479a2 = c12982q.m36479a();
            String string2 = bundleM36479a2 != null ? bundleM36479a2.getString("exerciseId") : null;
            Bundle bundleM36479a3 = c12982q.m36479a();
            boolean z4 = bundleM36479a3 != null ? bundleM36479a3.getBoolean("showCTA") : false;
            Bundle bundleM36479a4 = c12982q.m36479a();
            String str = (bundleM36479a4 == null || (string = bundleM36479a4.getString("analyticsEntryPoint")) == null || string.length() == 0) ? null : string;
            Bundle bundleM36479a5 = c12982q.m36479a();
            return new a(string2, z4, enumC11122b2, str, bundleM36479a5 != null ? bundleM36479a5.getBoolean("isExerciseDetailsV2ExperimentEnabled") : false);
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ String m28077k(C10742e c10742e, String str, boolean z4, EnumC11122b enumC11122b, String str2, boolean z13, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                enumC11122b = EnumC11122b.INTERNAL;
            }
            EnumC11122b enumC11122b2 = enumC11122b;
            if ((i13 & 8) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i13 & 16) != 0) {
                z13 = false;
            }
            return c10742e.m28081j(str, z4, enumC11122b2, str3, z13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public static final C23454a0 m28078m(C12999y0 navigate) {
            AbstractC22676k.m65750j(navigate, "$this$navigate");
            navigate.m36510b(C10739b.f32758a.getRoute(), new C9779c(17));
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static final C23454a0 m28079n(C12970k1 popUpTo) {
            AbstractC22676k.m65750j(popUpTo, "$this$popUpTo");
            popUpTo.f44796a = true;
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ void m28080p(C10742e c10742e, AbstractC12939a0 abstractC12939a0, String str, boolean z4, EnumC11122b enumC11122b, String str2, boolean z13, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                enumC11122b = EnumC11122b.INTERNAL;
            }
            EnumC11122b enumC11122b2 = enumC11122b;
            if ((i13 & 8) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i13 & 16) != 0) {
                z13 = false;
            }
            c10742e.m28083o(abstractC12939a0, str, z4, enumC11122b2, str3, z13);
        }

        /* JADX INFO: renamed from: j */
        public final String m28081j(String exerciseId, boolean showSelectExerciseCTA, EnumC11122b entryPointType, String analyticsEntryPoint, boolean isExerciseDetailsV2ExperimentEnabled) {
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            AbstractC22676k.m65750j(entryPointType, "entryPointType");
            C23465k c23465k = new C23465k("exerciseId", exerciseId);
            C23465k c23465k2 = new C23465k("showCTA", Boolean.valueOf(showSelectExerciseCTA));
            C23465k c23465k3 = new C23465k("entryPointType", entryPointType.name());
            if (analyticsEntryPoint == null) {
                analyticsEntryPoint = "";
            }
            return routeWithArgs(c23465k, c23465k2, c23465k3, new C23465k("analyticsEntryPoint", analyticsEntryPoint), new C23465k("isExerciseDetailsV2ExperimentEnabled", Boolean.valueOf(isExerciseDetailsV2ExperimentEnabled)));
        }

        /* JADX INFO: renamed from: l */
        public final void m28082l(AbstractC12939a0 abstractC12939a0, String exerciseId, boolean z4) {
            C1601k1 c1601k1M36480b;
            C12977n0 c12977n0;
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            C12982q c12982qM36398m = abstractC12939a0.m36398m();
            if (!AbstractC22676k.m65745e((c12982qM36398m == null || (c12977n0 = c12982qM36398m.f44844x) == null) ? null : c12977n0.f44820I, getRoute())) {
                abstractC12939a0.m36408w(m28077k(this, exerciseId, false, null, null, z4, 12, null), new C9779c(16));
                return;
            }
            C12982q c12982qM36398m2 = abstractC12939a0.m36398m();
            if (c12982qM36398m2 != null && (c1601k1M36480b = c12982qM36398m2.m36480b()) != null) {
                c1601k1M36480b.m5004e(exerciseId, "exerciseDetailsRefresh");
            }
            abstractC12939a0.m36410z();
        }

        /* JADX INFO: renamed from: o */
        public final void m28083o(AbstractC12939a0 abstractC12939a0, String exerciseId, boolean z4, EnumC11122b entryPointType, String str, boolean z13) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            AbstractC22676k.m65750j(entryPointType, "entryPointType");
            C23465k c23465k = new C23465k("exerciseId", exerciseId);
            C23465k c23465k2 = new C23465k("showCTA", Boolean.valueOf(z4));
            C23465k c23465k3 = new C23465k("entryPointType", entryPointType.name());
            if (str == null) {
                str = "";
            }
            AbstractC12939a0.m36374y(abstractC12939a0, routeWithArgs(c23465k, c23465k2, c23465k3, new C23465k("analyticsEntryPoint", str), new C23465k("isExerciseDetailsV2ExperimentEnabled", Boolean.valueOf(z13))), null, 6);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$f */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$f;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;", "<init>", "()V", "Leb/a0;", "", "isBuildingNewWorkout", "Ll83/a0;", "d", "(Leb/a0;Z)V", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10743f extends StrengthTrainerDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10743f f32781a = new C10743f();

        /* JADX INFO: renamed from: b */
        public static final int f32782b = 8;

        /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$f$a */
        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$f$a;", "", "", "isBuildingNewWorkout", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean isBuildingNewWorkout;

            public a(boolean z4) {
                this.isBuildingNewWorkout = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getIsBuildingNewWorkout() {
                return this.isBuildingNewWorkout;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && this.isBuildingNewWorkout == ((a) other).isBuildingNewWorkout;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isBuildingNewWorkout);
            }

            public String toString() {
                return AbstractC3855a.m11827k("NavArgs(isBuildingNewWorkout=", ")", this.isBuildingNewWorkout);
            }
        }

        private C10743f() {
            C12974m c12974m = new C12974m();
            m28090b(c12974m);
            super("inputWorkoutName", AbstractC37056f.m118958J(new C12953f("isBuildingNewWorkout", c12974m.f44811a.m36452a())), null, new C9779c(18), 4, null);
        }

        /* JADX INFO: renamed from: b */
        private static final C23454a0 m28090b(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44767l);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final a m28091c(C12982q c12982q) {
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            return new a(bundleM36479a != null ? bundleM36479a.getBoolean("isBuildingNewWorkout") : true);
        }

        /* JADX INFO: renamed from: d */
        public final void m28092d(AbstractC12939a0 abstractC12939a0, boolean z4) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC12939a0.m36374y(abstractC12939a0, routeWithArgs(new C23465k("isBuildingNewWorkout", Boolean.valueOf(z4))), null, 6);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$g */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$g;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;", "<init>", "()V", "", "linkActivityId", "source", "e", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10744g extends StrengthTrainerDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10744g f32784a = new C10744g();

        /* JADX INFO: renamed from: b */
        public static final int f32785b = 8;

        /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$g$a */
        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;", "", "", "linkActivityId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String linkActivityId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String source;

            public a(String linkActivityId, String source) {
                AbstractC22676k.m65750j(linkActivityId, "linkActivityId");
                AbstractC22676k.m65750j(source, "source");
                this.linkActivityId = linkActivityId;
                this.source = source;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getLinkActivityId() {
                return this.linkActivityId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getSource() {
                return this.source;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.linkActivityId, aVar.linkActivityId) && AbstractC22676k.m65745e(this.source, aVar.source);
            }

            public int hashCode() {
                return this.source.hashCode() + (this.linkActivityId.hashCode() * 31);
            }

            public String toString() {
                return AbstractC2875y.m8300m("NavArgs(linkActivityId=", this.linkActivityId, ", source=", this.source, ")");
            }
        }

        private C10744g() {
            C12974m c12974m = new C12974m();
            m28095b(c12974m);
            C12953f c12953f = new C12953f("activityId", c12974m.f44811a.m36452a());
            C12974m c12974m2 = new C12974m();
            m28096c(c12974m2);
            super("linkWorkoutScreen", AbstractC37056f.m118959K(c12953f, new C12953f("source", c12974m2.f44811a.m36452a())), null, new C9779c(19), 4, null);
        }

        /* JADX INFO: renamed from: b */
        private static final C23454a0 m28095b(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: c */
        private static final C23454a0 m28096c(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final a m28097d(C12982q c12982q) {
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            String string = bundleM36479a != null ? bundleM36479a.getString("activityId") : null;
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Bundle bundleM36479a2 = c12982q.m36479a();
            String string2 = bundleM36479a2 != null ? bundleM36479a2.getString("source") : null;
            if (string2 != null) {
                return new a(string, string2);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        /* JADX INFO: renamed from: e */
        public final String m28098e(String linkActivityId, String source) {
            AbstractC22676k.m65750j(linkActivityId, "linkActivityId");
            AbstractC22676k.m65750j(source, "source");
            return routeWithArgs(new C23465k("activityId", linkActivityId), new C23465k("source", source));
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$h */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\f*\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\f*\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$h;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;", "<init>", "()V", "", "isLinkingExercise", "", "exerciseDetailsSource", "e", "(ZLjava/lang/String;)Ljava/lang/String;", "Leb/a0;", "Ll83/a0;", "g", "(Leb/a0;ZLjava/lang/String;)V", "", "indexOfFirstNewGroup", "popUpToDestination", "f", "(Leb/a0;Ljava/lang/Integer;Lcom/whoop/weightlifting/StrengthTrainerDestination;)V", "exerciseIdToSelect", "i", "(Leb/a0;Ljava/lang/String;)Z", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10745h extends StrengthTrainerDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10745h f32788a = new C10745h();

        /* JADX INFO: renamed from: b */
        public static final int f32789b = 8;

        /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$h$a */
        @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$h$a;", "", "", "exerciseIdToSelect", "", "isLinkingExercise", "exerciseDetailsSource", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String exerciseIdToSelect;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final boolean isLinkingExercise;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String exerciseDetailsSource;

            public a(String str, boolean z4, String exerciseDetailsSource) {
                AbstractC22676k.m65750j(exerciseDetailsSource, "exerciseDetailsSource");
                this.exerciseIdToSelect = str;
                this.isLinkingExercise = z4;
                this.exerciseDetailsSource = exerciseDetailsSource;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getExerciseDetailsSource() {
                return this.exerciseDetailsSource;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getExerciseIdToSelect() {
                return this.exerciseIdToSelect;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getIsLinkingExercise() {
                return this.isLinkingExercise;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.exerciseIdToSelect, aVar.exerciseIdToSelect) && this.isLinkingExercise == aVar.isLinkingExercise && AbstractC22676k.m65745e(this.exerciseDetailsSource, aVar.exerciseDetailsSource);
            }

            public int hashCode() {
                String str = this.exerciseIdToSelect;
                return this.exerciseDetailsSource.hashCode() + AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.isLinkingExercise);
            }

            public String toString() {
                return AbstractC25012a.m73376i(this.exerciseDetailsSource, ")", AbstractC25012a.m73379l("NavArgs(exerciseIdToSelect=", this.exerciseIdToSelect, ", isLinkingExercise=", ", exerciseDetailsSource=", this.isLinkingExercise));
            }
        }

        private C10745h() {
            C12974m c12974m = new C12974m();
            m28102b(c12974m);
            List listM118958J = AbstractC37056f.m118958J(new C12953f("linkingExerciseFlow", c12974m.f44811a.m36452a()));
            C12974m c12974m2 = new C12974m();
            m28103c(c12974m2);
            super("selectExercises", listM118958J, AbstractC37056f.m118958J(new C12953f("exerciseDetailsSource", c12974m2.f44811a.m36452a())), new C9779c(20), null);
        }

        /* JADX INFO: renamed from: b */
        private static final C23454a0 m28102b(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44767l);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: c */
        private static final C23454a0 m28103c(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            navArgument.m36461a("Workout Builder");
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final a m28104d(C12982q c12982q) {
            String string;
            AbstractC22676k.m65750j(c12982q, "<this>");
            String str = (String) c12982q.m36480b().m5001b("exerciseIdToSelect");
            c12982q.m36480b().m5003d("exerciseIdToSelect");
            Bundle bundleM36479a = c12982q.m36479a();
            boolean z4 = bundleM36479a != null ? bundleM36479a.getBoolean("linkingExerciseFlow") : false;
            Bundle bundleM36479a2 = c12982q.m36479a();
            if (bundleM36479a2 == null || (string = bundleM36479a2.getString("exerciseDetailsSource")) == null) {
                string = "Workout Builder";
            }
            return new a(str, z4, string);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m28105h(C10745h c10745h, AbstractC12939a0 abstractC12939a0, boolean z4, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = false;
            }
            if ((i13 & 2) != 0) {
                str = "Workout Builder";
            }
            c10745h.m28108g(abstractC12939a0, z4, str);
        }

        /* JADX INFO: renamed from: e */
        public final String m28106e(boolean isLinkingExercise, String exerciseDetailsSource) {
            AbstractC22676k.m65750j(exerciseDetailsSource, "exerciseDetailsSource");
            return routeWithArgs(new C23465k("linkingExerciseFlow", Boolean.valueOf(isLinkingExercise)), new C23465k("exerciseDetailsSource", exerciseDetailsSource));
        }

        /* JADX INFO: renamed from: f */
        public final void m28107f(AbstractC12939a0 abstractC12939a0, Integer num, StrengthTrainerDestination<?> popUpToDestination) {
            C1601k1 c1601k1M36480b;
            C12977n0 c12977n0;
            C12977n0 c12977n1;
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(popUpToDestination, "popUpToDestination");
            C12982q c12982qM36393h = abstractC12939a0.m36393h();
            String str = null;
            if (AbstractC22676k.m65745e((c12982qM36393h == null || (c12977n1 = c12982qM36393h.f44844x) == null) ? null : c12977n1.f44820I, f32788a.getRoute())) {
                C12982q c12982qM36398m = abstractC12939a0.m36398m();
                if (c12982qM36398m != null && (c12977n0 = c12982qM36398m.f44844x) != null) {
                    str = c12977n0.f44820I;
                }
                C10741d c10741d = C10741d.f32764a;
                if (!AbstractC22676k.m65745e(str, c10741d.getRoute()) && !AbstractC22676k.m65745e(str, C10738a.f32750a.getRoute())) {
                    C10741d.m28056n(c10741d, abstractC12939a0, 0L, null, popUpToDestination, false, false, null, 59, null);
                    return;
                }
                C12982q c12982qM36398m2 = abstractC12939a0.m36398m();
                if (c12982qM36398m2 != null && (c1601k1M36480b = c12982qM36398m2.m36480b()) != null) {
                    c1601k1M36480b.m5004e(num, "indexOfFirstNewGroup");
                }
                abstractC12939a0.m36410z();
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m28108g(AbstractC12939a0 abstractC12939a0, boolean z4, String exerciseDetailsSource) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(exerciseDetailsSource, "exerciseDetailsSource");
            AbstractC12939a0.m36374y(abstractC12939a0, m28106e(z4, exerciseDetailsSource), null, 6);
        }

        /* JADX INFO: renamed from: i */
        public final boolean m28109i(AbstractC12939a0 abstractC12939a0, String exerciseIdToSelect) {
            C12982q c12982qM36398m;
            C1601k1 c1601k1M36480b;
            C12977n0 c12977n0;
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(exerciseIdToSelect, "exerciseIdToSelect");
            C12982q c12982qM36398m2 = abstractC12939a0.m36398m();
            if (AbstractC22676k.m65745e((c12982qM36398m2 == null || (c12977n0 = c12982qM36398m2.f44844x) == null) ? null : c12977n0.f44820I, f32788a.getRoute()) && (c12982qM36398m = abstractC12939a0.m36398m()) != null && (c1601k1M36480b = c12982qM36398m.m36480b()) != null) {
                c1601k1M36480b.m5004e(exerciseIdToSelect, "exerciseIdToSelect");
            }
            return abstractC12939a0.m36410z();
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$i */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$i;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;", "<init>", "()V", "Leb/a0;", "", "workoutTemplateId", "Ll83/a0;", "d", "(Leb/a0;Ljava/lang/String;)V", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10746i extends StrengthTrainerDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10746i f32793a = new C10746i();

        /* JADX INFO: renamed from: b */
        public static final int f32794b = 8;

        /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$i$a */
        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;", "", "", "workoutTemplateId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String workoutTemplateId;

            public a(String workoutTemplateId) {
                AbstractC22676k.m65750j(workoutTemplateId, "workoutTemplateId");
                this.workoutTemplateId = workoutTemplateId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getWorkoutTemplateId() {
                return this.workoutTemplateId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.workoutTemplateId, ((a) other).workoutTemplateId);
            }

            public int hashCode() {
                return this.workoutTemplateId.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("NavArgs(workoutTemplateId=", this.workoutTemplateId, ")");
            }
        }

        private C10746i() {
            C12974m c12974m = new C12974m();
            m28114b(c12974m);
            super("workoutDetails", AbstractC37056f.m118958J(new C12953f("templateId", c12974m.f44811a.m36452a())), null, new C9779c(21), 4, null);
        }

        /* JADX INFO: renamed from: b */
        private static final C23454a0 m28114b(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final a m28115c(C12982q c12982q) {
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            String string = bundleM36479a != null ? bundleM36479a.getString("templateId") : null;
            if (string != null) {
                return new a(string);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        /* JADX INFO: renamed from: d */
        public final void m28116d(AbstractC12939a0 abstractC12939a0, String workoutTemplateId) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(workoutTemplateId, "workoutTemplateId");
            AbstractC12939a0.m36374y(abstractC12939a0, routeWithArgs(new C23465k("templateId", workoutTemplateId)), null, 6);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$j */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$j;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;", "<init>", "()V", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10747j extends StrengthTrainerDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10747j f32796a = new C10747j();

        /* JADX INFO: renamed from: b */
        public static final int f32797b = 8;

        /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerDestination$j$a */
        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$j$a;", "", "", "tabIndex", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getTabIndex", "()Ljava/lang/Integer;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final Integer tabIndex;

            public a(Integer num) {
                this.tabIndex = num;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.tabIndex, ((a) other).tabIndex);
            }

            public int hashCode() {
                Integer num = this.tabIndex;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public String toString() {
                return "NavArgs(tabIndex=" + this.tabIndex + ")";
            }
        }

        private C10747j() {
            super("workoutLibrary", null, null, new C9779c(22), 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final a m28119b(C12982q c12982q) {
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            return new a(Integer.valueOf(bundleM36479a != null ? bundleM36479a.getInt("workoutTabIndex") : 0));
        }
    }

    public /* synthetic */ StrengthTrainerDestination(String str, List list, List list2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, function1);
    }

    public final List<C12953f> getArguments() {
        return this.arguments;
    }

    public final String getName() {
        return this.name;
    }

    public final Function1 getNavArgsFactory() {
        return this.navArgsFactory;
    }

    public final String getRoute() {
        return this.route;
    }

    public final String routeWithArgs(C23465k... args) {
        AbstractC22676k.m65750j(args, "args");
        Map mapM74002k0 = AbstractC25247g0.m74002k0(args);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM74002k0.entrySet()) {
            String str = (String) entry.getKey();
            List<C12953f> list = this.requiredArguments;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C12953f) it.next()).f44731a);
            }
            if (arrayList.contains(str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : mapM74002k0.entrySet()) {
            String str2 = (String) entry2.getKey();
            List<C12953f> list2 = this.optionalArguments;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C12953f) it3.next()).f44731a);
            }
            if (arrayList2.contains(str2)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        String strM125926K = this.route;
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            strM125926K = AbstractC39421y.m125926K(strM125926K, AbstractC11895b.m31996o("{", (String) entry3.getKey(), "}"), String.valueOf(entry3.getValue()), false);
        }
        Uri.Builder builderClearQuery = Uri.parse(strM125926K).buildUpon().clearQuery();
        for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
            String str3 = (String) entry4.getKey();
            Object value = entry4.getValue();
            if (value != null) {
                builderClearQuery.appendQueryParameter(str3, value.toString());
            }
        }
        String string = builderClearQuery.build().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    private StrengthTrainerDestination(String str, List<C12953f> list, List<C12953f> list2, Function1 function1) {
        this.name = str;
        this.requiredArguments = list;
        this.optionalArguments = list2;
        this.navArgsFactory = function1;
        this.arguments = AbstractC25265s.m74129g1(list, list2);
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sbM53374o.append("/{" + ((C12953f) it.next()).f44731a + "}");
        }
        int i13 = 0;
        for (Object obj : this.optionalArguments) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C12953f c12953f = (C12953f) obj;
            if (i13 == 0) {
                sbM53374o.append("?");
            } else {
                sbM53374o.append("&");
            }
            String str2 = c12953f.f44731a;
            sbM53374o.append(str2 + "={" + str2 + "}");
            i13 = i14;
        }
        this.route = sbM53374o.toString();
        String str3 = this.name;
        for (int i15 = 0; i15 < str3.length(); i15++) {
            if (!Character.isLetterOrDigit(str3.charAt(i15))) {
                throw new IllegalArgumentException("destination name must be alphanumeric");
            }
        }
        List<C12953f> list3 = this.arguments;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                String str4 = ((C12953f) it3.next()).f44731a;
                for (int i16 = 0; i16 < str4.length(); i16++) {
                    if (!Character.isLetterOrDigit(str4.charAt(i16))) {
                        throw new IllegalArgumentException("nav arg name must be alphanumeric");
                    }
                }
            }
        }
        List<C12953f> list4 = this.requiredArguments;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                if (((C12953f) it4.next()).f44732b.f44800c) {
                    throw new IllegalArgumentException("required nav args cannot have default value");
                }
            }
        }
        List<C12953f> list5 = this.optionalArguments;
        if ((list5 instanceof Collection) && list5.isEmpty()) {
            return;
        }
        Iterator<T> it5 = list5.iterator();
        while (it5.hasNext()) {
            if (!((C12953f) it5.next()).f44732b.f44800c) {
                throw new IllegalArgumentException("optional nav args must have default value");
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StrengthTrainerDestination(String str, List list, List list2, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(str, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, function1, null);
    }
}
