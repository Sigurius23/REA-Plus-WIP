.class public final synthetic Low0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Low0/a;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Low0/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Low0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Low0/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Low0/c;->y:Low0/a;

    return-void
.end method

.method public synthetic constructor <init>(Low0/a;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Low0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Low0/c;->y:Low0/a;

    iput-object p2, p0, Low0/c;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Low0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Low0/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Low0/c;->y:Low0/a;

    invoke-static {v0, v1}, Low0/d;->b(Lkotlin/jvm/functions/Function1;Low0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Low0/c;->y:Low0/a;

    iget-object v1, p0, Low0/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Low0/d;->d(Lkotlin/jvm/functions/Function1;Low0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
