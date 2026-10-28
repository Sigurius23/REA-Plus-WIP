.class public final synthetic Lty1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lty1/k;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lty1/k;)V
    .locals 0

    iput p1, p0, Lty1/d;->w:I

    iput-object p4, p0, Lty1/d;->x:Lty1/k;

    iput-object p2, p0, Lty1/d;->y:Ljava/lang/String;

    iput-object p3, p0, Lty1/d;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lty1/d;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lty1/d;->x:Lty1/k;

    iget-object v1, p0, Lty1/d;->y:Ljava/lang/String;

    iget-object v2, p0, Lty1/d;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1, p2}, Lty1/i;->v(Lty1/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lty1/d;->x:Lty1/k;

    iget-object v1, p0, Lty1/d;->y:Ljava/lang/String;

    iget-object v2, p0, Lty1/d;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1, p2}, Lty1/i;->h(Lty1/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
