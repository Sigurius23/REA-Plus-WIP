.class public final enum Ljz0/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljz0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ljz0/e;",
        "",
        "Ly3/f;",
        "sizeDp",
        "<init>",
        "(Ljava/lang/String;IF)V",
        "F",
        "getSizeDp-D9Ej5fM",
        "()F",
        "Enabled",
        "Fading6",
        "Fading4",
        "Hidden",
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

.field private static final synthetic $VALUES:[Ljz0/e;

.field public static final enum Enabled:Ljz0/e;

.field public static final enum Fading4:Ljz0/e;

.field public static final enum Fading6:Ljz0/e;

.field public static final enum Hidden:Ljz0/e;


# instance fields
.field private final sizeDp:F


# direct methods
.method private static final synthetic $values()[Ljz0/e;
    .locals 4

    sget-object v0, Ljz0/e;->Enabled:Ljz0/e;

    sget-object v1, Ljz0/e;->Fading6:Ljz0/e;

    sget-object v2, Ljz0/e;->Fading4:Ljz0/e;

    sget-object v3, Ljz0/e;->Hidden:Ljz0/e;

    filled-new-array {v0, v1, v2, v3}, [Ljz0/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ljz0/e;

    const/4 v1, 0x2

    int-to-float v2, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    const-string v4, "Enabled"

    const/4 v5, 0x0

    invoke-direct {v0, v4, v5, v2}, Ljz0/e;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Ljz0/e;->Enabled:Ljz0/e;

    new-instance v0, Ljz0/e;

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v6

    mul-float/2addr v2, v3

    const-string v4, "Fading6"

    const/4 v6, 0x1

    invoke-direct {v0, v4, v6, v2}, Ljz0/e;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Ljz0/e;->Fading6:Ljz0/e;

    new-instance v0, Ljz0/e;

    int-to-float v2, v6

    mul-float/2addr v2, v3

    const-string v4, "Fading4"

    invoke-direct {v0, v4, v1, v2}, Ljz0/e;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Ljz0/e;->Fading4:Ljz0/e;

    new-instance v0, Ljz0/e;

    int-to-float v1, v5

    mul-float/2addr v1, v3

    const-string v2, "Hidden"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, Ljz0/e;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Ljz0/e;->Hidden:Ljz0/e;

    invoke-static {}, Ljz0/e;->$values()[Ljz0/e;

    move-result-object v0

    sput-object v0, Ljz0/e;->$VALUES:[Ljz0/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ljz0/e;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ljz0/e;->sizeDp:F

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

    sget-object v0, Ljz0/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljz0/e;
    .locals 1

    const-class v0, Ljz0/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljz0/e;

    return-object p0
.end method

.method public static values()[Ljz0/e;
    .locals 1

    sget-object v0, Ljz0/e;->$VALUES:[Ljz0/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljz0/e;

    return-object v0
.end method


# virtual methods
.method public final getSizeDp-D9Ej5fM()F
    .locals 1

    iget v0, p0, Ljz0/e;->sizeDp:F

    return v0
.end method
