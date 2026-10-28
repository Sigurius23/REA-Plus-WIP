.class public final Llj0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llj0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Llj0/c;",
        "Lnh2/a;",
        "Liy1/c;",
        "metricWriter",
        "Lbc3/c0;",
        "coroutineScope",
        "Lci2/b;",
        "whoopStrapProvider",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Liy1/c;Lbc3/c0;Lci2/b;Ltr2/n;)V",
        "Loh2/b$c;",
        "reason",
        "Ll83/a0;",
        "a",
        "(Loh2/b$c;)V",
        "Liy1/c;",
        "b",
        "Lbc3/c0;",
        "c",
        "Lci2/b;",
        "d",
        "Ltr2/n;",
        "",
        "()Ljava/lang/String;",
        "deviceCodeName",
        "e",
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


# static fields
.field private static final e:Llj0/c$a;


# instance fields
.field private final a:Liy1/c;

.field private final b:Lbc3/c0;

.field private final c:Lci2/b;

.field private final d:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llj0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llj0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llj0/c;->e:Llj0/c$a;

    return-void
.end method

.method public constructor <init>(Liy1/c;Lbc3/c0;Lci2/b;Ltr2/n;)V
    .locals 1

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llj0/c;->a:Liy1/c;

    iput-object p2, p0, Llj0/c;->b:Lbc3/c0;

    iput-object p3, p0, Llj0/c;->c:Lci2/b;

    iput-object p4, p0, Llj0/c;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic b(Llj0/c;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Llj0/c;->d()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Llj0/c;)Liy1/c;
    .locals 0

    iget-object p0, p0, Llj0/c;->a:Liy1/c;

    return-object p0
.end method

.method private final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llj0/c;->c:Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "unknown"

    return-object v0
.end method


# virtual methods
.method public a(Loh2/b$c;)V
    .locals 5

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llj0/c;->d:Ltr2/n;

    invoke-virtual {p1}, Loh2/b$c;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Llj0/c;->d()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Device firmware version could not be read: reason="

    const-string v4, ", whoop_device="

    invoke-static {v3, v1, v4, v2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Llj0/c;->b:Lbc3/c0;

    new-instance v1, Llj0/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llj0/c$b;-><init>(Llj0/c;Loh2/b$c;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
