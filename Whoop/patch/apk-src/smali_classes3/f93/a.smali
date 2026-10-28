.class public final Lf93/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/d;
.implements Lim/b;
.implements Luc3/e;
.implements Lxk/g;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lf93/a;->w:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 2
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf93/a;->x:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf93/a;->w:I

    iput-object p1, p0, Lf93/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lrm/f1;)Lvm/a;
    .locals 3

    new-instance v0, Lio/sentry/internal/debugmeta/c;

    const/16 v1, 0x17

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/internal/debugmeta/c;-><init>(IB)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "attempted to overwrite the existing value \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lf93/a;->x:Ljava/lang/Object;

    const/16 v2, 0x27

    invoke-static {v0, v1, v2}, Ld13/a;->l(Ljava/lang/StringBuilder;Ljava/lang/Object;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Lrm/k0;)Lvm/h;
    .locals 1

    iget-object v0, p1, Lrm/k0;->x:Lrm/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lrm/k0;->x:Lrm/i0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lvm/h;->a:Lvm/f;

    return-object p1
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf93/a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lmp/b;->x:Lmp/a;

    if-nez v0, :cond_0

    new-instance v0, Lmp/a;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    sput-object v0, Lmp/b;->x:Lmp/a;

    :cond_0
    sget-object v0, Lmp/b;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must call PhenotypeContext.setContext() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf93/a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 2

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lf93/a;->x:Ljava/lang/Object;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Property "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " should be initialized before get."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V
    .locals 0

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lf93/a;->x:Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lf93/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NotNullProperty("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lf93/a;->x:Ljava/lang/Object;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "value="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lf93/a;->x:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "value not initialized yet"

    :goto_0
    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
