.class public final Lw73/l;
.super Lw73/a;
.source "SourceFile"


# instance fields
.field public final synthetic x:I

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll73/c;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Lw73/l;->x:I

    invoke-direct {p0, p1}, Lw73/a;-><init>(Ll73/c;)V

    iput-object p2, p0, Lw73/l;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Ll73/d;)V
    .locals 3

    iget v0, p0, Lw73/l;->x:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lw73/k;

    iget-object v1, p0, Lw73/l;->y:Ljava/lang/Object;

    check-cast v1, Lbu/c;

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Lw73/k;-><init>(Ll73/d;Ljava/lang/Object;I)V

    iget-object p1, p0, Lw73/a;->w:Ll73/c;

    invoke-virtual {p1, v0}, Ll73/c;->c(Ll73/d;)V

    return-void

    :pswitch_0
    new-instance v0, Lw73/k;

    iget-object v1, p0, Lw73/l;->y:Ljava/lang/Object;

    check-cast v1, Lad3/z;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lw73/k;-><init>(Ll73/d;Ljava/lang/Object;I)V

    iget-object p1, p0, Lw73/a;->w:Ll73/c;

    invoke-virtual {p1, v0}, Ll73/c;->c(Ll73/d;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
