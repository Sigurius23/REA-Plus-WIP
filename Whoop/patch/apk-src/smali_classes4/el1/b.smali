.class public final Lel1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\n\u0010\u0010R\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u000e\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lel1/b;",
        "",
        "Ltr2/n;",
        "logger",
        "Lbc3/c0;",
        "coroutineScope",
        "Lci2/b;",
        "whoopStrapProvider",
        "<init>",
        "(Ltr2/n;Lbc3/c0;Lci2/b;)V",
        "a",
        "Ltr2/n;",
        "Lec3/l;",
        "Lel1/a;",
        "b",
        "Lec3/l;",
        "()Lec3/l;",
        "historySyncStatus",
        "Lec3/t1;",
        "c",
        "Lec3/t1;",
        "()Lec3/t1;",
        "historySyncStatusFlow",
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
.field private final a:Ltr2/n;

.field private final b:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final c:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltr2/n;Lbc3/c0;Lci2/b;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lel1/b;->a:Ltr2/n;

    invoke-interface {p3}, Lci2/b;->c()Lec3/f2;

    move-result-object p1

    new-instance p3, Lch/i;

    const/4 v0, 0x2

    invoke-direct {p3, p1, v0}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Lel1/b$b;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lel1/b$b;-><init>(Lq83/d;)V

    invoke-static {p3, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance p3, Lel1/b$c;

    invoke-direct {p3, p1, v0}, Lel1/b$c;-><init>(Lec3/l;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, p3}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance p3, Lel1/b$a;

    invoke-direct {p3, v0}, Lel1/b$a;-><init>(Lq83/d;)V

    new-instance v0, Lec3/a0;

    invoke-direct {v0, p3, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    invoke-static {v0}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lel1/b;->b:Lec3/l;

    sget-object p3, Lec3/z1;->a:Lec3/b2;

    const/4 v0, 0x1

    invoke-static {p1, p2, p3, v0}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lel1/b;->c:Lec3/t1;

    return-void
.end method


# virtual methods
.method public final a()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lel1/b;->b:Lec3/l;

    return-object v0
.end method

.method public final b()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lel1/b;->c:Lec3/t1;

    return-object v0
.end method
