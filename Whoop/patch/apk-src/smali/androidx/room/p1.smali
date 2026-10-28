.class public final Landroidx/room/p1;
.super Landroidx/room/s;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroidx/room/e1;


# direct methods
.method public constructor <init>([Ljava/lang/String;Landroidx/room/e1;)V
    .locals 0

    iput-object p2, p0, Landroidx/room/p1;->b:Landroidx/room/e1;

    invoke-direct {p0, p1}, Landroidx/room/s;-><init>([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)V
    .locals 3

    const-string v0, "tables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lt/a;->V()Lt/a;

    move-result-object p1

    new-instance v0, Landroidx/lifecycle/z0;

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/room/p1;->b:Landroidx/room/e1;

    invoke-direct {v0, v2, v1}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p1, Lt/a;->a:Lt/b;

    invoke-virtual {v1}, Lt/b;->V()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/z0;->run()V

    return-void

    :cond_0
    invoke-virtual {p1, v0}, Lt/a;->W(Ljava/lang/Runnable;)V

    return-void
.end method
