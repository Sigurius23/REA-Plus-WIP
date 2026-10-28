.class public final Lnu2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lnu2/e;",
        "",
        "Lci2/b;",
        "whoopStrapProvider",
        "<init>",
        "(Lci2/b;)V",
        "Lec3/l;",
        "Lfu2/a;",
        "a",
        "Lec3/l;",
        "()Lec3/l;",
        "strapActions",
        "weightlifting_release"
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
.field private final a:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lci2/b;)V
    .locals 2

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lci2/b;->c()Lec3/f2;

    move-result-object p1

    new-instance v0, Lch/i;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Lnu2/e$b;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Lnu2/e$b;-><init>(Lq83/d;)V

    invoke-static {v0, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lnu2/e$c;

    invoke-direct {v0, p1}, Lnu2/e$c;-><init>(Lec3/l;)V

    new-instance p1, Lnu2/e$a;

    invoke-direct {p1, v0}, Lnu2/e$a;-><init>(Lec3/l;)V

    new-instance v0, Lnu2/e$d;

    invoke-direct {v0, p1}, Lnu2/e$d;-><init>(Lec3/l;)V

    iput-object v0, p0, Lnu2/e;->a:Lec3/l;

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

    iget-object v0, p0, Lnu2/e;->a:Lec3/l;

    return-object v0
.end method
