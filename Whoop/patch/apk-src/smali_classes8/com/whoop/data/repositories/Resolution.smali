.class public final enum Lcom/whoop/data/repositories/Resolution;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/data/repositories/Resolution;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/data/repositories/Resolution;",
        "",
        "stepSize",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getStepSize",
        "()I",
        "HIGH",
        "MEDIUM",
        "LOW",
        "core_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/data/repositories/Resolution;

.field public static final enum HIGH:Lcom/whoop/data/repositories/Resolution;

.field public static final enum LOW:Lcom/whoop/data/repositories/Resolution;

.field public static final enum MEDIUM:Lcom/whoop/data/repositories/Resolution;


# instance fields
.field private final stepSize:I


# direct methods
.method private static final synthetic $values()[Lcom/whoop/data/repositories/Resolution;
    .locals 3

    sget-object v0, Lcom/whoop/data/repositories/Resolution;->HIGH:Lcom/whoop/data/repositories/Resolution;

    sget-object v1, Lcom/whoop/data/repositories/Resolution;->MEDIUM:Lcom/whoop/data/repositories/Resolution;

    sget-object v2, Lcom/whoop/data/repositories/Resolution;->LOW:Lcom/whoop/data/repositories/Resolution;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/data/repositories/Resolution;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/repositories/Resolution;

    const/4 v1, 0x0

    const/4 v2, 0x6

    const-string v3, "HIGH"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/repositories/Resolution;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/data/repositories/Resolution;->HIGH:Lcom/whoop/data/repositories/Resolution;

    new-instance v0, Lcom/whoop/data/repositories/Resolution;

    const/4 v1, 0x1

    const/16 v2, 0x3c

    const-string v3, "MEDIUM"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/repositories/Resolution;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/data/repositories/Resolution;->MEDIUM:Lcom/whoop/data/repositories/Resolution;

    new-instance v0, Lcom/whoop/data/repositories/Resolution;

    const/4 v1, 0x2

    const/16 v2, 0x258

    const-string v3, "LOW"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/repositories/Resolution;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/data/repositories/Resolution;->LOW:Lcom/whoop/data/repositories/Resolution;

    invoke-static {}, Lcom/whoop/data/repositories/Resolution;->$values()[Lcom/whoop/data/repositories/Resolution;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/repositories/Resolution;->$VALUES:[Lcom/whoop/data/repositories/Resolution;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/repositories/Resolution;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/whoop/data/repositories/Resolution;->stepSize:I

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

    sget-object v0, Lcom/whoop/data/repositories/Resolution;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/data/repositories/Resolution;
    .locals 1

    const-class v0, Lcom/whoop/data/repositories/Resolution;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/Resolution;

    return-object p0
.end method

.method public static values()[Lcom/whoop/data/repositories/Resolution;
    .locals 1

    sget-object v0, Lcom/whoop/data/repositories/Resolution;->$VALUES:[Lcom/whoop/data/repositories/Resolution;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/data/repositories/Resolution;

    return-object v0
.end method


# virtual methods
.method public final getStepSize()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/repositories/Resolution;->stepSize:I

    return v0
.end method
