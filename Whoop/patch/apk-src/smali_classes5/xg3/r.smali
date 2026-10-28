.class public abstract Lxg3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/t;


# instance fields
.field public final w:Lgh3/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgh3/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lxg3/r;->w:Lgh3/m;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lxg3/r;->w:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    return v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lxg3/r;->w:Lgh3/m;

    invoke-virtual {v0}, Lgh3/m;->b()V

    return-void
.end method

.method public final c(Lxg3/t;)V
    .locals 1

    iget-object v0, p0, Lxg3/r;->w:Lgh3/m;

    invoke-virtual {v0, p1}, Lgh3/m;->c(Lxg3/t;)V

    return-void
.end method

.method public abstract d(Ljava/lang/Throwable;)V
.end method

.method public abstract e(Ljava/lang/Object;)V
.end method
