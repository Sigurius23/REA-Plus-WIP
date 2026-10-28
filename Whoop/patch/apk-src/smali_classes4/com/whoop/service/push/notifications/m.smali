.class public final Lcom/whoop/service/push/notifications/m;
.super Lm92/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/push/notifications/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0007\u0018\u0000 *2\u00020\u0001:\u0001\u0016B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008$\u0010 R\u0014\u0010\'\u001a\u00020\u001e8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008&\u0010 R\u0014\u0010)\u001a\u00020\u001e8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008(\u0010 \u00a8\u0006+"
    }
    d2 = {
        "Lcom/whoop/service/push/notifications/m;",
        "Lm92/a;",
        "Lo92/s;",
        "pushContext",
        "Lcq0/g;",
        "teamsRepository",
        "Lod1/u;",
        "userContext",
        "Lyp0/a;",
        "communityAccessChecker",
        "<init>",
        "(Lo92/s;Lcq0/g;Lod1/u;Lyp0/a;)V",
        "",
        "teamId",
        "Lcom/whoop/domain/model/teams/Team;",
        "H",
        "(ILq83/d;)Ljava/lang/Object;",
        "Lm92/f;",
        "dataMap",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Lm92/f;Landroid/content/Context;)V",
        "I",
        "Lcq0/g;",
        "J",
        "Lod1/u;",
        "K",
        "Lyp0/a;",
        "",
        "L",
        "Ljava/lang/String;",
        "n",
        "()Ljava/lang/String;",
        "logTag",
        "M",
        "communityIdKey",
        "N",
        "communityTitleKey",
        "O",
        "communityBodyKey",
        "P",
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
.field public static final P:Lcom/whoop/service/push/notifications/m$a;

.field public static final Q:I

.field private static final R:Lc12/d;


# instance fields
.field private final I:Lcq0/g;

.field private final J:Lod1/u;

.field private final K:Lyp0/a;

.field private final L:Ljava/lang/String;

.field private final M:Ljava/lang/String;

.field private final N:Ljava/lang/String;

.field private final O:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/service/push/notifications/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/push/notifications/m;->P:Lcom/whoop/service/push/notifications/m$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/service/push/notifications/m;->Q:I

    sget-object v0, Lm92/b;->G:Lm92/b$a;

    const-string v1, "06550_Communities"

    sget v2, Lhi0/j;->x0:I

    invoke-virtual {v0, v1, v2}, Lm92/b$a;->a(Ljava/lang/String;I)Lc12/d;

    move-result-object v0

    sget v1, Lhi0/j;->w0:I

    invoke-virtual {v0, v1}, Lc12/d;->f(I)Lc12/d;

    move-result-object v0

    const-string v1, "setChannelDescriptionResId(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/service/push/notifications/m;->R:Lc12/d;

    return-void
.end method

.method public constructor <init>(Lo92/s;Lcq0/g;Lod1/u;Lyp0/a;)V
    .locals 1

    const-string v0, "pushContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "teamsRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communityAccessChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lm92/a;-><init>(Lo92/s;)V

    iput-object p2, p0, Lcom/whoop/service/push/notifications/m;->I:Lcq0/g;

    iput-object p3, p0, Lcom/whoop/service/push/notifications/m;->J:Lod1/u;

    iput-object p4, p0, Lcom/whoop/service/push/notifications/m;->K:Lyp0/a;

    const-string p1, "TeamOwnershipPushNotification"

    iput-object p1, p0, Lcom/whoop/service/push/notifications/m;->L:Ljava/lang/String;

    const-string p1, "community_id"

    iput-object p1, p0, Lcom/whoop/service/push/notifications/m;->M:Ljava/lang/String;

    const-string p1, "title"

    iput-object p1, p0, Lcom/whoop/service/push/notifications/m;->N:Ljava/lang/String;

    const-string p1, "body"

    iput-object p1, p0, Lcom/whoop/service/push/notifications/m;->O:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic A(Lcom/whoop/service/push/notifications/m;Landroid/content/Context;)Leb/j0;
    .locals 0

    invoke-virtual {p0, p1}, Lm92/b;->c(Landroid/content/Context;)Leb/j0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(Lcom/whoop/service/push/notifications/m;Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lm92/b;->d(Landroid/content/Context;Ljava/lang/Integer;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(Lcom/whoop/service/push/notifications/m;)Lyp0/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/service/push/notifications/m;->K:Lyp0/a;

    return-object p0
.end method

.method public static final synthetic D(Lcom/whoop/service/push/notifications/m;)Lcom/whoop/data/repositories/NotificationRepository;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->p()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E()Lc12/d;
    .locals 1

    sget-object v0, Lcom/whoop/service/push/notifications/m;->R:Lc12/d;

    return-object v0
.end method

.method public static final synthetic F(Lcom/whoop/service/push/notifications/m;)Lbc3/c0;
    .locals 0

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic G(Lcom/whoop/service/push/notifications/m;ILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/service/push/notifications/m;->H(ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final H(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/teams/Team;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m;->J:Lod1/u;

    invoke-virtual {v0}, Lod1/u;->f()Lcom/whoop/domain/model/User;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m;->I:Lcq0/g;

    sget-object v2, Lcom/whoop/domain/model/teams/TeamType;->COMMUNITY:Lcom/whoop/domain/model/teams/TeamType;

    invoke-virtual {v1, p1, v0, v2, p2}, Lcq0/g;->w(IILcom/whoop/domain/model/teams/TeamType;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    check-cast p1, Lcom/whoop/domain/model/teams/Team;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public a(Lm92/f;Landroid/content/Context;)V
    .locals 14

    const-string v0, "dataMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm92/c;->g(Lm92/f;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "CommunityOwnershipTransfer"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const/4 v12, 0x3

    const/4 v13, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m;->M:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lm92/b;->j(Lm92/f;Ljava/lang/String;)I

    move-result v2

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m;->N:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/service/push/notifications/m;->O:Ljava/lang/String;

    invoke-virtual {p0, p1, v1}, Lm92/b;->r(Lm92/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver;->w:Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v3

    invoke-static/range {v5 .. v11}, Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;->b(Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;Landroid/content/Context;Ljava/lang/String;IIILjava/lang/Object;)Landroid/app/PendingIntent;

    move-result-object v8

    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v10

    move-object v6, v0

    new-instance v0, Lcom/whoop/service/push/notifications/m$b;

    const/4 v9, 0x0

    const/16 v5, 0x5a

    move-object v4, p1

    move-object/from16 v3, p2

    move-object v7, v1

    move-object v1, p0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/service/push/notifications/m$b;-><init>(Lcom/whoop/service/push/notifications/m;ILandroid/content/Context;Lm92/f;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Lq83/d;)V

    invoke-static {v10, v13, v13, v0, v12}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_0
    invoke-virtual {p0}, Lm92/b;->q()Lbc3/c0;

    move-result-object v0

    new-instance v2, Lcom/whoop/service/push/notifications/m$c;

    invoke-direct {v2, p1, p0, v13}, Lcom/whoop/service/push/notifications/m$c;-><init>(Lm92/f;Lcom/whoop/service/push/notifications/m;Lq83/d;)V

    invoke-static {v0, v13, v13, v2, v12}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Lcom/whoop/service/push/InvalidPushDataException;

    const-string v2, "Unrecognized notification type sent to TeamOwnershipPushNotification"

    invoke-direct {v0, p1, v2}, Lcom/whoop/service/push/InvalidPushDataException;-><init>(Lm92/f;Ljava/lang/String;)V

    throw v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/push/notifications/m;->L:Ljava/lang/String;

    return-object v0
.end method
