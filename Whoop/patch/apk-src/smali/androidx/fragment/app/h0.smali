.class public final Landroidx/fragment/app/h0;
.super Landroidx/fragment/app/j0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lv/a;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lk/b;

.field public final synthetic d:Lj/b;

.field public final synthetic e:Landroidx/fragment/app/m0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Lv/a;Ljava/util/concurrent/atomic/AtomicReference;Lk/b;Lj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/h0;->e:Landroidx/fragment/app/m0;

    iput-object p2, p0, Landroidx/fragment/app/h0;->a:Lv/a;

    iput-object p3, p0, Landroidx/fragment/app/h0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Landroidx/fragment/app/h0;->c:Lk/b;

    iput-object p5, p0, Landroidx/fragment/app/h0;->d:Lj/b;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/h0;->e:Landroidx/fragment/app/m0;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->generateActivityResultKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/h0;->a:Lv/a;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lv/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj/j;

    iget-object v3, p0, Landroidx/fragment/app/h0;->c:Lk/b;

    iget-object v4, p0, Landroidx/fragment/app/h0;->d:Lj/b;

    invoke-virtual {v2, v1, v0, v3, v4}, Lj/j;->c(Ljava/lang/String;Landroidx/lifecycle/g0;Lk/b;Lj/b;)Lj/i;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/h0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
