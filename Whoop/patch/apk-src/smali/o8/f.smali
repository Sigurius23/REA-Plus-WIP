.class public final Lo8/f;
.super Lo8/b;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lo8/e;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/g0;Landroidx/lifecycle/e2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo8/f;->a:Ljava/lang/Object;

    const-string p1, "store"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll8/a;->b:Ll8/a;

    const-string v0, "defaultCreationExtras"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzt/q;

    sget-object v1, Lo8/e;->y:Landroidx/fragment/app/s1;

    invoke-direct {v0, p2, v1, p1}, Lzt/q;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    const-class p1, Lo8/e;

    invoke-static {p1}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const-string p2, "modelClass"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object p1

    check-cast p1, Lo8/e;

    iput-object p1, p0, Lo8/f;->b:Lo8/e;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(ILo8/a;)Lro/d;
    .locals 7

    iget-object v0, p0, Lo8/f;->b:Lo8/e;

    iget-boolean v1, v0, Lo8/e;->x:Z

    iget-object v2, v0, Lo8/e;->w:La0/g1;

    if-nez v1, :cond_4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v3

    if-ne v1, v3, :cond_3

    invoke-virtual {v2, p1}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo8/c;

    iget-object v3, p0, Lo8/f;->a:Ljava/lang/Object;

    if-nez v1, :cond_2

    const-string v1, "Object returned from onCreateLoader must not be a non-static inner member class: "

    const/4 v4, 0x1

    const/4 v5, 0x0

    :try_start_0
    iput-boolean v4, v0, Lo8/e;->x:Z

    invoke-interface {p2}, Lo8/a;->w()Lro/d;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->isMemberClass()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getModifiers()I

    move-result v6

    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v1, Lo8/c;

    invoke-direct {v1, p1, v4}, Lo8/c;-><init>(ILro/d;)V

    invoke-virtual {v2, p1, v1}, La0/g1;->f(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v5, v0, Lo8/e;->x:Z

    invoke-virtual {v1, v3, p2}, Lo8/c;->e(Landroidx/lifecycle/g0;Lo8/a;)Lro/d;

    move-result-object p1

    return-object p1

    :goto_1
    iput-boolean v5, v0, Lo8/e;->x:Z

    throw p1

    :cond_2
    invoke-virtual {v1, v3, p2}, Lo8/c;->e(Landroidx/lifecycle/g0;Lo8/a;)Lro/d;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "initLoader must be called on the main thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called while creating a loader"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    iget-object p2, p0, Lo8/f;->b:Lo8/e;

    iget-object p2, p2, Lo8/e;->w:La0/g1;

    invoke-virtual {p2}, La0/g1;->g()I

    move-result p4

    if-lez p4, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Loaders:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "    "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, La0/g1;->g()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p2, v0}, La0/g1;->h(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo8/c;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, La0/g1;->e(I)I

    move-result v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1}, Lo8/c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v1, p4, p3}, Lo8/c;->c(Ljava/lang/String;Ljava/io/PrintWriter;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "LoaderManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo8/f;->a:Ljava/lang/Object;

    invoke-static {v0, v1}, Ltx/f;->y(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
