.class public final Ltd3/d;
.super Ltd3/a;
.source "SourceFile"


# instance fields
.field public final n:Ltd3/c;


# direct methods
.method public constructor <init>(ZZLjava/util/List;Ltd3/n;Ltd3/o;Landroid/os/Handler;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Ltd3/a;-><init>(ZZLjava/util/List;Ltd3/n;Ltd3/i;Landroid/os/Handler;)V

    move-object p1, p0

    new-instance p2, Ltd3/c;

    invoke-direct {p2, p0}, Ltd3/c;-><init>(Ltd3/d;)V

    iput-object p2, p1, Ltd3/d;->n:Ltd3/c;

    return-void
.end method
