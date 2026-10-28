.class public final synthetic La31/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:I

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, La31/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La31/d;->x:I

    iput p2, p0, La31/d;->y:I

    iput p3, p0, La31/d;->z:I

    iput-boolean p4, p0, La31/d;->E:Z

    iput-object p5, p0, La31/d;->H:Ljava/lang/Object;

    iput-object p6, p0, La31/d;->I:Ljava/lang/Object;

    iput-object p7, p0, La31/d;->F:Lkotlin/jvm/functions/Function1;

    iput p8, p0, La31/d;->G:I

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, La31/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La31/d;->x:I

    iput p2, p0, La31/d;->y:I

    iput-object p3, p0, La31/d;->H:Ljava/lang/Object;

    iput-boolean p4, p0, La31/d;->E:Z

    iput-object p5, p0, La31/d;->F:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, La31/d;->I:Ljava/lang/Object;

    iput p7, p0, La31/d;->z:I

    iput p8, p0, La31/d;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, La31/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La31/d;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, p0, La31/d;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v1, p0, La31/d;->x:I

    iget v2, p0, La31/d;->y:I

    iget v3, p0, La31/d;->z:I

    iget-boolean v4, p0, La31/d;->E:Z

    iget-object v7, p0, La31/d;->F:Lkotlin/jvm/functions/Function1;

    iget v8, p0, La31/d;->G:I

    invoke-static/range {v1 .. v10}, Lfo2/c;->b(IIIZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La31/d;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    iget-object v0, p0, La31/d;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/a;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v1, p0, La31/d;->x:I

    iget v2, p0, La31/d;->y:I

    iget-boolean v4, p0, La31/d;->E:Z

    iget-object v5, p0, La31/d;->F:Lkotlin/jvm/functions/Function1;

    iget v7, p0, La31/d;->z:I

    iget v8, p0, La31/d;->G:I

    invoke-static/range {v1 .. v10}, La31/f;->a(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
