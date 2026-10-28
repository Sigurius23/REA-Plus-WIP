.class final enum Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/amplitude/quickjs/wrapper/QuickJSFunction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

.field public static final enum CALLED:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

.field public static final enum CALLING:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

.field public static final enum NOT_CALLED:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;


# direct methods
.method private static synthetic $values()[Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;
    .locals 3

    sget-object v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->NOT_CALLED:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    sget-object v1, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->CALLING:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    sget-object v2, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->CALLED:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    filled-new-array {v0, v1, v2}, [Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    const-string v1, "NOT_CALLED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->NOT_CALLED:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    const-string v1, "CALLING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->CALLING:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    new-instance v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    const-string v1, "CALLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->CALLED:Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    invoke-static {}, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->$values()[Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    move-result-object v0

    sput-object v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->$VALUES:[Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

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

.method public static valueOf(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;
    .locals 1

    const-class v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    return-object p0
.end method

.method public static values()[Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;
    .locals 1

    sget-object v0, Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->$VALUES:[Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    invoke-virtual {v0}, [Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amplitude/quickjs/wrapper/QuickJSFunction$Status;

    return-object v0
.end method
