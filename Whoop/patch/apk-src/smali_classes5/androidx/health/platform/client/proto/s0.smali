.class public abstract Landroidx/health/platform/client/proto/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final w:Landroidx/health/platform/client/proto/u0;

.field public x:Landroidx/health/platform/client/proto/u0;


# direct methods
.method public constructor <init>(Landroidx/health/platform/client/proto/u0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/health/platform/client/proto/s0;->w:Landroidx/health/platform/client/proto/u0;

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/u0;->i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/u0;->l()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    iput-object p1, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Landroidx/health/platform/client/proto/u0;
    .locals 2

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/s0;->b()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/health/platform/client/proto/u0;->h(Landroidx/health/platform/client/proto/u0;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Landroidx/health/platform/client/proto/UninitializedMessageException;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/UninitializedMessageException;-><init>()V

    throw v0
.end method

.method public final b()Landroidx/health/platform/client/proto/u0;
    .locals 3

    iget-object v0, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Landroidx/health/platform/client/proto/y1;->c:Landroidx/health/platform/client/proto/y1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/health/platform/client/proto/y1;->a(Ljava/lang/Class;)Landroidx/health/platform/client/proto/u2;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/health/platform/client/proto/u2;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->j()V

    iget-object v0, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    return-object v0
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/health/platform/client/proto/s0;->w:Landroidx/health/platform/client/proto/u0;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->l()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    iget-object v1, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    sget-object v2, Landroidx/health/platform/client/proto/y1;->c:Landroidx/health/platform/client/proto/y1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/health/platform/client/proto/y1;->a(Ljava/lang/Class;)Landroidx/health/platform/client/proto/u2;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Landroidx/health/platform/client/proto/u2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    :cond_0
    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/health/platform/client/proto/s0;->w:Landroidx/health/platform/client/proto/u0;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/health/platform/client/proto/u0;->e(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/s0;

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/s0;->b()Landroidx/health/platform/client/proto/u0;

    move-result-object v1

    iput-object v1, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    return-object v0
.end method
