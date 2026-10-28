.class public final synthetic Ll1/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Ll1/n3;

.field public final synthetic G:Ll1/y;

.field public final synthetic w:Li93/j;

.field public final synthetic x:Lm1/o;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Li93/j;Lm1/o;IILkotlin/jvm/functions/Function1;Ll1/n3;Ll1/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/c1;->w:Li93/j;

    iput-object p2, p0, Ll1/c1;->x:Lm1/o;

    iput p3, p0, Ll1/c1;->y:I

    iput p4, p0, Ll1/c1;->z:I

    iput-object p5, p0, Ll1/c1;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ll1/c1;->F:Ll1/n3;

    iput-object p7, p0, Ll1/c1;->G:Ll1/y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Lo0/s;

    const-string v0, "<this>"

    iget-object v2, p0, Ll1/c1;->w:Li93/j;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, v2, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, v2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    move-object v3, v0

    check-cast v3, Li93/i;

    iget-boolean v3, v3, Li93/i;->y:Z

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Lm83/e0;

    invoke-virtual {v3}, Lm83/e0;->next()Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    if-ltz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->c0()V

    const/4 p1, 0x0

    throw p1

    :cond_2
    move v0, v1

    :goto_1
    new-instance v1, Ll1/d1;

    iget-object v3, p0, Ll1/c1;->x:Lm1/o;

    iget v4, p0, Ll1/c1;->y:I

    iget v5, p0, Ll1/c1;->z:I

    iget-object v6, p0, Ll1/c1;->E:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Ll1/c1;->F:Ll1/n3;

    iget-object v8, p0, Ll1/c1;->G:Ll1/y;

    invoke-direct/range {v1 .. v8}, Ll1/d1;-><init>(Li93/j;Lm1/o;IILkotlin/jvm/functions/Function1;Ll1/n3;Ll1/y;)V

    new-instance v2, Lx1/b;

    const/4 v3, 0x1

    const v4, 0x2835c752

    invoke-direct {v2, v1, v3, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sget-object v1, Lo0/r;->w:Lo0/r;

    check-cast p1, Lo0/g;

    invoke-virtual {p1, v0, v1, v2}, Lo0/g;->q(ILkotlin/jvm/functions/Function1;Lx1/b;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
