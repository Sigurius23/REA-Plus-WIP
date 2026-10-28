.class public final enum Lcom/whoop/ui/views/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/views/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/ui/views/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\u0008\u0002\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/ui/views/b;",
        "",
        "",
        "colorResId",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getColorResId",
        "()I",
        "Companion",
        "a",
        "EMPTY",
        "LOW",
        "MEDIUM",
        "HIGH",
        "app_prodStandardRelease"
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

.field private static final synthetic $VALUES:[Lcom/whoop/ui/views/b;

.field public static final Companion:Lcom/whoop/ui/views/b$a;

.field public static final enum EMPTY:Lcom/whoop/ui/views/b;

.field public static final enum HIGH:Lcom/whoop/ui/views/b;

.field public static final enum LOW:Lcom/whoop/ui/views/b;

.field public static final enum MEDIUM:Lcom/whoop/ui/views/b;


# instance fields
.field private final colorResId:I


# direct methods
.method private static final synthetic $values()[Lcom/whoop/ui/views/b;
    .locals 4

    sget-object v0, Lcom/whoop/ui/views/b;->EMPTY:Lcom/whoop/ui/views/b;

    sget-object v1, Lcom/whoop/ui/views/b;->LOW:Lcom/whoop/ui/views/b;

    sget-object v2, Lcom/whoop/ui/views/b;->MEDIUM:Lcom/whoop/ui/views/b;

    sget-object v3, Lcom/whoop/ui/views/b;->HIGH:Lcom/whoop/ui/views/b;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/ui/views/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/ui/views/b;

    const/4 v1, 0x0

    sget v2, Lvu1/a;->N:I

    const-string v3, "EMPTY"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/ui/views/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/ui/views/b;->EMPTY:Lcom/whoop/ui/views/b;

    new-instance v0, Lcom/whoop/ui/views/b;

    const/4 v1, 0x1

    sget v2, Lhi0/c;->i:I

    const-string v3, "LOW"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/ui/views/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/ui/views/b;->LOW:Lcom/whoop/ui/views/b;

    new-instance v0, Lcom/whoop/ui/views/b;

    const/4 v1, 0x2

    sget v2, Lhi0/c;->j:I

    const-string v3, "MEDIUM"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/ui/views/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/ui/views/b;->MEDIUM:Lcom/whoop/ui/views/b;

    new-instance v0, Lcom/whoop/ui/views/b;

    const/4 v1, 0x3

    sget v2, Lhi0/c;->h:I

    const-string v3, "HIGH"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/ui/views/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/ui/views/b;->HIGH:Lcom/whoop/ui/views/b;

    invoke-static {}, Lcom/whoop/ui/views/b;->$values()[Lcom/whoop/ui/views/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/ui/views/b;->$VALUES:[Lcom/whoop/ui/views/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/ui/views/b;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/ui/views/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ui/views/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ui/views/b;->Companion:Lcom/whoop/ui/views/b$a;

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

    iput p3, p0, Lcom/whoop/ui/views/b;->colorResId:I

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

    sget-object v0, Lcom/whoop/ui/views/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/ui/views/b;
    .locals 1

    const-class v0, Lcom/whoop/ui/views/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/ui/views/b;

    return-object p0
.end method

.method public static values()[Lcom/whoop/ui/views/b;
    .locals 1

    sget-object v0, Lcom/whoop/ui/views/b;->$VALUES:[Lcom/whoop/ui/views/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/ui/views/b;

    return-object v0
.end method


# virtual methods
.method public final getColorResId()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/views/b;->colorResId:I

    return v0
.end method
