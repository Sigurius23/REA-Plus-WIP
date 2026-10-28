package com.whoop.data.remote.commons;

import androidx.health.platform.client.proto.C1533u;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H¦@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u000e\u0010\u0006J\u0010\u0010\u000f\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/data/remote/commons/NetworkBoundCoroutineResource;", "T", "", "<init>", "()V", "get", "(Lq83/d;)Ljava/lang/Object;", "data", "", "shouldFetch", "(Ljava/lang/Object;)Z", "Ll83/a0;", "cache", "(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;", "fetchFromDb", "fetchFromNetwork", "dataFromServer", "shouldCache", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class NetworkBoundCoroutineResource<T> {

    /* JADX INFO: renamed from: com.whoop.data.remote.commons.NetworkBoundCoroutineResource$get$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.remote.commons.NetworkBoundCoroutineResource", m100430f = "NetworkBoundCoroutineResource.kt", m100431l = {14, 16, C1533u.AVG_FIELD_NUMBER, C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "get", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C65441 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ NetworkBoundCoroutineResource<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C65441(NetworkBoundCoroutineResource<T> networkBoundCoroutineResource, InterfaceC30057d<? super C65441> interfaceC30057d) {
            super(interfaceC30057d);
            this.this$0 = networkBoundCoroutineResource;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.get(this);
        }
    }

    public abstract Object cache(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    public abstract Object fetchFromDb(InterfaceC30057d<? super T> interfaceC30057d);

    public abstract Object fetchFromNetwork(InterfaceC30057d<? super T> interfaceC30057d);

    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object get(InterfaceC30057d<? super T> interfaceC30057d) {
        C65441 c65441;
        Object obj;
        Object objFetchFromDb;
        if (interfaceC30057d instanceof C65441) {
            c65441 = (C65441) interfaceC30057d;
            int i13 = c65441.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c65441.label = i13 - Integer.MIN_VALUE;
            } else {
                c65441 = new C65441(this, interfaceC30057d);
            }
        } else {
            c65441 = new C65441(this, interfaceC30057d);
        }
        Object objFetchFromDb2 = c65441.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c65441.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objFetchFromDb2);
            c65441.label = 1;
            objFetchFromDb2 = fetchFromDb(c65441);
            if (objFetchFromDb2 != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objFetchFromDb2);
        } else {
            if (i14 == 2) {
                obj = c65441.L$0;
                AbstractC34132o.m107864I(objFetchFromDb2);
                if (shouldCache(objFetchFromDb2)) {
                    return obj;
                }
                c65441.L$0 = null;
                c65441.L$1 = null;
                c65441.label = 3;
                if (cache(objFetchFromDb2, c65441) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objFetchFromDb2);
                return objFetchFromDb2;
            }
            AbstractC34132o.m107864I(objFetchFromDb2);
        }
        c65441.L$0 = null;
        c65441.L$1 = null;
        c65441.label = 4;
        objFetchFromDb = fetchFromDb(c65441);
        if (objFetchFromDb != enumC31071a) {
            return enumC31071a;
        }
        return objFetchFromDb;
        if (!shouldFetch(objFetchFromDb2)) {
            return objFetchFromDb2;
        }
        c65441.L$0 = objFetchFromDb2;
        c65441.label = 2;
        Object objFetchFromNetwork = fetchFromNetwork(c65441);
        if (objFetchFromNetwork != enumC31071a) {
            obj = objFetchFromDb2;
            objFetchFromDb2 = objFetchFromNetwork;
            if (shouldCache(objFetchFromDb2)) {
                return obj;
            }
            c65441.L$0 = null;
            c65441.L$1 = null;
            c65441.label = 3;
            if (cache(objFetchFromDb2, c65441) != enumC31071a) {
                c65441.L$0 = null;
                c65441.L$1 = null;
                c65441.label = 4;
                objFetchFromDb = fetchFromDb(c65441);
                if (objFetchFromDb != enumC31071a) {
                    return objFetchFromDb;
                }
            }
        }
        return enumC31071a;
    }

    public boolean shouldCache(T dataFromServer) {
        return dataFromServer != null;
    }

    public abstract boolean shouldFetch(T data);
}
