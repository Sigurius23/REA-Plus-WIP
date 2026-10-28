package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator;

import i01.C17841d;
import java.util.ArrayList;
import java.util.List;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¨\u0006\u0003"}, m65681d2 = {"plus", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;", "other", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DecoratorProviderKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProviderKt$plus$1 */
    @Metadata(m65680d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"io/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderKt$plus$1", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators$delegate", "Ll83/h;", "getDecorators", "()Ljava/util/List;", "decorators", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C197911 implements DecoratorProvider {

        /* JADX INFO: renamed from: decorators$delegate, reason: from kotlin metadata */
        private final InterfaceC23462h decorators;

        public C197911(DecoratorProvider decoratorProvider, DecoratorProvider decoratorProvider2) {
            this.decorators = AbstractC30060g.m92088H(new C17841d(19, decoratorProvider, decoratorProvider2));
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ ArrayList m55538a(DecoratorProvider decoratorProvider, DecoratorProvider decoratorProvider2) {
            return (ArrayList) decorators_delegate$lambda$0(decoratorProvider, decoratorProvider2);
        }

        private static final List decorators_delegate$lambda$0(DecoratorProvider decoratorProvider, DecoratorProvider decoratorProvider2) {
            return AbstractC25265s.m74129g1(decoratorProvider.getDecorators(), decoratorProvider2.getDecorators());
        }

        @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProvider
        public final List<Decorator> getDecorators() {
            return (List) this.decorators.getValue();
        }
    }

    public static final DecoratorProvider plus(DecoratorProvider decoratorProvider, DecoratorProvider other) {
        AbstractC22676k.m65750j(decoratorProvider, "<this>");
        AbstractC22676k.m65750j(other, "other");
        return new C197911(decoratorProvider, other);
    }
}
