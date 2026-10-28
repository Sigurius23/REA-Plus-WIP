.class public final synthetic Lqm1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lm91/u;


# direct methods
.method public synthetic constructor <init>(Lc93/m;Lm91/u;I)V
    .locals 0

    iput p3, p0, Lqm1/d;->w:I

    iput-object p1, p0, Lqm1/d;->x:Lc93/m;

    iput-object p2, p0, Lqm1/d;->y:Lm91/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lqm1/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqm1/d;->x:Lc93/m;

    iget-object v1, p0, Lqm1/d;->y:Lm91/u;

    invoke-static {v0, v1, p1}, Lqm1/e;->j(Lc93/m;Lm91/u;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lqm1/d;->x:Lc93/m;

    iget-object v1, p0, Lqm1/d;->y:Lm91/u;

    invoke-static {v0, v1, p1}, Lqm1/e;->c(Lc93/m;Lm91/u;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
