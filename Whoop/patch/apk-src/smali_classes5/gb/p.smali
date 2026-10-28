.class public final Lgb/p;
.super Leb/n0;
.source "SourceFile"

# interfaces
.implements Leb/e;


# instance fields
.field public final L:Lc4/a0;

.field public final M:Lx1/b;


# direct methods
.method public constructor <init>(Lgb/q;)V
    .locals 3

    sget-object v0, Lgb/e;->a:Lx1/b;

    new-instance v1, Lc4/a0;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lc4/a0;-><init>(I)V

    invoke-direct {p0, p1}, Leb/n0;-><init>(Leb/i1;)V

    iput-object v1, p0, Lgb/p;->L:Lc4/a0;

    iput-object v0, p0, Lgb/p;->M:Lx1/b;

    return-void
.end method


# virtual methods
.method public final p()Lc4/a0;
    .locals 1

    iget-object v0, p0, Lgb/p;->L:Lc4/a0;

    return-object v0
.end method
