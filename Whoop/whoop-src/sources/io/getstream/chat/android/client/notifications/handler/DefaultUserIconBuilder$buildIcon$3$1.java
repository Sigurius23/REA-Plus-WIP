package io.getstream.chat.android.client.notifications.handler;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import androidx.core.graphics.drawable.IconCompat;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.io.InputStream;
import java.net.URL;
import l83.C23454a0;
import l83.C23467m;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p572w4.C36795a;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import va3.AbstractC35854l;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.notifications.handler.DefaultUserIconBuilder$buildIcon$3$1", m100430f = "UserIconBuilder.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Landroidx/core/graphics/drawable/IconCompat;", "<anonymous>", "(Lbc3/c0;)Landroidx/core/graphics/drawable/IconCompat;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class DefaultUserIconBuilder$buildIcon$3$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ String $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultUserIconBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultUserIconBuilder$buildIcon$3$1(String str, DefaultUserIconBuilder defaultUserIconBuilder, InterfaceC30057d<? super DefaultUserIconBuilder$buildIcon$3$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$it = str;
        this.this$0 = defaultUserIconBuilder;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        DefaultUserIconBuilder$buildIcon$3$1 defaultUserIconBuilder$buildIcon$3$1 = new DefaultUserIconBuilder$buildIcon$3$1(this.$it, this.this$0, interfaceC30057d);
        defaultUserIconBuilder$buildIcon$3$1.L$0 = obj;
        return defaultUserIconBuilder$buildIcon$3$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super IconCompat> interfaceC30057d) {
        return ((DefaultUserIconBuilder$buildIcon$3$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM107888l;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        String str = this.$it;
        DefaultUserIconBuilder defaultUserIconBuilder = this.this$0;
        try {
            InputStream inputStreamOpenStream = new URL(str).openStream();
            try {
                C36795a c36795a = new C36795a(defaultUserIconBuilder.getContext().getResources(), BitmapFactory.decodeStream(inputStreamOpenStream));
                BitmapShader bitmapShader = c36795a.f157415e;
                Paint paint = c36795a.f157414d;
                c36795a.f157421k = true;
                c36795a.f157420j = true;
                c36795a.f157417g = Math.min(c36795a.f157423m, c36795a.f157422l) / 2;
                paint.setShader(bitmapShader);
                c36795a.invalidateSelf();
                Bitmap bitmapM100030j = AbstractC32123d.m100030j(c36795a);
                AbstractC35854l.m113829i(inputStreamOpenStream, null);
                objM107888l = bitmapM100030j != null ? IconCompat.m3679c(bitmapM100030j) : null;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(inputStreamOpenStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            objM107888l = AbstractC34132o.m107888l(th5);
        }
        if (objM107888l instanceof C23467m) {
            return null;
        }
        return objM107888l;
    }
}
