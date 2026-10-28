.class public final enum Ll80/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll80/v;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Ll80/v;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "GETTING_STARTED",
        "MFA_HELP",
        "activation_release"
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

.field private static final synthetic $VALUES:[Ll80/v;

.field public static final enum GETTING_STARTED:Ll80/v;

.field public static final enum MFA_HELP:Ll80/v;


# direct methods
.method private static final synthetic $values()[Ll80/v;
    .locals 2

    sget-object v0, Ll80/v;->GETTING_STARTED:Ll80/v;

    sget-object v1, Ll80/v;->MFA_HELP:Ll80/v;

    filled-new-array {v0, v1}, [Ll80/v;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll80/v;

    const-string v1, "GETTING_STARTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll80/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll80/v;->GETTING_STARTED:Ll80/v;

    new-instance v0, Ll80/v;

    const-string v1, "MFA_HELP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll80/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll80/v;->MFA_HELP:Ll80/v;

    invoke-static {}, Ll80/v;->$values()[Ll80/v;

    move-result-object v0

    sput-object v0, Ll80/v;->$VALUES:[Ll80/v;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ll80/v;->$ENTRIES:Lt83/a;

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

    sget-object v0, Ll80/v;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ll80/v;
    .locals 1

    const-class v0, Ll80/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll80/v;

    return-object p0
.end method

.method public static values()[Ll80/v;
    .locals 1

    sget-object v0, Ll80/v;->$VALUES:[Ll80/v;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll80/v;

    return-object v0
.end method
