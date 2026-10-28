.class public final synthetic Lfr1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lgr1/q;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lfr1/a;->w:I

    iput-object p1, p0, Lfr1/a;->x:Lgr1/q;

    iput-object p2, p0, Lfr1/a;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lfr1/a;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lfr1/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Leb/q;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lfr1/a;->x:Lgr1/q;

    iget-object v2, p0, Lfr1/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lfr1/a;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Lfr1/b;->a(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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

    iget-object v0, p0, Lfr1/a;->x:Lgr1/q;

    iget-object v1, p0, Lfr1/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lfr1/a;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lfr1/b;->f(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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

    iget-object v0, p0, Lfr1/a;->x:Lgr1/q;

    iget-object v1, p0, Lfr1/a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lfr1/a;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lfr1/b;->c(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
