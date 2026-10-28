.class public final synthetic Ln10/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ln10/u;


# direct methods
.method public synthetic constructor <init>(Ln10/u;I)V
    .locals 0

    iput p2, p0, Ln10/t;->w:I

    iput-object p1, p0, Ln10/t;->x:Ln10/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ln10/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln10/t;->x:Ln10/u;

    iget-object v0, v0, Ln10/u;->e:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :pswitch_0
    iget-object v0, p0, Ln10/t;->x:Ln10/u;

    iget-object v0, v0, Ln10/u;->d:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :pswitch_1
    iget-object v0, p0, Ln10/t;->x:Ln10/u;

    iget-object v0, v0, Ln10/u;->c:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/b;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
