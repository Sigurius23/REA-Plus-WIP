.class final Lao1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb1/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000cR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lao1/a;",
        "Ljb1/d;",
        "Lad3/c;",
        "json",
        "Lkotlin/Function0;",
        "Lmo1/d;",
        "trackedBehaviorReducer",
        "<init>",
        "(Lad3/c;Lc93/a;)V",
        "Llb1/y0;",
        "a",
        "()Llb1/y0;",
        "Lad3/c;",
        "b",
        "Lc93/a;",
        "hormonal-insights_release"
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
.field private final a:Lad3/c;

.field private final b:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lad3/c;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lad3/c;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackedBehaviorReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lao1/a;->a:Lad3/c;

    iput-object p2, p0, Lao1/a;->b:Lc93/a;

    return-void
.end method


# virtual methods
.method public a()Llb1/y0;
    .locals 2

    iget-object v0, p0, Lao1/a;->a:Lad3/c;

    iget-object v1, p0, Lao1/a;->b:Lc93/a;

    invoke-static {v0, v1}, Lbq1/c;->e(Lad3/c;Lc93/a;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v0}, Ljb1/a;->f()Llb1/y0;

    move-result-object v0

    return-object v0
.end method
