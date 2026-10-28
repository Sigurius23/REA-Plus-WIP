.class public final synthetic Lj31/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lj31/m;


# direct methods
.method public synthetic constructor <init>(ZLj31/m;I)V
    .locals 0

    iput p3, p0, Lj31/e;->w:I

    iput-boolean p1, p0, Lj31/e;->x:Z

    iput-object p2, p0, Lj31/e;->y:Lj31/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lj31/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj31/e;->y:Lj31/m;

    check-cast p1, Li2/g0;

    iget-boolean v1, p0, Lj31/e;->x:Z

    invoke-static {v1, v0, p1}, Lj31/f;->b(ZLj31/m;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lj31/e;->y:Lj31/m;

    check-cast p1, Li2/g0;

    iget-boolean v1, p0, Lj31/e;->x:Z

    invoke-static {v1, v0, p1}, Lj31/f;->c(ZLj31/m;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
