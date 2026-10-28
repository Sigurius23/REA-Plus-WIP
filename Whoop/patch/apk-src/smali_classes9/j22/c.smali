.class public final synthetic Lj22/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lk22/d;


# direct methods
.method public synthetic constructor <init>(ILk22/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput p1, p0, Lj22/c;->w:I

    iput-object p2, p0, Lj22/c;->z:Lk22/d;

    iput-object p3, p0, Lj22/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lj22/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lk22/d;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lj22/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj22/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lj22/c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lj22/c;->z:Lk22/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lj22/c;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Leb/q;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lj22/c;->z:Lk22/d;

    iget-object v2, p0, Lj22/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lj22/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Lj22/e;->t(Lk22/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Leb/q;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lj22/c;->z:Lk22/d;

    iget-object v1, p0, Lj22/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lj22/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lj22/e;->k(Lk22/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v3, p1

    check-cast v3, Leb/q;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lj22/c;->z:Lk22/d;

    iget-object v1, p0, Lj22/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lj22/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lj22/e;->x(Lk22/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
