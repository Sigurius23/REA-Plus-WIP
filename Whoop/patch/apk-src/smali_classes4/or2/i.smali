.class public final enum Lor2/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lor2/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lor2/i;",
        "",
        "",
        "rawString",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getRawString",
        "()Ljava/lang/String;",
        "FIREBASE_DEV",
        "FIREBASE_PROD",
        "PLAY_DEV",
        "PLAY_PROD_MEMBER",
        "PLAY_PROD_EMPLOYEE",
        "DEVELOPER",
        "UNKNOWN",
        "essentials_release"
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

.field private static final synthetic $VALUES:[Lor2/i;

.field public static final enum DEVELOPER:Lor2/i;

.field public static final enum FIREBASE_DEV:Lor2/i;

.field public static final enum FIREBASE_PROD:Lor2/i;

.field public static final enum PLAY_DEV:Lor2/i;

.field public static final enum PLAY_PROD_EMPLOYEE:Lor2/i;

.field public static final enum PLAY_PROD_MEMBER:Lor2/i;

.field public static final enum UNKNOWN:Lor2/i;


# instance fields
.field private final rawString:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lor2/i;
    .locals 7

    sget-object v0, Lor2/i;->FIREBASE_DEV:Lor2/i;

    sget-object v1, Lor2/i;->FIREBASE_PROD:Lor2/i;

    sget-object v2, Lor2/i;->PLAY_DEV:Lor2/i;

    sget-object v3, Lor2/i;->PLAY_PROD_MEMBER:Lor2/i;

    sget-object v4, Lor2/i;->PLAY_PROD_EMPLOYEE:Lor2/i;

    sget-object v5, Lor2/i;->DEVELOPER:Lor2/i;

    sget-object v6, Lor2/i;->UNKNOWN:Lor2/i;

    filled-new-array/range {v0 .. v6}, [Lor2/i;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lor2/i;

    const/4 v1, 0x0

    const-string v2, "firebase_dev"

    const-string v3, "FIREBASE_DEV"

    invoke-direct {v0, v3, v1, v2}, Lor2/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lor2/i;->FIREBASE_DEV:Lor2/i;

    new-instance v0, Lor2/i;

    const/4 v1, 0x1

    const-string v2, "firebase_prod"

    const-string v3, "FIREBASE_PROD"

    invoke-direct {v0, v3, v1, v2}, Lor2/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lor2/i;->FIREBASE_PROD:Lor2/i;

    new-instance v0, Lor2/i;

    const/4 v1, 0x2

    const-string v2, "play_dev"

    const-string v3, "PLAY_DEV"

    invoke-direct {v0, v3, v1, v2}, Lor2/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lor2/i;->PLAY_DEV:Lor2/i;

    new-instance v0, Lor2/i;

    const/4 v1, 0x3

    const-string v2, "play_prod_member"

    const-string v3, "PLAY_PROD_MEMBER"

    invoke-direct {v0, v3, v1, v2}, Lor2/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lor2/i;->PLAY_PROD_MEMBER:Lor2/i;

    new-instance v0, Lor2/i;

    const/4 v1, 0x4

    const-string v2, "play_prod_internal"

    const-string v3, "PLAY_PROD_EMPLOYEE"

    invoke-direct {v0, v3, v1, v2}, Lor2/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lor2/i;->PLAY_PROD_EMPLOYEE:Lor2/i;

    new-instance v0, Lor2/i;

    const/4 v1, 0x5

    const-string v2, "developer"

    const-string v3, "DEVELOPER"

    invoke-direct {v0, v3, v1, v2}, Lor2/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lor2/i;->DEVELOPER:Lor2/i;

    new-instance v0, Lor2/i;

    const/4 v1, 0x6

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lor2/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lor2/i;->UNKNOWN:Lor2/i;

    invoke-static {}, Lor2/i;->$values()[Lor2/i;

    move-result-object v0

    sput-object v0, Lor2/i;->$VALUES:[Lor2/i;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lor2/i;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lor2/i;->rawString:Ljava/lang/String;

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

    sget-object v0, Lor2/i;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lor2/i;
    .locals 1

    const-class v0, Lor2/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lor2/i;

    return-object p0
.end method

.method public static values()[Lor2/i;
    .locals 1

    sget-object v0, Lor2/i;->$VALUES:[Lor2/i;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lor2/i;

    return-object v0
.end method


# virtual methods
.method public final getRawString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lor2/i;->rawString:Ljava/lang/String;

    return-object v0
.end method
