.class public final Lug1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lug1/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000c2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lug1/k;",
        "Lug1/e;",
        "Lug1/b;",
        "defaultUpdateStrategy",
        "Lug1/c;",
        "dfuUpdateStrategy",
        "Lci2/b;",
        "whoopStrapProvider",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lug1/b;Lug1/c;Lci2/b;Ltr2/n;)V",
        "Lec3/l;",
        "Lug1/i;",
        "upstream",
        "Lgt0/h;",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lug1/b;",
        "b",
        "Lug1/c;",
        "c",
        "Lci2/b;",
        "d",
        "Ltr2/n;",
        "e",
        "()Ltr2/n;",
        "firmware-update-service_release"
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
.field private final a:Lug1/b;

.field private final b:Lug1/c;

.field private final c:Lci2/b;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lug1/b;Lug1/c;Lci2/b;Ltr2/n;)V
    .locals 1

    const-string v0, "defaultUpdateStrategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dfuUpdateStrategy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lug1/k;->a:Lug1/b;

    iput-object p2, p0, Lug1/k;->b:Lug1/c;

    iput-object p3, p0, Lug1/k;->c:Lci2/b;

    iput-object p4, p0, Lug1/k;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Lug1/k;)Lug1/c;
    .locals 0

    iget-object p0, p0, Lug1/k;->b:Lug1/c;

    return-object p0
.end method

.method public static final synthetic d(Lug1/k;)Lci2/b;
    .locals 0

    iget-object p0, p0, Lug1/k;->c:Lci2/b;

    return-object p0
.end method


# virtual methods
.method public final e()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lug1/k;->d:Ltr2/n;

    return-object v0
.end method

.method public interact(Lec3/l;)Lec3/l;
    .locals 3
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

    iget-object v0, p0, Lug1/k;->a:Lug1/b;

    invoke-virtual {v0, p1}, Lug1/b;->interact(Lec3/l;)Lec3/l;

    move-result-object v0

    new-instance v1, Lug1/k$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0, p1}, Lug1/k$a;-><init>(Lq83/d;Lug1/k;Lec3/l;)V

    invoke-static {v0, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
