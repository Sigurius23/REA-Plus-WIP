.class public final synthetic Lev2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lev2/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev2/q;->y:Ljava/lang/Object;

    iput-object p2, p0, Lev2/q;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lev2/q;->x:Z

    iput-object p4, p0, Lev2/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljx1/g;ZLjx1/t;Ljx1/g;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lev2/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev2/q;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lev2/q;->x:Z

    iput-object p3, p0, Lev2/q;->z:Ljava/lang/Object;

    iput-object p4, p0, Lev2/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLm91/u;Lj0/i;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lev2/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lev2/q;->x:Z

    iput-object p2, p0, Lev2/q;->y:Ljava/lang/Object;

    iput-object p3, p0, Lev2/q;->z:Ljava/lang/Object;

    iput-object p4, p0, Lev2/q;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lev2/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lev2/q;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;

    iget-object v0, p0, Lev2/q;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lev2/q;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lev2/q;->x:Z

    invoke-static/range {v1 .. v7}, Ltg2/d;->b(Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lev2/q;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljx1/g;

    iget-object v0, p0, Lev2/q;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljx1/t;

    iget-object v0, p0, Lev2/q;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljx1/g;

    move-object v5, p1

    check-cast v5, Ll0/s1;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lev2/q;->x:Z

    invoke-static/range {v1 .. v7}, Lmx1/m;->p(Ljx1/g;ZLjx1/t;Ljx1/g;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lev2/q;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lm91/u;

    iget-object v0, p0, Lev2/q;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lj0/i;

    iget-object v0, p0, Lev2/q;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/lazy/a;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v1, p0, Lev2/q;->x:Z

    invoke-static/range {v1 .. v7}, Lev2/u;->b(ZLm91/u;Lj0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
