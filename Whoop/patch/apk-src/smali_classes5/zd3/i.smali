.class public final Lzd3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzd3/v;


# instance fields
.field public final a:Lzd3/u;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzd3/u;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, p1, v2}, Lzd3/u;-><init>(Lzd3/v;Lzd3/c;Ljava/lang/Throwable;I)V

    iput-object v0, p0, Lzd3/i;->a:Lzd3/u;

    return-void
.end method


# virtual methods
.method public final a()Lzd3/p;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected call"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final cancel()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected cancel"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Lzd3/u;
    .locals 1

    iget-object v0, p0, Lzd3/i;->a:Lzd3/u;

    return-object v0
.end method

.method public final f()Lzd3/v;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected retry"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()Lzd3/u;
    .locals 1

    iget-object v0, p0, Lzd3/i;->a:Lzd3/u;

    return-object v0
.end method
