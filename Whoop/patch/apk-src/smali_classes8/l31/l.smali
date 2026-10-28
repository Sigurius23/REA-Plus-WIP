.class public abstract Ll31/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Ly01/f;",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "progressBreakdownStates",
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


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly01/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Ly01/f;

    sget-object v4, Ly81/f;->STRAIN:Ly81/f;

    sget-object v9, Ly81/f;->BLACK_20:Ly81/f;

    new-instance v5, Ly01/g;

    const-string v15, "1/2 Marathon"

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v10, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-direct {v5, v1, v10}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    new-instance v6, Ly01/g;

    const-string v1, "Marathon"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v11, Ly81/f;->WHITE_70:Ly81/f;

    invoke-direct {v6, v1, v11}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    const/16 v8, 0x40

    move-object v3, v4

    move-object v4, v9

    const/4 v9, 0x0

    const/16 v1, 0x1388

    const/16 v2, 0x9c4

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Ly01/f;-><init>(IILy81/f;Ly81/f;Ly01/g;Ly01/g;Ly01/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v4

    new-instance v1, Ly01/f;

    sget-object v8, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    new-instance v2, Ly01/g;

    const-string v4, "10K Run"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v2, v4, v11}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    const/16 v13, 0x40

    const/4 v14, 0x0

    const/16 v6, 0x2710

    const/16 v7, 0x1d4c

    move-object v4, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v5, v11

    move-object v11, v2

    move-object v2, v5

    move-object v5, v1

    move-object v1, v4

    invoke-direct/range {v5 .. v14}, Ly01/f;-><init>(IILy81/f;Ly81/f;Ly01/g;Ly01/g;Ly01/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v5

    new-instance v5, Ly01/f;

    sget-object v8, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    new-instance v10, Ly01/g;

    const-string v4, "Quarter Marathon"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v10, v4, v8}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    const/16 v6, 0x1f40

    const/16 v7, 0xfa0

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v14}, Ly01/f;-><init>(IILy81/f;Ly81/f;Ly01/g;Ly01/g;Ly01/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v5

    new-instance v5, Ly01/f;

    sget-object v8, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    const/16 v7, 0x1f40

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v14}, Ly01/f;-><init>(IILy81/f;Ly81/f;Ly01/g;Ly01/g;Ly01/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v5

    new-instance v4, Ly01/f;

    new-instance v6, Ly01/g;

    const-string v5, "1/2 Marathon long text to support i18n"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct {v6, v5, v1}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    new-instance v7, Ly01/g;

    const-string v12, "Marathon long text to support i18n"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct {v7, v5, v2}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    move-object v5, v9

    const/16 v9, 0x40

    move-object v8, v2

    const/16 v2, 0x1388

    move-object v13, v1

    move-object v1, v4

    move-object v4, v3

    const/16 v3, 0x9c4

    move-object v14, v8

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Ly01/f;-><init>(IILy81/f;Ly81/f;Ly01/g;Ly01/g;Ly01/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v1

    move-object v3, v4

    move-object v9, v5

    new-instance v1, Ly01/f;

    new-instance v6, Ly01/g;

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v6, v2, v13}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    new-instance v7, Ly01/g;

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v7, v2, v14}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    const/16 v9, 0x40

    const/16 v2, 0x1388

    const/16 v3, 0x9c4

    invoke-direct/range {v1 .. v10}, Ly01/f;-><init>(IILy81/f;Ly81/f;Ly01/g;Ly01/g;Ly01/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ly01/f;

    sget-object v5, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v6, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    new-instance v9, Ly01/g;

    const-string v3, "3/4 Updates Completed"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v9, v3, v13}, Ly01/g;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;)V

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Ly01/f;-><init>(IILy81/f;Ly81/f;Ly01/g;Ly01/g;Ly01/g;)V

    move-object v5, v1

    move-object v6, v2

    move-object v3, v11

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v4, v18

    filled-new-array/range {v0 .. v6}, [Ly01/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll31/l;->a:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly01/f;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll31/l;->a:Ljava/util/List;

    return-object v0
.end method
