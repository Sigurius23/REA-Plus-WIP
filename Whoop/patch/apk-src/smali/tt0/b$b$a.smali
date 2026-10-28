.class final Ltt0/b$b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltt0/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.connectivityCore.util.ConnUtilKt$throttleFirst$2$1$1"
    f = "ConnUtil.kt"
    l = {
        0x1a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic F:J

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field final synthetic z:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lec3/l;Lkotlin/jvm/internal/g0;Lec3/m;JLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lkotlin/jvm/internal/g0;",
            "Lec3/m;",
            "J",
            "Lq83/d<",
            "-",
            "Ltt0/b$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltt0/b$b$a;->y:Lec3/l;

    iput-object p2, p0, Ltt0/b$b$a;->z:Lkotlin/jvm/internal/g0;

    iput-object p3, p0, Ltt0/b$b$a;->E:Lec3/m;

    iput-wide p4, p0, Ltt0/b$b$a;->F:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltt0/b$b$a;

    iget-object v1, p0, Ltt0/b$b$a;->y:Lec3/l;

    iget-object v2, p0, Ltt0/b$b$a;->z:Lkotlin/jvm/internal/g0;

    iget-object v3, p0, Ltt0/b$b$a;->E:Lec3/m;

    iget-wide v4, p0, Ltt0/b$b$a;->F:J

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ltt0/b$b$a;-><init>(Lec3/l;Lkotlin/jvm/internal/g0;Lec3/m;JLq83/d;)V

    iput-object p1, v0, Ltt0/b$b$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ltt0/b$b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ltt0/b$b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ltt0/b$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ltt0/b$b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Ltt0/b$b$a;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ltt0/b$b$a;->w:I

    const/4 v7, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v7, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ltt0/b$b$a;->y:Lec3/l;

    new-instance v1, Ltt0/b$b$a$a;

    iget-object v2, p0, Ltt0/b$b$a;->z:Lkotlin/jvm/internal/g0;

    iget-object v3, p0, Ltt0/b$b$a;->E:Lec3/m;

    iget-wide v5, p0, Ltt0/b$b$a;->F:J

    invoke-direct/range {v1 .. v6}, Ltt0/b$b$a$a;-><init>(Lkotlin/jvm/internal/g0;Lec3/m;Lbc3/c0;J)V

    const/4 v2, 0x0

    iput-object v2, p0, Ltt0/b$b$a;->x:Ljava/lang/Object;

    iput v7, p0, Ltt0/b$b$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
