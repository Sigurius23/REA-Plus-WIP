.class public final synthetic Lcom/whoop/profile/presentation/edit/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll1/g1;


# direct methods
.method public synthetic constructor <init>(Ll1/g1;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/profile/presentation/edit/a;->w:I

    iput-object p1, p0, Lcom/whoop/profile/presentation/edit/a;->x:Ll1/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/profile/presentation/edit/a;->w:I

    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/a;->x:Ll1/g1;

    invoke-static {v0, p1, p2, p3}, Ls80/c;->f(Ll1/g1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/a;->x:Ll1/g1;

    invoke-static {v0, p1, p2, p3}, Lmf0/e;->h(Ll1/g1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/a;->x:Ll1/g1;

    invoke-static {v0, p1, p2, p3}, Lg11/c;->h(Ll1/g1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/a;->x:Ll1/g1;

    invoke-static {v0, p1, p2, p3}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->b(Ll1/g1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
