.class public final synthetic Ll0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:[Ly2/j1;

.field public final synthetic F:Ll0/q0;

.field public final synthetic G:I

.field public final synthetic H:Ly3/m;

.field public final synthetic I:I

.field public final synthetic J:[I

.field public final synthetic w:[I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>([IIII[Ly2/j1;Ll0/q0;ILy3/m;I[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/p0;->w:[I

    iput p2, p0, Ll0/p0;->x:I

    iput p3, p0, Ll0/p0;->y:I

    iput p4, p0, Ll0/p0;->z:I

    iput-object p5, p0, Ll0/p0;->E:[Ly2/j1;

    iput-object p6, p0, Ll0/p0;->F:Ll0/q0;

    iput p7, p0, Ll0/p0;->G:I

    iput-object p8, p0, Ll0/p0;->H:Ly3/m;

    iput p9, p0, Ll0/p0;->I:I

    iput-object p10, p0, Ll0/p0;->J:[I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Ly2/i1;

    iget-object v0, p0, Ll0/p0;->w:[I

    if-eqz v0, :cond_0

    iget v1, p0, Ll0/p0;->x:I

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Ll0/p0;->y:I

    move v2, v1

    :goto_1
    iget v3, p0, Ll0/p0;->z:I

    if-ge v2, v3, :cond_4

    iget-object v3, p0, Ll0/p0;->E:[Ly2/j1;

    aget-object v3, v3, v2

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ly2/j1;->p()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ll0/o1;

    if-eqz v5, :cond_1

    check-cast v4, Ll0/o1;

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_2

    iget-object v4, v4, Ll0/o1;->c:Ll0/f;

    if-nez v4, :cond_3

    :cond_2
    iget-object v4, p0, Ll0/p0;->F:Ll0/q0;

    iget-object v4, v4, Ll0/q0;->d:Ll0/d0;

    :cond_3
    invoke-virtual {v3}, Ly2/j1;->g0()I

    move-result v5

    iget v6, p0, Ll0/p0;->G:I

    sub-int/2addr v6, v5

    iget-object v5, p0, Ll0/p0;->H:Ly3/m;

    iget v7, p0, Ll0/p0;->I:I

    invoke-virtual {v4, v6, v5, v3, v7}, Ll0/f;->d(ILy3/m;Ly2/j1;I)I

    move-result v4

    add-int/2addr v4, v0

    sub-int v5, v2, v1

    iget-object v6, p0, Ll0/p0;->J:[I

    aget v5, v6, v5

    invoke-static {v3, v5, v4, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
