.class public final Lc0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/i0;


# instance fields
.field public final a:Lp1/k1;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly3/l;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ly3/l;-><init>(J)V

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lc0/j0;->a:Lp1/k1;

    return-void
.end method
