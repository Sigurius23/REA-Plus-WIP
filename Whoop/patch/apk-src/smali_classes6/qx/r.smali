.class public final Lqx/r;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/squareup/moshi/JsonAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/squareup/moshi/JsonAdapter;I)V
    .locals 0

    iput p2, p0, Lqx/r;->a:I

    iput-object p1, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lqx/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p1, Lcom/squareup/moshi/JsonReader;->F:Z

    const/4 v1, 0x1

    iput-boolean v1, p1, Lcom/squareup/moshi/JsonReader;->F:Z

    :try_start_0
    iget-object v1, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p1, Lcom/squareup/moshi/JsonReader;->F:Z

    return-object v1

    :catchall_0
    move-exception v1

    iput-boolean v0, p1, Lcom/squareup/moshi/JsonReader;->F:Z

    throw v1

    :pswitch_0
    iget-boolean v0, p1, Lcom/squareup/moshi/JsonReader;->E:Z

    const/4 v1, 0x1

    iput-boolean v1, p1, Lcom/squareup/moshi/JsonReader;->E:Z

    :try_start_1
    iget-object v1, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iput-boolean v0, p1, Lcom/squareup/moshi/JsonReader;->E:Z

    return-object v1

    :catchall_1
    move-exception v1

    iput-boolean v0, p1, Lcom/squareup/moshi/JsonReader;->E:Z

    throw v1

    :pswitch_1
    iget-object v0, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final isLenient()Z
    .locals 1

    iget v0, p0, Lqx/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0}, Lcom/squareup/moshi/JsonAdapter;->isLenient()Z

    move-result v0

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_1
    iget-object v0, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0}, Lcom/squareup/moshi/JsonAdapter;->isLenient()Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lqx/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-boolean v0, p1, Lqx/c0;->F:Z

    const/4 v1, 0x1

    iput-boolean v1, p1, Lqx/c0;->F:Z

    :try_start_0
    iget-object v1, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p1, Lqx/c0;->F:Z

    return-void

    :catchall_0
    move-exception p2

    iput-boolean v0, p1, Lqx/c0;->F:Z

    throw p2

    :pswitch_1
    iget-boolean v0, p1, Lqx/c0;->G:Z

    const/4 v1, 0x1

    iput-boolean v1, p1, Lqx/c0;->G:Z

    :try_start_1
    iget-object v1, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v1, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iput-boolean v0, p1, Lqx/c0;->G:Z

    return-void

    :catchall_1
    move-exception p2

    iput-boolean v0, p1, Lqx/c0;->G:Z

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lqx/r;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".failOnUnknown()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".lenient()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lqx/r;->b:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".serializeNulls()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
