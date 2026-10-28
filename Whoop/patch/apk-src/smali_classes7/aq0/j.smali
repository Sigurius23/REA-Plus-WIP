.class public final synthetic Laq0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Laq0/j;->a:I

    iput-object p1, p0, Laq0/j;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Laq0/j;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laq0/j;->b:Lkotlin/jvm/functions/Function1;

    check-cast v0, Lbe1/c;

    invoke-static {v0, p1}, Lbi2/j;->a(Lbe1/c;Ljava/lang/Object;)Lec3/f2;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Laq0/j;->b:Lkotlin/jvm/functions/Function1;

    check-cast v0, Laq0/a;

    invoke-static {v0, p1}, Laq0/q;->x0(Laq0/a;Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
