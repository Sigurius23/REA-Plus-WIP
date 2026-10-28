.class public final Lt23/s3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lt23/b4;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Ljava/lang/String;

.field public w:Lio/getstream/android/video/generated/apis/ProductvideoApi;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:I


# direct methods
.method public constructor <init>(Lt23/b4;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lt23/s3;->E:Lt23/b4;

    iput-object p2, p0, Lt23/s3;->F:Ljava/lang/String;

    iput-object p3, p0, Lt23/s3;->G:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    new-instance v0, Lt23/s3;

    iget-object v1, p0, Lt23/s3;->F:Ljava/lang/String;

    iget-object v2, p0, Lt23/s3;->G:Ljava/lang/String;

    iget-object v3, p0, Lt23/s3;->E:Lt23/b4;

    invoke-direct {v0, v3, v1, v2, p1}, Lt23/s3;-><init>(Lt23/b4;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lt23/s3;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/s3;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lt23/s3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/s3;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lt23/s3;->y:Ljava/lang/String;

    iget-object v3, p0, Lt23/s3;->x:Ljava/lang/String;

    iget-object v4, p0, Lt23/s3;->w:Lio/getstream/android/video/generated/apis/ProductvideoApi;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v4

    move-object v4, v3

    move-object v3, v5

    move-object v5, v1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt23/s3;->E:Lt23/b4;

    iget-object v1, p1, Lt23/b4;->E:Ly33/c;

    invoke-virtual {v1}, Ly33/c;->a()Lio/getstream/android/video/generated/apis/ProductvideoApi;

    move-result-object v4

    iput-object v4, p0, Lt23/s3;->w:Lio/getstream/android/video/generated/apis/ProductvideoApi;

    iget-object v1, p0, Lt23/s3;->F:Ljava/lang/String;

    iput-object v1, p0, Lt23/s3;->x:Ljava/lang/String;

    iget-object v5, p0, Lt23/s3;->G:Ljava/lang/String;

    iput-object v5, p0, Lt23/s3;->y:Ljava/lang/String;

    iput v3, p0, Lt23/s3;->z:I

    invoke-static {p1, p0}, Lt23/b4;->l(Lt23/b4;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v4

    move-object v4, v1

    :goto_0
    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lt23/s3;->w:Lio/getstream/android/video/generated/apis/ProductvideoApi;

    iput-object p1, p0, Lt23/s3;->x:Ljava/lang/String;

    iput-object p1, p0, Lt23/s3;->y:Ljava/lang/String;

    iput v2, p0, Lt23/s3;->z:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v12, 0x78

    const/4 v13, 0x0

    move-object v11, p0

    invoke-static/range {v3 .. v13}, Lio/getstream/android/video/generated/apis/ProductvideoApi;->getCall$default(Lio/getstream/android/video/generated/apis/ProductvideoApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    return-object p1
.end method
