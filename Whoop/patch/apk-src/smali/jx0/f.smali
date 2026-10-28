.class public final Ljx0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J&\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Ljx0/f;",
        "",
        "Ljx0/b;",
        "dataSyncWorkDao",
        "<init>",
        "(Ljx0/b;)V",
        "",
        "source",
        "",
        "threshold",
        "",
        "Ljx0/a;",
        "b",
        "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;",
        "id",
        "c",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "dataSyncWork",
        "Ll83/a0;",
        "d",
        "(Ljx0/a;Lq83/d;)Ljava/lang/Object;",
        "a",
        "e",
        "Ljx0/b;",
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


# instance fields
.field private final a:Ljx0/b;


# direct methods
.method public constructor <init>(Ljx0/b;)V
    .locals 1

    const-string v0, "dataSyncWorkDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljx0/f;->a:Ljx0/b;

    return-void
.end method


# virtual methods
.method public final a(Ljx0/a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljx0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ljx0/f;->a:Ljx0/b;

    invoke-interface {v0, p1, p2}, Ljx0/b;->d(Ljx0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljx0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ljx0/f;->a:Ljx0/b;

    invoke-interface {v0, p1, p2, p3, p4}, Ljx0/b;->b(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljx0/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ljx0/f;->a:Ljx0/b;

    invoke-interface {v0, p1, p2}, Ljx0/b;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljx0/a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljx0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ljx0/f;->a:Ljx0/b;

    invoke-interface {v0, p1, p2}, Ljx0/b;->e(Ljx0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final e(Ljx0/a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljx0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Ljx0/f;->a:Ljx0/b;

    invoke-interface {v0, p1, p2}, Ljx0/b;->a(Ljx0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
