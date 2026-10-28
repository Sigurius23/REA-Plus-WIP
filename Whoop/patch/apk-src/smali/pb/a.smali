.class public final Lpb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lpb/a;->w:I

    iput-object p1, p0, Lpb/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 5

    iget v0, p0, Lpb/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpb/a;->x:Ljava/lang/Object;

    check-cast v0, Lhb/d;

    const-string v1, "source"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "event"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lhb/c;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const/4 v1, 0x1

    if-eq p2, v1, :cond_b

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p2, v1, :cond_8

    const/4 v1, 0x3

    if-eq p2, v1, :cond_4

    const/4 v1, 0x4

    if-eq p2, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    check-cast p1, Landroidx/fragment/app/y;

    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object p2

    iget-object p2, p2, Leb/t;->f:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Leb/q;

    iget-object v3, v3, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v2, v1

    goto :goto_0

    :cond_2
    check-cast v2, Leb/q;

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object p2

    invoke-virtual {p2, v2}, Leb/t;->b(Leb/q;)V

    :cond_3
    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    goto/16 :goto_4

    :cond_4
    check-cast p1, Landroidx/fragment/app/y;

    invoke-virtual {p1}, Landroidx/fragment/app/y;->requireDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->isShowing()Z

    move-result p2

    if-nez p2, :cond_f

    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object p2

    iget-object p2, p2, Leb/t;->e:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    move-result v1

    goto :goto_1

    :cond_6
    const/4 v1, -0x1

    :goto_1
    invoke-static {v1, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    invoke-static {p2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v3, "Dialog "

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DialogFragmentNavigator"

    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    if-eqz v2, :cond_f

    const/4 p1, 0x0

    invoke-virtual {v0, v1, v2, p1}, Lhb/d;->l(ILeb/q;Z)V

    goto/16 :goto_4

    :cond_8
    check-cast p1, Landroidx/fragment/app/y;

    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object p2

    iget-object p2, p2, Leb/t;->f:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_9
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Leb/q;

    iget-object v3, v3, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    move-object v2, v1

    goto :goto_2

    :cond_a
    check-cast v2, Leb/q;

    if-eqz v2, :cond_f

    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object p1

    invoke-virtual {p1, v2}, Leb/t;->b(Leb/q;)V

    goto :goto_4

    :cond_b
    check-cast p1, Landroidx/fragment/app/y;

    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object p2

    iget-object p2, p2, Leb/t;->e:Lec3/r1;

    iget-object p2, p2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_c

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_3

    :cond_c
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_d
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v0, v0, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_4

    :cond_e
    :goto_3
    invoke-virtual {p1}, Landroidx/fragment/app/y;->dismiss()V

    :cond_f
    :goto_4
    return-void

    :pswitch_0
    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lpb/a;->x:Ljava/lang/Object;

    check-cast p1, Lg/l;

    invoke-static {p1}, Lg/l;->access$ensureViewModelStore(Lg/l;)V

    invoke-virtual {p1}, Lg/l;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lpb/a;->x:Ljava/lang/Object;

    check-cast v0, Lpb/f;

    const-string v1, "source"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "event"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    if-ne p2, v1, :cond_17

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    invoke-interface {v0}, Lpb/f;->getSavedStateRegistry()Lpb/d;

    move-result-object p1

    const-string p2, "androidx.savedstate.Restarter"

    invoke-virtual {p1, p2}, Lpb/d;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-nez p1, :cond_10

    goto/16 :goto_7

    :cond_10
    const-string p2, "classes_to_restore"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_16

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_11
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_15

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string v1, "Class "

    :try_start_0
    const-class v2, Lpb/a;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {p2, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lpb/b;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v3, 0x0

    :try_start_1
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :try_start_2
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Lpb/b;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    instance-of p2, v0, Landroidx/lifecycle/f2;

    if-eqz p2, :cond_14

    move-object p2, v0

    check-cast p2, Landroidx/lifecycle/f2;

    invoke-interface {p2}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object p2

    invoke-interface {v0}, Lpb/f;->getSavedStateRegistry()Lpb/d;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p2, Landroidx/lifecycle/e2;->a:Ljava/util/LinkedHashMap;

    new-instance v2, Ljava/util/HashSet;

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "key"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/w1;

    if-nez v3, :cond_12

    goto :goto_6

    :cond_12
    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v4

    invoke-static {v3, v1, v4}, Landroidx/lifecycle/o1;->c(Landroidx/lifecycle/w1;Lpb/d;Landroidx/lifecycle/x;)V

    goto :goto_6

    :cond_13
    new-instance v2, Ljava/util/HashSet;

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-direct {v2, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_11

    invoke-virtual {v1}, Lpb/d;->d()V

    goto/16 :goto_5

    :cond_14
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to instantiate "

    invoke-static {v1, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " must have default constructor in order to be automatically recreated"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, " wasn\'t found"

    invoke-static {v1, p2, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_15
    :goto_7
    return-void

    :cond_16
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Next event must be ON_CREATE"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
