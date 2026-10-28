.class final Lcp0/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/n1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J<\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u00072\"\u0010\u000e\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcp0/a1;",
        "Lh0/n1;",
        "Lh0/p;",
        "Lcp0/l;",
        "state",
        "<init>",
        "(Lh0/p;)V",
        "Lf0/z0;",
        "dragPriority",
        "Lkotlin/Function2;",
        "Lh0/g1;",
        "Lq83/d;",
        "Ll83/a0;",
        "",
        "block",
        "a",
        "(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "Lh0/p;",
        "coach-everywhere_release"
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
.field private final a:Lh0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh0/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lh0/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/p;",
            ")V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcp0/a1;->a:Lh0/p;

    return-void
.end method

.method public static final synthetic b(Lcp0/a1;)Lh0/p;
    .locals 0

    iget-object p0, p0, Lcp0/a1;->a:Lh0/p;

    return-object p0
.end method


# virtual methods
.method public a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf0/z0;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcp0/a1;->a:Lh0/p;

    new-instance v1, Lcp0/a1$a;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, v2}, Lcp0/a1$a;-><init>(Lc93/m;Lcp0/a1;Lq83/d;)V

    iget-object p2, v0, Lh0/p;->b:Lf0/c1;

    new-instance v3, La33/c;

    invoke-direct {v3, v0, v1, v2}, La33/c;-><init>(Lh0/p;Lkotlin/jvm/functions/Function3;Lq83/d;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroidx/lifecycle/g1;

    invoke-direct {v0, p1, p2, v3, v2}, Landroidx/lifecycle/g1;-><init>(Lf0/z0;Lf0/c1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v0, p3}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    sget-object p3, Ll83/a0;->a:Ll83/a0;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p3

    :goto_0
    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object p3
.end method
