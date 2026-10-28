.class public final Lpe1/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpe1/b$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
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


# instance fields
.field final synthetic w:Lec3/m;


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lpe1/b$a$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lpe1/b$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lpe1/b$a$a$a;

    iget v1, v0, Lpe1/b$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpe1/b$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpe1/b$a$a$a;

    invoke-direct {v0, p0, p2}, Lpe1/b$a$a$a;-><init>(Lpe1/b$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lpe1/b$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpe1/b$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lpe1/b$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lpe1/b$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lpe1/b$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lpe1/b$a$a;->w:Lec3/m;

    check-cast p1, Lke1/b;

    instance-of v2, p1, Lke1/b$c;

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    new-instance v2, Loe1/e$c;

    check-cast p1, Lke1/b$c;

    invoke-virtual {p1}, Lke1/b$c;->a()Lcom/whoop/educationModels/FeatureEducationDto;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/educationModels/EducationDtoToModelMapperKt;->toEducationSections(Lcom/whoop/educationModels/FeatureEducationDto;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {p1}, Lke1/b$c;->a()Lcom/whoop/educationModels/FeatureEducationDto;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/educationModels/FeatureEducationDto;->getScreens()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lpe1/a;->b(Ljava/util/List;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p1}, Lke1/b$c;->a()Lcom/whoop/educationModels/FeatureEducationDto;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/educationModels/FeatureEducationDto;->getMediaHeader()Lcom/whoop/educationModels/MediaHeader;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-static {v7}, Lpe1/a;->a(Lcom/whoop/educationModels/MediaHeader;)Lcom/whoop/educationModels/MediaHeader;

    move-result-object v7

    goto :goto_1

    :cond_3
    move-object v7, v4

    :goto_1
    invoke-virtual {p1}, Lke1/b$c;->a()Lcom/whoop/educationModels/FeatureEducationDto;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/educationModels/FeatureEducationDto;->getStickyButton()Lcom/whoop/educationModels/StickyButton;

    move-result-object p1

    invoke-direct {v2, v5, v6, v7, p1}, Loe1/e$c;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;)V

    goto :goto_2

    :cond_4
    instance-of v2, p1, Lke1/b$a;

    if-eqz v2, :cond_5

    sget-object v2, Loe1/e$a;->a:Loe1/e$a;

    goto :goto_2

    :cond_5
    instance-of p1, p1, Lke1/b$b;

    if-eqz p1, :cond_7

    sget-object v2, Loe1/e$b;->a:Loe1/e$b;

    :goto_2
    iput-object v4, v0, Lpe1/b$a$a$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Lpe1/b$a$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lpe1/b$a$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lpe1/b$a$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lpe1/b$a$a$a;->H:I

    iput v3, v0, Lpe1/b$a$a$a;->x:I

    invoke-interface {p2, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
