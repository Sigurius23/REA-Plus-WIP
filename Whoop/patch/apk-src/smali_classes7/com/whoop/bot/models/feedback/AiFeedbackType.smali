.class public final enum Lcom/whoop/bot/models/feedback/AiFeedbackType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/bot/models/feedback/AiFeedbackType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0087\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/bot/models/feedback/AiFeedbackType;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "BETTER",
        "WORSE",
        "Companion",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/bot/models/feedback/AiFeedbackType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum BETTER:Lcom/whoop/bot/models/feedback/AiFeedbackType;

.field public static final Companion:Lcom/whoop/bot/models/feedback/AiFeedbackType$Companion;

.field public static final enum WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/bot/models/feedback/AiFeedbackType;
    .locals 2

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->BETTER:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    sget-object v1, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    filled-new-array {v0, v1}, [Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    const/4 v1, 0x0

    const-string v2, "better"

    const-string v3, "BETTER"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/bot/models/feedback/AiFeedbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->BETTER:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    new-instance v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    const/4 v1, 0x1

    const-string v2, "worse"

    const-string v3, "WORSE"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/bot/models/feedback/AiFeedbackType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->WORSE:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-static {}, Lcom/whoop/bot/models/feedback/AiFeedbackType;->$values()[Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v0

    sput-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->$VALUES:[Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/bot/models/feedback/AiFeedbackType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/bot/models/feedback/AiFeedbackType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->Companion:Lcom/whoop/bot/models/feedback/AiFeedbackType$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v1, Lkg2/d;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lkg2/d;-><init>(I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->$cachedSerializer$delegate:Ll83/h;

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

    iput-object p3, p0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->value:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.bot.models.feedback.AiFeedbackType"

    invoke-static {}, Lcom/whoop/bot/models/feedback/AiFeedbackType;->values()[Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/models/feedback/AiFeedbackType;->_init_$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/bot/models/feedback/AiFeedbackType;
    .locals 1

    const-class v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/bot/models/feedback/AiFeedbackType;
    .locals 1

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->$VALUES:[Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/bot/models/feedback/AiFeedbackType;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->value:Ljava/lang/String;

    return-object v0
.end method
