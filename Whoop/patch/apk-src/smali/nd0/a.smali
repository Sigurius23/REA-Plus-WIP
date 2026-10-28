.class public final Lnd0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lnd0/a;",
        "",
        "<init>",
        "()V",
        "",
        "buttonTextDisplay",
        "",
        "progress",
        "",
        "enabled",
        "Lc31/k;",
        "a",
        "(Ljava/lang/String;Ljava/lang/Float;Z)Lc31/k;",
        "advanced-labs_release"
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


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Float;Z)Lc31/k;
    .locals 23

    move-object/from16 v0, p1

    if-eqz p2, :cond_0

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    sget-object v2, Lc31/d;->PROGRESS:Lc31/d;

    :goto_1
    move-object v4, v2

    goto :goto_2

    :cond_1
    sget-object v2, Lc31/d;->FILLED:Lc31/d;

    goto :goto_1

    :goto_2
    const/4 v2, 0x0

    if-eqz v0, :cond_2

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v3, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    :goto_3
    move-object v5, v3

    goto :goto_4

    :cond_2
    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lma0/d;->i:I

    const/4 v5, 0x2

    invoke-direct {v3, v0, v2, v5, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :goto_4
    if-eqz v1, :cond_3

    sget-object v0, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    :goto_5
    move-object v9, v0

    goto :goto_6

    :cond_3
    sget-object v0, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    goto :goto_5

    :goto_6
    if-eqz v1, :cond_4

    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    :goto_7
    move-object/from16 v17, v0

    goto :goto_8

    :cond_4
    sget-object v0, Ly81/f;->BRAND_BLACK:Ly81/f;

    goto :goto_7

    :goto_8
    sget-object v6, Ly81/f;->BRAND_WHITE:Ly81/f;

    if-eqz v1, :cond_5

    invoke-static {}, Lgb1/b0;->R()Li2/t;

    move-result-object v0

    move-object/from16 v16, v0

    goto :goto_9

    :cond_5
    move-object/from16 v16, v2

    :goto_9
    if-eqz v1, :cond_6

    :goto_a
    move-object v15, v2

    goto :goto_b

    :cond_6
    sget-object v2, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    goto :goto_a

    :goto_b
    new-instance v3, Lc31/k;

    const v21, 0x1c4d8

    const/16 v22, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v12, p2

    move/from16 v13, p3

    invoke-direct/range {v3 .. v22}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method
