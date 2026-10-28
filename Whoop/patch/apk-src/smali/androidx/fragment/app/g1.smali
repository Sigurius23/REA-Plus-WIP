.class public final Landroidx/fragment/app/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Landroidx/fragment/app/w1;

.field public final synthetic y:Landroidx/lifecycle/x;

.field public final synthetic z:Landroidx/fragment/app/o1;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o1;Ljava/lang/String;Landroidx/fragment/app/w1;Landroidx/lifecycle/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/g1;->z:Landroidx/fragment/app/o1;

    iput-object p2, p0, Landroidx/fragment/app/g1;->w:Ljava/lang/String;

    iput-object p3, p0, Landroidx/fragment/app/g1;->x:Landroidx/fragment/app/w1;

    iput-object p4, p0, Landroidx/fragment/app/g1;->y:Landroidx/lifecycle/x;

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 4

    iget-object p1, p0, Landroidx/fragment/app/g1;->z:Landroidx/fragment/app/o1;

    iget-object v0, p1, Landroidx/fragment/app/o1;->m:Ljava/util/Map;

    sget-object v1, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    iget-object v2, p0, Landroidx/fragment/app/g1;->w:Ljava/lang/String;

    if-ne p2, v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz v1, :cond_0

    iget-object v3, p0, Landroidx/fragment/app/g1;->x:Landroidx/fragment/app/w1;

    invoke-interface {v3, v1, v2}, Landroidx/fragment/app/w1;->a(Landroid/os/Bundle;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Clearing fragment result with key "

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget-object v0, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Landroidx/fragment/app/g1;->y:Landroidx/lifecycle/x;

    invoke-virtual {p2, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    iget-object p1, p1, Landroidx/fragment/app/o1;->n:Ljava/util/Map;

    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
