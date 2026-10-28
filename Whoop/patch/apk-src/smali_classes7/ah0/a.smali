.class final enum Lah0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lah0/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lah0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0082\u0081\u0002\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lah0/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "isUserInput",
        "()Z",
        "Companion",
        "a",
        "STATIC",
        "USER_INPUT",
        "bot_release"
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

.field private static final synthetic $VALUES:[Lah0/a;

.field public static final Companion:Lah0/a$a;

.field public static final enum STATIC:Lah0/a;

.field public static final enum USER_INPUT:Lah0/a;


# direct methods
.method private static final synthetic $values()[Lah0/a;
    .locals 2

    sget-object v0, Lah0/a;->STATIC:Lah0/a;

    sget-object v1, Lah0/a;->USER_INPUT:Lah0/a;

    filled-new-array {v0, v1}, [Lah0/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lah0/a;

    const-string v1, "STATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lah0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lah0/a;->STATIC:Lah0/a;

    new-instance v0, Lah0/a;

    const-string v1, "USER_INPUT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lah0/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lah0/a;->USER_INPUT:Lah0/a;

    invoke-static {}, Lah0/a;->$values()[Lah0/a;

    move-result-object v0

    sput-object v0, Lah0/a;->$VALUES:[Lah0/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lah0/a;->$ENTRIES:Lt83/a;

    new-instance v0, Lah0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lah0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lah0/a;->Companion:Lah0/a$a;

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

    sget-object v0, Lah0/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lah0/a;
    .locals 1

    const-class v0, Lah0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lah0/a;

    return-object p0
.end method

.method public static values()[Lah0/a;
    .locals 1

    sget-object v0, Lah0/a;->$VALUES:[Lah0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lah0/a;

    return-object v0
.end method


# virtual methods
.method public final isUserInput()Z
    .locals 1

    sget-object v0, Lah0/a;->USER_INPUT:Lah0/a;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
