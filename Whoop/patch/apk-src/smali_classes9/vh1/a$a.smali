.class public final Lvh1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvh1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lvh1/a$a;",
        "",
        "<init>",
        "()V",
        "Lyh1/a;",
        "location",
        "Lvh1/a;",
        "a",
        "(Lyh1/a;)Lvh1/a;",
        "gps-tracking_release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lvh1/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lyh1/a;)Lvh1/a;
    .locals 18

    const-string v0, "location"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvh1/a;

    invoke-virtual/range {p1 .. p1}, Lyh1/a;->f()J

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Lyh1/a;->c()D

    move-result-wide v4

    invoke-virtual/range {p1 .. p1}, Lyh1/a;->d()D

    move-result-wide v6

    invoke-virtual/range {p1 .. p1}, Lyh1/a;->a()D

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lyh1/a;->b()D

    move-result-wide v10

    invoke-virtual/range {p1 .. p1}, Lyh1/a;->h()D

    move-result-wide v12

    invoke-virtual/range {p1 .. p1}, Lyh1/a;->e()Lyh1/b;

    move-result-object v0

    const/4 v14, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lyh1/b;->c()D

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v14

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lyh1/a;->e()Lyh1/b;

    move-result-object v15

    if-eqz v15, :cond_1

    invoke-virtual {v15}, Lyh1/b;->b()Ljava/lang/String;

    move-result-object v15

    goto :goto_1

    :cond_1
    move-object v15, v14

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lyh1/a;->e()Lyh1/b;

    move-result-object v16

    if-eqz v16, :cond_2

    invoke-virtual/range {v16 .. v16}, Lyh1/b;->a()D

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v14

    :cond_2
    move-object/from16 v16, v14

    invoke-virtual/range {p1 .. p1}, Lyh1/a;->g()Ljava/lang/String;

    move-result-object v17

    move-object v14, v0

    invoke-direct/range {v1 .. v17}, Lvh1/a;-><init>(JDDDDDLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    return-object v1
.end method
