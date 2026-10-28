.class public final enum Lm32/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm32/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lm32/e;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "",
        "werePermissionsGranted",
        "()Z",
        "GRANTED",
        "DENIED",
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

.field private static final synthetic $VALUES:[Lm32/e;

.field public static final enum DENIED:Lm32/e;

.field public static final enum GRANTED:Lm32/e;


# direct methods
.method private static final synthetic $values()[Lm32/e;
    .locals 2

    sget-object v0, Lm32/e;->GRANTED:Lm32/e;

    sget-object v1, Lm32/e;->DENIED:Lm32/e;

    filled-new-array {v0, v1}, [Lm32/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm32/e;

    const-string v1, "GRANTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm32/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm32/e;->GRANTED:Lm32/e;

    new-instance v0, Lm32/e;

    const-string v1, "DENIED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lm32/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm32/e;->DENIED:Lm32/e;

    invoke-static {}, Lm32/e;->$values()[Lm32/e;

    move-result-object v0

    sput-object v0, Lm32/e;->$VALUES:[Lm32/e;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lm32/e;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lm32/e;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm32/e;
    .locals 1

    const-class v0, Lm32/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm32/e;

    return-object p0
.end method

.method public static values()[Lm32/e;
    .locals 1

    sget-object v0, Lm32/e;->$VALUES:[Lm32/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm32/e;

    return-object v0
.end method


# virtual methods
.method public final werePermissionsGranted()Z
    .locals 1

    sget-object v0, Lm32/e;->GRANTED:Lm32/e;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
