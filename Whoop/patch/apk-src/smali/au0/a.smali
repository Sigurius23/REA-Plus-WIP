.class public interface abstract Lau0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0097@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ&\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\rJ&\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\u000b2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u0007J\u0017\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0019H\'\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lau0/a;",
        "",
        "",
        "Lbu0/a;",
        "strapFirmwareEventsDtoList",
        "Ll83/a0;",
        "insertList",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "oldestTimeStamp",
        "newestTimeStamp",
        "",
        "f",
        "(JJLq83/d;)Ljava/lang/Object;",
        "from",
        "to",
        "c",
        "versionId",
        "numberOfRecords",
        "e",
        "(IILq83/d;)Ljava/lang/Object;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "listDto",
        "a",
        "Lec3/l;",
        "observeNewestTimestamp",
        "()Lec3/l;",
        "connectivity-data-packets-model_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static d(Lau0/a;JJLq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lau0/a;",
            "JJ",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lau0/a$a;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lau0/a$a;

    iget v1, v0, Lau0/a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lau0/a$a;->G:I

    :goto_0
    move-object p5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lau0/a$a;

    invoke-direct {v0, p0, p5}, Lau0/a$a;-><init>(Lau0/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, p5, Lau0/a$a;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p5, Lau0/a$a;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, p5, Lau0/a$a;->x:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p0, p5, Lau0/a$a;->w:Ljava/lang/Object;

    check-cast p0, Lau0/a;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-wide p3, p5, Lau0/a$a;->z:J

    iget-wide p1, p5, Lau0/a$a;->y:J

    iget-object p0, p5, Lau0/a$a;->w:Ljava/lang/Object;

    check-cast p0, Lau0/a;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, p5, Lau0/a$a;->w:Ljava/lang/Object;

    iput-wide p1, p5, Lau0/a$a;->y:J

    iput-wide p3, p5, Lau0/a$a;->z:J

    iput v4, p5, Lau0/a$a;->G:I

    invoke-interface/range {p0 .. p5}, Lau0/a;->c(JJLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast v0, Ljava/util/List;

    const/4 v2, 0x0

    iput-object v2, p5, Lau0/a$a;->w:Ljava/lang/Object;

    iput-object v2, p5, Lau0/a$a;->x:Ljava/lang/Object;

    iput-wide p1, p5, Lau0/a$a;->y:J

    iput-wide p3, p5, Lau0/a$a;->z:J

    iput v3, p5, Lau0/a$a;->G:I

    invoke-interface {p0, v0, p5}, Lau0/a;->a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    return-object p0
.end method


# virtual methods
.method public abstract a(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract b(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract c(JJLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract e(IILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public f(JJLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static/range {p0 .. p5}, Lau0/a;->d(Lau0/a;JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lbu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract observeNewestTimestamp()Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation
.end method
