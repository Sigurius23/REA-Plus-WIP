.class final Ltt0/b$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltt0/b$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.field final synthetic x:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic y:Lbc3/c0;

.field final synthetic z:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lec3/m;Lbc3/c0;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lec3/m;",
            "Lbc3/c0;",
            "J)V"
        }
    .end annotation

    iput-object p1, p0, Ltt0/b$b$a$a;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Ltt0/b$b$a$a;->x:Lec3/m;

    iput-object p3, p0, Ltt0/b$b$a$a;->y:Lbc3/c0;

    iput-wide p4, p0, Ltt0/b$b$a$a;->z:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ltt0/b$b$a$a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ltt0/b$b$a$a$b;

    iget v1, v0, Ltt0/b$b$a$a$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltt0/b$b$a$a$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ltt0/b$b$a$a$b;

    invoke-direct {v0, p0, p2}, Ltt0/b$b$a$a$b;-><init>(Ltt0/b$b$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ltt0/b$b$a$a$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ltt0/b$b$a$a$b;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ltt0/b$b$a$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lbc3/k1;

    invoke-interface {p2}, Lbc3/k1;->isActive()Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p0, Ltt0/b$b$a$a;->x:Lec3/m;

    iput-object v3, v0, Ltt0/b$b$a$a$b;->w:Ljava/lang/Object;

    iput v4, v0, Ltt0/b$b$a$a$b;->z:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p1, p0, Ltt0/b$b$a$a;->w:Lkotlin/jvm/internal/g0;

    iget-object p2, p0, Ltt0/b$b$a$a;->y:Lbc3/c0;

    new-instance v0, Ltt0/b$b$a$a$a;

    iget-wide v1, p0, Ltt0/b$b$a$a;->z:J

    invoke-direct {v0, v1, v2, v3}, Ltt0/b$b$a$a$a;-><init>(JLq83/d;)V

    const/4 v1, 0x3

    invoke-static {p2, v3, v3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p2

    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
