.class public final Lvu0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb12/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvu0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u001cB)\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lvu0/b;",
        "Lb12/b;",
        "Ltr2/n;",
        "logger",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lvu0/a;",
        "lowBatteryNotificationBuilder",
        "Lvu0/f;",
        "streakResolver",
        "<init>",
        "(Ltr2/n;Lci2/b;Lvu0/a;Lvu0/f;)V",
        "",
        "previousBatteryLevel",
        "currentBatteryLevel",
        "",
        "f",
        "(BB)J",
        "Lst0/v;",
        "e",
        "(Lq83/d;)Ljava/lang/Object;",
        "elapsedTime",
        "",
        "b",
        "(BBJ)Z",
        "",
        "level",
        "Lb12/d;",
        "a",
        "(ILq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "Lci2/b;",
        "c",
        "Lvu0/a;",
        "d",
        "Lvu0/f;",
        "g",
        "()Lst0/v;",
        "currentStrapGen",
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
.field public static final e:Lvu0/b$a;

.field public static final f:I

.field private static final g:Lvu0/c;


# instance fields
.field private final a:Ltr2/n;

.field private final b:Lci2/b;

.field private final c:Lvu0/a;

.field private final d:Lvu0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvu0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvu0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvu0/b;->e:Lvu0/b$a;

    const/16 v0, 0x8

    sput v0, Lvu0/b;->f:I

    sget-object v0, Lvu0/c;->d:Lvu0/c$a;

    invoke-virtual {v0}, Lvu0/c$a;->a()Lvu0/c;

    move-result-object v0

    sput-object v0, Lvu0/b;->g:Lvu0/c;

    return-void
.end method

