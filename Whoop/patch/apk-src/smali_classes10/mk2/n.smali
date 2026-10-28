.class abstract Lmk2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmk2/n$a;,
        Lmk2/n$b;,
        Lmk2/n$c;,
        Lmk2/n$d;,
        Lmk2/n$e;,
        Lmk2/n$f;,
        Lmk2/n$g;,
        Lmk2/n$h;,
        Lmk2/n$i;,
        Lmk2/n$j;,
        Lmk2/n$k;,
        Lmk2/n$l;,
        Lmk2/n$m;,
        Lmk2/n$n;,
        Lmk2/n$o;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00082\u0018\u00002\u00020\u0001:\u000f\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0006\u0014\u0015B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u000f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$\u00a8\u0006%"
    }
    d2 = {
        "Lmk2/n;",
        "",
        "<init>",
        "()V",
        "Lmk2/q;",
        "state",
        "a",
        "(Lmk2/q;)Lmk2/q;",
        "e",
        "f",
        "d",
        "g",
        "o",
        "h",
        "l",
        "m",
        "k",
        "j",
        "n",
        "b",
        "c",
        "i",
        "Lmk2/n$a;",
        "Lmk2/n$b;",
        "Lmk2/n$c;",
        "Lmk2/n$d;",
        "Lmk2/n$e;",
        "Lmk2/n$f;",
        "Lmk2/n$g;",
        "Lmk2/n$h;",
        "Lmk2/n$i;",
        "Lmk2/n$j;",
        "Lmk2/n$k;",
        "Lmk2/n$l;",
        "Lmk2/n$m;",
        "Lmk2/n$n;",
        "Lmk2/n$o;",
        "track-activity_release"
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
    invoke-direct {p0}, Lmk2/n;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmk2/q;)Lmk2/q;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "state"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, Lmk2/n$e;

    if-eqz v2, :cond_3

    new-instance v3, Lmk2/q;

    move-object v1, v0

    check-cast v1, Lmk2/n$e;

    invoke-virtual {v1}, Lmk2/n$e;->c()Lx90/d;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lx90/d;->d()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v4, v2

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v1}, Lmk2/n$e;->b()Lmk2/p$k;

    move-result-object v2

    invoke-virtual {v2}, Lmk2/p$k;->c()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :goto_2
    invoke-virtual {v1}, Lmk2/n$e;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lmk2/n$e;->e()Lmk2/j;

    move-result-object v6

    invoke-virtual {v1}, Lmk2/n$e;->c()Lx90/d;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lx90/d;->a()Z

    move-result v2

    :goto_3
    move v7, v2

    goto :goto_4

    :cond_2
    invoke-virtual {v1}, Lmk2/n$e;->b()Lmk2/p$k;

    move-result-object v2

    invoke-virtual {v2}, Lmk2/p$k;->a()Z

    move-result v2

    goto :goto_3

    :goto_4
    invoke-virtual {v1}, Lmk2/n$e;->b()Lmk2/p$k;

    move-result-object v2

    invoke-virtual {v2}, Lmk2/p$k;->b()Lcom/whoop/navigation/e;

    move-result-object v8

    sget-object v9, Lmk2/o$c;->a:Lmk2/o$c;

    invoke-virtual {v1}, Lmk2/n$e;->f()Lmk2/l;

    move-result-object v12

    invoke-virtual {v1}, Lmk2/n$e;->g()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v15

    const/16 v16, 0x6c0

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v3 .. v17}, Lmk2/q;-><init>(Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_3
    sget-object v2, Lmk2/n$f;->a:Lmk2/n$f;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v14, 0xfdf

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_4
    sget-object v1, Lmk2/n$d;->a:Lmk2/n$d;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v7, Lmk2/o$h;->a:Lmk2/o$h;

    const/16 v14, 0xfdf

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_5
    instance-of v1, v0, Lmk2/n$g;

    if-eqz v1, :cond_6

    move-object v1, v0

    check-cast v1, Lmk2/n$g;

    invoke-virtual {v1}, Lmk2/n$g;->b()Lmk2/l;

    move-result-object v10

    const/16 v14, 0xeff

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v1, v0, Lmk2/n$o;

    if-eqz v1, :cond_7

    move-object v1, v0

    check-cast v1, Lmk2/n$o;

    invoke-virtual {v1}, Lmk2/n$o;->b()Lcom/whoop/trackactivity/domain/models/SessionTargets;

    move-result-object v11

    const/16 v14, 0xdff

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_7
    sget-object v1, Lmk2/n$h;->a:Lmk2/n$h;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v7, Lmk2/o$c;->a:Lmk2/o$c;

    const/16 v14, 0xfdf

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_8
    sget-object v1, Lmk2/n$l;->a:Lmk2/n$l;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v7, Lmk2/o$f;->a:Lmk2/o$f;

    const/16 v14, 0xfdf

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_9
    sget-object v1, Lmk2/n$m;->a:Lmk2/n$m;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v7, Lmk2/o$g;->a:Lmk2/o$g;

    const/16 v14, 0xfdf

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_a
    sget-object v1, Lmk2/n$k;->a:Lmk2/n$k;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v7, Lmk2/o$e;->a:Lmk2/o$e;

    const/16 v14, 0xfdf

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_b
    instance-of v1, v0, Lmk2/n$j;

    if-eqz v1, :cond_c

    new-instance v7, Lmk2/o$d;

    move-object v1, v0

    check-cast v1, Lmk2/n$j;

    invoke-virtual {v1}, Lmk2/n$j;->d()Ljava/time/OffsetDateTime;

    move-result-object v2

    invoke-virtual {v1}, Lmk2/n$j;->c()Ljava/time/OffsetDateTime;

    move-result-object v3

    invoke-virtual {v1}, Lmk2/n$j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v2, v3, v1}, Lmk2/o$d;-><init>(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;)V

    const/16 v14, 0xfdf

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_c
    sget-object v1, Lmk2/n$n;->a:Lmk2/n$n;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static/range {p1 .. p1}, Lmk2/s;->b(Lmk2/q;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_d
    sget-object v1, Lmk2/n$b;->a:Lmk2/n$b;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    const/16 v14, 0xfbf

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_e
    sget-object v1, Lmk2/n$a;->a:Lmk2/n$a;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    const/16 v14, 0xfbf

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_f
    move-object/from16 v1, p1

    sget-object v2, Lmk2/n$c;->a:Lmk2/n$c;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-static {v1}, Lmk2/s;->b(Lmk2/q;)Lmk2/q;

    move-result-object v3

    sget-object v9, Lmk2/o$c;->a:Lmk2/o$c;

    const/16 v16, 0xf9f

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v3 .. v17}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_10
    instance-of v2, v0, Lmk2/n$i;

    if-eqz v2, :cond_11

    move-object v2, v0

    check-cast v2, Lmk2/n$i;

    invoke-virtual {v2}, Lmk2/n$i;->b()Lmk2/p$h;

    move-result-object v2

    invoke-static {v1, v2}, Lmk2/s;->a(Lmk2/q;Lmk2/p$h;)Lmk2/q;

    move-result-object v1

    return-object v1

    :cond_11
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
