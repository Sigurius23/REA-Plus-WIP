.class public final Lor2/t;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lor2/t$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R(\u0010\u000e\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u00088F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lor2/t;",
        "Landroidx/lifecycle/w1;",
        "Landroidx/lifecycle/k1;",
        "savedStateHandle",
        "<init>",
        "(Landroidx/lifecycle/k1;)V",
        "w",
        "Landroidx/lifecycle/k1;",
        "",
        "value",
        "g",
        "()Ljava/lang/Integer;",
        "j",
        "(Ljava/lang/Integer;)V",
        "savedCurrentDestinationId",
        "x",
        "a",
        "feature_release"
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
.field public static final x:Lor2/t$a;

.field public static final y:I


# instance fields
.field private final w:Landroidx/lifecycle/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lor2/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lor2/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lor2/t;->x:Lor2/t$a;

    const/16 v0, 0x8

    sput v0, Lor2/t;->y:I

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/k1;)V
    .locals 1

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lor2/t;->w:Landroidx/lifecycle/k1;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lor2/t;->w:Landroidx/lifecycle/k1;

    const-string v1, "current_destination_holding_store_current_destination_id_state"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final j(Ljava/lang/Integer;)V
    .locals 2

    iget-object v0, p0, Lor2/t;->w:Landroidx/lifecycle/k1;

    const-string v1, "current_destination_holding_store_current_destination_id_state"

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
