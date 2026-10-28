.class public final synthetic Lmf2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(IZZLq3/y;Lql0/c;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lmf2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lmf2/d;->x:I

    iput-boolean p2, p0, Lmf2/d;->y:Z

    iput-boolean p3, p0, Lmf2/d;->z:Z

    iput-object p4, p0, Lmf2/d;->F:Ljava/lang/Object;

    iput-object p5, p0, Lmf2/d;->G:Ljava/lang/Object;

    iput-boolean p6, p0, Lmf2/d;->E:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lmf2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lmf2/d;->y:Z

    iput-boolean p2, p0, Lmf2/d;->z:Z

    iput-boolean p3, p0, Lmf2/d;->E:Z

    iput-object p4, p0, Lmf2/d;->F:Ljava/lang/Object;

    iput-object p5, p0, Lmf2/d;->G:Ljava/lang/Object;

    iput p6, p0, Lmf2/d;->x:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lmf2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmf2/d;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lq3/y;

    iget-object v0, p0, Lmf2/d;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lql0/c;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v1, p0, Lmf2/d;->x:I

    iget-boolean v2, p0, Lmf2/d;->y:Z

    iget-boolean v3, p0, Lmf2/d;->z:Z

    iget-boolean v6, p0, Lmf2/d;->E:Z

    invoke-static/range {v1 .. v8}, Lsl0/p3;->l(IZZLq3/y;Lql0/c;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmf2/d;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lmf2/d;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-boolean v1, p0, Lmf2/d;->y:Z

    iget-boolean v2, p0, Lmf2/d;->z:Z

    iget-boolean v3, p0, Lmf2/d;->E:Z

    iget v6, p0, Lmf2/d;->x:I

    invoke-static/range {v1 .. v8}, Lmf2/f;->a(ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
