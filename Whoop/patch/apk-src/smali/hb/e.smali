.class public final synthetic Lhb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/u1;


# instance fields
.field public final synthetic w:Leb/t;

.field public final synthetic x:Lhb/f;


# direct methods
.method public synthetic constructor <init>(Leb/t;Lhb/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/e;->w:Leb/t;

    iput-object p2, p0, Lhb/e;->x:Lhb/f;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V
    .locals 5

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lhb/e;->w:Leb/t;

    iget-object v0, p1, Leb/t;->e:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {p2}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Leb/q;

    invoke-static {}, Lhb/f;->n()Z

    move-result v0

    iget-object v2, p0, Lhb/e;->x:Lhb/f;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Attaching fragment "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " associated with entry "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " to FragmentManager "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v2, Lhb/f;->d:Landroidx/fragment/app/o1;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "FragmentNavigator"

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p2}, Landroidx/fragment/app/m0;->getViewLifecycleOwnerLiveData()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v3, Lc0/h;

    const/4 v4, 0x3

    invoke-direct {v3, v2, p2, v1, v4}, Lc0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v4, Lhb/k;

    invoke-direct {v4, v3}, Lhb/k;-><init>(Lc0/h;)V

    invoke-virtual {v0, p2, v4}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p2}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    iget-object v3, v2, Lhb/f;->h:Lb3/i3;

    invoke-virtual {v0, v3}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    invoke-virtual {v2, p2, v1, p1}, Lhb/f;->l(Landroidx/fragment/app/m0;Leb/q;Leb/t;)V

    :cond_3
    return-void
.end method
