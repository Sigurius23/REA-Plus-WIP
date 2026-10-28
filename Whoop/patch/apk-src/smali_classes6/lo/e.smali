.class public final Llo/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/util/SparseBooleanArray;

.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Llo/e;->a:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Llo/e;->b:Landroid/util/SparseBooleanArray;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Llo/e;->b:Landroid/util/SparseBooleanArray;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget v0, p0, Llo/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Llo/e;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lva3/g;->i(Z)V

    iget-object v0, p0, Llo/e;->b:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->append(IZ)V

    return-void

    :pswitch_0
    iget-boolean v0, p0, Llo/e;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Llo/a;->i(Z)V

    iget-object v0, p0, Llo/e;->b:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseBooleanArray;->append(IZ)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b()Llo/f;
    .locals 2

    iget-boolean v0, p0, Llo/e;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Llo/a;->i(Z)V

    iput-boolean v1, p0, Llo/e;->c:Z

    new-instance v0, Llo/f;

    iget-object v1, p0, Llo/e;->b:Landroid/util/SparseBooleanArray;

    invoke-direct {v0, v1}, Llo/f;-><init>(Landroid/util/SparseBooleanArray;)V

    return-object v0
.end method

.method public c()Lu8/n;
    .locals 2

    iget-boolean v0, p0, Llo/e;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lva3/g;->i(Z)V

    iput-boolean v1, p0, Llo/e;->c:Z

    new-instance v0, Lu8/n;

    iget-object v1, p0, Llo/e;->b:Landroid/util/SparseBooleanArray;

    invoke-direct {v0, v1}, Lu8/n;-><init>(Landroid/util/SparseBooleanArray;)V

    return-object v0
.end method
