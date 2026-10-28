.class public final Lpg3/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lud3/x0;

.field public final b:Ljava/lang/Object;

.field public final c:Lud3/a1;


# direct methods
.method public constructor <init>(Lud3/x0;Ljava/lang/Object;Lud3/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/v0;->a:Lud3/x0;

    iput-object p2, p0, Lpg3/v0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lpg3/v0;->c:Lud3/a1;

    return-void
.end method

.method public static a(ILud3/a1;)Lpg3/v0;
    .locals 18

    move/from16 v4, p0

    move-object/from16 v0, p1

    const-string v1, "body == null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/16 v1, 0x190

    if-lt v4, v1, :cond_1

    sget-object v1, Lud3/a1;->x:Lud3/z0;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v7, Lpg3/a0;

    invoke-virtual {v0}, Lud3/a1;->k()Lud3/h0;

    move-result-object v2

    invoke-virtual {v0}, Lud3/a1;->i()J

    move-result-wide v5

    invoke-direct {v7, v2, v5, v6}, Lpg3/a0;-><init>(Lud3/h0;J)V

    sget-object v2, Lud3/m0;->z:Lud3/m0;

    new-instance v3, Lud3/n0;

    invoke-direct {v3}, Lud3/n0;-><init>()V

    const-string v5, "http://localhost/"

    invoke-virtual {v3, v5}, Lud3/n0;->f(Ljava/lang/String;)V

    new-instance v5, Lud3/o0;

    invoke-direct {v5, v3}, Lud3/o0;-><init>(Lud3/n0;)V

    if-ltz v4, :cond_0

    new-instance v6, Lud3/d0;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-direct {v6, v1}, Lud3/d0;-><init>([Ljava/lang/String;)V

    new-instance v0, Lud3/x0;

    const-string v3, "Response.error()"

    move-object v1, v5

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    sget-object v17, Lud3/d1;->A:Lud3/t;

    invoke-direct/range {v0 .. v17}, Lud3/x0;-><init>(Lud3/o0;Lud3/m0;Ljava/lang/String;ILud3/c0;Lud3/d0;Lud3/a1;Lne3/o0;Lud3/x0;Lud3/x0;Lud3/x0;JJLzd3/g;Lud3/d1;)V

    move-object v1, v0

    move-object/from16 v0, p1

    invoke-static {v0, v1}, Lpg3/v0;->b(Lud3/a1;Lud3/x0;)Lpg3/v0;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "code < 0: "

    invoke-static {v4, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "code < 400: "

    invoke-static {v4, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Lud3/a1;Lud3/x0;)Lpg3/v0;
    .locals 2

    const-string v0, "body == null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-boolean v0, p1, Lud3/x0;->Q:Z

    if-nez v0, :cond_0

    new-instance v0, Lpg3/v0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p0}, Lpg3/v0;-><init>(Lud3/x0;Ljava/lang/Object;Lud3/a1;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "rawResponse should not be successful response"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Ljava/lang/Object;)Lpg3/v0;
    .locals 18

    sget-object v7, Lud3/a1;->x:Lud3/z0;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v2, Lud3/m0;->z:Lud3/m0;

    new-instance v1, Lud3/n0;

    invoke-direct {v1}, Lud3/n0;-><init>()V

    const-string v3, "http://localhost/"

    invoke-virtual {v1, v3}, Lud3/n0;->f(Ljava/lang/String;)V

    new-instance v3, Lud3/o0;

    invoke-direct {v3, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    new-instance v6, Lud3/d0;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-direct {v6, v0}, Lud3/d0;-><init>([Ljava/lang/String;)V

    new-instance v0, Lud3/x0;

    move-object v1, v3

    const-string v3, "OK"

    const/16 v4, 0xc8

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    sget-object v17, Lud3/d1;->A:Lud3/t;

    invoke-direct/range {v0 .. v17}, Lud3/x0;-><init>(Lud3/o0;Lud3/m0;Ljava/lang/String;ILud3/c0;Lud3/d0;Lud3/a1;Lne3/o0;Lud3/x0;Lud3/x0;Lud3/x0;JJLzd3/g;Lud3/d1;)V

    move-object v1, v0

    move-object/from16 v0, p0

    invoke-static {v0, v1}, Lpg3/v0;->d(Ljava/lang/Object;Lud3/x0;)Lpg3/v0;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/Object;Lud3/x0;)Lpg3/v0;
    .locals 2

    iget-boolean v0, p1, Lud3/x0;->Q:Z

    if-eqz v0, :cond_0

    new-instance v0, Lpg3/v0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lpg3/v0;-><init>(Lud3/x0;Ljava/lang/Object;Lud3/a1;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "rawResponse must be successful response"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpg3/v0;->a:Lud3/x0;

    invoke-virtual {v0}, Lud3/x0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
