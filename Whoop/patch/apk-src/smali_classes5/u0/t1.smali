.class public final Lu0/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lq3/i;

.field public b:Lq3/i;

.field public c:I

.field public d:Ljava/lang/Long;

.field public e:Z


# virtual methods
.method public final a(Lq3/y;)V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu0/t1;->e:Z

    iget-object v0, p0, Lu0/t1;->a:Lq3/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v0, Lq3/y;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v0, p1, Lq3/y;->a:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    iget-object v2, p0, Lu0/t1;->a:Lq3/i;

    if-eqz v2, :cond_2

    iget-object v2, v2, Lq3/i;->w:Ljava/lang/Object;

    check-cast v2, Lq3/y;

    if-eqz v2, :cond_2

    iget-object v2, v2, Lq3/y;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lu0/t1;->a:Lq3/i;

    if-eqz v0, :cond_8

    iput-object p1, v0, Lq3/i;->w:Ljava/lang/Object;

    return-void

    :cond_3
    iget-object v0, p0, Lu0/t1;->a:Lq3/i;

    new-instance v2, Lq3/i;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v3}, Lq3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    iput-object v2, p0, Lu0/t1;->a:Lq3/i;

    iput-object v1, p0, Lu0/t1;->b:Lq3/i;

    iget v0, p0, Lu0/t1;->c:I

    iget-object p1, p1, Lq3/y;->a:Ll3/g;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Lu0/t1;->c:I

    const v0, 0x186a0

    if-le p1, v0, :cond_8

    iget-object p1, p0, Lu0/t1;->a:Lq3/i;

    if-eqz p1, :cond_4

    iget-object v0, p1, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lq3/i;

    goto :goto_2

    :cond_4
    move-object v0, v1

    :goto_2
    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    :goto_3
    if-eqz p1, :cond_6

    iget-object v0, p1, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lq3/i;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lq3/i;

    goto :goto_4

    :cond_6
    move-object v0, v1

    :goto_4
    if-eqz v0, :cond_7

    iget-object p1, p1, Lq3/i;->x:Ljava/lang/Object;

    check-cast p1, Lq3/i;

    goto :goto_3

    :cond_7
    if-eqz p1, :cond_8

    iput-object v1, p1, Lq3/i;->x:Ljava/lang/Object;

    :cond_8
    :goto_5
    return-void
.end method
