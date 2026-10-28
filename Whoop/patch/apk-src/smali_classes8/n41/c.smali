.class public final enum Ln41/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln41/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ln41/c;",
        "",
        "Ln41/g;",
        "style",
        "<init>",
        "(Ljava/lang/String;ILn41/g;)V",
        "Ln41/g;",
        "getStyle",
        "()Ln41/g;",
        "INLINE_SMALL",
        "INLINE_LARGE",
        "SEGMENTED_SMALL",
        "FALL_BACK",
        "design_release"
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Ln41/c;

.field public static final enum FALL_BACK:Ln41/c;

.field public static final enum INLINE_LARGE:Ln41/c;

.field public static final enum INLINE_SMALL:Ln41/c;

.field public static final enum SEGMENTED_SMALL:Ln41/c;


# instance fields
.field private final style:Ln41/g;


# direct methods
.method private static final synthetic $values()[Ln41/c;
    .locals 4

    sget-object v0, Ln41/c;->INLINE_SMALL:Ln41/c;

    sget-object v1, Ln41/c;->INLINE_LARGE:Ln41/c;

    sget-object v2, Ln41/c;->SEGMENTED_SMALL:Ln41/c;

    sget-object v3, Ln41/c;->FALL_BACK:Ln41/c;

    filled-new-array {v0, v1, v2, v3}, [Ln41/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 23

    new-instance v0, Ln41/c;

    new-instance v1, Ln41/g;

    sget-wide v3, Li2/x;->f:J

    const-wide v17, 0xff1a1d21L

    invoke-static/range {v17 .. v18}, Li2/w0;->e(J)J

    move-result-wide v5

    const-wide v19, 0xff323941L

    move-wide v8, v5

    invoke-static/range {v19 .. v20}, Li2/w0;->e(J)J

    move-result-wide v6

    const v2, 0x3f59999a    # 0.85f

    move-wide v10, v8

    invoke-static {v2, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v8

    const/16 v5, 0xa

    int-to-float v5, v5

    move v12, v2

    move-wide v2, v3

    move-wide/from16 v21, v10

    move v10, v5

    move-wide/from16 v4, v21

    sget-object v11, Lb91/c;->B1:Lb91/c;

    const/16 v13, 0x8

    int-to-float v14, v13

    const/4 v15, 0x0

    move v13, v12

    move-object v12, v11

    move/from16 v16, v13

    move-object v13, v11

    invoke-direct/range {v1 .. v15}, Ln41/g;-><init>(JJJJFLb91/c;Lb91/c;Lb91/c;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v4, "INLINE_SMALL"

    const/4 v5, 0x0

    invoke-direct {v0, v4, v5, v1}, Ln41/c;-><init>(Ljava/lang/String;ILn41/g;)V

    sput-object v0, Ln41/c;->INLINE_SMALL:Ln41/c;

    new-instance v0, Ln41/c;

    new-instance v1, Ln41/g;

    invoke-static/range {v17 .. v18}, Li2/w0;->e(J)J

    move-result-wide v5

    invoke-static/range {v19 .. v20}, Li2/w0;->e(J)J

    move-result-wide v7

    const v4, 0x3f59999a    # 0.85f

    invoke-static {v4, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v9

    const/16 v11, 0xc

    int-to-float v11, v11

    sget-object v12, Lb91/c;->N5_5:Lb91/c;

    sget-object v14, Lb91/c;->N8:Lb91/c;

    const/16 v16, 0x0

    move-object v13, v12

    move v15, v11

    move-wide/from16 v21, v2

    move-object v2, v1

    move v1, v4

    move-wide/from16 v3, v21

    invoke-direct/range {v2 .. v16}, Ln41/g;-><init>(JJJJFLb91/c;Lb91/c;Lb91/c;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v2

    move-wide/from16 v2, v21

    move-object v12, v14

    const-string v5, "INLINE_LARGE"

    const/4 v6, 0x1

    invoke-direct {v0, v5, v6, v4}, Ln41/c;-><init>(Ljava/lang/String;ILn41/g;)V

    sput-object v0, Ln41/c;->INLINE_LARGE:Ln41/c;

    new-instance v0, Ln41/c;

    new-instance v4, Ln41/g;

    invoke-static/range {v17 .. v18}, Li2/w0;->e(J)J

    move-result-wide v5

    invoke-static/range {v19 .. v20}, Li2/w0;->e(J)J

    move-result-wide v7

    invoke-static {v1, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v9

    move-object v13, v12

    move-object v2, v4

    move-wide/from16 v3, v21

    invoke-direct/range {v2 .. v16}, Ln41/g;-><init>(JJJJFLb91/c;Lb91/c;Lb91/c;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "SEGMENTED_SMALL"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Ln41/c;-><init>(Ljava/lang/String;ILn41/g;)V

    sput-object v0, Ln41/c;->SEGMENTED_SMALL:Ln41/c;

    new-instance v0, Ln41/c;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const-string v3, "FALL_BACK"

    invoke-direct {v0, v3, v1, v2}, Ln41/c;-><init>(Ljava/lang/String;ILn41/g;)V

    sput-object v0, Ln41/c;->FALL_BACK:Ln41/c;

    invoke-static {}, Ln41/c;->$values()[Ln41/c;

    move-result-object v0

    sput-object v0, Ln41/c;->$VALUES:[Ln41/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ln41/c;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILn41/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln41/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ln41/c;->style:Ln41/g;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Ln41/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln41/c;
    .locals 1

    const-class v0, Ln41/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln41/c;

    return-object p0
.end method

.method public static values()[Ln41/c;
    .locals 1

    sget-object v0, Ln41/c;->$VALUES:[Ln41/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln41/c;

    return-object v0
.end method


# virtual methods
.method public final getStyle()Ln41/g;
    .locals 1

    iget-object v0, p0, Ln41/c;->style:Ln41/g;

    return-object v0
.end method
