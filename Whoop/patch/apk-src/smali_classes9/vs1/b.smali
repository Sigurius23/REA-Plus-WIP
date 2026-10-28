.class public abstract Lvs1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lvs1/a;",
        "Lqk1/a;",
        "a",
        "(Lvs1/a;)Lqk1/a;",
        "labrador_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lvs1/a;)Lqk1/a;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lqk1/a;

    invoke-virtual/range {p0 .. p0}, Lvs1/a;->a()F

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lvs1/a;->b()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lvs1/a;->e()Ljava/util/List;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lvs1/a;->g()J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Lvs1/a;->f()Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lvs1/a;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lvs1/a;->h()Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lvs1/a;->c()Z

    move-result v10

    const/16 v14, 0x700

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lqk1/a;-><init>(FILjava/util/List;JLjava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
