.class public final Lf9/l;
.super Lf9/m;
.source "SourceFile"


# instance fields
.field public final F:Lf9/j;

.field public final G:Le10/k0;


# direct methods
.method public constructor <init>(Lu8/p;Lzr/g0;Lf9/r;Ljava/util/ArrayList;)V
    .locals 6

    invoke-direct {p0, p1, p2, p3, p4}, Lf9/m;-><init>(Lu8/p;Ljava/util/List;Lf9/s;Ljava/util/List;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf9/b;

    iget-object p1, p1, Lf9/b;->a:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    iget-wide v4, p3, Lf9/r;->e:J

    const-wide/16 p1, 0x0

    cmp-long p1, v4, p1

    const/4 p2, 0x0

    if-gtz p1, :cond_0

    move-object v0, p2

    goto :goto_0

    :cond_0
    new-instance v0, Lf9/j;

    const/4 v1, 0x0

    iget-wide v2, p3, Lf9/r;->d:J

    invoke-direct/range {v0 .. v5}, Lf9/j;-><init>(Ljava/lang/String;JJ)V

    :goto_0
    iput-object v0, p0, Lf9/l;->F:Lf9/j;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p2, Le10/k0;

    new-instance v0, Lf9/j;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, -0x1

    invoke-direct/range {v0 .. v5}, Lf9/j;-><init>(Ljava/lang/String;JJ)V

    const/16 p1, 0xd

    invoke-direct {p2, v0, p1}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    :goto_1
    iput-object p2, p0, Lf9/l;->G:Le10/k0;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Le9/i;
    .locals 1

    iget-object v0, p0, Lf9/l;->G:Le10/k0;

    return-object v0
.end method

.method public final d()Lf9/j;
    .locals 1

    iget-object v0, p0, Lf9/l;->F:Lf9/j;

    return-object v0
.end method
