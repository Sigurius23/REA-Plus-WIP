.class public final enum Ltg1/b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lxr2/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltg1/b;",
        ">;",
        "Lxr2/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0080\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Ltg1/b;",
        "Lxr2/a;",
        "",
        "",
        "serializedValue",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getSerializedValue",
        "()Ljava/lang/String;",
        "UNKNOWN",
        "MAXIM",
        "NORDIC",
        "PEARL",
        "RUGGLES",
        "AMBIQ",
        "firmware-update-service_release"
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

.field private static final synthetic $VALUES:[Ltg1/b;

.field public static final enum AMBIQ:Ltg1/b;

.field public static final enum MAXIM:Ltg1/b;

.field public static final enum NORDIC:Ltg1/b;

.field public static final enum PEARL:Ltg1/b;

.field public static final enum RUGGLES:Ltg1/b;

.field public static final enum UNKNOWN:Ltg1/b;


# instance fields
.field private final serializedValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Ltg1/b;
    .locals 6

    sget-object v0, Ltg1/b;->UNKNOWN:Ltg1/b;

    sget-object v1, Ltg1/b;->MAXIM:Ltg1/b;

    sget-object v2, Ltg1/b;->NORDIC:Ltg1/b;

    sget-object v3, Ltg1/b;->PEARL:Ltg1/b;

    sget-object v4, Ltg1/b;->RUGGLES:Ltg1/b;

    sget-object v5, Ltg1/b;->AMBIQ:Ltg1/b;

    filled-new-array/range {v0 .. v5}, [Ltg1/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltg1/b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Ltg1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ltg1/b;->UNKNOWN:Ltg1/b;

    new-instance v0, Ltg1/b;

    const-string v1, "MAXIM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Ltg1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ltg1/b;->MAXIM:Ltg1/b;

    new-instance v0, Ltg1/b;

    const-string v1, "NORDIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Ltg1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ltg1/b;->NORDIC:Ltg1/b;

    new-instance v0, Ltg1/b;

    const-string v1, "PEARL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Ltg1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ltg1/b;->PEARL:Ltg1/b;

    new-instance v0, Ltg1/b;

    const-string v1, "RUGGLES"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1}, Ltg1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ltg1/b;->RUGGLES:Ltg1/b;

    new-instance v0, Ltg1/b;

    const-string v1, "AMBIQ"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v1}, Ltg1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ltg1/b;->AMBIQ:Ltg1/b;

    invoke-static {}, Ltg1/b;->$values()[Ltg1/b;

    move-result-object v0

    sput-object v0, Ltg1/b;->$VALUES:[Ltg1/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ltg1/b;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Ltg1/b;->serializedValue:Ljava/lang/String;

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

    sget-object v0, Ltg1/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltg1/b;
    .locals 1

    const-class v0, Ltg1/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltg1/b;

    return-object p0
.end method

.method public static values()[Ltg1/b;
    .locals 1

    sget-object v0, Ltg1/b;->$VALUES:[Ltg1/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltg1/b;

    return-object v0
.end method


# virtual methods
.method public getSerializedValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltg1/b;->serializedValue:Ljava/lang/String;

    return-object v0
.end method
