.class public final synthetic Lch0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lzg0/e;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lzg0/e;I)V
    .locals 0

    iput p3, p0, Lch0/w;->w:I

    iput-object p1, p0, Lch0/w;->x:Lc93/m;

    iput-object p2, p0, Lch0/w;->y:Lzg0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lch0/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/w;->y:Lzg0/e;

    check-cast p1, Ly2/y;

    iget-object v1, p0, Lch0/w;->x:Lc93/m;

    invoke-static {v1, v0, p1}, Lch0/c0;->a(Lc93/m;Lzg0/e;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/w;->y:Lzg0/e;

    check-cast p1, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    iget-object v1, p0, Lch0/w;->x:Lc93/m;

    invoke-static {v1, v0, p1}, Lch0/c0;->m(Lc93/m;Lzg0/e;Lcom/whoop/bot/models/feedback/AiFeedbackType;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
