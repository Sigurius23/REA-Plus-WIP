.class public final synthetic Lgf1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;I)V
    .locals 0

    iput p3, p0, Lgf1/f;->w:I

    iput-object p1, p0, Lgf1/f;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lgf1/f;->y:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lgf1/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lgf1/f;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lgf1/f;->y:Ljava/lang/Integer;

    invoke-static {v0, v1, p1}, Lw71/g0;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lgf1/f;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lgf1/f;->y:Ljava/lang/Integer;

    invoke-static {v0, v1, p1}, Lgf1/g;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
