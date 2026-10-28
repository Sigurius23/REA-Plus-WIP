.class public final synthetic Lwo1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lso1/c;


# direct methods
.method public synthetic constructor <init>(Lso1/c;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lwo1/c0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo1/c0;->y:Lso1/c;

    iput-object p2, p0, Lwo1/c0;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lso1/c;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lwo1/c0;->w:I

    iput-object p2, p0, Lwo1/c0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p1, p0, Lwo1/c0;->y:Lso1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lwo1/c0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lwo1/c0;->y:Lso1/c;

    iget-object v1, p0, Lwo1/c0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lwo1/f0;->c(Lso1/c;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lwo1/c0;->y:Lso1/c;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lwo1/c0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lwo1/d0;->a(Lkotlin/jvm/functions/Function1;Lso1/c;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lwo1/c0;->y:Lso1/c;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lwo1/c0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lwo1/d0;->e(Lkotlin/jvm/functions/Function1;Lso1/c;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
