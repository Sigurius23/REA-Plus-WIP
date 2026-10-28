package p047c9;

import a30.C0332w0;
import a33.C0352d;
import ac3.C0745a;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import dm.EnumC12174d;
import gm.C15981i;
import io.C18744f;
import io.C19979i;
import io.C20032l;
import io.InterfaceC19980j;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import io.getstream.chat.android.p226ui.feature.channels.ChannelListFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.CustomAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.FileAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.GiphyAttachmentViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.LinkAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MediaAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessagePlainTextViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener;
import io.getstream.chat.android.p226ui.feature.search.SearchInputView;
import io.sentry.C20645z6;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20262b4;
import io.sentry.InterfaceC20320e4;
import io.sentry.InterfaceC20432n1;
import io.sentry.android.core.AlertDialogC20134o1;
import io.sentry.android.core.InterfaceC20081h1;
import io.sentry.android.core.RunnableC20151r0;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC20091g;
import io.sentry.internal.debugmeta.C20378c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jm.EnumC21781c;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import n43.C26285a;
import o23.C27477g;
import o23.C27478h;
import o23.C27481k;
import o23.C27485o;
import o23.C27487q;
import o23.InterfaceC27471a;
import o23.InterfaceC27474d;
import om.InterfaceC28022a;
import p012ab.C0682h0;
import p032bc.C2953i;
import p080d4.C11650i;
import p080d4.C11655n;
import p080d4.InterfaceC11651j;
import p127ev.C13668i;
import p171g9.C15587d;
import p218ic.EnumC18364j;
import p218ic.RunnableC18376p;
import p218ic.RunnableC18378q;
import p23.AbstractC28757a;
import p299l9.C23488c0;
import p299l9.C23537y;
import p299l9.InterfaceC23506i0;
import p309lo.AbstractC24567y;
import p344nm.C26819a;
import p344nm.C26820b;
import p344nm.C26826h;
import p344nm.C26827i;
import p344nm.InterfaceC26821c;
import p344nm.InterfaceC26822d;
import p344nm.InterfaceC26825g;
import p465rm.C31521c0;
import p516u8.AbstractC34609o0;
import p516u8.C34606n;
import p516u8.C34610p;
import p516u8.InterfaceC34599j0;
import p607x8.InterfaceC38049d;
import p607x8.InterfaceC38051f;
import p607x8.InterfaceC38052g;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qg3.C30352d;
import sn.C32766w0;

