.class public final Lvu0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvu0/f$a;,
        Lvu0/f$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J*\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lvu0/f;",
        "",
        "Lvu0/e;",
        "streakInfoHandler",
        "Lvu0/a;",
        "lowBatteryNotificationBuilder",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lvu0/e;Lvu0/a;Ltr2/n;)V",
        "Lb12/c;",
        "bucket",
        "Lst0/v;",
        "strapGen",
        "",
        "b",
        "(Lb12/c;Lst0/v;)Z",
        "Lvu0/d;",
        "streak",
        "a",
        "(Lvu0/d;)Z",
        "Lb12/d;",
        "standardContent",
        "c",
        "(Lb12/c;Lst0/v;Lb12/d;Lq83/d;)Ljava/lang/Object;",
        "Lvu0/e;",
        "Lvu0/a;",
        "Ltr2/n;",
        "d",
        "connectivity-notifications_release"
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
.field public static final d:Lvu0/f$a;

.field public static final e:I


# instance fields
.field private final a:Lvu0/e;

.field private final b:Lvu0/a;

.field private final c:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvu0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvu0/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvu0/f;->d:Lvu0/f$a;

    const/16 v0, 0x8

    sput v0, Lvu0/f;->e:I

    return-void
.end method

.method public constructor <init>(Lvu0/e;Lvu0/a;Ltr2/n;)V
    .locals 1

    const-string v0, "streakInfoHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lowBatteryNotificationBuilder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvu0/f;->a:Lvu0/e;

    .line 3
    iput-object p2, p0, Lvu0/f;->b:Lvu0/a;

    .line 4
    iput-object p3, p0, Lvu0/f;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lvu0/e;Lvu0/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "StreakResolver"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lvu0/f;-><init>(Lvu0/e;Lvu0/a;Ltr2/n;)V

    return-void
.end method

.method private final a(Lvu0/d;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lvu0/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "FROZEN"

    const-string v3, "PENDING"

    const-string v4, "ACTIVE"

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p1}, Lvu0/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x3

    if-lt v1, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method private final b(Lb12/c;Lst0/v;)Z
    .locals 2

    if-nez p2, :cond_0

    const/4 p2, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lvu0/f$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    :goto_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    sget-object p2, Lb12/c;->BUCKET_LOW:Lb12/c;

    if-ne p1, p2, :cond_1

    return v0

    :cond_1
    return v1

    :pswitch_2
    sget-object p2, Lb12/c;->BUCKET_MEDIUM:Lb12/c;

    if-ne p1, p2, :cond_2

    return v0

    :cond_2
    :pswitch_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final c(Lb12/c;Lst0/v;Lb12/d;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb12/c;",
            "Lst0/v;",
            "Lb12/d;",
            "Lq83/d<",
            "-",
            "Lb12/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lvu0/f$c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lvu0/f$c;

    iget v1, v0, Lvu0/f$c;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvu0/f$c;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvu0/f$c;

    invoke-direct {v0, p0, p4}, Lvu0/f$c;-><init>(Lvu0/f;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lvu0/f$c;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvu0/f$c;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p1, v0, Lvu0/f$c;->z:Z

    iget-object p2, v0, Lvu0/f$c;->y:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Lb12/d;

    iget-object p2, v0, Lvu0/f$c;->x:Ljava/lang/Object;

    check-cast p2, Lst0/v;

    iget-object v0, v0, Lvu0/f$c;->w:Ljava/lang/Object;

    check-cast v0, Lb12/c;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lvu0/f;->b(Lb12/c;Lst0/v;)Z

    move-result p1

    const/4 p4, 0x0

    if-eqz p1, :cond_4

    iget-object v2, p0, Lvu0/f;->a:Lvu0/e;

    iput-object p4, v0, Lvu0/f$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lvu0/f$c;->x:Ljava/lang/Object;

    iput-object p3, v0, Lvu0/f$c;->y:Ljava/lang/Object;

    iput-boolean p1, v0, Lvu0/f$c;->z:Z

    iput v3, v0, Lvu0/f$c;->G:I

    invoke-virtual {v2, v0}, Lvu0/e;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Lvu0/d;

    :cond_4
    if-eqz p1, :cond_5

    if-eqz p4, :cond_5

    invoke-direct {p0, p4}, Lvu0/f;->a(Lvu0/d;)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Lb12/d;

    iget-object p3, p0, Lvu0/f;->b:Lvu0/a;

    invoke-virtual {p3, p2}, Lvu0/a;->f(Lst0/v;)Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, Lvu0/f;->b:Lvu0/a;

    invoke-virtual {p4}, Lvu0/d;->b()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Lvu0/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    iget-object v0, p0, Lvu0/f;->b:Lvu0/a;

    invoke-virtual {v0, p2}, Lvu0/a;->d(Lst0/v;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p3, p4, p2}, Lb12/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_5
    return-object p3
.end method
