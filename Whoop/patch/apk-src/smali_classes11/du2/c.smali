.class public final enum Ldu2/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldu2/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ldu2/c;",
        "",
        "",
        "propertyValue",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getPropertyValue",
        "()Ljava/lang/String;",
        "LIVE_SESSION",
        "EXERCISES",
        "NOTIFICATION",
        "UNKNOWN",
        "weightlifting_release"
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

.field private static final synthetic $VALUES:[Ldu2/c;

.field public static final enum EXERCISES:Ldu2/c;

.field public static final enum LIVE_SESSION:Ldu2/c;

.field public static final enum NOTIFICATION:Ldu2/c;

.field public static final enum UNKNOWN:Ldu2/c;


# instance fields
.field private final propertyValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Ldu2/c;
    .locals 4

    sget-object v0, Ldu2/c;->LIVE_SESSION:Ldu2/c;

    sget-object v1, Ldu2/c;->EXERCISES:Ldu2/c;

    sget-object v2, Ldu2/c;->NOTIFICATION:Ldu2/c;

    sget-object v3, Ldu2/c;->UNKNOWN:Ldu2/c;

    filled-new-array {v0, v1, v2, v3}, [Ldu2/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ldu2/c;

    const/4 v1, 0x0

    const-string v2, "Live Session"

    const-string v3, "LIVE_SESSION"

    invoke-direct {v0, v3, v1, v2}, Ldu2/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldu2/c;->LIVE_SESSION:Ldu2/c;

    new-instance v0, Ldu2/c;

    const/4 v1, 0x1

    const-string v2, "Exercises"

    const-string v3, "EXERCISES"

    invoke-direct {v0, v3, v1, v2}, Ldu2/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldu2/c;->EXERCISES:Ldu2/c;

    new-instance v0, Ldu2/c;

    const/4 v1, 0x2

    const-string v2, "Notification"

    const-string v3, "NOTIFICATION"

    invoke-direct {v0, v3, v1, v2}, Ldu2/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldu2/c;->NOTIFICATION:Ldu2/c;

    new-instance v0, Ldu2/c;

    const/4 v1, 0x3

    const-string v2, "Unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Ldu2/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldu2/c;->UNKNOWN:Ldu2/c;

    invoke-static {}, Ldu2/c;->$values()[Ldu2/c;

    move-result-object v0

    sput-object v0, Ldu2/c;->$VALUES:[Ldu2/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ldu2/c;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Ldu2/c;->propertyValue:Ljava/lang/String;

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

    sget-object v0, Ldu2/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldu2/c;
    .locals 1

    const-class v0, Ldu2/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldu2/c;

    return-object p0
.end method

.method public static values()[Ldu2/c;
    .locals 1

    sget-object v0, Ldu2/c;->$VALUES:[Ldu2/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldu2/c;

    return-object v0
.end method


# virtual methods
.method public final getPropertyValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldu2/c;->propertyValue:Ljava/lang/String;

    return-object v0
.end method
