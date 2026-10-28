.class public final Lb3/w2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li3/l;

.field public final b:La0/h0;


# direct methods
.method public constructor <init>(Li3/p;La0/s;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Li3/p;->d:Li3/l;

    iput-object v0, p0, Lb3/w2;->a:Li3/l;

    new-instance v0, La0/h0;

    const/4 v1, 0x4

    invoke-static {v1, p1}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, La0/h0;-><init>(I)V

    iput-object v0, p0, Lb3/w2;->b:La0/h0;

    invoke-static {v1, p1}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li3/p;

    iget v3, v2, Li3/p;->g:I

    invoke-virtual {p2, v3}, La0/s;->a(I)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lb3/w2;->b:La0/h0;

    iget v2, v2, Li3/p;->g:I

    invoke-virtual {v3, v2}, La0/h0;->a(I)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
