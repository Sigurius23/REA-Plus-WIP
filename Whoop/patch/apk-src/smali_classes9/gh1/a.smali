.class public final enum Lgh1/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgh1/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\u0008\u0002\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lgh1/a;",
        "",
        "Landroidx/compose/ui/Modifier;",
        "backgroundModifier",
        "<init>",
        "(Ljava/lang/String;ILandroidx/compose/ui/Modifier;)V",
        "Landroidx/compose/ui/Modifier;",
        "getBackgroundModifier",
        "()Landroidx/compose/ui/Modifier;",
        "DEFAULT",
        "ADVANCED_LABS",
        "gifting_release"
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

.field private static final synthetic $VALUES:[Lgh1/a;

.field public static final enum ADVANCED_LABS:Lgh1/a;

.field public static final enum DEFAULT:Lgh1/a;


# instance fields
.field private final backgroundModifier:Landroidx/compose/ui/Modifier;


# direct methods
.method private static final synthetic $values()[Lgh1/a;
    .locals 2

    sget-object v0, Lgh1/a;->DEFAULT:Lgh1/a;

    sget-object v1, Lgh1/a;->ADVANCED_LABS:Lgh1/a;

    filled-new-array {v0, v1}, [Lgh1/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lgh1/a;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lgh1/a;-><init>(Ljava/lang/String;ILandroidx/compose/ui/Modifier;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgh1/a;->DEFAULT:Lgh1/a;

    new-instance v0, Lgh1/a;

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Lgb1/b0;->g0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "ADVANCED_LABS"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lgh1/a;-><init>(Ljava/lang/String;ILandroidx/compose/ui/Modifier;)V

    sput-object v0, Lgh1/a;->ADVANCED_LABS:Lgh1/a;

    invoke-static {}, Lgh1/a;->$values()[Lgh1/a;

    move-result-object v0

    sput-object v0, Lgh1/a;->$VALUES:[Lgh1/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lgh1/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILandroidx/compose/ui/Modifier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lgh1/a;->backgroundModifier:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILandroidx/compose/ui/Modifier;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 3
    sget-object p3, Lb2/t;->w:Lb2/t;

    invoke-static {p3}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lgh1/a;-><init>(Ljava/lang/String;ILandroidx/compose/ui/Modifier;)V

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

    sget-object v0, Lgh1/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lgh1/a;
    .locals 1

    const-class v0, Lgh1/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgh1/a;

    return-object p0
.end method

.method public static values()[Lgh1/a;
    .locals 1

    sget-object v0, Lgh1/a;->$VALUES:[Lgh1/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgh1/a;

    return-object v0
.end method


# virtual methods
.method public final getBackgroundModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    iget-object v0, p0, Lgh1/a;->backgroundModifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method
