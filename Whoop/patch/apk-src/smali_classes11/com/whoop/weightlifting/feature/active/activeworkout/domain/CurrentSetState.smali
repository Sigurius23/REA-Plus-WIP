.class public interface abstract Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;,
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$a;,
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;,
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;,
        Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u0000 \u00062\u00020\u0001:\u0005\u0007\u0008\t\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u0082\u0001\u0004\u000c\r\u000e\u000f\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;",
        "",
        "Lorg/joda/time/DateTime;",
        "getStartTime",
        "()Lorg/joda/time/DateTime;",
        "startTime",
        "Companion",
        "Rest",
        "Active",
        "Warmup",
        "Cooldown",
        "a",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Active;",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Cooldown;",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Rest;",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$Warmup;",
        "weightlifting_release"
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
.field public static final Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$a;->a:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$a;

    sput-object v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;->Companion:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState$a;

    return-void
.end method


# virtual methods
.method public abstract getStartTime()Lorg/joda/time/DateTime;
.end method
