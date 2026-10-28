.class final Lwe0/f$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwe0/f;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lwe0/f$a;",
        "previousData",
        "Lwe0/a;",
        "action",
        "<anonymous>",
        "(Lwe0/f$a;Lwe0/a;)Lwe0/f$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.testupload.domain.TestUploadInteractor$interact$2"
    f = "TestUploadInteractor.kt"
    l = {
        0x39,
        0x44,
        0x56,
        0x7d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lwe0/f;

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lwe0/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe0/f;",
            "Lq83/d<",
            "-",
            "Lwe0/f$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwe0/f$f;->E:Lwe0/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lwe0/f$a;Lwe0/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe0/f$a;",
            "Lwe0/a;",
            "Lq83/d<",
            "-",
            "Lwe0/f$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lwe0/f$f;

    iget-object v1, p0, Lwe0/f$f;->E:Lwe0/f;

    invoke-direct {v0, v1, p3}, Lwe0/f$f;-><init>(Lwe0/f;Lq83/d;)V

    iput-object p1, v0, Lwe0/f$f;->y:Ljava/lang/Object;

    iput-object p2, v0, Lwe0/f$f;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lwe0/f$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwe0/f$a;

    check-cast p2, Lwe0/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lwe0/f$f;->f(Lwe0/f$a;Lwe0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lwe0/f$f;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwe0/f$a;

    iget-object v0, p0, Lwe0/f$f;->z:Ljava/lang/Object;

    check-cast v0, Lwe0/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lwe0/f$f;->x:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_5

    if-eq v3, v7, :cond_4

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v0, p0, Lwe0/f$f;->w:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwe0/f$a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move-object v0, v1

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lwe0/a$d;

    if-eqz p1, :cond_6

    sget-object v5, Lwe0/b$b;->a:Lwe0/b$b;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lwe0/f$a;->b(Lwe0/f$a;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILjava/lang/Object;)Lwe0/f$a;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v0, Lwe0/a$c;

    const/4 v3, 0x0

    if-eqz p1, :cond_9

    iget-object p1, p0, Lwe0/f$f;->E:Lwe0/f;

    iput-object v1, p0, Lwe0/f$f;->y:Ljava/lang/Object;

    iput-object v3, p0, Lwe0/f$f;->z:Ljava/lang/Object;

    iput v7, p0, Lwe0/f$f;->x:I

    invoke-static {p1, p0}, Lwe0/f;->c(Lwe0/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    goto/16 :goto_7

    :cond_7
    :goto_0
    move-object v5, p1

    check-cast v5, Lwe0/b;

    instance-of p1, v5, Lwe0/c;

    if-eqz p1, :cond_8

    new-instance v2, Lwe0/f$a;

    move-object p1, v5

    check-cast p1, Lwe0/c;

    invoke-virtual {p1}, Lwe0/c;->a()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object v3

    invoke-virtual {v1}, Lwe0/f$a;->c()Ljava/util/List;

    move-result-object v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lwe0/f$a;-><init>(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_8
    move-object v6, v5

    const/4 p1, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v6, p1

    invoke-static/range {v1 .. v7}, Lwe0/f$a;->b(Lwe0/f$a;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILjava/lang/Object;)Lwe0/f$a;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of p1, v0, Lwe0/a$e;

    const/4 v7, 0x0

    if-eqz p1, :cond_d

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lwe0/f$f;->E:Lwe0/f;

    check-cast v0, Lwe0/a$e;

    invoke-virtual {v0}, Lwe0/a$e;->a()Lj/a;

    move-result-object v0

    iput-object v1, p0, Lwe0/f$f;->y:Ljava/lang/Object;

    iput-object v3, p0, Lwe0/f$f;->z:Ljava/lang/Object;

    iput v6, p0, Lwe0/f$f;->x:I

    invoke-static {p1, v0, p0}, Lwe0/f;->g(Lwe0/f;Lj/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_a

    goto/16 :goto_7

    :cond_a
    :goto_1
    move-object v3, p1

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_b

    new-instance p1, Lwe0/d;

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object v0

    invoke-direct {p1, v0, v3}, Lwe0/d;-><init>(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;)V

    :goto_2
    move-object v5, p1

    goto :goto_3

    :cond_b
    new-instance p1, Lwe0/e;

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object v0

    invoke-direct {p1, v0}, Lwe0/e;-><init>(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;)V

    goto :goto_2

    :goto_3
    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lwe0/f$a;->b(Lwe0/f$a;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILjava/lang/Object;)Lwe0/f$a;

    move-result-object p1

    return-object p1

    :cond_c
    iget-object p1, p0, Lwe0/f$f;->E:Lwe0/f;

    invoke-static {p1}, Lwe0/f;->f(Lwe0/f;)Ltr2/n;

    move-result-object p1

    const-string v0, "Unexpected file selection while Test Upload uninitialized"

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_d
    instance-of p1, v0, Lwe0/a$f;

    if-eqz p1, :cond_11

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object p1

    if-eqz p1, :cond_10

    iget-object p1, p0, Lwe0/f$f;->E:Lwe0/f;

    check-cast v0, Lwe0/a$f;

    invoke-virtual {v0}, Lwe0/a$f;->a()Ljava/util/List;

    move-result-object v0

    iput-object v1, p0, Lwe0/f$f;->y:Ljava/lang/Object;

    iput-object v3, p0, Lwe0/f$f;->z:Ljava/lang/Object;

    iput v5, p0, Lwe0/f$f;->x:I

    invoke-static {p1, v0, p0}, Lwe0/f;->h(Lwe0/f;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_e

    goto/16 :goto_7

    :cond_e
    :goto_4
    move-object v3, p1

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_f

    new-instance p1, Lwe0/d;

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object v0

    invoke-direct {p1, v0, v3}, Lwe0/d;-><init>(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;)V

    :goto_5
    move-object v5, p1

    goto :goto_6

    :cond_f
    new-instance p1, Lwe0/e;

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object v0

    invoke-direct {p1, v0}, Lwe0/e;-><init>(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;)V

    goto :goto_5

    :goto_6
    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lwe0/f$a;->b(Lwe0/f$a;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILjava/lang/Object;)Lwe0/f$a;

    move-result-object p1

    return-object p1

    :cond_10
    iget-object p1, p0, Lwe0/f$f;->E:Lwe0/f;

    invoke-static {p1}, Lwe0/f;->f(Lwe0/f;)Ltr2/n;

    move-result-object p1

    const-string v0, "Unexpected image selection while Test Upload uninitialized"

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_11
    instance-of p1, v0, Lwe0/a$g;

    if-eqz p1, :cond_13

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object p1

    if-eqz p1, :cond_12

    new-instance v4, Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;

    check-cast v0, Lwe0/a$g;

    invoke-virtual {v0}, Lwe0/a$g;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lwe0/a$g;->a()Lorg/joda/time/LocalDateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/LocalDateTime;->toDateTime()Lorg/joda/time/DateTime;

    move-result-object v0

    sget-object v2, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {v0, v2}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v0

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZZ"

    invoke-virtual {v0, v2}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, p1, v0, v3}, Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadSource;)V

    new-instance v5, Lwe0/e;

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object p1

    invoke-direct {v5, p1}, Lwe0/e;-><init>(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lwe0/f$a;->b(Lwe0/f$a;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILjava/lang/Object;)Lwe0/f$a;

    move-result-object p1

    return-object p1

    :cond_12
    iget-object p1, p0, Lwe0/f$f;->E:Lwe0/f;

    invoke-static {p1}, Lwe0/f;->f(Lwe0/f;)Ltr2/n;

    move-result-object p1

    const-string v0, "Unexpected metadata processing while Test Upload uninitialized"

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_13
    instance-of p1, v0, Lwe0/a$i;

    if-eqz p1, :cond_14

    sget-object v5, Lwe0/b$d;->a:Lwe0/b$d;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lwe0/f$a;->b(Lwe0/f$a;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILjava/lang/Object;)Lwe0/f$a;

    move-result-object p1

    return-object p1

    :cond_14
    instance-of p1, v0, Lwe0/a$h;

    if-eqz p1, :cond_15

    iget-object p1, p0, Lwe0/f$f;->E:Lwe0/f;

    invoke-virtual {v1}, Lwe0/f$a;->c()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1}, Lwe0/f$a;->f()Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;

    move-result-object v5

    iput-object v3, p0, Lwe0/f$f;->y:Ljava/lang/Object;

    iput-object v3, p0, Lwe0/f$f;->z:Ljava/lang/Object;

    iput-object v1, p0, Lwe0/f$f;->w:Ljava/lang/Object;

    iput v4, p0, Lwe0/f$f;->x:I

    invoke-static {p1, v0, v5, p0}, Lwe0/f;->i(Lwe0/f;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_0

    :goto_7
    return-object v2

    :goto_8
    move-object v4, p1

    check-cast v4, Lwe0/b;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lwe0/f$a;->b(Lwe0/f$a;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILjava/lang/Object;)Lwe0/f$a;

    move-result-object p1

    return-object p1

    :cond_15
    instance-of p1, v0, Lwe0/a$a;

    if-eqz p1, :cond_17

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object p1

    if-eqz p1, :cond_16

    new-instance v5, Lwe0/c;

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object p1

    invoke-direct {v5, p1}, Lwe0/c;-><init>(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lwe0/f$a;->b(Lwe0/f$a;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILjava/lang/Object;)Lwe0/f$a;

    move-result-object p1

    return-object p1

    :cond_16
    iget-object p1, p0, Lwe0/f$f;->E:Lwe0/f;

    invoke-static {p1}, Lwe0/f;->f(Lwe0/f;)Ltr2/n;

    move-result-object p1

    const-string v0, "Unexpected BackToInput while Test Upload uninitialized"

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_17
    instance-of p1, v0, Lwe0/a$b;

    if-eqz p1, :cond_19

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object p1

    if-eqz p1, :cond_18

    new-instance v5, Lwe0/e;

    invoke-virtual {v1}, Lwe0/f$a;->d()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object p1

    invoke-direct {v5, p1}, Lwe0/e;-><init>(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;)V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lwe0/f$a;->b(Lwe0/f$a;Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILjava/lang/Object;)Lwe0/f$a;

    move-result-object p1

    return-object p1

    :cond_18
    iget-object p1, p0, Lwe0/f$f;->E:Lwe0/f;

    invoke-static {p1}, Lwe0/f;->f(Lwe0/f;)Ltr2/n;

    move-result-object p1

    const-string v0, "Unexpected BackToUpload while Test Upload uninitialized"

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_19
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
