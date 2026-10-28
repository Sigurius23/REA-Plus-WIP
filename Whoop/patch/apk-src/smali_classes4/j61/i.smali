.class public final enum Lj61/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj61/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lj61/i;",
        "",
        "Ly81/f;",
        "color",
        "<init>",
        "(Ljava/lang/String;ILy81/f;)V",
        "Ly81/f;",
        "getColor",
        "()Ly81/f;",
        "BIOMARKER_NEGATIVE",
        "BIOMARKER_POSITIVE",
        "DEFAULT",
        "SAGE_LOW",
        "SAGE_HIGH",
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

.field private static final synthetic $VALUES:[Lj61/i;

.field public static final enum BIOMARKER_NEGATIVE:Lj61/i;

.field public static final enum BIOMARKER_POSITIVE:Lj61/i;

.field public static final enum DEFAULT:Lj61/i;

.field public static final enum SAGE_HIGH:Lj61/i;

.field public static final enum SAGE_LOW:Lj61/i;


# instance fields
.field private final color:Ly81/f;


# direct methods
.method private static final synthetic $values()[Lj61/i;
    .locals 5

    sget-object v0, Lj61/i;->BIOMARKER_NEGATIVE:Lj61/i;

    sget-object v1, Lj61/i;->BIOMARKER_POSITIVE:Lj61/i;

    sget-object v2, Lj61/i;->DEFAULT:Lj61/i;

    sget-object v3, Lj61/i;->SAGE_LOW:Lj61/i;

    sget-object v4, Lj61/i;->SAGE_HIGH:Lj61/i;

    filled-new-array {v0, v1, v2, v3, v4}, [Lj61/i;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lj61/i;

    sget-object v1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const-string v2, "BIOMARKER_NEGATIVE"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lj61/i;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lj61/i;->BIOMARKER_NEGATIVE:Lj61/i;

    new-instance v0, Lj61/i;

    const/4 v2, 0x1

    sget-object v3, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    const-string v4, "BIOMARKER_POSITIVE"

    invoke-direct {v0, v4, v2, v3}, Lj61/i;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lj61/i;->BIOMARKER_POSITIVE:Lj61/i;

    new-instance v0, Lj61/i;

    const/4 v2, 0x2

    sget-object v3, Ly81/f;->WHITE_50:Ly81/f;

    const-string v4, "DEFAULT"

    invoke-direct {v0, v4, v2, v3}, Lj61/i;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lj61/i;->DEFAULT:Lj61/i;

    new-instance v0, Lj61/i;

    const/4 v2, 0x3

    sget-object v3, Ly81/f;->ACCENT_ACTION:Ly81/f;

    const-string v4, "SAGE_LOW"

    invoke-direct {v0, v4, v2, v3}, Lj61/i;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lj61/i;->SAGE_LOW:Lj61/i;

    new-instance v0, Lj61/i;

    const-string v2, "SAGE_HIGH"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v3, v1}, Lj61/i;-><init>(Ljava/lang/String;ILy81/f;)V

    sput-object v0, Lj61/i;->SAGE_HIGH:Lj61/i;

    invoke-static {}, Lj61/i;->$values()[Lj61/i;

    move-result-object v0

    sput-object v0, Lj61/i;->$VALUES:[Lj61/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lj61/i;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILy81/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly81/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lj61/i;->color:Ly81/f;

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

    sget-object v0, Lj61/i;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lj61/i;
    .locals 1

    const-class v0, Lj61/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj61/i;

    return-object p0
.end method

.method public static values()[Lj61/i;
    .locals 1

    sget-object v0, Lj61/i;->$VALUES:[Lj61/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj61/i;

    return-object v0
.end method


# virtual methods
.method public final getColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lj61/i;->color:Ly81/f;

    return-object v0
.end method
