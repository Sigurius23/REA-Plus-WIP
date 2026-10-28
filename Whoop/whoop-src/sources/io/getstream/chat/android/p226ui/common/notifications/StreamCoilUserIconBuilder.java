package io.getstream.chat.android.p226ui.common.notifications;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.notifications.handler.UserIconBuilder;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.images.internal.CoilStreamImageLoader;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@StreamHandsOff(reason = "This class shouldn't be renamed without verifying it works correctly on Chat Client Artifacts because we are using it by reflection")
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/notifications/StreamCoilUserIconBuilder;", "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Landroidx/core/graphics/drawable/IconCompat;", "buildIcon", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Landroid/content/Context;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamCoilUserIconBuilder implements UserIconBuilder {
    public static final int $stable = 8;
    private final Context context;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.notifications.StreamCoilUserIconBuilder$buildIcon$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.notifications.StreamCoilUserIconBuilder", m100430f = "StreamCoilUserIconBuilder.kt", m100431l = {37}, m100432m = "buildIcon")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C196121 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C196121(InterfaceC30057d<? super C196121> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StreamCoilUserIconBuilder.this.buildIcon(null, this);
        }
    }

    public StreamCoilUserIconBuilder(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.notifications.handler.UserIconBuilder
    public Object buildIcon(User user, InterfaceC30057d<? super IconCompat> interfaceC30057d) {
        C196121 c196121;
        if (interfaceC30057d instanceof C196121) {
            c196121 = (C196121) interfaceC30057d;
            int i13 = c196121.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c196121.label = i13 - Integer.MIN_VALUE;
            } else {
                c196121 = new C196121(interfaceC30057d);
            }
        } else {
            c196121 = new C196121(interfaceC30057d);
        }
        Object objLoadAsBitmap = c196121.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c196121.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objLoadAsBitmap);
            StreamImageLoader.INSTANCE.getClass();
            CoilStreamImageLoader coilStreamImageLoader = CoilStreamImageLoader.INSTANCE;
            Context context = this.context;
            String image = user.getImage();
            StreamImageLoader.ImageTransformation.Circle circle = StreamImageLoader.ImageTransformation.Circle.INSTANCE;
            c196121.L$0 = null;
            c196121.label = 1;
            objLoadAsBitmap = coilStreamImageLoader.loadAsBitmap(context, image, circle, c196121);
            if (objLoadAsBitmap == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objLoadAsBitmap);
        }
        Bitmap bitmap = (Bitmap) objLoadAsBitmap;
        if (bitmap != null) {
            return IconCompat.m3679c(bitmap);
        }
        return null;
    }
}
