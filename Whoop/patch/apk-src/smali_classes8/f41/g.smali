.class public final synthetic Lf41/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lf41/a;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lf41/a;I)V
    .locals 0

    iput p3, p0, Lf41/g;->w:I

    iput-object p1, p0, Lf41/g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lf41/g;->y:Lf41/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lf41/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf41/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lf41/g;->y:Lf41/a;

    invoke-static {v0, v1}, Lw11/b;->j(Lkotlin/jvm/functions/Function1;Lf41/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf41/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lf41/g;->y:Lf41/a;

    invoke-static {v0, v1}, Lqt2/x;->d(Lkotlin/jvm/functions/Function1;Lf41/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lf41/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lf41/g;->y:Lf41/a;

    invoke-static {v0, v1}, Lf41/p;->f(Lkotlin/jvm/functions/Function1;Lf41/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
