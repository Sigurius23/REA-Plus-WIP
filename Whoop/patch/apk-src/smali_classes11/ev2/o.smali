.class public final synthetic Lev2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ldv2/e$b;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ldv2/e$b;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lev2/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev2/o;->x:Ldv2/e$b;

    iput-object p2, p0, Lev2/o;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ldv2/e$b;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lev2/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lev2/o;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lev2/o;->x:Ldv2/e$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lev2/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lev2/o;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ln0/q;

    iget-object v1, p0, Lev2/o;->x:Ldv2/e$b;

    invoke-static {v1, v0, p1}, Lev2/u;->k(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lev2/o;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lev2/o;->x:Ldv2/e$b;

    invoke-static {v0, v1, p1}, Lev2/u;->x(Lkotlin/jvm/functions/Function1;Ldv2/e$b;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
