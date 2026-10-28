.class public final Lzs2/d;
.super Lzs2/f;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lzs2/d;",
        "Lzs2/f;",
        "Lzs2/g;",
        "rangeContentReducer",
        "Lzs2/h;",
        "recommendedRangeMapper",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "screen",
        "<init>",
        "(Lzs2/g;Lzs2/h;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V",
        "c",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "h",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "weekly-plan_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final c:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;


# direct methods
.method public constructor <init>(Lzs2/g;Lzs2/h;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V
    .locals 1

    const-string v0, "rangeContentReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedRangeMapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screen"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lzs2/f;-><init>(Lzs2/g;Lzs2/h;)V

    .line 2
    iput-object p3, p0, Lzs2/d;->c:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    return-void
.end method

.method public synthetic constructor <init>(Lzs2/g;Lzs2/h;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 3
    sget-object p3, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->HR_ZONES_FOUR_TO_FIVE:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lzs2/d;-><init>(Lzs2/g;Lzs2/h;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    return-void
.end method


# virtual methods
.method public h()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;
    .locals 1

    iget-object v0, p0, Lzs2/d;->c:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    return-object v0
.end method
