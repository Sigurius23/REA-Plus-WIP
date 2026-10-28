.class public final synthetic Lmx1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljx1/q;


# direct methods
.method public synthetic constructor <init>(Ljx1/q;I)V
    .locals 0

    iput p2, p0, Lmx1/f;->w:I

    iput-object p1, p0, Lmx1/f;->x:Ljx1/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmx1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmx1/f;->x:Ljx1/q;

    check-cast p1, Lk2/e;

    invoke-static {v0, p1}, Lmx1/j;->f(Ljx1/q;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmx1/f;->x:Ljx1/q;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Lmx1/j;->j(Ljx1/q;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
