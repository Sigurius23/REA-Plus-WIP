package com.whoop.universalcheckout.features;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Keep;
import ep2.InterfaceC13429a;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mn2.EnumC25719b;
import np2.InterfaceC27034a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p114eb.AbstractC12958g1;
import p114eb.C12953f;
import p114eb.C12970k1;
import p114eb.C12974m;
import p114eb.C12982q;
import p114eb.C12999y0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pl0.C29344b;
import pn2.C29381a;
import po2.InterfaceC29402a;
import vp2.InterfaceC36274a;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005\u001f !\"#BE\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0011\u001a\u00020\u00032.\u0010\u0010\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f0\u000e\"\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\u0082\u0001\u0005$%&'(¨\u0006)"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;", "ARGS", "", "", "name", "", "Leb/f;", "requiredArguments", "optionalArguments", "Lkotlin/Function1;", "Leb/q;", "navArgsFactory", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "", "Ll83/k;", "args", "routeWithArgs", "([Ll83/k;)Ljava/lang/String;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "getNavArgsFactory", "()Lkotlin/jvm/functions/Function1;", "arguments", "getArguments", "()Ljava/util/List;", "route", "getRoute", "a", "c", "d", "e", "b", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class UniversalCheckoutDestination<ARGS> {
    public static final int $stable = 8;
    private final List<C12953f> arguments;
    private final String name;
    private final Function1 navArgsFactory;
    private final List<C12953f> optionalArguments;
    private final List<C12953f> requiredArguments;
    private final String route;

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.UniversalCheckoutDestination$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;", "Lpn2/a;", "<init>", "()V", "Leb/a0;", "Lpo2/a$a;", "a", "(Leb/a0;)Lpo2/a$a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10629a extends UniversalCheckoutDestination<C29381a> {

        /* JADX INFO: renamed from: a */
        public static final C10629a f32377a = new C10629a();

        /* JADX INFO: renamed from: b */
        public static final int f32378b = 8;

        private C10629a() {
            super("checkout", null, null, AbstractC10635a.f32402a, 6, null);
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC29402a.a m27488a(AbstractC12939a0 abstractC12939a0) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            if (abstractC12939a0.m36410z()) {
                return new InterfaceC29402a.j(C10636b.f32403a.m27565a());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.UniversalCheckoutDestination$b */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;", "<init>", "()V", "Leb/a0;", "", "cartId", "Ll83/a0;", "d", "(Leb/a0;Ljava/lang/String;)V", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10630b extends UniversalCheckoutDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10630b f32379a = new C10630b();

        /* JADX INFO: renamed from: b */
        public static final int f32380b = 8;

        /* JADX INFO: renamed from: com.whoop.universalcheckout.features.UniversalCheckoutDestination$b$a */
        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b$a;", "", "", "cartId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String cartId;

            public a(String cartId) {
                AbstractC22676k.m65750j(cartId, "cartId");
                this.cartId = cartId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCartId() {
                return this.cartId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.cartId, ((a) other).cartId);
            }

            public int hashCode() {
                return this.cartId.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("NavArgs(cartId=", this.cartId, ")");
            }
        }

        private C10630b() {
            C12974m c12974m = new C12974m();
            m27490b(c12974m);
            super("externalWebCheckout", AbstractC37056f.m118958J(new C12953f("cartId", c12974m.f44811a.m36452a())), null, new C29344b(1), 4, null);
        }

        /* JADX INFO: renamed from: b */
        private static final C23454a0 m27490b(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final a m27491c(C12982q c12982q) {
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            String string = bundleM36479a != null ? bundleM36479a.getString("cartId") : null;
            if (string != null) {
                return new a(string);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        /* JADX INFO: renamed from: d */
        public final void m27492d(AbstractC12939a0 abstractC12939a0, String cartId) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(cartId, "cartId");
            AbstractC12939a0.m36374y(abstractC12939a0, routeWithArgs(new C23465k("cartId", cartId)), null, 6);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.UniversalCheckoutDestination$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;", "<init>", "()V", "Leb/a0;", "", "cartId", "Ll83/a0;", "g", "(Leb/a0;Ljava/lang/String;)V", "Lep2/a$a;", "f", "(Leb/a0;)Lep2/a$a;", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10631c extends UniversalCheckoutDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10631c f32382a = new C10631c();

        /* JADX INFO: renamed from: b */
        public static final int f32383b = 8;

        /* JADX INFO: renamed from: com.whoop.universalcheckout.features.UniversalCheckoutDestination$c$a */
        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c$a;", "", "", "cartId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String cartId;

            public a(String cartId) {
                AbstractC22676k.m65750j(cartId, "cartId");
                this.cartId = cartId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCartId() {
                return this.cartId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.cartId, ((a) other).cartId);
            }

            public int hashCode() {
                return this.cartId.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("NavArgs(cartId=", this.cartId, ")");
            }
        }

        private C10631c() {
            C12974m c12974m = new C12974m();
            m27497d(c12974m);
            super("receiptOrder", AbstractC37056f.m118958J(new C12953f("cartId", c12974m.f44811a.m36452a())), null, new C29344b(2), 4, null);
        }

        /* JADX INFO: renamed from: d */
        private static final C23454a0 m27497d(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final a m27498e(C12982q c12982q) {
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            String string = bundleM36479a != null ? bundleM36479a.getString("cartId") : null;
            if (string != null) {
                return new a(string);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m27499h(C12999y0 navigate) {
            AbstractC22676k.m65750j(navigate, "$this$navigate");
            navigate.m36510b(C10629a.f32377a.getRoute(), new C29344b(4));
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final C23454a0 m27500i(C12970k1 popUpTo) {
            AbstractC22676k.m65750j(popUpTo, "$this$popUpTo");
            popUpTo.f44796a = true;
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: f */
        public final InterfaceC13429a.a m27501f(AbstractC12939a0 abstractC12939a0) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            if (abstractC12939a0.m36410z()) {
                return new InterfaceC13429a.f(C10636b.f32403a.m27565a());
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public final void m27502g(AbstractC12939a0 abstractC12939a0, String cartId) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(cartId, "cartId");
            abstractC12939a0.m36408w(routeWithArgs(new C23465k("cartId", cartId)), new C29344b(3));
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.UniversalCheckoutDestination$d */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;", "<init>", "()V", "Leb/a0;", "", "cartId", "source", "Ll83/a0;", "f", "(Leb/a0;Ljava/lang/String;Ljava/lang/String;)V", "Lnp2/a$a;", "e", "(Leb/a0;Ljava/lang/String;)Lnp2/a$a;", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10632d extends UniversalCheckoutDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10632d f32385a = new C10632d();

        /* JADX INFO: renamed from: b */
        public static final int f32386b = 8;

        /* JADX INFO: renamed from: com.whoop.universalcheckout.features.UniversalCheckoutDestination$d$a */
        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d$a;", "", "", "cartId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String cartId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String source;

            public a(String cartId, String source) {
                AbstractC22676k.m65750j(cartId, "cartId");
                AbstractC22676k.m65750j(source, "source");
                this.cartId = cartId;
                this.source = source;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCartId() {
                return this.cartId;
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
                return AbstractC22676k.m65745e(this.cartId, aVar.cartId) && AbstractC22676k.m65745e(this.source, aVar.source);
            }

            public int hashCode() {
                return this.source.hashCode() + (this.cartId.hashCode() * 31);
            }

            public String toString() {
                return AbstractC2875y.m8300m("NavArgs(cartId=", this.cartId, ", source=", this.source, ")");
            }
        }

        private C10632d() {
            C12974m c12974m = new C12974m();
            m27505b(c12974m);
            List listM118958J = AbstractC37056f.m118958J(new C12953f("cartId", c12974m.f44811a.m36452a()));
            C12974m c12974m2 = new C12974m();
            m27506c(c12974m2);
            super("shippingAddress", listM118958J, AbstractC37056f.m118958J(new C12953f("source", c12974m2.f44811a.m36452a())), new C29344b(5), null);
        }

        /* JADX INFO: renamed from: b */
        private static final C23454a0 m27505b(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: c */
        private static final C23454a0 m27506c(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            String strM27565a = C10636b.f32403a.m27565a();
            if (strM27565a.length() == 0) {
                strM27565a = EnumC25719b.JOIN.getValue();
            }
            navArgument.m36461a(strM27565a);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final a m27507d(C12982q c12982q) {
            String strM27565a;
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            String string = bundleM36479a != null ? bundleM36479a.getString("cartId") : null;
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Bundle bundleM36479a2 = c12982q.m36479a();
            if (bundleM36479a2 == null || (strM27565a = bundleM36479a2.getString("source")) == null) {
                strM27565a = C10636b.f32403a.m27565a();
                if (strM27565a.length() == 0) {
                    strM27565a = EnumC25719b.JOIN.getValue();
                }
            }
            return new a(string, strM27565a);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m27508g(C10632d c10632d, AbstractC12939a0 abstractC12939a0, String str, String str2, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str2 = C10636b.f32403a.m27565a();
                if (str2.length() == 0) {
                    str2 = EnumC25719b.JOIN.getValue();
                }
            }
            c10632d.m27510f(abstractC12939a0, str, str2);
        }

        /* JADX INFO: renamed from: e */
        public final InterfaceC27034a.a m27509e(AbstractC12939a0 abstractC12939a0, String source) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(source, "source");
            if (abstractC12939a0.m36410z()) {
                return new InterfaceC27034a.i(source);
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public final void m27510f(AbstractC12939a0 abstractC12939a0, String cartId, String source) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(cartId, "cartId");
            AbstractC22676k.m65750j(source, "source");
            AbstractC12939a0.m36374y(abstractC12939a0, routeWithArgs(new C23465k("cartId", cartId), new C23465k("source", source)), null, 6);
        }
    }

    /* JADX INFO: renamed from: com.whoop.universalcheckout.features.UniversalCheckoutDestination$e */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination;", "Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;", "<init>", "()V", "Leb/a0;", "", "cartId", "Ll83/a0;", "e", "(Leb/a0;Ljava/lang/String;)V", "Lvp2/a$a;", "d", "(Leb/a0;)Lvp2/a$a;", "a", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10633e extends UniversalCheckoutDestination<a> {

        /* JADX INFO: renamed from: a */
        public static final C10633e f32389a = new C10633e();

        /* JADX INFO: renamed from: b */
        public static final int f32390b = 8;

        /* JADX INFO: renamed from: com.whoop.universalcheckout.features.UniversalCheckoutDestination$e$a */
        @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e$a;", "", "", "cartId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String cartId;

            public a(String cartId) {
                AbstractC22676k.m65750j(cartId, "cartId");
                this.cartId = cartId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCartId() {
                return this.cartId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.cartId, ((a) other).cartId);
            }

            public int hashCode() {
                return this.cartId.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("NavArgs(cartId=", this.cartId, ")");
            }
        }

        private C10633e() {
            C12974m c12974m = new C12974m();
            m27514b(c12974m);
            super("shippingMethod", AbstractC37056f.m118958J(new C12953f("cartId", c12974m.f44811a.m36452a())), null, new C29344b(6), 4, null);
        }

        /* JADX INFO: renamed from: b */
        private static final C23454a0 m27514b(C12974m navArgument) {
            AbstractC22676k.m65750j(navArgument, "$this$navArgument");
            navArgument.m36462b(AbstractC12958g1.f44770o);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final a m27515c(C12982q c12982q) {
            AbstractC22676k.m65750j(c12982q, "<this>");
            Bundle bundleM36479a = c12982q.m36479a();
            String string = bundleM36479a != null ? bundleM36479a.getString("cartId") : null;
            if (string != null) {
                return new a(string);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        /* JADX INFO: renamed from: d */
        public final InterfaceC36274a.a m27516d(AbstractC12939a0 abstractC12939a0) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            if (abstractC12939a0.m36410z()) {
                return new InterfaceC36274a.d(C10636b.f32403a.m27565a());
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final void m27517e(AbstractC12939a0 abstractC12939a0, String cartId) {
            AbstractC22676k.m65750j(abstractC12939a0, "<this>");
            AbstractC22676k.m65750j(cartId, "cartId");
            AbstractC12939a0.m36374y(abstractC12939a0, routeWithArgs(new C23465k("cartId", cartId)), null, 6);
        }
    }

    public /* synthetic */ UniversalCheckoutDestination(String str, List list, List list2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
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
            builderClearQuery.appendQueryParameter((String) entry4.getKey(), String.valueOf(entry4.getValue()));
        }
        String string = builderClearQuery.build().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    private UniversalCheckoutDestination(String str, List<C12953f> list, List<C12953f> list2, Function1 function1) {
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
    public /* synthetic */ UniversalCheckoutDestination(String str, List list, List list2, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(str, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, function1, null);
    }
}
