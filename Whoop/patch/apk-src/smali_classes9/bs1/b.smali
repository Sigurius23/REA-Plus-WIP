.class public final synthetic Lbs1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lh91/b;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lh91/b;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lbs1/b;->w:I

    iput-object p1, p0, Lbs1/b;->x:Lc93/a;

    iput-object p2, p0, Lbs1/b;->y:Lh91/b;

    iput-object p3, p0, Lbs1/b;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lbs1/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lbs1/b;->x:Lc93/a;

    iget-object v2, p0, Lbs1/b;->y:Lh91/b;

    iget-object v3, p0, Lbs1/b;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Lqj2/b;->b(Lc93/a;Lh91/b;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Lc0/i0;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lbs1/b;->x:Lc93/a;

    iget-object v1, p0, Lbs1/b;->y:Lh91/b;

    iget-object v2, p0, Lbs1/b;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lbs1/f;->e(Lc93/a;Lh91/b;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
