.class public final synthetic Lht2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lht2/c;->w:I

    iput-boolean p1, p0, Lht2/c;->x:Z

    iput-object p2, p0, Lht2/c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lht2/c;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lht2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lht2/c;->z:Ljava/lang/Object;

    check-cast v0, Lfm1/i;

    iget-boolean v1, p0, Lht2/c;->x:Z

    iget-object v2, p0, Lht2/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v0}, Ljk2/i;->f(ZLkotlin/jvm/functions/Function1;Lfm1/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lht2/c;->z:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Lht2/c;->y:Lkotlin/jvm/functions/Function1;

    iget-boolean v2, p0, Lht2/c;->x:Z

    invoke-static {v1, v0, v2}, Lht2/e;->e(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
