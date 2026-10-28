.class public final synthetic Lno1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llo1/c;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Llo1/c;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lno1/d;->w:I

    iput-object p1, p0, Lno1/d;->x:Llo1/c;

    iput-object p2, p0, Lno1/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lno1/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lno1/d;->x:Llo1/c;

    iget-object v1, p0, Lno1/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lno1/e;->d(Llo1/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lno1/d;->x:Llo1/c;

    iget-object v1, p0, Lno1/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lno1/e;->b(Llo1/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
