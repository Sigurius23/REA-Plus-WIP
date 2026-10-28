.class public final Lur1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lur1/b;",
        "Lur1/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\r2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lur1/c;",
        "Lod1/g;",
        "Lur1/b;",
        "Lur1/n;",
        "Lyr1/a;",
        "journalAnalyticsHelper",
        "<init>",
        "(Lyr1/a;)V",
        "Lsr1/e$e;",
        "domainState",
        "Ll83/a0;",
        "e",
        "(Lsr1/e$e;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "",
        "categoryIndex",
        "Lsr1/e;",
        "c",
        "(Lsr1/e$e;I)Lsr1/e;",
        "",
        "id",
        "d",
        "(Lsr1/e$e;Ljava/lang/String;)Lsr1/e;",
        "query",
        "f",
        "a",
        "Lyr1/a;",
        "",
        "b",
        "Ljava/util/List;",
        "lastSavedSelection",
        "journal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lyr1/a;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lyr1/a;)V
    .locals 1

    const-string v0, "journalAnalyticsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lur1/c;->a:Lyr1/a;

    return-void
.end method


# virtual methods
.method public final c(Lsr1/e$e;I)Lsr1/e;
    .locals 28

    const-string v0, "domainState"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v0

    invoke-virtual {v0}, Lsr1/b;->c()Lsw0/g;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lsw0/g;->d()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    move/from16 v3, p2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    invoke-virtual {v1}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v3

    invoke-virtual {v1}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v4

    invoke-virtual {v4}, Lsr1/b;->c()Lsw0/g;

    move-result-object v5

    if-eqz v5, :cond_2

    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    move-object v10, v0

    const/16 v18, 0xfef

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v5 .. v19}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v2

    :cond_2
    move-object v7, v2

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Lsr1/b;->b(Lsr1/b;ZZLjava/lang/String;Lsw0/g;ILjava/lang/Object;)Lsr1/b;

    move-result-object v20

    const v26, 0x7dffff

    const/16 v27, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v1 .. v27}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lsr1/e$e;Ljava/lang/String;)Lsr1/e;
    .locals 30

    move-object/from16 v0, p2

    const-string v1, "domainState"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "id"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v1

    invoke-virtual {v1}, Lsr1/b;->c()Lsw0/g;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lsw0/i;

    invoke-virtual {v7}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v6, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v10, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Lsw0/j;

    invoke-virtual {v11}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v11}, Lsw0/j;->v()Z

    move-result v8

    if-nez v8, :cond_0

    move-object/from16 v8, p0

    iget-object v9, v8, Lur1/c;->a:Lyr1/a;

    invoke-virtual {v2}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v12

    invoke-virtual {v12}, Lsr1/b;->c()Lsw0/g;

    move-result-object v12

    invoke-virtual {v12}, Lsw0/g;->l()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Lyr1/a;->q(Ljava/lang/String;)V

    goto :goto_2

    :cond_0
    move-object/from16 v8, p0

    :goto_2
    invoke-virtual {v11}, Lsw0/j;->v()Z

    move-result v9

    xor-int/lit8 v14, v9, 0x1

    const v28, 0xfffb

    const/16 v29, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v11 .. v29}, Lsw0/j;->f(Lsw0/j;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lsw0/a;ZLcom/whoop/design/models/items/GoalSettingsTileTagModel;ZILjava/lang/Object;)Lsw0/j;

    move-result-object v11

    goto :goto_3

    :cond_1
    move-object/from16 v8, p0

    :goto_3
    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    const/16 v12, 0xb

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Lsw0/i;->b(Lsw0/i;Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/i;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_3
    move-object v4, v3

    :cond_4
    invoke-virtual {v2}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v5

    invoke-virtual {v2}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v0

    invoke-virtual {v0}, Lsr1/b;->c()Lsw0/g;

    move-result-object v6

    if-eqz v6, :cond_6

    if-nez v4, :cond_5

    sget-object v4, Lm83/y;->w:Lm83/y;

    :cond_5
    move-object v12, v4

    const/16 v19, 0xfdf

    const/16 v20, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v6 .. v20}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v3

    :cond_6
    move-object v9, v3

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Lsr1/b;->b(Lsr1/b;ZZLjava/lang/String;Lsw0/g;ILjava/lang/Object;)Lsr1/b;

    move-result-object v21

    const v27, 0x7dffff

    const/16 v28, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-static/range {v2 .. v28}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lsr1/e$e;)V
    .locals 6

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object p1

    invoke-virtual {p1}, Lsr1/b;->c()Lsw0/g;

    move-result-object p1

    if-nez p1, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p1}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsw0/i;

    invoke-virtual {v2}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lsw0/j;

    invoke-virtual {v4}, Lsw0/j;->v()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsw0/j;

    invoke-virtual {v3}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lur1/c;->b:Ljava/util/List;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_5

    :cond_5
    iput-object v2, p0, Lur1/c;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lsw0/j;

    invoke-virtual {v3}, Lsw0/j;->u()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {p1}, Lsw0/g;->k()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Lsw0/j;->v()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsw0/j;

    iget-object v1, p0, Lur1/c;->a:Lyr1/a;

    invoke-virtual {v0}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lyr1/a;->r(Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    :goto_5
    return-void
.end method

.method public final f(Lsr1/e$e;Ljava/lang/String;)Lsr1/e;
    .locals 28

    move-object/from16 v2, p2

    const-string v0, "domainState"

    move-object/from16 v15, p1

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "query"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v0

    invoke-virtual {v0}, Lsr1/b;->c()Lsw0/g;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsw0/i;

    invoke-virtual {v4}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    move-object v3, v1

    :cond_1
    if-nez v3, :cond_2

    sget-object v3, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-virtual {v15}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v16

    check-cast v3, Ljava/lang/Iterable;

    const/4 v0, 0x2

    invoke-static {v3, v2, v1, v0, v1}, Lwr2/c;->o(Ljava/lang/Iterable;Ljava/lang/String;Lc93/m;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v17, v2

    goto :goto_1

    :cond_3
    move-object/from16 v17, v1

    :goto_1
    invoke-virtual {v15}, Lsr1/e$e;->f()Lsr1/b;

    move-result-object v0

    invoke-virtual {v0}, Lsr1/b;->c()Lsw0/g;

    move-result-object v0

    if-eqz v0, :cond_4

    const/16 v13, 0xffd

    const/4 v14, 0x0

    const/4 v1, 0x0

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

    invoke-static/range {v0 .. v14}, Lsw0/g;->b(Lsw0/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/g;

    move-result-object v1

    :cond_4
    move-object v8, v1

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v4, v16

    move-object/from16 v7, v17

    invoke-static/range {v4 .. v10}, Lsr1/b;->b(Lsr1/b;ZZLjava/lang/String;Lsw0/g;ILjava/lang/Object;)Lsr1/b;

    move-result-object v20

    const v26, 0x7dffff

    const/16 v27, 0x0

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

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v27}, Lsr1/e$e;->b(Lsr1/e$e;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lsr1/e$e;

    move-result-object v0

    return-object v0
.end method

.method public interact(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lur1/c$a;

    invoke-direct {v0, p1}, Lur1/c$a;-><init>(Lec3/l;)V

    return-object v0
.end method
