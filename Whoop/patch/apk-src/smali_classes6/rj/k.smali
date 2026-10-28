.class public final Lrj/k;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/m;

.field public final synthetic y:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;ZI)V
    .locals 0

    iput p3, p0, Lrj/k;->w:I

    packed-switch p3, :pswitch_data_0

    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Lrj/k;->x:Lkotlin/jvm/internal/m;

    iput-boolean p2, p0, Lrj/k;->y:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void

    :pswitch_0
    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Lrj/k;->x:Lkotlin/jvm/internal/m;

    iput-boolean p2, p0, Lrj/k;->y:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lrj/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lrj/k;->y:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lrj/k;->x:Lkotlin/jvm/internal/m;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-boolean v0, p0, Lrj/k;->y:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lrj/k;->x:Lkotlin/jvm/internal/m;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