/* JADX INFO: renamed from: c9.c */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C4312c implements InterfaceC38052g, InterfaceC38051f, InterfaceC11651j, InterfaceC19980j, InterfaceC27471a, SearchInputView.SearchStartedListener, MessageListView.OnEnterThreadListener, ReactionClickListener, InterfaceC20262b4, InterfaceC20081h1, InterfaceC20320e4, InterfaceC38049d, InterfaceC28022a, InterfaceC26825g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17505w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f17506x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f17507y;

    public /* synthetic */ C4312c(int i13, Object obj, Object obj2) {
        this.f17505w = i13;
        this.f17506x = obj;
        this.f17507y = obj2;
    }

    @Override // p607x8.InterfaceC38052g
    /* JADX INFO: renamed from: a */
    public void mo1654a(Object obj, C34606n c34606n) {
        C4321l c4321l = (C4321l) ((InterfaceC4311b) obj);
        c4321l.m13623k((InterfaceC34599j0) this.f17507y, new C30352d(c34606n, ((C4317h) this.f17506x).f17515E));
    }

    @Override // p607x8.InterfaceC38049d
    public void accept(Object obj) {
        C15587d c15587d = (C15587d) this.f17506x;
        ((InterfaceC23506i0) obj).mo8317d(c15587d.f58537a, c15587d.f58538b, (C23537y) this.f17507y);
    }

    @Override // p344nm.InterfaceC26825g
    public Object apply(Object obj) {
        C26827i c26827i = (C26827i) this.f17506x;
        C15981i c15981i = (C15981i) this.f17507y;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C26819a c26819a = c26827i.f106992z;
        ArrayList arrayListM80060k = c26827i.m80060k(sQLiteDatabase, c15981i, c26819a.f106974b);
        for (EnumC12174d enumC12174d : EnumC12174d.values()) {
            if (enumC12174d != c15981i.f60490c) {
                int size = c26819a.f106974b - arrayListM80060k.size();
                if (size <= 0) {
                    break;
                }
                C0352d c0352dM45125a = C15981i.m45125a();
                c0352dM45125a.m928Q(c15981i.f60488a);
                if (enumC12174d == null) {
                    throw new NullPointerException("Null priority");
                }
                c0352dM45125a.f1239z = enumC12174d;
                c0352dM45125a.f1238y = c15981i.f60489b;
                arrayListM80060k.addAll(c26827i.m80060k(sQLiteDatabase, c0352dM45125a.m932d(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb4 = new StringBuilder("event_id IN (");
        for (int i13 = 0; i13 < arrayListM80060k.size(); i13++) {
            sb4.append(((C26820b) arrayListM80060k.get(i13)).f106978a);
            if (i13 < arrayListM80060k.size() - 1) {
                sb4.append(DateTimeRange.lowerUpperDelimiter);
            }
        }
        sb4.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{AnalyticsRequestV2.PARAM_EVENT_ID, "name", "value"}, sb4.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j7 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j7));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j7), hashSet);
                }
                hashSet.add(new C26826h(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th3) {
                cursorQuery.close();
                throw th3;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListM80060k.listIterator();
        while (listIterator.hasNext()) {
            C26820b c26820b = (C26820b) listIterator.next();
            long j13 = c26820b.f106978a;
            if (map.containsKey(Long.valueOf(j13))) {
                C0332w0 c0332w0M45124c = c26820b.f106980c.m45124c();
                for (C26826h c26826h : (Set) map.get(Long.valueOf(j13))) {
                    c0332w0M45124c.m856f(c26826h.f106985a, c26826h.f106986b);
                }
                listIterator.set(new C26820b(j13, c26820b.f106979b, c0332w0M45124c.m860m()));
            }
        }
        return arrayListM80060k;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    @Override // io.InterfaceC19980j
    /* JADX INFO: renamed from: b */
    public C41060w0 mo13592b(int i13, C32766w0 c32766w0, int[] iArr) {
        int i14;
        int i15;
        int i16;
        int i17;
        C32766w0 c32766w1 = c32766w0;
        switch (this.f17505w) {
            case 3:
                C18744f c18744f = (C18744f) this.f17506x;
                int i18 = ((int[]) this.f17507y)[i13];
                int i19 = c18744f.f77560I;
                int i24 = c18744f.f77561J;
                boolean z4 = c18744f.f77562K;
                if (i19 == Integer.MAX_VALUE || i24 == Integer.MAX_VALUE) {
                    i14 = Integer.MAX_VALUE;
                } else {
                    int i25 = Integer.MAX_VALUE;
                    for (int i26 = 0; i26 < c32766w1.f136260w; i26++) {
                        C31521c0 c31521c0 = c32766w1.f136262y[i26];
                        int i27 = c31521c0.f130082Q;
                        int i28 = c31521c0.f130083R;
                        if (i27 > 0 && i28 > 0) {
                            if (!z4) {
                                i16 = i19;
                                i17 = i24;
                            } else if ((i27 > i28) != (i19 > i24)) {
                                i17 = i19;
                                i16 = i24;
                            } else {
                                i16 = i19;
                                i17 = i24;
                            }
                            int i29 = i27 * i17;
                            int i34 = i28 * i16;
                            Point point = i29 >= i34 ? new Point(i16, AbstractC24567y.m71675f(i34, i27)) : new Point(AbstractC24567y.m71675f(i29, i28), i17);
                            int i35 = c31521c0.f130082Q;
                            int i36 = i35 * i28;
                            if (i35 >= ((int) (point.x * 0.98f)) && i28 >= ((int) (point.y * 0.98f)) && i36 < i25) {
                                i25 = i36;
                            }
                        }
                    }
                    i14 = i25;
                }
                C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
                int i37 = 0;
                while (i37 < c32766w1.f136260w) {
                    C31521c0 c31521c1 = c32766w1.f136262y[i37];
                    int i38 = c31521c1.f130082Q;
                    int i39 = (i38 == -1 || (i15 = c31521c1.f130083R) == -1) ? -1 : i38 * i15;
                    c41014d0M133251l.m133222a(new C20032l(i13, c32766w1, i37, c18744f, iArr[i37], i18, i14 == Integer.MAX_VALUE || (i39 != -1 && i39 <= i14)));
                    i37++;
                    c32766w1 = c32766w0;
                }
                return c41014d0M133251l.m133239f();
            default:
                C18744f c18744f2 = (C18744f) this.f17506x;
                String str = (String) this.f17507y;
                C41014d0 c41014d0M133251l2 = AbstractC41023g0.m133251l();
                for (int i44 = 0; i44 < c32766w1.f136260w; i44++) {
                    c41014d0M133251l2.m133222a(new C19979i(i13, c32766w1, i44, c18744f2, iArr[i44], str));
                }
                return c41014d0M133251l2.m133239f();
        }
    }

    @Override // p080d4.InterfaceC11651j
    /* JADX INFO: renamed from: d */
    public Object mo8621d(C11650i c11650i) {
        Executor executor = (Executor) this.f17506x;
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f17507y;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        RunnableC18376p runnableC18376p = new RunnableC18376p(atomicBoolean, 1);
        EnumC18364j enumC18364j = EnumC18364j.f71497w;
        C11655n c11655n = c11650i.f37630c;
        if (c11655n != null) {
            c11655n.mo31061a(runnableC18376p, enumC18364j);
        }
        executor.execute(new RunnableC18378q(atomicBoolean, c11650i, interfaceC4339a, 1));
        return C23454a0.f92919a;
    }

    @Override // io.sentry.android.core.InterfaceC20081h1
    /* JADX INFO: renamed from: e */
    public void mo13593e() {
        AlertDialogC20134o1 alertDialogC20134o1 = (AlertDialogC20134o1) this.f17506x;
        Activity activity = (Activity) ((WeakReference) this.f17507y).get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.runOnUiThread(new RunnableC20151r0(1, alertDialogC20134o1, activity));
    }

    @Override // om.InterfaceC28022a
    public Object execute() {
        switch (this.f17505w) {
            case 20:
                C13668i c13668i = (C13668i) this.f17506x;
                Iterable iterable = (Iterable) this.f17507y;
                C26827i c26827i = (C26827i) ((InterfaceC26822d) c13668i.f48456c);
                c26827i.getClass();
                if (iterable.iterator().hasNext()) {
                    c26827i.m80058b().compileStatement("DELETE FROM events WHERE _id in " + C26827i.m80057x(iterable)).execute();
                    break;
                }
                break;
            default:
                C13668i c13668i2 = (C13668i) this.f17506x;
                for (Map.Entry entry : ((HashMap) this.f17507y).entrySet()) {
                    ((C26827i) ((InterfaceC26821c) c13668i2.f48462i)).m80061m(((Integer) entry.getValue()).intValue(), EnumC21781c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20262b4
    /* JADX INFO: renamed from: g */
    public void mo8622g(InterfaceC20432n1 interfaceC20432n1) {
        switch (this.f17505w) {
            case 14:
                C20645z6 c20645z6 = (C20645z6) this.f17506x;
                InterfaceC20259b1 interfaceC20259b1 = (InterfaceC20259b1) this.f17507y;
                c20645z6.getClass();
                if (interfaceC20432n1 == c20645z6) {
                    interfaceC20259b1.mo56183E();
                }
                break;
            default:
                InterfaceC20432n1 interfaceC20432n2 = (InterfaceC20432n1) this.f17506x;
                InterfaceC20259b1 interfaceC20259b2 = (InterfaceC20259b1) this.f17507y;
                if (interfaceC20432n1 == interfaceC20432n2) {
                    interfaceC20259b2.mo56183E();
                }
                break;
        }
    }

    @Override // io.sentry.InterfaceC20320e4
    /* JADX INFO: renamed from: h */
    public void mo11182h(InterfaceC20259b1 interfaceC20259b1) {
        interfaceC20259b1.mo56192N(new C2953i((GestureDetectorOnGestureListenerC20091g) this.f17506x, interfaceC20259b1, (InterfaceC20432n1) this.f17507y, 7));
    }

    @Override // p607x8.InterfaceC38051f
    /* JADX INFO: renamed from: invoke */
    public void mo134038invoke(Object obj) {
        C4310a c4310a = (C4310a) this.f17506x;
        C23537y c23537y = (C23537y) this.f17507y;
        C4321l c4321l = (C4321l) ((InterfaceC4311b) obj);
        c4321l.getClass();
        C23488c0 c23488c0 = c4310a.f17498d;
        if (c23488c0 == null) {
            return;
        }
        C34610p c34610p = (C34610p) c23537y.f93212g;
        c34610p.getClass();
        int i13 = c23537y.f93208c;
        C4319j c4319j = c4321l.f17547c;
        AbstractC34609o0 abstractC34609o0 = c4310a.f17496b;
        c23488c0.getClass();
        C0682h0 c0682h0 = new C0682h0(c34610p, i13, c4319j.m13608c(abstractC34609o0, c23488c0), 4);
        int i14 = c23537y.f93207b;
        if (i14 != 0) {
            if (i14 == 1) {
                c4321l.f17561q = c0682h0;
                return;
            } else if (i14 != 2) {
                if (i14 != 3) {
                    return;
                }
                c4321l.f17562r = c0682h0;
                return;
            }
        }
        c4321l.f17560p = c0682h0;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener
    public void onReactionClick(String str) {
        switch (this.f17505w) {
            case 8:
                CustomAttachmentsViewHolder.initializeListeners$lambda$9$lambda$8$lambda$3((MessageListListeners) this.f17506x, (CustomAttachmentsViewHolder) this.f17507y, str);
                break;
            case 9:
                FileAttachmentsViewHolder.initializeListeners$lambda$10$lambda$9$lambda$2((MessageListListeners) this.f17506x, (FileAttachmentsViewHolder) this.f17507y, str);
                break;
            case 10:
                GiphyAttachmentViewHolder.initializeListeners$lambda$8$lambda$7$lambda$2((MessageListListeners) this.f17506x, (GiphyAttachmentViewHolder) this.f17507y, str);
                break;
            case 11:
                LinkAttachmentsViewHolder.initializeListeners$lambda$12$lambda$11$lambda$4((MessageListListeners) this.f17506x, (LinkAttachmentsViewHolder) this.f17507y, str);
                break;
            case 12:
                MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$10((MessageListListeners) this.f17506x, (MediaAttachmentsViewHolder) this.f17507y, str);
                break;
            default:
                MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$1((MessageListListeners) this.f17506x, (MessagePlainTextViewHolder) this.f17507y, str);
                break;
        }
    }

    @Override // o23.InterfaceC27471a
    public void onResult(AbstractC26205h result) {
        switch (this.f17505w) {
            case 5:
                MessageListController.scrollToBottom$lambda$55((InterfaceC4339a) this.f17506x, (MessageListController) this.f17507y, result);
                return;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                Function1 function1 = (Function1) this.f17506x;
                Function1 function2 = (Function1) this.f17507y;
                AbstractC22676k.m65750j(result, "result");
                if (result instanceof C26204g) {
                    function1.invoke(((C26204g) result).f103919a);
                    return;
                } else {
                    if (!(result instanceof C26203f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    function2.invoke(((C26203f) result).f103918a);
                    return;
                }
            case 24:
                C27481k c27481k = (C27481k) this.f17506x;
                AbstractC3006f0.m8732z(c27481k.f110704d, null, null, new C26285a(c27481k, result, (InterfaceC27471a) this.f17507y, (InterfaceC30057d) null, 3), 3);
                return;
            case 25:
                AbstractC3006f0.m8732z(((C27481k) this.f17506x).f110704d, AbstractC28757a.f116490a, null, new C27477g((InterfaceC27471a) this.f17507y, result, null, 3), 2);
                return;
            case 26:
                C27478h c27478h = (C27478h) this.f17506x;
                InterfaceC27471a interfaceC27471a = (InterfaceC27471a) this.f17507y;
                AbstractC22676k.m65750j(result, "it");
                AbstractC26205h abstractC26205h = !((C0745a) c27478h.f110691d).m1812a() ? result : null;
                if (abstractC26205h != null) {
                    boolean z4 = abstractC26205h instanceof C26204g;
                    if (!z4) {
                        if (!(abstractC26205h instanceof C26203f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC27471a.onResult(new C26203f(((C26203f) abstractC26205h).f103918a));
                    }
                    if (!z4) {
                        if (!(abstractC26205h instanceof C26203f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    } else {
                        InterfaceC27474d interfaceC27474d = (InterfaceC27474d) ((Function1) c27478h.f110690c).invoke(((C26204g) abstractC26205h).f103919a);
                        c27478h.f110692e = interfaceC27474d;
                        interfaceC27474d.enqueue(new C20378c(27, interfaceC27471a, c27478h));
                        return;
                    }
                }
                return;
            case 27:
                C27485o c27485o = (C27485o) this.f17506x;
                InterfaceC27471a interfaceC27471a2 = (InterfaceC27471a) this.f17507y;
                AbstractC22676k.m65750j(result, "it");
                AbstractC26205h c26204g = !c27485o.f110717c.m1812a() ? result : null;
                if (c26204g != null) {
                    Function1 function3 = (Function1) c27485o.f110718d;
                    if (c26204g instanceof C26204g) {
                        c26204g = new C26204g(function3.invoke(((C26204g) c26204g).f103919a));
                    } else if (!(c26204g instanceof C26203f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC27471a2.onResult(c26204g);
                    return;
                }
                return;
            case 28:
                C27487q c27487q = (C27487q) this.f17506x;
                AbstractC3006f0.m8732z(c27487q.f110724c, null, null, new C26285a(c27487q, result, (InterfaceC27471a) this.f17507y, (InterfaceC30057d) null, 4), 3);
                return;
            default:
                C27485o c27485o2 = (C27485o) this.f17506x;
                InterfaceC27471a interfaceC27471a3 = (InterfaceC27471a) this.f17507y;
                AbstractC22676k.m65750j(result, "resultA");
                C0745a c0745a = c27485o2.f110717c;
                InterfaceC27474d interfaceC27474d2 = (InterfaceC27474d) c27485o2.f110718d;
                if (c0745a.m1812a()) {
                    return;
                }
                if (result instanceof C26204g) {
                    interfaceC27474d2.enqueue(new C2953i(c27485o2, result, interfaceC27471a3, 13));
                    return;
                } else {
                    if (result instanceof C26203f) {
                        C26203f c26203f = new C26203f(((C26203f) result).f103918a);
                        interfaceC27474d2.cancel();
                        interfaceC27471a3.onResult(c26203f);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // io.getstream.chat.android.ui.feature.search.SearchInputView.SearchStartedListener
    public void onSearchStarted(String str) {
        ChannelListFragment.setupSearchInput$lambda$14$lambda$13((SearchInputView) this.f17506x, (ChannelListFragment) this.f17507y, str);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnEnterThreadListener
    public boolean onThreadEntered(Message message) {
        return MessageListView.setOnEnterThreadListener$lambda$142((MessageListView.OnEnterThreadListener) this.f17506x, (MessageListView) this.f17507y, message);
    }
}
