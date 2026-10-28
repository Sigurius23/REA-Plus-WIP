.class public final Lmv1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\u0008j\u0002`\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lmv1/a;",
        "",
        "Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;",
        "memberDataExportServiceApi",
        "Lrr2/c;",
        "crashReporter",
        "<init>",
        "(Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;Lrr2/c;)V",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "exception",
        "",
        "logMessage",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;",
        "a",
        "(Ljava/lang/Exception;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "email",
        "c",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;",
        "Lrr2/c;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "member-data-export_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;

.field private final b:Lrr2/c;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;Lrr2/c;)V
    .locals 1

    const-string v0, "memberDataExportServiceApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmv1/a;->a:Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;

    iput-object p2, p0, Lmv1/a;->b:Lrr2/c;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "MemberDataExportServiceRepository"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lmv1/a;->c:Ltr2/n;

    return-void
.end method

.method private final a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;
    .locals 5

    iget-object v0, p0, Lmv1/a;->c:Ltr2/n;

    iget-object v1, p0, Lmv1/a;->b:Lrr2/c;

    invoke-static {p1, p2, v0, v1}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    new-instance p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;

    new-instance p2, Lcom/whoop/design/util/TextResource$b;

    sget v0, Ljv1/b;->c:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p2, v0, v1, v2, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Ljv1/b;->a:I

    invoke-direct {v0, v3, v1, v2, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v4, Ljv1/b;->b:I

    invoke-direct {v3, v4, v1, v2, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, p2, v0, v3}, Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object p1
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lmv1/a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lmv1/a$a;

    iget v1, v0, Lmv1/a$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmv1/a$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmv1/a$a;

    invoke-direct {v0, p0, p1}, Lmv1/a$a;-><init>(Lmv1/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lmv1/a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmv1/a$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lretrofit2/HttpException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lmv1/a;->a:Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;

    iput v3, v0, Lmv1/a$a;->y:I

    invoke-interface {p1, v0}, Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;->getMemberDataExportDetailsForUser(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;

    invoke-static {p1}, Lcom/whoop/memberdataexport/models/MemberDataExportModelKt;->reduceDtoToModel(Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;

    move-result-object p1
    :try_end_1
    .catch Lretrofit2/HttpException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    const-string v0, "IOException: Failed to get member data export details."

    invoke-direct {p0, p1, v0}, Lmv1/a;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;

    move-result-object p1

    goto :goto_4

    :goto_3
    iget v0, p1, Lretrofit2/HttpException;->w:I

    const-string v1, "HttpException: Failed to get member data export details. HttpResponse Code: "

    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lmv1/a;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;

    move-result-object p1

    :goto_4
    return-object p1
.end method

.method public final c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lmv1/a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmv1/a$b;

    iget v1, v0, Lmv1/a$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmv1/a$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmv1/a$b;

    invoke-direct {v0, p0, p2}, Lmv1/a$b;-><init>(Lmv1/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lmv1/a$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmv1/a$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lmv1/a$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lretrofit2/HttpException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lmv1/a;->a:Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;

    new-instance v2, Lcom/whoop/memberdataexport/models/SubmitMemberDataDto;

    invoke-direct {v2, p1}, Lcom/whoop/memberdataexport/models/SubmitMemberDataDto;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lmv1/a$b;->w:Ljava/lang/Object;

    iput v3, v0, Lmv1/a$b;->z:I

    invoke-interface {p2, v2, v0}, Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;->submitMemberDataExportRequestForUser(Lcom/whoop/memberdataexport/models/SubmitMemberDataDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;

    invoke-static {p2}, Lcom/whoop/memberdataexport/models/MemberDataExportModelKt;->reduceDtoToModel(Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;

    move-result-object p1
    :try_end_1
    .catch Lretrofit2/HttpException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    const-string p2, "IOException: Failed to submit member data export request."

    invoke-direct {p0, p1, p2}, Lmv1/a;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;

    move-result-object p1

    goto :goto_4

    :goto_3
    iget p2, p1, Lretrofit2/HttpException;->w:I

    const-string v0, "HttpException: Failed to submit member data export request. HttpResponse Code: "

    invoke-static {p2, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lmv1/a;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;

    move-result-object p1

    :goto_4
    return-object p1
.end method
