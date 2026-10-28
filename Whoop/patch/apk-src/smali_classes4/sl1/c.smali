.class public final Lsl1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lsl1/c;",
        "",
        "<init>",
        "()V",
        "Lsl1/b;",
        "alertTile",
        "La11/r;",
        "a",
        "(Lsl1/b;)La11/r;",
        "connectivity-common-ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lsl1/b;)La11/r;
    .locals 21

    move-object/from16 v0, p1

    const-string v1, "alertTile"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lsl1/b$a;

    if-eqz v1, :cond_0

    new-instance v2, La11/r;

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lsl1/b;->b()La11/b;

    move-result-object v14

    const/16 v17, 0x1774

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    instance-of v1, v0, Lsl1/b$p;

    if-eqz v1, :cond_1

    new-instance v2, La11/r;

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    const/16 v17, 0x1ff4

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    instance-of v1, v0, Lsl1/b$d;

    if-eqz v1, :cond_2

    new-instance v2, La11/r;

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lsl1/b;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lsl1/b;->c()La11/c;

    move-result-object v13

    const/16 v17, 0x1b96

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_2
    instance-of v1, v0, Lsl1/b$e;

    if-eqz v1, :cond_3

    new-instance v2, La11/r;

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lsl1/b;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lsl1/b;->c()La11/c;

    move-result-object v13

    const/16 v17, 0x1b9e

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_3
    instance-of v1, v0, Lsl1/b$q;

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->c()La11/c;

    move-result-object v13

    invoke-virtual {v0}, Lsl1/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lsl1/b;->b()La11/b;

    move-result-object v14

    new-instance v2, La11/r;

    const/16 v17, 0x1374

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_4
    instance-of v1, v0, Lsl1/b$c;

    if-nez v1, :cond_f

    instance-of v1, v0, Lsl1/b$b;

    if-nez v1, :cond_f

    instance-of v1, v0, Lsl1/b$g;

    if-eqz v1, :cond_5

    goto/16 :goto_0

    :cond_5
    instance-of v1, v0, Lsl1/b$r;

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v2, La11/r;

    const/16 v17, 0x1ff4

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_6
    instance-of v1, v0, Lsl1/b$k;

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsl1/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v2, La11/r;

    const/16 v17, 0x1f74

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_7
    instance-of v1, v0, Lsl1/b$m;

    if-eqz v1, :cond_8

    new-instance v2, La11/r;

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsl1/b;->g()Z

    move-result v7

    const/16 v17, 0x1fec

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_8
    instance-of v1, v0, Lsl1/b$l;

    if-eqz v1, :cond_9

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->a()La11/d;

    move-result-object v12

    invoke-virtual {v0}, Lsl1/b;->c()La11/c;

    move-result-object v13

    sget-object v15, La11/a;->RESET_FW_STATE:La11/a;

    new-instance v2, La11/r;

    const/16 v17, 0x9f4

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_9
    instance-of v1, v0, Lsl1/b$i;

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->a()La11/d;

    move-result-object v12

    invoke-virtual {v0}, Lsl1/b;->c()La11/c;

    move-result-object v13

    sget-object v15, La11/a;->RESET_FW_STATE:La11/a;

    new-instance v2, La11/r;

    const/16 v17, 0x9f6

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_a
    instance-of v1, v0, Lsl1/b$j;

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->a()La11/d;

    move-result-object v12

    invoke-virtual {v0}, Lsl1/b;->c()La11/c;

    move-result-object v13

    sget-object v15, La11/a;->RETRY_FW_UPDATE:La11/a;

    new-instance v2, La11/r;

    const/16 v17, 0x9f4

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_b
    instance-of v1, v0, Lsl1/b$h;

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lsl1/b;->k()Z

    move-result v11

    sget-object v15, La11/a;->PROCESS_FW:La11/a;

    new-instance v2, La11/r;

    const/16 v17, 0xe74

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_c
    instance-of v1, v0, Lsl1/b$n;

    if-eqz v1, :cond_d

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lsl1/b;->k()Z

    move-result v11

    sget-object v15, La11/a;->LOCATION_PERMISSION_REQUIRED:La11/a;

    new-instance v2, La11/r;

    const/16 v17, 0xe74

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_d
    instance-of v1, v0, Lsl1/b$o;

    if-eqz v1, :cond_e

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsl1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0}, Lsl1/b;->c()La11/c;

    move-result-object v13

    sget-object v15, La11/a;->LOW_BATTERY_ONCE_A_DAY_DISMISS:La11/a;

    new-instance v2, La11/r;

    const/16 v17, 0xbf4

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v2 .. v18}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_e
    new-instance v3, La11/r;

    const/16 v18, 0x3fff

    const/16 v19, 0x0

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

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v3 .. v19}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_f
    :goto_0
    invoke-virtual {v0}, Lsl1/b;->f()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0}, Lsl1/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lsl1/b;->c()La11/c;

    move-result-object v15

    new-instance v4, La11/r;

    const/16 v19, 0x1bf6

    const/16 v20, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x1

    invoke-direct/range {v4 .. v20}, La11/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/c;La11/b;La11/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method
