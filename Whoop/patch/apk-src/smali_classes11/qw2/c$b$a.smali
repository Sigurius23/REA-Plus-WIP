.class final Lqw2/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqw2/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Lqw2/c;

.field final synthetic y:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

.field final synthetic z:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lqw2/c;Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lqw2/c;",
            "Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lqw2/c$b$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lqw2/c$b$a;->x:Lqw2/c;

    iput-object p3, p0, Lqw2/c$b$a;->y:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    iput-object p4, p0, Lqw2/c$b$a;->z:Lec3/m;

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

    iget-object v0, p0, Lqw2/c$b$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v0, p0, Lqw2/c$b$a;->x:Lqw2/c;

    iget-object v1, p0, Lqw2/c$b$a;->y:Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;

    invoke-static {v0, p1, v1}, Lqw2/c;->f(Lqw2/c;Lqw2/b;Lcom/whoop/whoopaction/domain/models/ActionSequenceStep;)Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqw2/c$b$a;->z:Lec3/m;

    invoke-interface {v0, p1, p2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqw2/b;

    invoke-virtual {p0, p1, p2}, Lqw2/c$b$a;->b(Lqw2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
