.class public final Lwu0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwu0/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lwu0/c;",
        "Lwu0/b;",
        "Lwu0/e;",
        "offBodyNotifier",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lwu0/e;Lci2/b;Lbc3/c0;)V",
        "",
        "withDelay",
        "Lec3/l;",
        "Ljk0/a;",
        "c",
        "(Z)Lec3/l;",
        "b",
        "a",
        "Lwu0/e;",
        "Lci2/b;",
        "Lbc3/c0;",
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


# instance fields
.field private final a:Lwu0/e;

.field private final b:Lci2/b;

.field private final c:Lbc3/c0;


# direct methods
.method public constructor <init>(Lwu0/e;Lci2/b;Lbc3/c0;)V
    .locals 1

    const-string v0, "offBodyNotifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwu0/c;->a:Lwu0/e;

    iput-object p2, p0, Lwu0/c;->b:Lci2/b;

    iput-object p3, p0, Lwu0/c;->c:Lbc3/c0;

    return-void
.end method

.method private final c(Z)Lec3/l;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lwu0/c;->b:Lci2/b;

    invoke-interface {v0}, Lci2/b;->c()Lec3/f2;

    move-result-object v0

    new-instance v1, Lch/i;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    new-instance v0, Lwu0/c$a;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lwu0/c$a;-><init>(Lq83/d;)V

    invoke-static {v1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    iget-object v1, p0, Lwu0/c;->a:Lwu0/e;

    invoke-interface {v1, p1}, Lwu0/e;->a(Z)Lec3/l;

    move-result-object p1

    new-instance v1, Lwu0/c$c;

    invoke-direct {v1, v2}, Lwu0/c$c;-><init>(Lq83/d;)V

    new-instance v3, Lec3/l1;

    const/4 v4, 0x1

    invoke-direct {v3, v0, p1, v1, v4}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    sget-object p1, Ljk0/a;->UNKNOWN:Ljk0/a;

    new-instance v0, Lwu0/c$d;

    invoke-direct {v0, v2}, Lwu0/c$d;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, p1, v3, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lwu0/c$b;

    invoke-direct {p1, v1, v2}, Lwu0/c$b;-><init>(Lec3/l;Lq83/d;)V

    new-instance v0, Lec3/s1;

    invoke-direct {v0, p1}, Lec3/s1;-><init>(Lc93/m;)V

    iget-object p1, p0, Lwu0/c;->c:Lbc3/c0;

    sget-object v1, Lec3/z1;->a:Lec3/b2;

    const/4 v2, 0x1

    invoke-static {v0, p1, v1, v2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b(Z)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lec3/l;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lwu0/c;->c(Z)Lec3/l;

    move-result-object p1

    return-object p1
.end method
