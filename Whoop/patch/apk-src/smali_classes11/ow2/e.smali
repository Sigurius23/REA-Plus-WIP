.class public final synthetic Low2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm91/u;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Low2/e;->w:I

    iput-object p1, p0, Low2/e;->x:Lm91/u;

    iput-object p2, p0, Low2/e;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Low2/e;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Low2/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Low2/e;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Low2/e;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Low2/e;->x:Lm91/u;

    invoke-static {v2, v0, v1, p1}, Lz72/g;->d(Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Low2/e;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Low2/e;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Low2/e;->x:Lm91/u;

    invoke-static {v2, v0, v1, p1}, Low2/f;->i(Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
