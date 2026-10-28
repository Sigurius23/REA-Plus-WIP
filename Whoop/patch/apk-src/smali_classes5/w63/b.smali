.class public abstract Lw63/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lw63/b;->a:[B

    return-void
.end method

.method public static final a(Lv63/g;Lw63/a;)V
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Lio/seon/androidsdk/service/e1;->f:I

    if-ne p1, p0, :cond_0

    return-void

    :cond_0
    iget v1, p1, Lio/seon/androidsdk/service/e1;->c:I

    iget v2, p1, Lio/seon/androidsdk/service/e1;->b:I

    if-le v1, v2, :cond_5

    iget v1, p1, Lio/seon/androidsdk/service/e1;->e:I

    sub-int v1, v0, v1

    const/16 v3, 0x8

    if-ge v1, v3, :cond_4

    invoke-virtual {p1}, Lw63/a;->h()Lw63/a;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Lv63/g;->i(Lw63/a;)V

    return-void

    :cond_1
    iget v2, p1, Lio/seon/androidsdk/service/e1;->c:I

    iget v4, p1, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v2, v4

    iget v4, p1, Lio/seon/androidsdk/service/e1;->e:I

    sub-int v4, v0, v4

    sub-int/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget v4, v1, Lio/seon/androidsdk/service/e1;->d:I

    if-ge v4, v3, :cond_2

    invoke-virtual {p0, p1}, Lv63/g;->i(Lw63/a;)V

    return-void

    :cond_2
    invoke-static {v3, v1}, Ls30/b;->t(ILw63/a;)V

    if-le v2, v3, :cond_3

    iput v0, p1, Lio/seon/androidsdk/service/e1;->e:I

    iget p1, p1, Lio/seon/androidsdk/service/e1;->c:I

    iput p1, p0, Lv63/g;->E:I

    iget-wide v0, p0, Lv63/g;->F:J

    int-to-long v2, v3

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lv63/g;->T(J)V

    return-void

    :cond_3
    invoke-virtual {p0, v1}, Lv63/g;->a0(Lw63/a;)V

    iget-wide v4, p0, Lv63/g;->F:J

    iget v0, v1, Lio/seon/androidsdk/service/e1;->c:I

    iget v1, v1, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v0, v1

    sub-int/2addr v0, v3

    int-to-long v0, v0

    sub-long/2addr v4, v0

    invoke-virtual {p0, v4, v5}, Lv63/g;->T(J)V

    invoke-virtual {p1}, Lw63/a;->g()Lw63/a;

    iget-object p0, p0, Lv63/g;->w:Lx63/f;

    invoke-virtual {p1, p0}, Lw63/a;->j(Lx63/f;)V

    return-void

    :cond_4
    iput v2, p0, Lv63/g;->z:I

    return-void

    :cond_5
    invoke-virtual {p0, p1}, Lv63/g;->h(Lw63/a;)Lw63/a;

    return-void
.end method

.method public static final b(Lv63/g;I)Lw63/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lv63/g;->m()Lw63/a;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lv63/g;->x(ILw63/a;)Lw63/a;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lv63/g;Lw63/a;)Lw63/a;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-ne p1, p0, :cond_2

    iget p1, p0, Lv63/g;->z:I

    iget v0, p0, Lv63/g;->E:I

    if-ne p1, v0, :cond_1

    iget-wide v0, p0, Lv63/g;->F:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    :goto_0
    check-cast p0, Lw63/a;

    return-object p0

    :cond_2
    invoke-virtual {p0, p1}, Lv63/g;->h(Lw63/a;)Lw63/a;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lv63/d;ILw63/a;)Lw63/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lv63/d;->b()V

    :cond_0
    invoke-virtual {p0, p1}, Lv63/d;->k(I)Lw63/a;

    move-result-object p0

    return-object p0
.end method
