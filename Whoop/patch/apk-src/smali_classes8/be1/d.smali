.class public final synthetic Lbe1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lzr2/a;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lzd1/d$a;

.field public final synthetic z:Lor2/u0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lzd1/d$a;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lbe1/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe1/d;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lbe1/d;->y:Lzd1/d$a;

    iput-object p3, p0, Lbe1/d;->z:Lor2/u0;

    iput-object p4, p0, Lbe1/d;->E:Lzr2/a;

    iput-object p5, p0, Lbe1/d;->F:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lbe1/d;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Lzd1/d$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lor2/u0;Lzr2/a;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lbe1/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe1/d;->y:Lzd1/d$a;

    iput-object p2, p0, Lbe1/d;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lbe1/d;->F:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lbe1/d;->z:Lor2/u0;

    iput-object p5, p0, Lbe1/d;->E:Lzr2/a;

    iput p6, p0, Lbe1/d;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lbe1/d;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lbe1/d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lbe1/d;->y:Lzd1/d$a;

    iget-object v3, p0, Lbe1/d;->z:Lor2/u0;

    iget-object v4, p0, Lbe1/d;->E:Lzr2/a;

    iget-object v5, p0, Lbe1/d;->F:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lbe1/d;->G:I

    invoke-static/range {v1 .. v8}, Lbe1/g;->v(Lkotlin/jvm/functions/Function1;Lzd1/d$a;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lbe1/d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbe1/d;->y:Lzd1/d$a;

    iget-object v2, p0, Lbe1/d;->z:Lor2/u0;

    iget-object v3, p0, Lbe1/d;->E:Lzr2/a;

    iget-object v4, p0, Lbe1/d;->F:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lbe1/d;->G:I

    invoke-static/range {v0 .. v7}, Lbe1/g;->k(Lkotlin/jvm/functions/Function1;Lzd1/d$a;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
