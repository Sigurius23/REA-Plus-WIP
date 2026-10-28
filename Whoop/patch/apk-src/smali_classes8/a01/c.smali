.class public final synthetic La01/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:La01/h;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La01/h;I)V
    .locals 0

    iput p3, p0, La01/c;->w:I

    iput-object p1, p0, La01/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La01/c;->y:La01/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, La01/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La01/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La01/c;->y:La01/h;

    invoke-static {v0, v1}, La01/g;->c(Lkotlin/jvm/functions/Function1;La01/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La01/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La01/c;->y:La01/h;

    invoke-static {v0, v1}, La01/g;->e(Lkotlin/jvm/functions/Function1;La01/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
