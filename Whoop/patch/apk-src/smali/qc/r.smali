.class public final synthetic Lqc/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lqc/u;

.field public final synthetic y:Lqc/q;


# direct methods
.method public synthetic constructor <init>(Lqc/u;Lqc/q;I)V
    .locals 0

    iput p3, p0, Lqc/r;->w:I

    iput-object p1, p0, Lqc/r;->x:Lqc/u;

    iput-object p2, p0, Lqc/r;->y:Lqc/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lqc/r;->w:I

    check-cast p1, Ltb/a;

    packed-switch v0, :pswitch_data_0

    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqc/r;->x:Lqc/u;

    iget-object v0, v0, Lqc/u;->c:Lqc/t;

    iget-object v1, p0, Lqc/r;->y:Lqc/q;

    invoke-virtual {v0, p1, v1}, Landroidx/room/i;->handle(Ltb/a;Ljava/lang/Object;)I

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const-string v0, "_connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqc/r;->x:Lqc/u;

    iget-object v0, v0, Lqc/u;->b:Lqc/b;

    iget-object v1, p0, Lqc/r;->y:Lqc/q;

    invoke-virtual {v0, p1, v1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
