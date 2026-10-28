package de1;

import ad3.AbstractC0757c;
import bc3.AbstractC3006f0;
import c41.C4092p2;
import c41.C4103r;
import c93.InterfaceC4351m;
import ce1.C4491b;
import ce1.C4492c;
import ce1.InterfaceC4490a;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.editactivities.network.EditActivitiesDrawerApi;
import com.whoop.editactivities.network.model.EditActivitiesDrawerContent;
import com.whoop.editactivities.network.model.EditActivitiesDrawerErrorResponse;
import com.whoop.editactivities.network.model.EditActivitiesDrawerResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jb1.C21535a;
import js0.AbstractC21907a;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23653j2;
import p720m91.InterfaceC25312u;
import pg3.C29218v0;
import pp0.C29423a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34799a1;
import ud3.C34850x0;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: de1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002/-B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001c\u0010\u001bJ+\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001f2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010(J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, m65681d2 = {"Lde1/c;", "Lod1/g;", "Lde1/a;", "Lde1/b;", "Lcom/whoop/editactivities/network/EditActivitiesDrawerApi;", "editActivitiesDrawerApi", "Ljb1/a;", "designItemReducer", "Ltr2/n;", "logger", "Ljs0/c;", "configurationRepository", "Lad3/c;", "json", "Lce1/b;", "analyticsHelper", "<init>", "(Lcom/whoop/editactivities/network/EditActivitiesDrawerApi;Ljb1/a;Ltr2/n;Ljs0/c;Lad3/c;Lce1/b;)V", "state", "action", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lde1/b;Lde1/a;Lq83/d;)Ljava/lang/Object;", "", HttpHeaders.DATE, "k", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "i", "(Lde1/b;Lq83/d;)Ljava/lang/Object;", "j", "Lpg3/v0;", "response", "Ll83/k;", "l", "(Lpg3/v0;)Ll83/k;", "Lde1/a$g;", "n", "(Lde1/b;Lde1/a$g;)Lde1/b;", "", "Lce1/c;", "m", "(Lde1/b;)Ljava/util/List;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/editactivities/network/EditActivitiesDrawerApi;", "b", "Ljb1/a;", "c", "Ltr2/n;", "d", "Ljs0/c;", "e", "Lad3/c;", "f", "Lce1/b;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11983c implements InterfaceC27844g<InterfaceC11981a, C11982b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EditActivitiesDrawerApi editActivitiesDrawerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C4491b analyticsHelper;

    /* JADX INFO: renamed from: de1.c$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lde1/c$a;", "", "<init>", "()V", "b", "c", "a", "Lde1/c$a$a;", "Lde1/c$a$b;", "Lde1/c$a$c;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: de1.c$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lde1/c$a$a;", "Lde1/c$a;", "Lde1/a;", "action", "<init>", "(Lde1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lde1/a;", "()Lde1/a;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41463a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC11981a action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41463a(InterfaceC11981a action) {
                super(null);
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC11981a getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41463a) && AbstractC22676k.m65745e(this.action, ((C41463a) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "HandleAction(action=" + this.action + ")";
            }
        }

        /* JADX INFO: renamed from: de1.c$a$b */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lde1/c$a$b;", "Lde1/c$a;", "Lde1/b;", "state", "<init>", "(Lde1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lde1/b;", "()Lde1/b;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C11982b state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C11982b state) {
                super(null);
                AbstractC22676k.m65750j(state, "state");
                this.state = state;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C11982b getState() {
                return this.state;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.state, ((b) other).state);
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            public String toString() {
                return "LoadResult(state=" + this.state + ")";
            }
        }

        /* JADX INFO: renamed from: de1.c$a$c */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lde1/c$a$c;", "Lde1/c$a;", "Lde1/d;", "screenState", "<init>", "(Lde1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lde1/d;", "()Lde1/d;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC11984d screenState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC11984d screenState) {
                super(null);
                AbstractC22676k.m65750j(screenState, "screenState");
                this.screenState = screenState;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC11984d getScreenState() {
                return this.screenState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.screenState, ((c) other).screenState);
            }

            public int hashCode() {
                return this.screenState.hashCode();
            }

            public String toString() {
                return "ShowProgress(screenState=" + this.screenState + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: de1.c$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lde1/c$b;", "Ljs0/a;", "", "<init>", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC21907a<Integer> {

        /* JADX INFO: renamed from: a */
        public static final b f39382a = new b();

        /* JADX INFO: renamed from: b */
        public static final int f39383b = 8;

        private b() {
            super("MAX_ACTIVITIES_IN_SELECTION", 10);
        }
    }

    /* JADX INFO: renamed from: de1.c$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.editactivities.domain.EditActivitiesDrawerInteractor", m100430f = "EditActivitiesDrawerInteractor.kt", m100431l = {153}, m100432m = "executeDelete", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f39384w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39385x;

        /* JADX INFO: renamed from: z */
        int f39387z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f39385x = obj;
            this.f39387z |= Integer.MIN_VALUE;
            return C11983c.this.m33000i(null, this);
        }
    }

    /* JADX INFO: renamed from: de1.c$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.editactivities.domain.EditActivitiesDrawerInteractor", m100430f = "EditActivitiesDrawerInteractor.kt", m100431l = {189}, m100432m = "executeMerge", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f39388E;

        /* JADX INFO: renamed from: F */
        Object f39389F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f39390G;

        /* JADX INFO: renamed from: I */
        int f39392I;

        /* JADX INFO: renamed from: w */
        Object f39393w;

        /* JADX INFO: renamed from: x */
        Object f39394x;

        /* JADX INFO: renamed from: y */
        Object f39395y;

        /* JADX INFO: renamed from: z */
        Object f39396z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f39390G = obj;
            this.f39392I |= Integer.MIN_VALUE;
            return C11983c.this.m33001j(null, this);
        }
    }

    /* JADX INFO: renamed from: de1.c$e */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.editactivities.domain.EditActivitiesDrawerInteractor$interact$$inlined$flatMapLatest$1", m100430f = "EditActivitiesDrawerInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39397w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39398x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39399y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C11983c f39400z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C11983c c11983c) {
            super(3, interfaceC30057d);
            this.f39400z = c11983c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC11981a interfaceC11981a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f39400z);
            eVar.f39398x = interfaceC13062m;
            eVar.f39399y = interfaceC11981a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39397w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39398x;
                InterfaceC11981a interfaceC11981a = (InterfaceC11981a) this.f39399y;
                if (interfaceC11981a instanceof InterfaceC11981a.d) {
                    c13084s1 = new C13084s1(this.f39400z.new f(interfaceC11981a, null));
                } else if (interfaceC11981a instanceof InterfaceC11981a.b) {
                    c13084s1 = new C13084s1(new g(interfaceC11981a, null));
                } else {
                    c13084s1 = interfaceC11981a instanceof InterfaceC11981a.e ? new C13084s1(new h(interfaceC11981a, null)) : new C0456u(new a.C41463a(interfaceC11981a), 1);
                }
                this.f39398x = null;
                this.f39399y = null;
                this.f39397w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC11981a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: de1.c$f */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.editactivities.domain.EditActivitiesDrawerInteractor$interact$1$1", m100430f = "EditActivitiesDrawerInteractor.kt", m100431l = {52, 60, 60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lde1/c$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC11981a f39401E;

        /* JADX INFO: renamed from: w */
        Object f39402w;

        /* JADX INFO: renamed from: x */
        int f39403x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f39404y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC11981a interfaceC11981a, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39401E = interfaceC11981a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C11983c.this.new f(this.f39401E, interfaceC30057d);
            fVar.f39404y = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
        
            if (r1.emit(r5, r24) == r2) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                r24 = this;
                r0 = r24
                java.lang.Object r1 = r0.f39404y
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f39403x
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r3 == 0) goto L31
                if (r3 == r6) goto L2d
                if (r3 == r5) goto L23
                if (r3 != r4) goto L1b
                p505ts.AbstractC34132o.m107864I(r25)
                goto L9b
            L1b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L23:
                java.lang.Object r1 = r0.f39402w
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                p505ts.AbstractC34132o.m107864I(r25)
                r3 = r25
                goto L87
            L2d:
                p505ts.AbstractC34132o.m107864I(r25)
                goto L70
            L31:
                p505ts.AbstractC34132o.m107864I(r25)
                de1.c r3 = de1.C11983c.this
                ce1.b r3 = de1.C11983c.m32997f(r3)
                ce1.a$c r8 = ce1.InterfaceC4490a.c.f18085a
                r3.m14072i(r8)
                de1.c$a$b r3 = new de1.c$a$b
                de1.b r8 = new de1.b
                de1.d$f r9 = de1.InterfaceC11984d.f.f39426a
                de1.a r10 = r0.f39401E
                de1.a$d r10 = (de1.InterfaceC11981a.d) r10
                java.lang.String r19 = r10.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()
                r22 = 3582(0xdfe, float:5.02E-42)
                r23 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r20 = 0
                r21 = 0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23)
                r3.<init>(r8)
                r0.f39404y = r1
                r0.f39403x = r6
                java.lang.Object r3 = r1.emit(r3, r0)
                if (r3 != r2) goto L70
                goto L9a
            L70:
                de1.c r3 = de1.C11983c.this
                de1.a r6 = r0.f39401E
                de1.a$d r6 = (de1.InterfaceC11981a.d) r6
                java.lang.String r6 = r6.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()
                r0.f39404y = r7
                r0.f39402w = r1
                r0.f39403x = r5
                java.lang.Object r3 = de1.C11983c.m32998g(r3, r6, r0)
                if (r3 != r2) goto L87
                goto L9a
            L87:
                de1.b r3 = (de1.C11982b) r3
                de1.c$a$b r5 = new de1.c$a$b
                r5.<init>(r3)
                r0.f39404y = r7
                r0.f39402w = r7
                r0.f39403x = r4
                java.lang.Object r1 = r1.emit(r5, r0)
                if (r1 != r2) goto L9b
            L9a:
                return r2
            L9b:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: de1.C11983c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: de1.c$g */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.editactivities.domain.EditActivitiesDrawerInteractor$interact$1$2", m100430f = "EditActivitiesDrawerInteractor.kt", m100431l = {63, 64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lde1/c$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39406w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39407x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC11981a f39408y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC11981a interfaceC11981a, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39408y = interfaceC11981a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f39408y, interfaceC30057d);
            gVar.f39407x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f39407x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f39406w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L48
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L35
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                de1.c$a$c r6 = new de1.c$a$c
                de1.d$b r2 = de1.InterfaceC11984d.b.f39422a
                r6.<init>(r2)
                r5.f39407x = r0
                r5.f39406w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L35
                goto L47
            L35:
                de1.c$a$a r6 = new de1.c$a$a
                de1.a r2 = r5.f39408y
                r6.<init>(r2)
                r2 = 0
                r5.f39407x = r2
                r5.f39406w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: de1.C11983c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: de1.c$h */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.editactivities.domain.EditActivitiesDrawerInteractor$interact$1$3", m100430f = "EditActivitiesDrawerInteractor.kt", m100431l = {67, 68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lde1/c$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39409w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39410x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC11981a f39411y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC11981a interfaceC11981a, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39411y = interfaceC11981a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f39411y, interfaceC30057d);
            hVar.f39410x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f39410x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f39409w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L48
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L35
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                de1.c$a$c r6 = new de1.c$a$c
                de1.d$h r2 = de1.InterfaceC11984d.h.f39429a
                r6.<init>(r2)
                r5.f39410x = r0
                r5.f39409w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L35
                goto L47
            L35:
                de1.c$a$a r6 = new de1.c$a$a
                de1.a r2 = r5.f39411y
                r6.<init>(r2)
                r2 = 0
                r5.f39410x = r2
                r5.f39409w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: de1.C11983c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: de1.c$i */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.editactivities.domain.EditActivitiesDrawerInteractor$interact$2", m100430f = "EditActivitiesDrawerInteractor.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lde1/b;", "prevState", "Lde1/c$a;", "internal", "<anonymous>", "(Lde1/b;Lde1/c$a;)Lde1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39412w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39413x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39414y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C11982b c11982b, a aVar, InterfaceC30057d<? super C11982b> interfaceC30057d) {
            i iVar = C11983c.this.new i(interfaceC30057d);
            iVar.f39413x = c11982b;
            iVar.f39414y = aVar;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM32999h;
            C11982b c11982b = (C11982b) this.f39413x;
            a aVar = (a) this.f39414y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39412w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (aVar instanceof a.b) {
                    return ((a.b) aVar).getState();
                }
                if (aVar instanceof a.c) {
                    return C11982b.m32981b(c11982b, ((a.c) aVar).getScreenState(), null, null, null, null, null, null, 0, 0L, null, false, false, 2046, null);
                }
                if (!(aVar instanceof a.C41463a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C11983c c11983c = C11983c.this;
                InterfaceC11981a action = ((a.C41463a) aVar).getAction();
                this.f39413x = null;
                this.f39414y = null;
                this.f39412w = 1;
                objM32999h = c11983c.m32999h(c11982b, action, this);
                if (objM32999h == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM32999h = obj;
            }
            return (C11982b) objM32999h;
        }
    }

    /* JADX INFO: renamed from: de1.c$j */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.editactivities.domain.EditActivitiesDrawerInteractor", m100430f = "EditActivitiesDrawerInteractor.kt", m100431l = {105}, m100432m = "loadContent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f39416w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39417x;

        /* JADX INFO: renamed from: z */
        int f39419z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f39417x = obj;
            this.f39419z |= Integer.MIN_VALUE;
            return C11983c.this.m33002k(null, this);
        }
    }

    public C11983c(EditActivitiesDrawerApi editActivitiesDrawerApi, C21535a designItemReducer, InterfaceC34116n logger, AbstractC21909c configurationRepository, AbstractC0757c json, C4491b analyticsHelper) {
        AbstractC22676k.m65750j(editActivitiesDrawerApi, "editActivitiesDrawerApi");
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.editActivitiesDrawerApi = editActivitiesDrawerApi;
        this.designItemReducer = designItemReducer;
        this.logger = logger;
        this.configurationRepository = configurationRepository;
        this.json = json;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final Object m32999h(C11982b c11982b, InterfaceC11981a interfaceC11981a, InterfaceC30057d<? super C11982b> interfaceC30057d) {
        if (interfaceC11981a instanceof InterfaceC11981a.b) {
            return m33000i(c11982b, interfaceC30057d);
        }
        if (interfaceC11981a instanceof InterfaceC11981a.e) {
            return m33001j(c11982b, interfaceC30057d);
        }
        if (interfaceC11981a instanceof InterfaceC11981a.g) {
            return m33005n(c11982b, (InterfaceC11981a.g) interfaceC11981a);
        }
        if (interfaceC11981a instanceof InterfaceC11981a.f) {
            this.analyticsHelper.m14072i(new InterfaceC4490a.a(m33004m(c11982b)));
            return C11982b.m32981b(c11982b, null, null, null, null, null, null, null, 0, 0L, null, false, true, 2047, null);
        }
        if (interfaceC11981a instanceof InterfaceC11981a.a) {
            return C11982b.m32981b(c11982b, null, null, null, null, null, null, null, 0, 0L, null, false, false, 2047, null);
        }
        if (interfaceC11981a instanceof InterfaceC11981a.c) {
            return C11982b.m32981b(c11982b, null, null, null, null, null, null, null, 0, 0L, null, true, false, 3071, null);
        }
        if (interfaceC11981a instanceof InterfaceC11981a.d) {
            return c11982b;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x005a A[Catch: Exception -> 0x0081, TryCatch #3 {Exception -> 0x0081, blocks: (B:25:0x0052, B:27:0x005a, B:31:0x0084), top: B:45:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[Catch: Exception -> 0x0081, TRY_LEAVE, TryCatch #3 {Exception -> 0x0081, blocks: (B:25:0x0052, B:27:0x005a, B:31:0x0084), top: B:45:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: i */
    public final Object m33000i(C11982b c11982b, InterfaceC30057d<? super C11982b> interfaceC30057d) {
        c cVar;
        C11982b c11982b2;
        C11982b c11982b3;
        C11982b c11982b4;
        C29218v0<?> c29218v0;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f39387z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f39387z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objDeleteActivities = cVar.f39385x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f39387z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objDeleteActivities);
            try {
                EditActivitiesDrawerApi editActivitiesDrawerApi = this.editActivitiesDrawerApi;
                List<String> listM32991k = c11982b.m32991k();
                c11982b2 = c11982b;
                try {
                    cVar.f39384w = c11982b2;
                    cVar.f39387z = 1;
                    objDeleteActivities = editActivitiesDrawerApi.deleteActivities(listM32991k, cVar);
                    if (objDeleteActivities == enumC31071a) {
                        return enumC31071a;
                    }
                    c11982b4 = c11982b2;
                    c29218v0 = (C29218v0) objDeleteActivities;
                    if (c29218v0.f118269a.f146788Q) {
                        this.analyticsHelper.m14072i(new InterfaceC4490a.b(m33004m(c11982b4)));
                        return C11982b.m32981b(c11982b4, InterfaceC11984d.c.f39423a, null, null, null, null, null, null, 0, 0L, null, true, false, 3070, null);
                    }
                    C23465k c23465kM33003l = m33003l(c29218v0);
                    return C11982b.m32981b(c11982b4, new InterfaceC11984d.a((String) c23465kM33003l.f92937w, (String) c23465kM33003l.f92938x), null, null, null, null, null, null, 0, 0L, null, false, false, 4094, null);
                } catch (Exception e5) {
                    e = e5;
                    c11982b3 = c11982b2;
                }
            } catch (Exception e13) {
                e = e13;
                c11982b2 = c11982b;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11982b3 = (C11982b) cVar.f39384w;
            try {
                AbstractC34132o.m107864I(objDeleteActivities);
                c11982b4 = c11982b3;
                try {
                    c29218v0 = (C29218v0) objDeleteActivities;
                    if (c29218v0.f118269a.f146788Q) {
                        this.analyticsHelper.m14072i(new InterfaceC4490a.b(m33004m(c11982b4)));
                        return C11982b.m32981b(c11982b4, InterfaceC11984d.c.f39423a, null, null, null, null, null, null, 0, 0L, null, true, false, 3070, null);
                    }
                    C23465k c23465kM33003l2 = m33003l(c29218v0);
                    return C11982b.m32981b(c11982b4, new InterfaceC11984d.a((String) c23465kM33003l2.f92937w, (String) c23465kM33003l2.f92938x), null, null, null, null, null, null, 0, 0L, null, false, false, 4094, null);
                } catch (Exception e14) {
                    e = e14;
                    c11982b3 = c11982b4;
                }
            } catch (Exception e15) {
                e = e15;
            }
        }
        AbstractC3006f0.m8721o(cVar.getContext());
        this.logger.mo85230v("Exception deleting activities", e, new AbstractC30556a.a[0]);
        return C11982b.m32981b(c11982b3, new InterfaceC11984d.a(null, null, 3, null), null, null, null, null, null, null, 0, 0L, null, false, false, 4094, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[Catch: Exception -> 0x0175, TryCatch #3 {Exception -> 0x0175, blocks: (B:56:0x0147, B:58:0x014f, B:62:0x0178), top: B:75:0x0147 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0178 A[Catch: Exception -> 0x0175, TRY_LEAVE, TryCatch #3 {Exception -> 0x0175, blocks: (B:56:0x0147, B:58:0x014f, B:62:0x0178), top: B:75:0x0147 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: j */
    public final Object m33001j(C11982b c11982b, InterfaceC30057d<? super C11982b> interfaceC30057d) {
        d dVar;
        C11982b c11982b2;
        C11982b c11982b3;
        List<C4492c> list;
        C11982b c11982b4;
        C29218v0<?> c29218v0;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f39392I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f39392I = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objMergeActivities = dVar.f39390G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f39392I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMergeActivities);
            try {
                Set setM74103I1 = AbstractC25265s.m74103I1(c11982b.m32991k());
                List<C4103r> listM32983c = c11982b.m32983c();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM32983c) {
                    try {
                        if (setM74103I1.contains(((C4103r) obj).getActivityV2Id())) {
                            arrayList.add(obj);
                        }
                    } catch (Exception e5) {
                        e = e5;
                        c11982b3 = c11982b;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String startTimeIso = ((C4103r) it.next()).getStartTimeIso();
                    if (startTimeIso != null) {
                        arrayList2.add(startTimeIso);
                    }
                }
                String str = (String) AbstractC25265s.m74120X0(arrayList2);
                if (str == null) {
                    return C11982b.m32981b(c11982b, new InterfaceC11984d.g(null, null, 3, null), null, null, null, null, null, null, 0, 0L, null, false, false, 4094, null);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String endTimeIso = ((C4103r) it3.next()).getEndTimeIso();
                    if (endTimeIso != null) {
                        arrayList3.add(endTimeIso);
                    }
                }
                String str2 = (String) AbstractC25265s.m74115S0(arrayList3);
                if (str2 == null) {
                    return C11982b.m32981b(c11982b, new InterfaceC11984d.g(null, null, 3, null), null, null, null, null, null, null, 0, 0L, null, false, false, 4094, null);
                }
                List<C4492c> listM33004m = m33004m(c11982b);
                this.analyticsHelper.m14072i(new InterfaceC4490a.d(listM33004m));
                EditActivitiesDrawerApi editActivitiesDrawerApi = this.editActivitiesDrawerApi;
                c11982b2 = c11982b;
                try {
                    dVar.f39393w = c11982b2;
                    dVar.f39394x = null;
                    dVar.f39395y = null;
                    dVar.f39396z = null;
                    dVar.f39388E = null;
                    dVar.f39389F = listM33004m;
                    dVar.f39392I = 1;
                    objMergeActivities = editActivitiesDrawerApi.mergeActivities(str, str2, dVar);
                    if (objMergeActivities == enumC31071a) {
                        return enumC31071a;
                    }
                    list = listM33004m;
                    c11982b4 = c11982b2;
                    c29218v0 = (C29218v0) objMergeActivities;
                    if (c29218v0.f118269a.f146788Q) {
                        this.analyticsHelper.m14072i(new InterfaceC4490a.e(list));
                        return C11982b.m32981b(c11982b4, InterfaceC11984d.i.f39430a, null, null, null, null, null, null, 0, 0L, null, true, false, 3070, null);
                    }
                    C23465k c23465kM33003l = m33003l(c29218v0);
                    return C11982b.m32981b(c11982b4, new InterfaceC11984d.g((String) c23465kM33003l.f92937w, (String) c23465kM33003l.f92938x), null, null, null, null, null, null, 0, 0L, null, false, false, 4094, null);
                } catch (Exception e13) {
                    e = e13;
                    c11982b3 = c11982b2;
                }
            } catch (Exception e14) {
                e = e14;
                c11982b2 = c11982b;
            }
            c11982b3 = c11982b2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) dVar.f39389F;
            C11982b c11982b5 = (C11982b) dVar.f39393w;
            try {
                AbstractC34132o.m107864I(objMergeActivities);
                c11982b4 = c11982b5;
                try {
                    c29218v0 = (C29218v0) objMergeActivities;
                    if (c29218v0.f118269a.f146788Q) {
                        this.analyticsHelper.m14072i(new InterfaceC4490a.e(list));
                        return C11982b.m32981b(c11982b4, InterfaceC11984d.i.f39430a, null, null, null, null, null, null, 0, 0L, null, true, false, 3070, null);
                    }
                    C23465k c23465kM33003l2 = m33003l(c29218v0);
                    return C11982b.m32981b(c11982b4, new InterfaceC11984d.g((String) c23465kM33003l2.f92937w, (String) c23465kM33003l2.f92938x), null, null, null, null, null, null, 0, 0L, null, false, false, 4094, null);
                } catch (Exception e15) {
                    e = e15;
                    c11982b3 = c11982b4;
                }
            } catch (Exception e16) {
                e = e16;
                c11982b3 = c11982b5;
            }
        }
        AbstractC3006f0.m8721o(dVar.getContext());
        this.logger.mo85230v("Exception merging activities", e, new AbstractC30556a.a[0]);
        return C11982b.m32981b(c11982b3, new InterfaceC11984d.g(null, null, 3, null), null, null, null, null, null, null, 0, 0L, null, false, false, 4094, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:107:0x0213  */
    /* JADX WARN: Code duplicated, block: B:72:0x0165 A[PHI: r17
      0x0165: PHI (r17v4 m91.u) = (r17v3 m91.u), (r17v3 m91.u), (r17v3 m91.u), (r17v3 m91.u), (r17v7 m91.u) binds: [B:91:0x01bf, B:86:0x01a8, B:81:0x0191, B:76:0x017a, B:71:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: k */
    public final Object m33002k(String str, InterfaceC30057d<? super C11982b> interfaceC30057d) {
        j jVar;
        String str2;
        String str3;
        C34850x0 c34850x0;
        InterfaceC25312u interfaceC25312u;
        Object objM125868N0;
        Object objM125868N1;
        String str4 = str;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f39419z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f39419z = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object editActivitiesDrawerContent = jVar.f39417x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar.f39419z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(editActivitiesDrawerContent);
            try {
                EditActivitiesDrawerApi editActivitiesDrawerApi = this.editActivitiesDrawerApi;
                jVar.f39416w = str4;
                jVar.f39419z = 1;
                editActivitiesDrawerContent = editActivitiesDrawerApi.getEditActivitiesDrawerContent(str4, jVar);
                if (editActivitiesDrawerContent == enumC31071a) {
                    return enumC31071a;
                }
                str3 = str4;
                C29218v0 c29218v0 = (C29218v0) editActivitiesDrawerContent;
                EditActivitiesDrawerResponse editActivitiesDrawerResponse = (EditActivitiesDrawerResponse) c29218v0.f118270b;
                c34850x0 = c29218v0.f118269a;
                if (c34850x0.f146788Q) {
                }
                this.logger.mo85222m("Failed to load edit activities drawer content: " + c34850x0.f146792z, new AbstractC30556a.a[0]);
                return new C11982b(InterfaceC11984d.d.f39424a, null, null, null, null, null, null, 0, 0L, str3, false, false, 3582, null);
            } catch (Exception e5) {
                e = e5;
                str2 = str4;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) jVar.f39416w;
            try {
                AbstractC34132o.m107864I(editActivitiesDrawerContent);
                str3 = str4;
                try {
                    C29218v0 c29218v1 = (C29218v0) editActivitiesDrawerContent;
                    EditActivitiesDrawerResponse editActivitiesDrawerResponse2 = (EditActivitiesDrawerResponse) c29218v1.f118270b;
                    c34850x0 = c29218v1.f118269a;
                    try {
                        if (c34850x0.f146788Q || editActivitiesDrawerResponse2 == null) {
                            this.logger.mo85222m("Failed to load edit activities drawer content: " + c34850x0.f146792z, new AbstractC30556a.a[0]);
                            return new C11982b(InterfaceC11984d.d.f39424a, null, null, null, null, null, null, 0, 0L, str3, false, false, 3582, null);
                        }
                        EditActivitiesDrawerContent content = editActivitiesDrawerResponse2.getContent();
                        List<InterfaceC25312u> listM60540g = this.designItemReducer.m60540g(content.getItems());
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listM60540g) {
                            if (obj instanceof C4103r) {
                                arrayList.add(obj);
                            }
                        }
                        DesignSystemModel footer = content.getFooter();
                        InterfaceC25312u interfaceC25312uM60544l = footer != null ? this.designItemReducer.m60544l(footer) : null;
                        InfoCalloutTileModel gpsTextInfoCallout = content.getGpsTextInfoCallout();
                        C4092p2 c4092p2M68922b = gpsTextInfoCallout != null ? AbstractC23653j2.m68922b(gpsTextInfoCallout) : null;
                        InfoCalloutTileModel maxDurationInfoCallout = content.getMaxDurationInfoCallout();
                        C4092p2 c4092p2M68922b2 = maxDurationInfoCallout != null ? AbstractC23653j2.m68922b(maxDurationInfoCallout) : null;
                        InfoCalloutTileModel maxSelectionInfoCallout = content.getMaxSelectionInfoCallout();
                        C4092p2 c4092p2M68922b3 = maxSelectionInfoCallout != null ? AbstractC23653j2.m68922b(maxSelectionInfoCallout) : null;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (((C4103r) obj2).getIsSelected()) {
                                arrayList2.add(obj2);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((C4103r) it.next()).getActivityV2Id());
                        }
                        InterfaceC11984d.e eVar = InterfaceC11984d.e.f39425a;
                        AbstractC21909c abstractC21909c = this.configurationRepository;
                        b bVar = b.f39382a;
                        C21908b configurations = abstractC21909c.getConfigurations();
                        String name = bVar.getName();
                        Integer defaultValue = bVar.getDefaultValue();
                        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
                        Class cls = Integer.TYPE;
                        boolean zM65745e = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls));
                        Class cls2 = Boolean.TYPE;
                        Class cls3 = Double.TYPE;
                        Class cls4 = Float.TYPE;
                        Class cls5 = Long.TYPE;
                        if (zM65745e) {
                            String str5 = (String) configurations.get(name);
                            if (str5 != null) {
                                objM125868N0 = AbstractC39421y.m125932Q(str5);
                                interfaceC25312u = interfaceC25312uM60544l;
                            } else {
                                interfaceC25312u = interfaceC25312uM60544l;
                                objM125868N0 = null;
                            }
                        } else {
                            interfaceC25312u = interfaceC25312uM60544l;
                            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
                                String str6 = (String) configurations.get(name);
                                if (str6 != null) {
                                    objM125868N0 = AbstractC39421y.m125933R(str6);
                                } else {
                                    objM125868N0 = null;
                                }
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
                                String str7 = (String) configurations.get(name);
                                if (str7 != null) {
                                    objM125868N0 = AbstractC39420x.m125915y(str7);
                                } else {
                                    objM125868N0 = null;
                                }
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
                                String str8 = (String) configurations.get(name);
                                if (str8 != null) {
                                    objM125868N0 = AbstractC39420x.m125914x(str8);
                                } else {
                                    objM125868N0 = null;
                                }
                            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
                                String str9 = (String) configurations.get(name);
                                if (str9 != null) {
                                    objM125868N0 = AbstractC39414r.m125868N0(str9);
                                } else {
                                    objM125868N0 = null;
                                }
                            } else {
                                objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
                            }
                        }
                        if (objM125868N0 == null) {
                            objM125868N0 = defaultValue;
                        }
                        if (objM125868N0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                        int iIntValue = ((Integer) objM125868N0).intValue();
                        AbstractC21909c abstractC21909c2 = this.configurationRepository;
                        C29423a.a aVar = C29423a.a.f119465a;
                        C21908b configurations2 = abstractC21909c2.getConfigurations();
                        String name2 = aVar.getName();
                        Object defaultValue2 = aVar.getDefaultValue();
                        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Integer.class);
                        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls))) {
                            String str10 = (String) configurations2.get(name2);
                            if (str10 != null) {
                                objM125868N1 = AbstractC39421y.m125932Q(str10);
                            } else {
                                objM125868N1 = null;
                            }
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls5))) {
                            String str11 = (String) configurations2.get(name2);
                            if (str11 != null) {
                                objM125868N1 = AbstractC39421y.m125933R(str11);
                            } else {
                                objM125868N1 = null;
                            }
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls4))) {
                            String str12 = (String) configurations2.get(name2);
                            if (str12 != null) {
                                objM125868N1 = AbstractC39420x.m125915y(str12);
                            } else {
                                objM125868N1 = null;
                            }
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls3))) {
                            String str13 = (String) configurations2.get(name2);
                            if (str13 != null) {
                                objM125868N1 = AbstractC39420x.m125914x(str13);
                            } else {
                                objM125868N1 = null;
                            }
                        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls2))) {
                            String str14 = (String) configurations2.get(name2);
                            if (str14 != null) {
                                objM125868N1 = AbstractC39414r.m125868N0(str14);
                            } else {
                                objM125868N1 = null;
                            }
                        } else {
                            objM125868N1 = AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations2.get(name2) : defaultValue2;
                        }
                        if (objM125868N1 != null) {
                            defaultValue2 = objM125868N1;
                        }
                        if (defaultValue2 != null) {
                            return new C11982b(eVar, arrayList, interfaceC25312u, c4092p2M68922b, c4092p2M68922b2, c4092p2M68922b3, arrayList3, iIntValue, ((Integer) defaultValue2).intValue(), str3, false, false, 3072, null);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Exception e14) {
                    e = e14;
                }
                str2 = str3;
            } catch (Exception e15) {
                e = e15;
                str2 = str4;
            }
        }
        AbstractC3006f0.m8721o(jVar.getContext());
        this.logger.mo85230v("Exception loading edit activities drawer", e, new AbstractC30556a.a[0]);
        return new C11982b(InterfaceC11984d.d.f39424a, null, null, null, null, null, null, 0, 0L, str2, false, false, 3582, null);
    }

    /* JADX INFO: renamed from: l */
    private final C23465k m33003l(C29218v0<?> response) {
        try {
            AbstractC34799a1 abstractC34799a1 = response.f118271c;
            String strM109860m = abstractC34799a1 != null ? abstractC34799a1.m109860m() : null;
            if (strM109860m == null) {
                strM109860m = "";
            }
            AbstractC0757c abstractC0757c = this.json;
            abstractC0757c.getClass();
            EditActivitiesDrawerErrorResponse editActivitiesDrawerErrorResponse = (EditActivitiesDrawerErrorResponse) abstractC0757c.m1831b(EditActivitiesDrawerErrorResponse.INSTANCE.serializer(), strM109860m);
            return new C23465k(editActivitiesDrawerErrorResponse.getError().getTitle(), editActivitiesDrawerErrorResponse.getError().getSubtitle());
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to parse action error body", e5, new AbstractC30556a.a[0]);
            return new C23465k(null, null);
        }
    }

    /* JADX INFO: renamed from: m */
    private final List<C4492c> m33004m(C11982b state) {
        Set setM74103I1 = AbstractC25265s.m74103I1(state.m32991k());
        List<C4103r> listM32983c = state.m32983c();
        ArrayList<C4103r> arrayList = new ArrayList();
        for (Object obj : listM32983c) {
            if (setM74103I1.contains(((C4103r) obj).getActivityV2Id())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (C4103r c4103r : arrayList) {
            String activityV2Id = c4103r.getActivityV2Id();
            String internalName = c4103r.getInternalName();
            if (internalName == null) {
                internalName = "";
            }
            arrayList2.add(new C4492c(activityV2Id, internalName, c4103r.getStartTimeIso(), c4103r.getEndTimeIso()));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: n */
    private final C11982b m33005n(C11982b state, InterfaceC11981a.g action) {
        ArrayList arrayListM74124b1;
        if (action.getIsSelected()) {
            arrayListM74124b1 = AbstractC25265s.m74128f1(action.getActivityV2Id(), state.m32991k());
        } else {
            arrayListM74124b1 = AbstractC25265s.m74124b1(state.m32991k(), action.getActivityV2Id());
        }
        return C11982b.m32981b(state, null, null, null, null, null, null, arrayListM74124b1, 0, 0L, null, false, false, 4031, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new C11982b(null, null, null, null, null, null, null, 0, 0L, null, false, false, 4095, null), AbstractC13091v.m36590P(upstream, new e(null, this)), new i(null)), 1);
    }
}
