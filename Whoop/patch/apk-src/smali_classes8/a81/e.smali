.class public final synthetic La81/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p2, p0, La81/e;->w:I

    iput-object p1, p0, La81/e;->x:Ljava/util/List;

    iput-object p3, p0, La81/e;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, La81/e;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La81/e;->x:Ljava/util/List;

    iget-object v1, p0, La81/e;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, Lcom/whoop/startactivity/goals/a;->a(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La81/e;->x:Ljava/util/List;

    iget-object v1, p0, La81/e;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1, p2}, La81/o;->f(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
