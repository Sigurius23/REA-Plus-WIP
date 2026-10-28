package com.mapbox.maps.coroutine;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.NativeObserver;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC32271e(m100429c = "com.mapbox.maps.coroutine.MapboxMapExtKt$styleImageMissingEvents$1", m100430f = "MapboxMapExt.kt", m100431l = {369}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Lcom/mapbox/maps/StyleImageMissing;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class MapboxMapExtKt$styleImageMissingEvents$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ MapboxMap $this_styleImageMissingEvents;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.mapbox.maps.coroutine.MapboxMapExtKt$styleImageMissingEvents$1$1 */
    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public /* synthetic */ class C55171 extends C22672i implements InterfaceC4339a {
        public C55171(Object obj) {
            super(0, 0, Cancelable.class, obj, "cancel", "cancel()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134114invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134114invoke() {
            ((Cancelable) this.receiver).cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxMapExtKt$styleImageMissingEvents$1(MapboxMap mapboxMap, InterfaceC30057d<? super MapboxMapExtKt$styleImageMissingEvents$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$this_styleImageMissingEvents = mapboxMap;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        MapboxMapExtKt$styleImageMissingEvents$1 mapboxMapExtKt$styleImageMissingEvents$1 = new MapboxMapExtKt$styleImageMissingEvents$1(this.$this_styleImageMissingEvents, interfaceC30057d);
        mapboxMapExtKt$styleImageMissingEvents$1.L$0 = obj;
        return mapboxMapExtKt$styleImageMissingEvents$1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((MapboxMapExtKt$styleImageMissingEvents$1) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.L$0;
            NativeObserver nativeObserver = this.$this_styleImageMissingEvents.getNativeObserver();
            C5520a c5520a = new C5520a(interfaceC11936u);
            C11935t c11935t = (C11935t) interfaceC11936u;
            c11935t.getClass();
            C55171 c55171 = new C55171(NativeObserver.subscribeStyleImageMissing$default(nativeObserver, c5520a, new MapboxMapExtKt$styleImageMissingEvents$1$cancelable$2(c11935t), null, 4, null));
            this.label = 1;
            if (AbstractC37056f.m118984h(interfaceC11936u, c55171, this) == enumC31071a) {
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
