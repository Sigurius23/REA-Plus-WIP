.class public final Lwe1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwe1/a;
.implements Lwe1/m;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe1/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RBg\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0082@\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u001eH\u0082@\u00a2\u0006\u0004\u0008#\u0010\"J\u0018\u0010&\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$H\u0082@\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010,\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008,\u0010+J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0016\u00a2\u0006\u0004\u00080\u00101J\u0018\u00102\u001a\u00020/2\u0006\u0010%\u001a\u00020$H\u0086@\u00a2\u0006\u0004\u00082\u0010\'J\u0010\u00103\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0004\u00083\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR \u0010N\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020K0J0I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010MR\u0016\u0010T\u001a\u0004\u0018\u00010Q8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010S\u00a8\u0006V"
    }
    d2 = {
        "Lwe1/g;",
        "Lwe1/a;",
        "Lwe1/m;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lwe1/b;",
        "entitlementDao",
        "Lwe1/j;",
        "membershipTypeDao",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lcom/whoop/data/repositories/ActiveSessionChecker;",
        "activeSessionChecker",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/entitlements/MemberEntitlementsApi;",
        "memberEntitlementsApi",
        "Ljava/time/Clock;",
        "clock",
        "Lze1/c;",
        "lifecycleScopeProvider",
        "Liy1/c;",
        "metricWriter",
        "Lrr2/c;",
        "crashReporter",
        "Lwe1/i;",
        "membershipTypeChangeListener",
        "<init>",
        "(Lwe1/b;Lwe1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/repositories/ActiveSessionChecker;Ltr2/n;Lcom/whoop/entitlements/MemberEntitlementsApi;Ljava/time/Clock;Lze1/c;Liy1/c;Lrr2/c;Lwe1/i;)V",
        "Lcom/whoop/entitlements/EntitlementsResponse;",
        "response",
        "Ll83/a0;",
        "w",
        "(Lcom/whoop/entitlements/EntitlementsResponse;Lq83/d;)Ljava/lang/Object;",
        "v",
        "(Lq83/d;)Ljava/lang/Object;",
        "r",
        "",
        "source",
        "t",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "onStart",
        "Lcom/whoop/entitlements/Entitlement;",
        "entitlement",
        "",
        "b",
        "(Lcom/whoop/entitlements/Entitlement;)Z",
        "u",
        "q",
        "Lwe1/b;",
        "x",
        "Lwe1/j;",
        "y",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "z",
        "Lcom/whoop/data/repositories/ActiveSessionChecker;",
        "E",
        "Ltr2/n;",
        "F",
        "Lcom/whoop/entitlements/MemberEntitlementsApi;",
        "G",
        "Ljava/time/Clock;",
        "H",
        "Lze1/c;",
        "I",
        "Liy1/c;",
        "J",
        "Lrr2/c;",
        "K",
        "Lwe1/i;",
        "Lec3/p1;",
        "",
        "Lwe1/e;",
        "L",
        "Lec3/p1;",
        "memoryCache",
        "M",
        "membershipTypeCache",
        "Lwe1/n;",
        "a",
        "()Lwe1/n;",
        "userCategory",
        "N",
        "entitlements_release"
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
.field public static final N:Lwe1/g$a;


# instance fields
.field private final E:Ltr2/n;

.field private final F:Lcom/whoop/entitlements/MemberEntitlementsApi;

.field private final G:Ljava/time/Clock;

.field private final H:Lze1/c;

.field private final I:Liy1/c;

.field private final J:Lrr2/c;

.field private final K:Lwe1/i;

.field private final L:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final M:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final w:Lwe1/b;

.field private final x:Lwe1/j;

.field private final y:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final z:Lcom/whoop/data/repositories/ActiveSessionChecker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwe1/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwe1/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lwe1/g;->N:Lwe1/g$a;

    return-void
.end method

.method public constructor <init>(Lwe1/b;Lwe1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/repositories/ActiveSessionChecker;Ltr2/n;Lcom/whoop/entitlements/MemberEntitlementsApi;Ljava/time/Clock;Lze1/c;Liy1/c;Lrr2/c;Lwe1/i;)V
    .locals 1

    const-string v0, "entitlementDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipTypeDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeSessionChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberEntitlementsApi"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleScopeProvider"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipTypeChangeListener"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwe1/g;->w:Lwe1/b;

    .line 3
    iput-object p2, p0, Lwe1/g;->x:Lwe1/j;

    .line 4
    iput-object p3, p0, Lwe1/g;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 5
    iput-object p4, p0, Lwe1/g;->z:Lcom/whoop/data/repositories/ActiveSessionChecker;

    .line 6
    iput-object p5, p0, Lwe1/g;->E:Ltr2/n;

    .line 7
    iput-object p6, p0, Lwe1/g;->F:Lcom/whoop/entitlements/MemberEntitlementsApi;

    .line 8
    iput-object p7, p0, Lwe1/g;->G:Ljava/time/Clock;

    .line 9
    iput-object p8, p0, Lwe1/g;->H:Lze1/c;

    .line 10
    iput-object p9, p0, Lwe1/g;->I:Liy1/c;

    .line 11
    iput-object p10, p0, Lwe1/g;->J:Lrr2/c;

    .line 12
    iput-object p11, p0, Lwe1/g;->K:Lwe1/i;

    .line 13
    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lwe1/g;->L:Lec3/p1;

    const/4 p1, 0x0

    .line 14
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lwe1/g;->M:Lec3/p1;

    return-void
.end method

.method public synthetic constructor <init>(Lwe1/b;Lwe1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/repositories/ActiveSessionChecker;Ltr2/n;Lcom/whoop/entitlements/MemberEntitlementsApi;Ljava/time/Clock;Lze1/c;Liy1/c;Lrr2/c;Lwe1/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    .line 15
    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "EntitlementsRepository"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    .line 16
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object v1

    const-string v2, "systemDefaultZone(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, v1

    goto :goto_1

    :cond_1
    move-object/from16 v9, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    .line 17
    new-instance v1, Lze1/c;

    invoke-direct {v1}, Lze1/c;-><init>()V

    move-object v10, v1

    goto :goto_2

    :cond_2
    move-object/from16 v10, p8

    :goto_2
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_3

    .line 18
    new-instance v0, Lwe1/f;

    invoke-direct {v0}, Lwe1/f;-><init>()V

    move-object v13, v0

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    goto :goto_4

    :cond_3
    move-object/from16 v13, p11

    goto :goto_3

    .line 19
    :goto_4
    invoke-direct/range {v2 .. v13}, Lwe1/g;-><init>(Lwe1/b;Lwe1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/repositories/ActiveSessionChecker;Ltr2/n;Lcom/whoop/entitlements/MemberEntitlementsApi;Ljava/time/Clock;Lze1/c;Liy1/c;Lrr2/c;Lwe1/i;)V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lwe1/g;->d()V

    return-void
.end method

.method private static final d()V
    .locals 0

    return-void
.end method

.method public static final synthetic e(Lwe1/g;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Lwe1/g;->G:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic f(Lwe1/g;)Lwe1/b;
    .locals 0

    iget-object p0, p0, Lwe1/g;->w:Lwe1/b;

    return-object p0
.end method

.method public static final synthetic g(Lwe1/g;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lwe1/g;->E:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic j(Lwe1/g;)Lcom/whoop/entitlements/MemberEntitlementsApi;
    .locals 0

    iget-object p0, p0, Lwe1/g;->F:Lcom/whoop/entitlements/MemberEntitlementsApi;

    return-object p0
.end method

.method public static final synthetic l(Lwe1/g;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lwe1/g;->L:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic n(Lwe1/g;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwe1/g;->t(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lwe1/g;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lwe1/g;->v(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lwe1/g;Lcom/whoop/entitlements/EntitlementsResponse;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwe1/g;->w(Lcom/whoop/entitlements/EntitlementsResponse;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final r(Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljy1/a;

    const/16 v6, 0x15

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v2, "failed_to_read_entitlements_on_disk"

    const/4 v3, 0x0

    sget-object v4, Lm83/y;->w:Lm83/y;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, Lwe1/g;->I:Liy1/c;

    invoke-interface {v1, v0, p1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final t(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljy1/a;

    const-string v1, "context:"

    invoke-static {v1, p1}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    const/16 v6, 0x15

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v2, "failed_to_refresh_entitlements"

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lwe1/g;->I:Liy1/c;

    invoke-interface {p1, v0, p2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final v(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lwe1/g$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwe1/g$g;

    iget v1, v0, Lwe1/g$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe1/g$g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe1/g$g;

    invoke-direct {v0, p0, p1}, Lwe1/g$g;-><init>(Lwe1/g;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lwe1/g$g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe1/g$g;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v0, v0, Lwe1/g$g;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, v0, Lwe1/g$g;->w:Ljava/lang/Object;

    check-cast v0, Landroid/database/sqlite/SQLiteException;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_3
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_5

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lwe1/g;->w:Lwe1/b;

    iput v7, v0, Lwe1/g$g;->z:I

    invoke-interface {p1, v0}, Lwe1/b;->getEntitlements(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_6

    :cond_5
    :goto_1
    check-cast p1, Ljava/util/List;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1

    iget-object v2, p0, Lwe1/g;->L:Lec3/p1;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lwe1/g;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "advanced-labs-standalone"

    invoke-interface {p1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    :try_start_3
    iget-object p1, p0, Lwe1/g;->x:Lwe1/j;

    iput-object v8, v0, Lwe1/g$g;->w:Ljava/lang/Object;

    iput v5, v0, Lwe1/g$g;->z:I

    invoke-interface {p1, v0}, Lwe1/j;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_6

    :cond_6
    :goto_2
    check-cast p1, Lwe1/l;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lwe1/l;->c()Ljava/lang/String;

    move-result-object v8
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_4

    :goto_3
    iget-object v0, p0, Lwe1/g;->E:Ltr2/n;

    const-string v1, "Failed to read membership_type into memory cache"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_7
    :goto_4
    iget-object p1, p0, Lwe1/g;->M:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v8}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lwe1/g;->K:Lwe1/i;

    invoke-interface {p1}, Lwe1/i;->a()V

    return-object v3

    :goto_5
    iget-object v2, p0, Lwe1/g;->E:Ltr2/n;

    const-string v5, "Failed to read entitlements into memory cache"

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v5, p1, v4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iput-object v8, v0, Lwe1/g$g;->w:Ljava/lang/Object;

    iput v6, v0, Lwe1/g$g;->z:I

    invoke-direct {p0, v0}, Lwe1/g;->r(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_6
    return-object v1

    :cond_8
    return-object v3
.end method

.method private final w(Lcom/whoop/entitlements/EntitlementsResponse;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/entitlements/EntitlementsResponse;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lwe1/g$h;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwe1/g$h;

    iget v1, v0, Lwe1/g$h;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe1/g$h;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe1/g$h;

    invoke-direct {v0, p0, p2}, Lwe1/g$h;-><init>(Lwe1/g;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwe1/g$h;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe1/g$h;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lwe1/g$h;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, v0, Lwe1/g$h;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/entitlements/EntitlementsResponse;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lwe1/g;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "advanced-labs-standalone"

    invoke-interface {p2, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/entitlements/EntitlementsResponse;->getContext()Lcom/whoop/entitlements/EntitlementsContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/entitlements/EntitlementsContext;->getMembershipType()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_5

    iget-object p1, p0, Lwe1/g;->E:Ltr2/n;

    const-string p2, "Entitlements response received with unexpected null membership_type"

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v5

    :cond_5
    iget-object p1, p0, Lwe1/g;->M:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    :goto_1
    return-object v5

    :cond_6
    :try_start_1
    iget-object p1, p0, Lwe1/g;->x:Lwe1/j;

    new-instance v6, Lwe1/l;

    iget-object p2, p0, Lwe1/g;->G:Ljava/time/Clock;

    invoke-virtual {p2}, Ljava/time/Clock;->millis()J

    move-result-wide v9

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v6 .. v12}, Lwe1/l;-><init>(ILjava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p2, 0x0

    iput-object p2, v0, Lwe1/g$h;->w:Ljava/lang/Object;

    iput-object v8, v0, Lwe1/g$h;->x:Ljava/lang/Object;

    iput v4, v0, Lwe1/g$h;->E:I

    invoke-interface {p1, v6, v0}, Lwe1/j;->b(Lwe1/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move-object p1, v8

    :goto_2
    iget-object p2, p0, Lwe1/g;->M:Lec3/p1;

    check-cast p2, Lec3/h2;

    invoke-virtual {p2, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object p1, p0, Lwe1/g;->K:Lwe1/i;

    invoke-interface {p1}, Lwe1/i;->a()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v5

    :goto_3
    iget-object p2, p0, Lwe1/g;->E:Ltr2/n;

    const-string v0, "Failed to persist membership_type"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p2, v0, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v5
.end method


# virtual methods
.method public a()Lwe1/n;
    .locals 1

    iget-object v0, p0, Lwe1/g;->M:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lwe1/o;->a(Ljava/lang/String;)Lwe1/n;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lcom/whoop/entitlements/Entitlement;)Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe1/g;->H:Lze1/c;

    invoke-virtual {v0, p1}, Lze1/c;->a(Landroidx/lifecycle/g0;)Lbc3/c0;

    move-result-object p1

    new-instance v0, Lwe1/g$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lwe1/g$c;-><init>(Lwe1/g;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe1/g;->L:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwe1/g;->H:Lze1/c;

    invoke-virtual {v0, p1}, Lze1/c;->a(Landroidx/lifecycle/g0;)Lbc3/c0;

    move-result-object p1

    new-instance v0, Lwe1/g$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lwe1/g$d;-><init>(Lwe1/g;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public final q(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lwe1/g$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwe1/g$b;

    iget v1, v0, Lwe1/g$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe1/g$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe1/g$b;

    invoke-direct {v0, p0, p1}, Lwe1/g$b;-><init>(Lwe1/g;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lwe1/g$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe1/g$b;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    sget-object v6, Lm83/y;->w:Lm83/y;

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_7

    :catch_0
    move-exception p1

    goto :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_9

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lwe1/g;->w:Lwe1/b;

    iput v5, v0, Lwe1/g$b;->y:I

    invoke-interface {p1, v0}, Lwe1/b;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v1, :cond_4

    goto :goto_4

    :cond_4
    :goto_1
    iget-object p1, p0, Lwe1/g;->L:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v7, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_3

    :goto_2
    :try_start_3
    iget-object v2, p0, Lwe1/g;->E:Ltr2/n;

    const-string v5, "failed to delete entitlements from dao"

    new-array v8, v3, [Lqr2/a$a;

    invoke-interface {v2, v5, p1, v8}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :goto_3
    iget-object p1, p0, Lwe1/g;->y:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "advanced-labs-standalone"

    invoke-interface {p1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    :try_start_4
    iget-object p1, p0, Lwe1/g;->x:Lwe1/j;

    iput v4, v0, Lwe1/g$b;->y:I

    invoke-interface {p1, v0}, Lwe1/j;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne p1, v1, :cond_5

    :goto_4
    return-object v1

    :cond_5
    :goto_5
    iget-object p1, p0, Lwe1/g;->M:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v7}, Lec3/h2;->j(Ljava/lang/Object;)V

    goto :goto_8

    :goto_6
    :try_start_5
    iget-object v0, p0, Lwe1/g;->E:Ltr2/n;

    const-string v1, "failed to delete membership_type from dao"

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_5

    :goto_7
    iget-object v0, p0, Lwe1/g;->M:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v7}, Lec3/h2;->j(Ljava/lang/Object;)V

    throw p1

    :cond_6
    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_9
    iget-object v0, p0, Lwe1/g;->L:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v7, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    throw p1
.end method

.method public final u(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lwe1/g$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwe1/g$e;

    iget v1, v0, Lwe1/g$e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe1/g$e;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe1/g$e;

    invoke-direct {v0, p0, p2}, Lwe1/g$e;-><init>(Lwe1/g;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwe1/g$e;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe1/g$e;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwe1/g$e;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lwe1/g$e;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lwe1/g;->z:Lcom/whoop/data/repositories/ActiveSessionChecker;

    iput-object p1, v0, Lwe1/g$e;->w:Ljava/lang/Object;

    iput v4, v0, Lwe1/g$e;->z:I

    invoke-interface {p2, v0}, Lcom/whoop/data/repositories/ActiveSessionChecker;->hasSession(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p2, p0, Lwe1/g;->E:Ltr2/n;

    const-string v0, "Skipping update ("

    const-string v1, ") \u2014 no active or pending session"

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_5
    new-instance p2, Lwe1/g$f;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Lwe1/g$f;-><init>(Lwe1/g;Ljava/lang/String;Lq83/d;)V

    iput-object v2, v0, Lwe1/g$e;->w:Ljava/lang/Object;

    iput v3, v0, Lwe1/g$e;->z:I

    invoke-static {p2, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    return-object p1
.end method
