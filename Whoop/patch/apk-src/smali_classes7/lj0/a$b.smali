.class final enum Llj0/a$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llj0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llj0/a$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Llj0/a$b;",
        "",
        "",
        "tag",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getTag",
        "()Ljava/lang/String;",
        "USER_INITIATED",
        "FAULTY",
        "ERROR",
        "UNKNOWN",
        "connectivity_release"
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

.field private static final synthetic $VALUES:[Llj0/a$b;

.field public static final enum ERROR:Llj0/a$b;

.field public static final enum FAULTY:Llj0/a$b;

.field public static final enum UNKNOWN:Llj0/a$b;

.field public static final enum USER_INITIATED:Llj0/a$b;


# instance fields
.field private final tag:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Llj0/a$b;
    .locals 4

    sget-object v0, Llj0/a$b;->USER_INITIATED:Llj0/a$b;

    sget-object v1, Llj0/a$b;->FAULTY:Llj0/a$b;

    sget-object v2, Llj0/a$b;->ERROR:Llj0/a$b;

    sget-object v3, Llj0/a$b;->UNKNOWN:Llj0/a$b;

    filled-new-array {v0, v1, v2, v3}, [Llj0/a$b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Llj0/a$b;

    const/4 v1, 0x0

    const-string v2, "user_initiated"

    const-string v3, "USER_INITIATED"

    invoke-direct {v0, v3, v1, v2}, Llj0/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llj0/a$b;->USER_INITIATED:Llj0/a$b;

    new-instance v0, Llj0/a$b;

    const/4 v1, 0x1

    const-string v2, "faulty"

    const-string v3, "FAULTY"

    invoke-direct {v0, v3, v1, v2}, Llj0/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llj0/a$b;->FAULTY:Llj0/a$b;

    new-instance v0, Llj0/a$b;

    const/4 v1, 0x2

    const-string v2, "error"

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Llj0/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llj0/a$b;->ERROR:Llj0/a$b;

    new-instance v0, Llj0/a$b;

    const/4 v1, 0x3

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Llj0/a$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Llj0/a$b;->UNKNOWN:Llj0/a$b;

    invoke-static {}, Llj0/a$b;->$values()[Llj0/a$b;

    move-result-object v0

    sput-object v0, Llj0/a$b;->$VALUES:[Llj0/a$b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Llj0/a$b;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Llj0/a$b;->tag:Ljava/lang/String;

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

    sget-object v0, Llj0/a$b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llj0/a$b;
    .locals 1

    const-class v0, Llj0/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llj0/a$b;

    return-object p0
.end method

.method public static values()[Llj0/a$b;
    .locals 1

    sget-object v0, Llj0/a$b;->$VALUES:[Llj0/a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llj0/a$b;

    return-object v0
.end method


# virtual methods
.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llj0/a$b;->tag:Ljava/lang/String;

    return-object v0
.end method
