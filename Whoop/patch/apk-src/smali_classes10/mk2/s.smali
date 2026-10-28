.class public abstract Lmk2/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lmk2/q;",
        "d",
        "(Lmk2/q;)Lmk2/q;",
        "Lmk2/p$h;",
        "action",
        "c",
        "(Lmk2/q;Lmk2/p$h;)Lmk2/q;",
        "track-activity_release"
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
.method public static final synthetic a(Lmk2/q;Lmk2/p$h;)Lmk2/q;
    .locals 0

    invoke-static {p0, p1}, Lmk2/s;->c(Lmk2/q;Lmk2/p$h;)Lmk2/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lmk2/q;)Lmk2/q;
    .locals 0

    invoke-static {p0}, Lmk2/s;->d(Lmk2/q;)Lmk2/q;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmk2/q;Lmk2/p$h;)Lmk2/q;
    .locals 17

    move-object/from16 v0, p1

    sget-object v1, Lmk2/p$f;->a:Lmk2/p$f;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v8, Lmk2/o$a;->a:Lmk2/o$a;

    const/16 v15, 0xfdf

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v16}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v1, Lmk2/p$b;->a:Lmk2/p$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

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

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v1, Lmk2/p$g;->a:Lmk2/p$g;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v7, Lmk2/o$b;->a:Lmk2/o$b;

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

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v0

    return-object v0

    :cond_2
    sget-object v1, Lmk2/p$c;->a:Lmk2/p$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

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

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v0

    return-object v0

    :cond_3
    sget-object v1, Lmk2/p$a;->a:Lmk2/p$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v14, 0xf7f

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

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v0

    return-object v0

    :cond_4
    instance-of v1, v0, Lmk2/p$l;

    if-eqz v1, :cond_5

    check-cast v0, Lmk2/p$l;

    invoke-virtual {v0}, Lmk2/p$l;->a()Lmk2/v;

    move-result-object v12

    const/16 v14, 0xbff

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

    const/4 v13, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v0

    return-object v0

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final d(Lmk2/q;)Lmk2/q;
    .locals 16

    sget-object v0, Lmk2/t;->a:Lmk2/t;

    invoke-virtual {v0}, Lmk2/t;->b()Lcom/whoop/navigation/e;

    move-result-object v9

    new-instance v0, Lcom/whoop/trackactivity/domain/models/SessionTargets;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/trackactivity/domain/models/SessionTargets;-><init>(Ljava/lang/Float;Ljava/lang/Long;Ljava/lang/Double;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0xc7f

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p0

    move-object v11, v0

    invoke-static/range {v1 .. v15}, Lmk2/q;->b(Lmk2/q;Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lmk2/q;

    move-result-object v0

    return-object v0
.end method
