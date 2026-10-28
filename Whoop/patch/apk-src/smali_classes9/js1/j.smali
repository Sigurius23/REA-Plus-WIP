.class public final synthetic Ljs1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p5, p0, Ljs1/j;->w:I

    iput-object p1, p0, Ljs1/j;->x:Ljava/lang/String;

    iput-object p2, p0, Ljs1/j;->y:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Ljs1/j;->z:I

    iput p4, p0, Ljs1/j;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ljs1/j;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Ljs1/j;->x:Ljava/lang/String;

    iget-object v2, p0, Ljs1/j;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Ljs1/j;->z:I

    iget v4, p0, Ljs1/j;->E:I

    invoke-static/range {v1 .. v6}, Lsl0/j1;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Ljs1/j;->x:Ljava/lang/String;

    iget-object v1, p0, Ljs1/j;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Ljs1/j;->z:I

    iget v3, p0, Ljs1/j;->E:I

    invoke-static/range {v0 .. v5}, Ll90/a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Ljs1/j;->x:Ljava/lang/String;

    iget-object v1, p0, Ljs1/j;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Ljs1/j;->z:I

    iget v3, p0, Ljs1/j;->E:I

    invoke-static/range {v0 .. v5}, Ljs1/l;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
