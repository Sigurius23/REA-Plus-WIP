package ld1;

import android.app.Application;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1616p1;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1620r;
import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import jf3.C21647a;
import nf3.C26669a;
import org.koin.core.error.NoBeanDefFoundException;
import p249jc.AbstractC21598x;
import p298l8.AbstractC23420c;
import p298l8.C23418a;
import p505ts.AbstractC34132o;
import p692zt.C41113q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: ld1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0089\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0014\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0091\u0001\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0014\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"VS", "VE", "Lld1/c;", "T", "Landroidx/lifecycle/f2;", "viewModelStoreOwner", "defaultViewState", "Landroid/app/Application;", "application", "Lj93/d;", "clazz", "Lkotlin/Function0;", "Luf3/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "", "key", "d", "(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;", "defaultValue", "b", "(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23865d {

    /* JADX INFO: renamed from: ld1.d$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"ld1/d$a", "Landroidx/lifecycle/a2;", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1563a2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C26669a f94381a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC21461d f94382b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC4339a f94383c;

        public a(C26669a c26669a, InterfaceC21461d interfaceC21461d, InterfaceC4339a interfaceC4339a) {
            this.f94381a = c26669a;
            this.f94382b = interfaceC21461d;
            this.f94383c = interfaceC4339a;
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public /* bridge */ <T extends AbstractC1637w1> T create(InterfaceC21461d interfaceC21461d, AbstractC23420c abstractC23420c) {
            return (T) super.create(interfaceC21461d, abstractC23420c);
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public /* bridge */ <T extends AbstractC1637w1> T create(Class<T> cls, AbstractC23420c abstractC23420c) {
            return (T) super.create(cls, abstractC23420c);
        }

        @Override // androidx.lifecycle.InterfaceC1563a2
        public <T extends AbstractC1637w1> T create(Class<T> modelClass) {
            AbstractC22676k.m65750j(modelClass, "modelClass");
            C26669a c26669a = this.f94381a;
            InterfaceC21461d clazz = this.f94382b;
            InterfaceC4339a interfaceC4339a = this.f94383c;
            c26669a.getClass();
            AbstractC22676k.m65750j(clazz, "clazz");
            Object objM122602a = c26669a.f106046a.f159364d.m122602a(interfaceC4339a, clazz, null);
            AbstractC22676k.m65748h(objM122602a, "null cannot be cast to non-null type T of com.whoop.design.util.di.DesignViewModelInjectionKt._getViewModelFromApplication.<no name provided>.create");
            return (T) objM122602a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final <VS, VE, T extends AbstractC23864c<VS, VE>> AbstractC23864c<VS, VE> m70117b(Application application, InterfaceC1583f2 viewModelStoreOwner, InterfaceC21461d clazz, InterfaceC4339a interfaceC4339a, AbstractC23864c<VS, VE> defaultValue, String str) {
        AbstractC22676k.m65750j(application, "application");
        AbstractC22676k.m65750j(viewModelStoreOwner, "viewModelStoreOwner");
        AbstractC22676k.m65750j(clazz, "clazz");
        AbstractC22676k.m65750j(defaultValue, "defaultValue");
        try {
            if (str == null) {
                return (AbstractC23864c) AbstractC34132o.m107857B(application, null, clazz, new C1616p1(viewModelStoreOwner, 1), interfaceC4339a);
            }
            a aVar = new a(AbstractC34924m.m110120B(application), clazz, interfaceC4339a);
            C1579e2 store = viewModelStoreOwner.getViewModelStore();
            AbstractC23420c defaultCreationExtras = viewModelStoreOwner instanceof InterfaceC1620r ? ((InterfaceC1620r) viewModelStoreOwner).getDefaultViewModelCreationExtras() : C23418a.f92771b;
            AbstractC22676k.m65750j(store, "store");
            AbstractC22676k.m65750j(defaultCreationExtras, "defaultCreationExtras");
            return (AbstractC23864c) new C41113q(store, aVar, defaultCreationExtras).m133475w(str, AbstractC21598x.m60666V(AbstractC21598x.m60663S(clazz)));
        } catch (NoBeanDefFoundException unused) {
            return defaultValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C21647a m70118c(InterfaceC1583f2 storeOwner) {
        AbstractC22676k.m65750j(storeOwner, "storeOwner");
        C1579e2 viewModelStore = storeOwner.getViewModelStore();
        AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
        return new C21647a(viewModelStore, null);
    }

    /* JADX INFO: renamed from: d */
    public static final <VS, VE, T extends AbstractC23864c<VS, VE>> AbstractC23864c<VS, VE> m70119d(InterfaceC1583f2 interfaceC1583f2, VS vs3, Application application, InterfaceC21461d clazz, InterfaceC4339a interfaceC4339a, String str) {
        AbstractC22676k.m65750j(clazz, "clazz");
        C23863b c23863b = new C23863b(vs3);
        return (interfaceC1583f2 == null || application == null) ? c23863b : m70117b(application, interfaceC1583f2, clazz, interfaceC4339a, c23863b, str);
    }
}
