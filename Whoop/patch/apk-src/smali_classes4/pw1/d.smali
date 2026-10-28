.class public final Lpw1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lpw1/a;",
        "Lpw1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ%\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J%\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00112\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpw1/d;",
        "Lod1/g;",
        "Lpw1/a;",
        "Lpw1/b;",
        "Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;",
        "familyPlanApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Ltr2/n;)V",
        "previousResult",
        "action",
        "l",
        "(Lpw1/b;Lpw1/a;)Lpw1/b;",
        "",
        "userId",
        "familyPlanId",
        "Lec3/l;",
        "Lpw1/e;",
        "j",
        "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;",
        "i",
        "k",
        "()Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;",
        "b",
        "Ltr2/n;",
        "membership_release"
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
.field private final a:Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Ltr2/n;)V
    .locals 1

    const-string v0, "familyPlanApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lpw1/d;->a:Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    .line 3
    iput-object p2, p0, Lpw1/d;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "FamilyPlanInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lpw1/d;-><init>(Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lpw1/d;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lpw1/d;->i(Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lpw1/d;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lpw1/d;->j(Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lpw1/d;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lpw1/d;->k()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lpw1/d;)Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;
    .locals 0

    iget-object p0, p0, Lpw1/d;->a:Lcom/whoop/membership/familyPlan/domain/api/FamilyPlanApi;

    return-object p0
.end method

.method public static final synthetic g(Lpw1/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lpw1/d;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic h(Lpw1/d;Lpw1/b;Lpw1/a;)Lpw1/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lpw1/d;->l(Lpw1/b;Lpw1/a;)Lpw1/b;

    move-result-object p0

    return-object p0
.end method

.method private final i(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lpw1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, p1, v1}, Lpw1/d$a;-><init>(Lpw1/d;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final j(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lpw1/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lpw1/d$b;-><init>(Lpw1/d;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final k()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lpw1/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lpw1/d$c;-><init>(Lpw1/d;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final l(Lpw1/b;Lpw1/a;)Lpw1/b;
    .locals 1

    sget-object v0, Lpw1/a$a;->a:Lpw1/a$a;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p2, v0}, Lpw1/b;->b(Lpw1/b;Lpw1/c;Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;ILjava/lang/Object;)Lpw1/b;

    move-result-object p1

    :cond_0
    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpw1/d$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lpw1/d$d;-><init>(Lq83/d;Lpw1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lpw1/b;

    sget-object v2, Lpw1/c$c;->a:Lpw1/c$c;

    const/4 v3, 0x2

    invoke-direct {v0, v2, v1, v3, v1}, Lpw1/b;-><init>(Lpw1/c;Lcom/whoop/membership/familyPlan/domain/model/FamilyPlanScreenResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lpw1/d$i;

    invoke-direct {v2, p0, v1}, Lpw1/d$i;-><init>(Lpw1/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
