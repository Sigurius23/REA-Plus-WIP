.class public final Lke1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\"\u0010\u0015\u001a\u00020\u00142\u0008\u0010\r\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J!\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00172\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lke1/c;",
        "",
        "Lcom/whoop/education/domain/EducationApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Ly92/a;",
        "authManager",
        "Lu92/d;",
        "prefsStore",
        "<init>",
        "(Lcom/whoop/education/domain/EducationApi;Ltr2/n;Ly92/a;Lu92/d;)V",
        "",
        "featureEducationPath",
        "Lke1/b;",
        "e",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/onboarding/FeatureEducationType;",
        "",
        "storyId",
        "Ll83/a0;",
        "g",
        "(Lcom/whoop/data/onboarding/FeatureEducationType;ILq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Lke1/a;",
        "upstream",
        "f",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/education/domain/EducationApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Ly92/a;",
        "d",
        "Lu92/d;",
        "education_release"
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
.field private final a:Lcom/whoop/education/domain/EducationApi;

.field private final b:Ltr2/n;

.field private final c:Ly92/a;

.field private final d:Lu92/d;


# direct methods
.method public constructor <init>(Lcom/whoop/education/domain/EducationApi;Ltr2/n;Ly92/a;Lu92/d;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefsStore"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lke1/c;->a:Lcom/whoop/education/domain/EducationApi;

    iput-object p2, p0, Lke1/c;->b:Ltr2/n;

    iput-object p3, p0, Lke1/c;->c:Ly92/a;

    iput-object p4, p0, Lke1/c;->d:Lu92/d;

    return-void
.end method

.method public static final synthetic a(Lke1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lke1/c;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lke1/c;)Lcom/whoop/education/domain/EducationApi;
    .locals 0

    iget-object p0, p0, Lke1/c;->a:Lcom/whoop/education/domain/EducationApi;

    return-object p0
.end method

.method public static final synthetic c(Lke1/c;)Ly92/a;
    .locals 0

    iget-object p0, p0, Lke1/c;->c:Ly92/a;

    return-object p0
.end method

.method public static final synthetic d(Lke1/c;)Lu92/d;
    .locals 0

    iget-object p0, p0, Lke1/c;->d:Lu92/d;

    return-object p0
.end method

.method private final e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lke1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lke1/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lke1/c$a;

    iget v1, v0, Lke1/c$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lke1/c$a;->F:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lke1/c$a;

    invoke-direct {v0, p0, p2}, Lke1/c$a;-><init>(Lke1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lke1/c$a;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lke1/c$a;->F:I

    const/4 v9, 0x2

    const/4 v2, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v9, :cond_1

    iget-object p1, v6, Lke1/c$a;->x:Ljava/lang/Object;

    check-cast p1, Lu02/a;

    iget-object v0, v6, Lke1/c$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v6, Lke1/c$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lke1/c;->b:Ltr2/n;

    new-instance v5, Lke1/c$b;

    invoke-direct {v5, p0, p1, v10}, Lke1/c$b;-><init>(Lke1/c;Ljava/lang/String;Lq83/d;)V

    iput-object v10, v6, Lke1/c$a;->w:Ljava/lang/Object;

    iput p2, v6, Lke1/c$a;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    move-object p1, p2

    check-cast p1, Lu02/a;

    instance-of p2, p1, Lu02/a$c;

    if-eqz p2, :cond_6

    move-object p2, p1

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/educationModels/FeatureEducationDto;

    invoke-virtual {v1}, Lcom/whoop/educationModels/FeatureEducationDto;->getType()Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v1

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/educationModels/FeatureEducationDto;

    invoke-virtual {p2}, Lcom/whoop/educationModels/FeatureEducationDto;->getStoryId()I

    move-result p2

    iput-object v10, v6, Lke1/c$a;->w:Ljava/lang/Object;

    iput-object p1, v6, Lke1/c$a;->x:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v6, Lke1/c$a;->y:I

    iput v9, v6, Lke1/c$a;->F:I

    invoke-direct {p0, v1, p2, v6}, Lke1/c;->g(Lcom/whoop/data/onboarding/FeatureEducationType;ILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    :goto_4
    new-instance p2, Lke1/b$c;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/educationModels/FeatureEducationDto;

    invoke-direct {p2, p1}, Lke1/b$c;-><init>(Lcom/whoop/educationModels/FeatureEducationDto;)V

    return-object p2

    :cond_6
    instance-of p2, p1, Lu02/a$b;

    if-eqz p2, :cond_7

    new-instance p2, Lke1/b$a;

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lke1/b$a;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lcom/whoop/data/onboarding/FeatureEducationType;ILq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/data/onboarding/FeatureEducationType;->CHARGE_EDUCATION:Lcom/whoop/data/onboarding/FeatureEducationType;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, p0, Lke1/c;->b:Ltr2/n;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "failed to mark education path "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " with storyId "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " as complete"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lke1/c$d;

    invoke-direct {v6, p0, p2, v1}, Lke1/c$d;-><init>(Lke1/c;ILq83/d;)V

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v4, 0x0

    move-object v7, p3

    invoke-static/range {v2 .. v9}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_0
    move-object v5, p3

    sget-object p3, Lcom/whoop/data/onboarding/FeatureEducationType;->KOALA_ROLLOUT_EDUCATION:Lcom/whoop/data/onboarding/FeatureEducationType;

    if-ne p1, p3, :cond_1

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    move-object p1, v1

    iget-object v1, p0, Lke1/c;->b:Ltr2/n;

    new-instance v4, Lke1/c$e;

    invoke-direct {v4, p0, p2, p1}, Lke1/c$e;-><init>(Lke1/c;ILq83/d;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final f(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lke1/b$b;->a:Lke1/b$b;

    new-instance v1, Lke1/c$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lke1/c$c;-><init>(Lke1/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
