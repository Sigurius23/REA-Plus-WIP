.class public Ln4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln4/e;


# instance fields
.field public a:Ln4/p;

.field public b:Z

.field public c:Z

.field public final d:Ln4/p;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Ln4/h;

.field public j:Z

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ln4/p;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ln4/g;->a:Ln4/p;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ln4/g;->b:Z

    iput-boolean v1, p0, Ln4/g;->c:Z

    const/4 v2, 0x1

    iput v2, p0, Ln4/g;->e:I

    iput v2, p0, Ln4/g;->h:I

    iput-object v0, p0, Ln4/g;->i:Ln4/h;

    iput-boolean v1, p0, Ln4/g;->j:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln4/g;->k:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln4/g;->l:Ljava/util/ArrayList;

    iput-object p1, p0, Ln4/g;->d:Ln4/p;

    return-void
.end method


# virtual methods
.method public final a(Ln4/e;)V
    .locals 5

    iget-object p1, p0, Ln4/g;->l:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln4/g;

    iget-boolean v1, v1, Ln4/g;->j:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ln4/g;->c:Z

    iget-object v1, p0, Ln4/g;->a:Ln4/p;

    if-eqz v1, :cond_2

    invoke-interface {v1, p0}, Ln4/e;->a(Ln4/e;)V

    :cond_2
    iget-boolean v1, p0, Ln4/g;->b:Z

    if-eqz v1, :cond_3

    iget-object p1, p0, Ln4/g;->d:Ln4/p;

    invoke-interface {p1, p0}, Ln4/e;->a(Ln4/e;)V

    return-void

    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln4/g;

    instance-of v4, v3, Ln4/h;

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    move-object v1, v3

    goto :goto_0

    :cond_5
    if-eqz v1, :cond_7

    if-ne v2, v0, :cond_7

    iget-boolean p1, v1, Ln4/g;->j:Z

    if-eqz p1, :cond_7

    iget-object p1, p0, Ln4/g;->i:Ln4/h;

    if-eqz p1, :cond_6

    iget-boolean v0, p1, Ln4/g;->j:Z

    if-eqz v0, :cond_8

    iget v0, p0, Ln4/g;->h:I

    iget p1, p1, Ln4/g;->g:I

    mul-int/2addr v0, p1

    iput v0, p0, Ln4/g;->f:I

    :cond_6
    iget p1, v1, Ln4/g;->g:I

    iget v0, p0, Ln4/g;->f:I

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Ln4/g;->d(I)V

    :cond_7
    iget-object p1, p0, Ln4/g;->a:Ln4/p;

    if-eqz p1, :cond_8

    invoke-interface {p1, p0}, Ln4/e;->a(Ln4/e;)V

    :cond_8
    :goto_1
    return-void
.end method

.method public final b(Ln4/p;)V
    .locals 1

    iget-object v0, p0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Ln4/g;->j:Z

    if-eqz v0, :cond_0

    invoke-interface {p1, p1}, Ln4/e;->a(Ln4/e;)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Ln4/g;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln4/g;->j:Z

    iput v0, p0, Ln4/g;->g:I

    iput-boolean v0, p0, Ln4/g;->c:Z

    iput-boolean v0, p0, Ln4/g;->b:Z

    return-void
.end method

.method public d(I)V
    .locals 1

    iget-boolean v0, p0, Ln4/g;->j:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ln4/g;->j:Z

    iput p1, p0, Ln4/g;->g:I

    iget-object p1, p0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln4/e;

    invoke-interface {v0, v0}, Ln4/e;->a(Ln4/e;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ln4/g;->d:Ln4/p;

    iget-object v1, v1, Ln4/p;->b:Lm4/e;

    iget-object v1, v1, Lm4/e;->i0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln4/g;->e:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "null"

    goto :goto_0

    :pswitch_0
    const-string v1, "BASELINE"

    goto :goto_0

    :pswitch_1
    const-string v1, "BOTTOM"

    goto :goto_0

    :pswitch_2
    const-string v1, "TOP"

    goto :goto_0

    :pswitch_3
    const-string v1, "RIGHT"

    goto :goto_0

    :pswitch_4
    const-string v1, "LEFT"

    goto :goto_0

    :pswitch_5
    const-string v1, "VERTICAL_DIMENSION"

    goto :goto_0

    :pswitch_6
    const-string v1, "HORIZONTAL_DIMENSION"

    goto :goto_0

    :pswitch_7
    const-string v1, "UNKNOWN"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ln4/g;->j:Z

    if-eqz v1, :cond_0

    iget v1, p0, Ln4/g;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :cond_0
    const-string v1, "unresolved"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") <t="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln4/g;->l:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":d="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln4/g;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
