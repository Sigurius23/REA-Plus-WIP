.class public final Lpq0/c;
.super Lhj0/o;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpq0/c;",
        "Lhj0/o;",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lbc3/c0;)V",
        "",
        "E",
        "Ljava/lang/String;",
        "o",
        "()Ljava/lang/String;",
        "logTag",
        "Lpq0/h;",
        "F",
        "Lpq0/h;",
        "getShareWidgetButtonViewState",
        "()Lpq0/h;",
        "shareWidgetButtonViewState",
        "community_release"
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
.field private final E:Ljava/lang/String;

.field private final F:Lpq0/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lpq0/c;-><init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lbc3/c0;)V
    .locals 2

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lhj0/o;-><init>(Lbc3/c0;)V

    .line 3
    const-string p1, "GlobalShareButtonViewModel"

    iput-object p1, p0, Lpq0/c;->E:Ljava/lang/String;

    .line 4
    new-instance p1, Lpq0/h;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p1, v0, v0, v1, v0}, Lpq0/h;-><init>(Ljava/lang/String;Lcom/whoop/community/share/WidgetCollectionName;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lpq0/c;->F:Lpq0/h;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    .line 5
    new-instance p1, Lor2/m;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p3, p2}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-direct {p0, p1}, Lpq0/c;-><init>(Lbc3/c0;)V

    return-void
.end method


# virtual methods
.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpq0/c;->E:Ljava/lang/String;

    return-object v0
.end method
