.class public final synthetic Ldn0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/util/List;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Li11/f;

.field public final synthetic y:Z

.field public final synthetic z:Lvy0/d0;


# direct methods
.method public synthetic constructor <init>(Li11/f;ZLvy0/d0;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p8, p0, Ldn0/n;->w:I

    iput-object p1, p0, Ldn0/n;->x:Li11/f;

    iput-boolean p2, p0, Ldn0/n;->y:Z

    iput-object p3, p0, Ldn0/n;->z:Lvy0/d0;

    iput-object p4, p0, Ldn0/n;->E:Ljava/util/List;

    iput-object p5, p0, Ldn0/n;->F:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ldn0/n;->G:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Ldn0/n;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Ldn0/n;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Ldn0/n;->x:Li11/f;

    iget-boolean v2, p0, Ldn0/n;->y:Z

    iget-object v3, p0, Ldn0/n;->z:Lvy0/d0;

    iget-object v4, p0, Ldn0/n;->E:Ljava/util/List;

    iget-object v5, p0, Ldn0/n;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Ldn0/n;->G:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Ldn0/n;->H:I

    invoke-static/range {v1 .. v9}, Ldn0/p;->o(Li11/f;ZLvy0/d0;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Ldn0/n;->x:Li11/f;

    iget-boolean v1, p0, Ldn0/n;->y:Z

    iget-object v2, p0, Ldn0/n;->z:Lvy0/d0;

    iget-object v3, p0, Ldn0/n;->E:Ljava/util/List;

    iget-object v4, p0, Ldn0/n;->F:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ldn0/n;->G:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Ldn0/n;->H:I

    invoke-static/range {v0 .. v8}, Ldn0/p;->p(Li11/f;ZLvy0/d0;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
