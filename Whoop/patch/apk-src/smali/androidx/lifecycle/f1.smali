.class public final Landroidx/lifecycle/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic E:Lbc3/m;

.field public final synthetic F:Lmc3/c;

.field public final synthetic G:Ls83/i;

.field public final synthetic w:Landroidx/lifecycle/v;

.field public final synthetic x:Lkotlin/jvm/internal/g0;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Landroidx/lifecycle/v;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/v;Lkotlin/jvm/internal/g0;Lbc3/c0;Landroidx/lifecycle/v;Lbc3/m;Lmc3/c;Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/f1;->w:Landroidx/lifecycle/v;

    iput-object p2, p0, Landroidx/lifecycle/f1;->x:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Landroidx/lifecycle/f1;->y:Lbc3/c0;

    iput-object p4, p0, Landroidx/lifecycle/f1;->z:Landroidx/lifecycle/v;

    iput-object p5, p0, Landroidx/lifecycle/f1;->E:Lbc3/m;

    iput-object p6, p0, Landroidx/lifecycle/f1;->F:Lmc3/c;

    check-cast p7, Ls83/i;

    iput-object p7, p0, Landroidx/lifecycle/f1;->G:Ls83/i;

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 3

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/f1;->w:Landroidx/lifecycle/v;

    iget-object v0, p0, Landroidx/lifecycle/f1;->x:Lkotlin/jvm/internal/g0;

    const/4 v1, 0x0

    if-ne p2, p1, :cond_0

    new-instance p1, Landroidx/lifecycle/e1;

    iget-object p2, p0, Landroidx/lifecycle/f1;->F:Lmc3/c;

    iget-object v2, p0, Landroidx/lifecycle/f1;->G:Ls83/i;

    invoke-direct {p1, p2, v2, v1}, Landroidx/lifecycle/e1;-><init>(Lmc3/c;Lc93/m;Lq83/d;)V

    const/4 p2, 0x3

    iget-object v2, p0, Landroidx/lifecycle/f1;->y:Lbc3/c0;

    invoke-static {v2, v1, v1, p1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-void

    :cond_0
    iget-object p1, p0, Landroidx/lifecycle/f1;->z:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_2

    iget-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lbc3/k1;

    if-eqz p1, :cond_1

    invoke-interface {p1, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iput-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_2
    sget-object p1, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_3

    iget-object p1, p0, Landroidx/lifecycle/f1;->E:Lbc3/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method
