package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.common.utils.PollsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p337n8.C26444a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u0016J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u0016J\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0016R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R6\u0010&\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$0#j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$`%0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u001e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\"R#\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0-0,8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001f\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001f\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070,8\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130,8\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101¨\u0006<"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;", "Landroidx/lifecycle/w1;", "<init>", "()V", "Lec3/l;", "", "multipleAnswersErrorFlow", "()Lec3/l;", "", "title", "Ll83/a0;", "onTitleChanged", "(Ljava/lang/String;)V", "createOption", "id", "text", "onOptionTextChanged", "(ILjava/lang/String;)V", "createPollConfig", "", "allowMultipleVotes", "setAllowMultipleVotes", "(Z)V", "maxAnswer", "setMaxAnswer", "(Ljava/lang/Integer;)V", "suggestAnOption", "setSuggestAnOption", "annonymousPoll", "setAnnonymousPoll", "allowAnswers", "setAllowAnswers", "Lec3/p1;", "_titleStateFlow", "Lec3/p1;", "Ljava/util/LinkedHashMap;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;", "Lkotlin/collections/LinkedHashMap;", "_options", "Lec3/o1;", "createPoll", "Lec3/o1;", "Z", "maxAnswers", "Lec3/f2;", "", "options", "Lec3/f2;", "getOptions", "()Lec3/f2;", "Lec3/t1;", "multipleAnswersError", "Lec3/t1;", "getMultipleAnswersError", "()Lec3/t1;", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "getCreatePollParams", "pollIsReady", "getPollIsReady", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CreatePollViewModel extends AbstractC1637w1 {
    private final InterfaceC13075p1 _options;
    private final InterfaceC13075p1 _titleStateFlow;
    private boolean allowAnswers;
    private InterfaceC13075p1 allowMultipleVotes;
    private boolean annonymousPoll;
    private final InterfaceC13072o1 createPoll;
    private final InterfaceC13037f2 createPollParams;
    private InterfaceC13075p1 maxAnswers;
    private final InterfaceC13087t1 multipleAnswersError;
    private final InterfaceC13037f2 options;
    private final InterfaceC13037f2 pollIsReady;
    private boolean suggestAnOption;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$multipleAnswersErrorFlow$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$multipleAnswersErrorFlow$1", m100430f = "CreatePollViewModel.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", "", "allowMultipleVotes", "", "maxAnswer"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C196961 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        public C196961(InterfaceC30057d<? super C196961> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Boolean) obj).booleanValue(), (Integer) obj2, (InterfaceC30057d<? super Integer>) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.Z$0;
            Integer num = (Integer) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!z4 || num == null || PollsConstants.INSTANCE.getMULTIPLE_ANSWERS_RANGE().m52655e(num.intValue())) {
                return null;
            }
            return new Integer(C19470R.string.stream_ui_poll_multiple_answers_error);
        }

        public final Object invoke(boolean z4, Integer num, InterfaceC30057d<? super Integer> interfaceC30057d) {
            C196961 c196961 = new C196961(3, interfaceC30057d);
            c196961.Z$0 = z4;
            c196961.L$0 = num;
            return c196961.invokeSuspend(C23454a0.f92919a);
        }
    }

    public CreatePollViewModel() {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c("");
        this._titleStateFlow = c13045h2M36593c;
        final C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(new LinkedHashMap());
        this._options = c13045h2M36593c2;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this.createPoll = c13096w1M36592b;
        Boolean bool = Boolean.FALSE;
        this.allowMultipleVotes = AbstractC13091v.m36593c(bool);
        this.maxAnswers = AbstractC13091v.m36593c(null);
        InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C196972<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$special$$inlined$map$1$2", m100430f = "CreatePollViewModel.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C196972.this.emit(null, this);
                    }
                }

                public C196972(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Collection collectionValues = ((LinkedHashMap) obj).values();
                        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
                        List listM74093D1 = AbstractC25265s.m74093D1(collectionValues);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(listM74093D1, anonymousClass1) == enumC31071a) {
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

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = c13045h2M36593c2.collect(new C196972(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
        C26444a c26444aM5043b = AbstractC1640x1.m5043b(this);
        C25271y c25271y = C25271y.f99162w;
        C13021b2 c13021b2 = C13105z1.f45289b;
        C13081r1 c13081r1M36587M = AbstractC13091v.m36587M(interfaceC13058l, c26444aM5043b, c13021b2, c25271y);
        this.options = c13081r1M36587M;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(multipleAnswersErrorFlow(), AbstractC1640x1.m5043b(this), c13021b2, 0);
        this.multipleAnswersError = c13078q1M36586L;
        this.createPollParams = AbstractC13091v.m36587M(AbstractC13091v.m36590P(AbstractC13091v.m36590P(c13096w1M36592b, new CreatePollViewModel$special$$inlined$flatMapLatest$1(null, this)), new CreatePollViewModel$special$$inlined$flatMapLatest$2(null, this)), AbstractC1640x1.m5043b(this), c13021b2, null);
        this.pollIsReady = AbstractC13091v.m36587M(new C13052j1(new InterfaceC13058l[]{c13081r1M36587M, c13045h2M36593c, this.allowMultipleVotes, this.maxAnswers, c13078q1M36586L}, new CreatePollViewModel$pollIsReady$1(null), 2), AbstractC1640x1.m5043b(this), c13021b2, bool);
    }

    private final InterfaceC13058l multipleAnswersErrorFlow() {
        return new C13060l1(this.allowMultipleVotes, this.maxAnswers, new C196961(3, null), 1);
    }

    public final void createOption() {
        InterfaceC13075p1 interfaceC13075p1 = this._options;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) ((C13045h2) this._options).getValue());
        int size = ((LinkedHashMap) ((C13045h2) this._options).getValue()).size();
        linkedHashMap.put(Integer.valueOf(size), new PollAnswer(size, "", false));
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, linkedHashMap);
    }

    public final void createPollConfig() {
        this.createPoll.mo36564a(C23454a0.f92919a);
    }

    public final InterfaceC13037f2 getCreatePollParams() {
        return this.createPollParams;
    }

    public final InterfaceC13087t1 getMultipleAnswersError() {
        return this.multipleAnswersError;
    }

    public final InterfaceC13037f2 getOptions() {
        return this.options;
    }

    public final InterfaceC13037f2 getPollIsReady() {
        return this.pollIsReady;
    }

    public final void onOptionTextChanged(int id4, String text) {
        AbstractC22676k.m65750j(text, "text");
        LinkedHashMap linkedHashMap = (LinkedHashMap) ((C13045h2) this._options).getValue();
        Collection collectionValues = linkedHashMap.values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((PollAnswer) obj).getId() != id4) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC39414r.m125869O0(((PollAnswer) it.next()).getText()).toString());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((String) obj2).length() > 0) {
                arrayList3.add(obj2);
            }
        }
        PollAnswer pollAnswer = (PollAnswer) linkedHashMap.get(Integer.valueOf(id4));
        if (pollAnswer != null) {
            InterfaceC13075p1 interfaceC13075p1 = this._options;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            Integer numValueOf = Integer.valueOf(id4);
            boolean z4 = false;
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (AbstractC22676k.m65745e((String) it3.next(), AbstractC39414r.m125869O0(text).toString())) {
                        z4 = true;
                        break;
                    }
                }
            }
            linkedHashMap2.put(numValueOf, PollAnswer.copy$default(pollAnswer, 0, text, z4, 1, null));
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, linkedHashMap2);
        }
    }

    public final void onTitleChanged(String title) {
        AbstractC22676k.m65750j(title, "title");
        C13045h2 c13045h2 = (C13045h2) this._titleStateFlow;
        c13045h2.getClass();
        c13045h2.m36571k(null, title);
    }

    public final void setAllowAnswers(boolean allowAnswers) {
        this.allowAnswers = allowAnswers;
    }

    public final void setAllowMultipleVotes(boolean allowMultipleVotes) {
        InterfaceC13075p1 interfaceC13075p1 = this.allowMultipleVotes;
        Boolean boolValueOf = Boolean.valueOf(allowMultipleVotes);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, boolValueOf);
    }

    public final void setAnnonymousPoll(boolean annonymousPoll) {
        this.annonymousPoll = annonymousPoll;
    }

    public final void setMaxAnswer(Integer maxAnswer) {
        ((C13045h2) this.maxAnswers).m36570j(maxAnswer);
    }

    public final void setSuggestAnOption(boolean suggestAnOption) {
        this.suggestAnOption = suggestAnOption;
    }
}
