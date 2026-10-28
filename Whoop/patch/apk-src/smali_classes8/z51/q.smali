.class public abstract Lz51/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
        "a",
        "design_release"
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
.method public static final a(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lz51/s;->RECOVERY_LOW:Lz51/s;

    const-string v1, "25"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/16 v7, 0x36

    const/16 v8, 0x38

    const/high16 v1, 0x3e800000    # 0.25f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v6, p0

    invoke-static/range {v0 .. v8}, Lz51/o;->k(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v9, Lz51/s;->RECOVERY_MEDIUM:Lz51/s;

    const-string v0, "50"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/16 v16, 0x36

    const/16 v17, 0x38

    const/high16 v10, 0x3f000000    # 0.5f

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v15, p0

    invoke-static/range {v9 .. v17}, Lz51/o;->k(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v9, Lz51/s;->RECOVERY_HIGH:Lz51/s;

    const-string v0, "75"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/high16 v10, 0x3f400000    # 0.75f

    invoke-static/range {v9 .. v17}, Lz51/o;->k(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v9, Lz51/s;->CALIBRATING:Lz51/s;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static/range {v9 .. v17}, Lz51/o;->k(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    filled-new-array {v0, v0, v0, v0}, [Ll83/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lz51/s;->STRAIN:Lz51/s;

    const-string p1, "17.6"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/16 v7, 0x36

    const/16 v8, 0x38

    const/high16 v1, 0x3f000000    # 0.5f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v8}, Lz51/o;->k(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/16 v7, 0x6c36

    const/16 v8, 0x20

    const/4 v3, 0x1

    const/high16 v4, 0x3f400000    # 0.75f

    invoke-static/range {v0 .. v8}, Lz51/o;->k(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    filled-new-array {p0, p0}, [Ll83/a0;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
