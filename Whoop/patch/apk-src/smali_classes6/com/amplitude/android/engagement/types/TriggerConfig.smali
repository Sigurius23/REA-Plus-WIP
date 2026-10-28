.class public abstract Lcom/amplitude/android/engagement/types/TriggerConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\n\u00087\u0018\u0000 \u00042\u00020\u0001:\u0006\u0005\u0006\u0007\u0008\t\nB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0005\u0005\u0007\u0008\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/amplitude/android/engagement/types/TriggerConfig;",
        "",
        "<init>",
        "()V",
        "Companion",
        "lj/k0",
        "lj/l0",
        "lj/m0",
        "lj/n0",
        "lj/o0",
        "lj/p0",
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
    with = Llj/r0;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Llj/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llj/l0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/amplitude/android/engagement/types/TriggerConfig;->Companion:Llj/l0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/amplitude/android/engagement/types/TriggerConfig;-><init>()V

    return-void
.end method
