.class public final synthetic Lhh0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lhh0/d;->w:I

    iput-object p2, p0, Lhh0/d;->y:Ljava/lang/Object;

    iput-object p3, p0, Lhh0/d;->z:Ljava/lang/Object;

    iput-boolean p6, p0, Lhh0/d;->x:Z

    iput-object p4, p0, Lhh0/d;->E:Ljava/lang/Object;

    iput-object p5, p0, Lhh0/d;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lj72/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lhh0/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhh0/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lhh0/d;->z:Ljava/lang/Object;

    iput-object p3, p0, Lhh0/d;->E:Ljava/lang/Object;

    iput-object p4, p0, Lhh0/d;->F:Ljava/lang/Object;

    iput-boolean p5, p0, Lhh0/d;->x:Z

    return-void
.end method

.method public synthetic constructor <init>(Lm91/u;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, Lhh0/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhh0/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lhh0/d;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lhh0/d;->x:Z

    iput-object p4, p0, Lhh0/d;->F:Ljava/lang/Object;

    iput-object p5, p0, Lhh0/d;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lhh0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhh0/d;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm91/u;

    iget-object v0, p0, Lhh0/d;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lhh0/d;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lhh0/d;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Lc0/i0;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lhh0/d;->x:Z

    invoke-static/range {v1 .. v8}, Ly21/i;->a(Lm91/u;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhh0/d;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lot2/m;

    iget-object v0, p0, Lhh0/d;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lnt2/c;

    iget-object v0, p0, Lhh0/d;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Lhh0/d;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lmt2/f;

    move-object v6, p1

    check-cast v6, Leb/q;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lhh0/d;->x:Z

    invoke-static/range {v1 .. v8}, Lmt2/e;->l(Lot2/m;Lnt2/c;ZLc93/a;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhh0/d;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lhh0/d;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lj72/j;

    iget-object v0, p0, Lhh0/d;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lhh0/d;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Lc0/i0;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v5, p0, Lhh0/d;->x:Z

    invoke-static/range {v1 .. v8}, Ll72/o;->E(Lkotlin/jvm/functions/Function1;Lj72/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lhh0/d;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lhh0/d;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhh0/a;

    iget-object v0, p0, Lhh0/d;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, Lhh0/d;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkd1/u;

    move-object v6, p1

    check-cast v6, Ll0/v;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v3, p0, Lhh0/d;->x:Z

    invoke-static/range {v1 .. v8}, Lhh0/f;->g(Landroidx/compose/ui/Modifier;Lhh0/a;ZLp1/c1;Lkd1/u;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
