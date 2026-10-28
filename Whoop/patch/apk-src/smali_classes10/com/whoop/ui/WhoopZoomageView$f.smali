.class final enum Lcom/whoop/ui/WhoopZoomageView$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/WhoopZoomageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/ui/WhoopZoomageView$f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/whoop/ui/WhoopZoomageView$f;

.field public static final enum ALWAYS:Lcom/whoop/ui/WhoopZoomageView$f;

.field public static final enum NEVER:Lcom/whoop/ui/WhoopZoomageView$f;

.field public static final enum OVER:Lcom/whoop/ui/WhoopZoomageView$f;

.field public static final enum UNDER:Lcom/whoop/ui/WhoopZoomageView$f;


# instance fields
.field final id:I


# direct methods
.method private static synthetic $values()[Lcom/whoop/ui/WhoopZoomageView$f;
    .locals 4

    sget-object v0, Lcom/whoop/ui/WhoopZoomageView$f;->UNDER:Lcom/whoop/ui/WhoopZoomageView$f;

    sget-object v1, Lcom/whoop/ui/WhoopZoomageView$f;->OVER:Lcom/whoop/ui/WhoopZoomageView$f;

    sget-object v2, Lcom/whoop/ui/WhoopZoomageView$f;->ALWAYS:Lcom/whoop/ui/WhoopZoomageView$f;

    sget-object v3, Lcom/whoop/ui/WhoopZoomageView$f;->NEVER:Lcom/whoop/ui/WhoopZoomageView$f;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/ui/WhoopZoomageView$f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/ui/WhoopZoomageView$f;

    const-string v1, "UNDER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/ui/WhoopZoomageView$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/ui/WhoopZoomageView$f;->UNDER:Lcom/whoop/ui/WhoopZoomageView$f;

    new-instance v0, Lcom/whoop/ui/WhoopZoomageView$f;

    const-string v1, "OVER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/ui/WhoopZoomageView$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/ui/WhoopZoomageView$f;->OVER:Lcom/whoop/ui/WhoopZoomageView$f;

    new-instance v0, Lcom/whoop/ui/WhoopZoomageView$f;

    const-string v1, "ALWAYS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/ui/WhoopZoomageView$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/ui/WhoopZoomageView$f;->ALWAYS:Lcom/whoop/ui/WhoopZoomageView$f;

    new-instance v0, Lcom/whoop/ui/WhoopZoomageView$f;

    const-string v1, "NEVER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/ui/WhoopZoomageView$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/ui/WhoopZoomageView$f;->NEVER:Lcom/whoop/ui/WhoopZoomageView$f;

    invoke-static {}, Lcom/whoop/ui/WhoopZoomageView$f;->$values()[Lcom/whoop/ui/WhoopZoomageView$f;

    move-result-object v0

    sput-object v0, Lcom/whoop/ui/WhoopZoomageView$f;->$VALUES:[Lcom/whoop/ui/WhoopZoomageView$f;

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

    iput p3, p0, Lcom/whoop/ui/WhoopZoomageView$f;->id:I

    return-void
.end method

.method public static fromValue(I)Lcom/whoop/ui/WhoopZoomageView$f;
    .locals 5

    invoke-static {}, Lcom/whoop/ui/WhoopZoomageView$f;->values()[Lcom/whoop/ui/WhoopZoomageView$f;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lcom/whoop/ui/WhoopZoomageView$f;->id:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "unknown AutoResetMode value "

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/ui/WhoopZoomageView$f;
    .locals 1

    const-class v0, Lcom/whoop/ui/WhoopZoomageView$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/ui/WhoopZoomageView$f;

    return-object p0
.end method

.method public static values()[Lcom/whoop/ui/WhoopZoomageView$f;
    .locals 1

    sget-object v0, Lcom/whoop/ui/WhoopZoomageView$f;->$VALUES:[Lcom/whoop/ui/WhoopZoomageView$f;

    invoke-virtual {v0}, [Lcom/whoop/ui/WhoopZoomageView$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/ui/WhoopZoomageView$f;

    return-object v0
.end method
