.class public final synthetic Lmk1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmk1/e;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lmk1/e;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lmk1/b;->w:I

    iput-object p1, p0, Lmk1/b;->x:Lmk1/e;

    iput-object p2, p0, Lmk1/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lmk1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmk1/b;->x:Lmk1/e;

    iget-object v1, p0, Lmk1/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lmk1/c;->a(Lmk1/e;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmk1/b;->x:Lmk1/e;

    iget-object v1, p0, Lmk1/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lmk1/c;->e(Lmk1/e;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
