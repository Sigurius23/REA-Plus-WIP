.class public final enum Lwt2/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwt2/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lwt2/m;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ON_TRACK",
        "STRUGGLING",
        "OFF_TRACK",
        "NONE",
        "weekly-plan_release"
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

.field private static final synthetic $VALUES:[Lwt2/m;

.field public static final enum NONE:Lwt2/m;

.field public static final enum OFF_TRACK:Lwt2/m;

.field public static final enum ON_TRACK:Lwt2/m;

.field public static final enum STRUGGLING:Lwt2/m;


# direct methods
.method private static final synthetic $values()[Lwt2/m;
    .locals 4

    sget-object v0, Lwt2/m;->ON_TRACK:Lwt2/m;

    sget-object v1, Lwt2/m;->STRUGGLING:Lwt2/m;

    sget-object v2, Lwt2/m;->OFF_TRACK:Lwt2/m;

    sget-object v3, Lwt2/m;->NONE:Lwt2/m;

    filled-new-array {v0, v1, v2, v3}, [Lwt2/m;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwt2/m;

    const-string v1, "ON_TRACK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwt2/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwt2/m;->ON_TRACK:Lwt2/m;

    new-instance v0, Lwt2/m;

    const-string v1, "STRUGGLING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lwt2/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwt2/m;->STRUGGLING:Lwt2/m;

    new-instance v0, Lwt2/m;

    const-string v1, "OFF_TRACK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lwt2/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwt2/m;->OFF_TRACK:Lwt2/m;

    new-instance v0, Lwt2/m;

    const-string v1, "NONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lwt2/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwt2/m;->NONE:Lwt2/m;

    invoke-static {}, Lwt2/m;->$values()[Lwt2/m;

    move-result-object v0

    sput-object v0, Lwt2/m;->$VALUES:[Lwt2/m;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lwt2/m;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lwt2/m;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwt2/m;
    .locals 1

    const-class v0, Lwt2/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwt2/m;

    return-object p0
.end method

.method public static values()[Lwt2/m;
    .locals 1

    sget-object v0, Lwt2/m;->$VALUES:[Lwt2/m;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwt2/m;

    return-object v0
.end method
