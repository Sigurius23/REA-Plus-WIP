.class public final synthetic Ljs2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lhs2/e$d;

.field public final synthetic y:Lfs2/m;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p6, p0, Ljs2/d;->w:I

    iput-object p1, p0, Ljs2/d;->x:Lhs2/e$d;

    iput-object p2, p0, Ljs2/d;->y:Lfs2/m;

    iput-object p3, p0, Ljs2/d;->z:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Ljs2/d;->E:I

    iput p5, p0, Ljs2/d;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ljs2/d;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Ljs2/d;->x:Lhs2/e$d;

    iget-object v2, p0, Ljs2/d;->y:Lfs2/m;

    iget-object v3, p0, Ljs2/d;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Ljs2/d;->E:I

    iget v5, p0, Ljs2/d;->F:I

    invoke-static/range {v1 .. v7}, Ljs2/f;->b(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Ljs2/d;->x:Lhs2/e$d;

    iget-object v1, p0, Ljs2/d;->y:Lfs2/m;

    iget-object v2, p0, Ljs2/d;->z:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Ljs2/d;->E:I

    iget v4, p0, Ljs2/d;->F:I

    invoke-static/range {v0 .. v6}, Ljs2/f;->n(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
