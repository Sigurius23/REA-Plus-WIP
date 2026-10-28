.class public final Lo92/x;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo92/x$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lo92/x;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "Lwm0/a;",
        "scopeCoordinator",
        "<init>",
        "(Lo92/s;Lcom/whoop/data/repositories/FeatureFlagRepository;Lwm0/a;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "J",
        "Lwm0/a;",
        "",
        "K",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
        "L",
        "app_prodStandardRelease"
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
.field public static final L:Lo92/x$a;

.field public static final M:I


# instance fields
.field private final I:Lcom/whoop/data/repositories/FeatureFlagRepository;

.field private final J:Lwm0/a;

.field private final K:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo92/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo92/x$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo92/x;->L:Lo92/x$a;

    const/16 v0, 0x8

    sput v0, Lo92/x;->M:I

    return-void
.end method

.method public constructor <init>(Lo92/s;Lcom/whoop/data/repositories/FeatureFlagRepository;Lwm0/a;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lo92/x;->I:Lcom/whoop/data/repositories/FeatureFlagRepository;

    iput-object p3, p0, Lo92/x;->J:Lwm0/a;

    const-string p1, "RefreshFeatureFlagsSilentPushNotification"

    iput-object p1, p0, Lo92/x;->K:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lo92/x;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lo92/x;->J:Lwm0/a;

    return-object p0
.end method

.method public static final synthetic z(Lo92/x;)Lcom/whoop/data/repositories/FeatureFlagRepository;
    .locals 0

    iget-object p0, p0, Lo92/x;->I:Lcom/whoop/data/repositories/FeatureFlagRepository;

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 2

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "context"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object p1

    new-instance p2, Lo92/x$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lo92/x$b;-><init>(Lo92/x;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v0, v0, p2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/x;->K:Ljava/lang/String;

    return-object v0
.end method
