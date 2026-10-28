.class final Lfs0/b$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs0/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field final synthetic x:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/m;Lkotlin/jvm/internal/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lkotlin/jvm/internal/g0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lfs0/b$c$a;->w:Lc93/m;

    iput-object p2, p0, Lfs0/b$c$a;->x:Lkotlin/jvm/internal/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lqw2/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqw2/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lqw2/b$c;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_1

    instance-of v0, p1, Lqw2/b$i;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lfs0/b$c$a;->x:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object v1

    :cond_1
    :goto_0
    iget-object p1, p0, Lfs0/b$c$a;->w:Lc93/m;

    sget-object v0, Lds0/a$b;->a:Lds0/a$b;

    invoke-interface {p1, v0, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqw2/b;

    invoke-virtual {p0, p1, p2}, Lfs0/b$c$a;->b(Lqw2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
