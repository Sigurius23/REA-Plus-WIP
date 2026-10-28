.class public final synthetic Lyk2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ltk2/m$b;


# direct methods
.method public synthetic constructor <init>(Ltk2/m$b;I)V
    .locals 0

    iput p2, p0, Lyk2/j;->w:I

    iput-object p1, p0, Lyk2/j;->x:Ltk2/m$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyk2/j;->w:I

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyk2/j;->x:Ltk2/m$b;

    invoke-static {v0, p1, p2, p3}, Lyk2/l;->v(Ltk2/m$b;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyk2/j;->x:Ltk2/m$b;

    invoke-static {v0, p1, p2, p3}, Lyk2/l;->x(Ltk2/m$b;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
