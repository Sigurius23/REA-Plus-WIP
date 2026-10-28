.class public final synthetic Lkf0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkd0/c$b;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lkd0/c$b;Lkotlin/jvm/functions/Function1;Lc93/a;I)V
    .locals 0

    iput p4, p0, Lkf0/e;->w:I

    iput-object p1, p0, Lkf0/e;->x:Lkd0/c$b;

    iput-object p2, p0, Lkf0/e;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lkf0/e;->z:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lkf0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkf0/e;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lkf0/e;->z:Lc93/a;

    iget-object v2, p0, Lkf0/e;->x:Lkd0/c$b;

    invoke-static {v2, v0, v1}, Lkf0/f;->p(Lkd0/c$b;Lkotlin/jvm/functions/Function1;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lkf0/e;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lkf0/e;->z:Lc93/a;

    iget-object v2, p0, Lkf0/e;->x:Lkd0/c$b;

    invoke-static {v2, v0, v1}, Lkf0/f;->b(Lkd0/c$b;Lkotlin/jvm/functions/Function1;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
