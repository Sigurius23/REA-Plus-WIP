.class public final Le73/c;
.super Lz63/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc9/k;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le73/c;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le73/b;

    invoke-direct {v0, p1}, Le73/b;-><init>(Lc9/k;)V

    iput-object v0, p0, Le73/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf73/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le73/c;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Le73/c;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget v0, p0, Le73/c;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Le73/c;->b:Ljava/lang/Object;

    check-cast v0, Le73/b;

    const/4 v1, 0x0

    iput-object v1, v0, Le73/b;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-boolean v1, v0, Le73/b;->b:Z

    iput v1, v0, Le73/b;->d:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lab/i0;)V
    .locals 2

    iget v0, p0, Le73/c;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lf73/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lab/i0;->E:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    new-instance v0, Lte3/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lte3/b;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Lab/i0;->s(Ljava/lang/Iterable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lg9/k;)V
    .locals 2

    iget v0, p0, Le73/c;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    new-instance v0, Lf73/g;

    iget-object v1, p0, Le73/c;->b:Ljava/lang/Object;

    check-cast v1, Lf73/a;

    invoke-direct {v0, v1}, Lf73/g;-><init>(Lf73/a;)V

    const-class v1, Lf73/b;

    invoke-virtual {p1, v1, v0}, Lg9/k;->b(Ljava/lang/Class;Lz63/e;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Lg9/k;)V
    .locals 3

    iget v0, p0, Le73/c;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La73/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, La73/a;-><init>(I)V

    const-class v1, Lf73/b;

    invoke-virtual {p1, v1, v0}, Lg9/k;->a(Ljava/lang/Class;Lz63/b;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Le73/c;->b:Ljava/lang/Object;

    check-cast v0, Le73/b;

    new-instance v1, La73/a;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, La73/a;-><init>(I)V

    const-class v2, Lve3/a;

    invoke-virtual {p1, v2, v1}, Lg9/k;->a(Ljava/lang/Class;Lz63/b;)V

    new-instance v1, Le73/a;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2}, Le73/a;-><init>(Ljava/lang/Object;I)V

    const-class v2, Lve3/b;

    invoke-virtual {p1, v2, v1}, Lg9/k;->a(Ljava/lang/Class;Lz63/b;)V

    new-instance v1, Le73/a;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Le73/a;-><init>(Ljava/lang/Object;I)V

    const-class v2, Lve3/f;

    invoke-virtual {p1, v2, v1}, Lg9/k;->a(Ljava/lang/Class;Lz63/b;)V

    new-instance v1, Le73/a;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Le73/a;-><init>(Ljava/lang/Object;I)V

    const-class v2, Lve3/e;

    invoke-virtual {p1, v2, v1}, Lg9/k;->a(Ljava/lang/Class;Lz63/b;)V

    new-instance v1, Le73/a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Le73/a;-><init>(Ljava/lang/Object;I)V

    const-class v0, Lve3/d;

    invoke-virtual {p1, v0, v1}, Lg9/k;->a(Ljava/lang/Class;Lz63/b;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
