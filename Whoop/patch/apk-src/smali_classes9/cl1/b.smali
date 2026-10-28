.class public abstract Lcl1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\t\u001a\u00020\u00082\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/navigation/AiAction;",
        "aiAction",
        "Lbl1/b;",
        "analyticsHelper",
        "Ldp0/g;",
        "globalCoachManager",
        "Lzk1/c;",
        "navRouter",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/navigation/AiAction;Lbl1/b;Ldp0/g;Lzk1/c;)V",
        "help-center_release"
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
.method public static final a(Lcom/whoop/navigation/AiAction;Lbl1/b;Ldp0/g;Lzk1/c;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    const-string v3, "analyticsHelper"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "globalCoachManager"

    move-object/from16 v4, p2

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "navRouter"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lbl1/a$c;

    const/16 v11, 0x1f

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, Lbl1/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v5}, Lbl1/b;->a(Lbl1/a;)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/navigation/AiAction;->getSourceType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    new-instance v5, Lbl1/a$d;

    const/4 v6, 0x1

    const-string v7, "new_stack"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0xf8

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v15}, Lbl1/a$d;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v5}, Lbl1/b;->a(Lbl1/a;)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/whoop/coacheverywherecommon/models/a;->b(Lcom/whoop/navigation/AiAction;Z)Lep0/j;

    move-result-object v8

    const/4 v9, 0x3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Ldp0/g;->f(Ldp0/g;JLjava/lang/String;Lep0/j;ILjava/lang/Object;)V

    return-void

    :cond_1
    new-instance v11, Lbl1/a$d;

    const/16 v20, 0xf8

    const/16 v21, 0x0

    const/4 v12, 0x0

    const-string v13, "fallback"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lbl1/a$d;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v11}, Lbl1/b;->a(Lbl1/a;)V

    sget-object v0, Lzk1/b$d;->a:Lzk1/b$d;

    invoke-virtual {v2, v0}, Lzk1/c;->a(Lzk1/b;)Z

    return-void
.end method
