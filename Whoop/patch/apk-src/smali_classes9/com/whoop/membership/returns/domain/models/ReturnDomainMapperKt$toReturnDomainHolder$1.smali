.class final Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt;->toReturnDomainHolder(Lcom/whoop/membership/returns/domain/models/ReturnResponse;Lwx1/d;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.returns.domain.models.ReturnDomainMapperKt"
    f = "ReturnDomainMapper.kt"
    l = {
        0x14
    }
    m = "toReturnDomainHolder"
    v = 0x2
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$11:Ljava/lang/Object;

.field L$12:Ljava/lang/Object;

.field L$13:Ljava/lang/Object;

.field L$14:Ljava/lang/Object;

.field L$15:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt$toReturnDomainHolder$1;->label:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt;->toReturnDomainHolder(Lcom/whoop/membership/returns/domain/models/ReturnResponse;Lwx1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
