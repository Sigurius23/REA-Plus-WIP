.class public final Lgx0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgx0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lgx0/a;",
        "",
        "Lu92/d;",
        "sharedPrefs",
        "Ljava/time/Clock;",
        "clock",
        "Lbc3/z;",
        "dispatcher",
        "<init>",
        "(Lu92/d;Ljava/time/Clock;Lbc3/z;)V",
        "",
        "value",
        "Ll83/a0;",
        "c",
        "(JLq83/d;)Ljava/lang/Object;",
        "b",
        "()J",
        "a",
        "Lu92/d;",
        "Ljava/time/Clock;",
        "Lbc3/z;",
        "d",
        "data-sync-service_release"
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
.field public static final d:Lgx0/a$a;


# instance fields
.field private final a:Lu92/d;

.field private final b:Ljava/time/Clock;

.field private final c:Lbc3/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgx0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgx0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgx0/a;->d:Lgx0/a$a;

    return-void
.end method

.method public constructor <init>(Lu92/d;Ljava/time/Clock;Lbc3/z;)V
    .locals 1

    const-string v0, "sharedPrefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lgx0/a;->a:Lu92/d;

    .line 3
    iput-object p2, p0, Lgx0/a;->b:Ljava/time/Clock;

    .line 4
    iput-object p3, p0, Lgx0/a;->c:Lbc3/z;

    return-void
.end method

.method public constructor <init>(Lu92/d;Ljava/time/Clock;Lbc3/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Lbc3/q0;->a:Lkc3/e;

    .line 6
    sget-object p3, Lkc3/d;->w:Lkc3/d;

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lgx0/a;-><init>(Lu92/d;Ljava/time/Clock;Lbc3/z;)V

    return-void
.end method

.method public static final synthetic a(Lgx0/a;)Lu92/d;
    .locals 0

    iget-object p0, p0, Lgx0/a;->a:Lu92/d;

    return-object p0
.end method


# virtual methods
.method public final b()J
    .locals 4

    iget-object v0, p0, Lgx0/a;->a:Lu92/d;

    iget-object v1, p0, Lgx0/a;->b:Ljava/time/Clock;

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v1

    const-string v3, "highWaterMarkMillis"

    invoke-virtual {v0, v3, v1, v2}, Lu92/d;->i(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(JLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lgx0/a;->c:Lbc3/z;

    new-instance v1, Lgx0/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lgx0/a$b;-><init>(Lgx0/a;JLq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
