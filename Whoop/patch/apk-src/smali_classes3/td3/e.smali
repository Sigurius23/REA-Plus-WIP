.class public final Ltd3/e;
.super Ltd3/a;
.source "SourceFile"


# instance fields
.field public final n:Ltd3/h;


# direct methods
.method public constructor <init>(ZZLjava/util/ArrayList;Ltd3/n;Ltd3/h;)V
    .locals 7

    new-instance v6, Landroid/os/Handler;

    invoke-direct {v6}, Landroid/os/Handler;-><init>()V

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Ltd3/a;-><init>(ZZLjava/util/List;Ltd3/n;Ltd3/i;Landroid/os/Handler;)V

    iput-object v5, v0, Ltd3/e;->n:Ltd3/h;

    return-void
.end method
