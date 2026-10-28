.class public final Lqy2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J!\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lqy2/b;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Lor2/u0;",
        "localizedDateTimeFormatter",
        "<init>",
        "(Lzr2/a;Lor2/u0;)V",
        "Lec3/l;",
        "Loy2/b;",
        "domainStateFlow",
        "Lty2/a;",
        "c",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lzr2/a;",
        "()Lzr2/a;",
        "b",
        "Lor2/u0;",
        "()Lor2/u0;",
        "whooplabs_release"
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
.field private final a:Lzr2/a;

.field private final b:Lor2/u0;


# direct methods
.method public constructor <init>(Lzr2/a;Lor2/u0;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localizedDateTimeFormatter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqy2/b;->a:Lzr2/a;

    iput-object p2, p0, Lqy2/b;->b:Lor2/u0;

    return-void
.end method


# virtual methods
.method public final a()Lzr2/a;
    .locals 1

    iget-object v0, p0, Lqy2/b;->a:Lzr2/a;

    return-object v0
.end method

.method public final b()Lor2/u0;
    .locals 1

    iget-object v0, p0, Lqy2/b;->b:Lor2/u0;

    return-object v0
.end method

.method public final c(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "domainStateFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lty2/a$g;->a:Lty2/a$g;

    new-instance v1, Lqy2/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lqy2/b$a;-><init>(Lqy2/b;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    invoke-static {v2}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
