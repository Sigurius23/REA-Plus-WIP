.class public final synthetic Lfa0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lda0/d$d;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lda0/d$d;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lfa0/b;->w:I

    iput-object p1, p0, Lfa0/b;->x:Lda0/d$d;

    iput-object p2, p0, Lfa0/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lfa0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfa0/b;->x:Lda0/d$d;

    iget-object v1, p0, Lfa0/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lfa0/c;->A(Lda0/d$d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfa0/b;->x:Lda0/d$d;

    iget-object v1, p0, Lfa0/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lfa0/c;->v(Lda0/d$d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
