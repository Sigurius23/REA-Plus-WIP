.class public final Ltk2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ltk2/d;",
        "",
        "<init>",
        "()V",
        "Lmk2/f;",
        "map",
        "",
        "targetDistanceMeters",
        "Lcom/whoop/domain/model/UnitSystem;",
        "unitSystem",
        "Ltk2/c;",
        "a",
        "(Lmk2/f;Ljava/lang/Double;Lcom/whoop/domain/model/UnitSystem;)Ltk2/c;",
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


# static fields
.field public static final a:Ltk2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltk2/d;

    invoke-direct {v0}, Ltk2/d;-><init>()V

    sput-object v0, Ltk2/d;->a:Ltk2/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmk2/f;Ljava/lang/Double;Lcom/whoop/domain/model/UnitSystem;)Ltk2/c;
    .locals 17

    move-object/from16 v0, p3

    const-string v1, "unitSystem"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lmk2/f;->b()Ljava/lang/Double;

    move-result-object v2

    const-wide/16 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    cmpg-double v2, v5, v3

    if-gez v2, :cond_2

    :cond_1
    move-wide v5, v3

    :cond_2
    if-eqz p2, :cond_3

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    cmpl-double v2, v7, v3

    if-lez v2, :cond_3

    move-object/from16 v2, p2

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    sget-object v3, Ltk2/b;->a:Ltk2/b;

    invoke-virtual {v3, v5, v6, v0}, Ltk2/b;->f(DLcom/whoop/domain/model/UnitSystem;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    div-double v7, v5, v7

    double-to-float v1, v7

    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v1, v7, v8}, Le93/b;->m(FFF)F

    move-result v1

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    cmpl-double v5, v5, v7

    if-ltz v5, :cond_4

    const/4 v5, 0x1

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    :goto_1
    new-instance v6, Ltk2/c;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    invoke-virtual {v3, v7, v8, v0}, Ltk2/b;->h(DLcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lkk2/d;->k:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    new-instance v7, Ltk2/n;

    const/16 v3, 0x3e8

    int-to-float v3, v3

    mul-float/2addr v1, v3

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v8

    if-eqz v5, :cond_5

    sget-object v1, Ly81/f;->ACCENT_ACTION:Ly81/f;

    :goto_2
    move-object v10, v1

    goto :goto_3

    :cond_5
    sget-object v1, Ly81/f;->STRAIN:Ly81/f;

    goto :goto_2

    :goto_3
    const/16 v15, 0x78

    const/16 v16, 0x0

    const/16 v9, 0x3e8

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Ltk2/n;-><init>(IILy81/f;Ly81/f;FIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v6, v4, v0, v2, v7}, Ltk2/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ltk2/n;)V

    return-object v6

    :cond_6
    new-instance v2, Ltk2/c;

    invoke-virtual {v3, v0}, Ltk2/b;->i(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v3, Lkk2/d;->k:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    invoke-direct {v2, v4, v0, v3, v1}, Ltk2/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ltk2/n;)V

    return-object v2
.end method
