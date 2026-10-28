.class public final Lql1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u000fB5\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001bR\u001d\u0010%\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lql1/a;",
        "",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "Ljava/time/Clock;",
        "clock",
        "Lql1/c;",
        "dismissHelper",
        "Ltd1/b;",
        "whoopStrapProxy",
        "Lql1/b;",
        "analyticsHelper",
        "<init>",
        "(La6/g;Ljava/time/Clock;Lql1/c;Ltd1/b;Lql1/b;)V",
        "a",
        "La6/g;",
        "b",
        "Ljava/time/Clock;",
        "c",
        "Lql1/c;",
        "d",
        "Ltd1/b;",
        "e",
        "Lql1/b;",
        "",
        "f",
        "Ljava/lang/String;",
        "lastViewAnalyticsDate",
        "g",
        "lastDismissAnalyticsDate",
        "Lec3/l;",
        "Lql1/d;",
        "h",
        "Lec3/l;",
        "i",
        "()Lec3/l;",
        "showLowBatteryStateFlow",
        "connectivity-common-ui_release"
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
.field public static final i:Lql1/a$a;

.field public static final j:I

.field private static final k:Lf6/d;
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

.field private final b:Ljava/time/Clock;

.field private final c:Lql1/c;

.field private final d:Ltd1/b;

.field private final e:Lql1/b;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private final h:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lql1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lql1/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lql1/a;->i:Lql1/a$a;

    const/16 v0, 0x8

    sput v0, Lql1/a;->j:I

    const-string v0, "lowBatteryDismissId"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lql1/a;->k:Lf6/d;

    return-void
.end method

.method public constructor <init>(La6/g;Ljava/time/Clock;Lql1/c;Ltd1/b;Lql1/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Ljava/time/Clock;",
            "Lql1/c;",
            "Ltd1/b;",
            "Lql1/b;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProxy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lql1/a;->a:La6/g;

    iput-object p2, p0, Lql1/a;->b:Ljava/time/Clock;

    iput-object p3, p0, Lql1/a;->c:Lql1/c;

    iput-object p4, p0, Lql1/a;->d:Ltd1/b;

    iput-object p5, p0, Lql1/a;->e:Lql1/b;

    invoke-virtual {p3}, Lql1/c;->b()Lec3/f2;

    move-result-object p1

    invoke-interface {p4}, Ltd1/b;->n()Lkk0/b;

    move-result-object p2

    invoke-virtual {p2}, Lkk0/b;->e()Lec3/l;

    move-result-object p2

    invoke-interface {p4}, Ltd1/b;->b()Lkk0/a;

    move-result-object p3

    invoke-virtual {p3}, Lkk0/a;->e()Lec3/l;

    move-result-object p3

    new-instance p4, Lql1/a$b;

    const/4 p5, 0x0

    invoke-direct {p4, p0, p5}, Lql1/a$b;-><init>(Lql1/a;Lq83/d;)V

    invoke-static {p1, p2, p3, p4}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object p1

    new-instance p2, Lql1/a$c;

    invoke-direct {p2, p5}, Lql1/a$c;-><init>(Lq83/d;)V

    new-instance p3, Lec3/a0;

    invoke-direct {p3, p2, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    iput-object p3, p0, Lql1/a;->h:Lec3/l;

    return-void
.end method

.method public static final synthetic a(Lql1/a;)Lql1/b;
    .locals 0

    iget-object p0, p0, Lql1/a;->e:Lql1/b;

    return-object p0
.end method

.method public static final synthetic b(Lql1/a;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Lql1/a;->b:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic c(Lql1/a;)La6/g;
    .locals 0

    iget-object p0, p0, Lql1/a;->a:La6/g;

    return-object p0
.end method

.method public static final synthetic d(Lql1/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lql1/a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic e(Lql1/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lql1/a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic f()Lf6/d;
    .locals 1

    sget-object v0, Lql1/a;->k:Lf6/d;

    return-object v0
.end method

.method public static final synthetic g(Lql1/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lql1/a;->g:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic h(Lql1/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lql1/a;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final i()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lql1/a;->h:Lec3/l;

    return-object v0
.end method
