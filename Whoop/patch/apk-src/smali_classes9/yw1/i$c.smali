.class final Lyw1/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyw1/i;->o(Luw1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
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
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lg1/y3;

.field final synthetic w:Lm91/u;

.field final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic y:Luw1/c$c;

.field final synthetic z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lm91/u;Lkotlin/jvm/functions/Function1;Luw1/c$c;Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Luw1/c$c;",
            "Lbc3/c0;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lg1/y3;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lyw1/i$c;->w:Lm91/u;

    iput-object p2, p0, Lyw1/i$c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lyw1/i$c;->y:Luw1/c$c;

    iput-object p4, p0, Lyw1/i$c;->z:Lbc3/c0;

    iput-object p5, p0, Lyw1/i$c;->E:Lp1/c1;

    iput-object p6, p0, Lyw1/i$c;->F:Lp1/c1;

    iput-object p7, p0, Lyw1/i$c;->G:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 9

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lc41/q4$a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lyw1/i$c;->w:Lm91/u;

    instance-of v1, v0, Lc41/p4;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lc41/p4;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lc41/p4;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lc41/r4;

    invoke-virtual {v3}, Lc41/r4;->getId()Ljava/lang/String;

    move-result-object v3

    move-object v4, p1

    check-cast v4, Lc41/q4$a;

    invoke-virtual {v4}, Lc41/q4$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v2, v1

    :cond_2
    check-cast v2, Lc41/r4;

    :cond_3
    move-object v8, v2

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lc41/r4;->m()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {v8}, Lc41/r4;->f()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v3, p0, Lyw1/i$c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lyw1/i$c;->z:Lbc3/c0;

    iget-object v5, p0, Lyw1/i$c;->E:Lp1/c1;

    iget-object v6, p0, Lyw1/i$c;->F:Lp1/c1;

    iget-object v7, p0, Lyw1/i$c;->G:Lg1/y3;

    invoke-static/range {v3 .. v8}, Lyw1/i;->P(Lkotlin/jvm/functions/Function1;Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;Lc41/r4;)V

    :cond_4
    return-void

    :cond_5
    iget-object v0, p0, Lyw1/i$c;->x:Lkotlin/jvm/functions/Function1;

    new-instance v1, Lww1/h;

    iget-object v2, p0, Lyw1/i$c;->w:Lm91/u;

    iget-object v3, p0, Lyw1/i$c;->y:Luw1/c$c;

    invoke-direct {v1, p1, v2, v3}, Lww1/h;-><init>(Ljava/lang/Object;Lm91/u;Luw1/c$c;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lyw1/i$c;->a(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
