.class public final Luu0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Let0/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luu0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR \u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\t\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Luu0/b;",
        "Let0/a;",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lci2/b;Lbc3/c0;)V",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "logger",
        "Lec3/f2;",
        "",
        "b",
        "Lec3/f2;",
        "()Lec3/f2;",
        "isDetected",
        "c",
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
.field public static final c:Luu0/b$a;

.field public static final d:I

.field private static final e:J

.field private static final f:J


# instance fields
.field private final a:Ltr2/n;

.field private final b:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Luu0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Luu0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Luu0/b;->c:Luu0/b$a;

    const/16 v0, 0x8

    sput v0, Luu0/b;->d:I

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0xa

    sget-object v1, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    const/4 v3, 0x5

    invoke-static {v3, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lkotlin/time/Duration;->plus-LRDsOJo(JJ)J

    move-result-wide v0

    sput-wide v0, Luu0/b;->e:J

    invoke-static {v3, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    sput-wide v0, Luu0/b;->f:J

    return-void
.end method

.method public constructor <init>(Lci2/b;Lbc3/c0;)V
    .locals 4

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "DorsetDetectionMonitor"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Luu0/b;->a:Ltr2/n;

    invoke-interface {p1}, Lci2/b;->b()Lec3/t1;

    move-result-object p1

    new-instance v0, Lch/i;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lch/i;-><init>(Lec3/l;I)V

    invoke-static {v0}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Luu0/b$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Luu0/b$f;-><init>(Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Luu0/b$e;

    invoke-direct {v0, p1}, Luu0/b$e;-><init>(Lec3/l;)V

    new-instance p1, Luu0/b$d;

    invoke-direct {p1, v0}, Luu0/b$d;-><init>(Lec3/l;)V

    new-instance v0, Luu0/b$b;

    invoke-direct {v0, v1}, Luu0/b$b;-><init>(Lq83/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Luu0/b$c;

    invoke-direct {v0, p0, v1}, Luu0/b$c;-><init>(Luu0/b;Lq83/d;)V

    new-instance v1, Lec3/j1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    sget-wide v2, Luu0/b;->f:J

    invoke-static {v2, v3}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v2

    const/4 p1, 0x2

    invoke-static {p1, v2, v3}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, p2, p1, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Luu0/b;->b:Lec3/f2;

    return-void
.end method

.method public static final synthetic b(Luu0/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Luu0/b;->a:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic c()J
    .locals 2

    sget-wide v0, Luu0/b;->e:J

    return-wide v0
.end method


# virtual methods
.method public a()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Luu0/b;->b:Lec3/f2;

    return-object v0
.end method
