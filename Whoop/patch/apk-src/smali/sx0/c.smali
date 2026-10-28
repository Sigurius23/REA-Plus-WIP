.class public final Lsx0/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsx0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u001f\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lsx0/c;",
        "Landroidx/lifecycle/w1;",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(La6/g;Lbc3/c0;)V",
        "Lsx0/b;",
        "viewEvent",
        "Ll83/a0;",
        "n",
        "(Lsx0/b;)V",
        "w",
        "La6/g;",
        "x",
        "Lbc3/c0;",
        "Lec3/p1;",
        "",
        "y",
        "Lec3/p1;",
        "searchQuery",
        "Lec3/f2;",
        "Lsx0/f;",
        "z",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "E",
        "a",
        "debug-tools_release"
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
.field public static final E:Lsx0/c$a;

.field public static final F:I

.field private static final G:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final w:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final x:Lbc3/c0;

.field private final y:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final z:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 23

    new-instance v0, Lsx0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsx0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsx0/c;->E:Lsx0/c$a;

    const/16 v0, 0x8

    sput v0, Lsx0/c;->F:I

    const-string v21, "weightlifting-service"

    const-string v22, "integrations-bff"

    const-string v1, "activities-service"

    const-string v2, "advanced-labs-service"

    const-string v3, "ai-conversation-service"

    const-string v4, "ai-conversation-bff"

    const-string v5, "coaching-service"

    const-string v6, "core-details-bff"

    const-string v7, "entitlement-service"

    const-string v8, "growth-content-service"

    const-string v9, "home-service"

    const-string v10, "impact-service"

    const-string v11, "mobile-metric-service"

    const-string v12, "onboarding-service"

    const-string v13, "profile-service"

    const-string v14, "progression-service"

    const-string v15, "sanguine-service"

    const-string v16, "smart-alarm-service"

    const-string v17, "strap-location-service"

    const-string v18, "streaks-service"

    const-string v19, "user-preferences-service"

    const-string v20, "users-service"

    filled-new-array/range {v1 .. v22}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lsx0/c;->G:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(La6/g;Lbc3/c0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p2}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, Lsx0/c;->w:La6/g;

    .line 3
    iput-object p2, p0, Lsx0/c;->x:Lbc3/c0;

    .line 4
    const-string v0, ""

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lsx0/c;->y:Lec3/p1;

    .line 5
    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    new-instance v1, Lsx0/c$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lsx0/c$c;-><init>(Lq83/d;)V

    .line 6
    new-instance v2, Lec3/l1;

    const/4 v3, 0x1

    invoke-direct {v2, p1, v0, v1, v3}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    .line 7
    sget-object p1, Lsx0/c;->G:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    .line 8
    new-instance v5, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    new-instance v1, Lsx0/d;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Lsx0/d;-><init>(Ljava/lang/String;Z)V

    .line 12
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_0
    new-instance v3, Lsx0/f;

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x5

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lsx0/f;-><init>(Ljava/lang/String;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    invoke-static {v2, p2, p1, v3}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lsx0/c;->z:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(La6/g;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 15
    new-instance p2, Lor2/m;

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-direct {p2, p4, p3, p4}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    :cond_0
    invoke-direct {p0, p1, p2}, Lsx0/c;-><init>(La6/g;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g()Ljava/util/List;
    .locals 1

    sget-object v0, Lsx0/c;->G:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic j(Lsx0/c;)La6/g;
    .locals 0

    iget-object p0, p0, Lsx0/c;->w:La6/g;

    return-object p0
.end method

.method public static final synthetic l(Lsx0/c;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lsx0/c;->y:Lec3/p1;

    return-object p0
.end method


# virtual methods
.method public final getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lsx0/c;->z:Lec3/f2;

    return-object v0
.end method

.method public final n(Lsx0/b;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsx0/c;->x:Lbc3/c0;

    new-instance v1, Lsx0/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lsx0/c$b;-><init>(Lsx0/b;Lsx0/c;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
