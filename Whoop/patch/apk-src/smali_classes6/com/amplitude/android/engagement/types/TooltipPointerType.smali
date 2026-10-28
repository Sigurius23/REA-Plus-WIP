.class public final enum Lcom/amplitude/android/engagement/types/TooltipPointerType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/amplitude/android/engagement/types/TooltipPointerType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0087\u0001\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/TooltipPointerType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "lj/h0",
        "NONE",
        "ARROW",
        "engagement_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/amplitude/android/engagement/types/TooltipPointerType;

.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final enum ARROW:Lcom/amplitude/android/engagement/types/TooltipPointerType;
    .annotation runtime Lwc3/h;
        value = "arrow"
    .end annotation
.end field

.field public static final Companion:Llj/h0;

.field public static final enum NONE:Lcom/amplitude/android/engagement/types/TooltipPointerType;
    .annotation runtime Lwc3/h;
        value = "none"
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/amplitude/android/engagement/types/TooltipPointerType;
    .locals 2

    sget-object v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;->NONE:Lcom/amplitude/android/engagement/types/TooltipPointerType;

    sget-object v1, Lcom/amplitude/android/engagement/types/TooltipPointerType;->ARROW:Lcom/amplitude/android/engagement/types/TooltipPointerType;

    filled-new-array {v0, v1}, [Lcom/amplitude/android/engagement/types/TooltipPointerType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TooltipPointerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;->NONE:Lcom/amplitude/android/engagement/types/TooltipPointerType;

    new-instance v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;

    const-string v1, "ARROW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/amplitude/android/engagement/types/TooltipPointerType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;->ARROW:Lcom/amplitude/android/engagement/types/TooltipPointerType;

    invoke-static {}, Lcom/amplitude/android/engagement/types/TooltipPointerType;->$values()[Lcom/amplitude/android/engagement/types/TooltipPointerType;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;->$VALUES:[Lcom/amplitude/android/engagement/types/TooltipPointerType;

    new-instance v0, Llj/h0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;->Companion:Llj/h0;

    sget-object v0, Ll83/i;->x:Ll83/i;

    sget-object v1, Llj/b;->Y:Llj/b;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;->$cachedSerializer$delegate:Ll83/h;

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

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amplitude/android/engagement/types/TooltipPointerType;
    .locals 1

    const-class v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amplitude/android/engagement/types/TooltipPointerType;

    return-object p0
.end method

.method public static values()[Lcom/amplitude/android/engagement/types/TooltipPointerType;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/TooltipPointerType;->$VALUES:[Lcom/amplitude/android/engagement/types/TooltipPointerType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amplitude/android/engagement/types/TooltipPointerType;

    return-object v0
.end method
