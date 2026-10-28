.class public abstract Lcom/amplitude/android/engagement/types/FormFactor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 !2\u00020\u0001:\u0001\"B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u001b\u0008\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u00c7\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00158&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0017R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u001b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001d\u0082\u0001\u0005#$%&\'\u00a8\u0006("
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/FormFactor;",
        "",
        "<init>",
        "()V",
        "",
        "seen1",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self",
        "(Lcom/amplitude/android/engagement/types/FormFactor;Lzc3/c;Lyc3/g;)V",
        "Lcom/amplitude/android/engagement/types/NudgeStepLayout;",
        "getLayout",
        "()Lcom/amplitude/android/engagement/types/NudgeStepLayout;",
        "layout",
        "",
        "getTextAnimation",
        "()Ljava/lang/String;",
        "textAnimation",
        "getMediaPosition",
        "mediaPosition",
        "Lcom/amplitude/android/engagement/types/ContentAlignment;",
        "getTitleAlignment",
        "()Lcom/amplitude/android/engagement/types/ContentAlignment;",
        "titleAlignment",
        "getContentAlignment",
        "contentAlignment",
        "Companion",
        "lj/j",
        "Lcom/amplitude/android/engagement/types/BannerFormFactor;",
        "Lcom/amplitude/android/engagement/types/ModalFormFactor;",
        "Lcom/amplitude/android/engagement/types/PinFormFactor;",
        "Lcom/amplitude/android/engagement/types/PopoverFormFactor;",
        "Lcom/amplitude/android/engagement/types/TooltipFormFactor;",
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
.field private static final $cachedSerializer$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Llj/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llj/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/FormFactor;->Companion:Llj/j;

    sget-object v0, Ll83/i;->x:Ll83/i;

    sget-object v1, Lcom/amplitude/android/engagement/types/y;->w:Lcom/amplitude/android/engagement/types/y;

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/types/FormFactor;->$cachedSerializer$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/amplitude/android/engagement/types/FormFactor;-><init>()V

    return-void
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/amplitude/android/engagement/types/FormFactor;->$cachedSerializer$delegate:Ll83/h;

    return-object v0
.end method

.method public static final synthetic write$Self(Lcom/amplitude/android/engagement/types/FormFactor;Lzc3/c;Lyc3/g;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public abstract getContentAlignment()Lcom/amplitude/android/engagement/types/ContentAlignment;
.end method

.method public abstract getLayout()Lcom/amplitude/android/engagement/types/NudgeStepLayout;
.end method

.method public abstract getMediaPosition()Ljava/lang/String;
.end method

.method public abstract getTextAnimation()Ljava/lang/String;
.end method

.method public abstract getTitleAlignment()Lcom/amplitude/android/engagement/types/ContentAlignment;
.end method