.method public constructor <init>(Ltr2/n;Lci2/b;Lvu0/a;Lvu0/f;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lowBatteryNotificationBuilder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streakResolver"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvu0/b;->a:Ltr2/n;

    .line 3
    iput-object p2, p0, Lvu0/b;->b:Lci2/b;

    .line 4
    iput-object p3, p0, Lvu0/b;->c:Lvu0/a;

    .line 5
    iput-object p4, p0, Lvu0/b;->d:Lvu0/f;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;Lci2/b;Lvu0/a;Lvu0/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x1

    if-eqz p5, :cond_0

    .line 6
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "LowBatteryMonitor"

    invoke-virtual {p1, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lvu0/b;-><init>(Ltr2/n;Lci2/b;Lvu0/a;Lvu0/f;)V

    return-void
.end method

.method public static final synthetic c(Lvu0/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lvu0/b;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lvu0/b;)Lci2/b;
    .locals 0

    iget-object p0, p0, Lvu0/b;->b:Lci2/b;

    return-object p0
.end method

.method private final e(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lst0/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lvu0/b$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lvu0/b$b;

    iget v1, v0, Lvu0/b$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvu0/b$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvu0/b$b;

    invoke-direct {v0, p0, p1}, Lvu0/b$b;-><init>(Lvu0/b;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lvu0/b$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvu0/b$b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lvu0/b$c;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lvu0/b$c;-><init>(Lvu0/b;Lq83/d;)V

    iput v3, v0, Lvu0/b$b;->y:I

    const-wide/16 v2, 0x3e8

    invoke-static {v2, v3, p1, v0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    move-object v0, p1

    check-cast v0, Lst0/v;

    if-nez v0, :cond_4

    iget-object v0, p0, Lvu0/b;->a:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Timed out after 1000ms waiting for strap \u2014 building content with null strapGen"

    invoke-interface {v0, v2, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    return-object p1
.end method

.method private final f(BB)J
    .locals 1

    sget-object v0, Lvu0/b;->g:Lvu0/c;

    invoke-virtual {v0, p2}, Lvu0/c;->a(B)Lb12/c;

    move-result-object p2

    invoke-virtual {v0, p1}, Lvu0/c;->a(B)Lb12/c;

    move-result-object p1

    if-ne p2, p1, :cond_0

    const-wide/32 p1, 0xa4cb80

    return-wide p1

    :cond_0
    const-wide/32 p1, 0x36ee80

    return-wide p1
.end method

.method private final g()Lst0/v;
    .locals 1

    iget-object v0, p0, Lvu0/b;->b:Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljk0/d;->w0()Lst0/v;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(ILq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lb12/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lvu0/b$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvu0/b$d;

    iget v1, v0, Lvu0/b$d;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvu0/b$d;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvu0/b$d;

    invoke-direct {v0, p0, p2}, Lvu0/b$d;-><init>(Lvu0/b;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lvu0/b$d;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvu0/b$d;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvu0/b$d;->z:Ljava/lang/Object;

    check-cast p1, Lb12/d;

    iget-object p1, v0, Lvu0/b$d;->y:Ljava/lang/Object;

    check-cast p1, Lst0/v;

    iget-object p1, v0, Lvu0/b$d;->x:Ljava/lang/Object;

    check-cast p1, Lb12/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lvu0/b$d;->w:I

    iget-object v2, v0, Lvu0/b$d;->x:Ljava/lang/Object;

    check-cast v2, Lb12/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lvu0/b;->g:Lvu0/c;

    int-to-byte v2, p1

    invoke-virtual {p2, v2}, Lvu0/c;->a(B)Lb12/c;

    move-result-object v2

    invoke-direct {p0}, Lvu0/b;->g()Lst0/v;

    move-result-object p2

    if-nez p2, :cond_5

    iput-object v2, v0, Lvu0/b$d;->x:Ljava/lang/Object;

    iput p1, v0, Lvu0/b$d;->w:I

    iput v4, v0, Lvu0/b$d;->G:I

    invoke-direct {p0, v0}, Lvu0/b;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lst0/v;

    :cond_5
    new-instance v4, Lb12/d;

    iget-object v5, p0, Lvu0/b;->c:Lvu0/a;

    invoke-virtual {v5, v2}, Lvu0/a;->c(Lb12/c;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lvu0/b;->c:Lvu0/a;

    invoke-virtual {v6, p1, p2}, Lvu0/a;->b(ILst0/v;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lvu0/b;->c:Lvu0/a;

    invoke-virtual {v7, p1, p2}, Lvu0/a;->a(ILst0/v;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7}, Lb12/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, Lvu0/b;->d:Lvu0/f;

    const/4 v6, 0x0

    iput-object v6, v0, Lvu0/b$d;->x:Ljava/lang/Object;

    iput-object v6, v0, Lvu0/b$d;->y:Ljava/lang/Object;

    iput-object v6, v0, Lvu0/b$d;->z:Ljava/lang/Object;

    iput p1, v0, Lvu0/b$d;->w:I

    iput v3, v0, Lvu0/b$d;->G:I

    invoke-virtual {v5, v2, p2, v4, v0}, Lvu0/f;->c(Lb12/c;Lst0/v;Lb12/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    return-object p1
.end method

.method public b(BBJ)Z
    .locals 5

    iget-object v0, p0, Lvu0/b;->a:Ltr2/n;

    const-string v1, ", current="

    const-string v2, ", elapsed="

    const-string v3, "canShowNotification called: previous="

    invoke-static {p1, p2, v3, v1, v2}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Lvu0/b;->g:Lvu0/c;

    invoke-virtual {v0}, Lvu0/c;->b()I

    move-result v1

    if-le p2, v1, :cond_0

    iget-object p1, p0, Lvu0/b;->a:Ltr2/n;

    invoke-virtual {v0}, Lvu0/c;->b()I

    move-result p3

    const-string p4, " is above high threshold "

    const-string v0, ", no notification needed."

    const-string v1, "Battery level "

    invoke-static {p2, p3, v1, p4, v0}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array p3, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return v2

    :cond_0
    invoke-direct {p0, p1, p2}, Lvu0/b;->f(BB)J

    move-result-wide p1

    cmp-long p3, p3, p1

    const/16 p4, 0x3c

    const/16 v0, 0x3e8

    iget-object v1, p0, Lvu0/b;->a:Ltr2/n;

    int-to-long v3, v0

    div-long/2addr p1, v3

    int-to-long v3, p4

    div-long/2addr p1, v3

    div-long/2addr p1, v3

    if-ltz p3, :cond_1

    const-string p4, "been longer than threshold: "

    const-string v0, " hours"

    invoke-static {p1, p2, p4, v0}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v2, [Lqr2/a$a;

    invoke-interface {v1, p1, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_1
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " hour threshold not met"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v2, [Lqr2/a$a;

    invoke-interface {v1, p1, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_0
    if-ltz p3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v2
.end method
