.class public final Lqq0/d;
.super Lhj0/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqq0/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u001d\u0010(\u001a\u0008\u0012\u0004\u0012\u00020$0#8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\u0015\u0010\'\u00a8\u0006+"
    }
    d2 = {
        "Lqq0/d;",
        "Lhj0/o;",
        "Lcq0/h;",
        "widgetRepository",
        "Lcq0/g;",
        "teamsRepository",
        "Ltr2/n;",
        "logger",
        "Lod1/u;",
        "userContext",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lcq0/h;Lcq0/g;Ltr2/n;Lod1/u;Lbc3/c0;)V",
        "Ll83/a0;",
        "C",
        "()V",
        "",
        "communityId",
        "D",
        "(I)V",
        "E",
        "Lcq0/h;",
        "F",
        "Lcq0/g;",
        "G",
        "Ltr2/n;",
        "H",
        "Lod1/u;",
        "",
        "I",
        "Ljava/lang/String;",
        "o",
        "()Ljava/lang/String;",
        "logTag",
        "Landroidx/lifecycle/p0;",
        "Lqq0/e;",
        "J",
        "Landroidx/lifecycle/p0;",
        "()Landroidx/lifecycle/p0;",
        "selectTeamViewStateLiveData",
        "K",
        "a",
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


# static fields
.field public static final K:Lqq0/d$a;

.field public static final L:I


# instance fields
.field private final E:Lcq0/h;

.field private final F:Lcq0/g;

.field private final G:Ltr2/n;

.field private final H:Lod1/u;

.field private final I:Ljava/lang/String;

.field private final J:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqq0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqq0/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lqq0/d;->K:Lqq0/d$a;

    const/16 v0, 0x8

    sput v0, Lqq0/d;->L:I

    return-void
.end method

.method public constructor <init>(Lcq0/h;Lcq0/g;Ltr2/n;Lod1/u;Lbc3/c0;)V
    .locals 1

    const-string v0, "widgetRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teamsRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p5}, Lhj0/o;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lqq0/d;->E:Lcq0/h;

    .line 3
    iput-object p2, p0, Lqq0/d;->F:Lcq0/g;

    .line 4
    iput-object p3, p0, Lqq0/d;->G:Ltr2/n;

    .line 5
    iput-object p4, p0, Lqq0/d;->H:Lod1/u;

    .line 6
    const-string p1, "SelectTeamViewModel"

    iput-object p1, p0, Lqq0/d;->I:Ljava/lang/String;

    .line 7
    new-instance p1, Landroidx/lifecycle/u0;

    .line 8
    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    .line 9
    iput-object p1, p0, Lqq0/d;->J:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Lcq0/h;Lcq0/g;Ltr2/n;Lod1/u;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 10
    new-instance p5, Lor2/m;

    const/4 p6, 0x1

    const/4 p7, 0x0

    invoke-direct {p5, p7, p6, p7}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 11
    invoke-direct/range {v0 .. v5}, Lqq0/d;-><init>(Lcq0/h;Lcq0/g;Ltr2/n;Lod1/u;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic A(Lqq0/d;)Lcq0/h;
    .locals 0

    iget-object p0, p0, Lqq0/d;->E:Lcq0/h;

    return-object p0
.end method

.method public static final synthetic B(Lqq0/d;Landroidx/lifecycle/p0;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lhj0/o;->v(Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic w(Lqq0/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lqq0/d;->G:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic y(Lqq0/d;)Lcq0/g;
    .locals 0

    iget-object p0, p0, Lqq0/d;->F:Lcq0/g;

    return-object p0
.end method

.method public static final synthetic z(Lqq0/d;)Lod1/u;
    .locals 0

    iget-object p0, p0, Lqq0/d;->H:Lod1/u;

    return-object p0
.end method


# virtual methods
.method public final C()V
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lqq0/d$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lqq0/d$b;-><init>(Lqq0/d;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final D(I)V
    .locals 3

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lqq0/d$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lqq0/d$c;-><init>(Lqq0/d;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final E()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lqq0/d;->J:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqq0/d;->I:Ljava/lang/String;

    return-object v0
.end method
