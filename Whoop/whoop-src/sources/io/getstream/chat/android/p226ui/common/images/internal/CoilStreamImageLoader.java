package io.getstream.chat.android.p226ui.common.images.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.persistent.C6494e;
import eg.C13161j;
import f93.C14289a;
import fi.AbstractC14504j;
import fi.AbstractC14505k;
import fi.C14498d;
import fi.C14499e;
import fi.C14503i;
import fi.C14511q;
import fi.InterfaceC14497c;
import fi.InterfaceC14502h;
import fi.InterfaceC14506l;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.p226ui.common.disposable.CoilDisposable;
import io.getstream.chat.android.p226ui.common.disposable.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import p196hi.C17302a;
import p221ii.C18531a;
import p461rh.AbstractC31426o;
import p461rh.AbstractC31433v;
import p461rh.AbstractC31435x;
import p461rh.C31431t;
import p461rh.InterfaceC31421j;
import p461rh.InterfaceC31425n;
import p461rh.InterfaceC31432u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\n*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0016¢\u0006\u0004\b\"\u0010#JO\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0016¢\u0006\u0004\b\"\u0010&JP\u0010'\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0096@¢\u0006\u0004\b'\u0010(JO\u0010+\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0016¢\u0006\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/internal/CoilStreamImageLoader;", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader;", "<init>", "()V", "Landroid/widget/ImageView;", "", "data", "Lrh/n;", "imageLoader", "Lkotlin/Function1;", "Lfi/e;", "Ll83/a0;", "builder", "Lfi/c;", "loadDisposables", "(Landroid/widget/ImageView;Ljava/lang/Object;Lrh/n;Lkotlin/jvm/functions/Function1;)Lfi/c;", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;", "transformation", "applyTransformation", "(Lfi/e;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;)Lfi/e;", "Landroid/content/Context;", "context", "", QueryParams.URL, "Landroid/graphics/Bitmap;", "loadAsBitmap", "(Landroid/content/Context;Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lq83/d;)Ljava/lang/Object;", "target", "", "placeholderResId", "Lkotlin/Function0;", "onStart", "onComplete", "Lio/getstream/chat/android/ui/common/disposable/Disposable;", "load", "(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;", "loadAndResize", "(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "loadVideoThumbnail", "(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CoilStreamImageLoader implements StreamImageLoader {
    public static final int $stable = 0;
    public static final CoilStreamImageLoader INSTANCE = new CoilStreamImageLoader();

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAndResize$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAndResize$2", m100430f = "CoilStreamImageLoader.kt", m100431l = {146}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196042 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Object $data;
        final /* synthetic */ InterfaceC4339a $onComplete;
        final /* synthetic */ InterfaceC4339a $onStart;
        final /* synthetic */ Drawable $placeholderDrawable;
        final /* synthetic */ ImageView $target;
        final /* synthetic */ StreamImageLoader.ImageTransformation $transformation;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAndResize$2$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAndResize$2$1", m100430f = "CoilStreamImageLoader.kt", m100431l = {147}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Lbc3/c0;)Landroid/graphics/drawable/Drawable;"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            final /* synthetic */ InterfaceC30063j $calledContext;
            final /* synthetic */ Context $context;
            final /* synthetic */ Object $data;
            final /* synthetic */ InterfaceC4339a $onComplete;
            final /* synthetic */ InterfaceC4339a $onStart;
            final /* synthetic */ Drawable $placeholderDrawable;
            final /* synthetic */ StreamImageLoader.ImageTransformation $transformation;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Context context, Drawable drawable, Object obj, StreamImageLoader.ImageTransformation imageTransformation, InterfaceC30063j interfaceC30063j, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.$context = context;
                this.$placeholderDrawable = drawable;
                this.$data = obj;
                this.$transformation = imageTransformation;
                this.$calledContext = interfaceC30063j;
                this.$onStart = interfaceC4339a;
                this.$onComplete = interfaceC4339a2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$placeholderDrawable, this.$data, this.$transformation, this.$calledContext, this.$onStart, this.$onComplete, interfaceC30057d);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Drawable> interfaceC30057d) {
                return ((AnonymousClass1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                Object objM96749c;
                final InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.label;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    StreamCoil streamCoil = StreamCoil.INSTANCE;
                    Context context = this.$context;
                    AbstractC22676k.m65747g(context);
                    InterfaceC31425n interfaceC31425nImageLoader$stream_chat_android_ui_common_release = streamCoil.imageLoader$stream_chat_android_ui_common_release(context);
                    CoilStreamImageLoader coilStreamImageLoader = CoilStreamImageLoader.INSTANCE;
                    Context context2 = this.$context;
                    AbstractC22676k.m65747g(context2);
                    C14499e c14499e = new C14499e(context2);
                    Drawable drawable = this.$placeholderDrawable;
                    C14289a c14289a = AbstractC14505k.f52993a;
                    int i14 = 10;
                    c14499e.f52940h = new C13161j(drawable != null ? AbstractC31426o.m96739c(drawable) : null, i14);
                    Drawable drawable2 = this.$placeholderDrawable;
                    c14499e.f52942j = new C13161j(drawable2 != null ? AbstractC31426o.m96739c(drawable2) : null, i14);
                    Drawable drawable3 = this.$placeholderDrawable;
                    c14499e.f52941i = new C13161j(drawable3 != null ? AbstractC31426o.m96739c(drawable3) : null, i14);
                    c14499e.f52935c = this.$data;
                    final InterfaceC30063j interfaceC30063j = this.$calledContext;
                    final InterfaceC4339a interfaceC4339a = this.$onStart;
                    final InterfaceC4339a interfaceC4339a2 = this.$onComplete;
                    c14499e.f52937e = new InterfaceC14502h() { // from class: io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAndResize$2$1$invokeSuspend$$inlined$listener$1
                        @Override // fi.InterfaceC14502h
                        public final void onCancel(C14503i request) {
                            AbstractC3006f0.m8732z(interfaceC2994c0, interfaceC30063j, null, new CoilStreamImageLoader$loadAndResize$2$1$result$2$1(interfaceC4339a2, null), 2);
                        }

                        @Override // fi.InterfaceC14502h
                        public final void onError(C14503i request, C14498d result) {
                            AbstractC3006f0.m8732z(interfaceC2994c0, interfaceC30063j, null, new CoilStreamImageLoader$loadAndResize$2$1$result$3$1(interfaceC4339a2, null), 2);
                        }

                        @Override // fi.InterfaceC14502h
                        public final void onStart(C14503i request) {
                            AbstractC3006f0.m8732z(interfaceC2994c0, interfaceC30063j, null, new CoilStreamImageLoader$loadAndResize$2$1$result$1$1(interfaceC4339a, null), 2);
                        }

                        @Override // fi.InterfaceC14502h
                        public final void onSuccess(C14503i request, C14511q result) {
                            AbstractC3006f0.m8732z(interfaceC2994c0, interfaceC30063j, null, new CoilStreamImageLoader$loadAndResize$2$1$result$4$1(interfaceC4339a2, null), 2);
                        }
                    };
                    C14503i c14503iM41408a = coilStreamImageLoader.applyTransformation(c14499e, this.$transformation).m41408a();
                    this.L$0 = null;
                    this.label = 1;
                    objM96749c = ((C31431t) interfaceC31425nImageLoader$stream_chat_android_ui_common_release).m96749c(c14503iM41408a, this);
                    if (objM96749c == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM96749c = obj;
                }
                InterfaceC31421j interfaceC31421jMo41407e = ((InterfaceC14506l) objM96749c).mo41407e();
                if (interfaceC31421jMo41407e == null) {
                    return null;
                }
                Resources resources = this.$context.getResources();
                AbstractC22676k.m65749i(resources, "getResources(...)");
                return AbstractC31426o.m96738b(interfaceC31421jMo41407e, resources);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196042(ImageView imageView, Drawable drawable, Object obj, StreamImageLoader.ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC30057d<? super C196042> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$target = imageView;
            this.$placeholderDrawable = drawable;
            this.$data = obj;
            this.$transformation = imageTransformation;
            this.$onStart = interfaceC4339a;
            this.$onComplete = interfaceC4339a2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C196042 c196042 = new C196042(this.$target, this.$placeholderDrawable, this.$data, this.$transformation, this.$onStart, this.$onComplete, interfaceC30057d);
            c196042.L$0 = obj;
            return c196042;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C196042) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC30063j interfaceC30063j;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Context context = this.$target.getContext();
                InterfaceC30063j coroutineContext = interfaceC2994c0.getCoroutineContext();
                AbstractC3076z io3 = DispatcherProvider.INSTANCE.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$placeholderDrawable, this.$data, this.$transformation, coroutineContext, this.$onStart, this.$onComplete, null);
                this.L$0 = interfaceC2994c0;
                this.L$1 = null;
                this.L$2 = coroutineContext;
                this.label = 1;
                obj = AbstractC3006f0.m8705K(io3, anonymousClass1, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
                interfaceC30063j = coroutineContext;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC30063j = (InterfaceC30063j) this.L$2;
                AbstractC34132o.m107864I(obj);
            }
            Drawable drawable = (Drawable) obj;
            if (drawable != null) {
                AbstractC3006f0.m8732z(interfaceC2994c0, interfaceC30063j, null, new CoilStreamImageLoader$loadAndResize$2$2$1(drawable, this.$target, null), 2);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAsBitmap$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadAsBitmap$2", m100430f = "CoilStreamImageLoader.kt", m100431l = {57}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lbc3/c0;)Landroid/graphics/Bitmap;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C196062 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Context $context;
        final /* synthetic */ StreamImageLoader.ImageTransformation $transformation;
        final /* synthetic */ String $url;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C196062(String str, Context context, StreamImageLoader.ImageTransformation imageTransformation, InterfaceC30057d<? super C196062> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$url = str;
            this.$context = context;
            this.$transformation = imageTransformation;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C196062(this.$url, this.$context, this.$transformation, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
            return ((C196062) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Context context;
            Drawable drawableM96738b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str = this.$url;
                if (AbstractC39414r.m125890i0(str)) {
                    str = null;
                }
                if (str != null) {
                    Context context2 = this.$context;
                    String str2 = this.$url;
                    StreamImageLoader.ImageTransformation imageTransformation = this.$transformation;
                    InterfaceC31425n interfaceC31425nImageLoader$stream_chat_android_ui_common_release = StreamCoil.INSTANCE.imageLoader$stream_chat_android_ui_common_release(context2);
                    CoilStreamImageLoader coilStreamImageLoader = CoilStreamImageLoader.INSTANCE;
                    C14499e c14499e = new C14499e(context2);
                    c14499e.f52935c = str2;
                    C14503i c14503iM41408a = coilStreamImageLoader.applyTransformation(c14499e, imageTransformation).m41408a();
                    this.L$0 = context2;
                    this.L$1 = null;
                    this.I$0 = 0;
                    this.label = 1;
                    Object objM96749c = ((C31431t) interfaceC31425nImageLoader$stream_chat_android_ui_common_release).m96749c(c14503iM41408a, this);
                    if (objM96749c == enumC31071a) {
                        return enumC31071a;
                    }
                    context = context2;
                    obj = objM96749c;
                }
                return null;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) this.L$0;
            AbstractC34132o.m107864I(obj);
            InterfaceC31421j interfaceC31421jMo41407e = ((InterfaceC14506l) obj).mo41407e();
            if (interfaceC31421jMo41407e != null) {
                Resources resources = context.getResources();
                AbstractC22676k.m65749i(resources, "getResources(...)");
                drawableM96738b = AbstractC31426o.m96738b(interfaceC31421jMo41407e, resources);
            } else {
                drawableM96738b = null;
            }
            BitmapDrawable bitmapDrawable = drawableM96738b instanceof BitmapDrawable ? (BitmapDrawable) drawableM96738b : null;
            if (bitmapDrawable != null) {
                return bitmapDrawable.getBitmap();
            }
            return null;
        }
    }

    private CoilStreamImageLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C14499e applyTransformation(C14499e c14499e, StreamImageLoader.ImageTransformation imageTransformation) {
        if (imageTransformation instanceof StreamImageLoader.ImageTransformation.None) {
            return c14499e;
        }
        if (imageTransformation instanceof StreamImageLoader.ImageTransformation.Circle) {
            AbstractC14504j.m41411a(c14499e, new C18531a());
            return c14499e;
        }
        if (!(imageTransformation instanceof StreamImageLoader.ImageTransformation.RoundedCorners)) {
            throw new NoWhenBranchMatchedException();
        }
        float radius = ((StreamImageLoader.ImageTransformation.RoundedCorners) imageTransformation).getRadius();
        AbstractC14504j.m41411a(c14499e, new RoundedCornersTransformation(radius, radius, radius, radius));
        return c14499e;
    }

    private static final C23454a0 load$lambda$4(Integer num, StreamImageLoader.ImageTransformation imageTransformation, final InterfaceC4339a interfaceC4339a, final InterfaceC4339a interfaceC4339a2, C14499e loadDisposables) {
        AbstractC22676k.m65750j(loadDisposables, "$this$loadDisposables");
        if (num != null) {
            int iIntValue = num.intValue();
            C14289a c14289a = AbstractC14505k.f52993a;
            loadDisposables.f52940h = new C6494e(iIntValue, 8);
            loadDisposables.f52942j = new C6494e(num.intValue(), 6);
            loadDisposables.f52941i = new C6494e(num.intValue(), 7);
        }
        loadDisposables.f52937e = new InterfaceC14502h() { // from class: io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$load$lambda$4$$inlined$listener$1
            @Override // fi.InterfaceC14502h
            public final void onCancel(C14503i request) {
                interfaceC4339a2.invoke();
            }

            @Override // fi.InterfaceC14502h
            public final void onError(C14503i request, C14498d result) {
                interfaceC4339a2.invoke();
            }

            @Override // fi.InterfaceC14502h
            public final void onStart(C14503i request) {
                interfaceC4339a.invoke();
            }

            @Override // fi.InterfaceC14502h
            public final void onSuccess(C14503i request, C14511q result) {
                interfaceC4339a2.invoke();
            }
        };
        INSTANCE.applyTransformation(loadDisposables, imageTransformation);
        return C23454a0.f92919a;
    }

    private static final C23454a0 load$lambda$9(Drawable drawable, StreamImageLoader.ImageTransformation imageTransformation, final InterfaceC4339a interfaceC4339a, final InterfaceC4339a interfaceC4339a2, C14499e loadDisposables) {
        AbstractC22676k.m65750j(loadDisposables, "$this$loadDisposables");
        if (drawable != null) {
            C14289a c14289a = AbstractC14505k.f52993a;
            int i13 = 10;
            loadDisposables.f52940h = new C13161j(AbstractC31426o.m96739c(drawable), i13);
            loadDisposables.f52942j = new C13161j(AbstractC31426o.m96739c(drawable), i13);
            loadDisposables.f52941i = new C13161j(AbstractC31426o.m96739c(drawable), i13);
        }
        loadDisposables.f52937e = new InterfaceC14502h() { // from class: io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$load$lambda$9$$inlined$listener$1
            @Override // fi.InterfaceC14502h
            public final void onCancel(C14503i request) {
                interfaceC4339a2.invoke();
            }

            @Override // fi.InterfaceC14502h
            public final void onError(C14503i request, C14498d result) {
                interfaceC4339a2.invoke();
            }

            @Override // fi.InterfaceC14502h
            public final void onStart(C14503i request) {
                interfaceC4339a.invoke();
            }

            @Override // fi.InterfaceC14502h
            public final void onSuccess(C14503i request, C14511q result) {
                interfaceC4339a2.invoke();
            }
        };
        INSTANCE.applyTransformation(loadDisposables, imageTransformation);
        return C23454a0.f92919a;
    }

    private final InterfaceC14497c loadDisposables(ImageView imageView, Object obj, InterfaceC31425n interfaceC31425n, Function1 function1) {
        C14499e c14499e = new C14499e(imageView.getContext());
        c14499e.f52935c = obj;
        C14289a c14289a = AbstractC14505k.f52993a;
        c14499e.f52936d = new C17302a(imageView);
        function1.invoke(c14499e);
        return ((C31431t) interfaceC31425n).m96747a(c14499e.m41408a());
    }

    public static InterfaceC14497c loadDisposables$default(CoilStreamImageLoader coilStreamImageLoader, ImageView imageView, Object obj, InterfaceC31425n interfaceC31425n, Function1 function1, int i13, Object obj2) {
        InterfaceC31425n interfaceC31425n2;
        InterfaceC31425n interfaceC31425n3;
        if ((i13 & 2) != 0) {
            Context context = imageView.getContext();
            AbstractC22676k.m65749i(context, "getContext(...)");
            AtomicReference atomicReference = AbstractC31433v.f129324a;
            Object obj3 = atomicReference.get();
            InterfaceC31425n interfaceC31425n4 = obj3 instanceof InterfaceC31425n ? (InterfaceC31425n) obj3 : null;
            if (interfaceC31425n4 == null) {
                InterfaceC31425n interfaceC31425nNewImageLoader = null;
                loop0: while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 instanceof InterfaceC31425n) {
                        interfaceC31425n2 = (InterfaceC31425n) obj4;
                        interfaceC31425n3 = interfaceC31425nNewImageLoader;
                    } else {
                        if (interfaceC31425nNewImageLoader == null) {
                            InterfaceC31432u interfaceC31432u = obj4 instanceof InterfaceC31432u ? (InterfaceC31432u) obj4 : null;
                            if (interfaceC31432u != null) {
                                interfaceC31425nNewImageLoader = interfaceC31432u.newImageLoader(context);
                            } else {
                                Object applicationContext = context.getApplicationContext();
                                InterfaceC31432u interfaceC31432u2 = applicationContext instanceof InterfaceC31432u ? (InterfaceC31432u) applicationContext : null;
                                interfaceC31425nNewImageLoader = interfaceC31432u2 != null ? interfaceC31432u2.newImageLoader(context) : AbstractC31435x.f129325a.newImageLoader(context);
                            }
                        }
                        interfaceC31425n2 = interfaceC31425nNewImageLoader;
                        interfaceC31425n3 = interfaceC31425n2;
                    }
                    while (true) {
                        if (atomicReference.compareAndSet(obj4, interfaceC31425n2)) {
                            break loop0;
                        }
                        if (atomicReference.get() != obj4) {
                            interfaceC31425nNewImageLoader = interfaceC31425n3;
                        }
                    }
                }
                interfaceC31425n = interfaceC31425n2;
            } else {
                interfaceC31425n = interfaceC31425n4;
            }
        }
        if ((i13 & 4) != 0) {
            function1 = new C19336c(25);
        }
        return coilStreamImageLoader.loadDisposables(imageView, obj, interfaceC31425n, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 loadDisposables$lambda$15(C14499e c14499e) {
        AbstractC22676k.m65750j(c14499e, "<this>");
        return C23454a0.f92919a;
    }

    private static final C23454a0 loadVideoThumbnail$lambda$14(Integer num, StreamImageLoader.ImageTransformation imageTransformation, final InterfaceC4339a interfaceC4339a, final InterfaceC4339a interfaceC4339a2, C14499e loadDisposables) {
        AbstractC22676k.m65750j(loadDisposables, "$this$loadDisposables");
        if (num != null) {
            int iIntValue = num.intValue();
            C14289a c14289a = AbstractC14505k.f52993a;
            loadDisposables.f52940h = new C6494e(iIntValue, 8);
            loadDisposables.f52942j = new C6494e(num.intValue(), 6);
            loadDisposables.f52941i = new C6494e(num.intValue(), 7);
        }
        loadDisposables.f52937e = new InterfaceC14502h() { // from class: io.getstream.chat.android.ui.common.images.internal.CoilStreamImageLoader$loadVideoThumbnail$lambda$14$$inlined$listener$1
            @Override // fi.InterfaceC14502h
            public final void onCancel(C14503i request) {
                interfaceC4339a2.invoke();
            }

            @Override // fi.InterfaceC14502h
            public final void onError(C14503i request, C14498d result) {
                interfaceC4339a2.invoke();
            }

            @Override // fi.InterfaceC14502h
            public final void onStart(C14503i request) {
                interfaceC4339a.invoke();
            }

            @Override // fi.InterfaceC14502h
            public final void onSuccess(C14503i request, C14511q result) {
                interfaceC4339a2.invoke();
            }
        };
        INSTANCE.applyTransformation(loadDisposables, imageTransformation);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader
    public final Disposable load(ImageView target, Object data, Integer placeholderResId, StreamImageLoader.ImageTransformation transformation, InterfaceC4339a onStart, InterfaceC4339a onComplete) {
        AbstractC22676k.m65750j(target, "target");
        AbstractC22676k.m65750j(transformation, "transformation");
        AbstractC22676k.m65750j(onStart, "onStart");
        AbstractC22676k.m65750j(onComplete, "onComplete");
        Context context = target.getContext();
        StreamCoil streamCoil = StreamCoil.INSTANCE;
        AbstractC22676k.m65747g(context);
        InterfaceC31425n interfaceC31425nImageLoader$stream_chat_android_ui_common_release = streamCoil.imageLoader$stream_chat_android_ui_common_release(context);
        C14499e c14499e = new C14499e(target.getContext());
        c14499e.f52935c = data;
        C14289a c14289a = AbstractC14505k.f52993a;
        c14499e.f52936d = new C17302a(target);
        load$lambda$4(placeholderResId, transformation, onStart, onComplete, c14499e);
        return new CoilDisposable(((C31431t) interfaceC31425nImageLoader$stream_chat_android_ui_common_release).m96747a(c14499e.m41408a()));
    }

    @Override // io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader
    public final Object loadAndResize(ImageView imageView, Object obj, Drawable drawable, StreamImageLoader.ImageTransformation imageTransformation, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM8719m = AbstractC3006f0.m8719m(new C196042(imageView, drawable, obj, imageTransformation, interfaceC4339a, interfaceC4339a2, null), interfaceC30057d);
        return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader
    public final Object loadAsBitmap(Context context, String str, StreamImageLoader.ImageTransformation imageTransformation, InterfaceC30057d<? super Bitmap> interfaceC30057d) {
        return AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getIO(), new C196062(str, context, imageTransformation, null), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader
    public final Disposable loadVideoThumbnail(ImageView target, Uri uri, Integer placeholderResId, StreamImageLoader.ImageTransformation transformation, InterfaceC4339a onStart, InterfaceC4339a onComplete) {
        AbstractC22676k.m65750j(target, "target");
        AbstractC22676k.m65750j(transformation, "transformation");
        AbstractC22676k.m65750j(onStart, "onStart");
        AbstractC22676k.m65750j(onComplete, "onComplete");
        Context context = target.getContext();
        StreamCoil streamCoil = StreamCoil.INSTANCE;
        AbstractC22676k.m65747g(context);
        InterfaceC31425n interfaceC31425nImageLoader$stream_chat_android_ui_common_release = streamCoil.imageLoader$stream_chat_android_ui_common_release(context);
        C14499e c14499e = new C14499e(target.getContext());
        c14499e.f52935c = uri;
        C14289a c14289a = AbstractC14505k.f52993a;
        c14499e.f52936d = new C17302a(target);
        loadVideoThumbnail$lambda$14(placeholderResId, transformation, onStart, onComplete, c14499e);
        return new CoilDisposable(((C31431t) interfaceC31425nImageLoader$stream_chat_android_ui_common_release).m96747a(c14499e.m41408a()));
    }

    @Override // io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader
    public final Disposable load(ImageView target, Object data, Drawable placeholderDrawable, StreamImageLoader.ImageTransformation transformation, InterfaceC4339a onStart, InterfaceC4339a onComplete) {
        AbstractC22676k.m65750j(target, "target");
        AbstractC22676k.m65750j(transformation, "transformation");
        AbstractC22676k.m65750j(onStart, "onStart");
        AbstractC22676k.m65750j(onComplete, "onComplete");
        Context context = target.getContext();
        StreamCoil streamCoil = StreamCoil.INSTANCE;
        AbstractC22676k.m65747g(context);
        InterfaceC31425n interfaceC31425nImageLoader$stream_chat_android_ui_common_release = streamCoil.imageLoader$stream_chat_android_ui_common_release(context);
        C14499e c14499e = new C14499e(target.getContext());
        c14499e.f52935c = data;
        C14289a c14289a = AbstractC14505k.f52993a;
        c14499e.f52936d = new C17302a(target);
        load$lambda$9(placeholderDrawable, transformation, onStart, onComplete, c14499e);
        return new CoilDisposable(((C31431t) interfaceC31425nImageLoader$stream_chat_android_ui_common_release).m96747a(c14499e.m41408a()));
    }
}
