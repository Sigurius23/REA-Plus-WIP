.class public final synthetic Liz0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Liz0/m;


# direct methods
.method public synthetic constructor <init>(Liz0/m;I)V
    .locals 0

    iput p2, p0, Liz0/c;->w:I

    iput-object p1, p0, Liz0/c;->x:Liz0/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Liz0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liz0/c;->x:Liz0/m;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Liz0/g;->c(Liz0/m;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Liz0/c;->x:Liz0/m;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Liz0/g;->d(Liz0/m;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Liz0/c;->x:Liz0/m;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Liz0/g;->I(Liz0/m;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Liz0/c;->x:Liz0/m;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Liz0/g;->A(Liz0/m;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Liz0/c;->x:Liz0/m;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Liz0/g;->B(Liz0/m;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Liz0/c;->x:Liz0/m;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Liz0/g;->e(Liz0/m;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
