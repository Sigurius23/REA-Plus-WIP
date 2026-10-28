.class public final synthetic Lb81/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lb81/j;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lb81/j;I)V
    .locals 0

    iput p3, p0, Lb81/c;->w:I

    iput-object p1, p0, Lb81/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lb81/c;->y:Lb81/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb81/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb81/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb81/c;->y:Lb81/j;

    invoke-static {v0, v1}, Lb81/g;->b(Lkotlin/jvm/functions/Function1;Lb81/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lb81/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb81/c;->y:Lb81/j;

    invoke-static {v0, v1}, Lb81/d;->c(Lkotlin/jvm/functions/Function1;Lb81/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
