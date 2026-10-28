.class public final synthetic Ld30/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld30/u;


# direct methods
.method public synthetic constructor <init>(Ld30/u;I)V
    .locals 0

    iput p2, p0, Ld30/c1;->w:I

    iput-object p1, p0, Ld30/c1;->x:Ld30/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld30/c1;->w:I

    check-cast p1, Lh20/l;

    packed-switch v0, :pswitch_data_0

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld30/w0;

    iget-object p1, p1, Lh20/l;->b:Ly00/o4;

    invoke-direct {v0, p1}, Ld30/w0;-><init>(Ly00/o4;)V

    iget-object p1, p0, Ld30/c1;->x:Ld30/u;

    invoke-virtual {p1, v0}, Ld30/u;->b(Ld30/z0;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ld30/u0;

    invoke-direct {v0, p1}, Ld30/u0;-><init>(Lh20/l;)V

    iget-object p1, p0, Ld30/c1;->x:Ld30/u;

    invoke-virtual {p1, v0}, Ld30/u;->b(Ld30/z0;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
