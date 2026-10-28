.class public final Lo92/z;
.super Lm92/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo92/z$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lo92/z;",
        "Lm92/b;",
        "Lo92/s;",
        "pushContext",
        "Lwm0/a;",
        "scopeCoordinator",
        "Liy1/c;",
        "metricWriter",
        "<init>",
        "(Lo92/s;Lwm0/a;Liy1/c;)V",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lwm0/a;",
        "J",
        "Liy1/c;",
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
.field public static final L:Lo92/z$a;

.field public static final M:I


# instance fields
.field private final I:Lwm0/a;

.field private final J:Liy1/c;

.field private final K:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo92/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo92/z$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo92/z;->L:Lo92/z$a;

    const/16 v0, 0x8

    sput v0, Lo92/z;->M:I

    return-void
.end method

.method public constructor <init>(Lo92/s;Lwm0/a;Liy1/c;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/b;-><init>(Lo92/s;)V

    iput-object p2, p0, Lo92/z;->I:Lwm0/a;

    iput-object p3, p0, Lo92/z;->J:Liy1/c;

    const-string p1, "RefreshPendingFollowerInvitesSilentPush"

    iput-object p1, p0, Lo92/z;->K:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lo92/z;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lo92/z;->I:Lwm0/a;

    return-object p0
.end method

.method public static final synthetic z(Lo92/z;)Liy1/c;
    .locals 0

    iget-object p0, p0, Lo92/z;->J:Liy1/c;

    return-object p0
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 2

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "context"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm92/b;->l()Ltr2/n;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "RefreshPendingFollowerInvites push received"

    invoke-interface {p1, v0, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object p1

    new-instance p2, Lo92/z$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lo92/z$b;-><init>(Lo92/z;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v0, v0, p2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo92/z;->K:Ljava/lang/String;

    return-object v0
.end method
