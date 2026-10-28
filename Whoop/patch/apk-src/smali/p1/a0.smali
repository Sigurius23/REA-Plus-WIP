.class public final Lp1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/z1;


# instance fields
.field public final w:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/a0;->w:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lp1/a0;->w:Lbc3/c0;

    instance-of v1, v0, Lp1/c2;

    if-eqz v1, :cond_0

    check-cast v0, Lp1/c2;

    invoke-virtual {v0}, Lp1/c2;->b()V

    return-void

    :cond_0
    new-instance v1, Lp1/u0;

    invoke-direct {v1}, Lp1/u0;-><init>()V

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lp1/a0;->w:Lbc3/c0;

    instance-of v1, v0, Lp1/c2;

    if-eqz v1, :cond_0

    check-cast v0, Lp1/c2;

    invoke-virtual {v0}, Lp1/c2;->b()V

    return-void

    :cond_0
    new-instance v1, Lp1/u0;

    invoke-direct {v1}, Lp1/u0;-><init>()V

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
