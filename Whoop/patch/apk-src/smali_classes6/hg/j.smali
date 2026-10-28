.class public final Lhg/j;
.super Lhg/i;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lxl/a;)V
    .locals 2

    sget-object v0, Lhg/l;->j:Lhg/l;

    iget-object v1, p1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    invoke-direct {p0, v0, v1}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;)V

    iget-object p1, p1, Lxl/a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, Lhg/j;->d:Ljava/util/ArrayList;

    return-void
.end method
