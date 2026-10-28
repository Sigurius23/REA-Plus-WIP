.class public final Ldz2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ldz2/a;",
        "Ldz2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Ldz2/c;",
        "Lod1/g;",
        "Ldz2/a;",
        "Ldz2/b;",
        "Lex2/a;",
        "repository",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lex2/a;Ltr2/n;)V",
        "Lec3/l;",
        "g",
        "()Lec3/l;",
        "Lcom/whoop/whooplabs/data/domain/DwlLanding;",
        "landing",
        "h",
        "(Lcom/whoop/whooplabs/data/domain/DwlLanding;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lex2/a;",
        "b",
        "Ltr2/n;",
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
.field private final a:Lex2/a;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lex2/a;Ltr2/n;)V
    .locals 1

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldz2/c;->a:Lex2/a;

    iput-object p2, p0, Ldz2/c;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Ldz2/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ldz2/c;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Ldz2/c;)Lex2/a;
    .locals 0

    iget-object p0, p0, Ldz2/c;->a:Lex2/a;

    return-object p0
.end method

.method public static final synthetic e(Ldz2/c;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Ldz2/c;->g()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ldz2/c;Lcom/whoop/whooplabs/data/domain/DwlLanding;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Ldz2/c;->h(Lcom/whoop/whooplabs/data/domain/DwlLanding;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final g()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ldz2/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldz2/c$b;-><init>(Ldz2/c;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final h(Lcom/whoop/whooplabs/data/domain/DwlLanding;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/domain/DwlLanding;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ldz2/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Ldz2/c$c;-><init>(Lcom/whoop/whooplabs/data/domain/DwlLanding;Ldz2/c;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldz2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ldz2/c$a;-><init>(Lq83/d;Ldz2/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
