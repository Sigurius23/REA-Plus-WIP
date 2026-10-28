.class public final enum Ldl0/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldl0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldl0/e$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ldl0/e$a;",
        "",
        "",
        "raw",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getRaw",
        "()Ljava/lang/String;",
        "STATIC",
        "AGENT",
        "UNKNOWN",
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

.field private static final synthetic $VALUES:[Ldl0/e$a;

.field public static final enum AGENT:Ldl0/e$a;

.field public static final enum STATIC:Ldl0/e$a;

.field public static final enum UNKNOWN:Ldl0/e$a;


# instance fields
.field private final raw:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Ldl0/e$a;
    .locals 3

    sget-object v0, Ldl0/e$a;->STATIC:Ldl0/e$a;

    sget-object v1, Ldl0/e$a;->AGENT:Ldl0/e$a;

    sget-object v2, Ldl0/e$a;->UNKNOWN:Ldl0/e$a;

    filled-new-array {v0, v1, v2}, [Ldl0/e$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ldl0/e$a;

    const-string v1, "STATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Ldl0/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldl0/e$a;->STATIC:Ldl0/e$a;

    new-instance v0, Ldl0/e$a;

    const-string v1, "AGENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Ldl0/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldl0/e$a;->AGENT:Ldl0/e$a;

    new-instance v0, Ldl0/e$a;

    const/4 v1, 0x2

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Ldl0/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldl0/e$a;->UNKNOWN:Ldl0/e$a;

    invoke-static {}, Ldl0/e$a;->$values()[Ldl0/e$a;

    move-result-object v0

    sput-object v0, Ldl0/e$a;->$VALUES:[Ldl0/e$a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ldl0/e$a;->$ENTRIES:Lt83/a;

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

    iput-object p3, p0, Ldl0/e$a;->raw:Ljava/lang/String;

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

    sget-object v0, Ldl0/e$a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldl0/e$a;
    .locals 1

    const-class v0, Ldl0/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldl0/e$a;

    return-object p0
.end method

.method public static values()[Ldl0/e$a;
    .locals 1

    sget-object v0, Ldl0/e$a;->$VALUES:[Ldl0/e$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldl0/e$a;

    return-object v0
.end method


# virtual methods
.method public final getRaw()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldl0/e$a;->raw:Ljava/lang/String;

    return-object v0
.end method
