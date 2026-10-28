.class public final synthetic Ll80/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lc93/r;

.field public final synthetic G:Lp1/t2;

.field public final synthetic w:I

.field public final synthetic x:Lf80/e;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Lp1/t2;I)V
    .locals 0

    iput p7, p0, Ll80/l;->w:I

    iput-object p1, p0, Ll80/l;->x:Lf80/e;

    iput-object p2, p0, Ll80/l;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ll80/l;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Ll80/l;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ll80/l;->F:Lc93/r;

    iput-object p6, p0, Ll80/l;->G:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Ll80/l;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Lc0/o;

    move-object v8, p2

    check-cast v8, Leb/q;

    move-object v9, p3

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v1, p0, Ll80/l;->x:Lf80/e;

    iget-object v2, p0, Ll80/l;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ll80/l;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ll80/l;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ll80/l;->F:Lc93/r;

    iget-object v6, p0, Ll80/l;->G:Lp1/t2;

    invoke-static/range {v1 .. v10}, Ll80/n;->h(Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Lc0/o;

    move-object v7, p2

    check-cast v7, Leb/q;

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Ll80/l;->x:Lf80/e;

    iget-object v1, p0, Ll80/l;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ll80/l;->z:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Ll80/l;->E:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ll80/l;->F:Lc93/r;

    iget-object v5, p0, Ll80/l;->G:Lp1/t2;

    invoke-static/range {v0 .. v9}, Ll80/n;->n(Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
