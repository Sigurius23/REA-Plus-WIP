.class public final synthetic Lj/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:Lj/j;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lj/b;

.field public final synthetic z:Lk/b;


# direct methods
.method public synthetic constructor <init>(Lj/j;Ljava/lang/String;Lj/b;Lk/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/e;->w:Lj/j;

    iput-object p2, p0, Lj/e;->x:Ljava/lang/String;

    iput-object p3, p0, Lj/e;->y:Lj/b;

    iput-object p4, p0, Lj/e;->z:Lk/b;

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 5

    iget-object v0, p0, Lj/e;->w:Lj/j;

    iget-object v1, v0, Lj/j;->e:Ljava/util/LinkedHashMap;

    const-string v2, "<anonymous parameter 0>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    iget-object v2, p0, Lj/e;->x:Ljava/lang/String;

    if-ne p1, p2, :cond_1

    iget-object p1, v0, Lj/j;->g:Landroid/os/Bundle;

    iget-object p2, v0, Lj/j;->f:Ljava/util/LinkedHashMap;

    new-instance v0, Lj/f;

    iget-object v3, p0, Lj/e;->z:Lk/b;

    iget-object v4, p0, Lj/e;->y:Lj/b;

    invoke-direct {v0, v3, v4}, Lj/f;-><init>(Lk/b;Lj/b;)V

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4, v0}, Lj/b;->a(Ljava/lang/Object;)V

    :cond_0
    const-class p2, Lj/a;

    invoke-static {p1, p2, v2}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj/a;

    if-eqz p2, :cond_3

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget p1, p2, Lj/a;->w:I

    iget-object p2, p2, Lj/a;->x:Landroid/content/Intent;

    invoke-virtual {v3, p1, p2}, Lk/b;->parseResult(ILandroid/content/Intent;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v4, p1}, Lj/b;->a(Ljava/lang/Object;)V

    return-void

    :cond_1
    sget-object p1, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    if-ne p1, p2, :cond_2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    sget-object p1, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p1, p2, :cond_3

    invoke-virtual {v0, v2}, Lj/j;->f(Ljava/lang/String;)V

    :cond_3
    return-void
.end method
