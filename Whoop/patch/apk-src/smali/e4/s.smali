.class public final Le4/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/whoop/data/repositories/c;

.field public b:Z

.field public final c:Ljava/util/HashMap;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/HashMap;

.field public final f:Lj4/b;

.field public g:I

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public j:Z

.field public final k:Ly3/c;

.field public l:J


# direct methods
.method public constructor <init>(Ly3/c;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Le4/s;->b:Z

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Le4/s;->c:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Le4/s;->d:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Le4/s;->e:Ljava/util/HashMap;

    new-instance v2, Lj4/b;

    invoke-direct {v2, p0}, Lj4/b;-><init>(Le4/s;)V

    iput-object v2, p0, Le4/s;->f:Lj4/b;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput v3, p0, Le4/s;->g:I

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Le4/s;->h:Ljava/util/ArrayList;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Le4/s;->i:Ljava/util/ArrayList;

    iput-boolean v0, p0, Le4/s;->j:Z

    iput-object v4, v2, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Le4/s;->k:Ly3/c;

    const/16 p1, 0xf

    invoke-static {v3, v3, p1}, Ly3/b;->b(III)J

    move-result-wide v0

    iput-wide v0, p0, Le4/s;->l:J

    sget-object p1, Ly3/m;->w:Ly3/m;

    new-instance p1, Lcom/whoop/data/repositories/c;

    const/4 v0, 0x3

    invoke-direct {p1, p0, v0}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Le4/s;->a:Lcom/whoop/data/repositories/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Le4/s;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Le4/s;->j:Z

    return-void
.end method

.method public final b(Ljava/lang/Object;)Lj4/b;
    .locals 2

    iget-object v0, p0, Le4/s;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj4/h;

    if-nez v1, :cond_0

    new-instance v1, Lj4/b;

    invoke-direct {v1, p0}, Lj4/b;-><init>(Le4/s;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, v1, Lj4/b;->a:Ljava/lang/Object;

    :cond_0
    instance-of p1, v1, Lj4/b;

    if-eqz p1, :cond_1

    check-cast v1, Lj4/b;

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Ljava/lang/Float;)I
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method public final d(ILjava/lang/String;)Lk4/g;
    .locals 2

    invoke-virtual {p0, p2}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v0

    iget-object v1, v0, Lj4/b;->c:Ljava/lang/Object;

    if-eqz v1, :cond_0

    instance-of v1, v1, Lk4/g;

    if-nez v1, :cond_1

    :cond_0
    new-instance v1, Lk4/g;

    invoke-direct {v1, p0}, Lk4/g;-><init>(Le4/s;)V

    iput p1, v1, Lk4/g;->b:I

    iput-object p2, v1, Lk4/g;->g:Ljava/lang/String;

    iput-object v1, v0, Lj4/b;->c:Ljava/lang/Object;

    invoke-virtual {v1}, Lk4/g;->a()Lm4/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj4/b;->b(Lm4/e;)V

    :cond_1
    iget-object p1, v0, Lj4/b;->c:Ljava/lang/Object;

    check-cast p1, Lk4/g;

    return-object p1
.end method

.method public final e(I)Lj4/g;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "__HELPER_KEY_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Le4/s;->g:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Le4/s;->g:I

    const-string v2, "__"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Le4/s;->d:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj4/g;

    if-nez v2, :cond_0

    invoke-static {p1}, Le4/p;->e(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    new-instance v2, Lj4/g;

    invoke-direct {v2, p0, p1}, Lj4/g;-><init>(Le4/s;I)V

    goto :goto_0

    :pswitch_1
    new-instance v2, Lk4/f;

    invoke-direct {v2, p0, p1}, Lk4/f;-><init>(Le4/s;I)V

    goto :goto_0

    :pswitch_2
    new-instance v2, Lk4/e;

    invoke-direct {v2, p0, p1}, Lk4/e;-><init>(Le4/s;I)V

    goto :goto_0

    :pswitch_3
    new-instance v2, Lk4/b;

    invoke-direct {v2, p0}, Lk4/b;-><init>(Le4/s;)V

    goto :goto_0

    :pswitch_4
    new-instance v2, Lk4/a;

    const/4 p1, 0x1

    invoke-direct {v2, p0, p1}, Lk4/a;-><init>(Le4/s;I)V

    goto :goto_0

    :pswitch_5
    new-instance v2, Lk4/a;

    const/4 p1, 0x0

    invoke-direct {v2, p0, p1}, Lk4/a;-><init>(Le4/s;I)V

    goto :goto_0

    :pswitch_6
    new-instance v2, Lk4/i;

    invoke-direct {v2, p0}, Lk4/i;-><init>(Le4/s;)V

    goto :goto_0

    :pswitch_7
    new-instance v2, Lk4/h;

    invoke-direct {v2, p0}, Lk4/h;-><init>(Le4/s;)V

    :goto_0
    iput-object v0, v2, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
