.class public final Lcom/whoop/cdm/WhoopCompanionDeviceService;
.super Landroid/companion/CompanionDeviceService;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0017\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0012\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/cdm/WhoopCompanionDeviceService;",
        "Landroid/companion/CompanionDeviceService;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "e",
        "j",
        "onCreate",
        "",
        "address",
        "onDeviceAppeared",
        "(Ljava/lang/String;)V",
        "onDeviceDisappeared",
        "Landroid/companion/AssociationInfo;",
        "associationInfo",
        "(Landroid/companion/AssociationInfo;)V",
        "Lst0/a;",
        "w",
        "Ll83/h;",
        "f",
        "()Lst0/a;",
        "bleReconnectTickler",
        "Lbc3/c0;",
        "x",
        "g",
        "()Lbc3/c0;",
        "coroutineScope",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "_bleReconnectFlow",
        "Ltr2/n;",
        "z",
        "h",
        "()Ltr2/n;",
        "logger",
        "connectivity_release"
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
.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroid/companion/CompanionDeviceService;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/cdm/WhoopCompanionDeviceService$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/cdm/WhoopCompanionDeviceService$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService;->w:Ll83/h;

    new-instance v1, Lcom/whoop/cdm/WhoopCompanionDeviceService$d;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/cdm/WhoopCompanionDeviceService$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService;->x:Ll83/h;

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v3, 0x1

    invoke-static {v3, v0, v2, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService;->y:Lec3/o1;

    new-instance v0, Lep0/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService;->z:Ll83/h;

    return-void
.end method

.method public static synthetic a()Ltr2/n;
    .locals 1

    invoke-static {}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->i()Ltr2/n;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b(Lcom/whoop/cdm/WhoopCompanionDeviceService;)Ltr2/n;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->h()Ltr2/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/cdm/WhoopCompanionDeviceService;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/cdm/WhoopCompanionDeviceService;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->j()V

    return-void
.end method

.method private final e()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->g()Lbc3/c0;

    move-result-object v0

    new-instance v1, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/cdm/WhoopCompanionDeviceService$a;-><init>(Lcom/whoop/cdm/WhoopCompanionDeviceService;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final f()Lst0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lst0/a;

    return-object v0
.end method

.method private final g()Lbc3/c0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/c0;

    return-object v0
.end method

.method private final h()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltr2/n;

    return-object v0
.end method

.method private static final i()Ltr2/n;
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "WhoopCompanionDeviceService"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    return-object v0
.end method

.method private final j()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->h()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "CDS"

    const-string v3, "Triggering a connection request to the strap"

    invoke-interface {v0, v2, v3, v1}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->f()Lst0/a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2}, Lst0/a;->a(J)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/cdm/WhoopCompanionDeviceService;->y:Lec3/o1;

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 v1, 0x5

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v1, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Ltt0/b;->c(Lec3/l;J)Lec3/l;

    move-result-object v0

    new-instance v1, Lcom/whoop/cdm/WhoopCompanionDeviceService$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/cdm/WhoopCompanionDeviceService$b;-><init>(Lcom/whoop/cdm/WhoopCompanionDeviceService;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->g()Lbc3/c0;

    move-result-object v0

    invoke-static {v2, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method public onDeviceAppeared(Landroid/companion/AssociationInfo;)V
    .locals 4

    const-string v0, "associationInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-super {p0, p1}, Landroid/companion/CompanionDeviceService;->onDeviceAppeared(Landroid/companion/AssociationInfo;)V

    .line 4
    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->h()Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Landroid/companion/AssociationInfo;->getDisplayName()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1}, Landroid/companion/AssociationInfo;->getDeviceMacAddress()Landroid/net/MacAddress;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Device appeared: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "CDS"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    .line 5
    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->e()V

    return-void
.end method

.method public onDeviceAppeared(Ljava/lang/String;)V
    .locals 3

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->h()Ltr2/n;

    move-result-object v0

    const-string v1, "Device appeared: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "CDS Legacy"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    .line 2
    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->e()V

    return-void
.end method

.method public onDeviceDisappeared(Landroid/companion/AssociationInfo;)V
    .locals 4

    const-string v0, "associationInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1}, Landroid/companion/CompanionDeviceService;->onDeviceDisappeared(Landroid/companion/AssociationInfo;)V

    .line 3
    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->h()Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Landroid/companion/AssociationInfo;->getDisplayName()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1}, Landroid/companion/AssociationInfo;->getDeviceMacAddress()Landroid/net/MacAddress;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Device disappeared: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "CDS"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public onDeviceDisappeared(Ljava/lang/String;)V
    .locals 3

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/whoop/cdm/WhoopCompanionDeviceService;->h()Ltr2/n;

    move-result-object v0

    const-string v1, "Device disappeared: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "CDS Legacy"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
