package io.ktor.utils.p228io;

import java.lang.reflect.Constructor;
import l83.C23467m;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.ktor.utils.io.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C20029v extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75138w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Constructor f75139x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20029v(Constructor constructor, int i13) {
        super(1);
        this.f75138w = i13;
        this.f75139x = constructor;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objM107888l;
        Object objM107888l2;
        Object objM107888l3;
        Object objM107888l4;
        switch (this.f75138w) {
            case 0:
                Throwable e5 = (Throwable) obj;
                AbstractC22676k.m65750j(e5, "e");
                try {
                    Object objNewInstance = this.f75139x.newInstance(e5.getMessage(), e5);
                    AbstractC22676k.m65748h(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                    objM107888l = (Throwable) objNewInstance;
                    break;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l instanceof C23467m) {
                    objM107888l = null;
                }
                return (Throwable) objM107888l;
            case 1:
                Throwable e13 = (Throwable) obj;
                AbstractC22676k.m65750j(e13, "e");
                try {
                    Object objNewInstance2 = this.f75139x.newInstance(e13);
                    AbstractC22676k.m65748h(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                    objM107888l2 = (Throwable) objNewInstance2;
                    break;
                } catch (Throwable th4) {
                    objM107888l2 = AbstractC34132o.m107888l(th4);
                }
                if (objM107888l2 instanceof C23467m) {
                    objM107888l2 = null;
                }
                return (Throwable) objM107888l2;
            case 2:
                Throwable e14 = (Throwable) obj;
                AbstractC22676k.m65750j(e14, "e");
                try {
                    Object objNewInstance3 = this.f75139x.newInstance(e14.getMessage());
                    AbstractC22676k.m65748h(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                    Throwable th5 = (Throwable) objNewInstance3;
                    th5.initCause(e14);
                    objM107888l3 = th5;
                    break;
                } catch (Throwable th6) {
                    objM107888l3 = AbstractC34132o.m107888l(th6);
                }
                boolean z4 = objM107888l3 instanceof C23467m;
                Object obj2 = objM107888l3;
                if (z4) {
                    obj2 = null;
                }
                return (Throwable) obj2;
            default:
                Throwable e15 = (Throwable) obj;
                AbstractC22676k.m65750j(e15, "e");
                try {
                    Object objNewInstance4 = this.f75139x.newInstance(null);
                    AbstractC22676k.m65748h(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                    Throwable th7 = (Throwable) objNewInstance4;
                    th7.initCause(e15);
                    objM107888l4 = th7;
                    break;
                } catch (Throwable th8) {
                    objM107888l4 = AbstractC34132o.m107888l(th8);
                }
                return (Throwable) (objM107888l4 instanceof C23467m ? null : objM107888l4);
        }
    }
}
