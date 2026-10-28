.class public final Lfh2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00102\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lfh2/b;",
        "",
        "<init>",
        "()V",
        "",
        "isStealthModeOn",
        "toggleSuccess",
        "Lhh2/g;",
        "previousViewState",
        "e",
        "(ZZLhh2/g;)Lhh2/g;",
        "Leh2/a;",
        "metricType",
        "isEnabled",
        "d",
        "(Lhh2/g;Leh2/a;Z)Lhh2/g;",
        "Lec3/l;",
        "Ldh2/c;",
        "upstream",
        "c",
        "(Lec3/l;)Lec3/l;",
        "stealth-mode_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lfh2/b;Lhh2/g;Leh2/a;Z)Lhh2/g;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lfh2/b;->d(Lhh2/g;Leh2/a;Z)Lhh2/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lfh2/b;ZZLhh2/g;)Lhh2/g;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lfh2/b;->e(ZZLhh2/g;)Lhh2/g;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lhh2/g;Leh2/a;Z)Lhh2/g;
    .locals 14

    move-object/from16 v0, p2

    invoke-virtual {p1}, Lhh2/g;->c()Lhh2/f;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lhh2/f;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lhh2/b;

    invoke-virtual {v5}, Lhh2/b;->c()Leh2/a;

    move-result-object v5

    if-ne v5, v0, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    if-eqz v3, :cond_4

    invoke-virtual {v1}, Lhh2/f;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhh2/b;

    invoke-virtual {v5}, Lhh2/b;->c()Leh2/a;

    move-result-object v6

    if-ne v6, v0, :cond_2

    const/4 v6, 0x1

    move/from16 v7, p3

    invoke-static {v5, v4, v7, v6, v4}, Lhh2/b;->b(Lhh2/b;Leh2/a;ZILjava/lang/Object;)Lhh2/b;

    move-result-object v5

    goto :goto_2

    :cond_2
    move/from16 v7, p3

    :goto_2
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lhh2/f;->b(Lhh2/f;ZZZLjava/util/List;ILjava/lang/Object;)Lhh2/f;

    move-result-object v10

    const/16 v12, 0x9

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, Lhh2/g;->b(Lhh2/g;ZZLhh2/f;Lhh2/a;ILjava/lang/Object;)Lhh2/g;

    move-result-object p1

    return-object p1

    :cond_4
    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lhh2/g;->b(Lhh2/g;ZZLhh2/f;Lhh2/a;ILjava/lang/Object;)Lhh2/g;

    move-result-object p1

    return-object p1
.end method

.method private final e(ZZLhh2/g;)Lhh2/g;
    .locals 8

    invoke-virtual {p3}, Lhh2/g;->c()Lhh2/f;

    move-result-object v0

    if-eqz v0, :cond_1

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v1, p1

    move v2, p2

    invoke-static/range {v0 .. v6}, Lhh2/f;->b(Lhh2/f;ZZZLjava/util/List;ILjava/lang/Object;)Lhh2/f;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, p1

    goto :goto_1

    :cond_1
    move v1, p1

    move v2, p2

    :goto_0
    new-instance v0, Lhh2/f;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lhh2/f;-><init>(ZZZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v0

    :goto_1
    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p3

    invoke-static/range {v1 .. v7}, Lhh2/g;->b(Lhh2/g;ZZLhh2/f;Lhh2/a;ILjava/lang/Object;)Lhh2/g;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Lec3/l;)Lec3/l;
    .locals 8
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

    new-instance v1, Lhh2/g;

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lhh2/g;-><init>(ZZLhh2/f;Lhh2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lfh2/b$a;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lfh2/b$a;-><init>(Lfh2/b;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v1, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
