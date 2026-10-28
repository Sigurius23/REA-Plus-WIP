.class public final enum Leg2/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leg2/k;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B!\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Leg2/k;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "buttonText",
        "",
        "filledCount",
        "Lc31/d;",
        "buttonState",
        "<init>",
        "(Ljava/lang/String;ILcom/whoop/design/util/TextResource;ILc31/d;)V",
        "Lcom/whoop/design/util/TextResource;",
        "getButtonText",
        "()Lcom/whoop/design/util/TextResource;",
        "I",
        "getFilledCount",
        "()I",
        "Lc31/d;",
        "getButtonState",
        "()Lc31/d;",
        "INTRO_V2",
        "INTRO",
        "INPUT",
        "ENTER_CODE",
        "COMPLETED",
        "sms_release"
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

.field private static final synthetic $VALUES:[Leg2/k;

.field public static final enum COMPLETED:Leg2/k;

.field public static final enum ENTER_CODE:Leg2/k;

.field public static final enum INPUT:Leg2/k;

.field public static final enum INTRO:Leg2/k;

.field public static final enum INTRO_V2:Leg2/k;


# instance fields
.field private final buttonState:Lc31/d;

.field private final buttonText:Lcom/whoop/design/util/TextResource;

.field private final filledCount:I


# direct methods
.method private static final synthetic $values()[Leg2/k;
    .locals 5

    sget-object v0, Leg2/k;->INTRO_V2:Leg2/k;

    sget-object v1, Leg2/k;->INTRO:Leg2/k;

    sget-object v2, Leg2/k;->INPUT:Leg2/k;

    sget-object v3, Leg2/k;->ENTER_CODE:Leg2/k;

    sget-object v4, Leg2/k;->COMPLETED:Leg2/k;

    filled-new-array {v0, v1, v2, v3, v4}, [Leg2/k;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Leg2/k;

    sget v1, Lvf2/b;->A:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget-object v9, Lc31/d;->FILLED:Lc31/d;

    const-string v1, "INTRO_V2"

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Leg2/k;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;ILc31/d;)V

    sput-object v0, Leg2/k;->INTRO_V2:Leg2/k;

    new-instance v4, Leg2/k;

    sget v0, Lvf2/b;->z:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    const/4 v8, 0x0

    const-string v5, "INTRO"

    const/4 v6, 0x1

    invoke-direct/range {v4 .. v9}, Leg2/k;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;ILc31/d;)V

    sput-object v4, Leg2/k;->INTRO:Leg2/k;

    new-instance v10, Leg2/k;

    sget v0, Lvf2/b;->p:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v13

    sget-object v5, Lc31/d;->PROGRESS:Lc31/d;

    const-string v11, "INPUT"

    const/4 v12, 0x2

    const/16 v14, 0x23

    move-object v15, v5

    invoke-direct/range {v10 .. v15}, Leg2/k;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;ILc31/d;)V

    sput-object v10, Leg2/k;->INPUT:Leg2/k;

    new-instance v0, Leg2/k;

    sget v1, Lvf2/b;->j:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    const/16 v4, 0x41

    const-string v1, "ENTER_CODE"

    const/4 v2, 0x3

    invoke-direct/range {v0 .. v5}, Leg2/k;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;ILc31/d;)V

    sput-object v0, Leg2/k;->ENTER_CODE:Leg2/k;

    new-instance v4, Leg2/k;

    sget v0, Lvf2/b;->b:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    const-string v5, "COMPLETED"

    const/4 v6, 0x4

    invoke-direct/range {v4 .. v9}, Leg2/k;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;ILc31/d;)V

    sput-object v4, Leg2/k;->COMPLETED:Leg2/k;

    invoke-static {}, Leg2/k;->$values()[Leg2/k;

    move-result-object v0

    sput-object v0, Leg2/k;->$VALUES:[Leg2/k;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Leg2/k;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;ILc31/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "I",
            "Lc31/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Leg2/k;->buttonText:Lcom/whoop/design/util/TextResource;

    iput p4, p0, Leg2/k;->filledCount:I

    iput-object p5, p0, Leg2/k;->buttonState:Lc31/d;

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

    sget-object v0, Leg2/k;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Leg2/k;
    .locals 1

    const-class v0, Leg2/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leg2/k;

    return-object p0
.end method

.method public static values()[Leg2/k;
    .locals 1

    sget-object v0, Leg2/k;->$VALUES:[Leg2/k;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leg2/k;

    return-object v0
.end method


# virtual methods
.method public final getButtonState()Lc31/d;
    .locals 1

    iget-object v0, p0, Leg2/k;->buttonState:Lc31/d;

    return-object v0
.end method

.method public final getButtonText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Leg2/k;->buttonText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getFilledCount()I
    .locals 1

    iget v0, p0, Leg2/k;->filledCount:I

    return v0
.end method
