.class public final enum Ll01/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll01/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B9\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0011\u001a\u0004\u0008\u0014\u0010\u0013R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u001aj\u0002\u0008\u001cj\u0002\u0008\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Ll01/e;",
        "",
        "Li91/a;",
        "cardBackground",
        "Ly81/f;",
        "titleTextColor",
        "featureTextColor",
        "",
        "showCheckListIcons",
        "Ly3/f;",
        "titleSpace",
        "innerPadding",
        "<init>",
        "(Ljava/lang/String;ILi91/a;Ly81/f;Ly81/f;ZFF)V",
        "Li91/a;",
        "getCardBackground",
        "()Li91/a;",
        "Ly81/f;",
        "getTitleTextColor",
        "()Ly81/f;",
        "getFeatureTextColor",
        "Z",
        "getShowCheckListIcons",
        "()Z",
        "F",
        "getTitleSpace-D9Ej5fM",
        "()F",
        "getInnerPadding-D9Ej5fM",
        "CHECKLIST",
        "INFO",
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

.field private static final synthetic $VALUES:[Ll01/e;

.field public static final enum CHECKLIST:Ll01/e;

.field public static final enum INFO:Ll01/e;


# instance fields
.field private final cardBackground:Li91/a;

.field private final featureTextColor:Ly81/f;

.field private final innerPadding:F

.field private final showCheckListIcons:Z

.field private final titleSpace:F

.field private final titleTextColor:Ly81/f;


# direct methods
.method private static final synthetic $values()[Ll01/e;
    .locals 2

    sget-object v0, Ll01/e;->CHECKLIST:Ll01/e;

    sget-object v1, Ll01/e;->INFO:Ll01/e;

    filled-new-array {v0, v1}, [Ll01/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Ll01/e;

    new-instance v3, Li91/f;

    sget-object v1, Ly81/f;->TRANSPARENT:Ly81/f;

    const/4 v9, 0x0

    const/4 v10, 0x2

    invoke-direct {v3, v1, v9, v10, v9}, Li91/f;-><init>(Ly81/e;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Ly81/f;->WHITE_70:Ly81/f;

    sget-object v5, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/4 v1, 0x4

    int-to-float v11, v1

    mul-float v7, v11, v11

    const/4 v1, 0x0

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v12, v2

    mul-float v8, v1, v12

    const-string v1, "CHECKLIST"

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v8}, Ll01/e;-><init>(Ljava/lang/String;ILi91/a;Ly81/f;Ly81/f;ZFF)V

    sput-object v0, Ll01/e;->CHECKLIST:Ll01/e;

    move v0, v11

    new-instance v11, Ll01/e;

    new-instance v14, Li91/f;

    sget-object v1, Ly81/f;->NEUTRAL_15:Ly81/f;

    invoke-direct {v14, v1, v9, v10, v9}, Li91/f;-><init>(Ly81/e;Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v16, Ly81/f;->RECOVERY:Ly81/f;

    const/4 v1, 0x5

    int-to-float v1, v1

    mul-float v18, v1, v0

    int-to-float v0, v10

    mul-float v19, v0, v12

    const-string v12, "INFO"

    const/4 v13, 0x1

    const/16 v17, 0x0

    move-object v15, v4

    invoke-direct/range {v11 .. v19}, Ll01/e;-><init>(Ljava/lang/String;ILi91/a;Ly81/f;Ly81/f;ZFF)V

    sput-object v11, Ll01/e;->INFO:Ll01/e;

    invoke-static {}, Ll01/e;->$values()[Ll01/e;

    move-result-object v0

    sput-object v0, Ll01/e;->$VALUES:[Ll01/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ll01/e;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILi91/a;Ly81/f;Ly81/f;ZFF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li91/a;",
            "Ly81/f;",
            "Ly81/f;",
            "ZFF)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ll01/e;->cardBackground:Li91/a;

    iput-object p4, p0, Ll01/e;->titleTextColor:Ly81/f;

    iput-object p5, p0, Ll01/e;->featureTextColor:Ly81/f;

    iput-boolean p6, p0, Ll01/e;->showCheckListIcons:Z

    iput p7, p0, Ll01/e;->titleSpace:F

    iput p8, p0, Ll01/e;->innerPadding:F

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

    sget-object v0, Ll01/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ll01/e;
    .locals 1

    const-class v0, Ll01/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll01/e;

    return-object p0
.end method

.method public static values()[Ll01/e;
    .locals 1

    sget-object v0, Ll01/e;->$VALUES:[Ll01/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll01/e;

    return-object v0
.end method


# virtual methods
.method public final getCardBackground()Li91/a;
    .locals 1

    iget-object v0, p0, Ll01/e;->cardBackground:Li91/a;

    return-object v0
.end method

.method public final getFeatureTextColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Ll01/e;->featureTextColor:Ly81/f;

    return-object v0
.end method

.method public final getInnerPadding-D9Ej5fM()F
    .locals 1

    iget v0, p0, Ll01/e;->innerPadding:F

    return v0
.end method

.method public final getShowCheckListIcons()Z
    .locals 1

    iget-boolean v0, p0, Ll01/e;->showCheckListIcons:Z

    return v0
.end method

.method public final getTitleSpace-D9Ej5fM()F
    .locals 1

    iget v0, p0, Ll01/e;->titleSpace:F

    return v0
.end method

.method public final getTitleTextColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Ll01/e;->titleTextColor:Ly81/f;

    return-object v0
.end method
