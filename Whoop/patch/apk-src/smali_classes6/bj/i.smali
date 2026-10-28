.class public final Lbj/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Lwe/o;

.field public static final g:Lwe/o;


# instance fields
.field public a:Lxi/a;

.field public b:Lxi/b;

.field public c:Lxi/b;

.field public d:Lxi/b;

.field public e:Lxi/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "ef"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/i;->f:Lwe/o;

    const-string v0, "nm"

    const-string v1, "v"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/i;->g:Lwe/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcj/d;Lqi/i;)Lb30/m;
    .locals 8

    :goto_0
    invoke-virtual {p1}, Lcj/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lbj/i;->f:Lwe/o;

    invoke-virtual {p1, v0}, Lcj/d;->m(Lwe/o;)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcj/d;->s()V

    invoke-virtual {p1}, Lcj/d;->skipValue()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcj/d;->beginArray()V

    :goto_1
    invoke-virtual {p1}, Lcj/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lcj/d;->beginObject()V

    const-string v0, ""

    :goto_2
    invoke-virtual {p1}, Lcj/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Lbj/i;->g:Lwe/o;

    invoke-virtual {p1, v1}, Lcj/d;->m(Lwe/o;)I

    move-result v1

    if-eqz v1, :cond_7

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, Lcj/d;->s()V

    invoke-virtual {p1}, Lcj/d;->skipValue()V

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v1, "Softness"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    const/4 v4, 0x4

    goto :goto_3

    :sswitch_1
    const-string v1, "Shadow Color"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v4, 0x3

    goto :goto_3

    :sswitch_2
    const-string v1, "Direction"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    const/4 v4, 0x2

    goto :goto_3

    :sswitch_3
    const-string v1, "Opacity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    move v4, v2

    goto :goto_3

    :sswitch_4
    const-string v1, "Distance"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    move v4, v3

    :goto_3
    packed-switch v4, :pswitch_data_0

    invoke-virtual {p1}, Lcj/d;->skipValue()V

    goto :goto_2

    :pswitch_0
    invoke-static {p1, p2, v2}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v1

    iput-object v1, p0, Lbj/i;->e:Lxi/b;

    goto :goto_2

    :pswitch_1
    invoke-static {p1, p2}, Lhg3/i;->b0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v1

    iput-object v1, p0, Lbj/i;->a:Lxi/a;

    goto :goto_2

    :pswitch_2
    invoke-static {p1, p2, v3}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v1

    iput-object v1, p0, Lbj/i;->c:Lxi/b;

    goto :goto_2

    :pswitch_3
    invoke-static {p1, p2, v3}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v1

    iput-object v1, p0, Lbj/i;->b:Lxi/b;

    goto :goto_2

    :pswitch_4
    invoke-static {p1, p2, v2}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v1

    iput-object v1, p0, Lbj/i;->d:Lxi/b;

    goto/16 :goto_2

    :cond_7
    invoke-virtual {p1}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2

    :cond_8
    invoke-virtual {p1}, Lcj/d;->endObject()V

    goto/16 :goto_1

    :cond_9
    invoke-virtual {p1}, Lcj/d;->endArray()V

    goto/16 :goto_0

    :cond_a
    iget-object v2, p0, Lbj/i;->a:Lxi/a;

    if-eqz v2, :cond_b

    iget-object v3, p0, Lbj/i;->b:Lxi/b;

    if-eqz v3, :cond_b

    iget-object v4, p0, Lbj/i;->c:Lxi/b;

    if-eqz v4, :cond_b

    iget-object v5, p0, Lbj/i;->d:Lxi/b;

    if-eqz v5, :cond_b

    iget-object v6, p0, Lbj/i;->e:Lxi/b;

    if-eqz v6, :cond_b

    new-instance v1, Lb30/m;

    const/4 v7, 0x1

    invoke-direct/range {v1 .. v7}, Lb30/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v1

    :cond_b
    const/4 p1, 0x0

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x150bf015 -> :sswitch_4
        0x17b08feb -> :sswitch_3
        0x3e12275f -> :sswitch_2
        0x5237c863 -> :sswitch_1
        0x5279bda1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
