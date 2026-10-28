.class public final Lsn/v;
.super Lsn/t;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v1, -0x1

    const-wide/16 v4, -0x1

    move-object v0, p0

    move-object v6, p1

    .line 1
    invoke-direct/range {v0 .. v6}, Lsn/t;-><init>(IIIJLjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JI)V
    .locals 7

    const/4 v1, -0x1

    const/4 v2, -0x1

    move-object v0, p0

    move-object v6, p1

    move-wide v4, p2

    move v3, p4

    .line 2
    invoke-direct/range {v0 .. v6}, Lsn/t;-><init>(IIIJLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Lsn/v;
    .locals 9

    new-instance v0, Lsn/v;

    iget-object v1, p0, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v2, p0

    goto :goto_0

    :cond_0
    new-instance v2, Lsn/t;

    iget-wide v6, p0, Lsn/t;->d:J

    iget v5, p0, Lsn/t;->e:I

    iget v3, p0, Lsn/t;->b:I

    iget v4, p0, Lsn/t;->c:I

    move-object v8, p1

    invoke-direct/range {v2 .. v8}, Lsn/t;-><init>(IIIJLjava/lang/Object;)V

    :goto_0
    invoke-direct {v0, v2}, Lsn/t;-><init>(Lsn/t;)V

    return-object v0
.end method
