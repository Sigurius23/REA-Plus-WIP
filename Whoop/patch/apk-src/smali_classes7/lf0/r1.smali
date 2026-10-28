.class public final synthetic Llf0/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ld0/e;Ljava/util/List;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Llf0/r1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llf0/r1;->y:Ljava/lang/Object;

    iput-object p2, p0, Llf0/r1;->z:Ljava/lang/Object;

    iput-wide p3, p0, Llf0/r1;->x:J

    return-void
.end method

.method public synthetic constructor <init>(Lug/b;JLug/b;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Llf0/r1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llf0/r1;->y:Ljava/lang/Object;

    iput-wide p2, p0, Llf0/r1;->x:J

    iput-object p4, p0, Llf0/r1;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Llf0/r1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llf0/r1;->y:Ljava/lang/Object;

    check-cast v0, Lug/b;

    iget-object v1, p0, Llf0/r1;->z:Ljava/lang/Object;

    check-cast v1, Lug/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "client clock ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ") is skewed "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Llf0/r1;->x:J

    invoke-static {v3, v4}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " from the server ("

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "), applying correction"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llf0/r1;->y:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    iget-object v1, p0, Llf0/r1;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-wide v2, p0, Llf0/r1;->x:J

    invoke-static {v0, v1, v2, v3}, Llf0/s1;->c(Ld0/e;Ljava/util/List;J)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
