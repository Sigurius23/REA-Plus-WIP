.class public final synthetic Lp00/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lc93/a;

.field public final synthetic I:Lc93/a;

.field public final synthetic J:I

.field public final synthetic w:I

.field public final synthetic x:Lp00/q;

.field public final synthetic y:Lg40/o1;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;II)V
    .locals 0

    iput p10, p0, Lp00/e;->w:I

    iput-object p1, p0, Lp00/e;->x:Lp00/q;

    iput-object p2, p0, Lp00/e;->y:Lg40/o1;

    iput-object p3, p0, Lp00/e;->z:Lc93/a;

    iput-object p4, p0, Lp00/e;->E:Lc93/a;

    iput-object p5, p0, Lp00/e;->F:Lc93/a;

    iput-object p6, p0, Lp00/e;->G:Lc93/a;

    iput-object p7, p0, Lp00/e;->H:Lc93/a;

    iput-object p8, p0, Lp00/e;->I:Lc93/a;

    iput p9, p0, Lp00/e;->J:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lp00/e;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lp00/e;->J:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-object v1, p0, Lp00/e;->x:Lp00/q;

    iget-object v2, p0, Lp00/e;->y:Lg40/o1;

    iget-object v3, p0, Lp00/e;->z:Lc93/a;

    iget-object v4, p0, Lp00/e;->E:Lc93/a;

    iget-object v5, p0, Lp00/e;->F:Lc93/a;

    iget-object v6, p0, Lp00/e;->G:Lc93/a;

    iget-object v7, p0, Lp00/e;->H:Lc93/a;

    iget-object v8, p0, Lp00/e;->I:Lc93/a;

    invoke-static/range {v1 .. v10}, Lp00/h;->f(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lp00/e;->J:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v9

    iget-object v0, p0, Lp00/e;->x:Lp00/q;

    iget-object v1, p0, Lp00/e;->y:Lg40/o1;

    iget-object v2, p0, Lp00/e;->z:Lc93/a;

    iget-object v3, p0, Lp00/e;->E:Lc93/a;

    iget-object v4, p0, Lp00/e;->F:Lc93/a;

    iget-object v5, p0, Lp00/e;->G:Lc93/a;

    iget-object v6, p0, Lp00/e;->H:Lc93/a;

    iget-object v7, p0, Lp00/e;->I:Lc93/a;

    invoke-static/range {v0 .. v9}, Lp00/h;->f(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
