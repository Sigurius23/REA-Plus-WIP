.class public final Landroidx/databinding/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/databinding/m;


# instance fields
.field public final synthetic w:I

.field public final x:Landroidx/databinding/d0;


# direct methods
.method public constructor <init>(Landroidx/databinding/a0;ILjava/lang/ref/ReferenceQueue;I)V
    .locals 0

    iput p4, p0, Landroidx/databinding/y;->w:I

    packed-switch p4, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p4, Landroidx/databinding/d0;

    invoke-direct {p4, p1, p2, p0, p3}, Landroidx/databinding/d0;-><init>(Landroidx/databinding/a0;ILandroidx/databinding/m;Ljava/lang/ref/ReferenceQueue;)V

    iput-object p4, p0, Landroidx/databinding/y;->x:Landroidx/databinding/d0;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p4, Landroidx/databinding/d0;

    invoke-direct {p4, p1, p2, p0, p3}, Landroidx/databinding/d0;-><init>(Landroidx/databinding/a0;ILandroidx/databinding/m;Ljava/lang/ref/ReferenceQueue;)V

    iput-object p4, p0, Landroidx/databinding/y;->x:Landroidx/databinding/d0;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private final e(Landroidx/lifecycle/g0;)V
    .locals 0

    return-void
.end method

.method private final f(Landroidx/lifecycle/g0;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/g0;)V
    .locals 0

    iget p1, p0, Landroidx/databinding/y;->w:I

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Landroidx/databinding/y;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :pswitch_0
    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 0

    iget p1, p0, Landroidx/databinding/y;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Landroidx/databinding/d0;
    .locals 1

    iget v0, p0, Landroidx/databinding/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/databinding/y;->x:Landroidx/databinding/d0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/databinding/y;->x:Landroidx/databinding/d0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
