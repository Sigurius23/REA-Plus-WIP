.class public final Le52/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le52/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 #2\u00020\u0001:\u0001\u001bB-\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0017\u0010\u0011J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0080@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Le52/a;",
        "",
        "La6/g;",
        "Lf6/f;",
        "dataStorePreferences",
        "Ly42/j;",
        "puffinManager",
        "Ljava/time/Clock;",
        "clock",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(La6/g;Ly42/j;Ljava/time/Clock;Ltr2/n;)V",
        "Lbc3/c0;",
        "scope",
        "Ll83/a0;",
        "h",
        "(Lbc3/c0;)V",
        "",
        "macAddress",
        "serialNumber",
        "j",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "i",
        "Lc52/e;",
        "g",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "La6/g;",
        "b",
        "Ly42/j;",
        "c",
        "Ljava/time/Clock;",
        "d",
        "Ltr2/n;",
        "e",
        "puffin_release"
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
.field public static final e:Le52/a$a;

.field private static final f:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field

.field private static final g:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field

.field private static final h:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# instance fields
.field private final a:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final b:Ly42/j;

.field private final c:Ljava/time/Clock;

.field private final d:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le52/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le52/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Le52/a;->e:Le52/a$a;

    const-string v0, "lastConnectedPuffinMacAddress"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Le52/a;->f:Lf6/d;

    const-string v0, "lastConnectedPuffinSerialNumber"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Le52/a;->g:Lf6/d;

    const-string v0, "lastConnectedPuffinTimestamp"

    invoke-static {v0}, Lge3/g;->I(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Le52/a;->h:Lf6/d;

    return-void
.end method

.method public constructor <init>(La6/g;Ly42/j;Ljava/time/Clock;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Ly42/j;",
            "Ljava/time/Clock;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStorePreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "puffinManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le52/a;->a:La6/g;

    iput-object p2, p0, Le52/a;->b:Ly42/j;

    iput-object p3, p0, Le52/a;->c:Ljava/time/Clock;

    iput-object p4, p0, Le52/a;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Le52/a;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Le52/a;->c:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic b()Lf6/d;
    .locals 1

    sget-object v0, Le52/a;->h:Lf6/d;

    return-object v0
.end method

.method public static final synthetic c()Lf6/d;
    .locals 1

    sget-object v0, Le52/a;->f:Lf6/d;

    return-object v0
.end method

.method public static final synthetic d()Lf6/d;
    .locals 1

    sget-object v0, Le52/a;->g:Lf6/d;

    return-object v0
.end method

.method public static final synthetic e(Le52/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Le52/a;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Le52/a;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Le52/a;->j(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h(Lbc3/c0;)V
    .locals 5

    iget-object v0, p0, Le52/a;->b:Ly42/j;

    invoke-virtual {v0}, Ly42/j;->e()Lec3/t1;

    move-result-object v0

    new-instance v1, Le52/a$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Le52/a$c;-><init>(Le52/a;Lq83/d;)V

    new-instance v3, Lec3/j1;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    new-instance v0, Le52/a$d;

    invoke-direct {v0, p0, v2}, Le52/a$d;-><init>(Le52/a;Lq83/d;)V

    new-instance v1, Lec3/a0;

    invoke-direct {v1, v3, v0}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    invoke-static {v1, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method private final j(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Le52/a$e;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Le52/a$e;

    iget v1, v0, Le52/a$e;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le52/a$e;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Le52/a$e;

    invoke-direct {v0, p0, p3}, Le52/a$e;-><init>(Le52/a;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Le52/a$e;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le52/a$e;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Le52/a$e;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    iget-object p1, v0, Le52/a$e;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Le52/a;->a:La6/g;

    new-instance v2, Le52/a$f;

    const/4 v4, 0x0

    invoke-direct {v2, p1, p2, p0, v4}, Le52/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Le52/a;Lq83/d;)V

    iput-object p1, v0, Le52/a$e;->w:Ljava/lang/Object;

    iput-object p2, v0, Le52/a$e;->x:Ljava/lang/Object;

    iput v3, v0, Le52/a$e;->E:I

    invoke-static {p3, v2, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p3, p0, Le52/a;->d:Ltr2/n;

    const-string v0, "Updated last connected Puffin to mac address: "

    const-string v1, " and serial number: "

    invoke-static {v0, p1, v1, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p3, p1, p2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final g(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lc52/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Le52/a$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le52/a$b;

    iget v1, v0, Le52/a$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le52/a$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Le52/a$b;

    invoke-direct {v0, p0, p1}, Le52/a$b;-><init>(Le52/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Le52/a$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le52/a$b;->y:I

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

    iget-object p1, p0, Le52/a;->a:La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v3, v0, Le52/a$b;->y:I

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lf6/f;

    sget-object v0, Le52/a;->f:Lf6/d;

    invoke-virtual {p1, v0}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Le52/a;->g:Lf6/d;

    invoke-virtual {p1, v1}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v2, Le52/a;->h:Lf6/d;

    invoke-virtual {p1, v2}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    new-instance v2, Lc52/e;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-direct {v2, v0, v1, v3, v4}, Lc52/e;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    return-object v2

    :cond_7
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final i(Lbc3/c0;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Le52/a;->h(Lbc3/c0;)V

    return-void
.end method
